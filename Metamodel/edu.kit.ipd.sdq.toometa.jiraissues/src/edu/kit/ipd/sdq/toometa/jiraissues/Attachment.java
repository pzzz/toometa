/**
 */
package edu.kit.ipd.sdq.toometa.jiraissues;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attachment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.Attachment#getFilename <em>Filename</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.Attachment#getSize <em>Size</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.Attachment#getMimeType <em>Mime Type</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.Attachment#getContentUri <em>Content Uri</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.Attachment#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.Attachment#getAuthor <em>Author</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getAttachment()
 * @model
 * @generated
 */
public interface Attachment extends AddressableElement {
	/**
	 * Returns the value of the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filename</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filename</em>' attribute.
	 * @see #setFilename(String)
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getAttachment_Filename()
	 * @model
	 * @generated
	 */
	String getFilename();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.jiraissues.Attachment#getFilename <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filename</em>' attribute.
	 * @see #getFilename()
	 * @generated
	 */
	void setFilename(String value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getAttachment_Size()
	 * @model
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.jiraissues.Attachment#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mime Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mime Type</em>' attribute.
	 * @see #setMimeType(String)
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getAttachment_MimeType()
	 * @model
	 * @generated
	 */
	String getMimeType();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.jiraissues.Attachment#getMimeType <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mime Type</em>' attribute.
	 * @see #getMimeType()
	 * @generated
	 */
	void setMimeType(String value);

	/**
	 * Returns the value of the '<em><b>Content Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Uri</em>' attribute.
	 * @see #setContentUri(String)
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getAttachment_ContentUri()
	 * @model
	 * @generated
	 */
	String getContentUri();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.jiraissues.Attachment#getContentUri <em>Content Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Uri</em>' attribute.
	 * @see #getContentUri()
	 * @generated
	 */
	void setContentUri(String value);

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(Date)
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getAttachment_CreationDate()
	 * @model
	 * @generated
	 */
	Date getCreationDate();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.jiraissues.Attachment#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(Date value);

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
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getAttachment_Author()
	 * @model required="true"
	 * @generated
	 */
	UserProxy getAuthor();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.jiraissues.Attachment#getAuthor <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(UserProxy value);

} // Attachment
