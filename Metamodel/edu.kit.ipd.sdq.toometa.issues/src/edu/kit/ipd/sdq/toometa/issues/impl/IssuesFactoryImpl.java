/**
 */
package edu.kit.ipd.sdq.toometa.issues.impl;

import edu.kit.ipd.sdq.toometa.issues.*;

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
public class IssuesFactoryImpl extends EFactoryImpl implements IssuesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IssuesFactory init() {
		try {
			IssuesFactory theIssuesFactory = (IssuesFactory)EPackage.Registry.INSTANCE.getEFactory(IssuesPackage.eNS_URI);
			if (theIssuesFactory != null) {
				return theIssuesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IssuesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssuesFactoryImpl() {
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
			case IssuesPackage.ISSUE_MODEL: return (EObject)createIssueModel();
			case IssuesPackage.TEXT_ISSUE: return (EObject)createTextIssue();
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
			case IssuesPackage.ISSUE_STATUS_ENUM:
				return createIssueStatusEnumFromString(eDataType, initialValue);
			case IssuesPackage.ISSUE_PRIORITY_ENUM:
				return createIssuePriorityEnumFromString(eDataType, initialValue);
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
			case IssuesPackage.ISSUE_STATUS_ENUM:
				return convertIssueStatusEnumToString(eDataType, instanceValue);
			case IssuesPackage.ISSUE_PRIORITY_ENUM:
				return convertIssuePriorityEnumToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueModel createIssueModel() {
		IssueModelImpl issueModel = new IssueModelImpl();
		return issueModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextIssue createTextIssue() {
		TextIssueImpl textIssue = new TextIssueImpl();
		return textIssue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueStatusEnum createIssueStatusEnumFromString(EDataType eDataType, String initialValue) {
		IssueStatusEnum result = IssueStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIssueStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssuePriorityEnum createIssuePriorityEnumFromString(EDataType eDataType, String initialValue) {
		IssuePriorityEnum result = IssuePriorityEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIssuePriorityEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssuesPackage getIssuesPackage() {
		return (IssuesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IssuesPackage getPackage() {
		return IssuesPackage.eINSTANCE;
	}

} //IssuesFactoryImpl
