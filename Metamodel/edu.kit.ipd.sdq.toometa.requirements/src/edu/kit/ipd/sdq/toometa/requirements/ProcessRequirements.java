/**
 */
package edu.kit.ipd.sdq.toometa.requirements;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Requirements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.requirements.ProcessRequirements#getProcessRrequirements <em>Process Rrequirements</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.requirements.RequirementsPackage#getProcessRequirements()
 * @model
 * @generated
 */
public interface ProcessRequirements extends Identifier {
	/**
	 * Returns the value of the '<em><b>Process Rrequirements</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.requirements.ProcessRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Rrequirements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Rrequirements</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.toometa.requirements.RequirementsPackage#getProcessRequirements_ProcessRrequirements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProcessRequirement> getProcessRrequirements();

} // ProcessRequirements
