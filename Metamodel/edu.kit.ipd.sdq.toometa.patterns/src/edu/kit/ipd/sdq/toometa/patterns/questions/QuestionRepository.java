/**
 */
package edu.kit.ipd.sdq.toometa.patterns.questions;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.questions.QuestionRepository#getQuestions <em>Questions</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.patterns.questions.QuestionsPackage#getQuestionRepository()
 * @model
 * @generated
 */
public interface QuestionRepository extends Identifier {
	/**
	 * Returns the value of the '<em><b>Questions</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.patterns.questions.Question}.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.toometa.patterns.questions.Question#getQuestionRepository <em>Question Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Questions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Questions</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.toometa.patterns.questions.QuestionsPackage#getQuestionRepository_Questions()
	 * @see edu.kit.ipd.sdq.toometa.patterns.questions.Question#getQuestionRepository
	 * @model opposite="questionRepository" containment="true"
	 * @generated
	 */
	EList<Question> getQuestions();

} // QuestionRepository
