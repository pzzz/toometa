/**
 */
package edu.kit.ipd.sdq.toometa.pcmarchoptions;

import edu.kit.ipd.sdq.toometa.archoptions.AllocateComponent;

import org.palladiosimulator.pcm.allocation.AllocationContext;

import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCM Allocate Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_AllocateComponent#getAllocateTo <em>Allocate To</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_AllocateComponent#getContextToAllocate <em>Context To Allocate</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.pcmarchoptions.PcmarchoptionsPackage#getPCM_AllocateComponent()
 * @model
 * @generated
 */
public interface PCM_AllocateComponent extends AllocateComponent {
	/**
	 * Returns the value of the '<em><b>Allocate To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocate To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocate To</em>' reference.
	 * @see #setAllocateTo(ResourceContainer)
	 * @see edu.kit.ipd.sdq.toometa.pcmarchoptions.PcmarchoptionsPackage#getPCM_AllocateComponent_AllocateTo()
	 * @model required="true"
	 * @generated
	 */
	ResourceContainer getAllocateTo();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_AllocateComponent#getAllocateTo <em>Allocate To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocate To</em>' reference.
	 * @see #getAllocateTo()
	 * @generated
	 */
	void setAllocateTo(ResourceContainer value);

	/**
	 * Returns the value of the '<em><b>Context To Allocate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context To Allocate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context To Allocate</em>' reference.
	 * @see #setContextToAllocate(AllocationContext)
	 * @see edu.kit.ipd.sdq.toometa.pcmarchoptions.PcmarchoptionsPackage#getPCM_AllocateComponent_ContextToAllocate()
	 * @model required="true"
	 * @generated
	 */
	AllocationContext getContextToAllocate();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_AllocateComponent#getContextToAllocate <em>Context To Allocate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context To Allocate</em>' reference.
	 * @see #getContextToAllocate()
	 * @generated
	 */
	void setContextToAllocate(AllocationContext value);

} // PCM_AllocateComponent
