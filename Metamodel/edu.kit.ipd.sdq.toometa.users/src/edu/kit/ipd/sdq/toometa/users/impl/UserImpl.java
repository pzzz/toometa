/**
 */
package edu.kit.ipd.sdq.toometa.users.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

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

import edu.kit.ipd.sdq.toometa.users.RoleType;
import edu.kit.ipd.sdq.toometa.users.User;
import edu.kit.ipd.sdq.toometa.users.UsersPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.users.impl.UserImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.users.impl.UserImpl#getConflictsWith <em>Conflicts With</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.users.impl.UserImpl#getHasConflicts <em>Has Conflicts</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.users.impl.UserImpl#getDuplicateOf <em>Duplicate Of</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.users.impl.UserImpl#getHasDuplicates <em>Has Duplicates</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.users.impl.UserImpl#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.users.impl.UserImpl#getHasDependents <em>Has Dependents</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.users.impl.UserImpl#getParentOf <em>Parent Of</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.users.impl.UserImpl#getSubpartOf <em>Subpart Of</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.users.impl.UserImpl#getTriggerOf <em>Trigger Of</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.users.impl.UserImpl#getTriggeredBy <em>Triggered By</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.users.impl.UserImpl#getResolves <em>Resolves</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.users.impl.UserImpl#getResolvedBy <em>Resolved By</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.users.impl.UserImpl#getAlternativeTo <em>Alternative To</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.users.impl.UserImpl#getHasAlternatives <em>Has Alternatives</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.users.impl.UserImpl#getCouldResolve <em>Could Resolve</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.users.impl.UserImpl#getCouldBeResolvedBy <em>Could Be Resolved By</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.users.impl.UserImpl#getStakeholderOf <em>Stakeholder Of</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.users.impl.UserImpl#getHasStakeholders <em>Has Stakeholders</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.users.impl.UserImpl#getSelected <em>Selected</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.users.impl.UserImpl#getSelectedBy <em>Selected By</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.users.impl.UserImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.users.impl.UserImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserImpl extends IdentifierImpl implements User {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsersPackage.Literals.USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Relation> getRelations() {
		return (EList<Relation>)eDynamicGet(UsersPackage.USER__RELATIONS, RelationsPackage.Literals.RELATION_OBJECT__RELATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ConflictObject> getConflictsWith() {
		return (EList<ConflictObject>)eDynamicGet(UsersPackage.USER__CONFLICTS_WITH, RelationsPackage.Literals.CONFLICT_OBJECT__CONFLICTS_WITH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ConflictObject> getHasConflicts() {
		return (EList<ConflictObject>)eDynamicGet(UsersPackage.USER__HAS_CONFLICTS, RelationsPackage.Literals.CONFLICT_OBJECT__HAS_CONFLICTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DuplicationObject> getDuplicateOf() {
		return (EList<DuplicationObject>)eDynamicGet(UsersPackage.USER__DUPLICATE_OF, RelationsPackage.Literals.DUPLICATION_OBJECT__DUPLICATE_OF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DuplicationObject> getHasDuplicates() {
		return (EList<DuplicationObject>)eDynamicGet(UsersPackage.USER__HAS_DUPLICATES, RelationsPackage.Literals.DUPLICATION_OBJECT__HAS_DUPLICATES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DependencyObject> getDependsOn() {
		return (EList<DependencyObject>)eDynamicGet(UsersPackage.USER__DEPENDS_ON, RelationsPackage.Literals.DEPENDENCY_OBJECT__DEPENDS_ON, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DependencyObject> getHasDependents() {
		return (EList<DependencyObject>)eDynamicGet(UsersPackage.USER__HAS_DEPENDENTS, RelationsPackage.Literals.DEPENDENCY_OBJECT__HAS_DEPENDENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ParentalObject> getParentOf() {
		return (EList<ParentalObject>)eDynamicGet(UsersPackage.USER__PARENT_OF, RelationsPackage.Literals.PARENTAL_OBJECT__PARENT_OF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ParentalObject> getSubpartOf() {
		return (EList<ParentalObject>)eDynamicGet(UsersPackage.USER__SUBPART_OF, RelationsPackage.Literals.PARENTAL_OBJECT__SUBPART_OF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TriggerObject> getTriggerOf() {
		return (EList<TriggerObject>)eDynamicGet(UsersPackage.USER__TRIGGER_OF, RelationsPackage.Literals.TRIGGER_OBJECT__TRIGGER_OF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TriggerObject> getTriggeredBy() {
		return (EList<TriggerObject>)eDynamicGet(UsersPackage.USER__TRIGGERED_BY, RelationsPackage.Literals.TRIGGER_OBJECT__TRIGGERED_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ResolveObject> getResolves() {
		return (EList<ResolveObject>)eDynamicGet(UsersPackage.USER__RESOLVES, RelationsPackage.Literals.RESOLVE_OBJECT__RESOLVES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ResolveObject> getResolvedBy() {
		return (EList<ResolveObject>)eDynamicGet(UsersPackage.USER__RESOLVED_BY, RelationsPackage.Literals.RESOLVE_OBJECT__RESOLVED_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AlternativeObject> getAlternativeTo() {
		return (EList<AlternativeObject>)eDynamicGet(UsersPackage.USER__ALTERNATIVE_TO, RelationsPackage.Literals.ALTERNATIVE_OBJECT__ALTERNATIVE_TO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AlternativeObject> getHasAlternatives() {
		return (EList<AlternativeObject>)eDynamicGet(UsersPackage.USER__HAS_ALTERNATIVES, RelationsPackage.Literals.ALTERNATIVE_OBJECT__HAS_ALTERNATIVES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CouldResolveObject> getCouldResolve() {
		return (EList<CouldResolveObject>)eDynamicGet(UsersPackage.USER__COULD_RESOLVE, RelationsPackage.Literals.COULD_RESOLVE_OBJECT__COULD_RESOLVE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CouldResolveObject> getCouldBeResolvedBy() {
		return (EList<CouldResolveObject>)eDynamicGet(UsersPackage.USER__COULD_BE_RESOLVED_BY, RelationsPackage.Literals.COULD_RESOLVE_OBJECT__COULD_BE_RESOLVED_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<StakeholderObject> getStakeholderOf() {
		return (EList<StakeholderObject>)eDynamicGet(UsersPackage.USER__STAKEHOLDER_OF, RelationsPackage.Literals.STAKEHOLDER_OBJECT__STAKEHOLDER_OF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<StakeholderObject> getHasStakeholders() {
		return (EList<StakeholderObject>)eDynamicGet(UsersPackage.USER__HAS_STAKEHOLDERS, RelationsPackage.Literals.STAKEHOLDER_OBJECT__HAS_STAKEHOLDERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SelectionObject> getSelected() {
		return (EList<SelectionObject>)eDynamicGet(UsersPackage.USER__SELECTED, RelationsPackage.Literals.SELECTION_OBJECT__SELECTED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SelectionObject> getSelectedBy() {
		return (EList<SelectionObject>)eDynamicGet(UsersPackage.USER__SELECTED_BY, RelationsPackage.Literals.SELECTION_OBJECT__SELECTED_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<RoleType> getRoles() {
		return (EList<RoleType>)eDynamicGet(UsersPackage.USER__ROLES, UsersPackage.Literals.USER__ROLES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(UsersPackage.USER__NAME, UsersPackage.Literals.USER__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(UsersPackage.USER__NAME, UsersPackage.Literals.USER__NAME, newName);
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
			case UsersPackage.USER__CONFLICTS_WITH:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConflictsWith()).basicAdd(otherEnd, msgs);
			case UsersPackage.USER__HAS_CONFLICTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasConflicts()).basicAdd(otherEnd, msgs);
			case UsersPackage.USER__DUPLICATE_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDuplicateOf()).basicAdd(otherEnd, msgs);
			case UsersPackage.USER__HAS_DUPLICATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasDuplicates()).basicAdd(otherEnd, msgs);
			case UsersPackage.USER__DEPENDS_ON:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDependsOn()).basicAdd(otherEnd, msgs);
			case UsersPackage.USER__HAS_DEPENDENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasDependents()).basicAdd(otherEnd, msgs);
			case UsersPackage.USER__PARENT_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParentOf()).basicAdd(otherEnd, msgs);
			case UsersPackage.USER__SUBPART_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubpartOf()).basicAdd(otherEnd, msgs);
			case UsersPackage.USER__TRIGGER_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTriggerOf()).basicAdd(otherEnd, msgs);
			case UsersPackage.USER__TRIGGERED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTriggeredBy()).basicAdd(otherEnd, msgs);
			case UsersPackage.USER__RESOLVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResolves()).basicAdd(otherEnd, msgs);
			case UsersPackage.USER__RESOLVED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResolvedBy()).basicAdd(otherEnd, msgs);
			case UsersPackage.USER__ALTERNATIVE_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAlternativeTo()).basicAdd(otherEnd, msgs);
			case UsersPackage.USER__HAS_ALTERNATIVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasAlternatives()).basicAdd(otherEnd, msgs);
			case UsersPackage.USER__COULD_RESOLVE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCouldResolve()).basicAdd(otherEnd, msgs);
			case UsersPackage.USER__COULD_BE_RESOLVED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCouldBeResolvedBy()).basicAdd(otherEnd, msgs);
			case UsersPackage.USER__STAKEHOLDER_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStakeholderOf()).basicAdd(otherEnd, msgs);
			case UsersPackage.USER__HAS_STAKEHOLDERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasStakeholders()).basicAdd(otherEnd, msgs);
			case UsersPackage.USER__SELECTED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSelected()).basicAdd(otherEnd, msgs);
			case UsersPackage.USER__SELECTED_BY:
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
			case UsersPackage.USER__RELATIONS:
				return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
			case UsersPackage.USER__CONFLICTS_WITH:
				return ((InternalEList<?>)getConflictsWith()).basicRemove(otherEnd, msgs);
			case UsersPackage.USER__HAS_CONFLICTS:
				return ((InternalEList<?>)getHasConflicts()).basicRemove(otherEnd, msgs);
			case UsersPackage.USER__DUPLICATE_OF:
				return ((InternalEList<?>)getDuplicateOf()).basicRemove(otherEnd, msgs);
			case UsersPackage.USER__HAS_DUPLICATES:
				return ((InternalEList<?>)getHasDuplicates()).basicRemove(otherEnd, msgs);
			case UsersPackage.USER__DEPENDS_ON:
				return ((InternalEList<?>)getDependsOn()).basicRemove(otherEnd, msgs);
			case UsersPackage.USER__HAS_DEPENDENTS:
				return ((InternalEList<?>)getHasDependents()).basicRemove(otherEnd, msgs);
			case UsersPackage.USER__PARENT_OF:
				return ((InternalEList<?>)getParentOf()).basicRemove(otherEnd, msgs);
			case UsersPackage.USER__SUBPART_OF:
				return ((InternalEList<?>)getSubpartOf()).basicRemove(otherEnd, msgs);
			case UsersPackage.USER__TRIGGER_OF:
				return ((InternalEList<?>)getTriggerOf()).basicRemove(otherEnd, msgs);
			case UsersPackage.USER__TRIGGERED_BY:
				return ((InternalEList<?>)getTriggeredBy()).basicRemove(otherEnd, msgs);
			case UsersPackage.USER__RESOLVES:
				return ((InternalEList<?>)getResolves()).basicRemove(otherEnd, msgs);
			case UsersPackage.USER__RESOLVED_BY:
				return ((InternalEList<?>)getResolvedBy()).basicRemove(otherEnd, msgs);
			case UsersPackage.USER__ALTERNATIVE_TO:
				return ((InternalEList<?>)getAlternativeTo()).basicRemove(otherEnd, msgs);
			case UsersPackage.USER__HAS_ALTERNATIVES:
				return ((InternalEList<?>)getHasAlternatives()).basicRemove(otherEnd, msgs);
			case UsersPackage.USER__COULD_RESOLVE:
				return ((InternalEList<?>)getCouldResolve()).basicRemove(otherEnd, msgs);
			case UsersPackage.USER__COULD_BE_RESOLVED_BY:
				return ((InternalEList<?>)getCouldBeResolvedBy()).basicRemove(otherEnd, msgs);
			case UsersPackage.USER__STAKEHOLDER_OF:
				return ((InternalEList<?>)getStakeholderOf()).basicRemove(otherEnd, msgs);
			case UsersPackage.USER__HAS_STAKEHOLDERS:
				return ((InternalEList<?>)getHasStakeholders()).basicRemove(otherEnd, msgs);
			case UsersPackage.USER__SELECTED:
				return ((InternalEList<?>)getSelected()).basicRemove(otherEnd, msgs);
			case UsersPackage.USER__SELECTED_BY:
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
			case UsersPackage.USER__RELATIONS:
				return getRelations();
			case UsersPackage.USER__CONFLICTS_WITH:
				return getConflictsWith();
			case UsersPackage.USER__HAS_CONFLICTS:
				return getHasConflicts();
			case UsersPackage.USER__DUPLICATE_OF:
				return getDuplicateOf();
			case UsersPackage.USER__HAS_DUPLICATES:
				return getHasDuplicates();
			case UsersPackage.USER__DEPENDS_ON:
				return getDependsOn();
			case UsersPackage.USER__HAS_DEPENDENTS:
				return getHasDependents();
			case UsersPackage.USER__PARENT_OF:
				return getParentOf();
			case UsersPackage.USER__SUBPART_OF:
				return getSubpartOf();
			case UsersPackage.USER__TRIGGER_OF:
				return getTriggerOf();
			case UsersPackage.USER__TRIGGERED_BY:
				return getTriggeredBy();
			case UsersPackage.USER__RESOLVES:
				return getResolves();
			case UsersPackage.USER__RESOLVED_BY:
				return getResolvedBy();
			case UsersPackage.USER__ALTERNATIVE_TO:
				return getAlternativeTo();
			case UsersPackage.USER__HAS_ALTERNATIVES:
				return getHasAlternatives();
			case UsersPackage.USER__COULD_RESOLVE:
				return getCouldResolve();
			case UsersPackage.USER__COULD_BE_RESOLVED_BY:
				return getCouldBeResolvedBy();
			case UsersPackage.USER__STAKEHOLDER_OF:
				return getStakeholderOf();
			case UsersPackage.USER__HAS_STAKEHOLDERS:
				return getHasStakeholders();
			case UsersPackage.USER__SELECTED:
				return getSelected();
			case UsersPackage.USER__SELECTED_BY:
				return getSelectedBy();
			case UsersPackage.USER__ROLES:
				return getRoles();
			case UsersPackage.USER__NAME:
				return getName();
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
			case UsersPackage.USER__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends Relation>)newValue);
				return;
			case UsersPackage.USER__CONFLICTS_WITH:
				getConflictsWith().clear();
				getConflictsWith().addAll((Collection<? extends ConflictObject>)newValue);
				return;
			case UsersPackage.USER__HAS_CONFLICTS:
				getHasConflicts().clear();
				getHasConflicts().addAll((Collection<? extends ConflictObject>)newValue);
				return;
			case UsersPackage.USER__DUPLICATE_OF:
				getDuplicateOf().clear();
				getDuplicateOf().addAll((Collection<? extends DuplicationObject>)newValue);
				return;
			case UsersPackage.USER__HAS_DUPLICATES:
				getHasDuplicates().clear();
				getHasDuplicates().addAll((Collection<? extends DuplicationObject>)newValue);
				return;
			case UsersPackage.USER__DEPENDS_ON:
				getDependsOn().clear();
				getDependsOn().addAll((Collection<? extends DependencyObject>)newValue);
				return;
			case UsersPackage.USER__HAS_DEPENDENTS:
				getHasDependents().clear();
				getHasDependents().addAll((Collection<? extends DependencyObject>)newValue);
				return;
			case UsersPackage.USER__PARENT_OF:
				getParentOf().clear();
				getParentOf().addAll((Collection<? extends ParentalObject>)newValue);
				return;
			case UsersPackage.USER__SUBPART_OF:
				getSubpartOf().clear();
				getSubpartOf().addAll((Collection<? extends ParentalObject>)newValue);
				return;
			case UsersPackage.USER__TRIGGER_OF:
				getTriggerOf().clear();
				getTriggerOf().addAll((Collection<? extends TriggerObject>)newValue);
				return;
			case UsersPackage.USER__TRIGGERED_BY:
				getTriggeredBy().clear();
				getTriggeredBy().addAll((Collection<? extends TriggerObject>)newValue);
				return;
			case UsersPackage.USER__RESOLVES:
				getResolves().clear();
				getResolves().addAll((Collection<? extends ResolveObject>)newValue);
				return;
			case UsersPackage.USER__RESOLVED_BY:
				getResolvedBy().clear();
				getResolvedBy().addAll((Collection<? extends ResolveObject>)newValue);
				return;
			case UsersPackage.USER__ALTERNATIVE_TO:
				getAlternativeTo().clear();
				getAlternativeTo().addAll((Collection<? extends AlternativeObject>)newValue);
				return;
			case UsersPackage.USER__HAS_ALTERNATIVES:
				getHasAlternatives().clear();
				getHasAlternatives().addAll((Collection<? extends AlternativeObject>)newValue);
				return;
			case UsersPackage.USER__COULD_RESOLVE:
				getCouldResolve().clear();
				getCouldResolve().addAll((Collection<? extends CouldResolveObject>)newValue);
				return;
			case UsersPackage.USER__COULD_BE_RESOLVED_BY:
				getCouldBeResolvedBy().clear();
				getCouldBeResolvedBy().addAll((Collection<? extends CouldResolveObject>)newValue);
				return;
			case UsersPackage.USER__STAKEHOLDER_OF:
				getStakeholderOf().clear();
				getStakeholderOf().addAll((Collection<? extends StakeholderObject>)newValue);
				return;
			case UsersPackage.USER__HAS_STAKEHOLDERS:
				getHasStakeholders().clear();
				getHasStakeholders().addAll((Collection<? extends StakeholderObject>)newValue);
				return;
			case UsersPackage.USER__SELECTED:
				getSelected().clear();
				getSelected().addAll((Collection<? extends SelectionObject>)newValue);
				return;
			case UsersPackage.USER__SELECTED_BY:
				getSelectedBy().clear();
				getSelectedBy().addAll((Collection<? extends SelectionObject>)newValue);
				return;
			case UsersPackage.USER__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends RoleType>)newValue);
				return;
			case UsersPackage.USER__NAME:
				setName((String)newValue);
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
			case UsersPackage.USER__RELATIONS:
				getRelations().clear();
				return;
			case UsersPackage.USER__CONFLICTS_WITH:
				getConflictsWith().clear();
				return;
			case UsersPackage.USER__HAS_CONFLICTS:
				getHasConflicts().clear();
				return;
			case UsersPackage.USER__DUPLICATE_OF:
				getDuplicateOf().clear();
				return;
			case UsersPackage.USER__HAS_DUPLICATES:
				getHasDuplicates().clear();
				return;
			case UsersPackage.USER__DEPENDS_ON:
				getDependsOn().clear();
				return;
			case UsersPackage.USER__HAS_DEPENDENTS:
				getHasDependents().clear();
				return;
			case UsersPackage.USER__PARENT_OF:
				getParentOf().clear();
				return;
			case UsersPackage.USER__SUBPART_OF:
				getSubpartOf().clear();
				return;
			case UsersPackage.USER__TRIGGER_OF:
				getTriggerOf().clear();
				return;
			case UsersPackage.USER__TRIGGERED_BY:
				getTriggeredBy().clear();
				return;
			case UsersPackage.USER__RESOLVES:
				getResolves().clear();
				return;
			case UsersPackage.USER__RESOLVED_BY:
				getResolvedBy().clear();
				return;
			case UsersPackage.USER__ALTERNATIVE_TO:
				getAlternativeTo().clear();
				return;
			case UsersPackage.USER__HAS_ALTERNATIVES:
				getHasAlternatives().clear();
				return;
			case UsersPackage.USER__COULD_RESOLVE:
				getCouldResolve().clear();
				return;
			case UsersPackage.USER__COULD_BE_RESOLVED_BY:
				getCouldBeResolvedBy().clear();
				return;
			case UsersPackage.USER__STAKEHOLDER_OF:
				getStakeholderOf().clear();
				return;
			case UsersPackage.USER__HAS_STAKEHOLDERS:
				getHasStakeholders().clear();
				return;
			case UsersPackage.USER__SELECTED:
				getSelected().clear();
				return;
			case UsersPackage.USER__SELECTED_BY:
				getSelectedBy().clear();
				return;
			case UsersPackage.USER__ROLES:
				getRoles().clear();
				return;
			case UsersPackage.USER__NAME:
				setName(NAME_EDEFAULT);
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
			case UsersPackage.USER__RELATIONS:
				return !getRelations().isEmpty();
			case UsersPackage.USER__CONFLICTS_WITH:
				return !getConflictsWith().isEmpty();
			case UsersPackage.USER__HAS_CONFLICTS:
				return !getHasConflicts().isEmpty();
			case UsersPackage.USER__DUPLICATE_OF:
				return !getDuplicateOf().isEmpty();
			case UsersPackage.USER__HAS_DUPLICATES:
				return !getHasDuplicates().isEmpty();
			case UsersPackage.USER__DEPENDS_ON:
				return !getDependsOn().isEmpty();
			case UsersPackage.USER__HAS_DEPENDENTS:
				return !getHasDependents().isEmpty();
			case UsersPackage.USER__PARENT_OF:
				return !getParentOf().isEmpty();
			case UsersPackage.USER__SUBPART_OF:
				return !getSubpartOf().isEmpty();
			case UsersPackage.USER__TRIGGER_OF:
				return !getTriggerOf().isEmpty();
			case UsersPackage.USER__TRIGGERED_BY:
				return !getTriggeredBy().isEmpty();
			case UsersPackage.USER__RESOLVES:
				return !getResolves().isEmpty();
			case UsersPackage.USER__RESOLVED_BY:
				return !getResolvedBy().isEmpty();
			case UsersPackage.USER__ALTERNATIVE_TO:
				return !getAlternativeTo().isEmpty();
			case UsersPackage.USER__HAS_ALTERNATIVES:
				return !getHasAlternatives().isEmpty();
			case UsersPackage.USER__COULD_RESOLVE:
				return !getCouldResolve().isEmpty();
			case UsersPackage.USER__COULD_BE_RESOLVED_BY:
				return !getCouldBeResolvedBy().isEmpty();
			case UsersPackage.USER__STAKEHOLDER_OF:
				return !getStakeholderOf().isEmpty();
			case UsersPackage.USER__HAS_STAKEHOLDERS:
				return !getHasStakeholders().isEmpty();
			case UsersPackage.USER__SELECTED:
				return !getSelected().isEmpty();
			case UsersPackage.USER__SELECTED_BY:
				return !getSelectedBy().isEmpty();
			case UsersPackage.USER__ROLES:
				return !getRoles().isEmpty();
			case UsersPackage.USER__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
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
				case UsersPackage.USER__RELATIONS: return RelationsPackage.RELATION_OBJECT__RELATIONS;
				default: return -1;
			}
		}
		if (baseClass == ConflictObject.class) {
			switch (derivedFeatureID) {
				case UsersPackage.USER__CONFLICTS_WITH: return RelationsPackage.CONFLICT_OBJECT__CONFLICTS_WITH;
				case UsersPackage.USER__HAS_CONFLICTS: return RelationsPackage.CONFLICT_OBJECT__HAS_CONFLICTS;
				default: return -1;
			}
		}
		if (baseClass == DuplicationObject.class) {
			switch (derivedFeatureID) {
				case UsersPackage.USER__DUPLICATE_OF: return RelationsPackage.DUPLICATION_OBJECT__DUPLICATE_OF;
				case UsersPackage.USER__HAS_DUPLICATES: return RelationsPackage.DUPLICATION_OBJECT__HAS_DUPLICATES;
				default: return -1;
			}
		}
		if (baseClass == DependencyObject.class) {
			switch (derivedFeatureID) {
				case UsersPackage.USER__DEPENDS_ON: return RelationsPackage.DEPENDENCY_OBJECT__DEPENDS_ON;
				case UsersPackage.USER__HAS_DEPENDENTS: return RelationsPackage.DEPENDENCY_OBJECT__HAS_DEPENDENTS;
				default: return -1;
			}
		}
		if (baseClass == ParentalObject.class) {
			switch (derivedFeatureID) {
				case UsersPackage.USER__PARENT_OF: return RelationsPackage.PARENTAL_OBJECT__PARENT_OF;
				case UsersPackage.USER__SUBPART_OF: return RelationsPackage.PARENTAL_OBJECT__SUBPART_OF;
				default: return -1;
			}
		}
		if (baseClass == TriggerObject.class) {
			switch (derivedFeatureID) {
				case UsersPackage.USER__TRIGGER_OF: return RelationsPackage.TRIGGER_OBJECT__TRIGGER_OF;
				case UsersPackage.USER__TRIGGERED_BY: return RelationsPackage.TRIGGER_OBJECT__TRIGGERED_BY;
				default: return -1;
			}
		}
		if (baseClass == ResolveObject.class) {
			switch (derivedFeatureID) {
				case UsersPackage.USER__RESOLVES: return RelationsPackage.RESOLVE_OBJECT__RESOLVES;
				case UsersPackage.USER__RESOLVED_BY: return RelationsPackage.RESOLVE_OBJECT__RESOLVED_BY;
				default: return -1;
			}
		}
		if (baseClass == AlternativeObject.class) {
			switch (derivedFeatureID) {
				case UsersPackage.USER__ALTERNATIVE_TO: return RelationsPackage.ALTERNATIVE_OBJECT__ALTERNATIVE_TO;
				case UsersPackage.USER__HAS_ALTERNATIVES: return RelationsPackage.ALTERNATIVE_OBJECT__HAS_ALTERNATIVES;
				default: return -1;
			}
		}
		if (baseClass == CouldResolveObject.class) {
			switch (derivedFeatureID) {
				case UsersPackage.USER__COULD_RESOLVE: return RelationsPackage.COULD_RESOLVE_OBJECT__COULD_RESOLVE;
				case UsersPackage.USER__COULD_BE_RESOLVED_BY: return RelationsPackage.COULD_RESOLVE_OBJECT__COULD_BE_RESOLVED_BY;
				default: return -1;
			}
		}
		if (baseClass == StakeholderObject.class) {
			switch (derivedFeatureID) {
				case UsersPackage.USER__STAKEHOLDER_OF: return RelationsPackage.STAKEHOLDER_OBJECT__STAKEHOLDER_OF;
				case UsersPackage.USER__HAS_STAKEHOLDERS: return RelationsPackage.STAKEHOLDER_OBJECT__HAS_STAKEHOLDERS;
				default: return -1;
			}
		}
		if (baseClass == SelectionObject.class) {
			switch (derivedFeatureID) {
				case UsersPackage.USER__SELECTED: return RelationsPackage.SELECTION_OBJECT__SELECTED;
				case UsersPackage.USER__SELECTED_BY: return RelationsPackage.SELECTION_OBJECT__SELECTED_BY;
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
				case RelationsPackage.RELATION_OBJECT__RELATIONS: return UsersPackage.USER__RELATIONS;
				default: return -1;
			}
		}
		if (baseClass == ConflictObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.CONFLICT_OBJECT__CONFLICTS_WITH: return UsersPackage.USER__CONFLICTS_WITH;
				case RelationsPackage.CONFLICT_OBJECT__HAS_CONFLICTS: return UsersPackage.USER__HAS_CONFLICTS;
				default: return -1;
			}
		}
		if (baseClass == DuplicationObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.DUPLICATION_OBJECT__DUPLICATE_OF: return UsersPackage.USER__DUPLICATE_OF;
				case RelationsPackage.DUPLICATION_OBJECT__HAS_DUPLICATES: return UsersPackage.USER__HAS_DUPLICATES;
				default: return -1;
			}
		}
		if (baseClass == DependencyObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.DEPENDENCY_OBJECT__DEPENDS_ON: return UsersPackage.USER__DEPENDS_ON;
				case RelationsPackage.DEPENDENCY_OBJECT__HAS_DEPENDENTS: return UsersPackage.USER__HAS_DEPENDENTS;
				default: return -1;
			}
		}
		if (baseClass == ParentalObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.PARENTAL_OBJECT__PARENT_OF: return UsersPackage.USER__PARENT_OF;
				case RelationsPackage.PARENTAL_OBJECT__SUBPART_OF: return UsersPackage.USER__SUBPART_OF;
				default: return -1;
			}
		}
		if (baseClass == TriggerObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.TRIGGER_OBJECT__TRIGGER_OF: return UsersPackage.USER__TRIGGER_OF;
				case RelationsPackage.TRIGGER_OBJECT__TRIGGERED_BY: return UsersPackage.USER__TRIGGERED_BY;
				default: return -1;
			}
		}
		if (baseClass == ResolveObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.RESOLVE_OBJECT__RESOLVES: return UsersPackage.USER__RESOLVES;
				case RelationsPackage.RESOLVE_OBJECT__RESOLVED_BY: return UsersPackage.USER__RESOLVED_BY;
				default: return -1;
			}
		}
		if (baseClass == AlternativeObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.ALTERNATIVE_OBJECT__ALTERNATIVE_TO: return UsersPackage.USER__ALTERNATIVE_TO;
				case RelationsPackage.ALTERNATIVE_OBJECT__HAS_ALTERNATIVES: return UsersPackage.USER__HAS_ALTERNATIVES;
				default: return -1;
			}
		}
		if (baseClass == CouldResolveObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.COULD_RESOLVE_OBJECT__COULD_RESOLVE: return UsersPackage.USER__COULD_RESOLVE;
				case RelationsPackage.COULD_RESOLVE_OBJECT__COULD_BE_RESOLVED_BY: return UsersPackage.USER__COULD_BE_RESOLVED_BY;
				default: return -1;
			}
		}
		if (baseClass == StakeholderObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.STAKEHOLDER_OBJECT__STAKEHOLDER_OF: return UsersPackage.USER__STAKEHOLDER_OF;
				case RelationsPackage.STAKEHOLDER_OBJECT__HAS_STAKEHOLDERS: return UsersPackage.USER__HAS_STAKEHOLDERS;
				default: return -1;
			}
		}
		if (baseClass == SelectionObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.SELECTION_OBJECT__SELECTED: return UsersPackage.USER__SELECTED;
				case RelationsPackage.SELECTION_OBJECT__SELECTED_BY: return UsersPackage.USER__SELECTED_BY;
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

} //UserImpl
