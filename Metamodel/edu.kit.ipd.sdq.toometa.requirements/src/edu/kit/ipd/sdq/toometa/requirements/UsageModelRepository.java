/**
 */
package edu.kit.ipd.sdq.toometa.requirements;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usage Model Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.requirements.UsageModelRepository#getUsageModelAdapters <em>Usage Model Adapters</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.requirements.RequirementsPackage#getUsageModelRepository()
 * @model
 * @generated
 */
public interface UsageModelRepository extends Identifier {
	/**
	 * Returns the value of the '<em><b>Usage Model Adapters</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.requirements.UsageModelAdapter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage Model Adapters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage Model Adapters</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.toometa.requirements.RequirementsPackage#getUsageModelRepository_UsageModelAdapters()
	 * @model containment="true"
	 * @generated
	 */
	EList<UsageModelAdapter> getUsageModelAdapters();

} // UsageModelRepository
