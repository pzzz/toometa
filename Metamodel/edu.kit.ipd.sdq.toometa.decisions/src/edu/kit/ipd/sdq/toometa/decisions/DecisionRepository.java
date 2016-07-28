/**
 */
package edu.kit.ipd.sdq.toometa.decisions;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.decisions.DecisionRepository#getDecisions <em>Decisions</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.decisions.DecisionsPackage#getDecisionRepository()
 * @model
 * @generated
 */
public interface DecisionRepository extends Identifier {
	/**
	 * Returns the value of the '<em><b>Decisions</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.decisions.Decision}.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.toometa.decisions.Decision#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decisions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decisions</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.toometa.decisions.DecisionsPackage#getDecisionRepository_Decisions()
	 * @see edu.kit.ipd.sdq.toometa.decisions.Decision#getRepository
	 * @model opposite="repository" containment="true"
	 * @generated
	 */
	EList<Decision> getDecisions();

} // DecisionRepository
