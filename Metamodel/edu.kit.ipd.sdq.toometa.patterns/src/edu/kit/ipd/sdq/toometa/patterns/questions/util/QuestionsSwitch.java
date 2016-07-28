/**
 */
package edu.kit.ipd.sdq.toometa.patterns.questions.util;

import de.uka.ipd.sdq.identifier.Identifier;

import edu.kit.ipd.sdq.toometa.patterns.questions.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.toometa.patterns.questions.QuestionsPackage
 * @generated
 */
public class QuestionsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QuestionsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionsSwitch() {
		if (modelPackage == null) {
			modelPackage = QuestionsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case QuestionsPackage.QUESTION_REPOSITORY: {
				QuestionRepository questionRepository = (QuestionRepository)theEObject;
				T result = caseQuestionRepository(questionRepository);
				if (result == null) result = caseIdentifier(questionRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionsPackage.GOAL_QUESTION: {
				GoalQuestion goalQuestion = (GoalQuestion)theEObject;
				T result = caseGoalQuestion(goalQuestion);
				if (result == null) result = caseQuestion(goalQuestion);
				if (result == null) result = caseIdentifier(goalQuestion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionsPackage.VARIANT_QUESTION: {
				VariantQuestion variantQuestion = (VariantQuestion)theEObject;
				T result = caseVariantQuestion(variantQuestion);
				if (result == null) result = caseQuestion(variantQuestion);
				if (result == null) result = caseIdentifier(variantQuestion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionsPackage.CONSEQUENCE_QUESTION: {
				ConsequenceQuestion consequenceQuestion = (ConsequenceQuestion)theEObject;
				T result = caseConsequenceQuestion(consequenceQuestion);
				if (result == null) result = caseQuestion(consequenceQuestion);
				if (result == null) result = caseIdentifier(consequenceQuestion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionsPackage.INTENT_QUESTION: {
				IntentQuestion intentQuestion = (IntentQuestion)theEObject;
				T result = caseIntentQuestion(intentQuestion);
				if (result == null) result = caseQuestion(intentQuestion);
				if (result == null) result = caseIdentifier(intentQuestion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionsPackage.QUESTION: {
				Question question = (Question)theEObject;
				T result = caseQuestion(question);
				if (result == null) result = caseIdentifier(question);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Question Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Question Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionRepository(QuestionRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal Question</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal Question</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoalQuestion(GoalQuestion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variant Question</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variant Question</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariantQuestion(VariantQuestion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consequence Question</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consequence Question</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsequenceQuestion(ConsequenceQuestion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intent Question</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intent Question</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntentQuestion(IntentQuestion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Question</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Question</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestion(Question object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifier(Identifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //QuestionsSwitch
