/**
 */
package edu.kit.ipd.sdq.toometa.patterns.tests;

import edu.kit.ipd.sdq.toometa.patterns.Keyword;
import edu.kit.ipd.sdq.toometa.patterns.PatternsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Keyword</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class KeywordTest extends PropertyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(KeywordTest.class);
	}

	/**
	 * Constructs a new Keyword test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeywordTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Keyword test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Keyword getFixture() {
		return (Keyword)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PatternsFactory.eINSTANCE.createKeyword());
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

} //KeywordTest
