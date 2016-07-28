/**
 */
package edu.kit.ipd.sdq.toometa.jiraissues;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.Comment#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getComment()
 * @model
 * @generated
 */
public interface Comment extends AddressableElement, AuthorUpdatableElement {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getComment_Body()
	 * @model required="true"
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.jiraissues.Comment#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

} // Comment
