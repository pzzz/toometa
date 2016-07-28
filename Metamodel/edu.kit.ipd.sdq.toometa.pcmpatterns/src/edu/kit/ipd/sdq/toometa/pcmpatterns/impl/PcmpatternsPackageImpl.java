/**
 */
package edu.kit.ipd.sdq.toometa.pcmpatterns.impl;

import edu.kit.ipd.sdq.toometa.patterns.PatternsPackage;

import edu.kit.ipd.sdq.toometa.pcmpatterns.PCMConnector;
import edu.kit.ipd.sdq.toometa.pcmpatterns.PCMRole;
import edu.kit.ipd.sdq.toometa.pcmpatterns.PcmpatternsFactory;
import edu.kit.ipd.sdq.toometa.pcmpatterns.PcmpatternsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.pcm.core.composition.CompositionPackage;

import org.palladiosimulator.pcm.repository.RepositoryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PcmpatternsPackageImpl extends EPackageImpl implements PcmpatternsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcmRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcmConnectorEClass = null;

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
	 * @see edu.kit.ipd.sdq.toometa.pcmpatterns.PcmpatternsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PcmpatternsPackageImpl() {
		super(eNS_URI, PcmpatternsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PcmpatternsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PcmpatternsPackage init() {
		if (isInited) return (PcmpatternsPackage)EPackage.Registry.INSTANCE.getEPackage(PcmpatternsPackage.eNS_URI);

		// Obtain or create and register package
		PcmpatternsPackageImpl thePcmpatternsPackage = (PcmpatternsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PcmpatternsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PcmpatternsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PcmPackage.eINSTANCE.eClass();
		PatternsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePcmpatternsPackage.createPackageContents();

		// Initialize created meta-data
		thePcmpatternsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePcmpatternsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PcmpatternsPackage.eNS_URI, thePcmpatternsPackage);
		return thePcmpatternsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCMRole() {
		return pcmRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCMRole_OperationProvidedRole() {
		return (EReference)pcmRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCMConnector() {
		return pcmConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCMConnector_AssemblyConnector() {
		return (EReference)pcmConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PcmpatternsFactory getPcmpatternsFactory() {
		return (PcmpatternsFactory)getEFactoryInstance();
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
		pcmRoleEClass = createEClass(PCM_ROLE);
		createEReference(pcmRoleEClass, PCM_ROLE__OPERATION_PROVIDED_ROLE);

		pcmConnectorEClass = createEClass(PCM_CONNECTOR);
		createEReference(pcmConnectorEClass, PCM_CONNECTOR__ASSEMBLY_CONNECTOR);
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
		PatternsPackage thePatternsPackage = (PatternsPackage)EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI);
		RepositoryPackage theRepositoryPackage = (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);
		CompositionPackage theCompositionPackage = (CompositionPackage)EPackage.Registry.INSTANCE.getEPackage(CompositionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		pcmRoleEClass.getESuperTypes().add(thePatternsPackage.getRole());
		pcmConnectorEClass.getESuperTypes().add(thePatternsPackage.getConnector());

		// Initialize classes and features; add operations and parameters
		initEClass(pcmRoleEClass, PCMRole.class, "PCMRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPCMRole_OperationProvidedRole(), theRepositoryPackage.getOperationProvidedRole(), null, "operationProvidedRole", null, 0, 1, PCMRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcmConnectorEClass, PCMConnector.class, "PCMConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPCMConnector_AssemblyConnector(), theCompositionPackage.getAssemblyConnector(), null, "assemblyConnector", null, 0, 1, PCMConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PcmpatternsPackageImpl
