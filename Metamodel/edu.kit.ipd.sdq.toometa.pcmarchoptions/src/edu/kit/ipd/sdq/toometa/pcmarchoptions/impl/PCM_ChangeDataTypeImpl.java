/**
 */
package edu.kit.ipd.sdq.toometa.pcmarchoptions.impl;

import edu.kit.ipd.sdq.toometa.archoptions.impl.ChangeDataTypeImpl;

import edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_ChangeDataType;
import edu.kit.ipd.sdq.toometa.pcmarchoptions.PcmarchoptionsPackage;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.repository.DataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCM Change Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.impl.PCM_ChangeDataTypeImpl#getOldDataType <em>Old Data Type</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.impl.PCM_ChangeDataTypeImpl#getNewDataType <em>New Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCM_ChangeDataTypeImpl extends ChangeDataTypeImpl implements PCM_ChangeDataType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCM_ChangeDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcmarchoptionsPackage.Literals.PCM_CHANGE_DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getOldDataType() {
		return (DataType)eDynamicGet(PcmarchoptionsPackage.PCM_CHANGE_DATA_TYPE__OLD_DATA_TYPE, PcmarchoptionsPackage.Literals.PCM_CHANGE_DATA_TYPE__OLD_DATA_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetOldDataType() {
		return (DataType)eDynamicGet(PcmarchoptionsPackage.PCM_CHANGE_DATA_TYPE__OLD_DATA_TYPE, PcmarchoptionsPackage.Literals.PCM_CHANGE_DATA_TYPE__OLD_DATA_TYPE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOldDataType(DataType newOldDataType) {
		eDynamicSet(PcmarchoptionsPackage.PCM_CHANGE_DATA_TYPE__OLD_DATA_TYPE, PcmarchoptionsPackage.Literals.PCM_CHANGE_DATA_TYPE__OLD_DATA_TYPE, newOldDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getNewDataType() {
		return (DataType)eDynamicGet(PcmarchoptionsPackage.PCM_CHANGE_DATA_TYPE__NEW_DATA_TYPE, PcmarchoptionsPackage.Literals.PCM_CHANGE_DATA_TYPE__NEW_DATA_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetNewDataType() {
		return (DataType)eDynamicGet(PcmarchoptionsPackage.PCM_CHANGE_DATA_TYPE__NEW_DATA_TYPE, PcmarchoptionsPackage.Literals.PCM_CHANGE_DATA_TYPE__NEW_DATA_TYPE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewDataType(DataType newNewDataType) {
		eDynamicSet(PcmarchoptionsPackage.PCM_CHANGE_DATA_TYPE__NEW_DATA_TYPE, PcmarchoptionsPackage.Literals.PCM_CHANGE_DATA_TYPE__NEW_DATA_TYPE, newNewDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PcmarchoptionsPackage.PCM_CHANGE_DATA_TYPE__OLD_DATA_TYPE:
				if (resolve) return getOldDataType();
				return basicGetOldDataType();
			case PcmarchoptionsPackage.PCM_CHANGE_DATA_TYPE__NEW_DATA_TYPE:
				if (resolve) return getNewDataType();
				return basicGetNewDataType();
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
			case PcmarchoptionsPackage.PCM_CHANGE_DATA_TYPE__OLD_DATA_TYPE:
				setOldDataType((DataType)newValue);
				return;
			case PcmarchoptionsPackage.PCM_CHANGE_DATA_TYPE__NEW_DATA_TYPE:
				setNewDataType((DataType)newValue);
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
			case PcmarchoptionsPackage.PCM_CHANGE_DATA_TYPE__OLD_DATA_TYPE:
				setOldDataType((DataType)null);
				return;
			case PcmarchoptionsPackage.PCM_CHANGE_DATA_TYPE__NEW_DATA_TYPE:
				setNewDataType((DataType)null);
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
			case PcmarchoptionsPackage.PCM_CHANGE_DATA_TYPE__OLD_DATA_TYPE:
				return basicGetOldDataType() != null;
			case PcmarchoptionsPackage.PCM_CHANGE_DATA_TYPE__NEW_DATA_TYPE:
				return basicGetNewDataType() != null;
		}
		return super.eIsSet(featureID);
	}

} //PCM_ChangeDataTypeImpl
