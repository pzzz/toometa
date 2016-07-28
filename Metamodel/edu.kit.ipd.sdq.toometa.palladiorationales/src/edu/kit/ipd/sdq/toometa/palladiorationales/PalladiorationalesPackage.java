/**
 */
package edu.kit.ipd.sdq.toometa.palladiorationales;

import edu.kit.ipd.sdq.toometa.options.OptionsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.toometa.palladiorationales.PalladiorationalesFactory
 * @model kind="package"
 * @generated
 */
public interface PalladiorationalesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "palladiorationales";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.kit.edu/toometa/palladiorationales/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "palladiorationales";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PalladiorationalesPackage eINSTANCE = edu.kit.ipd.sdq.toometa.palladiorationales.impl.PalladiorationalesPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.palladiorationales.impl.PalladioRationaleImpl <em>Palladio Rationale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.palladiorationales.impl.PalladioRationaleImpl
	 * @see edu.kit.ipd.sdq.toometa.palladiorationales.impl.PalladiorationalesPackageImpl#getPalladioRationale()
	 * @generated
	 */
	int PALLADIO_RATIONALE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALLADIO_RATIONALE__ID = OptionsPackage.ANALYSIS_RATIONALE__ID;

	/**
	 * The feature id for the '<em><b>Rationale Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALLADIO_RATIONALE__RATIONALE_TEXT = OptionsPackage.ANALYSIS_RATIONALE__RATIONALE_TEXT;

	/**
	 * The feature id for the '<em><b>Palladio Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALLADIO_RATIONALE__PALLADIO_RESULT = OptionsPackage.ANALYSIS_RATIONALE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Palladio Rationale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALLADIO_RATIONALE_FEATURE_COUNT = OptionsPackage.ANALYSIS_RATIONALE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.palladiorationales.PalladioRationale <em>Palladio Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Palladio Rationale</em>'.
	 * @see edu.kit.ipd.sdq.toometa.palladiorationales.PalladioRationale
	 * @generated
	 */
	EClass getPalladioRationale();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.toometa.palladiorationales.PalladioRationale#getPalladioResult <em>Palladio Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Palladio Result</em>'.
	 * @see edu.kit.ipd.sdq.toometa.palladiorationales.PalladioRationale#getPalladioResult()
	 * @see #getPalladioRationale()
	 * @generated
	 */
	EReference getPalladioRationale_PalladioResult();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PalladiorationalesFactory getPalladiorationalesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.palladiorationales.impl.PalladioRationaleImpl <em>Palladio Rationale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.palladiorationales.impl.PalladioRationaleImpl
		 * @see edu.kit.ipd.sdq.toometa.palladiorationales.impl.PalladiorationalesPackageImpl#getPalladioRationale()
		 * @generated
		 */
		EClass PALLADIO_RATIONALE = eINSTANCE.getPalladioRationale();

		/**
		 * The meta object literal for the '<em><b>Palladio Result</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PALLADIO_RATIONALE__PALLADIO_RESULT = eINSTANCE.getPalladioRationale_PalladioResult();

	}

} //PalladiorationalesPackage
