/**
 */
package edu.kit.ipd.sdq.toometa.jiraissues;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jira Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraLink#getTargetIssueKey <em>Target Issue Key</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraLink#getTargetIssueUri <em>Target Issue Uri</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraLink#getIssueLinkType <em>Issue Link Type</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraLink#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getJiraLink()
 * @model
 * @generated
 */
public interface JiraLink extends Identifier {
	/**
	 * Returns the value of the '<em><b>Target Issue Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Issue Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Issue Key</em>' attribute.
	 * @see #setTargetIssueKey(String)
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getJiraLink_TargetIssueKey()
	 * @model required="true"
	 * @generated
	 */
	String getTargetIssueKey();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraLink#getTargetIssueKey <em>Target Issue Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Issue Key</em>' attribute.
	 * @see #getTargetIssueKey()
	 * @generated
	 */
	void setTargetIssueKey(String value);

	/**
	 * Returns the value of the '<em><b>Target Issue Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Issue Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Issue Uri</em>' attribute.
	 * @see #setTargetIssueUri(String)
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getJiraLink_TargetIssueUri()
	 * @model required="true"
	 * @generated
	 */
	String getTargetIssueUri();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraLink#getTargetIssueUri <em>Target Issue Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Issue Uri</em>' attribute.
	 * @see #getTargetIssueUri()
	 * @generated
	 */
	void setTargetIssueUri(String value);

	/**
	 * Returns the value of the '<em><b>Issue Link Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issue Link Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue Link Type</em>' attribute.
	 * @see #setIssueLinkType(String)
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getJiraLink_IssueLinkType()
	 * @model
	 * @generated
	 */
	String getIssueLinkType();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraLink#getIssueLinkType <em>Issue Link Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Link Type</em>' attribute.
	 * @see #getIssueLinkType()
	 * @generated
	 */
	void setIssueLinkType(String value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.kit.ipd.sdq.toometa.jiraissues.DirectionEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.DirectionEnum
	 * @see #setDirection(DirectionEnum)
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getJiraLink_Direction()
	 * @model
	 * @generated
	 */
	DirectionEnum getDirection();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraLink#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.DirectionEnum
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(DirectionEnum value);

} // JiraLink
