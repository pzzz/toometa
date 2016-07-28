/**
 */
package edu.kit.ipd.sdq.toometa.patterns.tests;

import edu.kit.ipd.sdq.toometa.patterns.Pattern;
import edu.kit.ipd.sdq.toometa.patterns.PatternsFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PatternTest extends TestCase {

	/**
	 * The fixture for this Pattern test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Pattern fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PatternTest.class);
	}

	/**
	 * Constructs a new Pattern test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Pattern test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Pattern fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Pattern test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Pattern getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PatternsFactory.eINSTANCE.createPattern());
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

} //PatternTest
