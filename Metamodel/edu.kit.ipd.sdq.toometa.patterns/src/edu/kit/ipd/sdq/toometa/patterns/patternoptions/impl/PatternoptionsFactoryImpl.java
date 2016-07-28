/**
 */
package edu.kit.ipd.sdq.toometa.patterns.patternoptions.impl;

import edu.kit.ipd.sdq.toometa.patterns.patternoptions.*;

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
public class PatternoptionsFactoryImpl extends EFactoryImpl implements PatternoptionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PatternoptionsFactory init() {
		try {
			PatternoptionsFactory thePatternoptionsFactory = (PatternoptionsFactory)EPackage.Registry.INSTANCE.getEFactory(PatternoptionsPackage.eNS_URI);
			if (thePatternoptionsFactory != null) {
				return thePatternoptionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PatternoptionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternoptionsFactoryImpl() {
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
			case PatternoptionsPackage.PATTERN_RATIONALE: return (EObject)createPatternRationale();
			case PatternoptionsPackage.ANSWER: return (EObject)createAnswer();
			case PatternoptionsPackage.PATTERN_OPTION: return (EObject)createPatternOption();
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
			case PatternoptionsPackage.ADM_ANSWER_TYPE_ENUM:
				return createADMAnswerTypeEnumFromString(eDataType, initialValue);
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
			case PatternoptionsPackage.ADM_ANSWER_TYPE_ENUM:
				return convertADMAnswerTypeEnumToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternRationale createPatternRationale() {
		PatternRationaleImpl patternRationale = new PatternRationaleImpl();
		return patternRationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Answer createAnswer() {
		AnswerImpl answer = new AnswerImpl();
		return answer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternOption createPatternOption() {
		PatternOptionImpl patternOption = new PatternOptionImpl();
		return patternOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADMAnswerTypeEnum createADMAnswerTypeEnumFromString(EDataType eDataType, String initialValue) {
		ADMAnswerTypeEnum result = ADMAnswerTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertADMAnswerTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternoptionsPackage getPatternoptionsPackage() {
		return (PatternoptionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PatternoptionsPackage getPackage() {
		return PatternoptionsPackage.eINSTANCE;
	}

} //PatternoptionsFactoryImpl
