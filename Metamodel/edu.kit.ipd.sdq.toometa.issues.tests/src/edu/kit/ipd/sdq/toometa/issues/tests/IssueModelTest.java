/**
 */
package edu.kit.ipd.sdq.toometa.issues.tests;

import edu.kit.ipd.sdq.toometa.issues.IssueModel;
import edu.kit.ipd.sdq.toometa.issues.IssuesFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Issue Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IssueModelTest extends TestCase {

	/**
	 * The fixture for this Issue Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IssueModel fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IssueModelTest.class);
	}

	/**
	 * Constructs a new Issue Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueModelTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Issue Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(IssueModel fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Issue Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IssueModel getFixture() {
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
		setFixture(IssuesFactory.eINSTANCE.createIssueModel());
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

} //IssueModelTest
