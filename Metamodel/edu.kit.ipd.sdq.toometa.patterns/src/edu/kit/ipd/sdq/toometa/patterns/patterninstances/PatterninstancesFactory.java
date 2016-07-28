/**
 */
package edu.kit.ipd.sdq.toometa.patterns.patterninstances;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatterninstancesPackage
 * @generated
 */
public interface PatterninstancesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PatterninstancesFactory eINSTANCE = edu.kit.ipd.sdq.toometa.patterns.patterninstances.impl.PatterninstancesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Pattern Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Instance</em>'.
	 * @generated
	 */
	PatternInstance createPatternInstance();

	/**
	 * Returns a new object of class '<em>Pattern Instance Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Instance Repository</em>'.
	 * @generated
	 */
	PatternInstanceRepository createPatternInstanceRepository();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PatterninstancesPackage getPatterninstancesPackage();

} //PatterninstancesFactory
