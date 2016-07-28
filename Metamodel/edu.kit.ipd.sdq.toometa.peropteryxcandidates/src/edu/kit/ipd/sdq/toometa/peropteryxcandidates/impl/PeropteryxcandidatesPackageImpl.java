/**
 */
package edu.kit.ipd.sdq.toometa.peropteryxcandidates.impl;

import edu.kit.ipd.sdq.toometa.archoptions.ArchoptionsPackage;

import edu.kit.ipd.sdq.toometa.peropteryxcandidates.PerOpteryxCandidate;
import edu.kit.ipd.sdq.toometa.peropteryxcandidates.PerOpteryxClassOption;
import edu.kit.ipd.sdq.toometa.peropteryxcandidates.PerOpteryxContinuousRangeOption;
import edu.kit.ipd.sdq.toometa.peropteryxcandidates.PerOpteryxDiscreteRangeOption;
import edu.kit.ipd.sdq.toometa.peropteryxcandidates.PerOpteryxOption;
import edu.kit.ipd.sdq.toometa.peropteryxcandidates.PeropteryxcandidatesFactory;
import edu.kit.ipd.sdq.toometa.peropteryxcandidates.PeropteryxcandidatesPackage;
import edu.kit.ipd.sdq.toometa.peropteryxcandidates.PredictedQualityValue;

import edu.kit.ipd.sdq.toometa.qualities.QualitiesPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PeropteryxcandidatesPackageImpl extends EPackageImpl implements PeropteryxcandidatesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass perOpteryxCandidateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predictedQualityValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass perOpteryxOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass perOpteryxDiscreteRangeOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass perOpteryxContinuousRangeOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass perOpteryxClassOptionEClass = null;

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
	 * @see edu.kit.ipd.sdq.toometa.peropteryxcandidates.PeropteryxcandidatesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PeropteryxcandidatesPackageImpl() {
		super(eNS_URI, PeropteryxcandidatesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PeropteryxcandidatesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PeropteryxcandidatesPackage init() {
		if (isInited) return (PeropteryxcandidatesPackage)EPackage.Registry.INSTANCE.getEPackage(PeropteryxcandidatesPackage.eNS_URI);

		// Obtain or create and register package
		PeropteryxcandidatesPackageImpl thePeropteryxcandidatesPackage = (PeropteryxcandidatesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PeropteryxcandidatesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PeropteryxcandidatesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ArchoptionsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePeropteryxcandidatesPackage.createPackageContents();

		// Initialize created meta-data
		thePeropteryxcandidatesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePeropteryxcandidatesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PeropteryxcandidatesPackage.eNS_URI, thePeropteryxcandidatesPackage);
		return thePeropteryxcandidatesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerOpteryxCandidate() {
		return perOpteryxCandidateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerOpteryxCandidate_SimulationQualities() {
		return (EReference)perOpteryxCandidateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredictedQualityValue() {
		return predictedQualityValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPredictedQualityValue_QualityValue() {
		return (EAttribute)predictedQualityValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPredictedQualityValue_QualityType() {
		return (EReference)predictedQualityValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerOpteryxOption() {
		return perOpteryxOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerOpteryxOption_PrimaryChanged() {
		return (EReference)perOpteryxOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerOpteryxOption_Value() {
		return (EAttribute)perOpteryxOptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerOpteryxDiscreteRangeOption() {
		return perOpteryxDiscreteRangeOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerOpteryxDiscreteRangeOption_ChosenValue() {
		return (EAttribute)perOpteryxDiscreteRangeOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerOpteryxContinuousRangeOption() {
		return perOpteryxContinuousRangeOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerOpteryxContinuousRangeOption_ChosenValue() {
		return (EAttribute)perOpteryxContinuousRangeOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerOpteryxClassOption() {
		return perOpteryxClassOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerOpteryxClassOption_ChosenValue() {
		return (EReference)perOpteryxClassOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeropteryxcandidatesFactory getPeropteryxcandidatesFactory() {
		return (PeropteryxcandidatesFactory)getEFactoryInstance();
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
		perOpteryxCandidateEClass = createEClass(PER_OPTERYX_CANDIDATE);
		createEReference(perOpteryxCandidateEClass, PER_OPTERYX_CANDIDATE__SIMULATION_QUALITIES);

		predictedQualityValueEClass = createEClass(PREDICTED_QUALITY_VALUE);
		createEAttribute(predictedQualityValueEClass, PREDICTED_QUALITY_VALUE__QUALITY_VALUE);
		createEReference(predictedQualityValueEClass, PREDICTED_QUALITY_VALUE__QUALITY_TYPE);

		perOpteryxOptionEClass = createEClass(PER_OPTERYX_OPTION);
		createEReference(perOpteryxOptionEClass, PER_OPTERYX_OPTION__PRIMARY_CHANGED);
		createEAttribute(perOpteryxOptionEClass, PER_OPTERYX_OPTION__VALUE);

		perOpteryxDiscreteRangeOptionEClass = createEClass(PER_OPTERYX_DISCRETE_RANGE_OPTION);
		createEAttribute(perOpteryxDiscreteRangeOptionEClass, PER_OPTERYX_DISCRETE_RANGE_OPTION__CHOSEN_VALUE);

		perOpteryxContinuousRangeOptionEClass = createEClass(PER_OPTERYX_CONTINUOUS_RANGE_OPTION);
		createEAttribute(perOpteryxContinuousRangeOptionEClass, PER_OPTERYX_CONTINUOUS_RANGE_OPTION__CHOSEN_VALUE);

		perOpteryxClassOptionEClass = createEClass(PER_OPTERYX_CLASS_OPTION);
		createEReference(perOpteryxClassOptionEClass, PER_OPTERYX_CLASS_OPTION__CHOSEN_VALUE);
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
		ArchoptionsPackage theArchoptionsPackage = (ArchoptionsPackage)EPackage.Registry.INSTANCE.getEPackage(ArchoptionsPackage.eNS_URI);
		QualitiesPackage theQualitiesPackage = (QualitiesPackage)EPackage.Registry.INSTANCE.getEPackage(QualitiesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		perOpteryxCandidateEClass.getESuperTypes().add(theArchoptionsPackage.getArchCandidate());
		perOpteryxOptionEClass.getESuperTypes().add(theArchoptionsPackage.getArchOption());
		perOpteryxDiscreteRangeOptionEClass.getESuperTypes().add(this.getPerOpteryxOption());
		perOpteryxContinuousRangeOptionEClass.getESuperTypes().add(this.getPerOpteryxOption());
		perOpteryxClassOptionEClass.getESuperTypes().add(this.getPerOpteryxOption());

		// Initialize classes and features; add operations and parameters
		initEClass(perOpteryxCandidateEClass, PerOpteryxCandidate.class, "PerOpteryxCandidate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPerOpteryxCandidate_SimulationQualities(), this.getPredictedQualityValue(), null, "simulationQualities", null, 0, -1, PerOpteryxCandidate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predictedQualityValueEClass, PredictedQualityValue.class, "PredictedQualityValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPredictedQualityValue_QualityValue(), ecorePackage.getEDoubleObject(), "qualityValue", null, 1, 1, PredictedQualityValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPredictedQualityValue_QualityType(), theQualitiesPackage.getQualityType(), null, "qualityType", null, 1, 1, PredictedQualityValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(perOpteryxOptionEClass, PerOpteryxOption.class, "PerOpteryxOption", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPerOpteryxOption_PrimaryChanged(), ecorePackage.getEObject(), null, "primaryChanged", null, 1, 1, PerOpteryxOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerOpteryxOption_Value(), ecorePackage.getEJavaObject(), "value", null, 1, 1, PerOpteryxOption.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(perOpteryxDiscreteRangeOptionEClass, PerOpteryxDiscreteRangeOption.class, "PerOpteryxDiscreteRangeOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerOpteryxDiscreteRangeOption_ChosenValue(), ecorePackage.getEInt(), "chosenValue", null, 1, 1, PerOpteryxDiscreteRangeOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(perOpteryxContinuousRangeOptionEClass, PerOpteryxContinuousRangeOption.class, "PerOpteryxContinuousRangeOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerOpteryxContinuousRangeOption_ChosenValue(), ecorePackage.getEDouble(), "chosenValue", null, 1, 1, PerOpteryxContinuousRangeOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(perOpteryxClassOptionEClass, PerOpteryxClassOption.class, "PerOpteryxClassOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPerOpteryxClassOption_ChosenValue(), ecorePackage.getEObject(), null, "chosenValue", null, 1, 1, PerOpteryxClassOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PeropteryxcandidatesPackageImpl
