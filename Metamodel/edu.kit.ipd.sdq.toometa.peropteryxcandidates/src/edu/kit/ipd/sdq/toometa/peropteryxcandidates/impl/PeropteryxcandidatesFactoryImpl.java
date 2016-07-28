/**
 */
package edu.kit.ipd.sdq.toometa.peropteryxcandidates.impl;

import edu.kit.ipd.sdq.toometa.peropteryxcandidates.*;

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
public class PeropteryxcandidatesFactoryImpl extends EFactoryImpl implements PeropteryxcandidatesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PeropteryxcandidatesFactory init() {
		try {
			PeropteryxcandidatesFactory thePeropteryxcandidatesFactory = (PeropteryxcandidatesFactory)EPackage.Registry.INSTANCE.getEFactory(PeropteryxcandidatesPackage.eNS_URI);
			if (thePeropteryxcandidatesFactory != null) {
				return thePeropteryxcandidatesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PeropteryxcandidatesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeropteryxcandidatesFactoryImpl() {
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
			case PeropteryxcandidatesPackage.PER_OPTERYX_CANDIDATE: return (EObject)createPerOpteryxCandidate();
			case PeropteryxcandidatesPackage.PREDICTED_QUALITY_VALUE: return (EObject)createPredictedQualityValue();
			case PeropteryxcandidatesPackage.PER_OPTERYX_DISCRETE_RANGE_OPTION: return (EObject)createPerOpteryxDiscreteRangeOption();
			case PeropteryxcandidatesPackage.PER_OPTERYX_CONTINUOUS_RANGE_OPTION: return (EObject)createPerOpteryxContinuousRangeOption();
			case PeropteryxcandidatesPackage.PER_OPTERYX_CLASS_OPTION: return (EObject)createPerOpteryxClassOption();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerOpteryxCandidate createPerOpteryxCandidate() {
		PerOpteryxCandidateImpl perOpteryxCandidate = new PerOpteryxCandidateImpl();
		return perOpteryxCandidate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredictedQualityValue createPredictedQualityValue() {
		PredictedQualityValueImpl predictedQualityValue = new PredictedQualityValueImpl();
		return predictedQualityValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerOpteryxDiscreteRangeOption createPerOpteryxDiscreteRangeOption() {
		PerOpteryxDiscreteRangeOptionImpl perOpteryxDiscreteRangeOption = new PerOpteryxDiscreteRangeOptionImpl();
		return perOpteryxDiscreteRangeOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerOpteryxContinuousRangeOption createPerOpteryxContinuousRangeOption() {
		PerOpteryxContinuousRangeOptionImpl perOpteryxContinuousRangeOption = new PerOpteryxContinuousRangeOptionImpl();
		return perOpteryxContinuousRangeOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerOpteryxClassOption createPerOpteryxClassOption() {
		PerOpteryxClassOptionImpl perOpteryxClassOption = new PerOpteryxClassOptionImpl();
		return perOpteryxClassOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeropteryxcandidatesPackage getPeropteryxcandidatesPackage() {
		return (PeropteryxcandidatesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PeropteryxcandidatesPackage getPackage() {
		return PeropteryxcandidatesPackage.eINSTANCE;
	}

} //PeropteryxcandidatesFactoryImpl
