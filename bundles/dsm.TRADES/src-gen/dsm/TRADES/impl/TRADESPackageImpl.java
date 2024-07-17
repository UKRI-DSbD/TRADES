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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

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
import dsm.TRADES.ComponentOwner;
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
import dsm.TRADES.TRADESFactory;
import dsm.TRADES.TRADESPackage;
import dsm.TRADES.Threat;
import dsm.TRADES.ThreatAllocationRelation;
import dsm.TRADES.ThreatMitigationRelation;
import dsm.TRADES.ThreatsOwner;
import dsm.TRADES.Vulnerability;
import dsm.TRADES.VulnerabilityOwner;
import dsm.TRADES.VulnerabilityTypeENUM;
import dsm.TRADES.threatTypeENUM;
import dsm.TRADES.util.TRADESValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TRADESPackageImpl extends EPackageImpl implements TRADESPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analysisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threatAllocationRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threatMitigationRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass affectRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attackChainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attackChainStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scoreSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass impactScoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass difficultyScoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataOwnerElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentOwnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalThreatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass impactConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threatsOwnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlOwnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractControlOwnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataOwnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catalogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractThreatOwnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractVulnerabilityOwnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iThreatDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iControlDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iCatalogDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iMitigationLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coloredElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iElementWithSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementWithIdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainAssetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vulnerabilityOwnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vulnerabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractComponentTypeOwnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentTypeOwnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractRuleOwnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleOwnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characteristicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characteristicOwnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum assessmentENUMEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum affectedENUMEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum threatTypeENUMEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum controlStatusENUMEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum componentCategoryENUMEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum securityObjectiveENUMEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum vulnerabilityTypeENUMEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rgbColorEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see dsm.TRADES.TRADESPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TRADESPackageImpl() {
		super(eNS_URI, TRADESFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link TRADESPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TRADESPackage init() {
		if (isInited)
			return (TRADESPackage) EPackage.Registry.INSTANCE.getEPackage(TRADESPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTRADESPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TRADESPackageImpl theTRADESPackage = registeredTRADESPackage instanceof TRADESPackageImpl
				? (TRADESPackageImpl) registeredTRADESPackage
				: new TRADESPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTRADESPackage.createPackageContents();

		// Initialize created meta-data
		theTRADESPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theTRADESPackage, new EValidator.Descriptor() {
			@Override
			public EValidator getEValidator() {
				return TRADESValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theTRADESPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TRADESPackage.eNS_URI, theTRADESPackage);
		return theTRADESPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnalysis() {
		return analysisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnalysis_ScoreSystem() {
		return (EReference) analysisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnalysis_LinkTypes() {
		return (EReference) analysisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnalysis_NVDAPIKey() {
		return (EAttribute) analysisEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnalysis_Property_VulnerabilityMitigationRulesAvailable() {
		return (EAttribute) analysisEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnalysis_Property_WeaknessMitigationRulesAvailable() {
		return (EAttribute) analysisEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnalysis_Property_DesignAddressesVulnerabilities() {
		return (EAttribute) analysisEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnalysis_Property_DesignAddressesWeaknesses() {
		return (EAttribute) analysisEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnalysis_VulnerabilitiesUncoveredByRule() {
		return (EReference) analysisEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnalysis_WeaknessesUncoveredByRule() {
		return (EReference) analysisEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnalysis_VulnerableComponents() {
		return (EReference) analysisEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnalysis__GetExternalThreats__String_String() {
		return analysisEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnalysis__DirectRuleExists__Vulnerability_ComponentType() {
		return analysisEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnalysis__ProxyRuleExists__Vulnerability_ComponentType() {
		return analysisEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnalysis__RuleExists__Vulnerability_ComponentType() {
		return analysisEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThreat() {
		return threatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreat_ThreatAllocations() {
		return (EReference) threatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThreat_ThreatType() {
		return (EAttribute) threatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThreat_Description() {
		return (EAttribute) threatEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThreat_Applicability() {
		return (EAttribute) threatEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreat_ExploitsVulnerability() {
		return (EReference) threatEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreat_Refines() {
		return (EReference) threatEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getThreat__CheckIsUsed__DiagnosticChain_Map() {
		return threatEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_ThreatAllocations() {
		return (EReference) componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_AffectRelations() {
		return (EReference) componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_Links() {
		return (EReference) componentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_ComponentTypes() {
		return (EReference) componentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_Rules() {
		return (EReference) componentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_AssignedControls() {
		return (EReference) componentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_Vulnerable() {
		return (EAttribute) componentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_CVA() {
		return (EReference) componentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_CWA() {
		return (EReference) componentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_AssociatedControls() {
		return (EReference) componentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_UnmitigatedVulnerabilities() {
		return (EReference) componentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_UnmitigatedWeaknesses() {
		return (EReference) componentEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getComponent__OfType__ComponentType() {
		return componentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getComponent__MitigatedV__Vulnerability() {
		return componentEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getComponent__MitigatedW__Vulnerability() {
		return componentEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getComponent__MitigatedByW__Vulnerability() {
		return componentEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getComponent__Mitigated__Vulnerability() {
		return componentEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getComponent__VulnerableW() {
		return componentEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getComponent__VulnerableV() {
		return componentEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getControl() {
		return controlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControl_MitigatedThreats() {
		return (EReference) controlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControl_Description() {
		return (EAttribute) controlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControl_DescriptionWithPlaceholders() {
		return (EAttribute) controlEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControl_MitigationRelations() {
		return (EReference) controlEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControl_Status() {
		return (EAttribute) controlEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControl_MitigatesVulnerability() {
		return (EReference) controlEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControl_SecurityObjective() {
		return (EAttribute) controlEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThreatAllocationRelation() {
		return threatAllocationRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThreatAllocationRelation_Assessment() {
		return (EAttribute) threatAllocationRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreatAllocationRelation_Component() {
		return (EReference) threatAllocationRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreatAllocationRelation_Threat() {
		return (EReference) threatAllocationRelationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreatAllocationRelation_ImpactScore() {
		return (EReference) threatAllocationRelationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreatAllocationRelation_DifficultyScore() {
		return (EReference) threatAllocationRelationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreatAllocationRelation_AttackChain() {
		return (EReference) threatAllocationRelationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThreatAllocationRelation_Mitigated() {
		return (EAttribute) threatAllocationRelationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getThreatAllocationRelation__CheckComputedDifficultyConstraint__DiagnosticChain_Map() {
		return threatAllocationRelationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getThreatAllocationRelation__MitigatedAV() {
		return threatAllocationRelationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getThreatAllocationRelation__MitigatedAW() {
		return threatAllocationRelationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getThreatAllocationRelation__MitigatedVSteps() {
		return threatAllocationRelationEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getThreatAllocationRelation__MitigatedWSteps() {
		return threatAllocationRelationEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getThreatAllocationRelation__MitigatedV() {
		return threatAllocationRelationEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getThreatAllocationRelation__MitigatedW() {
		return threatAllocationRelationEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThreatMitigationRelation() {
		return threatMitigationRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThreatMitigationRelation_Assessment() {
		return (EAttribute) threatMitigationRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreatMitigationRelation_Control() {
		return (EReference) threatMitigationRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreatMitigationRelation_Threat() {
		return (EReference) threatMitigationRelationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreatMitigationRelation_MitigatedAllocation() {
		return (EReference) threatMitigationRelationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThreatMitigationRelation_Description() {
		return (EAttribute) threatMitigationRelationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getData() {
		return dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAffectRelation() {
		return affectRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAffectRelation_Data() {
		return (EReference) affectRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAffectRelation_SourceComponent() {
		return (EReference) affectRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAffectRelation_TargetComponent() {
		return (EReference) affectRelationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAffectRelation_AnalysisStatus() {
		return (EAttribute) affectRelationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAffectRelation_Link() {
		return (EReference) affectRelationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAffectRelation__CheckDataScope__DiagnosticChain_Map() {
		return affectRelationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttackChain() {
		return attackChainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttackChain_AttackChainSteps() {
		return (EReference) attackChainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttackChain_ComputedDifficulty() {
		return (EAttribute) attackChainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttackChainStep() {
		return attackChainStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttackChainStep_StepNum() {
		return (EAttribute) attackChainStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttackChainStep_ThreatAllocationRelation() {
		return (EReference) attackChainStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttackChainStep_ImpactDescription() {
		return (EAttribute) attackChainStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttackChainStep_Next() {
		return (EReference) attackChainStepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttackChainStep_Previous() {
		return (EReference) attackChainStepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAttackChainStep__GetThreatAllocationRelationCandidates() {
		return attackChainStepEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAttackChainStep__CheckAllocationValue__DiagnosticChain_Map() {
		return attackChainStepEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScoreSystem() {
		return scoreSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScoreSystem_ImpactScores() {
		return (EReference) scoreSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScoreSystem_DifficultyScores() {
		return (EReference) scoreSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImpactScore() {
		return impactScoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImpactScore_Impact() {
		return (EAttribute) impactScoreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImpactScore_Configurations() {
		return (EReference) impactScoreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDifficultyScore() {
		return difficultyScoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDifficultyScore_Difficulty() {
		return (EAttribute) difficultyScoreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataOwnerElement() {
		return dataOwnerElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataOwnerElement_DataOwner() {
		return (EReference) dataOwnerElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataOwnerElement__GetDatas() {
		return dataOwnerElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataOwnerElement__GetInheritedDatas() {
		return dataOwnerElementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataOwnerElement__GetAllDatas() {
		return dataOwnerElementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentOwner() {
		return componentOwnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentOwner_Components() {
		return (EReference) componentOwnerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Name() {
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalThreat() {
		return externalThreatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalElement() {
		return externalElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExternalElement_Source() {
		return (EAttribute) externalElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExternalElement_Link() {
		return (EAttribute) externalElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExternalElement_SourceID() {
		return (EAttribute) externalElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImpactConfiguration() {
		return impactConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImpactConfiguration_Difficulty() {
		return (EReference) impactConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImpactConfiguration_Impact() {
		return (EReference) impactConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalControl() {
		return externalControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThreatsOwner() {
		return threatsOwnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreatsOwner_Internals() {
		return (EReference) threatsOwnerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreatsOwner_Externals() {
		return (EReference) threatsOwnerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getControlOwner() {
		return controlOwnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlOwner_Internals() {
		return (EReference) controlOwnerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlOwner_Externals() {
		return (EReference) controlOwnerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractControlOwner() {
		return abstractControlOwnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractControlOwner_ControlOwner() {
		return (EReference) abstractControlOwnerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractControlOwner__GetAllControls() {
		return abstractControlOwnerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractControlOwner__GetExternalControls__String_String() {
		return abstractControlOwnerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataOwner() {
		return dataOwnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataOwner_Data() {
		return (EReference) dataOwnerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLink_LinkType() {
		return (EReference) linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLink_LinkConveyed() {
		return (EReference) linkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLink_ConveyingLink() {
		return (EReference) linkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLink_Components() {
		return (EReference) linkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLinkType() {
		return linkTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCatalog() {
		return catalogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractThreatOwner() {
		return abstractThreatOwnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractThreatOwner_ThreatOwner() {
		return (EReference) abstractThreatOwnerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractVulnerabilityOwner() {
		return abstractVulnerabilityOwnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractVulnerabilityOwner_VulnerabilityOwner() {
		return (EReference) abstractVulnerabilityOwnerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIThreatDefinition() {
		return iThreatDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIThreatDefinition__GetId() {
		return iThreatDefinitionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIThreatDefinition__GetDescription() {
		return iThreatDefinitionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIThreatDefinition__GetName() {
		return iThreatDefinitionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIControlDefinition() {
		return iControlDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIControlDefinition__GetDescription() {
		return iControlDefinitionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIControlDefinition__GetId() {
		return iControlDefinitionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIControlDefinition__GetMitigatedThreatDefinitions() {
		return iControlDefinitionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIControlDefinition__GetName() {
		return iControlDefinitionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getICatalogDefinition() {
		return iCatalogDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getICatalogDefinition__GetThreatById__String() {
		return iCatalogDefinitionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getICatalogDefinition__GetControlById__String() {
		return iCatalogDefinitionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getICatalogDefinition__GetThreatDefinitions() {
		return iCatalogDefinitionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getICatalogDefinition__GetControlDefinitions() {
		return iCatalogDefinitionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getICatalogDefinition__GetIdentifier() {
		return iCatalogDefinitionEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getICatalogDefinition__GetName() {
		return iCatalogDefinitionEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getICatalogDefinition__GetRuleById__String() {
		return iCatalogDefinitionEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getICatalogDefinition__GetVulnerabilityById__String() {
		return iCatalogDefinitionEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getICatalogDefinition__GetComponentTypeById__String() {
		return iCatalogDefinitionEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIMitigationLink() {
		return iMitigationLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIMitigationLink__GetDescription() {
		return iMitigationLinkEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIMitigationLink__GetThreat() {
		return iMitigationLinkEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getColoredElement() {
		return coloredElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColoredElement_Color() {
		return (EAttribute) coloredElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIElementWithSource() {
		return iElementWithSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIElementWithSource__GetSourceName() {
		return iElementWithSourceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIElementWithSource__GetSourceIdentifier() {
		return iElementWithSourceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElementWithId() {
		return elementWithIdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElementWithId_Id() {
		return (EAttribute) elementWithIdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDomainAsset() {
		return domainAssetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainAsset_Category() {
		return (EAttribute) domainAssetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVulnerabilityOwner() {
		return vulnerabilityOwnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVulnerabilityOwner_Vulnerabilities() {
		return (EReference) vulnerabilityOwnerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVulnerability() {
		return vulnerabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVulnerability_Manifests() {
		return (EReference) vulnerabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVulnerability_Affects() {
		return (EReference) vulnerabilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVulnerability_VulnerabilityType() {
		return (EAttribute) vulnerabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractComponentTypeOwner() {
		return abstractComponentTypeOwnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractComponentTypeOwner_ComponentTypeOwner() {
		return (EReference) abstractComponentTypeOwnerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentTypeOwner() {
		return componentTypeOwnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentTypeOwner_ComponentTypes() {
		return (EReference) componentTypeOwnerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentType() {
		return componentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentType_Manifests() {
		return (EReference) componentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentType_SubjectToThreats() {
		return (EReference) componentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentType_AffectedBy() {
		return (EReference) componentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAsset() {
		return assetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractRuleOwner() {
		return abstractRuleOwnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractRuleOwner_RuleOwner() {
		return (EReference) abstractRuleOwnerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRuleOwner() {
		return ruleOwnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRuleOwner_Rules() {
		return (EReference) ruleOwnerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRule() {
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRule_Vulnerabilities() {
		return (EReference) ruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRule_ComponentTypesAffected() {
		return (EReference) ruleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRule_Controls() {
		return (EReference) ruleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCharacteristic() {
		return characteristicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCharacteristic_Label() {
		return (EAttribute) characteristicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCharacteristic_Value() {
		return (EAttribute) characteristicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCharacteristic_Options() {
		return (EAttribute) characteristicEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCharacteristicOwner() {
		return characteristicOwnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCharacteristicOwner_Characteristics() {
		return (EReference) characteristicOwnerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAssessmentENUM() {
		return assessmentENUMEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAffectedENUM() {
		return affectedENUMEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getthreatTypeENUM() {
		return threatTypeENUMEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getControlStatusENUM() {
		return controlStatusENUMEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getComponentCategoryENUM() {
		return componentCategoryENUMEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSecurityObjectiveENUM() {
		return securityObjectiveENUMEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getVulnerabilityTypeENUM() {
		return vulnerabilityTypeENUMEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRGBColor() {
		return rgbColorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TRADESFactory getTRADESFactory() {
		return (TRADESFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		analysisEClass = createEClass(ANALYSIS);
		createEReference(analysisEClass, ANALYSIS__SCORE_SYSTEM);
		createEReference(analysisEClass, ANALYSIS__LINK_TYPES);
		createEAttribute(analysisEClass, ANALYSIS__NVDAPI_KEY);
		createEAttribute(analysisEClass, ANALYSIS__PROPERTY_VULNERABILITY_MITIGATION_RULES_AVAILABLE);
		createEAttribute(analysisEClass, ANALYSIS__PROPERTY_WEAKNESS_MITIGATION_RULES_AVAILABLE);
		createEAttribute(analysisEClass, ANALYSIS__PROPERTY_DESIGN_ADDRESSES_VULNERABILITIES);
		createEAttribute(analysisEClass, ANALYSIS__PROPERTY_DESIGN_ADDRESSES_WEAKNESSES);
		createEReference(analysisEClass, ANALYSIS__VULNERABILITIES_UNCOVERED_BY_RULE);
		createEReference(analysisEClass, ANALYSIS__WEAKNESSES_UNCOVERED_BY_RULE);
		createEReference(analysisEClass, ANALYSIS__VULNERABLE_COMPONENTS);
		createEOperation(analysisEClass, ANALYSIS___GET_EXTERNAL_THREATS__STRING_STRING);
		createEOperation(analysisEClass, ANALYSIS___DIRECT_RULE_EXISTS__VULNERABILITY_COMPONENTTYPE);
		createEOperation(analysisEClass, ANALYSIS___PROXY_RULE_EXISTS__VULNERABILITY_COMPONENTTYPE);
		createEOperation(analysisEClass, ANALYSIS___RULE_EXISTS__VULNERABILITY_COMPONENTTYPE);

		threatEClass = createEClass(THREAT);
		createEReference(threatEClass, THREAT__THREAT_ALLOCATIONS);
		createEAttribute(threatEClass, THREAT__THREAT_TYPE);
		createEAttribute(threatEClass, THREAT__DESCRIPTION);
		createEAttribute(threatEClass, THREAT__APPLICABILITY);
		createEReference(threatEClass, THREAT__EXPLOITS_VULNERABILITY);
		createEReference(threatEClass, THREAT__REFINES);
		createEOperation(threatEClass, THREAT___CHECK_IS_USED__DIAGNOSTICCHAIN_MAP);

		componentEClass = createEClass(COMPONENT);
		createEReference(componentEClass, COMPONENT__THREAT_ALLOCATIONS);
		createEReference(componentEClass, COMPONENT__AFFECT_RELATIONS);
		createEReference(componentEClass, COMPONENT__LINKS);
		createEReference(componentEClass, COMPONENT__COMPONENT_TYPES);
		createEReference(componentEClass, COMPONENT__RULES);
		createEReference(componentEClass, COMPONENT__ASSIGNED_CONTROLS);
		createEAttribute(componentEClass, COMPONENT__VULNERABLE);
		createEReference(componentEClass, COMPONENT__CVA);
		createEReference(componentEClass, COMPONENT__CWA);
		createEReference(componentEClass, COMPONENT__ASSOCIATED_CONTROLS);
		createEReference(componentEClass, COMPONENT__UNMITIGATED_VULNERABILITIES);
		createEReference(componentEClass, COMPONENT__UNMITIGATED_WEAKNESSES);
		createEOperation(componentEClass, COMPONENT___OF_TYPE__COMPONENTTYPE);
		createEOperation(componentEClass, COMPONENT___MITIGATED_V__VULNERABILITY);
		createEOperation(componentEClass, COMPONENT___MITIGATED_W__VULNERABILITY);
		createEOperation(componentEClass, COMPONENT___MITIGATED_BY_W__VULNERABILITY);
		createEOperation(componentEClass, COMPONENT___MITIGATED__VULNERABILITY);
		createEOperation(componentEClass, COMPONENT___VULNERABLE_W);
		createEOperation(componentEClass, COMPONENT___VULNERABLE_V);

		controlEClass = createEClass(CONTROL);
		createEReference(controlEClass, CONTROL__MITIGATED_THREATS);
		createEAttribute(controlEClass, CONTROL__DESCRIPTION);
		createEAttribute(controlEClass, CONTROL__DESCRIPTION_WITH_PLACEHOLDERS);
		createEReference(controlEClass, CONTROL__MITIGATION_RELATIONS);
		createEAttribute(controlEClass, CONTROL__STATUS);
		createEReference(controlEClass, CONTROL__MITIGATES_VULNERABILITY);
		createEAttribute(controlEClass, CONTROL__SECURITY_OBJECTIVE);

		threatAllocationRelationEClass = createEClass(THREAT_ALLOCATION_RELATION);
		createEAttribute(threatAllocationRelationEClass, THREAT_ALLOCATION_RELATION__ASSESSMENT);
		createEReference(threatAllocationRelationEClass, THREAT_ALLOCATION_RELATION__COMPONENT);
		createEReference(threatAllocationRelationEClass, THREAT_ALLOCATION_RELATION__THREAT);
		createEReference(threatAllocationRelationEClass, THREAT_ALLOCATION_RELATION__IMPACT_SCORE);
		createEReference(threatAllocationRelationEClass, THREAT_ALLOCATION_RELATION__DIFFICULTY_SCORE);
		createEReference(threatAllocationRelationEClass, THREAT_ALLOCATION_RELATION__ATTACK_CHAIN);
		createEAttribute(threatAllocationRelationEClass, THREAT_ALLOCATION_RELATION__MITIGATED);
		createEOperation(threatAllocationRelationEClass,
				THREAT_ALLOCATION_RELATION___CHECK_COMPUTED_DIFFICULTY_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
		createEOperation(threatAllocationRelationEClass, THREAT_ALLOCATION_RELATION___MITIGATED_AV);
		createEOperation(threatAllocationRelationEClass, THREAT_ALLOCATION_RELATION___MITIGATED_AW);
		createEOperation(threatAllocationRelationEClass, THREAT_ALLOCATION_RELATION___MITIGATED_VSTEPS);
		createEOperation(threatAllocationRelationEClass, THREAT_ALLOCATION_RELATION___MITIGATED_WSTEPS);
		createEOperation(threatAllocationRelationEClass, THREAT_ALLOCATION_RELATION___MITIGATED_V);
		createEOperation(threatAllocationRelationEClass, THREAT_ALLOCATION_RELATION___MITIGATED_W);

		threatMitigationRelationEClass = createEClass(THREAT_MITIGATION_RELATION);
		createEAttribute(threatMitigationRelationEClass, THREAT_MITIGATION_RELATION__ASSESSMENT);
		createEReference(threatMitigationRelationEClass, THREAT_MITIGATION_RELATION__CONTROL);
		createEReference(threatMitigationRelationEClass, THREAT_MITIGATION_RELATION__THREAT);
		createEReference(threatMitigationRelationEClass, THREAT_MITIGATION_RELATION__MITIGATED_ALLOCATION);
		createEAttribute(threatMitigationRelationEClass, THREAT_MITIGATION_RELATION__DESCRIPTION);

		dataEClass = createEClass(DATA);

		affectRelationEClass = createEClass(AFFECT_RELATION);
		createEReference(affectRelationEClass, AFFECT_RELATION__DATA);
		createEReference(affectRelationEClass, AFFECT_RELATION__SOURCE_COMPONENT);
		createEReference(affectRelationEClass, AFFECT_RELATION__TARGET_COMPONENT);
		createEAttribute(affectRelationEClass, AFFECT_RELATION__ANALYSIS_STATUS);
		createEReference(affectRelationEClass, AFFECT_RELATION__LINK);
		createEOperation(affectRelationEClass, AFFECT_RELATION___CHECK_DATA_SCOPE__DIAGNOSTICCHAIN_MAP);

		attackChainEClass = createEClass(ATTACK_CHAIN);
		createEReference(attackChainEClass, ATTACK_CHAIN__ATTACK_CHAIN_STEPS);
		createEAttribute(attackChainEClass, ATTACK_CHAIN__COMPUTED_DIFFICULTY);

		attackChainStepEClass = createEClass(ATTACK_CHAIN_STEP);
		createEAttribute(attackChainStepEClass, ATTACK_CHAIN_STEP__STEP_NUM);
		createEReference(attackChainStepEClass, ATTACK_CHAIN_STEP__THREAT_ALLOCATION_RELATION);
		createEAttribute(attackChainStepEClass, ATTACK_CHAIN_STEP__IMPACT_DESCRIPTION);
		createEReference(attackChainStepEClass, ATTACK_CHAIN_STEP__NEXT);
		createEReference(attackChainStepEClass, ATTACK_CHAIN_STEP__PREVIOUS);
		createEOperation(attackChainStepEClass, ATTACK_CHAIN_STEP___GET_THREAT_ALLOCATION_RELATION_CANDIDATES);
		createEOperation(attackChainStepEClass, ATTACK_CHAIN_STEP___CHECK_ALLOCATION_VALUE__DIAGNOSTICCHAIN_MAP);

		scoreSystemEClass = createEClass(SCORE_SYSTEM);
		createEReference(scoreSystemEClass, SCORE_SYSTEM__IMPACT_SCORES);
		createEReference(scoreSystemEClass, SCORE_SYSTEM__DIFFICULTY_SCORES);

		impactScoreEClass = createEClass(IMPACT_SCORE);
		createEAttribute(impactScoreEClass, IMPACT_SCORE__IMPACT);
		createEReference(impactScoreEClass, IMPACT_SCORE__CONFIGURATIONS);

		difficultyScoreEClass = createEClass(DIFFICULTY_SCORE);
		createEAttribute(difficultyScoreEClass, DIFFICULTY_SCORE__DIFFICULTY);

		dataOwnerElementEClass = createEClass(DATA_OWNER_ELEMENT);
		createEReference(dataOwnerElementEClass, DATA_OWNER_ELEMENT__DATA_OWNER);
		createEOperation(dataOwnerElementEClass, DATA_OWNER_ELEMENT___GET_DATAS);
		createEOperation(dataOwnerElementEClass, DATA_OWNER_ELEMENT___GET_INHERITED_DATAS);
		createEOperation(dataOwnerElementEClass, DATA_OWNER_ELEMENT___GET_ALL_DATAS);

		componentOwnerEClass = createEClass(COMPONENT_OWNER);
		createEReference(componentOwnerEClass, COMPONENT_OWNER__COMPONENTS);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		externalThreatEClass = createEClass(EXTERNAL_THREAT);

		externalElementEClass = createEClass(EXTERNAL_ELEMENT);
		createEAttribute(externalElementEClass, EXTERNAL_ELEMENT__SOURCE);
		createEAttribute(externalElementEClass, EXTERNAL_ELEMENT__LINK);
		createEAttribute(externalElementEClass, EXTERNAL_ELEMENT__SOURCE_ID);

		impactConfigurationEClass = createEClass(IMPACT_CONFIGURATION);
		createEReference(impactConfigurationEClass, IMPACT_CONFIGURATION__DIFFICULTY);
		createEReference(impactConfigurationEClass, IMPACT_CONFIGURATION__IMPACT);

		externalControlEClass = createEClass(EXTERNAL_CONTROL);

		threatsOwnerEClass = createEClass(THREATS_OWNER);
		createEReference(threatsOwnerEClass, THREATS_OWNER__INTERNALS);
		createEReference(threatsOwnerEClass, THREATS_OWNER__EXTERNALS);

		controlOwnerEClass = createEClass(CONTROL_OWNER);
		createEReference(controlOwnerEClass, CONTROL_OWNER__INTERNALS);
		createEReference(controlOwnerEClass, CONTROL_OWNER__EXTERNALS);

		abstractControlOwnerEClass = createEClass(ABSTRACT_CONTROL_OWNER);
		createEReference(abstractControlOwnerEClass, ABSTRACT_CONTROL_OWNER__CONTROL_OWNER);
		createEOperation(abstractControlOwnerEClass, ABSTRACT_CONTROL_OWNER___GET_ALL_CONTROLS);
		createEOperation(abstractControlOwnerEClass, ABSTRACT_CONTROL_OWNER___GET_EXTERNAL_CONTROLS__STRING_STRING);

		dataOwnerEClass = createEClass(DATA_OWNER);
		createEReference(dataOwnerEClass, DATA_OWNER__DATA);

		linkEClass = createEClass(LINK);
		createEReference(linkEClass, LINK__LINK_TYPE);
		createEReference(linkEClass, LINK__LINK_CONVEYED);
		createEReference(linkEClass, LINK__CONVEYING_LINK);
		createEReference(linkEClass, LINK__COMPONENTS);

		linkTypeEClass = createEClass(LINK_TYPE);

		catalogEClass = createEClass(CATALOG);

		abstractThreatOwnerEClass = createEClass(ABSTRACT_THREAT_OWNER);
		createEReference(abstractThreatOwnerEClass, ABSTRACT_THREAT_OWNER__THREAT_OWNER);

		iThreatDefinitionEClass = createEClass(ITHREAT_DEFINITION);
		createEOperation(iThreatDefinitionEClass, ITHREAT_DEFINITION___GET_ID);
		createEOperation(iThreatDefinitionEClass, ITHREAT_DEFINITION___GET_DESCRIPTION);
		createEOperation(iThreatDefinitionEClass, ITHREAT_DEFINITION___GET_NAME);

		iControlDefinitionEClass = createEClass(ICONTROL_DEFINITION);
		createEOperation(iControlDefinitionEClass, ICONTROL_DEFINITION___GET_DESCRIPTION);
		createEOperation(iControlDefinitionEClass, ICONTROL_DEFINITION___GET_ID);
		createEOperation(iControlDefinitionEClass, ICONTROL_DEFINITION___GET_MITIGATED_THREAT_DEFINITIONS);
		createEOperation(iControlDefinitionEClass, ICONTROL_DEFINITION___GET_NAME);

		iCatalogDefinitionEClass = createEClass(ICATALOG_DEFINITION);
		createEOperation(iCatalogDefinitionEClass, ICATALOG_DEFINITION___GET_THREAT_BY_ID__STRING);
		createEOperation(iCatalogDefinitionEClass, ICATALOG_DEFINITION___GET_CONTROL_BY_ID__STRING);
		createEOperation(iCatalogDefinitionEClass, ICATALOG_DEFINITION___GET_THREAT_DEFINITIONS);
		createEOperation(iCatalogDefinitionEClass, ICATALOG_DEFINITION___GET_CONTROL_DEFINITIONS);
		createEOperation(iCatalogDefinitionEClass, ICATALOG_DEFINITION___GET_IDENTIFIER);
		createEOperation(iCatalogDefinitionEClass, ICATALOG_DEFINITION___GET_NAME);
		createEOperation(iCatalogDefinitionEClass, ICATALOG_DEFINITION___GET_RULE_BY_ID__STRING);
		createEOperation(iCatalogDefinitionEClass, ICATALOG_DEFINITION___GET_VULNERABILITY_BY_ID__STRING);
		createEOperation(iCatalogDefinitionEClass, ICATALOG_DEFINITION___GET_COMPONENT_TYPE_BY_ID__STRING);

		iMitigationLinkEClass = createEClass(IMITIGATION_LINK);
		createEOperation(iMitigationLinkEClass, IMITIGATION_LINK___GET_DESCRIPTION);
		createEOperation(iMitigationLinkEClass, IMITIGATION_LINK___GET_THREAT);

		coloredElementEClass = createEClass(COLORED_ELEMENT);
		createEAttribute(coloredElementEClass, COLORED_ELEMENT__COLOR);

		iElementWithSourceEClass = createEClass(IELEMENT_WITH_SOURCE);
		createEOperation(iElementWithSourceEClass, IELEMENT_WITH_SOURCE___GET_SOURCE_NAME);
		createEOperation(iElementWithSourceEClass, IELEMENT_WITH_SOURCE___GET_SOURCE_IDENTIFIER);

		elementWithIdEClass = createEClass(ELEMENT_WITH_ID);
		createEAttribute(elementWithIdEClass, ELEMENT_WITH_ID__ID);

		domainAssetEClass = createEClass(DOMAIN_ASSET);
		createEAttribute(domainAssetEClass, DOMAIN_ASSET__CATEGORY);

		abstractVulnerabilityOwnerEClass = createEClass(ABSTRACT_VULNERABILITY_OWNER);
		createEReference(abstractVulnerabilityOwnerEClass, ABSTRACT_VULNERABILITY_OWNER__VULNERABILITY_OWNER);

		vulnerabilityOwnerEClass = createEClass(VULNERABILITY_OWNER);
		createEReference(vulnerabilityOwnerEClass, VULNERABILITY_OWNER__VULNERABILITIES);

		vulnerabilityEClass = createEClass(VULNERABILITY);
		createEReference(vulnerabilityEClass, VULNERABILITY__MANIFESTS);
		createEAttribute(vulnerabilityEClass, VULNERABILITY__VULNERABILITY_TYPE);
		createEReference(vulnerabilityEClass, VULNERABILITY__AFFECTS);

		abstractComponentTypeOwnerEClass = createEClass(ABSTRACT_COMPONENT_TYPE_OWNER);
		createEReference(abstractComponentTypeOwnerEClass, ABSTRACT_COMPONENT_TYPE_OWNER__COMPONENT_TYPE_OWNER);

		componentTypeOwnerEClass = createEClass(COMPONENT_TYPE_OWNER);
		createEReference(componentTypeOwnerEClass, COMPONENT_TYPE_OWNER__COMPONENT_TYPES);

		componentTypeEClass = createEClass(COMPONENT_TYPE);
		createEReference(componentTypeEClass, COMPONENT_TYPE__MANIFESTS);
		createEReference(componentTypeEClass, COMPONENT_TYPE__SUBJECT_TO_THREATS);
		createEReference(componentTypeEClass, COMPONENT_TYPE__AFFECTED_BY);

		assetEClass = createEClass(ASSET);

		abstractRuleOwnerEClass = createEClass(ABSTRACT_RULE_OWNER);
		createEReference(abstractRuleOwnerEClass, ABSTRACT_RULE_OWNER__RULE_OWNER);

		ruleOwnerEClass = createEClass(RULE_OWNER);
		createEReference(ruleOwnerEClass, RULE_OWNER__RULES);

		ruleEClass = createEClass(RULE);
		createEReference(ruleEClass, RULE__VULNERABILITIES);
		createEReference(ruleEClass, RULE__COMPONENT_TYPES_AFFECTED);
		createEReference(ruleEClass, RULE__CONTROLS);

		characteristicEClass = createEClass(CHARACTERISTIC);
		createEAttribute(characteristicEClass, CHARACTERISTIC__LABEL);
		createEAttribute(characteristicEClass, CHARACTERISTIC__VALUE);
		createEAttribute(characteristicEClass, CHARACTERISTIC__OPTIONS);

		characteristicOwnerEClass = createEClass(CHARACTERISTIC_OWNER);
		createEReference(characteristicOwnerEClass, CHARACTERISTIC_OWNER__CHARACTERISTICS);

		// Create enums
		assessmentENUMEEnum = createEEnum(ASSESSMENT_ENUM);
		affectedENUMEEnum = createEEnum(AFFECTED_ENUM);
		threatTypeENUMEEnum = createEEnum(THREAT_TYPE_ENUM);
		controlStatusENUMEEnum = createEEnum(CONTROL_STATUS_ENUM);
		componentCategoryENUMEEnum = createEEnum(COMPONENT_CATEGORY_ENUM);
		securityObjectiveENUMEEnum = createEEnum(SECURITY_OBJECTIVE_ENUM);
		vulnerabilityTypeENUMEEnum = createEEnum(VULNERABILITY_TYPE_ENUM);

		// Create data types
		rgbColorEDataType = createEDataType(RGB_COLOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		analysisEClass.getESuperTypes().add(this.getComponentOwner());
		analysisEClass.getESuperTypes().add(this.getDataOwnerElement());
		analysisEClass.getESuperTypes().add(this.getNamedElement());
		analysisEClass.getESuperTypes().add(this.getAbstractControlOwner());
		analysisEClass.getESuperTypes().add(this.getAbstractThreatOwner());
		analysisEClass.getESuperTypes().add(this.getElementWithId());
		analysisEClass.getESuperTypes().add(this.getAbstractVulnerabilityOwner());
		analysisEClass.getESuperTypes().add(this.getAbstractComponentTypeOwner());
		analysisEClass.getESuperTypes().add(this.getAbstractRuleOwner());
		threatEClass.getESuperTypes().add(this.getNamedElement());
		threatEClass.getESuperTypes().add(this.getIThreatDefinition());
		threatEClass.getESuperTypes().add(this.getElementWithId());
		componentEClass.getESuperTypes().add(this.getComponentOwner());
		componentEClass.getESuperTypes().add(this.getDataOwnerElement());
		componentEClass.getESuperTypes().add(this.getNamedElement());
		componentEClass.getESuperTypes().add(this.getAbstractControlOwner());
		componentEClass.getESuperTypes().add(this.getDomainAsset());
		controlEClass.getESuperTypes().add(this.getNamedElement());
		controlEClass.getESuperTypes().add(this.getIControlDefinition());
		controlEClass.getESuperTypes().add(this.getElementWithId());
		controlEClass.getESuperTypes().add(this.getCharacteristicOwner());
		threatMitigationRelationEClass.getESuperTypes().add(this.getIMitigationLink());
		dataEClass.getESuperTypes().add(this.getNamedElement());
		dataEClass.getESuperTypes().add(this.getDomainAsset());
		affectRelationEClass.getESuperTypes().add(this.getNamedElement());
		attackChainEClass.getESuperTypes().add(this.getNamedElement());
		scoreSystemEClass.getESuperTypes().add(this.getNamedElement());
		impactScoreEClass.getESuperTypes().add(this.getNamedElement());
		difficultyScoreEClass.getESuperTypes().add(this.getNamedElement());
		externalThreatEClass.getESuperTypes().add(this.getThreat());
		externalThreatEClass.getESuperTypes().add(this.getExternalElement());
		impactConfigurationEClass.getESuperTypes().add(this.getColoredElement());
		externalControlEClass.getESuperTypes().add(this.getExternalElement());
		externalControlEClass.getESuperTypes().add(this.getControl());
		linkEClass.getESuperTypes().add(this.getNamedElement());
		linkTypeEClass.getESuperTypes().add(this.getNamedElement());
		linkTypeEClass.getESuperTypes().add(this.getColoredElement());
		catalogEClass.getESuperTypes().add(this.getAbstractThreatOwner());
		catalogEClass.getESuperTypes().add(this.getAbstractControlOwner());
		catalogEClass.getESuperTypes().add(this.getNamedElement());
		catalogEClass.getESuperTypes().add(this.getICatalogDefinition());
		catalogEClass.getESuperTypes().add(this.getElementWithId());
		catalogEClass.getESuperTypes().add(this.getAbstractVulnerabilityOwner());
		catalogEClass.getESuperTypes().add(this.getAbstractRuleOwner());
		catalogEClass.getESuperTypes().add(this.getAbstractComponentTypeOwner());
		iThreatDefinitionEClass.getESuperTypes().add(this.getIElementWithSource());
		iControlDefinitionEClass.getESuperTypes().add(this.getIElementWithSource());
		domainAssetEClass.getESuperTypes().add(this.getAsset());
		vulnerabilityEClass.getESuperTypes().add(this.getNamedElement());
		vulnerabilityEClass.getESuperTypes().add(this.getElementWithId());
		componentTypeEClass.getESuperTypes().add(this.getNamedElement());
		componentTypeEClass.getESuperTypes().add(this.getElementWithId());
		assetEClass.getESuperTypes().add(this.getNamedElement());
		ruleEClass.getESuperTypes().add(this.getAsset());
		ruleEClass.getESuperTypes().add(this.getElementWithId());
		characteristicEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(analysisEClass, Analysis.class, "Analysis", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnalysis_ScoreSystem(), this.getScoreSystem(), null, "scoreSystem", null, 0, 1,
				Analysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysis_LinkTypes(), this.getLinkType(), null, "linkTypes", null, 0, -1, Analysis.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalysis_NVDAPIKey(), ecorePackage.getEString(), "nVDAPIKey", null, 0, 1, Analysis.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalysis_Property_VulnerabilityMitigationRulesAvailable(), ecorePackage.getEBoolean(),
				"property_VulnerabilityMitigationRulesAvailable", null, 0, 1, Analysis.class, IS_TRANSIENT, IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalysis_Property_WeaknessMitigationRulesAvailable(), ecorePackage.getEBoolean(),
				"property_WeaknessMitigationRulesAvailable", null, 0, 1, Analysis.class, IS_TRANSIENT, IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalysis_Property_DesignAddressesVulnerabilities(), ecorePackage.getEBoolean(),
				"property_DesignAddressesVulnerabilities", null, 0, 1, Analysis.class, IS_TRANSIENT, IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalysis_Property_DesignAddressesWeaknesses(), ecorePackage.getEBoolean(),
				"property_DesignAddressesWeaknesses", null, 0, 1, Analysis.class, IS_TRANSIENT, IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysis_VulnerabilitiesUncoveredByRule(), this.getVulnerability(), null,
				"vulnerabilitiesUncoveredByRule", null, 0, -1, Analysis.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysis_WeaknessesUncoveredByRule(), this.getVulnerability(), null,
				"weaknessesUncoveredByRule", null, 0, -1, Analysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysis_VulnerableComponents(), this.getComponent(), null, "vulnerableComponents", null, 0,
				-1, Analysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getAnalysis__GetExternalThreats__String_String(), this.getExternalThreat(),
				"getExternalThreats", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "catalogIdentifier", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAnalysis__DirectRuleExists__Vulnerability_ComponentType(), ecorePackage.getEBoolean(),
				"directRuleExists", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVulnerability(), "vulnerability", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getComponentType(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAnalysis__ProxyRuleExists__Vulnerability_ComponentType(), ecorePackage.getEBoolean(),
				"proxyRuleExists", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVulnerability(), "vulnerability", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getComponentType(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAnalysis__RuleExists__Vulnerability_ComponentType(), ecorePackage.getEBoolean(),
				"ruleExists", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVulnerability(), "vulnerability", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getComponentType(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(threatEClass, Threat.class, "Threat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getThreat_ThreatAllocations(), this.getThreatAllocationRelation(),
				this.getThreatAllocationRelation_Threat(), "threatAllocations", null, 0, -1, Threat.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreat_ThreatType(), this.getthreatTypeENUM(), "threatType", null, 0, 1, Threat.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreat_Description(), ecorePackage.getEString(), "description", null, 0, 1, Threat.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreat_Applicability(), ecorePackage.getEString(), "applicability", null, 0, 1, Threat.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThreat_ExploitsVulnerability(), this.getVulnerability(), null, "exploitsVulnerability", null,
				0, -1, Threat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThreat_Refines(), this.getThreat(), null, "refines", null, 0, -1, Threat.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		op = initEOperation(getThreat__CheckIsUsed__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "checkIsUsed", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "chain", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEMap(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponent_ThreatAllocations(), this.getThreatAllocationRelation(),
				this.getThreatAllocationRelation_Component(), "threatAllocations", null, 0, -1, Component.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_AffectRelations(), this.getAffectRelation(),
				this.getAffectRelation_SourceComponent(), "affectRelations", null, 0, -1, Component.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Links(), this.getLink(), null, "links", null, 0, -1, Component.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getComponent_ComponentTypes(), this.getComponentType(), null, "componentTypes", null, 1, -1,
				Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Rules(), this.getRule(), null, "rules", null, 0, -1, Component.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED,
				IS_ORDERED);
		initEReference(getComponent_AssignedControls(), this.getControl(), null, "assignedControls", null, 0, -1,
				Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_Vulnerable(), ecorePackage.getEBoolean(), "vulnerable", null, 0, 1, Component.class,
				IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_CVA(), this.getVulnerability(), null, "cVA", null, 0, -1, Component.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_CWA(), this.getVulnerability(), null, "cWA", null, 0, -1, Component.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_AssociatedControls(), this.getControl(), null, "associatedControls", null, 0, -1,
				Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_UnmitigatedVulnerabilities(), this.getVulnerability(), null,
				"unmitigatedVulnerabilities", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_UnmitigatedWeaknesses(), this.getVulnerability(), null, "unmitigatedWeaknesses",
				null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getComponent__OfType__ComponentType(), ecorePackage.getEBoolean(), "ofType", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getComponentType(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComponent__MitigatedV__Vulnerability(), ecorePackage.getEBoolean(), "mitigatedV", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVulnerability(), "vulnerability", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComponent__MitigatedW__Vulnerability(), ecorePackage.getEBoolean(), "mitigatedW", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVulnerability(), "weakness", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComponent__MitigatedByW__Vulnerability(), ecorePackage.getEBoolean(), "mitigatedByW", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVulnerability(), "vulnerability", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComponent__Mitigated__Vulnerability(), ecorePackage.getEBoolean(), "mitigated", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVulnerability(), "vulnerability", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getComponent__VulnerableW(), ecorePackage.getEBoolean(), "vulnerableW", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getComponent__VulnerableV(), ecorePackage.getEBoolean(), "vulnerableV", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(controlEClass, Control.class, "Control", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControl_MitigatedThreats(), this.getThreat(), null, "mitigatedThreats", null, 0, -1,
				Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControl_Description(), ecorePackage.getEString(), "description", null, 0, 1, Control.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControl_DescriptionWithPlaceholders(), ecorePackage.getEString(),
				"descriptionWithPlaceholders", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControl_MitigationRelations(), this.getThreatMitigationRelation(),
				this.getThreatMitigationRelation_Control(), "mitigationRelations", null, 0, -1, Control.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControl_Status(), this.getControlStatusENUM(), "status", null, 0, 1, Control.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControl_MitigatesVulnerability(), this.getVulnerability(), null, "mitigatesVulnerability",
				null, 0, -1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControl_SecurityObjective(), this.getSecurityObjectiveENUM(), "securityObjective",
				"Undefined", 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(threatAllocationRelationEClass, ThreatAllocationRelation.class, "ThreatAllocationRelation",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThreatAllocationRelation_Assessment(), this.getAssessmentENUM(), "assessment", "Undecided", 1,
				1, ThreatAllocationRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThreatAllocationRelation_Component(), this.getComponent(),
				this.getComponent_ThreatAllocations(), "component", null, 1, 1, ThreatAllocationRelation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThreatAllocationRelation_Threat(), this.getThreat(), this.getThreat_ThreatAllocations(),
				"threat", null, 1, 1, ThreatAllocationRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThreatAllocationRelation_ImpactScore(), this.getImpactScore(), null, "impactScore", null, 0,
				1, ThreatAllocationRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThreatAllocationRelation_DifficultyScore(), this.getDifficultyScore(), null,
				"difficultyScore", null, 0, 1, ThreatAllocationRelation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThreatAllocationRelation_AttackChain(), this.getAttackChain(), null, "attackChain", null, 0,
				1, ThreatAllocationRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreatAllocationRelation_Mitigated(), ecorePackage.getEBoolean(), "mitigated", null, 0, 1,
				ThreatAllocationRelation.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getThreatAllocationRelation__CheckComputedDifficultyConstraint__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "checkComputedDifficultyConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "chain", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEMap(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getThreatAllocationRelation__MitigatedAV(), ecorePackage.getEBoolean(), "mitigatedAV", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getThreatAllocationRelation__MitigatedAW(), ecorePackage.getEBoolean(), "mitigatedAW", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getThreatAllocationRelation__MitigatedVSteps(), ecorePackage.getEBoolean(), "mitigatedVSteps", 0,
				1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getThreatAllocationRelation__MitigatedWSteps(), ecorePackage.getEBoolean(), "mitigatedWSteps", 0,
				1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getThreatAllocationRelation__MitigatedV(), ecorePackage.getEBoolean(), "mitigatedV", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getThreatAllocationRelation__MitigatedW(), ecorePackage.getEBoolean(), "mitigatedW", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(threatMitigationRelationEClass, ThreatMitigationRelation.class, "ThreatMitigationRelation",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThreatMitigationRelation_Assessment(), this.getAssessmentENUM(), "assessment", "Undecided", 1,
				1, ThreatMitigationRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThreatMitigationRelation_Control(), this.getControl(), this.getControl_MitigationRelations(),
				"control", null, 1, 1, ThreatMitigationRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThreatMitigationRelation_Threat(), this.getThreat(), null, "threat", null, 0, 1,
				ThreatMitigationRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThreatMitigationRelation_MitigatedAllocation(), this.getThreatAllocationRelation(), null,
				"mitigatedAllocation", null, 0, 1, ThreatMitigationRelation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreatMitigationRelation_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				ThreatMitigationRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataEClass, Data.class, "Data", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(affectRelationEClass, AffectRelation.class, "AffectRelation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAffectRelation_Data(), this.getData(), null, "data", null, 0, -1, AffectRelation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAffectRelation_SourceComponent(), this.getComponent(), this.getComponent_AffectRelations(),
				"sourceComponent", null, 1, 1, AffectRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAffectRelation_TargetComponent(), this.getComponent(), null, "targetComponent", null, 1, 1,
				AffectRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAffectRelation_AnalysisStatus(), this.getAffectedENUM(), "analysisStatus", "Confirmed", 1, 1,
				AffectRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getAffectRelation_Link(), this.getLink(), null, "link", null, 0, 1, AffectRelation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getAffectRelation__CheckDataScope__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"checkDataScope", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "chain", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEMap(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(attackChainEClass, AttackChain.class, "AttackChain", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttackChain_AttackChainSteps(), this.getAttackChainStep(), null, "attackChainSteps", null, 0,
				-1, AttackChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttackChain_ComputedDifficulty(), ecorePackage.getEInt(), "computedDifficulty", null, 0, 1,
				AttackChain.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				IS_DERIVED, IS_ORDERED);

		initEClass(attackChainStepEClass, AttackChainStep.class, "AttackChainStep", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttackChainStep_StepNum(), ecorePackage.getEString(), "stepNum", null, 0, 1,
				AttackChainStep.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				IS_DERIVED, IS_ORDERED);
		initEReference(getAttackChainStep_ThreatAllocationRelation(), this.getThreatAllocationRelation(), null,
				"threatAllocationRelation", null, 0, 1, AttackChainStep.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttackChainStep_ImpactDescription(), ecorePackage.getEString(), "impactDescription", null, 0,
				1, AttackChainStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getAttackChainStep_Next(), this.getAttackChainStep(), this.getAttackChainStep_Previous(), "next",
				null, 0, -1, AttackChainStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttackChainStep_Previous(), this.getAttackChainStep(), this.getAttackChainStep_Next(),
				"previous", null, 0, -1, AttackChainStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAttackChainStep__GetThreatAllocationRelationCandidates(), this.getThreatAllocationRelation(),
				"getThreatAllocationRelationCandidates", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAttackChainStep__CheckAllocationValue__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"checkAllocationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "chain", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEMap(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(scoreSystemEClass, ScoreSystem.class, "ScoreSystem", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScoreSystem_ImpactScores(), this.getImpactScore(), null, "impactScores", null, 0, -1,
				ScoreSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScoreSystem_DifficultyScores(), this.getDifficultyScore(), null, "difficultyScores", null, 0,
				-1, ScoreSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(impactScoreEClass, ImpactScore.class, "ImpactScore", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImpactScore_Impact(), ecorePackage.getEInt(), "impact", null, 0, 1, ImpactScore.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImpactScore_Configurations(), this.getImpactConfiguration(),
				this.getImpactConfiguration_Impact(), "configurations", null, 0, -1, ImpactScore.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(difficultyScoreEClass, DifficultyScore.class, "DifficultyScore", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDifficultyScore_Difficulty(), ecorePackage.getEInt(), "difficulty", null, 0, 1,
				DifficultyScore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(dataOwnerElementEClass, DataOwnerElement.class, "DataOwnerElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataOwnerElement_DataOwner(), this.getDataOwner(), null, "dataOwner", null, 0, 1,
				DataOwnerElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDataOwnerElement__GetDatas(), this.getData(), "getDatas", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataOwnerElement__GetInheritedDatas(), this.getData(), "getInheritedDatas", 0, -1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getDataOwnerElement__GetAllDatas(), this.getData(), "getAllDatas", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(componentOwnerEClass, ComponentOwner.class, "ComponentOwner", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentOwner_Components(), this.getComponent(), null, "components", null, 0, -1,
				ComponentOwner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalThreatEClass, ExternalThreat.class, "ExternalThreat", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(externalElementEClass, ExternalElement.class, "ExternalElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalElement_Source(), ecorePackage.getEString(), "source", null, 0, 1,
				ExternalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalElement_Link(), ecorePackage.getEString(), "link", null, 0, 1, ExternalElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalElement_SourceID(), theEcorePackage.getEString(), "sourceID", null, 0, 1,
				ExternalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(impactConfigurationEClass, ImpactConfiguration.class, "ImpactConfiguration", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImpactConfiguration_Difficulty(), this.getDifficultyScore(), null, "difficulty", null, 1, 1,
				ImpactConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImpactConfiguration_Impact(), this.getImpactScore(), this.getImpactScore_Configurations(),
				"impact", null, 1, 1, ImpactConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalControlEClass, ExternalControl.class, "ExternalControl", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(threatsOwnerEClass, ThreatsOwner.class, "ThreatsOwner", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getThreatsOwner_Internals(), this.getThreat(), null, "internals", null, 0, -1,
				ThreatsOwner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThreatsOwner_Externals(), this.getExternalThreat(), null, "externals", null, 0, -1,
				ThreatsOwner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlOwnerEClass, ControlOwner.class, "ControlOwner", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlOwner_Internals(), this.getControl(), null, "internals", null, 0, -1,
				ControlOwner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlOwner_Externals(), this.getExternalControl(), null, "externals", null, 0, -1,
				ControlOwner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractControlOwnerEClass, AbstractControlOwner.class, "AbstractControlOwner", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractControlOwner_ControlOwner(), this.getControlOwner(), null, "controlOwner", null, 0, 1,
				AbstractControlOwner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAbstractControlOwner__GetAllControls(), this.getControl(), "getAllControls", 0, -1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getAbstractControlOwner__GetExternalControls__String_String(), this.getExternalControl(),
				"getExternalControls", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "catalogIdentifier", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataOwnerEClass, DataOwner.class, "DataOwner", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataOwner_Data(), this.getData(), null, "data", null, 0, -1, DataOwner.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLink_LinkType(), this.getLinkType(), null, "linkType", null, 1, 1, Link.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getLink_LinkConveyed(), this.getLink(), this.getLink_ConveyingLink(), "linkConveyed", null, 0,
				-1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_ConveyingLink(), this.getLink(), this.getLink_LinkConveyed(), "conveyingLink", null, 0,
				-1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_Components(), this.getComponent(), null, "components", null, 0, -1, Link.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkTypeEClass, LinkType.class, "LinkType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(catalogEClass, Catalog.class, "Catalog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractThreatOwnerEClass, AbstractThreatOwner.class, "AbstractThreatOwner", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractThreatOwner_ThreatOwner(), this.getThreatsOwner(), null, "threatOwner", null, 1, 1,
				AbstractThreatOwner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iThreatDefinitionEClass, IThreatDefinition.class, "IThreatDefinition", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIThreatDefinition__GetId(), theEcorePackage.getEString(), "getId", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getIThreatDefinition__GetDescription(), theEcorePackage.getEString(), "getDescription", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getIThreatDefinition__GetName(), theEcorePackage.getEString(), "getName", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(iControlDefinitionEClass, IControlDefinition.class, "IControlDefinition", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIControlDefinition__GetDescription(), theEcorePackage.getEString(), "getDescription", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getIControlDefinition__GetId(), theEcorePackage.getEString(), "getId", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getIControlDefinition__GetMitigatedThreatDefinitions(), this.getIMitigationLink(),
				"getMitigatedThreatDefinitions", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIControlDefinition__GetName(), theEcorePackage.getEString(), "getName", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(iCatalogDefinitionEClass, ICatalogDefinition.class, "ICatalogDefinition", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getICatalogDefinition__GetThreatById__String(), this.getIThreatDefinition(),
				"getThreatById", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getICatalogDefinition__GetControlById__String(), this.getIControlDefinition(),
				"getControlById", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getICatalogDefinition__GetThreatDefinitions(), this.getIThreatDefinition(),
				"getThreatDefinitions", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getICatalogDefinition__GetControlDefinitions(), this.getIControlDefinition(),
				"getControlDefinitions", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getICatalogDefinition__GetIdentifier(), theEcorePackage.getEString(), "getIdentifier", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getICatalogDefinition__GetName(), theEcorePackage.getEString(), "getName", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getICatalogDefinition__GetRuleById__String(), this.getRule(), "getRuleById", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getICatalogDefinition__GetVulnerabilityById__String(), this.getVulnerability(),
				"getVulnerabilityById", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getICatalogDefinition__GetComponentTypeById__String(), this.getComponentType(),
				"getComponentTypeById", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iMitigationLinkEClass, IMitigationLink.class, "IMitigationLink", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIMitigationLink__GetDescription(), theEcorePackage.getEString(), "getDescription", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getIMitigationLink__GetThreat(), this.getIThreatDefinition(), "getThreat", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(coloredElementEClass, ColoredElement.class, "ColoredElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColoredElement_Color(), this.getRGBColor(), "color", "#AAAAAA", 0, 1, ColoredElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iElementWithSourceEClass, IElementWithSource.class, "IElementWithSource", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIElementWithSource__GetSourceName(), theEcorePackage.getEString(), "getSourceName", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getIElementWithSource__GetSourceIdentifier(), theEcorePackage.getEString(),
				"getSourceIdentifier", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(elementWithIdEClass, ElementWithId.class, "ElementWithId", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementWithId_Id(), theEcorePackage.getEString(), "id", null, 0, 1, ElementWithId.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainAssetEClass, DomainAsset.class, "DomainAsset", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainAsset_Category(), this.getComponentCategoryENUM(), "category", null, 0, -1,
				DomainAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(abstractVulnerabilityOwnerEClass, AbstractVulnerabilityOwner.class, "AbstractVulnerabilityOwner",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractVulnerabilityOwner_VulnerabilityOwner(), this.getVulnerabilityOwner(), null,
				"vulnerabilityOwner", null, 1, 1, AbstractVulnerabilityOwner.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vulnerabilityOwnerEClass, VulnerabilityOwner.class, "VulnerabilityOwner", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVulnerabilityOwner_Vulnerabilities(), this.getVulnerability(), null, "vulnerabilities", null,
				0, -1, VulnerabilityOwner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vulnerabilityEClass, Vulnerability.class, "Vulnerability", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVulnerability_Manifests(), this.getVulnerability(), null, "manifests", null, 0, -1,
				Vulnerability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVulnerability_VulnerabilityType(), this.getVulnerabilityTypeENUM(), "vulnerabilityType", null,
				0, 1, Vulnerability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVulnerability_Affects(), this.getComponentType(), this.getComponentType_AffectedBy(),
				"affects", null, 0, -1, Vulnerability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractComponentTypeOwnerEClass, AbstractComponentTypeOwner.class, "AbstractComponentTypeOwner",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractComponentTypeOwner_ComponentTypeOwner(), this.getComponentTypeOwner(), null,
				"componentTypeOwner", null, 1, 1, AbstractComponentTypeOwner.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentTypeOwnerEClass, ComponentTypeOwner.class, "ComponentTypeOwner", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentTypeOwner_ComponentTypes(), this.getComponentType(), null, "componentTypes", null, 0,
				-1, ComponentTypeOwner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentTypeEClass, ComponentType.class, "ComponentType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentType_Manifests(), this.getComponentType(), null, "manifests", null, 0, -1,
				ComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentType_SubjectToThreats(), this.getThreat(), null, "subjectToThreats", null, 0, -1,
				ComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentType_AffectedBy(), this.getVulnerability(), this.getVulnerability_Affects(),
				"affectedBy", null, 0, -1, ComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assetEClass, Asset.class, "Asset", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractRuleOwnerEClass, AbstractRuleOwner.class, "AbstractRuleOwner", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractRuleOwner_RuleOwner(), this.getRuleOwner(), null, "ruleOwner", null, 1, 1,
				AbstractRuleOwner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleOwnerEClass, RuleOwner.class, "RuleOwner", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuleOwner_Rules(), this.getRule(), null, "rules", null, 0, -1, RuleOwner.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRule_Vulnerabilities(), this.getVulnerability(), null, "vulnerabilities", null, 1, -1,
				Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_ComponentTypesAffected(), this.getComponentType(), null, "componentTypesAffected", null,
				1, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_Controls(), this.getControl(), null, "controls", null, 0, -1, Rule.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(characteristicEClass, Characteristic.class, "Characteristic", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCharacteristic_Label(), ecorePackage.getEString(), "label", null, 0, 1, Characteristic.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacteristic_Value(), ecorePackage.getEString(), "value", null, 0, 1, Characteristic.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacteristic_Options(), ecorePackage.getEString(), "options", null, 0, -1,
				Characteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(characteristicOwnerEClass, CharacteristicOwner.class, "CharacteristicOwner", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCharacteristicOwner_Characteristics(), this.getCharacteristic(), null, "characteristics",
				null, 0, -1, CharacteristicOwner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(assessmentENUMEEnum, AssessmentENUM.class, "AssessmentENUM");
		addEEnumLiteral(assessmentENUMEEnum, AssessmentENUM.UNDECIDED);
		addEEnumLiteral(assessmentENUMEEnum, AssessmentENUM.GAP);
		addEEnumLiteral(assessmentENUMEEnum, AssessmentENUM.ACCEPTED);

		initEEnum(affectedENUMEEnum, AffectedENUM.class, "AffectedENUM");
		addEEnumLiteral(affectedENUMEEnum, AffectedENUM.UNDECIDED);
		addEEnumLiteral(affectedENUMEEnum, AffectedENUM.CONFIRMED);

		initEEnum(threatTypeENUMEEnum, threatTypeENUM.class, "threatTypeENUM");
		addEEnumLiteral(threatTypeENUMEEnum, threatTypeENUM.CONCRETE_THREAT);
		addEEnumLiteral(threatTypeENUMEEnum, threatTypeENUM.CONCEPTUAL_THREAT);

		initEEnum(controlStatusENUMEEnum, ControlStatusENUM.class, "ControlStatusENUM");
		addEEnumLiteral(controlStatusENUMEEnum, ControlStatusENUM.PROPOSED);
		addEEnumLiteral(controlStatusENUMEEnum, ControlStatusENUM.AGREED);
		addEEnumLiteral(controlStatusENUMEEnum, ControlStatusENUM.IMPLEMENTED);
		addEEnumLiteral(controlStatusENUMEEnum, ControlStatusENUM.REJECTED);

		initEEnum(componentCategoryENUMEEnum, ComponentCategoryENUM.class, "ComponentCategoryENUM");
		addEEnumLiteral(componentCategoryENUMEEnum, ComponentCategoryENUM.DATA);
		addEEnumLiteral(componentCategoryENUMEEnum, ComponentCategoryENUM.SYSTEM_FUNCTION);
		addEEnumLiteral(componentCategoryENUMEEnum, ComponentCategoryENUM.HUMAN_RELATED_INFO);
		addEEnumLiteral(componentCategoryENUMEEnum, ComponentCategoryENUM.PHYSICAL);

		initEEnum(securityObjectiveENUMEEnum, SecurityObjectiveENUM.class, "SecurityObjectiveENUM");
		addEEnumLiteral(securityObjectiveENUMEEnum, SecurityObjectiveENUM.CONFIDENTIALITY);
		addEEnumLiteral(securityObjectiveENUMEEnum, SecurityObjectiveENUM.AVAILIABILITY);
		addEEnumLiteral(securityObjectiveENUMEEnum, SecurityObjectiveENUM.INTEGRITY);
		addEEnumLiteral(securityObjectiveENUMEEnum, SecurityObjectiveENUM.AUTHENTICITY);
		addEEnumLiteral(securityObjectiveENUMEEnum, SecurityObjectiveENUM.NON_REPUDIATION);
		addEEnumLiteral(securityObjectiveENUMEEnum, SecurityObjectiveENUM.RELIABILITY);
		addEEnumLiteral(securityObjectiveENUMEEnum, SecurityObjectiveENUM.ACCOUNTABILITY);
		addEEnumLiteral(securityObjectiveENUMEEnum, SecurityObjectiveENUM.UNDEFINED);

		initEEnum(vulnerabilityTypeENUMEEnum, VulnerabilityTypeENUM.class, "VulnerabilityTypeENUM");
		addEEnumLiteral(vulnerabilityTypeENUMEEnum, VulnerabilityTypeENUM.CWE);
		addEEnumLiteral(vulnerabilityTypeENUMEEnum, VulnerabilityTypeENUM.CVE);
		addEEnumLiteral(vulnerabilityTypeENUMEEnum, VulnerabilityTypeENUM.MECHANISM);
		addEEnumLiteral(vulnerabilityTypeENUMEEnum, VulnerabilityTypeENUM.IMPLEMENTATION);
		addEEnumLiteral(vulnerabilityTypeENUMEEnum, VulnerabilityTypeENUM.OTHER);

		// Initialize data types
		initEDataType(rgbColorEDataType, RGBColor.class, "RGBColor", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //TRADESPackageImpl
