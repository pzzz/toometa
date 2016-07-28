/**
 */
package edu.kit.ipd.sdq.toometa.requirements;

import edu.kit.ipd.sdq.toometa.qualities.QualityType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quality Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.requirements.QualityRequirement#getQualityType <em>Quality Type</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.requirements.RequirementsPackage#getQualityRequirement()
 * @model
 * @generated
 */
public interface QualityRequirement extends SystemRequirement {
	/**
	 * Returns the value of the '<em><b>Quality Type</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.qualities.QualityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quality Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quality Type</em>' reference list.
	 * @see edu.kit.ipd.sdq.toometa.requirements.RequirementsPackage#getQualityRequirement_QualityType()
	 * @model required="true"
	 * @generated
	 */
	EList<QualityType> getQualityType();

} // QualityRequirement
