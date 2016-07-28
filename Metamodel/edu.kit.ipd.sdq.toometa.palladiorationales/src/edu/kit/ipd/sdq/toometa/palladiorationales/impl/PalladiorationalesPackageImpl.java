/**
 */
package edu.kit.ipd.sdq.toometa.palladiorationales.impl;

import edu.kit.ipd.sdq.toometa.options.OptionsPackage;

import edu.kit.ipd.sdq.toometa.palladiorationales.PalladioRationale;
import edu.kit.ipd.sdq.toometa.palladiorationales.PalladiorationalesFactory;
import edu.kit.ipd.sdq.toometa.palladiorationales.PalladiorationalesPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;

import org.palladiosimulator.edp2.models.Repository.RepositoryPackage;

import org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PalladiorationalesPackageImpl extends EPackageImpl implements PalladiorationalesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass palladioRationaleEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see edu.kit.ipd.sdq.toometa.palladiorationales.PalladiorationalesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PalladiorationalesPackageImpl() {
		super(eNS_URI, PalladiorationalesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PalladiorationalesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PalladiorationalesPackage init() {
		if (isInited) return (PalladiorationalesPackage)EPackage.Registry.INSTANCE.getEPackage(PalladiorationalesPackage.eNS_URI);

		// Obtain or create and register package
		PalladiorationalesPackageImpl thePalladiorationalesPackage = (PalladiorationalesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PalladiorationalesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PalladiorationalesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		OptionsPackage.eINSTANCE.eClass();
		ExperimentDataPackage.eINSTANCE.eClass();
		RepositoryPackage.eINSTANCE.eClass();
		MeasuringpointPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePalladiorationalesPackage.createPackageContents();

		// Initialize created meta-data
		thePalladiorationalesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePalladiorationalesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PalladiorationalesPackage.eNS_URI, thePalladiorationalesPackage);
		return thePalladiorationalesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPalladioRationale() {
		return palladioRationaleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPalladioRationale_PalladioResult() {
		return (EReference)palladioRationaleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PalladiorationalesFactory getPalladiorationalesFactory() {
		return (PalladiorationalesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		palladioRationaleEClass = createEClass(PALLADIO_RATIONALE);
		createEReference(palladioRationaleEClass, PALLADIO_RATIONALE__PALLADIO_RESULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		OptionsPackage theOptionsPackage = (OptionsPackage)EPackage.Registry.INSTANCE.getEPackage(OptionsPackage.eNS_URI);
		ExperimentDataPackage theExperimentDataPackage = (ExperimentDataPackage)EPackage.Registry.INSTANCE.getEPackage(ExperimentDataPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		palladioRationaleEClass.getESuperTypes().add(theOptionsPackage.getAnalysisRationale());

		// Initialize classes and features; add operations and parameters
		initEClass(palladioRationaleEClass, PalladioRationale.class, "PalladioRationale", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPalladioRationale_PalladioResult(), theExperimentDataPackage.getExperimentSetting(), null, "palladioResult", null, 0, 1, PalladioRationale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PalladiorationalesPackageImpl
