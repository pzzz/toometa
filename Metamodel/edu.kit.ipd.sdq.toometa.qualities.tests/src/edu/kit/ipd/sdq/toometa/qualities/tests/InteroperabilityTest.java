/**
 */
package edu.kit.ipd.sdq.toometa.qualities.tests;

import edu.kit.ipd.sdq.toometa.qualities.Interoperability;
import edu.kit.ipd.sdq.toometa.qualities.QualitiesFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Interoperability</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InteroperabilityTest extends FunctionalityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InteroperabilityTest.class);
	}

	/**
	 * Constructs a new Interoperability test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteroperabilityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Interoperability test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Interoperability getFixture() {
		return (Interoperability)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QualitiesFactory.eINSTANCE.createInteroperability());
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

} //InteroperabilityTest
