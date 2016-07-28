/**
 */
package edu.kit.ipd.sdq.toometa.jiraissues;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Author Updatable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.AuthorUpdatableElement#getAuthor <em>Author</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.AuthorUpdatableElement#getUpdateAuthor <em>Update Author</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getAuthorUpdatableElement()
 * @model
 * @generated
 */
public interface AuthorUpdatableElement extends UpdatableElement {
	/**
	 * Returns the value of the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' reference.
	 * @see #setAuthor(UserProxy)
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getAuthorUpdatableElement_Author()
	 * @model required="true"
	 * @generated
	 */
	UserProxy getAuthor();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.jiraissues.AuthorUpdatableElement#getAuthor <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(UserProxy value);

	/**
	 * Returns the value of the '<em><b>Update Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update Author</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Author</em>' reference.
	 * @see #setUpdateAuthor(UserProxy)
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getAuthorUpdatableElement_UpdateAuthor()
	 * @model
	 * @generated
	 */
	UserProxy getUpdateAuthor();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.jiraissues.AuthorUpdatableElement#getUpdateAuthor <em>Update Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Author</em>' reference.
	 * @see #getUpdateAuthor()
	 * @generated
	 */
	void setUpdateAuthor(UserProxy value);

} // AuthorUpdatableElement
