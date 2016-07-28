/**
 */
package edu.kit.ipd.sdq.toometa.palladiorationales;

import edu.kit.ipd.sdq.toometa.options.AnalysisRationale;

import org.palladiosimulator.edp2.models.ExperimentData.ExperimentSetting;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Palladio Rationale</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.palladiorationales.PalladioRationale#getPalladioResult <em>Palladio Result</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.palladiorationales.PalladiorationalesPackage#getPalladioRationale()
 * @model
 * @generated
 */
public interface PalladioRationale extends AnalysisRationale {
	/**
	 * Returns the value of the '<em><b>Palladio Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Palladio Result</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Palladio Result</em>' reference.
	 * @see #setPalladioResult(ExperimentSetting)
	 * @see edu.kit.ipd.sdq.toometa.palladiorationales.PalladiorationalesPackage#getPalladioRationale_PalladioResult()
	 * @model
	 * @generated
	 */
	ExperimentSetting getPalladioResult();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.palladiorationales.PalladioRationale#getPalladioResult <em>Palladio Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Palladio Result</em>' reference.
	 * @see #getPalladioResult()
	 * @generated
	 */
	void setPalladioResult(ExperimentSetting value);

} // PalladioRationale
