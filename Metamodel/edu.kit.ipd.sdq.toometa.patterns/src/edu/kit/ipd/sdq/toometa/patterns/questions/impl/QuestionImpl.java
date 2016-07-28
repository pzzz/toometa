/**
 */
package edu.kit.ipd.sdq.toometa.patterns.questions.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import edu.kit.ipd.sdq.toometa.effects.QualityEffect;

import edu.kit.ipd.sdq.toometa.glossary.GlossaryTerm;

import edu.kit.ipd.sdq.toometa.patterns.questions.Question;
import edu.kit.ipd.sdq.toometa.patterns.questions.QuestionRepository;
import edu.kit.ipd.sdq.toometa.patterns.questions.QuestionsPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.questions.impl.QuestionImpl#getText <em>Text</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.questions.impl.QuestionImpl#getQuestionRepository <em>Question Repository</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.questions.impl.QuestionImpl#getHasQualityEffect <em>Has Quality Effect</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.questions.impl.QuestionImpl#getTerms <em>Terms</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class QuestionImpl extends IdentifierImpl implements Question {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuestionsPackage.Literals.QUESTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return (String)eGet(QuestionsPackage.Literals.QUESTION__TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		eSet(QuestionsPackage.Literals.QUESTION__TEXT, newText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionRepository getQuestionRepository() {
		return (QuestionRepository)eGet(QuestionsPackage.Literals.QUESTION__QUESTION_REPOSITORY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuestionRepository(QuestionRepository newQuestionRepository) {
		eSet(QuestionsPackage.Literals.QUESTION__QUESTION_REPOSITORY, newQuestionRepository);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<QualityEffect> getHasQualityEffect() {
		return (EList<QualityEffect>)eGet(QuestionsPackage.Literals.QUESTION__HAS_QUALITY_EFFECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<GlossaryTerm> getTerms() {
		return (EList<GlossaryTerm>)eGet(QuestionsPackage.Literals.QUESTION__TERMS, true);
	}

} //QuestionImpl
