/**
 */
package edu.kit.ipd.sdq.toometa.pcmarchoptions;

import edu.kit.ipd.sdq.toometa.archoptions.BanComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCM Ban Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_BanComponent#getBannedContextName <em>Banned Context Name</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.pcmarchoptions.PcmarchoptionsPackage#getPCM_BanComponent()
 * @model
 * @generated
 */
public interface PCM_BanComponent extends BanComponent {
	/**
	 * Returns the value of the '<em><b>Banned Context Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Banned Context Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Banned Context Name</em>' attribute.
	 * @see #setBannedContextName(String)
	 * @see edu.kit.ipd.sdq.toometa.pcmarchoptions.PcmarchoptionsPackage#getPCM_BanComponent_BannedContextName()
	 * @model required="true"
	 * @generated
	 */
	String getBannedContextName();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_BanComponent#getBannedContextName <em>Banned Context Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Banned Context Name</em>' attribute.
	 * @see #getBannedContextName()
	 * @generated
	 */
	void setBannedContextName(String value);

} // PCM_BanComponent
