/**
 */
package edu.kit.ipd.sdq.toometa.jiraissues.impl;

import edu.kit.ipd.sdq.toometa.jiraissues.AuthorUpdatableElement;
import edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage;
import edu.kit.ipd.sdq.toometa.jiraissues.UserProxy;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Author Updatable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.AuthorUpdatableElementImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.AuthorUpdatableElementImpl#getUpdateAuthor <em>Update Author</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuthorUpdatableElementImpl extends UpdatableElementImpl implements AuthorUpdatableElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthorUpdatableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JiraissuesPackage.Literals.AUTHOR_UPDATABLE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserProxy getAuthor() {
		return (UserProxy)eDynamicGet(JiraissuesPackage.AUTHOR_UPDATABLE_ELEMENT__AUTHOR, JiraissuesPackage.Literals.AUTHOR_UPDATABLE_ELEMENT__AUTHOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserProxy basicGetAuthor() {
		return (UserProxy)eDynamicGet(JiraissuesPackage.AUTHOR_UPDATABLE_ELEMENT__AUTHOR, JiraissuesPackage.Literals.AUTHOR_UPDATABLE_ELEMENT__AUTHOR, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(UserProxy newAuthor) {
		eDynamicSet(JiraissuesPackage.AUTHOR_UPDATABLE_ELEMENT__AUTHOR, JiraissuesPackage.Literals.AUTHOR_UPDATABLE_ELEMENT__AUTHOR, newAuthor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserProxy getUpdateAuthor() {
		return (UserProxy)eDynamicGet(JiraissuesPackage.AUTHOR_UPDATABLE_ELEMENT__UPDATE_AUTHOR, JiraissuesPackage.Literals.AUTHOR_UPDATABLE_ELEMENT__UPDATE_AUTHOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserProxy basicGetUpdateAuthor() {
		return (UserProxy)eDynamicGet(JiraissuesPackage.AUTHOR_UPDATABLE_ELEMENT__UPDATE_AUTHOR, JiraissuesPackage.Literals.AUTHOR_UPDATABLE_ELEMENT__UPDATE_AUTHOR, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateAuthor(UserProxy newUpdateAuthor) {
		eDynamicSet(JiraissuesPackage.AUTHOR_UPDATABLE_ELEMENT__UPDATE_AUTHOR, JiraissuesPackage.Literals.AUTHOR_UPDATABLE_ELEMENT__UPDATE_AUTHOR, newUpdateAuthor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JiraissuesPackage.AUTHOR_UPDATABLE_ELEMENT__AUTHOR:
				if (resolve) return getAuthor();
				return basicGetAuthor();
			case JiraissuesPackage.AUTHOR_UPDATABLE_ELEMENT__UPDATE_AUTHOR:
				if (resolve) return getUpdateAuthor();
				return basicGetUpdateAuthor();
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
			case JiraissuesPackage.AUTHOR_UPDATABLE_ELEMENT__AUTHOR:
				setAuthor((UserProxy)newValue);
				return;
			case JiraissuesPackage.AUTHOR_UPDATABLE_ELEMENT__UPDATE_AUTHOR:
				setUpdateAuthor((UserProxy)newValue);
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
			case JiraissuesPackage.AUTHOR_UPDATABLE_ELEMENT__AUTHOR:
				setAuthor((UserProxy)null);
				return;
			case JiraissuesPackage.AUTHOR_UPDATABLE_ELEMENT__UPDATE_AUTHOR:
				setUpdateAuthor((UserProxy)null);
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
			case JiraissuesPackage.AUTHOR_UPDATABLE_ELEMENT__AUTHOR:
				return basicGetAuthor() != null;
			case JiraissuesPackage.AUTHOR_UPDATABLE_ELEMENT__UPDATE_AUTHOR:
				return basicGetUpdateAuthor() != null;
		}
		return super.eIsSet(featureID);
	}

} //AuthorUpdatableElementImpl
