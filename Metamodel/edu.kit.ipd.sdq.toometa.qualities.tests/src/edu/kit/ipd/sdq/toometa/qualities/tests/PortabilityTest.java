/**
 */
package edu.kit.ipd.sdq.toometa.qualities.tests;

import edu.kit.ipd.sdq.toometa.qualities.Portability;
import edu.kit.ipd.sdq.toometa.qualities.QualitiesFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Portability</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PortabilityTest extends QualityTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PortabilityTest.class);
	}

	/**
	 * Constructs a new Portability test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortabilityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Portability test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Portability getFixture() {
		return (Portability)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QualitiesFactory.eINSTANCE.createPortability());
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

} //PortabilityTest
