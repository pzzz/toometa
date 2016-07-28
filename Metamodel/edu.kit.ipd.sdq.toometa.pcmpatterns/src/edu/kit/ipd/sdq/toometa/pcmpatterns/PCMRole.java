/**
 */
package edu.kit.ipd.sdq.toometa.pcmpatterns;

import edu.kit.ipd.sdq.toometa.patterns.Role;

import org.palladiosimulator.pcm.repository.OperationProvidedRole;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCM Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.pcmpatterns.PCMRole#getOperationProvidedRole <em>Operation Provided Role</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.pcmpatterns.PcmpatternsPackage#getPCMRole()
 * @model
 * @generated
 */
public interface PCMRole extends Role {
	/**
	 * Returns the value of the '<em><b>Operation Provided Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Provided Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Provided Role</em>' reference.
	 * @see #setOperationProvidedRole(OperationProvidedRole)
	 * @see edu.kit.ipd.sdq.toometa.pcmpatterns.PcmpatternsPackage#getPCMRole_OperationProvidedRole()
	 * @model
	 * @generated
	 */
	OperationProvidedRole getOperationProvidedRole();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.pcmpatterns.PCMRole#getOperationProvidedRole <em>Operation Provided Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Provided Role</em>' reference.
	 * @see #getOperationProvidedRole()
	 * @generated
	 */
	void setOperationProvidedRole(OperationProvidedRole value);

} // PCMRole
