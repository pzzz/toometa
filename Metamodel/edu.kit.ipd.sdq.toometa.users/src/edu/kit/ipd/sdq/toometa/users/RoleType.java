/**
 */
package edu.kit.ipd.sdq.toometa.users;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.users.RoleType#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.users.UsersPackage#getRoleType()
 * @model abstract="true"
 * @generated
 */
public interface RoleType extends Identifier {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see edu.kit.ipd.sdq.toometa.users.UsersPackage#getRoleType_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.users.RoleType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // RoleType
