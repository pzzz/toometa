/**
 */
package edu.kit.ipd.sdq.toometa.jiraissues;

import namedelement.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.Project#getKey <em>Key</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends AddressableElement, NamedElement {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getProject_Key()
	 * @model required="true"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.jiraissues.Project#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

} // Project
