/**
 */
package edu.kit.ipd.sdq.toometa.jiraissues;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Worklog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.Worklog#getIssueUri <em>Issue Uri</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.Worklog#getComment <em>Comment</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.Worklog#getMinutesSpent <em>Minutes Spent</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.Worklog#getStartDate <em>Start Date</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getWorklog()
 * @model
 * @generated
 */
public interface Worklog extends AddressableElement, AuthorUpdatableElement {
	/**
	 * Returns the value of the '<em><b>Issue Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issue Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue Uri</em>' attribute.
	 * @see #setIssueUri(String)
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getWorklog_IssueUri()
	 * @model required="true"
	 * @generated
	 */
	String getIssueUri();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.jiraissues.Worklog#getIssueUri <em>Issue Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Uri</em>' attribute.
	 * @see #getIssueUri()
	 * @generated
	 */
	void setIssueUri(String value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getWorklog_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.jiraissues.Worklog#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Minutes Spent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minutes Spent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minutes Spent</em>' attribute.
	 * @see #setMinutesSpent(int)
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getWorklog_MinutesSpent()
	 * @model required="true"
	 * @generated
	 */
	int getMinutesSpent();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.jiraissues.Worklog#getMinutesSpent <em>Minutes Spent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minutes Spent</em>' attribute.
	 * @see #getMinutesSpent()
	 * @generated
	 */
	void setMinutesSpent(int value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getWorklog_StartDate()
	 * @model
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.jiraissues.Worklog#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

} // Worklog
