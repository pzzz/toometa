/**
 */
package edu.kit.ipd.sdq.toometa.patterns.patternoptions;

import edu.kit.ipd.sdq.toometa.options.Option;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.patternoptions.PatternOption#getPatternrationale <em>Patternrationale</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.patterns.patternoptions.PatternoptionsPackage#getPatternOption()
 * @model
 * @generated
 */
public interface PatternOption extends Option {
	/**
	 * Returns the value of the '<em><b>Patternrationale</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.patterns.patternoptions.PatternRationale}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patternrationale</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patternrationale</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.toometa.patterns.patternoptions.PatternoptionsPackage#getPatternOption_Patternrationale()
	 * @model containment="true"
	 * @generated
	 */
	EList<PatternRationale> getPatternrationale();

} // PatternOption
