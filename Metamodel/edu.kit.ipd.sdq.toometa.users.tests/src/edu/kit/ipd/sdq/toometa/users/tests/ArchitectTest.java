/**
 */
package edu.kit.ipd.sdq.toometa.users.tests;

import edu.kit.ipd.sdq.toometa.users.Architect;
import edu.kit.ipd.sdq.toometa.users.UsersFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Architect</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArchitectTest extends RoleTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ArchitectTest.class);
	}

	/**
	 * Constructs a new Architect test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitectTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Architect test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Architect getFixture() {
		return (Architect)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UsersFactory.eINSTANCE.createArchitect());
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

} //ArchitectTest
