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
import java.util.UUID;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import dsm.TRADES.SemanticUtil;
import dsm.TRADES.TRADESPackage;
import dsm.TRADES.ThreatAllocationRelation;
import dsm.TRADES.util.EcoreUtils;
import dsm.TRADES.util.TRADESValidator;

public class ThreatCustomImpl extends ThreatImpl {

	public ThreatCustomImpl() {
		this.setId(UUID.randomUUID().toString());
	}

	@Override
	public boolean checkIsUsed(DiagnosticChain chain, Map context) {
		if (EcoreUtils.getInverse(this, ThreatAllocationRelation.class,
				TRADESPackage.eINSTANCE.getThreatAllocationRelation_Threat()).isEmpty()) {
			chain.add(new BasicDiagnostic(Diagnostic.INFO, TRADESValidator.DIAGNOSTIC_SOURCE,
					TRADESValidator.THREAT__CHECK_IS_USED,
					MessageFormat.format("[{0}] This threat is not allocated", name), new Object[] { this }));
			return false;
		}
		return true;
	}

	@Override
	public String getSourceName() {
		return SemanticUtil.getSourceName(this);
	}

	@Override
	public String getSourceIdentifier() {
		return SemanticUtil.getSourceIdentifier(this);
	}

}
