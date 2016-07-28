/**
 */
package edu.kit.ipd.sdq.toometa.patterns.questions.tests;

import edu.kit.ipd.sdq.toometa.patterns.questions.GoalQuestion;
import edu.kit.ipd.sdq.toometa.patterns.questions.QuestionsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Goal Question</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GoalQuestionTest extends QuestionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GoalQuestionTest.class);
	}

	/**
	 * Constructs a new Goal Question test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalQuestionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Goal Question test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GoalQuestion getFixture() {
		return (GoalQuestion)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QuestionsFactory.eINSTANCE.createGoalQuestion());
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

} //GoalQuestionTest
