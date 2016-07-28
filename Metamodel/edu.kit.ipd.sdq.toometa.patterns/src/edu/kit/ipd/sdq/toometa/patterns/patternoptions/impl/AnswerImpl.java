/**
 */
package edu.kit.ipd.sdq.toometa.patterns.patternoptions.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import edu.kit.ipd.sdq.toometa.patterns.patternoptions.ADMAnswerTypeEnum;
import edu.kit.ipd.sdq.toometa.patterns.patternoptions.Answer;
import edu.kit.ipd.sdq.toometa.patterns.patternoptions.PatternoptionsPackage;

import edu.kit.ipd.sdq.toometa.patterns.questions.Question;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Answer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.patternoptions.impl.AnswerImpl#getAnswerText <em>Answer Text</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.patternoptions.impl.AnswerImpl#getToQuestion <em>To Question</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnswerImpl extends IdentifierImpl implements Answer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnswerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternoptionsPackage.Literals.ANSWER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADMAnswerTypeEnum getAnswerText() {
		return (ADMAnswerTypeEnum)eGet(PatternoptionsPackage.Literals.ANSWER__ANSWER_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnswerText(ADMAnswerTypeEnum newAnswerText) {
		eSet(PatternoptionsPackage.Literals.ANSWER__ANSWER_TEXT, newAnswerText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Question getToQuestion() {
		return (Question)eGet(PatternoptionsPackage.Literals.ANSWER__TO_QUESTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToQuestion(Question newToQuestion) {
		eSet(PatternoptionsPackage.Literals.ANSWER__TO_QUESTION, newToQuestion);
	}

} //AnswerImpl
