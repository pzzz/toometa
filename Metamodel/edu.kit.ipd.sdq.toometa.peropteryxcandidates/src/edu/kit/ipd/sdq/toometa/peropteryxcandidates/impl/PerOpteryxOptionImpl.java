/**
 */
package edu.kit.ipd.sdq.toometa.peropteryxcandidates.impl;

import edu.kit.ipd.sdq.toometa.archoptions.impl.ArchOptionImpl;

import edu.kit.ipd.sdq.toometa.peropteryxcandidates.PerOpteryxOption;
import edu.kit.ipd.sdq.toometa.peropteryxcandidates.PeropteryxcandidatesPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Per Opteryx Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.peropteryxcandidates.impl.PerOpteryxOptionImpl#getPrimaryChanged <em>Primary Changed</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.peropteryxcandidates.impl.PerOpteryxOptionImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PerOpteryxOptionImpl extends ArchOptionImpl implements PerOpteryxOption {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final Object VALUE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerOpteryxOptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PeropteryxcandidatesPackage.Literals.PER_OPTERYX_OPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getPrimaryChanged() {
		return (EObject)eDynamicGet(PeropteryxcandidatesPackage.PER_OPTERYX_OPTION__PRIMARY_CHANGED, PeropteryxcandidatesPackage.Literals.PER_OPTERYX_OPTION__PRIMARY_CHANGED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetPrimaryChanged() {
		return (EObject)eDynamicGet(PeropteryxcandidatesPackage.PER_OPTERYX_OPTION__PRIMARY_CHANGED, PeropteryxcandidatesPackage.Literals.PER_OPTERYX_OPTION__PRIMARY_CHANGED, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryChanged(EObject newPrimaryChanged) {
		eDynamicSet(PeropteryxcandidatesPackage.PER_OPTERYX_OPTION__PRIMARY_CHANGED, PeropteryxcandidatesPackage.Literals.PER_OPTERYX_OPTION__PRIMARY_CHANGED, newPrimaryChanged);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getValue() {
		return (Object)eDynamicGet(PeropteryxcandidatesPackage.PER_OPTERYX_OPTION__VALUE, PeropteryxcandidatesPackage.Literals.PER_OPTERYX_OPTION__VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Object newValue) {
		eDynamicSet(PeropteryxcandidatesPackage.PER_OPTERYX_OPTION__VALUE, PeropteryxcandidatesPackage.Literals.PER_OPTERYX_OPTION__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PeropteryxcandidatesPackage.PER_OPTERYX_OPTION__PRIMARY_CHANGED:
				if (resolve) return getPrimaryChanged();
				return basicGetPrimaryChanged();
			case PeropteryxcandidatesPackage.PER_OPTERYX_OPTION__VALUE:
				return getValue();
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
			case PeropteryxcandidatesPackage.PER_OPTERYX_OPTION__PRIMARY_CHANGED:
				setPrimaryChanged((EObject)newValue);
				return;
			case PeropteryxcandidatesPackage.PER_OPTERYX_OPTION__VALUE:
				setValue(newValue);
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
			case PeropteryxcandidatesPackage.PER_OPTERYX_OPTION__PRIMARY_CHANGED:
				setPrimaryChanged((EObject)null);
				return;
			case PeropteryxcandidatesPackage.PER_OPTERYX_OPTION__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case PeropteryxcandidatesPackage.PER_OPTERYX_OPTION__PRIMARY_CHANGED:
				return basicGetPrimaryChanged() != null;
			case PeropteryxcandidatesPackage.PER_OPTERYX_OPTION__VALUE:
				return VALUE_EDEFAULT == null ? getValue() != null : !VALUE_EDEFAULT.equals(getValue());
		}
		return super.eIsSet(featureID);
	}

} //PerOpteryxOptionImpl
