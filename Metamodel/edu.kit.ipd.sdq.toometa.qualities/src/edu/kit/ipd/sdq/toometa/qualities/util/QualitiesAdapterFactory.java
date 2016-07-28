/**
 */
package edu.kit.ipd.sdq.toometa.qualities.util;

import de.uka.ipd.sdq.identifier.Identifier;

import edu.kit.ipd.sdq.toometa.qualities.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.toometa.qualities.QualitiesPackage
 * @generated
 */
public class QualitiesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QualitiesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualitiesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = QualitiesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualitiesSwitch<Adapter> modelSwitch =
		new QualitiesSwitch<Adapter>() {
			@Override
			public Adapter caseReliabilityCompliance(ReliabilityCompliance object) {
				return createReliabilityComplianceAdapter();
			}
			@Override
			public Adapter caseInstallability(Installability object) {
				return createInstallabilityAdapter();
			}
			@Override
			public Adapter caseReliability(Reliability object) {
				return createReliabilityAdapter();
			}
			@Override
			public Adapter caseCoExistence(CoExistence object) {
				return createCoExistenceAdapter();
			}
			@Override
			public Adapter caseOperability(Operability object) {
				return createOperabilityAdapter();
			}
			@Override
			public Adapter caseStability(Stability object) {
				return createStabilityAdapter();
			}
			@Override
			public Adapter caseMaintainabilityCompliance(MaintainabilityCompliance object) {
				return createMaintainabilityComplianceAdapter();
			}
			@Override
			public Adapter casePortability(Portability object) {
				return createPortabilityAdapter();
			}
			@Override
			public Adapter caseMaintainability(Maintainability object) {
				return createMaintainabilityAdapter();
			}
			@Override
			public Adapter caseMaturity(Maturity object) {
				return createMaturityAdapter();
			}
			@Override
			public Adapter caseAttractiveness(Attractiveness object) {
				return createAttractivenessAdapter();
			}
			@Override
			public Adapter caseAnalyzability(Analyzability object) {
				return createAnalyzabilityAdapter();
			}
			@Override
			public Adapter caseReplaceability(Replaceability object) {
				return createReplaceabilityAdapter();
			}
			@Override
			public Adapter caseRecoverability(Recoverability object) {
				return createRecoverabilityAdapter();
			}
			@Override
			public Adapter caseUnderstandability(Understandability object) {
				return createUnderstandabilityAdapter();
			}
			@Override
			public Adapter casePortabilityCompliance(PortabilityCompliance object) {
				return createPortabilityComplianceAdapter();
			}
			@Override
			public Adapter caseRessourceUtilization(RessourceUtilization object) {
				return createRessourceUtilizationAdapter();
			}
			@Override
			public Adapter caseChangeability(Changeability object) {
				return createChangeabilityAdapter();
			}
			@Override
			public Adapter caseInteroperability(Interoperability object) {
				return createInteroperabilityAdapter();
			}
			@Override
			public Adapter caseFaultTolerance(FaultTolerance object) {
				return createFaultToleranceAdapter();
			}
			@Override
			public Adapter caseQualityTypeRepository(QualityTypeRepository object) {
				return createQualityTypeRepositoryAdapter();
			}
			@Override
			public Adapter caseAdaptability(Adaptability object) {
				return createAdaptabilityAdapter();
			}
			@Override
			public Adapter caseFunctionality(Functionality object) {
				return createFunctionalityAdapter();
			}
			@Override
			public Adapter caseTimeBehaviour(TimeBehaviour object) {
				return createTimeBehaviourAdapter();
			}
			@Override
			public Adapter caseSecurity(Security object) {
				return createSecurityAdapter();
			}
			@Override
			public Adapter caseAccuracy(Accuracy object) {
				return createAccuracyAdapter();
			}
			@Override
			public Adapter caseFunctionalityCompliance(FunctionalityCompliance object) {
				return createFunctionalityComplianceAdapter();
			}
			@Override
			public Adapter caseEfficiency(Efficiency object) {
				return createEfficiencyAdapter();
			}
			@Override
			public Adapter caseSafety(Safety object) {
				return createSafetyAdapter();
			}
			@Override
			public Adapter caseEfficiencyCompliance(EfficiencyCompliance object) {
				return createEfficiencyComplianceAdapter();
			}
			@Override
			public Adapter caseSuitability(Suitability object) {
				return createSuitabilityAdapter();
			}
			@Override
			public Adapter caseLearnability(Learnability object) {
				return createLearnabilityAdapter();
			}
			@Override
			public Adapter caseQualityType(QualityType object) {
				return createQualityTypeAdapter();
			}
			@Override
			public Adapter caseUsability(Usability object) {
				return createUsabilityAdapter();
			}
			@Override
			public Adapter casePerformance(Performance object) {
				return createPerformanceAdapter();
			}
			@Override
			public Adapter caseTestability(Testability object) {
				return createTestabilityAdapter();
			}
			@Override
			public Adapter caseUsabilityCompliance(UsabilityCompliance object) {
				return createUsabilityComplianceAdapter();
			}
			@Override
			public Adapter caseTextQuality(TextQuality object) {
				return createTextQualityAdapter();
			}
			@Override
			public Adapter caseIdentifier(Identifier object) {
				return createIdentifierAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.qualities.ReliabilityCompliance <em>Reliability Compliance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.qualities.ReliabilityCompliance
	 * @generated
	 */
	public Adapter createReliabilityComplianceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.qualities.Installability <em>Installability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.qualities.Installability
	 * @generated
	 */
	public Adapter createInstallabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.qualities.Reliability <em>Reliability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.qualities.Reliability
	 * @generated
	 */
	public Adapter createReliabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.qualities.CoExistence <em>Co Existence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.qualities.CoExistence
	 * @generated
	 */
	public Adapter createCoExistenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.qualities.Operability <em>Operability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.qualities.Operability
	 * @generated
	 */
	public Adapter createOperabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.qualities.Stability <em>Stability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.qualities.Stability
	 * @generated
	 */
	public Adapter createStabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.qualities.MaintainabilityCompliance <em>Maintainability Compliance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.qualities.MaintainabilityCompliance
	 * @generated
	 */
	public Adapter createMaintainabilityComplianceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.qualities.Portability <em>Portability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.qualities.Portability
	 * @generated
	 */
	public Adapter createPortabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.qualities.Maintainability <em>Maintainability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.qualities.Maintainability
	 * @generated
	 */
	public Adapter createMaintainabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.qualities.Maturity <em>Maturity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.qualities.Maturity
	 * @generated
	 */
	public Adapter createMaturityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.qualities.Attractiveness <em>Attractiveness</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.qualities.Attractiveness
	 * @generated
	 */
	public Adapter createAttractivenessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.qualities.Analyzability <em>Analyzability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.qualities.Analyzability
	 * @generated
	 */
	public Adapter createAnalyzabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.qualities.Replaceability <em>Replaceability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.qualities.Replaceability
	 * @generated
	 */
	public Adapter createReplaceabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.qualities.Recoverability <em>Recoverability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.qualities.Recoverability
	 * @generated
	 */
	public Adapter createRecoverabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.qualities.Understandability <em>Understandability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.qualities.Understandability
	 * @generated
	 */
	public Adapter createUnderstandabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.qualities.PortabilityCompliance <em>Portability Compliance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.qualities.PortabilityCompliance
	 * @generated
	 */
	public Adapter createPortabilityComplianceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.qualities.RessourceUtilization <em>Ressource Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.qualities.RessourceUtilization
	 * @generated
	 */
	public Adapter createRessourceUtilizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.qualities.Changeability <em>Changeability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.qualities.Changeability
	 * @generated
	 */
	public Adapter createChangeabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.qualities.Interoperability <em>Interoperability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.qualities.Interoperability
	 * @generated
	 */
	public Adapter createInteroperabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.qualities.FaultTolerance <em>Fault Tolerance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.qualities.FaultTolerance
	 * @generated
	 */
	public Adapter createFaultToleranceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.qualities.QualityTypeRepository <em>Quality Type Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.qualities.QualityTypeRepository
	 * @generated
	 */
	public Adapter createQualityTypeRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.qualities.Adaptability <em>Adaptability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.qualities.Adaptability
	 * @generated
	 */
	public Adapter createAdaptabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.qualities.Functionality <em>Functionality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.qualities.Functionality
	 * @generated
	 */
	public Adapter createFunctionalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.qualities.TimeBehaviour <em>Time Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.qualities.TimeBehaviour
	 * @generated
	 */
	public Adapter createTimeBehaviourAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.qualities.Security <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.qualities.Security
	 * @generated
	 */
	public Adapter createSecurityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.qualities.Accuracy <em>Accuracy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.qualities.Accuracy
	 * @generated
	 */
	public Adapter createAccuracyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.qualities.FunctionalityCompliance <em>Functionality Compliance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.qualities.FunctionalityCompliance
	 * @generated
	 */
	public Adapter createFunctionalityComplianceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.qualities.Efficiency <em>Efficiency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.qualities.Efficiency
	 * @generated
	 */
	public Adapter createEfficiencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.qualities.Safety <em>Safety</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.qualities.Safety
	 * @generated
	 */
	public Adapter createSafetyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.qualities.EfficiencyCompliance <em>Efficiency Compliance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.qualities.EfficiencyCompliance
	 * @generated
	 */
	public Adapter createEfficiencyComplianceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.qualities.Suitability <em>Suitability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.qualities.Suitability
	 * @generated
	 */
	public Adapter createSuitabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.qualities.Learnability <em>Learnability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.qualities.Learnability
	 * @generated
	 */
	public Adapter createLearnabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.qualities.QualityType <em>Quality Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.qualities.QualityType
	 * @generated
	 */
	public Adapter createQualityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.qualities.Usability <em>Usability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.qualities.Usability
	 * @generated
	 */
	public Adapter createUsabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.qualities.Performance <em>Performance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.qualities.Performance
	 * @generated
	 */
	public Adapter createPerformanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.qualities.Testability <em>Testability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.qualities.Testability
	 * @generated
	 */
	public Adapter createTestabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.qualities.UsabilityCompliance <em>Usability Compliance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.qualities.UsabilityCompliance
	 * @generated
	 */
	public Adapter createUsabilityComplianceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.qualities.TextQuality <em>Text Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.qualities.TextQuality
	 * @generated
	 */
	public Adapter createTextQualityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.identifier.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.identifier.Identifier
	 * @generated
	 */
	public Adapter createIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //QualitiesAdapterFactory
