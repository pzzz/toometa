/**
 */
package edu.kit.ipd.sdq.toometa.patterns.questions.tests;

import edu.kit.ipd.sdq.toometa.patterns.questions.QuestionRepository;
import edu.kit.ipd.sdq.toometa.patterns.questions.QuestionsFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Question Repository</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuestionRepositoryTest extends TestCase {

	/**
	 * The fixture for this Question Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionRepository fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(QuestionRepositoryTest.class);
	}

	/**
	 * Constructs a new Question Repository test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionRepositoryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Question Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(QuestionRepository fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Question Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionRepository getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QuestionsFactory.eINSTANCE.createQuestionRepository());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //QuestionRepositoryTest
