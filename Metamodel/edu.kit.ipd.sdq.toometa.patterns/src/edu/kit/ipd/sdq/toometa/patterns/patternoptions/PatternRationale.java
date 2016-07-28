/**
 */
package edu.kit.ipd.sdq.toometa.patterns.patternoptions;

import edu.kit.ipd.sdq.toometa.options.Rationale;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Rationale</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.patternoptions.PatternRationale#getAnswers <em>Answers</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.patterns.patternoptions.PatternoptionsPackage#getPatternRationale()
 * @model
 * @generated
 */
public interface PatternRationale extends Rationale {
	/**
	 * Returns the value of the '<em><b>Answers</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.patterns.patternoptions.Answer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Answers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answers</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.toometa.patterns.patternoptions.PatternoptionsPackage#getPatternRationale_Answers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Answer> getAnswers();

} // PatternRationale
