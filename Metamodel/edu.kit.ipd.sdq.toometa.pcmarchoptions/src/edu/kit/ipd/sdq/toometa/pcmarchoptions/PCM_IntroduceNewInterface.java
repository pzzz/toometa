/**
 */
package edu.kit.ipd.sdq.toometa.pcmarchoptions;

import edu.kit.ipd.sdq.toometa.archoptions.IntroduceNewInterface;

import org.palladiosimulator.pcm.repository.OperationInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCM Introduce New Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_IntroduceNewInterface#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.pcmarchoptions.PcmarchoptionsPackage#getPCM_IntroduceNewInterface()
 * @model
 * @generated
 */
public interface PCM_IntroduceNewInterface extends IntroduceNewInterface {
	/**
	 * Returns the value of the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' reference.
	 * @see #setInterface(OperationInterface)
	 * @see edu.kit.ipd.sdq.toometa.pcmarchoptions.PcmarchoptionsPackage#getPCM_IntroduceNewInterface_Interface()
	 * @model
	 * @generated
	 */
	OperationInterface getInterface();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_IntroduceNewInterface#getInterface <em>Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(OperationInterface value);

} // PCM_IntroduceNewInterface
