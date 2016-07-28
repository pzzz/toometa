/**
 */
package edu.kit.ipd.sdq.toometa.pcmarchoptions;

import edu.kit.ipd.sdq.toometa.archoptions.MultipleAllocation;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.allocation.AllocationContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCM Multiple Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_MultipleAllocation#getAllocationContexts <em>Allocation Contexts</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.pcmarchoptions.PcmarchoptionsPackage#getPCM_MultipleAllocation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='MultipleAllocation'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL MultipleAllocation='allocationContexts->forAll(a:allocation::AllocationContext, b:allocation::AllocationContext | a<>b implies (a.assemblyContext_AllocationContext=b.assemblyContext_AllocationContext and a.resourceContainer_AllocationContext<>b.resourceContainer_AllocationContext))'"
 * @generated
 */
public interface PCM_MultipleAllocation extends MultipleAllocation {
	/**
	 * Returns the value of the '<em><b>Allocation Contexts</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.allocation.AllocationContext}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocation Contexts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation Contexts</em>' reference list.
	 * @see edu.kit.ipd.sdq.toometa.pcmarchoptions.PcmarchoptionsPackage#getPCM_MultipleAllocation_AllocationContexts()
	 * @model lower="2"
	 * @generated
	 */
	EList<AllocationContext> getAllocationContexts();

} // PCM_MultipleAllocation
