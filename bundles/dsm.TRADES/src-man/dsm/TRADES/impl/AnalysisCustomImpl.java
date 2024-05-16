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

import dsm.TRADES.Component;
import dsm.TRADES.ComponentType;
import dsm.TRADES.Control;
import dsm.TRADES.Data;
import dsm.TRADES.ExternalControl;
import dsm.TRADES.ExternalThreat;
import dsm.TRADES.Rule;
import dsm.TRADES.SemanticHelper;
import dsm.TRADES.ThreatsOwner;
import dsm.TRADES.Vulnerability;

public class AnalysisCustomImpl extends AnalysisImpl {
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
		return ECollections.emptyEList();
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
	public EList<ExternalControl> getExternalControls(String id, String sourceId) {
		if (id == null || getControlOwner() == null) {
			return ECollections.emptyEList();
		}
		return ECollections.asEList(getControlOwner().getExternals().stream()
				.filter(ext -> id.equals(ext.getId()) && Objects.equals(sourceId, ext.getSourceID())).collect(toList()));
	}

	@Override
	public EList<ExternalThreat> getExternalThreats(String id, String sourceId) {
		ThreatsOwner owner = getThreatOwner();
		if (owner == null || id == null) {
			return ECollections.emptyEList();
		}
		return ECollections
				.asEList(owner.getExternals().stream().filter(e -> e instanceof ExternalThreat
						&& id.equals(e.getId()) && Objects.equals(sourceId, ((ExternalThreat) e).getSourceID()))
						.map(e -> (ExternalThreat) e)
						.collect(toList()));
	}

	@Override
	public boolean directRuleExists(Vulnerability vulnerability, ComponentType type) {
		for (Rule rule : this.getRuleOwner().getRules()) {
			boolean containsVulnerability = rule.getVulnerabilities().contains(vulnerability);
			boolean containsComponentType = rule.getComponentTypesAffected().contains(type);
			boolean hasControls = rule.getControls().size() > 0;
			if (containsComponentType && containsVulnerability && hasControls) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean proxyRuleExists(Vulnerability vulnerability, ComponentType type) {
		for (Vulnerability manifestedVulnerability : vulnerability.getManifests()) {
			if (!ruleExists(manifestedVulnerability, type)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean ruleExists(Vulnerability vulnerability, ComponentType type) {
		if (vulnerability.getManifests().size() > 0 && proxyRuleExists(vulnerability, type)) {
			return true;
		}

		if (directRuleExists(vulnerability, type)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isProperty_VulnerabilityMitigationRulesAvailable() {
		List<Component> allComponents = this.getComponents();

		for (Component component : allComponents) {
			for (ComponentType componentType : component.getComponentTypes()) {
				for (Vulnerability vulnerability : component.getCVA()) {
					if(!component.ofType(componentType) || !ruleExists(vulnerability, componentType)) {
						return false;
					}
				}
			}
		}
		
		return true;
	}

	@Override
	public boolean isProperty_WeaknessMitigationRulesAvailable() {
		List<Component> allComponents = this.getComponents();

		for (Component component : allComponents) {
			for (ComponentType componentType : component.getComponentTypes()) {
				for (Vulnerability vulnerability : component.getCWA()) {
					if(!component.ofType(componentType) || !ruleExists(vulnerability, componentType)) {
						return false;
					}
				}
			}
		}
		return true;
	}

	@Override
	public boolean isProperty_DesignAddressesVulnerabilities() {
		List<Component> allComponents = this.getComponents();

		for (Component component : allComponents) {
			for (Vulnerability vulnerability : component.getCVA()) {
				if(!component.mitigated(vulnerability)) {
					return false;
				}
			}
		}
		return true;
	}

	@Override
	public boolean isProperty_DesignAddressesWeaknesses() {
		List<Component> allComponents = this.getComponents();

		for (Component component : allComponents) {
			for (Vulnerability weakness : component.getCWA()) {
				if(!component.mitigated(weakness)) {
					return false;
				}
			}
		}
		return true;
	}
}
