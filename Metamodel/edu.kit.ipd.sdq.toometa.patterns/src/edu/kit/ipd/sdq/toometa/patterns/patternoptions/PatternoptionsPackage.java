/**
 */
package edu.kit.ipd.sdq.toometa.patterns.patternoptions;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import edu.kit.ipd.sdq.toometa.options.OptionsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see edu.kit.ipd.sdq.toometa.patterns.patternoptions.PatternoptionsFactory
 * @model kind="package"
 * @generated
 */
public interface PatternoptionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "patternoptions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.uka.de/edu.kit.ipd.sdq.toometa/patterns/patternoptions/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "patternoptions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PatternoptionsPackage eINSTANCE = edu.kit.ipd.sdq.toometa.patterns.patternoptions.impl.PatternoptionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.patterns.patternoptions.impl.PatternRationaleImpl <em>Pattern Rationale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.patterns.patternoptions.impl.PatternRationaleImpl
	 * @see edu.kit.ipd.sdq.toometa.patterns.patternoptions.impl.PatternoptionsPackageImpl#getPatternRationale()
	 * @generated
	 */
	int PATTERN_RATIONALE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_RATIONALE__ID = OptionsPackage.RATIONALE__ID;

	/**
	 * The feature id for the '<em><b>Rationale Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_RATIONALE__RATIONALE_TEXT = OptionsPackage.RATIONALE__RATIONALE_TEXT;

	/**
	 * The feature id for the '<em><b>Answers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_RATIONALE__ANSWERS = OptionsPackage.RATIONALE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Rationale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_RATIONALE_FEATURE_COUNT = OptionsPackage.RATIONALE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.patterns.patternoptions.impl.AnswerImpl <em>Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.patterns.patternoptions.impl.AnswerImpl
	 * @see edu.kit.ipd.sdq.toometa.patterns.patternoptions.impl.PatternoptionsPackageImpl#getAnswer()
	 * @generated
	 */
	int ANSWER = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Answer Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__ANSWER_TEXT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Question</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__TO_QUESTION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.patterns.patternoptions.impl.PatternOptionImpl <em>Pattern Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.patterns.patternoptions.impl.PatternOptionImpl
	 * @see edu.kit.ipd.sdq.toometa.patterns.patternoptions.impl.PatternoptionsPackageImpl#getPatternOption()
	 * @generated
	 */
	int PATTERN_OPTION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OPTION__ID = OptionsPackage.OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OPTION__RELATIONS = OptionsPackage.OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OPTION__CONFLICTS_WITH = OptionsPackage.OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OPTION__HAS_CONFLICTS = OptionsPackage.OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OPTION__DUPLICATE_OF = OptionsPackage.OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OPTION__HAS_DUPLICATES = OptionsPackage.OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OPTION__DEPENDS_ON = OptionsPackage.OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OPTION__HAS_DEPENDENTS = OptionsPackage.OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OPTION__PARENT_OF = OptionsPackage.OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OPTION__SUBPART_OF = OptionsPackage.OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OPTION__TRIGGER_OF = OptionsPackage.OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OPTION__TRIGGERED_BY = OptionsPackage.OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OPTION__RESOLVES = OptionsPackage.OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OPTION__RESOLVED_BY = OptionsPackage.OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OPTION__ALTERNATIVE_TO = OptionsPackage.OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OPTION__HAS_ALTERNATIVES = OptionsPackage.OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OPTION__COULD_RESOLVE = OptionsPackage.OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OPTION__COULD_BE_RESOLVED_BY = OptionsPackage.OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OPTION__STAKEHOLDER_OF = OptionsPackage.OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OPTION__HAS_STAKEHOLDERS = OptionsPackage.OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OPTION__SELECTED = OptionsPackage.OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OPTION__SELECTED_BY = OptionsPackage.OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OPTION__DESCRIPTION = OptionsPackage.OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OPTION__KEYWORDS = OptionsPackage.OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OPTION__REPOSITORY = OptionsPackage.OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OPTION__RATIONALE = OptionsPackage.OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OPTION__IS_MODELLED = OptionsPackage.OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OPTION__IS_IMPLEMENTED = OptionsPackage.OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OPTION__TIME_STAMP = OptionsPackage.OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OPTION__EFFECTS = OptionsPackage.OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OPTION__USED_TERMS = OptionsPackage.OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Patternrationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OPTION__PATTERNRATIONALE = OptionsPackage.OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OPTION_FEATURE_COUNT = OptionsPackage.OPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.patterns.patternoptions.ADMAnswerTypeEnum <em>ADM Answer Type Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.patterns.patternoptions.ADMAnswerTypeEnum
	 * @see edu.kit.ipd.sdq.toometa.patterns.patternoptions.impl.PatternoptionsPackageImpl#getADMAnswerTypeEnum()
	 * @generated
	 */
	int ADM_ANSWER_TYPE_ENUM = 3;


	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.patterns.patternoptions.PatternRationale <em>Pattern Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Rationale</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.patternoptions.PatternRationale
	 * @generated
	 */
	EClass getPatternRationale();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.toometa.patterns.patternoptions.PatternRationale#getAnswers <em>Answers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Answers</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.patternoptions.PatternRationale#getAnswers()
	 * @see #getPatternRationale()
	 * @generated
	 */
	EReference getPatternRationale_Answers();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.patterns.patternoptions.Answer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Answer</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.patternoptions.Answer
	 * @generated
	 */
	EClass getAnswer();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.patterns.patternoptions.Answer#getAnswerText <em>Answer Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Answer Text</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.patternoptions.Answer#getAnswerText()
	 * @see #getAnswer()
	 * @generated
	 */
	EAttribute getAnswer_AnswerText();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.toometa.patterns.patternoptions.Answer#getToQuestion <em>To Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Question</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.patternoptions.Answer#getToQuestion()
	 * @see #getAnswer()
	 * @generated
	 */
	EReference getAnswer_ToQuestion();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.patterns.patternoptions.PatternOption <em>Pattern Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Option</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.patternoptions.PatternOption
	 * @generated
	 */
	EClass getPatternOption();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.toometa.patterns.patternoptions.PatternOption#getPatternrationale <em>Patternrationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Patternrationale</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.patternoptions.PatternOption#getPatternrationale()
	 * @see #getPatternOption()
	 * @generated
	 */
	EReference getPatternOption_Patternrationale();

	/**
	 * Returns the meta object for enum '{@link edu.kit.ipd.sdq.toometa.patterns.patternoptions.ADMAnswerTypeEnum <em>ADM Answer Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ADM Answer Type Enum</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.patternoptions.ADMAnswerTypeEnum
	 * @generated
	 */
	EEnum getADMAnswerTypeEnum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PatternoptionsFactory getPatternoptionsFactory();

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
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.patterns.patternoptions.impl.PatternRationaleImpl <em>Pattern Rationale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.patterns.patternoptions.impl.PatternRationaleImpl
		 * @see edu.kit.ipd.sdq.toometa.patterns.patternoptions.impl.PatternoptionsPackageImpl#getPatternRationale()
		 * @generated
		 */
		EClass PATTERN_RATIONALE = eINSTANCE.getPatternRationale();

		/**
		 * The meta object literal for the '<em><b>Answers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_RATIONALE__ANSWERS = eINSTANCE.getPatternRationale_Answers();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.patterns.patternoptions.impl.AnswerImpl <em>Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.patterns.patternoptions.impl.AnswerImpl
		 * @see edu.kit.ipd.sdq.toometa.patterns.patternoptions.impl.PatternoptionsPackageImpl#getAnswer()
		 * @generated
		 */
		EClass ANSWER = eINSTANCE.getAnswer();

		/**
		 * The meta object literal for the '<em><b>Answer Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSWER__ANSWER_TEXT = eINSTANCE.getAnswer_AnswerText();

		/**
		 * The meta object literal for the '<em><b>To Question</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANSWER__TO_QUESTION = eINSTANCE.getAnswer_ToQuestion();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.patterns.patternoptions.impl.PatternOptionImpl <em>Pattern Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.patterns.patternoptions.impl.PatternOptionImpl
		 * @see edu.kit.ipd.sdq.toometa.patterns.patternoptions.impl.PatternoptionsPackageImpl#getPatternOption()
		 * @generated
		 */
		EClass PATTERN_OPTION = eINSTANCE.getPatternOption();

		/**
		 * The meta object literal for the '<em><b>Patternrationale</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_OPTION__PATTERNRATIONALE = eINSTANCE.getPatternOption_Patternrationale();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.patterns.patternoptions.ADMAnswerTypeEnum <em>ADM Answer Type Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.patterns.patternoptions.ADMAnswerTypeEnum
		 * @see edu.kit.ipd.sdq.toometa.patterns.patternoptions.impl.PatternoptionsPackageImpl#getADMAnswerTypeEnum()
		 * @generated
		 */
		EEnum ADM_ANSWER_TYPE_ENUM = eINSTANCE.getADMAnswerTypeEnum();

	}

} //PatternoptionsPackage
