/**
 */
package edu.kit.ipd.sdq.toometa.pcmarchoptions.impl;

import edu.kit.ipd.sdq.toometa.archoptions.impl.AssembleComponentImpl;

import edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_AssembleComponent;
import edu.kit.ipd.sdq.toometa.pcmarchoptions.PcmarchoptionsPackage;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;

import org.palladiosimulator.pcm.repository.RepositoryComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCM Assemble Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.impl.PCM_AssembleComponentImpl#getAssembleTo <em>Assemble To</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.impl.PCM_AssembleComponentImpl#getCompomentToAssemble <em>Compoment To Assemble</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCM_AssembleComponentImpl extends AssembleComponentImpl implements PCM_AssembleComponent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCM_AssembleComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcmarchoptionsPackage.Literals.PCM_ASSEMBLE_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext getAssembleTo() {
		return (AssemblyContext)eDynamicGet(PcmarchoptionsPackage.PCM_ASSEMBLE_COMPONENT__ASSEMBLE_TO, PcmarchoptionsPackage.Literals.PCM_ASSEMBLE_COMPONENT__ASSEMBLE_TO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext basicGetAssembleTo() {
		return (AssemblyContext)eDynamicGet(PcmarchoptionsPackage.PCM_ASSEMBLE_COMPONENT__ASSEMBLE_TO, PcmarchoptionsPackage.Literals.PCM_ASSEMBLE_COMPONENT__ASSEMBLE_TO, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssembleTo(AssemblyContext newAssembleTo) {
		eDynamicSet(PcmarchoptionsPackage.PCM_ASSEMBLE_COMPONENT__ASSEMBLE_TO, PcmarchoptionsPackage.Literals.PCM_ASSEMBLE_COMPONENT__ASSEMBLE_TO, newAssembleTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryComponent getCompomentToAssemble() {
		return (RepositoryComponent)eDynamicGet(PcmarchoptionsPackage.PCM_ASSEMBLE_COMPONENT__COMPOMENT_TO_ASSEMBLE, PcmarchoptionsPackage.Literals.PCM_ASSEMBLE_COMPONENT__COMPOMENT_TO_ASSEMBLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryComponent basicGetCompomentToAssemble() {
		return (RepositoryComponent)eDynamicGet(PcmarchoptionsPackage.PCM_ASSEMBLE_COMPONENT__COMPOMENT_TO_ASSEMBLE, PcmarchoptionsPackage.Literals.PCM_ASSEMBLE_COMPONENT__COMPOMENT_TO_ASSEMBLE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompomentToAssemble(RepositoryComponent newCompomentToAssemble) {
		eDynamicSet(PcmarchoptionsPackage.PCM_ASSEMBLE_COMPONENT__COMPOMENT_TO_ASSEMBLE, PcmarchoptionsPackage.Literals.PCM_ASSEMBLE_COMPONENT__COMPOMENT_TO_ASSEMBLE, newCompomentToAssemble);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PcmarchoptionsPackage.PCM_ASSEMBLE_COMPONENT__ASSEMBLE_TO:
				if (resolve) return getAssembleTo();
				return basicGetAssembleTo();
			case PcmarchoptionsPackage.PCM_ASSEMBLE_COMPONENT__COMPOMENT_TO_ASSEMBLE:
				if (resolve) return getCompomentToAssemble();
				return basicGetCompomentToAssemble();
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
			case PcmarchoptionsPackage.PCM_ASSEMBLE_COMPONENT__ASSEMBLE_TO:
				setAssembleTo((AssemblyContext)newValue);
				return;
			case PcmarchoptionsPackage.PCM_ASSEMBLE_COMPONENT__COMPOMENT_TO_ASSEMBLE:
				setCompomentToAssemble((RepositoryComponent)newValue);
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
			case PcmarchoptionsPackage.PCM_ASSEMBLE_COMPONENT__ASSEMBLE_TO:
				setAssembleTo((AssemblyContext)null);
				return;
			case PcmarchoptionsPackage.PCM_ASSEMBLE_COMPONENT__COMPOMENT_TO_ASSEMBLE:
				setCompomentToAssemble((RepositoryComponent)null);
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
			case PcmarchoptionsPackage.PCM_ASSEMBLE_COMPONENT__ASSEMBLE_TO:
				return basicGetAssembleTo() != null;
			case PcmarchoptionsPackage.PCM_ASSEMBLE_COMPONENT__COMPOMENT_TO_ASSEMBLE:
				return basicGetCompomentToAssemble() != null;
		}
		return super.eIsSet(featureID);
	}

} //PCM_AssembleComponentImpl
