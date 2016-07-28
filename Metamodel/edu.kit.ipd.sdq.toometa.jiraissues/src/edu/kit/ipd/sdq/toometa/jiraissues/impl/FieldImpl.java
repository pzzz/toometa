/**
 */
package edu.kit.ipd.sdq.toometa.jiraissues.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import edu.kit.ipd.sdq.toometa.jiraissues.Field;
import edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage;

import namedelement.NamedElement;
import namedelement.NamedelementPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.FieldImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.FieldImpl#getFieldId <em>Field Id</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.FieldImpl#getType <em>Type</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.FieldImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldImpl extends IdentifierImpl implements Field {
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
	 * The default value of the '{@link #getFieldId() <em>Field Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldId()
	 * @generated
	 * @ordered
	 */
	protected static final String FIELD_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

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
	protected FieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JiraissuesPackage.Literals.FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(JiraissuesPackage.FIELD__NAME, NamedelementPackage.Literals.NAMED_ELEMENT__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(JiraissuesPackage.FIELD__NAME, NamedelementPackage.Literals.NAMED_ELEMENT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFieldId() {
		return (String)eDynamicGet(JiraissuesPackage.FIELD__FIELD_ID, JiraissuesPackage.Literals.FIELD__FIELD_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldId(String newFieldId) {
		eDynamicSet(JiraissuesPackage.FIELD__FIELD_ID, JiraissuesPackage.Literals.FIELD__FIELD_ID, newFieldId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return (String)eDynamicGet(JiraissuesPackage.FIELD__TYPE, JiraissuesPackage.Literals.FIELD__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		eDynamicSet(JiraissuesPackage.FIELD__TYPE, JiraissuesPackage.Literals.FIELD__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getValue() {
		return (Object)eDynamicGet(JiraissuesPackage.FIELD__VALUE, JiraissuesPackage.Literals.FIELD__VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Object newValue) {
		eDynamicSet(JiraissuesPackage.FIELD__VALUE, JiraissuesPackage.Literals.FIELD__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JiraissuesPackage.FIELD__NAME:
				return getName();
			case JiraissuesPackage.FIELD__FIELD_ID:
				return getFieldId();
			case JiraissuesPackage.FIELD__TYPE:
				return getType();
			case JiraissuesPackage.FIELD__VALUE:
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
			case JiraissuesPackage.FIELD__NAME:
				setName((String)newValue);
				return;
			case JiraissuesPackage.FIELD__FIELD_ID:
				setFieldId((String)newValue);
				return;
			case JiraissuesPackage.FIELD__TYPE:
				setType((String)newValue);
				return;
			case JiraissuesPackage.FIELD__VALUE:
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
			case JiraissuesPackage.FIELD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case JiraissuesPackage.FIELD__FIELD_ID:
				setFieldId(FIELD_ID_EDEFAULT);
				return;
			case JiraissuesPackage.FIELD__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case JiraissuesPackage.FIELD__VALUE:
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
			case JiraissuesPackage.FIELD__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case JiraissuesPackage.FIELD__FIELD_ID:
				return FIELD_ID_EDEFAULT == null ? getFieldId() != null : !FIELD_ID_EDEFAULT.equals(getFieldId());
			case JiraissuesPackage.FIELD__TYPE:
				return TYPE_EDEFAULT == null ? getType() != null : !TYPE_EDEFAULT.equals(getType());
			case JiraissuesPackage.FIELD__VALUE:
				return VALUE_EDEFAULT == null ? getValue() != null : !VALUE_EDEFAULT.equals(getValue());
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
				case JiraissuesPackage.FIELD__NAME: return NamedelementPackage.NAMED_ELEMENT__NAME;
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
				case NamedelementPackage.NAMED_ELEMENT__NAME: return JiraissuesPackage.FIELD__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //FieldImpl
