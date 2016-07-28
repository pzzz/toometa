/**
 */
package edu.kit.ipd.sdq.toometa.users;

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
 * @see edu.kit.ipd.sdq.toometa.users.UsersFactory
 * @model kind="package"
 * @generated
 */
public interface UsersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "users";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.kit.edu/toometa/users/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "users";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UsersPackage eINSTANCE = edu.kit.ipd.sdq.toometa.users.impl.UsersPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.users.impl.UserRepositoryImpl <em>User Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.users.impl.UserRepositoryImpl
	 * @see edu.kit.ipd.sdq.toometa.users.impl.UsersPackageImpl#getUserRepository()
	 * @generated
	 */
	int USER_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_REPOSITORY__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Users</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_REPOSITORY__USERS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_REPOSITORY__ROLE_TYPES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>User Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_REPOSITORY_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.users.impl.RoleTypeImpl <em>Role Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.users.impl.RoleTypeImpl
	 * @see edu.kit.ipd.sdq.toometa.users.impl.UsersPackageImpl#getRoleType()
	 * @generated
	 */
	int ROLE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE__DESCRIPTION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.users.impl.ArchitectImpl <em>Architect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.users.impl.ArchitectImpl
	 * @see edu.kit.ipd.sdq.toometa.users.impl.UsersPackageImpl#getArchitect()
	 * @generated
	 */
	int ARCHITECT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECT__ID = ROLE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECT__DESCRIPTION = ROLE_TYPE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Architect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECT_FEATURE_COUNT = ROLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.users.impl.EngineerImpl <em>Engineer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.users.impl.EngineerImpl
	 * @see edu.kit.ipd.sdq.toometa.users.impl.UsersPackageImpl#getEngineer()
	 * @generated
	 */
	int ENGINEER = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER__ID = ROLE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER__DESCRIPTION = ROLE_TYPE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Engineer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER_FEATURE_COUNT = ROLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.users.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.users.impl.UserImpl
	 * @see edu.kit.ipd.sdq.toometa.users.impl.UsersPackageImpl#getUser()
	 * @generated
	 */
	int USER = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__RELATIONS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__CONFLICTS_WITH = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__HAS_CONFLICTS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__DUPLICATE_OF = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__HAS_DUPLICATES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__DEPENDS_ON = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__HAS_DEPENDENTS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PARENT_OF = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__SUBPART_OF = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__TRIGGER_OF = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__TRIGGERED_BY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__RESOLVES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__RESOLVED_BY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ALTERNATIVE_TO = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__HAS_ALTERNATIVES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__COULD_RESOLVE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__COULD_BE_RESOLVED_BY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__STAKEHOLDER_OF = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__HAS_STAKEHOLDERS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__SELECTED = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__SELECTED_BY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ROLES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 22;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 23;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.users.impl.ReqEngineerImpl <em>Req Engineer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.users.impl.ReqEngineerImpl
	 * @see edu.kit.ipd.sdq.toometa.users.impl.UsersPackageImpl#getReqEngineer()
	 * @generated
	 */
	int REQ_ENGINEER = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_ENGINEER__ID = ROLE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_ENGINEER__DESCRIPTION = ROLE_TYPE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Req Engineer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_ENGINEER_FEATURE_COUNT = ROLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.users.impl.OtherImpl <em>Other</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.users.impl.OtherImpl
	 * @see edu.kit.ipd.sdq.toometa.users.impl.UsersPackageImpl#getOther()
	 * @generated
	 */
	int OTHER = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER__ID = ROLE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER__DESCRIPTION = ROLE_TYPE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Other</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_FEATURE_COUNT = ROLE_TYPE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.users.UserRepository <em>User Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Repository</em>'.
	 * @see edu.kit.ipd.sdq.toometa.users.UserRepository
	 * @generated
	 */
	EClass getUserRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.toometa.users.UserRepository#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Users</em>'.
	 * @see edu.kit.ipd.sdq.toometa.users.UserRepository#getUsers()
	 * @see #getUserRepository()
	 * @generated
	 */
	EReference getUserRepository_Users();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.toometa.users.UserRepository#getRoleTypes <em>Role Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role Types</em>'.
	 * @see edu.kit.ipd.sdq.toometa.users.UserRepository#getRoleTypes()
	 * @see #getUserRepository()
	 * @generated
	 */
	EReference getUserRepository_RoleTypes();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.users.Architect <em>Architect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Architect</em>'.
	 * @see edu.kit.ipd.sdq.toometa.users.Architect
	 * @generated
	 */
	EClass getArchitect();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.users.Engineer <em>Engineer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Engineer</em>'.
	 * @see edu.kit.ipd.sdq.toometa.users.Engineer
	 * @generated
	 */
	EClass getEngineer();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.users.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see edu.kit.ipd.sdq.toometa.users.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.toometa.users.User#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roles</em>'.
	 * @see edu.kit.ipd.sdq.toometa.users.User#getRoles()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Roles();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.users.User#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.ipd.sdq.toometa.users.User#getName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Name();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.users.RoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Type</em>'.
	 * @see edu.kit.ipd.sdq.toometa.users.RoleType
	 * @generated
	 */
	EClass getRoleType();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.users.RoleType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.kit.ipd.sdq.toometa.users.RoleType#getDescription()
	 * @see #getRoleType()
	 * @generated
	 */
	EAttribute getRoleType_Description();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.users.ReqEngineer <em>Req Engineer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Req Engineer</em>'.
	 * @see edu.kit.ipd.sdq.toometa.users.ReqEngineer
	 * @generated
	 */
	EClass getReqEngineer();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.users.Other <em>Other</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Other</em>'.
	 * @see edu.kit.ipd.sdq.toometa.users.Other
	 * @generated
	 */
	EClass getOther();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UsersFactory getUsersFactory();

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
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.users.impl.UserRepositoryImpl <em>User Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.users.impl.UserRepositoryImpl
		 * @see edu.kit.ipd.sdq.toometa.users.impl.UsersPackageImpl#getUserRepository()
		 * @generated
		 */
		EClass USER_REPOSITORY = eINSTANCE.getUserRepository();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_REPOSITORY__USERS = eINSTANCE.getUserRepository_Users();

		/**
		 * The meta object literal for the '<em><b>Role Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_REPOSITORY__ROLE_TYPES = eINSTANCE.getUserRepository_RoleTypes();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.users.impl.ArchitectImpl <em>Architect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.users.impl.ArchitectImpl
		 * @see edu.kit.ipd.sdq.toometa.users.impl.UsersPackageImpl#getArchitect()
		 * @generated
		 */
		EClass ARCHITECT = eINSTANCE.getArchitect();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.users.impl.EngineerImpl <em>Engineer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.users.impl.EngineerImpl
		 * @see edu.kit.ipd.sdq.toometa.users.impl.UsersPackageImpl#getEngineer()
		 * @generated
		 */
		EClass ENGINEER = eINSTANCE.getEngineer();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.users.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.users.impl.UserImpl
		 * @see edu.kit.ipd.sdq.toometa.users.impl.UsersPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__ROLES = eINSTANCE.getUser_Roles();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__NAME = eINSTANCE.getUser_Name();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.users.impl.RoleTypeImpl <em>Role Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.users.impl.RoleTypeImpl
		 * @see edu.kit.ipd.sdq.toometa.users.impl.UsersPackageImpl#getRoleType()
		 * @generated
		 */
		EClass ROLE_TYPE = eINSTANCE.getRoleType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_TYPE__DESCRIPTION = eINSTANCE.getRoleType_Description();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.users.impl.ReqEngineerImpl <em>Req Engineer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.users.impl.ReqEngineerImpl
		 * @see edu.kit.ipd.sdq.toometa.users.impl.UsersPackageImpl#getReqEngineer()
		 * @generated
		 */
		EClass REQ_ENGINEER = eINSTANCE.getReqEngineer();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.users.impl.OtherImpl <em>Other</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.users.impl.OtherImpl
		 * @see edu.kit.ipd.sdq.toometa.users.impl.UsersPackageImpl#getOther()
		 * @generated
		 */
		EClass OTHER = eINSTANCE.getOther();

	}

} //UsersPackage
