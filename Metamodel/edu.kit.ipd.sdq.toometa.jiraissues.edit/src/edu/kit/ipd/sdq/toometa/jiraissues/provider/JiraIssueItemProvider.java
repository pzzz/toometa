/**
 */
package edu.kit.ipd.sdq.toometa.jiraissues.provider;


import edu.kit.ipd.sdq.toometa.issues.IssuesPackage;

import edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue;
import edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesFactory;
import edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage;

import edu.kit.ipd.sdq.toometa.relations.RelationsFactory;
import edu.kit.ipd.sdq.toometa.relations.RelationsPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JiraIssueItemProvider extends AddressableElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JiraIssueItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addCreationDatePropertyDescriptor(object);
			addUpdateDatePropertyDescriptor(object);
			addConflictsWithPropertyDescriptor(object);
			addHasConflictsPropertyDescriptor(object);
			addDuplicateOfPropertyDescriptor(object);
			addHasDuplicatesPropertyDescriptor(object);
			addDependsOnPropertyDescriptor(object);
			addHasDependentsPropertyDescriptor(object);
			addParentOfPropertyDescriptor(object);
			addSubpartOfPropertyDescriptor(object);
			addTriggerOfPropertyDescriptor(object);
			addTriggeredByPropertyDescriptor(object);
			addResolvesPropertyDescriptor(object);
			addResolvedByPropertyDescriptor(object);
			addAlternativeToPropertyDescriptor(object);
			addHasAlternativesPropertyDescriptor(object);
			addCouldResolvePropertyDescriptor(object);
			addCouldBeResolvedByPropertyDescriptor(object);
			addStakeholderOfPropertyDescriptor(object);
			addHasStakeholdersPropertyDescriptor(object);
			addSelectedPropertyDescriptor(object);
			addSelectedByPropertyDescriptor(object);
			addSummaryPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addStatusPropertyDescriptor(object);
			addPriorityPropertyDescriptor(object);
			addKeyPropertyDescriptor(object);
			addTransitionsUriPropertyDescriptor(object);
			addResolutionPropertyDescriptor(object);
			addVotesPropertyDescriptor(object);
			addNumWatchersPropertyDescriptor(object);
			addIsSubtaskPropertyDescriptor(object);
			addProjectPropertyDescriptor(object);
			addComponentsPropertyDescriptor(object);
			addFixVersionsPropertyDescriptor(object);
			addAffectedVersionsPropertyDescriptor(object);
			addExpandosPropertyDescriptor(object);
			addReporterPropertyDescriptor(object);
			addAssigneePropertyDescriptor(object);
			addIssueTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Creation Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreationDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UpdatableElement_creationDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UpdatableElement_creationDate_feature", "_UI_UpdatableElement_type"),
				 JiraissuesPackage.Literals.UPDATABLE_ELEMENT__CREATION_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Update Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpdateDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UpdatableElement_updateDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UpdatableElement_updateDate_feature", "_UI_UpdatableElement_type"),
				 JiraissuesPackage.Literals.UPDATABLE_ELEMENT__UPDATE_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Conflicts With feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConflictsWithPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConflictObject_conflictsWith_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConflictObject_conflictsWith_feature", "_UI_ConflictObject_type"),
				 RelationsPackage.Literals.CONFLICT_OBJECT__CONFLICTS_WITH,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Conflicts feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasConflictsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConflictObject_hasConflicts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConflictObject_hasConflicts_feature", "_UI_ConflictObject_type"),
				 RelationsPackage.Literals.CONFLICT_OBJECT__HAS_CONFLICTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Duplicate Of feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDuplicateOfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DuplicationObject_duplicateOf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DuplicationObject_duplicateOf_feature", "_UI_DuplicationObject_type"),
				 RelationsPackage.Literals.DUPLICATION_OBJECT__DUPLICATE_OF,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Duplicates feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasDuplicatesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DuplicationObject_hasDuplicates_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DuplicationObject_hasDuplicates_feature", "_UI_DuplicationObject_type"),
				 RelationsPackage.Literals.DUPLICATION_OBJECT__HAS_DUPLICATES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Depends On feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDependsOnPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DependencyObject_dependsOn_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DependencyObject_dependsOn_feature", "_UI_DependencyObject_type"),
				 RelationsPackage.Literals.DEPENDENCY_OBJECT__DEPENDS_ON,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Dependents feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasDependentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DependencyObject_hasDependents_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DependencyObject_hasDependents_feature", "_UI_DependencyObject_type"),
				 RelationsPackage.Literals.DEPENDENCY_OBJECT__HAS_DEPENDENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parent Of feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentOfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ParentalObject_parentOf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ParentalObject_parentOf_feature", "_UI_ParentalObject_type"),
				 RelationsPackage.Literals.PARENTAL_OBJECT__PARENT_OF,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Subpart Of feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubpartOfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ParentalObject_subpartOf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ParentalObject_subpartOf_feature", "_UI_ParentalObject_type"),
				 RelationsPackage.Literals.PARENTAL_OBJECT__SUBPART_OF,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Trigger Of feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTriggerOfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TriggerObject_triggerOf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TriggerObject_triggerOf_feature", "_UI_TriggerObject_type"),
				 RelationsPackage.Literals.TRIGGER_OBJECT__TRIGGER_OF,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Triggered By feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTriggeredByPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TriggerObject_triggeredBy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TriggerObject_triggeredBy_feature", "_UI_TriggerObject_type"),
				 RelationsPackage.Literals.TRIGGER_OBJECT__TRIGGERED_BY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resolves feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResolvesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResolveObject_resolves_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResolveObject_resolves_feature", "_UI_ResolveObject_type"),
				 RelationsPackage.Literals.RESOLVE_OBJECT__RESOLVES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resolved By feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResolvedByPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResolveObject_resolvedBy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResolveObject_resolvedBy_feature", "_UI_ResolveObject_type"),
				 RelationsPackage.Literals.RESOLVE_OBJECT__RESOLVED_BY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Alternative To feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAlternativeToPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AlternativeObject_alternativeTo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AlternativeObject_alternativeTo_feature", "_UI_AlternativeObject_type"),
				 RelationsPackage.Literals.ALTERNATIVE_OBJECT__ALTERNATIVE_TO,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Alternatives feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasAlternativesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AlternativeObject_hasAlternatives_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AlternativeObject_hasAlternatives_feature", "_UI_AlternativeObject_type"),
				 RelationsPackage.Literals.ALTERNATIVE_OBJECT__HAS_ALTERNATIVES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Could Resolve feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCouldResolvePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CouldResolveObject_couldResolve_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CouldResolveObject_couldResolve_feature", "_UI_CouldResolveObject_type"),
				 RelationsPackage.Literals.COULD_RESOLVE_OBJECT__COULD_RESOLVE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Could Be Resolved By feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCouldBeResolvedByPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CouldResolveObject_couldBeResolvedBy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CouldResolveObject_couldBeResolvedBy_feature", "_UI_CouldResolveObject_type"),
				 RelationsPackage.Literals.COULD_RESOLVE_OBJECT__COULD_BE_RESOLVED_BY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Stakeholder Of feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStakeholderOfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_StakeholderObject_stakeholderOf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_StakeholderObject_stakeholderOf_feature", "_UI_StakeholderObject_type"),
				 RelationsPackage.Literals.STAKEHOLDER_OBJECT__STAKEHOLDER_OF,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Stakeholders feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasStakeholdersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_StakeholderObject_hasStakeholders_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_StakeholderObject_hasStakeholders_feature", "_UI_StakeholderObject_type"),
				 RelationsPackage.Literals.STAKEHOLDER_OBJECT__HAS_STAKEHOLDERS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Selected feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SelectionObject_selected_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SelectionObject_selected_feature", "_UI_SelectionObject_type"),
				 RelationsPackage.Literals.SELECTION_OBJECT__SELECTED,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Selected By feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectedByPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SelectionObject_selectedBy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SelectionObject_selectedBy_feature", "_UI_SelectionObject_type"),
				 RelationsPackage.Literals.SELECTION_OBJECT__SELECTED_BY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Summary feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSummaryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Issue_summary_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Issue_summary_feature", "_UI_Issue_type"),
				 IssuesPackage.Literals.ISSUE__SUMMARY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Issue_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Issue_description_feature", "_UI_Issue_type"),
				 IssuesPackage.Literals.ISSUE__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Issue_status_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Issue_status_feature", "_UI_Issue_type"),
				 IssuesPackage.Literals.ISSUE__STATUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Priority feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPriorityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Issue_priority_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Issue_priority_feature", "_UI_Issue_type"),
				 IssuesPackage.Literals.ISSUE__PRIORITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JiraIssue_key_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JiraIssue_key_feature", "_UI_JiraIssue_type"),
				 JiraissuesPackage.Literals.JIRA_ISSUE__KEY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transitions Uri feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransitionsUriPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JiraIssue_transitionsUri_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JiraIssue_transitionsUri_feature", "_UI_JiraIssue_type"),
				 JiraissuesPackage.Literals.JIRA_ISSUE__TRANSITIONS_URI,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resolution feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResolutionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JiraIssue_resolution_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JiraIssue_resolution_feature", "_UI_JiraIssue_type"),
				 JiraissuesPackage.Literals.JIRA_ISSUE__RESOLUTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Votes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVotesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JiraIssue_votes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JiraIssue_votes_feature", "_UI_JiraIssue_type"),
				 JiraissuesPackage.Literals.JIRA_ISSUE__VOTES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Num Watchers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumWatchersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JiraIssue_numWatchers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JiraIssue_numWatchers_feature", "_UI_JiraIssue_type"),
				 JiraissuesPackage.Literals.JIRA_ISSUE__NUM_WATCHERS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Subtask feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsSubtaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JiraIssue_isSubtask_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JiraIssue_isSubtask_feature", "_UI_JiraIssue_type"),
				 JiraissuesPackage.Literals.JIRA_ISSUE__IS_SUBTASK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Project feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProjectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JiraIssue_project_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JiraIssue_project_feature", "_UI_JiraIssue_type"),
				 JiraissuesPackage.Literals.JIRA_ISSUE__PROJECT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Components feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComponentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JiraIssue_components_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JiraIssue_components_feature", "_UI_JiraIssue_type"),
				 JiraissuesPackage.Literals.JIRA_ISSUE__COMPONENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fix Versions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFixVersionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JiraIssue_fixVersions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JiraIssue_fixVersions_feature", "_UI_JiraIssue_type"),
				 JiraissuesPackage.Literals.JIRA_ISSUE__FIX_VERSIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Affected Versions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAffectedVersionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JiraIssue_affectedVersions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JiraIssue_affectedVersions_feature", "_UI_JiraIssue_type"),
				 JiraissuesPackage.Literals.JIRA_ISSUE__AFFECTED_VERSIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Expandos feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExpandosPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JiraIssue_expandos_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JiraIssue_expandos_feature", "_UI_JiraIssue_type"),
				 JiraissuesPackage.Literals.JIRA_ISSUE__EXPANDOS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reporter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReporterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JiraIssue_reporter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JiraIssue_reporter_feature", "_UI_JiraIssue_type"),
				 JiraissuesPackage.Literals.JIRA_ISSUE__REPORTER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Assignee feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssigneePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JiraIssue_assignee_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JiraIssue_assignee_feature", "_UI_JiraIssue_type"),
				 JiraissuesPackage.Literals.JIRA_ISSUE__ASSIGNEE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Issue Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIssueTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JiraIssue_issueType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JiraIssue_issueType_feature", "_UI_JiraIssue_type"),
				 JiraissuesPackage.Literals.JIRA_ISSUE__ISSUE_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(RelationsPackage.Literals.RELATION_OBJECT__RELATIONS);
			childrenFeatures.add(JiraissuesPackage.Literals.JIRA_ISSUE__TIME_TRACKING);
			childrenFeatures.add(JiraissuesPackage.Literals.JIRA_ISSUE__ATTACHMENTS);
			childrenFeatures.add(JiraissuesPackage.Literals.JIRA_ISSUE__FIELDS);
			childrenFeatures.add(JiraissuesPackage.Literals.JIRA_ISSUE__ISSUE_LINKS);
			childrenFeatures.add(JiraissuesPackage.Literals.JIRA_ISSUE__WORKLOGS);
			childrenFeatures.add(JiraissuesPackage.Literals.JIRA_ISSUE__COMMENTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns JiraIssue.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/JiraIssue"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((JiraIssue)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_JiraIssue_type") :
			getString("_UI_JiraIssue_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(JiraIssue.class)) {
			case JiraissuesPackage.JIRA_ISSUE__CREATION_DATE:
			case JiraissuesPackage.JIRA_ISSUE__UPDATE_DATE:
			case JiraissuesPackage.JIRA_ISSUE__SUMMARY:
			case JiraissuesPackage.JIRA_ISSUE__DESCRIPTION:
			case JiraissuesPackage.JIRA_ISSUE__STATUS:
			case JiraissuesPackage.JIRA_ISSUE__PRIORITY:
			case JiraissuesPackage.JIRA_ISSUE__KEY:
			case JiraissuesPackage.JIRA_ISSUE__TRANSITIONS_URI:
			case JiraissuesPackage.JIRA_ISSUE__RESOLUTION:
			case JiraissuesPackage.JIRA_ISSUE__VOTES:
			case JiraissuesPackage.JIRA_ISSUE__NUM_WATCHERS:
			case JiraissuesPackage.JIRA_ISSUE__IS_SUBTASK:
			case JiraissuesPackage.JIRA_ISSUE__EXPANDOS:
			case JiraissuesPackage.JIRA_ISSUE__ISSUE_TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case JiraissuesPackage.JIRA_ISSUE__RELATIONS:
			case JiraissuesPackage.JIRA_ISSUE__TIME_TRACKING:
			case JiraissuesPackage.JIRA_ISSUE__ATTACHMENTS:
			case JiraissuesPackage.JIRA_ISSUE__FIELDS:
			case JiraissuesPackage.JIRA_ISSUE__ISSUE_LINKS:
			case JiraissuesPackage.JIRA_ISSUE__WORKLOGS:
			case JiraissuesPackage.JIRA_ISSUE__COMMENTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(RelationsPackage.Literals.RELATION_OBJECT__RELATIONS,
				 RelationsFactory.eINSTANCE.createRelation()));

		newChildDescriptors.add
			(createChildParameter
				(JiraissuesPackage.Literals.JIRA_ISSUE__TIME_TRACKING,
				 JiraissuesFactory.eINSTANCE.createTimeTracking()));

		newChildDescriptors.add
			(createChildParameter
				(JiraissuesPackage.Literals.JIRA_ISSUE__ATTACHMENTS,
				 JiraissuesFactory.eINSTANCE.createAttachment()));

		newChildDescriptors.add
			(createChildParameter
				(JiraissuesPackage.Literals.JIRA_ISSUE__FIELDS,
				 JiraissuesFactory.eINSTANCE.createField()));

		newChildDescriptors.add
			(createChildParameter
				(JiraissuesPackage.Literals.JIRA_ISSUE__ISSUE_LINKS,
				 JiraissuesFactory.eINSTANCE.createJiraLink()));

		newChildDescriptors.add
			(createChildParameter
				(JiraissuesPackage.Literals.JIRA_ISSUE__WORKLOGS,
				 JiraissuesFactory.eINSTANCE.createWorklog()));

		newChildDescriptors.add
			(createChildParameter
				(JiraissuesPackage.Literals.JIRA_ISSUE__COMMENTS,
				 JiraissuesFactory.eINSTANCE.createComment()));
	}

}
