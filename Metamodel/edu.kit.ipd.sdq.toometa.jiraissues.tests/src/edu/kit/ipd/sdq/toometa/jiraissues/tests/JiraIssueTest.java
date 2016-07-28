/**
 */
package edu.kit.ipd.sdq.toometa.jiraissues.tests;

import edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue;
import edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Jira Issue</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class JiraIssueTest extends AddressableElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(JiraIssueTest.class);
	}

	/**
	 * Constructs a new Jira Issue test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JiraIssueTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Jira Issue test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected JiraIssue getFixture() {
		return (JiraIssue)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(JiraissuesFactory.eINSTANCE.createJiraIssue());
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

} //JiraIssueTest
