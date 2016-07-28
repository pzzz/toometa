/**
 */
package edu.kit.ipd.sdq.toometa.patterns.questions.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import edu.kit.ipd.sdq.toometa.patterns.questions.Question;
import edu.kit.ipd.sdq.toometa.patterns.questions.QuestionRepository;
import edu.kit.ipd.sdq.toometa.patterns.questions.QuestionsPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.questions.impl.QuestionRepositoryImpl#getQuestions <em>Questions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionRepositoryImpl extends IdentifierImpl implements QuestionRepository {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuestionsPackage.Literals.QUESTION_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Question> getQuestions() {
		return (EList<Question>)eGet(QuestionsPackage.Literals.QUESTION_REPOSITORY__QUESTIONS, true);
	}

} //QuestionRepositoryImpl
