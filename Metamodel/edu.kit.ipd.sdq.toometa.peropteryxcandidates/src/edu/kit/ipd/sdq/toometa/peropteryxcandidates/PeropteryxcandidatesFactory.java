/**
 */
package edu.kit.ipd.sdq.toometa.peropteryxcandidates;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.toometa.peropteryxcandidates.PeropteryxcandidatesPackage
 * @generated
 */
public interface PeropteryxcandidatesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PeropteryxcandidatesFactory eINSTANCE = edu.kit.ipd.sdq.toometa.peropteryxcandidates.impl.PeropteryxcandidatesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Per Opteryx Candidate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Per Opteryx Candidate</em>'.
	 * @generated
	 */
	PerOpteryxCandidate createPerOpteryxCandidate();

	/**
	 * Returns a new object of class '<em>Predicted Quality Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predicted Quality Value</em>'.
	 * @generated
	 */
	PredictedQualityValue createPredictedQualityValue();

	/**
	 * Returns a new object of class '<em>Per Opteryx Discrete Range Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Per Opteryx Discrete Range Option</em>'.
	 * @generated
	 */
	PerOpteryxDiscreteRangeOption createPerOpteryxDiscreteRangeOption();

	/**
	 * Returns a new object of class '<em>Per Opteryx Continuous Range Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Per Opteryx Continuous Range Option</em>'.
	 * @generated
	 */
	PerOpteryxContinuousRangeOption createPerOpteryxContinuousRangeOption();

	/**
	 * Returns a new object of class '<em>Per Opteryx Class Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Per Opteryx Class Option</em>'.
	 * @generated
	 */
	PerOpteryxClassOption createPerOpteryxClassOption();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PeropteryxcandidatesPackage getPeropteryxcandidatesPackage();

} //PeropteryxcandidatesFactory
