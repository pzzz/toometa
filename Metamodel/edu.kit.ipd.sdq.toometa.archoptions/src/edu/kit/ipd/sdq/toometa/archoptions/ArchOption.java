/**
 */
package edu.kit.ipd.sdq.toometa.archoptions;

import edu.kit.ipd.sdq.toometa.options.AnalysisRationale;
import edu.kit.ipd.sdq.toometa.options.Option;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arch Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.archoptions.ArchOption#getAnalysisRationale <em>Analysis Rationale</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.archoptions.ArchoptionsPackage#getArchOption()
 * @model abstract="true"
 * @generated
 */
public interface ArchOption extends Option {
	/**
	 * Returns the value of the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.options.AnalysisRationale}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analysis Rationale</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analysis Rationale</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.ArchoptionsPackage#getArchOption_AnalysisRationale()
	 * @model containment="true"
	 * @generated
	 */
	EList<AnalysisRationale> getAnalysisRationale();

} // ArchOption
