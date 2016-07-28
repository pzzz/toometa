/**
 */
package edu.kit.ipd.sdq.toometa.users.tests;

import edu.kit.ipd.sdq.toometa.users.ReqEngineer;
import edu.kit.ipd.sdq.toometa.users.UsersFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Req Engineer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReqEngineerTest extends RoleTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReqEngineerTest.class);
	}

	/**
	 * Constructs a new Req Engineer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqEngineerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Req Engineer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ReqEngineer getFixture() {
		return (ReqEngineer)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UsersFactory.eINSTANCE.createReqEngineer());
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

} //ReqEngineerTest
