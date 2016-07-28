/**
 */
package edu.kit.ipd.sdq.toometa.users;

import de.uka.ipd.sdq.identifier.Identifier;

import edu.kit.ipd.sdq.toometa.relations.TraceableObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.users.User#getRoles <em>Roles</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.users.User#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.users.UsersPackage#getUser()
 * @model
 * @generated
 */
public interface User extends Identifier, TraceableObject {
	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.users.RoleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see edu.kit.ipd.sdq.toometa.users.UsersPackage#getUser_Roles()
	 * @model required="true"
	 * @generated
	 */
	EList<RoleType> getRoles();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edu.kit.ipd.sdq.toometa.users.UsersPackage#getUser_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.users.User#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // User
