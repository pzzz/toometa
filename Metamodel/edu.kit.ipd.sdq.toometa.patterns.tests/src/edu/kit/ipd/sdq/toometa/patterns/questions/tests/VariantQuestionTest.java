/**
 */
package edu.kit.ipd.sdq.toometa.patterns.questions.tests;

import edu.kit.ipd.sdq.toometa.patterns.questions.QuestionsFactory;
import edu.kit.ipd.sdq.toometa.patterns.questions.VariantQuestion;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Variant Question</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VariantQuestionTest extends QuestionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VariantQuestionTest.class);
	}

	/**
	 * Constructs a new Variant Question test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariantQuestionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Variant Question test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected VariantQuestion getFixture() {
		return (VariantQuestion)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QuestionsFactory.eINSTANCE.createVariantQuestion());
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

} //VariantQuestionTest
