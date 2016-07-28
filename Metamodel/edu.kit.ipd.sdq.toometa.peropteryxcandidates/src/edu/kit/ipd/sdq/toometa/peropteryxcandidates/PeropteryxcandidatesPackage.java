/**
 */
package edu.kit.ipd.sdq.toometa.peropteryxcandidates;

import edu.kit.ipd.sdq.toometa.archoptions.ArchoptionsPackage;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see edu.kit.ipd.sdq.toometa.peropteryxcandidates.PeropteryxcandidatesFactory
 * @model kind="package"
 * @generated
 */
public interface PeropteryxcandidatesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "peropteryxcandidates";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.kit.edu/toometa/peropteryxcandidates/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "peropteryxcandidates";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PeropteryxcandidatesPackage eINSTANCE = edu.kit.ipd.sdq.toometa.peropteryxcandidates.impl.PeropteryxcandidatesPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.peropteryxcandidates.impl.PerOpteryxCandidateImpl <em>Per Opteryx Candidate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.peropteryxcandidates.impl.PerOpteryxCandidateImpl
	 * @see edu.kit.ipd.sdq.toometa.peropteryxcandidates.impl.PeropteryxcandidatesPackageImpl#getPerOpteryxCandidate()
	 * @generated
	 */
	int PER_OPTERYX_CANDIDATE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CANDIDATE__ID = ArchoptionsPackage.ARCH_CANDIDATE__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CANDIDATE__RELATIONS = ArchoptionsPackage.ARCH_CANDIDATE__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CANDIDATE__CONFLICTS_WITH = ArchoptionsPackage.ARCH_CANDIDATE__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CANDIDATE__HAS_CONFLICTS = ArchoptionsPackage.ARCH_CANDIDATE__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CANDIDATE__DUPLICATE_OF = ArchoptionsPackage.ARCH_CANDIDATE__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CANDIDATE__HAS_DUPLICATES = ArchoptionsPackage.ARCH_CANDIDATE__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CANDIDATE__DEPENDS_ON = ArchoptionsPackage.ARCH_CANDIDATE__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CANDIDATE__HAS_DEPENDENTS = ArchoptionsPackage.ARCH_CANDIDATE__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CANDIDATE__PARENT_OF = ArchoptionsPackage.ARCH_CANDIDATE__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CANDIDATE__SUBPART_OF = ArchoptionsPackage.ARCH_CANDIDATE__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CANDIDATE__TRIGGER_OF = ArchoptionsPackage.ARCH_CANDIDATE__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CANDIDATE__TRIGGERED_BY = ArchoptionsPackage.ARCH_CANDIDATE__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CANDIDATE__RESOLVES = ArchoptionsPackage.ARCH_CANDIDATE__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CANDIDATE__RESOLVED_BY = ArchoptionsPackage.ARCH_CANDIDATE__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CANDIDATE__ALTERNATIVE_TO = ArchoptionsPackage.ARCH_CANDIDATE__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CANDIDATE__HAS_ALTERNATIVES = ArchoptionsPackage.ARCH_CANDIDATE__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CANDIDATE__COULD_RESOLVE = ArchoptionsPackage.ARCH_CANDIDATE__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CANDIDATE__COULD_BE_RESOLVED_BY = ArchoptionsPackage.ARCH_CANDIDATE__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CANDIDATE__STAKEHOLDER_OF = ArchoptionsPackage.ARCH_CANDIDATE__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CANDIDATE__HAS_STAKEHOLDERS = ArchoptionsPackage.ARCH_CANDIDATE__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CANDIDATE__SELECTED = ArchoptionsPackage.ARCH_CANDIDATE__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CANDIDATE__SELECTED_BY = ArchoptionsPackage.ARCH_CANDIDATE__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CANDIDATE__DESCRIPTION = ArchoptionsPackage.ARCH_CANDIDATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CANDIDATE__KEYWORDS = ArchoptionsPackage.ARCH_CANDIDATE__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CANDIDATE__REPOSITORY = ArchoptionsPackage.ARCH_CANDIDATE__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CANDIDATE__RATIONALE = ArchoptionsPackage.ARCH_CANDIDATE__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CANDIDATE__IS_MODELLED = ArchoptionsPackage.ARCH_CANDIDATE__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CANDIDATE__IS_IMPLEMENTED = ArchoptionsPackage.ARCH_CANDIDATE__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CANDIDATE__TIME_STAMP = ArchoptionsPackage.ARCH_CANDIDATE__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CANDIDATE__EFFECTS = ArchoptionsPackage.ARCH_CANDIDATE__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CANDIDATE__USED_TERMS = ArchoptionsPackage.ARCH_CANDIDATE__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CANDIDATE__ANALYSIS_RATIONALE = ArchoptionsPackage.ARCH_CANDIDATE__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Sub Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CANDIDATE__SUB_OPTIONS = ArchoptionsPackage.ARCH_CANDIDATE__SUB_OPTIONS;

	/**
	 * The feature id for the '<em><b>Simulation Qualities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CANDIDATE__SIMULATION_QUALITIES = ArchoptionsPackage.ARCH_CANDIDATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Per Opteryx Candidate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CANDIDATE_FEATURE_COUNT = ArchoptionsPackage.ARCH_CANDIDATE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.peropteryxcandidates.impl.PredictedQualityValueImpl <em>Predicted Quality Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.peropteryxcandidates.impl.PredictedQualityValueImpl
	 * @see edu.kit.ipd.sdq.toometa.peropteryxcandidates.impl.PeropteryxcandidatesPackageImpl#getPredictedQualityValue()
	 * @generated
	 */
	int PREDICTED_QUALITY_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Quality Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTED_QUALITY_VALUE__QUALITY_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Quality Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTED_QUALITY_VALUE__QUALITY_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Predicted Quality Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTED_QUALITY_VALUE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.peropteryxcandidates.impl.PerOpteryxOptionImpl <em>Per Opteryx Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.peropteryxcandidates.impl.PerOpteryxOptionImpl
	 * @see edu.kit.ipd.sdq.toometa.peropteryxcandidates.impl.PeropteryxcandidatesPackageImpl#getPerOpteryxOption()
	 * @generated
	 */
	int PER_OPTERYX_OPTION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_OPTION__ID = ArchoptionsPackage.ARCH_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_OPTION__RELATIONS = ArchoptionsPackage.ARCH_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_OPTION__CONFLICTS_WITH = ArchoptionsPackage.ARCH_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_OPTION__HAS_CONFLICTS = ArchoptionsPackage.ARCH_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_OPTION__DUPLICATE_OF = ArchoptionsPackage.ARCH_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_OPTION__HAS_DUPLICATES = ArchoptionsPackage.ARCH_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_OPTION__DEPENDS_ON = ArchoptionsPackage.ARCH_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_OPTION__HAS_DEPENDENTS = ArchoptionsPackage.ARCH_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_OPTION__PARENT_OF = ArchoptionsPackage.ARCH_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_OPTION__SUBPART_OF = ArchoptionsPackage.ARCH_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_OPTION__TRIGGER_OF = ArchoptionsPackage.ARCH_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_OPTION__TRIGGERED_BY = ArchoptionsPackage.ARCH_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_OPTION__RESOLVES = ArchoptionsPackage.ARCH_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_OPTION__RESOLVED_BY = ArchoptionsPackage.ARCH_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_OPTION__ALTERNATIVE_TO = ArchoptionsPackage.ARCH_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_OPTION__HAS_ALTERNATIVES = ArchoptionsPackage.ARCH_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_OPTION__COULD_RESOLVE = ArchoptionsPackage.ARCH_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_OPTION__COULD_BE_RESOLVED_BY = ArchoptionsPackage.ARCH_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_OPTION__STAKEHOLDER_OF = ArchoptionsPackage.ARCH_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_OPTION__HAS_STAKEHOLDERS = ArchoptionsPackage.ARCH_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_OPTION__SELECTED = ArchoptionsPackage.ARCH_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_OPTION__SELECTED_BY = ArchoptionsPackage.ARCH_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_OPTION__DESCRIPTION = ArchoptionsPackage.ARCH_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_OPTION__KEYWORDS = ArchoptionsPackage.ARCH_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_OPTION__REPOSITORY = ArchoptionsPackage.ARCH_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_OPTION__RATIONALE = ArchoptionsPackage.ARCH_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_OPTION__IS_MODELLED = ArchoptionsPackage.ARCH_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_OPTION__IS_IMPLEMENTED = ArchoptionsPackage.ARCH_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_OPTION__TIME_STAMP = ArchoptionsPackage.ARCH_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_OPTION__EFFECTS = ArchoptionsPackage.ARCH_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_OPTION__USED_TERMS = ArchoptionsPackage.ARCH_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_OPTION__ANALYSIS_RATIONALE = ArchoptionsPackage.ARCH_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_OPTION__PRIMARY_CHANGED = ArchoptionsPackage.ARCH_OPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_OPTION__VALUE = ArchoptionsPackage.ARCH_OPTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Per Opteryx Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_OPTION_FEATURE_COUNT = ArchoptionsPackage.ARCH_OPTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.peropteryxcandidates.impl.PerOpteryxDiscreteRangeOptionImpl <em>Per Opteryx Discrete Range Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.peropteryxcandidates.impl.PerOpteryxDiscreteRangeOptionImpl
	 * @see edu.kit.ipd.sdq.toometa.peropteryxcandidates.impl.PeropteryxcandidatesPackageImpl#getPerOpteryxDiscreteRangeOption()
	 * @generated
	 */
	int PER_OPTERYX_DISCRETE_RANGE_OPTION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_DISCRETE_RANGE_OPTION__ID = PER_OPTERYX_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_DISCRETE_RANGE_OPTION__RELATIONS = PER_OPTERYX_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_DISCRETE_RANGE_OPTION__CONFLICTS_WITH = PER_OPTERYX_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_DISCRETE_RANGE_OPTION__HAS_CONFLICTS = PER_OPTERYX_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_DISCRETE_RANGE_OPTION__DUPLICATE_OF = PER_OPTERYX_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_DISCRETE_RANGE_OPTION__HAS_DUPLICATES = PER_OPTERYX_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_DISCRETE_RANGE_OPTION__DEPENDS_ON = PER_OPTERYX_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_DISCRETE_RANGE_OPTION__HAS_DEPENDENTS = PER_OPTERYX_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_DISCRETE_RANGE_OPTION__PARENT_OF = PER_OPTERYX_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_DISCRETE_RANGE_OPTION__SUBPART_OF = PER_OPTERYX_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_DISCRETE_RANGE_OPTION__TRIGGER_OF = PER_OPTERYX_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_DISCRETE_RANGE_OPTION__TRIGGERED_BY = PER_OPTERYX_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_DISCRETE_RANGE_OPTION__RESOLVES = PER_OPTERYX_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_DISCRETE_RANGE_OPTION__RESOLVED_BY = PER_OPTERYX_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_DISCRETE_RANGE_OPTION__ALTERNATIVE_TO = PER_OPTERYX_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_DISCRETE_RANGE_OPTION__HAS_ALTERNATIVES = PER_OPTERYX_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_DISCRETE_RANGE_OPTION__COULD_RESOLVE = PER_OPTERYX_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_DISCRETE_RANGE_OPTION__COULD_BE_RESOLVED_BY = PER_OPTERYX_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_DISCRETE_RANGE_OPTION__STAKEHOLDER_OF = PER_OPTERYX_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_DISCRETE_RANGE_OPTION__HAS_STAKEHOLDERS = PER_OPTERYX_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_DISCRETE_RANGE_OPTION__SELECTED = PER_OPTERYX_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_DISCRETE_RANGE_OPTION__SELECTED_BY = PER_OPTERYX_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_DISCRETE_RANGE_OPTION__DESCRIPTION = PER_OPTERYX_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_DISCRETE_RANGE_OPTION__KEYWORDS = PER_OPTERYX_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_DISCRETE_RANGE_OPTION__REPOSITORY = PER_OPTERYX_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_DISCRETE_RANGE_OPTION__RATIONALE = PER_OPTERYX_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_DISCRETE_RANGE_OPTION__IS_MODELLED = PER_OPTERYX_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_DISCRETE_RANGE_OPTION__IS_IMPLEMENTED = PER_OPTERYX_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_DISCRETE_RANGE_OPTION__TIME_STAMP = PER_OPTERYX_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_DISCRETE_RANGE_OPTION__EFFECTS = PER_OPTERYX_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_DISCRETE_RANGE_OPTION__USED_TERMS = PER_OPTERYX_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_DISCRETE_RANGE_OPTION__ANALYSIS_RATIONALE = PER_OPTERYX_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_DISCRETE_RANGE_OPTION__PRIMARY_CHANGED = PER_OPTERYX_OPTION__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_DISCRETE_RANGE_OPTION__VALUE = PER_OPTERYX_OPTION__VALUE;

	/**
	 * The feature id for the '<em><b>Chosen Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_DISCRETE_RANGE_OPTION__CHOSEN_VALUE = PER_OPTERYX_OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Per Opteryx Discrete Range Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_DISCRETE_RANGE_OPTION_FEATURE_COUNT = PER_OPTERYX_OPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.peropteryxcandidates.impl.PerOpteryxContinuousRangeOptionImpl <em>Per Opteryx Continuous Range Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.peropteryxcandidates.impl.PerOpteryxContinuousRangeOptionImpl
	 * @see edu.kit.ipd.sdq.toometa.peropteryxcandidates.impl.PeropteryxcandidatesPackageImpl#getPerOpteryxContinuousRangeOption()
	 * @generated
	 */
	int PER_OPTERYX_CONTINUOUS_RANGE_OPTION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CONTINUOUS_RANGE_OPTION__ID = PER_OPTERYX_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CONTINUOUS_RANGE_OPTION__RELATIONS = PER_OPTERYX_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CONTINUOUS_RANGE_OPTION__CONFLICTS_WITH = PER_OPTERYX_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CONTINUOUS_RANGE_OPTION__HAS_CONFLICTS = PER_OPTERYX_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CONTINUOUS_RANGE_OPTION__DUPLICATE_OF = PER_OPTERYX_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CONTINUOUS_RANGE_OPTION__HAS_DUPLICATES = PER_OPTERYX_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CONTINUOUS_RANGE_OPTION__DEPENDS_ON = PER_OPTERYX_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CONTINUOUS_RANGE_OPTION__HAS_DEPENDENTS = PER_OPTERYX_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CONTINUOUS_RANGE_OPTION__PARENT_OF = PER_OPTERYX_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CONTINUOUS_RANGE_OPTION__SUBPART_OF = PER_OPTERYX_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CONTINUOUS_RANGE_OPTION__TRIGGER_OF = PER_OPTERYX_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CONTINUOUS_RANGE_OPTION__TRIGGERED_BY = PER_OPTERYX_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CONTINUOUS_RANGE_OPTION__RESOLVES = PER_OPTERYX_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CONTINUOUS_RANGE_OPTION__RESOLVED_BY = PER_OPTERYX_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CONTINUOUS_RANGE_OPTION__ALTERNATIVE_TO = PER_OPTERYX_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CONTINUOUS_RANGE_OPTION__HAS_ALTERNATIVES = PER_OPTERYX_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CONTINUOUS_RANGE_OPTION__COULD_RESOLVE = PER_OPTERYX_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CONTINUOUS_RANGE_OPTION__COULD_BE_RESOLVED_BY = PER_OPTERYX_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CONTINUOUS_RANGE_OPTION__STAKEHOLDER_OF = PER_OPTERYX_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CONTINUOUS_RANGE_OPTION__HAS_STAKEHOLDERS = PER_OPTERYX_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CONTINUOUS_RANGE_OPTION__SELECTED = PER_OPTERYX_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CONTINUOUS_RANGE_OPTION__SELECTED_BY = PER_OPTERYX_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CONTINUOUS_RANGE_OPTION__DESCRIPTION = PER_OPTERYX_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CONTINUOUS_RANGE_OPTION__KEYWORDS = PER_OPTERYX_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CONTINUOUS_RANGE_OPTION__REPOSITORY = PER_OPTERYX_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CONTINUOUS_RANGE_OPTION__RATIONALE = PER_OPTERYX_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CONTINUOUS_RANGE_OPTION__IS_MODELLED = PER_OPTERYX_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CONTINUOUS_RANGE_OPTION__IS_IMPLEMENTED = PER_OPTERYX_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CONTINUOUS_RANGE_OPTION__TIME_STAMP = PER_OPTERYX_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CONTINUOUS_RANGE_OPTION__EFFECTS = PER_OPTERYX_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CONTINUOUS_RANGE_OPTION__USED_TERMS = PER_OPTERYX_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CONTINUOUS_RANGE_OPTION__ANALYSIS_RATIONALE = PER_OPTERYX_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CONTINUOUS_RANGE_OPTION__PRIMARY_CHANGED = PER_OPTERYX_OPTION__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CONTINUOUS_RANGE_OPTION__VALUE = PER_OPTERYX_OPTION__VALUE;

	/**
	 * The feature id for the '<em><b>Chosen Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CONTINUOUS_RANGE_OPTION__CHOSEN_VALUE = PER_OPTERYX_OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Per Opteryx Continuous Range Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CONTINUOUS_RANGE_OPTION_FEATURE_COUNT = PER_OPTERYX_OPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.peropteryxcandidates.impl.PerOpteryxClassOptionImpl <em>Per Opteryx Class Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.peropteryxcandidates.impl.PerOpteryxClassOptionImpl
	 * @see edu.kit.ipd.sdq.toometa.peropteryxcandidates.impl.PeropteryxcandidatesPackageImpl#getPerOpteryxClassOption()
	 * @generated
	 */
	int PER_OPTERYX_CLASS_OPTION = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CLASS_OPTION__ID = PER_OPTERYX_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CLASS_OPTION__RELATIONS = PER_OPTERYX_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CLASS_OPTION__CONFLICTS_WITH = PER_OPTERYX_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CLASS_OPTION__HAS_CONFLICTS = PER_OPTERYX_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CLASS_OPTION__DUPLICATE_OF = PER_OPTERYX_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CLASS_OPTION__HAS_DUPLICATES = PER_OPTERYX_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CLASS_OPTION__DEPENDS_ON = PER_OPTERYX_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CLASS_OPTION__HAS_DEPENDENTS = PER_OPTERYX_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CLASS_OPTION__PARENT_OF = PER_OPTERYX_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CLASS_OPTION__SUBPART_OF = PER_OPTERYX_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CLASS_OPTION__TRIGGER_OF = PER_OPTERYX_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CLASS_OPTION__TRIGGERED_BY = PER_OPTERYX_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CLASS_OPTION__RESOLVES = PER_OPTERYX_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CLASS_OPTION__RESOLVED_BY = PER_OPTERYX_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CLASS_OPTION__ALTERNATIVE_TO = PER_OPTERYX_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CLASS_OPTION__HAS_ALTERNATIVES = PER_OPTERYX_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CLASS_OPTION__COULD_RESOLVE = PER_OPTERYX_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CLASS_OPTION__COULD_BE_RESOLVED_BY = PER_OPTERYX_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CLASS_OPTION__STAKEHOLDER_OF = PER_OPTERYX_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CLASS_OPTION__HAS_STAKEHOLDERS = PER_OPTERYX_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CLASS_OPTION__SELECTED = PER_OPTERYX_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CLASS_OPTION__SELECTED_BY = PER_OPTERYX_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CLASS_OPTION__DESCRIPTION = PER_OPTERYX_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CLASS_OPTION__KEYWORDS = PER_OPTERYX_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CLASS_OPTION__REPOSITORY = PER_OPTERYX_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CLASS_OPTION__RATIONALE = PER_OPTERYX_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CLASS_OPTION__IS_MODELLED = PER_OPTERYX_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CLASS_OPTION__IS_IMPLEMENTED = PER_OPTERYX_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CLASS_OPTION__TIME_STAMP = PER_OPTERYX_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CLASS_OPTION__EFFECTS = PER_OPTERYX_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CLASS_OPTION__USED_TERMS = PER_OPTERYX_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CLASS_OPTION__ANALYSIS_RATIONALE = PER_OPTERYX_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CLASS_OPTION__PRIMARY_CHANGED = PER_OPTERYX_OPTION__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CLASS_OPTION__VALUE = PER_OPTERYX_OPTION__VALUE;

	/**
	 * The feature id for the '<em><b>Chosen Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CLASS_OPTION__CHOSEN_VALUE = PER_OPTERYX_OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Per Opteryx Class Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PER_OPTERYX_CLASS_OPTION_FEATURE_COUNT = PER_OPTERYX_OPTION_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.peropteryxcandidates.PerOpteryxCandidate <em>Per Opteryx Candidate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Per Opteryx Candidate</em>'.
	 * @see edu.kit.ipd.sdq.toometa.peropteryxcandidates.PerOpteryxCandidate
	 * @generated
	 */
	EClass getPerOpteryxCandidate();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.toometa.peropteryxcandidates.PerOpteryxCandidate#getSimulationQualities <em>Simulation Qualities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simulation Qualities</em>'.
	 * @see edu.kit.ipd.sdq.toometa.peropteryxcandidates.PerOpteryxCandidate#getSimulationQualities()
	 * @see #getPerOpteryxCandidate()
	 * @generated
	 */
	EReference getPerOpteryxCandidate_SimulationQualities();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.peropteryxcandidates.PredictedQualityValue <em>Predicted Quality Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicted Quality Value</em>'.
	 * @see edu.kit.ipd.sdq.toometa.peropteryxcandidates.PredictedQualityValue
	 * @generated
	 */
	EClass getPredictedQualityValue();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.peropteryxcandidates.PredictedQualityValue#getQualityValue <em>Quality Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quality Value</em>'.
	 * @see edu.kit.ipd.sdq.toometa.peropteryxcandidates.PredictedQualityValue#getQualityValue()
	 * @see #getPredictedQualityValue()
	 * @generated
	 */
	EAttribute getPredictedQualityValue_QualityValue();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.toometa.peropteryxcandidates.PredictedQualityValue#getQualityType <em>Quality Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quality Type</em>'.
	 * @see edu.kit.ipd.sdq.toometa.peropteryxcandidates.PredictedQualityValue#getQualityType()
	 * @see #getPredictedQualityValue()
	 * @generated
	 */
	EReference getPredictedQualityValue_QualityType();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.peropteryxcandidates.PerOpteryxOption <em>Per Opteryx Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Per Opteryx Option</em>'.
	 * @see edu.kit.ipd.sdq.toometa.peropteryxcandidates.PerOpteryxOption
	 * @generated
	 */
	EClass getPerOpteryxOption();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.toometa.peropteryxcandidates.PerOpteryxOption#getPrimaryChanged <em>Primary Changed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primary Changed</em>'.
	 * @see edu.kit.ipd.sdq.toometa.peropteryxcandidates.PerOpteryxOption#getPrimaryChanged()
	 * @see #getPerOpteryxOption()
	 * @generated
	 */
	EReference getPerOpteryxOption_PrimaryChanged();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.peropteryxcandidates.PerOpteryxOption#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see edu.kit.ipd.sdq.toometa.peropteryxcandidates.PerOpteryxOption#getValue()
	 * @see #getPerOpteryxOption()
	 * @generated
	 */
	EAttribute getPerOpteryxOption_Value();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.peropteryxcandidates.PerOpteryxDiscreteRangeOption <em>Per Opteryx Discrete Range Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Per Opteryx Discrete Range Option</em>'.
	 * @see edu.kit.ipd.sdq.toometa.peropteryxcandidates.PerOpteryxDiscreteRangeOption
	 * @generated
	 */
	EClass getPerOpteryxDiscreteRangeOption();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.peropteryxcandidates.PerOpteryxDiscreteRangeOption#getChosenValue <em>Chosen Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chosen Value</em>'.
	 * @see edu.kit.ipd.sdq.toometa.peropteryxcandidates.PerOpteryxDiscreteRangeOption#getChosenValue()
	 * @see #getPerOpteryxDiscreteRangeOption()
	 * @generated
	 */
	EAttribute getPerOpteryxDiscreteRangeOption_ChosenValue();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.peropteryxcandidates.PerOpteryxContinuousRangeOption <em>Per Opteryx Continuous Range Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Per Opteryx Continuous Range Option</em>'.
	 * @see edu.kit.ipd.sdq.toometa.peropteryxcandidates.PerOpteryxContinuousRangeOption
	 * @generated
	 */
	EClass getPerOpteryxContinuousRangeOption();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.peropteryxcandidates.PerOpteryxContinuousRangeOption#getChosenValue <em>Chosen Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chosen Value</em>'.
	 * @see edu.kit.ipd.sdq.toometa.peropteryxcandidates.PerOpteryxContinuousRangeOption#getChosenValue()
	 * @see #getPerOpteryxContinuousRangeOption()
	 * @generated
	 */
	EAttribute getPerOpteryxContinuousRangeOption_ChosenValue();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.peropteryxcandidates.PerOpteryxClassOption <em>Per Opteryx Class Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Per Opteryx Class Option</em>'.
	 * @see edu.kit.ipd.sdq.toometa.peropteryxcandidates.PerOpteryxClassOption
	 * @generated
	 */
	EClass getPerOpteryxClassOption();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.toometa.peropteryxcandidates.PerOpteryxClassOption#getChosenValue <em>Chosen Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Chosen Value</em>'.
	 * @see edu.kit.ipd.sdq.toometa.peropteryxcandidates.PerOpteryxClassOption#getChosenValue()
	 * @see #getPerOpteryxClassOption()
	 * @generated
	 */
	EReference getPerOpteryxClassOption_ChosenValue();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PeropteryxcandidatesFactory getPeropteryxcandidatesFactory();

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
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.peropteryxcandidates.impl.PerOpteryxCandidateImpl <em>Per Opteryx Candidate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.peropteryxcandidates.impl.PerOpteryxCandidateImpl
		 * @see edu.kit.ipd.sdq.toometa.peropteryxcandidates.impl.PeropteryxcandidatesPackageImpl#getPerOpteryxCandidate()
		 * @generated
		 */
		EClass PER_OPTERYX_CANDIDATE = eINSTANCE.getPerOpteryxCandidate();

		/**
		 * The meta object literal for the '<em><b>Simulation Qualities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PER_OPTERYX_CANDIDATE__SIMULATION_QUALITIES = eINSTANCE.getPerOpteryxCandidate_SimulationQualities();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.peropteryxcandidates.impl.PredictedQualityValueImpl <em>Predicted Quality Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.peropteryxcandidates.impl.PredictedQualityValueImpl
		 * @see edu.kit.ipd.sdq.toometa.peropteryxcandidates.impl.PeropteryxcandidatesPackageImpl#getPredictedQualityValue()
		 * @generated
		 */
		EClass PREDICTED_QUALITY_VALUE = eINSTANCE.getPredictedQualityValue();

		/**
		 * The meta object literal for the '<em><b>Quality Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREDICTED_QUALITY_VALUE__QUALITY_VALUE = eINSTANCE.getPredictedQualityValue_QualityValue();

		/**
		 * The meta object literal for the '<em><b>Quality Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICTED_QUALITY_VALUE__QUALITY_TYPE = eINSTANCE.getPredictedQualityValue_QualityType();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.peropteryxcandidates.impl.PerOpteryxOptionImpl <em>Per Opteryx Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.peropteryxcandidates.impl.PerOpteryxOptionImpl
		 * @see edu.kit.ipd.sdq.toometa.peropteryxcandidates.impl.PeropteryxcandidatesPackageImpl#getPerOpteryxOption()
		 * @generated
		 */
		EClass PER_OPTERYX_OPTION = eINSTANCE.getPerOpteryxOption();

		/**
		 * The meta object literal for the '<em><b>Primary Changed</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PER_OPTERYX_OPTION__PRIMARY_CHANGED = eINSTANCE.getPerOpteryxOption_PrimaryChanged();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PER_OPTERYX_OPTION__VALUE = eINSTANCE.getPerOpteryxOption_Value();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.peropteryxcandidates.impl.PerOpteryxDiscreteRangeOptionImpl <em>Per Opteryx Discrete Range Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.peropteryxcandidates.impl.PerOpteryxDiscreteRangeOptionImpl
		 * @see edu.kit.ipd.sdq.toometa.peropteryxcandidates.impl.PeropteryxcandidatesPackageImpl#getPerOpteryxDiscreteRangeOption()
		 * @generated
		 */
		EClass PER_OPTERYX_DISCRETE_RANGE_OPTION = eINSTANCE.getPerOpteryxDiscreteRangeOption();

		/**
		 * The meta object literal for the '<em><b>Chosen Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PER_OPTERYX_DISCRETE_RANGE_OPTION__CHOSEN_VALUE = eINSTANCE.getPerOpteryxDiscreteRangeOption_ChosenValue();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.peropteryxcandidates.impl.PerOpteryxContinuousRangeOptionImpl <em>Per Opteryx Continuous Range Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.peropteryxcandidates.impl.PerOpteryxContinuousRangeOptionImpl
		 * @see edu.kit.ipd.sdq.toometa.peropteryxcandidates.impl.PeropteryxcandidatesPackageImpl#getPerOpteryxContinuousRangeOption()
		 * @generated
		 */
		EClass PER_OPTERYX_CONTINUOUS_RANGE_OPTION = eINSTANCE.getPerOpteryxContinuousRangeOption();

		/**
		 * The meta object literal for the '<em><b>Chosen Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PER_OPTERYX_CONTINUOUS_RANGE_OPTION__CHOSEN_VALUE = eINSTANCE.getPerOpteryxContinuousRangeOption_ChosenValue();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.peropteryxcandidates.impl.PerOpteryxClassOptionImpl <em>Per Opteryx Class Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.peropteryxcandidates.impl.PerOpteryxClassOptionImpl
		 * @see edu.kit.ipd.sdq.toometa.peropteryxcandidates.impl.PeropteryxcandidatesPackageImpl#getPerOpteryxClassOption()
		 * @generated
		 */
		EClass PER_OPTERYX_CLASS_OPTION = eINSTANCE.getPerOpteryxClassOption();

		/**
		 * The meta object literal for the '<em><b>Chosen Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PER_OPTERYX_CLASS_OPTION__CHOSEN_VALUE = eINSTANCE.getPerOpteryxClassOption_ChosenValue();

	}

} //PeropteryxcandidatesPackage
