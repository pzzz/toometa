/**
 */
package edu.kit.ipd.sdq.toometa.peropteryxcandidates;

import edu.kit.ipd.sdq.toometa.qualities.QualityType;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicted Quality Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.peropteryxcandidates.PredictedQualityValue#getQualityValue <em>Quality Value</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.peropteryxcandidates.PredictedQualityValue#getQualityType <em>Quality Type</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.peropteryxcandidates.PeropteryxcandidatesPackage#getPredictedQualityValue()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface PredictedQualityValue extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Quality Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quality Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quality Value</em>' attribute.
	 * @see #setQualityValue(Double)
	 * @see edu.kit.ipd.sdq.toometa.peropteryxcandidates.PeropteryxcandidatesPackage#getPredictedQualityValue_QualityValue()
	 * @model required="true"
	 * @generated
	 */
	Double getQualityValue();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.peropteryxcandidates.PredictedQualityValue#getQualityValue <em>Quality Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quality Value</em>' attribute.
	 * @see #getQualityValue()
	 * @generated
	 */
	void setQualityValue(Double value);

	/**
	 * Returns the value of the '<em><b>Quality Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quality Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quality Type</em>' reference.
	 * @see #setQualityType(QualityType)
	 * @see edu.kit.ipd.sdq.toometa.peropteryxcandidates.PeropteryxcandidatesPackage#getPredictedQualityValue_QualityType()
	 * @model required="true"
	 * @generated
	 */
	QualityType getQualityType();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.peropteryxcandidates.PredictedQualityValue#getQualityType <em>Quality Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quality Type</em>' reference.
	 * @see #getQualityType()
	 * @generated
	 */
	void setQualityType(QualityType value);

} // PredictedQualityValue
