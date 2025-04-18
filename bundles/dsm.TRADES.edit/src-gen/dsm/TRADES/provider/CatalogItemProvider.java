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

import dsm.TRADES.Catalog;
import dsm.TRADES.TRADESFactory;
import dsm.TRADES.TRADESPackage;

/**
 * This is the item provider adapter for a {@link dsm.TRADES.Catalog} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CatalogItemProvider extends AbstractThreatOwnerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(TRADESPackage.Literals.ABSTRACT_CONTROL_OWNER__CONTROL_OWNER);
			childrenFeatures.add(TRADESPackage.Literals.ABSTRACT_VULNERABILITY_OWNER__VULNERABILITY_OWNER);
			childrenFeatures.add(TRADESPackage.Literals.ABSTRACT_RULE_OWNER__RULE_OWNER);
			childrenFeatures.add(TRADESPackage.Literals.ABSTRACT_COMPONENT_TYPE_OWNER__COMPONENT_TYPE_OWNER);
			childrenFeatures.add(TRADESPackage.Literals.ABSTRACT_COMPONENT_OWNER__COMPONENTS);
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
	 * This returns Catalog.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Catalog"));
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
		String label = ((Catalog) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Catalog_type")
				: getString("_UI_Catalog_type") + " " + label;
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

		switch (notification.getFeatureID(Catalog.class)) {
		case TRADESPackage.CATALOG__NAME:
		case TRADESPackage.CATALOG__ID:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case TRADESPackage.CATALOG__CONTROL_OWNER:
		case TRADESPackage.CATALOG__VULNERABILITY_OWNER:
		case TRADESPackage.CATALOG__RULE_OWNER:
		case TRADESPackage.CATALOG__COMPONENT_TYPE_OWNER:
		case TRADESPackage.CATALOG__COMPONENTS:
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

		newChildDescriptors.add(createChildParameter(TRADESPackage.Literals.ABSTRACT_CONTROL_OWNER__CONTROL_OWNER,
				TRADESFactory.eINSTANCE.createControlOwner()));

		newChildDescriptors
				.add(createChildParameter(TRADESPackage.Literals.ABSTRACT_VULNERABILITY_OWNER__VULNERABILITY_OWNER,
						TRADESFactory.eINSTANCE.createVulnerabilityOwner()));

		newChildDescriptors.add(createChildParameter(TRADESPackage.Literals.ABSTRACT_RULE_OWNER__RULE_OWNER,
				TRADESFactory.eINSTANCE.createRuleOwner()));

		newChildDescriptors
				.add(createChildParameter(TRADESPackage.Literals.ABSTRACT_COMPONENT_TYPE_OWNER__COMPONENT_TYPE_OWNER,
						TRADESFactory.eINSTANCE.createComponentTypeOwner()));

		newChildDescriptors.add(createChildParameter(TRADESPackage.Literals.ABSTRACT_COMPONENT_OWNER__COMPONENTS,
				TRADESFactory.eINSTANCE.createComponent()));
	}

}
