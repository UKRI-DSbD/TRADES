/**
 * Copyright (c) Israel Aerospace Industries, Eclipse contributors and others 2021.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *
 */

package org.eclipse.sirius.ui.properties.ext.widgets.markup.internal;

import java.util.Map;

import org.eclipse.eef.ext.widgets.markup.MarkupWidgets.EEFExtMarkdownWidget;
import org.eclipse.eef.ext.widgets.markup.MarkupWidgets.MarkupWidgetsFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.properties.core.api.AbstractDescriptionConverter;
import org.eclipse.sirius.properties.core.api.TransformationCache;
import org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.ExtMarkdownDescription;
import org.eclipse.sirius.viewpoint.description.tool.InitialOperation;

public class ExtMarkdownDescriptionConverter extends AbstractDescriptionConverter {

	@Override
	public boolean canHandle(EObject description) {
		return description instanceof ExtMarkdownDescription;
	}

	@Override
	public EObject convert(EObject description, Map<String, Object> parameters, TransformationCache cache) {
		ExtMarkdownDescription textDescription = (ExtMarkdownDescription) description;

		EEFExtMarkdownWidget eefTextDescription = MarkupWidgetsFactory.eINSTANCE.createEEFExtMarkdownWidget();
		eefTextDescription.setIdentifier(textDescription.getName());
		eefTextDescription.setHelpExpression(textDescription.getHelpExpression());
		eefTextDescription.setLabelExpression(textDescription.getLabelExpression());
		eefTextDescription.setIsEnabledExpression(textDescription.getIsEnabledExpression());

		eefTextDescription.setValueExpression(textDescription.getValueExpression());
		eefTextDescription.setNumberOfLine(textDescription.getNumberOfLines());

		InitialOperation initialOperation = textDescription.getInitialOperation();
		eefTextDescription.setEditExpression(this.getExpressionForOperation(initialOperation));

		cache.put(description, eefTextDescription);

		return eefTextDescription;
	}

}