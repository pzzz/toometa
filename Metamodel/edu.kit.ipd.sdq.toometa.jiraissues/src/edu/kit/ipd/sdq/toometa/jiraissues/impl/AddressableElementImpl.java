/**
 */
package edu.kit.ipd.sdq.toometa.jiraissues.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import edu.kit.ipd.sdq.toometa.jiraissues.AddressableElement;
import edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Addressable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.AddressableElementImpl#getSelf <em>Self</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddressableElementImpl extends IdentifierImpl implements AddressableElement {
	/**
	 * The default value of the '{@link #getSelf() <em>Self</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelf()
	 * @generated
	 * @ordered
	 */
	protected static final String SELF_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JiraissuesPackage.Literals.ADDRESSABLE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSelf() {
		return (String)eDynamicGet(JiraissuesPackage.ADDRESSABLE_ELEMENT__SELF, JiraissuesPackage.Literals.ADDRESSABLE_ELEMENT__SELF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelf(String newSelf) {
		eDynamicSet(JiraissuesPackage.ADDRESSABLE_ELEMENT__SELF, JiraissuesPackage.Literals.ADDRESSABLE_ELEMENT__SELF, newSelf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JiraissuesPackage.ADDRESSABLE_ELEMENT__SELF:
				return getSelf();
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
			case JiraissuesPackage.ADDRESSABLE_ELEMENT__SELF:
				setSelf((String)newValue);
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
			case JiraissuesPackage.ADDRESSABLE_ELEMENT__SELF:
				setSelf(SELF_EDEFAULT);
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
			case JiraissuesPackage.ADDRESSABLE_ELEMENT__SELF:
				return SELF_EDEFAULT == null ? getSelf() != null : !SELF_EDEFAULT.equals(getSelf());
		}
		return super.eIsSet(featureID);
	}

} //AddressableElementImpl
