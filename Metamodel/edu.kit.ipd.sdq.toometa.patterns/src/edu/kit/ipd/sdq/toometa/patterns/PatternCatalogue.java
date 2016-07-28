/**
 */
package edu.kit.ipd.sdq.toometa.patterns;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Catalogue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.PatternCatalogue#getPatterns <em>Patterns</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.PatternCatalogue#getDomains <em>Domains</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.PatternCatalogue#getCategories <em>Categories</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.PatternCatalogue#getInfrastructuretype <em>Infrastructuretype</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.patterns.PatternsPackage#getPatternCatalogue()
 * @model
 * @generated
 */
public interface PatternCatalogue extends Identifier {
	/**
	 * Returns the value of the '<em><b>Patterns</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.patterns.Pattern}.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.toometa.patterns.Pattern#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patterns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patterns</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.toometa.patterns.PatternsPackage#getPatternCatalogue_Patterns()
	 * @see edu.kit.ipd.sdq.toometa.patterns.Pattern#getRepository
	 * @model opposite="repository" containment="true"
	 * @generated
	 */
	EList<Pattern> getPatterns();

	/**
	 * Returns the value of the '<em><b>Domains</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.patterns.DomainType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domains</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domains</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.toometa.patterns.PatternsPackage#getPatternCatalogue_Domains()
	 * @model containment="true"
	 * @generated
	 */
	EList<DomainType> getDomains();

	/**
	 * Returns the value of the '<em><b>Categories</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.patterns.Category}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.toometa.patterns.PatternsPackage#getPatternCatalogue_Categories()
	 * @model containment="true"
	 * @generated
	 */
	EList<Category> getCategories();

	/**
	 * Returns the value of the '<em><b>Infrastructuretype</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.patterns.InfrastructureType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Infrastructuretype</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infrastructuretype</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.toometa.patterns.PatternsPackage#getPatternCatalogue_Infrastructuretype()
	 * @model containment="true"
	 * @generated
	 */
	EList<InfrastructureType> getInfrastructuretype();

} // PatternCatalogue
