/**
 */
package edu.kit.ipd.sdq.toometa.patterns;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Architectural Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.ArchitecturalStructure#getRole <em>Role</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.ArchitecturalStructure#getConnectors <em>Connectors</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.patterns.PatternsPackage#getArchitecturalStructure()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface ArchitecturalStructure extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.patterns.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.toometa.patterns.PatternsPackage#getArchitecturalStructure_Role()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Role> getRole();

	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.patterns.Connector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectors</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.toometa.patterns.PatternsPackage#getArchitecturalStructure_Connectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connector> getConnectors();

} // ArchitecturalStructure
