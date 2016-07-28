/**
 */
package edu.kit.ipd.sdq.toometa.relations;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resolve Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.relations.ResolveObject#getResolves <em>Resolves</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.relations.ResolveObject#getResolvedBy <em>Resolved By</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.relations.RelationsPackage#getResolveObject()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface ResolveObject extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Resolves</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.relations.ResolveObject}.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.toometa.relations.ResolveObject#getResolvedBy <em>Resolved By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolves</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolves</em>' reference list.
	 * @see edu.kit.ipd.sdq.toometa.relations.RelationsPackage#getResolveObject_Resolves()
	 * @see edu.kit.ipd.sdq.toometa.relations.ResolveObject#getResolvedBy
	 * @model opposite="resolvedBy"
	 * @generated
	 */
	EList<ResolveObject> getResolves();

	/**
	 * Returns the value of the '<em><b>Resolved By</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.relations.ResolveObject}.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.toometa.relations.ResolveObject#getResolves <em>Resolves</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolved By</em>' reference list.
	 * @see edu.kit.ipd.sdq.toometa.relations.RelationsPackage#getResolveObject_ResolvedBy()
	 * @see edu.kit.ipd.sdq.toometa.relations.ResolveObject#getResolves
	 * @model opposite="resolves"
	 * @generated
	 */
	EList<ResolveObject> getResolvedBy();

} // ResolveObject
