/**
 */
package edu.kit.ipd.sdq.toometa.jiraissues.tests;

import edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesFactory;
import edu.kit.ipd.sdq.toometa.jiraissues.UserProxy;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>User Proxy</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UserProxyTest extends AddressableElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UserProxyTest.class);
	}

	/**
	 * Constructs a new User Proxy test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserProxyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this User Proxy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UserProxy getFixture() {
		return (UserProxy)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(JiraissuesFactory.eINSTANCE.createUserProxy());
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

} //UserProxyTest
