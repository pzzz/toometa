/**
 */
package edu.kit.ipd.sdq.toometa.requirements.tests;

import edu.kit.ipd.sdq.toometa.requirements.RequirementsFactory;
import edu.kit.ipd.sdq.toometa.requirements.TextualUsageModel;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Textual Usage Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TextualUsageModelTest extends UsageModelAdapterTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TextualUsageModelTest.class);
	}

	/**
	 * Constructs a new Textual Usage Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextualUsageModelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Textual Usage Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TextualUsageModel getFixture() {
		return (TextualUsageModel)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RequirementsFactory.eINSTANCE.createTextualUsageModel());
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

} //TextualUsageModelTest
