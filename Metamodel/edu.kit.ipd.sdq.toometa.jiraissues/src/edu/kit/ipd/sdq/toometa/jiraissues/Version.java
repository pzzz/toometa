/**
 */
package edu.kit.ipd.sdq.toometa.jiraissues;

import java.util.Date;

import namedelement.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.Version#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.Version#isIsArchived <em>Is Archived</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.Version#isIsReleased <em>Is Released</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.Version#getReleaseDate <em>Release Date</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getVersion()
 * @model
 * @generated
 */
public interface Version extends AddressableElement, NamedElement {
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
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getVersion_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.jiraissues.Version#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Is Archived</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Archived</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Archived</em>' attribute.
	 * @see #setIsArchived(boolean)
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getVersion_IsArchived()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsArchived();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.jiraissues.Version#isIsArchived <em>Is Archived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Archived</em>' attribute.
	 * @see #isIsArchived()
	 * @generated
	 */
	void setIsArchived(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Released</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Released</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Released</em>' attribute.
	 * @see #setIsReleased(boolean)
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getVersion_IsReleased()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsReleased();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.jiraissues.Version#isIsReleased <em>Is Released</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Released</em>' attribute.
	 * @see #isIsReleased()
	 * @generated
	 */
	void setIsReleased(boolean value);

	/**
	 * Returns the value of the '<em><b>Release Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Release Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release Date</em>' attribute.
	 * @see #setReleaseDate(Date)
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getVersion_ReleaseDate()
	 * @model
	 * @generated
	 */
	Date getReleaseDate();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.jiraissues.Version#getReleaseDate <em>Release Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release Date</em>' attribute.
	 * @see #getReleaseDate()
	 * @generated
	 */
	void setReleaseDate(Date value);

} // Version
