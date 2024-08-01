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
import dsm.TRADES.ExternalThreat;
import dsm.TRADES.TRADESFactory;
import dsm.TRADES.Threat;
import dsm.TRADES.Vulnerability;

public class ComponentTypeCopier {

	Map<ComponentType, ComponentType> oldToNewComponentTypes = new HashMap<>();
	private Hashtable<String, List<String>> manifests = new Hashtable<String, List<String>>();
	private Hashtable<String, List<String>> threatIds = new Hashtable<String, List<String>>();
	private Hashtable<String, List<String>> vulnerabilityIds = new Hashtable<String, List<String>>();

	public ComponentType update(ComponentType toImport, ComponentType existingComponentType) {
		oldToNewComponentTypes.put(toImport, existingComponentType);
		existingComponentType.setId(toImport.getId());
		existingComponentType.setName(toImport.getName());
		//EList<ComponentType> getManifests();
		manifests.put(toImport.getId(), new ArrayList<String>());
		for (ComponentType componentType : toImport.getManifests()) {
			manifests.get(toImport.getId()).add(componentType.getId());
		}
		//EList<Threat> getSubjectToThreats();
		threatIds.put(toImport.getId(), new ArrayList<String>());
		for (Threat threat : toImport.getSubjectToThreats()) {
			threatIds.get(toImport.getId()).add(threat.getId());
		}
		//EList<Vulnerability> getAffectedBy();
		vulnerabilityIds.put(toImport.getId(), new ArrayList<String>());
		for (Vulnerability vulnerability : toImport.getAffectedBy()) {
			vulnerabilityIds.get(toImport.getId()).add(vulnerability.getId());
		}

		return existingComponentType;
	}

	public ComponentType copy(ComponentType componentType) {
		ComponentType result = TRADESFactory.eINSTANCE.createComponentType();
		update(componentType, result);
		
		return result;
	}

	public Map<ComponentType, ComponentType> getOldToNewComponentTypes() {
		return oldToNewComponentTypes;
	}

	public void updateManifests(List<ComponentType> componentTypes) {
		for (ComponentType componentType : componentTypes) {
			for (String id : manifests.get(componentType.getId())) {
				List<ComponentType> filtered = oldToNewComponentTypes.values().stream().filter(t -> t.getId() == id).collect(Collectors.toList());
				componentType.getManifests().add(filtered.get(0));
			}
		}
	}

	public void updateThreats(List<ComponentType> componentTypes, List<ExternalThreat> threats) {
		for (ComponentType componentType : componentTypes) {
			for (String id : threatIds.get(componentType.getId())) {
				List<Threat> filtered = threats.stream().filter(t -> t.getId() == id).collect(Collectors.toList());
				componentType.getSubjectToThreats().add(filtered.get(0));
			}
		}
	}

	public void updateVulnerabilities(List<ComponentType> componentTypes, List<Vulnerability> vulnerabilities) {
		for (ComponentType componentType : componentTypes) {
			for (String id : vulnerabilityIds.get(componentType.getId())) {
				List<Vulnerability> filtered = vulnerabilities.stream().filter(t -> t.getId() == id).collect(Collectors.toList());
				componentType.getAffectedBy().add(filtered.get(0));
			}
		}
	}
}
