/**
 */
package edu.kit.ipd.sdq.toometa.jiraissues.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import edu.kit.ipd.sdq.toometa.issues.IssuesPackage;

import edu.kit.ipd.sdq.toometa.jiraissues.AddressableElement;
import edu.kit.ipd.sdq.toometa.jiraissues.Attachment;
import edu.kit.ipd.sdq.toometa.jiraissues.AuthorUpdatableElement;
import edu.kit.ipd.sdq.toometa.jiraissues.Comment;
import edu.kit.ipd.sdq.toometa.jiraissues.Component;
import edu.kit.ipd.sdq.toometa.jiraissues.DirectionEnum;
import edu.kit.ipd.sdq.toometa.jiraissues.Field;
import edu.kit.ipd.sdq.toometa.jiraissues.IssueTypesEnum;
import edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue;
import edu.kit.ipd.sdq.toometa.jiraissues.JiraLink;
import edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesFactory;
import edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage;
import edu.kit.ipd.sdq.toometa.jiraissues.Project;
import edu.kit.ipd.sdq.toometa.jiraissues.TimeTracking;
import edu.kit.ipd.sdq.toometa.jiraissues.UpdatableElement;
import edu.kit.ipd.sdq.toometa.jiraissues.UserProxy;
import edu.kit.ipd.sdq.toometa.jiraissues.Version;
import edu.kit.ipd.sdq.toometa.jiraissues.Worklog;

import edu.kit.ipd.sdq.toometa.users.UsersPackage;

import namedelement.NamedelementPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JiraissuesPackageImpl extends EPackageImpl implements JiraissuesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeTrackingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass worklogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jiraIssueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userProxyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorUpdatableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jiraLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updatableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum directionEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum issueTypesEnumEEnum = null;

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
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JiraissuesPackageImpl() {
		super(eNS_URI, JiraissuesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link JiraissuesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JiraissuesPackage init() {
		if (isInited) return (JiraissuesPackage)EPackage.Registry.INSTANCE.getEPackage(JiraissuesPackage.eNS_URI);

		// Obtain or create and register package
		JiraissuesPackageImpl theJiraissuesPackage = (JiraissuesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JiraissuesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JiraissuesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		IssuesPackage.eINSTANCE.eClass();
		NamedelementPackage.eINSTANCE.eClass();
		UsersPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theJiraissuesPackage.createPackageContents();

		// Initialize created meta-data
		theJiraissuesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJiraissuesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JiraissuesPackage.eNS_URI, theJiraissuesPackage);
		return theJiraissuesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachment() {
		return attachmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttachment_Filename() {
		return (EAttribute)attachmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttachment_Size() {
		return (EAttribute)attachmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttachment_MimeType() {
		return (EAttribute)attachmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttachment_ContentUri() {
		return (EAttribute)attachmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttachment_CreationDate() {
		return (EAttribute)attachmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_Author() {
		return (EReference)attachmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeTracking() {
		return timeTrackingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeTracking_OriginalEstimateMinutes() {
		return (EAttribute)timeTrackingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeTracking_RemainingEstimateMinutes() {
		return (EAttribute)timeTrackingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeTracking_TimeSpentMinutes() {
		return (EAttribute)timeTrackingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorklog() {
		return worklogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorklog_IssueUri() {
		return (EAttribute)worklogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorklog_Comment() {
		return (EAttribute)worklogEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorklog_MinutesSpent() {
		return (EAttribute)worklogEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorklog_StartDate() {
		return (EAttribute)worklogEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVersion() {
		return versionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_Description() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_IsArchived() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_IsReleased() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_ReleaseDate() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProject() {
		return projectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_Key() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Description() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJiraIssue() {
		return jiraIssueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJiraIssue_Key() {
		return (EAttribute)jiraIssueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJiraIssue_TransitionsUri() {
		return (EAttribute)jiraIssueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJiraIssue_Resolution() {
		return (EAttribute)jiraIssueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJiraIssue_Votes() {
		return (EAttribute)jiraIssueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJiraIssue_NumWatchers() {
		return (EAttribute)jiraIssueEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJiraIssue_IsSubtask() {
		return (EAttribute)jiraIssueEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJiraIssue_TimeTracking() {
		return (EReference)jiraIssueEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJiraIssue_Attachments() {
		return (EReference)jiraIssueEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJiraIssue_Project() {
		return (EReference)jiraIssueEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJiraIssue_Components() {
		return (EReference)jiraIssueEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJiraIssue_Fields() {
		return (EReference)jiraIssueEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJiraIssue_FixVersions() {
		return (EReference)jiraIssueEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJiraIssue_AffectedVersions() {
		return (EReference)jiraIssueEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJiraIssue_IssueLinks() {
		return (EReference)jiraIssueEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJiraIssue_Worklogs() {
		return (EReference)jiraIssueEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJiraIssue_Expandos() {
		return (EAttribute)jiraIssueEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJiraIssue_Comments() {
		return (EReference)jiraIssueEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJiraIssue_Reporter() {
		return (EReference)jiraIssueEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJiraIssue_Assignee() {
		return (EReference)jiraIssueEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJiraIssue_IssueType() {
		return (EAttribute)jiraIssueEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComment() {
		return commentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComment_Body() {
		return (EAttribute)commentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserProxy() {
		return userProxyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserProxy_User() {
		return (EReference)userProxyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthorUpdatableElement() {
		return authorUpdatableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuthorUpdatableElement_Author() {
		return (EReference)authorUpdatableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuthorUpdatableElement_UpdateAuthor() {
		return (EReference)authorUpdatableElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddressableElement() {
		return addressableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressableElement_Self() {
		return (EAttribute)addressableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJiraLink() {
		return jiraLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJiraLink_TargetIssueKey() {
		return (EAttribute)jiraLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJiraLink_TargetIssueUri() {
		return (EAttribute)jiraLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJiraLink_IssueLinkType() {
		return (EAttribute)jiraLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJiraLink_Direction() {
		return (EAttribute)jiraLinkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getField() {
		return fieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_FieldId() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_Type() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_Value() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdatableElement() {
		return updatableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdatableElement_CreationDate() {
		return (EAttribute)updatableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdatableElement_UpdateDate() {
		return (EAttribute)updatableElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDirectionEnum() {
		return directionEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIssueTypesEnum() {
		return issueTypesEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JiraissuesFactory getJiraissuesFactory() {
		return (JiraissuesFactory)getEFactoryInstance();
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
		attachmentEClass = createEClass(ATTACHMENT);
		createEAttribute(attachmentEClass, ATTACHMENT__FILENAME);
		createEAttribute(attachmentEClass, ATTACHMENT__SIZE);
		createEAttribute(attachmentEClass, ATTACHMENT__MIME_TYPE);
		createEAttribute(attachmentEClass, ATTACHMENT__CONTENT_URI);
		createEAttribute(attachmentEClass, ATTACHMENT__CREATION_DATE);
		createEReference(attachmentEClass, ATTACHMENT__AUTHOR);

		timeTrackingEClass = createEClass(TIME_TRACKING);
		createEAttribute(timeTrackingEClass, TIME_TRACKING__ORIGINAL_ESTIMATE_MINUTES);
		createEAttribute(timeTrackingEClass, TIME_TRACKING__REMAINING_ESTIMATE_MINUTES);
		createEAttribute(timeTrackingEClass, TIME_TRACKING__TIME_SPENT_MINUTES);

		worklogEClass = createEClass(WORKLOG);
		createEAttribute(worklogEClass, WORKLOG__ISSUE_URI);
		createEAttribute(worklogEClass, WORKLOG__COMMENT);
		createEAttribute(worklogEClass, WORKLOG__MINUTES_SPENT);
		createEAttribute(worklogEClass, WORKLOG__START_DATE);

		versionEClass = createEClass(VERSION);
		createEAttribute(versionEClass, VERSION__DESCRIPTION);
		createEAttribute(versionEClass, VERSION__IS_ARCHIVED);
		createEAttribute(versionEClass, VERSION__IS_RELEASED);
		createEAttribute(versionEClass, VERSION__RELEASE_DATE);

		projectEClass = createEClass(PROJECT);
		createEAttribute(projectEClass, PROJECT__KEY);

		componentEClass = createEClass(COMPONENT);
		createEAttribute(componentEClass, COMPONENT__DESCRIPTION);

		jiraIssueEClass = createEClass(JIRA_ISSUE);
		createEAttribute(jiraIssueEClass, JIRA_ISSUE__KEY);
		createEAttribute(jiraIssueEClass, JIRA_ISSUE__TRANSITIONS_URI);
		createEAttribute(jiraIssueEClass, JIRA_ISSUE__RESOLUTION);
		createEAttribute(jiraIssueEClass, JIRA_ISSUE__VOTES);
		createEAttribute(jiraIssueEClass, JIRA_ISSUE__NUM_WATCHERS);
		createEAttribute(jiraIssueEClass, JIRA_ISSUE__IS_SUBTASK);
		createEReference(jiraIssueEClass, JIRA_ISSUE__TIME_TRACKING);
		createEReference(jiraIssueEClass, JIRA_ISSUE__ATTACHMENTS);
		createEReference(jiraIssueEClass, JIRA_ISSUE__PROJECT);
		createEReference(jiraIssueEClass, JIRA_ISSUE__COMPONENTS);
		createEReference(jiraIssueEClass, JIRA_ISSUE__FIELDS);
		createEReference(jiraIssueEClass, JIRA_ISSUE__FIX_VERSIONS);
		createEReference(jiraIssueEClass, JIRA_ISSUE__AFFECTED_VERSIONS);
		createEReference(jiraIssueEClass, JIRA_ISSUE__ISSUE_LINKS);
		createEReference(jiraIssueEClass, JIRA_ISSUE__WORKLOGS);
		createEAttribute(jiraIssueEClass, JIRA_ISSUE__EXPANDOS);
		createEReference(jiraIssueEClass, JIRA_ISSUE__COMMENTS);
		createEReference(jiraIssueEClass, JIRA_ISSUE__REPORTER);
		createEReference(jiraIssueEClass, JIRA_ISSUE__ASSIGNEE);
		createEAttribute(jiraIssueEClass, JIRA_ISSUE__ISSUE_TYPE);

		commentEClass = createEClass(COMMENT);
		createEAttribute(commentEClass, COMMENT__BODY);

		userProxyEClass = createEClass(USER_PROXY);
		createEReference(userProxyEClass, USER_PROXY__USER);

		authorUpdatableElementEClass = createEClass(AUTHOR_UPDATABLE_ELEMENT);
		createEReference(authorUpdatableElementEClass, AUTHOR_UPDATABLE_ELEMENT__AUTHOR);
		createEReference(authorUpdatableElementEClass, AUTHOR_UPDATABLE_ELEMENT__UPDATE_AUTHOR);

		addressableElementEClass = createEClass(ADDRESSABLE_ELEMENT);
		createEAttribute(addressableElementEClass, ADDRESSABLE_ELEMENT__SELF);

		jiraLinkEClass = createEClass(JIRA_LINK);
		createEAttribute(jiraLinkEClass, JIRA_LINK__TARGET_ISSUE_KEY);
		createEAttribute(jiraLinkEClass, JIRA_LINK__TARGET_ISSUE_URI);
		createEAttribute(jiraLinkEClass, JIRA_LINK__ISSUE_LINK_TYPE);
		createEAttribute(jiraLinkEClass, JIRA_LINK__DIRECTION);

		fieldEClass = createEClass(FIELD);
		createEAttribute(fieldEClass, FIELD__FIELD_ID);
		createEAttribute(fieldEClass, FIELD__TYPE);
		createEAttribute(fieldEClass, FIELD__VALUE);

		updatableElementEClass = createEClass(UPDATABLE_ELEMENT);
		createEAttribute(updatableElementEClass, UPDATABLE_ELEMENT__CREATION_DATE);
		createEAttribute(updatableElementEClass, UPDATABLE_ELEMENT__UPDATE_DATE);

		// Create enums
		directionEnumEEnum = createEEnum(DIRECTION_ENUM);
		issueTypesEnumEEnum = createEEnum(ISSUE_TYPES_ENUM);
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
		NamedelementPackage theNamedelementPackage = (NamedelementPackage)EPackage.Registry.INSTANCE.getEPackage(NamedelementPackage.eNS_URI);
		IssuesPackage theIssuesPackage = (IssuesPackage)EPackage.Registry.INSTANCE.getEPackage(IssuesPackage.eNS_URI);
		UsersPackage theUsersPackage = (UsersPackage)EPackage.Registry.INSTANCE.getEPackage(UsersPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		attachmentEClass.getESuperTypes().add(this.getAddressableElement());
		timeTrackingEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		worklogEClass.getESuperTypes().add(this.getAddressableElement());
		worklogEClass.getESuperTypes().add(this.getAuthorUpdatableElement());
		versionEClass.getESuperTypes().add(this.getAddressableElement());
		versionEClass.getESuperTypes().add(theNamedelementPackage.getNamedElement());
		projectEClass.getESuperTypes().add(this.getAddressableElement());
		projectEClass.getESuperTypes().add(theNamedelementPackage.getNamedElement());
		componentEClass.getESuperTypes().add(this.getAddressableElement());
		componentEClass.getESuperTypes().add(theNamedelementPackage.getNamedElement());
		jiraIssueEClass.getESuperTypes().add(this.getAddressableElement());
		jiraIssueEClass.getESuperTypes().add(this.getUpdatableElement());
		jiraIssueEClass.getESuperTypes().add(theIssuesPackage.getIssue());
		commentEClass.getESuperTypes().add(this.getAddressableElement());
		commentEClass.getESuperTypes().add(this.getAuthorUpdatableElement());
		userProxyEClass.getESuperTypes().add(this.getAddressableElement());
		userProxyEClass.getESuperTypes().add(theNamedelementPackage.getNamedElement());
		authorUpdatableElementEClass.getESuperTypes().add(this.getUpdatableElement());
		addressableElementEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		jiraLinkEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		fieldEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		fieldEClass.getESuperTypes().add(theNamedelementPackage.getNamedElement());
		updatableElementEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());

		// Initialize classes and features; add operations and parameters
		initEClass(attachmentEClass, Attachment.class, "Attachment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttachment_Filename(), ecorePackage.getEString(), "filename", null, 0, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttachment_Size(), ecorePackage.getEInt(), "size", null, 0, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttachment_MimeType(), ecorePackage.getEString(), "mimeType", null, 0, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttachment_ContentUri(), ecorePackage.getEString(), "contentUri", null, 0, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttachment_CreationDate(), ecorePackage.getEDate(), "creationDate", null, 0, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachment_Author(), this.getUserProxy(), null, "author", null, 1, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeTrackingEClass, TimeTracking.class, "TimeTracking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeTracking_OriginalEstimateMinutes(), ecorePackage.getEInt(), "originalEstimateMinutes", null, 0, 1, TimeTracking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeTracking_RemainingEstimateMinutes(), ecorePackage.getEInt(), "remainingEstimateMinutes", null, 0, 1, TimeTracking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeTracking_TimeSpentMinutes(), ecorePackage.getEInt(), "timeSpentMinutes", null, 0, 1, TimeTracking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(worklogEClass, Worklog.class, "Worklog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorklog_IssueUri(), ecorePackage.getEString(), "issueUri", null, 1, 1, Worklog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorklog_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, Worklog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorklog_MinutesSpent(), ecorePackage.getEInt(), "minutesSpent", null, 1, 1, Worklog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorklog_StartDate(), ecorePackage.getEDate(), "startDate", null, 0, 1, Worklog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(versionEClass, Version.class, "Version", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVersion_Description(), ecorePackage.getEString(), "description", null, 0, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersion_IsArchived(), ecorePackage.getEBoolean(), "isArchived", "false", 0, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersion_IsReleased(), ecorePackage.getEBoolean(), "isReleased", "false", 0, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersion_ReleaseDate(), ecorePackage.getEDate(), "releaseDate", null, 0, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProject_Key(), ecorePackage.getEString(), "key", null, 1, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponent_Description(), ecorePackage.getEString(), "description", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jiraIssueEClass, JiraIssue.class, "JiraIssue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJiraIssue_Key(), ecorePackage.getEString(), "key", null, 1, 1, JiraIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJiraIssue_TransitionsUri(), ecorePackage.getEString(), "transitionsUri", null, 0, 1, JiraIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJiraIssue_Resolution(), ecorePackage.getEString(), "resolution", null, 0, 1, JiraIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJiraIssue_Votes(), ecorePackage.getEInt(), "votes", null, 0, 1, JiraIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJiraIssue_NumWatchers(), ecorePackage.getEInt(), "numWatchers", null, 0, 1, JiraIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJiraIssue_IsSubtask(), ecorePackage.getEBoolean(), "isSubtask", "false", 0, 1, JiraIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJiraIssue_TimeTracking(), this.getTimeTracking(), null, "timeTracking", null, 0, 1, JiraIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJiraIssue_Attachments(), this.getAttachment(), null, "attachments", null, 0, -1, JiraIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJiraIssue_Project(), this.getProject(), null, "project", null, 1, 1, JiraIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJiraIssue_Components(), this.getComponent(), null, "components", null, 0, -1, JiraIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJiraIssue_Fields(), this.getField(), null, "fields", null, 0, -1, JiraIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJiraIssue_FixVersions(), this.getVersion(), null, "fixVersions", null, 1, -1, JiraIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJiraIssue_AffectedVersions(), this.getVersion(), null, "affectedVersions", null, 1, -1, JiraIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJiraIssue_IssueLinks(), this.getJiraLink(), null, "issueLinks", null, 0, -1, JiraIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJiraIssue_Worklogs(), this.getWorklog(), null, "worklogs", null, 0, -1, JiraIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJiraIssue_Expandos(), ecorePackage.getEString(), "expandos", null, 0, -1, JiraIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJiraIssue_Comments(), this.getComment(), null, "comments", null, 0, -1, JiraIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJiraIssue_Reporter(), this.getUserProxy(), null, "reporter", null, 0, 1, JiraIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJiraIssue_Assignee(), this.getUserProxy(), null, "assignee", null, 0, 1, JiraIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJiraIssue_IssueType(), this.getIssueTypesEnum(), "issueType", null, 0, 1, JiraIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComment_Body(), ecorePackage.getEString(), "body", null, 1, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userProxyEClass, UserProxy.class, "UserProxy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUserProxy_User(), theUsersPackage.getUser(), null, "user", null, 1, 1, UserProxy.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authorUpdatableElementEClass, AuthorUpdatableElement.class, "AuthorUpdatableElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAuthorUpdatableElement_Author(), this.getUserProxy(), null, "author", null, 1, 1, AuthorUpdatableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuthorUpdatableElement_UpdateAuthor(), this.getUserProxy(), null, "updateAuthor", null, 0, 1, AuthorUpdatableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addressableElementEClass, AddressableElement.class, "AddressableElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddressableElement_Self(), ecorePackage.getEString(), "self", null, 1, 1, AddressableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jiraLinkEClass, JiraLink.class, "JiraLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJiraLink_TargetIssueKey(), ecorePackage.getEString(), "targetIssueKey", null, 1, 1, JiraLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJiraLink_TargetIssueUri(), ecorePackage.getEString(), "targetIssueUri", null, 1, 1, JiraLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJiraLink_IssueLinkType(), ecorePackage.getEString(), "issueLinkType", null, 0, 1, JiraLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJiraLink_Direction(), this.getDirectionEnum(), "direction", null, 0, 1, JiraLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getField_FieldId(), ecorePackage.getEString(), "fieldId", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_Type(), ecorePackage.getEString(), "type", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_Value(), ecorePackage.getEJavaObject(), "value", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updatableElementEClass, UpdatableElement.class, "UpdatableElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUpdatableElement_CreationDate(), ecorePackage.getEDate(), "creationDate", null, 0, 1, UpdatableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdatableElement_UpdateDate(), ecorePackage.getEDate(), "updateDate", null, 0, 1, UpdatableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(directionEnumEEnum, DirectionEnum.class, "DirectionEnum");
		addEEnumLiteral(directionEnumEEnum, DirectionEnum.OUTBOUND);
		addEEnumLiteral(directionEnumEEnum, DirectionEnum.INBOUND);

		initEEnum(issueTypesEnumEEnum, IssueTypesEnum.class, "IssueTypesEnum");
		addEEnumLiteral(issueTypesEnumEEnum, IssueTypesEnum.NEW_FEATURE);
		addEEnumLiteral(issueTypesEnumEEnum, IssueTypesEnum.BUG);
		addEEnumLiteral(issueTypesEnumEEnum, IssueTypesEnum.TASK);
		addEEnumLiteral(issueTypesEnumEEnum, IssueTypesEnum.IMPROVEMENT);
		addEEnumLiteral(issueTypesEnumEEnum, IssueTypesEnum.TEST);

		// Create resource
		createResource(eNS_URI);
	}

} //JiraissuesPackageImpl
