/**
 */
package edu.kit.ipd.sdq.toometa.issues;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Issue Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.issues.IssueModel#getIssues <em>Issues</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.issues.IssuesPackage#getIssueModel()
 * @model
 * @generated
 */
public interface IssueModel extends Identifier {
	/**
	 * Returns the value of the '<em><b>Issues</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.issues.Issue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issues</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issues</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.toometa.issues.IssuesPackage#getIssueModel_Issues()
	 * @model containment="true"
	 * @generated
	 */
	EList<Issue> getIssues();

} // IssueModel
