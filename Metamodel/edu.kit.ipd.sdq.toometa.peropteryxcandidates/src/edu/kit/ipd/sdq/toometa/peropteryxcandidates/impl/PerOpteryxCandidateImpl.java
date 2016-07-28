/**
 */
package edu.kit.ipd.sdq.toometa.peropteryxcandidates.impl;

import edu.kit.ipd.sdq.toometa.archoptions.impl.ArchCandidateImpl;

import edu.kit.ipd.sdq.toometa.peropteryxcandidates.PerOpteryxCandidate;
import edu.kit.ipd.sdq.toometa.peropteryxcandidates.PeropteryxcandidatesPackage;
import edu.kit.ipd.sdq.toometa.peropteryxcandidates.PredictedQualityValue;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Per Opteryx Candidate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.peropteryxcandidates.impl.PerOpteryxCandidateImpl#getSimulationQualities <em>Simulation Qualities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PerOpteryxCandidateImpl extends ArchCandidateImpl implements PerOpteryxCandidate {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerOpteryxCandidateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PeropteryxcandidatesPackage.Literals.PER_OPTERYX_CANDIDATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PredictedQualityValue> getSimulationQualities() {
		return (EList<PredictedQualityValue>)eDynamicGet(PeropteryxcandidatesPackage.PER_OPTERYX_CANDIDATE__SIMULATION_QUALITIES, PeropteryxcandidatesPackage.Literals.PER_OPTERYX_CANDIDATE__SIMULATION_QUALITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PeropteryxcandidatesPackage.PER_OPTERYX_CANDIDATE__SIMULATION_QUALITIES:
				return ((InternalEList<?>)getSimulationQualities()).basicRemove(otherEnd, msgs);
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
			case PeropteryxcandidatesPackage.PER_OPTERYX_CANDIDATE__SIMULATION_QUALITIES:
				return getSimulationQualities();
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
			case PeropteryxcandidatesPackage.PER_OPTERYX_CANDIDATE__SIMULATION_QUALITIES:
				getSimulationQualities().clear();
				getSimulationQualities().addAll((Collection<? extends PredictedQualityValue>)newValue);
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
			case PeropteryxcandidatesPackage.PER_OPTERYX_CANDIDATE__SIMULATION_QUALITIES:
				getSimulationQualities().clear();
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
			case PeropteryxcandidatesPackage.PER_OPTERYX_CANDIDATE__SIMULATION_QUALITIES:
				return !getSimulationQualities().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PerOpteryxCandidateImpl
