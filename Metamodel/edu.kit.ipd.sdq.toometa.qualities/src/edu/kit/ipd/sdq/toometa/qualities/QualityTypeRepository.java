/**
 */
package edu.kit.ipd.sdq.toometa.qualities;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quality Type Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.qualities.QualityTypeRepository#getQualityType <em>Quality Type</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.qualities.QualitiesPackage#getQualityTypeRepository()
 * @model
 * @generated
 */
public interface QualityTypeRepository extends Identifier {
	/**
	 * Returns the value of the '<em><b>Quality Type</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.qualities.QualityType}.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.toometa.qualities.QualityType#getQualityTypeRepository <em>Quality Type Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quality Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quality Type</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.toometa.qualities.QualitiesPackage#getQualityTypeRepository_QualityType()
	 * @see edu.kit.ipd.sdq.toometa.qualities.QualityType#getQualityTypeRepository
	 * @model opposite="qualityTypeRepository" containment="true"
	 * @generated
	 */
	EList<QualityType> getQualityType();

	/**
	 * @generated NOT
	 */
	QualityType getQualityTypeByPerOpteryxId(String peropteryxID);
} // QualityTypeRepository
