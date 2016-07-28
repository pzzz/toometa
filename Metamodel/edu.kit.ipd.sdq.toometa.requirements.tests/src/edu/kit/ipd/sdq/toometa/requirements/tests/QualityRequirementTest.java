/**
 */
package edu.kit.ipd.sdq.toometa.requirements.tests;

import edu.kit.ipd.sdq.toometa.requirements.QualityRequirement;
import edu.kit.ipd.sdq.toometa.requirements.RequirementsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Quality Requirement</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class QualityRequirementTest extends SystemRequirementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(QualityRequirementTest.class);
	}

	/**
	 * Constructs a new Quality Requirement test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityRequirementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Quality Requirement test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected QualityRequirement getFixture() {
		return (QualityRequirement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RequirementsFactory.eINSTANCE.createQualityRequirement());
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

} //QualityRequirementTest
