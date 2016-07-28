/**
 */
package edu.kit.ipd.sdq.toometa.pcmarchoptions.impl;

import edu.kit.ipd.sdq.toometa.archoptions.impl.ReuseComponentImpl;

import edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_ReuseComponent;
import edu.kit.ipd.sdq.toometa.pcmarchoptions.PcmarchoptionsPackage;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCM Reuse Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.impl.PCM_ReuseComponentImpl#getAssemblyContext <em>Assembly Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCM_ReuseComponentImpl extends ReuseComponentImpl implements PCM_ReuseComponent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCM_ReuseComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcmarchoptionsPackage.Literals.PCM_REUSE_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext getAssemblyContext() {
		return (AssemblyContext)eDynamicGet(PcmarchoptionsPackage.PCM_REUSE_COMPONENT__ASSEMBLY_CONTEXT, PcmarchoptionsPackage.Literals.PCM_REUSE_COMPONENT__ASSEMBLY_CONTEXT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext basicGetAssemblyContext() {
		return (AssemblyContext)eDynamicGet(PcmarchoptionsPackage.PCM_REUSE_COMPONENT__ASSEMBLY_CONTEXT, PcmarchoptionsPackage.Literals.PCM_REUSE_COMPONENT__ASSEMBLY_CONTEXT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssemblyContext(AssemblyContext newAssemblyContext) {
		eDynamicSet(PcmarchoptionsPackage.PCM_REUSE_COMPONENT__ASSEMBLY_CONTEXT, PcmarchoptionsPackage.Literals.PCM_REUSE_COMPONENT__ASSEMBLY_CONTEXT, newAssemblyContext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PcmarchoptionsPackage.PCM_REUSE_COMPONENT__ASSEMBLY_CONTEXT:
				if (resolve) return getAssemblyContext();
				return basicGetAssemblyContext();
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
			case PcmarchoptionsPackage.PCM_REUSE_COMPONENT__ASSEMBLY_CONTEXT:
				setAssemblyContext((AssemblyContext)newValue);
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
			case PcmarchoptionsPackage.PCM_REUSE_COMPONENT__ASSEMBLY_CONTEXT:
				setAssemblyContext((AssemblyContext)null);
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
			case PcmarchoptionsPackage.PCM_REUSE_COMPONENT__ASSEMBLY_CONTEXT:
				return basicGetAssemblyContext() != null;
		}
		return super.eIsSet(featureID);
	}

} //PCM_ReuseComponentImpl
