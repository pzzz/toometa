/**
 */
package edu.kit.ipd.sdq.toometa.patterns;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

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
 * @see edu.kit.ipd.sdq.toometa.patterns.PatternsFactory
 * @model kind="package"
 * @generated
 */
public interface PatternsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "patterns";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.kit.edu/toometa/patterns/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "patterns";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PatternsPackage eINSTANCE = edu.kit.ipd.sdq.toometa.patterns.impl.PatternsPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.patterns.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.patterns.impl.CategoryImpl
	 * @see edu.kit.ipd.sdq.toometa.patterns.impl.PatternsPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__DESCRIPTION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.patterns.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.patterns.impl.RoleImpl
	 * @see edu.kit.ipd.sdq.toometa.patterns.impl.PatternsPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Desctiption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__DESCTIPTION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__MAX_INSTANCES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.patterns.impl.CoUsageImpl <em>Co Usage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.patterns.impl.CoUsageImpl
	 * @see edu.kit.ipd.sdq.toometa.patterns.impl.PatternsPackageImpl#getCoUsage()
	 * @generated
	 */
	int CO_USAGE = 2;

	/**
	 * The feature id for the '<em><b>Used With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO_USAGE__USED_WITH = 0;

	/**
	 * The number of structural features of the '<em>Co Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO_USAGE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.patterns.impl.SimilarImpl <em>Similar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.patterns.impl.SimilarImpl
	 * @see edu.kit.ipd.sdq.toometa.patterns.impl.PatternsPackageImpl#getSimilar()
	 * @generated
	 */
	int SIMILAR = 7;

	/**
	 * The feature id for the '<em><b>Similar To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMILAR__SIMILAR_TO = 0;

	/**
	 * The number of structural features of the '<em>Similar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMILAR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.patterns.impl.PatternRelationsImpl <em>Pattern Relations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.patterns.impl.PatternRelationsImpl
	 * @see edu.kit.ipd.sdq.toometa.patterns.impl.PatternsPackageImpl#getPatternRelations()
	 * @generated
	 */
	int PATTERN_RELATIONS = 3;

	/**
	 * The feature id for the '<em><b>Similar To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_RELATIONS__SIMILAR_TO = SIMILAR__SIMILAR_TO;

	/**
	 * The feature id for the '<em><b>Excludes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_RELATIONS__EXCLUDES = SIMILAR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Used With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_RELATIONS__USED_WITH = SIMILAR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alternative For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_RELATIONS__ALTERNATIVE_FOR = SIMILAR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_RELATIONS__DESCRIPTION = SIMILAR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Pattern Relations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_RELATIONS_FEATURE_COUNT = SIMILAR_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.patterns.impl.GeneralPatternDescriptionImpl <em>General Pattern Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.patterns.impl.GeneralPatternDescriptionImpl
	 * @see edu.kit.ipd.sdq.toometa.patterns.impl.PatternsPackageImpl#getGeneralPatternDescription()
	 * @generated
	 */
	int GENERAL_PATTERN_DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PATTERN_DESCRIPTION__PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Information Source</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PATTERN_DESCRIPTION__INFORMATION_SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PATTERN_DESCRIPTION__SHORT_DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PATTERN_DESCRIPTION__DIAGRAM = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PATTERN_DESCRIPTION__NAME = 4;

	/**
	 * The number of structural features of the '<em>General Pattern Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PATTERN_DESCRIPTION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.patterns.impl.ExclusionImpl <em>Exclusion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.patterns.impl.ExclusionImpl
	 * @see edu.kit.ipd.sdq.toometa.patterns.impl.PatternsPackageImpl#getExclusion()
	 * @generated
	 */
	int EXCLUSION = 5;

	/**
	 * The feature id for the '<em><b>Excludes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSION__EXCLUDES = 0;

	/**
	 * The number of structural features of the '<em>Exclusion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.patterns.impl.AlternativeImpl <em>Alternative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.patterns.impl.AlternativeImpl
	 * @see edu.kit.ipd.sdq.toometa.patterns.impl.PatternsPackageImpl#getAlternative()
	 * @generated
	 */
	int ALTERNATIVE = 6;

	/**
	 * The feature id for the '<em><b>Alternative For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__ALTERNATIVE_FOR = 0;

	/**
	 * The number of structural features of the '<em>Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.patterns.impl.PatternImpl <em>Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.patterns.impl.PatternImpl
	 * @see edu.kit.ipd.sdq.toometa.patterns.impl.PatternsPackageImpl#getPattern()
	 * @generated
	 */
	int PATTERN = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__PROPERTY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Information Source</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__INFORMATION_SOURCE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__SHORT_DESCRIPTION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__DIAGRAM = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__NAME = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__ROLE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__CONNECTORS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Similar To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__SIMILAR_TO = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Excludes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__EXCLUDES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Used With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__USED_WITH = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Alternative For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__ALTERNATIVE_FOR = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__DESCRIPTION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__REPOSITORY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__CATEGORIES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__DOMAIN = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Has Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__HAS_VARIANTS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 16;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.patterns.impl.PatternVariantImpl <em>Pattern Variant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.patterns.impl.PatternVariantImpl
	 * @see edu.kit.ipd.sdq.toometa.patterns.impl.PatternsPackageImpl#getPatternVariant()
	 * @generated
	 */
	int PATTERN_VARIANT = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_VARIANT__ID = PATTERN__ID;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_VARIANT__PROPERTY = PATTERN__PROPERTY;

	/**
	 * The feature id for the '<em><b>Information Source</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_VARIANT__INFORMATION_SOURCE = PATTERN__INFORMATION_SOURCE;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_VARIANT__SHORT_DESCRIPTION = PATTERN__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_VARIANT__DIAGRAM = PATTERN__DIAGRAM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_VARIANT__NAME = PATTERN__NAME;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_VARIANT__ROLE = PATTERN__ROLE;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_VARIANT__CONNECTORS = PATTERN__CONNECTORS;

	/**
	 * The feature id for the '<em><b>Similar To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_VARIANT__SIMILAR_TO = PATTERN__SIMILAR_TO;

	/**
	 * The feature id for the '<em><b>Excludes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_VARIANT__EXCLUDES = PATTERN__EXCLUDES;

	/**
	 * The feature id for the '<em><b>Used With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_VARIANT__USED_WITH = PATTERN__USED_WITH;

	/**
	 * The feature id for the '<em><b>Alternative For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_VARIANT__ALTERNATIVE_FOR = PATTERN__ALTERNATIVE_FOR;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_VARIANT__DESCRIPTION = PATTERN__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_VARIANT__REPOSITORY = PATTERN__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_VARIANT__CATEGORIES = PATTERN__CATEGORIES;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_VARIANT__DOMAIN = PATTERN__DOMAIN;

	/**
	 * The feature id for the '<em><b>Has Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_VARIANT__HAS_VARIANTS = PATTERN__HAS_VARIANTS;

	/**
	 * The feature id for the '<em><b>Base Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_VARIANT__BASE_PATTERN = PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Variant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_VARIANT_FEATURE_COUNT = PATTERN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.patterns.impl.ArchitecturalStructureImpl <em>Architectural Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.patterns.impl.ArchitecturalStructureImpl
	 * @see edu.kit.ipd.sdq.toometa.patterns.impl.PatternsPackageImpl#getArchitecturalStructure()
	 * @generated
	 */
	int ARCHITECTURAL_STRUCTURE = 9;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_STRUCTURE__ROLE = 0;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_STRUCTURE__CONNECTORS = 1;

	/**
	 * The number of structural features of the '<em>Architectural Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.patterns.impl.QuestionAnnotationsImpl <em>Question Annotations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.patterns.impl.QuestionAnnotationsImpl
	 * @see edu.kit.ipd.sdq.toometa.patterns.impl.PatternsPackageImpl#getQuestionAnnotations()
	 * @generated
	 */
	int QUESTION_ANNOTATIONS = 10;

	/**
	 * The number of structural features of the '<em>Question Annotations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_ANNOTATIONS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.patterns.impl.DomainTypeImpl <em>Domain Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.patterns.impl.DomainTypeImpl
	 * @see edu.kit.ipd.sdq.toometa.patterns.impl.PatternsPackageImpl#getDomainType()
	 * @generated
	 */
	int DOMAIN_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TYPE__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The number of structural features of the '<em>Domain Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TYPE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.patterns.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.patterns.impl.PropertyImpl
	 * @see edu.kit.ipd.sdq.toometa.patterns.impl.PatternsPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TERMS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.patterns.impl.QualityInfluenceImpl <em>Quality Influence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.patterns.impl.QualityInfluenceImpl
	 * @see edu.kit.ipd.sdq.toometa.patterns.impl.PatternsPackageImpl#getQualityInfluence()
	 * @generated
	 */
	int QUALITY_INFLUENCE = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_INFLUENCE__ID = PROPERTY__ID;

	/**
	 * The feature id for the '<em><b>Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_INFLUENCE__TERMS = PROPERTY__TERMS;

	/**
	 * The feature id for the '<em><b>Effect Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_INFLUENCE__EFFECT_TYPE = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_INFLUENCE__DESCRIPTION = PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Quality Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_INFLUENCE__QUALITY_TYPE = PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Quality Influence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_INFLUENCE_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.patterns.impl.PatternCatalogueImpl <em>Pattern Catalogue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.patterns.impl.PatternCatalogueImpl
	 * @see edu.kit.ipd.sdq.toometa.patterns.impl.PatternsPackageImpl#getPatternCatalogue()
	 * @generated
	 */
	int PATTERN_CATALOGUE = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CATALOGUE__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Patterns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CATALOGUE__PATTERNS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Domains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CATALOGUE__DOMAINS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CATALOGUE__CATEGORIES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Infrastructuretype</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CATALOGUE__INFRASTRUCTURETYPE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Pattern Catalogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CATALOGUE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.patterns.impl.InfrastructureTypeImpl <em>Infrastructure Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.patterns.impl.InfrastructureTypeImpl
	 * @see edu.kit.ipd.sdq.toometa.patterns.impl.PatternsPackageImpl#getInfrastructureType()
	 * @generated
	 */
	int INFRASTRUCTURE_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_TYPE__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_TYPE__NAME = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_TYPE__DESCRIPTION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Infrastructure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_TYPE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.patterns.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.patterns.impl.ConnectorImpl
	 * @see edu.kit.ipd.sdq.toometa.patterns.impl.PatternsPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Connector To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__CONNECTOR_TO = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connector From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__CONNECTOR_FROM = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DESCRIPTION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.patterns.impl.DrawbackImpl <em>Drawback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.patterns.impl.DrawbackImpl
	 * @see edu.kit.ipd.sdq.toometa.patterns.impl.PatternsPackageImpl#getDrawback()
	 * @generated
	 */
	int DRAWBACK = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWBACK__ID = PROPERTY__ID;

	/**
	 * The feature id for the '<em><b>Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWBACK__TERMS = PROPERTY__TERMS;

	/**
	 * The feature id for the '<em><b>Drawback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWBACK__DRAWBACK = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Drawback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWBACK_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.patterns.impl.KeywordImpl <em>Keyword</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.patterns.impl.KeywordImpl
	 * @see edu.kit.ipd.sdq.toometa.patterns.impl.PatternsPackageImpl#getKeyword()
	 * @generated
	 */
	int KEYWORD = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD__ID = PROPERTY__ID;

	/**
	 * The feature id for the '<em><b>Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD__TERMS = PROPERTY__TERMS;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD__KEYWORD = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Keyword</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.patterns.impl.GoalImpl <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.patterns.impl.GoalImpl
	 * @see edu.kit.ipd.sdq.toometa.patterns.impl.PatternsPackageImpl#getGoal()
	 * @generated
	 */
	int GOAL = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__ID = PROPERTY__ID;

	/**
	 * The feature id for the '<em><b>Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__TERMS = PROPERTY__TERMS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__DESCRIPTION = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.patterns.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.patterns.Category#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.Category#getDescription()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Description();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.patterns.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.patterns.Role#getDesctiption <em>Desctiption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desctiption</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.Role#getDesctiption()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Desctiption();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.patterns.Role#getMaxInstances <em>Max Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Instances</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.Role#getMaxInstances()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_MaxInstances();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.patterns.CoUsage <em>Co Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Co Usage</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.CoUsage
	 * @generated
	 */
	EClass getCoUsage();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.toometa.patterns.CoUsage#getUsedWith <em>Used With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Used With</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.CoUsage#getUsedWith()
	 * @see #getCoUsage()
	 * @generated
	 */
	EReference getCoUsage_UsedWith();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.patterns.PatternRelations <em>Pattern Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Relations</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.PatternRelations
	 * @generated
	 */
	EClass getPatternRelations();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.patterns.PatternRelations#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.PatternRelations#getDescription()
	 * @see #getPatternRelations()
	 * @generated
	 */
	EAttribute getPatternRelations_Description();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.patterns.GeneralPatternDescription <em>General Pattern Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Pattern Description</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.GeneralPatternDescription
	 * @generated
	 */
	EClass getGeneralPatternDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.toometa.patterns.GeneralPatternDescription#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.GeneralPatternDescription#getProperty()
	 * @see #getGeneralPatternDescription()
	 * @generated
	 */
	EReference getGeneralPatternDescription_Property();

	/**
	 * Returns the meta object for the attribute list '{@link edu.kit.ipd.sdq.toometa.patterns.GeneralPatternDescription#getInformationSource <em>Information Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Information Source</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.GeneralPatternDescription#getInformationSource()
	 * @see #getGeneralPatternDescription()
	 * @generated
	 */
	EAttribute getGeneralPatternDescription_InformationSource();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.patterns.GeneralPatternDescription#getShortDescription <em>Short Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Description</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.GeneralPatternDescription#getShortDescription()
	 * @see #getGeneralPatternDescription()
	 * @generated
	 */
	EAttribute getGeneralPatternDescription_ShortDescription();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.patterns.GeneralPatternDescription#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diagram</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.GeneralPatternDescription#getDiagram()
	 * @see #getGeneralPatternDescription()
	 * @generated
	 */
	EAttribute getGeneralPatternDescription_Diagram();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.patterns.GeneralPatternDescription#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.GeneralPatternDescription#getName()
	 * @see #getGeneralPatternDescription()
	 * @generated
	 */
	EAttribute getGeneralPatternDescription_Name();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.patterns.Exclusion <em>Exclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclusion</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.Exclusion
	 * @generated
	 */
	EClass getExclusion();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.toometa.patterns.Exclusion#getExcludes <em>Excludes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Excludes</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.Exclusion#getExcludes()
	 * @see #getExclusion()
	 * @generated
	 */
	EReference getExclusion_Excludes();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.patterns.Alternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternative</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.Alternative
	 * @generated
	 */
	EClass getAlternative();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.toometa.patterns.Alternative#getAlternativeFor <em>Alternative For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Alternative For</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.Alternative#getAlternativeFor()
	 * @see #getAlternative()
	 * @generated
	 */
	EReference getAlternative_AlternativeFor();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.patterns.Similar <em>Similar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Similar</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.Similar
	 * @generated
	 */
	EClass getSimilar();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.toometa.patterns.Similar#getSimilarTo <em>Similar To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Similar To</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.Similar#getSimilarTo()
	 * @see #getSimilar()
	 * @generated
	 */
	EReference getSimilar_SimilarTo();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.patterns.PatternVariant <em>Pattern Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Variant</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.PatternVariant
	 * @generated
	 */
	EClass getPatternVariant();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.toometa.patterns.PatternVariant#getBasePattern <em>Base Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Pattern</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.PatternVariant#getBasePattern()
	 * @see #getPatternVariant()
	 * @generated
	 */
	EReference getPatternVariant_BasePattern();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.patterns.ArchitecturalStructure <em>Architectural Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Architectural Structure</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.ArchitecturalStructure
	 * @generated
	 */
	EClass getArchitecturalStructure();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.toometa.patterns.ArchitecturalStructure#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.ArchitecturalStructure#getRole()
	 * @see #getArchitecturalStructure()
	 * @generated
	 */
	EReference getArchitecturalStructure_Role();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.toometa.patterns.ArchitecturalStructure#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connectors</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.ArchitecturalStructure#getConnectors()
	 * @see #getArchitecturalStructure()
	 * @generated
	 */
	EReference getArchitecturalStructure_Connectors();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.patterns.QuestionAnnotations <em>Question Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question Annotations</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.QuestionAnnotations
	 * @generated
	 */
	EClass getQuestionAnnotations();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.patterns.Pattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.Pattern
	 * @generated
	 */
	EClass getPattern();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.toometa.patterns.Pattern#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Repository</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.Pattern#getRepository()
	 * @see #getPattern()
	 * @generated
	 */
	EReference getPattern_Repository();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.toometa.patterns.Pattern#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Categories</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.Pattern#getCategories()
	 * @see #getPattern()
	 * @generated
	 */
	EReference getPattern_Categories();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.toometa.patterns.Pattern#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.Pattern#getDomain()
	 * @see #getPattern()
	 * @generated
	 */
	EReference getPattern_Domain();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.toometa.patterns.Pattern#getHasVariants <em>Has Variants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Variants</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.Pattern#getHasVariants()
	 * @see #getPattern()
	 * @generated
	 */
	EReference getPattern_HasVariants();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.patterns.DomainType <em>Domain Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Type</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.DomainType
	 * @generated
	 */
	EClass getDomainType();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.patterns.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.toometa.patterns.Property#getTerms <em>Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Terms</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.Property#getTerms()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Terms();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.patterns.QualityInfluence <em>Quality Influence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quality Influence</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.QualityInfluence
	 * @generated
	 */
	EClass getQualityInfluence();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.patterns.PatternCatalogue <em>Pattern Catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Catalogue</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.PatternCatalogue
	 * @generated
	 */
	EClass getPatternCatalogue();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.toometa.patterns.PatternCatalogue#getPatterns <em>Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Patterns</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.PatternCatalogue#getPatterns()
	 * @see #getPatternCatalogue()
	 * @generated
	 */
	EReference getPatternCatalogue_Patterns();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.toometa.patterns.PatternCatalogue#getDomains <em>Domains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domains</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.PatternCatalogue#getDomains()
	 * @see #getPatternCatalogue()
	 * @generated
	 */
	EReference getPatternCatalogue_Domains();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.toometa.patterns.PatternCatalogue#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categories</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.PatternCatalogue#getCategories()
	 * @see #getPatternCatalogue()
	 * @generated
	 */
	EReference getPatternCatalogue_Categories();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.toometa.patterns.PatternCatalogue#getInfrastructuretype <em>Infrastructuretype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Infrastructuretype</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.PatternCatalogue#getInfrastructuretype()
	 * @see #getPatternCatalogue()
	 * @generated
	 */
	EReference getPatternCatalogue_Infrastructuretype();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.patterns.InfrastructureType <em>Infrastructure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infrastructure Type</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.InfrastructureType
	 * @generated
	 */
	EClass getInfrastructureType();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.patterns.InfrastructureType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.InfrastructureType#getName()
	 * @see #getInfrastructureType()
	 * @generated
	 */
	EAttribute getInfrastructureType_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.patterns.InfrastructureType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.InfrastructureType#getDescription()
	 * @see #getInfrastructureType()
	 * @generated
	 */
	EAttribute getInfrastructureType_Description();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.patterns.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.toometa.patterns.Connector#getConnectorTo <em>Connector To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connector To</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.Connector#getConnectorTo()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_ConnectorTo();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.toometa.patterns.Connector#getConnectorFrom <em>Connector From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connector From</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.Connector#getConnectorFrom()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_ConnectorFrom();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.patterns.Connector#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.Connector#getDescription()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Description();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.patterns.Drawback <em>Drawback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drawback</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.Drawback
	 * @generated
	 */
	EClass getDrawback();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.patterns.Drawback#getDrawback <em>Drawback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drawback</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.Drawback#getDrawback()
	 * @see #getDrawback()
	 * @generated
	 */
	EAttribute getDrawback_Drawback();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.patterns.Keyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Keyword</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.Keyword
	 * @generated
	 */
	EClass getKeyword();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.patterns.Keyword#getKeyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keyword</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.Keyword#getKeyword()
	 * @see #getKeyword()
	 * @generated
	 */
	EAttribute getKeyword_Keyword();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.patterns.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.Goal
	 * @generated
	 */
	EClass getGoal();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.patterns.Goal#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.kit.ipd.sdq.toometa.patterns.Goal#getDescription()
	 * @see #getGoal()
	 * @generated
	 */
	EAttribute getGoal_Description();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PatternsFactory getPatternsFactory();

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
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.patterns.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.patterns.impl.CategoryImpl
		 * @see edu.kit.ipd.sdq.toometa.patterns.impl.PatternsPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__DESCRIPTION = eINSTANCE.getCategory_Description();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.patterns.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.patterns.impl.RoleImpl
		 * @see edu.kit.ipd.sdq.toometa.patterns.impl.PatternsPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Desctiption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__DESCTIPTION = eINSTANCE.getRole_Desctiption();

		/**
		 * The meta object literal for the '<em><b>Max Instances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__MAX_INSTANCES = eINSTANCE.getRole_MaxInstances();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.patterns.impl.CoUsageImpl <em>Co Usage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.patterns.impl.CoUsageImpl
		 * @see edu.kit.ipd.sdq.toometa.patterns.impl.PatternsPackageImpl#getCoUsage()
		 * @generated
		 */
		EClass CO_USAGE = eINSTANCE.getCoUsage();

		/**
		 * The meta object literal for the '<em><b>Used With</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CO_USAGE__USED_WITH = eINSTANCE.getCoUsage_UsedWith();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.patterns.impl.PatternRelationsImpl <em>Pattern Relations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.patterns.impl.PatternRelationsImpl
		 * @see edu.kit.ipd.sdq.toometa.patterns.impl.PatternsPackageImpl#getPatternRelations()
		 * @generated
		 */
		EClass PATTERN_RELATIONS = eINSTANCE.getPatternRelations();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_RELATIONS__DESCRIPTION = eINSTANCE.getPatternRelations_Description();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.patterns.impl.GeneralPatternDescriptionImpl <em>General Pattern Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.patterns.impl.GeneralPatternDescriptionImpl
		 * @see edu.kit.ipd.sdq.toometa.patterns.impl.PatternsPackageImpl#getGeneralPatternDescription()
		 * @generated
		 */
		EClass GENERAL_PATTERN_DESCRIPTION = eINSTANCE.getGeneralPatternDescription();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERAL_PATTERN_DESCRIPTION__PROPERTY = eINSTANCE.getGeneralPatternDescription_Property();

		/**
		 * The meta object literal for the '<em><b>Information Source</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERAL_PATTERN_DESCRIPTION__INFORMATION_SOURCE = eINSTANCE.getGeneralPatternDescription_InformationSource();

		/**
		 * The meta object literal for the '<em><b>Short Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERAL_PATTERN_DESCRIPTION__SHORT_DESCRIPTION = eINSTANCE.getGeneralPatternDescription_ShortDescription();

		/**
		 * The meta object literal for the '<em><b>Diagram</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERAL_PATTERN_DESCRIPTION__DIAGRAM = eINSTANCE.getGeneralPatternDescription_Diagram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERAL_PATTERN_DESCRIPTION__NAME = eINSTANCE.getGeneralPatternDescription_Name();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.patterns.impl.ExclusionImpl <em>Exclusion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.patterns.impl.ExclusionImpl
		 * @see edu.kit.ipd.sdq.toometa.patterns.impl.PatternsPackageImpl#getExclusion()
		 * @generated
		 */
		EClass EXCLUSION = eINSTANCE.getExclusion();

		/**
		 * The meta object literal for the '<em><b>Excludes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCLUSION__EXCLUDES = eINSTANCE.getExclusion_Excludes();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.patterns.impl.AlternativeImpl <em>Alternative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.patterns.impl.AlternativeImpl
		 * @see edu.kit.ipd.sdq.toometa.patterns.impl.PatternsPackageImpl#getAlternative()
		 * @generated
		 */
		EClass ALTERNATIVE = eINSTANCE.getAlternative();

		/**
		 * The meta object literal for the '<em><b>Alternative For</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVE__ALTERNATIVE_FOR = eINSTANCE.getAlternative_AlternativeFor();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.patterns.impl.SimilarImpl <em>Similar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.patterns.impl.SimilarImpl
		 * @see edu.kit.ipd.sdq.toometa.patterns.impl.PatternsPackageImpl#getSimilar()
		 * @generated
		 */
		EClass SIMILAR = eINSTANCE.getSimilar();

		/**
		 * The meta object literal for the '<em><b>Similar To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMILAR__SIMILAR_TO = eINSTANCE.getSimilar_SimilarTo();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.patterns.impl.PatternVariantImpl <em>Pattern Variant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.patterns.impl.PatternVariantImpl
		 * @see edu.kit.ipd.sdq.toometa.patterns.impl.PatternsPackageImpl#getPatternVariant()
		 * @generated
		 */
		EClass PATTERN_VARIANT = eINSTANCE.getPatternVariant();

		/**
		 * The meta object literal for the '<em><b>Base Pattern</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_VARIANT__BASE_PATTERN = eINSTANCE.getPatternVariant_BasePattern();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.patterns.impl.ArchitecturalStructureImpl <em>Architectural Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.patterns.impl.ArchitecturalStructureImpl
		 * @see edu.kit.ipd.sdq.toometa.patterns.impl.PatternsPackageImpl#getArchitecturalStructure()
		 * @generated
		 */
		EClass ARCHITECTURAL_STRUCTURE = eINSTANCE.getArchitecturalStructure();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURAL_STRUCTURE__ROLE = eINSTANCE.getArchitecturalStructure_Role();

		/**
		 * The meta object literal for the '<em><b>Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURAL_STRUCTURE__CONNECTORS = eINSTANCE.getArchitecturalStructure_Connectors();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.patterns.impl.QuestionAnnotationsImpl <em>Question Annotations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.patterns.impl.QuestionAnnotationsImpl
		 * @see edu.kit.ipd.sdq.toometa.patterns.impl.PatternsPackageImpl#getQuestionAnnotations()
		 * @generated
		 */
		EClass QUESTION_ANNOTATIONS = eINSTANCE.getQuestionAnnotations();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.patterns.impl.PatternImpl <em>Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.patterns.impl.PatternImpl
		 * @see edu.kit.ipd.sdq.toometa.patterns.impl.PatternsPackageImpl#getPattern()
		 * @generated
		 */
		EClass PATTERN = eINSTANCE.getPattern();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN__REPOSITORY = eINSTANCE.getPattern_Repository();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN__CATEGORIES = eINSTANCE.getPattern_Categories();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN__DOMAIN = eINSTANCE.getPattern_Domain();

		/**
		 * The meta object literal for the '<em><b>Has Variants</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN__HAS_VARIANTS = eINSTANCE.getPattern_HasVariants();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.patterns.impl.DomainTypeImpl <em>Domain Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.patterns.impl.DomainTypeImpl
		 * @see edu.kit.ipd.sdq.toometa.patterns.impl.PatternsPackageImpl#getDomainType()
		 * @generated
		 */
		EClass DOMAIN_TYPE = eINSTANCE.getDomainType();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.patterns.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.patterns.impl.PropertyImpl
		 * @see edu.kit.ipd.sdq.toometa.patterns.impl.PatternsPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Terms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__TERMS = eINSTANCE.getProperty_Terms();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.patterns.impl.QualityInfluenceImpl <em>Quality Influence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.patterns.impl.QualityInfluenceImpl
		 * @see edu.kit.ipd.sdq.toometa.patterns.impl.PatternsPackageImpl#getQualityInfluence()
		 * @generated
		 */
		EClass QUALITY_INFLUENCE = eINSTANCE.getQualityInfluence();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.patterns.impl.PatternCatalogueImpl <em>Pattern Catalogue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.patterns.impl.PatternCatalogueImpl
		 * @see edu.kit.ipd.sdq.toometa.patterns.impl.PatternsPackageImpl#getPatternCatalogue()
		 * @generated
		 */
		EClass PATTERN_CATALOGUE = eINSTANCE.getPatternCatalogue();

		/**
		 * The meta object literal for the '<em><b>Patterns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_CATALOGUE__PATTERNS = eINSTANCE.getPatternCatalogue_Patterns();

		/**
		 * The meta object literal for the '<em><b>Domains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_CATALOGUE__DOMAINS = eINSTANCE.getPatternCatalogue_Domains();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_CATALOGUE__CATEGORIES = eINSTANCE.getPatternCatalogue_Categories();

		/**
		 * The meta object literal for the '<em><b>Infrastructuretype</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_CATALOGUE__INFRASTRUCTURETYPE = eINSTANCE.getPatternCatalogue_Infrastructuretype();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.patterns.impl.InfrastructureTypeImpl <em>Infrastructure Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.patterns.impl.InfrastructureTypeImpl
		 * @see edu.kit.ipd.sdq.toometa.patterns.impl.PatternsPackageImpl#getInfrastructureType()
		 * @generated
		 */
		EClass INFRASTRUCTURE_TYPE = eINSTANCE.getInfrastructureType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFRASTRUCTURE_TYPE__NAME = eINSTANCE.getInfrastructureType_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFRASTRUCTURE_TYPE__DESCRIPTION = eINSTANCE.getInfrastructureType_Description();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.patterns.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.patterns.impl.ConnectorImpl
		 * @see edu.kit.ipd.sdq.toometa.patterns.impl.PatternsPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Connector To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__CONNECTOR_TO = eINSTANCE.getConnector_ConnectorTo();

		/**
		 * The meta object literal for the '<em><b>Connector From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__CONNECTOR_FROM = eINSTANCE.getConnector_ConnectorFrom();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__DESCRIPTION = eINSTANCE.getConnector_Description();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.patterns.impl.DrawbackImpl <em>Drawback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.patterns.impl.DrawbackImpl
		 * @see edu.kit.ipd.sdq.toometa.patterns.impl.PatternsPackageImpl#getDrawback()
		 * @generated
		 */
		EClass DRAWBACK = eINSTANCE.getDrawback();

		/**
		 * The meta object literal for the '<em><b>Drawback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRAWBACK__DRAWBACK = eINSTANCE.getDrawback_Drawback();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.patterns.impl.KeywordImpl <em>Keyword</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.patterns.impl.KeywordImpl
		 * @see edu.kit.ipd.sdq.toometa.patterns.impl.PatternsPackageImpl#getKeyword()
		 * @generated
		 */
		EClass KEYWORD = eINSTANCE.getKeyword();

		/**
		 * The meta object literal for the '<em><b>Keyword</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYWORD__KEYWORD = eINSTANCE.getKeyword_Keyword();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.patterns.impl.GoalImpl <em>Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.patterns.impl.GoalImpl
		 * @see edu.kit.ipd.sdq.toometa.patterns.impl.PatternsPackageImpl#getGoal()
		 * @generated
		 */
		EClass GOAL = eINSTANCE.getGoal();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__DESCRIPTION = eINSTANCE.getGoal_Description();

	}

} //PatternsPackage
