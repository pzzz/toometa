/**
 */
package edu.kit.ipd.sdq.toometa.issues.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import edu.kit.ipd.sdq.toometa.issues.Issue;
import edu.kit.ipd.sdq.toometa.issues.IssueModel;
import edu.kit.ipd.sdq.toometa.issues.IssuePriorityEnum;
import edu.kit.ipd.sdq.toometa.issues.IssueStatusEnum;
import edu.kit.ipd.sdq.toometa.issues.IssuesFactory;
import edu.kit.ipd.sdq.toometa.issues.IssuesPackage;
import edu.kit.ipd.sdq.toometa.issues.TextIssue;

import edu.kit.ipd.sdq.toometa.relations.RelationsPackage;

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
public class IssuesPackageImpl extends EPackageImpl implements IssuesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass issueModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass issueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textIssueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum issueStatusEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum issuePriorityEnumEEnum = null;

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
	 * @see edu.kit.ipd.sdq.toometa.issues.IssuesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IssuesPackageImpl() {
		super(eNS_URI, IssuesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link IssuesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IssuesPackage init() {
		if (isInited) return (IssuesPackage)EPackage.Registry.INSTANCE.getEPackage(IssuesPackage.eNS_URI);

		// Obtain or create and register package
		IssuesPackageImpl theIssuesPackage = (IssuesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IssuesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IssuesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		RelationsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theIssuesPackage.createPackageContents();

		// Initialize created meta-data
		theIssuesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIssuesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IssuesPackage.eNS_URI, theIssuesPackage);
		return theIssuesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIssueModel() {
		return issueModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIssueModel_Issues() {
		return (EReference)issueModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIssue() {
		return issueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIssue_Summary() {
		return (EAttribute)issueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIssue_Description() {
		return (EAttribute)issueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIssue_Status() {
		return (EAttribute)issueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIssue_Priority() {
		return (EAttribute)issueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextIssue() {
		return textIssueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIssueStatusEnum() {
		return issueStatusEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIssuePriorityEnum() {
		return issuePriorityEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssuesFactory getIssuesFactory() {
		return (IssuesFactory)getEFactoryInstance();
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
		issueModelEClass = createEClass(ISSUE_MODEL);
		createEReference(issueModelEClass, ISSUE_MODEL__ISSUES);

		issueEClass = createEClass(ISSUE);
		createEAttribute(issueEClass, ISSUE__SUMMARY);
		createEAttribute(issueEClass, ISSUE__DESCRIPTION);
		createEAttribute(issueEClass, ISSUE__STATUS);
		createEAttribute(issueEClass, ISSUE__PRIORITY);

		textIssueEClass = createEClass(TEXT_ISSUE);

		// Create enums
		issueStatusEnumEEnum = createEEnum(ISSUE_STATUS_ENUM);
		issuePriorityEnumEEnum = createEEnum(ISSUE_PRIORITY_ENUM);
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
		RelationsPackage theRelationsPackage = (RelationsPackage)EPackage.Registry.INSTANCE.getEPackage(RelationsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		issueModelEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		issueEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		issueEClass.getESuperTypes().add(theRelationsPackage.getTraceableObject());
		textIssueEClass.getESuperTypes().add(this.getIssue());

		// Initialize classes and features; add operations and parameters
		initEClass(issueModelEClass, IssueModel.class, "IssueModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIssueModel_Issues(), this.getIssue(), null, "issues", null, 0, -1, IssueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(issueEClass, Issue.class, "Issue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIssue_Summary(), ecorePackage.getEString(), "summary", null, 1, 1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIssue_Description(), ecorePackage.getEString(), "description", null, 1, 1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIssue_Status(), this.getIssueStatusEnum(), "status", null, 0, 1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIssue_Priority(), this.getIssuePriorityEnum(), "priority", "Major", 0, 1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textIssueEClass, TextIssue.class, "TextIssue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(issueStatusEnumEEnum, IssueStatusEnum.class, "IssueStatusEnum");
		addEEnumLiteral(issueStatusEnumEEnum, IssueStatusEnum.NEW);
		addEEnumLiteral(issueStatusEnumEEnum, IssueStatusEnum.ACCEPTED);
		addEEnumLiteral(issueStatusEnumEEnum, IssueStatusEnum.REJECTED);
		addEEnumLiteral(issueStatusEnumEEnum, IssueStatusEnum.IN_PROCESS);
		addEEnumLiteral(issueStatusEnumEEnum, IssueStatusEnum.RESOLVED);
		addEEnumLiteral(issueStatusEnumEEnum, IssueStatusEnum.CLOSED);
		addEEnumLiteral(issueStatusEnumEEnum, IssueStatusEnum.REOPENED);
		addEEnumLiteral(issueStatusEnumEEnum, IssueStatusEnum.REPLACED);

		initEEnum(issuePriorityEnumEEnum, IssuePriorityEnum.class, "IssuePriorityEnum");
		addEEnumLiteral(issuePriorityEnumEEnum, IssuePriorityEnum.TRIVIAL);
		addEEnumLiteral(issuePriorityEnumEEnum, IssuePriorityEnum.MINOR);
		addEEnumLiteral(issuePriorityEnumEEnum, IssuePriorityEnum.MAJOR);
		addEEnumLiteral(issuePriorityEnumEEnum, IssuePriorityEnum.CRITICAL);
		addEEnumLiteral(issuePriorityEnumEEnum, IssuePriorityEnum.BLOCKER);

		// Create resource
		createResource(eNS_URI);
	}

} //IssuesPackageImpl
