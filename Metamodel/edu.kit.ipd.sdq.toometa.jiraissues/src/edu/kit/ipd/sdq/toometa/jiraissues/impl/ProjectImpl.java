/**
 */
package edu.kit.ipd.sdq.toometa.jiraissues.impl;

import edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage;
import edu.kit.ipd.sdq.toometa.jiraissues.Project;

import namedelement.NamedElement;
import namedelement.NamedelementPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.ProjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.ProjectImpl#getKey <em>Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectImpl extends AddressableElementImpl implements Project {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JiraissuesPackage.Literals.PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(JiraissuesPackage.PROJECT__NAME, NamedelementPackage.Literals.NAMED_ELEMENT__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(JiraissuesPackage.PROJECT__NAME, NamedelementPackage.Literals.NAMED_ELEMENT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKey() {
		return (String)eDynamicGet(JiraissuesPackage.PROJECT__KEY, JiraissuesPackage.Literals.PROJECT__KEY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(String newKey) {
		eDynamicSet(JiraissuesPackage.PROJECT__KEY, JiraissuesPackage.Literals.PROJECT__KEY, newKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JiraissuesPackage.PROJECT__NAME:
				return getName();
			case JiraissuesPackage.PROJECT__KEY:
				return getKey();
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
			case JiraissuesPackage.PROJECT__NAME:
				setName((String)newValue);
				return;
			case JiraissuesPackage.PROJECT__KEY:
				setKey((String)newValue);
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
			case JiraissuesPackage.PROJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case JiraissuesPackage.PROJECT__KEY:
				setKey(KEY_EDEFAULT);
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
			case JiraissuesPackage.PROJECT__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case JiraissuesPackage.PROJECT__KEY:
				return KEY_EDEFAULT == null ? getKey() != null : !KEY_EDEFAULT.equals(getKey());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case JiraissuesPackage.PROJECT__NAME: return NamedelementPackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case NamedelementPackage.NAMED_ELEMENT__NAME: return JiraissuesPackage.PROJECT__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ProjectImpl
