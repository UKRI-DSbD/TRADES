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

import dsm.TRADES.Component;
import dsm.TRADES.TRADESFactory;
import dsm.TRADES.TRADESPackage;

/**
 * This is the item provider adapter for a {@link dsm.TRADES.Component} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentItemProvider extends ComponentOwnerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentItemProvider(AdapterFactory adapterFactory) {
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
			addCategoryPropertyDescriptor(object);
			addThreatAllocationsPropertyDescriptor(object);
			addComponentTypesPropertyDescriptor(object);
			addRulesPropertyDescriptor(object);
			addAssignedControlsPropertyDescriptor(object);
			addVulnerablePropertyDescriptor(object);
			addCVAPropertyDescriptor(object);
			addCWAPropertyDescriptor(object);
			addInternalExternalAssignedControlsPropertyDescriptor(object);
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
	 * This adds a property descriptor for the Category feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCategoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_DomainAsset_category_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_DomainAsset_category_feature",
								"_UI_DomainAsset_type"),
						TRADESPackage.Literals.DOMAIN_ASSET__CATEGORY, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Threat Allocations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThreatAllocationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Component_threatAllocations_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_threatAllocations_feature",
								"_UI_Component_type"),
						TRADESPackage.Literals.COMPONENT__THREAT_ALLOCATIONS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Component Types feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComponentTypesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Component_componentTypes_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_componentTypes_feature",
								"_UI_Component_type"),
						TRADESPackage.Literals.COMPONENT__COMPONENT_TYPES, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Rules feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRulesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Component_rules_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_rules_feature",
								"_UI_Component_type"),
						TRADESPackage.Literals.COMPONENT__RULES, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Assigned Controls feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssignedControlsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Component_assignedControls_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_assignedControls_feature",
								"_UI_Component_type"),
						TRADESPackage.Literals.COMPONENT__ASSIGNED_CONTROLS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Vulnerable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVulnerablePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Component_vulnerable_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_vulnerable_feature",
								"_UI_Component_type"),
						TRADESPackage.Literals.COMPONENT__VULNERABLE, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the CVA feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCVAPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Component_cVA_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_cVA_feature",
								"_UI_Component_type"),
						TRADESPackage.Literals.COMPONENT__CVA, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CWA feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCWAPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Component_cWA_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_cWA_feature",
								"_UI_Component_type"),
						TRADESPackage.Literals.COMPONENT__CWA, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Internal External Assigned Controls feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInternalExternalAssignedControlsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Component_internalExternalAssignedControls_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_Component_internalExternalAssignedControls_feature", "_UI_Component_type"),
						TRADESPackage.Literals.COMPONENT__INTERNAL_EXTERNAL_ASSIGNED_CONTROLS, true, false, true, null,
						null, null));
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
			childrenFeatures.add(TRADESPackage.Literals.COMPONENT__THREAT_ALLOCATIONS);
			childrenFeatures.add(TRADESPackage.Literals.COMPONENT__AFFECT_RELATIONS);
			childrenFeatures.add(TRADESPackage.Literals.COMPONENT__LINKS);
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
	 * This returns Component.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Component"));
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
		String label = ((Component) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Component_type")
				: getString("_UI_Component_type") + " " + label;
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

		switch (notification.getFeatureID(Component.class)) {
		case TRADESPackage.COMPONENT__NAME:
		case TRADESPackage.COMPONENT__CATEGORY:
		case TRADESPackage.COMPONENT__VULNERABLE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case TRADESPackage.COMPONENT__DATA_OWNER:
		case TRADESPackage.COMPONENT__CONTROL_OWNER:
		case TRADESPackage.COMPONENT__THREAT_ALLOCATIONS:
		case TRADESPackage.COMPONENT__AFFECT_RELATIONS:
		case TRADESPackage.COMPONENT__LINKS:
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

		newChildDescriptors.add(createChildParameter(TRADESPackage.Literals.COMPONENT__THREAT_ALLOCATIONS,
				TRADESFactory.eINSTANCE.createThreatAllocationRelation()));

		newChildDescriptors.add(createChildParameter(TRADESPackage.Literals.COMPONENT__AFFECT_RELATIONS,
				TRADESFactory.eINSTANCE.createAffectRelation()));

		newChildDescriptors.add(
				createChildParameter(TRADESPackage.Literals.COMPONENT__LINKS, TRADESFactory.eINSTANCE.createLink()));
	}

}
