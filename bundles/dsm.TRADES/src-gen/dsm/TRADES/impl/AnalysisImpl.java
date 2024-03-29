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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import dsm.TRADES.AbstractComponentTypeOwner;
import dsm.TRADES.AbstractControlOwner;
import dsm.TRADES.AbstractThreatOwner;
import dsm.TRADES.AbstractVulnerabilityOwner;
import dsm.TRADES.AbstractVulnerableAssetOwner;
import dsm.TRADES.Analysis;
import dsm.TRADES.ComponentTypeOwner;
import dsm.TRADES.Control;
import dsm.TRADES.ControlOwner;
import dsm.TRADES.Data;
import dsm.TRADES.DataOwner;
import dsm.TRADES.DataOwnerElement;
import dsm.TRADES.ElementWithId;
import dsm.TRADES.ExternalControl;
import dsm.TRADES.ExternalThreat;
import dsm.TRADES.LinkType;
import dsm.TRADES.NamedElement;
import dsm.TRADES.ScoreSystem;
import dsm.TRADES.TRADESPackage;
import dsm.TRADES.ThreatsOwner;
import dsm.TRADES.VAOwner;
import dsm.TRADES.VulnerabilityOwner;
import dsm.TRADES.VulnerableAsset;
import dsm.TRADES.VulnerableAssetOwner;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analysis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.impl.AnalysisImpl#getDataOwner <em>Data Owner</em>}</li>
 *   <li>{@link dsm.TRADES.impl.AnalysisImpl#getName <em>Name</em>}</li>
 *   <li>{@link dsm.TRADES.impl.AnalysisImpl#getControlOwner <em>Control Owner</em>}</li>
 *   <li>{@link dsm.TRADES.impl.AnalysisImpl#getThreatOwner <em>Threat Owner</em>}</li>
 *   <li>{@link dsm.TRADES.impl.AnalysisImpl#getId <em>Id</em>}</li>
 *   <li>{@link dsm.TRADES.impl.AnalysisImpl#getVulnerabilityOwner <em>Vulnerability Owner</em>}</li>
 *   <li>{@link dsm.TRADES.impl.AnalysisImpl#getComponentTypeOwner <em>Component Type Owner</em>}</li>
 *   <li>{@link dsm.TRADES.impl.AnalysisImpl#getVulnerableAssetOwner <em>Vulnerable Asset Owner</em>}</li>
 *   <li>{@link dsm.TRADES.impl.AnalysisImpl#getVulnerableasset <em>Vulnerableasset</em>}</li>
 *   <li>{@link dsm.TRADES.impl.AnalysisImpl#getScoreSystem <em>Score System</em>}</li>
 *   <li>{@link dsm.TRADES.impl.AnalysisImpl#getLinkTypes <em>Link Types</em>}</li>
 *   <li>{@link dsm.TRADES.impl.AnalysisImpl#getNVDAPIKey <em>NVDAPI Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalysisImpl extends ComponentOwnerImpl implements Analysis {
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
	 * The cached value of the '{@link #getThreatOwner() <em>Threat Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreatOwner()
	 * @generated
	 * @ordered
	 */
	protected ThreatsOwner threatOwner;

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
	 * The cached value of the '{@link #getComponentTypeOwner() <em>Component Type Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentTypeOwner()
	 * @generated
	 * @ordered
	 */
	protected ComponentTypeOwner componentTypeOwner;

	/**
	 * The cached value of the '{@link #getVulnerableAssetOwner() <em>Vulnerable Asset Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVulnerableAssetOwner()
	 * @generated
	 * @ordered
	 */
	protected VulnerableAssetOwner vulnerableAssetOwner;

	/**
	 * The cached value of the '{@link #getVulnerableasset() <em>Vulnerableasset</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVulnerableasset()
	 * @generated
	 * @ordered
	 */
	protected EList<VulnerableAsset> vulnerableasset;

	/**
	 * The cached value of the '{@link #getScoreSystem() <em>Score System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScoreSystem()
	 * @generated
	 * @ordered
	 */
	protected ScoreSystem scoreSystem;

	/**
	 * The cached value of the '{@link #getLinkTypes() <em>Link Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkType> linkTypes;

	/**
	 * The default value of the '{@link #getNVDAPIKey() <em>NVDAPI Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNVDAPIKey()
	 * @generated
	 * @ordered
	 */
	protected static final String NVDAPI_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNVDAPIKey() <em>NVDAPI Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNVDAPIKey()
	 * @generated
	 * @ordered
	 */
	protected String nVDAPIKey = NVDAPI_KEY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalysisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TRADESPackage.Literals.ANALYSIS;
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
					TRADESPackage.ANALYSIS__DATA_OWNER, oldDataOwner, newDataOwner);
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
						EOPPOSITE_FEATURE_BASE - TRADESPackage.ANALYSIS__DATA_OWNER, null, msgs);
			if (newDataOwner != null)
				msgs = ((InternalEObject) newDataOwner).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.ANALYSIS__DATA_OWNER, null, msgs);
			msgs = basicSetDataOwner(newDataOwner, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.ANALYSIS__DATA_OWNER, newDataOwner,
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
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.ANALYSIS__NAME, oldName, name));
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
					TRADESPackage.ANALYSIS__CONTROL_OWNER, oldControlOwner, newControlOwner);
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
						EOPPOSITE_FEATURE_BASE - TRADESPackage.ANALYSIS__CONTROL_OWNER, null, msgs);
			if (newControlOwner != null)
				msgs = ((InternalEObject) newControlOwner).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.ANALYSIS__CONTROL_OWNER, null, msgs);
			msgs = basicSetControlOwner(newControlOwner, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.ANALYSIS__CONTROL_OWNER,
					newControlOwner, newControlOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThreatsOwner getThreatOwner() {
		return threatOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThreatOwner(ThreatsOwner newThreatOwner, NotificationChain msgs) {
		ThreatsOwner oldThreatOwner = threatOwner;
		threatOwner = newThreatOwner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TRADESPackage.ANALYSIS__THREAT_OWNER, oldThreatOwner, newThreatOwner);
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
	public void setThreatOwner(ThreatsOwner newThreatOwner) {
		if (newThreatOwner != threatOwner) {
			NotificationChain msgs = null;
			if (threatOwner != null)
				msgs = ((InternalEObject) threatOwner).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.ANALYSIS__THREAT_OWNER, null, msgs);
			if (newThreatOwner != null)
				msgs = ((InternalEObject) newThreatOwner).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.ANALYSIS__THREAT_OWNER, null, msgs);
			msgs = basicSetThreatOwner(newThreatOwner, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.ANALYSIS__THREAT_OWNER, newThreatOwner,
					newThreatOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScoreSystem getScoreSystem() {
		return scoreSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScoreSystem(ScoreSystem newScoreSystem, NotificationChain msgs) {
		ScoreSystem oldScoreSystem = scoreSystem;
		scoreSystem = newScoreSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TRADESPackage.ANALYSIS__SCORE_SYSTEM, oldScoreSystem, newScoreSystem);
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
	public void setScoreSystem(ScoreSystem newScoreSystem) {
		if (newScoreSystem != scoreSystem) {
			NotificationChain msgs = null;
			if (scoreSystem != null)
				msgs = ((InternalEObject) scoreSystem).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.ANALYSIS__SCORE_SYSTEM, null, msgs);
			if (newScoreSystem != null)
				msgs = ((InternalEObject) newScoreSystem).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.ANALYSIS__SCORE_SYSTEM, null, msgs);
			msgs = basicSetScoreSystem(newScoreSystem, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.ANALYSIS__SCORE_SYSTEM, newScoreSystem,
					newScoreSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LinkType> getLinkTypes() {
		if (linkTypes == null) {
			linkTypes = new EObjectContainmentEList<LinkType>(LinkType.class, this, TRADESPackage.ANALYSIS__LINK_TYPES);
		}
		return linkTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNVDAPIKey() {
		return nVDAPIKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNVDAPIKey(String newNVDAPIKey) {
		String oldNVDAPIKey = nVDAPIKey;
		nVDAPIKey = newNVDAPIKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.ANALYSIS__NVDAPI_KEY, oldNVDAPIKey,
					nVDAPIKey));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.ANALYSIS__ID, oldId, id));
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
					TRADESPackage.ANALYSIS__VULNERABILITY_OWNER, oldVulnerabilityOwner, newVulnerabilityOwner);
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
						EOPPOSITE_FEATURE_BASE - TRADESPackage.ANALYSIS__VULNERABILITY_OWNER, null, msgs);
			if (newVulnerabilityOwner != null)
				msgs = ((InternalEObject) newVulnerabilityOwner).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.ANALYSIS__VULNERABILITY_OWNER, null, msgs);
			msgs = basicSetVulnerabilityOwner(newVulnerabilityOwner, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.ANALYSIS__VULNERABILITY_OWNER,
					newVulnerabilityOwner, newVulnerabilityOwner));
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
					TRADESPackage.ANALYSIS__COMPONENT_TYPE_OWNER, oldComponentTypeOwner, newComponentTypeOwner);
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
						EOPPOSITE_FEATURE_BASE - TRADESPackage.ANALYSIS__COMPONENT_TYPE_OWNER, null, msgs);
			if (newComponentTypeOwner != null)
				msgs = ((InternalEObject) newComponentTypeOwner).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.ANALYSIS__COMPONENT_TYPE_OWNER, null, msgs);
			msgs = basicSetComponentTypeOwner(newComponentTypeOwner, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.ANALYSIS__COMPONENT_TYPE_OWNER,
					newComponentTypeOwner, newComponentTypeOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VulnerableAssetOwner getVulnerableAssetOwner() {
		return vulnerableAssetOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVulnerableAssetOwner(VulnerableAssetOwner newVulnerableAssetOwner,
			NotificationChain msgs) {
		VulnerableAssetOwner oldVulnerableAssetOwner = vulnerableAssetOwner;
		vulnerableAssetOwner = newVulnerableAssetOwner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TRADESPackage.ANALYSIS__VULNERABLE_ASSET_OWNER, oldVulnerableAssetOwner, newVulnerableAssetOwner);
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
	public void setVulnerableAssetOwner(VulnerableAssetOwner newVulnerableAssetOwner) {
		if (newVulnerableAssetOwner != vulnerableAssetOwner) {
			NotificationChain msgs = null;
			if (vulnerableAssetOwner != null)
				msgs = ((InternalEObject) vulnerableAssetOwner).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.ANALYSIS__VULNERABLE_ASSET_OWNER, null, msgs);
			if (newVulnerableAssetOwner != null)
				msgs = ((InternalEObject) newVulnerableAssetOwner).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.ANALYSIS__VULNERABLE_ASSET_OWNER, null, msgs);
			msgs = basicSetVulnerableAssetOwner(newVulnerableAssetOwner, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.ANALYSIS__VULNERABLE_ASSET_OWNER,
					newVulnerableAssetOwner, newVulnerableAssetOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VulnerableAsset> getVulnerableasset() {
		if (vulnerableasset == null) {
			vulnerableasset = new EObjectContainmentEList<VulnerableAsset>(VulnerableAsset.class, this,
					TRADESPackage.ANALYSIS__VULNERABLEASSET);
		}
		return vulnerableasset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExternalThreat> getExternalThreats(String id, String catalogIdentifier) {
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TRADESPackage.ANALYSIS__DATA_OWNER:
			return basicSetDataOwner(null, msgs);
		case TRADESPackage.ANALYSIS__CONTROL_OWNER:
			return basicSetControlOwner(null, msgs);
		case TRADESPackage.ANALYSIS__THREAT_OWNER:
			return basicSetThreatOwner(null, msgs);
		case TRADESPackage.ANALYSIS__VULNERABILITY_OWNER:
			return basicSetVulnerabilityOwner(null, msgs);
		case TRADESPackage.ANALYSIS__COMPONENT_TYPE_OWNER:
			return basicSetComponentTypeOwner(null, msgs);
		case TRADESPackage.ANALYSIS__VULNERABLE_ASSET_OWNER:
			return basicSetVulnerableAssetOwner(null, msgs);
		case TRADESPackage.ANALYSIS__VULNERABLEASSET:
			return ((InternalEList<?>) getVulnerableasset()).basicRemove(otherEnd, msgs);
		case TRADESPackage.ANALYSIS__SCORE_SYSTEM:
			return basicSetScoreSystem(null, msgs);
		case TRADESPackage.ANALYSIS__LINK_TYPES:
			return ((InternalEList<?>) getLinkTypes()).basicRemove(otherEnd, msgs);
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
		case TRADESPackage.ANALYSIS__DATA_OWNER:
			return getDataOwner();
		case TRADESPackage.ANALYSIS__NAME:
			return getName();
		case TRADESPackage.ANALYSIS__CONTROL_OWNER:
			return getControlOwner();
		case TRADESPackage.ANALYSIS__THREAT_OWNER:
			return getThreatOwner();
		case TRADESPackage.ANALYSIS__ID:
			return getId();
		case TRADESPackage.ANALYSIS__VULNERABILITY_OWNER:
			return getVulnerabilityOwner();
		case TRADESPackage.ANALYSIS__COMPONENT_TYPE_OWNER:
			return getComponentTypeOwner();
		case TRADESPackage.ANALYSIS__VULNERABLE_ASSET_OWNER:
			return getVulnerableAssetOwner();
		case TRADESPackage.ANALYSIS__VULNERABLEASSET:
			return getVulnerableasset();
		case TRADESPackage.ANALYSIS__SCORE_SYSTEM:
			return getScoreSystem();
		case TRADESPackage.ANALYSIS__LINK_TYPES:
			return getLinkTypes();
		case TRADESPackage.ANALYSIS__NVDAPI_KEY:
			return getNVDAPIKey();
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
		case TRADESPackage.ANALYSIS__DATA_OWNER:
			setDataOwner((DataOwner) newValue);
			return;
		case TRADESPackage.ANALYSIS__NAME:
			setName((String) newValue);
			return;
		case TRADESPackage.ANALYSIS__CONTROL_OWNER:
			setControlOwner((ControlOwner) newValue);
			return;
		case TRADESPackage.ANALYSIS__THREAT_OWNER:
			setThreatOwner((ThreatsOwner) newValue);
			return;
		case TRADESPackage.ANALYSIS__ID:
			setId((String) newValue);
			return;
		case TRADESPackage.ANALYSIS__VULNERABILITY_OWNER:
			setVulnerabilityOwner((VulnerabilityOwner) newValue);
			return;
		case TRADESPackage.ANALYSIS__COMPONENT_TYPE_OWNER:
			setComponentTypeOwner((ComponentTypeOwner) newValue);
			return;
		case TRADESPackage.ANALYSIS__VULNERABLE_ASSET_OWNER:
			setVulnerableAssetOwner((VulnerableAssetOwner) newValue);
			return;
		case TRADESPackage.ANALYSIS__VULNERABLEASSET:
			getVulnerableasset().clear();
			getVulnerableasset().addAll((Collection<? extends VulnerableAsset>) newValue);
			return;
		case TRADESPackage.ANALYSIS__SCORE_SYSTEM:
			setScoreSystem((ScoreSystem) newValue);
			return;
		case TRADESPackage.ANALYSIS__LINK_TYPES:
			getLinkTypes().clear();
			getLinkTypes().addAll((Collection<? extends LinkType>) newValue);
			return;
		case TRADESPackage.ANALYSIS__NVDAPI_KEY:
			setNVDAPIKey((String) newValue);
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
		case TRADESPackage.ANALYSIS__DATA_OWNER:
			setDataOwner((DataOwner) null);
			return;
		case TRADESPackage.ANALYSIS__NAME:
			setName(NAME_EDEFAULT);
			return;
		case TRADESPackage.ANALYSIS__CONTROL_OWNER:
			setControlOwner((ControlOwner) null);
			return;
		case TRADESPackage.ANALYSIS__THREAT_OWNER:
			setThreatOwner((ThreatsOwner) null);
			return;
		case TRADESPackage.ANALYSIS__ID:
			setId(ID_EDEFAULT);
			return;
		case TRADESPackage.ANALYSIS__VULNERABILITY_OWNER:
			setVulnerabilityOwner((VulnerabilityOwner) null);
			return;
		case TRADESPackage.ANALYSIS__COMPONENT_TYPE_OWNER:
			setComponentTypeOwner((ComponentTypeOwner) null);
			return;
		case TRADESPackage.ANALYSIS__VULNERABLE_ASSET_OWNER:
			setVulnerableAssetOwner((VulnerableAssetOwner) null);
			return;
		case TRADESPackage.ANALYSIS__VULNERABLEASSET:
			getVulnerableasset().clear();
			return;
		case TRADESPackage.ANALYSIS__SCORE_SYSTEM:
			setScoreSystem((ScoreSystem) null);
			return;
		case TRADESPackage.ANALYSIS__LINK_TYPES:
			getLinkTypes().clear();
			return;
		case TRADESPackage.ANALYSIS__NVDAPI_KEY:
			setNVDAPIKey(NVDAPI_KEY_EDEFAULT);
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
		case TRADESPackage.ANALYSIS__DATA_OWNER:
			return dataOwner != null;
		case TRADESPackage.ANALYSIS__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case TRADESPackage.ANALYSIS__CONTROL_OWNER:
			return controlOwner != null;
		case TRADESPackage.ANALYSIS__THREAT_OWNER:
			return threatOwner != null;
		case TRADESPackage.ANALYSIS__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case TRADESPackage.ANALYSIS__VULNERABILITY_OWNER:
			return vulnerabilityOwner != null;
		case TRADESPackage.ANALYSIS__COMPONENT_TYPE_OWNER:
			return componentTypeOwner != null;
		case TRADESPackage.ANALYSIS__VULNERABLE_ASSET_OWNER:
			return vulnerableAssetOwner != null;
		case TRADESPackage.ANALYSIS__VULNERABLEASSET:
			return vulnerableasset != null && !vulnerableasset.isEmpty();
		case TRADESPackage.ANALYSIS__SCORE_SYSTEM:
			return scoreSystem != null;
		case TRADESPackage.ANALYSIS__LINK_TYPES:
			return linkTypes != null && !linkTypes.isEmpty();
		case TRADESPackage.ANALYSIS__NVDAPI_KEY:
			return NVDAPI_KEY_EDEFAULT == null ? nVDAPIKey != null : !NVDAPI_KEY_EDEFAULT.equals(nVDAPIKey);
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
			case TRADESPackage.ANALYSIS__DATA_OWNER:
				return TRADESPackage.DATA_OWNER_ELEMENT__DATA_OWNER;
			default:
				return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
			case TRADESPackage.ANALYSIS__NAME:
				return TRADESPackage.NAMED_ELEMENT__NAME;
			default:
				return -1;
			}
		}
		if (baseClass == AbstractControlOwner.class) {
			switch (derivedFeatureID) {
			case TRADESPackage.ANALYSIS__CONTROL_OWNER:
				return TRADESPackage.ABSTRACT_CONTROL_OWNER__CONTROL_OWNER;
			default:
				return -1;
			}
		}
		if (baseClass == AbstractThreatOwner.class) {
			switch (derivedFeatureID) {
			case TRADESPackage.ANALYSIS__THREAT_OWNER:
				return TRADESPackage.ABSTRACT_THREAT_OWNER__THREAT_OWNER;
			default:
				return -1;
			}
		}
		if (baseClass == ElementWithId.class) {
			switch (derivedFeatureID) {
			case TRADESPackage.ANALYSIS__ID:
				return TRADESPackage.ELEMENT_WITH_ID__ID;
			default:
				return -1;
			}
		}
		if (baseClass == AbstractVulnerabilityOwner.class) {
			switch (derivedFeatureID) {
			case TRADESPackage.ANALYSIS__VULNERABILITY_OWNER:
				return TRADESPackage.ABSTRACT_VULNERABILITY_OWNER__VULNERABILITY_OWNER;
			default:
				return -1;
			}
		}
		if (baseClass == AbstractComponentTypeOwner.class) {
			switch (derivedFeatureID) {
			case TRADESPackage.ANALYSIS__COMPONENT_TYPE_OWNER:
				return TRADESPackage.ABSTRACT_COMPONENT_TYPE_OWNER__COMPONENT_TYPE_OWNER;
			default:
				return -1;
			}
		}
		if (baseClass == AbstractVulnerableAssetOwner.class) {
			switch (derivedFeatureID) {
			case TRADESPackage.ANALYSIS__VULNERABLE_ASSET_OWNER:
				return TRADESPackage.ABSTRACT_VULNERABLE_ASSET_OWNER__VULNERABLE_ASSET_OWNER;
			default:
				return -1;
			}
		}
		if (baseClass == VAOwner.class) {
			switch (derivedFeatureID) {
			case TRADESPackage.ANALYSIS__VULNERABLEASSET:
				return TRADESPackage.VA_OWNER__VULNERABLEASSET;
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
				return TRADESPackage.ANALYSIS__DATA_OWNER;
			default:
				return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
			case TRADESPackage.NAMED_ELEMENT__NAME:
				return TRADESPackage.ANALYSIS__NAME;
			default:
				return -1;
			}
		}
		if (baseClass == AbstractControlOwner.class) {
			switch (baseFeatureID) {
			case TRADESPackage.ABSTRACT_CONTROL_OWNER__CONTROL_OWNER:
				return TRADESPackage.ANALYSIS__CONTROL_OWNER;
			default:
				return -1;
			}
		}
		if (baseClass == AbstractThreatOwner.class) {
			switch (baseFeatureID) {
			case TRADESPackage.ABSTRACT_THREAT_OWNER__THREAT_OWNER:
				return TRADESPackage.ANALYSIS__THREAT_OWNER;
			default:
				return -1;
			}
		}
		if (baseClass == ElementWithId.class) {
			switch (baseFeatureID) {
			case TRADESPackage.ELEMENT_WITH_ID__ID:
				return TRADESPackage.ANALYSIS__ID;
			default:
				return -1;
			}
		}
		if (baseClass == AbstractVulnerabilityOwner.class) {
			switch (baseFeatureID) {
			case TRADESPackage.ABSTRACT_VULNERABILITY_OWNER__VULNERABILITY_OWNER:
				return TRADESPackage.ANALYSIS__VULNERABILITY_OWNER;
			default:
				return -1;
			}
		}
		if (baseClass == AbstractComponentTypeOwner.class) {
			switch (baseFeatureID) {
			case TRADESPackage.ABSTRACT_COMPONENT_TYPE_OWNER__COMPONENT_TYPE_OWNER:
				return TRADESPackage.ANALYSIS__COMPONENT_TYPE_OWNER;
			default:
				return -1;
			}
		}
		if (baseClass == AbstractVulnerableAssetOwner.class) {
			switch (baseFeatureID) {
			case TRADESPackage.ABSTRACT_VULNERABLE_ASSET_OWNER__VULNERABLE_ASSET_OWNER:
				return TRADESPackage.ANALYSIS__VULNERABLE_ASSET_OWNER;
			default:
				return -1;
			}
		}
		if (baseClass == VAOwner.class) {
			switch (baseFeatureID) {
			case TRADESPackage.VA_OWNER__VULNERABLEASSET:
				return TRADESPackage.ANALYSIS__VULNERABLEASSET;
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
				return TRADESPackage.ANALYSIS___GET_DATAS;
			case TRADESPackage.DATA_OWNER_ELEMENT___GET_INHERITED_DATAS:
				return TRADESPackage.ANALYSIS___GET_INHERITED_DATAS;
			case TRADESPackage.DATA_OWNER_ELEMENT___GET_ALL_DATAS:
				return TRADESPackage.ANALYSIS___GET_ALL_DATAS;
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
				return TRADESPackage.ANALYSIS___GET_ALL_CONTROLS;
			case TRADESPackage.ABSTRACT_CONTROL_OWNER___GET_EXTERNAL_CONTROLS__STRING_STRING:
				return TRADESPackage.ANALYSIS___GET_EXTERNAL_CONTROLS__STRING_STRING;
			default:
				return -1;
			}
		}
		if (baseClass == AbstractThreatOwner.class) {
			switch (baseOperationID) {
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
		if (baseClass == AbstractComponentTypeOwner.class) {
			switch (baseOperationID) {
			default:
				return -1;
			}
		}
		if (baseClass == AbstractVulnerableAssetOwner.class) {
			switch (baseOperationID) {
			default:
				return -1;
			}
		}
		if (baseClass == VAOwner.class) {
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
		case TRADESPackage.ANALYSIS___GET_EXTERNAL_THREATS__STRING_STRING:
			return getExternalThreats((String) arguments.get(0), (String) arguments.get(1));
		case TRADESPackage.ANALYSIS___GET_ALL_CONTROLS:
			return getAllControls();
		case TRADESPackage.ANALYSIS___GET_EXTERNAL_CONTROLS__STRING_STRING:
			return getExternalControls((String) arguments.get(0), (String) arguments.get(1));
		case TRADESPackage.ANALYSIS___GET_DATAS:
			return getDatas();
		case TRADESPackage.ANALYSIS___GET_INHERITED_DATAS:
			return getInheritedDatas();
		case TRADESPackage.ANALYSIS___GET_ALL_DATAS:
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
		result.append(", id: ");
		result.append(id);
		result.append(", nVDAPIKey: ");
		result.append(nVDAPIKey);
		result.append(')');
		return result.toString();
	}

} //AnalysisImpl
