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
package dsm.TRADES.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

import dsm.TRADES.AbstractComponentOwner;
import dsm.TRADES.AbstractComponentTypeOwner;
import dsm.TRADES.AbstractControlOwner;
import dsm.TRADES.AbstractRuleOwner;
import dsm.TRADES.AbstractThreatOwner;
import dsm.TRADES.AbstractVulnerabilityOwner;
import dsm.TRADES.AffectRelation;
import dsm.TRADES.AffectedENUM;
import dsm.TRADES.Analysis;
import dsm.TRADES.AssessmentENUM;
import dsm.TRADES.Asset;
import dsm.TRADES.AttackChain;
import dsm.TRADES.AttackChainStep;
import dsm.TRADES.Catalog;
import dsm.TRADES.Characteristic;
import dsm.TRADES.CharacteristicOwner;
import dsm.TRADES.ColoredElement;
import dsm.TRADES.Component;
import dsm.TRADES.ComponentCategoryENUM;
import dsm.TRADES.ComponentType;
import dsm.TRADES.ComponentTypeOwner;
import dsm.TRADES.Control;
import dsm.TRADES.ControlOwner;
import dsm.TRADES.ControlStatusENUM;
import dsm.TRADES.Data;
import dsm.TRADES.DataOwner;
import dsm.TRADES.DataOwnerElement;
import dsm.TRADES.DifficultyScore;
import dsm.TRADES.DomainAsset;
import dsm.TRADES.ElementWithId;
import dsm.TRADES.ExternalControl;
import dsm.TRADES.ExternalElement;
import dsm.TRADES.ExternalThreat;
import dsm.TRADES.ICatalogDefinition;
import dsm.TRADES.IControlDefinition;
import dsm.TRADES.IElementWithSource;
import dsm.TRADES.IMitigationLink;
import dsm.TRADES.IThreatDefinition;
import dsm.TRADES.ImpactConfiguration;
import dsm.TRADES.ImpactScore;
import dsm.TRADES.Link;
import dsm.TRADES.LinkType;
import dsm.TRADES.NamedElement;
import dsm.TRADES.RGBColor;
import dsm.TRADES.Rule;
import dsm.TRADES.RuleOwner;
import dsm.TRADES.ScoreSystem;
import dsm.TRADES.SecurityObjectiveENUM;
import dsm.TRADES.TRADESPackage;
import dsm.TRADES.Threat;
import dsm.TRADES.ThreatAllocationRelation;
import dsm.TRADES.ThreatMitigationRelation;
import dsm.TRADES.ThreatsOwner;
import dsm.TRADES.Vulnerability;
import dsm.TRADES.VulnerabilityOwner;
import dsm.TRADES.VulnerabilityTypeENUM;
import dsm.TRADES.threatTypeENUM;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see dsm.TRADES.TRADESPackage
 * @generated
 */
public class TRADESValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TRADESValidator INSTANCE = new TRADESValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "dsm.TRADES";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Check Is Used' of 'Threat'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int THREAT__CHECK_IS_USED = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Check Computed Difficulty Constraint' of 'Threat Allocation Relation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int THREAT_ALLOCATION_RELATION__CHECK_COMPUTED_DIFFICULTY_CONSTRAINT = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Check Data Scope' of 'Affect Relation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AFFECT_RELATION__CHECK_DATA_SCOPE = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Check Allocation Value' of 'Attack Chain Step'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ATTACK_CHAIN_STEP__CHECK_ALLOCATION_VALUE = 4;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 4;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRADESValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return TRADESPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case TRADESPackage.ANALYSIS:
			return validateAnalysis((Analysis) value, diagnostics, context);
		case TRADESPackage.THREAT:
			return validateThreat((Threat) value, diagnostics, context);
		case TRADESPackage.COMPONENT:
			return validateComponent((Component) value, diagnostics, context);
		case TRADESPackage.CONTROL:
			return validateControl((Control) value, diagnostics, context);
		case TRADESPackage.THREAT_ALLOCATION_RELATION:
			return validateThreatAllocationRelation((ThreatAllocationRelation) value, diagnostics, context);
		case TRADESPackage.THREAT_MITIGATION_RELATION:
			return validateThreatMitigationRelation((ThreatMitigationRelation) value, diagnostics, context);
		case TRADESPackage.DATA:
			return validateData((Data) value, diagnostics, context);
		case TRADESPackage.AFFECT_RELATION:
			return validateAffectRelation((AffectRelation) value, diagnostics, context);
		case TRADESPackage.ATTACK_CHAIN:
			return validateAttackChain((AttackChain) value, diagnostics, context);
		case TRADESPackage.ATTACK_CHAIN_STEP:
			return validateAttackChainStep((AttackChainStep) value, diagnostics, context);
		case TRADESPackage.SCORE_SYSTEM:
			return validateScoreSystem((ScoreSystem) value, diagnostics, context);
		case TRADESPackage.IMPACT_SCORE:
			return validateImpactScore((ImpactScore) value, diagnostics, context);
		case TRADESPackage.DIFFICULTY_SCORE:
			return validateDifficultyScore((DifficultyScore) value, diagnostics, context);
		case TRADESPackage.DATA_OWNER_ELEMENT:
			return validateDataOwnerElement((DataOwnerElement) value, diagnostics, context);
		case TRADESPackage.ABSTRACT_COMPONENT_OWNER:
			return validateAbstractComponentOwner((AbstractComponentOwner) value, diagnostics, context);
		case TRADESPackage.NAMED_ELEMENT:
			return validateNamedElement((NamedElement) value, diagnostics, context);
		case TRADESPackage.EXTERNAL_THREAT:
			return validateExternalThreat((ExternalThreat) value, diagnostics, context);
		case TRADESPackage.EXTERNAL_ELEMENT:
			return validateExternalElement((ExternalElement) value, diagnostics, context);
		case TRADESPackage.IMPACT_CONFIGURATION:
			return validateImpactConfiguration((ImpactConfiguration) value, diagnostics, context);
		case TRADESPackage.EXTERNAL_CONTROL:
			return validateExternalControl((ExternalControl) value, diagnostics, context);
		case TRADESPackage.THREATS_OWNER:
			return validateThreatsOwner((ThreatsOwner) value, diagnostics, context);
		case TRADESPackage.CONTROL_OWNER:
			return validateControlOwner((ControlOwner) value, diagnostics, context);
		case TRADESPackage.ABSTRACT_CONTROL_OWNER:
			return validateAbstractControlOwner((AbstractControlOwner) value, diagnostics, context);
		case TRADESPackage.DATA_OWNER:
			return validateDataOwner((DataOwner) value, diagnostics, context);
		case TRADESPackage.LINK:
			return validateLink((Link) value, diagnostics, context);
		case TRADESPackage.LINK_TYPE:
			return validateLinkType((LinkType) value, diagnostics, context);
		case TRADESPackage.CATALOG:
			return validateCatalog((Catalog) value, diagnostics, context);
		case TRADESPackage.ABSTRACT_THREAT_OWNER:
			return validateAbstractThreatOwner((AbstractThreatOwner) value, diagnostics, context);
		case TRADESPackage.ITHREAT_DEFINITION:
			return validateIThreatDefinition((IThreatDefinition) value, diagnostics, context);
		case TRADESPackage.ICONTROL_DEFINITION:
			return validateIControlDefinition((IControlDefinition) value, diagnostics, context);
		case TRADESPackage.ICATALOG_DEFINITION:
			return validateICatalogDefinition((ICatalogDefinition) value, diagnostics, context);
		case TRADESPackage.IMITIGATION_LINK:
			return validateIMitigationLink((IMitigationLink) value, diagnostics, context);
		case TRADESPackage.COLORED_ELEMENT:
			return validateColoredElement((ColoredElement) value, diagnostics, context);
		case TRADESPackage.IELEMENT_WITH_SOURCE:
			return validateIElementWithSource((IElementWithSource) value, diagnostics, context);
		case TRADESPackage.ELEMENT_WITH_ID:
			return validateElementWithId((ElementWithId) value, diagnostics, context);
		case TRADESPackage.DOMAIN_ASSET:
			return validateDomainAsset((DomainAsset) value, diagnostics, context);
		case TRADESPackage.ABSTRACT_VULNERABILITY_OWNER:
			return validateAbstractVulnerabilityOwner((AbstractVulnerabilityOwner) value, diagnostics, context);
		case TRADESPackage.VULNERABILITY_OWNER:
			return validateVulnerabilityOwner((VulnerabilityOwner) value, diagnostics, context);
		case TRADESPackage.VULNERABILITY:
			return validateVulnerability((Vulnerability) value, diagnostics, context);
		case TRADESPackage.ABSTRACT_COMPONENT_TYPE_OWNER:
			return validateAbstractComponentTypeOwner((AbstractComponentTypeOwner) value, diagnostics, context);
		case TRADESPackage.COMPONENT_TYPE_OWNER:
			return validateComponentTypeOwner((ComponentTypeOwner) value, diagnostics, context);
		case TRADESPackage.COMPONENT_TYPE:
			return validateComponentType((ComponentType) value, diagnostics, context);
		case TRADESPackage.ASSET:
			return validateAsset((Asset) value, diagnostics, context);
		case TRADESPackage.ABSTRACT_RULE_OWNER:
			return validateAbstractRuleOwner((AbstractRuleOwner) value, diagnostics, context);
		case TRADESPackage.RULE_OWNER:
			return validateRuleOwner((RuleOwner) value, diagnostics, context);
		case TRADESPackage.RULE:
			return validateRule((Rule) value, diagnostics, context);
		case TRADESPackage.CHARACTERISTIC:
			return validateCharacteristic((Characteristic) value, diagnostics, context);
		case TRADESPackage.CHARACTERISTIC_OWNER:
			return validateCharacteristicOwner((CharacteristicOwner) value, diagnostics, context);
		case TRADESPackage.ASSESSMENT_ENUM:
			return validateAssessmentENUM((AssessmentENUM) value, diagnostics, context);
		case TRADESPackage.AFFECTED_ENUM:
			return validateAffectedENUM((AffectedENUM) value, diagnostics, context);
		case TRADESPackage.THREAT_TYPE_ENUM:
			return validatethreatTypeENUM((threatTypeENUM) value, diagnostics, context);
		case TRADESPackage.CONTROL_STATUS_ENUM:
			return validateControlStatusENUM((ControlStatusENUM) value, diagnostics, context);
		case TRADESPackage.COMPONENT_CATEGORY_ENUM:
			return validateComponentCategoryENUM((ComponentCategoryENUM) value, diagnostics, context);
		case TRADESPackage.SECURITY_OBJECTIVE_ENUM:
			return validateSecurityObjectiveENUM((SecurityObjectiveENUM) value, diagnostics, context);
		case TRADESPackage.VULNERABILITY_TYPE_ENUM:
			return validateVulnerabilityTypeENUM((VulnerabilityTypeENUM) value, diagnostics, context);
		case TRADESPackage.RGB_COLOR:
			return validateRGBColor((RGBColor) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnalysis(Analysis analysis, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(analysis, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThreat(Threat threat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(threat, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(threat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(threat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(threat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(threat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(threat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(threat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(threat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(threat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateThreat_checkIsUsed(threat, diagnostics, context);
		return result;
	}

	/**
	 * Validates the checkIsUsed constraint of '<em>Threat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThreat_checkIsUsed(Threat threat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return threat.checkIsUsed(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(component, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControl(Control control, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(control, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThreatAllocationRelation(ThreatAllocationRelation threatAllocationRelation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(threatAllocationRelation, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(threatAllocationRelation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(threatAllocationRelation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(threatAllocationRelation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(threatAllocationRelation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(threatAllocationRelation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(threatAllocationRelation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(threatAllocationRelation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(threatAllocationRelation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateThreatAllocationRelation_checkComputedDifficultyConstraint(threatAllocationRelation,
					diagnostics, context);
		return result;
	}

	/**
	 * Validates the checkComputedDifficultyConstraint constraint of '<em>Threat Allocation Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThreatAllocationRelation_checkComputedDifficultyConstraint(
			ThreatAllocationRelation threatAllocationRelation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return threatAllocationRelation.checkComputedDifficultyConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThreatMitigationRelation(ThreatMitigationRelation threatMitigationRelation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(threatMitigationRelation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateData(Data data, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(data, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAffectRelation(AffectRelation affectRelation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(affectRelation, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(affectRelation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(affectRelation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(affectRelation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(affectRelation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(affectRelation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(affectRelation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(affectRelation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(affectRelation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAffectRelation_checkDataScope(affectRelation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the checkDataScope constraint of '<em>Affect Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAffectRelation_checkDataScope(AffectRelation affectRelation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return affectRelation.checkDataScope(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttackChain(AttackChain attackChain, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attackChain, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttackChainStep(AttackChainStep attackChainStep, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attackChainStep, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(attackChainStep, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(attackChainStep, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(attackChainStep, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(attackChainStep, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(attackChainStep, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(attackChainStep, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(attackChainStep, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(attackChainStep, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAttackChainStep_checkAllocationValue(attackChainStep, diagnostics, context);
		return result;
	}

	/**
	 * Validates the checkAllocationValue constraint of '<em>Attack Chain Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttackChainStep_checkAllocationValue(AttackChainStep attackChainStep,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return attackChainStep.checkAllocationValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScoreSystem(ScoreSystem scoreSystem, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scoreSystem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImpactScore(ImpactScore impactScore, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(impactScore, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDifficultyScore(DifficultyScore difficultyScore, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(difficultyScore, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataOwnerElement(DataOwnerElement dataOwnerElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataOwnerElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractComponentOwner(AbstractComponentOwner abstractComponentOwner,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractComponentOwner, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalThreat(ExternalThreat externalThreat, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(externalThreat, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(externalThreat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(externalThreat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(externalThreat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(externalThreat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(externalThreat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(externalThreat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(externalThreat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(externalThreat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateThreat_checkIsUsed(externalThreat, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalElement(ExternalElement externalElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(externalElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImpactConfiguration(ImpactConfiguration impactConfiguration, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(impactConfiguration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalControl(ExternalControl externalControl, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(externalControl, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThreatsOwner(ThreatsOwner threatsOwner, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(threatsOwner, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlOwner(ControlOwner controlOwner, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controlOwner, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractControlOwner(AbstractControlOwner abstractControlOwner, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractControlOwner, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataOwner(DataOwner dataOwner, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataOwner, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLink(Link link, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(link, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkType(LinkType linkType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linkType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCatalog(Catalog catalog, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(catalog, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractThreatOwner(AbstractThreatOwner abstractThreatOwner, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractThreatOwner, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIThreatDefinition(IThreatDefinition iThreatDefinition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iThreatDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIControlDefinition(IControlDefinition iControlDefinition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iControlDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateICatalogDefinition(ICatalogDefinition iCatalogDefinition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iCatalogDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIMitigationLink(IMitigationLink iMitigationLink, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iMitigationLink, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColoredElement(ColoredElement coloredElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coloredElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIElementWithSource(IElementWithSource iElementWithSource, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iElementWithSource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementWithId(ElementWithId elementWithId, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementWithId, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainAsset(DomainAsset domainAsset, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(domainAsset, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractVulnerabilityOwner(AbstractVulnerabilityOwner abstractVulnerabilityOwner,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractVulnerabilityOwner, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVulnerabilityOwner(VulnerabilityOwner vulnerabilityOwner, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vulnerabilityOwner, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVulnerability(Vulnerability vulnerability, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vulnerability, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractComponentTypeOwner(AbstractComponentTypeOwner abstractComponentTypeOwner,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractComponentTypeOwner, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentTypeOwner(ComponentTypeOwner componentTypeOwner, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentTypeOwner, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentType(ComponentType componentType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAsset(Asset asset, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(asset, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractRuleOwner(AbstractRuleOwner abstractRuleOwner, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractRuleOwner, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRuleOwner(RuleOwner ruleOwner, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ruleOwner, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRule(Rule rule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacteristic(Characteristic characteristic, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(characteristic, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacteristicOwner(CharacteristicOwner characteristicOwner, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(characteristicOwner, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentENUM(AssessmentENUM assessmentENUM, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAffectedENUM(AffectedENUM affectedENUM, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatethreatTypeENUM(threatTypeENUM threatTypeENUM, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlStatusENUM(ControlStatusENUM controlStatusENUM, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentCategoryENUM(ComponentCategoryENUM componentCategoryENUM,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityObjectiveENUM(SecurityObjectiveENUM securityObjectiveENUM,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVulnerabilityTypeENUM(VulnerabilityTypeENUM vulnerabilityTypeENUM,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRGBColor(RGBColor rgbColor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //TRADESValidator
