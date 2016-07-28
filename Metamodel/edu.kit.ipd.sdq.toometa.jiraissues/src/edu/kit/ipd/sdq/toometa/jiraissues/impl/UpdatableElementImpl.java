/**
 */
package edu.kit.ipd.sdq.toometa.jiraissues.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage;
import edu.kit.ipd.sdq.toometa.jiraissues.UpdatableElement;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Updatable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.UpdatableElementImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.UpdatableElementImpl#getUpdateDate <em>Update Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UpdatableElementImpl extends IdentifierImpl implements UpdatableElement {
	/**
	 * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATION_DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getUpdateDate() <em>Update Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date UPDATE_DATE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdatableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JiraissuesPackage.Literals.UPDATABLE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreationDate() {
		return (Date)eDynamicGet(JiraissuesPackage.UPDATABLE_ELEMENT__CREATION_DATE, JiraissuesPackage.Literals.UPDATABLE_ELEMENT__CREATION_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationDate(Date newCreationDate) {
		eDynamicSet(JiraissuesPackage.UPDATABLE_ELEMENT__CREATION_DATE, JiraissuesPackage.Literals.UPDATABLE_ELEMENT__CREATION_DATE, newCreationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getUpdateDate() {
		return (Date)eDynamicGet(JiraissuesPackage.UPDATABLE_ELEMENT__UPDATE_DATE, JiraissuesPackage.Literals.UPDATABLE_ELEMENT__UPDATE_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateDate(Date newUpdateDate) {
		eDynamicSet(JiraissuesPackage.UPDATABLE_ELEMENT__UPDATE_DATE, JiraissuesPackage.Literals.UPDATABLE_ELEMENT__UPDATE_DATE, newUpdateDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JiraissuesPackage.UPDATABLE_ELEMENT__CREATION_DATE:
				return getCreationDate();
			case JiraissuesPackage.UPDATABLE_ELEMENT__UPDATE_DATE:
				return getUpdateDate();
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
			case JiraissuesPackage.UPDATABLE_ELEMENT__CREATION_DATE:
				setCreationDate((Date)newValue);
				return;
			case JiraissuesPackage.UPDATABLE_ELEMENT__UPDATE_DATE:
				setUpdateDate((Date)newValue);
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
			case JiraissuesPackage.UPDATABLE_ELEMENT__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case JiraissuesPackage.UPDATABLE_ELEMENT__UPDATE_DATE:
				setUpdateDate(UPDATE_DATE_EDEFAULT);
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
			case JiraissuesPackage.UPDATABLE_ELEMENT__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? getCreationDate() != null : !CREATION_DATE_EDEFAULT.equals(getCreationDate());
			case JiraissuesPackage.UPDATABLE_ELEMENT__UPDATE_DATE:
				return UPDATE_DATE_EDEFAULT == null ? getUpdateDate() != null : !UPDATE_DATE_EDEFAULT.equals(getUpdateDate());
		}
		return super.eIsSet(featureID);
	}

} //UpdatableElementImpl
