/**
 */
package edu.kit.ipd.sdq.toometa.jiraissues;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage
 * @generated
 */
public interface JiraissuesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JiraissuesFactory eINSTANCE = edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraissuesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment</em>'.
	 * @generated
	 */
	Attachment createAttachment();

	/**
	 * Returns a new object of class '<em>Time Tracking</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Tracking</em>'.
	 * @generated
	 */
	TimeTracking createTimeTracking();

	/**
	 * Returns a new object of class '<em>Worklog</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Worklog</em>'.
	 * @generated
	 */
	Worklog createWorklog();

	/**
	 * Returns a new object of class '<em>Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Version</em>'.
	 * @generated
	 */
	Version createVersion();

	/**
	 * Returns a new object of class '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project</em>'.
	 * @generated
	 */
	Project createProject();

	/**
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	Component createComponent();

	/**
	 * Returns a new object of class '<em>Jira Issue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jira Issue</em>'.
	 * @generated
	 */
	JiraIssue createJiraIssue();

	/**
	 * Returns a new object of class '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comment</em>'.
	 * @generated
	 */
	Comment createComment();

	/**
	 * Returns a new object of class '<em>User Proxy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Proxy</em>'.
	 * @generated
	 */
	UserProxy createUserProxy();

	/**
	 * Returns a new object of class '<em>Author Updatable Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Author Updatable Element</em>'.
	 * @generated
	 */
	AuthorUpdatableElement createAuthorUpdatableElement();

	/**
	 * Returns a new object of class '<em>Addressable Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Addressable Element</em>'.
	 * @generated
	 */
	AddressableElement createAddressableElement();

	/**
	 * Returns a new object of class '<em>Jira Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jira Link</em>'.
	 * @generated
	 */
	JiraLink createJiraLink();

	/**
	 * Returns a new object of class '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field</em>'.
	 * @generated
	 */
	Field createField();

	/**
	 * Returns a new object of class '<em>Updatable Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Updatable Element</em>'.
	 * @generated
	 */
	UpdatableElement createUpdatableElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JiraissuesPackage getJiraissuesPackage();

} //JiraissuesFactory
