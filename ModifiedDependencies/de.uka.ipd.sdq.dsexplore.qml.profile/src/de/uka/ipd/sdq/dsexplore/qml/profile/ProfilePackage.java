/**
 */
package de.uka.ipd.sdq.dsexplore.qml.profile;

import de.uka.ipd.sdq.dsexplore.qml.declarations.QMLDeclarationsPackage;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.uka.ipd.sdq.dsexplore.qml.profile.ProfileFactory
 * @model kind="package"
 * @generated
 */
public interface ProfilePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "profile";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.kit.edu/QML/profile/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "profile";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProfilePackage eINSTANCE = de.uka.ipd.sdq.dsexplore.qml.profile.impl.ProfilePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.dsexplore.qml.profile.impl.GenericQMLProfileImpl <em>Generic QML Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.dsexplore.qml.profile.impl.GenericQMLProfileImpl
	 * @see de.uka.ipd.sdq.dsexplore.qml.profile.impl.ProfilePackageImpl#getGenericQMLProfile()
	 * @generated
	 */
	int GENERIC_QML_PROFILE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_QML_PROFILE__ID = QMLDeclarationsPackage.QML_DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_QML_PROFILE__NAME = QMLDeclarationsPackage.QML_DECLARATION__NAME;

	/**
	 * The number of structural features of the '<em>Generic QML Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_QML_PROFILE_FEATURE_COUNT = QMLDeclarationsPackage.QML_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.dsexplore.qml.profile.impl.SimpleQMLProfileImpl <em>Simple QML Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.dsexplore.qml.profile.impl.SimpleQMLProfileImpl
	 * @see de.uka.ipd.sdq.dsexplore.qml.profile.impl.ProfilePackageImpl#getSimpleQMLProfile()
	 * @generated
	 */
	int SIMPLE_QML_PROFILE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QML_PROFILE__ID = GENERIC_QML_PROFILE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QML_PROFILE__NAME = GENERIC_QML_PROFILE__NAME;

	/**
	 * The feature id for the '<em><b>Usage Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QML_PROFILE__USAGE_MODEL = GENERIC_QML_PROFILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QML_PROFILE__REQUIREMENTS = GENERIC_QML_PROFILE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Simple QML Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QML_PROFILE_FEATURE_COUNT = GENERIC_QML_PROFILE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.dsexplore.qml.profile.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.dsexplore.qml.profile.impl.RequirementImpl
	 * @see de.uka.ipd.sdq.dsexplore.qml.profile.impl.ProfilePackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Require Contract</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__REQUIRE_CONTRACT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.dsexplore.qml.profile.impl.RefinedQMLProfileImpl <em>Refined QML Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.dsexplore.qml.profile.impl.RefinedQMLProfileImpl
	 * @see de.uka.ipd.sdq.dsexplore.qml.profile.impl.ProfilePackageImpl#getRefinedQMLProfile()
	 * @generated
	 */
	int REFINED_QML_PROFILE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_QML_PROFILE__ID = GENERIC_QML_PROFILE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_QML_PROFILE__NAME = GENERIC_QML_PROFILE__NAME;

	/**
	 * The feature id for the '<em><b>Base Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_QML_PROFILE__BASE_PROFILE = GENERIC_QML_PROFILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Refined By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_QML_PROFILE__REFINED_BY = GENERIC_QML_PROFILE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Refined QML Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_QML_PROFILE_FEATURE_COUNT = GENERIC_QML_PROFILE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.dsexplore.qml.profile.impl.UsageScenarioRequirementImpl <em>Usage Scenario Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.dsexplore.qml.profile.impl.UsageScenarioRequirementImpl
	 * @see de.uka.ipd.sdq.dsexplore.qml.profile.impl.ProfilePackageImpl#getUsageScenarioRequirement()
	 * @generated
	 */
	int USAGE_SCENARIO_REQUIREMENT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_SCENARIO_REQUIREMENT__ID = REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Require Contract</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_SCENARIO_REQUIREMENT__REQUIRE_CONTRACT = REQUIREMENT__REQUIRE_CONTRACT;

	/**
	 * The feature id for the '<em><b>Usage Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_SCENARIO_REQUIREMENT__USAGE_SCENARIO = REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Usage Scenario Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_SCENARIO_REQUIREMENT_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.dsexplore.qml.profile.impl.EntryLevelSystemCallRequirementImpl <em>Entry Level System Call Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.dsexplore.qml.profile.impl.EntryLevelSystemCallRequirementImpl
	 * @see de.uka.ipd.sdq.dsexplore.qml.profile.impl.ProfilePackageImpl#getEntryLevelSystemCallRequirement()
	 * @generated
	 */
	int ENTRY_LEVEL_SYSTEM_CALL_REQUIREMENT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_LEVEL_SYSTEM_CALL_REQUIREMENT__ID = REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Require Contract</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_LEVEL_SYSTEM_CALL_REQUIREMENT__REQUIRE_CONTRACT = REQUIREMENT__REQUIRE_CONTRACT;

	/**
	 * The feature id for the '<em><b>Entry Level System Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_LEVEL_SYSTEM_CALL_REQUIREMENT__ENTRY_LEVEL_SYSTEM_CALL = REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entry Level System Call Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_LEVEL_SYSTEM_CALL_REQUIREMENT_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.dsexplore.qml.profile.SimpleQMLProfile <em>Simple QML Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple QML Profile</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.qml.profile.SimpleQMLProfile
	 * @generated
	 */
	EClass getSimpleQMLProfile();

	/**
	 * Returns the meta object for the reference '{@link de.uka.ipd.sdq.dsexplore.qml.profile.SimpleQMLProfile#getUsageModel <em>Usage Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Usage Model</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.qml.profile.SimpleQMLProfile#getUsageModel()
	 * @see #getSimpleQMLProfile()
	 * @generated
	 */
	EReference getSimpleQMLProfile_UsageModel();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uka.ipd.sdq.dsexplore.qml.profile.SimpleQMLProfile#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirements</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.qml.profile.SimpleQMLProfile#getRequirements()
	 * @see #getSimpleQMLProfile()
	 * @generated
	 */
	EReference getSimpleQMLProfile_Requirements();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.dsexplore.qml.profile.GenericQMLProfile <em>Generic QML Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic QML Profile</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.qml.profile.GenericQMLProfile
	 * @generated
	 */
	EClass getGenericQMLProfile();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.dsexplore.qml.profile.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.qml.profile.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the reference list '{@link de.uka.ipd.sdq.dsexplore.qml.profile.Requirement#getRequireContract <em>Require Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Require Contract</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.qml.profile.Requirement#getRequireContract()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_RequireContract();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.dsexplore.qml.profile.RefinedQMLProfile <em>Refined QML Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refined QML Profile</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.qml.profile.RefinedQMLProfile
	 * @generated
	 */
	EClass getRefinedQMLProfile();

	/**
	 * Returns the meta object for the reference '{@link de.uka.ipd.sdq.dsexplore.qml.profile.RefinedQMLProfile#getBaseProfile <em>Base Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Profile</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.qml.profile.RefinedQMLProfile#getBaseProfile()
	 * @see #getRefinedQMLProfile()
	 * @generated
	 */
	EReference getRefinedQMLProfile_BaseProfile();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uka.ipd.sdq.dsexplore.qml.profile.RefinedQMLProfile#getRefinedBy <em>Refined By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Refined By</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.qml.profile.RefinedQMLProfile#getRefinedBy()
	 * @see #getRefinedQMLProfile()
	 * @generated
	 */
	EReference getRefinedQMLProfile_RefinedBy();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.dsexplore.qml.profile.UsageScenarioRequirement <em>Usage Scenario Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usage Scenario Requirement</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.qml.profile.UsageScenarioRequirement
	 * @generated
	 */
	EClass getUsageScenarioRequirement();

	/**
	 * Returns the meta object for the reference '{@link de.uka.ipd.sdq.dsexplore.qml.profile.UsageScenarioRequirement#getUsageScenario <em>Usage Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Usage Scenario</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.qml.profile.UsageScenarioRequirement#getUsageScenario()
	 * @see #getUsageScenarioRequirement()
	 * @generated
	 */
	EReference getUsageScenarioRequirement_UsageScenario();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.dsexplore.qml.profile.EntryLevelSystemCallRequirement <em>Entry Level System Call Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Level System Call Requirement</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.qml.profile.EntryLevelSystemCallRequirement
	 * @generated
	 */
	EClass getEntryLevelSystemCallRequirement();

	/**
	 * Returns the meta object for the reference '{@link de.uka.ipd.sdq.dsexplore.qml.profile.EntryLevelSystemCallRequirement#getEntryLevelSystemCall <em>Entry Level System Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entry Level System Call</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.qml.profile.EntryLevelSystemCallRequirement#getEntryLevelSystemCall()
	 * @see #getEntryLevelSystemCallRequirement()
	 * @generated
	 */
	EReference getEntryLevelSystemCallRequirement_EntryLevelSystemCall();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProfileFactory getProfileFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.dsexplore.qml.profile.impl.SimpleQMLProfileImpl <em>Simple QML Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.dsexplore.qml.profile.impl.SimpleQMLProfileImpl
		 * @see de.uka.ipd.sdq.dsexplore.qml.profile.impl.ProfilePackageImpl#getSimpleQMLProfile()
		 * @generated
		 */
		EClass SIMPLE_QML_PROFILE = eINSTANCE.getSimpleQMLProfile();

		/**
		 * The meta object literal for the '<em><b>Usage Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_QML_PROFILE__USAGE_MODEL = eINSTANCE.getSimpleQMLProfile_UsageModel();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_QML_PROFILE__REQUIREMENTS = eINSTANCE.getSimpleQMLProfile_Requirements();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.dsexplore.qml.profile.impl.GenericQMLProfileImpl <em>Generic QML Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.dsexplore.qml.profile.impl.GenericQMLProfileImpl
		 * @see de.uka.ipd.sdq.dsexplore.qml.profile.impl.ProfilePackageImpl#getGenericQMLProfile()
		 * @generated
		 */
		EClass GENERIC_QML_PROFILE = eINSTANCE.getGenericQMLProfile();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.dsexplore.qml.profile.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.dsexplore.qml.profile.impl.RequirementImpl
		 * @see de.uka.ipd.sdq.dsexplore.qml.profile.impl.ProfilePackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '<em><b>Require Contract</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__REQUIRE_CONTRACT = eINSTANCE.getRequirement_RequireContract();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.dsexplore.qml.profile.impl.RefinedQMLProfileImpl <em>Refined QML Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.dsexplore.qml.profile.impl.RefinedQMLProfileImpl
		 * @see de.uka.ipd.sdq.dsexplore.qml.profile.impl.ProfilePackageImpl#getRefinedQMLProfile()
		 * @generated
		 */
		EClass REFINED_QML_PROFILE = eINSTANCE.getRefinedQMLProfile();

		/**
		 * The meta object literal for the '<em><b>Base Profile</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFINED_QML_PROFILE__BASE_PROFILE = eINSTANCE.getRefinedQMLProfile_BaseProfile();

		/**
		 * The meta object literal for the '<em><b>Refined By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFINED_QML_PROFILE__REFINED_BY = eINSTANCE.getRefinedQMLProfile_RefinedBy();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.dsexplore.qml.profile.impl.UsageScenarioRequirementImpl <em>Usage Scenario Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.dsexplore.qml.profile.impl.UsageScenarioRequirementImpl
		 * @see de.uka.ipd.sdq.dsexplore.qml.profile.impl.ProfilePackageImpl#getUsageScenarioRequirement()
		 * @generated
		 */
		EClass USAGE_SCENARIO_REQUIREMENT = eINSTANCE.getUsageScenarioRequirement();

		/**
		 * The meta object literal for the '<em><b>Usage Scenario</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USAGE_SCENARIO_REQUIREMENT__USAGE_SCENARIO = eINSTANCE.getUsageScenarioRequirement_UsageScenario();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.dsexplore.qml.profile.impl.EntryLevelSystemCallRequirementImpl <em>Entry Level System Call Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.dsexplore.qml.profile.impl.EntryLevelSystemCallRequirementImpl
		 * @see de.uka.ipd.sdq.dsexplore.qml.profile.impl.ProfilePackageImpl#getEntryLevelSystemCallRequirement()
		 * @generated
		 */
		EClass ENTRY_LEVEL_SYSTEM_CALL_REQUIREMENT = eINSTANCE.getEntryLevelSystemCallRequirement();

		/**
		 * The meta object literal for the '<em><b>Entry Level System Call</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_LEVEL_SYSTEM_CALL_REQUIREMENT__ENTRY_LEVEL_SYSTEM_CALL = eINSTANCE.getEntryLevelSystemCallRequirement_EntryLevelSystemCall();

	}

} //ProfilePackage
