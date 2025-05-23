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
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import dsm.TRADES.AbstractControlOwner;
import dsm.TRADES.AffectRelation;
import dsm.TRADES.Asset;
import dsm.TRADES.Characteristic;
import dsm.TRADES.CharacteristicOwner;
import dsm.TRADES.Component;
import dsm.TRADES.ComponentCategoryENUM;
import dsm.TRADES.ComponentType;
import dsm.TRADES.Control;
import dsm.TRADES.ControlOwner;
import dsm.TRADES.Data;
import dsm.TRADES.DataOwner;
import dsm.TRADES.DataOwnerElement;
import dsm.TRADES.DomainAsset;
import dsm.TRADES.ExternalControl;
import dsm.TRADES.Link;
import dsm.TRADES.NamedElement;
import dsm.TRADES.Rule;
import dsm.TRADES.TRADESPackage;
import dsm.TRADES.ThreatAllocationRelation;
import dsm.TRADES.Vulnerability;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.impl.ComponentImpl#getDataOwner <em>Data Owner</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ComponentImpl#getControlOwner <em>Control Owner</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ComponentImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ComponentImpl#getCharacteristics <em>Characteristics</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ComponentImpl#getThreatAllocations <em>Threat Allocations</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ComponentImpl#getAffectRelations <em>Affect Relations</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ComponentImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ComponentImpl#getComponentTypes <em>Component Types</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ComponentImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ComponentImpl#getAssignedControls <em>Assigned Controls</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ComponentImpl#isVulnerable <em>Vulnerable</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ComponentImpl#getCVA <em>CVA</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ComponentImpl#getCWA <em>CWA</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ComponentImpl#getAssociatedControls <em>Associated Controls</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ComponentImpl#getUnmitigatedVulnerabilities <em>Unmitigated Vulnerabilities</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ComponentImpl#getUnmitigatedWeaknesses <em>Unmitigated Weaknesses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends AbstractComponentOwnerImpl implements Component {
	/**
	 * The cached value of the '{@link #getDataOwner() <em>Data Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataOwner()
	 * @generated
	 * @ordered
	 */
	protected DataOwner dataOwner;

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
	 * The cached value of the '{@link #getControlOwner() <em>Control Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlOwner()
	 * @generated
	 * @ordered
	 */
	protected ControlOwner controlOwner;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentCategoryENUM> category;

	/**
	 * The cached value of the '{@link #getCharacteristics() <em>Characteristics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected EList<Characteristic> characteristics;

	/**
	 * The cached value of the '{@link #getThreatAllocations() <em>Threat Allocations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreatAllocations()
	 * @generated
	 * @ordered
	 */
	protected EList<ThreatAllocationRelation> threatAllocations;

	/**
	 * The cached value of the '{@link #getAffectRelations() <em>Affect Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffectRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<AffectRelation> affectRelations;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> links;

	/**
	 * The cached value of the '{@link #getComponentTypes() <em>Component Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentType> componentTypes;

	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> rules;

	/**
	 * The cached value of the '{@link #getAssignedControls() <em>Assigned Controls</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedControls()
	 * @generated
	 * @ordered
	 */
	protected EList<Control> assignedControls;

	/**
	 * The default value of the '{@link #isVulnerable() <em>Vulnerable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVulnerable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VULNERABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #getCVA() <em>CVA</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCVA()
	 * @generated
	 * @ordered
	 */
	protected EList<Vulnerability> cVA;

	/**
	 * The cached value of the '{@link #getCWA() <em>CWA</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCWA()
	 * @generated
	 * @ordered
	 */
	protected EList<Vulnerability> cWA;

	/**
	 * The cached value of the '{@link #getAssociatedControls() <em>Associated Controls</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedControls()
	 * @generated
	 * @ordered
	 */
	protected EList<Control> associatedControls;

	/**
	 * The cached value of the '{@link #getUnmitigatedVulnerabilities() <em>Unmitigated Vulnerabilities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnmitigatedVulnerabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Vulnerability> unmitigatedVulnerabilities;

	/**
	 * The cached value of the '{@link #getUnmitigatedWeaknesses() <em>Unmitigated Weaknesses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnmitigatedWeaknesses()
	 * @generated
	 * @ordered
	 */
	protected EList<Vulnerability> unmitigatedWeaknesses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TRADESPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataOwner getDataOwner() {
		return dataOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataOwner(DataOwner newDataOwner, NotificationChain msgs) {
		DataOwner oldDataOwner = dataOwner;
		dataOwner = newDataOwner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TRADESPackage.COMPONENT__DATA_OWNER, oldDataOwner, newDataOwner);
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
	public void setDataOwner(DataOwner newDataOwner) {
		if (newDataOwner != dataOwner) {
			NotificationChain msgs = null;
			if (dataOwner != null)
				msgs = ((InternalEObject) dataOwner).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.COMPONENT__DATA_OWNER, null, msgs);
			if (newDataOwner != null)
				msgs = ((InternalEObject) newDataOwner).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.COMPONENT__DATA_OWNER, null, msgs);
			msgs = basicSetDataOwner(newDataOwner, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.COMPONENT__DATA_OWNER, newDataOwner,
					newDataOwner));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.COMPONENT__NAME, oldName, name));
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
					TRADESPackage.COMPONENT__CONTROL_OWNER, oldControlOwner, newControlOwner);
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
						EOPPOSITE_FEATURE_BASE - TRADESPackage.COMPONENT__CONTROL_OWNER, null, msgs);
			if (newControlOwner != null)
				msgs = ((InternalEObject) newControlOwner).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.COMPONENT__CONTROL_OWNER, null, msgs);
			msgs = basicSetControlOwner(newControlOwner, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.COMPONENT__CONTROL_OWNER,
					newControlOwner, newControlOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentCategoryENUM> getCategory() {
		if (category == null) {
			category = new EDataTypeUniqueEList<ComponentCategoryENUM>(ComponentCategoryENUM.class, this,
					TRADESPackage.COMPONENT__CATEGORY);
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Characteristic> getCharacteristics() {
		if (characteristics == null) {
			characteristics = new EObjectContainmentEList<Characteristic>(Characteristic.class, this,
					TRADESPackage.COMPONENT__CHARACTERISTICS);
		}
		return characteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ThreatAllocationRelation> getThreatAllocations() {
		if (threatAllocations == null) {
			threatAllocations = new EObjectContainmentWithInverseEList<ThreatAllocationRelation>(
					ThreatAllocationRelation.class, this, TRADESPackage.COMPONENT__THREAT_ALLOCATIONS,
					TRADESPackage.THREAT_ALLOCATION_RELATION__COMPONENT);
		}
		return threatAllocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AffectRelation> getAffectRelations() {
		if (affectRelations == null) {
			affectRelations = new EObjectContainmentWithInverseEList<AffectRelation>(AffectRelation.class, this,
					TRADESPackage.COMPONENT__AFFECT_RELATIONS, TRADESPackage.AFFECT_RELATION__SOURCE_COMPONENT);
		}
		return affectRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Link>(Link.class, this, TRADESPackage.COMPONENT__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentType> getComponentTypes() {
		if (componentTypes == null) {
			componentTypes = new EObjectResolvingEList<ComponentType>(ComponentType.class, this,
					TRADESPackage.COMPONENT__COMPONENT_TYPES);
		}
		return componentTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Rule> getRules() {
		if (rules == null) {
			rules = new EObjectResolvingEList<Rule>(Rule.class, this, TRADESPackage.COMPONENT__RULES);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Control> getAssignedControls() {
		if (assignedControls == null) {
			assignedControls = new EObjectResolvingEList<Control>(Control.class, this,
					TRADESPackage.COMPONENT__ASSIGNED_CONTROLS);
		}
		return assignedControls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isVulnerable() {
		// TODO: implement this method to return the 'Vulnerable' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVulnerable(boolean newVulnerable) {
		// TODO: implement this method to set the 'Vulnerable' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Vulnerability> getCVA() {
		if (cVA == null) {
			cVA = new EObjectResolvingEList<Vulnerability>(Vulnerability.class, this, TRADESPackage.COMPONENT__CVA);
		}
		return cVA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Vulnerability> getCWA() {
		if (cWA == null) {
			cWA = new EObjectResolvingEList<Vulnerability>(Vulnerability.class, this, TRADESPackage.COMPONENT__CWA);
		}
		return cWA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Control> getAssociatedControls() {
		if (associatedControls == null) {
			associatedControls = new EObjectResolvingEList<Control>(Control.class, this,
					TRADESPackage.COMPONENT__ASSOCIATED_CONTROLS);
		}
		return associatedControls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Vulnerability> getUnmitigatedVulnerabilities() {
		if (unmitigatedVulnerabilities == null) {
			unmitigatedVulnerabilities = new EObjectResolvingEList<Vulnerability>(Vulnerability.class, this,
					TRADESPackage.COMPONENT__UNMITIGATED_VULNERABILITIES);
		}
		return unmitigatedVulnerabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Vulnerability> getUnmitigatedWeaknesses() {
		if (unmitigatedWeaknesses == null) {
			unmitigatedWeaknesses = new EObjectResolvingEList<Vulnerability>(Vulnerability.class, this,
					TRADESPackage.COMPONENT__UNMITIGATED_WEAKNESSES);
		}
		return unmitigatedWeaknesses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean ofType(ComponentType type) {
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
	public boolean mitigatedV(Vulnerability vulnerability) {
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
	public boolean mitigatedW(Vulnerability weakness) {
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
	public boolean mitigatedByW(Vulnerability vulnerability) {
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
	public boolean mitigated(Vulnerability vulnerability) {
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
	public boolean vulnerableW() {
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
	public boolean vulnerableV() {
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
	public EList<Data> getDatas() {
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
	public EList<Data> getInheritedDatas() {
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
	public EList<Data> getAllDatas() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TRADESPackage.COMPONENT__THREAT_ALLOCATIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getThreatAllocations()).basicAdd(otherEnd,
					msgs);
		case TRADESPackage.COMPONENT__AFFECT_RELATIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAffectRelations()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TRADESPackage.COMPONENT__DATA_OWNER:
			return basicSetDataOwner(null, msgs);
		case TRADESPackage.COMPONENT__CONTROL_OWNER:
			return basicSetControlOwner(null, msgs);
		case TRADESPackage.COMPONENT__CHARACTERISTICS:
			return ((InternalEList<?>) getCharacteristics()).basicRemove(otherEnd, msgs);
		case TRADESPackage.COMPONENT__THREAT_ALLOCATIONS:
			return ((InternalEList<?>) getThreatAllocations()).basicRemove(otherEnd, msgs);
		case TRADESPackage.COMPONENT__AFFECT_RELATIONS:
			return ((InternalEList<?>) getAffectRelations()).basicRemove(otherEnd, msgs);
		case TRADESPackage.COMPONENT__LINKS:
			return ((InternalEList<?>) getLinks()).basicRemove(otherEnd, msgs);
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
		case TRADESPackage.COMPONENT__DATA_OWNER:
			return getDataOwner();
		case TRADESPackage.COMPONENT__NAME:
			return getName();
		case TRADESPackage.COMPONENT__CONTROL_OWNER:
			return getControlOwner();
		case TRADESPackage.COMPONENT__CATEGORY:
			return getCategory();
		case TRADESPackage.COMPONENT__CHARACTERISTICS:
			return getCharacteristics();
		case TRADESPackage.COMPONENT__THREAT_ALLOCATIONS:
			return getThreatAllocations();
		case TRADESPackage.COMPONENT__AFFECT_RELATIONS:
			return getAffectRelations();
		case TRADESPackage.COMPONENT__LINKS:
			return getLinks();
		case TRADESPackage.COMPONENT__COMPONENT_TYPES:
			return getComponentTypes();
		case TRADESPackage.COMPONENT__RULES:
			return getRules();
		case TRADESPackage.COMPONENT__ASSIGNED_CONTROLS:
			return getAssignedControls();
		case TRADESPackage.COMPONENT__VULNERABLE:
			return isVulnerable();
		case TRADESPackage.COMPONENT__CVA:
			return getCVA();
		case TRADESPackage.COMPONENT__CWA:
			return getCWA();
		case TRADESPackage.COMPONENT__ASSOCIATED_CONTROLS:
			return getAssociatedControls();
		case TRADESPackage.COMPONENT__UNMITIGATED_VULNERABILITIES:
			return getUnmitigatedVulnerabilities();
		case TRADESPackage.COMPONENT__UNMITIGATED_WEAKNESSES:
			return getUnmitigatedWeaknesses();
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
		case TRADESPackage.COMPONENT__DATA_OWNER:
			setDataOwner((DataOwner) newValue);
			return;
		case TRADESPackage.COMPONENT__NAME:
			setName((String) newValue);
			return;
		case TRADESPackage.COMPONENT__CONTROL_OWNER:
			setControlOwner((ControlOwner) newValue);
			return;
		case TRADESPackage.COMPONENT__CATEGORY:
			getCategory().clear();
			getCategory().addAll((Collection<? extends ComponentCategoryENUM>) newValue);
			return;
		case TRADESPackage.COMPONENT__CHARACTERISTICS:
			getCharacteristics().clear();
			getCharacteristics().addAll((Collection<? extends Characteristic>) newValue);
			return;
		case TRADESPackage.COMPONENT__THREAT_ALLOCATIONS:
			getThreatAllocations().clear();
			getThreatAllocations().addAll((Collection<? extends ThreatAllocationRelation>) newValue);
			return;
		case TRADESPackage.COMPONENT__AFFECT_RELATIONS:
			getAffectRelations().clear();
			getAffectRelations().addAll((Collection<? extends AffectRelation>) newValue);
			return;
		case TRADESPackage.COMPONENT__LINKS:
			getLinks().clear();
			getLinks().addAll((Collection<? extends Link>) newValue);
			return;
		case TRADESPackage.COMPONENT__COMPONENT_TYPES:
			getComponentTypes().clear();
			getComponentTypes().addAll((Collection<? extends ComponentType>) newValue);
			return;
		case TRADESPackage.COMPONENT__RULES:
			getRules().clear();
			getRules().addAll((Collection<? extends Rule>) newValue);
			return;
		case TRADESPackage.COMPONENT__ASSIGNED_CONTROLS:
			getAssignedControls().clear();
			getAssignedControls().addAll((Collection<? extends Control>) newValue);
			return;
		case TRADESPackage.COMPONENT__VULNERABLE:
			setVulnerable((Boolean) newValue);
			return;
		case TRADESPackage.COMPONENT__CVA:
			getCVA().clear();
			getCVA().addAll((Collection<? extends Vulnerability>) newValue);
			return;
		case TRADESPackage.COMPONENT__CWA:
			getCWA().clear();
			getCWA().addAll((Collection<? extends Vulnerability>) newValue);
			return;
		case TRADESPackage.COMPONENT__ASSOCIATED_CONTROLS:
			getAssociatedControls().clear();
			getAssociatedControls().addAll((Collection<? extends Control>) newValue);
			return;
		case TRADESPackage.COMPONENT__UNMITIGATED_VULNERABILITIES:
			getUnmitigatedVulnerabilities().clear();
			getUnmitigatedVulnerabilities().addAll((Collection<? extends Vulnerability>) newValue);
			return;
		case TRADESPackage.COMPONENT__UNMITIGATED_WEAKNESSES:
			getUnmitigatedWeaknesses().clear();
			getUnmitigatedWeaknesses().addAll((Collection<? extends Vulnerability>) newValue);
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
		case TRADESPackage.COMPONENT__DATA_OWNER:
			setDataOwner((DataOwner) null);
			return;
		case TRADESPackage.COMPONENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case TRADESPackage.COMPONENT__CONTROL_OWNER:
			setControlOwner((ControlOwner) null);
			return;
		case TRADESPackage.COMPONENT__CATEGORY:
			getCategory().clear();
			return;
		case TRADESPackage.COMPONENT__CHARACTERISTICS:
			getCharacteristics().clear();
			return;
		case TRADESPackage.COMPONENT__THREAT_ALLOCATIONS:
			getThreatAllocations().clear();
			return;
		case TRADESPackage.COMPONENT__AFFECT_RELATIONS:
			getAffectRelations().clear();
			return;
		case TRADESPackage.COMPONENT__LINKS:
			getLinks().clear();
			return;
		case TRADESPackage.COMPONENT__COMPONENT_TYPES:
			getComponentTypes().clear();
			return;
		case TRADESPackage.COMPONENT__RULES:
			getRules().clear();
			return;
		case TRADESPackage.COMPONENT__ASSIGNED_CONTROLS:
			getAssignedControls().clear();
			return;
		case TRADESPackage.COMPONENT__VULNERABLE:
			setVulnerable(VULNERABLE_EDEFAULT);
			return;
		case TRADESPackage.COMPONENT__CVA:
			getCVA().clear();
			return;
		case TRADESPackage.COMPONENT__CWA:
			getCWA().clear();
			return;
		case TRADESPackage.COMPONENT__ASSOCIATED_CONTROLS:
			getAssociatedControls().clear();
			return;
		case TRADESPackage.COMPONENT__UNMITIGATED_VULNERABILITIES:
			getUnmitigatedVulnerabilities().clear();
			return;
		case TRADESPackage.COMPONENT__UNMITIGATED_WEAKNESSES:
			getUnmitigatedWeaknesses().clear();
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
		case TRADESPackage.COMPONENT__DATA_OWNER:
			return dataOwner != null;
		case TRADESPackage.COMPONENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case TRADESPackage.COMPONENT__CONTROL_OWNER:
			return controlOwner != null;
		case TRADESPackage.COMPONENT__CATEGORY:
			return category != null && !category.isEmpty();
		case TRADESPackage.COMPONENT__CHARACTERISTICS:
			return characteristics != null && !characteristics.isEmpty();
		case TRADESPackage.COMPONENT__THREAT_ALLOCATIONS:
			return threatAllocations != null && !threatAllocations.isEmpty();
		case TRADESPackage.COMPONENT__AFFECT_RELATIONS:
			return affectRelations != null && !affectRelations.isEmpty();
		case TRADESPackage.COMPONENT__LINKS:
			return links != null && !links.isEmpty();
		case TRADESPackage.COMPONENT__COMPONENT_TYPES:
			return componentTypes != null && !componentTypes.isEmpty();
		case TRADESPackage.COMPONENT__RULES:
			return rules != null && !rules.isEmpty();
		case TRADESPackage.COMPONENT__ASSIGNED_CONTROLS:
			return assignedControls != null && !assignedControls.isEmpty();
		case TRADESPackage.COMPONENT__VULNERABLE:
			return isVulnerable() != VULNERABLE_EDEFAULT;
		case TRADESPackage.COMPONENT__CVA:
			return cVA != null && !cVA.isEmpty();
		case TRADESPackage.COMPONENT__CWA:
			return cWA != null && !cWA.isEmpty();
		case TRADESPackage.COMPONENT__ASSOCIATED_CONTROLS:
			return associatedControls != null && !associatedControls.isEmpty();
		case TRADESPackage.COMPONENT__UNMITIGATED_VULNERABILITIES:
			return unmitigatedVulnerabilities != null && !unmitigatedVulnerabilities.isEmpty();
		case TRADESPackage.COMPONENT__UNMITIGATED_WEAKNESSES:
			return unmitigatedWeaknesses != null && !unmitigatedWeaknesses.isEmpty();
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
		if (baseClass == DataOwnerElement.class) {
			switch (derivedFeatureID) {
			case TRADESPackage.COMPONENT__DATA_OWNER:
				return TRADESPackage.DATA_OWNER_ELEMENT__DATA_OWNER;
			default:
				return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
			case TRADESPackage.COMPONENT__NAME:
				return TRADESPackage.NAMED_ELEMENT__NAME;
			default:
				return -1;
			}
		}
		if (baseClass == AbstractControlOwner.class) {
			switch (derivedFeatureID) {
			case TRADESPackage.COMPONENT__CONTROL_OWNER:
				return TRADESPackage.ABSTRACT_CONTROL_OWNER__CONTROL_OWNER;
			default:
				return -1;
			}
		}
		if (baseClass == Asset.class) {
			switch (derivedFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == DomainAsset.class) {
			switch (derivedFeatureID) {
			case TRADESPackage.COMPONENT__CATEGORY:
				return TRADESPackage.DOMAIN_ASSET__CATEGORY;
			default:
				return -1;
			}
		}
		if (baseClass == CharacteristicOwner.class) {
			switch (derivedFeatureID) {
			case TRADESPackage.COMPONENT__CHARACTERISTICS:
				return TRADESPackage.CHARACTERISTIC_OWNER__CHARACTERISTICS;
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
		if (baseClass == DataOwnerElement.class) {
			switch (baseFeatureID) {
			case TRADESPackage.DATA_OWNER_ELEMENT__DATA_OWNER:
				return TRADESPackage.COMPONENT__DATA_OWNER;
			default:
				return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
			case TRADESPackage.NAMED_ELEMENT__NAME:
				return TRADESPackage.COMPONENT__NAME;
			default:
				return -1;
			}
		}
		if (baseClass == AbstractControlOwner.class) {
			switch (baseFeatureID) {
			case TRADESPackage.ABSTRACT_CONTROL_OWNER__CONTROL_OWNER:
				return TRADESPackage.COMPONENT__CONTROL_OWNER;
			default:
				return -1;
			}
		}
		if (baseClass == Asset.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == DomainAsset.class) {
			switch (baseFeatureID) {
			case TRADESPackage.DOMAIN_ASSET__CATEGORY:
				return TRADESPackage.COMPONENT__CATEGORY;
			default:
				return -1;
			}
		}
		if (baseClass == CharacteristicOwner.class) {
			switch (baseFeatureID) {
			case TRADESPackage.CHARACTERISTIC_OWNER__CHARACTERISTICS:
				return TRADESPackage.COMPONENT__CHARACTERISTICS;
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
		if (baseClass == DataOwnerElement.class) {
			switch (baseOperationID) {
			case TRADESPackage.DATA_OWNER_ELEMENT___GET_DATAS:
				return TRADESPackage.COMPONENT___GET_DATAS;
			case TRADESPackage.DATA_OWNER_ELEMENT___GET_INHERITED_DATAS:
				return TRADESPackage.COMPONENT___GET_INHERITED_DATAS;
			case TRADESPackage.DATA_OWNER_ELEMENT___GET_ALL_DATAS:
				return TRADESPackage.COMPONENT___GET_ALL_DATAS;
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
		if (baseClass == AbstractControlOwner.class) {
			switch (baseOperationID) {
			case TRADESPackage.ABSTRACT_CONTROL_OWNER___GET_ALL_CONTROLS:
				return TRADESPackage.COMPONENT___GET_ALL_CONTROLS;
			case TRADESPackage.ABSTRACT_CONTROL_OWNER___GET_EXTERNAL_CONTROLS__STRING_STRING:
				return TRADESPackage.COMPONENT___GET_EXTERNAL_CONTROLS__STRING_STRING;
			default:
				return -1;
			}
		}
		if (baseClass == Asset.class) {
			switch (baseOperationID) {
			default:
				return -1;
			}
		}
		if (baseClass == DomainAsset.class) {
			switch (baseOperationID) {
			default:
				return -1;
			}
		}
		if (baseClass == CharacteristicOwner.class) {
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
		case TRADESPackage.COMPONENT___OF_TYPE__COMPONENTTYPE:
			return ofType((ComponentType) arguments.get(0));
		case TRADESPackage.COMPONENT___MITIGATED_V__VULNERABILITY:
			return mitigatedV((Vulnerability) arguments.get(0));
		case TRADESPackage.COMPONENT___MITIGATED_W__VULNERABILITY:
			return mitigatedW((Vulnerability) arguments.get(0));
		case TRADESPackage.COMPONENT___MITIGATED_BY_W__VULNERABILITY:
			return mitigatedByW((Vulnerability) arguments.get(0));
		case TRADESPackage.COMPONENT___MITIGATED__VULNERABILITY:
			return mitigated((Vulnerability) arguments.get(0));
		case TRADESPackage.COMPONENT___VULNERABLE_W:
			return vulnerableW();
		case TRADESPackage.COMPONENT___VULNERABLE_V:
			return vulnerableV();
		case TRADESPackage.COMPONENT___GET_ALL_CONTROLS:
			return getAllControls();
		case TRADESPackage.COMPONENT___GET_EXTERNAL_CONTROLS__STRING_STRING:
			return getExternalControls((String) arguments.get(0), (String) arguments.get(1));
		case TRADESPackage.COMPONENT___GET_DATAS:
			return getDatas();
		case TRADESPackage.COMPONENT___GET_INHERITED_DATAS:
			return getInheritedDatas();
		case TRADESPackage.COMPONENT___GET_ALL_DATAS:
			return getAllDatas();
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
		result.append(", category: ");
		result.append(category);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
