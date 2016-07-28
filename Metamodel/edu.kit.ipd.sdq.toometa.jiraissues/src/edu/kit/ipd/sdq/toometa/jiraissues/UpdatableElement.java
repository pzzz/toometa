/**
 */
package edu.kit.ipd.sdq.toometa.jiraissues;

import de.uka.ipd.sdq.identifier.Identifier;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Updatable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.UpdatableElement#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.UpdatableElement#getUpdateDate <em>Update Date</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getUpdatableElement()
 * @model
 * @generated
 */
public interface UpdatableElement extends Identifier {
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
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getUpdatableElement_CreationDate()
	 * @model
	 * @generated
	 */
	Date getCreationDate();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.jiraissues.UpdatableElement#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Update Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Date</em>' attribute.
	 * @see #setUpdateDate(Date)
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getUpdatableElement_UpdateDate()
	 * @model
	 * @generated
	 */
	Date getUpdateDate();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.jiraissues.UpdatableElement#getUpdateDate <em>Update Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Date</em>' attribute.
	 * @see #getUpdateDate()
	 * @generated
	 */
	void setUpdateDate(Date value);

} // UpdatableElement
