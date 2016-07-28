/**
 */
package edu.kit.ipd.sdq.toometa.relations;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.relations.DependencyObject#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.relations.DependencyObject#getHasDependents <em>Has Dependents</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.relations.RelationsPackage#getDependencyObject()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface DependencyObject extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Depends On</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.relations.DependencyObject}.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.toometa.relations.DependencyObject#getHasDependents <em>Has Dependents</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depends On</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends On</em>' reference list.
	 * @see edu.kit.ipd.sdq.toometa.relations.RelationsPackage#getDependencyObject_DependsOn()
	 * @see edu.kit.ipd.sdq.toometa.relations.DependencyObject#getHasDependents
	 * @model opposite="hasDependents"
	 * @generated
	 */
	EList<DependencyObject> getDependsOn();

	/**
	 * Returns the value of the '<em><b>Has Dependents</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.relations.DependencyObject}.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.toometa.relations.DependencyObject#getDependsOn <em>Depends On</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Dependents</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Dependents</em>' reference list.
	 * @see edu.kit.ipd.sdq.toometa.relations.RelationsPackage#getDependencyObject_HasDependents()
	 * @see edu.kit.ipd.sdq.toometa.relations.DependencyObject#getDependsOn
	 * @model opposite="dependsOn"
	 * @generated
	 */
	EList<DependencyObject> getHasDependents();

} // DependencyObject
