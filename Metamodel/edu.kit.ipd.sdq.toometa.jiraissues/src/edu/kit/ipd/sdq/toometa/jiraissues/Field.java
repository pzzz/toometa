/**
 */
package edu.kit.ipd.sdq.toometa.jiraissues;

import de.uka.ipd.sdq.identifier.Identifier;

import namedelement.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.Field#getFieldId <em>Field Id</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.Field#getType <em>Type</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.Field#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getField()
 * @model
 * @generated
 */
public interface Field extends Identifier, NamedElement {
	/**
	 * Returns the value of the '<em><b>Field Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Id</em>' attribute.
	 * @see #setFieldId(String)
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getField_FieldId()
	 * @model
	 * @generated
	 */
	String getFieldId();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.jiraissues.Field#getFieldId <em>Field Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Id</em>' attribute.
	 * @see #getFieldId()
	 * @generated
	 */
	void setFieldId(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getField_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.jiraissues.Field#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Object)
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getField_Value()
	 * @model
	 * @generated
	 */
	Object getValue();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.jiraissues.Field#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Object value);

} // Field
