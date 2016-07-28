/**
 */
package edu.kit.ipd.sdq.toometa.palladiorationales;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.toometa.palladiorationales.PalladiorationalesPackage
 * @generated
 */
public interface PalladiorationalesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PalladiorationalesFactory eINSTANCE = edu.kit.ipd.sdq.toometa.palladiorationales.impl.PalladiorationalesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Palladio Rationale</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Palladio Rationale</em>'.
	 * @generated
	 */
	PalladioRationale createPalladioRationale();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PalladiorationalesPackage getPalladiorationalesPackage();

} //PalladiorationalesFactory
