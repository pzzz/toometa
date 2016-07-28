/**
 */
package edu.kit.ipd.sdq.toometa.patterns.patterninstances.impl;

import edu.kit.ipd.sdq.toometa.patterns.patterninstances.*;

import org.eclipse.emf.ecore.EClass;
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
public class PatterninstancesFactoryImpl extends EFactoryImpl implements PatterninstancesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PatterninstancesFactory init() {
		try {
			PatterninstancesFactory thePatterninstancesFactory = (PatterninstancesFactory)EPackage.Registry.INSTANCE.getEFactory(PatterninstancesPackage.eNS_URI);
			if (thePatterninstancesFactory != null) {
				return thePatterninstancesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PatterninstancesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatterninstancesFactoryImpl() {
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
			case PatterninstancesPackage.PATTERN_INSTANCE: return (EObject)createPatternInstance();
			case PatterninstancesPackage.PATTERN_INSTANCE_REPOSITORY: return (EObject)createPatternInstanceRepository();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternInstance createPatternInstance() {
		PatternInstanceImpl patternInstance = new PatternInstanceImpl();
		return patternInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternInstanceRepository createPatternInstanceRepository() {
		PatternInstanceRepositoryImpl patternInstanceRepository = new PatternInstanceRepositoryImpl();
		return patternInstanceRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatterninstancesPackage getPatterninstancesPackage() {
		return (PatterninstancesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PatterninstancesPackage getPackage() {
		return PatterninstancesPackage.eINSTANCE;
	}

} //PatterninstancesFactoryImpl
