/**
 */
package edu.kit.ipd.sdq.toometa.requirements.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import edu.kit.ipd.sdq.toometa.requirements.RequirementsPackage;
import edu.kit.ipd.sdq.toometa.requirements.UsageModelAdapter;
import edu.kit.ipd.sdq.toometa.requirements.UsageModelRepository;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Usage Model Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.requirements.impl.UsageModelRepositoryImpl#getUsageModelAdapters <em>Usage Model Adapters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UsageModelRepositoryImpl extends IdentifierImpl implements UsageModelRepository {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsageModelRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.USAGE_MODEL_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<UsageModelAdapter> getUsageModelAdapters() {
		return (EList<UsageModelAdapter>)eDynamicGet(RequirementsPackage.USAGE_MODEL_REPOSITORY__USAGE_MODEL_ADAPTERS, RequirementsPackage.Literals.USAGE_MODEL_REPOSITORY__USAGE_MODEL_ADAPTERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RequirementsPackage.USAGE_MODEL_REPOSITORY__USAGE_MODEL_ADAPTERS:
				return ((InternalEList<?>)getUsageModelAdapters()).basicRemove(otherEnd, msgs);
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
			case RequirementsPackage.USAGE_MODEL_REPOSITORY__USAGE_MODEL_ADAPTERS:
				return getUsageModelAdapters();
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
			case RequirementsPackage.USAGE_MODEL_REPOSITORY__USAGE_MODEL_ADAPTERS:
				getUsageModelAdapters().clear();
				getUsageModelAdapters().addAll((Collection<? extends UsageModelAdapter>)newValue);
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
			case RequirementsPackage.USAGE_MODEL_REPOSITORY__USAGE_MODEL_ADAPTERS:
				getUsageModelAdapters().clear();
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
			case RequirementsPackage.USAGE_MODEL_REPOSITORY__USAGE_MODEL_ADAPTERS:
				return !getUsageModelAdapters().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UsageModelRepositoryImpl
