/**
 */
package edu.kit.ipd.sdq.toometa.relations;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alternative Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.relations.AlternativeObject#getAlternativeTo <em>Alternative To</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.relations.AlternativeObject#getHasAlternatives <em>Has Alternatives</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.relations.RelationsPackage#getAlternativeObject()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface AlternativeObject extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Alternative To</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.relations.AlternativeObject}.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.toometa.relations.AlternativeObject#getHasAlternatives <em>Has Alternatives</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternative To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternative To</em>' reference list.
	 * @see edu.kit.ipd.sdq.toometa.relations.RelationsPackage#getAlternativeObject_AlternativeTo()
	 * @see edu.kit.ipd.sdq.toometa.relations.AlternativeObject#getHasAlternatives
	 * @model opposite="hasAlternatives"
	 * @generated
	 */
	EList<AlternativeObject> getAlternativeTo();

	/**
	 * Returns the value of the '<em><b>Has Alternatives</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.relations.AlternativeObject}.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.toometa.relations.AlternativeObject#getAlternativeTo <em>Alternative To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Alternatives</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Alternatives</em>' reference list.
	 * @see edu.kit.ipd.sdq.toometa.relations.RelationsPackage#getAlternativeObject_HasAlternatives()
	 * @see edu.kit.ipd.sdq.toometa.relations.AlternativeObject#getAlternativeTo
	 * @model opposite="alternativeTo"
	 * @generated
	 */
	EList<AlternativeObject> getHasAlternatives();

} // AlternativeObject
