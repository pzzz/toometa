/**
 */
package edu.kit.ipd.sdq.toometa.patterns;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exclusion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.Exclusion#getExcludes <em>Excludes</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.patterns.PatternsPackage#getExclusion()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface Exclusion extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Excludes</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.patterns.Exclusion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Excludes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Excludes</em>' reference list.
	 * @see edu.kit.ipd.sdq.toometa.patterns.PatternsPackage#getExclusion_Excludes()
	 * @model
	 * @generated
	 */
	EList<Exclusion> getExcludes();

} // Exclusion
