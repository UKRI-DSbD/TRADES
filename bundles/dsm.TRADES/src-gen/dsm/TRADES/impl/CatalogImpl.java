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

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import dsm.TRADES.AbstractComponentOwner;
import dsm.TRADES.AbstractComponentTypeOwner;
import dsm.TRADES.AbstractControlOwner;
import dsm.TRADES.AbstractRuleOwner;
import dsm.TRADES.AbstractVulnerabilityOwner;
import dsm.TRADES.Catalog;
import dsm.TRADES.Component;
import dsm.TRADES.ComponentType;
import dsm.TRADES.ComponentTypeOwner;
import dsm.TRADES.Control;
import dsm.TRADES.ControlOwner;
import dsm.TRADES.ElementWithId;
import dsm.TRADES.ExternalControl;
import dsm.TRADES.ICatalogDefinition;
import dsm.TRADES.IControlDefinition;
import dsm.TRADES.IThreatDefinition;
import dsm.TRADES.NamedElement;
import dsm.TRADES.Rule;
import dsm.TRADES.RuleOwner;
import dsm.TRADES.TRADESPackage;
import dsm.TRADES.Vulnerability;
import dsm.TRADES.VulnerabilityOwner;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catalog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.impl.CatalogImpl#getControlOwner <em>Control Owner</em>}</li>
 *   <li>{@link dsm.TRADES.impl.CatalogImpl#getName <em>Name</em>}</li>
 *   <li>{@link dsm.TRADES.impl.CatalogImpl#getId <em>Id</em>}</li>
 *   <li>{@link dsm.TRADES.impl.CatalogImpl#getVulnerabilityOwner <em>Vulnerability Owner</em>}</li>
 *   <li>{@link dsm.TRADES.impl.CatalogImpl#getRuleOwner <em>Rule Owner</em>}</li>
 *   <li>{@link dsm.TRADES.impl.CatalogImpl#getComponentTypeOwner <em>Component Type Owner</em>}</li>
 *   <li>{@link dsm.TRADES.impl.CatalogImpl#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CatalogImpl extends AbstractThreatOwnerImpl implements Catalog {
	/**
	 * The cached value of the '{@link #getControlOwner() <em>Control Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlOwner()
	 * @generated
	 * @ordered
	 */
	protected ControlOwner controlOwner;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVulnerabilityOwner() <em>Vulnerability Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVulnerabilityOwner()
	 * @generated
	 * @ordered
	 */
	protected VulnerabilityOwner vulnerabilityOwner;

	/**
	 * The cached value of the '{@link #getRuleOwner() <em>Rule Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleOwner()
	 * @generated
	 * @ordered
	 */
	protected RuleOwner ruleOwner;

	/**
	 * The cached value of the '{@link #getComponentTypeOwner() <em>Component Type Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentTypeOwner()
	 * @generated
	 * @ordered
	 */
	protected ComponentTypeOwner componentTypeOwner;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> components;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatalogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TRADESPackage.Literals.CATALOG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlOwner getControlOwner() {
		return controlOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlOwner(ControlOwner newControlOwner, NotificationChain msgs) {
		ControlOwner oldControlOwner = controlOwner;
		controlOwner = newControlOwner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TRADESPackage.CATALOG__CONTROL_OWNER, oldControlOwner, newControlOwner);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setControlOwner(ControlOwner newControlOwner) {
		if (newControlOwner != controlOwner) {
			NotificationChain msgs = null;
			if (controlOwner != null)
				msgs = ((InternalEObject) controlOwner).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.CATALOG__CONTROL_OWNER, null, msgs);
			if (newControlOwner != null)
				msgs = ((InternalEObject) newControlOwner).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.CATALOG__CONTROL_OWNER, null, msgs);
			msgs = basicSetControlOwner(newControlOwner, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.CATALOG__CONTROL_OWNER, newControlOwner,
					newControlOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.CATALOG__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.CATALOG__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VulnerabilityOwner getVulnerabilityOwner() {
		return vulnerabilityOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVulnerabilityOwner(VulnerabilityOwner newVulnerabilityOwner,
			NotificationChain msgs) {
		VulnerabilityOwner oldVulnerabilityOwner = vulnerabilityOwner;
		vulnerabilityOwner = newVulnerabilityOwner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TRADESPackage.CATALOG__VULNERABILITY_OWNER, oldVulnerabilityOwner, newVulnerabilityOwner);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVulnerabilityOwner(VulnerabilityOwner newVulnerabilityOwner) {
		if (newVulnerabilityOwner != vulnerabilityOwner) {
			NotificationChain msgs = null;
			if (vulnerabilityOwner != null)
				msgs = ((InternalEObject) vulnerabilityOwner).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.CATALOG__VULNERABILITY_OWNER, null, msgs);
			if (newVulnerabilityOwner != null)
				msgs = ((InternalEObject) newVulnerabilityOwner).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.CATALOG__VULNERABILITY_OWNER, null, msgs);
			msgs = basicSetVulnerabilityOwner(newVulnerabilityOwner, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.CATALOG__VULNERABILITY_OWNER,
					newVulnerabilityOwner, newVulnerabilityOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RuleOwner getRuleOwner() {
		return ruleOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRuleOwner(RuleOwner newRuleOwner, NotificationChain msgs) {
		RuleOwner oldRuleOwner = ruleOwner;
		ruleOwner = newRuleOwner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TRADESPackage.CATALOG__RULE_OWNER, oldRuleOwner, newRuleOwner);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRuleOwner(RuleOwner newRuleOwner) {
		if (newRuleOwner != ruleOwner) {
			NotificationChain msgs = null;
			if (ruleOwner != null)
				msgs = ((InternalEObject) ruleOwner).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.CATALOG__RULE_OWNER, null, msgs);
			if (newRuleOwner != null)
				msgs = ((InternalEObject) newRuleOwner).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.CATALOG__RULE_OWNER, null, msgs);
			msgs = basicSetRuleOwner(newRuleOwner, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.CATALOG__RULE_OWNER, newRuleOwner,
					newRuleOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentTypeOwner getComponentTypeOwner() {
		return componentTypeOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentTypeOwner(ComponentTypeOwner newComponentTypeOwner,
			NotificationChain msgs) {
		ComponentTypeOwner oldComponentTypeOwner = componentTypeOwner;
		componentTypeOwner = newComponentTypeOwner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TRADESPackage.CATALOG__COMPONENT_TYPE_OWNER, oldComponentTypeOwner, newComponentTypeOwner);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponentTypeOwner(ComponentTypeOwner newComponentTypeOwner) {
		if (newComponentTypeOwner != componentTypeOwner) {
			NotificationChain msgs = null;
			if (componentTypeOwner != null)
				msgs = ((InternalEObject) componentTypeOwner).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.CATALOG__COMPONENT_TYPE_OWNER, null, msgs);
			if (newComponentTypeOwner != null)
				msgs = ((InternalEObject) newComponentTypeOwner).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.CATALOG__COMPONENT_TYPE_OWNER, null, msgs);
			msgs = basicSetComponentTypeOwner(newComponentTypeOwner, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.CATALOG__COMPONENT_TYPE_OWNER,
					newComponentTypeOwner, newComponentTypeOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Component> getComponents() {
		if (components == null) {
			components = new EObjectResolvingEList<Component>(Component.class, this, TRADESPackage.CATALOG__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IThreatDefinition getThreatById(String id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IControlDefinition getControlById(String id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IThreatDefinition> getThreatDefinitions() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IControlDefinition> getControlDefinitions() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdentifier() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rule getRuleById(String id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vulnerability getVulnerabilityById(String id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentType getComponentTypeById(String id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Control> getAllControls() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExternalControl> getExternalControls(String id, String catalogIdentifier) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TRADESPackage.CATALOG__CONTROL_OWNER:
			return basicSetControlOwner(null, msgs);
		case TRADESPackage.CATALOG__VULNERABILITY_OWNER:
			return basicSetVulnerabilityOwner(null, msgs);
		case TRADESPackage.CATALOG__RULE_OWNER:
			return basicSetRuleOwner(null, msgs);
		case TRADESPackage.CATALOG__COMPONENT_TYPE_OWNER:
			return basicSetComponentTypeOwner(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TRADESPackage.CATALOG__CONTROL_OWNER:
			return getControlOwner();
		case TRADESPackage.CATALOG__NAME:
			return getName();
		case TRADESPackage.CATALOG__ID:
			return getId();
		case TRADESPackage.CATALOG__VULNERABILITY_OWNER:
			return getVulnerabilityOwner();
		case TRADESPackage.CATALOG__RULE_OWNER:
			return getRuleOwner();
		case TRADESPackage.CATALOG__COMPONENT_TYPE_OWNER:
			return getComponentTypeOwner();
		case TRADESPackage.CATALOG__COMPONENTS:
			return getComponents();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TRADESPackage.CATALOG__CONTROL_OWNER:
			setControlOwner((ControlOwner) newValue);
			return;
		case TRADESPackage.CATALOG__NAME:
			setName((String) newValue);
			return;
		case TRADESPackage.CATALOG__ID:
			setId((String) newValue);
			return;
		case TRADESPackage.CATALOG__VULNERABILITY_OWNER:
			setVulnerabilityOwner((VulnerabilityOwner) newValue);
			return;
		case TRADESPackage.CATALOG__RULE_OWNER:
			setRuleOwner((RuleOwner) newValue);
			return;
		case TRADESPackage.CATALOG__COMPONENT_TYPE_OWNER:
			setComponentTypeOwner((ComponentTypeOwner) newValue);
			return;
		case TRADESPackage.CATALOG__COMPONENTS:
			getComponents().clear();
			getComponents().addAll((Collection<? extends Component>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case TRADESPackage.CATALOG__CONTROL_OWNER:
			setControlOwner((ControlOwner) null);
			return;
		case TRADESPackage.CATALOG__NAME:
			setName(NAME_EDEFAULT);
			return;
		case TRADESPackage.CATALOG__ID:
			setId(ID_EDEFAULT);
			return;
		case TRADESPackage.CATALOG__VULNERABILITY_OWNER:
			setVulnerabilityOwner((VulnerabilityOwner) null);
			return;
		case TRADESPackage.CATALOG__RULE_OWNER:
			setRuleOwner((RuleOwner) null);
			return;
		case TRADESPackage.CATALOG__COMPONENT_TYPE_OWNER:
			setComponentTypeOwner((ComponentTypeOwner) null);
			return;
		case TRADESPackage.CATALOG__COMPONENTS:
			getComponents().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TRADESPackage.CATALOG__CONTROL_OWNER:
			return controlOwner != null;
		case TRADESPackage.CATALOG__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case TRADESPackage.CATALOG__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case TRADESPackage.CATALOG__VULNERABILITY_OWNER:
			return vulnerabilityOwner != null;
		case TRADESPackage.CATALOG__RULE_OWNER:
			return ruleOwner != null;
		case TRADESPackage.CATALOG__COMPONENT_TYPE_OWNER:
			return componentTypeOwner != null;
		case TRADESPackage.CATALOG__COMPONENTS:
			return components != null && !components.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractControlOwner.class) {
			switch (derivedFeatureID) {
			case TRADESPackage.CATALOG__CONTROL_OWNER:
				return TRADESPackage.ABSTRACT_CONTROL_OWNER__CONTROL_OWNER;
			default:
				return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
			case TRADESPackage.CATALOG__NAME:
				return TRADESPackage.NAMED_ELEMENT__NAME;
			default:
				return -1;
			}
		}
		if (baseClass == ICatalogDefinition.class) {
			switch (derivedFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == ElementWithId.class) {
			switch (derivedFeatureID) {
			case TRADESPackage.CATALOG__ID:
				return TRADESPackage.ELEMENT_WITH_ID__ID;
			default:
				return -1;
			}
		}
		if (baseClass == AbstractVulnerabilityOwner.class) {
			switch (derivedFeatureID) {
			case TRADESPackage.CATALOG__VULNERABILITY_OWNER:
				return TRADESPackage.ABSTRACT_VULNERABILITY_OWNER__VULNERABILITY_OWNER;
			default:
				return -1;
			}
		}
		if (baseClass == AbstractRuleOwner.class) {
			switch (derivedFeatureID) {
			case TRADESPackage.CATALOG__RULE_OWNER:
				return TRADESPackage.ABSTRACT_RULE_OWNER__RULE_OWNER;
			default:
				return -1;
			}
		}
		if (baseClass == AbstractComponentTypeOwner.class) {
			switch (derivedFeatureID) {
			case TRADESPackage.CATALOG__COMPONENT_TYPE_OWNER:
				return TRADESPackage.ABSTRACT_COMPONENT_TYPE_OWNER__COMPONENT_TYPE_OWNER;
			default:
				return -1;
			}
		}
		if (baseClass == AbstractComponentOwner.class) {
			switch (derivedFeatureID) {
			case TRADESPackage.CATALOG__COMPONENTS:
				return TRADESPackage.ABSTRACT_COMPONENT_OWNER__COMPONENTS;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractControlOwner.class) {
			switch (baseFeatureID) {
			case TRADESPackage.ABSTRACT_CONTROL_OWNER__CONTROL_OWNER:
				return TRADESPackage.CATALOG__CONTROL_OWNER;
			default:
				return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
			case TRADESPackage.NAMED_ELEMENT__NAME:
				return TRADESPackage.CATALOG__NAME;
			default:
				return -1;
			}
		}
		if (baseClass == ICatalogDefinition.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == ElementWithId.class) {
			switch (baseFeatureID) {
			case TRADESPackage.ELEMENT_WITH_ID__ID:
				return TRADESPackage.CATALOG__ID;
			default:
				return -1;
			}
		}
		if (baseClass == AbstractVulnerabilityOwner.class) {
			switch (baseFeatureID) {
			case TRADESPackage.ABSTRACT_VULNERABILITY_OWNER__VULNERABILITY_OWNER:
				return TRADESPackage.CATALOG__VULNERABILITY_OWNER;
			default:
				return -1;
			}
		}
		if (baseClass == AbstractRuleOwner.class) {
			switch (baseFeatureID) {
			case TRADESPackage.ABSTRACT_RULE_OWNER__RULE_OWNER:
				return TRADESPackage.CATALOG__RULE_OWNER;
			default:
				return -1;
			}
		}
		if (baseClass == AbstractComponentTypeOwner.class) {
			switch (baseFeatureID) {
			case TRADESPackage.ABSTRACT_COMPONENT_TYPE_OWNER__COMPONENT_TYPE_OWNER:
				return TRADESPackage.CATALOG__COMPONENT_TYPE_OWNER;
			default:
				return -1;
			}
		}
		if (baseClass == AbstractComponentOwner.class) {
			switch (baseFeatureID) {
			case TRADESPackage.ABSTRACT_COMPONENT_OWNER__COMPONENTS:
				return TRADESPackage.CATALOG__COMPONENTS;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == AbstractControlOwner.class) {
			switch (baseOperationID) {
			case TRADESPackage.ABSTRACT_CONTROL_OWNER___GET_ALL_CONTROLS:
				return TRADESPackage.CATALOG___GET_ALL_CONTROLS;
			case TRADESPackage.ABSTRACT_CONTROL_OWNER___GET_EXTERNAL_CONTROLS__STRING_STRING:
				return TRADESPackage.CATALOG___GET_EXTERNAL_CONTROLS__STRING_STRING;
			default:
				return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseOperationID) {
			default:
				return -1;
			}
		}
		if (baseClass == ICatalogDefinition.class) {
			switch (baseOperationID) {
			case TRADESPackage.ICATALOG_DEFINITION___GET_THREAT_BY_ID__STRING:
				return TRADESPackage.CATALOG___GET_THREAT_BY_ID__STRING;
			case TRADESPackage.ICATALOG_DEFINITION___GET_CONTROL_BY_ID__STRING:
				return TRADESPackage.CATALOG___GET_CONTROL_BY_ID__STRING;
			case TRADESPackage.ICATALOG_DEFINITION___GET_THREAT_DEFINITIONS:
				return TRADESPackage.CATALOG___GET_THREAT_DEFINITIONS;
			case TRADESPackage.ICATALOG_DEFINITION___GET_CONTROL_DEFINITIONS:
				return TRADESPackage.CATALOG___GET_CONTROL_DEFINITIONS;
			case TRADESPackage.ICATALOG_DEFINITION___GET_IDENTIFIER:
				return TRADESPackage.CATALOG___GET_IDENTIFIER;
			case TRADESPackage.ICATALOG_DEFINITION___GET_NAME:
				return TRADESPackage.CATALOG___GET_NAME;
			case TRADESPackage.ICATALOG_DEFINITION___GET_RULE_BY_ID__STRING:
				return TRADESPackage.CATALOG___GET_RULE_BY_ID__STRING;
			case TRADESPackage.ICATALOG_DEFINITION___GET_VULNERABILITY_BY_ID__STRING:
				return TRADESPackage.CATALOG___GET_VULNERABILITY_BY_ID__STRING;
			case TRADESPackage.ICATALOG_DEFINITION___GET_COMPONENT_TYPE_BY_ID__STRING:
				return TRADESPackage.CATALOG___GET_COMPONENT_TYPE_BY_ID__STRING;
			default:
				return -1;
			}
		}
		if (baseClass == ElementWithId.class) {
			switch (baseOperationID) {
			default:
				return -1;
			}
		}
		if (baseClass == AbstractVulnerabilityOwner.class) {
			switch (baseOperationID) {
			default:
				return -1;
			}
		}
		if (baseClass == AbstractRuleOwner.class) {
			switch (baseOperationID) {
			default:
				return -1;
			}
		}
		if (baseClass == AbstractComponentTypeOwner.class) {
			switch (baseOperationID) {
			default:
				return -1;
			}
		}
		if (baseClass == AbstractComponentOwner.class) {
			switch (baseOperationID) {
			default:
				return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case TRADESPackage.CATALOG___GET_THREAT_BY_ID__STRING:
			return getThreatById((String) arguments.get(0));
		case TRADESPackage.CATALOG___GET_CONTROL_BY_ID__STRING:
			return getControlById((String) arguments.get(0));
		case TRADESPackage.CATALOG___GET_THREAT_DEFINITIONS:
			return getThreatDefinitions();
		case TRADESPackage.CATALOG___GET_CONTROL_DEFINITIONS:
			return getControlDefinitions();
		case TRADESPackage.CATALOG___GET_IDENTIFIER:
			return getIdentifier();
		case TRADESPackage.CATALOG___GET_RULE_BY_ID__STRING:
			return getRuleById((String) arguments.get(0));
		case TRADESPackage.CATALOG___GET_VULNERABILITY_BY_ID__STRING:
			return getVulnerabilityById((String) arguments.get(0));
		case TRADESPackage.CATALOG___GET_COMPONENT_TYPE_BY_ID__STRING:
			return getComponentTypeById((String) arguments.get(0));
		case TRADESPackage.CATALOG___GET_ALL_CONTROLS:
			return getAllControls();
		case TRADESPackage.CATALOG___GET_EXTERNAL_CONTROLS__STRING_STRING:
			return getExternalControls((String) arguments.get(0), (String) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //CatalogImpl
