/**
 */
package edu.kit.ipd.sdq.toometa.patterns.patternoptions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.toometa.patterns.patternoptions.PatternoptionsPackage
 * @generated
 */
public interface PatternoptionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PatternoptionsFactory eINSTANCE = edu.kit.ipd.sdq.toometa.patterns.patternoptions.impl.PatternoptionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Pattern Rationale</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Rationale</em>'.
	 * @generated
	 */
	PatternRationale createPatternRationale();

	/**
	 * Returns a new object of class '<em>Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Answer</em>'.
	 * @generated
	 */
	Answer createAnswer();

	/**
	 * Returns a new object of class '<em>Pattern Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Option</em>'.
	 * @generated
	 */
	PatternOption createPatternOption();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PatternoptionsPackage getPatternoptionsPackage();

} //PatternoptionsFactory
