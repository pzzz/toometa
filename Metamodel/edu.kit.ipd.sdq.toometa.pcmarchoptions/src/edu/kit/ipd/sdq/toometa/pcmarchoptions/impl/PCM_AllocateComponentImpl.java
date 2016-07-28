/**
 */
package edu.kit.ipd.sdq.toometa.pcmarchoptions.impl;

import edu.kit.ipd.sdq.toometa.archoptions.impl.AllocateComponentImpl;

import edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_AllocateComponent;
import edu.kit.ipd.sdq.toometa.pcmarchoptions.PcmarchoptionsPackage;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.allocation.AllocationContext;

import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCM Allocate Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.impl.PCM_AllocateComponentImpl#getAllocateTo <em>Allocate To</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.impl.PCM_AllocateComponentImpl#getContextToAllocate <em>Context To Allocate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCM_AllocateComponentImpl extends AllocateComponentImpl implements PCM_AllocateComponent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCM_AllocateComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcmarchoptionsPackage.Literals.PCM_ALLOCATE_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceContainer getAllocateTo() {
		return (ResourceContainer)eDynamicGet(PcmarchoptionsPackage.PCM_ALLOCATE_COMPONENT__ALLOCATE_TO, PcmarchoptionsPackage.Literals.PCM_ALLOCATE_COMPONENT__ALLOCATE_TO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceContainer basicGetAllocateTo() {
		return (ResourceContainer)eDynamicGet(PcmarchoptionsPackage.PCM_ALLOCATE_COMPONENT__ALLOCATE_TO, PcmarchoptionsPackage.Literals.PCM_ALLOCATE_COMPONENT__ALLOCATE_TO, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllocateTo(ResourceContainer newAllocateTo) {
		eDynamicSet(PcmarchoptionsPackage.PCM_ALLOCATE_COMPONENT__ALLOCATE_TO, PcmarchoptionsPackage.Literals.PCM_ALLOCATE_COMPONENT__ALLOCATE_TO, newAllocateTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationContext getContextToAllocate() {
		return (AllocationContext)eDynamicGet(PcmarchoptionsPackage.PCM_ALLOCATE_COMPONENT__CONTEXT_TO_ALLOCATE, PcmarchoptionsPackage.Literals.PCM_ALLOCATE_COMPONENT__CONTEXT_TO_ALLOCATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationContext basicGetContextToAllocate() {
		return (AllocationContext)eDynamicGet(PcmarchoptionsPackage.PCM_ALLOCATE_COMPONENT__CONTEXT_TO_ALLOCATE, PcmarchoptionsPackage.Literals.PCM_ALLOCATE_COMPONENT__CONTEXT_TO_ALLOCATE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextToAllocate(AllocationContext newContextToAllocate) {
		eDynamicSet(PcmarchoptionsPackage.PCM_ALLOCATE_COMPONENT__CONTEXT_TO_ALLOCATE, PcmarchoptionsPackage.Literals.PCM_ALLOCATE_COMPONENT__CONTEXT_TO_ALLOCATE, newContextToAllocate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PcmarchoptionsPackage.PCM_ALLOCATE_COMPONENT__ALLOCATE_TO:
				if (resolve) return getAllocateTo();
				return basicGetAllocateTo();
			case PcmarchoptionsPackage.PCM_ALLOCATE_COMPONENT__CONTEXT_TO_ALLOCATE:
				if (resolve) return getContextToAllocate();
				return basicGetContextToAllocate();
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
			case PcmarchoptionsPackage.PCM_ALLOCATE_COMPONENT__ALLOCATE_TO:
				setAllocateTo((ResourceContainer)newValue);
				return;
			case PcmarchoptionsPackage.PCM_ALLOCATE_COMPONENT__CONTEXT_TO_ALLOCATE:
				setContextToAllocate((AllocationContext)newValue);
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
			case PcmarchoptionsPackage.PCM_ALLOCATE_COMPONENT__ALLOCATE_TO:
				setAllocateTo((ResourceContainer)null);
				return;
			case PcmarchoptionsPackage.PCM_ALLOCATE_COMPONENT__CONTEXT_TO_ALLOCATE:
				setContextToAllocate((AllocationContext)null);
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
			case PcmarchoptionsPackage.PCM_ALLOCATE_COMPONENT__ALLOCATE_TO:
				return basicGetAllocateTo() != null;
			case PcmarchoptionsPackage.PCM_ALLOCATE_COMPONENT__CONTEXT_TO_ALLOCATE:
				return basicGetContextToAllocate() != null;
		}
		return super.eIsSet(featureID);
	}

} //PCM_AllocateComponentImpl
