/**
 */
package edu.kit.ipd.sdq.toometa.peropteryxcandidates.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>peropteryxcandidates</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class PeropteryxcandidatesTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new PeropteryxcandidatesTests("peropteryxcandidates Tests");
		suite.addTestSuite(PerOpteryxDiscreteRangeOptionTest.class);
		suite.addTestSuite(PerOpteryxContinuousRangeOptionTest.class);
		suite.addTestSuite(PerOpteryxClassOptionTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeropteryxcandidatesTests(String name) {
		super(name);
	}

} //PeropteryxcandidatesTests
