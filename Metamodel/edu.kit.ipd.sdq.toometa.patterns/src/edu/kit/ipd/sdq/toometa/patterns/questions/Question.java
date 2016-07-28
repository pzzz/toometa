/**
 */
package edu.kit.ipd.sdq.toometa.patterns.questions;

import de.uka.ipd.sdq.identifier.Identifier;

import edu.kit.ipd.sdq.toometa.effects.QualityEffect;

import edu.kit.ipd.sdq.toometa.glossary.GlossaryTerm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.questions.Question#getText <em>Text</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.questions.Question#getQuestionRepository <em>Question Repository</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.questions.Question#getHasQualityEffect <em>Has Quality Effect</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.questions.Question#getTerms <em>Terms</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.patterns.questions.QuestionsPackage#getQuestion()
 * @model abstract="true"
 * @generated
 */
public interface Question extends Identifier {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see edu.kit.ipd.sdq.toometa.patterns.questions.QuestionsPackage#getQuestion_Text()
	 * @model required="true"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.patterns.questions.Question#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Question Repository</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.toometa.patterns.questions.QuestionRepository#getQuestions <em>Questions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Question Repository</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question Repository</em>' container reference.
	 * @see #setQuestionRepository(QuestionRepository)
	 * @see edu.kit.ipd.sdq.toometa.patterns.questions.QuestionsPackage#getQuestion_QuestionRepository()
	 * @see edu.kit.ipd.sdq.toometa.patterns.questions.QuestionRepository#getQuestions
	 * @model opposite="questions" required="true" transient="false"
	 * @generated
	 */
	QuestionRepository getQuestionRepository();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.patterns.questions.Question#getQuestionRepository <em>Question Repository</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question Repository</em>' container reference.
	 * @see #getQuestionRepository()
	 * @generated
	 */
	void setQuestionRepository(QuestionRepository value);

	/**
	 * Returns the value of the '<em><b>Has Quality Effect</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.effects.QualityEffect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Quality Effect</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Quality Effect</em>' reference list.
	 * @see edu.kit.ipd.sdq.toometa.patterns.questions.QuestionsPackage#getQuestion_HasQualityEffect()
	 * @model
	 * @generated
	 */
	EList<QualityEffect> getHasQualityEffect();

	/**
	 * Returns the value of the '<em><b>Terms</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.glossary.GlossaryTerm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terms</em>' reference list.
	 * @see edu.kit.ipd.sdq.toometa.patterns.questions.QuestionsPackage#getQuestion_Terms()
	 * @model
	 * @generated
	 */
	EList<GlossaryTerm> getTerms();

} // Question
