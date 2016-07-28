/**
 */
package edu.kit.ipd.sdq.toometa.patterns.questions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.toometa.patterns.questions.QuestionsPackage
 * @generated
 */
public interface QuestionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QuestionsFactory eINSTANCE = edu.kit.ipd.sdq.toometa.patterns.questions.impl.QuestionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Question Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Question Repository</em>'.
	 * @generated
	 */
	QuestionRepository createQuestionRepository();

	/**
	 * Returns a new object of class '<em>Goal Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Goal Question</em>'.
	 * @generated
	 */
	GoalQuestion createGoalQuestion();

	/**
	 * Returns a new object of class '<em>Variant Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variant Question</em>'.
	 * @generated
	 */
	VariantQuestion createVariantQuestion();

	/**
	 * Returns a new object of class '<em>Consequence Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consequence Question</em>'.
	 * @generated
	 */
	ConsequenceQuestion createConsequenceQuestion();

	/**
	 * Returns a new object of class '<em>Intent Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intent Question</em>'.
	 * @generated
	 */
	IntentQuestion createIntentQuestion();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QuestionsPackage getQuestionsPackage();

} //QuestionsFactory
