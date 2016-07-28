/**
 */
package edu.kit.ipd.sdq.toometa.qualities.tests;

import edu.kit.ipd.sdq.toometa.qualities.FunctionalityCompliance;
import edu.kit.ipd.sdq.toometa.qualities.QualitiesFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Functionality Compliance</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionalityComplianceTest extends FunctionalityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FunctionalityComplianceTest.class);
	}

	/**
	 * Constructs a new Functionality Compliance test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalityComplianceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Functionality Compliance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FunctionalityCompliance getFixture() {
		return (FunctionalityCompliance)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QualitiesFactory.eINSTANCE.createFunctionalityCompliance());
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

} //FunctionalityComplianceTest
