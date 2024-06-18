/******************************************************************************************************
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
*******************************************************************************************************/

package dsm.TRADES.impl;

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

import dsm.TRADES.Analysis;
import dsm.TRADES.Component;
import dsm.TRADES.ComponentType;
import dsm.TRADES.Control;
import dsm.TRADES.Data;
import dsm.TRADES.ExternalControl;
import dsm.TRADES.Rule;
import dsm.TRADES.SemanticHelper;
import dsm.TRADES.Vulnerability;
import dsm.TRADES.VulnerabilityTypeENUM;

public class ComponentCustomImpl extends ComponentImpl {

	@Override
	public EList<Control> getAllControls() {
		return ECollections.asEList(SemanticHelper.getAllControls(this));
	}

	@Override
	public EList<Data> getDatas() {
		return DataOwnerElementCustomImpl.getDatas(this);
	}

	@Override
	public EList<Data> getInheritedDatas() {
		return DataOwnerElementCustomImpl.getInheritedData(this);
	}

	@Override
	public EList<ExternalControl> getExternalControls(String id, String sourceId) {
		if (id == null || getControlOwner() == null) {
			return ECollections.emptyEList();
		}
		return ECollections.asEList(getControlOwner().getExternals().stream()
				.filter(ext -> id.equals(ext.getId()) && Objects.equals(sourceId, ext.getSourceID()))
				.collect(toList()));
	}

	@Override
	public EList<Data> getAllDatas() {
		EList<Data> ownedData = getDatas();
		EList<Data> inheritedData = getInheritedDatas();
		List<Data> result = new ArrayList<>(ownedData.size() + inheritedData.size());
		result.addAll(ownedData);
		result.addAll(inheritedData);
		return ECollections.asEList(result);
	}
	
	@Override
	public EList<Rule> getRules() { 
		InternalEList<Rule> output = new BasicInternalEList<Rule>(Rule.class);
		Component component = this;
		while (component.eContainer() instanceof Component) {
			component = (Component) component.eContainer();
		}
		
		Analysis analysis = (Analysis) component.eContainer();
		
		//filter for ComponentTypes affecting this Component
		for (Rule rule : analysis.getRuleOwner().getRules()) {
			for (ComponentType type : rule.getComponentTypesAffected()) {
				if (this.ofType(type)) { 
					output.add(rule);
					break;
				}
			}
		}
		
		return output; 
	}

	@Override
	public EList<Control> getAssociatedControls() {
		InternalEList<Control> output = new BasicInternalEList<Control>(Control.class);

		if(this.getControlOwner() != null) {
			for (Control control : this.getControlOwner().getInternals()) {
				if (!output.contains(control)) {
					output.add(control);
				}
			}
	
			for (Control control : this.getControlOwner().getExternals()) {
				if (!output.contains(control)) {
					output.add(control);
				}
			}
		}

		for (Control control : this.getAssignedControls()) {
			if (!output.contains(control)) {
				output.add(control);
			}
		}

		return output;
	}

	@Override
	public EList<Vulnerability> getCVA() {
		InternalEList<Vulnerability> cva = new BasicInternalEList<Vulnerability>(Vulnerability.class);

		for (ComponentType componentType : this.getComponentTypes()) {
			List<Vulnerability> vulnerabilities = componentType.getAffectedBy();
			for (Vulnerability vulnerability : vulnerabilities) {
				if (vulnerability.getVulnerabilityType() == VulnerabilityTypeENUM.CVE ||
						vulnerability.getVulnerabilityType() == VulnerabilityTypeENUM.IMPLEMENTATION) {
					cva.add(vulnerability);
				}
			}
		}
		return (EList<Vulnerability>) cva;
	}

	@Override
	public EList<Vulnerability> getCWA() {
		InternalEList<Vulnerability> cwa = new BasicInternalEList<Vulnerability>(Vulnerability.class);
		
		for (ComponentType componentType : this.getComponentTypes()) {
			List<Vulnerability> vulnerabilities = componentType.getAffectedBy();
			for (Vulnerability weakness : vulnerabilities) {
				if (weakness.getVulnerabilityType() == VulnerabilityTypeENUM.CWE ||
						weakness.getVulnerabilityType() == VulnerabilityTypeENUM.MECHANISM) {
					cwa.add(weakness);
				}
			}
		}
		return (EList<Vulnerability>) cwa;
	}

	@Override
	public boolean ofType(ComponentType type) {
		for (ComponentType componentType : this.getComponentTypes()) {
			if (type.getName() == componentType.getName()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean mitigatedV(Vulnerability vulnerability) {
		for (Rule rule : this.getRules()) {
			boolean containsVulnerability = rule.getVulnerabilities().contains(vulnerability);
			if(!containsVulnerability) {
				continue;
			}
			//every control in the rule is also in this component
			boolean hasRequiredControls = true;
			for (Control control : rule.getControls()) {
				if (!this.getAssociatedControls().contains(control)) { 
					hasRequiredControls = false;
					break;
				}
			}
			//rule has at least one control
			if (containsVulnerability && hasRequiredControls && rule.getControls().size() > 0) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean mitigatedW(Vulnerability weakness) {
		return mitigatedV(weakness);
	}

	@Override
	public boolean mitigatedByW(Vulnerability vulnerability) {
		for (Vulnerability weakness : vulnerability.getManifests()) {
			if (!mitigated(weakness)) {
				return false;
			}
		}

		return true;
	}

	@Override
	public boolean mitigated(Vulnerability vulnerability) {
		if (mitigatedV(vulnerability) || mitigatedW(vulnerability)) {
			return true;
		}

		if (vulnerability.getManifests().size() > 0 && mitigatedByW(vulnerability)) {
			return true;
		}

		return false;
	}

	@Override
	public boolean vulnerableW() {
		for (Vulnerability vulnerability : this.getCWA()) {
			if (!mitigated(vulnerability)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean vulnerableV() {
		for (Vulnerability vulnerability : this.getCVA()) {
			if (!mitigated(vulnerability)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean isVulnerable() {
		if (this.vulnerableW() || this.vulnerableV()) {
			return true;
		}
		return false;
	}

	@Override
	public EList<Vulnerability> getUnmitigatedVulnerabilities() {
		InternalEList<Vulnerability> output = new BasicInternalEList<Vulnerability>(Vulnerability.class);
		for (Vulnerability vulnerability : this.getCVA()) {
			if (!mitigated(vulnerability)) {
				output.add(vulnerability);
			}
		}
		return output;
	}

	@Override
	public EList<Vulnerability> getUnmitigatedWeaknesses() {
		InternalEList<Vulnerability> output = new BasicInternalEList<Vulnerability>(Vulnerability.class);
		for (Vulnerability vulnerability : this.getCWA()) {
			if (!mitigated(vulnerability)) {
				output.add(vulnerability);
			}
		}
		return output;
	}
}
