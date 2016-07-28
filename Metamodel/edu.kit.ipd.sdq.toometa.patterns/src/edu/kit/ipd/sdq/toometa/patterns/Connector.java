/**
 */
package edu.kit.ipd.sdq.toometa.patterns;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.Connector#getConnectorTo <em>Connector To</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.Connector#getConnectorFrom <em>Connector From</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.Connector#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.patterns.PatternsPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends Identifier {
	/**
	 * Returns the value of the '<em><b>Connector To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector To</em>' reference.
	 * @see #setConnectorTo(Role)
	 * @see edu.kit.ipd.sdq.toometa.patterns.PatternsPackage#getConnector_ConnectorTo()
	 * @model required="true"
	 * @generated
	 */
	Role getConnectorTo();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.patterns.Connector#getConnectorTo <em>Connector To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector To</em>' reference.
	 * @see #getConnectorTo()
	 * @generated
	 */
	void setConnectorTo(Role value);

	/**
	 * Returns the value of the '<em><b>Connector From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector From</em>' reference.
	 * @see #setConnectorFrom(Role)
	 * @see edu.kit.ipd.sdq.toometa.patterns.PatternsPackage#getConnector_ConnectorFrom()
	 * @model required="true"
	 * @generated
	 */
	Role getConnectorFrom();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.patterns.Connector#getConnectorFrom <em>Connector From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector From</em>' reference.
	 * @see #getConnectorFrom()
	 * @generated
	 */
	void setConnectorFrom(Role value);

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
	 * @see edu.kit.ipd.sdq.toometa.patterns.PatternsPackage#getConnector_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.patterns.Connector#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Connector
