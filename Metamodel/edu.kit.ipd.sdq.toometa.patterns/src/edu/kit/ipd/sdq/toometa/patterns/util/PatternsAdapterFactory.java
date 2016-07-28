/**
 */
package edu.kit.ipd.sdq.toometa.patterns.util;

import de.uka.ipd.sdq.identifier.Identifier;

import edu.kit.ipd.sdq.toometa.effects.Effect;
import edu.kit.ipd.sdq.toometa.effects.QualityEffect;

import edu.kit.ipd.sdq.toometa.patterns.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.toometa.patterns.PatternsPackage
 * @generated
 */
public class PatternsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PatternsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PatternsPackage.eINSTANCE;
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
	protected PatternsSwitch<Adapter> modelSwitch =
		new PatternsSwitch<Adapter>() {
			@Override
			public Adapter caseCategory(Category object) {
				return createCategoryAdapter();
			}
			@Override
			public Adapter caseRole(Role object) {
				return createRoleAdapter();
			}
			@Override
			public Adapter caseCoUsage(CoUsage object) {
				return createCoUsageAdapter();
			}
			@Override
			public Adapter casePatternRelations(PatternRelations object) {
				return createPatternRelationsAdapter();
			}
			@Override
			public Adapter caseGeneralPatternDescription(GeneralPatternDescription object) {
				return createGeneralPatternDescriptionAdapter();
			}
			@Override
			public Adapter caseExclusion(Exclusion object) {
				return createExclusionAdapter();
			}
			@Override
			public Adapter caseAlternative(Alternative object) {
				return createAlternativeAdapter();
			}
			@Override
			public Adapter caseSimilar(Similar object) {
				return createSimilarAdapter();
			}
			@Override
			public Adapter casePatternVariant(PatternVariant object) {
				return createPatternVariantAdapter();
			}
			@Override
			public Adapter caseArchitecturalStructure(ArchitecturalStructure object) {
				return createArchitecturalStructureAdapter();
			}
			@Override
			public Adapter caseQuestionAnnotations(QuestionAnnotations object) {
				return createQuestionAnnotationsAdapter();
			}
			@Override
			public Adapter casePattern(Pattern object) {
				return createPatternAdapter();
			}
			@Override
			public Adapter caseDomainType(DomainType object) {
				return createDomainTypeAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseQualityInfluence(QualityInfluence object) {
				return createQualityInfluenceAdapter();
			}
			@Override
			public Adapter casePatternCatalogue(PatternCatalogue object) {
				return createPatternCatalogueAdapter();
			}
			@Override
			public Adapter caseInfrastructureType(InfrastructureType object) {
				return createInfrastructureTypeAdapter();
			}
			@Override
			public Adapter caseConnector(Connector object) {
				return createConnectorAdapter();
			}
			@Override
			public Adapter caseDrawback(Drawback object) {
				return createDrawbackAdapter();
			}
			@Override
			public Adapter caseKeyword(Keyword object) {
				return createKeywordAdapter();
			}
			@Override
			public Adapter caseGoal(Goal object) {
				return createGoalAdapter();
			}
			@Override
			public Adapter caseIdentifier(Identifier object) {
				return createIdentifierAdapter();
			}
			@Override
			public Adapter caseEffect(Effect object) {
				return createEffectAdapter();
			}
			@Override
			public Adapter caseQualityEffect(QualityEffect object) {
				return createQualityEffectAdapter();
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
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.patterns.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.patterns.Category
	 * @generated
	 */
	public Adapter createCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.patterns.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.patterns.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.patterns.CoUsage <em>Co Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.patterns.CoUsage
	 * @generated
	 */
	public Adapter createCoUsageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.patterns.PatternRelations <em>Pattern Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.patterns.PatternRelations
	 * @generated
	 */
	public Adapter createPatternRelationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.patterns.GeneralPatternDescription <em>General Pattern Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.patterns.GeneralPatternDescription
	 * @generated
	 */
	public Adapter createGeneralPatternDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.patterns.Exclusion <em>Exclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.patterns.Exclusion
	 * @generated
	 */
	public Adapter createExclusionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.patterns.Alternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.patterns.Alternative
	 * @generated
	 */
	public Adapter createAlternativeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.patterns.Similar <em>Similar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.patterns.Similar
	 * @generated
	 */
	public Adapter createSimilarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.patterns.PatternVariant <em>Pattern Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.patterns.PatternVariant
	 * @generated
	 */
	public Adapter createPatternVariantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.patterns.ArchitecturalStructure <em>Architectural Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.patterns.ArchitecturalStructure
	 * @generated
	 */
	public Adapter createArchitecturalStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.patterns.QuestionAnnotations <em>Question Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.patterns.QuestionAnnotations
	 * @generated
	 */
	public Adapter createQuestionAnnotationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.patterns.Pattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.patterns.Pattern
	 * @generated
	 */
	public Adapter createPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.patterns.DomainType <em>Domain Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.patterns.DomainType
	 * @generated
	 */
	public Adapter createDomainTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.patterns.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.patterns.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.patterns.QualityInfluence <em>Quality Influence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.patterns.QualityInfluence
	 * @generated
	 */
	public Adapter createQualityInfluenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.patterns.PatternCatalogue <em>Pattern Catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.patterns.PatternCatalogue
	 * @generated
	 */
	public Adapter createPatternCatalogueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.patterns.InfrastructureType <em>Infrastructure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.patterns.InfrastructureType
	 * @generated
	 */
	public Adapter createInfrastructureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.patterns.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.patterns.Connector
	 * @generated
	 */
	public Adapter createConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.patterns.Drawback <em>Drawback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.patterns.Drawback
	 * @generated
	 */
	public Adapter createDrawbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.patterns.Keyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.patterns.Keyword
	 * @generated
	 */
	public Adapter createKeywordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.patterns.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.patterns.Goal
	 * @generated
	 */
	public Adapter createGoalAdapter() {
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
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.effects.Effect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.effects.Effect
	 * @generated
	 */
	public Adapter createEffectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.effects.QualityEffect <em>Quality Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.effects.QualityEffect
	 * @generated
	 */
	public Adapter createQualityEffectAdapter() {
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

} //PatternsAdapterFactory
