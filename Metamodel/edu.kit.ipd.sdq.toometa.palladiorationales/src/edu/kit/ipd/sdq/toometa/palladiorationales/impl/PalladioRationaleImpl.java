/**
 */
package edu.kit.ipd.sdq.toometa.palladiorationales.impl;

import edu.kit.ipd.sdq.toometa.options.impl.AnalysisRationaleImpl;

import edu.kit.ipd.sdq.toometa.palladiorationales.PalladioRationale;
import edu.kit.ipd.sdq.toometa.palladiorationales.PalladiorationalesPackage;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.edp2.models.ExperimentData.ExperimentSetting;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Palladio Rationale</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.palladiorationales.impl.PalladioRationaleImpl#getPalladioResult <em>Palladio Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PalladioRationaleImpl extends AnalysisRationaleImpl implements PalladioRationale {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PalladioRationaleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PalladiorationalesPackage.Literals.PALLADIO_RATIONALE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExperimentSetting getPalladioResult() {
		return (ExperimentSetting)eDynamicGet(PalladiorationalesPackage.PALLADIO_RATIONALE__PALLADIO_RESULT, PalladiorationalesPackage.Literals.PALLADIO_RATIONALE__PALLADIO_RESULT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExperimentSetting basicGetPalladioResult() {
		return (ExperimentSetting)eDynamicGet(PalladiorationalesPackage.PALLADIO_RATIONALE__PALLADIO_RESULT, PalladiorationalesPackage.Literals.PALLADIO_RATIONALE__PALLADIO_RESULT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPalladioResult(ExperimentSetting newPalladioResult) {
		eDynamicSet(PalladiorationalesPackage.PALLADIO_RATIONALE__PALLADIO_RESULT, PalladiorationalesPackage.Literals.PALLADIO_RATIONALE__PALLADIO_RESULT, newPalladioResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PalladiorationalesPackage.PALLADIO_RATIONALE__PALLADIO_RESULT:
				if (resolve) return getPalladioResult();
				return basicGetPalladioResult();
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
			case PalladiorationalesPackage.PALLADIO_RATIONALE__PALLADIO_RESULT:
				setPalladioResult((ExperimentSetting)newValue);
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
			case PalladiorationalesPackage.PALLADIO_RATIONALE__PALLADIO_RESULT:
				setPalladioResult((ExperimentSetting)null);
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
			case PalladiorationalesPackage.PALLADIO_RATIONALE__PALLADIO_RESULT:
				return basicGetPalladioResult() != null;
		}
		return super.eIsSet(featureID);
	}

} //PalladioRationaleImpl
