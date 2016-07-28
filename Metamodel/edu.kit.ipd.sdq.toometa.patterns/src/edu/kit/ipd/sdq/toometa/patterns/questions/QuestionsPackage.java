/**
 */
package edu.kit.ipd.sdq.toometa.patterns.questions;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.toometa.patterns.questions.QuestionsFactory
 * @model kind="package"
 * @generated
 */
public interface QuestionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "questions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.uka.de/edu.kit.ipd.sdq.toometa/patterns/questions/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "questions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QuestionsPackage eINSTANCE = edu.kit.ipd.sdq.toometa.patterns.questions.impl.QuestionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.patterns.questions.impl.QuestionRepositoryImpl <em>Question Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.patterns.questions.impl.QuestionRepositoryImpl
	 * @see edu.kit.ipd.sdq.toometa.patterns.questions.impl.QuestionsPackageImpl#getQuestionRepository()
	 * @generated
	 */
	int QUESTION_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_REPOSITORY__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Questions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_REPOSITORY__QUESTIONS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Question Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_REPOSITORY_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.patterns.questions.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.patterns.questions.impl.QuestionImpl
	 * @see edu.kit.ipd.sdq.toometa.patterns.questions.impl.QuestionsPackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__TEXT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Question Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__QUESTION_REPOSITORY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Quality Effect</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__HAS_QUALITY_EFFECT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__TERMS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.patterns.questions.impl.GoalQuestionImpl <em>Goal Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.patterns.questions.impl.GoalQuestionImpl
	 * @see edu.kit.ipd.sdq.toometa.patterns.questions.impl.QuestionsPackageImpl#getGoalQuestion()
	 * @generated
	 */
	int GOAL_QUESTION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_QUESTION__ID = QUESTION__ID;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_QUESTION__TEXT = QUESTION__TEXT;

	/**
	 * The feature id for the '<em><b>Question Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_QUESTION__QUESTION_REPOSITORY = QUESTION__QUESTION_REPOSITORY;

	/**
	 * The feature id for the '<em><b>Has Quality Effect</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_QUESTION__HAS_QUALITY_EFFECT = QUESTION__HAS_QUALITY_EFFECT;

	/**
	 * The feature id for the '<em><b>Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_QUESTION__TERMS = QUESTION__TERMS;

	/**
	 * The number of structural features of the '<em>Goal Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_QUESTION_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.patterns.questions.impl.VariantQuestionImpl <em>Variant Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.patterns.questions.impl.VariantQuestionImpl
	 * @see edu.kit.ipd.sdq.toometa.patterns.questions.impl.QuestionsPackageImpl#getVariantQuestion()
	 * @generated
	 */
	int VARIANT_QUESTION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_QUESTION__ID = QUESTION__ID;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_QUESTION__TEXT = QUESTION__TEXT;

	/**
	 * The feature id for the '<em><b>Question Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_QUESTION__QUESTION_REPOSITORY = QUESTION__QUESTION_REPOSITORY;

	/**
	 * The feature id for the '<em><b>Has Quality Effect</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_QUESTION__HAS_QUALITY_EFFECT = QUESTION__HAS_QUALITY_EFFECT;

	/**
	 * The feature id for the '<em><b>Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_QUESTION__TERMS = QUESTION__TERMS;

	/**
	 * The number of structural features of the '<em>Variant Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_QUESTION_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.patterns.questions.impl.ConsequenceQuestionImpl <em>Consequence Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.patterns.questions.impl.ConsequenceQuestionImpl
	 * @see edu.kit.ipd.sdq.toometa.patterns.questions.impl.QuestionsPackageImpl#getConsequenceQuestion()
	 * @generated
	 */
	int CONSEQUENCE_QUESTION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSEQUENCE_QUESTION__ID = QUESTION__ID;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSEQUENCE_QUESTION__TEXT = QUESTION__TEXT;

	/**
	 * The feature id for the '<em><b>Question Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSEQUENCE_QUESTION__QUESTION_REPOSITORY = QUESTION__QUESTION_REPOSITORY;

	/**
	 * The feature id for the '<em><b>Has Quality Effect</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSEQUENCE_QUESTION__HAS_QUALITY_EFFECT = QUESTION__HAS_QUALITY_EFFECT;

	/**
	 * The feature id for the '<em><b>Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSEQUENCE_QUESTION__TERMS = QUESTION__TERMS;

	/**
	 * The number of structural features of the '<em>Consequence Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSEQUENCE_QUESTION_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.patterns.questions.impl.IntentQuestionImpl <em>Intent Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.patterns.questions.impl.IntentQuestionImpl
	 * @see edu.kit.ipd.sdq.toometa.patterns.questions.impl.QuestionsPackageImpl#getIntentQuestion()
	 * @generated
	 */
	int INTENT_QUESTION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_QUESTION__ID = QUESTION__ID;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_QUESTION__TEXT = QUESTION__TEXT;

	/**
	 * The feature id for the '<em><b>Question Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_QUESTION__QUESTION_REPOSITORY = QUESTION__QUESTION_REPOSITORY;

	/**
	 * The feature id for the '<em><b>Has Quality Effect</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_QUESTION__HAS_QUALITY_EFFECT = QUESTION__HAS_QUALITY_EFFECT;

	/**
	 * The feature id for the '<em><b>Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_QUESTION__TERMS = QUESTION__TERMS;

	/**
	 * The number of structural features of the '<em>Intent Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_QUESTION_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.patterns.questions.QuestionRepository <em>Question Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question Repository</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.questions.QuestionRepository
	 * @generated
	 */
	EClass getQuestionRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.toometa.patterns.questions.QuestionRepository#getQuestions <em>Questions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Questions</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.questions.QuestionRepository#getQuestions()
	 * @see #getQuestionRepository()
	 * @generated
	 */
	EReference getQuestionRepository_Questions();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.patterns.questions.GoalQuestion <em>Goal Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal Question</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.questions.GoalQuestion
	 * @generated
	 */
	EClass getGoalQuestion();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.patterns.questions.VariantQuestion <em>Variant Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variant Question</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.questions.VariantQuestion
	 * @generated
	 */
	EClass getVariantQuestion();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.patterns.questions.ConsequenceQuestion <em>Consequence Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consequence Question</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.questions.ConsequenceQuestion
	 * @generated
	 */
	EClass getConsequenceQuestion();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.patterns.questions.IntentQuestion <em>Intent Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intent Question</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.questions.IntentQuestion
	 * @generated
	 */
	EClass getIntentQuestion();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.patterns.questions.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.questions.Question
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.patterns.questions.Question#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.questions.Question#getText()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Text();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.toometa.patterns.questions.Question#getQuestionRepository <em>Question Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Question Repository</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.questions.Question#getQuestionRepository()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_QuestionRepository();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.toometa.patterns.questions.Question#getHasQualityEffect <em>Has Quality Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Quality Effect</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.questions.Question#getHasQualityEffect()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_HasQualityEffect();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.toometa.patterns.questions.Question#getTerms <em>Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Terms</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.questions.Question#getTerms()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_Terms();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QuestionsFactory getQuestionsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.patterns.questions.impl.QuestionRepositoryImpl <em>Question Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.patterns.questions.impl.QuestionRepositoryImpl
		 * @see edu.kit.ipd.sdq.toometa.patterns.questions.impl.QuestionsPackageImpl#getQuestionRepository()
		 * @generated
		 */
		EClass QUESTION_REPOSITORY = eINSTANCE.getQuestionRepository();

		/**
		 * The meta object literal for the '<em><b>Questions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION_REPOSITORY__QUESTIONS = eINSTANCE.getQuestionRepository_Questions();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.patterns.questions.impl.GoalQuestionImpl <em>Goal Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.patterns.questions.impl.GoalQuestionImpl
		 * @see edu.kit.ipd.sdq.toometa.patterns.questions.impl.QuestionsPackageImpl#getGoalQuestion()
		 * @generated
		 */
		EClass GOAL_QUESTION = eINSTANCE.getGoalQuestion();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.patterns.questions.impl.VariantQuestionImpl <em>Variant Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.patterns.questions.impl.VariantQuestionImpl
		 * @see edu.kit.ipd.sdq.toometa.patterns.questions.impl.QuestionsPackageImpl#getVariantQuestion()
		 * @generated
		 */
		EClass VARIANT_QUESTION = eINSTANCE.getVariantQuestion();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.patterns.questions.impl.ConsequenceQuestionImpl <em>Consequence Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.patterns.questions.impl.ConsequenceQuestionImpl
		 * @see edu.kit.ipd.sdq.toometa.patterns.questions.impl.QuestionsPackageImpl#getConsequenceQuestion()
		 * @generated
		 */
		EClass CONSEQUENCE_QUESTION = eINSTANCE.getConsequenceQuestion();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.patterns.questions.impl.IntentQuestionImpl <em>Intent Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.patterns.questions.impl.IntentQuestionImpl
		 * @see edu.kit.ipd.sdq.toometa.patterns.questions.impl.QuestionsPackageImpl#getIntentQuestion()
		 * @generated
		 */
		EClass INTENT_QUESTION = eINSTANCE.getIntentQuestion();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.patterns.questions.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.patterns.questions.impl.QuestionImpl
		 * @see edu.kit.ipd.sdq.toometa.patterns.questions.impl.QuestionsPackageImpl#getQuestion()
		 * @generated
		 */
		EClass QUESTION = eINSTANCE.getQuestion();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__TEXT = eINSTANCE.getQuestion_Text();

		/**
		 * The meta object literal for the '<em><b>Question Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__QUESTION_REPOSITORY = eINSTANCE.getQuestion_QuestionRepository();

		/**
		 * The meta object literal for the '<em><b>Has Quality Effect</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__HAS_QUALITY_EFFECT = eINSTANCE.getQuestion_HasQualityEffect();

		/**
		 * The meta object literal for the '<em><b>Terms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__TERMS = eINSTANCE.getQuestion_Terms();

	}

} //QuestionsPackage
