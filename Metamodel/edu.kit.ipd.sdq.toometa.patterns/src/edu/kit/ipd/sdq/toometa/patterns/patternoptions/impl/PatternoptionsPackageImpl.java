/**
 */
package edu.kit.ipd.sdq.toometa.patterns.patternoptions.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import edu.kit.ipd.sdq.toometa.options.OptionsPackage;

import edu.kit.ipd.sdq.toometa.patterns.PatternsPackage;

import edu.kit.ipd.sdq.toometa.patterns.impl.PatternsPackageImpl;

import edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatterninstancesPackage;

import edu.kit.ipd.sdq.toometa.patterns.patterninstances.impl.PatterninstancesPackageImpl;

import edu.kit.ipd.sdq.toometa.patterns.patternoptions.ADMAnswerTypeEnum;
import edu.kit.ipd.sdq.toometa.patterns.patternoptions.Answer;
import edu.kit.ipd.sdq.toometa.patterns.patternoptions.PatternOption;
import edu.kit.ipd.sdq.toometa.patterns.patternoptions.PatternRationale;
import edu.kit.ipd.sdq.toometa.patterns.patternoptions.PatternoptionsFactory;
import edu.kit.ipd.sdq.toometa.patterns.patternoptions.PatternoptionsPackage;

import edu.kit.ipd.sdq.toometa.patterns.questions.QuestionsPackage;

import edu.kit.ipd.sdq.toometa.patterns.questions.impl.QuestionsPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PatternoptionsPackageImpl extends EPackageImpl implements PatternoptionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternRationaleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass answerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum admAnswerTypeEnumEEnum = null;

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
	 * @see edu.kit.ipd.sdq.toometa.patterns.patternoptions.PatternoptionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PatternoptionsPackageImpl() {
		super(eNS_URI, PatternoptionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PatternoptionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PatternoptionsPackage init() {
		if (isInited) return (PatternoptionsPackage)EPackage.Registry.INSTANCE.getEPackage(PatternoptionsPackage.eNS_URI);

		// Obtain or create and register package
		PatternoptionsPackageImpl thePatternoptionsPackage = (PatternoptionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PatternoptionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PatternoptionsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		OptionsPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		PatternsPackageImpl thePatternsPackage = (PatternsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI) instanceof PatternsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI) : PatternsPackage.eINSTANCE);
		QuestionsPackageImpl theQuestionsPackage = (QuestionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QuestionsPackage.eNS_URI) instanceof QuestionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QuestionsPackage.eNS_URI) : QuestionsPackage.eINSTANCE);
		PatterninstancesPackageImpl thePatterninstancesPackage = (PatterninstancesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatterninstancesPackage.eNS_URI) instanceof PatterninstancesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatterninstancesPackage.eNS_URI) : PatterninstancesPackage.eINSTANCE);

		// Create package meta-data objects
		thePatternoptionsPackage.createPackageContents();
		thePatternsPackage.createPackageContents();
		theQuestionsPackage.createPackageContents();
		thePatterninstancesPackage.createPackageContents();

		// Initialize created meta-data
		thePatternoptionsPackage.initializePackageContents();
		thePatternsPackage.initializePackageContents();
		theQuestionsPackage.initializePackageContents();
		thePatterninstancesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePatternoptionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PatternoptionsPackage.eNS_URI, thePatternoptionsPackage);
		return thePatternoptionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatternRationale() {
		return patternRationaleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternRationale_Answers() {
		return (EReference)patternRationaleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnswer() {
		return answerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnswer_AnswerText() {
		return (EAttribute)answerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnswer_ToQuestion() {
		return (EReference)answerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatternOption() {
		return patternOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternOption_Patternrationale() {
		return (EReference)patternOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getADMAnswerTypeEnum() {
		return admAnswerTypeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternoptionsFactory getPatternoptionsFactory() {
		return (PatternoptionsFactory)getEFactoryInstance();
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
		patternRationaleEClass = createEClass(PATTERN_RATIONALE);
		createEReference(patternRationaleEClass, PATTERN_RATIONALE__ANSWERS);

		answerEClass = createEClass(ANSWER);
		createEAttribute(answerEClass, ANSWER__ANSWER_TEXT);
		createEReference(answerEClass, ANSWER__TO_QUESTION);

		patternOptionEClass = createEClass(PATTERN_OPTION);
		createEReference(patternOptionEClass, PATTERN_OPTION__PATTERNRATIONALE);

		// Create enums
		admAnswerTypeEnumEEnum = createEEnum(ADM_ANSWER_TYPE_ENUM);
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
		IdentifierPackage theIdentifierPackage = (IdentifierPackage)EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI);
		QuestionsPackage theQuestionsPackage = (QuestionsPackage)EPackage.Registry.INSTANCE.getEPackage(QuestionsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		patternRationaleEClass.getESuperTypes().add(theOptionsPackage.getRationale());
		answerEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		patternOptionEClass.getESuperTypes().add(theOptionsPackage.getOption());

		// Initialize classes and features; add operations and parameters
		initEClass(patternRationaleEClass, PatternRationale.class, "PatternRationale", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPatternRationale_Answers(), this.getAnswer(), null, "answers", null, 0, -1, PatternRationale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(answerEClass, Answer.class, "Answer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnswer_AnswerText(), this.getADMAnswerTypeEnum(), "answerText", "noAnswer", 0, 1, Answer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnswer_ToQuestion(), theQuestionsPackage.getQuestion(), null, "toQuestion", null, 1, 1, Answer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patternOptionEClass, PatternOption.class, "PatternOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPatternOption_Patternrationale(), this.getPatternRationale(), null, "patternrationale", null, 0, -1, PatternOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(admAnswerTypeEnumEEnum, ADMAnswerTypeEnum.class, "ADMAnswerTypeEnum");
		addEEnumLiteral(admAnswerTypeEnumEEnum, ADMAnswerTypeEnum.NO_ANSWER);
		addEEnumLiteral(admAnswerTypeEnumEEnum, ADMAnswerTypeEnum.YES);
		addEEnumLiteral(admAnswerTypeEnumEEnum, ADMAnswerTypeEnum.NO);
		addEEnumLiteral(admAnswerTypeEnumEEnum, ADMAnswerTypeEnum.DO_NOT_KNOW);
	}

} //PatternoptionsPackageImpl
