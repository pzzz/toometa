/**
 */
package edu.kit.ipd.sdq.toometa.issues;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

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
 * @see edu.kit.ipd.sdq.toometa.issues.IssuesFactory
 * @model kind="package"
 * @generated
 */
public interface IssuesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "issues";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.kit.edu/toometa/issues/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "issues";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IssuesPackage eINSTANCE = edu.kit.ipd.sdq.toometa.issues.impl.IssuesPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.issues.impl.IssueModelImpl <em>Issue Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.issues.impl.IssueModelImpl
	 * @see edu.kit.ipd.sdq.toometa.issues.impl.IssuesPackageImpl#getIssueModel()
	 * @generated
	 */
	int ISSUE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_MODEL__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_MODEL__ISSUES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Issue Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_MODEL_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.issues.impl.IssueImpl <em>Issue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.issues.impl.IssueImpl
	 * @see edu.kit.ipd.sdq.toometa.issues.impl.IssuesPackageImpl#getIssue()
	 * @generated
	 */
	int ISSUE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__RELATIONS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__CONFLICTS_WITH = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__HAS_CONFLICTS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__DUPLICATE_OF = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__HAS_DUPLICATES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__DEPENDS_ON = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__HAS_DEPENDENTS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__PARENT_OF = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__SUBPART_OF = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__TRIGGER_OF = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__TRIGGERED_BY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__RESOLVES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__RESOLVED_BY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__ALTERNATIVE_TO = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__HAS_ALTERNATIVES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__COULD_RESOLVE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__COULD_BE_RESOLVED_BY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__STAKEHOLDER_OF = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__HAS_STAKEHOLDERS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__SELECTED = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__SELECTED_BY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__SUMMARY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__DESCRIPTION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__STATUS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__PRIORITY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 24;

	/**
	 * The number of structural features of the '<em>Issue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 25;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.issues.impl.TextIssueImpl <em>Text Issue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.issues.impl.TextIssueImpl
	 * @see edu.kit.ipd.sdq.toometa.issues.impl.IssuesPackageImpl#getTextIssue()
	 * @generated
	 */
	int TEXT_ISSUE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ISSUE__ID = ISSUE__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ISSUE__RELATIONS = ISSUE__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ISSUE__CONFLICTS_WITH = ISSUE__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ISSUE__HAS_CONFLICTS = ISSUE__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ISSUE__DUPLICATE_OF = ISSUE__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ISSUE__HAS_DUPLICATES = ISSUE__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ISSUE__DEPENDS_ON = ISSUE__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ISSUE__HAS_DEPENDENTS = ISSUE__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ISSUE__PARENT_OF = ISSUE__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ISSUE__SUBPART_OF = ISSUE__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ISSUE__TRIGGER_OF = ISSUE__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ISSUE__TRIGGERED_BY = ISSUE__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ISSUE__RESOLVES = ISSUE__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ISSUE__RESOLVED_BY = ISSUE__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ISSUE__ALTERNATIVE_TO = ISSUE__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ISSUE__HAS_ALTERNATIVES = ISSUE__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ISSUE__COULD_RESOLVE = ISSUE__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ISSUE__COULD_BE_RESOLVED_BY = ISSUE__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ISSUE__STAKEHOLDER_OF = ISSUE__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ISSUE__HAS_STAKEHOLDERS = ISSUE__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ISSUE__SELECTED = ISSUE__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ISSUE__SELECTED_BY = ISSUE__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ISSUE__SUMMARY = ISSUE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ISSUE__DESCRIPTION = ISSUE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ISSUE__STATUS = ISSUE__STATUS;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ISSUE__PRIORITY = ISSUE__PRIORITY;

	/**
	 * The number of structural features of the '<em>Text Issue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ISSUE_FEATURE_COUNT = ISSUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.issues.IssueStatusEnum <em>Issue Status Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.issues.IssueStatusEnum
	 * @see edu.kit.ipd.sdq.toometa.issues.impl.IssuesPackageImpl#getIssueStatusEnum()
	 * @generated
	 */
	int ISSUE_STATUS_ENUM = 3;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.issues.IssuePriorityEnum <em>Issue Priority Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.issues.IssuePriorityEnum
	 * @see edu.kit.ipd.sdq.toometa.issues.impl.IssuesPackageImpl#getIssuePriorityEnum()
	 * @generated
	 */
	int ISSUE_PRIORITY_ENUM = 4;


	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.issues.IssueModel <em>Issue Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Issue Model</em>'.
	 * @see edu.kit.ipd.sdq.toometa.issues.IssueModel
	 * @generated
	 */
	EClass getIssueModel();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.toometa.issues.IssueModel#getIssues <em>Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Issues</em>'.
	 * @see edu.kit.ipd.sdq.toometa.issues.IssueModel#getIssues()
	 * @see #getIssueModel()
	 * @generated
	 */
	EReference getIssueModel_Issues();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.issues.Issue <em>Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Issue</em>'.
	 * @see edu.kit.ipd.sdq.toometa.issues.Issue
	 * @generated
	 */
	EClass getIssue();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.issues.Issue#getSummary <em>Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Summary</em>'.
	 * @see edu.kit.ipd.sdq.toometa.issues.Issue#getSummary()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Summary();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.issues.Issue#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.kit.ipd.sdq.toometa.issues.Issue#getDescription()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Description();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.issues.Issue#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see edu.kit.ipd.sdq.toometa.issues.Issue#getStatus()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Status();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.issues.Issue#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see edu.kit.ipd.sdq.toometa.issues.Issue#getPriority()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Priority();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.issues.TextIssue <em>Text Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Issue</em>'.
	 * @see edu.kit.ipd.sdq.toometa.issues.TextIssue
	 * @generated
	 */
	EClass getTextIssue();

	/**
	 * Returns the meta object for enum '{@link edu.kit.ipd.sdq.toometa.issues.IssueStatusEnum <em>Issue Status Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Issue Status Enum</em>'.
	 * @see edu.kit.ipd.sdq.toometa.issues.IssueStatusEnum
	 * @generated
	 */
	EEnum getIssueStatusEnum();

	/**
	 * Returns the meta object for enum '{@link edu.kit.ipd.sdq.toometa.issues.IssuePriorityEnum <em>Issue Priority Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Issue Priority Enum</em>'.
	 * @see edu.kit.ipd.sdq.toometa.issues.IssuePriorityEnum
	 * @generated
	 */
	EEnum getIssuePriorityEnum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IssuesFactory getIssuesFactory();

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
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.issues.impl.IssueModelImpl <em>Issue Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.issues.impl.IssueModelImpl
		 * @see edu.kit.ipd.sdq.toometa.issues.impl.IssuesPackageImpl#getIssueModel()
		 * @generated
		 */
		EClass ISSUE_MODEL = eINSTANCE.getIssueModel();

		/**
		 * The meta object literal for the '<em><b>Issues</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE_MODEL__ISSUES = eINSTANCE.getIssueModel_Issues();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.issues.impl.IssueImpl <em>Issue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.issues.impl.IssueImpl
		 * @see edu.kit.ipd.sdq.toometa.issues.impl.IssuesPackageImpl#getIssue()
		 * @generated
		 */
		EClass ISSUE = eINSTANCE.getIssue();

		/**
		 * The meta object literal for the '<em><b>Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__SUMMARY = eINSTANCE.getIssue_Summary();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__DESCRIPTION = eINSTANCE.getIssue_Description();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__STATUS = eINSTANCE.getIssue_Status();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__PRIORITY = eINSTANCE.getIssue_Priority();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.issues.impl.TextIssueImpl <em>Text Issue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.issues.impl.TextIssueImpl
		 * @see edu.kit.ipd.sdq.toometa.issues.impl.IssuesPackageImpl#getTextIssue()
		 * @generated
		 */
		EClass TEXT_ISSUE = eINSTANCE.getTextIssue();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.issues.IssueStatusEnum <em>Issue Status Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.issues.IssueStatusEnum
		 * @see edu.kit.ipd.sdq.toometa.issues.impl.IssuesPackageImpl#getIssueStatusEnum()
		 * @generated
		 */
		EEnum ISSUE_STATUS_ENUM = eINSTANCE.getIssueStatusEnum();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.issues.IssuePriorityEnum <em>Issue Priority Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.issues.IssuePriorityEnum
		 * @see edu.kit.ipd.sdq.toometa.issues.impl.IssuesPackageImpl#getIssuePriorityEnum()
		 * @generated
		 */
		EEnum ISSUE_PRIORITY_ENUM = eINSTANCE.getIssuePriorityEnum();

	}

} //IssuesPackage
