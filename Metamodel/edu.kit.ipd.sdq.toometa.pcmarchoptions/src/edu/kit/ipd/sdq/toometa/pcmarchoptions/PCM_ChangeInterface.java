/**
 */
package edu.kit.ipd.sdq.toometa.pcmarchoptions;

import edu.kit.ipd.sdq.toometa.archoptions.ChangeInterface;

import org.palladiosimulator.pcm.repository.OperationInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCM Change Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_ChangeInterface#getOldInterface <em>Old Interface</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_ChangeInterface#getNewInterface <em>New Interface</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.pcmarchoptions.PcmarchoptionsPackage#getPCM_ChangeInterface()
 * @model
 * @generated
 */
public interface PCM_ChangeInterface extends ChangeInterface {
	/**
	 * Returns the value of the '<em><b>Old Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Interface</em>' reference.
	 * @see #setOldInterface(OperationInterface)
	 * @see edu.kit.ipd.sdq.toometa.pcmarchoptions.PcmarchoptionsPackage#getPCM_ChangeInterface_OldInterface()
	 * @model
	 * @generated
	 */
	OperationInterface getOldInterface();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_ChangeInterface#getOldInterface <em>Old Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Interface</em>' reference.
	 * @see #getOldInterface()
	 * @generated
	 */
	void setOldInterface(OperationInterface value);

	/**
	 * Returns the value of the '<em><b>New Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Interface</em>' reference.
	 * @see #setNewInterface(OperationInterface)
	 * @see edu.kit.ipd.sdq.toometa.pcmarchoptions.PcmarchoptionsPackage#getPCM_ChangeInterface_NewInterface()
	 * @model
	 * @generated
	 */
	OperationInterface getNewInterface();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_ChangeInterface#getNewInterface <em>New Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Interface</em>' reference.
	 * @see #getNewInterface()
	 * @generated
	 */
	void setNewInterface(OperationInterface value);

} // PCM_ChangeInterface
