/**
 */
package edu.kit.ipd.sdq.toometa.jiraissues;

import edu.kit.ipd.sdq.toometa.users.User;

import namedelement.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Proxy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.UserProxy#getUser <em>User</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getUserProxy()
 * @model
 * @generated
 */
public interface UserProxy extends AddressableElement, NamedElement {
	/**
	 * Returns the value of the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getUserProxy_User()
	 * @model required="true" changeable="false"
	 * @generated
	 */
	User getUser();

} // UserProxy
