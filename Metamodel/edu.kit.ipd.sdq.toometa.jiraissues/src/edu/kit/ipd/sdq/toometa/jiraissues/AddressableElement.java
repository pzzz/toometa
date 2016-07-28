/**
 */
package edu.kit.ipd.sdq.toometa.jiraissues;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Addressable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.AddressableElement#getSelf <em>Self</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getAddressableElement()
 * @model
 * @generated
 */
public interface AddressableElement extends Identifier {
	/**
	 * Returns the value of the '<em><b>Self</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Self</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Self</em>' attribute.
	 * @see #setSelf(String)
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getAddressableElement_Self()
	 * @model required="true"
	 * @generated
	 */
	String getSelf();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.jiraissues.AddressableElement#getSelf <em>Self</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Self</em>' attribute.
	 * @see #getSelf()
	 * @generated
	 */
	void setSelf(String value);

} // AddressableElement
