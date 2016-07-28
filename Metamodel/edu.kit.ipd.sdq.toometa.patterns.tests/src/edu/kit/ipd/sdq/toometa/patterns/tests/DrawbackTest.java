/**
 */
package edu.kit.ipd.sdq.toometa.patterns.tests;

import edu.kit.ipd.sdq.toometa.patterns.Drawback;
import edu.kit.ipd.sdq.toometa.patterns.PatternsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Drawback</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DrawbackTest extends PropertyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DrawbackTest.class);
	}

	/**
	 * Constructs a new Drawback test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrawbackTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Drawback test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Drawback getFixture() {
		return (Drawback)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PatternsFactory.eINSTANCE.createDrawback());
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

} //DrawbackTest
