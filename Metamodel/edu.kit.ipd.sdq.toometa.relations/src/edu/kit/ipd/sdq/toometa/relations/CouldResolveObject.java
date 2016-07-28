/**
 */
package edu.kit.ipd.sdq.toometa.relations;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Could Resolve Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.relations.CouldResolveObject#getCouldResolve <em>Could Resolve</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.relations.CouldResolveObject#getCouldBeResolvedBy <em>Could Be Resolved By</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.relations.RelationsPackage#getCouldResolveObject()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface CouldResolveObject extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Could Resolve</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.relations.CouldResolveObject}.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.toometa.relations.CouldResolveObject#getCouldBeResolvedBy <em>Could Be Resolved By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Could Resolve</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Could Resolve</em>' reference list.
	 * @see edu.kit.ipd.sdq.toometa.relations.RelationsPackage#getCouldResolveObject_CouldResolve()
	 * @see edu.kit.ipd.sdq.toometa.relations.CouldResolveObject#getCouldBeResolvedBy
	 * @model opposite="couldBeResolvedBy"
	 * @generated
	 */
	EList<CouldResolveObject> getCouldResolve();

	/**
	 * Returns the value of the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.relations.CouldResolveObject}.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.toometa.relations.CouldResolveObject#getCouldResolve <em>Could Resolve</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Could Be Resolved By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Could Be Resolved By</em>' reference list.
	 * @see edu.kit.ipd.sdq.toometa.relations.RelationsPackage#getCouldResolveObject_CouldBeResolvedBy()
	 * @see edu.kit.ipd.sdq.toometa.relations.CouldResolveObject#getCouldResolve
	 * @model opposite="couldResolve"
	 * @generated
	 */
	EList<CouldResolveObject> getCouldBeResolvedBy();

} // CouldResolveObject
