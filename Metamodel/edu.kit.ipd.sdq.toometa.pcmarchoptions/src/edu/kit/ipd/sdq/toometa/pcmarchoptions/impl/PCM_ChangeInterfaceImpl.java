/**
 */
package edu.kit.ipd.sdq.toometa.pcmarchoptions.impl;

import edu.kit.ipd.sdq.toometa.archoptions.impl.ChangeInterfaceImpl;

import edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_ChangeInterface;
import edu.kit.ipd.sdq.toometa.pcmarchoptions.PcmarchoptionsPackage;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.repository.OperationInterface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCM Change Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.impl.PCM_ChangeInterfaceImpl#getOldInterface <em>Old Interface</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.impl.PCM_ChangeInterfaceImpl#getNewInterface <em>New Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCM_ChangeInterfaceImpl extends ChangeInterfaceImpl implements PCM_ChangeInterface {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCM_ChangeInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcmarchoptionsPackage.Literals.PCM_CHANGE_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationInterface getOldInterface() {
		return (OperationInterface)eDynamicGet(PcmarchoptionsPackage.PCM_CHANGE_INTERFACE__OLD_INTERFACE, PcmarchoptionsPackage.Literals.PCM_CHANGE_INTERFACE__OLD_INTERFACE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationInterface basicGetOldInterface() {
		return (OperationInterface)eDynamicGet(PcmarchoptionsPackage.PCM_CHANGE_INTERFACE__OLD_INTERFACE, PcmarchoptionsPackage.Literals.PCM_CHANGE_INTERFACE__OLD_INTERFACE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOldInterface(OperationInterface newOldInterface) {
		eDynamicSet(PcmarchoptionsPackage.PCM_CHANGE_INTERFACE__OLD_INTERFACE, PcmarchoptionsPackage.Literals.PCM_CHANGE_INTERFACE__OLD_INTERFACE, newOldInterface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationInterface getNewInterface() {
		return (OperationInterface)eDynamicGet(PcmarchoptionsPackage.PCM_CHANGE_INTERFACE__NEW_INTERFACE, PcmarchoptionsPackage.Literals.PCM_CHANGE_INTERFACE__NEW_INTERFACE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationInterface basicGetNewInterface() {
		return (OperationInterface)eDynamicGet(PcmarchoptionsPackage.PCM_CHANGE_INTERFACE__NEW_INTERFACE, PcmarchoptionsPackage.Literals.PCM_CHANGE_INTERFACE__NEW_INTERFACE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewInterface(OperationInterface newNewInterface) {
		eDynamicSet(PcmarchoptionsPackage.PCM_CHANGE_INTERFACE__NEW_INTERFACE, PcmarchoptionsPackage.Literals.PCM_CHANGE_INTERFACE__NEW_INTERFACE, newNewInterface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PcmarchoptionsPackage.PCM_CHANGE_INTERFACE__OLD_INTERFACE:
				if (resolve) return getOldInterface();
				return basicGetOldInterface();
			case PcmarchoptionsPackage.PCM_CHANGE_INTERFACE__NEW_INTERFACE:
				if (resolve) return getNewInterface();
				return basicGetNewInterface();
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
			case PcmarchoptionsPackage.PCM_CHANGE_INTERFACE__OLD_INTERFACE:
				setOldInterface((OperationInterface)newValue);
				return;
			case PcmarchoptionsPackage.PCM_CHANGE_INTERFACE__NEW_INTERFACE:
				setNewInterface((OperationInterface)newValue);
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
			case PcmarchoptionsPackage.PCM_CHANGE_INTERFACE__OLD_INTERFACE:
				setOldInterface((OperationInterface)null);
				return;
			case PcmarchoptionsPackage.PCM_CHANGE_INTERFACE__NEW_INTERFACE:
				setNewInterface((OperationInterface)null);
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
			case PcmarchoptionsPackage.PCM_CHANGE_INTERFACE__OLD_INTERFACE:
				return basicGetOldInterface() != null;
			case PcmarchoptionsPackage.PCM_CHANGE_INTERFACE__NEW_INTERFACE:
				return basicGetNewInterface() != null;
		}
		return super.eIsSet(featureID);
	}

} //PCM_ChangeInterfaceImpl
