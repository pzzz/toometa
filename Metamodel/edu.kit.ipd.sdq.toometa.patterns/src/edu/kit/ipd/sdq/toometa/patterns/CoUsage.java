/**
 */
package edu.kit.ipd.sdq.toometa.patterns;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Co Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.CoUsage#getUsedWith <em>Used With</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.patterns.PatternsPackage#getCoUsage()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface CoUsage extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Used With</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.patterns.CoUsage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used With</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used With</em>' reference list.
	 * @see edu.kit.ipd.sdq.toometa.patterns.PatternsPackage#getCoUsage_UsedWith()
	 * @model
	 * @generated
	 */
	EList<CoUsage> getUsedWith();

} // CoUsage
