/**
 */
package edu.kit.ipd.sdq.toometa.patterns.patterninstances;

import de.uka.ipd.sdq.identifier.Identifier;

import edu.kit.ipd.sdq.toometa.patterns.Role;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.patterninstances.RoleInstance#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatterninstancesPackage#getRoleInstance()
 * @model abstract="true"
 * @generated
 */
public interface RoleInstance extends Identifier {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(Role)
	 * @see edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatterninstancesPackage#getRoleInstance_Role()
	 * @model required="true"
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.patterns.patterninstances.RoleInstance#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

} // RoleInstance
