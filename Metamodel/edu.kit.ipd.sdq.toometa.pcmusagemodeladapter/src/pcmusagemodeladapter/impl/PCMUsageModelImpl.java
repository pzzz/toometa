/**
 */
package pcmusagemodeladapter.impl;

import edu.kit.ipd.sdq.toometa.requirements.impl.UsageModelAdapterImpl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.usagemodel.UsageModel;

import pcmusagemodeladapter.PCMUsageModel;
import pcmusagemodeladapter.PcmusagemodeladapterPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCM Usage Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcmusagemodeladapter.impl.PCMUsageModelImpl#getPcmUsageModel <em>Pcm Usage Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCMUsageModelImpl extends UsageModelAdapterImpl implements PCMUsageModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCMUsageModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcmusagemodeladapterPackage.Literals.PCM_USAGE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageModel getPcmUsageModel() {
		return (UsageModel)eDynamicGet(PcmusagemodeladapterPackage.PCM_USAGE_MODEL__PCM_USAGE_MODEL, PcmusagemodeladapterPackage.Literals.PCM_USAGE_MODEL__PCM_USAGE_MODEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageModel basicGetPcmUsageModel() {
		return (UsageModel)eDynamicGet(PcmusagemodeladapterPackage.PCM_USAGE_MODEL__PCM_USAGE_MODEL, PcmusagemodeladapterPackage.Literals.PCM_USAGE_MODEL__PCM_USAGE_MODEL, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPcmUsageModel(UsageModel newPcmUsageModel) {
		eDynamicSet(PcmusagemodeladapterPackage.PCM_USAGE_MODEL__PCM_USAGE_MODEL, PcmusagemodeladapterPackage.Literals.PCM_USAGE_MODEL__PCM_USAGE_MODEL, newPcmUsageModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PcmusagemodeladapterPackage.PCM_USAGE_MODEL__PCM_USAGE_MODEL:
				if (resolve) return getPcmUsageModel();
				return basicGetPcmUsageModel();
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
			case PcmusagemodeladapterPackage.PCM_USAGE_MODEL__PCM_USAGE_MODEL:
				setPcmUsageModel((UsageModel)newValue);
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
			case PcmusagemodeladapterPackage.PCM_USAGE_MODEL__PCM_USAGE_MODEL:
				setPcmUsageModel((UsageModel)null);
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
			case PcmusagemodeladapterPackage.PCM_USAGE_MODEL__PCM_USAGE_MODEL:
				return basicGetPcmUsageModel() != null;
		}
		return super.eIsSet(featureID);
	}

} //PCMUsageModelImpl
