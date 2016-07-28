/**
 */
package edu.kit.ipd.sdq.toometa.patterns.tests;

import edu.kit.ipd.sdq.toometa.patterns.PatternVariant;
import edu.kit.ipd.sdq.toometa.patterns.PatternsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pattern Variant</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PatternVariantTest extends PatternTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PatternVariantTest.class);
	}

	/**
	 * Constructs a new Pattern Variant test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternVariantTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Pattern Variant test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PatternVariant getFixture() {
		return (PatternVariant)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PatternsFactory.eINSTANCE.createPatternVariant());
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

} //PatternVariantTest
