/**
 */
package edu.kit.ipd.sdq.toometa.qualities.tests;

import edu.kit.ipd.sdq.toometa.qualities.QualitiesFactory;
import edu.kit.ipd.sdq.toometa.qualities.Understandability;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Understandability</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UnderstandabilityTest extends UsabilityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UnderstandabilityTest.class);
	}

	/**
	 * Constructs a new Understandability test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnderstandabilityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Understandability test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Understandability getFixture() {
		return (Understandability)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QualitiesFactory.eINSTANCE.createUnderstandability());
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

} //UnderstandabilityTest
