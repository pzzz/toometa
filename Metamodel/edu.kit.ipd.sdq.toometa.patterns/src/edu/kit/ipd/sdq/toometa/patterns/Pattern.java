/**
 */
package edu.kit.ipd.sdq.toometa.patterns;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.Pattern#getRepository <em>Repository</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.Pattern#getCategories <em>Categories</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.Pattern#getDomain <em>Domain</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.Pattern#getHasVariants <em>Has Variants</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.patterns.PatternsPackage#getPattern()
 * @model
 * @generated
 */
public interface Pattern extends Identifier, GeneralPatternDescription, QuestionAnnotations, ArchitecturalStructure, PatternRelations {
	/**
	 * Returns the value of the '<em><b>Repository</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.toometa.patterns.PatternCatalogue#getPatterns <em>Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' container reference.
	 * @see #setRepository(PatternCatalogue)
	 * @see edu.kit.ipd.sdq.toometa.patterns.PatternsPackage#getPattern_Repository()
	 * @see edu.kit.ipd.sdq.toometa.patterns.PatternCatalogue#getPatterns
	 * @model opposite="patterns" required="true" transient="false"
	 * @generated
	 */
	PatternCatalogue getRepository();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.patterns.Pattern#getRepository <em>Repository</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' container reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(PatternCatalogue value);

	/**
	 * Returns the value of the '<em><b>Categories</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.patterns.Category}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categories</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' reference list.
	 * @see edu.kit.ipd.sdq.toometa.patterns.PatternsPackage#getPattern_Categories()
	 * @model
	 * @generated
	 */
	EList<Category> getCategories();

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.patterns.DomainType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' reference list.
	 * @see edu.kit.ipd.sdq.toometa.patterns.PatternsPackage#getPattern_Domain()
	 * @model
	 * @generated
	 */
	EList<DomainType> getDomain();

	/**
	 * Returns the value of the '<em><b>Has Variants</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.patterns.PatternVariant}.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.toometa.patterns.PatternVariant#getBasePattern <em>Base Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Variants</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Variants</em>' reference list.
	 * @see edu.kit.ipd.sdq.toometa.patterns.PatternsPackage#getPattern_HasVariants()
	 * @see edu.kit.ipd.sdq.toometa.patterns.PatternVariant#getBasePattern
	 * @model opposite="basePattern"
	 * @generated
	 */
	EList<PatternVariant> getHasVariants();

} // Pattern
