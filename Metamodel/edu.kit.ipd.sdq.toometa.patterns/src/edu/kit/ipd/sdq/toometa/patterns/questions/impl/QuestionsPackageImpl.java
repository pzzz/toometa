/**
 */
package edu.kit.ipd.sdq.toometa.patterns.questions.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import edu.kit.ipd.sdq.toometa.effects.EffectsPackage;

import edu.kit.ipd.sdq.toometa.glossary.GlossaryPackage;

import edu.kit.ipd.sdq.toometa.options.OptionsPackage;

import edu.kit.ipd.sdq.toometa.patterns.PatternsPackage;

import edu.kit.ipd.sdq.toometa.patterns.impl.PatternsPackageImpl;

import edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatterninstancesPackage;

import edu.kit.ipd.sdq.toometa.patterns.patterninstances.impl.PatterninstancesPackageImpl;

import edu.kit.ipd.sdq.toometa.patterns.patternoptions.PatternoptionsPackage;

import edu.kit.ipd.sdq.toometa.patterns.patternoptions.impl.PatternoptionsPackageImpl;

import edu.kit.ipd.sdq.toometa.patterns.questions.ConsequenceQuestion;
import edu.kit.ipd.sdq.toometa.patterns.questions.GoalQuestion;
import edu.kit.ipd.sdq.toometa.patterns.questions.IntentQuestion;
import edu.kit.ipd.sdq.toometa.patterns.questions.Question;
import edu.kit.ipd.sdq.toometa.patterns.questions.QuestionRepository;
import edu.kit.ipd.sdq.toometa.patterns.questions.QuestionsFactory;
import edu.kit.ipd.sdq.toometa.patterns.questions.QuestionsPackage;
import edu.kit.ipd.sdq.toometa.patterns.questions.VariantQuestion;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
public class QuestionsPackageImpl extends EPackageImpl implements QuestionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goalQuestionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variantQuestionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consequenceQuestionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intentQuestionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionEClass = null;

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
	 * @see edu.kit.ipd.sdq.toometa.patterns.questions.QuestionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QuestionsPackageImpl() {
		super(eNS_URI, QuestionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QuestionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QuestionsPackage init() {
		if (isInited) return (QuestionsPackage)EPackage.Registry.INSTANCE.getEPackage(QuestionsPackage.eNS_URI);

		// Obtain or create and register package
		QuestionsPackageImpl theQuestionsPackage = (QuestionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof QuestionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new QuestionsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		OptionsPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		PatternsPackageImpl thePatternsPackage = (PatternsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI) instanceof PatternsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI) : PatternsPackage.eINSTANCE);
		PatternoptionsPackageImpl thePatternoptionsPackage = (PatternoptionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternoptionsPackage.eNS_URI) instanceof PatternoptionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternoptionsPackage.eNS_URI) : PatternoptionsPackage.eINSTANCE);
		PatterninstancesPackageImpl thePatterninstancesPackage = (PatterninstancesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatterninstancesPackage.eNS_URI) instanceof PatterninstancesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatterninstancesPackage.eNS_URI) : PatterninstancesPackage.eINSTANCE);

		// Create package meta-data objects
		theQuestionsPackage.createPackageContents();
		thePatternsPackage.createPackageContents();
		thePatternoptionsPackage.createPackageContents();
		thePatterninstancesPackage.createPackageContents();

		// Initialize created meta-data
		theQuestionsPackage.initializePackageContents();
		thePatternsPackage.initializePackageContents();
		thePatternoptionsPackage.initializePackageContents();
		thePatterninstancesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQuestionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QuestionsPackage.eNS_URI, theQuestionsPackage);
		return theQuestionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionRepository() {
		return questionRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionRepository_Questions() {
		return (EReference)questionRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoalQuestion() {
		return goalQuestionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariantQuestion() {
		return variantQuestionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConsequenceQuestion() {
		return consequenceQuestionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntentQuestion() {
		return intentQuestionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestion() {
		return questionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestion_Text() {
		return (EAttribute)questionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestion_QuestionRepository() {
		return (EReference)questionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestion_HasQualityEffect() {
		return (EReference)questionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestion_Terms() {
		return (EReference)questionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionsFactory getQuestionsFactory() {
		return (QuestionsFactory)getEFactoryInstance();
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
		questionRepositoryEClass = createEClass(QUESTION_REPOSITORY);
		createEReference(questionRepositoryEClass, QUESTION_REPOSITORY__QUESTIONS);

		goalQuestionEClass = createEClass(GOAL_QUESTION);

		variantQuestionEClass = createEClass(VARIANT_QUESTION);

		consequenceQuestionEClass = createEClass(CONSEQUENCE_QUESTION);

		intentQuestionEClass = createEClass(INTENT_QUESTION);

		questionEClass = createEClass(QUESTION);
		createEAttribute(questionEClass, QUESTION__TEXT);
		createEReference(questionEClass, QUESTION__QUESTION_REPOSITORY);
		createEReference(questionEClass, QUESTION__HAS_QUALITY_EFFECT);
		createEReference(questionEClass, QUESTION__TERMS);
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
		IdentifierPackage theIdentifierPackage = (IdentifierPackage)EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI);
		EffectsPackage theEffectsPackage = (EffectsPackage)EPackage.Registry.INSTANCE.getEPackage(EffectsPackage.eNS_URI);
		GlossaryPackage theGlossaryPackage = (GlossaryPackage)EPackage.Registry.INSTANCE.getEPackage(GlossaryPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		questionRepositoryEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		goalQuestionEClass.getESuperTypes().add(this.getQuestion());
		variantQuestionEClass.getESuperTypes().add(this.getQuestion());
		consequenceQuestionEClass.getESuperTypes().add(this.getQuestion());
		intentQuestionEClass.getESuperTypes().add(this.getQuestion());
		questionEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());

		// Initialize classes and features; add operations and parameters
		initEClass(questionRepositoryEClass, QuestionRepository.class, "QuestionRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuestionRepository_Questions(), this.getQuestion(), this.getQuestion_QuestionRepository(), "questions", null, 0, -1, QuestionRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(goalQuestionEClass, GoalQuestion.class, "GoalQuestion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variantQuestionEClass, VariantQuestion.class, "VariantQuestion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(consequenceQuestionEClass, ConsequenceQuestion.class, "ConsequenceQuestion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(intentQuestionEClass, IntentQuestion.class, "IntentQuestion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(questionEClass, Question.class, "Question", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuestion_Text(), ecorePackage.getEString(), "text", null, 1, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestion_QuestionRepository(), this.getQuestionRepository(), this.getQuestionRepository_Questions(), "questionRepository", null, 1, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestion_HasQualityEffect(), theEffectsPackage.getQualityEffect(), null, "hasQualityEffect", null, 0, -1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestion_Terms(), theGlossaryPackage.getGlossaryTerm(), null, "terms", null, 0, -1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //QuestionsPackageImpl
