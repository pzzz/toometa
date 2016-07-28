/**
 */
package edu.kit.ipd.sdq.toometa.users;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.users.UserRepository#getUsers <em>Users</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.users.UserRepository#getRoleTypes <em>Role Types</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.users.UsersPackage#getUserRepository()
 * @model
 * @generated
 */
public interface UserRepository extends Identifier {
	/**
	 * Returns the value of the '<em><b>Users</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.users.User}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Users</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.toometa.users.UsersPackage#getUserRepository_Users()
	 * @model containment="true"
	 * @generated
	 */
	EList<User> getUsers();

	/**
	 * Returns the value of the '<em><b>Role Types</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.users.RoleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Types</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.toometa.users.UsersPackage#getUserRepository_RoleTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<RoleType> getRoleTypes();

} // UserRepository
