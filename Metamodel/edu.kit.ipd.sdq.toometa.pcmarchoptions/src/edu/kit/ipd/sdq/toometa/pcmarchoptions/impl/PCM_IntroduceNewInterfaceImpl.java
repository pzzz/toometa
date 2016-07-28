/**
 */
package edu.kit.ipd.sdq.toometa.pcmarchoptions.impl;

import edu.kit.ipd.sdq.toometa.archoptions.impl.IntroduceNewInterfaceImpl;

import edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_IntroduceNewInterface;
import edu.kit.ipd.sdq.toometa.pcmarchoptions.PcmarchoptionsPackage;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.repository.OperationInterface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCM Introduce New Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.impl.PCM_IntroduceNewInterfaceImpl#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCM_IntroduceNewInterfaceImpl extends IntroduceNewInterfaceImpl implements PCM_IntroduceNewInterface {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCM_IntroduceNewInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcmarchoptionsPackage.Literals.PCM_INTRODUCE_NEW_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationInterface getInterface() {
		return (OperationInterface)eDynamicGet(PcmarchoptionsPackage.PCM_INTRODUCE_NEW_INTERFACE__INTERFACE, PcmarchoptionsPackage.Literals.PCM_INTRODUCE_NEW_INTERFACE__INTERFACE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationInterface basicGetInterface() {
		return (OperationInterface)eDynamicGet(PcmarchoptionsPackage.PCM_INTRODUCE_NEW_INTERFACE__INTERFACE, PcmarchoptionsPackage.Literals.PCM_INTRODUCE_NEW_INTERFACE__INTERFACE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface(OperationInterface newInterface) {
		eDynamicSet(PcmarchoptionsPackage.PCM_INTRODUCE_NEW_INTERFACE__INTERFACE, PcmarchoptionsPackage.Literals.PCM_INTRODUCE_NEW_INTERFACE__INTERFACE, newInterface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PcmarchoptionsPackage.PCM_INTRODUCE_NEW_INTERFACE__INTERFACE:
				if (resolve) return getInterface();
				return basicGetInterface();
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
			case PcmarchoptionsPackage.PCM_INTRODUCE_NEW_INTERFACE__INTERFACE:
				setInterface((OperationInterface)newValue);
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
			case PcmarchoptionsPackage.PCM_INTRODUCE_NEW_INTERFACE__INTERFACE:
				setInterface((OperationInterface)null);
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
			case PcmarchoptionsPackage.PCM_INTRODUCE_NEW_INTERFACE__INTERFACE:
				return basicGetInterface() != null;
		}
		return super.eIsSet(featureID);
	}

} //PCM_IntroduceNewInterfaceImpl
