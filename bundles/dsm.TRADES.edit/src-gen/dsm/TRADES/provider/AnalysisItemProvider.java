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
package dsm.TRADES.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import dsm.TRADES.Analysis;
import dsm.TRADES.TRADESFactory;
import dsm.TRADES.TRADESPackage;

/**
 * This is the item provider adapter for a {@link dsm.TRADES.Analysis} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AnalysisItemProvider extends AbstractComponentOwnerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addNVDAPIKeyPropertyDescriptor(object);
			addProperty_VulnerabilityMitigationRulesAvailablePropertyDescriptor(object);
			addProperty_WeaknessMitigationRulesAvailablePropertyDescriptor(object);
			addProperty_DesignAddressesVulnerabilitiesPropertyDescriptor(object);
			addProperty_DesignAddressesWeaknessesPropertyDescriptor(object);
			addVulnerabilitiesUncoveredByRulePropertyDescriptor(object);
			addWeaknessesUncoveredByRulePropertyDescriptor(object);
			addVulnerableComponentsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_NamedElement_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_NamedElement_name_feature",
								"_UI_NamedElement_type"),
						TRADESPackage.Literals.NAMED_ELEMENT__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ElementWithId_id_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ElementWithId_id_feature",
								"_UI_ElementWithId_type"),
						TRADESPackage.Literals.ELEMENT_WITH_ID__ID, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the NVDAPI Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNVDAPIKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Analysis_nVDAPIKey_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Analysis_nVDAPIKey_feature",
								"_UI_Analysis_type"),
						TRADESPackage.Literals.ANALYSIS__NVDAPI_KEY, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Property Vulnerability Mitigation Rules Available feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProperty_VulnerabilityMitigationRulesAvailablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Analysis_property_VulnerabilityMitigationRulesAvailable_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Analysis_property_VulnerabilityMitigationRulesAvailable_feature", "_UI_Analysis_type"),
				TRADESPackage.Literals.ANALYSIS__PROPERTY_VULNERABILITY_MITIGATION_RULES_AVAILABLE, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Property Weakness Mitigation Rules Available feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProperty_WeaknessMitigationRulesAvailablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Analysis_property_WeaknessMitigationRulesAvailable_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Analysis_property_WeaknessMitigationRulesAvailable_feature", "_UI_Analysis_type"),
				TRADESPackage.Literals.ANALYSIS__PROPERTY_WEAKNESS_MITIGATION_RULES_AVAILABLE, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Property Design Addresses Vulnerabilities feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProperty_DesignAddressesVulnerabilitiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Analysis_property_DesignAddressesVulnerabilities_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_Analysis_property_DesignAddressesVulnerabilities_feature", "_UI_Analysis_type"),
						TRADESPackage.Literals.ANALYSIS__PROPERTY_DESIGN_ADDRESSES_VULNERABILITIES, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Property Design Addresses Weaknesses feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProperty_DesignAddressesWeaknessesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Analysis_property_DesignAddressesWeaknesses_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_Analysis_property_DesignAddressesWeaknesses_feature", "_UI_Analysis_type"),
						TRADESPackage.Literals.ANALYSIS__PROPERTY_DESIGN_ADDRESSES_WEAKNESSES, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Vulnerabilities Uncovered By Rule feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVulnerabilitiesUncoveredByRulePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Analysis_vulnerabilitiesUncoveredByRule_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Analysis_vulnerabilitiesUncoveredByRule_feature",
						"_UI_Analysis_type"),
				TRADESPackage.Literals.ANALYSIS__VULNERABILITIES_UNCOVERED_BY_RULE, true, false, true, null, null,
				null));
	}

	/**
	 * This adds a property descriptor for the Weaknesses Uncovered By Rule feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWeaknessesUncoveredByRulePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Analysis_weaknessesUncoveredByRule_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Analysis_weaknessesUncoveredByRule_feature",
						"_UI_Analysis_type"),
				TRADESPackage.Literals.ANALYSIS__WEAKNESSES_UNCOVERED_BY_RULE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Vulnerable Components feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVulnerableComponentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Analysis_vulnerableComponents_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Analysis_vulnerableComponents_feature",
								"_UI_Analysis_type"),
						TRADESPackage.Literals.ANALYSIS__VULNERABLE_COMPONENTS, true, false, true, null, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(TRADESPackage.Literals.DATA_OWNER_ELEMENT__DATA_OWNER);
			childrenFeatures.add(TRADESPackage.Literals.ABSTRACT_CONTROL_OWNER__CONTROL_OWNER);
			childrenFeatures.add(TRADESPackage.Literals.ABSTRACT_THREAT_OWNER__THREAT_OWNER);
			childrenFeatures.add(TRADESPackage.Literals.ABSTRACT_VULNERABILITY_OWNER__VULNERABILITY_OWNER);
			childrenFeatures.add(TRADESPackage.Literals.ABSTRACT_COMPONENT_TYPE_OWNER__COMPONENT_TYPE_OWNER);
			childrenFeatures.add(TRADESPackage.Literals.ABSTRACT_RULE_OWNER__RULE_OWNER);
			childrenFeatures.add(TRADESPackage.Literals.ANALYSIS__SCORE_SYSTEM);
			childrenFeatures.add(TRADESPackage.Literals.ANALYSIS__LINK_TYPES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Analysis.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Analysis"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Analysis) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Analysis_type")
				: getString("_UI_Analysis_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Analysis.class)) {
		case TRADESPackage.ANALYSIS__NAME:
		case TRADESPackage.ANALYSIS__ID:
		case TRADESPackage.ANALYSIS__NVDAPI_KEY:
		case TRADESPackage.ANALYSIS__PROPERTY_VULNERABILITY_MITIGATION_RULES_AVAILABLE:
		case TRADESPackage.ANALYSIS__PROPERTY_WEAKNESS_MITIGATION_RULES_AVAILABLE:
		case TRADESPackage.ANALYSIS__PROPERTY_DESIGN_ADDRESSES_VULNERABILITIES:
		case TRADESPackage.ANALYSIS__PROPERTY_DESIGN_ADDRESSES_WEAKNESSES:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case TRADESPackage.ANALYSIS__DATA_OWNER:
		case TRADESPackage.ANALYSIS__CONTROL_OWNER:
		case TRADESPackage.ANALYSIS__THREAT_OWNER:
		case TRADESPackage.ANALYSIS__VULNERABILITY_OWNER:
		case TRADESPackage.ANALYSIS__COMPONENT_TYPE_OWNER:
		case TRADESPackage.ANALYSIS__RULE_OWNER:
		case TRADESPackage.ANALYSIS__SCORE_SYSTEM:
		case TRADESPackage.ANALYSIS__LINK_TYPES:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(TRADESPackage.Literals.DATA_OWNER_ELEMENT__DATA_OWNER,
				TRADESFactory.eINSTANCE.createDataOwner()));

		newChildDescriptors.add(createChildParameter(TRADESPackage.Literals.ABSTRACT_CONTROL_OWNER__CONTROL_OWNER,
				TRADESFactory.eINSTANCE.createControlOwner()));

		newChildDescriptors.add(createChildParameter(TRADESPackage.Literals.ABSTRACT_THREAT_OWNER__THREAT_OWNER,
				TRADESFactory.eINSTANCE.createThreatsOwner()));

		newChildDescriptors
				.add(createChildParameter(TRADESPackage.Literals.ABSTRACT_VULNERABILITY_OWNER__VULNERABILITY_OWNER,
						TRADESFactory.eINSTANCE.createVulnerabilityOwner()));

		newChildDescriptors
				.add(createChildParameter(TRADESPackage.Literals.ABSTRACT_COMPONENT_TYPE_OWNER__COMPONENT_TYPE_OWNER,
						TRADESFactory.eINSTANCE.createComponentTypeOwner()));

		newChildDescriptors.add(createChildParameter(TRADESPackage.Literals.ABSTRACT_RULE_OWNER__RULE_OWNER,
				TRADESFactory.eINSTANCE.createRuleOwner()));

		newChildDescriptors.add(createChildParameter(TRADESPackage.Literals.ANALYSIS__SCORE_SYSTEM,
				TRADESFactory.eINSTANCE.createScoreSystem()));

		newChildDescriptors.add(createChildParameter(TRADESPackage.Literals.ANALYSIS__LINK_TYPES,
				TRADESFactory.eINSTANCE.createLinkType()));
	}

}
