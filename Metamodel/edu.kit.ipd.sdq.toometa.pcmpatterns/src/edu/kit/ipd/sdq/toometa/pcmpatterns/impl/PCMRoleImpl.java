/**
 */
package edu.kit.ipd.sdq.toometa.pcmpatterns.impl;

import edu.kit.ipd.sdq.toometa.patterns.impl.RoleImpl;

import edu.kit.ipd.sdq.toometa.pcmpatterns.PCMRole;
import edu.kit.ipd.sdq.toometa.pcmpatterns.PcmpatternsPackage;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.repository.OperationProvidedRole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCM Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.pcmpatterns.impl.PCMRoleImpl#getOperationProvidedRole <em>Operation Provided Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCMRoleImpl extends RoleImpl implements PCMRole {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCMRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcmpatternsPackage.Literals.PCM_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationProvidedRole getOperationProvidedRole() {
		return (OperationProvidedRole)eDynamicGet(PcmpatternsPackage.PCM_ROLE__OPERATION_PROVIDED_ROLE, PcmpatternsPackage.Literals.PCM_ROLE__OPERATION_PROVIDED_ROLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationProvidedRole basicGetOperationProvidedRole() {
		return (OperationProvidedRole)eDynamicGet(PcmpatternsPackage.PCM_ROLE__OPERATION_PROVIDED_ROLE, PcmpatternsPackage.Literals.PCM_ROLE__OPERATION_PROVIDED_ROLE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationProvidedRole(OperationProvidedRole newOperationProvidedRole) {
		eDynamicSet(PcmpatternsPackage.PCM_ROLE__OPERATION_PROVIDED_ROLE, PcmpatternsPackage.Literals.PCM_ROLE__OPERATION_PROVIDED_ROLE, newOperationProvidedRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PcmpatternsPackage.PCM_ROLE__OPERATION_PROVIDED_ROLE:
				if (resolve) return getOperationProvidedRole();
				return basicGetOperationProvidedRole();
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
			case PcmpatternsPackage.PCM_ROLE__OPERATION_PROVIDED_ROLE:
				setOperationProvidedRole((OperationProvidedRole)newValue);
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
			case PcmpatternsPackage.PCM_ROLE__OPERATION_PROVIDED_ROLE:
				setOperationProvidedRole((OperationProvidedRole)null);
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
			case PcmpatternsPackage.PCM_ROLE__OPERATION_PROVIDED_ROLE:
				return basicGetOperationProvidedRole() != null;
		}
		return super.eIsSet(featureID);
	}

} //PCMRoleImpl
