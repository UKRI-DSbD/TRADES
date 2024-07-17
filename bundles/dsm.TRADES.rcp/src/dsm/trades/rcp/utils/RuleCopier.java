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

package dsm.trades.rcp.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import dsm.TRADES.ComponentType;
import dsm.TRADES.Control;
import dsm.TRADES.ExternalControl;
import dsm.TRADES.Rule;
import dsm.TRADES.TRADESFactory;
import dsm.TRADES.Vulnerability;

public class RuleCopier {

	Map<Rule, Rule> oldToNewRules = new HashMap<>();
	private Hashtable<String, List<String>> vulnerabilityIds = new Hashtable<String, List<String>>();
	private Hashtable<String, List<String>> componentTypeIds = new Hashtable<String, List<String>>();
	private Hashtable<String, List<String>> controlIds = new Hashtable<String, List<String>>();

	public Rule update(Rule toImport, Rule existingRule) {
		oldToNewRules.put(toImport, existingRule);
		existingRule.setId(toImport.getId());
		existingRule.setName(toImport.getName());
		//EList<Vulnerability> getVulnerabilities();
		vulnerabilityIds.put(toImport.getId(), new ArrayList<String>());
		for (Vulnerability vulnerability : toImport.getVulnerabilities()) {
			vulnerabilityIds.get(toImport.getId()).add(vulnerability.getId());
		}
		//EList<ComponentType> getComponentTypesAffected();
		componentTypeIds.put(toImport.getId(), new ArrayList<String>());
		for (ComponentType componentTypeAffected : toImport.getComponentTypesAffected()) {
			componentTypeIds.get(toImport.getId()).add(componentTypeAffected.getId());
		}
		//EList<Control> getControls();
		controlIds.put(toImport.getId(), new ArrayList<String>());
		for (Control control : toImport.getControls()) {
			controlIds.get(toImport.getId()).add(control.getId());
		}
		
		return existingRule;
	}

	public Rule copy(Rule rule) {
		Rule result = TRADESFactory.eINSTANCE.createRule();
		update(rule, result);

		return result;
	}

	public Map<Rule, Rule> getOldToNewRules() {
		return oldToNewRules;
	}

	public void updateVulnerabilities(List<Rule> rules, List<Vulnerability> vulnerabilities) {
		for (Rule rule : rules) {
			for (String id : vulnerabilityIds.get(rule.getId())) {
				List<Vulnerability> filtered = vulnerabilities.stream().filter(t -> t.getId() == id).collect(Collectors.toList());
				rule.getVulnerabilities().add(filtered.get(0));
			}
		}
	}

	public void updateComponentTypes(List<Rule> rules, List<ComponentType> componentTypes) {
		for (Rule rule : rules) {
			for (String id : componentTypeIds.get(rule.getId())) {
				List<ComponentType> filtered = componentTypes.stream().filter(t -> t.getId() == id).collect(Collectors.toList());
				rule.getComponentTypesAffected().add(filtered.get(0));
			}
		}
	}

	public void updateControls(List<Rule> rules, List<ExternalControl> controls) {
		for (Rule rule : rules) {
			for (String id : controlIds.get(rule.getId())) {
				List<Control> filtered = controls.stream().filter(t -> t.getId() == id).collect(Collectors.toList());
				rule.getControls().add(filtered.get(0));
			}
		}
	}
}
