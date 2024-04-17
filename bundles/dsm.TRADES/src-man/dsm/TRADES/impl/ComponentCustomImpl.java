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

import dsm.TRADES.ComponentType;
import dsm.TRADES.Control;
import dsm.TRADES.Data;
import dsm.TRADES.ExternalControl;
import dsm.TRADES.Rule;
import dsm.TRADES.SemanticHelper;
import dsm.TRADES.Threat;
import dsm.TRADES.ThreatAllocationRelation;
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
	public EList<Vulnerability> getCVA() {
		InternalEList<Vulnerability> cva = new BasicInternalEList<Vulnerability>(Vulnerability.class);
		
		for (ThreatAllocationRelation threatAllocationRelation : this.getThreatAllocations()) {
			Threat threat = threatAllocationRelation.getThreat();
			for (Vulnerability vulnerability : threat.getExploitsVulnerability()) {
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
		
		for (ThreatAllocationRelation threatAllocationRelation : this.getThreatAllocations()) {
			Threat threat = threatAllocationRelation.getThreat();
			for (Vulnerability weakness : threat.getExploitsVulnerability()) {
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
		for (ComponentType componentType : this.getComponentType()) {
			if (type.getName() == componentType.getName()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean mitigatedV(Vulnerability vulnerability) {
		for (Rule rule : this.getRule()) {
			boolean containsVulnerability = rule.getVulnerability().contains(vulnerability);
			boolean hasType = false;
			for (ComponentType type : rule.getComponentTypeAffected()) {
				if (this.ofType(type)) {
					hasType = true; 
					break;
				}
			}
			boolean hasControls = true;
			for (Control control : rule.getControls()) {
				if (!this.getAssignedControl().contains(control)) {
					hasControls = false; 
					break;
				}
			}
			if (containsVulnerability && hasType && hasControls) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean mitigatedW(Vulnerability weakness) {
		for (Rule rule : this.getRule()) {
			boolean containsWeakness = rule.getVulnerability().contains(weakness);
			boolean hasType = false;
			for (ComponentType type : rule.getComponentTypeAffected()) {
				if (this.ofType(type)) {
					hasType = true; 
					break;
				}
			}
			boolean hasControls = true;
			for (Control control : rule.getControls()) {
				if (!this.getAssignedControl().contains(control)) {
					hasControls = false; 
					break;
				}
			}
			if (containsWeakness && hasType && hasControls) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean mitigatedByW(Vulnerability vulnerability) {
		for (Vulnerability weakness : vulnerability.getManifests()) {
			if (!mitigatedV(weakness)) {
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
		if (this.vulnerableW() && this.vulnerableV()) {
			return true;
		}
		return false;
	}
}
