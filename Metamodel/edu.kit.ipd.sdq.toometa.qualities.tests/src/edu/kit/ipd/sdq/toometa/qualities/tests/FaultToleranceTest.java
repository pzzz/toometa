/**
 */
package edu.kit.ipd.sdq.toometa.qualities.tests;

import edu.kit.ipd.sdq.toometa.qualities.FaultTolerance;
import edu.kit.ipd.sdq.toometa.qualities.QualitiesFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Fault Tolerance</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FaultToleranceTest extends ReliabilityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FaultToleranceTest.class);
	}

	/**
	 * Constructs a new Fault Tolerance test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultToleranceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Fault Tolerance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FaultTolerance getFixture() {
		return (FaultTolerance)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QualitiesFactory.eINSTANCE.createFaultTolerance());
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

} //FaultToleranceTest
