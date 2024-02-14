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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
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

    private boolean embedded = true;
    private String singleCPE = null;
    private Group embeddedGroup;
    private List<String> chosenCVEs;
    private List<String> chosenCPEs;
    private Group fetchGroup;
    private Text fileSelectionLabel;
    private TableViewer cpeViewer;
    private TableViewer emCatalogView;
    private Dictionary<String, List<String>> vulnerabilityDictionary = new Hashtable<>();
    private final Session session;

    public CVECatalogSelectionPage(Session session) {
        super("CVE Catalog selection page");
        setMessage("Select a CPE name to search for its vulnerabilities.");
        this.session = session;
    }

    public CVECatalogSelectionPage(String singleCPE, Session session) {
        super("CVE Catalog selection page");
        setMessage("Vulnerabilities for '" + singleCPE + "'.");
        this.singleCPE = singleCPE;
        this.session = session;
    }

    @Override
    public void createControl(Composite parent) {
        Composite composite = new Composite(parent, SWT.None);
        composite.setLayout(new GridLayout(1, true));

        // Type and fetch button
        if (singleCPE == null) {
            createFetchGroup(composite);
        }
        
        // Search Results
        createSearchResultsViewer(composite);

        setControl(composite);

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
        enableGroup(fetchGroup, true);
    }

    public void createSearchResultsViewer(Composite parent) {
        this.embeddedGroup = new Group(parent, SWT.NONE);
        embeddedGroup.setText("Select CVEs from below : ");
        embeddedGroup.setLayout(new FillLayout());
        embeddedGroup.setLayoutData(new GridData(GridData.FILL_BOTH));

        this.emCatalogView = new TableViewer(embeddedGroup);
        emCatalogView.setContentProvider(ArrayContentProvider.getInstance());
        emCatalogView.setLabelProvider(new LabelProvider() {
            @Override
            public String getText(Object element) {
                return (String) element;
            }
        });
        
        emCatalogView.addSelectionChangedListener(new ISelectionChangedListener() {

            @SuppressWarnings("unchecked")
			@Override
            public void selectionChanged(SelectionChangedEvent event) {
                IStructuredSelection structuredSelection = emCatalogView.getStructuredSelection();
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
    	List<String> output = new ArrayList<String>();
    	if (output.size() == 0) {
            //popup to say nothing found
            MessageDialog.openError(
                event.display.getActiveShell(), 
                "CPE Not Found", 
                "The CPE you fetched was not found. Please check for typing errors in the CPE name.");
        } else {
            for (String cpeName : chosenCPEs) {
                String jsonString = getJsonString(cpeName);
                if (jsonString != "") {
                    try {
                        ObjectMapper objectMapper = new ObjectMapper();
                        JsonNode jsonNode = objectMapper.readTree(jsonString);
                        //int numberOfResults = jsonNode.get("resultsPerPage").asInt();
                        ArrayNode vulnerabilities = (ArrayNode) jsonNode.get("vulnerabilities");
                        for (int i = 0; i < vulnerabilities.size(); i++) {
                            List<String> weaknessList = new ArrayList<String>();
                            String cveId = vulnerabilities.get(i).get("cve").get("id").asText();
                            output.add(cveId);
                            ArrayNode weaknesses = (ArrayNode) vulnerabilities.get(i).get("cve").get("weaknesses").get(0).get("description");
                            for (int j = 0; j < weaknesses.size(); j++) {
                                if (weaknesses.get(j).getNodeType() == JsonNodeType.OBJECT) {
                                    String cweId = weaknesses.get(j).get("value").asText();
                                    weaknessList.add(cweId);
                                }
                            }
                            vulnerabilityDictionary.put(cveId, weaknessList);
                        }
                        emCatalogView.setInput(output);
                        ISelection selection = new StructuredSelection(output); 
                        emCatalogView.setSelection(selection);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        
    }

    private String getJsonString(String cpeName) {
        String cveUrl = "https://services.nvd.nist.gov/rest/json/cves/2.0?cpeName=" + 
        URLEncoder.encode(cpeName, StandardCharsets.UTF_8) + "&resultsPerPage=20&startIndex=0";

        try {
            URL url = new URL(cveUrl);
            InputStream input = url.openStream();
            InputStreamReader streamReader = new InputStreamReader(input);
            BufferedReader reader = new BufferedReader(streamReader);
            StringBuilder jsonString = new StringBuilder();
            
            while (reader.ready()) {
                jsonString.append(reader.readLine());
            }
            input.close();
            return jsonString.toString();
        } catch (Exception e) {
            e.printStackTrace();
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
