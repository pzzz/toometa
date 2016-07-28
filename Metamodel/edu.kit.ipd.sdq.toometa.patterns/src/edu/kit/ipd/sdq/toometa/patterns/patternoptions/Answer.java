/**
 */
package edu.kit.ipd.sdq.toometa.patterns.patternoptions;

import de.uka.ipd.sdq.identifier.Identifier;

import edu.kit.ipd.sdq.toometa.patterns.questions.Question;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.patternoptions.Answer#getAnswerText <em>Answer Text</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.patternoptions.Answer#getToQuestion <em>To Question</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.patterns.patternoptions.PatternoptionsPackage#getAnswer()
 * @model
 * @generated
 */
public interface Answer extends Identifier {
	/**
	 * Returns the value of the '<em><b>Answer Text</b></em>' attribute.
	 * The default value is <code>"noAnswer"</code>.
	 * The literals are from the enumeration {@link edu.kit.ipd.sdq.toometa.patterns.patternoptions.ADMAnswerTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Answer Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answer Text</em>' attribute.
	 * @see edu.kit.ipd.sdq.toometa.patterns.patternoptions.ADMAnswerTypeEnum
	 * @see #setAnswerText(ADMAnswerTypeEnum)
	 * @see edu.kit.ipd.sdq.toometa.patterns.patternoptions.PatternoptionsPackage#getAnswer_AnswerText()
	 * @model default="noAnswer"
	 * @generated
	 */
	ADMAnswerTypeEnum getAnswerText();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.patterns.patternoptions.Answer#getAnswerText <em>Answer Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answer Text</em>' attribute.
	 * @see edu.kit.ipd.sdq.toometa.patterns.patternoptions.ADMAnswerTypeEnum
	 * @see #getAnswerText()
	 * @generated
	 */
	void setAnswerText(ADMAnswerTypeEnum value);

	/**
	 * Returns the value of the '<em><b>To Question</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Question</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Question</em>' reference.
	 * @see #setToQuestion(Question)
	 * @see edu.kit.ipd.sdq.toometa.patterns.patternoptions.PatternoptionsPackage#getAnswer_ToQuestion()
	 * @model required="true"
	 * @generated
	 */
	Question getToQuestion();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.patterns.patternoptions.Answer#getToQuestion <em>To Question</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Question</em>' reference.
	 * @see #getToQuestion()
	 * @generated
	 */
	void setToQuestion(Question value);

} // Answer
