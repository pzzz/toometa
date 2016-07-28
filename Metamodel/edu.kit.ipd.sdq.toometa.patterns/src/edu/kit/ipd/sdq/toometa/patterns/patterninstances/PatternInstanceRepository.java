/**
 */
package edu.kit.ipd.sdq.toometa.patterns.patterninstances;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Instance Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatternInstanceRepository#getSolutionInstances <em>Solution Instances</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatterninstancesPackage#getPatternInstanceRepository()
 * @model
 * @generated
 */
public interface PatternInstanceRepository extends Identifier {
	/**
	 * Returns the value of the '<em><b>Solution Instances</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatternInstance}.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatternInstance#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solution Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solution Instances</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatterninstancesPackage#getPatternInstanceRepository_SolutionInstances()
	 * @see edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatternInstance#getRepository
	 * @model opposite="repository" containment="true"
	 * @generated
	 */
	EList<PatternInstance> getSolutionInstances();

} // PatternInstanceRepository
