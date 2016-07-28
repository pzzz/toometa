/**
 */
package edu.kit.ipd.sdq.toometa.jiraissues.util;

import de.uka.ipd.sdq.identifier.Identifier;

import edu.kit.ipd.sdq.toometa.issues.Issue;

import edu.kit.ipd.sdq.toometa.jiraissues.*;

import edu.kit.ipd.sdq.toometa.relations.AlternativeObject;
import edu.kit.ipd.sdq.toometa.relations.ConflictObject;
import edu.kit.ipd.sdq.toometa.relations.CouldResolveObject;
import edu.kit.ipd.sdq.toometa.relations.DependencyObject;
import edu.kit.ipd.sdq.toometa.relations.DuplicationObject;
import edu.kit.ipd.sdq.toometa.relations.ParentalObject;
import edu.kit.ipd.sdq.toometa.relations.RelationObject;
import edu.kit.ipd.sdq.toometa.relations.ResolveObject;
import edu.kit.ipd.sdq.toometa.relations.SelectionObject;
import edu.kit.ipd.sdq.toometa.relations.StakeholderObject;
import edu.kit.ipd.sdq.toometa.relations.TraceableObject;
import edu.kit.ipd.sdq.toometa.relations.TriggerObject;

import namedelement.NamedElement;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage
 * @generated
 */
public class JiraissuesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JiraissuesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JiraissuesSwitch() {
		if (modelPackage == null) {
			modelPackage = JiraissuesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case JiraissuesPackage.ATTACHMENT: {
				Attachment attachment = (Attachment)theEObject;
				T result = caseAttachment(attachment);
				if (result == null) result = caseAddressableElement(attachment);
				if (result == null) result = caseIdentifier(attachment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JiraissuesPackage.TIME_TRACKING: {
				TimeTracking timeTracking = (TimeTracking)theEObject;
				T result = caseTimeTracking(timeTracking);
				if (result == null) result = caseIdentifier(timeTracking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JiraissuesPackage.WORKLOG: {
				Worklog worklog = (Worklog)theEObject;
				T result = caseWorklog(worklog);
				if (result == null) result = caseAddressableElement(worklog);
				if (result == null) result = caseAuthorUpdatableElement(worklog);
				if (result == null) result = caseUpdatableElement(worklog);
				if (result == null) result = caseIdentifier(worklog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JiraissuesPackage.VERSION: {
				Version version = (Version)theEObject;
				T result = caseVersion(version);
				if (result == null) result = caseAddressableElement(version);
				if (result == null) result = caseNamedElement(version);
				if (result == null) result = caseIdentifier(version);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JiraissuesPackage.PROJECT: {
				Project project = (Project)theEObject;
				T result = caseProject(project);
				if (result == null) result = caseAddressableElement(project);
				if (result == null) result = caseNamedElement(project);
				if (result == null) result = caseIdentifier(project);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JiraissuesPackage.COMPONENT: {
				Component component = (Component)theEObject;
				T result = caseComponent(component);
				if (result == null) result = caseAddressableElement(component);
				if (result == null) result = caseNamedElement(component);
				if (result == null) result = caseIdentifier(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JiraissuesPackage.JIRA_ISSUE: {
				JiraIssue jiraIssue = (JiraIssue)theEObject;
				T result = caseJiraIssue(jiraIssue);
				if (result == null) result = caseAddressableElement(jiraIssue);
				if (result == null) result = caseUpdatableElement(jiraIssue);
				if (result == null) result = caseIssue(jiraIssue);
				if (result == null) result = caseTraceableObject(jiraIssue);
				if (result == null) result = caseRelationObject(jiraIssue);
				if (result == null) result = caseConflictObject(jiraIssue);
				if (result == null) result = caseDuplicationObject(jiraIssue);
				if (result == null) result = caseDependencyObject(jiraIssue);
				if (result == null) result = caseParentalObject(jiraIssue);
				if (result == null) result = caseTriggerObject(jiraIssue);
				if (result == null) result = caseResolveObject(jiraIssue);
				if (result == null) result = caseAlternativeObject(jiraIssue);
				if (result == null) result = caseCouldResolveObject(jiraIssue);
				if (result == null) result = caseStakeholderObject(jiraIssue);
				if (result == null) result = caseSelectionObject(jiraIssue);
				if (result == null) result = caseIdentifier(jiraIssue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JiraissuesPackage.COMMENT: {
				Comment comment = (Comment)theEObject;
				T result = caseComment(comment);
				if (result == null) result = caseAddressableElement(comment);
				if (result == null) result = caseAuthorUpdatableElement(comment);
				if (result == null) result = caseUpdatableElement(comment);
				if (result == null) result = caseIdentifier(comment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JiraissuesPackage.USER_PROXY: {
				UserProxy userProxy = (UserProxy)theEObject;
				T result = caseUserProxy(userProxy);
				if (result == null) result = caseAddressableElement(userProxy);
				if (result == null) result = caseNamedElement(userProxy);
				if (result == null) result = caseIdentifier(userProxy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JiraissuesPackage.AUTHOR_UPDATABLE_ELEMENT: {
				AuthorUpdatableElement authorUpdatableElement = (AuthorUpdatableElement)theEObject;
				T result = caseAuthorUpdatableElement(authorUpdatableElement);
				if (result == null) result = caseUpdatableElement(authorUpdatableElement);
				if (result == null) result = caseIdentifier(authorUpdatableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JiraissuesPackage.ADDRESSABLE_ELEMENT: {
				AddressableElement addressableElement = (AddressableElement)theEObject;
				T result = caseAddressableElement(addressableElement);
				if (result == null) result = caseIdentifier(addressableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JiraissuesPackage.JIRA_LINK: {
				JiraLink jiraLink = (JiraLink)theEObject;
				T result = caseJiraLink(jiraLink);
				if (result == null) result = caseIdentifier(jiraLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JiraissuesPackage.FIELD: {
				Field field = (Field)theEObject;
				T result = caseField(field);
				if (result == null) result = caseIdentifier(field);
				if (result == null) result = caseNamedElement(field);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JiraissuesPackage.UPDATABLE_ELEMENT: {
				UpdatableElement updatableElement = (UpdatableElement)theEObject;
				T result = caseUpdatableElement(updatableElement);
				if (result == null) result = caseIdentifier(updatableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachment(Attachment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Tracking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Tracking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeTracking(TimeTracking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Worklog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Worklog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorklog(Worklog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Version</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Version</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersion(Version object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProject(Project object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jira Issue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jira Issue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJiraIssue(JiraIssue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComment(Comment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Proxy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Proxy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserProxy(UserProxy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Author Updatable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Author Updatable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthorUpdatableElement(AuthorUpdatableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Addressable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Addressable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressableElement(AddressableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jira Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jira Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJiraLink(JiraLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseField(Field object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Updatable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Updatable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdatableElement(UpdatableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifier(Identifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationObject(RelationObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conflict Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conflict Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConflictObject(ConflictObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duplication Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duplication Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDuplicationObject(DuplicationObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependency Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependency Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependencyObject(DependencyObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parental Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parental Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParentalObject(ParentalObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriggerObject(TriggerObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resolve Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resolve Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResolveObject(ResolveObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alternative Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alternative Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlternativeObject(AlternativeObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Could Resolve Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Could Resolve Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCouldResolveObject(CouldResolveObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stakeholder Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stakeholder Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStakeholderObject(StakeholderObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selection Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selection Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectionObject(SelectionObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traceable Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traceable Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraceableObject(TraceableObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Issue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Issue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIssue(Issue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //JiraissuesSwitch
