/**
 */
package edu.kit.ipd.sdq.toometa.requirements.impl;

import edu.kit.ipd.sdq.toometa.requirements.RequirementsPackage;
import edu.kit.ipd.sdq.toometa.requirements.SystemRequirement;

import edu.kit.ipd.sdq.toometa.requirements.UsageModelAdapter;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.requirements.impl.SystemRequirementImpl#getExceptionUsageModel <em>Exception Usage Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SystemRequirementImpl extends RequirementImpl implements SystemRequirement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.SYSTEM_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageModelAdapter getExceptionUsageModel() {
		return (UsageModelAdapter)eDynamicGet(RequirementsPackage.SYSTEM_REQUIREMENT__EXCEPTION_USAGE_MODEL, RequirementsPackage.Literals.SYSTEM_REQUIREMENT__EXCEPTION_USAGE_MODEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageModelAdapter basicGetExceptionUsageModel() {
		return (UsageModelAdapter)eDynamicGet(RequirementsPackage.SYSTEM_REQUIREMENT__EXCEPTION_USAGE_MODEL, RequirementsPackage.Literals.SYSTEM_REQUIREMENT__EXCEPTION_USAGE_MODEL, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExceptionUsageModel(UsageModelAdapter newExceptionUsageModel) {
		eDynamicSet(RequirementsPackage.SYSTEM_REQUIREMENT__EXCEPTION_USAGE_MODEL, RequirementsPackage.Literals.SYSTEM_REQUIREMENT__EXCEPTION_USAGE_MODEL, newExceptionUsageModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RequirementsPackage.SYSTEM_REQUIREMENT__EXCEPTION_USAGE_MODEL:
				if (resolve) return getExceptionUsageModel();
				return basicGetExceptionUsageModel();
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
			case RequirementsPackage.SYSTEM_REQUIREMENT__EXCEPTION_USAGE_MODEL:
				setExceptionUsageModel((UsageModelAdapter)newValue);
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
			case RequirementsPackage.SYSTEM_REQUIREMENT__EXCEPTION_USAGE_MODEL:
				setExceptionUsageModel((UsageModelAdapter)null);
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
			case RequirementsPackage.SYSTEM_REQUIREMENT__EXCEPTION_USAGE_MODEL:
				return basicGetExceptionUsageModel() != null;
		}
		return super.eIsSet(featureID);
	}

} //SystemRequirementImpl
