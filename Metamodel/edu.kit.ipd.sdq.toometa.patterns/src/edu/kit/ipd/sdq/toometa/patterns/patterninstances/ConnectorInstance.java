/**
 */
package edu.kit.ipd.sdq.toometa.patterns.patterninstances;

import de.uka.ipd.sdq.identifier.Identifier;

import edu.kit.ipd.sdq.toometa.patterns.Connector;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.patterninstances.ConnectorInstance#getConnector <em>Connector</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.patterninstances.ConnectorInstance#getFromRole <em>From Role</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.patterninstances.ConnectorInstance#getToRole <em>To Role</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatterninstancesPackage#getConnectorInstance()
 * @model abstract="true"
 * @generated
 */
public interface ConnectorInstance extends Identifier {
	/**
	 * Returns the value of the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' reference.
	 * @see #setConnector(Connector)
	 * @see edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatterninstancesPackage#getConnectorInstance_Connector()
	 * @model required="true"
	 * @generated
	 */
	Connector getConnector();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.patterns.patterninstances.ConnectorInstance#getConnector <em>Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector</em>' reference.
	 * @see #getConnector()
	 * @generated
	 */
	void setConnector(Connector value);

	/**
	 * Returns the value of the '<em><b>From Role</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.patterns.patterninstances.RoleInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Role</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Role</em>' reference list.
	 * @see edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatterninstancesPackage#getConnectorInstance_FromRole()
	 * @model required="true"
	 * @generated
	 */
	EList<RoleInstance> getFromRole();

	/**
	 * Returns the value of the '<em><b>To Role</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.patterns.patterninstances.RoleInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Role</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Role</em>' reference list.
	 * @see edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatterninstancesPackage#getConnectorInstance_ToRole()
	 * @model required="true"
	 * @generated
	 */
	EList<RoleInstance> getToRole();

} // ConnectorInstance
