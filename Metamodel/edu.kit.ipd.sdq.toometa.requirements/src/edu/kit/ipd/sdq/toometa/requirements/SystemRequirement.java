/**
 */
package edu.kit.ipd.sdq.toometa.requirements;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.requirements.SystemRequirement#getExceptionUsageModel <em>Exception Usage Model</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.requirements.RequirementsPackage#getSystemRequirement()
 * @model abstract="true"
 * @generated
 */
public interface SystemRequirement extends Requirement {

	/**
	 * Returns the value of the '<em><b>Exception Usage Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception Usage Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Usage Model</em>' reference.
	 * @see #setExceptionUsageModel(UsageModelAdapter)
	 * @see edu.kit.ipd.sdq.toometa.requirements.RequirementsPackage#getSystemRequirement_ExceptionUsageModel()
	 * @model
	 * @generated
	 */
	UsageModelAdapter getExceptionUsageModel();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.requirements.SystemRequirement#getExceptionUsageModel <em>Exception Usage Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Usage Model</em>' reference.
	 * @see #getExceptionUsageModel()
	 * @generated
	 */
	void setExceptionUsageModel(UsageModelAdapter value);
} // SystemRequirement
