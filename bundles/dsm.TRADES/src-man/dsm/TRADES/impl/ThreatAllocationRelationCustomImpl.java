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

import java.text.MessageFormat;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import dsm.TRADES.AttackChain;
import dsm.TRADES.AttackChainStep;
import dsm.TRADES.Component;
import dsm.TRADES.DifficultyScore;
import dsm.TRADES.Threat;
import dsm.TRADES.Vulnerability;
import dsm.TRADES.VulnerabilityTypeENUM;
import dsm.TRADES.util.TRADESValidator;

public class ThreatAllocationRelationCustomImpl extends ThreatAllocationRelationImpl {

	@Override
	public boolean checkComputedDifficultyConstraint(DiagnosticChain chain, @SuppressWarnings("rawtypes") Map context) {
		AttackChain attackChain = getAttackChain();
		if (attackChain != null) {
			DifficultyScore diffElement = getDifficultyScore();
			int diff = diffElement != null ? diffElement.getDifficulty() : 0;
			int cmpDiff = attackChain.getComputedDifficulty();
			if (diff != cmpDiff) {
				chain.add(new BasicDiagnostic(Diagnostic.WARNING, TRADESValidator.DIAGNOSTIC_SOURCE,
						TRADESValidator.THREAT_ALLOCATION_RELATION__CHECK_COMPUTED_DIFFICULTY_CONSTRAINT,
						MessageFormat.format(
								"Linked attack chain defines a difficulty ({0}) which is different from the one defined for this ThreatAllocationRelation ({1})",
								cmpDiff, diff),
						new Object[] { this }));
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean mitigatedAV() {
		Component component = this.getComponent();
		Threat threat = this.getThreat();
		
		for (Vulnerability vulnerability : threat.getExploitsVulnerability()) {
			if (vulnerability.getVulnerabilityType() == VulnerabilityTypeENUM.CVE ||
					vulnerability.getVulnerabilityType() == VulnerabilityTypeENUM.IMPLEMENTATION) {
				if (!component.mitigated(vulnerability)) {
					return false;
				}
			}
		}
		return true;
	}

	@Override
	public boolean mitigatedAW() {
		Component component = this.getComponent();
		Threat threat = this.getThreat();
		
		for (Vulnerability weakness : threat.getExploitsVulnerability()) {
			if (weakness.getVulnerabilityType() == VulnerabilityTypeENUM.CWE ||
					weakness.getVulnerabilityType() == VulnerabilityTypeENUM.MECHANISM) {
				if (!component.mitigated(weakness)) {
					return false;
				}
			}
		}
		return true;
	}

	@Override
	public boolean mitigatedVSteps() {
		if (this.getAttackChain().getAttackChainSteps().size() == 0) {
			return false;
		}
		
		for (AttackChainStep attackChainStep : this.getAttackChain().getAttackChainSteps()) {
			if (!attackChainStep.getThreatAllocationRelation().mitigatedAV()) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean mitigatedWSteps() {
		if (this.getAttackChain().getAttackChainSteps().size() == 0) {
			return false;
		}
		for (AttackChainStep attackChainStep : this.getAttackChain().getAttackChainSteps()) {
			if (!attackChainStep.getThreatAllocationRelation().mitigatedAV()) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean mitigatedV() {
		if (this.getAttackChain().getAttackChainSteps().size() > 0 && this.mitigatedVSteps()) {
			return true;
		}

		if (this.mitigatedAV()) {
			return true;
		}
		return false;
	}

	@Override
	public boolean mitigatedW() {
		if (this.getAttackChain().getAttackChainSteps().size() > 0 && this.mitigatedVSteps()) {
			return true;
		}

		if (this.mitigatedAW()) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isMitigated() {
		if (this.mitigatedW() || this.mitigatedV()) {
			return true;
		}
		return false;
	}
}
