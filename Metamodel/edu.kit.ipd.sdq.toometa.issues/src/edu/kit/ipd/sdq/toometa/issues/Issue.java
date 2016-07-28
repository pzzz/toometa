/**
 */
package edu.kit.ipd.sdq.toometa.issues;

import de.uka.ipd.sdq.identifier.Identifier;

import edu.kit.ipd.sdq.toometa.relations.TraceableObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Issue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.issues.Issue#getSummary <em>Summary</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.issues.Issue#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.issues.Issue#getStatus <em>Status</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.issues.Issue#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.issues.IssuesPackage#getIssue()
 * @model abstract="true"
 * @generated
 */
public interface Issue extends Identifier, TraceableObject {
	/**
	 * Returns the value of the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Summary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Summary</em>' attribute.
	 * @see #setSummary(String)
	 * @see edu.kit.ipd.sdq.toometa.issues.IssuesPackage#getIssue_Summary()
	 * @model required="true"
	 * @generated
	 */
	String getSummary();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.issues.Issue#getSummary <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' attribute.
	 * @see #getSummary()
	 * @generated
	 */
	void setSummary(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see edu.kit.ipd.sdq.toometa.issues.IssuesPackage#getIssue_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.issues.Issue#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.kit.ipd.sdq.toometa.issues.IssueStatusEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see edu.kit.ipd.sdq.toometa.issues.IssueStatusEnum
	 * @see #setStatus(IssueStatusEnum)
	 * @see edu.kit.ipd.sdq.toometa.issues.IssuesPackage#getIssue_Status()
	 * @model
	 * @generated
	 */
	IssueStatusEnum getStatus();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.issues.Issue#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see edu.kit.ipd.sdq.toometa.issues.IssueStatusEnum
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(IssueStatusEnum value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * The default value is <code>"Major"</code>.
	 * The literals are from the enumeration {@link edu.kit.ipd.sdq.toometa.issues.IssuePriorityEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see edu.kit.ipd.sdq.toometa.issues.IssuePriorityEnum
	 * @see #setPriority(IssuePriorityEnum)
	 * @see edu.kit.ipd.sdq.toometa.issues.IssuesPackage#getIssue_Priority()
	 * @model default="Major"
	 * @generated
	 */
	IssuePriorityEnum getPriority();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.issues.Issue#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see edu.kit.ipd.sdq.toometa.issues.IssuePriorityEnum
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(IssuePriorityEnum value);

} // Issue
