/**
 */
package edu.kit.ipd.sdq.toometa.patterns.questions.tests;

import edu.kit.ipd.sdq.toometa.patterns.questions.ConsequenceQuestion;
import edu.kit.ipd.sdq.toometa.patterns.questions.QuestionsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Consequence Question</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConsequenceQuestionTest extends QuestionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConsequenceQuestionTest.class);
	}

	/**
	 * Constructs a new Consequence Question test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsequenceQuestionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Consequence Question test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ConsequenceQuestion getFixture() {
		return (ConsequenceQuestion)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QuestionsFactory.eINSTANCE.createConsequenceQuestion());
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

} //ConsequenceQuestionTest
