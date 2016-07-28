/**
 */
package edu.kit.ipd.sdq.toometa.patterns;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Similar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.Similar#getSimilarTo <em>Similar To</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.patterns.PatternsPackage#getSimilar()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface Similar extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Similar To</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.patterns.Similar}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Similar To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Similar To</em>' reference list.
	 * @see edu.kit.ipd.sdq.toometa.patterns.PatternsPackage#getSimilar_SimilarTo()
	 * @model
	 * @generated
	 */
	EList<Similar> getSimilarTo();

} // Similar
