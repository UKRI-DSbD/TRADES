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
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.TypedEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.ProgressBar;
import org.eclipse.swt.widgets.Text;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeType;

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
    private String apiKey;
    private IProject project;
    private String cpeFromComponentType;
    private List<String> cpeList;
    private ProgressBarWrapper progressBar;

    public CVECatalogSelectionPage(IProject project) {
        super("CVE Catalog selection page");
        setMessage("Select a CPE name to search for its vulnerabilities.");
        this.project = project;
    }

    public CVECatalogSelectionPage(String cpeFromComponentType, String apiKey, List<String> cpeList) {
        super("CVE Catalog selection page");
        setMessage("Select a CPE name to search for its vulnerabilities.");
        this.apiKey = apiKey;
        this.cpeFromComponentType = cpeFromComponentType;
        this.cpeList = cpeList;
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
            cpeViewer.setInput(cpeList);
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
 
    private void createFetchGroup(Composite parent) {
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
        
        Button fetchButton = new Button(fetchGroup, SWT.PUSH);
        fetchButton.setLayoutData(new GridData(GridData.END));
        fetchButton.setText("Fetch");
        fetchButton.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
            	fetchButton.setEnabled(false);
            	RunOnBackgroundThread(() -> {
            		queryCVEEndpoint(e);
            		//Update the UI on the UI thread
					RunOnUiThreadSync(e, () -> fetchButton.setEnabled(true));
            	});
            }
        });

        cpeViewer.addFilter(this.filterViewer);
        
        progressBar = new ProgressBarWrapper(new ProgressBar(parent, SWT.HORIZONTAL));
        
        enableGroup(fetchGroup, true);
    }

    private void createSearchResultsViewer(Composite parent) {
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
        boolean shouldPause = false;
        int cpeCount = 0;
        progressBar.setMaximum(chosenCPEs.size());
        double initialProgress = 0.25; 
        progressBar.setValue(initialProgress); //Show some pretend progress straight away
    	for (String cpeName : chosenCPEs) {
            if (shouldPause) {
            	try { 
                	//pause before each CPE except the first one
            		TimeUnit.SECONDS.sleep(1);
            	} catch (Exception e) {
            		e.printStackTrace();
            	}
            } else {
                shouldPause = true;
            }

            FetchProgress fetchProgress = requestAndParseJson(cpeName, event, new FetchProgress(), cvesToDisplay);
           	while (fetchProgress != null && !fetchProgress.isComplete()) {
            	progressBar.setValue(Math.max(initialProgress, cpeCount + fetchProgress.fractionalProgress()));
                try { 
                	//NIST NVD documentation recommends that "your application sleeps for several seconds between requests"  and also suggests 6s.
                	TimeUnit.SECONDS.sleep(6);
                } catch (Exception e) {
                	e.printStackTrace();
                }

            	fetchProgress = requestAndParseJson(cpeName, event, fetchProgress, cvesToDisplay);
            }
            
            cpeCount++;
            progressBar.setValue(cpeCount);
    	}

        if (cvesToDisplay.size() > 0) {
        	RunOnUiThreadSync(event, () -> {
	            cveViewer.setInput(cvesToDisplay);
	            ISelection selection = new StructuredSelection(cvesToDisplay); 
	            cveViewer.setSelection(selection);
        	});
        }        
    }

    private FetchProgress requestAndParseJson(String cpeName, SelectionEvent event, FetchProgress fetchProgress, List<String> cvesToDisplay) {
        String jsonString = requestJsonString(cpeName, event, fetchProgress);
        if (jsonString != null) {
            try {
                ObjectMapper objectMapper = new ObjectMapper();
                JsonNode jsonNode = objectMapper.readTree(jsonString);
                
                int totalResultsToBeReturned = jsonNode.get("totalResults").asInt();
                System.out.println("CVE import - Total results to fetch = " + totalResultsToBeReturned);
                int resultsPerPage = jsonNode.get("resultsPerPage").asInt();
                System.out.println("CVE import - Results per page = " + resultsPerPage);
                
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
                return new FetchProgress(fetchProgress.startIndex + resultsPerPage, totalResultsToBeReturned);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        } else {
            return null;
        }
    }

    private String requestJsonString(String cpeName, SelectionEvent event, FetchProgress fetchProgres ) {
        String cveUrl = NVDAPIUtils.urlWithQuestionMark + "startIndex=" + fetchProgres.startIndex 
        		+ "&cpeName=" + URLEncoder.encode(cpeName, StandardCharsets.UTF_8);
        try {
            HttpRequest.Builder requestBuilder = HttpRequest.newBuilder(new URI(cveUrl));
			if (this.apiKey != null && !this.apiKey.isEmpty()) {
				requestBuilder.headers("apiKey", this.apiKey);
			}
            HttpRequest request = requestBuilder.build();
            
        	HttpClient client = HttpClient.newHttpClient();
        	
        	System.out.println("CVE import - Making request: " + cveUrl + "...");
        	HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        	System.out.println("CVE import - Response received: " + response.statusCode());
        	if (response.statusCode() == 200) {
        		return response.body();
        	} else {
                RunOnUiThreadSync(event, () -> {
                    String progressMessage = fetchProgres.startIndex + (fetchProgres.totalResultsToFetch > 0 ? "/" + fetchProgres.totalResultsToFetch : "") + " CVEs obtained for CPE " + cpeName;
                    MessageDialog.openError(
                        event.display.getActiveShell(), 
                        "CVE load aborted", 
                        "The NVD API returned HTTP Status Code " + response.statusCode() + "." + System.lineSeparator()
                            + progressMessage + System.lineSeparator()                  
                            + "Please try again later.");
                    });
        		return null;
        	}
        } catch (Exception e) {
            e.printStackTrace(); 
            RunOnUiThreadSync(event, () -> {
	            MessageDialog.openError(
	                event.display.getActiveShell(), 
	                "No CVEs affecting CPE found", 
	                "No CVEs found that affect " + cpeName + ". Please check for typing errors in the CPE name.");
	            });
            return null;
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
        			extractAPIKeyAndCPEs(resource.getLocationURI().getPath().toString());
        		}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    private void extractAPIKeyAndCPEs(String filePath) {
		DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
		try (InputStream input = new FileInputStream(filePath)) {
			DocumentBuilder builder = documentFactory.newDocumentBuilder();
			Document doc = builder.parse(input);
			Node analysisNode = doc.getDocumentElement();
			extractAPIKey(analysisNode);
			extractCPEs(analysisNode);			
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
    
    private void extractCPEs(Node analysisNode) {
    	if (this.apiKey != null) {
    		List<String> displayedCPEs = new ArrayList<String>();
        	NodeList analysisChildList = analysisNode.getChildNodes();
    		for (int i = 0; i < analysisChildList.getLength(); i++) {
    			Node analysisChild = analysisChildList.item(i);
    			if (analysisChild.getNodeName() == "componentTypeOwner") {
    				NodeList componentTypeList = analysisChild.getChildNodes();
    				for (int j = 0; j < componentTypeList.getLength(); j++) {
    					Node componentType = componentTypeList.item(j);
    					//ignore text nodes
						if (componentType.getNodeType() != Node.TEXT_NODE) {
    						Node cpeAttribute = componentType.getAttributes().getNamedItem("name");
    						if (cpeAttribute != null) {
    							displayedCPEs.add(cpeAttribute.getNodeValue());
    						}
    					}
    				}
    			}
    		}
    		cpeViewer.setInput(displayedCPEs);
    		if (cpeFromComponentType == null) {
                ISelection selection = new StructuredSelection(displayedCPEs); 
                cpeViewer.setSelection(selection);
            }
    	}    	
    }
    
    private static void RunOnBackgroundThread(Runnable runnable)
    {
    	var workerThread = new Thread(runnable);
    	workerThread.start();
    }
    
    private static void RunOnUiThreadSync(TypedEvent event, Runnable runnable)
    {
    	RunOnUiThreadSync(event.display, runnable);
    }
    
    private static void RunOnUiThreadSync(Display display, Runnable runable)
    {
    	display.syncExec(runable);
    }
    
    /**
     * A simple object encapsulating the startIndex and total result count
     * of an API fetch. 
     */
    private class FetchProgress {
    	int startIndex;
    	int totalResultsToFetch;
    	
    	public FetchProgress()
    	{
    		this.startIndex = 0;
    		this.totalResultsToFetch = 0;
    	}
    	
    	public FetchProgress(int startIndex, int totalResultsToFetch)
    	{
    		this.startIndex = startIndex;
    		this.totalResultsToFetch = totalResultsToFetch;
    	}
    	
    	public boolean isComplete() 
    	{
    		return !(startIndex < totalResultsToFetch);
    	}
    	
    	public double fractionalProgress()
    	{
    		return (startIndex - 1) * 1.0 / totalResultsToFetch;
    	}
    }
    
    /**
     * Wraps a SWT ProgressBar object to allow for doubles to be sent as progress measures
     * and for updates to be handled on the UI thread without reading to explicitly code that.
     */
    private class ProgressBarWrapper {

		private ProgressBar progressBar;

		private double max;
		private double value;
		private int displayMax = 100; //The granularity of the display

		public ProgressBarWrapper(ProgressBar control) {
			progressBar = control;
			progressBar.setState(SWT.NORMAL);
			progressBar.setMinimum(0);
			progressBar.setMaximum(displayMax);
		}

		public void setMaximum(double maximum) {
			max = maximum;
		}

		public void setValue(double currentValue)
    	{
			value = currentValue;
    		progressBar.getDisplay().syncExec(new Runnable() {
    			@Override
    			public void run() {
    				if(!progressBar.isDisposed())
    					progressBar.setSelection((int)Math.floor(value*displayMax/max));
    			}
    		});
    	}
	}
}
