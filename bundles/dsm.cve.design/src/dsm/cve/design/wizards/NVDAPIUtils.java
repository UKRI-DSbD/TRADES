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
import java.util.Hashtable;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Text;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeType;

class NVDAPIUtils {
    public static String urlWithQuestionMark = "https://services.nvd.nist.gov/rest/json/cves/2.0?";
    public static int pageLength = 2000; //JSON pages seem to have a maximum size of 2000.

    static String requestJsonString(String cpeName, SelectionEvent event, int startIndex, String apiKey) {
        String cveUrl = urlWithQuestionMark + "cpeName=" + 
            URLEncoder.encode(cpeName, StandardCharsets.UTF_8) + "&startIndex=" + startIndex;
        try {
            HttpRequest.Builder requestBuilder = HttpRequest.newBuilder(new URI(cveUrl));
            if (apiKey != null && !apiKey.isEmpty()) {
                requestBuilder.headers("apiKey", apiKey);
            }
            HttpRequest request = requestBuilder.build();
            HttpClient client = HttpClient.newHttpClient();
            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                return response.body();
            } else {
                String numberOfPages = "";

                if (startIndex == 2) {
                    numberOfPages = "1 CVE page of length " + String.valueOf(pageLength) + " was returned successfully." + System.lineSeparator();
                } else if (startIndex > 2) {
                    numberOfPages = String.valueOf(startIndex - 1) + " CVE pages of length " + String.valueOf(pageLength) + " were returned successfully." + System.lineSeparator();
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

    static String requestJsonString(SelectionEvent event, Text searchText, String apiKey) {
        String cveUrl = NVDAPIUtils.urlWithQuestionMark + 
        searchText.getText();
        try {
            HttpRequest.Builder requestBuilder = HttpRequest.newBuilder(new URI(cveUrl));
            if (apiKey != null && !apiKey.isEmpty()) {
                requestBuilder.headers("apiKey", apiKey);
            }
            HttpRequest request = requestBuilder.build();
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
                "No CVEs found for " + searchText.getText() + ". Please check for typing errors in the parameters.");
            return "";
        }
    }

    static void extractVulnerabilitiesAndWeaknessesPage(SelectionEvent event, 
    		List<String> cvesToDisplay, Text searchText, String apiKey, Text resultsText, 
    		Hashtable<String, List<String>> cveToCWEDictionary) {
        String jsonString = requestJsonString(event, searchText, apiKey);
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
                    if (!cveToCWEDictionary.containsKey(cveId)) {
                        cveToCWEDictionary.put(cveId, new ArrayList<String>());
                    }

                    ArrayNode weaknesses = (ArrayNode) vulnerabilities.get(i).get("cve").get("weaknesses").get(0).get("description");
                    for (int j = 0; j < weaknesses.size(); j++) {
                        if (weaknesses.get(j).getNodeType() == JsonNodeType.OBJECT) {
                            String cweId = weaknesses.get(j).get("value").asText();
                            if (cweId.startsWith("CWE-")) {
                                cveToCWEDictionary.get(cveId).add(cweId.substring(4));
                            } else {
                                cveToCWEDictionary.get(cveId).add(cweId);
                            }
                            
                        }
                    }
                }

                resultsText.setText(
                    "The query returned " + jsonNode.get("resultsPerPage").asText() + " CVEs.");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    static int extractVulnerabilitiesAndWeaknessesPage(String cpeName, SelectionEvent event, 
    		int startIndex, List<String> cvesToDisplay, String apiKey, 
    		Hashtable<String, List<String>> cveToCWEDictionary,
            Hashtable<String, String> cveToCPEDictionary) {
        String jsonString = requestJsonString(cpeName, event, startIndex, apiKey);
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
                    if (!cveToCWEDictionary.containsKey(cveId)) {
                        cveToCWEDictionary.put(cveId, new ArrayList<String>());
                    }
                    if (!cveToCPEDictionary.containsKey(cveId)) {
                        cveToCPEDictionary.put(cveId, cpeName);
                    }

                    ArrayNode weaknesses = (ArrayNode) vulnerabilities.get(i).get("cve").get("weaknesses").get(0).get("description");
                    for (int j = 0; j < weaknesses.size(); j++) {
                        if (weaknesses.get(j).getNodeType() == JsonNodeType.OBJECT) {
                            String cweId = weaknesses.get(j).get("value").asText();
                            if (cweId.startsWith("CWE-")) {
                                cveToCWEDictionary.get(cveId).add(cweId.substring(4));
                            } else {
                                cveToCWEDictionary.get(cveId).add(cweId);
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

    static void queryCVEEndpoint(SelectionEvent event, Text searchText, String apiKey, Text resultsText, TableViewer cveViewer, 
    		Hashtable<String, List<String>> cveToCWEDictionary) {
    	List<String> cvesToDisplay = new ArrayList<String>();
    	extractVulnerabilitiesAndWeaknessesPage(event, cvesToDisplay, searchText, apiKey, resultsText, cveToCWEDictionary);

        if (cvesToDisplay.size() > 0) {
            cveViewer.setInput(cvesToDisplay);
            ISelection selection = new StructuredSelection(cvesToDisplay); 
            cveViewer.setSelection(selection);
        }
    }

    static void queryCVEEndpoint(SelectionEvent event, List<String> chosenCPEs, String apiKey, TableViewer cveViewer, 
    		Hashtable<String, List<String>> cveToCWEDictionary,
            Hashtable<String, String> cveToCPEDictionary) {
    	List<String> cvesToDisplay = new ArrayList<String>();
        boolean shouldPause = false;
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

            int startIndex = 0;
            int returnedVulnerabilities = extractVulnerabilitiesAndWeaknessesPage(
                cpeName, event, 0, cvesToDisplay, apiKey, cveToCWEDictionary, cveToCPEDictionary);
            while (returnedVulnerabilities == NVDAPIUtils.pageLength) {
                try { 
                    //NIST NVD documentation recommends that "your application sleeps for several seconds between requests" 
                    TimeUnit.SECONDS.sleep(1);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                if (!MessageDialog.openConfirm(event.display.getActiveShell(), "Fetch again",
                    "The query brought back a full page (" + String.valueOf(NVDAPIUtils.pageLength) + ") of CVEs. Would you like to search for another page?")) {
                    break;
                }

                startIndex = startIndex + pageLength;
                returnedVulnerabilities = extractVulnerabilitiesAndWeaknessesPage(
                    cpeName, event, startIndex, cvesToDisplay, apiKey, cveToCWEDictionary, cveToCPEDictionary);
            }
        }

        if (cvesToDisplay.size() > 0) {
            cveViewer.setInput(cvesToDisplay);
            ISelection selection = new StructuredSelection(cvesToDisplay); 
            cveViewer.setSelection(selection);
        }
    }
}