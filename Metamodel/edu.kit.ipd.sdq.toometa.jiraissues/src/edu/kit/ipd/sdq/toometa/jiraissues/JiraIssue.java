/**
 */
package edu.kit.ipd.sdq.toometa.jiraissues;

import edu.kit.ipd.sdq.toometa.issues.Issue;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jira Issue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getKey <em>Key</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getTransitionsUri <em>Transitions Uri</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getResolution <em>Resolution</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getVotes <em>Votes</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getNumWatchers <em>Num Watchers</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#isIsSubtask <em>Is Subtask</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getTimeTracking <em>Time Tracking</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getAttachments <em>Attachments</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getProject <em>Project</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getComponents <em>Components</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getFields <em>Fields</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getFixVersions <em>Fix Versions</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getAffectedVersions <em>Affected Versions</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getIssueLinks <em>Issue Links</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getWorklogs <em>Worklogs</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getExpandos <em>Expandos</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getComments <em>Comments</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getReporter <em>Reporter</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getAssignee <em>Assignee</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getIssueType <em>Issue Type</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getJiraIssue()
 * @model
 * @generated
 */
public interface JiraIssue extends AddressableElement, UpdatableElement, Issue {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getJiraIssue_Key()
	 * @model required="true"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Transitions Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions Uri</em>' attribute.
	 * @see #setTransitionsUri(String)
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getJiraIssue_TransitionsUri()
	 * @model
	 * @generated
	 */
	String getTransitionsUri();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getTransitionsUri <em>Transitions Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transitions Uri</em>' attribute.
	 * @see #getTransitionsUri()
	 * @generated
	 */
	void setTransitionsUri(String value);

	/**
	 * Returns the value of the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolution</em>' attribute.
	 * @see #setResolution(String)
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getJiraIssue_Resolution()
	 * @model
	 * @generated
	 */
	String getResolution();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getResolution <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution</em>' attribute.
	 * @see #getResolution()
	 * @generated
	 */
	void setResolution(String value);

	/**
	 * Returns the value of the '<em><b>Votes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Votes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Votes</em>' attribute.
	 * @see #setVotes(int)
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getJiraIssue_Votes()
	 * @model
	 * @generated
	 */
	int getVotes();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getVotes <em>Votes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Votes</em>' attribute.
	 * @see #getVotes()
	 * @generated
	 */
	void setVotes(int value);

	/**
	 * Returns the value of the '<em><b>Num Watchers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Watchers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Watchers</em>' attribute.
	 * @see #setNumWatchers(int)
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getJiraIssue_NumWatchers()
	 * @model
	 * @generated
	 */
	int getNumWatchers();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getNumWatchers <em>Num Watchers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Watchers</em>' attribute.
	 * @see #getNumWatchers()
	 * @generated
	 */
	void setNumWatchers(int value);

	/**
	 * Returns the value of the '<em><b>Is Subtask</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Subtask</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Subtask</em>' attribute.
	 * @see #setIsSubtask(boolean)
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getJiraIssue_IsSubtask()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsSubtask();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#isIsSubtask <em>Is Subtask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Subtask</em>' attribute.
	 * @see #isIsSubtask()
	 * @generated
	 */
	void setIsSubtask(boolean value);

	/**
	 * Returns the value of the '<em><b>Time Tracking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Tracking</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Tracking</em>' containment reference.
	 * @see #setTimeTracking(TimeTracking)
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getJiraIssue_TimeTracking()
	 * @model containment="true"
	 * @generated
	 */
	TimeTracking getTimeTracking();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getTimeTracking <em>Time Tracking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Tracking</em>' containment reference.
	 * @see #getTimeTracking()
	 * @generated
	 */
	void setTimeTracking(TimeTracking value);

	/**
	 * Returns the value of the '<em><b>Attachments</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.jiraissues.Attachment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachments</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getJiraIssue_Attachments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attachment> getAttachments();

	/**
	 * Returns the value of the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' reference.
	 * @see #setProject(Project)
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getJiraIssue_Project()
	 * @model required="true"
	 * @generated
	 */
	Project getProject();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getProject <em>Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(Project value);

	/**
	 * Returns the value of the '<em><b>Components</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.jiraissues.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' reference list.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getJiraIssue_Components()
	 * @model
	 * @generated
	 */
	EList<Component> getComponents();

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.jiraissues.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getJiraIssue_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getFields();

	/**
	 * Returns the value of the '<em><b>Fix Versions</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.jiraissues.Version}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fix Versions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fix Versions</em>' reference list.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getJiraIssue_FixVersions()
	 * @model required="true"
	 * @generated
	 */
	EList<Version> getFixVersions();

	/**
	 * Returns the value of the '<em><b>Affected Versions</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.jiraissues.Version}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Affected Versions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affected Versions</em>' reference list.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getJiraIssue_AffectedVersions()
	 * @model required="true"
	 * @generated
	 */
	EList<Version> getAffectedVersions();

	/**
	 * Returns the value of the '<em><b>Issue Links</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.jiraissues.JiraLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issue Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue Links</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getJiraIssue_IssueLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<JiraLink> getIssueLinks();

	/**
	 * Returns the value of the '<em><b>Worklogs</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.jiraissues.Worklog}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Worklogs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Worklogs</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getJiraIssue_Worklogs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Worklog> getWorklogs();

	/**
	 * Returns the value of the '<em><b>Expandos</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expandos</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expandos</em>' attribute list.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getJiraIssue_Expandos()
	 * @model
	 * @generated
	 */
	EList<String> getExpandos();

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.jiraissues.Comment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getJiraIssue_Comments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Comment> getComments();

	/**
	 * Returns the value of the '<em><b>Reporter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reporter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reporter</em>' reference.
	 * @see #setReporter(UserProxy)
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getJiraIssue_Reporter()
	 * @model
	 * @generated
	 */
	UserProxy getReporter();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getReporter <em>Reporter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reporter</em>' reference.
	 * @see #getReporter()
	 * @generated
	 */
	void setReporter(UserProxy value);

	/**
	 * Returns the value of the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignee</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignee</em>' reference.
	 * @see #setAssignee(UserProxy)
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getJiraIssue_Assignee()
	 * @model
	 * @generated
	 */
	UserProxy getAssignee();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getAssignee <em>Assignee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignee</em>' reference.
	 * @see #getAssignee()
	 * @generated
	 */
	void setAssignee(UserProxy value);

	/**
	 * Returns the value of the '<em><b>Issue Type</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.kit.ipd.sdq.toometa.jiraissues.IssueTypesEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issue Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue Type</em>' attribute.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.IssueTypesEnum
	 * @see #setIssueType(IssueTypesEnum)
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getJiraIssue_IssueType()
	 * @model
	 * @generated
	 */
	IssueTypesEnum getIssueType();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getIssueType <em>Issue Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Type</em>' attribute.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.IssueTypesEnum
	 * @see #getIssueType()
	 * @generated
	 */
	void setIssueType(IssueTypesEnum value);

} // JiraIssue
