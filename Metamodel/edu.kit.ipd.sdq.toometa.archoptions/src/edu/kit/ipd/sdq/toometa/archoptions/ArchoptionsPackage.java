/**
 */
package edu.kit.ipd.sdq.toometa.archoptions;

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
 * @see edu.kit.ipd.sdq.toometa.archoptions.ArchoptionsFactory
 * @model kind="package"
 * @generated
 */
public interface ArchoptionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "archoptions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.kit.edu/toometa/archoptions/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "archoptions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArchoptionsPackage eINSTANCE = edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.ArchOptionImpl <em>Arch Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchOptionImpl
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getArchOption()
	 * @generated
	 */
	int ARCH_OPTION = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_OPTION__ID = OptionsPackage.OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_OPTION__RELATIONS = OptionsPackage.OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_OPTION__CONFLICTS_WITH = OptionsPackage.OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_OPTION__HAS_CONFLICTS = OptionsPackage.OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_OPTION__DUPLICATE_OF = OptionsPackage.OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_OPTION__HAS_DUPLICATES = OptionsPackage.OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_OPTION__DEPENDS_ON = OptionsPackage.OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_OPTION__HAS_DEPENDENTS = OptionsPackage.OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_OPTION__PARENT_OF = OptionsPackage.OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_OPTION__SUBPART_OF = OptionsPackage.OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_OPTION__TRIGGER_OF = OptionsPackage.OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_OPTION__TRIGGERED_BY = OptionsPackage.OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_OPTION__RESOLVES = OptionsPackage.OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_OPTION__RESOLVED_BY = OptionsPackage.OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_OPTION__ALTERNATIVE_TO = OptionsPackage.OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_OPTION__HAS_ALTERNATIVES = OptionsPackage.OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_OPTION__COULD_RESOLVE = OptionsPackage.OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_OPTION__COULD_BE_RESOLVED_BY = OptionsPackage.OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_OPTION__STAKEHOLDER_OF = OptionsPackage.OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_OPTION__HAS_STAKEHOLDERS = OptionsPackage.OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_OPTION__SELECTED = OptionsPackage.OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_OPTION__SELECTED_BY = OptionsPackage.OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_OPTION__DESCRIPTION = OptionsPackage.OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_OPTION__KEYWORDS = OptionsPackage.OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_OPTION__REPOSITORY = OptionsPackage.OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_OPTION__RATIONALE = OptionsPackage.OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_OPTION__IS_MODELLED = OptionsPackage.OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_OPTION__IS_IMPLEMENTED = OptionsPackage.OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_OPTION__TIME_STAMP = OptionsPackage.OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_OPTION__EFFECTS = OptionsPackage.OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_OPTION__USED_TERMS = OptionsPackage.OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_OPTION__ANALYSIS_RATIONALE = OptionsPackage.OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arch Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_OPTION_FEATURE_COUNT = OptionsPackage.OPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.ComponentOptionImpl <em>Component Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ComponentOptionImpl
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getComponentOption()
	 * @generated
	 */
	int COMPONENT_OPTION = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPTION__ID = ARCH_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPTION__RELATIONS = ARCH_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPTION__CONFLICTS_WITH = ARCH_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPTION__HAS_CONFLICTS = ARCH_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPTION__DUPLICATE_OF = ARCH_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPTION__HAS_DUPLICATES = ARCH_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPTION__DEPENDS_ON = ARCH_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPTION__HAS_DEPENDENTS = ARCH_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPTION__PARENT_OF = ARCH_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPTION__SUBPART_OF = ARCH_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPTION__TRIGGER_OF = ARCH_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPTION__TRIGGERED_BY = ARCH_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPTION__RESOLVES = ARCH_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPTION__RESOLVED_BY = ARCH_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPTION__ALTERNATIVE_TO = ARCH_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPTION__HAS_ALTERNATIVES = ARCH_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPTION__COULD_RESOLVE = ARCH_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPTION__COULD_BE_RESOLVED_BY = ARCH_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPTION__STAKEHOLDER_OF = ARCH_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPTION__HAS_STAKEHOLDERS = ARCH_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPTION__SELECTED = ARCH_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPTION__SELECTED_BY = ARCH_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPTION__DESCRIPTION = ARCH_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPTION__KEYWORDS = ARCH_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPTION__REPOSITORY = ARCH_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPTION__RATIONALE = ARCH_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPTION__IS_MODELLED = ARCH_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPTION__IS_IMPLEMENTED = ARCH_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPTION__TIME_STAMP = ARCH_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPTION__EFFECTS = ARCH_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPTION__USED_TERMS = ARCH_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPTION__ANALYSIS_RATIONALE = ARCH_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The number of structural features of the '<em>Component Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPTION_FEATURE_COUNT = ARCH_OPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.ProvidedFunctionalityImpl <em>Provided Functionality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ProvidedFunctionalityImpl
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getProvidedFunctionality()
	 * @generated
	 */
	int PROVIDED_FUNCTIONALITY = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_FUNCTIONALITY__ID = COMPONENT_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_FUNCTIONALITY__RELATIONS = COMPONENT_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_FUNCTIONALITY__CONFLICTS_WITH = COMPONENT_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_FUNCTIONALITY__HAS_CONFLICTS = COMPONENT_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_FUNCTIONALITY__DUPLICATE_OF = COMPONENT_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_FUNCTIONALITY__HAS_DUPLICATES = COMPONENT_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_FUNCTIONALITY__DEPENDS_ON = COMPONENT_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_FUNCTIONALITY__HAS_DEPENDENTS = COMPONENT_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_FUNCTIONALITY__PARENT_OF = COMPONENT_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_FUNCTIONALITY__SUBPART_OF = COMPONENT_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_FUNCTIONALITY__TRIGGER_OF = COMPONENT_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_FUNCTIONALITY__TRIGGERED_BY = COMPONENT_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_FUNCTIONALITY__RESOLVES = COMPONENT_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_FUNCTIONALITY__RESOLVED_BY = COMPONENT_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_FUNCTIONALITY__ALTERNATIVE_TO = COMPONENT_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_FUNCTIONALITY__HAS_ALTERNATIVES = COMPONENT_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_FUNCTIONALITY__COULD_RESOLVE = COMPONENT_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_FUNCTIONALITY__COULD_BE_RESOLVED_BY = COMPONENT_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_FUNCTIONALITY__STAKEHOLDER_OF = COMPONENT_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_FUNCTIONALITY__HAS_STAKEHOLDERS = COMPONENT_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_FUNCTIONALITY__SELECTED = COMPONENT_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_FUNCTIONALITY__SELECTED_BY = COMPONENT_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_FUNCTIONALITY__DESCRIPTION = COMPONENT_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_FUNCTIONALITY__KEYWORDS = COMPONENT_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_FUNCTIONALITY__REPOSITORY = COMPONENT_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_FUNCTIONALITY__RATIONALE = COMPONENT_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_FUNCTIONALITY__IS_MODELLED = COMPONENT_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_FUNCTIONALITY__IS_IMPLEMENTED = COMPONENT_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_FUNCTIONALITY__TIME_STAMP = COMPONENT_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_FUNCTIONALITY__EFFECTS = COMPONENT_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_FUNCTIONALITY__USED_TERMS = COMPONENT_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_FUNCTIONALITY__ANALYSIS_RATIONALE = COMPONENT_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The number of structural features of the '<em>Provided Functionality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_FUNCTIONALITY_FEATURE_COUNT = COMPONENT_OPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.RequiredFunctionalityImpl <em>Required Functionality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.RequiredFunctionalityImpl
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getRequiredFunctionality()
	 * @generated
	 */
	int REQUIRED_FUNCTIONALITY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_FUNCTIONALITY__ID = COMPONENT_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_FUNCTIONALITY__RELATIONS = COMPONENT_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_FUNCTIONALITY__CONFLICTS_WITH = COMPONENT_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_FUNCTIONALITY__HAS_CONFLICTS = COMPONENT_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_FUNCTIONALITY__DUPLICATE_OF = COMPONENT_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_FUNCTIONALITY__HAS_DUPLICATES = COMPONENT_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_FUNCTIONALITY__DEPENDS_ON = COMPONENT_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_FUNCTIONALITY__HAS_DEPENDENTS = COMPONENT_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_FUNCTIONALITY__PARENT_OF = COMPONENT_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_FUNCTIONALITY__SUBPART_OF = COMPONENT_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_FUNCTIONALITY__TRIGGER_OF = COMPONENT_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_FUNCTIONALITY__TRIGGERED_BY = COMPONENT_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_FUNCTIONALITY__RESOLVES = COMPONENT_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_FUNCTIONALITY__RESOLVED_BY = COMPONENT_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_FUNCTIONALITY__ALTERNATIVE_TO = COMPONENT_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_FUNCTIONALITY__HAS_ALTERNATIVES = COMPONENT_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_FUNCTIONALITY__COULD_RESOLVE = COMPONENT_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_FUNCTIONALITY__COULD_BE_RESOLVED_BY = COMPONENT_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_FUNCTIONALITY__STAKEHOLDER_OF = COMPONENT_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_FUNCTIONALITY__HAS_STAKEHOLDERS = COMPONENT_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_FUNCTIONALITY__SELECTED = COMPONENT_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_FUNCTIONALITY__SELECTED_BY = COMPONENT_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_FUNCTIONALITY__DESCRIPTION = COMPONENT_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_FUNCTIONALITY__KEYWORDS = COMPONENT_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_FUNCTIONALITY__REPOSITORY = COMPONENT_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_FUNCTIONALITY__RATIONALE = COMPONENT_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_FUNCTIONALITY__IS_MODELLED = COMPONENT_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_FUNCTIONALITY__IS_IMPLEMENTED = COMPONENT_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_FUNCTIONALITY__TIME_STAMP = COMPONENT_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_FUNCTIONALITY__EFFECTS = COMPONENT_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_FUNCTIONALITY__USED_TERMS = COMPONENT_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_FUNCTIONALITY__ANALYSIS_RATIONALE = COMPONENT_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The number of structural features of the '<em>Required Functionality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_FUNCTIONALITY_FEATURE_COUNT = COMPONENT_OPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.FunctionalityConnectionImpl <em>Functionality Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.FunctionalityConnectionImpl
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getFunctionalityConnection()
	 * @generated
	 */
	int FUNCTIONALITY_CONNECTION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY_CONNECTION__ID = COMPONENT_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY_CONNECTION__RELATIONS = COMPONENT_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY_CONNECTION__CONFLICTS_WITH = COMPONENT_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY_CONNECTION__HAS_CONFLICTS = COMPONENT_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY_CONNECTION__DUPLICATE_OF = COMPONENT_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY_CONNECTION__HAS_DUPLICATES = COMPONENT_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY_CONNECTION__DEPENDS_ON = COMPONENT_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY_CONNECTION__HAS_DEPENDENTS = COMPONENT_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY_CONNECTION__PARENT_OF = COMPONENT_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY_CONNECTION__SUBPART_OF = COMPONENT_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY_CONNECTION__TRIGGER_OF = COMPONENT_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY_CONNECTION__TRIGGERED_BY = COMPONENT_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY_CONNECTION__RESOLVES = COMPONENT_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY_CONNECTION__RESOLVED_BY = COMPONENT_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY_CONNECTION__ALTERNATIVE_TO = COMPONENT_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY_CONNECTION__HAS_ALTERNATIVES = COMPONENT_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY_CONNECTION__COULD_RESOLVE = COMPONENT_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY_CONNECTION__COULD_BE_RESOLVED_BY = COMPONENT_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY_CONNECTION__STAKEHOLDER_OF = COMPONENT_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY_CONNECTION__HAS_STAKEHOLDERS = COMPONENT_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY_CONNECTION__SELECTED = COMPONENT_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY_CONNECTION__SELECTED_BY = COMPONENT_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY_CONNECTION__DESCRIPTION = COMPONENT_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY_CONNECTION__KEYWORDS = COMPONENT_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY_CONNECTION__REPOSITORY = COMPONENT_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY_CONNECTION__RATIONALE = COMPONENT_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY_CONNECTION__IS_MODELLED = COMPONENT_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY_CONNECTION__IS_IMPLEMENTED = COMPONENT_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY_CONNECTION__TIME_STAMP = COMPONENT_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY_CONNECTION__EFFECTS = COMPONENT_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY_CONNECTION__USED_TERMS = COMPONENT_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY_CONNECTION__ANALYSIS_RATIONALE = COMPONENT_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The number of structural features of the '<em>Functionality Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY_CONNECTION_FEATURE_COUNT = COMPONENT_OPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.MultipleInstantiationImpl <em>Multiple Instantiation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.MultipleInstantiationImpl
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getMultipleInstantiation()
	 * @generated
	 */
	int MULTIPLE_INSTANTIATION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INSTANTIATION__ID = COMPONENT_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INSTANTIATION__RELATIONS = COMPONENT_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INSTANTIATION__CONFLICTS_WITH = COMPONENT_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INSTANTIATION__HAS_CONFLICTS = COMPONENT_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INSTANTIATION__DUPLICATE_OF = COMPONENT_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INSTANTIATION__HAS_DUPLICATES = COMPONENT_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INSTANTIATION__DEPENDS_ON = COMPONENT_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INSTANTIATION__HAS_DEPENDENTS = COMPONENT_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INSTANTIATION__PARENT_OF = COMPONENT_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INSTANTIATION__SUBPART_OF = COMPONENT_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INSTANTIATION__TRIGGER_OF = COMPONENT_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INSTANTIATION__TRIGGERED_BY = COMPONENT_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INSTANTIATION__RESOLVES = COMPONENT_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INSTANTIATION__RESOLVED_BY = COMPONENT_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INSTANTIATION__ALTERNATIVE_TO = COMPONENT_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INSTANTIATION__HAS_ALTERNATIVES = COMPONENT_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INSTANTIATION__COULD_RESOLVE = COMPONENT_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INSTANTIATION__COULD_BE_RESOLVED_BY = COMPONENT_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INSTANTIATION__STAKEHOLDER_OF = COMPONENT_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INSTANTIATION__HAS_STAKEHOLDERS = COMPONENT_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INSTANTIATION__SELECTED = COMPONENT_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INSTANTIATION__SELECTED_BY = COMPONENT_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INSTANTIATION__DESCRIPTION = COMPONENT_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INSTANTIATION__KEYWORDS = COMPONENT_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INSTANTIATION__REPOSITORY = COMPONENT_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INSTANTIATION__RATIONALE = COMPONENT_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INSTANTIATION__IS_MODELLED = COMPONENT_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INSTANTIATION__IS_IMPLEMENTED = COMPONENT_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INSTANTIATION__TIME_STAMP = COMPONENT_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INSTANTIATION__EFFECTS = COMPONENT_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INSTANTIATION__USED_TERMS = COMPONENT_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INSTANTIATION__ANALYSIS_RATIONALE = COMPONENT_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The number of structural features of the '<em>Multiple Instantiation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INSTANTIATION_FEATURE_COUNT = COMPONENT_OPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.OnlySingleInstantiationImpl <em>Only Single Instantiation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.OnlySingleInstantiationImpl
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getOnlySingleInstantiation()
	 * @generated
	 */
	int ONLY_SINGLE_INSTANTIATION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_INSTANTIATION__ID = COMPONENT_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_INSTANTIATION__RELATIONS = COMPONENT_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_INSTANTIATION__CONFLICTS_WITH = COMPONENT_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_INSTANTIATION__HAS_CONFLICTS = COMPONENT_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_INSTANTIATION__DUPLICATE_OF = COMPONENT_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_INSTANTIATION__HAS_DUPLICATES = COMPONENT_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_INSTANTIATION__DEPENDS_ON = COMPONENT_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_INSTANTIATION__HAS_DEPENDENTS = COMPONENT_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_INSTANTIATION__PARENT_OF = COMPONENT_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_INSTANTIATION__SUBPART_OF = COMPONENT_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_INSTANTIATION__TRIGGER_OF = COMPONENT_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_INSTANTIATION__TRIGGERED_BY = COMPONENT_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_INSTANTIATION__RESOLVES = COMPONENT_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_INSTANTIATION__RESOLVED_BY = COMPONENT_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_INSTANTIATION__ALTERNATIVE_TO = COMPONENT_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_INSTANTIATION__HAS_ALTERNATIVES = COMPONENT_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_INSTANTIATION__COULD_RESOLVE = COMPONENT_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_INSTANTIATION__COULD_BE_RESOLVED_BY = COMPONENT_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_INSTANTIATION__STAKEHOLDER_OF = COMPONENT_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_INSTANTIATION__HAS_STAKEHOLDERS = COMPONENT_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_INSTANTIATION__SELECTED = COMPONENT_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_INSTANTIATION__SELECTED_BY = COMPONENT_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_INSTANTIATION__DESCRIPTION = COMPONENT_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_INSTANTIATION__KEYWORDS = COMPONENT_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_INSTANTIATION__REPOSITORY = COMPONENT_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_INSTANTIATION__RATIONALE = COMPONENT_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_INSTANTIATION__IS_MODELLED = COMPONENT_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_INSTANTIATION__IS_IMPLEMENTED = COMPONENT_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_INSTANTIATION__TIME_STAMP = COMPONENT_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_INSTANTIATION__EFFECTS = COMPONENT_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_INSTANTIATION__USED_TERMS = COMPONENT_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_INSTANTIATION__ANALYSIS_RATIONALE = COMPONENT_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The number of structural features of the '<em>Only Single Instantiation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_INSTANTIATION_FEATURE_COUNT = COMPONENT_OPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.DeploymentOptionImpl <em>Deployment Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.DeploymentOptionImpl
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getDeploymentOption()
	 * @generated
	 */
	int DEPLOYMENT_OPTION = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPTION__ID = ARCH_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPTION__RELATIONS = ARCH_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPTION__CONFLICTS_WITH = ARCH_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPTION__HAS_CONFLICTS = ARCH_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPTION__DUPLICATE_OF = ARCH_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPTION__HAS_DUPLICATES = ARCH_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPTION__DEPENDS_ON = ARCH_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPTION__HAS_DEPENDENTS = ARCH_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPTION__PARENT_OF = ARCH_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPTION__SUBPART_OF = ARCH_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPTION__TRIGGER_OF = ARCH_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPTION__TRIGGERED_BY = ARCH_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPTION__RESOLVES = ARCH_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPTION__RESOLVED_BY = ARCH_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPTION__ALTERNATIVE_TO = ARCH_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPTION__HAS_ALTERNATIVES = ARCH_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPTION__COULD_RESOLVE = ARCH_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPTION__COULD_BE_RESOLVED_BY = ARCH_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPTION__STAKEHOLDER_OF = ARCH_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPTION__HAS_STAKEHOLDERS = ARCH_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPTION__SELECTED = ARCH_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPTION__SELECTED_BY = ARCH_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPTION__DESCRIPTION = ARCH_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPTION__KEYWORDS = ARCH_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPTION__REPOSITORY = ARCH_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPTION__RATIONALE = ARCH_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPTION__IS_MODELLED = ARCH_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPTION__IS_IMPLEMENTED = ARCH_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPTION__TIME_STAMP = ARCH_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPTION__EFFECTS = ARCH_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPTION__USED_TERMS = ARCH_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPTION__ANALYSIS_RATIONALE = ARCH_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The number of structural features of the '<em>Deployment Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPTION_FEATURE_COUNT = ARCH_OPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.OnlySingleAllocationImpl <em>Only Single Allocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.OnlySingleAllocationImpl
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getOnlySingleAllocation()
	 * @generated
	 */
	int ONLY_SINGLE_ALLOCATION = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_ALLOCATION__ID = DEPLOYMENT_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_ALLOCATION__RELATIONS = DEPLOYMENT_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_ALLOCATION__CONFLICTS_WITH = DEPLOYMENT_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_ALLOCATION__HAS_CONFLICTS = DEPLOYMENT_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_ALLOCATION__DUPLICATE_OF = DEPLOYMENT_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_ALLOCATION__HAS_DUPLICATES = DEPLOYMENT_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_ALLOCATION__DEPENDS_ON = DEPLOYMENT_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_ALLOCATION__HAS_DEPENDENTS = DEPLOYMENT_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_ALLOCATION__PARENT_OF = DEPLOYMENT_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_ALLOCATION__SUBPART_OF = DEPLOYMENT_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_ALLOCATION__TRIGGER_OF = DEPLOYMENT_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_ALLOCATION__TRIGGERED_BY = DEPLOYMENT_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_ALLOCATION__RESOLVES = DEPLOYMENT_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_ALLOCATION__RESOLVED_BY = DEPLOYMENT_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_ALLOCATION__ALTERNATIVE_TO = DEPLOYMENT_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_ALLOCATION__HAS_ALTERNATIVES = DEPLOYMENT_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_ALLOCATION__COULD_RESOLVE = DEPLOYMENT_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_ALLOCATION__COULD_BE_RESOLVED_BY = DEPLOYMENT_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_ALLOCATION__STAKEHOLDER_OF = DEPLOYMENT_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_ALLOCATION__HAS_STAKEHOLDERS = DEPLOYMENT_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_ALLOCATION__SELECTED = DEPLOYMENT_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_ALLOCATION__SELECTED_BY = DEPLOYMENT_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_ALLOCATION__DESCRIPTION = DEPLOYMENT_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_ALLOCATION__KEYWORDS = DEPLOYMENT_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_ALLOCATION__REPOSITORY = DEPLOYMENT_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_ALLOCATION__RATIONALE = DEPLOYMENT_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_ALLOCATION__IS_MODELLED = DEPLOYMENT_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_ALLOCATION__IS_IMPLEMENTED = DEPLOYMENT_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_ALLOCATION__TIME_STAMP = DEPLOYMENT_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_ALLOCATION__EFFECTS = DEPLOYMENT_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_ALLOCATION__USED_TERMS = DEPLOYMENT_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_ALLOCATION__ANALYSIS_RATIONALE = DEPLOYMENT_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The number of structural features of the '<em>Only Single Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_SINGLE_ALLOCATION_FEATURE_COUNT = DEPLOYMENT_OPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.MultipleAllocationImpl <em>Multiple Allocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.MultipleAllocationImpl
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getMultipleAllocation()
	 * @generated
	 */
	int MULTIPLE_ALLOCATION = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ALLOCATION__ID = DEPLOYMENT_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ALLOCATION__RELATIONS = DEPLOYMENT_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ALLOCATION__CONFLICTS_WITH = DEPLOYMENT_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ALLOCATION__HAS_CONFLICTS = DEPLOYMENT_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ALLOCATION__DUPLICATE_OF = DEPLOYMENT_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ALLOCATION__HAS_DUPLICATES = DEPLOYMENT_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ALLOCATION__DEPENDS_ON = DEPLOYMENT_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ALLOCATION__HAS_DEPENDENTS = DEPLOYMENT_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ALLOCATION__PARENT_OF = DEPLOYMENT_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ALLOCATION__SUBPART_OF = DEPLOYMENT_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ALLOCATION__TRIGGER_OF = DEPLOYMENT_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ALLOCATION__TRIGGERED_BY = DEPLOYMENT_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ALLOCATION__RESOLVES = DEPLOYMENT_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ALLOCATION__RESOLVED_BY = DEPLOYMENT_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ALLOCATION__ALTERNATIVE_TO = DEPLOYMENT_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ALLOCATION__HAS_ALTERNATIVES = DEPLOYMENT_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ALLOCATION__COULD_RESOLVE = DEPLOYMENT_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ALLOCATION__COULD_BE_RESOLVED_BY = DEPLOYMENT_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ALLOCATION__STAKEHOLDER_OF = DEPLOYMENT_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ALLOCATION__HAS_STAKEHOLDERS = DEPLOYMENT_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ALLOCATION__SELECTED = DEPLOYMENT_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ALLOCATION__SELECTED_BY = DEPLOYMENT_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ALLOCATION__DESCRIPTION = DEPLOYMENT_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ALLOCATION__KEYWORDS = DEPLOYMENT_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ALLOCATION__REPOSITORY = DEPLOYMENT_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ALLOCATION__RATIONALE = DEPLOYMENT_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ALLOCATION__IS_MODELLED = DEPLOYMENT_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ALLOCATION__IS_IMPLEMENTED = DEPLOYMENT_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ALLOCATION__TIME_STAMP = DEPLOYMENT_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ALLOCATION__EFFECTS = DEPLOYMENT_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ALLOCATION__USED_TERMS = DEPLOYMENT_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ALLOCATION__ANALYSIS_RATIONALE = DEPLOYMENT_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The number of structural features of the '<em>Multiple Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ALLOCATION_FEATURE_COUNT = DEPLOYMENT_OPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.AllocateTogetherImpl <em>Allocate Together</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.AllocateTogetherImpl
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getAllocateTogether()
	 * @generated
	 */
	int ALLOCATE_TOGETHER = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_TOGETHER__ID = DEPLOYMENT_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_TOGETHER__RELATIONS = DEPLOYMENT_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_TOGETHER__CONFLICTS_WITH = DEPLOYMENT_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_TOGETHER__HAS_CONFLICTS = DEPLOYMENT_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_TOGETHER__DUPLICATE_OF = DEPLOYMENT_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_TOGETHER__HAS_DUPLICATES = DEPLOYMENT_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_TOGETHER__DEPENDS_ON = DEPLOYMENT_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_TOGETHER__HAS_DEPENDENTS = DEPLOYMENT_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_TOGETHER__PARENT_OF = DEPLOYMENT_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_TOGETHER__SUBPART_OF = DEPLOYMENT_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_TOGETHER__TRIGGER_OF = DEPLOYMENT_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_TOGETHER__TRIGGERED_BY = DEPLOYMENT_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_TOGETHER__RESOLVES = DEPLOYMENT_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_TOGETHER__RESOLVED_BY = DEPLOYMENT_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_TOGETHER__ALTERNATIVE_TO = DEPLOYMENT_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_TOGETHER__HAS_ALTERNATIVES = DEPLOYMENT_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_TOGETHER__COULD_RESOLVE = DEPLOYMENT_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_TOGETHER__COULD_BE_RESOLVED_BY = DEPLOYMENT_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_TOGETHER__STAKEHOLDER_OF = DEPLOYMENT_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_TOGETHER__HAS_STAKEHOLDERS = DEPLOYMENT_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_TOGETHER__SELECTED = DEPLOYMENT_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_TOGETHER__SELECTED_BY = DEPLOYMENT_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_TOGETHER__DESCRIPTION = DEPLOYMENT_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_TOGETHER__KEYWORDS = DEPLOYMENT_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_TOGETHER__REPOSITORY = DEPLOYMENT_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_TOGETHER__RATIONALE = DEPLOYMENT_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_TOGETHER__IS_MODELLED = DEPLOYMENT_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_TOGETHER__IS_IMPLEMENTED = DEPLOYMENT_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_TOGETHER__TIME_STAMP = DEPLOYMENT_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_TOGETHER__EFFECTS = DEPLOYMENT_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_TOGETHER__USED_TERMS = DEPLOYMENT_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_TOGETHER__ANALYSIS_RATIONALE = DEPLOYMENT_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The number of structural features of the '<em>Allocate Together</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_TOGETHER_FEATURE_COUNT = DEPLOYMENT_OPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.AllocateNeverTogetherImpl <em>Allocate Never Together</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.AllocateNeverTogetherImpl
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getAllocateNeverTogether()
	 * @generated
	 */
	int ALLOCATE_NEVER_TOGETHER = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_NEVER_TOGETHER__ID = DEPLOYMENT_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_NEVER_TOGETHER__RELATIONS = DEPLOYMENT_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_NEVER_TOGETHER__CONFLICTS_WITH = DEPLOYMENT_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_NEVER_TOGETHER__HAS_CONFLICTS = DEPLOYMENT_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_NEVER_TOGETHER__DUPLICATE_OF = DEPLOYMENT_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_NEVER_TOGETHER__HAS_DUPLICATES = DEPLOYMENT_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_NEVER_TOGETHER__DEPENDS_ON = DEPLOYMENT_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_NEVER_TOGETHER__HAS_DEPENDENTS = DEPLOYMENT_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_NEVER_TOGETHER__PARENT_OF = DEPLOYMENT_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_NEVER_TOGETHER__SUBPART_OF = DEPLOYMENT_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_NEVER_TOGETHER__TRIGGER_OF = DEPLOYMENT_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_NEVER_TOGETHER__TRIGGERED_BY = DEPLOYMENT_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_NEVER_TOGETHER__RESOLVES = DEPLOYMENT_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_NEVER_TOGETHER__RESOLVED_BY = DEPLOYMENT_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_NEVER_TOGETHER__ALTERNATIVE_TO = DEPLOYMENT_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_NEVER_TOGETHER__HAS_ALTERNATIVES = DEPLOYMENT_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_NEVER_TOGETHER__COULD_RESOLVE = DEPLOYMENT_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_NEVER_TOGETHER__COULD_BE_RESOLVED_BY = DEPLOYMENT_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_NEVER_TOGETHER__STAKEHOLDER_OF = DEPLOYMENT_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_NEVER_TOGETHER__HAS_STAKEHOLDERS = DEPLOYMENT_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_NEVER_TOGETHER__SELECTED = DEPLOYMENT_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_NEVER_TOGETHER__SELECTED_BY = DEPLOYMENT_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_NEVER_TOGETHER__DESCRIPTION = DEPLOYMENT_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_NEVER_TOGETHER__KEYWORDS = DEPLOYMENT_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_NEVER_TOGETHER__REPOSITORY = DEPLOYMENT_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_NEVER_TOGETHER__RATIONALE = DEPLOYMENT_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_NEVER_TOGETHER__IS_MODELLED = DEPLOYMENT_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_NEVER_TOGETHER__IS_IMPLEMENTED = DEPLOYMENT_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_NEVER_TOGETHER__TIME_STAMP = DEPLOYMENT_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_NEVER_TOGETHER__EFFECTS = DEPLOYMENT_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_NEVER_TOGETHER__USED_TERMS = DEPLOYMENT_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_NEVER_TOGETHER__ANALYSIS_RATIONALE = DEPLOYMENT_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The number of structural features of the '<em>Allocate Never Together</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_NEVER_TOGETHER_FEATURE_COUNT = DEPLOYMENT_OPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.NeverAllocateToSpecificNodesImpl <em>Never Allocate To Specific Nodes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.NeverAllocateToSpecificNodesImpl
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getNeverAllocateToSpecificNodes()
	 * @generated
	 */
	int NEVER_ALLOCATE_TO_SPECIFIC_NODES = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEVER_ALLOCATE_TO_SPECIFIC_NODES__ID = DEPLOYMENT_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEVER_ALLOCATE_TO_SPECIFIC_NODES__RELATIONS = DEPLOYMENT_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEVER_ALLOCATE_TO_SPECIFIC_NODES__CONFLICTS_WITH = DEPLOYMENT_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEVER_ALLOCATE_TO_SPECIFIC_NODES__HAS_CONFLICTS = DEPLOYMENT_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEVER_ALLOCATE_TO_SPECIFIC_NODES__DUPLICATE_OF = DEPLOYMENT_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEVER_ALLOCATE_TO_SPECIFIC_NODES__HAS_DUPLICATES = DEPLOYMENT_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEVER_ALLOCATE_TO_SPECIFIC_NODES__DEPENDS_ON = DEPLOYMENT_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEVER_ALLOCATE_TO_SPECIFIC_NODES__HAS_DEPENDENTS = DEPLOYMENT_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEVER_ALLOCATE_TO_SPECIFIC_NODES__PARENT_OF = DEPLOYMENT_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEVER_ALLOCATE_TO_SPECIFIC_NODES__SUBPART_OF = DEPLOYMENT_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEVER_ALLOCATE_TO_SPECIFIC_NODES__TRIGGER_OF = DEPLOYMENT_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEVER_ALLOCATE_TO_SPECIFIC_NODES__TRIGGERED_BY = DEPLOYMENT_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEVER_ALLOCATE_TO_SPECIFIC_NODES__RESOLVES = DEPLOYMENT_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEVER_ALLOCATE_TO_SPECIFIC_NODES__RESOLVED_BY = DEPLOYMENT_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEVER_ALLOCATE_TO_SPECIFIC_NODES__ALTERNATIVE_TO = DEPLOYMENT_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEVER_ALLOCATE_TO_SPECIFIC_NODES__HAS_ALTERNATIVES = DEPLOYMENT_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEVER_ALLOCATE_TO_SPECIFIC_NODES__COULD_RESOLVE = DEPLOYMENT_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEVER_ALLOCATE_TO_SPECIFIC_NODES__COULD_BE_RESOLVED_BY = DEPLOYMENT_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEVER_ALLOCATE_TO_SPECIFIC_NODES__STAKEHOLDER_OF = DEPLOYMENT_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEVER_ALLOCATE_TO_SPECIFIC_NODES__HAS_STAKEHOLDERS = DEPLOYMENT_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEVER_ALLOCATE_TO_SPECIFIC_NODES__SELECTED = DEPLOYMENT_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEVER_ALLOCATE_TO_SPECIFIC_NODES__SELECTED_BY = DEPLOYMENT_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEVER_ALLOCATE_TO_SPECIFIC_NODES__DESCRIPTION = DEPLOYMENT_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEVER_ALLOCATE_TO_SPECIFIC_NODES__KEYWORDS = DEPLOYMENT_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEVER_ALLOCATE_TO_SPECIFIC_NODES__REPOSITORY = DEPLOYMENT_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEVER_ALLOCATE_TO_SPECIFIC_NODES__RATIONALE = DEPLOYMENT_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEVER_ALLOCATE_TO_SPECIFIC_NODES__IS_MODELLED = DEPLOYMENT_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEVER_ALLOCATE_TO_SPECIFIC_NODES__IS_IMPLEMENTED = DEPLOYMENT_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEVER_ALLOCATE_TO_SPECIFIC_NODES__TIME_STAMP = DEPLOYMENT_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEVER_ALLOCATE_TO_SPECIFIC_NODES__EFFECTS = DEPLOYMENT_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEVER_ALLOCATE_TO_SPECIFIC_NODES__USED_TERMS = DEPLOYMENT_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEVER_ALLOCATE_TO_SPECIFIC_NODES__ANALYSIS_RATIONALE = DEPLOYMENT_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The number of structural features of the '<em>Never Allocate To Specific Nodes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEVER_ALLOCATE_TO_SPECIFIC_NODES_FEATURE_COUNT = DEPLOYMENT_OPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.MoveComponentsImpl <em>Move Components</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.MoveComponentsImpl
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getMoveComponents()
	 * @generated
	 */
	int MOVE_COMPONENTS = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_COMPONENTS__ID = DEPLOYMENT_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_COMPONENTS__RELATIONS = DEPLOYMENT_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_COMPONENTS__CONFLICTS_WITH = DEPLOYMENT_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_COMPONENTS__HAS_CONFLICTS = DEPLOYMENT_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_COMPONENTS__DUPLICATE_OF = DEPLOYMENT_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_COMPONENTS__HAS_DUPLICATES = DEPLOYMENT_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_COMPONENTS__DEPENDS_ON = DEPLOYMENT_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_COMPONENTS__HAS_DEPENDENTS = DEPLOYMENT_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_COMPONENTS__PARENT_OF = DEPLOYMENT_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_COMPONENTS__SUBPART_OF = DEPLOYMENT_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_COMPONENTS__TRIGGER_OF = DEPLOYMENT_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_COMPONENTS__TRIGGERED_BY = DEPLOYMENT_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_COMPONENTS__RESOLVES = DEPLOYMENT_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_COMPONENTS__RESOLVED_BY = DEPLOYMENT_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_COMPONENTS__ALTERNATIVE_TO = DEPLOYMENT_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_COMPONENTS__HAS_ALTERNATIVES = DEPLOYMENT_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_COMPONENTS__COULD_RESOLVE = DEPLOYMENT_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_COMPONENTS__COULD_BE_RESOLVED_BY = DEPLOYMENT_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_COMPONENTS__STAKEHOLDER_OF = DEPLOYMENT_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_COMPONENTS__HAS_STAKEHOLDERS = DEPLOYMENT_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_COMPONENTS__SELECTED = DEPLOYMENT_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_COMPONENTS__SELECTED_BY = DEPLOYMENT_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_COMPONENTS__DESCRIPTION = DEPLOYMENT_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_COMPONENTS__KEYWORDS = DEPLOYMENT_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_COMPONENTS__REPOSITORY = DEPLOYMENT_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_COMPONENTS__RATIONALE = DEPLOYMENT_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_COMPONENTS__IS_MODELLED = DEPLOYMENT_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_COMPONENTS__IS_IMPLEMENTED = DEPLOYMENT_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_COMPONENTS__TIME_STAMP = DEPLOYMENT_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_COMPONENTS__EFFECTS = DEPLOYMENT_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_COMPONENTS__USED_TERMS = DEPLOYMENT_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_COMPONENTS__ANALYSIS_RATIONALE = DEPLOYMENT_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The number of structural features of the '<em>Move Components</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_COMPONENTS_FEATURE_COUNT = DEPLOYMENT_OPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.IntroduceNewComponentImpl <em>Introduce New Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.IntroduceNewComponentImpl
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getIntroduceNewComponent()
	 * @generated
	 */
	int INTRODUCE_NEW_COMPONENT = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_COMPONENT__ID = COMPONENT_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_COMPONENT__RELATIONS = COMPONENT_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_COMPONENT__CONFLICTS_WITH = COMPONENT_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_COMPONENT__HAS_CONFLICTS = COMPONENT_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_COMPONENT__DUPLICATE_OF = COMPONENT_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_COMPONENT__HAS_DUPLICATES = COMPONENT_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_COMPONENT__DEPENDS_ON = COMPONENT_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_COMPONENT__HAS_DEPENDENTS = COMPONENT_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_COMPONENT__PARENT_OF = COMPONENT_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_COMPONENT__SUBPART_OF = COMPONENT_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_COMPONENT__TRIGGER_OF = COMPONENT_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_COMPONENT__TRIGGERED_BY = COMPONENT_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_COMPONENT__RESOLVES = COMPONENT_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_COMPONENT__RESOLVED_BY = COMPONENT_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_COMPONENT__ALTERNATIVE_TO = COMPONENT_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_COMPONENT__HAS_ALTERNATIVES = COMPONENT_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_COMPONENT__COULD_RESOLVE = COMPONENT_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_COMPONENT__COULD_BE_RESOLVED_BY = COMPONENT_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_COMPONENT__STAKEHOLDER_OF = COMPONENT_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_COMPONENT__HAS_STAKEHOLDERS = COMPONENT_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_COMPONENT__SELECTED = COMPONENT_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_COMPONENT__SELECTED_BY = COMPONENT_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_COMPONENT__DESCRIPTION = COMPONENT_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_COMPONENT__KEYWORDS = COMPONENT_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_COMPONENT__REPOSITORY = COMPONENT_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_COMPONENT__RATIONALE = COMPONENT_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_COMPONENT__IS_MODELLED = COMPONENT_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_COMPONENT__IS_IMPLEMENTED = COMPONENT_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_COMPONENT__TIME_STAMP = COMPONENT_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_COMPONENT__EFFECTS = COMPONENT_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_COMPONENT__USED_TERMS = COMPONENT_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_COMPONENT__ANALYSIS_RATIONALE = COMPONENT_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The number of structural features of the '<em>Introduce New Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_COMPONENT_FEATURE_COUNT = COMPONENT_OPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.IntroduceNewAdapterImpl <em>Introduce New Adapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.IntroduceNewAdapterImpl
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getIntroduceNewAdapter()
	 * @generated
	 */
	int INTRODUCE_NEW_ADAPTER = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_ADAPTER__ID = COMPONENT_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_ADAPTER__RELATIONS = COMPONENT_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_ADAPTER__CONFLICTS_WITH = COMPONENT_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_ADAPTER__HAS_CONFLICTS = COMPONENT_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_ADAPTER__DUPLICATE_OF = COMPONENT_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_ADAPTER__HAS_DUPLICATES = COMPONENT_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_ADAPTER__DEPENDS_ON = COMPONENT_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_ADAPTER__HAS_DEPENDENTS = COMPONENT_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_ADAPTER__PARENT_OF = COMPONENT_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_ADAPTER__SUBPART_OF = COMPONENT_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_ADAPTER__TRIGGER_OF = COMPONENT_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_ADAPTER__TRIGGERED_BY = COMPONENT_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_ADAPTER__RESOLVES = COMPONENT_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_ADAPTER__RESOLVED_BY = COMPONENT_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_ADAPTER__ALTERNATIVE_TO = COMPONENT_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_ADAPTER__HAS_ALTERNATIVES = COMPONENT_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_ADAPTER__COULD_RESOLVE = COMPONENT_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_ADAPTER__COULD_BE_RESOLVED_BY = COMPONENT_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_ADAPTER__STAKEHOLDER_OF = COMPONENT_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_ADAPTER__HAS_STAKEHOLDERS = COMPONENT_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_ADAPTER__SELECTED = COMPONENT_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_ADAPTER__SELECTED_BY = COMPONENT_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_ADAPTER__DESCRIPTION = COMPONENT_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_ADAPTER__KEYWORDS = COMPONENT_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_ADAPTER__REPOSITORY = COMPONENT_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_ADAPTER__RATIONALE = COMPONENT_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_ADAPTER__IS_MODELLED = COMPONENT_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_ADAPTER__IS_IMPLEMENTED = COMPONENT_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_ADAPTER__TIME_STAMP = COMPONENT_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_ADAPTER__EFFECTS = COMPONENT_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_ADAPTER__USED_TERMS = COMPONENT_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_ADAPTER__ANALYSIS_RATIONALE = COMPONENT_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The number of structural features of the '<em>Introduce New Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_ADAPTER_FEATURE_COUNT = COMPONENT_OPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.ReuseComponentImpl <em>Reuse Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ReuseComponentImpl
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getReuseComponent()
	 * @generated
	 */
	int REUSE_COMPONENT = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_COMPONENT__ID = COMPONENT_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_COMPONENT__RELATIONS = COMPONENT_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_COMPONENT__CONFLICTS_WITH = COMPONENT_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_COMPONENT__HAS_CONFLICTS = COMPONENT_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_COMPONENT__DUPLICATE_OF = COMPONENT_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_COMPONENT__HAS_DUPLICATES = COMPONENT_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_COMPONENT__DEPENDS_ON = COMPONENT_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_COMPONENT__HAS_DEPENDENTS = COMPONENT_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_COMPONENT__PARENT_OF = COMPONENT_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_COMPONENT__SUBPART_OF = COMPONENT_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_COMPONENT__TRIGGER_OF = COMPONENT_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_COMPONENT__TRIGGERED_BY = COMPONENT_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_COMPONENT__RESOLVES = COMPONENT_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_COMPONENT__RESOLVED_BY = COMPONENT_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_COMPONENT__ALTERNATIVE_TO = COMPONENT_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_COMPONENT__HAS_ALTERNATIVES = COMPONENT_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_COMPONENT__COULD_RESOLVE = COMPONENT_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_COMPONENT__COULD_BE_RESOLVED_BY = COMPONENT_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_COMPONENT__STAKEHOLDER_OF = COMPONENT_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_COMPONENT__HAS_STAKEHOLDERS = COMPONENT_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_COMPONENT__SELECTED = COMPONENT_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_COMPONENT__SELECTED_BY = COMPONENT_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_COMPONENT__DESCRIPTION = COMPONENT_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_COMPONENT__KEYWORDS = COMPONENT_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_COMPONENT__REPOSITORY = COMPONENT_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_COMPONENT__RATIONALE = COMPONENT_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_COMPONENT__IS_MODELLED = COMPONENT_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_COMPONENT__IS_IMPLEMENTED = COMPONENT_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_COMPONENT__TIME_STAMP = COMPONENT_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_COMPONENT__EFFECTS = COMPONENT_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_COMPONENT__USED_TERMS = COMPONENT_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_COMPONENT__ANALYSIS_RATIONALE = COMPONENT_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The number of structural features of the '<em>Reuse Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_COMPONENT_FEATURE_COUNT = COMPONENT_OPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.BanComponentImpl <em>Ban Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.BanComponentImpl
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getBanComponent()
	 * @generated
	 */
	int BAN_COMPONENT = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAN_COMPONENT__ID = COMPONENT_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAN_COMPONENT__RELATIONS = COMPONENT_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAN_COMPONENT__CONFLICTS_WITH = COMPONENT_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAN_COMPONENT__HAS_CONFLICTS = COMPONENT_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAN_COMPONENT__DUPLICATE_OF = COMPONENT_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAN_COMPONENT__HAS_DUPLICATES = COMPONENT_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAN_COMPONENT__DEPENDS_ON = COMPONENT_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAN_COMPONENT__HAS_DEPENDENTS = COMPONENT_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAN_COMPONENT__PARENT_OF = COMPONENT_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAN_COMPONENT__SUBPART_OF = COMPONENT_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAN_COMPONENT__TRIGGER_OF = COMPONENT_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAN_COMPONENT__TRIGGERED_BY = COMPONENT_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAN_COMPONENT__RESOLVES = COMPONENT_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAN_COMPONENT__RESOLVED_BY = COMPONENT_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAN_COMPONENT__ALTERNATIVE_TO = COMPONENT_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAN_COMPONENT__HAS_ALTERNATIVES = COMPONENT_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAN_COMPONENT__COULD_RESOLVE = COMPONENT_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAN_COMPONENT__COULD_BE_RESOLVED_BY = COMPONENT_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAN_COMPONENT__STAKEHOLDER_OF = COMPONENT_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAN_COMPONENT__HAS_STAKEHOLDERS = COMPONENT_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAN_COMPONENT__SELECTED = COMPONENT_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAN_COMPONENT__SELECTED_BY = COMPONENT_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAN_COMPONENT__DESCRIPTION = COMPONENT_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAN_COMPONENT__KEYWORDS = COMPONENT_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAN_COMPONENT__REPOSITORY = COMPONENT_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAN_COMPONENT__RATIONALE = COMPONENT_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAN_COMPONENT__IS_MODELLED = COMPONENT_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAN_COMPONENT__IS_IMPLEMENTED = COMPONENT_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAN_COMPONENT__TIME_STAMP = COMPONENT_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAN_COMPONENT__EFFECTS = COMPONENT_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAN_COMPONENT__USED_TERMS = COMPONENT_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAN_COMPONENT__ANALYSIS_RATIONALE = COMPONENT_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The number of structural features of the '<em>Ban Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAN_COMPONENT_FEATURE_COUNT = COMPONENT_OPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.ReplaceComponentsImpl <em>Replace Components</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ReplaceComponentsImpl
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getReplaceComponents()
	 * @generated
	 */
	int REPLACE_COMPONENTS = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_COMPONENTS__ID = COMPONENT_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_COMPONENTS__RELATIONS = COMPONENT_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_COMPONENTS__CONFLICTS_WITH = COMPONENT_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_COMPONENTS__HAS_CONFLICTS = COMPONENT_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_COMPONENTS__DUPLICATE_OF = COMPONENT_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_COMPONENTS__HAS_DUPLICATES = COMPONENT_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_COMPONENTS__DEPENDS_ON = COMPONENT_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_COMPONENTS__HAS_DEPENDENTS = COMPONENT_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_COMPONENTS__PARENT_OF = COMPONENT_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_COMPONENTS__SUBPART_OF = COMPONENT_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_COMPONENTS__TRIGGER_OF = COMPONENT_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_COMPONENTS__TRIGGERED_BY = COMPONENT_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_COMPONENTS__RESOLVES = COMPONENT_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_COMPONENTS__RESOLVED_BY = COMPONENT_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_COMPONENTS__ALTERNATIVE_TO = COMPONENT_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_COMPONENTS__HAS_ALTERNATIVES = COMPONENT_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_COMPONENTS__COULD_RESOLVE = COMPONENT_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_COMPONENTS__COULD_BE_RESOLVED_BY = COMPONENT_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_COMPONENTS__STAKEHOLDER_OF = COMPONENT_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_COMPONENTS__HAS_STAKEHOLDERS = COMPONENT_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_COMPONENTS__SELECTED = COMPONENT_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_COMPONENTS__SELECTED_BY = COMPONENT_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_COMPONENTS__DESCRIPTION = COMPONENT_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_COMPONENTS__KEYWORDS = COMPONENT_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_COMPONENTS__REPOSITORY = COMPONENT_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_COMPONENTS__RATIONALE = COMPONENT_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_COMPONENTS__IS_MODELLED = COMPONENT_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_COMPONENTS__IS_IMPLEMENTED = COMPONENT_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_COMPONENTS__TIME_STAMP = COMPONENT_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_COMPONENTS__EFFECTS = COMPONENT_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_COMPONENTS__USED_TERMS = COMPONENT_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_COMPONENTS__ANALYSIS_RATIONALE = COMPONENT_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The number of structural features of the '<em>Replace Components</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_COMPONENTS_FEATURE_COUNT = COMPONENT_OPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.SplitComponentImpl <em>Split Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.SplitComponentImpl
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getSplitComponent()
	 * @generated
	 */
	int SPLIT_COMPONENT = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_COMPONENT__ID = COMPONENT_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_COMPONENT__RELATIONS = COMPONENT_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_COMPONENT__CONFLICTS_WITH = COMPONENT_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_COMPONENT__HAS_CONFLICTS = COMPONENT_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_COMPONENT__DUPLICATE_OF = COMPONENT_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_COMPONENT__HAS_DUPLICATES = COMPONENT_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_COMPONENT__DEPENDS_ON = COMPONENT_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_COMPONENT__HAS_DEPENDENTS = COMPONENT_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_COMPONENT__PARENT_OF = COMPONENT_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_COMPONENT__SUBPART_OF = COMPONENT_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_COMPONENT__TRIGGER_OF = COMPONENT_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_COMPONENT__TRIGGERED_BY = COMPONENT_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_COMPONENT__RESOLVES = COMPONENT_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_COMPONENT__RESOLVED_BY = COMPONENT_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_COMPONENT__ALTERNATIVE_TO = COMPONENT_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_COMPONENT__HAS_ALTERNATIVES = COMPONENT_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_COMPONENT__COULD_RESOLVE = COMPONENT_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_COMPONENT__COULD_BE_RESOLVED_BY = COMPONENT_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_COMPONENT__STAKEHOLDER_OF = COMPONENT_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_COMPONENT__HAS_STAKEHOLDERS = COMPONENT_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_COMPONENT__SELECTED = COMPONENT_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_COMPONENT__SELECTED_BY = COMPONENT_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_COMPONENT__DESCRIPTION = COMPONENT_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_COMPONENT__KEYWORDS = COMPONENT_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_COMPONENT__REPOSITORY = COMPONENT_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_COMPONENT__RATIONALE = COMPONENT_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_COMPONENT__IS_MODELLED = COMPONENT_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_COMPONENT__IS_IMPLEMENTED = COMPONENT_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_COMPONENT__TIME_STAMP = COMPONENT_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_COMPONENT__EFFECTS = COMPONENT_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_COMPONENT__USED_TERMS = COMPONENT_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_COMPONENT__ANALYSIS_RATIONALE = COMPONENT_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The number of structural features of the '<em>Split Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_COMPONENT_FEATURE_COUNT = COMPONENT_OPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.MergeComponentsImpl <em>Merge Components</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.MergeComponentsImpl
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getMergeComponents()
	 * @generated
	 */
	int MERGE_COMPONENTS = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COMPONENTS__ID = COMPONENT_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COMPONENTS__RELATIONS = COMPONENT_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COMPONENTS__CONFLICTS_WITH = COMPONENT_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COMPONENTS__HAS_CONFLICTS = COMPONENT_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COMPONENTS__DUPLICATE_OF = COMPONENT_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COMPONENTS__HAS_DUPLICATES = COMPONENT_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COMPONENTS__DEPENDS_ON = COMPONENT_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COMPONENTS__HAS_DEPENDENTS = COMPONENT_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COMPONENTS__PARENT_OF = COMPONENT_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COMPONENTS__SUBPART_OF = COMPONENT_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COMPONENTS__TRIGGER_OF = COMPONENT_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COMPONENTS__TRIGGERED_BY = COMPONENT_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COMPONENTS__RESOLVES = COMPONENT_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COMPONENTS__RESOLVED_BY = COMPONENT_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COMPONENTS__ALTERNATIVE_TO = COMPONENT_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COMPONENTS__HAS_ALTERNATIVES = COMPONENT_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COMPONENTS__COULD_RESOLVE = COMPONENT_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COMPONENTS__COULD_BE_RESOLVED_BY = COMPONENT_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COMPONENTS__STAKEHOLDER_OF = COMPONENT_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COMPONENTS__HAS_STAKEHOLDERS = COMPONENT_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COMPONENTS__SELECTED = COMPONENT_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COMPONENTS__SELECTED_BY = COMPONENT_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COMPONENTS__DESCRIPTION = COMPONENT_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COMPONENTS__KEYWORDS = COMPONENT_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COMPONENTS__REPOSITORY = COMPONENT_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COMPONENTS__RATIONALE = COMPONENT_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COMPONENTS__IS_MODELLED = COMPONENT_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COMPONENTS__IS_IMPLEMENTED = COMPONENT_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COMPONENTS__TIME_STAMP = COMPONENT_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COMPONENTS__EFFECTS = COMPONENT_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COMPONENTS__USED_TERMS = COMPONENT_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COMPONENTS__ANALYSIS_RATIONALE = COMPONENT_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The number of structural features of the '<em>Merge Components</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COMPONENTS_FEATURE_COUNT = COMPONENT_OPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.ChangeRolesImpl <em>Change Roles</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ChangeRolesImpl
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getChangeRoles()
	 * @generated
	 */
	int CHANGE_ROLES = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ROLES__ID = COMPONENT_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ROLES__RELATIONS = COMPONENT_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ROLES__CONFLICTS_WITH = COMPONENT_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ROLES__HAS_CONFLICTS = COMPONENT_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ROLES__DUPLICATE_OF = COMPONENT_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ROLES__HAS_DUPLICATES = COMPONENT_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ROLES__DEPENDS_ON = COMPONENT_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ROLES__HAS_DEPENDENTS = COMPONENT_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ROLES__PARENT_OF = COMPONENT_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ROLES__SUBPART_OF = COMPONENT_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ROLES__TRIGGER_OF = COMPONENT_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ROLES__TRIGGERED_BY = COMPONENT_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ROLES__RESOLVES = COMPONENT_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ROLES__RESOLVED_BY = COMPONENT_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ROLES__ALTERNATIVE_TO = COMPONENT_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ROLES__HAS_ALTERNATIVES = COMPONENT_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ROLES__COULD_RESOLVE = COMPONENT_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ROLES__COULD_BE_RESOLVED_BY = COMPONENT_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ROLES__STAKEHOLDER_OF = COMPONENT_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ROLES__HAS_STAKEHOLDERS = COMPONENT_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ROLES__SELECTED = COMPONENT_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ROLES__SELECTED_BY = COMPONENT_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ROLES__DESCRIPTION = COMPONENT_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ROLES__KEYWORDS = COMPONENT_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ROLES__REPOSITORY = COMPONENT_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ROLES__RATIONALE = COMPONENT_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ROLES__IS_MODELLED = COMPONENT_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ROLES__IS_IMPLEMENTED = COMPONENT_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ROLES__TIME_STAMP = COMPONENT_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ROLES__EFFECTS = COMPONENT_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ROLES__USED_TERMS = COMPONENT_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ROLES__ANALYSIS_RATIONALE = COMPONENT_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The number of structural features of the '<em>Change Roles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ROLES_FEATURE_COUNT = COMPONENT_OPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.DataTypeOptionImpl <em>Data Type Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.DataTypeOptionImpl
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getDataTypeOption()
	 * @generated
	 */
	int DATA_TYPE_OPTION = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPTION__ID = ARCH_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPTION__RELATIONS = ARCH_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPTION__CONFLICTS_WITH = ARCH_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPTION__HAS_CONFLICTS = ARCH_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPTION__DUPLICATE_OF = ARCH_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPTION__HAS_DUPLICATES = ARCH_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPTION__DEPENDS_ON = ARCH_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPTION__HAS_DEPENDENTS = ARCH_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPTION__PARENT_OF = ARCH_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPTION__SUBPART_OF = ARCH_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPTION__TRIGGER_OF = ARCH_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPTION__TRIGGERED_BY = ARCH_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPTION__RESOLVES = ARCH_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPTION__RESOLVED_BY = ARCH_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPTION__ALTERNATIVE_TO = ARCH_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPTION__HAS_ALTERNATIVES = ARCH_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPTION__COULD_RESOLVE = ARCH_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPTION__COULD_BE_RESOLVED_BY = ARCH_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPTION__STAKEHOLDER_OF = ARCH_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPTION__HAS_STAKEHOLDERS = ARCH_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPTION__SELECTED = ARCH_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPTION__SELECTED_BY = ARCH_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPTION__DESCRIPTION = ARCH_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPTION__KEYWORDS = ARCH_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPTION__REPOSITORY = ARCH_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPTION__RATIONALE = ARCH_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPTION__IS_MODELLED = ARCH_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPTION__IS_IMPLEMENTED = ARCH_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPTION__TIME_STAMP = ARCH_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPTION__EFFECTS = ARCH_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPTION__USED_TERMS = ARCH_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPTION__ANALYSIS_RATIONALE = ARCH_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The number of structural features of the '<em>Data Type Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPTION_FEATURE_COUNT = ARCH_OPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.ChangeDataTypeImpl <em>Change Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ChangeDataTypeImpl
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getChangeDataType()
	 * @generated
	 */
	int CHANGE_DATA_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DATA_TYPE__ID = DATA_TYPE_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DATA_TYPE__RELATIONS = DATA_TYPE_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DATA_TYPE__CONFLICTS_WITH = DATA_TYPE_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DATA_TYPE__HAS_CONFLICTS = DATA_TYPE_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DATA_TYPE__DUPLICATE_OF = DATA_TYPE_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DATA_TYPE__HAS_DUPLICATES = DATA_TYPE_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DATA_TYPE__DEPENDS_ON = DATA_TYPE_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DATA_TYPE__HAS_DEPENDENTS = DATA_TYPE_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DATA_TYPE__PARENT_OF = DATA_TYPE_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DATA_TYPE__SUBPART_OF = DATA_TYPE_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DATA_TYPE__TRIGGER_OF = DATA_TYPE_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DATA_TYPE__TRIGGERED_BY = DATA_TYPE_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DATA_TYPE__RESOLVES = DATA_TYPE_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DATA_TYPE__RESOLVED_BY = DATA_TYPE_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DATA_TYPE__ALTERNATIVE_TO = DATA_TYPE_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DATA_TYPE__HAS_ALTERNATIVES = DATA_TYPE_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DATA_TYPE__COULD_RESOLVE = DATA_TYPE_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DATA_TYPE__COULD_BE_RESOLVED_BY = DATA_TYPE_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DATA_TYPE__STAKEHOLDER_OF = DATA_TYPE_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DATA_TYPE__HAS_STAKEHOLDERS = DATA_TYPE_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DATA_TYPE__SELECTED = DATA_TYPE_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DATA_TYPE__SELECTED_BY = DATA_TYPE_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DATA_TYPE__DESCRIPTION = DATA_TYPE_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DATA_TYPE__KEYWORDS = DATA_TYPE_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DATA_TYPE__REPOSITORY = DATA_TYPE_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DATA_TYPE__RATIONALE = DATA_TYPE_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DATA_TYPE__IS_MODELLED = DATA_TYPE_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DATA_TYPE__IS_IMPLEMENTED = DATA_TYPE_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DATA_TYPE__TIME_STAMP = DATA_TYPE_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DATA_TYPE__EFFECTS = DATA_TYPE_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DATA_TYPE__USED_TERMS = DATA_TYPE_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DATA_TYPE__ANALYSIS_RATIONALE = DATA_TYPE_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The number of structural features of the '<em>Change Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DATA_TYPE_FEATURE_COUNT = DATA_TYPE_OPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.IntroduceNewDataTypeImpl <em>Introduce New Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.IntroduceNewDataTypeImpl
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getIntroduceNewDataType()
	 * @generated
	 */
	int INTRODUCE_NEW_DATA_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_DATA_TYPE__ID = DATA_TYPE_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_DATA_TYPE__RELATIONS = DATA_TYPE_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_DATA_TYPE__CONFLICTS_WITH = DATA_TYPE_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_DATA_TYPE__HAS_CONFLICTS = DATA_TYPE_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_DATA_TYPE__DUPLICATE_OF = DATA_TYPE_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_DATA_TYPE__HAS_DUPLICATES = DATA_TYPE_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_DATA_TYPE__DEPENDS_ON = DATA_TYPE_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_DATA_TYPE__HAS_DEPENDENTS = DATA_TYPE_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_DATA_TYPE__PARENT_OF = DATA_TYPE_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_DATA_TYPE__SUBPART_OF = DATA_TYPE_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_DATA_TYPE__TRIGGER_OF = DATA_TYPE_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_DATA_TYPE__TRIGGERED_BY = DATA_TYPE_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_DATA_TYPE__RESOLVES = DATA_TYPE_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_DATA_TYPE__RESOLVED_BY = DATA_TYPE_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_DATA_TYPE__ALTERNATIVE_TO = DATA_TYPE_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_DATA_TYPE__HAS_ALTERNATIVES = DATA_TYPE_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_DATA_TYPE__COULD_RESOLVE = DATA_TYPE_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_DATA_TYPE__COULD_BE_RESOLVED_BY = DATA_TYPE_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_DATA_TYPE__STAKEHOLDER_OF = DATA_TYPE_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_DATA_TYPE__HAS_STAKEHOLDERS = DATA_TYPE_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_DATA_TYPE__SELECTED = DATA_TYPE_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_DATA_TYPE__SELECTED_BY = DATA_TYPE_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_DATA_TYPE__DESCRIPTION = DATA_TYPE_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_DATA_TYPE__KEYWORDS = DATA_TYPE_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_DATA_TYPE__REPOSITORY = DATA_TYPE_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_DATA_TYPE__RATIONALE = DATA_TYPE_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_DATA_TYPE__IS_MODELLED = DATA_TYPE_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_DATA_TYPE__IS_IMPLEMENTED = DATA_TYPE_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_DATA_TYPE__TIME_STAMP = DATA_TYPE_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_DATA_TYPE__EFFECTS = DATA_TYPE_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_DATA_TYPE__USED_TERMS = DATA_TYPE_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_DATA_TYPE__ANALYSIS_RATIONALE = DATA_TYPE_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The number of structural features of the '<em>Introduce New Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_DATA_TYPE_FEATURE_COUNT = DATA_TYPE_OPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.RemoveDataTypeImpl <em>Remove Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.RemoveDataTypeImpl
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getRemoveDataType()
	 * @generated
	 */
	int REMOVE_DATA_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_DATA_TYPE__ID = DATA_TYPE_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_DATA_TYPE__RELATIONS = DATA_TYPE_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_DATA_TYPE__CONFLICTS_WITH = DATA_TYPE_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_DATA_TYPE__HAS_CONFLICTS = DATA_TYPE_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_DATA_TYPE__DUPLICATE_OF = DATA_TYPE_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_DATA_TYPE__HAS_DUPLICATES = DATA_TYPE_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_DATA_TYPE__DEPENDS_ON = DATA_TYPE_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_DATA_TYPE__HAS_DEPENDENTS = DATA_TYPE_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_DATA_TYPE__PARENT_OF = DATA_TYPE_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_DATA_TYPE__SUBPART_OF = DATA_TYPE_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_DATA_TYPE__TRIGGER_OF = DATA_TYPE_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_DATA_TYPE__TRIGGERED_BY = DATA_TYPE_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_DATA_TYPE__RESOLVES = DATA_TYPE_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_DATA_TYPE__RESOLVED_BY = DATA_TYPE_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_DATA_TYPE__ALTERNATIVE_TO = DATA_TYPE_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_DATA_TYPE__HAS_ALTERNATIVES = DATA_TYPE_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_DATA_TYPE__COULD_RESOLVE = DATA_TYPE_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_DATA_TYPE__COULD_BE_RESOLVED_BY = DATA_TYPE_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_DATA_TYPE__STAKEHOLDER_OF = DATA_TYPE_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_DATA_TYPE__HAS_STAKEHOLDERS = DATA_TYPE_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_DATA_TYPE__SELECTED = DATA_TYPE_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_DATA_TYPE__SELECTED_BY = DATA_TYPE_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_DATA_TYPE__DESCRIPTION = DATA_TYPE_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_DATA_TYPE__KEYWORDS = DATA_TYPE_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_DATA_TYPE__REPOSITORY = DATA_TYPE_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_DATA_TYPE__RATIONALE = DATA_TYPE_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_DATA_TYPE__IS_MODELLED = DATA_TYPE_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_DATA_TYPE__IS_IMPLEMENTED = DATA_TYPE_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_DATA_TYPE__TIME_STAMP = DATA_TYPE_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_DATA_TYPE__EFFECTS = DATA_TYPE_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_DATA_TYPE__USED_TERMS = DATA_TYPE_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_DATA_TYPE__ANALYSIS_RATIONALE = DATA_TYPE_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The number of structural features of the '<em>Remove Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_DATA_TYPE_FEATURE_COUNT = DATA_TYPE_OPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.InterfaceOptionImpl <em>Interface Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.InterfaceOptionImpl
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getInterfaceOption()
	 * @generated
	 */
	int INTERFACE_OPTION = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPTION__ID = ARCH_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPTION__RELATIONS = ARCH_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPTION__CONFLICTS_WITH = ARCH_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPTION__HAS_CONFLICTS = ARCH_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPTION__DUPLICATE_OF = ARCH_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPTION__HAS_DUPLICATES = ARCH_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPTION__DEPENDS_ON = ARCH_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPTION__HAS_DEPENDENTS = ARCH_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPTION__PARENT_OF = ARCH_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPTION__SUBPART_OF = ARCH_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPTION__TRIGGER_OF = ARCH_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPTION__TRIGGERED_BY = ARCH_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPTION__RESOLVES = ARCH_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPTION__RESOLVED_BY = ARCH_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPTION__ALTERNATIVE_TO = ARCH_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPTION__HAS_ALTERNATIVES = ARCH_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPTION__COULD_RESOLVE = ARCH_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPTION__COULD_BE_RESOLVED_BY = ARCH_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPTION__STAKEHOLDER_OF = ARCH_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPTION__HAS_STAKEHOLDERS = ARCH_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPTION__SELECTED = ARCH_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPTION__SELECTED_BY = ARCH_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPTION__DESCRIPTION = ARCH_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPTION__KEYWORDS = ARCH_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPTION__REPOSITORY = ARCH_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPTION__RATIONALE = ARCH_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPTION__IS_MODELLED = ARCH_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPTION__IS_IMPLEMENTED = ARCH_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPTION__TIME_STAMP = ARCH_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPTION__EFFECTS = ARCH_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPTION__USED_TERMS = ARCH_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPTION__ANALYSIS_RATIONALE = ARCH_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The number of structural features of the '<em>Interface Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPTION_FEATURE_COUNT = ARCH_OPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.ChangeInterfaceImpl <em>Change Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ChangeInterfaceImpl
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getChangeInterface()
	 * @generated
	 */
	int CHANGE_INTERFACE = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INTERFACE__ID = INTERFACE_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INTERFACE__RELATIONS = INTERFACE_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INTERFACE__CONFLICTS_WITH = INTERFACE_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INTERFACE__HAS_CONFLICTS = INTERFACE_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INTERFACE__DUPLICATE_OF = INTERFACE_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INTERFACE__HAS_DUPLICATES = INTERFACE_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INTERFACE__DEPENDS_ON = INTERFACE_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INTERFACE__HAS_DEPENDENTS = INTERFACE_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INTERFACE__PARENT_OF = INTERFACE_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INTERFACE__SUBPART_OF = INTERFACE_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INTERFACE__TRIGGER_OF = INTERFACE_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INTERFACE__TRIGGERED_BY = INTERFACE_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INTERFACE__RESOLVES = INTERFACE_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INTERFACE__RESOLVED_BY = INTERFACE_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INTERFACE__ALTERNATIVE_TO = INTERFACE_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INTERFACE__HAS_ALTERNATIVES = INTERFACE_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INTERFACE__COULD_RESOLVE = INTERFACE_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INTERFACE__COULD_BE_RESOLVED_BY = INTERFACE_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INTERFACE__STAKEHOLDER_OF = INTERFACE_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INTERFACE__HAS_STAKEHOLDERS = INTERFACE_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INTERFACE__SELECTED = INTERFACE_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INTERFACE__SELECTED_BY = INTERFACE_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INTERFACE__DESCRIPTION = INTERFACE_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INTERFACE__KEYWORDS = INTERFACE_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INTERFACE__REPOSITORY = INTERFACE_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INTERFACE__RATIONALE = INTERFACE_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INTERFACE__IS_MODELLED = INTERFACE_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INTERFACE__IS_IMPLEMENTED = INTERFACE_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INTERFACE__TIME_STAMP = INTERFACE_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INTERFACE__EFFECTS = INTERFACE_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INTERFACE__USED_TERMS = INTERFACE_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INTERFACE__ANALYSIS_RATIONALE = INTERFACE_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The number of structural features of the '<em>Change Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INTERFACE_FEATURE_COUNT = INTERFACE_OPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.RemoveInterfaceImpl <em>Remove Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.RemoveInterfaceImpl
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getRemoveInterface()
	 * @generated
	 */
	int REMOVE_INTERFACE = 28;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_INTERFACE__ID = INTERFACE_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_INTERFACE__RELATIONS = INTERFACE_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_INTERFACE__CONFLICTS_WITH = INTERFACE_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_INTERFACE__HAS_CONFLICTS = INTERFACE_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_INTERFACE__DUPLICATE_OF = INTERFACE_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_INTERFACE__HAS_DUPLICATES = INTERFACE_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_INTERFACE__DEPENDS_ON = INTERFACE_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_INTERFACE__HAS_DEPENDENTS = INTERFACE_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_INTERFACE__PARENT_OF = INTERFACE_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_INTERFACE__SUBPART_OF = INTERFACE_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_INTERFACE__TRIGGER_OF = INTERFACE_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_INTERFACE__TRIGGERED_BY = INTERFACE_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_INTERFACE__RESOLVES = INTERFACE_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_INTERFACE__RESOLVED_BY = INTERFACE_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_INTERFACE__ALTERNATIVE_TO = INTERFACE_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_INTERFACE__HAS_ALTERNATIVES = INTERFACE_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_INTERFACE__COULD_RESOLVE = INTERFACE_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_INTERFACE__COULD_BE_RESOLVED_BY = INTERFACE_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_INTERFACE__STAKEHOLDER_OF = INTERFACE_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_INTERFACE__HAS_STAKEHOLDERS = INTERFACE_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_INTERFACE__SELECTED = INTERFACE_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_INTERFACE__SELECTED_BY = INTERFACE_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_INTERFACE__DESCRIPTION = INTERFACE_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_INTERFACE__KEYWORDS = INTERFACE_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_INTERFACE__REPOSITORY = INTERFACE_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_INTERFACE__RATIONALE = INTERFACE_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_INTERFACE__IS_MODELLED = INTERFACE_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_INTERFACE__IS_IMPLEMENTED = INTERFACE_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_INTERFACE__TIME_STAMP = INTERFACE_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_INTERFACE__EFFECTS = INTERFACE_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_INTERFACE__USED_TERMS = INTERFACE_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_INTERFACE__ANALYSIS_RATIONALE = INTERFACE_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The number of structural features of the '<em>Remove Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_INTERFACE_FEATURE_COUNT = INTERFACE_OPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.IntroduceNewInterfaceImpl <em>Introduce New Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.IntroduceNewInterfaceImpl
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getIntroduceNewInterface()
	 * @generated
	 */
	int INTRODUCE_NEW_INTERFACE = 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_INTERFACE__ID = INTERFACE_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_INTERFACE__RELATIONS = INTERFACE_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_INTERFACE__CONFLICTS_WITH = INTERFACE_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_INTERFACE__HAS_CONFLICTS = INTERFACE_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_INTERFACE__DUPLICATE_OF = INTERFACE_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_INTERFACE__HAS_DUPLICATES = INTERFACE_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_INTERFACE__DEPENDS_ON = INTERFACE_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_INTERFACE__HAS_DEPENDENTS = INTERFACE_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_INTERFACE__PARENT_OF = INTERFACE_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_INTERFACE__SUBPART_OF = INTERFACE_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_INTERFACE__TRIGGER_OF = INTERFACE_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_INTERFACE__TRIGGERED_BY = INTERFACE_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_INTERFACE__RESOLVES = INTERFACE_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_INTERFACE__RESOLVED_BY = INTERFACE_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_INTERFACE__ALTERNATIVE_TO = INTERFACE_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_INTERFACE__HAS_ALTERNATIVES = INTERFACE_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_INTERFACE__COULD_RESOLVE = INTERFACE_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_INTERFACE__COULD_BE_RESOLVED_BY = INTERFACE_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_INTERFACE__STAKEHOLDER_OF = INTERFACE_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_INTERFACE__HAS_STAKEHOLDERS = INTERFACE_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_INTERFACE__SELECTED = INTERFACE_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_INTERFACE__SELECTED_BY = INTERFACE_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_INTERFACE__DESCRIPTION = INTERFACE_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_INTERFACE__KEYWORDS = INTERFACE_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_INTERFACE__REPOSITORY = INTERFACE_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_INTERFACE__RATIONALE = INTERFACE_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_INTERFACE__IS_MODELLED = INTERFACE_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_INTERFACE__IS_IMPLEMENTED = INTERFACE_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_INTERFACE__TIME_STAMP = INTERFACE_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_INTERFACE__EFFECTS = INTERFACE_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_INTERFACE__USED_TERMS = INTERFACE_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_INTERFACE__ANALYSIS_RATIONALE = INTERFACE_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The number of structural features of the '<em>Introduce New Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCE_NEW_INTERFACE_FEATURE_COUNT = INTERFACE_OPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.ArchCandidateImpl <em>Arch Candidate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchCandidateImpl
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getArchCandidate()
	 * @generated
	 */
	int ARCH_CANDIDATE = 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_CANDIDATE__ID = ARCH_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_CANDIDATE__RELATIONS = ARCH_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_CANDIDATE__CONFLICTS_WITH = ARCH_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_CANDIDATE__HAS_CONFLICTS = ARCH_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_CANDIDATE__DUPLICATE_OF = ARCH_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_CANDIDATE__HAS_DUPLICATES = ARCH_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_CANDIDATE__DEPENDS_ON = ARCH_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_CANDIDATE__HAS_DEPENDENTS = ARCH_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_CANDIDATE__PARENT_OF = ARCH_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_CANDIDATE__SUBPART_OF = ARCH_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_CANDIDATE__TRIGGER_OF = ARCH_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_CANDIDATE__TRIGGERED_BY = ARCH_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_CANDIDATE__RESOLVES = ARCH_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_CANDIDATE__RESOLVED_BY = ARCH_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_CANDIDATE__ALTERNATIVE_TO = ARCH_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_CANDIDATE__HAS_ALTERNATIVES = ARCH_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_CANDIDATE__COULD_RESOLVE = ARCH_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_CANDIDATE__COULD_BE_RESOLVED_BY = ARCH_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_CANDIDATE__STAKEHOLDER_OF = ARCH_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_CANDIDATE__HAS_STAKEHOLDERS = ARCH_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_CANDIDATE__SELECTED = ARCH_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_CANDIDATE__SELECTED_BY = ARCH_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_CANDIDATE__DESCRIPTION = ARCH_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_CANDIDATE__KEYWORDS = ARCH_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_CANDIDATE__REPOSITORY = ARCH_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_CANDIDATE__RATIONALE = ARCH_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_CANDIDATE__IS_MODELLED = ARCH_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_CANDIDATE__IS_IMPLEMENTED = ARCH_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_CANDIDATE__TIME_STAMP = ARCH_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_CANDIDATE__EFFECTS = ARCH_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_CANDIDATE__USED_TERMS = ARCH_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_CANDIDATE__ANALYSIS_RATIONALE = ARCH_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Sub Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_CANDIDATE__SUB_OPTIONS = ARCH_OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arch Candidate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_CANDIDATE_FEATURE_COUNT = ARCH_OPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.AssembleComponentImpl <em>Assemble Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.AssembleComponentImpl
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getAssembleComponent()
	 * @generated
	 */
	int ASSEMBLE_COMPONENT = 31;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLE_COMPONENT__ID = COMPONENT_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLE_COMPONENT__RELATIONS = COMPONENT_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLE_COMPONENT__CONFLICTS_WITH = COMPONENT_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLE_COMPONENT__HAS_CONFLICTS = COMPONENT_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLE_COMPONENT__DUPLICATE_OF = COMPONENT_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLE_COMPONENT__HAS_DUPLICATES = COMPONENT_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLE_COMPONENT__DEPENDS_ON = COMPONENT_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLE_COMPONENT__HAS_DEPENDENTS = COMPONENT_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLE_COMPONENT__PARENT_OF = COMPONENT_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLE_COMPONENT__SUBPART_OF = COMPONENT_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLE_COMPONENT__TRIGGER_OF = COMPONENT_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLE_COMPONENT__TRIGGERED_BY = COMPONENT_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLE_COMPONENT__RESOLVES = COMPONENT_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLE_COMPONENT__RESOLVED_BY = COMPONENT_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLE_COMPONENT__ALTERNATIVE_TO = COMPONENT_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLE_COMPONENT__HAS_ALTERNATIVES = COMPONENT_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLE_COMPONENT__COULD_RESOLVE = COMPONENT_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLE_COMPONENT__COULD_BE_RESOLVED_BY = COMPONENT_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLE_COMPONENT__STAKEHOLDER_OF = COMPONENT_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLE_COMPONENT__HAS_STAKEHOLDERS = COMPONENT_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLE_COMPONENT__SELECTED = COMPONENT_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLE_COMPONENT__SELECTED_BY = COMPONENT_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLE_COMPONENT__DESCRIPTION = COMPONENT_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLE_COMPONENT__KEYWORDS = COMPONENT_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLE_COMPONENT__REPOSITORY = COMPONENT_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLE_COMPONENT__RATIONALE = COMPONENT_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLE_COMPONENT__IS_MODELLED = COMPONENT_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLE_COMPONENT__IS_IMPLEMENTED = COMPONENT_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLE_COMPONENT__TIME_STAMP = COMPONENT_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLE_COMPONENT__EFFECTS = COMPONENT_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLE_COMPONENT__USED_TERMS = COMPONENT_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLE_COMPONENT__ANALYSIS_RATIONALE = COMPONENT_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The number of structural features of the '<em>Assemble Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLE_COMPONENT_FEATURE_COUNT = COMPONENT_OPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.AllocateComponentImpl <em>Allocate Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.AllocateComponentImpl
	 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getAllocateComponent()
	 * @generated
	 */
	int ALLOCATE_COMPONENT = 32;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_COMPONENT__ID = DEPLOYMENT_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_COMPONENT__RELATIONS = DEPLOYMENT_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_COMPONENT__CONFLICTS_WITH = DEPLOYMENT_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_COMPONENT__HAS_CONFLICTS = DEPLOYMENT_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_COMPONENT__DUPLICATE_OF = DEPLOYMENT_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_COMPONENT__HAS_DUPLICATES = DEPLOYMENT_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_COMPONENT__DEPENDS_ON = DEPLOYMENT_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_COMPONENT__HAS_DEPENDENTS = DEPLOYMENT_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_COMPONENT__PARENT_OF = DEPLOYMENT_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_COMPONENT__SUBPART_OF = DEPLOYMENT_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_COMPONENT__TRIGGER_OF = DEPLOYMENT_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_COMPONENT__TRIGGERED_BY = DEPLOYMENT_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_COMPONENT__RESOLVES = DEPLOYMENT_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_COMPONENT__RESOLVED_BY = DEPLOYMENT_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_COMPONENT__ALTERNATIVE_TO = DEPLOYMENT_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_COMPONENT__HAS_ALTERNATIVES = DEPLOYMENT_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_COMPONENT__COULD_RESOLVE = DEPLOYMENT_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_COMPONENT__COULD_BE_RESOLVED_BY = DEPLOYMENT_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_COMPONENT__STAKEHOLDER_OF = DEPLOYMENT_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_COMPONENT__HAS_STAKEHOLDERS = DEPLOYMENT_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_COMPONENT__SELECTED = DEPLOYMENT_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_COMPONENT__SELECTED_BY = DEPLOYMENT_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_COMPONENT__DESCRIPTION = DEPLOYMENT_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_COMPONENT__KEYWORDS = DEPLOYMENT_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_COMPONENT__REPOSITORY = DEPLOYMENT_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_COMPONENT__RATIONALE = DEPLOYMENT_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_COMPONENT__IS_MODELLED = DEPLOYMENT_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_COMPONENT__IS_IMPLEMENTED = DEPLOYMENT_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_COMPONENT__TIME_STAMP = DEPLOYMENT_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_COMPONENT__EFFECTS = DEPLOYMENT_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_COMPONENT__USED_TERMS = DEPLOYMENT_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_COMPONENT__ANALYSIS_RATIONALE = DEPLOYMENT_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The number of structural features of the '<em>Allocate Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_COMPONENT_FEATURE_COUNT = DEPLOYMENT_OPTION_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.archoptions.ProvidedFunctionality <em>Provided Functionality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Functionality</em>'.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.ProvidedFunctionality
	 * @generated
	 */
	EClass getProvidedFunctionality();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.archoptions.RequiredFunctionality <em>Required Functionality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Functionality</em>'.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.RequiredFunctionality
	 * @generated
	 */
	EClass getRequiredFunctionality();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.archoptions.FunctionalityConnection <em>Functionality Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functionality Connection</em>'.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.FunctionalityConnection
	 * @generated
	 */
	EClass getFunctionalityConnection();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.archoptions.MultipleInstantiation <em>Multiple Instantiation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Instantiation</em>'.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.MultipleInstantiation
	 * @generated
	 */
	EClass getMultipleInstantiation();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.archoptions.OnlySingleInstantiation <em>Only Single Instantiation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Only Single Instantiation</em>'.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.OnlySingleInstantiation
	 * @generated
	 */
	EClass getOnlySingleInstantiation();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.archoptions.OnlySingleAllocation <em>Only Single Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Only Single Allocation</em>'.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.OnlySingleAllocation
	 * @generated
	 */
	EClass getOnlySingleAllocation();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.archoptions.MultipleAllocation <em>Multiple Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Allocation</em>'.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.MultipleAllocation
	 * @generated
	 */
	EClass getMultipleAllocation();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.archoptions.AllocateTogether <em>Allocate Together</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allocate Together</em>'.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.AllocateTogether
	 * @generated
	 */
	EClass getAllocateTogether();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.archoptions.AllocateNeverTogether <em>Allocate Never Together</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allocate Never Together</em>'.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.AllocateNeverTogether
	 * @generated
	 */
	EClass getAllocateNeverTogether();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.archoptions.NeverAllocateToSpecificNodes <em>Never Allocate To Specific Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Never Allocate To Specific Nodes</em>'.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.NeverAllocateToSpecificNodes
	 * @generated
	 */
	EClass getNeverAllocateToSpecificNodes();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.archoptions.MoveComponents <em>Move Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Components</em>'.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.MoveComponents
	 * @generated
	 */
	EClass getMoveComponents();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.archoptions.IntroduceNewComponent <em>Introduce New Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Introduce New Component</em>'.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.IntroduceNewComponent
	 * @generated
	 */
	EClass getIntroduceNewComponent();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.archoptions.IntroduceNewAdapter <em>Introduce New Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Introduce New Adapter</em>'.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.IntroduceNewAdapter
	 * @generated
	 */
	EClass getIntroduceNewAdapter();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.archoptions.ReuseComponent <em>Reuse Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reuse Component</em>'.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.ReuseComponent
	 * @generated
	 */
	EClass getReuseComponent();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.archoptions.BanComponent <em>Ban Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ban Component</em>'.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.BanComponent
	 * @generated
	 */
	EClass getBanComponent();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.archoptions.ReplaceComponents <em>Replace Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Replace Components</em>'.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.ReplaceComponents
	 * @generated
	 */
	EClass getReplaceComponents();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.archoptions.SplitComponent <em>Split Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Split Component</em>'.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.SplitComponent
	 * @generated
	 */
	EClass getSplitComponent();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.archoptions.MergeComponents <em>Merge Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merge Components</em>'.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.MergeComponents
	 * @generated
	 */
	EClass getMergeComponents();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.archoptions.ChangeRoles <em>Change Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Roles</em>'.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.ChangeRoles
	 * @generated
	 */
	EClass getChangeRoles();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.archoptions.ComponentOption <em>Component Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Option</em>'.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.ComponentOption
	 * @generated
	 */
	EClass getComponentOption();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.archoptions.DeploymentOption <em>Deployment Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment Option</em>'.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.DeploymentOption
	 * @generated
	 */
	EClass getDeploymentOption();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.archoptions.ArchOption <em>Arch Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arch Option</em>'.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.ArchOption
	 * @generated
	 */
	EClass getArchOption();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.toometa.archoptions.ArchOption#getAnalysisRationale <em>Analysis Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Analysis Rationale</em>'.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.ArchOption#getAnalysisRationale()
	 * @see #getArchOption()
	 * @generated
	 */
	EReference getArchOption_AnalysisRationale();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.archoptions.ChangeDataType <em>Change Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Data Type</em>'.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.ChangeDataType
	 * @generated
	 */
	EClass getChangeDataType();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.archoptions.IntroduceNewDataType <em>Introduce New Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Introduce New Data Type</em>'.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.IntroduceNewDataType
	 * @generated
	 */
	EClass getIntroduceNewDataType();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.archoptions.RemoveDataType <em>Remove Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Data Type</em>'.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.RemoveDataType
	 * @generated
	 */
	EClass getRemoveDataType();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.archoptions.InterfaceOption <em>Interface Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Option</em>'.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.InterfaceOption
	 * @generated
	 */
	EClass getInterfaceOption();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.archoptions.DataTypeOption <em>Data Type Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type Option</em>'.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.DataTypeOption
	 * @generated
	 */
	EClass getDataTypeOption();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.archoptions.ChangeInterface <em>Change Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Interface</em>'.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.ChangeInterface
	 * @generated
	 */
	EClass getChangeInterface();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.archoptions.RemoveInterface <em>Remove Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Interface</em>'.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.RemoveInterface
	 * @generated
	 */
	EClass getRemoveInterface();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.archoptions.IntroduceNewInterface <em>Introduce New Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Introduce New Interface</em>'.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.IntroduceNewInterface
	 * @generated
	 */
	EClass getIntroduceNewInterface();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.archoptions.ArchCandidate <em>Arch Candidate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arch Candidate</em>'.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.ArchCandidate
	 * @generated
	 */
	EClass getArchCandidate();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.toometa.archoptions.ArchCandidate#getSubOptions <em>Sub Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Options</em>'.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.ArchCandidate#getSubOptions()
	 * @see #getArchCandidate()
	 * @generated
	 */
	EReference getArchCandidate_SubOptions();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.archoptions.AssembleComponent <em>Assemble Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assemble Component</em>'.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.AssembleComponent
	 * @generated
	 */
	EClass getAssembleComponent();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.archoptions.AllocateComponent <em>Allocate Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allocate Component</em>'.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.AllocateComponent
	 * @generated
	 */
	EClass getAllocateComponent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ArchoptionsFactory getArchoptionsFactory();

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
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.ProvidedFunctionalityImpl <em>Provided Functionality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ProvidedFunctionalityImpl
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getProvidedFunctionality()
		 * @generated
		 */
		EClass PROVIDED_FUNCTIONALITY = eINSTANCE.getProvidedFunctionality();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.RequiredFunctionalityImpl <em>Required Functionality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.RequiredFunctionalityImpl
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getRequiredFunctionality()
		 * @generated
		 */
		EClass REQUIRED_FUNCTIONALITY = eINSTANCE.getRequiredFunctionality();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.FunctionalityConnectionImpl <em>Functionality Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.FunctionalityConnectionImpl
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getFunctionalityConnection()
		 * @generated
		 */
		EClass FUNCTIONALITY_CONNECTION = eINSTANCE.getFunctionalityConnection();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.MultipleInstantiationImpl <em>Multiple Instantiation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.MultipleInstantiationImpl
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getMultipleInstantiation()
		 * @generated
		 */
		EClass MULTIPLE_INSTANTIATION = eINSTANCE.getMultipleInstantiation();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.OnlySingleInstantiationImpl <em>Only Single Instantiation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.OnlySingleInstantiationImpl
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getOnlySingleInstantiation()
		 * @generated
		 */
		EClass ONLY_SINGLE_INSTANTIATION = eINSTANCE.getOnlySingleInstantiation();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.OnlySingleAllocationImpl <em>Only Single Allocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.OnlySingleAllocationImpl
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getOnlySingleAllocation()
		 * @generated
		 */
		EClass ONLY_SINGLE_ALLOCATION = eINSTANCE.getOnlySingleAllocation();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.MultipleAllocationImpl <em>Multiple Allocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.MultipleAllocationImpl
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getMultipleAllocation()
		 * @generated
		 */
		EClass MULTIPLE_ALLOCATION = eINSTANCE.getMultipleAllocation();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.AllocateTogetherImpl <em>Allocate Together</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.AllocateTogetherImpl
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getAllocateTogether()
		 * @generated
		 */
		EClass ALLOCATE_TOGETHER = eINSTANCE.getAllocateTogether();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.AllocateNeverTogetherImpl <em>Allocate Never Together</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.AllocateNeverTogetherImpl
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getAllocateNeverTogether()
		 * @generated
		 */
		EClass ALLOCATE_NEVER_TOGETHER = eINSTANCE.getAllocateNeverTogether();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.NeverAllocateToSpecificNodesImpl <em>Never Allocate To Specific Nodes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.NeverAllocateToSpecificNodesImpl
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getNeverAllocateToSpecificNodes()
		 * @generated
		 */
		EClass NEVER_ALLOCATE_TO_SPECIFIC_NODES = eINSTANCE.getNeverAllocateToSpecificNodes();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.MoveComponentsImpl <em>Move Components</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.MoveComponentsImpl
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getMoveComponents()
		 * @generated
		 */
		EClass MOVE_COMPONENTS = eINSTANCE.getMoveComponents();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.IntroduceNewComponentImpl <em>Introduce New Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.IntroduceNewComponentImpl
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getIntroduceNewComponent()
		 * @generated
		 */
		EClass INTRODUCE_NEW_COMPONENT = eINSTANCE.getIntroduceNewComponent();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.IntroduceNewAdapterImpl <em>Introduce New Adapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.IntroduceNewAdapterImpl
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getIntroduceNewAdapter()
		 * @generated
		 */
		EClass INTRODUCE_NEW_ADAPTER = eINSTANCE.getIntroduceNewAdapter();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.ReuseComponentImpl <em>Reuse Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ReuseComponentImpl
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getReuseComponent()
		 * @generated
		 */
		EClass REUSE_COMPONENT = eINSTANCE.getReuseComponent();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.BanComponentImpl <em>Ban Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.BanComponentImpl
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getBanComponent()
		 * @generated
		 */
		EClass BAN_COMPONENT = eINSTANCE.getBanComponent();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.ReplaceComponentsImpl <em>Replace Components</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ReplaceComponentsImpl
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getReplaceComponents()
		 * @generated
		 */
		EClass REPLACE_COMPONENTS = eINSTANCE.getReplaceComponents();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.SplitComponentImpl <em>Split Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.SplitComponentImpl
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getSplitComponent()
		 * @generated
		 */
		EClass SPLIT_COMPONENT = eINSTANCE.getSplitComponent();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.MergeComponentsImpl <em>Merge Components</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.MergeComponentsImpl
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getMergeComponents()
		 * @generated
		 */
		EClass MERGE_COMPONENTS = eINSTANCE.getMergeComponents();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.ChangeRolesImpl <em>Change Roles</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ChangeRolesImpl
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getChangeRoles()
		 * @generated
		 */
		EClass CHANGE_ROLES = eINSTANCE.getChangeRoles();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.ComponentOptionImpl <em>Component Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ComponentOptionImpl
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getComponentOption()
		 * @generated
		 */
		EClass COMPONENT_OPTION = eINSTANCE.getComponentOption();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.DeploymentOptionImpl <em>Deployment Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.DeploymentOptionImpl
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getDeploymentOption()
		 * @generated
		 */
		EClass DEPLOYMENT_OPTION = eINSTANCE.getDeploymentOption();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.ArchOptionImpl <em>Arch Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchOptionImpl
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getArchOption()
		 * @generated
		 */
		EClass ARCH_OPTION = eINSTANCE.getArchOption();

		/**
		 * The meta object literal for the '<em><b>Analysis Rationale</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCH_OPTION__ANALYSIS_RATIONALE = eINSTANCE.getArchOption_AnalysisRationale();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.ChangeDataTypeImpl <em>Change Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ChangeDataTypeImpl
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getChangeDataType()
		 * @generated
		 */
		EClass CHANGE_DATA_TYPE = eINSTANCE.getChangeDataType();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.IntroduceNewDataTypeImpl <em>Introduce New Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.IntroduceNewDataTypeImpl
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getIntroduceNewDataType()
		 * @generated
		 */
		EClass INTRODUCE_NEW_DATA_TYPE = eINSTANCE.getIntroduceNewDataType();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.RemoveDataTypeImpl <em>Remove Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.RemoveDataTypeImpl
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getRemoveDataType()
		 * @generated
		 */
		EClass REMOVE_DATA_TYPE = eINSTANCE.getRemoveDataType();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.InterfaceOptionImpl <em>Interface Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.InterfaceOptionImpl
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getInterfaceOption()
		 * @generated
		 */
		EClass INTERFACE_OPTION = eINSTANCE.getInterfaceOption();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.DataTypeOptionImpl <em>Data Type Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.DataTypeOptionImpl
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getDataTypeOption()
		 * @generated
		 */
		EClass DATA_TYPE_OPTION = eINSTANCE.getDataTypeOption();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.ChangeInterfaceImpl <em>Change Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ChangeInterfaceImpl
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getChangeInterface()
		 * @generated
		 */
		EClass CHANGE_INTERFACE = eINSTANCE.getChangeInterface();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.RemoveInterfaceImpl <em>Remove Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.RemoveInterfaceImpl
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getRemoveInterface()
		 * @generated
		 */
		EClass REMOVE_INTERFACE = eINSTANCE.getRemoveInterface();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.IntroduceNewInterfaceImpl <em>Introduce New Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.IntroduceNewInterfaceImpl
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getIntroduceNewInterface()
		 * @generated
		 */
		EClass INTRODUCE_NEW_INTERFACE = eINSTANCE.getIntroduceNewInterface();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.ArchCandidateImpl <em>Arch Candidate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchCandidateImpl
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getArchCandidate()
		 * @generated
		 */
		EClass ARCH_CANDIDATE = eINSTANCE.getArchCandidate();

		/**
		 * The meta object literal for the '<em><b>Sub Options</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCH_CANDIDATE__SUB_OPTIONS = eINSTANCE.getArchCandidate_SubOptions();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.AssembleComponentImpl <em>Assemble Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.AssembleComponentImpl
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getAssembleComponent()
		 * @generated
		 */
		EClass ASSEMBLE_COMPONENT = eINSTANCE.getAssembleComponent();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.archoptions.impl.AllocateComponentImpl <em>Allocate Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.AllocateComponentImpl
		 * @see edu.kit.ipd.sdq.toometa.archoptions.impl.ArchoptionsPackageImpl#getAllocateComponent()
		 * @generated
		 */
		EClass ALLOCATE_COMPONENT = eINSTANCE.getAllocateComponent();

	}

} //ArchoptionsPackage
