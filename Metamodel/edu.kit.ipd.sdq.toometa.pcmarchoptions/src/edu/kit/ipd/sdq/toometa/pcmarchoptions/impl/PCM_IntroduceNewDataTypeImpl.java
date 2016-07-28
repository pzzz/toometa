/**
 */
package edu.kit.ipd.sdq.toometa.pcmarchoptions.impl;

import edu.kit.ipd.sdq.toometa.archoptions.impl.IntroduceNewDataTypeImpl;

import edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_IntroduceNewDataType;
import edu.kit.ipd.sdq.toometa.pcmarchoptions.PcmarchoptionsPackage;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.repository.DataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCM Introduce New Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.impl.PCM_IntroduceNewDataTypeImpl#getDataType <em>Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCM_IntroduceNewDataTypeImpl extends IntroduceNewDataTypeImpl implements PCM_IntroduceNewDataType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCM_IntroduceNewDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcmarchoptionsPackage.Literals.PCM_INTRODUCE_NEW_DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getDataType() {
		return (DataType)eDynamicGet(PcmarchoptionsPackage.PCM_INTRODUCE_NEW_DATA_TYPE__DATA_TYPE, PcmarchoptionsPackage.Literals.PCM_INTRODUCE_NEW_DATA_TYPE__DATA_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetDataType() {
		return (DataType)eDynamicGet(PcmarchoptionsPackage.PCM_INTRODUCE_NEW_DATA_TYPE__DATA_TYPE, PcmarchoptionsPackage.Literals.PCM_INTRODUCE_NEW_DATA_TYPE__DATA_TYPE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(DataType newDataType) {
		eDynamicSet(PcmarchoptionsPackage.PCM_INTRODUCE_NEW_DATA_TYPE__DATA_TYPE, PcmarchoptionsPackage.Literals.PCM_INTRODUCE_NEW_DATA_TYPE__DATA_TYPE, newDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PcmarchoptionsPackage.PCM_INTRODUCE_NEW_DATA_TYPE__DATA_TYPE:
				if (resolve) return getDataType();
				return basicGetDataType();
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
			case PcmarchoptionsPackage.PCM_INTRODUCE_NEW_DATA_TYPE__DATA_TYPE:
				setDataType((DataType)newValue);
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
			case PcmarchoptionsPackage.PCM_INTRODUCE_NEW_DATA_TYPE__DATA_TYPE:
				setDataType((DataType)null);
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
			case PcmarchoptionsPackage.PCM_INTRODUCE_NEW_DATA_TYPE__DATA_TYPE:
				return basicGetDataType() != null;
		}
		return super.eIsSet(featureID);
	}

} //PCM_IntroduceNewDataTypeImpl
