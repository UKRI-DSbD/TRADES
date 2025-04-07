/**
 * Copyright University of Oxford, Eclipse contributors and others 2021. All rights reserved.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     University of Oxford - initial API and implementation
 * 
 */

package dsm.cve.design.wizards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;

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
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.ProgressBar;
import org.eclipse.swt.widgets.Text;
import dsm.TRADES.ComponentType;

/**
 * Page used to select an CVE catalog to import
 */
public class CVECatalogSelectionPage extends WizardPage {

	private List<String> chosenCVEs;
    private List<String> chosenCPEs;
    private String apiOptionString; //NVD API Parameters
    private TableViewer cpeViewer;
    private TableViewer cveViewer;
    private ViewerFilter filterViewer;
    private Hashtable<String, List<String>> cveToCWEDictionary = new Hashtable<String, List<String>>();
    private Hashtable<String, ComponentType> cpeToComponentTypeDictionary = new Hashtable<String, ComponentType>();
    private Hashtable<String, List<String>> cveToCPEDictionary = new Hashtable<String, List<String>>();
    private String apiKey;
    private String cpeFromComponentType;
    private ProgressBarWrapper progressBar;
    
    public CVECatalogSelectionPage() {
        super("CVE Catalog selection page");
        setMessage("Select a CPE name to search for its vulnerabilities.");
    }

    public CVECatalogSelectionPage(String cpeFromComponentType, String apiKey, Hashtable<String, ComponentType> cpeToComponentTypeDictionary) {
        this();
        this.cpeFromComponentType = cpeFromComponentType;
        initialise(apiKey, cpeToComponentTypeDictionary);
    }
    
    public void initialise(String apiKey, Hashtable<String, ComponentType> cpeToComponentTypeDictionary) {
	   this.apiKey = apiKey;
	   this.cpeToComponentTypeDictionary = cpeToComponentTypeDictionary;
	   
	   if(cpeViewer != null)
	   {
	       cpeViewer.setInput(Collections.list(cpeToComponentTypeDictionary.keys()));
		   ISelection selection = new StructuredSelection(cpeToComponentTypeDictionary.keys()); 
		   cpeViewer.setSelection(selection); //TODO This does not seem to work
	   }
    }

    @Override
    public void createControl(Composite parent) {  	
        Composite composite = new Composite(parent, SWT.None);
        composite.setLayout(new GridLayout(1, true));

        //Filter existing CPEs
        createCpeFilterGroup(composite);

        // Type and fetch button
        createCpeSelectAndFetchGroup(composite);
        
        // NVD API Option
        createUrlParametersGroup(composite);
        
        // Progress bar
        createProgressBarGroup(composite);
        
        // Search Results
        createCveResultsGroup(composite);
        
        Label disclaimerText = new Label(composite, SWT.COLOR_TRANSPARENT);
        disclaimerText.setText(System.lineSeparator() + 
        	"This product uses data from the NVD API but is not endorsed or certified by the NVD.");

        setControl(composite);
        
        cpeViewer.setInput(Collections.list(cpeToComponentTypeDictionary.keys()));
        if (cpeFromComponentType != null) {
            List<String> singleCPE = new ArrayList<String>();
            singleCPE.add(cpeFromComponentType);
            ISelection selection = new StructuredSelection(singleCPE); 
            cpeViewer.setSelection(selection);
        }
    }

    private void createCpeFilterGroup(Composite parent) {
        Group filterGroup = new Group(parent, SWT.NONE);
        filterGroup.setText("Enter the first few characters of a CPE to filter the below list:");
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
        
    private void createCpeSelectAndFetchGroup(Composite parent) {    	
        Group group = new Group(parent, SWT.NONE);
        group.setText("CPEs found :");
        group.setLayout(new GridLayout(2, false));
        GridData gridData = new GridData(GridData.FILL_BOTH);
        gridData.heightHint = 300;
        gridData.minimumHeight = 100;
        group.setLayoutData(gridData);

        cpeViewer = new TableViewer(group);
        cpeViewer.getControl().setLayoutData(new GridData(GridData.FILL_BOTH));
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
        
        Button fetchButton = new Button(group, SWT.PUSH);
        fetchButton.setLayoutData(new GridData(GridData.END));
        fetchButton.setText("Fetch");
        fetchButton.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                fetchButton.setEnabled(false);
                NVDAPIUtils.RunOnBackgroundThread(() -> {
                	NVDAPIUtils.queryCVEEndpoint(e, chosenCPEs, apiOptionString, apiKey, cveViewer, cveToCWEDictionary, cveToCPEDictionary, progressBar);
                    //Update the UI on the UI thread
            		NVDAPIUtils.RunOnUiThreadSync(e, () -> fetchButton.setEnabled(true));
            	});
            }
        });

        cpeViewer.addFilter(this.filterViewer);
    }
    
    private void createUrlParametersGroup(Composite parent) {
        Group searchGroup = new Group(parent, SWT.NONE);
        searchGroup.setText("Enter optional NVD API parameters below:");
        searchGroup.setLayout(new GridLayout(1, false));
        searchGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));        
        Text apiOption = new Text(searchGroup, SWT.COLOR_WHITE);        
        apiOption.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        apiOption.setText("&isVulnerable");
        apiOptionString = apiOption.getText();
        
        apiOption.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent e) {
                apiOptionString = apiOption.getText(); // Get the updated text                
            }
        });
    }

    private void createProgressBarGroup(Composite parent) {
    	Group group = new Group(parent, SWT.NONE);
    	group.setText("Download progress:");
    	group.setLayout(new GridLayout(1, false));
    	group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        progressBar = new ProgressBarWrapper(new ProgressBar(group, SWT.HORIZONTAL));
    }
    
    private void createCveResultsGroup(Composite parent) {
        Group group = new Group(parent, SWT.NONE);
        group.setText("Select CVEs from below : ");
        group.setLayout(new GridLayout(1, false));
        GridData gridData = new GridData(GridData.FILL_BOTH); 
        gridData.heightHint = 200;
        gridData.minimumHeight = 100;
        group.setLayoutData(gridData);

        cveViewer = new TableViewer(group);
        cveViewer.getControl().setLayoutData(new GridData(GridData.FILL_BOTH));
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

    public List<String> getChosenCVEs() {
        return chosenCVEs;
    }

    public Hashtable<String, List<String>> getCVEToCWEDictionary() {
        return cveToCWEDictionary;
    }

    public Hashtable<String, ComponentType> getCPEToComponentTypeDictionary() {
        return cpeToComponentTypeDictionary;
    }

    public Hashtable<String, List<String>> getCVEToCPEDictionary() {
        return cveToCPEDictionary;
    }
}
