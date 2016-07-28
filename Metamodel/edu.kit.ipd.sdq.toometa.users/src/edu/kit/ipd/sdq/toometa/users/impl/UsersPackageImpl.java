/**
 */
package edu.kit.ipd.sdq.toometa.users.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import edu.kit.ipd.sdq.toometa.relations.RelationsPackage;

import edu.kit.ipd.sdq.toometa.users.Architect;
import edu.kit.ipd.sdq.toometa.users.Engineer;
import edu.kit.ipd.sdq.toometa.users.Other;
import edu.kit.ipd.sdq.toometa.users.ReqEngineer;
import edu.kit.ipd.sdq.toometa.users.RoleType;
import edu.kit.ipd.sdq.toometa.users.User;
import edu.kit.ipd.sdq.toometa.users.UserRepository;
import edu.kit.ipd.sdq.toometa.users.UsersFactory;
import edu.kit.ipd.sdq.toometa.users.UsersPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UsersPackageImpl extends EPackageImpl implements UsersPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass architectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass engineerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reqEngineerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass otherEClass = null;

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
	 * @see edu.kit.ipd.sdq.toometa.users.UsersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UsersPackageImpl() {
		super(eNS_URI, UsersFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UsersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UsersPackage init() {
		if (isInited) return (UsersPackage)EPackage.Registry.INSTANCE.getEPackage(UsersPackage.eNS_URI);

		// Obtain or create and register package
		UsersPackageImpl theUsersPackage = (UsersPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UsersPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UsersPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		RelationsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theUsersPackage.createPackageContents();

		// Initialize created meta-data
		theUsersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUsersPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UsersPackage.eNS_URI, theUsersPackage);
		return theUsersPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserRepository() {
		return userRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserRepository_Users() {
		return (EReference)userRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserRepository_RoleTypes() {
		return (EReference)userRepositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArchitect() {
		return architectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEngineer() {
		return engineerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_Roles() {
		return (EReference)userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Name() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleType() {
		return roleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleType_Description() {
		return (EAttribute)roleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReqEngineer() {
		return reqEngineerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOther() {
		return otherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsersFactory getUsersFactory() {
		return (UsersFactory)getEFactoryInstance();
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
		userRepositoryEClass = createEClass(USER_REPOSITORY);
		createEReference(userRepositoryEClass, USER_REPOSITORY__USERS);
		createEReference(userRepositoryEClass, USER_REPOSITORY__ROLE_TYPES);

		architectEClass = createEClass(ARCHITECT);

		engineerEClass = createEClass(ENGINEER);

		userEClass = createEClass(USER);
		createEReference(userEClass, USER__ROLES);
		createEAttribute(userEClass, USER__NAME);

		roleTypeEClass = createEClass(ROLE_TYPE);
		createEAttribute(roleTypeEClass, ROLE_TYPE__DESCRIPTION);

		reqEngineerEClass = createEClass(REQ_ENGINEER);

		otherEClass = createEClass(OTHER);
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
		RelationsPackage theRelationsPackage = (RelationsPackage)EPackage.Registry.INSTANCE.getEPackage(RelationsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		userRepositoryEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		architectEClass.getESuperTypes().add(this.getRoleType());
		engineerEClass.getESuperTypes().add(this.getRoleType());
		userEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		userEClass.getESuperTypes().add(theRelationsPackage.getTraceableObject());
		roleTypeEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		reqEngineerEClass.getESuperTypes().add(this.getRoleType());
		otherEClass.getESuperTypes().add(this.getRoleType());

		// Initialize classes and features; add operations and parameters
		initEClass(userRepositoryEClass, UserRepository.class, "UserRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUserRepository_Users(), this.getUser(), null, "users", null, 0, -1, UserRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserRepository_RoleTypes(), this.getRoleType(), null, "roleTypes", null, 0, -1, UserRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(architectEClass, Architect.class, "Architect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(engineerEClass, Engineer.class, "Engineer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUser_Roles(), this.getRoleType(), null, "roles", null, 1, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Name(), ecorePackage.getEString(), "name", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleTypeEClass, RoleType.class, "RoleType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoleType_Description(), ecorePackage.getEString(), "description", null, 1, 1, RoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reqEngineerEClass, ReqEngineer.class, "ReqEngineer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(otherEClass, Other.class, "Other", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //UsersPackageImpl
