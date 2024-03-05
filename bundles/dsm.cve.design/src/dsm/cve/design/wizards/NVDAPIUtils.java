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

 /**
  * Page used to select an CVE catalog to import
  */
 public class NVDAPIUtils {
    public static String urlWithQuestionMark = "https://services.nvd.nist.gov/rest/json/cves/2.0?";
    public static int pageLength = 2000; //JSON pages seem to have a maximum size of 2000.
 }