/**
 */
package edu.kit.ipd.sdq.toometa.requirements.tests;

import edu.kit.ipd.sdq.toometa.requirements.ProcessRequirements;
import edu.kit.ipd.sdq.toometa.requirements.RequirementsFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Process Requirements</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessRequirementsTest extends TestCase {

	/**
	 * The fixture for this Process Requirements test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessRequirements fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProcessRequirementsTest.class);
	}

	/**
	 * Constructs a new Process Requirements test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessRequirementsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Process Requirements test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ProcessRequirements fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Process Requirements test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessRequirements getFixture() {
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
		setFixture(RequirementsFactory.eINSTANCE.createProcessRequirements());
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

} //ProcessRequirementsTest
