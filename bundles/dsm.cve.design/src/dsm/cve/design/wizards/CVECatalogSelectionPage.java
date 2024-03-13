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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.ProgressBar;
import org.eclipse.swt.widgets.Text;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import dsm.TRADES.Analysis;
import dsm.TRADES.ComponentType;
import dsm.TRADES.ComponentTypeOwner;

/**
 * Page used to select an CVE catalog to import
 */
public class CVECatalogSelectionPage extends WizardPage {

    private List<String> chosenCVEs;
    private List<String> chosenCPEs;
    private TableViewer cpeViewer;
    private TableViewer cveViewer;
    private ViewerFilter filterViewer;
    private Hashtable<String, List<String>> cveToCWEDictionary = new Hashtable<String, List<String>>();
    private Hashtable<String, ComponentType> cpeToComponentTypeDictionary = new Hashtable<String, ComponentType>();
    private Hashtable<String, String> cveToCPEDictionary = new Hashtable<String, String>();
    private String apiKey;
    private IProject project;
    private String cpeFromComponentType;
    private ProgressBarWrapper progressBar;

    public CVECatalogSelectionPage(IProject project) {
        super("CVE Catalog selection page");
        setMessage("Select a CPE name to search for its vulnerabilities.");
        this.project = project;
    }

    public CVECatalogSelectionPage(String cpeFromComponentType, String apiKey, Hashtable<String, ComponentType> cpeToComponentTypeDictionary) {
        super("CVE Catalog selection page");
        setMessage("Select a CPE name to search for its vulnerabilities.");
        this.apiKey = apiKey;
        this.cpeFromComponentType = cpeFromComponentType;
        this.cpeToComponentTypeDictionary = cpeToComponentTypeDictionary;
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
        
        if (cpeFromComponentType == null) {
            setupPage();
        } else {
            cpeViewer.setInput(Collections.list(cpeToComponentTypeDictionary.keys()));
            List<String> singleCPE = new ArrayList<String>();
            singleCPE.add(cpeFromComponentType);
            ISelection selection = new StructuredSelection(singleCPE); 
            cpeViewer.setSelection(selection);
        }
    }

    private void createFilterGroup(Composite parent) {
        Group filterGroup = new Group(parent, SWT.NONE);
        filterGroup.setText("Enter the first few characters of a CPE to filter the below list :");
        filterGroup.setLayout(new GridLayout(1, false));
        filterGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        Text filterText = new Text(filterGroup, SWT.COLOR_WHITE);
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
 
    private void createFetchGroup(Composite parent) {
        Group fetchGroup = new Group(parent, SWT.NONE);
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
        
        Button fetchButton = new Button(fetchGroup, SWT.PUSH);
        fetchButton.setLayoutData(new GridData(GridData.END));
        fetchButton.setText("Fetch");
        fetchButton.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                fetchButton.setEnabled(false);
                NVDAPIUtils.RunOnBackgroundThread(() -> {
            		NVDAPIUtils.queryCVEEndpoint(e, chosenCPEs, apiKey, cveViewer, cveToCWEDictionary, cveToCPEDictionary, progressBar);
                    //Update the UI on the UI thread
            		NVDAPIUtils.RunOnUiThreadSync(e, () -> fetchButton.setEnabled(true));
            	});
            }
        });

        cpeViewer.addFilter(this.filterViewer);

        progressBar = new ProgressBarWrapper(new ProgressBar(parent, SWT.HORIZONTAL));
    }

    private void createSearchResultsViewer(Composite parent) {
        Group embeddedGroup = new Group(parent, SWT.NONE);
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
        			String platformPath = '/' + project.getName() + '/' + resource.getName().toLowerCase();
        			ResourceSet resourceSet = new ResourceSetImpl();
    				Resource tradesResource = resourceSet
    						.getResource(URI.createFileURI(platformPath), true);
    				Analysis analysis = (Analysis) tradesResource.getContents().get(0);
                    extractAPIKeyAndCPEs(resource.getLocationURI().getPath().toString(), analysis);
        		}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
    }

    private void extractAPIKeyAndCPEs(String filePath, Analysis analysis) {
		DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
		try (InputStream input = new FileInputStream(filePath)) {
			DocumentBuilder builder = documentFactory.newDocumentBuilder();
			Document doc = builder.parse(input);
			Node analysisNode = doc.getDocumentElement();
			extractAPIKey(analysisNode);
			extractCPEs(analysisNode, analysis);			
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    private void extractAPIKey(Node analysisNode) {
    	Node attribute = analysisNode.getAttributes().getNamedItem("nVDAPIKey");
		if (attribute != null) {
			this.apiKey = attribute.getNodeValue();
		} else {
			this.apiKey = null;
		}
    }
    
    private void extractCPEs(Node analysisNode, Analysis analysis) {
    	if (this.apiKey != null) {
    		NodeList analysisChildList = analysisNode.getChildNodes();
    		for (int i = 0; i < analysisChildList.getLength(); i++) {
    			Node analysisChild = analysisChildList.item(i);
    			if (analysisChild.getNodeName().equals("componentTypeOwner")) {
    				NodeList componentTypeList = analysisChild.getChildNodes();
    				for (int j = 0; j < componentTypeList.getLength(); j++) {
    					Node componentTypeNode = componentTypeList.item(j);
    					//ignore text nodes
						if (componentTypeNode.getNodeType() != Node.TEXT_NODE) {
    						Node cpeAttribute = componentTypeNode.getAttributes().getNamedItem("name");
    						if (cpeAttribute != null) {
                                String cpeName = cpeAttribute.getNodeValue();
    							addComponentTypeToDictionary(cpeName, analysis);
                                
    						}
    					}
    				}
    			}
    		}
    		cpeViewer.setInput(Collections.list(cpeToComponentTypeDictionary.keys()));
    		if (cpeFromComponentType == null) {
                ISelection selection = new StructuredSelection(cpeToComponentTypeDictionary.keys()); 
                cpeViewer.setSelection(selection);
            }
    	}
    }

    private void addComponentTypeToDictionary(String cpeName, Analysis analysis) {
    	ComponentTypeOwner componentTypeOwner = analysis.getComponentTypeOwner();
        for (ComponentType componentType : componentTypeOwner.getComponentTypes()) {
        	if (componentType.getName().equals(cpeName)) {
        		cpeToComponentTypeDictionary.put(cpeName, componentType);
        	}
        }
    }

    public List<String> getChosenCVEs() {
        return chosenCVEs;
    }

    public Hashtable<String, List<String>> getCVEToCWEDictionary() {
        return cveToCWEDictionary;
    }

    public Hashtable<String, ComponentType> getCPEToComponentTypeDictionary() {
        return cpeToComponentTypeDictionary;
    }

    public Hashtable<String, String> getCVEToCPEDictionary() {
        return cveToCPEDictionary;
    }
}
