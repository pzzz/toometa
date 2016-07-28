/**
 */
package edu.kit.ipd.sdq.toometa.issues.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import edu.kit.ipd.sdq.toometa.issues.Issue;
import edu.kit.ipd.sdq.toometa.issues.IssuePriorityEnum;
import edu.kit.ipd.sdq.toometa.issues.IssueStatusEnum;
import edu.kit.ipd.sdq.toometa.issues.IssuesPackage;

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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Issue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.issues.impl.IssueImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.issues.impl.IssueImpl#getConflictsWith <em>Conflicts With</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.issues.impl.IssueImpl#getHasConflicts <em>Has Conflicts</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.issues.impl.IssueImpl#getDuplicateOf <em>Duplicate Of</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.issues.impl.IssueImpl#getHasDuplicates <em>Has Duplicates</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.issues.impl.IssueImpl#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.issues.impl.IssueImpl#getHasDependents <em>Has Dependents</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.issues.impl.IssueImpl#getParentOf <em>Parent Of</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.issues.impl.IssueImpl#getSubpartOf <em>Subpart Of</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.issues.impl.IssueImpl#getTriggerOf <em>Trigger Of</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.issues.impl.IssueImpl#getTriggeredBy <em>Triggered By</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.issues.impl.IssueImpl#getResolves <em>Resolves</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.issues.impl.IssueImpl#getResolvedBy <em>Resolved By</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.issues.impl.IssueImpl#getAlternativeTo <em>Alternative To</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.issues.impl.IssueImpl#getHasAlternatives <em>Has Alternatives</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.issues.impl.IssueImpl#getCouldResolve <em>Could Resolve</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.issues.impl.IssueImpl#getCouldBeResolvedBy <em>Could Be Resolved By</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.issues.impl.IssueImpl#getStakeholderOf <em>Stakeholder Of</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.issues.impl.IssueImpl#getHasStakeholders <em>Has Stakeholders</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.issues.impl.IssueImpl#getSelected <em>Selected</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.issues.impl.IssueImpl#getSelectedBy <em>Selected By</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.issues.impl.IssueImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.issues.impl.IssueImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.issues.impl.IssueImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.issues.impl.IssueImpl#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class IssueImpl extends IdentifierImpl implements Issue {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IssueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IssuesPackage.Literals.ISSUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Relation> getRelations() {
		return (EList<Relation>)eDynamicGet(IssuesPackage.ISSUE__RELATIONS, RelationsPackage.Literals.RELATION_OBJECT__RELATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ConflictObject> getConflictsWith() {
		return (EList<ConflictObject>)eDynamicGet(IssuesPackage.ISSUE__CONFLICTS_WITH, RelationsPackage.Literals.CONFLICT_OBJECT__CONFLICTS_WITH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ConflictObject> getHasConflicts() {
		return (EList<ConflictObject>)eDynamicGet(IssuesPackage.ISSUE__HAS_CONFLICTS, RelationsPackage.Literals.CONFLICT_OBJECT__HAS_CONFLICTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DuplicationObject> getDuplicateOf() {
		return (EList<DuplicationObject>)eDynamicGet(IssuesPackage.ISSUE__DUPLICATE_OF, RelationsPackage.Literals.DUPLICATION_OBJECT__DUPLICATE_OF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DuplicationObject> getHasDuplicates() {
		return (EList<DuplicationObject>)eDynamicGet(IssuesPackage.ISSUE__HAS_DUPLICATES, RelationsPackage.Literals.DUPLICATION_OBJECT__HAS_DUPLICATES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DependencyObject> getDependsOn() {
		return (EList<DependencyObject>)eDynamicGet(IssuesPackage.ISSUE__DEPENDS_ON, RelationsPackage.Literals.DEPENDENCY_OBJECT__DEPENDS_ON, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DependencyObject> getHasDependents() {
		return (EList<DependencyObject>)eDynamicGet(IssuesPackage.ISSUE__HAS_DEPENDENTS, RelationsPackage.Literals.DEPENDENCY_OBJECT__HAS_DEPENDENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ParentalObject> getParentOf() {
		return (EList<ParentalObject>)eDynamicGet(IssuesPackage.ISSUE__PARENT_OF, RelationsPackage.Literals.PARENTAL_OBJECT__PARENT_OF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ParentalObject> getSubpartOf() {
		return (EList<ParentalObject>)eDynamicGet(IssuesPackage.ISSUE__SUBPART_OF, RelationsPackage.Literals.PARENTAL_OBJECT__SUBPART_OF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TriggerObject> getTriggerOf() {
		return (EList<TriggerObject>)eDynamicGet(IssuesPackage.ISSUE__TRIGGER_OF, RelationsPackage.Literals.TRIGGER_OBJECT__TRIGGER_OF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TriggerObject> getTriggeredBy() {
		return (EList<TriggerObject>)eDynamicGet(IssuesPackage.ISSUE__TRIGGERED_BY, RelationsPackage.Literals.TRIGGER_OBJECT__TRIGGERED_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ResolveObject> getResolves() {
		return (EList<ResolveObject>)eDynamicGet(IssuesPackage.ISSUE__RESOLVES, RelationsPackage.Literals.RESOLVE_OBJECT__RESOLVES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ResolveObject> getResolvedBy() {
		return (EList<ResolveObject>)eDynamicGet(IssuesPackage.ISSUE__RESOLVED_BY, RelationsPackage.Literals.RESOLVE_OBJECT__RESOLVED_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AlternativeObject> getAlternativeTo() {
		return (EList<AlternativeObject>)eDynamicGet(IssuesPackage.ISSUE__ALTERNATIVE_TO, RelationsPackage.Literals.ALTERNATIVE_OBJECT__ALTERNATIVE_TO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AlternativeObject> getHasAlternatives() {
		return (EList<AlternativeObject>)eDynamicGet(IssuesPackage.ISSUE__HAS_ALTERNATIVES, RelationsPackage.Literals.ALTERNATIVE_OBJECT__HAS_ALTERNATIVES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CouldResolveObject> getCouldResolve() {
		return (EList<CouldResolveObject>)eDynamicGet(IssuesPackage.ISSUE__COULD_RESOLVE, RelationsPackage.Literals.COULD_RESOLVE_OBJECT__COULD_RESOLVE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CouldResolveObject> getCouldBeResolvedBy() {
		return (EList<CouldResolveObject>)eDynamicGet(IssuesPackage.ISSUE__COULD_BE_RESOLVED_BY, RelationsPackage.Literals.COULD_RESOLVE_OBJECT__COULD_BE_RESOLVED_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<StakeholderObject> getStakeholderOf() {
		return (EList<StakeholderObject>)eDynamicGet(IssuesPackage.ISSUE__STAKEHOLDER_OF, RelationsPackage.Literals.STAKEHOLDER_OBJECT__STAKEHOLDER_OF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<StakeholderObject> getHasStakeholders() {
		return (EList<StakeholderObject>)eDynamicGet(IssuesPackage.ISSUE__HAS_STAKEHOLDERS, RelationsPackage.Literals.STAKEHOLDER_OBJECT__HAS_STAKEHOLDERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SelectionObject> getSelected() {
		return (EList<SelectionObject>)eDynamicGet(IssuesPackage.ISSUE__SELECTED, RelationsPackage.Literals.SELECTION_OBJECT__SELECTED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SelectionObject> getSelectedBy() {
		return (EList<SelectionObject>)eDynamicGet(IssuesPackage.ISSUE__SELECTED_BY, RelationsPackage.Literals.SELECTION_OBJECT__SELECTED_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSummary() {
		return (String)eDynamicGet(IssuesPackage.ISSUE__SUMMARY, IssuesPackage.Literals.ISSUE__SUMMARY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSummary(String newSummary) {
		eDynamicSet(IssuesPackage.ISSUE__SUMMARY, IssuesPackage.Literals.ISSUE__SUMMARY, newSummary);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eDynamicGet(IssuesPackage.ISSUE__DESCRIPTION, IssuesPackage.Literals.ISSUE__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eDynamicSet(IssuesPackage.ISSUE__DESCRIPTION, IssuesPackage.Literals.ISSUE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueStatusEnum getStatus() {
		return (IssueStatusEnum)eDynamicGet(IssuesPackage.ISSUE__STATUS, IssuesPackage.Literals.ISSUE__STATUS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(IssueStatusEnum newStatus) {
		eDynamicSet(IssuesPackage.ISSUE__STATUS, IssuesPackage.Literals.ISSUE__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssuePriorityEnum getPriority() {
		return (IssuePriorityEnum)eDynamicGet(IssuesPackage.ISSUE__PRIORITY, IssuesPackage.Literals.ISSUE__PRIORITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(IssuePriorityEnum newPriority) {
		eDynamicSet(IssuesPackage.ISSUE__PRIORITY, IssuesPackage.Literals.ISSUE__PRIORITY, newPriority);
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
			case IssuesPackage.ISSUE__CONFLICTS_WITH:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConflictsWith()).basicAdd(otherEnd, msgs);
			case IssuesPackage.ISSUE__HAS_CONFLICTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasConflicts()).basicAdd(otherEnd, msgs);
			case IssuesPackage.ISSUE__DUPLICATE_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDuplicateOf()).basicAdd(otherEnd, msgs);
			case IssuesPackage.ISSUE__HAS_DUPLICATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasDuplicates()).basicAdd(otherEnd, msgs);
			case IssuesPackage.ISSUE__DEPENDS_ON:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDependsOn()).basicAdd(otherEnd, msgs);
			case IssuesPackage.ISSUE__HAS_DEPENDENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasDependents()).basicAdd(otherEnd, msgs);
			case IssuesPackage.ISSUE__PARENT_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParentOf()).basicAdd(otherEnd, msgs);
			case IssuesPackage.ISSUE__SUBPART_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubpartOf()).basicAdd(otherEnd, msgs);
			case IssuesPackage.ISSUE__TRIGGER_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTriggerOf()).basicAdd(otherEnd, msgs);
			case IssuesPackage.ISSUE__TRIGGERED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTriggeredBy()).basicAdd(otherEnd, msgs);
			case IssuesPackage.ISSUE__RESOLVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResolves()).basicAdd(otherEnd, msgs);
			case IssuesPackage.ISSUE__RESOLVED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResolvedBy()).basicAdd(otherEnd, msgs);
			case IssuesPackage.ISSUE__ALTERNATIVE_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAlternativeTo()).basicAdd(otherEnd, msgs);
			case IssuesPackage.ISSUE__HAS_ALTERNATIVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasAlternatives()).basicAdd(otherEnd, msgs);
			case IssuesPackage.ISSUE__COULD_RESOLVE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCouldResolve()).basicAdd(otherEnd, msgs);
			case IssuesPackage.ISSUE__COULD_BE_RESOLVED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCouldBeResolvedBy()).basicAdd(otherEnd, msgs);
			case IssuesPackage.ISSUE__STAKEHOLDER_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStakeholderOf()).basicAdd(otherEnd, msgs);
			case IssuesPackage.ISSUE__HAS_STAKEHOLDERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasStakeholders()).basicAdd(otherEnd, msgs);
			case IssuesPackage.ISSUE__SELECTED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSelected()).basicAdd(otherEnd, msgs);
			case IssuesPackage.ISSUE__SELECTED_BY:
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
			case IssuesPackage.ISSUE__RELATIONS:
				return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
			case IssuesPackage.ISSUE__CONFLICTS_WITH:
				return ((InternalEList<?>)getConflictsWith()).basicRemove(otherEnd, msgs);
			case IssuesPackage.ISSUE__HAS_CONFLICTS:
				return ((InternalEList<?>)getHasConflicts()).basicRemove(otherEnd, msgs);
			case IssuesPackage.ISSUE__DUPLICATE_OF:
				return ((InternalEList<?>)getDuplicateOf()).basicRemove(otherEnd, msgs);
			case IssuesPackage.ISSUE__HAS_DUPLICATES:
				return ((InternalEList<?>)getHasDuplicates()).basicRemove(otherEnd, msgs);
			case IssuesPackage.ISSUE__DEPENDS_ON:
				return ((InternalEList<?>)getDependsOn()).basicRemove(otherEnd, msgs);
			case IssuesPackage.ISSUE__HAS_DEPENDENTS:
				return ((InternalEList<?>)getHasDependents()).basicRemove(otherEnd, msgs);
			case IssuesPackage.ISSUE__PARENT_OF:
				return ((InternalEList<?>)getParentOf()).basicRemove(otherEnd, msgs);
			case IssuesPackage.ISSUE__SUBPART_OF:
				return ((InternalEList<?>)getSubpartOf()).basicRemove(otherEnd, msgs);
			case IssuesPackage.ISSUE__TRIGGER_OF:
				return ((InternalEList<?>)getTriggerOf()).basicRemove(otherEnd, msgs);
			case IssuesPackage.ISSUE__TRIGGERED_BY:
				return ((InternalEList<?>)getTriggeredBy()).basicRemove(otherEnd, msgs);
			case IssuesPackage.ISSUE__RESOLVES:
				return ((InternalEList<?>)getResolves()).basicRemove(otherEnd, msgs);
			case IssuesPackage.ISSUE__RESOLVED_BY:
				return ((InternalEList<?>)getResolvedBy()).basicRemove(otherEnd, msgs);
			case IssuesPackage.ISSUE__ALTERNATIVE_TO:
				return ((InternalEList<?>)getAlternativeTo()).basicRemove(otherEnd, msgs);
			case IssuesPackage.ISSUE__HAS_ALTERNATIVES:
				return ((InternalEList<?>)getHasAlternatives()).basicRemove(otherEnd, msgs);
			case IssuesPackage.ISSUE__COULD_RESOLVE:
				return ((InternalEList<?>)getCouldResolve()).basicRemove(otherEnd, msgs);
			case IssuesPackage.ISSUE__COULD_BE_RESOLVED_BY:
				return ((InternalEList<?>)getCouldBeResolvedBy()).basicRemove(otherEnd, msgs);
			case IssuesPackage.ISSUE__STAKEHOLDER_OF:
				return ((InternalEList<?>)getStakeholderOf()).basicRemove(otherEnd, msgs);
			case IssuesPackage.ISSUE__HAS_STAKEHOLDERS:
				return ((InternalEList<?>)getHasStakeholders()).basicRemove(otherEnd, msgs);
			case IssuesPackage.ISSUE__SELECTED:
				return ((InternalEList<?>)getSelected()).basicRemove(otherEnd, msgs);
			case IssuesPackage.ISSUE__SELECTED_BY:
				return ((InternalEList<?>)getSelectedBy()).basicRemove(otherEnd, msgs);
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
			case IssuesPackage.ISSUE__RELATIONS:
				return getRelations();
			case IssuesPackage.ISSUE__CONFLICTS_WITH:
				return getConflictsWith();
			case IssuesPackage.ISSUE__HAS_CONFLICTS:
				return getHasConflicts();
			case IssuesPackage.ISSUE__DUPLICATE_OF:
				return getDuplicateOf();
			case IssuesPackage.ISSUE__HAS_DUPLICATES:
				return getHasDuplicates();
			case IssuesPackage.ISSUE__DEPENDS_ON:
				return getDependsOn();
			case IssuesPackage.ISSUE__HAS_DEPENDENTS:
				return getHasDependents();
			case IssuesPackage.ISSUE__PARENT_OF:
				return getParentOf();
			case IssuesPackage.ISSUE__SUBPART_OF:
				return getSubpartOf();
			case IssuesPackage.ISSUE__TRIGGER_OF:
				return getTriggerOf();
			case IssuesPackage.ISSUE__TRIGGERED_BY:
				return getTriggeredBy();
			case IssuesPackage.ISSUE__RESOLVES:
				return getResolves();
			case IssuesPackage.ISSUE__RESOLVED_BY:
				return getResolvedBy();
			case IssuesPackage.ISSUE__ALTERNATIVE_TO:
				return getAlternativeTo();
			case IssuesPackage.ISSUE__HAS_ALTERNATIVES:
				return getHasAlternatives();
			case IssuesPackage.ISSUE__COULD_RESOLVE:
				return getCouldResolve();
			case IssuesPackage.ISSUE__COULD_BE_RESOLVED_BY:
				return getCouldBeResolvedBy();
			case IssuesPackage.ISSUE__STAKEHOLDER_OF:
				return getStakeholderOf();
			case IssuesPackage.ISSUE__HAS_STAKEHOLDERS:
				return getHasStakeholders();
			case IssuesPackage.ISSUE__SELECTED:
				return getSelected();
			case IssuesPackage.ISSUE__SELECTED_BY:
				return getSelectedBy();
			case IssuesPackage.ISSUE__SUMMARY:
				return getSummary();
			case IssuesPackage.ISSUE__DESCRIPTION:
				return getDescription();
			case IssuesPackage.ISSUE__STATUS:
				return getStatus();
			case IssuesPackage.ISSUE__PRIORITY:
				return getPriority();
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
			case IssuesPackage.ISSUE__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends Relation>)newValue);
				return;
			case IssuesPackage.ISSUE__CONFLICTS_WITH:
				getConflictsWith().clear();
				getConflictsWith().addAll((Collection<? extends ConflictObject>)newValue);
				return;
			case IssuesPackage.ISSUE__HAS_CONFLICTS:
				getHasConflicts().clear();
				getHasConflicts().addAll((Collection<? extends ConflictObject>)newValue);
				return;
			case IssuesPackage.ISSUE__DUPLICATE_OF:
				getDuplicateOf().clear();
				getDuplicateOf().addAll((Collection<? extends DuplicationObject>)newValue);
				return;
			case IssuesPackage.ISSUE__HAS_DUPLICATES:
				getHasDuplicates().clear();
				getHasDuplicates().addAll((Collection<? extends DuplicationObject>)newValue);
				return;
			case IssuesPackage.ISSUE__DEPENDS_ON:
				getDependsOn().clear();
				getDependsOn().addAll((Collection<? extends DependencyObject>)newValue);
				return;
			case IssuesPackage.ISSUE__HAS_DEPENDENTS:
				getHasDependents().clear();
				getHasDependents().addAll((Collection<? extends DependencyObject>)newValue);
				return;
			case IssuesPackage.ISSUE__PARENT_OF:
				getParentOf().clear();
				getParentOf().addAll((Collection<? extends ParentalObject>)newValue);
				return;
			case IssuesPackage.ISSUE__SUBPART_OF:
				getSubpartOf().clear();
				getSubpartOf().addAll((Collection<? extends ParentalObject>)newValue);
				return;
			case IssuesPackage.ISSUE__TRIGGER_OF:
				getTriggerOf().clear();
				getTriggerOf().addAll((Collection<? extends TriggerObject>)newValue);
				return;
			case IssuesPackage.ISSUE__TRIGGERED_BY:
				getTriggeredBy().clear();
				getTriggeredBy().addAll((Collection<? extends TriggerObject>)newValue);
				return;
			case IssuesPackage.ISSUE__RESOLVES:
				getResolves().clear();
				getResolves().addAll((Collection<? extends ResolveObject>)newValue);
				return;
			case IssuesPackage.ISSUE__RESOLVED_BY:
				getResolvedBy().clear();
				getResolvedBy().addAll((Collection<? extends ResolveObject>)newValue);
				return;
			case IssuesPackage.ISSUE__ALTERNATIVE_TO:
				getAlternativeTo().clear();
				getAlternativeTo().addAll((Collection<? extends AlternativeObject>)newValue);
				return;
			case IssuesPackage.ISSUE__HAS_ALTERNATIVES:
				getHasAlternatives().clear();
				getHasAlternatives().addAll((Collection<? extends AlternativeObject>)newValue);
				return;
			case IssuesPackage.ISSUE__COULD_RESOLVE:
				getCouldResolve().clear();
				getCouldResolve().addAll((Collection<? extends CouldResolveObject>)newValue);
				return;
			case IssuesPackage.ISSUE__COULD_BE_RESOLVED_BY:
				getCouldBeResolvedBy().clear();
				getCouldBeResolvedBy().addAll((Collection<? extends CouldResolveObject>)newValue);
				return;
			case IssuesPackage.ISSUE__STAKEHOLDER_OF:
				getStakeholderOf().clear();
				getStakeholderOf().addAll((Collection<? extends StakeholderObject>)newValue);
				return;
			case IssuesPackage.ISSUE__HAS_STAKEHOLDERS:
				getHasStakeholders().clear();
				getHasStakeholders().addAll((Collection<? extends StakeholderObject>)newValue);
				return;
			case IssuesPackage.ISSUE__SELECTED:
				getSelected().clear();
				getSelected().addAll((Collection<? extends SelectionObject>)newValue);
				return;
			case IssuesPackage.ISSUE__SELECTED_BY:
				getSelectedBy().clear();
				getSelectedBy().addAll((Collection<? extends SelectionObject>)newValue);
				return;
			case IssuesPackage.ISSUE__SUMMARY:
				setSummary((String)newValue);
				return;
			case IssuesPackage.ISSUE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case IssuesPackage.ISSUE__STATUS:
				setStatus((IssueStatusEnum)newValue);
				return;
			case IssuesPackage.ISSUE__PRIORITY:
				setPriority((IssuePriorityEnum)newValue);
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
			case IssuesPackage.ISSUE__RELATIONS:
				getRelations().clear();
				return;
			case IssuesPackage.ISSUE__CONFLICTS_WITH:
				getConflictsWith().clear();
				return;
			case IssuesPackage.ISSUE__HAS_CONFLICTS:
				getHasConflicts().clear();
				return;
			case IssuesPackage.ISSUE__DUPLICATE_OF:
				getDuplicateOf().clear();
				return;
			case IssuesPackage.ISSUE__HAS_DUPLICATES:
				getHasDuplicates().clear();
				return;
			case IssuesPackage.ISSUE__DEPENDS_ON:
				getDependsOn().clear();
				return;
			case IssuesPackage.ISSUE__HAS_DEPENDENTS:
				getHasDependents().clear();
				return;
			case IssuesPackage.ISSUE__PARENT_OF:
				getParentOf().clear();
				return;
			case IssuesPackage.ISSUE__SUBPART_OF:
				getSubpartOf().clear();
				return;
			case IssuesPackage.ISSUE__TRIGGER_OF:
				getTriggerOf().clear();
				return;
			case IssuesPackage.ISSUE__TRIGGERED_BY:
				getTriggeredBy().clear();
				return;
			case IssuesPackage.ISSUE__RESOLVES:
				getResolves().clear();
				return;
			case IssuesPackage.ISSUE__RESOLVED_BY:
				getResolvedBy().clear();
				return;
			case IssuesPackage.ISSUE__ALTERNATIVE_TO:
				getAlternativeTo().clear();
				return;
			case IssuesPackage.ISSUE__HAS_ALTERNATIVES:
				getHasAlternatives().clear();
				return;
			case IssuesPackage.ISSUE__COULD_RESOLVE:
				getCouldResolve().clear();
				return;
			case IssuesPackage.ISSUE__COULD_BE_RESOLVED_BY:
				getCouldBeResolvedBy().clear();
				return;
			case IssuesPackage.ISSUE__STAKEHOLDER_OF:
				getStakeholderOf().clear();
				return;
			case IssuesPackage.ISSUE__HAS_STAKEHOLDERS:
				getHasStakeholders().clear();
				return;
			case IssuesPackage.ISSUE__SELECTED:
				getSelected().clear();
				return;
			case IssuesPackage.ISSUE__SELECTED_BY:
				getSelectedBy().clear();
				return;
			case IssuesPackage.ISSUE__SUMMARY:
				setSummary(SUMMARY_EDEFAULT);
				return;
			case IssuesPackage.ISSUE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case IssuesPackage.ISSUE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case IssuesPackage.ISSUE__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
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
			case IssuesPackage.ISSUE__RELATIONS:
				return !getRelations().isEmpty();
			case IssuesPackage.ISSUE__CONFLICTS_WITH:
				return !getConflictsWith().isEmpty();
			case IssuesPackage.ISSUE__HAS_CONFLICTS:
				return !getHasConflicts().isEmpty();
			case IssuesPackage.ISSUE__DUPLICATE_OF:
				return !getDuplicateOf().isEmpty();
			case IssuesPackage.ISSUE__HAS_DUPLICATES:
				return !getHasDuplicates().isEmpty();
			case IssuesPackage.ISSUE__DEPENDS_ON:
				return !getDependsOn().isEmpty();
			case IssuesPackage.ISSUE__HAS_DEPENDENTS:
				return !getHasDependents().isEmpty();
			case IssuesPackage.ISSUE__PARENT_OF:
				return !getParentOf().isEmpty();
			case IssuesPackage.ISSUE__SUBPART_OF:
				return !getSubpartOf().isEmpty();
			case IssuesPackage.ISSUE__TRIGGER_OF:
				return !getTriggerOf().isEmpty();
			case IssuesPackage.ISSUE__TRIGGERED_BY:
				return !getTriggeredBy().isEmpty();
			case IssuesPackage.ISSUE__RESOLVES:
				return !getResolves().isEmpty();
			case IssuesPackage.ISSUE__RESOLVED_BY:
				return !getResolvedBy().isEmpty();
			case IssuesPackage.ISSUE__ALTERNATIVE_TO:
				return !getAlternativeTo().isEmpty();
			case IssuesPackage.ISSUE__HAS_ALTERNATIVES:
				return !getHasAlternatives().isEmpty();
			case IssuesPackage.ISSUE__COULD_RESOLVE:
				return !getCouldResolve().isEmpty();
			case IssuesPackage.ISSUE__COULD_BE_RESOLVED_BY:
				return !getCouldBeResolvedBy().isEmpty();
			case IssuesPackage.ISSUE__STAKEHOLDER_OF:
				return !getStakeholderOf().isEmpty();
			case IssuesPackage.ISSUE__HAS_STAKEHOLDERS:
				return !getHasStakeholders().isEmpty();
			case IssuesPackage.ISSUE__SELECTED:
				return !getSelected().isEmpty();
			case IssuesPackage.ISSUE__SELECTED_BY:
				return !getSelectedBy().isEmpty();
			case IssuesPackage.ISSUE__SUMMARY:
				return SUMMARY_EDEFAULT == null ? getSummary() != null : !SUMMARY_EDEFAULT.equals(getSummary());
			case IssuesPackage.ISSUE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case IssuesPackage.ISSUE__STATUS:
				return getStatus() != STATUS_EDEFAULT;
			case IssuesPackage.ISSUE__PRIORITY:
				return getPriority() != PRIORITY_EDEFAULT;
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
		if (baseClass == RelationObject.class) {
			switch (derivedFeatureID) {
				case IssuesPackage.ISSUE__RELATIONS: return RelationsPackage.RELATION_OBJECT__RELATIONS;
				default: return -1;
			}
		}
		if (baseClass == ConflictObject.class) {
			switch (derivedFeatureID) {
				case IssuesPackage.ISSUE__CONFLICTS_WITH: return RelationsPackage.CONFLICT_OBJECT__CONFLICTS_WITH;
				case IssuesPackage.ISSUE__HAS_CONFLICTS: return RelationsPackage.CONFLICT_OBJECT__HAS_CONFLICTS;
				default: return -1;
			}
		}
		if (baseClass == DuplicationObject.class) {
			switch (derivedFeatureID) {
				case IssuesPackage.ISSUE__DUPLICATE_OF: return RelationsPackage.DUPLICATION_OBJECT__DUPLICATE_OF;
				case IssuesPackage.ISSUE__HAS_DUPLICATES: return RelationsPackage.DUPLICATION_OBJECT__HAS_DUPLICATES;
				default: return -1;
			}
		}
		if (baseClass == DependencyObject.class) {
			switch (derivedFeatureID) {
				case IssuesPackage.ISSUE__DEPENDS_ON: return RelationsPackage.DEPENDENCY_OBJECT__DEPENDS_ON;
				case IssuesPackage.ISSUE__HAS_DEPENDENTS: return RelationsPackage.DEPENDENCY_OBJECT__HAS_DEPENDENTS;
				default: return -1;
			}
		}
		if (baseClass == ParentalObject.class) {
			switch (derivedFeatureID) {
				case IssuesPackage.ISSUE__PARENT_OF: return RelationsPackage.PARENTAL_OBJECT__PARENT_OF;
				case IssuesPackage.ISSUE__SUBPART_OF: return RelationsPackage.PARENTAL_OBJECT__SUBPART_OF;
				default: return -1;
			}
		}
		if (baseClass == TriggerObject.class) {
			switch (derivedFeatureID) {
				case IssuesPackage.ISSUE__TRIGGER_OF: return RelationsPackage.TRIGGER_OBJECT__TRIGGER_OF;
				case IssuesPackage.ISSUE__TRIGGERED_BY: return RelationsPackage.TRIGGER_OBJECT__TRIGGERED_BY;
				default: return -1;
			}
		}
		if (baseClass == ResolveObject.class) {
			switch (derivedFeatureID) {
				case IssuesPackage.ISSUE__RESOLVES: return RelationsPackage.RESOLVE_OBJECT__RESOLVES;
				case IssuesPackage.ISSUE__RESOLVED_BY: return RelationsPackage.RESOLVE_OBJECT__RESOLVED_BY;
				default: return -1;
			}
		}
		if (baseClass == AlternativeObject.class) {
			switch (derivedFeatureID) {
				case IssuesPackage.ISSUE__ALTERNATIVE_TO: return RelationsPackage.ALTERNATIVE_OBJECT__ALTERNATIVE_TO;
				case IssuesPackage.ISSUE__HAS_ALTERNATIVES: return RelationsPackage.ALTERNATIVE_OBJECT__HAS_ALTERNATIVES;
				default: return -1;
			}
		}
		if (baseClass == CouldResolveObject.class) {
			switch (derivedFeatureID) {
				case IssuesPackage.ISSUE__COULD_RESOLVE: return RelationsPackage.COULD_RESOLVE_OBJECT__COULD_RESOLVE;
				case IssuesPackage.ISSUE__COULD_BE_RESOLVED_BY: return RelationsPackage.COULD_RESOLVE_OBJECT__COULD_BE_RESOLVED_BY;
				default: return -1;
			}
		}
		if (baseClass == StakeholderObject.class) {
			switch (derivedFeatureID) {
				case IssuesPackage.ISSUE__STAKEHOLDER_OF: return RelationsPackage.STAKEHOLDER_OBJECT__STAKEHOLDER_OF;
				case IssuesPackage.ISSUE__HAS_STAKEHOLDERS: return RelationsPackage.STAKEHOLDER_OBJECT__HAS_STAKEHOLDERS;
				default: return -1;
			}
		}
		if (baseClass == SelectionObject.class) {
			switch (derivedFeatureID) {
				case IssuesPackage.ISSUE__SELECTED: return RelationsPackage.SELECTION_OBJECT__SELECTED;
				case IssuesPackage.ISSUE__SELECTED_BY: return RelationsPackage.SELECTION_OBJECT__SELECTED_BY;
				default: return -1;
			}
		}
		if (baseClass == TraceableObject.class) {
			switch (derivedFeatureID) {
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
		if (baseClass == RelationObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.RELATION_OBJECT__RELATIONS: return IssuesPackage.ISSUE__RELATIONS;
				default: return -1;
			}
		}
		if (baseClass == ConflictObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.CONFLICT_OBJECT__CONFLICTS_WITH: return IssuesPackage.ISSUE__CONFLICTS_WITH;
				case RelationsPackage.CONFLICT_OBJECT__HAS_CONFLICTS: return IssuesPackage.ISSUE__HAS_CONFLICTS;
				default: return -1;
			}
		}
		if (baseClass == DuplicationObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.DUPLICATION_OBJECT__DUPLICATE_OF: return IssuesPackage.ISSUE__DUPLICATE_OF;
				case RelationsPackage.DUPLICATION_OBJECT__HAS_DUPLICATES: return IssuesPackage.ISSUE__HAS_DUPLICATES;
				default: return -1;
			}
		}
		if (baseClass == DependencyObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.DEPENDENCY_OBJECT__DEPENDS_ON: return IssuesPackage.ISSUE__DEPENDS_ON;
				case RelationsPackage.DEPENDENCY_OBJECT__HAS_DEPENDENTS: return IssuesPackage.ISSUE__HAS_DEPENDENTS;
				default: return -1;
			}
		}
		if (baseClass == ParentalObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.PARENTAL_OBJECT__PARENT_OF: return IssuesPackage.ISSUE__PARENT_OF;
				case RelationsPackage.PARENTAL_OBJECT__SUBPART_OF: return IssuesPackage.ISSUE__SUBPART_OF;
				default: return -1;
			}
		}
		if (baseClass == TriggerObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.TRIGGER_OBJECT__TRIGGER_OF: return IssuesPackage.ISSUE__TRIGGER_OF;
				case RelationsPackage.TRIGGER_OBJECT__TRIGGERED_BY: return IssuesPackage.ISSUE__TRIGGERED_BY;
				default: return -1;
			}
		}
		if (baseClass == ResolveObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.RESOLVE_OBJECT__RESOLVES: return IssuesPackage.ISSUE__RESOLVES;
				case RelationsPackage.RESOLVE_OBJECT__RESOLVED_BY: return IssuesPackage.ISSUE__RESOLVED_BY;
				default: return -1;
			}
		}
		if (baseClass == AlternativeObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.ALTERNATIVE_OBJECT__ALTERNATIVE_TO: return IssuesPackage.ISSUE__ALTERNATIVE_TO;
				case RelationsPackage.ALTERNATIVE_OBJECT__HAS_ALTERNATIVES: return IssuesPackage.ISSUE__HAS_ALTERNATIVES;
				default: return -1;
			}
		}
		if (baseClass == CouldResolveObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.COULD_RESOLVE_OBJECT__COULD_RESOLVE: return IssuesPackage.ISSUE__COULD_RESOLVE;
				case RelationsPackage.COULD_RESOLVE_OBJECT__COULD_BE_RESOLVED_BY: return IssuesPackage.ISSUE__COULD_BE_RESOLVED_BY;
				default: return -1;
			}
		}
		if (baseClass == StakeholderObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.STAKEHOLDER_OBJECT__STAKEHOLDER_OF: return IssuesPackage.ISSUE__STAKEHOLDER_OF;
				case RelationsPackage.STAKEHOLDER_OBJECT__HAS_STAKEHOLDERS: return IssuesPackage.ISSUE__HAS_STAKEHOLDERS;
				default: return -1;
			}
		}
		if (baseClass == SelectionObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.SELECTION_OBJECT__SELECTED: return IssuesPackage.ISSUE__SELECTED;
				case RelationsPackage.SELECTION_OBJECT__SELECTED_BY: return IssuesPackage.ISSUE__SELECTED_BY;
				default: return -1;
			}
		}
		if (baseClass == TraceableObject.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //IssueImpl
