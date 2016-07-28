/**
 */
package edu.kit.ipd.sdq.toometa.patterns.patterninstances;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatterninstancesFactory
 * @model kind="package"
 * @generated
 */
public interface PatterninstancesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "patterninstances";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///edu.kit.ipd.sdq.toometa.de/patterns/patterninstances/0.6";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "patterninstances";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PatterninstancesPackage eINSTANCE = edu.kit.ipd.sdq.toometa.patterns.patterninstances.impl.PatterninstancesPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.patterns.patterninstances.impl.PatternInstanceImpl <em>Pattern Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.patterns.patterninstances.impl.PatternInstanceImpl
	 * @see edu.kit.ipd.sdq.toometa.patterns.patterninstances.impl.PatterninstancesPackageImpl#getPatternInstance()
	 * @generated
	 */
	int PATTERN_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INSTANCE__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INSTANCE__ROLES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INSTANCE__CONNECTORS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INSTANCE__NAME = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Architectural Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INSTANCE__ARCHITECTURAL_LEVEL = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INSTANCE__REPOSITORY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Pattern Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INSTANCE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.patterns.patterninstances.impl.ConnectorInstanceImpl <em>Connector Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.patterns.patterninstances.impl.ConnectorInstanceImpl
	 * @see edu.kit.ipd.sdq.toometa.patterns.patterninstances.impl.PatterninstancesPackageImpl#getConnectorInstance()
	 * @generated
	 */
	int CONNECTOR_INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INSTANCE__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INSTANCE__CONNECTOR = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INSTANCE__FROM_ROLE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INSTANCE__TO_ROLE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Connector Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INSTANCE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.patterns.patterninstances.impl.RoleInstanceImpl <em>Role Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.patterns.patterninstances.impl.RoleInstanceImpl
	 * @see edu.kit.ipd.sdq.toometa.patterns.patterninstances.impl.PatterninstancesPackageImpl#getRoleInstance()
	 * @generated
	 */
	int ROLE_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_INSTANCE__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_INSTANCE__ROLE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_INSTANCE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.patterns.patterninstances.impl.PatternInstanceRepositoryImpl <em>Pattern Instance Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.patterns.patterninstances.impl.PatternInstanceRepositoryImpl
	 * @see edu.kit.ipd.sdq.toometa.patterns.patterninstances.impl.PatterninstancesPackageImpl#getPatternInstanceRepository()
	 * @generated
	 */
	int PATTERN_INSTANCE_REPOSITORY = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INSTANCE_REPOSITORY__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Solution Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INSTANCE_REPOSITORY__SOLUTION_INSTANCES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Instance Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INSTANCE_REPOSITORY_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatternInstance <em>Pattern Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Instance</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatternInstance
	 * @generated
	 */
	EClass getPatternInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatternInstance#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatternInstance#getRoles()
	 * @see #getPatternInstance()
	 * @generated
	 */
	EReference getPatternInstance_Roles();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatternInstance#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connectors</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatternInstance#getConnectors()
	 * @see #getPatternInstance()
	 * @generated
	 */
	EReference getPatternInstance_Connectors();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatternInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatternInstance#getName()
	 * @see #getPatternInstance()
	 * @generated
	 */
	EAttribute getPatternInstance_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatternInstance#getArchitecturalLevel <em>Architectural Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Architectural Level</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatternInstance#getArchitecturalLevel()
	 * @see #getPatternInstance()
	 * @generated
	 */
	EAttribute getPatternInstance_ArchitecturalLevel();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatternInstance#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Repository</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatternInstance#getRepository()
	 * @see #getPatternInstance()
	 * @generated
	 */
	EReference getPatternInstance_Repository();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.patterns.patterninstances.ConnectorInstance <em>Connector Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector Instance</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.patterninstances.ConnectorInstance
	 * @generated
	 */
	EClass getConnectorInstance();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.toometa.patterns.patterninstances.ConnectorInstance#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connector</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.patterninstances.ConnectorInstance#getConnector()
	 * @see #getConnectorInstance()
	 * @generated
	 */
	EReference getConnectorInstance_Connector();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.toometa.patterns.patterninstances.ConnectorInstance#getFromRole <em>From Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From Role</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.patterninstances.ConnectorInstance#getFromRole()
	 * @see #getConnectorInstance()
	 * @generated
	 */
	EReference getConnectorInstance_FromRole();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.toometa.patterns.patterninstances.ConnectorInstance#getToRole <em>To Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>To Role</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.patterninstances.ConnectorInstance#getToRole()
	 * @see #getConnectorInstance()
	 * @generated
	 */
	EReference getConnectorInstance_ToRole();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.patterns.patterninstances.RoleInstance <em>Role Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Instance</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.patterninstances.RoleInstance
	 * @generated
	 */
	EClass getRoleInstance();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.toometa.patterns.patterninstances.RoleInstance#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.patterninstances.RoleInstance#getRole()
	 * @see #getRoleInstance()
	 * @generated
	 */
	EReference getRoleInstance_Role();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatternInstanceRepository <em>Pattern Instance Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Instance Repository</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatternInstanceRepository
	 * @generated
	 */
	EClass getPatternInstanceRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatternInstanceRepository#getSolutionInstances <em>Solution Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Solution Instances</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatternInstanceRepository#getSolutionInstances()
	 * @see #getPatternInstanceRepository()
	 * @generated
	 */
	EReference getPatternInstanceRepository_SolutionInstances();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PatterninstancesFactory getPatterninstancesFactory();

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
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.patterns.patterninstances.impl.PatternInstanceImpl <em>Pattern Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.patterns.patterninstances.impl.PatternInstanceImpl
		 * @see edu.kit.ipd.sdq.toometa.patterns.patterninstances.impl.PatterninstancesPackageImpl#getPatternInstance()
		 * @generated
		 */
		EClass PATTERN_INSTANCE = eINSTANCE.getPatternInstance();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_INSTANCE__ROLES = eINSTANCE.getPatternInstance_Roles();

		/**
		 * The meta object literal for the '<em><b>Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_INSTANCE__CONNECTORS = eINSTANCE.getPatternInstance_Connectors();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_INSTANCE__NAME = eINSTANCE.getPatternInstance_Name();

		/**
		 * The meta object literal for the '<em><b>Architectural Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_INSTANCE__ARCHITECTURAL_LEVEL = eINSTANCE.getPatternInstance_ArchitecturalLevel();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_INSTANCE__REPOSITORY = eINSTANCE.getPatternInstance_Repository();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.patterns.patterninstances.impl.ConnectorInstanceImpl <em>Connector Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.patterns.patterninstances.impl.ConnectorInstanceImpl
		 * @see edu.kit.ipd.sdq.toometa.patterns.patterninstances.impl.PatterninstancesPackageImpl#getConnectorInstance()
		 * @generated
		 */
		EClass CONNECTOR_INSTANCE = eINSTANCE.getConnectorInstance();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_INSTANCE__CONNECTOR = eINSTANCE.getConnectorInstance_Connector();

		/**
		 * The meta object literal for the '<em><b>From Role</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_INSTANCE__FROM_ROLE = eINSTANCE.getConnectorInstance_FromRole();

		/**
		 * The meta object literal for the '<em><b>To Role</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_INSTANCE__TO_ROLE = eINSTANCE.getConnectorInstance_ToRole();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.patterns.patterninstances.impl.RoleInstanceImpl <em>Role Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.patterns.patterninstances.impl.RoleInstanceImpl
		 * @see edu.kit.ipd.sdq.toometa.patterns.patterninstances.impl.PatterninstancesPackageImpl#getRoleInstance()
		 * @generated
		 */
		EClass ROLE_INSTANCE = eINSTANCE.getRoleInstance();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_INSTANCE__ROLE = eINSTANCE.getRoleInstance_Role();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.patterns.patterninstances.impl.PatternInstanceRepositoryImpl <em>Pattern Instance Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.patterns.patterninstances.impl.PatternInstanceRepositoryImpl
		 * @see edu.kit.ipd.sdq.toometa.patterns.patterninstances.impl.PatterninstancesPackageImpl#getPatternInstanceRepository()
		 * @generated
		 */
		EClass PATTERN_INSTANCE_REPOSITORY = eINSTANCE.getPatternInstanceRepository();

		/**
		 * The meta object literal for the '<em><b>Solution Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_INSTANCE_REPOSITORY__SOLUTION_INSTANCES = eINSTANCE.getPatternInstanceRepository_SolutionInstances();

	}

} //PatterninstancesPackage
