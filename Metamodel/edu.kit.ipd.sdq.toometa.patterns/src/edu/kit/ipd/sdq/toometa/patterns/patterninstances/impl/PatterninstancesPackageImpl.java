/**
 */
package edu.kit.ipd.sdq.toometa.patterns.patterninstances.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import edu.kit.ipd.sdq.toometa.options.OptionsPackage;

import edu.kit.ipd.sdq.toometa.patterns.PatternsPackage;

import edu.kit.ipd.sdq.toometa.patterns.impl.PatternsPackageImpl;

import edu.kit.ipd.sdq.toometa.patterns.patterninstances.ConnectorInstance;
import edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatternInstance;
import edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatternInstanceRepository;
import edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatterninstancesFactory;
import edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatterninstancesPackage;
import edu.kit.ipd.sdq.toometa.patterns.patterninstances.RoleInstance;

import edu.kit.ipd.sdq.toometa.patterns.patternoptions.PatternoptionsPackage;

import edu.kit.ipd.sdq.toometa.patterns.patternoptions.impl.PatternoptionsPackageImpl;

import edu.kit.ipd.sdq.toometa.patterns.questions.QuestionsPackage;

import edu.kit.ipd.sdq.toometa.patterns.questions.impl.QuestionsPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PatterninstancesPackageImpl extends EPackageImpl implements PatterninstancesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternInstanceRepositoryEClass = null;

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
	 * @see edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatterninstancesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PatterninstancesPackageImpl() {
		super(eNS_URI, PatterninstancesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PatterninstancesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PatterninstancesPackage init() {
		if (isInited) return (PatterninstancesPackage)EPackage.Registry.INSTANCE.getEPackage(PatterninstancesPackage.eNS_URI);

		// Obtain or create and register package
		PatterninstancesPackageImpl thePatterninstancesPackage = (PatterninstancesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PatterninstancesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PatterninstancesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		OptionsPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		PatternsPackageImpl thePatternsPackage = (PatternsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI) instanceof PatternsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI) : PatternsPackage.eINSTANCE);
		PatternoptionsPackageImpl thePatternoptionsPackage = (PatternoptionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternoptionsPackage.eNS_URI) instanceof PatternoptionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternoptionsPackage.eNS_URI) : PatternoptionsPackage.eINSTANCE);
		QuestionsPackageImpl theQuestionsPackage = (QuestionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QuestionsPackage.eNS_URI) instanceof QuestionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QuestionsPackage.eNS_URI) : QuestionsPackage.eINSTANCE);

		// Create package meta-data objects
		thePatterninstancesPackage.createPackageContents();
		thePatternsPackage.createPackageContents();
		thePatternoptionsPackage.createPackageContents();
		theQuestionsPackage.createPackageContents();

		// Initialize created meta-data
		thePatterninstancesPackage.initializePackageContents();
		thePatternsPackage.initializePackageContents();
		thePatternoptionsPackage.initializePackageContents();
		theQuestionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePatterninstancesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PatterninstancesPackage.eNS_URI, thePatterninstancesPackage);
		return thePatterninstancesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatternInstance() {
		return patternInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternInstance_Roles() {
		return (EReference)patternInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternInstance_Connectors() {
		return (EReference)patternInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatternInstance_Name() {
		return (EAttribute)patternInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatternInstance_ArchitecturalLevel() {
		return (EAttribute)patternInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternInstance_Repository() {
		return (EReference)patternInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectorInstance() {
		return connectorInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorInstance_Connector() {
		return (EReference)connectorInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorInstance_FromRole() {
		return (EReference)connectorInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorInstance_ToRole() {
		return (EReference)connectorInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleInstance() {
		return roleInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleInstance_Role() {
		return (EReference)roleInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatternInstanceRepository() {
		return patternInstanceRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternInstanceRepository_SolutionInstances() {
		return (EReference)patternInstanceRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatterninstancesFactory getPatterninstancesFactory() {
		return (PatterninstancesFactory)getEFactoryInstance();
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
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		patternInstanceEClass = createEClass(PATTERN_INSTANCE);
		createEReference(patternInstanceEClass, PATTERN_INSTANCE__ROLES);
		createEReference(patternInstanceEClass, PATTERN_INSTANCE__CONNECTORS);
		createEAttribute(patternInstanceEClass, PATTERN_INSTANCE__NAME);
		createEAttribute(patternInstanceEClass, PATTERN_INSTANCE__ARCHITECTURAL_LEVEL);
		createEReference(patternInstanceEClass, PATTERN_INSTANCE__REPOSITORY);

		connectorInstanceEClass = createEClass(CONNECTOR_INSTANCE);
		createEReference(connectorInstanceEClass, CONNECTOR_INSTANCE__CONNECTOR);
		createEReference(connectorInstanceEClass, CONNECTOR_INSTANCE__FROM_ROLE);
		createEReference(connectorInstanceEClass, CONNECTOR_INSTANCE__TO_ROLE);

		roleInstanceEClass = createEClass(ROLE_INSTANCE);
		createEReference(roleInstanceEClass, ROLE_INSTANCE__ROLE);

		patternInstanceRepositoryEClass = createEClass(PATTERN_INSTANCE_REPOSITORY);
		createEReference(patternInstanceRepositoryEClass, PATTERN_INSTANCE_REPOSITORY__SOLUTION_INSTANCES);
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
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		IdentifierPackage theIdentifierPackage = (IdentifierPackage)EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		PatternsPackage thePatternsPackage = (PatternsPackage)EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		patternInstanceEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		connectorInstanceEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		roleInstanceEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		patternInstanceRepositoryEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());

		// Initialize classes and features; add operations and parameters
		initEClass(patternInstanceEClass, PatternInstance.class, "PatternInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPatternInstance_Roles(), this.getRoleInstance(), null, "roles", null, 1, -1, PatternInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatternInstance_Connectors(), this.getConnectorInstance(), null, "connectors", null, 0, -1, PatternInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatternInstance_Name(), theEcorePackage.getEString(), "name", null, 0, 1, PatternInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatternInstance_ArchitecturalLevel(), theEcorePackage.getEInt(), "architecturalLevel", null, 0, 1, PatternInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatternInstance_Repository(), this.getPatternInstanceRepository(), this.getPatternInstanceRepository_SolutionInstances(), "repository", null, 0, 1, PatternInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectorInstanceEClass, ConnectorInstance.class, "ConnectorInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectorInstance_Connector(), thePatternsPackage.getConnector(), null, "connector", null, 1, 1, ConnectorInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectorInstance_FromRole(), this.getRoleInstance(), null, "fromRole", null, 1, -1, ConnectorInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectorInstance_ToRole(), this.getRoleInstance(), null, "toRole", null, 1, -1, ConnectorInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleInstanceEClass, RoleInstance.class, "RoleInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoleInstance_Role(), thePatternsPackage.getRole(), null, "role", null, 1, 1, RoleInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patternInstanceRepositoryEClass, PatternInstanceRepository.class, "PatternInstanceRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPatternInstanceRepository_SolutionInstances(), this.getPatternInstance(), this.getPatternInstance_Repository(), "solutionInstances", null, 0, -1, PatternInstanceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //PatterninstancesPackageImpl
