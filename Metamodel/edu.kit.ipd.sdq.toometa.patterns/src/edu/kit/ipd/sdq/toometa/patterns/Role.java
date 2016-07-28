/**
 */
package edu.kit.ipd.sdq.toometa.patterns;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.Role#getDesctiption <em>Desctiption</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.Role#getMaxInstances <em>Max Instances</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.patterns.PatternsPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends Identifier {
	/**
	 * Returns the value of the '<em><b>Desctiption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Desctiption</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desctiption</em>' attribute.
	 * @see #setDesctiption(String)
	 * @see edu.kit.ipd.sdq.toometa.patterns.PatternsPackage#getRole_Desctiption()
	 * @model
	 * @generated
	 */
	String getDesctiption();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.patterns.Role#getDesctiption <em>Desctiption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desctiption</em>' attribute.
	 * @see #getDesctiption()
	 * @generated
	 */
	void setDesctiption(String value);

	/**
	 * Returns the value of the '<em><b>Max Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Instances</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Instances</em>' attribute.
	 * @see #setMaxInstances(int)
	 * @see edu.kit.ipd.sdq.toometa.patterns.PatternsPackage#getRole_MaxInstances()
	 * @model
	 * @generated
	 */
	int getMaxInstances();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.patterns.Role#getMaxInstances <em>Max Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Instances</em>' attribute.
	 * @see #getMaxInstances()
	 * @generated
	 */
	void setMaxInstances(int value);

} // Role
