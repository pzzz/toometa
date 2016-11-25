/**
 */
package edu.kit.ipd.sdq.toometa.requirements;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Requirements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.requirements.SystemRequirements#getSystemRequirements <em>System Requirements</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.requirements.SystemRequirements#getDefaultUsageModel <em>Default Usage Model</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.requirements.RequirementsPackage#getSystemRequirements()
 * @model
 * @generated
 */
public interface SystemRequirements extends Identifier {
	/**
	 * Returns the value of the '<em><b>System Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.requirements.SystemRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Requirements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Requirements</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.toometa.requirements.RequirementsPackage#getSystemRequirements_SystemRequirements()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemRequirement> getSystemRequirements();

	/**
	 * Returns the value of the '<em><b>Default Usage Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Usage Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Usage Model</em>' reference.
	 * @see #setDefaultUsageModel(UsageModelAdapter)
	 * @see edu.kit.ipd.sdq.toometa.requirements.RequirementsPackage#getSystemRequirements_DefaultUsageModel()
	 * @model
	 * @generated
	 */
	UsageModelAdapter getDefaultUsageModel();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.requirements.SystemRequirements#getDefaultUsageModel <em>Default Usage Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Usage Model</em>' reference.
	 * @see #getDefaultUsageModel()
	 * @generated
	 */
	void setDefaultUsageModel(UsageModelAdapter value);

} // SystemRequirements
