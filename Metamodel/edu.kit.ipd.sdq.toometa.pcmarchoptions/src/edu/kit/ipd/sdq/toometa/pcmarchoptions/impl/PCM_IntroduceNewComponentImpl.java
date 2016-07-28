/**
 */
package edu.kit.ipd.sdq.toometa.pcmarchoptions.impl;

import edu.kit.ipd.sdq.toometa.archoptions.impl.IntroduceNewComponentImpl;

import edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_IntroduceNewComponent;
import edu.kit.ipd.sdq.toometa.pcmarchoptions.PcmarchoptionsPackage;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCM Introduce New Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.impl.PCM_IntroduceNewComponentImpl#getAssemblyContext <em>Assembly Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCM_IntroduceNewComponentImpl extends IntroduceNewComponentImpl implements PCM_IntroduceNewComponent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCM_IntroduceNewComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcmarchoptionsPackage.Literals.PCM_INTRODUCE_NEW_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext getAssemblyContext() {
		return (AssemblyContext)eDynamicGet(PcmarchoptionsPackage.PCM_INTRODUCE_NEW_COMPONENT__ASSEMBLY_CONTEXT, PcmarchoptionsPackage.Literals.PCM_INTRODUCE_NEW_COMPONENT__ASSEMBLY_CONTEXT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext basicGetAssemblyContext() {
		return (AssemblyContext)eDynamicGet(PcmarchoptionsPackage.PCM_INTRODUCE_NEW_COMPONENT__ASSEMBLY_CONTEXT, PcmarchoptionsPackage.Literals.PCM_INTRODUCE_NEW_COMPONENT__ASSEMBLY_CONTEXT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssemblyContext(AssemblyContext newAssemblyContext) {
		eDynamicSet(PcmarchoptionsPackage.PCM_INTRODUCE_NEW_COMPONENT__ASSEMBLY_CONTEXT, PcmarchoptionsPackage.Literals.PCM_INTRODUCE_NEW_COMPONENT__ASSEMBLY_CONTEXT, newAssemblyContext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PcmarchoptionsPackage.PCM_INTRODUCE_NEW_COMPONENT__ASSEMBLY_CONTEXT:
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
			case PcmarchoptionsPackage.PCM_INTRODUCE_NEW_COMPONENT__ASSEMBLY_CONTEXT:
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
			case PcmarchoptionsPackage.PCM_INTRODUCE_NEW_COMPONENT__ASSEMBLY_CONTEXT:
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
			case PcmarchoptionsPackage.PCM_INTRODUCE_NEW_COMPONENT__ASSEMBLY_CONTEXT:
				return basicGetAssemblyContext() != null;
		}
		return super.eIsSet(featureID);
	}

} //PCM_IntroduceNewComponentImpl
