/**
 * Copyright Israel Aerospace Industries, Eclipse contributors and others 2021. All rights reserved.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     ELTA Ltd - initial API and implementation
 * 
 */

package dsm.cve.design.wizards;

import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeType;

public class CVEParameterSearchPage extends WizardPage {

    private Group cveGroup;
    private List<String> chosenCVEs;
    private TableViewer cveViewer;
    private Text searchText;
    private Hashtable<String, List<String>> vulnerabilityDictionary = new Hashtable<String, List<String>>();
    private String apiKey;
    private IProject project;

    public CVEParameterSearchPage(IProject project) {
        super("CVE Catalog selection page");
        setMessage("Select a CPE name to search for its vulnerabilities.");
        this.project = project;
    }

    @Override
    public void createControl(Composite parent) {
        Composite composite = new Composite(parent, SWT.None);
        composite.setLayout(new GridLayout(1, true));

        createURLSearchGroup(composite);

        createSearchResultsViewer(composite);
        
        Label disclaimerText = new Label(composite, SWT.COLOR_TRANSPARENT);
        disclaimerText.setText(System.lineSeparator() + 
        	"This product uses data from the NVD API but is not endorsed or certified by the NVD.");

        setControl(composite);

        setupPage();
    }

    private void createURLSearchGroup(Composite parent) {
        Group searchGroup = new Group(parent, SWT.NONE);
        searchGroup.setText("Enter the URL parameters below.");
        searchGroup.setLayout(new GridLayout(1, false));
        searchGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        Label disclaimerText = new Label(searchGroup, SWT.COLOR_TRANSPARENT);
        disclaimerText.setText("https://services.nvd.nist.gov/rest/json/cves/2.0?");
        
        this.searchText = new Text(searchGroup, SWT.COLOR_WHITE);
        searchText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        Button fetchButton = new Button(searchGroup, SWT.PUSH);
        fetchButton.setLayoutData(new GridData(GridData.END));
        fetchButton.setText("Fetch");
        fetchButton.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
               queryCVEEndpoint(e);
               getContainer().updateButtons();
            }
        });

        Label searchHelpText = new Label(parent, SWT.COLOR_TRANSPARENT);
        searchHelpText.setText(System.lineSeparator() + 
        	"For help constructing the url parameters, please visit https://nvd.nist.gov/developers/vulnerabilities");

        enableGroup(searchGroup, true);
    }

    private void createSearchResultsViewer(Composite parent) {
        this.cveGroup = new Group(parent, SWT.NONE);
        cveGroup.setText("Select CVEs from below : ");
        cveGroup.setLayout(new FillLayout());
        cveGroup.setLayoutData(new GridData(GridData.FILL_BOTH));

        this.cveViewer = new TableViewer(cveGroup);
        cveViewer.setContentProvider(ArrayContentProvider.getInstance());
        cveViewer.setLabelProvider(new LabelProvider() {
            @Override
            public String getText(Object element) {
                return (String) element;
            }
        });
        
        cveViewer.addSelectionChangedListener(new ISelectionChangedListener() {

            @SuppressWarnings("unchecked")
			@Override
            public void selectionChanged(SelectionChangedEvent event) {
                IStructuredSelection structuredSelection = cveViewer.getStructuredSelection();
                if (!structuredSelection.isEmpty()) {
                	chosenCVEs = structuredSelection.toList();
                } else {
                	chosenCVEs = null;
                }
                getContainer().updateButtons();
            }
        });
        
        enableGroup(cveGroup, true);
    }

    private void enableGroup(Composite c, boolean value) {
        if (c != null && !c.isDisposed()) {
            for (Control control : c.getChildren()) {
                control.setEnabled(value);
            }
            c.setEnabled(value);
        }
    }

    public List<String> getchosenCVEs() {
        return chosenCVEs;
    }

    public Dictionary<String, List<String>> getVulnerabilityDictionary() {
        return vulnerabilityDictionary;
    }

    private void queryCVEEndpoint(SelectionEvent event) {
    	List<String> cvesToDisplay = new ArrayList<String>();
    	extractVulnerabilitiesAndWeaknessesPage(event, cvesToDisplay);

        if (cvesToDisplay.size() > 0) {
            cveViewer.setInput(cvesToDisplay);
            ISelection selection = new StructuredSelection(cvesToDisplay); 
            cveViewer.setSelection(selection);
        }        
    }

    private void extractVulnerabilitiesAndWeaknessesPage(SelectionEvent event, List<String> cvesToDisplay) {
        String jsonString = requestJsonString(event);
        if (jsonString != "") {
            try {
                ObjectMapper objectMapper = new ObjectMapper();
                JsonNode jsonNode = objectMapper.readTree(jsonString);
                
                ArrayNode vulnerabilities = (ArrayNode) jsonNode.get("vulnerabilities");
                for (int i = 0; i < vulnerabilities.size(); i++) {
                    String cveId = vulnerabilities.get(i).get("cve").get("id").asText();
                    if (!cvesToDisplay.contains(cveId)) {
                        cvesToDisplay.add(cveId);
                    }
                    if (!vulnerabilityDictionary.containsKey(cveId)) {
                        vulnerabilityDictionary.put(cveId, new ArrayList<String>());
                    }

                    ArrayNode weaknesses = (ArrayNode) vulnerabilities.get(i).get("cve").get("weaknesses").get(0).get("description");
                    for (int j = 0; j < weaknesses.size(); j++) {
                        if (weaknesses.get(j).getNodeType() == JsonNodeType.OBJECT) {
                            String cweId = weaknesses.get(j).get("value").asText();
                            if (cweId.startsWith("CWE-")) {
                                vulnerabilityDictionary.get(cveId).add(cweId.substring(4));
                            } else {
                                vulnerabilityDictionary.get(cveId).add(cweId);
                            }
                            
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private String requestJsonString(SelectionEvent event) {
        String cveUrl = "https://services.nvd.nist.gov/rest/json/cves/2.0?" + 
            this.searchText.getText();
        try {
        	HttpRequest request = HttpRequest.newBuilder()
        		.uri(new URI(cveUrl))
        		.headers("apiKey", this.apiKey)
        		.GET()
        		.build();
            
        	HttpClient client = HttpClient.newHttpClient();
        	
        	HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        	
        	if (response.statusCode() == 200) {
        		return response.body();
        	} else {
        		MessageDialog.openError(
                    event.display.getActiveShell(), 
                    "CVE load aborted", 
                    "The NVD API returned HTTP Status Code " + response.statusCode() + "." + System.lineSeparator() + 
                    "Please try again later.");
        		
        		return "";
        	}
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialog.openError(
                event.display.getActiveShell(), 
                "No CVEs found", 
                "No CVEs found for " + this.searchText.getText() + ". Please check for typing errors in the parameters.");
            return "";
        }
    }
    
    private void setupPage() {
    	try {
			IResource[] members = this.project.members();
        	for (IResource resource : members) {
        		String resourceExtension;
        		if (resource.getFileExtension() == null) {
        			resourceExtension = "";
        		} else {
        			resourceExtension = resource.getFileExtension();
        		}
        		
        		if (resourceExtension.endsWith("trades")) {
        			extractAPIKey(resource.getLocationURI().getPath().toString());
        		}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    private void extractAPIKey(String filePath) {
		DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
		try (InputStream input = new FileInputStream(filePath)) {
			DocumentBuilder builder = documentFactory.newDocumentBuilder();
			Document doc = builder.parse(input);
			Node analysisNode = doc.getDocumentElement();
			Node attribute = analysisNode.getAttributes().getNamedItem("nVDAPIKey");
		    if (attribute != null) {
		    	this.apiKey = attribute.getNodeValue();
		    } else {
		    	this.apiKey = null;
		    }			
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}