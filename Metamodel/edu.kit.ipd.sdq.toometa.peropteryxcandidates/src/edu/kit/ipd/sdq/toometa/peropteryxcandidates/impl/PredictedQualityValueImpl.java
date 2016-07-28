/**
 */
package edu.kit.ipd.sdq.toometa.peropteryxcandidates.impl;

import edu.kit.ipd.sdq.toometa.peropteryxcandidates.PeropteryxcandidatesPackage;
import edu.kit.ipd.sdq.toometa.peropteryxcandidates.PredictedQualityValue;

import edu.kit.ipd.sdq.toometa.qualities.QualityType;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Predicted Quality Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.peropteryxcandidates.impl.PredictedQualityValueImpl#getQualityValue <em>Quality Value</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.peropteryxcandidates.impl.PredictedQualityValueImpl#getQualityType <em>Quality Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PredictedQualityValueImpl extends CDOObjectImpl implements PredictedQualityValue {
	/**
	 * The default value of the '{@link #getQualityValue() <em>Quality Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualityValue()
	 * @generated
	 * @ordered
	 */
	protected static final Double QUALITY_VALUE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PredictedQualityValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PeropteryxcandidatesPackage.Literals.PREDICTED_QUALITY_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getQualityValue() {
		return (Double)eDynamicGet(PeropteryxcandidatesPackage.PREDICTED_QUALITY_VALUE__QUALITY_VALUE, PeropteryxcandidatesPackage.Literals.PREDICTED_QUALITY_VALUE__QUALITY_VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualityValue(Double newQualityValue) {
		eDynamicSet(PeropteryxcandidatesPackage.PREDICTED_QUALITY_VALUE__QUALITY_VALUE, PeropteryxcandidatesPackage.Literals.PREDICTED_QUALITY_VALUE__QUALITY_VALUE, newQualityValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityType getQualityType() {
		return (QualityType)eDynamicGet(PeropteryxcandidatesPackage.PREDICTED_QUALITY_VALUE__QUALITY_TYPE, PeropteryxcandidatesPackage.Literals.PREDICTED_QUALITY_VALUE__QUALITY_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityType basicGetQualityType() {
		return (QualityType)eDynamicGet(PeropteryxcandidatesPackage.PREDICTED_QUALITY_VALUE__QUALITY_TYPE, PeropteryxcandidatesPackage.Literals.PREDICTED_QUALITY_VALUE__QUALITY_TYPE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualityType(QualityType newQualityType) {
		eDynamicSet(PeropteryxcandidatesPackage.PREDICTED_QUALITY_VALUE__QUALITY_TYPE, PeropteryxcandidatesPackage.Literals.PREDICTED_QUALITY_VALUE__QUALITY_TYPE, newQualityType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PeropteryxcandidatesPackage.PREDICTED_QUALITY_VALUE__QUALITY_VALUE:
				return getQualityValue();
			case PeropteryxcandidatesPackage.PREDICTED_QUALITY_VALUE__QUALITY_TYPE:
				if (resolve) return getQualityType();
				return basicGetQualityType();
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
			case PeropteryxcandidatesPackage.PREDICTED_QUALITY_VALUE__QUALITY_VALUE:
				setQualityValue((Double)newValue);
				return;
			case PeropteryxcandidatesPackage.PREDICTED_QUALITY_VALUE__QUALITY_TYPE:
				setQualityType((QualityType)newValue);
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
			case PeropteryxcandidatesPackage.PREDICTED_QUALITY_VALUE__QUALITY_VALUE:
				setQualityValue(QUALITY_VALUE_EDEFAULT);
				return;
			case PeropteryxcandidatesPackage.PREDICTED_QUALITY_VALUE__QUALITY_TYPE:
				setQualityType((QualityType)null);
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
			case PeropteryxcandidatesPackage.PREDICTED_QUALITY_VALUE__QUALITY_VALUE:
				return QUALITY_VALUE_EDEFAULT == null ? getQualityValue() != null : !QUALITY_VALUE_EDEFAULT.equals(getQualityValue());
			case PeropteryxcandidatesPackage.PREDICTED_QUALITY_VALUE__QUALITY_TYPE:
				return basicGetQualityType() != null;
		}
		return super.eIsSet(featureID);
	}

} //PredictedQualityValueImpl
