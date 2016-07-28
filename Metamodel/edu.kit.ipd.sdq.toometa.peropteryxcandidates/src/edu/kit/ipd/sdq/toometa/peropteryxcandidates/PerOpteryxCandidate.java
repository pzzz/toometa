/**
 */
package edu.kit.ipd.sdq.toometa.peropteryxcandidates;

import edu.kit.ipd.sdq.toometa.archoptions.ArchCandidate;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Per Opteryx Candidate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.peropteryxcandidates.PerOpteryxCandidate#getSimulationQualities <em>Simulation Qualities</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.peropteryxcandidates.PeropteryxcandidatesPackage#getPerOpteryxCandidate()
 * @model
 * @generated
 */
public interface PerOpteryxCandidate extends ArchCandidate {
	/**
	 * Returns the value of the '<em><b>Simulation Qualities</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.peropteryxcandidates.PredictedQualityValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simulation Qualities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simulation Qualities</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.toometa.peropteryxcandidates.PeropteryxcandidatesPackage#getPerOpteryxCandidate_SimulationQualities()
	 * @model containment="true"
	 * @generated
	 */
	EList<PredictedQualityValue> getSimulationQualities();

} // PerOpteryxCandidate
