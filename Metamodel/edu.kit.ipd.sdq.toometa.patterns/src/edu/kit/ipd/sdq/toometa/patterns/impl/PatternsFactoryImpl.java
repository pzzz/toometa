/**
 */
package edu.kit.ipd.sdq.toometa.patterns.impl;

import edu.kit.ipd.sdq.toometa.patterns.*;

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
public class PatternsFactoryImpl extends EFactoryImpl implements PatternsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PatternsFactory init() {
		try {
			PatternsFactory thePatternsFactory = (PatternsFactory)EPackage.Registry.INSTANCE.getEFactory(PatternsPackage.eNS_URI);
			if (thePatternsFactory != null) {
				return thePatternsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PatternsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternsFactoryImpl() {
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
			case PatternsPackage.CATEGORY: return (EObject)createCategory();
			case PatternsPackage.ROLE: return (EObject)createRole();
			case PatternsPackage.PATTERN_VARIANT: return (EObject)createPatternVariant();
			case PatternsPackage.PATTERN: return (EObject)createPattern();
			case PatternsPackage.DOMAIN_TYPE: return (EObject)createDomainType();
			case PatternsPackage.QUALITY_INFLUENCE: return (EObject)createQualityInfluence();
			case PatternsPackage.PATTERN_CATALOGUE: return (EObject)createPatternCatalogue();
			case PatternsPackage.INFRASTRUCTURE_TYPE: return (EObject)createInfrastructureType();
			case PatternsPackage.CONNECTOR: return (EObject)createConnector();
			case PatternsPackage.DRAWBACK: return (EObject)createDrawback();
			case PatternsPackage.KEYWORD: return (EObject)createKeyword();
			case PatternsPackage.GOAL: return (EObject)createGoal();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category createCategory() {
		CategoryImpl category = new CategoryImpl();
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternVariant createPatternVariant() {
		PatternVariantImpl patternVariant = new PatternVariantImpl();
		return patternVariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern createPattern() {
		PatternImpl pattern = new PatternImpl();
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainType createDomainType() {
		DomainTypeImpl domainType = new DomainTypeImpl();
		return domainType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityInfluence createQualityInfluence() {
		QualityInfluenceImpl qualityInfluence = new QualityInfluenceImpl();
		return qualityInfluence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternCatalogue createPatternCatalogue() {
		PatternCatalogueImpl patternCatalogue = new PatternCatalogueImpl();
		return patternCatalogue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureType createInfrastructureType() {
		InfrastructureTypeImpl infrastructureType = new InfrastructureTypeImpl();
		return infrastructureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Drawback createDrawback() {
		DrawbackImpl drawback = new DrawbackImpl();
		return drawback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Keyword createKeyword() {
		KeywordImpl keyword = new KeywordImpl();
		return keyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal createGoal() {
		GoalImpl goal = new GoalImpl();
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternsPackage getPatternsPackage() {
		return (PatternsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PatternsPackage getPackage() {
		return PatternsPackage.eINSTANCE;
	}

} //PatternsFactoryImpl
