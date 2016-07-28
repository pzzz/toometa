/**
 */
package edu.kit.ipd.sdq.toometa.relations;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stakeholder Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.relations.StakeholderObject#getStakeholderOf <em>Stakeholder Of</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.relations.StakeholderObject#getHasStakeholders <em>Has Stakeholders</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.relations.RelationsPackage#getStakeholderObject()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface StakeholderObject extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Stakeholder Of</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.relations.StakeholderObject}.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.toometa.relations.StakeholderObject#getHasStakeholders <em>Has Stakeholders</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stakeholder Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stakeholder Of</em>' reference list.
	 * @see edu.kit.ipd.sdq.toometa.relations.RelationsPackage#getStakeholderObject_StakeholderOf()
	 * @see edu.kit.ipd.sdq.toometa.relations.StakeholderObject#getHasStakeholders
	 * @model opposite="hasStakeholders"
	 * @generated
	 */
	EList<StakeholderObject> getStakeholderOf();

	/**
	 * Returns the value of the '<em><b>Has Stakeholders</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.relations.StakeholderObject}.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.toometa.relations.StakeholderObject#getStakeholderOf <em>Stakeholder Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Stakeholders</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Stakeholders</em>' reference list.
	 * @see edu.kit.ipd.sdq.toometa.relations.RelationsPackage#getStakeholderObject_HasStakeholders()
	 * @see edu.kit.ipd.sdq.toometa.relations.StakeholderObject#getStakeholderOf
	 * @model opposite="stakeholderOf"
	 * @generated
	 */
	EList<StakeholderObject> getHasStakeholders();

} // StakeholderObject
