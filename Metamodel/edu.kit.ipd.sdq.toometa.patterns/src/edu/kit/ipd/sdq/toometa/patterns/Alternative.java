/**
 */
package edu.kit.ipd.sdq.toometa.patterns;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alternative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.Alternative#getAlternativeFor <em>Alternative For</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.patterns.PatternsPackage#getAlternative()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface Alternative extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Alternative For</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.patterns.Alternative}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternative For</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternative For</em>' reference list.
	 * @see edu.kit.ipd.sdq.toometa.patterns.PatternsPackage#getAlternative_AlternativeFor()
	 * @model
	 * @generated
	 */
	EList<Alternative> getAlternativeFor();

} // Alternative
