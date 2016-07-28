/**
 */
package edu.kit.ipd.sdq.toometa.jiraissues.tests;

import edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesFactory;
import edu.kit.ipd.sdq.toometa.jiraissues.TimeTracking;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Time Tracking</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimeTrackingTest extends TestCase {

	/**
	 * The fixture for this Time Tracking test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeTracking fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TimeTrackingTest.class);
	}

	/**
	 * Constructs a new Time Tracking test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeTrackingTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Time Tracking test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TimeTracking fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Time Tracking test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeTracking getFixture() {
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
		setFixture(JiraissuesFactory.eINSTANCE.createTimeTracking());
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

} //TimeTrackingTest
