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

import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
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

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeType;

import dsm.TRADES.Analysis;
import dsm.TRADES.ComponentType;

/**
 * Page used to select an CVE catalog to import
 */
public class CVECatalogSelectionPage extends WizardPage {

    private Group embeddedGroup;
    private List<String> chosenCVEs;
    private List<String> chosenCPEs;
    private Group fetchGroup;
    private TableViewer cpeViewer;
    private TableViewer cveViewer;
    private Text filterText;
    private ViewerFilter filterViewer;
    private Hashtable<String, List<String>> vulnerabilityDictionary = new Hashtable<String, List<String>>();
    private final Session session;
    private String apiKey;

    public CVECatalogSelectionPage(Session session) {
        super("CVE Catalog selection page");
        setMessage("Select a CPE name to search for its vulnerabilities.");
        this.session = session;
        for (Resource r : session.getSemanticResources()) {
			for (EObject root : r.getContents()) {
				if (root instanceof Analysis) {
                    this.apiKey = ((Analysis) root).getNVDAPIKey();
                }
            }
        }
    }

    @Override
    public void createControl(Composite parent) {
        Composite composite = new Composite(parent, SWT.None);
        composite.setLayout(new GridLayout(1, true));

        //Filter existing CPEs
        createFilterGroup(composite);

        // Type and fetch button
        createFetchGroup(composite);
        
        // Search Results
        createSearchResultsViewer(composite);
        
        Label disclaimerText = new Label(composite, SWT.COLOR_TRANSPARENT);
        disclaimerText.setText(System.lineSeparator() + 
        	"This product uses data from the NVD API but is not endorsed or certified by the NVD.");

        setControl(composite);

    }

    public void createFilterGroup(Composite parent) {
        Group filterGroup = new Group(parent, SWT.NONE);
        filterGroup.setText("Enter the first few characters of a CPE to filter the below list :");
        filterGroup.setLayout(new GridLayout(1, false));
        filterGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        this.filterText = new Text(filterGroup, SWT.COLOR_WHITE);
        filterText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        filterText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent arg0) {
                cpeViewer.refresh();
            }
        });

        this.filterViewer = new ViewerFilter() {
            @Override
            public boolean select(Viewer viewer, Object parentElement, Object element) {
                if (element.toString().regionMatches(true, 0, filterText.getText(), 0, filterText.getText().length())) {
                    return true;
                } else {
                    return false;
                }
            }
        };

    }
 
    public void createFetchGroup(Composite parent) {
        fetchGroup = new Group(parent, SWT.NONE);
        fetchGroup.setText("CPEs found :");
        fetchGroup.setLayout(new GridLayout(2, false));
        fetchGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        this.cpeViewer = new TableViewer(fetchGroup);
        GridData gridData = new GridData();
        gridData.widthHint = 500;
        cpeViewer.getControl().setLayoutData(gridData);
        cpeViewer.setContentProvider(ArrayContentProvider.getInstance());
        cpeViewer.setLabelProvider(new LabelProvider() {
            @Override
            public String getText(Object element) {
                return (String) element;
            }
        });
        
        cpeViewer.addSelectionChangedListener(new ISelectionChangedListener() {

            @SuppressWarnings("unchecked")
			@Override
            public void selectionChanged(SelectionChangedEvent event) {
                IStructuredSelection structuredSelection = cpeViewer.getStructuredSelection();
                if (!structuredSelection.isEmpty()) {
                	chosenCPEs = structuredSelection.toList();
                } else {
                	chosenCPEs = null;
                }
                getContainer().updateButtons();
            }
        });
        
        getAllCPEsFromDisplayedComponentTypes();

        Button fetchButton = new Button(fetchGroup, SWT.PUSH);
        fetchButton.setLayoutData(new GridData(GridData.END));
        fetchButton.setText("Fetch");
        fetchButton.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
               queryCVEEndpoint(e);
               getContainer().updateButtons();
            }
        });

        cpeViewer.addFilter(this.filterViewer);

        enableGroup(fetchGroup, true);
    }

    public void createSearchResultsViewer(Composite parent) {
        this.embeddedGroup = new Group(parent, SWT.NONE);
        embeddedGroup.setText("Select CVEs from below : ");
        embeddedGroup.setLayout(new FillLayout());
        embeddedGroup.setLayoutData(new GridData(GridData.FILL_BOTH));

        this.cveViewer = new TableViewer(embeddedGroup);
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
        
        enableGroup(embeddedGroup, true);
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
    	for (String cpeName : chosenCPEs) {
            int pageNumber = 0;
            int returnedVulnerabilities = extractVulnerabilitiesAndWeaknessesPage(cpeName, event, 0, cvesToDisplay);
            while (returnedVulnerabilities == 2000) {
                try { 
                	//artificial delay per NIST NVD documentation
                	TimeUnit.SECONDS.sleep(1);
                } catch (Exception e) {
                	e.printStackTrace();
                }
            	pageNumber = pageNumber + 1;
                returnedVulnerabilities = extractVulnerabilitiesAndWeaknessesPage(cpeName, event, pageNumber, cvesToDisplay);
            }
        }

        if (cvesToDisplay.size() > 0) {
            cveViewer.setInput(cvesToDisplay);
            ISelection selection = new StructuredSelection(cvesToDisplay); 
            cveViewer.setSelection(selection);
        }        
    }

    private int extractVulnerabilitiesAndWeaknessesPage(String cpeName, SelectionEvent event, int pageNumber, List<String> cvesToDisplay) {
        String jsonString = requestJsonString(cpeName, event, pageNumber);
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
                return jsonNode.get("resultsPerPage").asInt();
            } catch (Exception e) {
                e.printStackTrace();
                return -1;
            }
        } else {
            return -1;
        }
    }

    private String requestJsonString(String cpeName, SelectionEvent event, int pageNumber) {
        String cveUrl = "https://services.nvd.nist.gov/rest/json/cves/2.0?cpeName=" + 
            URLEncoder.encode(cpeName, StandardCharsets.UTF_8) + "&startIndex=" + pageNumber;
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
        		String numberOfPages = "";
        		
        		if (pageNumber == 2) {
        			numberOfPages = "1 CVE page of length 2000 was returned successfully." + System.lineSeparator();
                } else if (pageNumber > 2) {
                	numberOfPages = String.valueOf(pageNumber - 1) + " CVE pages of length 2000 were returned successfully." + System.lineSeparator();
                }
        		
        		MessageDialog.openError(
                    event.display.getActiveShell(), 
                    "CVE load aborted", 
                    "The NVD API returned HTTP Status Code " + response.statusCode() + "." + System.lineSeparator() + 
                    numberOfPages +                     
                    "Please try again later.");
        		
        		return "";
        	}
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialog.openError(
                event.display.getActiveShell(), 
                "No CVEs affecting CPE found", 
                "No CVEs found that affect " + cpeName + ". Please check for typing errors in the CPE name.");
            return "";
        }
    }

    //populate cpeViewer
    private void getAllCPEsFromDisplayedComponentTypes() {
        List<String> displayedCPEs = new ArrayList<String>();
        //search for all CPEs in ComponentType.Name
        List<ComponentType> componentTypes = new ArrayList<>();
		for (Resource r : session.getSemanticResources()) {
			for (EObject root : r.getContents()) {
				if (root instanceof Analysis) {
					TreeIterator<EObject> ite = root.eAllContents();
					while (ite.hasNext()) {
						EObject eObject = (EObject) ite.next();
						if (eObject instanceof ComponentType) {
							componentTypes.add((ComponentType) eObject);
						}
					}
				}
			}
		}

        for (ComponentType componentType : componentTypes) {
            displayedCPEs.add(componentType.getName());
        }

        cpeViewer.setInput(displayedCPEs);
    }
}
