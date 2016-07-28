/**
 */
package edu.kit.ipd.sdq.toometa.peropteryxcandidates.impl;

import edu.kit.ipd.sdq.toometa.peropteryxcandidates.PerOpteryxClassOption;
import edu.kit.ipd.sdq.toometa.peropteryxcandidates.PeropteryxcandidatesPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Per Opteryx Class Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.peropteryxcandidates.impl.PerOpteryxClassOptionImpl#getChosenValue <em>Chosen Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PerOpteryxClassOptionImpl extends PerOpteryxOptionImpl implements PerOpteryxClassOption {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerOpteryxClassOptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PeropteryxcandidatesPackage.Literals.PER_OPTERYX_CLASS_OPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getChosenValue() {
		return (EObject)eDynamicGet(PeropteryxcandidatesPackage.PER_OPTERYX_CLASS_OPTION__CHOSEN_VALUE, PeropteryxcandidatesPackage.Literals.PER_OPTERYX_CLASS_OPTION__CHOSEN_VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetChosenValue() {
		return (EObject)eDynamicGet(PeropteryxcandidatesPackage.PER_OPTERYX_CLASS_OPTION__CHOSEN_VALUE, PeropteryxcandidatesPackage.Literals.PER_OPTERYX_CLASS_OPTION__CHOSEN_VALUE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChosenValue(EObject newChosenValue) {
		eDynamicSet(PeropteryxcandidatesPackage.PER_OPTERYX_CLASS_OPTION__CHOSEN_VALUE, PeropteryxcandidatesPackage.Literals.PER_OPTERYX_CLASS_OPTION__CHOSEN_VALUE, newChosenValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PeropteryxcandidatesPackage.PER_OPTERYX_CLASS_OPTION__CHOSEN_VALUE:
				if (resolve) return getChosenValue();
				return basicGetChosenValue();
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
			case PeropteryxcandidatesPackage.PER_OPTERYX_CLASS_OPTION__CHOSEN_VALUE:
				setChosenValue((EObject)newValue);
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
			case PeropteryxcandidatesPackage.PER_OPTERYX_CLASS_OPTION__CHOSEN_VALUE:
				setChosenValue((EObject)null);
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
			case PeropteryxcandidatesPackage.PER_OPTERYX_CLASS_OPTION__CHOSEN_VALUE:
				return basicGetChosenValue() != null;
		}
		return super.eIsSet(featureID);
	}

} //PerOpteryxClassOptionImpl
