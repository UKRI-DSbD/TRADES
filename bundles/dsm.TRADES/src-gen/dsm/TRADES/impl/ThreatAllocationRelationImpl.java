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
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EcoreUtil;

import dsm.TRADES.AssessmentENUM;
import dsm.TRADES.AttackChain;
import dsm.TRADES.Component;
import dsm.TRADES.DifficultyScore;
import dsm.TRADES.ImpactScore;
import dsm.TRADES.TRADESPackage;
import dsm.TRADES.Threat;
import dsm.TRADES.ThreatAllocationRelation;
import dsm.TRADES.util.TRADESValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Threat Allocation Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.impl.ThreatAllocationRelationImpl#getAssessment <em>Assessment</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ThreatAllocationRelationImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ThreatAllocationRelationImpl#getThreat <em>Threat</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ThreatAllocationRelationImpl#getImpactScore <em>Impact Score</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ThreatAllocationRelationImpl#getDifficultyScore <em>Difficulty Score</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ThreatAllocationRelationImpl#getAttackChain <em>Attack Chain</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ThreatAllocationRelationImpl#isMitigated <em>Mitigated</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThreatAllocationRelationImpl extends MinimalEObjectImpl.Container implements ThreatAllocationRelation {
	/**
	 * The default value of the '{@link #getAssessment() <em>Assessment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessment()
	 * @generated
	 * @ordered
	 */
	protected static final AssessmentENUM ASSESSMENT_EDEFAULT = AssessmentENUM.UNDECIDED;

	/**
	 * The cached value of the '{@link #getAssessment() <em>Assessment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessment()
	 * @generated
	 * @ordered
	 */
	protected AssessmentENUM assessment = ASSESSMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getThreat() <em>Threat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreat()
	 * @generated
	 * @ordered
	 */
	protected Threat threat;

	/**
	 * The cached value of the '{@link #getImpactScore() <em>Impact Score</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpactScore()
	 * @generated
	 * @ordered
	 */
	protected ImpactScore impactScore;

	/**
	 * The cached value of the '{@link #getDifficultyScore() <em>Difficulty Score</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifficultyScore()
	 * @generated
	 * @ordered
	 */
	protected DifficultyScore difficultyScore;

	/**
	 * The cached value of the '{@link #getAttackChain() <em>Attack Chain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttackChain()
	 * @generated
	 * @ordered
	 */
	protected AttackChain attackChain;

	/**
	 * The default value of the '{@link #isMitigated() <em>Mitigated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMitigated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MITIGATED_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThreatAllocationRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TRADESPackage.Literals.THREAT_ALLOCATION_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssessmentENUM getAssessment() {
		return assessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssessment(AssessmentENUM newAssessment) {
		AssessmentENUM oldAssessment = assessment;
		assessment = newAssessment == null ? ASSESSMENT_EDEFAULT : newAssessment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.THREAT_ALLOCATION_RELATION__ASSESSMENT,
					oldAssessment, assessment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component getComponent() {
		if (eContainerFeatureID() != TRADESPackage.THREAT_ALLOCATION_RELATION__COMPONENT)
			return null;
		return (Component) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponent(Component newComponent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newComponent, TRADESPackage.THREAT_ALLOCATION_RELATION__COMPONENT,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponent(Component newComponent) {
		if (newComponent != eInternalContainer()
				|| (eContainerFeatureID() != TRADESPackage.THREAT_ALLOCATION_RELATION__COMPONENT
						&& newComponent != null)) {
			if (EcoreUtil.isAncestor(this, newComponent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newComponent != null)
				msgs = ((InternalEObject) newComponent).eInverseAdd(this, TRADESPackage.COMPONENT__THREAT_ALLOCATIONS,
						Component.class, msgs);
			msgs = basicSetComponent(newComponent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.THREAT_ALLOCATION_RELATION__COMPONENT,
					newComponent, newComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Threat getThreat() {
		if (threat != null && threat.eIsProxy()) {
			InternalEObject oldThreat = (InternalEObject) threat;
			threat = (Threat) eResolveProxy(oldThreat);
			if (threat != oldThreat) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TRADESPackage.THREAT_ALLOCATION_RELATION__THREAT, oldThreat, threat));
			}
		}
		return threat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Threat basicGetThreat() {
		return threat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThreat(Threat newThreat, NotificationChain msgs) {
		Threat oldThreat = threat;
		threat = newThreat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TRADESPackage.THREAT_ALLOCATION_RELATION__THREAT, oldThreat, newThreat);
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
	public void setThreat(Threat newThreat) {
		if (newThreat != threat) {
			NotificationChain msgs = null;
			if (threat != null)
				msgs = ((InternalEObject) threat).eInverseRemove(this, TRADESPackage.THREAT__THREAT_ALLOCATIONS,
						Threat.class, msgs);
			if (newThreat != null)
				msgs = ((InternalEObject) newThreat).eInverseAdd(this, TRADESPackage.THREAT__THREAT_ALLOCATIONS,
						Threat.class, msgs);
			msgs = basicSetThreat(newThreat, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.THREAT_ALLOCATION_RELATION__THREAT,
					newThreat, newThreat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImpactScore getImpactScore() {
		if (impactScore != null && impactScore.eIsProxy()) {
			InternalEObject oldImpactScore = (InternalEObject) impactScore;
			impactScore = (ImpactScore) eResolveProxy(oldImpactScore);
			if (impactScore != oldImpactScore) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TRADESPackage.THREAT_ALLOCATION_RELATION__IMPACT_SCORE, oldImpactScore, impactScore));
			}
		}
		return impactScore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImpactScore basicGetImpactScore() {
		return impactScore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImpactScore(ImpactScore newImpactScore) {
		ImpactScore oldImpactScore = impactScore;
		impactScore = newImpactScore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TRADESPackage.THREAT_ALLOCATION_RELATION__IMPACT_SCORE, oldImpactScore, impactScore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DifficultyScore getDifficultyScore() {
		if (difficultyScore != null && difficultyScore.eIsProxy()) {
			InternalEObject oldDifficultyScore = (InternalEObject) difficultyScore;
			difficultyScore = (DifficultyScore) eResolveProxy(oldDifficultyScore);
			if (difficultyScore != oldDifficultyScore) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TRADESPackage.THREAT_ALLOCATION_RELATION__DIFFICULTY_SCORE, oldDifficultyScore,
							difficultyScore));
			}
		}
		return difficultyScore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DifficultyScore basicGetDifficultyScore() {
		return difficultyScore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDifficultyScore(DifficultyScore newDifficultyScore) {
		DifficultyScore oldDifficultyScore = difficultyScore;
		difficultyScore = newDifficultyScore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TRADESPackage.THREAT_ALLOCATION_RELATION__DIFFICULTY_SCORE, oldDifficultyScore, difficultyScore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttackChain getAttackChain() {
		return attackChain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttackChain(AttackChain newAttackChain, NotificationChain msgs) {
		AttackChain oldAttackChain = attackChain;
		attackChain = newAttackChain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TRADESPackage.THREAT_ALLOCATION_RELATION__ATTACK_CHAIN, oldAttackChain, newAttackChain);
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
	public void setAttackChain(AttackChain newAttackChain) {
		if (newAttackChain != attackChain) {
			NotificationChain msgs = null;
			if (attackChain != null)
				msgs = ((InternalEObject) attackChain).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.THREAT_ALLOCATION_RELATION__ATTACK_CHAIN, null, msgs);
			if (newAttackChain != null)
				msgs = ((InternalEObject) newAttackChain).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.THREAT_ALLOCATION_RELATION__ATTACK_CHAIN, null, msgs);
			msgs = basicSetAttackChain(newAttackChain, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TRADESPackage.THREAT_ALLOCATION_RELATION__ATTACK_CHAIN, newAttackChain, newAttackChain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMitigated() {
		// TODO: implement this method to return the 'Mitigated' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMitigated(boolean newMitigated) {
		// TODO: implement this method to set the 'Mitigated' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean checkComputedDifficultyConstraint(DiagnosticChain chain, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (chain != null) {
				chain.add(
						new BasicDiagnostic(Diagnostic.ERROR, TRADESValidator.DIAGNOSTIC_SOURCE,
								TRADESValidator.THREAT_ALLOCATION_RELATION__CHECK_COMPUTED_DIFFICULTY_CONSTRAINT,
								EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic",
										new Object[] { "checkComputedDifficultyConstraint",
												EObjectValidator.getObjectLabel(this, context) }),
								new Object[] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean mitigatedAV() {
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
	public boolean mitigatedAW() {
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
	public boolean mitigatedVSteps() {
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
	public boolean mitigatedWSteps() {
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
	public boolean mitigatedV() {
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
	public boolean mitigatedW() {
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TRADESPackage.THREAT_ALLOCATION_RELATION__COMPONENT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetComponent((Component) otherEnd, msgs);
		case TRADESPackage.THREAT_ALLOCATION_RELATION__THREAT:
			if (threat != null)
				msgs = ((InternalEObject) threat).eInverseRemove(this, TRADESPackage.THREAT__THREAT_ALLOCATIONS,
						Threat.class, msgs);
			return basicSetThreat((Threat) otherEnd, msgs);
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
		case TRADESPackage.THREAT_ALLOCATION_RELATION__COMPONENT:
			return basicSetComponent(null, msgs);
		case TRADESPackage.THREAT_ALLOCATION_RELATION__THREAT:
			return basicSetThreat(null, msgs);
		case TRADESPackage.THREAT_ALLOCATION_RELATION__ATTACK_CHAIN:
			return basicSetAttackChain(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case TRADESPackage.THREAT_ALLOCATION_RELATION__COMPONENT:
			return eInternalContainer().eInverseRemove(this, TRADESPackage.COMPONENT__THREAT_ALLOCATIONS,
					Component.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TRADESPackage.THREAT_ALLOCATION_RELATION__ASSESSMENT:
			return getAssessment();
		case TRADESPackage.THREAT_ALLOCATION_RELATION__COMPONENT:
			return getComponent();
		case TRADESPackage.THREAT_ALLOCATION_RELATION__THREAT:
			if (resolve)
				return getThreat();
			return basicGetThreat();
		case TRADESPackage.THREAT_ALLOCATION_RELATION__IMPACT_SCORE:
			if (resolve)
				return getImpactScore();
			return basicGetImpactScore();
		case TRADESPackage.THREAT_ALLOCATION_RELATION__DIFFICULTY_SCORE:
			if (resolve)
				return getDifficultyScore();
			return basicGetDifficultyScore();
		case TRADESPackage.THREAT_ALLOCATION_RELATION__ATTACK_CHAIN:
			return getAttackChain();
		case TRADESPackage.THREAT_ALLOCATION_RELATION__MITIGATED:
			return isMitigated();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TRADESPackage.THREAT_ALLOCATION_RELATION__ASSESSMENT:
			setAssessment((AssessmentENUM) newValue);
			return;
		case TRADESPackage.THREAT_ALLOCATION_RELATION__COMPONENT:
			setComponent((Component) newValue);
			return;
		case TRADESPackage.THREAT_ALLOCATION_RELATION__THREAT:
			setThreat((Threat) newValue);
			return;
		case TRADESPackage.THREAT_ALLOCATION_RELATION__IMPACT_SCORE:
			setImpactScore((ImpactScore) newValue);
			return;
		case TRADESPackage.THREAT_ALLOCATION_RELATION__DIFFICULTY_SCORE:
			setDifficultyScore((DifficultyScore) newValue);
			return;
		case TRADESPackage.THREAT_ALLOCATION_RELATION__ATTACK_CHAIN:
			setAttackChain((AttackChain) newValue);
			return;
		case TRADESPackage.THREAT_ALLOCATION_RELATION__MITIGATED:
			setMitigated((Boolean) newValue);
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
		case TRADESPackage.THREAT_ALLOCATION_RELATION__ASSESSMENT:
			setAssessment(ASSESSMENT_EDEFAULT);
			return;
		case TRADESPackage.THREAT_ALLOCATION_RELATION__COMPONENT:
			setComponent((Component) null);
			return;
		case TRADESPackage.THREAT_ALLOCATION_RELATION__THREAT:
			setThreat((Threat) null);
			return;
		case TRADESPackage.THREAT_ALLOCATION_RELATION__IMPACT_SCORE:
			setImpactScore((ImpactScore) null);
			return;
		case TRADESPackage.THREAT_ALLOCATION_RELATION__DIFFICULTY_SCORE:
			setDifficultyScore((DifficultyScore) null);
			return;
		case TRADESPackage.THREAT_ALLOCATION_RELATION__ATTACK_CHAIN:
			setAttackChain((AttackChain) null);
			return;
		case TRADESPackage.THREAT_ALLOCATION_RELATION__MITIGATED:
			setMitigated(MITIGATED_EDEFAULT);
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
		case TRADESPackage.THREAT_ALLOCATION_RELATION__ASSESSMENT:
			return assessment != ASSESSMENT_EDEFAULT;
		case TRADESPackage.THREAT_ALLOCATION_RELATION__COMPONENT:
			return getComponent() != null;
		case TRADESPackage.THREAT_ALLOCATION_RELATION__THREAT:
			return threat != null;
		case TRADESPackage.THREAT_ALLOCATION_RELATION__IMPACT_SCORE:
			return impactScore != null;
		case TRADESPackage.THREAT_ALLOCATION_RELATION__DIFFICULTY_SCORE:
			return difficultyScore != null;
		case TRADESPackage.THREAT_ALLOCATION_RELATION__ATTACK_CHAIN:
			return attackChain != null;
		case TRADESPackage.THREAT_ALLOCATION_RELATION__MITIGATED:
			return isMitigated() != MITIGATED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case TRADESPackage.THREAT_ALLOCATION_RELATION___CHECK_COMPUTED_DIFFICULTY_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
			return checkComputedDifficultyConstraint((DiagnosticChain) arguments.get(0), (Map) arguments.get(1));
		case TRADESPackage.THREAT_ALLOCATION_RELATION___MITIGATED_AV:
			return mitigatedAV();
		case TRADESPackage.THREAT_ALLOCATION_RELATION___MITIGATED_AW:
			return mitigatedAW();
		case TRADESPackage.THREAT_ALLOCATION_RELATION___MITIGATED_VSTEPS:
			return mitigatedVSteps();
		case TRADESPackage.THREAT_ALLOCATION_RELATION___MITIGATED_WSTEPS:
			return mitigatedWSteps();
		case TRADESPackage.THREAT_ALLOCATION_RELATION___MITIGATED_V:
			return mitigatedV();
		case TRADESPackage.THREAT_ALLOCATION_RELATION___MITIGATED_W:
			return mitigatedW();
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
		result.append(" (assessment: ");
		result.append(assessment);
		result.append(')');
		return result.toString();
	}

} //ThreatAllocationRelationImpl
