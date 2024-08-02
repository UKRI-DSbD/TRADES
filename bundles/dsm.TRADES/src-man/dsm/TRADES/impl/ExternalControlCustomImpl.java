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

package dsm.TRADES.impl;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import dsm.TRADES.Characteristic;
import dsm.TRADES.IMitigationLink;
import dsm.TRADES.Threat;
import dsm.TRADES.ThreatMitigationRelation;

public class ExternalControlCustomImpl extends ExternalControlImpl {

	public ExternalControlCustomImpl() {
		this.setId(UUID.randomUUID().toString());
	}

	@Override
	public EList<IMitigationLink> getMitigatedThreatDefinitions() {
		List<IMitigationLink> definitions = new ArrayList<IMitigationLink>();
		for (ThreatMitigationRelation rel : getMitigationRelations()) {
			Threat threat = rel.getThreat();
			if (threat != null && threat.getId() != null) {
				definitions.add(rel);
			}
		}
		return ECollections.toEList(definitions);
	}

	@Override
	public String getSourceName() {
		return getSource();
	}

	@Override
	public String getSourceIdentifier() {
		return getSourceID();
	}

	@Override
	public String getDescription() {
		String descriptionWithPlaceholders = this.getDescriptionWithPlaceholders();
		Hashtable<String, String> parameterDictionary = new Hashtable<String, String>();
		for (Characteristic characteristic : getCharacteristics()) {
			if (characteristic.getName() != null && 
					!characteristic.getName().isBlank() && 
					characteristic.getValue() != null && 
					!characteristic.getValue().isBlank()) {
				parameterDictionary.put(characteristic.getName(), characteristic.getValue());
			}
		}
		//replace each placeholder in descriptionWithPlaceholders.
		//copied from dsm.oscal.model.DocumentationComputer.
		Pattern INSET_PATTERN = Pattern.compile("\\{\\{\\s*insert:\\s*param\\s*,\\s*(\\S*)\\s*\\}\\}");
		if (descriptionWithPlaceholders == null) {
			return "";
		}
		Matcher match = INSET_PATTERN.matcher(descriptionWithPlaceholders);

		String output = match.replaceAll(matchResult -> {
			String id = matchResult.group(1);
			String value = parameterDictionary.get(id);
			if (value != null) {
				return Matcher.quoteReplacement(value);
			}
			return descriptionWithPlaceholders.substring(matchResult.start(), matchResult.end());
		});

		return output;
	}

}
