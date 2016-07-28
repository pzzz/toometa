/**
 */
package edu.kit.ipd.sdq.toometa.relations;

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
 * @see edu.kit.ipd.sdq.toometa.relations.RelationsFactory
 * @model kind="package"
 * @generated
 */
public interface RelationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "relations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.kit.edu/toometa/relations/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "relations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RelationsPackage eINSTANCE = edu.kit.ipd.sdq.toometa.relations.impl.RelationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.relations.impl.RelationObjectImpl <em>Relation Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.relations.impl.RelationObjectImpl
	 * @see edu.kit.ipd.sdq.toometa.relations.impl.RelationsPackageImpl#getRelationObject()
	 * @generated
	 */
	int RELATION_OBJECT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OBJECT__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OBJECT__RELATIONS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Relation Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OBJECT_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.relations.impl.TraceableObjectImpl <em>Traceable Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.relations.impl.TraceableObjectImpl
	 * @see edu.kit.ipd.sdq.toometa.relations.impl.RelationsPackageImpl#getTraceableObject()
	 * @generated
	 */
	int TRACEABLE_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_OBJECT__ID = RELATION_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_OBJECT__RELATIONS = RELATION_OBJECT__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_OBJECT__CONFLICTS_WITH = RELATION_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_OBJECT__HAS_CONFLICTS = RELATION_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_OBJECT__DUPLICATE_OF = RELATION_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_OBJECT__HAS_DUPLICATES = RELATION_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_OBJECT__DEPENDS_ON = RELATION_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_OBJECT__HAS_DEPENDENTS = RELATION_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_OBJECT__PARENT_OF = RELATION_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_OBJECT__SUBPART_OF = RELATION_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_OBJECT__TRIGGER_OF = RELATION_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_OBJECT__TRIGGERED_BY = RELATION_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_OBJECT__RESOLVES = RELATION_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_OBJECT__RESOLVED_BY = RELATION_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_OBJECT__ALTERNATIVE_TO = RELATION_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_OBJECT__HAS_ALTERNATIVES = RELATION_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_OBJECT__COULD_RESOLVE = RELATION_OBJECT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_OBJECT__COULD_BE_RESOLVED_BY = RELATION_OBJECT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_OBJECT__STAKEHOLDER_OF = RELATION_OBJECT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_OBJECT__HAS_STAKEHOLDERS = RELATION_OBJECT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_OBJECT__SELECTED = RELATION_OBJECT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_OBJECT__SELECTED_BY = RELATION_OBJECT_FEATURE_COUNT + 19;

	/**
	 * The number of structural features of the '<em>Traceable Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_OBJECT_FEATURE_COUNT = RELATION_OBJECT_FEATURE_COUNT + 20;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.relations.impl.RelationTypeImpl <em>Relation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.relations.impl.RelationTypeImpl
	 * @see edu.kit.ipd.sdq.toometa.relations.impl.RelationsPackageImpl#getRelationType()
	 * @generated
	 */
	int RELATION_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TYPE__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TYPE__DESCRIPTION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Relation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TYPE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.relations.impl.DuplicationObjectImpl <em>Duplication Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.relations.impl.DuplicationObjectImpl
	 * @see edu.kit.ipd.sdq.toometa.relations.impl.RelationsPackageImpl#getDuplicationObject()
	 * @generated
	 */
	int DUPLICATION_OBJECT = 2;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUPLICATION_OBJECT__DUPLICATE_OF = 0;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUPLICATION_OBJECT__HAS_DUPLICATES = 1;

	/**
	 * The number of structural features of the '<em>Duplication Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUPLICATION_OBJECT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.relations.impl.ParentalObjectImpl <em>Parental Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.relations.impl.ParentalObjectImpl
	 * @see edu.kit.ipd.sdq.toometa.relations.impl.RelationsPackageImpl#getParentalObject()
	 * @generated
	 */
	int PARENTAL_OBJECT = 3;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTAL_OBJECT__PARENT_OF = 0;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTAL_OBJECT__SUBPART_OF = 1;

	/**
	 * The number of structural features of the '<em>Parental Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTAL_OBJECT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.relations.impl.TriggerObjectImpl <em>Trigger Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.relations.impl.TriggerObjectImpl
	 * @see edu.kit.ipd.sdq.toometa.relations.impl.RelationsPackageImpl#getTriggerObject()
	 * @generated
	 */
	int TRIGGER_OBJECT = 5;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_OBJECT__TRIGGER_OF = 0;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_OBJECT__TRIGGERED_BY = 1;

	/**
	 * The number of structural features of the '<em>Trigger Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_OBJECT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.relations.impl.DependencyObjectImpl <em>Dependency Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.relations.impl.DependencyObjectImpl
	 * @see edu.kit.ipd.sdq.toometa.relations.impl.RelationsPackageImpl#getDependencyObject()
	 * @generated
	 */
	int DEPENDENCY_OBJECT = 6;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_OBJECT__DEPENDS_ON = 0;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_OBJECT__HAS_DEPENDENTS = 1;

	/**
	 * The number of structural features of the '<em>Dependency Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_OBJECT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.relations.impl.ConflictObjectImpl <em>Conflict Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.relations.impl.ConflictObjectImpl
	 * @see edu.kit.ipd.sdq.toometa.relations.impl.RelationsPackageImpl#getConflictObject()
	 * @generated
	 */
	int CONFLICT_OBJECT = 7;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_OBJECT__CONFLICTS_WITH = 0;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_OBJECT__HAS_CONFLICTS = 1;

	/**
	 * The number of structural features of the '<em>Conflict Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_OBJECT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.relations.impl.AlternativeObjectImpl <em>Alternative Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.relations.impl.AlternativeObjectImpl
	 * @see edu.kit.ipd.sdq.toometa.relations.impl.RelationsPackageImpl#getAlternativeObject()
	 * @generated
	 */
	int ALTERNATIVE_OBJECT = 8;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_OBJECT__ALTERNATIVE_TO = 0;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_OBJECT__HAS_ALTERNATIVES = 1;

	/**
	 * The number of structural features of the '<em>Alternative Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_OBJECT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.relations.impl.RelationsModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.relations.impl.RelationsModelImpl
	 * @see edu.kit.ipd.sdq.toometa.relations.impl.RelationsPackageImpl#getRelationsModel()
	 * @generated
	 */
	int RELATIONS_MODEL = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONS_MODEL__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Relation Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONS_MODEL__RELATION_TYPES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONS_MODEL__RELATIONS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONS_MODEL_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.relations.impl.ResolveObjectImpl <em>Resolve Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.relations.impl.ResolveObjectImpl
	 * @see edu.kit.ipd.sdq.toometa.relations.impl.RelationsPackageImpl#getResolveObject()
	 * @generated
	 */
	int RESOLVE_OBJECT = 10;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_OBJECT__RESOLVES = 0;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_OBJECT__RESOLVED_BY = 1;

	/**
	 * The number of structural features of the '<em>Resolve Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_OBJECT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.relations.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.relations.impl.RelationImpl
	 * @see edu.kit.ipd.sdq.toometa.relations.impl.RelationsPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__TYPE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__OPPOSITE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__FROM = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__TO = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bidirectional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__BIDIRECTIONAL = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.relations.impl.CouldResolveObjectImpl <em>Could Resolve Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.relations.impl.CouldResolveObjectImpl
	 * @see edu.kit.ipd.sdq.toometa.relations.impl.RelationsPackageImpl#getCouldResolveObject()
	 * @generated
	 */
	int COULD_RESOLVE_OBJECT = 12;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COULD_RESOLVE_OBJECT__COULD_RESOLVE = 0;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COULD_RESOLVE_OBJECT__COULD_BE_RESOLVED_BY = 1;

	/**
	 * The number of structural features of the '<em>Could Resolve Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COULD_RESOLVE_OBJECT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.relations.impl.StakeholderObjectImpl <em>Stakeholder Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.relations.impl.StakeholderObjectImpl
	 * @see edu.kit.ipd.sdq.toometa.relations.impl.RelationsPackageImpl#getStakeholderObject()
	 * @generated
	 */
	int STAKEHOLDER_OBJECT = 13;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER_OBJECT__STAKEHOLDER_OF = 0;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER_OBJECT__HAS_STAKEHOLDERS = 1;

	/**
	 * The number of structural features of the '<em>Stakeholder Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER_OBJECT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.relations.impl.SelectionObjectImpl <em>Selection Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.relations.impl.SelectionObjectImpl
	 * @see edu.kit.ipd.sdq.toometa.relations.impl.RelationsPackageImpl#getSelectionObject()
	 * @generated
	 */
	int SELECTION_OBJECT = 14;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_OBJECT__SELECTED = 0;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_OBJECT__SELECTED_BY = 1;

	/**
	 * The number of structural features of the '<em>Selection Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_OBJECT_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.relations.TraceableObject <em>Traceable Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traceable Object</em>'.
	 * @see edu.kit.ipd.sdq.toometa.relations.TraceableObject
	 * @generated
	 */
	EClass getTraceableObject();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.relations.RelationType <em>Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Type</em>'.
	 * @see edu.kit.ipd.sdq.toometa.relations.RelationType
	 * @generated
	 */
	EClass getRelationType();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.relations.RelationType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.kit.ipd.sdq.toometa.relations.RelationType#getDescription()
	 * @see #getRelationType()
	 * @generated
	 */
	EAttribute getRelationType_Description();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.relations.DuplicationObject <em>Duplication Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Duplication Object</em>'.
	 * @see edu.kit.ipd.sdq.toometa.relations.DuplicationObject
	 * @generated
	 */
	EClass getDuplicationObject();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.toometa.relations.DuplicationObject#getDuplicateOf <em>Duplicate Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Duplicate Of</em>'.
	 * @see edu.kit.ipd.sdq.toometa.relations.DuplicationObject#getDuplicateOf()
	 * @see #getDuplicationObject()
	 * @generated
	 */
	EReference getDuplicationObject_DuplicateOf();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.toometa.relations.DuplicationObject#getHasDuplicates <em>Has Duplicates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Duplicates</em>'.
	 * @see edu.kit.ipd.sdq.toometa.relations.DuplicationObject#getHasDuplicates()
	 * @see #getDuplicationObject()
	 * @generated
	 */
	EReference getDuplicationObject_HasDuplicates();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.relations.ParentalObject <em>Parental Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parental Object</em>'.
	 * @see edu.kit.ipd.sdq.toometa.relations.ParentalObject
	 * @generated
	 */
	EClass getParentalObject();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.toometa.relations.ParentalObject#getParentOf <em>Parent Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parent Of</em>'.
	 * @see edu.kit.ipd.sdq.toometa.relations.ParentalObject#getParentOf()
	 * @see #getParentalObject()
	 * @generated
	 */
	EReference getParentalObject_ParentOf();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.toometa.relations.ParentalObject#getSubpartOf <em>Subpart Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subpart Of</em>'.
	 * @see edu.kit.ipd.sdq.toometa.relations.ParentalObject#getSubpartOf()
	 * @see #getParentalObject()
	 * @generated
	 */
	EReference getParentalObject_SubpartOf();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.relations.RelationObject <em>Relation Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Object</em>'.
	 * @see edu.kit.ipd.sdq.toometa.relations.RelationObject
	 * @generated
	 */
	EClass getRelationObject();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.toometa.relations.RelationObject#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see edu.kit.ipd.sdq.toometa.relations.RelationObject#getRelations()
	 * @see #getRelationObject()
	 * @generated
	 */
	EReference getRelationObject_Relations();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.relations.TriggerObject <em>Trigger Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger Object</em>'.
	 * @see edu.kit.ipd.sdq.toometa.relations.TriggerObject
	 * @generated
	 */
	EClass getTriggerObject();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.toometa.relations.TriggerObject#getTriggerOf <em>Trigger Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Trigger Of</em>'.
	 * @see edu.kit.ipd.sdq.toometa.relations.TriggerObject#getTriggerOf()
	 * @see #getTriggerObject()
	 * @generated
	 */
	EReference getTriggerObject_TriggerOf();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.toometa.relations.TriggerObject#getTriggeredBy <em>Triggered By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Triggered By</em>'.
	 * @see edu.kit.ipd.sdq.toometa.relations.TriggerObject#getTriggeredBy()
	 * @see #getTriggerObject()
	 * @generated
	 */
	EReference getTriggerObject_TriggeredBy();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.relations.DependencyObject <em>Dependency Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency Object</em>'.
	 * @see edu.kit.ipd.sdq.toometa.relations.DependencyObject
	 * @generated
	 */
	EClass getDependencyObject();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.toometa.relations.DependencyObject#getDependsOn <em>Depends On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Depends On</em>'.
	 * @see edu.kit.ipd.sdq.toometa.relations.DependencyObject#getDependsOn()
	 * @see #getDependencyObject()
	 * @generated
	 */
	EReference getDependencyObject_DependsOn();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.toometa.relations.DependencyObject#getHasDependents <em>Has Dependents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Dependents</em>'.
	 * @see edu.kit.ipd.sdq.toometa.relations.DependencyObject#getHasDependents()
	 * @see #getDependencyObject()
	 * @generated
	 */
	EReference getDependencyObject_HasDependents();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.relations.ConflictObject <em>Conflict Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conflict Object</em>'.
	 * @see edu.kit.ipd.sdq.toometa.relations.ConflictObject
	 * @generated
	 */
	EClass getConflictObject();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.toometa.relations.ConflictObject#getConflictsWith <em>Conflicts With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conflicts With</em>'.
	 * @see edu.kit.ipd.sdq.toometa.relations.ConflictObject#getConflictsWith()
	 * @see #getConflictObject()
	 * @generated
	 */
	EReference getConflictObject_ConflictsWith();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.toometa.relations.ConflictObject#getHasConflicts <em>Has Conflicts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Conflicts</em>'.
	 * @see edu.kit.ipd.sdq.toometa.relations.ConflictObject#getHasConflicts()
	 * @see #getConflictObject()
	 * @generated
	 */
	EReference getConflictObject_HasConflicts();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.relations.AlternativeObject <em>Alternative Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternative Object</em>'.
	 * @see edu.kit.ipd.sdq.toometa.relations.AlternativeObject
	 * @generated
	 */
	EClass getAlternativeObject();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.toometa.relations.AlternativeObject#getAlternativeTo <em>Alternative To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Alternative To</em>'.
	 * @see edu.kit.ipd.sdq.toometa.relations.AlternativeObject#getAlternativeTo()
	 * @see #getAlternativeObject()
	 * @generated
	 */
	EReference getAlternativeObject_AlternativeTo();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.toometa.relations.AlternativeObject#getHasAlternatives <em>Has Alternatives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Alternatives</em>'.
	 * @see edu.kit.ipd.sdq.toometa.relations.AlternativeObject#getHasAlternatives()
	 * @see #getAlternativeObject()
	 * @generated
	 */
	EReference getAlternativeObject_HasAlternatives();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.relations.RelationsModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see edu.kit.ipd.sdq.toometa.relations.RelationsModel
	 * @generated
	 */
	EClass getRelationsModel();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.toometa.relations.RelationsModel#getRelationTypes <em>Relation Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relation Types</em>'.
	 * @see edu.kit.ipd.sdq.toometa.relations.RelationsModel#getRelationTypes()
	 * @see #getRelationsModel()
	 * @generated
	 */
	EReference getRelationsModel_RelationTypes();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.toometa.relations.RelationsModel#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relations</em>'.
	 * @see edu.kit.ipd.sdq.toometa.relations.RelationsModel#getRelations()
	 * @see #getRelationsModel()
	 * @generated
	 */
	EReference getRelationsModel_Relations();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.relations.ResolveObject <em>Resolve Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resolve Object</em>'.
	 * @see edu.kit.ipd.sdq.toometa.relations.ResolveObject
	 * @generated
	 */
	EClass getResolveObject();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.toometa.relations.ResolveObject#getResolves <em>Resolves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resolves</em>'.
	 * @see edu.kit.ipd.sdq.toometa.relations.ResolveObject#getResolves()
	 * @see #getResolveObject()
	 * @generated
	 */
	EReference getResolveObject_Resolves();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.toometa.relations.ResolveObject#getResolvedBy <em>Resolved By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resolved By</em>'.
	 * @see edu.kit.ipd.sdq.toometa.relations.ResolveObject#getResolvedBy()
	 * @see #getResolveObject()
	 * @generated
	 */
	EReference getResolveObject_ResolvedBy();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.relations.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see edu.kit.ipd.sdq.toometa.relations.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.toometa.relations.Relation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see edu.kit.ipd.sdq.toometa.relations.Relation#getType()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Type();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.toometa.relations.Relation#getOpposite <em>Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Opposite</em>'.
	 * @see edu.kit.ipd.sdq.toometa.relations.Relation#getOpposite()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Opposite();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.toometa.relations.Relation#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see edu.kit.ipd.sdq.toometa.relations.Relation#getFrom()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_From();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.toometa.relations.Relation#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see edu.kit.ipd.sdq.toometa.relations.Relation#getTo()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_To();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.relations.Relation#isBidirectional <em>Bidirectional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bidirectional</em>'.
	 * @see edu.kit.ipd.sdq.toometa.relations.Relation#isBidirectional()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Bidirectional();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.relations.CouldResolveObject <em>Could Resolve Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Could Resolve Object</em>'.
	 * @see edu.kit.ipd.sdq.toometa.relations.CouldResolveObject
	 * @generated
	 */
	EClass getCouldResolveObject();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.toometa.relations.CouldResolveObject#getCouldResolve <em>Could Resolve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Could Resolve</em>'.
	 * @see edu.kit.ipd.sdq.toometa.relations.CouldResolveObject#getCouldResolve()
	 * @see #getCouldResolveObject()
	 * @generated
	 */
	EReference getCouldResolveObject_CouldResolve();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.toometa.relations.CouldResolveObject#getCouldBeResolvedBy <em>Could Be Resolved By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Could Be Resolved By</em>'.
	 * @see edu.kit.ipd.sdq.toometa.relations.CouldResolveObject#getCouldBeResolvedBy()
	 * @see #getCouldResolveObject()
	 * @generated
	 */
	EReference getCouldResolveObject_CouldBeResolvedBy();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.relations.StakeholderObject <em>Stakeholder Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stakeholder Object</em>'.
	 * @see edu.kit.ipd.sdq.toometa.relations.StakeholderObject
	 * @generated
	 */
	EClass getStakeholderObject();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.toometa.relations.StakeholderObject#getStakeholderOf <em>Stakeholder Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stakeholder Of</em>'.
	 * @see edu.kit.ipd.sdq.toometa.relations.StakeholderObject#getStakeholderOf()
	 * @see #getStakeholderObject()
	 * @generated
	 */
	EReference getStakeholderObject_StakeholderOf();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.toometa.relations.StakeholderObject#getHasStakeholders <em>Has Stakeholders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Stakeholders</em>'.
	 * @see edu.kit.ipd.sdq.toometa.relations.StakeholderObject#getHasStakeholders()
	 * @see #getStakeholderObject()
	 * @generated
	 */
	EReference getStakeholderObject_HasStakeholders();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.relations.SelectionObject <em>Selection Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection Object</em>'.
	 * @see edu.kit.ipd.sdq.toometa.relations.SelectionObject
	 * @generated
	 */
	EClass getSelectionObject();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.toometa.relations.SelectionObject#getSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Selected</em>'.
	 * @see edu.kit.ipd.sdq.toometa.relations.SelectionObject#getSelected()
	 * @see #getSelectionObject()
	 * @generated
	 */
	EReference getSelectionObject_Selected();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.toometa.relations.SelectionObject#getSelectedBy <em>Selected By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Selected By</em>'.
	 * @see edu.kit.ipd.sdq.toometa.relations.SelectionObject#getSelectedBy()
	 * @see #getSelectionObject()
	 * @generated
	 */
	EReference getSelectionObject_SelectedBy();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RelationsFactory getRelationsFactory();

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
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.relations.impl.TraceableObjectImpl <em>Traceable Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.relations.impl.TraceableObjectImpl
		 * @see edu.kit.ipd.sdq.toometa.relations.impl.RelationsPackageImpl#getTraceableObject()
		 * @generated
		 */
		EClass TRACEABLE_OBJECT = eINSTANCE.getTraceableObject();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.relations.impl.RelationTypeImpl <em>Relation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.relations.impl.RelationTypeImpl
		 * @see edu.kit.ipd.sdq.toometa.relations.impl.RelationsPackageImpl#getRelationType()
		 * @generated
		 */
		EClass RELATION_TYPE = eINSTANCE.getRelationType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_TYPE__DESCRIPTION = eINSTANCE.getRelationType_Description();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.relations.impl.DuplicationObjectImpl <em>Duplication Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.relations.impl.DuplicationObjectImpl
		 * @see edu.kit.ipd.sdq.toometa.relations.impl.RelationsPackageImpl#getDuplicationObject()
		 * @generated
		 */
		EClass DUPLICATION_OBJECT = eINSTANCE.getDuplicationObject();

		/**
		 * The meta object literal for the '<em><b>Duplicate Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DUPLICATION_OBJECT__DUPLICATE_OF = eINSTANCE.getDuplicationObject_DuplicateOf();

		/**
		 * The meta object literal for the '<em><b>Has Duplicates</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DUPLICATION_OBJECT__HAS_DUPLICATES = eINSTANCE.getDuplicationObject_HasDuplicates();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.relations.impl.ParentalObjectImpl <em>Parental Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.relations.impl.ParentalObjectImpl
		 * @see edu.kit.ipd.sdq.toometa.relations.impl.RelationsPackageImpl#getParentalObject()
		 * @generated
		 */
		EClass PARENTAL_OBJECT = eINSTANCE.getParentalObject();

		/**
		 * The meta object literal for the '<em><b>Parent Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARENTAL_OBJECT__PARENT_OF = eINSTANCE.getParentalObject_ParentOf();

		/**
		 * The meta object literal for the '<em><b>Subpart Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARENTAL_OBJECT__SUBPART_OF = eINSTANCE.getParentalObject_SubpartOf();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.relations.impl.RelationObjectImpl <em>Relation Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.relations.impl.RelationObjectImpl
		 * @see edu.kit.ipd.sdq.toometa.relations.impl.RelationsPackageImpl#getRelationObject()
		 * @generated
		 */
		EClass RELATION_OBJECT = eINSTANCE.getRelationObject();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_OBJECT__RELATIONS = eINSTANCE.getRelationObject_Relations();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.relations.impl.TriggerObjectImpl <em>Trigger Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.relations.impl.TriggerObjectImpl
		 * @see edu.kit.ipd.sdq.toometa.relations.impl.RelationsPackageImpl#getTriggerObject()
		 * @generated
		 */
		EClass TRIGGER_OBJECT = eINSTANCE.getTriggerObject();

		/**
		 * The meta object literal for the '<em><b>Trigger Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER_OBJECT__TRIGGER_OF = eINSTANCE.getTriggerObject_TriggerOf();

		/**
		 * The meta object literal for the '<em><b>Triggered By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER_OBJECT__TRIGGERED_BY = eINSTANCE.getTriggerObject_TriggeredBy();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.relations.impl.DependencyObjectImpl <em>Dependency Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.relations.impl.DependencyObjectImpl
		 * @see edu.kit.ipd.sdq.toometa.relations.impl.RelationsPackageImpl#getDependencyObject()
		 * @generated
		 */
		EClass DEPENDENCY_OBJECT = eINSTANCE.getDependencyObject();

		/**
		 * The meta object literal for the '<em><b>Depends On</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY_OBJECT__DEPENDS_ON = eINSTANCE.getDependencyObject_DependsOn();

		/**
		 * The meta object literal for the '<em><b>Has Dependents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY_OBJECT__HAS_DEPENDENTS = eINSTANCE.getDependencyObject_HasDependents();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.relations.impl.ConflictObjectImpl <em>Conflict Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.relations.impl.ConflictObjectImpl
		 * @see edu.kit.ipd.sdq.toometa.relations.impl.RelationsPackageImpl#getConflictObject()
		 * @generated
		 */
		EClass CONFLICT_OBJECT = eINSTANCE.getConflictObject();

		/**
		 * The meta object literal for the '<em><b>Conflicts With</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFLICT_OBJECT__CONFLICTS_WITH = eINSTANCE.getConflictObject_ConflictsWith();

		/**
		 * The meta object literal for the '<em><b>Has Conflicts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFLICT_OBJECT__HAS_CONFLICTS = eINSTANCE.getConflictObject_HasConflicts();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.relations.impl.AlternativeObjectImpl <em>Alternative Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.relations.impl.AlternativeObjectImpl
		 * @see edu.kit.ipd.sdq.toometa.relations.impl.RelationsPackageImpl#getAlternativeObject()
		 * @generated
		 */
		EClass ALTERNATIVE_OBJECT = eINSTANCE.getAlternativeObject();

		/**
		 * The meta object literal for the '<em><b>Alternative To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVE_OBJECT__ALTERNATIVE_TO = eINSTANCE.getAlternativeObject_AlternativeTo();

		/**
		 * The meta object literal for the '<em><b>Has Alternatives</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVE_OBJECT__HAS_ALTERNATIVES = eINSTANCE.getAlternativeObject_HasAlternatives();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.relations.impl.RelationsModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.relations.impl.RelationsModelImpl
		 * @see edu.kit.ipd.sdq.toometa.relations.impl.RelationsPackageImpl#getRelationsModel()
		 * @generated
		 */
		EClass RELATIONS_MODEL = eINSTANCE.getRelationsModel();

		/**
		 * The meta object literal for the '<em><b>Relation Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONS_MODEL__RELATION_TYPES = eINSTANCE.getRelationsModel_RelationTypes();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONS_MODEL__RELATIONS = eINSTANCE.getRelationsModel_Relations();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.relations.impl.ResolveObjectImpl <em>Resolve Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.relations.impl.ResolveObjectImpl
		 * @see edu.kit.ipd.sdq.toometa.relations.impl.RelationsPackageImpl#getResolveObject()
		 * @generated
		 */
		EClass RESOLVE_OBJECT = eINSTANCE.getResolveObject();

		/**
		 * The meta object literal for the '<em><b>Resolves</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLVE_OBJECT__RESOLVES = eINSTANCE.getResolveObject_Resolves();

		/**
		 * The meta object literal for the '<em><b>Resolved By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLVE_OBJECT__RESOLVED_BY = eINSTANCE.getResolveObject_ResolvedBy();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.relations.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.relations.impl.RelationImpl
		 * @see edu.kit.ipd.sdq.toometa.relations.impl.RelationsPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__TYPE = eINSTANCE.getRelation_Type();

		/**
		 * The meta object literal for the '<em><b>Opposite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__OPPOSITE = eINSTANCE.getRelation_Opposite();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__FROM = eINSTANCE.getRelation_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__TO = eINSTANCE.getRelation_To();

		/**
		 * The meta object literal for the '<em><b>Bidirectional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__BIDIRECTIONAL = eINSTANCE.getRelation_Bidirectional();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.relations.impl.CouldResolveObjectImpl <em>Could Resolve Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.relations.impl.CouldResolveObjectImpl
		 * @see edu.kit.ipd.sdq.toometa.relations.impl.RelationsPackageImpl#getCouldResolveObject()
		 * @generated
		 */
		EClass COULD_RESOLVE_OBJECT = eINSTANCE.getCouldResolveObject();

		/**
		 * The meta object literal for the '<em><b>Could Resolve</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COULD_RESOLVE_OBJECT__COULD_RESOLVE = eINSTANCE.getCouldResolveObject_CouldResolve();

		/**
		 * The meta object literal for the '<em><b>Could Be Resolved By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COULD_RESOLVE_OBJECT__COULD_BE_RESOLVED_BY = eINSTANCE.getCouldResolveObject_CouldBeResolvedBy();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.relations.impl.StakeholderObjectImpl <em>Stakeholder Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.relations.impl.StakeholderObjectImpl
		 * @see edu.kit.ipd.sdq.toometa.relations.impl.RelationsPackageImpl#getStakeholderObject()
		 * @generated
		 */
		EClass STAKEHOLDER_OBJECT = eINSTANCE.getStakeholderObject();

		/**
		 * The meta object literal for the '<em><b>Stakeholder Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAKEHOLDER_OBJECT__STAKEHOLDER_OF = eINSTANCE.getStakeholderObject_StakeholderOf();

		/**
		 * The meta object literal for the '<em><b>Has Stakeholders</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAKEHOLDER_OBJECT__HAS_STAKEHOLDERS = eINSTANCE.getStakeholderObject_HasStakeholders();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.relations.impl.SelectionObjectImpl <em>Selection Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.relations.impl.SelectionObjectImpl
		 * @see edu.kit.ipd.sdq.toometa.relations.impl.RelationsPackageImpl#getSelectionObject()
		 * @generated
		 */
		EClass SELECTION_OBJECT = eINSTANCE.getSelectionObject();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTION_OBJECT__SELECTED = eINSTANCE.getSelectionObject_Selected();

		/**
		 * The meta object literal for the '<em><b>Selected By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTION_OBJECT__SELECTED_BY = eINSTANCE.getSelectionObject_SelectedBy();

	}

} //RelationsPackage
