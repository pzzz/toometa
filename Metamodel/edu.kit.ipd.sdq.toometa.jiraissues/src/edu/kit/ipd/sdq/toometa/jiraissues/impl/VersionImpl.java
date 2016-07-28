/**
 */
package edu.kit.ipd.sdq.toometa.jiraissues.impl;

import edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage;
import edu.kit.ipd.sdq.toometa.jiraissues.Version;

import java.util.Date;

import namedelement.NamedElement;
import namedelement.NamedelementPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.VersionImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.VersionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.VersionImpl#isIsArchived <em>Is Archived</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.VersionImpl#isIsReleased <em>Is Released</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.VersionImpl#getReleaseDate <em>Release Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VersionImpl extends AddressableElementImpl implements Version {
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isIsArchived() <em>Is Archived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsArchived()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ARCHIVED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isIsReleased() <em>Is Released</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReleased()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_RELEASED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getReleaseDate() <em>Release Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date RELEASE_DATE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JiraissuesPackage.Literals.VERSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(JiraissuesPackage.VERSION__NAME, NamedelementPackage.Literals.NAMED_ELEMENT__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(JiraissuesPackage.VERSION__NAME, NamedelementPackage.Literals.NAMED_ELEMENT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eDynamicGet(JiraissuesPackage.VERSION__DESCRIPTION, JiraissuesPackage.Literals.VERSION__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eDynamicSet(JiraissuesPackage.VERSION__DESCRIPTION, JiraissuesPackage.Literals.VERSION__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsArchived() {
		return (Boolean)eDynamicGet(JiraissuesPackage.VERSION__IS_ARCHIVED, JiraissuesPackage.Literals.VERSION__IS_ARCHIVED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsArchived(boolean newIsArchived) {
		eDynamicSet(JiraissuesPackage.VERSION__IS_ARCHIVED, JiraissuesPackage.Literals.VERSION__IS_ARCHIVED, newIsArchived);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsReleased() {
		return (Boolean)eDynamicGet(JiraissuesPackage.VERSION__IS_RELEASED, JiraissuesPackage.Literals.VERSION__IS_RELEASED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReleased(boolean newIsReleased) {
		eDynamicSet(JiraissuesPackage.VERSION__IS_RELEASED, JiraissuesPackage.Literals.VERSION__IS_RELEASED, newIsReleased);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getReleaseDate() {
		return (Date)eDynamicGet(JiraissuesPackage.VERSION__RELEASE_DATE, JiraissuesPackage.Literals.VERSION__RELEASE_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReleaseDate(Date newReleaseDate) {
		eDynamicSet(JiraissuesPackage.VERSION__RELEASE_DATE, JiraissuesPackage.Literals.VERSION__RELEASE_DATE, newReleaseDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JiraissuesPackage.VERSION__NAME:
				return getName();
			case JiraissuesPackage.VERSION__DESCRIPTION:
				return getDescription();
			case JiraissuesPackage.VERSION__IS_ARCHIVED:
				return isIsArchived();
			case JiraissuesPackage.VERSION__IS_RELEASED:
				return isIsReleased();
			case JiraissuesPackage.VERSION__RELEASE_DATE:
				return getReleaseDate();
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
			case JiraissuesPackage.VERSION__NAME:
				setName((String)newValue);
				return;
			case JiraissuesPackage.VERSION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case JiraissuesPackage.VERSION__IS_ARCHIVED:
				setIsArchived((Boolean)newValue);
				return;
			case JiraissuesPackage.VERSION__IS_RELEASED:
				setIsReleased((Boolean)newValue);
				return;
			case JiraissuesPackage.VERSION__RELEASE_DATE:
				setReleaseDate((Date)newValue);
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
			case JiraissuesPackage.VERSION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case JiraissuesPackage.VERSION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case JiraissuesPackage.VERSION__IS_ARCHIVED:
				setIsArchived(IS_ARCHIVED_EDEFAULT);
				return;
			case JiraissuesPackage.VERSION__IS_RELEASED:
				setIsReleased(IS_RELEASED_EDEFAULT);
				return;
			case JiraissuesPackage.VERSION__RELEASE_DATE:
				setReleaseDate(RELEASE_DATE_EDEFAULT);
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
			case JiraissuesPackage.VERSION__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case JiraissuesPackage.VERSION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case JiraissuesPackage.VERSION__IS_ARCHIVED:
				return isIsArchived() != IS_ARCHIVED_EDEFAULT;
			case JiraissuesPackage.VERSION__IS_RELEASED:
				return isIsReleased() != IS_RELEASED_EDEFAULT;
			case JiraissuesPackage.VERSION__RELEASE_DATE:
				return RELEASE_DATE_EDEFAULT == null ? getReleaseDate() != null : !RELEASE_DATE_EDEFAULT.equals(getReleaseDate());
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
				case JiraissuesPackage.VERSION__NAME: return NamedelementPackage.NAMED_ELEMENT__NAME;
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
				case NamedelementPackage.NAMED_ELEMENT__NAME: return JiraissuesPackage.VERSION__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //VersionImpl
