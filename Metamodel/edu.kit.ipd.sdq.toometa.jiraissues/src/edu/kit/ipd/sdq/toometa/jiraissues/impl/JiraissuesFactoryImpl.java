/**
 */
package edu.kit.ipd.sdq.toometa.jiraissues.impl;

import edu.kit.ipd.sdq.toometa.jiraissues.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JiraissuesFactoryImpl extends EFactoryImpl implements JiraissuesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JiraissuesFactory init() {
		try {
			JiraissuesFactory theJiraissuesFactory = (JiraissuesFactory)EPackage.Registry.INSTANCE.getEFactory(JiraissuesPackage.eNS_URI);
			if (theJiraissuesFactory != null) {
				return theJiraissuesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JiraissuesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JiraissuesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case JiraissuesPackage.ATTACHMENT: return (EObject)createAttachment();
			case JiraissuesPackage.TIME_TRACKING: return (EObject)createTimeTracking();
			case JiraissuesPackage.WORKLOG: return (EObject)createWorklog();
			case JiraissuesPackage.VERSION: return (EObject)createVersion();
			case JiraissuesPackage.PROJECT: return (EObject)createProject();
			case JiraissuesPackage.COMPONENT: return (EObject)createComponent();
			case JiraissuesPackage.JIRA_ISSUE: return (EObject)createJiraIssue();
			case JiraissuesPackage.COMMENT: return (EObject)createComment();
			case JiraissuesPackage.USER_PROXY: return (EObject)createUserProxy();
			case JiraissuesPackage.AUTHOR_UPDATABLE_ELEMENT: return (EObject)createAuthorUpdatableElement();
			case JiraissuesPackage.ADDRESSABLE_ELEMENT: return (EObject)createAddressableElement();
			case JiraissuesPackage.JIRA_LINK: return (EObject)createJiraLink();
			case JiraissuesPackage.FIELD: return (EObject)createField();
			case JiraissuesPackage.UPDATABLE_ELEMENT: return (EObject)createUpdatableElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case JiraissuesPackage.DIRECTION_ENUM:
				return createDirectionEnumFromString(eDataType, initialValue);
			case JiraissuesPackage.ISSUE_TYPES_ENUM:
				return createIssueTypesEnumFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case JiraissuesPackage.DIRECTION_ENUM:
				return convertDirectionEnumToString(eDataType, instanceValue);
			case JiraissuesPackage.ISSUE_TYPES_ENUM:
				return convertIssueTypesEnumToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment createAttachment() {
		AttachmentImpl attachment = new AttachmentImpl();
		return attachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeTracking createTimeTracking() {
		TimeTrackingImpl timeTracking = new TimeTrackingImpl();
		return timeTracking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Worklog createWorklog() {
		WorklogImpl worklog = new WorklogImpl();
		return worklog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version createVersion() {
		VersionImpl version = new VersionImpl();
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JiraIssue createJiraIssue() {
		JiraIssueImpl jiraIssue = new JiraIssueImpl();
		return jiraIssue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment createComment() {
		CommentImpl comment = new CommentImpl();
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserProxy createUserProxy() {
		UserProxyImpl userProxy = new UserProxyImpl();
		return userProxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorUpdatableElement createAuthorUpdatableElement() {
		AuthorUpdatableElementImpl authorUpdatableElement = new AuthorUpdatableElementImpl();
		return authorUpdatableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressableElement createAddressableElement() {
		AddressableElementImpl addressableElement = new AddressableElementImpl();
		return addressableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JiraLink createJiraLink() {
		JiraLinkImpl jiraLink = new JiraLinkImpl();
		return jiraLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdatableElement createUpdatableElement() {
		UpdatableElementImpl updatableElement = new UpdatableElementImpl();
		return updatableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionEnum createDirectionEnumFromString(EDataType eDataType, String initialValue) {
		DirectionEnum result = DirectionEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueTypesEnum createIssueTypesEnumFromString(EDataType eDataType, String initialValue) {
		IssueTypesEnum result = IssueTypesEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIssueTypesEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JiraissuesPackage getJiraissuesPackage() {
		return (JiraissuesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JiraissuesPackage getPackage() {
		return JiraissuesPackage.eINSTANCE;
	}

} //JiraissuesFactoryImpl
