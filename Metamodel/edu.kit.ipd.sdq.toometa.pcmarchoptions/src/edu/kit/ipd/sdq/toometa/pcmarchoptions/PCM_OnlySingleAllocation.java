/**
 */
package edu.kit.ipd.sdq.toometa.pcmarchoptions;

import edu.kit.ipd.sdq.toometa.archoptions.OnlySingleAllocation;

import org.palladiosimulator.pcm.allocation.AllocationContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCM Only Single Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_OnlySingleAllocation#getAllocationContext <em>Allocation Context</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.pcmarchoptions.PcmarchoptionsPackage#getPCM_OnlySingleAllocation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SingleAllocation'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL SingleAllocation='allocationContext.allocation_AllocationContext.allocationContexts_Allocation->select(a : allocation :: AllocationContext|a.assemblyContext_AllocationContext=allocationContext.assemblyContext_AllocationContext)->size()=1'"
 * @generated
 */
public interface PCM_OnlySingleAllocation extends OnlySingleAllocation {
	/**
	 * Returns the value of the '<em><b>Allocation Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocation Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation Context</em>' reference.
	 * @see #setAllocationContext(AllocationContext)
	 * @see edu.kit.ipd.sdq.toometa.pcmarchoptions.PcmarchoptionsPackage#getPCM_OnlySingleAllocation_AllocationContext()
	 * @model required="true"
	 * @generated
	 */
	AllocationContext getAllocationContext();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_OnlySingleAllocation#getAllocationContext <em>Allocation Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocation Context</em>' reference.
	 * @see #getAllocationContext()
	 * @generated
	 */
	void setAllocationContext(AllocationContext value);

} // PCM_OnlySingleAllocation
