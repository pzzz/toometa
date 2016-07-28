/**
 */
package edu.kit.ipd.sdq.toometa.jiraissues.impl;

import edu.kit.ipd.sdq.toometa.jiraissues.AuthorUpdatableElement;
import edu.kit.ipd.sdq.toometa.jiraissues.Comment;
import edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage;
import edu.kit.ipd.sdq.toometa.jiraissues.UpdatableElement;
import edu.kit.ipd.sdq.toometa.jiraissues.UserProxy;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.CommentImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.CommentImpl#getUpdateDate <em>Update Date</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.CommentImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.CommentImpl#getUpdateAuthor <em>Update Author</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.CommentImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommentImpl extends AddressableElementImpl implements Comment {
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
	 * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JiraissuesPackage.Literals.COMMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreationDate() {
		return (Date)eDynamicGet(JiraissuesPackage.COMMENT__CREATION_DATE, JiraissuesPackage.Literals.UPDATABLE_ELEMENT__CREATION_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationDate(Date newCreationDate) {
		eDynamicSet(JiraissuesPackage.COMMENT__CREATION_DATE, JiraissuesPackage.Literals.UPDATABLE_ELEMENT__CREATION_DATE, newCreationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getUpdateDate() {
		return (Date)eDynamicGet(JiraissuesPackage.COMMENT__UPDATE_DATE, JiraissuesPackage.Literals.UPDATABLE_ELEMENT__UPDATE_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateDate(Date newUpdateDate) {
		eDynamicSet(JiraissuesPackage.COMMENT__UPDATE_DATE, JiraissuesPackage.Literals.UPDATABLE_ELEMENT__UPDATE_DATE, newUpdateDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserProxy getAuthor() {
		return (UserProxy)eDynamicGet(JiraissuesPackage.COMMENT__AUTHOR, JiraissuesPackage.Literals.AUTHOR_UPDATABLE_ELEMENT__AUTHOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserProxy basicGetAuthor() {
		return (UserProxy)eDynamicGet(JiraissuesPackage.COMMENT__AUTHOR, JiraissuesPackage.Literals.AUTHOR_UPDATABLE_ELEMENT__AUTHOR, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(UserProxy newAuthor) {
		eDynamicSet(JiraissuesPackage.COMMENT__AUTHOR, JiraissuesPackage.Literals.AUTHOR_UPDATABLE_ELEMENT__AUTHOR, newAuthor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserProxy getUpdateAuthor() {
		return (UserProxy)eDynamicGet(JiraissuesPackage.COMMENT__UPDATE_AUTHOR, JiraissuesPackage.Literals.AUTHOR_UPDATABLE_ELEMENT__UPDATE_AUTHOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserProxy basicGetUpdateAuthor() {
		return (UserProxy)eDynamicGet(JiraissuesPackage.COMMENT__UPDATE_AUTHOR, JiraissuesPackage.Literals.AUTHOR_UPDATABLE_ELEMENT__UPDATE_AUTHOR, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateAuthor(UserProxy newUpdateAuthor) {
		eDynamicSet(JiraissuesPackage.COMMENT__UPDATE_AUTHOR, JiraissuesPackage.Literals.AUTHOR_UPDATABLE_ELEMENT__UPDATE_AUTHOR, newUpdateAuthor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBody() {
		return (String)eDynamicGet(JiraissuesPackage.COMMENT__BODY, JiraissuesPackage.Literals.COMMENT__BODY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(String newBody) {
		eDynamicSet(JiraissuesPackage.COMMENT__BODY, JiraissuesPackage.Literals.COMMENT__BODY, newBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JiraissuesPackage.COMMENT__CREATION_DATE:
				return getCreationDate();
			case JiraissuesPackage.COMMENT__UPDATE_DATE:
				return getUpdateDate();
			case JiraissuesPackage.COMMENT__AUTHOR:
				if (resolve) return getAuthor();
				return basicGetAuthor();
			case JiraissuesPackage.COMMENT__UPDATE_AUTHOR:
				if (resolve) return getUpdateAuthor();
				return basicGetUpdateAuthor();
			case JiraissuesPackage.COMMENT__BODY:
				return getBody();
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
			case JiraissuesPackage.COMMENT__CREATION_DATE:
				setCreationDate((Date)newValue);
				return;
			case JiraissuesPackage.COMMENT__UPDATE_DATE:
				setUpdateDate((Date)newValue);
				return;
			case JiraissuesPackage.COMMENT__AUTHOR:
				setAuthor((UserProxy)newValue);
				return;
			case JiraissuesPackage.COMMENT__UPDATE_AUTHOR:
				setUpdateAuthor((UserProxy)newValue);
				return;
			case JiraissuesPackage.COMMENT__BODY:
				setBody((String)newValue);
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
			case JiraissuesPackage.COMMENT__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case JiraissuesPackage.COMMENT__UPDATE_DATE:
				setUpdateDate(UPDATE_DATE_EDEFAULT);
				return;
			case JiraissuesPackage.COMMENT__AUTHOR:
				setAuthor((UserProxy)null);
				return;
			case JiraissuesPackage.COMMENT__UPDATE_AUTHOR:
				setUpdateAuthor((UserProxy)null);
				return;
			case JiraissuesPackage.COMMENT__BODY:
				setBody(BODY_EDEFAULT);
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
			case JiraissuesPackage.COMMENT__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? getCreationDate() != null : !CREATION_DATE_EDEFAULT.equals(getCreationDate());
			case JiraissuesPackage.COMMENT__UPDATE_DATE:
				return UPDATE_DATE_EDEFAULT == null ? getUpdateDate() != null : !UPDATE_DATE_EDEFAULT.equals(getUpdateDate());
			case JiraissuesPackage.COMMENT__AUTHOR:
				return basicGetAuthor() != null;
			case JiraissuesPackage.COMMENT__UPDATE_AUTHOR:
				return basicGetUpdateAuthor() != null;
			case JiraissuesPackage.COMMENT__BODY:
				return BODY_EDEFAULT == null ? getBody() != null : !BODY_EDEFAULT.equals(getBody());
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
		if (baseClass == UpdatableElement.class) {
			switch (derivedFeatureID) {
				case JiraissuesPackage.COMMENT__CREATION_DATE: return JiraissuesPackage.UPDATABLE_ELEMENT__CREATION_DATE;
				case JiraissuesPackage.COMMENT__UPDATE_DATE: return JiraissuesPackage.UPDATABLE_ELEMENT__UPDATE_DATE;
				default: return -1;
			}
		}
		if (baseClass == AuthorUpdatableElement.class) {
			switch (derivedFeatureID) {
				case JiraissuesPackage.COMMENT__AUTHOR: return JiraissuesPackage.AUTHOR_UPDATABLE_ELEMENT__AUTHOR;
				case JiraissuesPackage.COMMENT__UPDATE_AUTHOR: return JiraissuesPackage.AUTHOR_UPDATABLE_ELEMENT__UPDATE_AUTHOR;
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
		if (baseClass == UpdatableElement.class) {
			switch (baseFeatureID) {
				case JiraissuesPackage.UPDATABLE_ELEMENT__CREATION_DATE: return JiraissuesPackage.COMMENT__CREATION_DATE;
				case JiraissuesPackage.UPDATABLE_ELEMENT__UPDATE_DATE: return JiraissuesPackage.COMMENT__UPDATE_DATE;
				default: return -1;
			}
		}
		if (baseClass == AuthorUpdatableElement.class) {
			switch (baseFeatureID) {
				case JiraissuesPackage.AUTHOR_UPDATABLE_ELEMENT__AUTHOR: return JiraissuesPackage.COMMENT__AUTHOR;
				case JiraissuesPackage.AUTHOR_UPDATABLE_ELEMENT__UPDATE_AUTHOR: return JiraissuesPackage.COMMENT__UPDATE_AUTHOR;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //CommentImpl
