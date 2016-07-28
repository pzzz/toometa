/**
 */
package edu.kit.ipd.sdq.toometa.pcmarchoptions.impl;

import edu.kit.ipd.sdq.toometa.archoptions.impl.OnlySingleAllocationImpl;

import edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_OnlySingleAllocation;
import edu.kit.ipd.sdq.toometa.pcmarchoptions.PcmarchoptionsPackage;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.allocation.AllocationContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCM Only Single Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.impl.PCM_OnlySingleAllocationImpl#getAllocationContext <em>Allocation Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCM_OnlySingleAllocationImpl extends OnlySingleAllocationImpl implements PCM_OnlySingleAllocation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCM_OnlySingleAllocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcmarchoptionsPackage.Literals.PCM_ONLY_SINGLE_ALLOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationContext getAllocationContext() {
		return (AllocationContext)eDynamicGet(PcmarchoptionsPackage.PCM_ONLY_SINGLE_ALLOCATION__ALLOCATION_CONTEXT, PcmarchoptionsPackage.Literals.PCM_ONLY_SINGLE_ALLOCATION__ALLOCATION_CONTEXT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationContext basicGetAllocationContext() {
		return (AllocationContext)eDynamicGet(PcmarchoptionsPackage.PCM_ONLY_SINGLE_ALLOCATION__ALLOCATION_CONTEXT, PcmarchoptionsPackage.Literals.PCM_ONLY_SINGLE_ALLOCATION__ALLOCATION_CONTEXT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllocationContext(AllocationContext newAllocationContext) {
		eDynamicSet(PcmarchoptionsPackage.PCM_ONLY_SINGLE_ALLOCATION__ALLOCATION_CONTEXT, PcmarchoptionsPackage.Literals.PCM_ONLY_SINGLE_ALLOCATION__ALLOCATION_CONTEXT, newAllocationContext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PcmarchoptionsPackage.PCM_ONLY_SINGLE_ALLOCATION__ALLOCATION_CONTEXT:
				if (resolve) return getAllocationContext();
				return basicGetAllocationContext();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PcmarchoptionsPackage.PCM_ONLY_SINGLE_ALLOCATION__ALLOCATION_CONTEXT:
				setAllocationContext((AllocationContext)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PcmarchoptionsPackage.PCM_ONLY_SINGLE_ALLOCATION__ALLOCATION_CONTEXT:
				setAllocationContext((AllocationContext)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PcmarchoptionsPackage.PCM_ONLY_SINGLE_ALLOCATION__ALLOCATION_CONTEXT:
				return basicGetAllocationContext() != null;
		}
		return super.eIsSet(featureID);
	}

} //PCM_OnlySingleAllocationImpl
