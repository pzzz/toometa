/**
 */
package edu.kit.ipd.sdq.toometa.requirements.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import edu.kit.ipd.sdq.toometa.requirements.RequirementsPackage;
import edu.kit.ipd.sdq.toometa.requirements.SystemRequirement;
import edu.kit.ipd.sdq.toometa.requirements.SystemRequirements;

import edu.kit.ipd.sdq.toometa.requirements.UsageModelAdapter;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Requirements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.requirements.impl.SystemRequirementsImpl#getSystemRequirements <em>System Requirements</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.requirements.impl.SystemRequirementsImpl#getDefaultUsageModel <em>Default Usage Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemRequirementsImpl extends IdentifierImpl implements SystemRequirements {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemRequirementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.SYSTEM_REQUIREMENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SystemRequirement> getSystemRequirements() {
		return (EList<SystemRequirement>)eDynamicGet(RequirementsPackage.SYSTEM_REQUIREMENTS__SYSTEM_REQUIREMENTS, RequirementsPackage.Literals.SYSTEM_REQUIREMENTS__SYSTEM_REQUIREMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageModelAdapter getDefaultUsageModel() {
		return (UsageModelAdapter)eDynamicGet(RequirementsPackage.SYSTEM_REQUIREMENTS__DEFAULT_USAGE_MODEL, RequirementsPackage.Literals.SYSTEM_REQUIREMENTS__DEFAULT_USAGE_MODEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageModelAdapter basicGetDefaultUsageModel() {
		return (UsageModelAdapter)eDynamicGet(RequirementsPackage.SYSTEM_REQUIREMENTS__DEFAULT_USAGE_MODEL, RequirementsPackage.Literals.SYSTEM_REQUIREMENTS__DEFAULT_USAGE_MODEL, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultUsageModel(UsageModelAdapter newDefaultUsageModel) {
		eDynamicSet(RequirementsPackage.SYSTEM_REQUIREMENTS__DEFAULT_USAGE_MODEL, RequirementsPackage.Literals.SYSTEM_REQUIREMENTS__DEFAULT_USAGE_MODEL, newDefaultUsageModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RequirementsPackage.SYSTEM_REQUIREMENTS__SYSTEM_REQUIREMENTS:
				return ((InternalEList<?>)getSystemRequirements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RequirementsPackage.SYSTEM_REQUIREMENTS__SYSTEM_REQUIREMENTS:
				return getSystemRequirements();
			case RequirementsPackage.SYSTEM_REQUIREMENTS__DEFAULT_USAGE_MODEL:
				if (resolve) return getDefaultUsageModel();
				return basicGetDefaultUsageModel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RequirementsPackage.SYSTEM_REQUIREMENTS__SYSTEM_REQUIREMENTS:
				getSystemRequirements().clear();
				getSystemRequirements().addAll((Collection<? extends SystemRequirement>)newValue);
				return;
			case RequirementsPackage.SYSTEM_REQUIREMENTS__DEFAULT_USAGE_MODEL:
				setDefaultUsageModel((UsageModelAdapter)newValue);
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
			case RequirementsPackage.SYSTEM_REQUIREMENTS__SYSTEM_REQUIREMENTS:
				getSystemRequirements().clear();
				return;
			case RequirementsPackage.SYSTEM_REQUIREMENTS__DEFAULT_USAGE_MODEL:
				setDefaultUsageModel((UsageModelAdapter)null);
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
			case RequirementsPackage.SYSTEM_REQUIREMENTS__SYSTEM_REQUIREMENTS:
				return !getSystemRequirements().isEmpty();
			case RequirementsPackage.SYSTEM_REQUIREMENTS__DEFAULT_USAGE_MODEL:
				return basicGetDefaultUsageModel() != null;
		}
		return super.eIsSet(featureID);
	}

} //SystemRequirementsImpl
