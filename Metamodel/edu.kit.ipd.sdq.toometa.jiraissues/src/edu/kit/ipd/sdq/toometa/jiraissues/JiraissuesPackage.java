/**
 */
package edu.kit.ipd.sdq.toometa.jiraissues;

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
 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesFactory
 * @model kind="package"
 * @generated
 */
public interface JiraissuesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "jiraissues";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.kit.edu/toometa/jiraissues/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "jiraissues";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JiraissuesPackage eINSTANCE = edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraissuesPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.AddressableElementImpl <em>Addressable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.AddressableElementImpl
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraissuesPackageImpl#getAddressableElement()
	 * @generated
	 */
	int ADDRESSABLE_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSABLE_ELEMENT__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Self</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSABLE_ELEMENT__SELF = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Addressable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSABLE_ELEMENT_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.AttachmentImpl <em>Attachment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.AttachmentImpl
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraissuesPackageImpl#getAttachment()
	 * @generated
	 */
	int ATTACHMENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__ID = ADDRESSABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Self</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__SELF = ADDRESSABLE_ELEMENT__SELF;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__FILENAME = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__SIZE = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__MIME_TYPE = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Content Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__CONTENT_URI = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__CREATION_DATE = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__AUTHOR = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_FEATURE_COUNT = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.TimeTrackingImpl <em>Time Tracking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.TimeTrackingImpl
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraissuesPackageImpl#getTimeTracking()
	 * @generated
	 */
	int TIME_TRACKING = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TRACKING__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Original Estimate Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TRACKING__ORIGINAL_ESTIMATE_MINUTES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Remaining Estimate Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TRACKING__REMAINING_ESTIMATE_MINUTES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Time Spent Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TRACKING__TIME_SPENT_MINUTES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Time Tracking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TRACKING_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.WorklogImpl <em>Worklog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.WorklogImpl
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraissuesPackageImpl#getWorklog()
	 * @generated
	 */
	int WORKLOG = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOG__ID = ADDRESSABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Self</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOG__SELF = ADDRESSABLE_ELEMENT__SELF;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOG__CREATION_DATE = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Update Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOG__UPDATE_DATE = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOG__AUTHOR = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Update Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOG__UPDATE_AUTHOR = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Issue Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOG__ISSUE_URI = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOG__COMMENT = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Minutes Spent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOG__MINUTES_SPENT = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOG__START_DATE = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Worklog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOG_FEATURE_COUNT = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.VersionImpl <em>Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.VersionImpl
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraissuesPackageImpl#getVersion()
	 * @generated
	 */
	int VERSION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__ID = ADDRESSABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Self</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__SELF = ADDRESSABLE_ELEMENT__SELF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__NAME = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__DESCRIPTION = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Archived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__IS_ARCHIVED = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Released</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__IS_RELEASED = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Release Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__RELEASE_DATE = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_FEATURE_COUNT = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.ProjectImpl
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraissuesPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ID = ADDRESSABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Self</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__SELF = ADDRESSABLE_ELEMENT__SELF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__KEY = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.ComponentImpl
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraissuesPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ID = ADDRESSABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Self</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SELF = ADDRESSABLE_ELEMENT__SELF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DESCRIPTION = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraIssueImpl <em>Jira Issue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraIssueImpl
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraissuesPackageImpl#getJiraIssue()
	 * @generated
	 */
	int JIRA_ISSUE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_ISSUE__ID = ADDRESSABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Self</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_ISSUE__SELF = ADDRESSABLE_ELEMENT__SELF;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_ISSUE__CREATION_DATE = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Update Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_ISSUE__UPDATE_DATE = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_ISSUE__RELATIONS = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_ISSUE__CONFLICTS_WITH = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_ISSUE__HAS_CONFLICTS = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_ISSUE__DUPLICATE_OF = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_ISSUE__HAS_DUPLICATES = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_ISSUE__DEPENDS_ON = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_ISSUE__HAS_DEPENDENTS = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_ISSUE__PARENT_OF = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_ISSUE__SUBPART_OF = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_ISSUE__TRIGGER_OF = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_ISSUE__TRIGGERED_BY = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_ISSUE__RESOLVES = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_ISSUE__RESOLVED_BY = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_ISSUE__ALTERNATIVE_TO = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_ISSUE__HAS_ALTERNATIVES = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_ISSUE__COULD_RESOLVE = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_ISSUE__COULD_BE_RESOLVED_BY = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_ISSUE__STAKEHOLDER_OF = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_ISSUE__HAS_STAKEHOLDERS = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_ISSUE__SELECTED = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_ISSUE__SELECTED_BY = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_ISSUE__SUMMARY = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_ISSUE__DESCRIPTION = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_ISSUE__STATUS = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_ISSUE__PRIORITY = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_ISSUE__KEY = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Transitions Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_ISSUE__TRANSITIONS_URI = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_ISSUE__RESOLUTION = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Votes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_ISSUE__VOTES = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Num Watchers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_ISSUE__NUM_WATCHERS = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Is Subtask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_ISSUE__IS_SUBTASK = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Time Tracking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_ISSUE__TIME_TRACKING = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_ISSUE__ATTACHMENTS = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_ISSUE__PROJECT = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_ISSUE__COMPONENTS = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_ISSUE__FIELDS = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 37;

	/**
	 * The feature id for the '<em><b>Fix Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_ISSUE__FIX_VERSIONS = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 38;

	/**
	 * The feature id for the '<em><b>Affected Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_ISSUE__AFFECTED_VERSIONS = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 39;

	/**
	 * The feature id for the '<em><b>Issue Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_ISSUE__ISSUE_LINKS = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 40;

	/**
	 * The feature id for the '<em><b>Worklogs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_ISSUE__WORKLOGS = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 41;

	/**
	 * The feature id for the '<em><b>Expandos</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_ISSUE__EXPANDOS = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 42;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_ISSUE__COMMENTS = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 43;

	/**
	 * The feature id for the '<em><b>Reporter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_ISSUE__REPORTER = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 44;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_ISSUE__ASSIGNEE = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 45;

	/**
	 * The feature id for the '<em><b>Issue Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_ISSUE__ISSUE_TYPE = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 46;

	/**
	 * The number of structural features of the '<em>Jira Issue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_ISSUE_FEATURE_COUNT = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 47;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.CommentImpl
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraissuesPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__ID = ADDRESSABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Self</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__SELF = ADDRESSABLE_ELEMENT__SELF;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__CREATION_DATE = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Update Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__UPDATE_DATE = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__AUTHOR = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Update Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__UPDATE_AUTHOR = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__BODY = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.UserProxyImpl <em>User Proxy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.UserProxyImpl
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraissuesPackageImpl#getUserProxy()
	 * @generated
	 */
	int USER_PROXY = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROXY__ID = ADDRESSABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Self</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROXY__SELF = ADDRESSABLE_ELEMENT__SELF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROXY__NAME = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROXY__USER = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>User Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROXY_FEATURE_COUNT = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.UpdatableElementImpl <em>Updatable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.UpdatableElementImpl
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraissuesPackageImpl#getUpdatableElement()
	 * @generated
	 */
	int UPDATABLE_ELEMENT = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATABLE_ELEMENT__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATABLE_ELEMENT__CREATION_DATE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Update Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATABLE_ELEMENT__UPDATE_DATE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Updatable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATABLE_ELEMENT_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.AuthorUpdatableElementImpl <em>Author Updatable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.AuthorUpdatableElementImpl
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraissuesPackageImpl#getAuthorUpdatableElement()
	 * @generated
	 */
	int AUTHOR_UPDATABLE_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_UPDATABLE_ELEMENT__ID = UPDATABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_UPDATABLE_ELEMENT__CREATION_DATE = UPDATABLE_ELEMENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Update Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_UPDATABLE_ELEMENT__UPDATE_DATE = UPDATABLE_ELEMENT__UPDATE_DATE;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_UPDATABLE_ELEMENT__AUTHOR = UPDATABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Update Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_UPDATABLE_ELEMENT__UPDATE_AUTHOR = UPDATABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Author Updatable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_UPDATABLE_ELEMENT_FEATURE_COUNT = UPDATABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraLinkImpl <em>Jira Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraLinkImpl
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraissuesPackageImpl#getJiraLink()
	 * @generated
	 */
	int JIRA_LINK = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_LINK__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Target Issue Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_LINK__TARGET_ISSUE_KEY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Issue Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_LINK__TARGET_ISSUE_URI = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Issue Link Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_LINK__ISSUE_LINK_TYPE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_LINK__DIRECTION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Jira Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_LINK_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.FieldImpl
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraissuesPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Field Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__FIELD_ID = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TYPE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__VALUE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.jiraissues.DirectionEnum <em>Direction Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.DirectionEnum
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraissuesPackageImpl#getDirectionEnum()
	 * @generated
	 */
	int DIRECTION_ENUM = 14;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.jiraissues.IssueTypesEnum <em>Issue Types Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.IssueTypesEnum
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraissuesPackageImpl#getIssueTypesEnum()
	 * @generated
	 */
	int ISSUE_TYPES_ENUM = 15;


	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.jiraissues.Attachment <em>Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.Attachment
	 * @generated
	 */
	EClass getAttachment();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.jiraissues.Attachment#getFilename <em>Filename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filename</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.Attachment#getFilename()
	 * @see #getAttachment()
	 * @generated
	 */
	EAttribute getAttachment_Filename();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.jiraissues.Attachment#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.Attachment#getSize()
	 * @see #getAttachment()
	 * @generated
	 */
	EAttribute getAttachment_Size();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.jiraissues.Attachment#getMimeType <em>Mime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mime Type</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.Attachment#getMimeType()
	 * @see #getAttachment()
	 * @generated
	 */
	EAttribute getAttachment_MimeType();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.jiraissues.Attachment#getContentUri <em>Content Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Uri</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.Attachment#getContentUri()
	 * @see #getAttachment()
	 * @generated
	 */
	EAttribute getAttachment_ContentUri();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.jiraissues.Attachment#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.Attachment#getCreationDate()
	 * @see #getAttachment()
	 * @generated
	 */
	EAttribute getAttachment_CreationDate();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.toometa.jiraissues.Attachment#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Author</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.Attachment#getAuthor()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_Author();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.jiraissues.TimeTracking <em>Time Tracking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Tracking</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.TimeTracking
	 * @generated
	 */
	EClass getTimeTracking();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.jiraissues.TimeTracking#getOriginalEstimateMinutes <em>Original Estimate Minutes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Original Estimate Minutes</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.TimeTracking#getOriginalEstimateMinutes()
	 * @see #getTimeTracking()
	 * @generated
	 */
	EAttribute getTimeTracking_OriginalEstimateMinutes();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.jiraissues.TimeTracking#getRemainingEstimateMinutes <em>Remaining Estimate Minutes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remaining Estimate Minutes</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.TimeTracking#getRemainingEstimateMinutes()
	 * @see #getTimeTracking()
	 * @generated
	 */
	EAttribute getTimeTracking_RemainingEstimateMinutes();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.jiraissues.TimeTracking#getTimeSpentMinutes <em>Time Spent Minutes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Spent Minutes</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.TimeTracking#getTimeSpentMinutes()
	 * @see #getTimeTracking()
	 * @generated
	 */
	EAttribute getTimeTracking_TimeSpentMinutes();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.jiraissues.Worklog <em>Worklog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Worklog</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.Worklog
	 * @generated
	 */
	EClass getWorklog();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.jiraissues.Worklog#getIssueUri <em>Issue Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issue Uri</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.Worklog#getIssueUri()
	 * @see #getWorklog()
	 * @generated
	 */
	EAttribute getWorklog_IssueUri();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.jiraissues.Worklog#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.Worklog#getComment()
	 * @see #getWorklog()
	 * @generated
	 */
	EAttribute getWorklog_Comment();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.jiraissues.Worklog#getMinutesSpent <em>Minutes Spent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minutes Spent</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.Worklog#getMinutesSpent()
	 * @see #getWorklog()
	 * @generated
	 */
	EAttribute getWorklog_MinutesSpent();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.jiraissues.Worklog#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.Worklog#getStartDate()
	 * @see #getWorklog()
	 * @generated
	 */
	EAttribute getWorklog_StartDate();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.jiraissues.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.Version
	 * @generated
	 */
	EClass getVersion();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.jiraissues.Version#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.Version#getDescription()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Description();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.jiraissues.Version#isIsArchived <em>Is Archived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Archived</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.Version#isIsArchived()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_IsArchived();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.jiraissues.Version#isIsReleased <em>Is Released</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Released</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.Version#isIsReleased()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_IsReleased();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.jiraissues.Version#getReleaseDate <em>Release Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Release Date</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.Version#getReleaseDate()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_ReleaseDate();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.jiraissues.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.jiraissues.Project#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.Project#getKey()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Key();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.jiraissues.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.jiraissues.Component#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.Component#getDescription()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Description();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue <em>Jira Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jira Issue</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue
	 * @generated
	 */
	EClass getJiraIssue();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getKey()
	 * @see #getJiraIssue()
	 * @generated
	 */
	EAttribute getJiraIssue_Key();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getTransitionsUri <em>Transitions Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transitions Uri</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getTransitionsUri()
	 * @see #getJiraIssue()
	 * @generated
	 */
	EAttribute getJiraIssue_TransitionsUri();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolution</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getResolution()
	 * @see #getJiraIssue()
	 * @generated
	 */
	EAttribute getJiraIssue_Resolution();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getVotes <em>Votes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Votes</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getVotes()
	 * @see #getJiraIssue()
	 * @generated
	 */
	EAttribute getJiraIssue_Votes();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getNumWatchers <em>Num Watchers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Watchers</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getNumWatchers()
	 * @see #getJiraIssue()
	 * @generated
	 */
	EAttribute getJiraIssue_NumWatchers();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#isIsSubtask <em>Is Subtask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Subtask</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#isIsSubtask()
	 * @see #getJiraIssue()
	 * @generated
	 */
	EAttribute getJiraIssue_IsSubtask();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getTimeTracking <em>Time Tracking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Tracking</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getTimeTracking()
	 * @see #getJiraIssue()
	 * @generated
	 */
	EReference getJiraIssue_TimeTracking();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getAttachments <em>Attachments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attachments</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getAttachments()
	 * @see #getJiraIssue()
	 * @generated
	 */
	EReference getJiraIssue_Attachments();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Project</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getProject()
	 * @see #getJiraIssue()
	 * @generated
	 */
	EReference getJiraIssue_Project();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Components</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getComponents()
	 * @see #getJiraIssue()
	 * @generated
	 */
	EReference getJiraIssue_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getFields()
	 * @see #getJiraIssue()
	 * @generated
	 */
	EReference getJiraIssue_Fields();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getFixVersions <em>Fix Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fix Versions</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getFixVersions()
	 * @see #getJiraIssue()
	 * @generated
	 */
	EReference getJiraIssue_FixVersions();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getAffectedVersions <em>Affected Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Affected Versions</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getAffectedVersions()
	 * @see #getJiraIssue()
	 * @generated
	 */
	EReference getJiraIssue_AffectedVersions();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getIssueLinks <em>Issue Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Issue Links</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getIssueLinks()
	 * @see #getJiraIssue()
	 * @generated
	 */
	EReference getJiraIssue_IssueLinks();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getWorklogs <em>Worklogs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Worklogs</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getWorklogs()
	 * @see #getJiraIssue()
	 * @generated
	 */
	EReference getJiraIssue_Worklogs();

	/**
	 * Returns the meta object for the attribute list '{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getExpandos <em>Expandos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Expandos</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getExpandos()
	 * @see #getJiraIssue()
	 * @generated
	 */
	EAttribute getJiraIssue_Expandos();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comments</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getComments()
	 * @see #getJiraIssue()
	 * @generated
	 */
	EReference getJiraIssue_Comments();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getReporter <em>Reporter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reporter</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getReporter()
	 * @see #getJiraIssue()
	 * @generated
	 */
	EReference getJiraIssue_Reporter();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getAssignee <em>Assignee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assignee</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getAssignee()
	 * @see #getJiraIssue()
	 * @generated
	 */
	EReference getJiraIssue_Assignee();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getIssueType <em>Issue Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issue Type</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue#getIssueType()
	 * @see #getJiraIssue()
	 * @generated
	 */
	EAttribute getJiraIssue_IssueType();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.jiraissues.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.jiraissues.Comment#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.Comment#getBody()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Body();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.jiraissues.UserProxy <em>User Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Proxy</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.UserProxy
	 * @generated
	 */
	EClass getUserProxy();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.toometa.jiraissues.UserProxy#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.UserProxy#getUser()
	 * @see #getUserProxy()
	 * @generated
	 */
	EReference getUserProxy_User();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.jiraissues.AuthorUpdatableElement <em>Author Updatable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Author Updatable Element</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.AuthorUpdatableElement
	 * @generated
	 */
	EClass getAuthorUpdatableElement();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.toometa.jiraissues.AuthorUpdatableElement#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Author</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.AuthorUpdatableElement#getAuthor()
	 * @see #getAuthorUpdatableElement()
	 * @generated
	 */
	EReference getAuthorUpdatableElement_Author();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.toometa.jiraissues.AuthorUpdatableElement#getUpdateAuthor <em>Update Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Update Author</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.AuthorUpdatableElement#getUpdateAuthor()
	 * @see #getAuthorUpdatableElement()
	 * @generated
	 */
	EReference getAuthorUpdatableElement_UpdateAuthor();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.jiraissues.AddressableElement <em>Addressable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addressable Element</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.AddressableElement
	 * @generated
	 */
	EClass getAddressableElement();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.jiraissues.AddressableElement#getSelf <em>Self</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Self</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.AddressableElement#getSelf()
	 * @see #getAddressableElement()
	 * @generated
	 */
	EAttribute getAddressableElement_Self();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraLink <em>Jira Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jira Link</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraLink
	 * @generated
	 */
	EClass getJiraLink();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraLink#getTargetIssueKey <em>Target Issue Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Issue Key</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraLink#getTargetIssueKey()
	 * @see #getJiraLink()
	 * @generated
	 */
	EAttribute getJiraLink_TargetIssueKey();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraLink#getTargetIssueUri <em>Target Issue Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Issue Uri</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraLink#getTargetIssueUri()
	 * @see #getJiraLink()
	 * @generated
	 */
	EAttribute getJiraLink_TargetIssueUri();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraLink#getIssueLinkType <em>Issue Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issue Link Type</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraLink#getIssueLinkType()
	 * @see #getJiraLink()
	 * @generated
	 */
	EAttribute getJiraLink_IssueLinkType();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.jiraissues.JiraLink#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraLink#getDirection()
	 * @see #getJiraLink()
	 * @generated
	 */
	EAttribute getJiraLink_Direction();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.jiraissues.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.jiraissues.Field#getFieldId <em>Field Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Id</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.Field#getFieldId()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_FieldId();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.jiraissues.Field#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.Field#getType()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Type();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.jiraissues.Field#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.Field#getValue()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Value();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.jiraissues.UpdatableElement <em>Updatable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Updatable Element</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.UpdatableElement
	 * @generated
	 */
	EClass getUpdatableElement();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.jiraissues.UpdatableElement#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.UpdatableElement#getCreationDate()
	 * @see #getUpdatableElement()
	 * @generated
	 */
	EAttribute getUpdatableElement_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.toometa.jiraissues.UpdatableElement#getUpdateDate <em>Update Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Date</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.UpdatableElement#getUpdateDate()
	 * @see #getUpdatableElement()
	 * @generated
	 */
	EAttribute getUpdatableElement_UpdateDate();

	/**
	 * Returns the meta object for enum '{@link edu.kit.ipd.sdq.toometa.jiraissues.DirectionEnum <em>Direction Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction Enum</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.DirectionEnum
	 * @generated
	 */
	EEnum getDirectionEnum();

	/**
	 * Returns the meta object for enum '{@link edu.kit.ipd.sdq.toometa.jiraissues.IssueTypesEnum <em>Issue Types Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Issue Types Enum</em>'.
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.IssueTypesEnum
	 * @generated
	 */
	EEnum getIssueTypesEnum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JiraissuesFactory getJiraissuesFactory();

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
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.AttachmentImpl <em>Attachment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.AttachmentImpl
		 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraissuesPackageImpl#getAttachment()
		 * @generated
		 */
		EClass ATTACHMENT = eINSTANCE.getAttachment();

		/**
		 * The meta object literal for the '<em><b>Filename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACHMENT__FILENAME = eINSTANCE.getAttachment_Filename();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACHMENT__SIZE = eINSTANCE.getAttachment_Size();

		/**
		 * The meta object literal for the '<em><b>Mime Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACHMENT__MIME_TYPE = eINSTANCE.getAttachment_MimeType();

		/**
		 * The meta object literal for the '<em><b>Content Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACHMENT__CONTENT_URI = eINSTANCE.getAttachment_ContentUri();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACHMENT__CREATION_DATE = eINSTANCE.getAttachment_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__AUTHOR = eINSTANCE.getAttachment_Author();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.TimeTrackingImpl <em>Time Tracking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.TimeTrackingImpl
		 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraissuesPackageImpl#getTimeTracking()
		 * @generated
		 */
		EClass TIME_TRACKING = eINSTANCE.getTimeTracking();

		/**
		 * The meta object literal for the '<em><b>Original Estimate Minutes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_TRACKING__ORIGINAL_ESTIMATE_MINUTES = eINSTANCE.getTimeTracking_OriginalEstimateMinutes();

		/**
		 * The meta object literal for the '<em><b>Remaining Estimate Minutes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_TRACKING__REMAINING_ESTIMATE_MINUTES = eINSTANCE.getTimeTracking_RemainingEstimateMinutes();

		/**
		 * The meta object literal for the '<em><b>Time Spent Minutes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_TRACKING__TIME_SPENT_MINUTES = eINSTANCE.getTimeTracking_TimeSpentMinutes();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.WorklogImpl <em>Worklog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.WorklogImpl
		 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraissuesPackageImpl#getWorklog()
		 * @generated
		 */
		EClass WORKLOG = eINSTANCE.getWorklog();

		/**
		 * The meta object literal for the '<em><b>Issue Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKLOG__ISSUE_URI = eINSTANCE.getWorklog_IssueUri();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKLOG__COMMENT = eINSTANCE.getWorklog_Comment();

		/**
		 * The meta object literal for the '<em><b>Minutes Spent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKLOG__MINUTES_SPENT = eINSTANCE.getWorklog_MinutesSpent();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKLOG__START_DATE = eINSTANCE.getWorklog_StartDate();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.VersionImpl <em>Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.VersionImpl
		 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraissuesPackageImpl#getVersion()
		 * @generated
		 */
		EClass VERSION = eINSTANCE.getVersion();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__DESCRIPTION = eINSTANCE.getVersion_Description();

		/**
		 * The meta object literal for the '<em><b>Is Archived</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__IS_ARCHIVED = eINSTANCE.getVersion_IsArchived();

		/**
		 * The meta object literal for the '<em><b>Is Released</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__IS_RELEASED = eINSTANCE.getVersion_IsReleased();

		/**
		 * The meta object literal for the '<em><b>Release Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__RELEASE_DATE = eINSTANCE.getVersion_ReleaseDate();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.ProjectImpl
		 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraissuesPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__KEY = eINSTANCE.getProject_Key();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.ComponentImpl
		 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraissuesPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__DESCRIPTION = eINSTANCE.getComponent_Description();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraIssueImpl <em>Jira Issue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraIssueImpl
		 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraissuesPackageImpl#getJiraIssue()
		 * @generated
		 */
		EClass JIRA_ISSUE = eINSTANCE.getJiraIssue();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JIRA_ISSUE__KEY = eINSTANCE.getJiraIssue_Key();

		/**
		 * The meta object literal for the '<em><b>Transitions Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JIRA_ISSUE__TRANSITIONS_URI = eINSTANCE.getJiraIssue_TransitionsUri();

		/**
		 * The meta object literal for the '<em><b>Resolution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JIRA_ISSUE__RESOLUTION = eINSTANCE.getJiraIssue_Resolution();

		/**
		 * The meta object literal for the '<em><b>Votes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JIRA_ISSUE__VOTES = eINSTANCE.getJiraIssue_Votes();

		/**
		 * The meta object literal for the '<em><b>Num Watchers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JIRA_ISSUE__NUM_WATCHERS = eINSTANCE.getJiraIssue_NumWatchers();

		/**
		 * The meta object literal for the '<em><b>Is Subtask</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JIRA_ISSUE__IS_SUBTASK = eINSTANCE.getJiraIssue_IsSubtask();

		/**
		 * The meta object literal for the '<em><b>Time Tracking</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JIRA_ISSUE__TIME_TRACKING = eINSTANCE.getJiraIssue_TimeTracking();

		/**
		 * The meta object literal for the '<em><b>Attachments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JIRA_ISSUE__ATTACHMENTS = eINSTANCE.getJiraIssue_Attachments();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JIRA_ISSUE__PROJECT = eINSTANCE.getJiraIssue_Project();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JIRA_ISSUE__COMPONENTS = eINSTANCE.getJiraIssue_Components();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JIRA_ISSUE__FIELDS = eINSTANCE.getJiraIssue_Fields();

		/**
		 * The meta object literal for the '<em><b>Fix Versions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JIRA_ISSUE__FIX_VERSIONS = eINSTANCE.getJiraIssue_FixVersions();

		/**
		 * The meta object literal for the '<em><b>Affected Versions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JIRA_ISSUE__AFFECTED_VERSIONS = eINSTANCE.getJiraIssue_AffectedVersions();

		/**
		 * The meta object literal for the '<em><b>Issue Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JIRA_ISSUE__ISSUE_LINKS = eINSTANCE.getJiraIssue_IssueLinks();

		/**
		 * The meta object literal for the '<em><b>Worklogs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JIRA_ISSUE__WORKLOGS = eINSTANCE.getJiraIssue_Worklogs();

		/**
		 * The meta object literal for the '<em><b>Expandos</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JIRA_ISSUE__EXPANDOS = eINSTANCE.getJiraIssue_Expandos();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JIRA_ISSUE__COMMENTS = eINSTANCE.getJiraIssue_Comments();

		/**
		 * The meta object literal for the '<em><b>Reporter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JIRA_ISSUE__REPORTER = eINSTANCE.getJiraIssue_Reporter();

		/**
		 * The meta object literal for the '<em><b>Assignee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JIRA_ISSUE__ASSIGNEE = eINSTANCE.getJiraIssue_Assignee();

		/**
		 * The meta object literal for the '<em><b>Issue Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JIRA_ISSUE__ISSUE_TYPE = eINSTANCE.getJiraIssue_IssueType();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.CommentImpl
		 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraissuesPackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__BODY = eINSTANCE.getComment_Body();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.UserProxyImpl <em>User Proxy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.UserProxyImpl
		 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraissuesPackageImpl#getUserProxy()
		 * @generated
		 */
		EClass USER_PROXY = eINSTANCE.getUserProxy();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_PROXY__USER = eINSTANCE.getUserProxy_User();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.AuthorUpdatableElementImpl <em>Author Updatable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.AuthorUpdatableElementImpl
		 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraissuesPackageImpl#getAuthorUpdatableElement()
		 * @generated
		 */
		EClass AUTHOR_UPDATABLE_ELEMENT = eINSTANCE.getAuthorUpdatableElement();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHOR_UPDATABLE_ELEMENT__AUTHOR = eINSTANCE.getAuthorUpdatableElement_Author();

		/**
		 * The meta object literal for the '<em><b>Update Author</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHOR_UPDATABLE_ELEMENT__UPDATE_AUTHOR = eINSTANCE.getAuthorUpdatableElement_UpdateAuthor();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.AddressableElementImpl <em>Addressable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.AddressableElementImpl
		 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraissuesPackageImpl#getAddressableElement()
		 * @generated
		 */
		EClass ADDRESSABLE_ELEMENT = eINSTANCE.getAddressableElement();

		/**
		 * The meta object literal for the '<em><b>Self</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESSABLE_ELEMENT__SELF = eINSTANCE.getAddressableElement_Self();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraLinkImpl <em>Jira Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraLinkImpl
		 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraissuesPackageImpl#getJiraLink()
		 * @generated
		 */
		EClass JIRA_LINK = eINSTANCE.getJiraLink();

		/**
		 * The meta object literal for the '<em><b>Target Issue Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JIRA_LINK__TARGET_ISSUE_KEY = eINSTANCE.getJiraLink_TargetIssueKey();

		/**
		 * The meta object literal for the '<em><b>Target Issue Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JIRA_LINK__TARGET_ISSUE_URI = eINSTANCE.getJiraLink_TargetIssueUri();

		/**
		 * The meta object literal for the '<em><b>Issue Link Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JIRA_LINK__ISSUE_LINK_TYPE = eINSTANCE.getJiraLink_IssueLinkType();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JIRA_LINK__DIRECTION = eINSTANCE.getJiraLink_Direction();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.FieldImpl
		 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraissuesPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Field Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__FIELD_ID = eINSTANCE.getField_FieldId();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__TYPE = eINSTANCE.getField_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__VALUE = eINSTANCE.getField_Value();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.UpdatableElementImpl <em>Updatable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.UpdatableElementImpl
		 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraissuesPackageImpl#getUpdatableElement()
		 * @generated
		 */
		EClass UPDATABLE_ELEMENT = eINSTANCE.getUpdatableElement();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATABLE_ELEMENT__CREATION_DATE = eINSTANCE.getUpdatableElement_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Update Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATABLE_ELEMENT__UPDATE_DATE = eINSTANCE.getUpdatableElement_UpdateDate();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.jiraissues.DirectionEnum <em>Direction Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.jiraissues.DirectionEnum
		 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraissuesPackageImpl#getDirectionEnum()
		 * @generated
		 */
		EEnum DIRECTION_ENUM = eINSTANCE.getDirectionEnum();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.jiraissues.IssueTypesEnum <em>Issue Types Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.jiraissues.IssueTypesEnum
		 * @see edu.kit.ipd.sdq.toometa.jiraissues.impl.JiraissuesPackageImpl#getIssueTypesEnum()
		 * @generated
		 */
		EEnum ISSUE_TYPES_ENUM = eINSTANCE.getIssueTypesEnum();

	}

} //JiraissuesPackage
