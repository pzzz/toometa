/**
 */
package edu.kit.ipd.sdq.toometa.jiraissues.impl;

import edu.kit.ipd.sdq.toometa.jiraissues.AuthorUpdatableElement;
import edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage;
import edu.kit.ipd.sdq.toometa.jiraissues.UpdatableElement;
import edu.kit.ipd.sdq.toometa.jiraissues.UserProxy;
import edu.kit.ipd.sdq.toometa.jiraissues.Worklog;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Worklog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.WorklogImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.WorklogImpl#getUpdateDate <em>Update Date</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.WorklogImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.WorklogImpl#getUpdateAuthor <em>Update Author</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.WorklogImpl#getIssueUri <em>Issue Uri</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.WorklogImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.WorklogImpl#getMinutesSpent <em>Minutes Spent</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.WorklogImpl#getStartDate <em>Start Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorklogImpl extends AddressableElementImpl implements Worklog {
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
	 * The default value of the '{@link #getIssueUri() <em>Issue Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueUri()
	 * @generated
	 * @ordered
	 */
	protected static final String ISSUE_URI_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMinutesSpent() <em>Minutes Spent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinutesSpent()
	 * @generated
	 * @ordered
	 */
	protected static final int MINUTES_SPENT_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorklogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JiraissuesPackage.Literals.WORKLOG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreationDate() {
		return (Date)eDynamicGet(JiraissuesPackage.WORKLOG__CREATION_DATE, JiraissuesPackage.Literals.UPDATABLE_ELEMENT__CREATION_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationDate(Date newCreationDate) {
		eDynamicSet(JiraissuesPackage.WORKLOG__CREATION_DATE, JiraissuesPackage.Literals.UPDATABLE_ELEMENT__CREATION_DATE, newCreationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getUpdateDate() {
		return (Date)eDynamicGet(JiraissuesPackage.WORKLOG__UPDATE_DATE, JiraissuesPackage.Literals.UPDATABLE_ELEMENT__UPDATE_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateDate(Date newUpdateDate) {
		eDynamicSet(JiraissuesPackage.WORKLOG__UPDATE_DATE, JiraissuesPackage.Literals.UPDATABLE_ELEMENT__UPDATE_DATE, newUpdateDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserProxy getAuthor() {
		return (UserProxy)eDynamicGet(JiraissuesPackage.WORKLOG__AUTHOR, JiraissuesPackage.Literals.AUTHOR_UPDATABLE_ELEMENT__AUTHOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserProxy basicGetAuthor() {
		return (UserProxy)eDynamicGet(JiraissuesPackage.WORKLOG__AUTHOR, JiraissuesPackage.Literals.AUTHOR_UPDATABLE_ELEMENT__AUTHOR, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(UserProxy newAuthor) {
		eDynamicSet(JiraissuesPackage.WORKLOG__AUTHOR, JiraissuesPackage.Literals.AUTHOR_UPDATABLE_ELEMENT__AUTHOR, newAuthor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserProxy getUpdateAuthor() {
		return (UserProxy)eDynamicGet(JiraissuesPackage.WORKLOG__UPDATE_AUTHOR, JiraissuesPackage.Literals.AUTHOR_UPDATABLE_ELEMENT__UPDATE_AUTHOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserProxy basicGetUpdateAuthor() {
		return (UserProxy)eDynamicGet(JiraissuesPackage.WORKLOG__UPDATE_AUTHOR, JiraissuesPackage.Literals.AUTHOR_UPDATABLE_ELEMENT__UPDATE_AUTHOR, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateAuthor(UserProxy newUpdateAuthor) {
		eDynamicSet(JiraissuesPackage.WORKLOG__UPDATE_AUTHOR, JiraissuesPackage.Literals.AUTHOR_UPDATABLE_ELEMENT__UPDATE_AUTHOR, newUpdateAuthor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIssueUri() {
		return (String)eDynamicGet(JiraissuesPackage.WORKLOG__ISSUE_URI, JiraissuesPackage.Literals.WORKLOG__ISSUE_URI, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssueUri(String newIssueUri) {
		eDynamicSet(JiraissuesPackage.WORKLOG__ISSUE_URI, JiraissuesPackage.Literals.WORKLOG__ISSUE_URI, newIssueUri);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return (String)eDynamicGet(JiraissuesPackage.WORKLOG__COMMENT, JiraissuesPackage.Literals.WORKLOG__COMMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		eDynamicSet(JiraissuesPackage.WORKLOG__COMMENT, JiraissuesPackage.Literals.WORKLOG__COMMENT, newComment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinutesSpent() {
		return (Integer)eDynamicGet(JiraissuesPackage.WORKLOG__MINUTES_SPENT, JiraissuesPackage.Literals.WORKLOG__MINUTES_SPENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinutesSpent(int newMinutesSpent) {
		eDynamicSet(JiraissuesPackage.WORKLOG__MINUTES_SPENT, JiraissuesPackage.Literals.WORKLOG__MINUTES_SPENT, newMinutesSpent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartDate() {
		return (Date)eDynamicGet(JiraissuesPackage.WORKLOG__START_DATE, JiraissuesPackage.Literals.WORKLOG__START_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(Date newStartDate) {
		eDynamicSet(JiraissuesPackage.WORKLOG__START_DATE, JiraissuesPackage.Literals.WORKLOG__START_DATE, newStartDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JiraissuesPackage.WORKLOG__CREATION_DATE:
				return getCreationDate();
			case JiraissuesPackage.WORKLOG__UPDATE_DATE:
				return getUpdateDate();
			case JiraissuesPackage.WORKLOG__AUTHOR:
				if (resolve) return getAuthor();
				return basicGetAuthor();
			case JiraissuesPackage.WORKLOG__UPDATE_AUTHOR:
				if (resolve) return getUpdateAuthor();
				return basicGetUpdateAuthor();
			case JiraissuesPackage.WORKLOG__ISSUE_URI:
				return getIssueUri();
			case JiraissuesPackage.WORKLOG__COMMENT:
				return getComment();
			case JiraissuesPackage.WORKLOG__MINUTES_SPENT:
				return getMinutesSpent();
			case JiraissuesPackage.WORKLOG__START_DATE:
				return getStartDate();
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
			case JiraissuesPackage.WORKLOG__CREATION_DATE:
				setCreationDate((Date)newValue);
				return;
			case JiraissuesPackage.WORKLOG__UPDATE_DATE:
				setUpdateDate((Date)newValue);
				return;
			case JiraissuesPackage.WORKLOG__AUTHOR:
				setAuthor((UserProxy)newValue);
				return;
			case JiraissuesPackage.WORKLOG__UPDATE_AUTHOR:
				setUpdateAuthor((UserProxy)newValue);
				return;
			case JiraissuesPackage.WORKLOG__ISSUE_URI:
				setIssueUri((String)newValue);
				return;
			case JiraissuesPackage.WORKLOG__COMMENT:
				setComment((String)newValue);
				return;
			case JiraissuesPackage.WORKLOG__MINUTES_SPENT:
				setMinutesSpent((Integer)newValue);
				return;
			case JiraissuesPackage.WORKLOG__START_DATE:
				setStartDate((Date)newValue);
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
			case JiraissuesPackage.WORKLOG__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case JiraissuesPackage.WORKLOG__UPDATE_DATE:
				setUpdateDate(UPDATE_DATE_EDEFAULT);
				return;
			case JiraissuesPackage.WORKLOG__AUTHOR:
				setAuthor((UserProxy)null);
				return;
			case JiraissuesPackage.WORKLOG__UPDATE_AUTHOR:
				setUpdateAuthor((UserProxy)null);
				return;
			case JiraissuesPackage.WORKLOG__ISSUE_URI:
				setIssueUri(ISSUE_URI_EDEFAULT);
				return;
			case JiraissuesPackage.WORKLOG__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case JiraissuesPackage.WORKLOG__MINUTES_SPENT:
				setMinutesSpent(MINUTES_SPENT_EDEFAULT);
				return;
			case JiraissuesPackage.WORKLOG__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
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
			case JiraissuesPackage.WORKLOG__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? getCreationDate() != null : !CREATION_DATE_EDEFAULT.equals(getCreationDate());
			case JiraissuesPackage.WORKLOG__UPDATE_DATE:
				return UPDATE_DATE_EDEFAULT == null ? getUpdateDate() != null : !UPDATE_DATE_EDEFAULT.equals(getUpdateDate());
			case JiraissuesPackage.WORKLOG__AUTHOR:
				return basicGetAuthor() != null;
			case JiraissuesPackage.WORKLOG__UPDATE_AUTHOR:
				return basicGetUpdateAuthor() != null;
			case JiraissuesPackage.WORKLOG__ISSUE_URI:
				return ISSUE_URI_EDEFAULT == null ? getIssueUri() != null : !ISSUE_URI_EDEFAULT.equals(getIssueUri());
			case JiraissuesPackage.WORKLOG__COMMENT:
				return COMMENT_EDEFAULT == null ? getComment() != null : !COMMENT_EDEFAULT.equals(getComment());
			case JiraissuesPackage.WORKLOG__MINUTES_SPENT:
				return getMinutesSpent() != MINUTES_SPENT_EDEFAULT;
			case JiraissuesPackage.WORKLOG__START_DATE:
				return START_DATE_EDEFAULT == null ? getStartDate() != null : !START_DATE_EDEFAULT.equals(getStartDate());
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
				case JiraissuesPackage.WORKLOG__CREATION_DATE: return JiraissuesPackage.UPDATABLE_ELEMENT__CREATION_DATE;
				case JiraissuesPackage.WORKLOG__UPDATE_DATE: return JiraissuesPackage.UPDATABLE_ELEMENT__UPDATE_DATE;
				default: return -1;
			}
		}
		if (baseClass == AuthorUpdatableElement.class) {
			switch (derivedFeatureID) {
				case JiraissuesPackage.WORKLOG__AUTHOR: return JiraissuesPackage.AUTHOR_UPDATABLE_ELEMENT__AUTHOR;
				case JiraissuesPackage.WORKLOG__UPDATE_AUTHOR: return JiraissuesPackage.AUTHOR_UPDATABLE_ELEMENT__UPDATE_AUTHOR;
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
				case JiraissuesPackage.UPDATABLE_ELEMENT__CREATION_DATE: return JiraissuesPackage.WORKLOG__CREATION_DATE;
				case JiraissuesPackage.UPDATABLE_ELEMENT__UPDATE_DATE: return JiraissuesPackage.WORKLOG__UPDATE_DATE;
				default: return -1;
			}
		}
		if (baseClass == AuthorUpdatableElement.class) {
			switch (baseFeatureID) {
				case JiraissuesPackage.AUTHOR_UPDATABLE_ELEMENT__AUTHOR: return JiraissuesPackage.WORKLOG__AUTHOR;
				case JiraissuesPackage.AUTHOR_UPDATABLE_ELEMENT__UPDATE_AUTHOR: return JiraissuesPackage.WORKLOG__UPDATE_AUTHOR;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //WorklogImpl
