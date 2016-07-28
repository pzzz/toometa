/**
 */
package edu.kit.ipd.sdq.toometa.patterns.questions.impl;

import edu.kit.ipd.sdq.toometa.patterns.questions.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuestionsFactoryImpl extends EFactoryImpl implements QuestionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QuestionsFactory init() {
		try {
			QuestionsFactory theQuestionsFactory = (QuestionsFactory)EPackage.Registry.INSTANCE.getEFactory(QuestionsPackage.eNS_URI);
			if (theQuestionsFactory != null) {
				return theQuestionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QuestionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QuestionsPackage.QUESTION_REPOSITORY: return (EObject)createQuestionRepository();
			case QuestionsPackage.GOAL_QUESTION: return (EObject)createGoalQuestion();
			case QuestionsPackage.VARIANT_QUESTION: return (EObject)createVariantQuestion();
			case QuestionsPackage.CONSEQUENCE_QUESTION: return (EObject)createConsequenceQuestion();
			case QuestionsPackage.INTENT_QUESTION: return (EObject)createIntentQuestion();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionRepository createQuestionRepository() {
		QuestionRepositoryImpl questionRepository = new QuestionRepositoryImpl();
		return questionRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalQuestion createGoalQuestion() {
		GoalQuestionImpl goalQuestion = new GoalQuestionImpl();
		return goalQuestion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariantQuestion createVariantQuestion() {
		VariantQuestionImpl variantQuestion = new VariantQuestionImpl();
		return variantQuestion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsequenceQuestion createConsequenceQuestion() {
		ConsequenceQuestionImpl consequenceQuestion = new ConsequenceQuestionImpl();
		return consequenceQuestion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentQuestion createIntentQuestion() {
		IntentQuestionImpl intentQuestion = new IntentQuestionImpl();
		return intentQuestion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionsPackage getQuestionsPackage() {
		return (QuestionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QuestionsPackage getPackage() {
		return QuestionsPackage.eINSTANCE;
	}

} //QuestionsFactoryImpl
