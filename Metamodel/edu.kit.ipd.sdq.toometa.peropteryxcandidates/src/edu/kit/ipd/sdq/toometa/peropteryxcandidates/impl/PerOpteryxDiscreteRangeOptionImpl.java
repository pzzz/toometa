/**
 */
package edu.kit.ipd.sdq.toometa.peropteryxcandidates.impl;

import edu.kit.ipd.sdq.toometa.peropteryxcandidates.PerOpteryxDiscreteRangeOption;
import edu.kit.ipd.sdq.toometa.peropteryxcandidates.PeropteryxcandidatesPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Per Opteryx Discrete Range Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.peropteryxcandidates.impl.PerOpteryxDiscreteRangeOptionImpl#getChosenValue <em>Chosen Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PerOpteryxDiscreteRangeOptionImpl extends PerOpteryxOptionImpl implements PerOpteryxDiscreteRangeOption {
	/**
	 * The default value of the '{@link #getChosenValue() <em>Chosen Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChosenValue()
	 * @generated
	 * @ordered
	 */
	protected static final int CHOSEN_VALUE_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerOpteryxDiscreteRangeOptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PeropteryxcandidatesPackage.Literals.PER_OPTERYX_DISCRETE_RANGE_OPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getChosenValue() {
		return (Integer)eDynamicGet(PeropteryxcandidatesPackage.PER_OPTERYX_DISCRETE_RANGE_OPTION__CHOSEN_VALUE, PeropteryxcandidatesPackage.Literals.PER_OPTERYX_DISCRETE_RANGE_OPTION__CHOSEN_VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChosenValue(int newChosenValue) {
		eDynamicSet(PeropteryxcandidatesPackage.PER_OPTERYX_DISCRETE_RANGE_OPTION__CHOSEN_VALUE, PeropteryxcandidatesPackage.Literals.PER_OPTERYX_DISCRETE_RANGE_OPTION__CHOSEN_VALUE, newChosenValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PeropteryxcandidatesPackage.PER_OPTERYX_DISCRETE_RANGE_OPTION__CHOSEN_VALUE:
				return getChosenValue();
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
			case PeropteryxcandidatesPackage.PER_OPTERYX_DISCRETE_RANGE_OPTION__CHOSEN_VALUE:
				setChosenValue((Integer)newValue);
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
			case PeropteryxcandidatesPackage.PER_OPTERYX_DISCRETE_RANGE_OPTION__CHOSEN_VALUE:
				setChosenValue(CHOSEN_VALUE_EDEFAULT);
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
			case PeropteryxcandidatesPackage.PER_OPTERYX_DISCRETE_RANGE_OPTION__CHOSEN_VALUE:
				return getChosenValue() != CHOSEN_VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //PerOpteryxDiscreteRangeOptionImpl
