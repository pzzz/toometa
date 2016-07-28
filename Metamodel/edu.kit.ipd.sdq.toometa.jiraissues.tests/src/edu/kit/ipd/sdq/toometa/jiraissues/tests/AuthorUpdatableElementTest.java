/**
 */
package edu.kit.ipd.sdq.toometa.jiraissues.tests;

import edu.kit.ipd.sdq.toometa.jiraissues.AuthorUpdatableElement;
import edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Author Updatable Element</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AuthorUpdatableElementTest extends UpdatableElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AuthorUpdatableElementTest.class);
	}

	/**
	 * Constructs a new Author Updatable Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorUpdatableElementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Author Updatable Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AuthorUpdatableElement getFixture() {
		return (AuthorUpdatableElement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(JiraissuesFactory.eINSTANCE.createAuthorUpdatableElement());
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

} //AuthorUpdatableElementTest
