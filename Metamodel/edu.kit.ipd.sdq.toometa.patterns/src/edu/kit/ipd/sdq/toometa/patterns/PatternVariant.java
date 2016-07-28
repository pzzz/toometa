/**
 */
package edu.kit.ipd.sdq.toometa.patterns;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Variant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.PatternVariant#getBasePattern <em>Base Pattern</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.patterns.PatternsPackage#getPatternVariant()
 * @model
 * @generated
 */
public interface PatternVariant extends Pattern {
	/**
	 * Returns the value of the '<em><b>Base Pattern</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.toometa.patterns.Pattern#getHasVariants <em>Has Variants</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Pattern</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Pattern</em>' reference.
	 * @see #setBasePattern(Pattern)
	 * @see edu.kit.ipd.sdq.toometa.patterns.PatternsPackage#getPatternVariant_BasePattern()
	 * @see edu.kit.ipd.sdq.toometa.patterns.Pattern#getHasVariants
	 * @model opposite="hasVariants" required="true"
	 * @generated
	 */
	Pattern getBasePattern();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.patterns.PatternVariant#getBasePattern <em>Base Pattern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Pattern</em>' reference.
	 * @see #getBasePattern()
	 * @generated
	 */
	void setBasePattern(Pattern value);

} // PatternVariant
