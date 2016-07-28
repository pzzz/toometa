/**
 */
package edu.kit.ipd.sdq.toometa.patterns;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.toometa.patterns.PatternsPackage
 * @generated
 */
public interface PatternsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PatternsFactory eINSTANCE = edu.kit.ipd.sdq.toometa.patterns.impl.PatternsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Category</em>'.
	 * @generated
	 */
	Category createCategory();

	/**
	 * Returns a new object of class '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role</em>'.
	 * @generated
	 */
	Role createRole();

	/**
	 * Returns a new object of class '<em>Pattern Variant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Variant</em>'.
	 * @generated
	 */
	PatternVariant createPatternVariant();

	/**
	 * Returns a new object of class '<em>Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern</em>'.
	 * @generated
	 */
	Pattern createPattern();

	/**
	 * Returns a new object of class '<em>Domain Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Type</em>'.
	 * @generated
	 */
	DomainType createDomainType();

	/**
	 * Returns a new object of class '<em>Quality Influence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quality Influence</em>'.
	 * @generated
	 */
	QualityInfluence createQualityInfluence();

	/**
	 * Returns a new object of class '<em>Pattern Catalogue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Catalogue</em>'.
	 * @generated
	 */
	PatternCatalogue createPatternCatalogue();

	/**
	 * Returns a new object of class '<em>Infrastructure Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Infrastructure Type</em>'.
	 * @generated
	 */
	InfrastructureType createInfrastructureType();

	/**
	 * Returns a new object of class '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector</em>'.
	 * @generated
	 */
	Connector createConnector();

	/**
	 * Returns a new object of class '<em>Drawback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Drawback</em>'.
	 * @generated
	 */
	Drawback createDrawback();

	/**
	 * Returns a new object of class '<em>Keyword</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Keyword</em>'.
	 * @generated
	 */
	Keyword createKeyword();

	/**
	 * Returns a new object of class '<em>Goal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Goal</em>'.
	 * @generated
	 */
	Goal createGoal();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PatternsPackage getPatternsPackage();

} //PatternsFactory
