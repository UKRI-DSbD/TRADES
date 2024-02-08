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

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.wizard.WizardPage;
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
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//import org.json.JSONObject;
 
/**
 * Page used to select an CVE catalog to import
 */
public class CVECatalogSelectionPage extends WizardPage {

    private boolean embedded = true;
    private Group embeddedGroup;
    private List<String> chosenCWEs;
    private Group browseGroup;
    private Text fileSelectionLabel;
    private ListViewer emCatalogView;

    public CVECatalogSelectionPage() {
        super("CVE Catalog selection page");
        setMessage("Type a CPE name to search for its vulnerabilities.");
    }

    @Override
    public void createControl(Composite parent) {
        Composite composite = new Composite(parent, SWT.None);
        composite.setLayout(new GridLayout(1, true));

        // Type and browse button
        createBrowseGroup(composite);
        
        // Search Results
        createSearchResultsViewer(composite);

        setControl(composite);

    }
 
    public void createBrowseGroup(Composite parent) {
        browseGroup = new Group(parent, SWT.NONE);
        browseGroup.setText("CPE name :");
        browseGroup.setLayout(new GridLayout(2, false));
        browseGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        //browseGroup.setLayout(new RowLayout(SWT.HORIZONTAL));
        //browseGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        this.fileSelectionLabel = new Text(browseGroup, SWT.COLOR_WHITE);
        fileSelectionLabel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        fileSelectionLabel.setText("cpe:2.3:o:microsoft:windows_10:1607");

        Button browseButton = new Button(browseGroup, SWT.PUSH);
        browseButton.setLayoutData(new GridData(GridData.END));
        browseButton.setText("Browse");
        browseButton.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
               String cpeName = fileSelectionLabel.getText();
               queryCVEEndpoint(parent, cpeName);
               getContainer().updateButtons();
            }
        });
        enableGroup(browseGroup, true);
    }

    public void createSearchResultsViewer(Composite parent) {
        this.embeddedGroup = new Group(parent, SWT.NONE);
        embeddedGroup.setText("Select CVEs from below : ");
        embeddedGroup.setLayout(new FillLayout());
        embeddedGroup.setLayoutData(new GridData(GridData.FILL_BOTH));

        this.emCatalogView = new ListViewer(embeddedGroup);
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
                	chosenCWEs = structuredSelection.toList();
                } else {
                	chosenCWEs = null;
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

    public List<String> getChosenCWEs() {
        return chosenCWEs;
    }

    private void queryCVEEndpoint(Composite parent, String cpeName) {
    	List<String> output = new ArrayList<String>();
    	if (cpeName != "") {
            String jsonString = getJsonString(cpeName);
        	
            try {
                ObjectMapper objectMapper = new ObjectMapper();
                JsonNode jsonNode = objectMapper.readTree(jsonString);
                //int numberOfResults = jsonNode.get("resultsPerPage").asInt();
                ArrayNode vulnerabilities = (ArrayNode) jsonNode.get("vulnerabilities");
                for (int i = 0; i < vulnerabilities.size(); i++) {
                	output.add(vulnerabilities.get(i).get("cve").get("id").asText());
                }
                emCatalogView.setInput(output);
            } catch (Exception e) {
    	    	e.printStackTrace();
    	    }
        }
    }

    private String getJsonString(String cpeName) {
        String cveUrl = "https://services.nvd.nist.gov/rest/json/cves/2.0?cpeName=" + 
        URLEncoder.encode(cpeName, StandardCharsets.UTF_8) + "&resultsPerPage=20&startIndex=0";

        try {
            URL url = new URL(cveUrl);
            InputStream input = url.openStream();
            InputStreamReader isr = new InputStreamReader(input);
            BufferedReader reader = new BufferedReader(isr);
            StringBuilder jsonString = new StringBuilder();
            int c;
            while ((c = reader.read()) != -1) {
                jsonString.append((char) c);
            }
            input.close();
            return jsonString.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
 