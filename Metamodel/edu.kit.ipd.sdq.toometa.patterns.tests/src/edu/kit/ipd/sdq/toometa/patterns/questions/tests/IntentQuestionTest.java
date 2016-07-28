/**
 */
package edu.kit.ipd.sdq.toometa.patterns.questions.tests;

import edu.kit.ipd.sdq.toometa.patterns.questions.IntentQuestion;
import edu.kit.ipd.sdq.toometa.patterns.questions.QuestionsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Intent Question</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntentQuestionTest extends QuestionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IntentQuestionTest.class);
	}

	/**
	 * Constructs a new Intent Question test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentQuestionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Intent Question test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IntentQuestion getFixture() {
		return (IntentQuestion)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QuestionsFactory.eINSTANCE.createIntentQuestion());
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

} //IntentQuestionTest
