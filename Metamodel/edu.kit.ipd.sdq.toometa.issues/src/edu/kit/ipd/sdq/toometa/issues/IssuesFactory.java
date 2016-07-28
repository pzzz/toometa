/**
 */
package edu.kit.ipd.sdq.toometa.issues;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.toometa.issues.IssuesPackage
 * @generated
 */
public interface IssuesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IssuesFactory eINSTANCE = edu.kit.ipd.sdq.toometa.issues.impl.IssuesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Issue Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Issue Model</em>'.
	 * @generated
	 */
	IssueModel createIssueModel();

	/**
	 * Returns a new object of class '<em>Text Issue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Issue</em>'.
	 * @generated
	 */
	TextIssue createTextIssue();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IssuesPackage getIssuesPackage();

} //IssuesFactory
