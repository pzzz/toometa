/**
 */
package edu.kit.ipd.sdq.toometa.jiraissues.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import edu.kit.ipd.sdq.toometa.jiraissues.DirectionEnum;
import edu.kit.ipd.sdq.toometa.jiraissues.JiraLink;
import edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jira Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraLinkImpl#getTargetIssueKey <em>Target Issue Key</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraLinkImpl#getTargetIssueUri <em>Target Issue Uri</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraLinkImpl#getIssueLinkType <em>Issue Link Type</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraLinkImpl#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JiraLinkImpl extends IdentifierImpl implements JiraLink {
	/**
	 * The default value of the '{@link #getTargetIssueKey() <em>Target Issue Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetIssueKey()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_ISSUE_KEY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTargetIssueUri() <em>Target Issue Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetIssueUri()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_ISSUE_URI_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getIssueLinkType() <em>Issue Link Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueLinkType()
	 * @generated
	 * @ordered
	 */
	protected static final String ISSUE_LINK_TYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final DirectionEnum DIRECTION_EDEFAULT = DirectionEnum.OUTBOUND;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JiraLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JiraissuesPackage.Literals.JIRA_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetIssueKey() {
		return (String)eDynamicGet(JiraissuesPackage.JIRA_LINK__TARGET_ISSUE_KEY, JiraissuesPackage.Literals.JIRA_LINK__TARGET_ISSUE_KEY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetIssueKey(String newTargetIssueKey) {
		eDynamicSet(JiraissuesPackage.JIRA_LINK__TARGET_ISSUE_KEY, JiraissuesPackage.Literals.JIRA_LINK__TARGET_ISSUE_KEY, newTargetIssueKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetIssueUri() {
		return (String)eDynamicGet(JiraissuesPackage.JIRA_LINK__TARGET_ISSUE_URI, JiraissuesPackage.Literals.JIRA_LINK__TARGET_ISSUE_URI, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetIssueUri(String newTargetIssueUri) {
		eDynamicSet(JiraissuesPackage.JIRA_LINK__TARGET_ISSUE_URI, JiraissuesPackage.Literals.JIRA_LINK__TARGET_ISSUE_URI, newTargetIssueUri);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIssueLinkType() {
		return (String)eDynamicGet(JiraissuesPackage.JIRA_LINK__ISSUE_LINK_TYPE, JiraissuesPackage.Literals.JIRA_LINK__ISSUE_LINK_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssueLinkType(String newIssueLinkType) {
		eDynamicSet(JiraissuesPackage.JIRA_LINK__ISSUE_LINK_TYPE, JiraissuesPackage.Literals.JIRA_LINK__ISSUE_LINK_TYPE, newIssueLinkType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionEnum getDirection() {
		return (DirectionEnum)eDynamicGet(JiraissuesPackage.JIRA_LINK__DIRECTION, JiraissuesPackage.Literals.JIRA_LINK__DIRECTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(DirectionEnum newDirection) {
		eDynamicSet(JiraissuesPackage.JIRA_LINK__DIRECTION, JiraissuesPackage.Literals.JIRA_LINK__DIRECTION, newDirection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JiraissuesPackage.JIRA_LINK__TARGET_ISSUE_KEY:
				return getTargetIssueKey();
			case JiraissuesPackage.JIRA_LINK__TARGET_ISSUE_URI:
				return getTargetIssueUri();
			case JiraissuesPackage.JIRA_LINK__ISSUE_LINK_TYPE:
				return getIssueLinkType();
			case JiraissuesPackage.JIRA_LINK__DIRECTION:
				return getDirection();
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
			case JiraissuesPackage.JIRA_LINK__TARGET_ISSUE_KEY:
				setTargetIssueKey((String)newValue);
				return;
			case JiraissuesPackage.JIRA_LINK__TARGET_ISSUE_URI:
				setTargetIssueUri((String)newValue);
				return;
			case JiraissuesPackage.JIRA_LINK__ISSUE_LINK_TYPE:
				setIssueLinkType((String)newValue);
				return;
			case JiraissuesPackage.JIRA_LINK__DIRECTION:
				setDirection((DirectionEnum)newValue);
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
			case JiraissuesPackage.JIRA_LINK__TARGET_ISSUE_KEY:
				setTargetIssueKey(TARGET_ISSUE_KEY_EDEFAULT);
				return;
			case JiraissuesPackage.JIRA_LINK__TARGET_ISSUE_URI:
				setTargetIssueUri(TARGET_ISSUE_URI_EDEFAULT);
				return;
			case JiraissuesPackage.JIRA_LINK__ISSUE_LINK_TYPE:
				setIssueLinkType(ISSUE_LINK_TYPE_EDEFAULT);
				return;
			case JiraissuesPackage.JIRA_LINK__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
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
			case JiraissuesPackage.JIRA_LINK__TARGET_ISSUE_KEY:
				return TARGET_ISSUE_KEY_EDEFAULT == null ? getTargetIssueKey() != null : !TARGET_ISSUE_KEY_EDEFAULT.equals(getTargetIssueKey());
			case JiraissuesPackage.JIRA_LINK__TARGET_ISSUE_URI:
				return TARGET_ISSUE_URI_EDEFAULT == null ? getTargetIssueUri() != null : !TARGET_ISSUE_URI_EDEFAULT.equals(getTargetIssueUri());
			case JiraissuesPackage.JIRA_LINK__ISSUE_LINK_TYPE:
				return ISSUE_LINK_TYPE_EDEFAULT == null ? getIssueLinkType() != null : !ISSUE_LINK_TYPE_EDEFAULT.equals(getIssueLinkType());
			case JiraissuesPackage.JIRA_LINK__DIRECTION:
				return getDirection() != DIRECTION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //JiraLinkImpl
