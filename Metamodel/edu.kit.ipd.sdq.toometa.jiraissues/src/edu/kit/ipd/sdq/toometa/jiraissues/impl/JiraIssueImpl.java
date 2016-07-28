/**
 */
package edu.kit.ipd.sdq.toometa.jiraissues.impl;

import edu.kit.ipd.sdq.toometa.issues.Issue;
import edu.kit.ipd.sdq.toometa.issues.IssuePriorityEnum;
import edu.kit.ipd.sdq.toometa.issues.IssueStatusEnum;
import edu.kit.ipd.sdq.toometa.issues.IssuesPackage;

import edu.kit.ipd.sdq.toometa.jiraissues.Attachment;
import edu.kit.ipd.sdq.toometa.jiraissues.Comment;
import edu.kit.ipd.sdq.toometa.jiraissues.Component;
import edu.kit.ipd.sdq.toometa.jiraissues.Field;
import edu.kit.ipd.sdq.toometa.jiraissues.IssueTypesEnum;
import edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue;
import edu.kit.ipd.sdq.toometa.jiraissues.JiraLink;
import edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage;
import edu.kit.ipd.sdq.toometa.jiraissues.Project;
import edu.kit.ipd.sdq.toometa.jiraissues.TimeTracking;
import edu.kit.ipd.sdq.toometa.jiraissues.UpdatableElement;
import edu.kit.ipd.sdq.toometa.jiraissues.UserProxy;
import edu.kit.ipd.sdq.toometa.jiraissues.Version;
import edu.kit.ipd.sdq.toometa.jiraissues.Worklog;

import edu.kit.ipd.sdq.toometa.relations.AlternativeObject;
import edu.kit.ipd.sdq.toometa.relations.ConflictObject;
import edu.kit.ipd.sdq.toometa.relations.CouldResolveObject;
import edu.kit.ipd.sdq.toometa.relations.DependencyObject;
import edu.kit.ipd.sdq.toometa.relations.DuplicationObject;
import edu.kit.ipd.sdq.toometa.relations.ParentalObject;
import edu.kit.ipd.sdq.toometa.relations.Relation;
import edu.kit.ipd.sdq.toometa.relations.RelationObject;
import edu.kit.ipd.sdq.toometa.relations.RelationsPackage;
import edu.kit.ipd.sdq.toometa.relations.ResolveObject;
import edu.kit.ipd.sdq.toometa.relations.SelectionObject;
import edu.kit.ipd.sdq.toometa.relations.StakeholderObject;
import edu.kit.ipd.sdq.toometa.relations.TraceableObject;
import edu.kit.ipd.sdq.toometa.relations.TriggerObject;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jira Issue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraIssueImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraIssueImpl#getUpdateDate <em>Update Date</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraIssueImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraIssueImpl#getConflictsWith <em>Conflicts With</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraIssueImpl#getHasConflicts <em>Has Conflicts</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraIssueImpl#getDuplicateOf <em>Duplicate Of</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraIssueImpl#getHasDuplicates <em>Has Duplicates</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraIssueImpl#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraIssueImpl#getHasDependents <em>Has Dependents</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraIssueImpl#getParentOf <em>Parent Of</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraIssueImpl#getSubpartOf <em>Subpart Of</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraIssueImpl#getTriggerOf <em>Trigger Of</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraIssueImpl#getTriggeredBy <em>Triggered By</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraIssueImpl#getResolves <em>Resolves</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraIssueImpl#getResolvedBy <em>Resolved By</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraIssueImpl#getAlternativeTo <em>Alternative To</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraIssueImpl#getHasAlternatives <em>Has Alternatives</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraIssueImpl#getCouldResolve <em>Could Resolve</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraIssueImpl#getCouldBeResolvedBy <em>Could Be Resolved By</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraIssueImpl#getStakeholderOf <em>Stakeholder Of</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraIssueImpl#getHasStakeholders <em>Has Stakeholders</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraIssueImpl#getSelected <em>Selected</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraIssueImpl#getSelectedBy <em>Selected By</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraIssueImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraIssueImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraIssueImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraIssueImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraIssueImpl#getKey <em>Key</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraIssueImpl#getTransitionsUri <em>Transitions Uri</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraIssueImpl#getResolution <em>Resolution</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraIssueImpl#getVotes <em>Votes</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraIssueImpl#getNumWatchers <em>Num Watchers</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraIssueImpl#isIsSubtask <em>Is Subtask</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraIssueImpl#getTimeTracking <em>Time Tracking</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraIssueImpl#getAttachments <em>Attachments</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraIssueImpl#getProject <em>Project</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraIssueImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraIssueImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraIssueImpl#getFixVersions <em>Fix Versions</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraIssueImpl#getAffectedVersions <em>Affected Versions</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraIssueImpl#getIssueLinks <em>Issue Links</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraIssueImpl#getWorklogs <em>Worklogs</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraIssueImpl#getExpandos <em>Expandos</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraIssueImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraIssueImpl#getReporter <em>Reporter</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraIssueImpl#getAssignee <em>Assignee</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraIssueImpl#getIssueType <em>Issue Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JiraIssueImpl extends AddressableElementImpl implements JiraIssue {
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
	 * The default value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected static final String SUMMARY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final IssueStatusEnum STATUS_EDEFAULT = IssueStatusEnum.NEW;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final IssuePriorityEnum PRIORITY_EDEFAULT = IssuePriorityEnum.MAJOR;

	/**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTransitionsUri() <em>Transitions Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionsUri()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSITIONS_URI_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOLUTION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getVotes() <em>Votes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVotes()
	 * @generated
	 * @ordered
	 */
	protected static final int VOTES_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getNumWatchers() <em>Num Watchers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumWatchers()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_WATCHERS_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #isIsSubtask() <em>Is Subtask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSubtask()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SUBTASK_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getIssueType() <em>Issue Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueType()
	 * @generated
	 * @ordered
	 */
	protected static final IssueTypesEnum ISSUE_TYPE_EDEFAULT = IssueTypesEnum.NEW_FEATURE;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JiraIssueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JiraissuesPackage.Literals.JIRA_ISSUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreationDate() {
		return (Date)eDynamicGet(JiraissuesPackage.JIRA_ISSUE__CREATION_DATE, JiraissuesPackage.Literals.UPDATABLE_ELEMENT__CREATION_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationDate(Date newCreationDate) {
		eDynamicSet(JiraissuesPackage.JIRA_ISSUE__CREATION_DATE, JiraissuesPackage.Literals.UPDATABLE_ELEMENT__CREATION_DATE, newCreationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getUpdateDate() {
		return (Date)eDynamicGet(JiraissuesPackage.JIRA_ISSUE__UPDATE_DATE, JiraissuesPackage.Literals.UPDATABLE_ELEMENT__UPDATE_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateDate(Date newUpdateDate) {
		eDynamicSet(JiraissuesPackage.JIRA_ISSUE__UPDATE_DATE, JiraissuesPackage.Literals.UPDATABLE_ELEMENT__UPDATE_DATE, newUpdateDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Relation> getRelations() {
		return (EList<Relation>)eDynamicGet(JiraissuesPackage.JIRA_ISSUE__RELATIONS, RelationsPackage.Literals.RELATION_OBJECT__RELATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ConflictObject> getConflictsWith() {
		return (EList<ConflictObject>)eDynamicGet(JiraissuesPackage.JIRA_ISSUE__CONFLICTS_WITH, RelationsPackage.Literals.CONFLICT_OBJECT__CONFLICTS_WITH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ConflictObject> getHasConflicts() {
		return (EList<ConflictObject>)eDynamicGet(JiraissuesPackage.JIRA_ISSUE__HAS_CONFLICTS, RelationsPackage.Literals.CONFLICT_OBJECT__HAS_CONFLICTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DuplicationObject> getDuplicateOf() {
		return (EList<DuplicationObject>)eDynamicGet(JiraissuesPackage.JIRA_ISSUE__DUPLICATE_OF, RelationsPackage.Literals.DUPLICATION_OBJECT__DUPLICATE_OF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DuplicationObject> getHasDuplicates() {
		return (EList<DuplicationObject>)eDynamicGet(JiraissuesPackage.JIRA_ISSUE__HAS_DUPLICATES, RelationsPackage.Literals.DUPLICATION_OBJECT__HAS_DUPLICATES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DependencyObject> getDependsOn() {
		return (EList<DependencyObject>)eDynamicGet(JiraissuesPackage.JIRA_ISSUE__DEPENDS_ON, RelationsPackage.Literals.DEPENDENCY_OBJECT__DEPENDS_ON, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DependencyObject> getHasDependents() {
		return (EList<DependencyObject>)eDynamicGet(JiraissuesPackage.JIRA_ISSUE__HAS_DEPENDENTS, RelationsPackage.Literals.DEPENDENCY_OBJECT__HAS_DEPENDENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ParentalObject> getParentOf() {
		return (EList<ParentalObject>)eDynamicGet(JiraissuesPackage.JIRA_ISSUE__PARENT_OF, RelationsPackage.Literals.PARENTAL_OBJECT__PARENT_OF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ParentalObject> getSubpartOf() {
		return (EList<ParentalObject>)eDynamicGet(JiraissuesPackage.JIRA_ISSUE__SUBPART_OF, RelationsPackage.Literals.PARENTAL_OBJECT__SUBPART_OF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TriggerObject> getTriggerOf() {
		return (EList<TriggerObject>)eDynamicGet(JiraissuesPackage.JIRA_ISSUE__TRIGGER_OF, RelationsPackage.Literals.TRIGGER_OBJECT__TRIGGER_OF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TriggerObject> getTriggeredBy() {
		return (EList<TriggerObject>)eDynamicGet(JiraissuesPackage.JIRA_ISSUE__TRIGGERED_BY, RelationsPackage.Literals.TRIGGER_OBJECT__TRIGGERED_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ResolveObject> getResolves() {
		return (EList<ResolveObject>)eDynamicGet(JiraissuesPackage.JIRA_ISSUE__RESOLVES, RelationsPackage.Literals.RESOLVE_OBJECT__RESOLVES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ResolveObject> getResolvedBy() {
		return (EList<ResolveObject>)eDynamicGet(JiraissuesPackage.JIRA_ISSUE__RESOLVED_BY, RelationsPackage.Literals.RESOLVE_OBJECT__RESOLVED_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AlternativeObject> getAlternativeTo() {
		return (EList<AlternativeObject>)eDynamicGet(JiraissuesPackage.JIRA_ISSUE__ALTERNATIVE_TO, RelationsPackage.Literals.ALTERNATIVE_OBJECT__ALTERNATIVE_TO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AlternativeObject> getHasAlternatives() {
		return (EList<AlternativeObject>)eDynamicGet(JiraissuesPackage.JIRA_ISSUE__HAS_ALTERNATIVES, RelationsPackage.Literals.ALTERNATIVE_OBJECT__HAS_ALTERNATIVES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CouldResolveObject> getCouldResolve() {
		return (EList<CouldResolveObject>)eDynamicGet(JiraissuesPackage.JIRA_ISSUE__COULD_RESOLVE, RelationsPackage.Literals.COULD_RESOLVE_OBJECT__COULD_RESOLVE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CouldResolveObject> getCouldBeResolvedBy() {
		return (EList<CouldResolveObject>)eDynamicGet(JiraissuesPackage.JIRA_ISSUE__COULD_BE_RESOLVED_BY, RelationsPackage.Literals.COULD_RESOLVE_OBJECT__COULD_BE_RESOLVED_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<StakeholderObject> getStakeholderOf() {
		return (EList<StakeholderObject>)eDynamicGet(JiraissuesPackage.JIRA_ISSUE__STAKEHOLDER_OF, RelationsPackage.Literals.STAKEHOLDER_OBJECT__STAKEHOLDER_OF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<StakeholderObject> getHasStakeholders() {
		return (EList<StakeholderObject>)eDynamicGet(JiraissuesPackage.JIRA_ISSUE__HAS_STAKEHOLDERS, RelationsPackage.Literals.STAKEHOLDER_OBJECT__HAS_STAKEHOLDERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SelectionObject> getSelected() {
		return (EList<SelectionObject>)eDynamicGet(JiraissuesPackage.JIRA_ISSUE__SELECTED, RelationsPackage.Literals.SELECTION_OBJECT__SELECTED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SelectionObject> getSelectedBy() {
		return (EList<SelectionObject>)eDynamicGet(JiraissuesPackage.JIRA_ISSUE__SELECTED_BY, RelationsPackage.Literals.SELECTION_OBJECT__SELECTED_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSummary() {
		return (String)eDynamicGet(JiraissuesPackage.JIRA_ISSUE__SUMMARY, IssuesPackage.Literals.ISSUE__SUMMARY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSummary(String newSummary) {
		eDynamicSet(JiraissuesPackage.JIRA_ISSUE__SUMMARY, IssuesPackage.Literals.ISSUE__SUMMARY, newSummary);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eDynamicGet(JiraissuesPackage.JIRA_ISSUE__DESCRIPTION, IssuesPackage.Literals.ISSUE__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eDynamicSet(JiraissuesPackage.JIRA_ISSUE__DESCRIPTION, IssuesPackage.Literals.ISSUE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueStatusEnum getStatus() {
		return (IssueStatusEnum)eDynamicGet(JiraissuesPackage.JIRA_ISSUE__STATUS, IssuesPackage.Literals.ISSUE__STATUS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(IssueStatusEnum newStatus) {
		eDynamicSet(JiraissuesPackage.JIRA_ISSUE__STATUS, IssuesPackage.Literals.ISSUE__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssuePriorityEnum getPriority() {
		return (IssuePriorityEnum)eDynamicGet(JiraissuesPackage.JIRA_ISSUE__PRIORITY, IssuesPackage.Literals.ISSUE__PRIORITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(IssuePriorityEnum newPriority) {
		eDynamicSet(JiraissuesPackage.JIRA_ISSUE__PRIORITY, IssuesPackage.Literals.ISSUE__PRIORITY, newPriority);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKey() {
		return (String)eDynamicGet(JiraissuesPackage.JIRA_ISSUE__KEY, JiraissuesPackage.Literals.JIRA_ISSUE__KEY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(String newKey) {
		eDynamicSet(JiraissuesPackage.JIRA_ISSUE__KEY, JiraissuesPackage.Literals.JIRA_ISSUE__KEY, newKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransitionsUri() {
		return (String)eDynamicGet(JiraissuesPackage.JIRA_ISSUE__TRANSITIONS_URI, JiraissuesPackage.Literals.JIRA_ISSUE__TRANSITIONS_URI, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransitionsUri(String newTransitionsUri) {
		eDynamicSet(JiraissuesPackage.JIRA_ISSUE__TRANSITIONS_URI, JiraissuesPackage.Literals.JIRA_ISSUE__TRANSITIONS_URI, newTransitionsUri);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResolution() {
		return (String)eDynamicGet(JiraissuesPackage.JIRA_ISSUE__RESOLUTION, JiraissuesPackage.Literals.JIRA_ISSUE__RESOLUTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolution(String newResolution) {
		eDynamicSet(JiraissuesPackage.JIRA_ISSUE__RESOLUTION, JiraissuesPackage.Literals.JIRA_ISSUE__RESOLUTION, newResolution);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVotes() {
		return (Integer)eDynamicGet(JiraissuesPackage.JIRA_ISSUE__VOTES, JiraissuesPackage.Literals.JIRA_ISSUE__VOTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVotes(int newVotes) {
		eDynamicSet(JiraissuesPackage.JIRA_ISSUE__VOTES, JiraissuesPackage.Literals.JIRA_ISSUE__VOTES, newVotes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumWatchers() {
		return (Integer)eDynamicGet(JiraissuesPackage.JIRA_ISSUE__NUM_WATCHERS, JiraissuesPackage.Literals.JIRA_ISSUE__NUM_WATCHERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumWatchers(int newNumWatchers) {
		eDynamicSet(JiraissuesPackage.JIRA_ISSUE__NUM_WATCHERS, JiraissuesPackage.Literals.JIRA_ISSUE__NUM_WATCHERS, newNumWatchers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSubtask() {
		return (Boolean)eDynamicGet(JiraissuesPackage.JIRA_ISSUE__IS_SUBTASK, JiraissuesPackage.Literals.JIRA_ISSUE__IS_SUBTASK, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSubtask(boolean newIsSubtask) {
		eDynamicSet(JiraissuesPackage.JIRA_ISSUE__IS_SUBTASK, JiraissuesPackage.Literals.JIRA_ISSUE__IS_SUBTASK, newIsSubtask);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeTracking getTimeTracking() {
		return (TimeTracking)eDynamicGet(JiraissuesPackage.JIRA_ISSUE__TIME_TRACKING, JiraissuesPackage.Literals.JIRA_ISSUE__TIME_TRACKING, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeTracking(TimeTracking newTimeTracking, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTimeTracking, JiraissuesPackage.JIRA_ISSUE__TIME_TRACKING, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeTracking(TimeTracking newTimeTracking) {
		eDynamicSet(JiraissuesPackage.JIRA_ISSUE__TIME_TRACKING, JiraissuesPackage.Literals.JIRA_ISSUE__TIME_TRACKING, newTimeTracking);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Attachment> getAttachments() {
		return (EList<Attachment>)eDynamicGet(JiraissuesPackage.JIRA_ISSUE__ATTACHMENTS, JiraissuesPackage.Literals.JIRA_ISSUE__ATTACHMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project getProject() {
		return (Project)eDynamicGet(JiraissuesPackage.JIRA_ISSUE__PROJECT, JiraissuesPackage.Literals.JIRA_ISSUE__PROJECT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project basicGetProject() {
		return (Project)eDynamicGet(JiraissuesPackage.JIRA_ISSUE__PROJECT, JiraissuesPackage.Literals.JIRA_ISSUE__PROJECT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProject(Project newProject) {
		eDynamicSet(JiraissuesPackage.JIRA_ISSUE__PROJECT, JiraissuesPackage.Literals.JIRA_ISSUE__PROJECT, newProject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Component> getComponents() {
		return (EList<Component>)eDynamicGet(JiraissuesPackage.JIRA_ISSUE__COMPONENTS, JiraissuesPackage.Literals.JIRA_ISSUE__COMPONENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Field> getFields() {
		return (EList<Field>)eDynamicGet(JiraissuesPackage.JIRA_ISSUE__FIELDS, JiraissuesPackage.Literals.JIRA_ISSUE__FIELDS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Version> getFixVersions() {
		return (EList<Version>)eDynamicGet(JiraissuesPackage.JIRA_ISSUE__FIX_VERSIONS, JiraissuesPackage.Literals.JIRA_ISSUE__FIX_VERSIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Version> getAffectedVersions() {
		return (EList<Version>)eDynamicGet(JiraissuesPackage.JIRA_ISSUE__AFFECTED_VERSIONS, JiraissuesPackage.Literals.JIRA_ISSUE__AFFECTED_VERSIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<JiraLink> getIssueLinks() {
		return (EList<JiraLink>)eDynamicGet(JiraissuesPackage.JIRA_ISSUE__ISSUE_LINKS, JiraissuesPackage.Literals.JIRA_ISSUE__ISSUE_LINKS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Worklog> getWorklogs() {
		return (EList<Worklog>)eDynamicGet(JiraissuesPackage.JIRA_ISSUE__WORKLOGS, JiraissuesPackage.Literals.JIRA_ISSUE__WORKLOGS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getExpandos() {
		return (EList<String>)eDynamicGet(JiraissuesPackage.JIRA_ISSUE__EXPANDOS, JiraissuesPackage.Literals.JIRA_ISSUE__EXPANDOS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Comment> getComments() {
		return (EList<Comment>)eDynamicGet(JiraissuesPackage.JIRA_ISSUE__COMMENTS, JiraissuesPackage.Literals.JIRA_ISSUE__COMMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserProxy getReporter() {
		return (UserProxy)eDynamicGet(JiraissuesPackage.JIRA_ISSUE__REPORTER, JiraissuesPackage.Literals.JIRA_ISSUE__REPORTER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserProxy basicGetReporter() {
		return (UserProxy)eDynamicGet(JiraissuesPackage.JIRA_ISSUE__REPORTER, JiraissuesPackage.Literals.JIRA_ISSUE__REPORTER, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReporter(UserProxy newReporter) {
		eDynamicSet(JiraissuesPackage.JIRA_ISSUE__REPORTER, JiraissuesPackage.Literals.JIRA_ISSUE__REPORTER, newReporter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserProxy getAssignee() {
		return (UserProxy)eDynamicGet(JiraissuesPackage.JIRA_ISSUE__ASSIGNEE, JiraissuesPackage.Literals.JIRA_ISSUE__ASSIGNEE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserProxy basicGetAssignee() {
		return (UserProxy)eDynamicGet(JiraissuesPackage.JIRA_ISSUE__ASSIGNEE, JiraissuesPackage.Literals.JIRA_ISSUE__ASSIGNEE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignee(UserProxy newAssignee) {
		eDynamicSet(JiraissuesPackage.JIRA_ISSUE__ASSIGNEE, JiraissuesPackage.Literals.JIRA_ISSUE__ASSIGNEE, newAssignee);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueTypesEnum getIssueType() {
		return (IssueTypesEnum)eDynamicGet(JiraissuesPackage.JIRA_ISSUE__ISSUE_TYPE, JiraissuesPackage.Literals.JIRA_ISSUE__ISSUE_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssueType(IssueTypesEnum newIssueType) {
		eDynamicSet(JiraissuesPackage.JIRA_ISSUE__ISSUE_TYPE, JiraissuesPackage.Literals.JIRA_ISSUE__ISSUE_TYPE, newIssueType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JiraissuesPackage.JIRA_ISSUE__CONFLICTS_WITH:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConflictsWith()).basicAdd(otherEnd, msgs);
			case JiraissuesPackage.JIRA_ISSUE__HAS_CONFLICTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasConflicts()).basicAdd(otherEnd, msgs);
			case JiraissuesPackage.JIRA_ISSUE__DUPLICATE_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDuplicateOf()).basicAdd(otherEnd, msgs);
			case JiraissuesPackage.JIRA_ISSUE__HAS_DUPLICATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasDuplicates()).basicAdd(otherEnd, msgs);
			case JiraissuesPackage.JIRA_ISSUE__DEPENDS_ON:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDependsOn()).basicAdd(otherEnd, msgs);
			case JiraissuesPackage.JIRA_ISSUE__HAS_DEPENDENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasDependents()).basicAdd(otherEnd, msgs);
			case JiraissuesPackage.JIRA_ISSUE__PARENT_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParentOf()).basicAdd(otherEnd, msgs);
			case JiraissuesPackage.JIRA_ISSUE__SUBPART_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubpartOf()).basicAdd(otherEnd, msgs);
			case JiraissuesPackage.JIRA_ISSUE__TRIGGER_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTriggerOf()).basicAdd(otherEnd, msgs);
			case JiraissuesPackage.JIRA_ISSUE__TRIGGERED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTriggeredBy()).basicAdd(otherEnd, msgs);
			case JiraissuesPackage.JIRA_ISSUE__RESOLVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResolves()).basicAdd(otherEnd, msgs);
			case JiraissuesPackage.JIRA_ISSUE__RESOLVED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResolvedBy()).basicAdd(otherEnd, msgs);
			case JiraissuesPackage.JIRA_ISSUE__ALTERNATIVE_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAlternativeTo()).basicAdd(otherEnd, msgs);
			case JiraissuesPackage.JIRA_ISSUE__HAS_ALTERNATIVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasAlternatives()).basicAdd(otherEnd, msgs);
			case JiraissuesPackage.JIRA_ISSUE__COULD_RESOLVE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCouldResolve()).basicAdd(otherEnd, msgs);
			case JiraissuesPackage.JIRA_ISSUE__COULD_BE_RESOLVED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCouldBeResolvedBy()).basicAdd(otherEnd, msgs);
			case JiraissuesPackage.JIRA_ISSUE__STAKEHOLDER_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStakeholderOf()).basicAdd(otherEnd, msgs);
			case JiraissuesPackage.JIRA_ISSUE__HAS_STAKEHOLDERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasStakeholders()).basicAdd(otherEnd, msgs);
			case JiraissuesPackage.JIRA_ISSUE__SELECTED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSelected()).basicAdd(otherEnd, msgs);
			case JiraissuesPackage.JIRA_ISSUE__SELECTED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSelectedBy()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JiraissuesPackage.JIRA_ISSUE__RELATIONS:
				return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
			case JiraissuesPackage.JIRA_ISSUE__CONFLICTS_WITH:
				return ((InternalEList<?>)getConflictsWith()).basicRemove(otherEnd, msgs);
			case JiraissuesPackage.JIRA_ISSUE__HAS_CONFLICTS:
				return ((InternalEList<?>)getHasConflicts()).basicRemove(otherEnd, msgs);
			case JiraissuesPackage.JIRA_ISSUE__DUPLICATE_OF:
				return ((InternalEList<?>)getDuplicateOf()).basicRemove(otherEnd, msgs);
			case JiraissuesPackage.JIRA_ISSUE__HAS_DUPLICATES:
				return ((InternalEList<?>)getHasDuplicates()).basicRemove(otherEnd, msgs);
			case JiraissuesPackage.JIRA_ISSUE__DEPENDS_ON:
				return ((InternalEList<?>)getDependsOn()).basicRemove(otherEnd, msgs);
			case JiraissuesPackage.JIRA_ISSUE__HAS_DEPENDENTS:
				return ((InternalEList<?>)getHasDependents()).basicRemove(otherEnd, msgs);
			case JiraissuesPackage.JIRA_ISSUE__PARENT_OF:
				return ((InternalEList<?>)getParentOf()).basicRemove(otherEnd, msgs);
			case JiraissuesPackage.JIRA_ISSUE__SUBPART_OF:
				return ((InternalEList<?>)getSubpartOf()).basicRemove(otherEnd, msgs);
			case JiraissuesPackage.JIRA_ISSUE__TRIGGER_OF:
				return ((InternalEList<?>)getTriggerOf()).basicRemove(otherEnd, msgs);
			case JiraissuesPackage.JIRA_ISSUE__TRIGGERED_BY:
				return ((InternalEList<?>)getTriggeredBy()).basicRemove(otherEnd, msgs);
			case JiraissuesPackage.JIRA_ISSUE__RESOLVES:
				return ((InternalEList<?>)getResolves()).basicRemove(otherEnd, msgs);
			case JiraissuesPackage.JIRA_ISSUE__RESOLVED_BY:
				return ((InternalEList<?>)getResolvedBy()).basicRemove(otherEnd, msgs);
			case JiraissuesPackage.JIRA_ISSUE__ALTERNATIVE_TO:
				return ((InternalEList<?>)getAlternativeTo()).basicRemove(otherEnd, msgs);
			case JiraissuesPackage.JIRA_ISSUE__HAS_ALTERNATIVES:
				return ((InternalEList<?>)getHasAlternatives()).basicRemove(otherEnd, msgs);
			case JiraissuesPackage.JIRA_ISSUE__COULD_RESOLVE:
				return ((InternalEList<?>)getCouldResolve()).basicRemove(otherEnd, msgs);
			case JiraissuesPackage.JIRA_ISSUE__COULD_BE_RESOLVED_BY:
				return ((InternalEList<?>)getCouldBeResolvedBy()).basicRemove(otherEnd, msgs);
			case JiraissuesPackage.JIRA_ISSUE__STAKEHOLDER_OF:
				return ((InternalEList<?>)getStakeholderOf()).basicRemove(otherEnd, msgs);
			case JiraissuesPackage.JIRA_ISSUE__HAS_STAKEHOLDERS:
				return ((InternalEList<?>)getHasStakeholders()).basicRemove(otherEnd, msgs);
			case JiraissuesPackage.JIRA_ISSUE__SELECTED:
				return ((InternalEList<?>)getSelected()).basicRemove(otherEnd, msgs);
			case JiraissuesPackage.JIRA_ISSUE__SELECTED_BY:
				return ((InternalEList<?>)getSelectedBy()).basicRemove(otherEnd, msgs);
			case JiraissuesPackage.JIRA_ISSUE__TIME_TRACKING:
				return basicSetTimeTracking(null, msgs);
			case JiraissuesPackage.JIRA_ISSUE__ATTACHMENTS:
				return ((InternalEList<?>)getAttachments()).basicRemove(otherEnd, msgs);
			case JiraissuesPackage.JIRA_ISSUE__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
			case JiraissuesPackage.JIRA_ISSUE__ISSUE_LINKS:
				return ((InternalEList<?>)getIssueLinks()).basicRemove(otherEnd, msgs);
			case JiraissuesPackage.JIRA_ISSUE__WORKLOGS:
				return ((InternalEList<?>)getWorklogs()).basicRemove(otherEnd, msgs);
			case JiraissuesPackage.JIRA_ISSUE__COMMENTS:
				return ((InternalEList<?>)getComments()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JiraissuesPackage.JIRA_ISSUE__CREATION_DATE:
				return getCreationDate();
			case JiraissuesPackage.JIRA_ISSUE__UPDATE_DATE:
				return getUpdateDate();
			case JiraissuesPackage.JIRA_ISSUE__RELATIONS:
				return getRelations();
			case JiraissuesPackage.JIRA_ISSUE__CONFLICTS_WITH:
				return getConflictsWith();
			case JiraissuesPackage.JIRA_ISSUE__HAS_CONFLICTS:
				return getHasConflicts();
			case JiraissuesPackage.JIRA_ISSUE__DUPLICATE_OF:
				return getDuplicateOf();
			case JiraissuesPackage.JIRA_ISSUE__HAS_DUPLICATES:
				return getHasDuplicates();
			case JiraissuesPackage.JIRA_ISSUE__DEPENDS_ON:
				return getDependsOn();
			case JiraissuesPackage.JIRA_ISSUE__HAS_DEPENDENTS:
				return getHasDependents();
			case JiraissuesPackage.JIRA_ISSUE__PARENT_OF:
				return getParentOf();
			case JiraissuesPackage.JIRA_ISSUE__SUBPART_OF:
				return getSubpartOf();
			case JiraissuesPackage.JIRA_ISSUE__TRIGGER_OF:
				return getTriggerOf();
			case JiraissuesPackage.JIRA_ISSUE__TRIGGERED_BY:
				return getTriggeredBy();
			case JiraissuesPackage.JIRA_ISSUE__RESOLVES:
				return getResolves();
			case JiraissuesPackage.JIRA_ISSUE__RESOLVED_BY:
				return getResolvedBy();
			case JiraissuesPackage.JIRA_ISSUE__ALTERNATIVE_TO:
				return getAlternativeTo();
			case JiraissuesPackage.JIRA_ISSUE__HAS_ALTERNATIVES:
				return getHasAlternatives();
			case JiraissuesPackage.JIRA_ISSUE__COULD_RESOLVE:
				return getCouldResolve();
			case JiraissuesPackage.JIRA_ISSUE__COULD_BE_RESOLVED_BY:
				return getCouldBeResolvedBy();
			case JiraissuesPackage.JIRA_ISSUE__STAKEHOLDER_OF:
				return getStakeholderOf();
			case JiraissuesPackage.JIRA_ISSUE__HAS_STAKEHOLDERS:
				return getHasStakeholders();
			case JiraissuesPackage.JIRA_ISSUE__SELECTED:
				return getSelected();
			case JiraissuesPackage.JIRA_ISSUE__SELECTED_BY:
				return getSelectedBy();
			case JiraissuesPackage.JIRA_ISSUE__SUMMARY:
				return getSummary();
			case JiraissuesPackage.JIRA_ISSUE__DESCRIPTION:
				return getDescription();
			case JiraissuesPackage.JIRA_ISSUE__STATUS:
				return getStatus();
			case JiraissuesPackage.JIRA_ISSUE__PRIORITY:
				return getPriority();
			case JiraissuesPackage.JIRA_ISSUE__KEY:
				return getKey();
			case JiraissuesPackage.JIRA_ISSUE__TRANSITIONS_URI:
				return getTransitionsUri();
			case JiraissuesPackage.JIRA_ISSUE__RESOLUTION:
				return getResolution();
			case JiraissuesPackage.JIRA_ISSUE__VOTES:
				return getVotes();
			case JiraissuesPackage.JIRA_ISSUE__NUM_WATCHERS:
				return getNumWatchers();
			case JiraissuesPackage.JIRA_ISSUE__IS_SUBTASK:
				return isIsSubtask();
			case JiraissuesPackage.JIRA_ISSUE__TIME_TRACKING:
				return getTimeTracking();
			case JiraissuesPackage.JIRA_ISSUE__ATTACHMENTS:
				return getAttachments();
			case JiraissuesPackage.JIRA_ISSUE__PROJECT:
				if (resolve) return getProject();
				return basicGetProject();
			case JiraissuesPackage.JIRA_ISSUE__COMPONENTS:
				return getComponents();
			case JiraissuesPackage.JIRA_ISSUE__FIELDS:
				return getFields();
			case JiraissuesPackage.JIRA_ISSUE__FIX_VERSIONS:
				return getFixVersions();
			case JiraissuesPackage.JIRA_ISSUE__AFFECTED_VERSIONS:
				return getAffectedVersions();
			case JiraissuesPackage.JIRA_ISSUE__ISSUE_LINKS:
				return getIssueLinks();
			case JiraissuesPackage.JIRA_ISSUE__WORKLOGS:
				return getWorklogs();
			case JiraissuesPackage.JIRA_ISSUE__EXPANDOS:
				return getExpandos();
			case JiraissuesPackage.JIRA_ISSUE__COMMENTS:
				return getComments();
			case JiraissuesPackage.JIRA_ISSUE__REPORTER:
				if (resolve) return getReporter();
				return basicGetReporter();
			case JiraissuesPackage.JIRA_ISSUE__ASSIGNEE:
				if (resolve) return getAssignee();
				return basicGetAssignee();
			case JiraissuesPackage.JIRA_ISSUE__ISSUE_TYPE:
				return getIssueType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JiraissuesPackage.JIRA_ISSUE__CREATION_DATE:
				setCreationDate((Date)newValue);
				return;
			case JiraissuesPackage.JIRA_ISSUE__UPDATE_DATE:
				setUpdateDate((Date)newValue);
				return;
			case JiraissuesPackage.JIRA_ISSUE__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends Relation>)newValue);
				return;
			case JiraissuesPackage.JIRA_ISSUE__CONFLICTS_WITH:
				getConflictsWith().clear();
				getConflictsWith().addAll((Collection<? extends ConflictObject>)newValue);
				return;
			case JiraissuesPackage.JIRA_ISSUE__HAS_CONFLICTS:
				getHasConflicts().clear();
				getHasConflicts().addAll((Collection<? extends ConflictObject>)newValue);
				return;
			case JiraissuesPackage.JIRA_ISSUE__DUPLICATE_OF:
				getDuplicateOf().clear();
				getDuplicateOf().addAll((Collection<? extends DuplicationObject>)newValue);
				return;
			case JiraissuesPackage.JIRA_ISSUE__HAS_DUPLICATES:
				getHasDuplicates().clear();
				getHasDuplicates().addAll((Collection<? extends DuplicationObject>)newValue);
				return;
			case JiraissuesPackage.JIRA_ISSUE__DEPENDS_ON:
				getDependsOn().clear();
				getDependsOn().addAll((Collection<? extends DependencyObject>)newValue);
				return;
			case JiraissuesPackage.JIRA_ISSUE__HAS_DEPENDENTS:
				getHasDependents().clear();
				getHasDependents().addAll((Collection<? extends DependencyObject>)newValue);
				return;
			case JiraissuesPackage.JIRA_ISSUE__PARENT_OF:
				getParentOf().clear();
				getParentOf().addAll((Collection<? extends ParentalObject>)newValue);
				return;
			case JiraissuesPackage.JIRA_ISSUE__SUBPART_OF:
				getSubpartOf().clear();
				getSubpartOf().addAll((Collection<? extends ParentalObject>)newValue);
				return;
			case JiraissuesPackage.JIRA_ISSUE__TRIGGER_OF:
				getTriggerOf().clear();
				getTriggerOf().addAll((Collection<? extends TriggerObject>)newValue);
				return;
			case JiraissuesPackage.JIRA_ISSUE__TRIGGERED_BY:
				getTriggeredBy().clear();
				getTriggeredBy().addAll((Collection<? extends TriggerObject>)newValue);
				return;
			case JiraissuesPackage.JIRA_ISSUE__RESOLVES:
				getResolves().clear();
				getResolves().addAll((Collection<? extends ResolveObject>)newValue);
				return;
			case JiraissuesPackage.JIRA_ISSUE__RESOLVED_BY:
				getResolvedBy().clear();
				getResolvedBy().addAll((Collection<? extends ResolveObject>)newValue);
				return;
			case JiraissuesPackage.JIRA_ISSUE__ALTERNATIVE_TO:
				getAlternativeTo().clear();
				getAlternativeTo().addAll((Collection<? extends AlternativeObject>)newValue);
				return;
			case JiraissuesPackage.JIRA_ISSUE__HAS_ALTERNATIVES:
				getHasAlternatives().clear();
				getHasAlternatives().addAll((Collection<? extends AlternativeObject>)newValue);
				return;
			case JiraissuesPackage.JIRA_ISSUE__COULD_RESOLVE:
				getCouldResolve().clear();
				getCouldResolve().addAll((Collection<? extends CouldResolveObject>)newValue);
				return;
			case JiraissuesPackage.JIRA_ISSUE__COULD_BE_RESOLVED_BY:
				getCouldBeResolvedBy().clear();
				getCouldBeResolvedBy().addAll((Collection<? extends CouldResolveObject>)newValue);
				return;
			case JiraissuesPackage.JIRA_ISSUE__STAKEHOLDER_OF:
				getStakeholderOf().clear();
				getStakeholderOf().addAll((Collection<? extends StakeholderObject>)newValue);
				return;
			case JiraissuesPackage.JIRA_ISSUE__HAS_STAKEHOLDERS:
				getHasStakeholders().clear();
				getHasStakeholders().addAll((Collection<? extends StakeholderObject>)newValue);
				return;
			case JiraissuesPackage.JIRA_ISSUE__SELECTED:
				getSelected().clear();
				getSelected().addAll((Collection<? extends SelectionObject>)newValue);
				return;
			case JiraissuesPackage.JIRA_ISSUE__SELECTED_BY:
				getSelectedBy().clear();
				getSelectedBy().addAll((Collection<? extends SelectionObject>)newValue);
				return;
			case JiraissuesPackage.JIRA_ISSUE__SUMMARY:
				setSummary((String)newValue);
				return;
			case JiraissuesPackage.JIRA_ISSUE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case JiraissuesPackage.JIRA_ISSUE__STATUS:
				setStatus((IssueStatusEnum)newValue);
				return;
			case JiraissuesPackage.JIRA_ISSUE__PRIORITY:
				setPriority((IssuePriorityEnum)newValue);
				return;
			case JiraissuesPackage.JIRA_ISSUE__KEY:
				setKey((String)newValue);
				return;
			case JiraissuesPackage.JIRA_ISSUE__TRANSITIONS_URI:
				setTransitionsUri((String)newValue);
				return;
			case JiraissuesPackage.JIRA_ISSUE__RESOLUTION:
				setResolution((String)newValue);
				return;
			case JiraissuesPackage.JIRA_ISSUE__VOTES:
				setVotes((Integer)newValue);
				return;
			case JiraissuesPackage.JIRA_ISSUE__NUM_WATCHERS:
				setNumWatchers((Integer)newValue);
				return;
			case JiraissuesPackage.JIRA_ISSUE__IS_SUBTASK:
				setIsSubtask((Boolean)newValue);
				return;
			case JiraissuesPackage.JIRA_ISSUE__TIME_TRACKING:
				setTimeTracking((TimeTracking)newValue);
				return;
			case JiraissuesPackage.JIRA_ISSUE__ATTACHMENTS:
				getAttachments().clear();
				getAttachments().addAll((Collection<? extends Attachment>)newValue);
				return;
			case JiraissuesPackage.JIRA_ISSUE__PROJECT:
				setProject((Project)newValue);
				return;
			case JiraissuesPackage.JIRA_ISSUE__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends Component>)newValue);
				return;
			case JiraissuesPackage.JIRA_ISSUE__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends Field>)newValue);
				return;
			case JiraissuesPackage.JIRA_ISSUE__FIX_VERSIONS:
				getFixVersions().clear();
				getFixVersions().addAll((Collection<? extends Version>)newValue);
				return;
			case JiraissuesPackage.JIRA_ISSUE__AFFECTED_VERSIONS:
				getAffectedVersions().clear();
				getAffectedVersions().addAll((Collection<? extends Version>)newValue);
				return;
			case JiraissuesPackage.JIRA_ISSUE__ISSUE_LINKS:
				getIssueLinks().clear();
				getIssueLinks().addAll((Collection<? extends JiraLink>)newValue);
				return;
			case JiraissuesPackage.JIRA_ISSUE__WORKLOGS:
				getWorklogs().clear();
				getWorklogs().addAll((Collection<? extends Worklog>)newValue);
				return;
			case JiraissuesPackage.JIRA_ISSUE__EXPANDOS:
				getExpandos().clear();
				getExpandos().addAll((Collection<? extends String>)newValue);
				return;
			case JiraissuesPackage.JIRA_ISSUE__COMMENTS:
				getComments().clear();
				getComments().addAll((Collection<? extends Comment>)newValue);
				return;
			case JiraissuesPackage.JIRA_ISSUE__REPORTER:
				setReporter((UserProxy)newValue);
				return;
			case JiraissuesPackage.JIRA_ISSUE__ASSIGNEE:
				setAssignee((UserProxy)newValue);
				return;
			case JiraissuesPackage.JIRA_ISSUE__ISSUE_TYPE:
				setIssueType((IssueTypesEnum)newValue);
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
			case JiraissuesPackage.JIRA_ISSUE__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case JiraissuesPackage.JIRA_ISSUE__UPDATE_DATE:
				setUpdateDate(UPDATE_DATE_EDEFAULT);
				return;
			case JiraissuesPackage.JIRA_ISSUE__RELATIONS:
				getRelations().clear();
				return;
			case JiraissuesPackage.JIRA_ISSUE__CONFLICTS_WITH:
				getConflictsWith().clear();
				return;
			case JiraissuesPackage.JIRA_ISSUE__HAS_CONFLICTS:
				getHasConflicts().clear();
				return;
			case JiraissuesPackage.JIRA_ISSUE__DUPLICATE_OF:
				getDuplicateOf().clear();
				return;
			case JiraissuesPackage.JIRA_ISSUE__HAS_DUPLICATES:
				getHasDuplicates().clear();
				return;
			case JiraissuesPackage.JIRA_ISSUE__DEPENDS_ON:
				getDependsOn().clear();
				return;
			case JiraissuesPackage.JIRA_ISSUE__HAS_DEPENDENTS:
				getHasDependents().clear();
				return;
			case JiraissuesPackage.JIRA_ISSUE__PARENT_OF:
				getParentOf().clear();
				return;
			case JiraissuesPackage.JIRA_ISSUE__SUBPART_OF:
				getSubpartOf().clear();
				return;
			case JiraissuesPackage.JIRA_ISSUE__TRIGGER_OF:
				getTriggerOf().clear();
				return;
			case JiraissuesPackage.JIRA_ISSUE__TRIGGERED_BY:
				getTriggeredBy().clear();
				return;
			case JiraissuesPackage.JIRA_ISSUE__RESOLVES:
				getResolves().clear();
				return;
			case JiraissuesPackage.JIRA_ISSUE__RESOLVED_BY:
				getResolvedBy().clear();
				return;
			case JiraissuesPackage.JIRA_ISSUE__ALTERNATIVE_TO:
				getAlternativeTo().clear();
				return;
			case JiraissuesPackage.JIRA_ISSUE__HAS_ALTERNATIVES:
				getHasAlternatives().clear();
				return;
			case JiraissuesPackage.JIRA_ISSUE__COULD_RESOLVE:
				getCouldResolve().clear();
				return;
			case JiraissuesPackage.JIRA_ISSUE__COULD_BE_RESOLVED_BY:
				getCouldBeResolvedBy().clear();
				return;
			case JiraissuesPackage.JIRA_ISSUE__STAKEHOLDER_OF:
				getStakeholderOf().clear();
				return;
			case JiraissuesPackage.JIRA_ISSUE__HAS_STAKEHOLDERS:
				getHasStakeholders().clear();
				return;
			case JiraissuesPackage.JIRA_ISSUE__SELECTED:
				getSelected().clear();
				return;
			case JiraissuesPackage.JIRA_ISSUE__SELECTED_BY:
				getSelectedBy().clear();
				return;
			case JiraissuesPackage.JIRA_ISSUE__SUMMARY:
				setSummary(SUMMARY_EDEFAULT);
				return;
			case JiraissuesPackage.JIRA_ISSUE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case JiraissuesPackage.JIRA_ISSUE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case JiraissuesPackage.JIRA_ISSUE__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case JiraissuesPackage.JIRA_ISSUE__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case JiraissuesPackage.JIRA_ISSUE__TRANSITIONS_URI:
				setTransitionsUri(TRANSITIONS_URI_EDEFAULT);
				return;
			case JiraissuesPackage.JIRA_ISSUE__RESOLUTION:
				setResolution(RESOLUTION_EDEFAULT);
				return;
			case JiraissuesPackage.JIRA_ISSUE__VOTES:
				setVotes(VOTES_EDEFAULT);
				return;
			case JiraissuesPackage.JIRA_ISSUE__NUM_WATCHERS:
				setNumWatchers(NUM_WATCHERS_EDEFAULT);
				return;
			case JiraissuesPackage.JIRA_ISSUE__IS_SUBTASK:
				setIsSubtask(IS_SUBTASK_EDEFAULT);
				return;
			case JiraissuesPackage.JIRA_ISSUE__TIME_TRACKING:
				setTimeTracking((TimeTracking)null);
				return;
			case JiraissuesPackage.JIRA_ISSUE__ATTACHMENTS:
				getAttachments().clear();
				return;
			case JiraissuesPackage.JIRA_ISSUE__PROJECT:
				setProject((Project)null);
				return;
			case JiraissuesPackage.JIRA_ISSUE__COMPONENTS:
				getComponents().clear();
				return;
			case JiraissuesPackage.JIRA_ISSUE__FIELDS:
				getFields().clear();
				return;
			case JiraissuesPackage.JIRA_ISSUE__FIX_VERSIONS:
				getFixVersions().clear();
				return;
			case JiraissuesPackage.JIRA_ISSUE__AFFECTED_VERSIONS:
				getAffectedVersions().clear();
				return;
			case JiraissuesPackage.JIRA_ISSUE__ISSUE_LINKS:
				getIssueLinks().clear();
				return;
			case JiraissuesPackage.JIRA_ISSUE__WORKLOGS:
				getWorklogs().clear();
				return;
			case JiraissuesPackage.JIRA_ISSUE__EXPANDOS:
				getExpandos().clear();
				return;
			case JiraissuesPackage.JIRA_ISSUE__COMMENTS:
				getComments().clear();
				return;
			case JiraissuesPackage.JIRA_ISSUE__REPORTER:
				setReporter((UserProxy)null);
				return;
			case JiraissuesPackage.JIRA_ISSUE__ASSIGNEE:
				setAssignee((UserProxy)null);
				return;
			case JiraissuesPackage.JIRA_ISSUE__ISSUE_TYPE:
				setIssueType(ISSUE_TYPE_EDEFAULT);
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
			case JiraissuesPackage.JIRA_ISSUE__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? getCreationDate() != null : !CREATION_DATE_EDEFAULT.equals(getCreationDate());
			case JiraissuesPackage.JIRA_ISSUE__UPDATE_DATE:
				return UPDATE_DATE_EDEFAULT == null ? getUpdateDate() != null : !UPDATE_DATE_EDEFAULT.equals(getUpdateDate());
			case JiraissuesPackage.JIRA_ISSUE__RELATIONS:
				return !getRelations().isEmpty();
			case JiraissuesPackage.JIRA_ISSUE__CONFLICTS_WITH:
				return !getConflictsWith().isEmpty();
			case JiraissuesPackage.JIRA_ISSUE__HAS_CONFLICTS:
				return !getHasConflicts().isEmpty();
			case JiraissuesPackage.JIRA_ISSUE__DUPLICATE_OF:
				return !getDuplicateOf().isEmpty();
			case JiraissuesPackage.JIRA_ISSUE__HAS_DUPLICATES:
				return !getHasDuplicates().isEmpty();
			case JiraissuesPackage.JIRA_ISSUE__DEPENDS_ON:
				return !getDependsOn().isEmpty();
			case JiraissuesPackage.JIRA_ISSUE__HAS_DEPENDENTS:
				return !getHasDependents().isEmpty();
			case JiraissuesPackage.JIRA_ISSUE__PARENT_OF:
				return !getParentOf().isEmpty();
			case JiraissuesPackage.JIRA_ISSUE__SUBPART_OF:
				return !getSubpartOf().isEmpty();
			case JiraissuesPackage.JIRA_ISSUE__TRIGGER_OF:
				return !getTriggerOf().isEmpty();
			case JiraissuesPackage.JIRA_ISSUE__TRIGGERED_BY:
				return !getTriggeredBy().isEmpty();
			case JiraissuesPackage.JIRA_ISSUE__RESOLVES:
				return !getResolves().isEmpty();
			case JiraissuesPackage.JIRA_ISSUE__RESOLVED_BY:
				return !getResolvedBy().isEmpty();
			case JiraissuesPackage.JIRA_ISSUE__ALTERNATIVE_TO:
				return !getAlternativeTo().isEmpty();
			case JiraissuesPackage.JIRA_ISSUE__HAS_ALTERNATIVES:
				return !getHasAlternatives().isEmpty();
			case JiraissuesPackage.JIRA_ISSUE__COULD_RESOLVE:
				return !getCouldResolve().isEmpty();
			case JiraissuesPackage.JIRA_ISSUE__COULD_BE_RESOLVED_BY:
				return !getCouldBeResolvedBy().isEmpty();
			case JiraissuesPackage.JIRA_ISSUE__STAKEHOLDER_OF:
				return !getStakeholderOf().isEmpty();
			case JiraissuesPackage.JIRA_ISSUE__HAS_STAKEHOLDERS:
				return !getHasStakeholders().isEmpty();
			case JiraissuesPackage.JIRA_ISSUE__SELECTED:
				return !getSelected().isEmpty();
			case JiraissuesPackage.JIRA_ISSUE__SELECTED_BY:
				return !getSelectedBy().isEmpty();
			case JiraissuesPackage.JIRA_ISSUE__SUMMARY:
				return SUMMARY_EDEFAULT == null ? getSummary() != null : !SUMMARY_EDEFAULT.equals(getSummary());
			case JiraissuesPackage.JIRA_ISSUE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case JiraissuesPackage.JIRA_ISSUE__STATUS:
				return getStatus() != STATUS_EDEFAULT;
			case JiraissuesPackage.JIRA_ISSUE__PRIORITY:
				return getPriority() != PRIORITY_EDEFAULT;
			case JiraissuesPackage.JIRA_ISSUE__KEY:
				return KEY_EDEFAULT == null ? getKey() != null : !KEY_EDEFAULT.equals(getKey());
			case JiraissuesPackage.JIRA_ISSUE__TRANSITIONS_URI:
				return TRANSITIONS_URI_EDEFAULT == null ? getTransitionsUri() != null : !TRANSITIONS_URI_EDEFAULT.equals(getTransitionsUri());
			case JiraissuesPackage.JIRA_ISSUE__RESOLUTION:
				return RESOLUTION_EDEFAULT == null ? getResolution() != null : !RESOLUTION_EDEFAULT.equals(getResolution());
			case JiraissuesPackage.JIRA_ISSUE__VOTES:
				return getVotes() != VOTES_EDEFAULT;
			case JiraissuesPackage.JIRA_ISSUE__NUM_WATCHERS:
				return getNumWatchers() != NUM_WATCHERS_EDEFAULT;
			case JiraissuesPackage.JIRA_ISSUE__IS_SUBTASK:
				return isIsSubtask() != IS_SUBTASK_EDEFAULT;
			case JiraissuesPackage.JIRA_ISSUE__TIME_TRACKING:
				return getTimeTracking() != null;
			case JiraissuesPackage.JIRA_ISSUE__ATTACHMENTS:
				return !getAttachments().isEmpty();
			case JiraissuesPackage.JIRA_ISSUE__PROJECT:
				return basicGetProject() != null;
			case JiraissuesPackage.JIRA_ISSUE__COMPONENTS:
				return !getComponents().isEmpty();
			case JiraissuesPackage.JIRA_ISSUE__FIELDS:
				return !getFields().isEmpty();
			case JiraissuesPackage.JIRA_ISSUE__FIX_VERSIONS:
				return !getFixVersions().isEmpty();
			case JiraissuesPackage.JIRA_ISSUE__AFFECTED_VERSIONS:
				return !getAffectedVersions().isEmpty();
			case JiraissuesPackage.JIRA_ISSUE__ISSUE_LINKS:
				return !getIssueLinks().isEmpty();
			case JiraissuesPackage.JIRA_ISSUE__WORKLOGS:
				return !getWorklogs().isEmpty();
			case JiraissuesPackage.JIRA_ISSUE__EXPANDOS:
				return !getExpandos().isEmpty();
			case JiraissuesPackage.JIRA_ISSUE__COMMENTS:
				return !getComments().isEmpty();
			case JiraissuesPackage.JIRA_ISSUE__REPORTER:
				return basicGetReporter() != null;
			case JiraissuesPackage.JIRA_ISSUE__ASSIGNEE:
				return basicGetAssignee() != null;
			case JiraissuesPackage.JIRA_ISSUE__ISSUE_TYPE:
				return getIssueType() != ISSUE_TYPE_EDEFAULT;
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
				case JiraissuesPackage.JIRA_ISSUE__CREATION_DATE: return JiraissuesPackage.UPDATABLE_ELEMENT__CREATION_DATE;
				case JiraissuesPackage.JIRA_ISSUE__UPDATE_DATE: return JiraissuesPackage.UPDATABLE_ELEMENT__UPDATE_DATE;
				default: return -1;
			}
		}
		if (baseClass == RelationObject.class) {
			switch (derivedFeatureID) {
				case JiraissuesPackage.JIRA_ISSUE__RELATIONS: return RelationsPackage.RELATION_OBJECT__RELATIONS;
				default: return -1;
			}
		}
		if (baseClass == ConflictObject.class) {
			switch (derivedFeatureID) {
				case JiraissuesPackage.JIRA_ISSUE__CONFLICTS_WITH: return RelationsPackage.CONFLICT_OBJECT__CONFLICTS_WITH;
				case JiraissuesPackage.JIRA_ISSUE__HAS_CONFLICTS: return RelationsPackage.CONFLICT_OBJECT__HAS_CONFLICTS;
				default: return -1;
			}
		}
		if (baseClass == DuplicationObject.class) {
			switch (derivedFeatureID) {
				case JiraissuesPackage.JIRA_ISSUE__DUPLICATE_OF: return RelationsPackage.DUPLICATION_OBJECT__DUPLICATE_OF;
				case JiraissuesPackage.JIRA_ISSUE__HAS_DUPLICATES: return RelationsPackage.DUPLICATION_OBJECT__HAS_DUPLICATES;
				default: return -1;
			}
		}
		if (baseClass == DependencyObject.class) {
			switch (derivedFeatureID) {
				case JiraissuesPackage.JIRA_ISSUE__DEPENDS_ON: return RelationsPackage.DEPENDENCY_OBJECT__DEPENDS_ON;
				case JiraissuesPackage.JIRA_ISSUE__HAS_DEPENDENTS: return RelationsPackage.DEPENDENCY_OBJECT__HAS_DEPENDENTS;
				default: return -1;
			}
		}
		if (baseClass == ParentalObject.class) {
			switch (derivedFeatureID) {
				case JiraissuesPackage.JIRA_ISSUE__PARENT_OF: return RelationsPackage.PARENTAL_OBJECT__PARENT_OF;
				case JiraissuesPackage.JIRA_ISSUE__SUBPART_OF: return RelationsPackage.PARENTAL_OBJECT__SUBPART_OF;
				default: return -1;
			}
		}
		if (baseClass == TriggerObject.class) {
			switch (derivedFeatureID) {
				case JiraissuesPackage.JIRA_ISSUE__TRIGGER_OF: return RelationsPackage.TRIGGER_OBJECT__TRIGGER_OF;
				case JiraissuesPackage.JIRA_ISSUE__TRIGGERED_BY: return RelationsPackage.TRIGGER_OBJECT__TRIGGERED_BY;
				default: return -1;
			}
		}
		if (baseClass == ResolveObject.class) {
			switch (derivedFeatureID) {
				case JiraissuesPackage.JIRA_ISSUE__RESOLVES: return RelationsPackage.RESOLVE_OBJECT__RESOLVES;
				case JiraissuesPackage.JIRA_ISSUE__RESOLVED_BY: return RelationsPackage.RESOLVE_OBJECT__RESOLVED_BY;
				default: return -1;
			}
		}
		if (baseClass == AlternativeObject.class) {
			switch (derivedFeatureID) {
				case JiraissuesPackage.JIRA_ISSUE__ALTERNATIVE_TO: return RelationsPackage.ALTERNATIVE_OBJECT__ALTERNATIVE_TO;
				case JiraissuesPackage.JIRA_ISSUE__HAS_ALTERNATIVES: return RelationsPackage.ALTERNATIVE_OBJECT__HAS_ALTERNATIVES;
				default: return -1;
			}
		}
		if (baseClass == CouldResolveObject.class) {
			switch (derivedFeatureID) {
				case JiraissuesPackage.JIRA_ISSUE__COULD_RESOLVE: return RelationsPackage.COULD_RESOLVE_OBJECT__COULD_RESOLVE;
				case JiraissuesPackage.JIRA_ISSUE__COULD_BE_RESOLVED_BY: return RelationsPackage.COULD_RESOLVE_OBJECT__COULD_BE_RESOLVED_BY;
				default: return -1;
			}
		}
		if (baseClass == StakeholderObject.class) {
			switch (derivedFeatureID) {
				case JiraissuesPackage.JIRA_ISSUE__STAKEHOLDER_OF: return RelationsPackage.STAKEHOLDER_OBJECT__STAKEHOLDER_OF;
				case JiraissuesPackage.JIRA_ISSUE__HAS_STAKEHOLDERS: return RelationsPackage.STAKEHOLDER_OBJECT__HAS_STAKEHOLDERS;
				default: return -1;
			}
		}
		if (baseClass == SelectionObject.class) {
			switch (derivedFeatureID) {
				case JiraissuesPackage.JIRA_ISSUE__SELECTED: return RelationsPackage.SELECTION_OBJECT__SELECTED;
				case JiraissuesPackage.JIRA_ISSUE__SELECTED_BY: return RelationsPackage.SELECTION_OBJECT__SELECTED_BY;
				default: return -1;
			}
		}
		if (baseClass == TraceableObject.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Issue.class) {
			switch (derivedFeatureID) {
				case JiraissuesPackage.JIRA_ISSUE__SUMMARY: return IssuesPackage.ISSUE__SUMMARY;
				case JiraissuesPackage.JIRA_ISSUE__DESCRIPTION: return IssuesPackage.ISSUE__DESCRIPTION;
				case JiraissuesPackage.JIRA_ISSUE__STATUS: return IssuesPackage.ISSUE__STATUS;
				case JiraissuesPackage.JIRA_ISSUE__PRIORITY: return IssuesPackage.ISSUE__PRIORITY;
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
				case JiraissuesPackage.UPDATABLE_ELEMENT__CREATION_DATE: return JiraissuesPackage.JIRA_ISSUE__CREATION_DATE;
				case JiraissuesPackage.UPDATABLE_ELEMENT__UPDATE_DATE: return JiraissuesPackage.JIRA_ISSUE__UPDATE_DATE;
				default: return -1;
			}
		}
		if (baseClass == RelationObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.RELATION_OBJECT__RELATIONS: return JiraissuesPackage.JIRA_ISSUE__RELATIONS;
				default: return -1;
			}
		}
		if (baseClass == ConflictObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.CONFLICT_OBJECT__CONFLICTS_WITH: return JiraissuesPackage.JIRA_ISSUE__CONFLICTS_WITH;
				case RelationsPackage.CONFLICT_OBJECT__HAS_CONFLICTS: return JiraissuesPackage.JIRA_ISSUE__HAS_CONFLICTS;
				default: return -1;
			}
		}
		if (baseClass == DuplicationObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.DUPLICATION_OBJECT__DUPLICATE_OF: return JiraissuesPackage.JIRA_ISSUE__DUPLICATE_OF;
				case RelationsPackage.DUPLICATION_OBJECT__HAS_DUPLICATES: return JiraissuesPackage.JIRA_ISSUE__HAS_DUPLICATES;
				default: return -1;
			}
		}
		if (baseClass == DependencyObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.DEPENDENCY_OBJECT__DEPENDS_ON: return JiraissuesPackage.JIRA_ISSUE__DEPENDS_ON;
				case RelationsPackage.DEPENDENCY_OBJECT__HAS_DEPENDENTS: return JiraissuesPackage.JIRA_ISSUE__HAS_DEPENDENTS;
				default: return -1;
			}
		}
		if (baseClass == ParentalObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.PARENTAL_OBJECT__PARENT_OF: return JiraissuesPackage.JIRA_ISSUE__PARENT_OF;
				case RelationsPackage.PARENTAL_OBJECT__SUBPART_OF: return JiraissuesPackage.JIRA_ISSUE__SUBPART_OF;
				default: return -1;
			}
		}
		if (baseClass == TriggerObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.TRIGGER_OBJECT__TRIGGER_OF: return JiraissuesPackage.JIRA_ISSUE__TRIGGER_OF;
				case RelationsPackage.TRIGGER_OBJECT__TRIGGERED_BY: return JiraissuesPackage.JIRA_ISSUE__TRIGGERED_BY;
				default: return -1;
			}
		}
		if (baseClass == ResolveObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.RESOLVE_OBJECT__RESOLVES: return JiraissuesPackage.JIRA_ISSUE__RESOLVES;
				case RelationsPackage.RESOLVE_OBJECT__RESOLVED_BY: return JiraissuesPackage.JIRA_ISSUE__RESOLVED_BY;
				default: return -1;
			}
		}
		if (baseClass == AlternativeObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.ALTERNATIVE_OBJECT__ALTERNATIVE_TO: return JiraissuesPackage.JIRA_ISSUE__ALTERNATIVE_TO;
				case RelationsPackage.ALTERNATIVE_OBJECT__HAS_ALTERNATIVES: return JiraissuesPackage.JIRA_ISSUE__HAS_ALTERNATIVES;
				default: return -1;
			}
		}
		if (baseClass == CouldResolveObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.COULD_RESOLVE_OBJECT__COULD_RESOLVE: return JiraissuesPackage.JIRA_ISSUE__COULD_RESOLVE;
				case RelationsPackage.COULD_RESOLVE_OBJECT__COULD_BE_RESOLVED_BY: return JiraissuesPackage.JIRA_ISSUE__COULD_BE_RESOLVED_BY;
				default: return -1;
			}
		}
		if (baseClass == StakeholderObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.STAKEHOLDER_OBJECT__STAKEHOLDER_OF: return JiraissuesPackage.JIRA_ISSUE__STAKEHOLDER_OF;
				case RelationsPackage.STAKEHOLDER_OBJECT__HAS_STAKEHOLDERS: return JiraissuesPackage.JIRA_ISSUE__HAS_STAKEHOLDERS;
				default: return -1;
			}
		}
		if (baseClass == SelectionObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.SELECTION_OBJECT__SELECTED: return JiraissuesPackage.JIRA_ISSUE__SELECTED;
				case RelationsPackage.SELECTION_OBJECT__SELECTED_BY: return JiraissuesPackage.JIRA_ISSUE__SELECTED_BY;
				default: return -1;
			}
		}
		if (baseClass == TraceableObject.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Issue.class) {
			switch (baseFeatureID) {
				case IssuesPackage.ISSUE__SUMMARY: return JiraissuesPackage.JIRA_ISSUE__SUMMARY;
				case IssuesPackage.ISSUE__DESCRIPTION: return JiraissuesPackage.JIRA_ISSUE__DESCRIPTION;
				case IssuesPackage.ISSUE__STATUS: return JiraissuesPackage.JIRA_ISSUE__STATUS;
				case IssuesPackage.ISSUE__PRIORITY: return JiraissuesPackage.JIRA_ISSUE__PRIORITY;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //JiraIssueImpl
