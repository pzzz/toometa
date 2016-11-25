/**
 */
package pcmusagemodeladapter.impl;

import edu.kit.ipd.sdq.toometa.requirements.RequirementsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.pcm.usagemodel.UsagemodelPackage;

import pcmusagemodeladapter.PCMUsageModel;
import pcmusagemodeladapter.PcmusagemodeladapterFactory;
import pcmusagemodeladapter.PcmusagemodeladapterPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PcmusagemodeladapterPackageImpl extends EPackageImpl implements PcmusagemodeladapterPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcmUsageModelEClass = null;

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
	 * @see pcmusagemodeladapter.PcmusagemodeladapterPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PcmusagemodeladapterPackageImpl() {
		super(eNS_URI, PcmusagemodeladapterFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PcmusagemodeladapterPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PcmusagemodeladapterPackage init() {
		if (isInited) return (PcmusagemodeladapterPackage)EPackage.Registry.INSTANCE.getEPackage(PcmusagemodeladapterPackage.eNS_URI);

		// Obtain or create and register package
		PcmusagemodeladapterPackageImpl thePcmusagemodeladapterPackage = (PcmusagemodeladapterPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PcmusagemodeladapterPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PcmusagemodeladapterPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PcmPackage.eINSTANCE.eClass();
		RequirementsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePcmusagemodeladapterPackage.createPackageContents();

		// Initialize created meta-data
		thePcmusagemodeladapterPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePcmusagemodeladapterPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PcmusagemodeladapterPackage.eNS_URI, thePcmusagemodeladapterPackage);
		return thePcmusagemodeladapterPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCMUsageModel() {
		return pcmUsageModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCMUsageModel_PcmUsageModel() {
		return (EReference)pcmUsageModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PcmusagemodeladapterFactory getPcmusagemodeladapterFactory() {
		return (PcmusagemodeladapterFactory)getEFactoryInstance();
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
		pcmUsageModelEClass = createEClass(PCM_USAGE_MODEL);
		createEReference(pcmUsageModelEClass, PCM_USAGE_MODEL__PCM_USAGE_MODEL);
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
		RequirementsPackage theRequirementsPackage = (RequirementsPackage)EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI);
		UsagemodelPackage theUsagemodelPackage = (UsagemodelPackage)EPackage.Registry.INSTANCE.getEPackage(UsagemodelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		pcmUsageModelEClass.getESuperTypes().add(theRequirementsPackage.getUsageModelAdapter());

		// Initialize classes and features; add operations and parameters
		initEClass(pcmUsageModelEClass, PCMUsageModel.class, "PCMUsageModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPCMUsageModel_PcmUsageModel(), theUsagemodelPackage.getUsageModel(), null, "pcmUsageModel", null, 1, 1, PCMUsageModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PcmusagemodeladapterPackageImpl
