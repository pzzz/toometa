/**
 */
package edu.kit.ipd.sdq.toometa.requirements;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project Requirements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.requirements.ProjectRequirements#getProjectRequirements <em>Project Requirements</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.requirements.RequirementsPackage#getProjectRequirements()
 * @model
 * @generated
 */
public interface ProjectRequirements extends Identifier {
	/**
	 * Returns the value of the '<em><b>Project Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.requirements.ProjectRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project Requirements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Requirements</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.toometa.requirements.RequirementsPackage#getProjectRequirements_ProjectRequirements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProjectRequirement> getProjectRequirements();

} // ProjectRequirements
