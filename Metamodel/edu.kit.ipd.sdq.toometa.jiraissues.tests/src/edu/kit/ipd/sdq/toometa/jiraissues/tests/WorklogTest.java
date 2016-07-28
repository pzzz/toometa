/**
 */
package edu.kit.ipd.sdq.toometa.jiraissues.tests;

import edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesFactory;
import edu.kit.ipd.sdq.toometa.jiraissues.Worklog;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Worklog</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorklogTest extends AddressableElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WorklogTest.class);
	}

	/**
	 * Constructs a new Worklog test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorklogTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Worklog test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Worklog getFixture() {
		return (Worklog)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(JiraissuesFactory.eINSTANCE.createWorklog());
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

} //WorklogTest
