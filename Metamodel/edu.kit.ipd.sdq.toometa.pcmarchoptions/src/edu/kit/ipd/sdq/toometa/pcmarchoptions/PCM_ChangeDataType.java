/**
 */
package edu.kit.ipd.sdq.toometa.pcmarchoptions;

import edu.kit.ipd.sdq.toometa.archoptions.ChangeDataType;

import org.palladiosimulator.pcm.repository.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCM Change Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_ChangeDataType#getOldDataType <em>Old Data Type</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_ChangeDataType#getNewDataType <em>New Data Type</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.pcmarchoptions.PcmarchoptionsPackage#getPCM_ChangeDataType()
 * @model
 * @generated
 */
public interface PCM_ChangeDataType extends ChangeDataType {
	/**
	 * Returns the value of the '<em><b>Old Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Data Type</em>' reference.
	 * @see #setOldDataType(DataType)
	 * @see edu.kit.ipd.sdq.toometa.pcmarchoptions.PcmarchoptionsPackage#getPCM_ChangeDataType_OldDataType()
	 * @model
	 * @generated
	 */
	DataType getOldDataType();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_ChangeDataType#getOldDataType <em>Old Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Data Type</em>' reference.
	 * @see #getOldDataType()
	 * @generated
	 */
	void setOldDataType(DataType value);

	/**
	 * Returns the value of the '<em><b>New Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Data Type</em>' reference.
	 * @see #setNewDataType(DataType)
	 * @see edu.kit.ipd.sdq.toometa.pcmarchoptions.PcmarchoptionsPackage#getPCM_ChangeDataType_NewDataType()
	 * @model
	 * @generated
	 */
	DataType getNewDataType();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_ChangeDataType#getNewDataType <em>New Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Data Type</em>' reference.
	 * @see #getNewDataType()
	 * @generated
	 */
	void setNewDataType(DataType value);

} // PCM_ChangeDataType
