/**
 */
package edu.kit.ipd.sdq.toometa.patterns.util;

import de.uka.ipd.sdq.identifier.Identifier;

import edu.kit.ipd.sdq.toometa.effects.Effect;
import edu.kit.ipd.sdq.toometa.effects.QualityEffect;

import edu.kit.ipd.sdq.toometa.patterns.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.toometa.patterns.PatternsPackage
 * @generated
 */
public class PatternsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PatternsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternsSwitch() {
		if (modelPackage == null) {
			modelPackage = PatternsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PatternsPackage.CATEGORY: {
				Category category = (Category)theEObject;
				T result = caseCategory(category);
				if (result == null) result = caseIdentifier(category);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.ROLE: {
				Role role = (Role)theEObject;
				T result = caseRole(role);
				if (result == null) result = caseIdentifier(role);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.CO_USAGE: {
				CoUsage coUsage = (CoUsage)theEObject;
				T result = caseCoUsage(coUsage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.PATTERN_RELATIONS: {
				PatternRelations patternRelations = (PatternRelations)theEObject;
				T result = casePatternRelations(patternRelations);
				if (result == null) result = caseSimilar(patternRelations);
				if (result == null) result = caseExclusion(patternRelations);
				if (result == null) result = caseCoUsage(patternRelations);
				if (result == null) result = caseAlternative(patternRelations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.GENERAL_PATTERN_DESCRIPTION: {
				GeneralPatternDescription generalPatternDescription = (GeneralPatternDescription)theEObject;
				T result = caseGeneralPatternDescription(generalPatternDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.EXCLUSION: {
				Exclusion exclusion = (Exclusion)theEObject;
				T result = caseExclusion(exclusion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.ALTERNATIVE: {
				Alternative alternative = (Alternative)theEObject;
				T result = caseAlternative(alternative);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.SIMILAR: {
				Similar similar = (Similar)theEObject;
				T result = caseSimilar(similar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.PATTERN_VARIANT: {
				PatternVariant patternVariant = (PatternVariant)theEObject;
				T result = casePatternVariant(patternVariant);
				if (result == null) result = casePattern(patternVariant);
				if (result == null) result = caseIdentifier(patternVariant);
				if (result == null) result = caseGeneralPatternDescription(patternVariant);
				if (result == null) result = caseQuestionAnnotations(patternVariant);
				if (result == null) result = caseArchitecturalStructure(patternVariant);
				if (result == null) result = casePatternRelations(patternVariant);
				if (result == null) result = caseSimilar(patternVariant);
				if (result == null) result = caseExclusion(patternVariant);
				if (result == null) result = caseCoUsage(patternVariant);
				if (result == null) result = caseAlternative(patternVariant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.ARCHITECTURAL_STRUCTURE: {
				ArchitecturalStructure architecturalStructure = (ArchitecturalStructure)theEObject;
				T result = caseArchitecturalStructure(architecturalStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.QUESTION_ANNOTATIONS: {
				QuestionAnnotations questionAnnotations = (QuestionAnnotations)theEObject;
				T result = caseQuestionAnnotations(questionAnnotations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.PATTERN: {
				Pattern pattern = (Pattern)theEObject;
				T result = casePattern(pattern);
				if (result == null) result = caseIdentifier(pattern);
				if (result == null) result = caseGeneralPatternDescription(pattern);
				if (result == null) result = caseQuestionAnnotations(pattern);
				if (result == null) result = caseArchitecturalStructure(pattern);
				if (result == null) result = casePatternRelations(pattern);
				if (result == null) result = caseSimilar(pattern);
				if (result == null) result = caseExclusion(pattern);
				if (result == null) result = caseCoUsage(pattern);
				if (result == null) result = caseAlternative(pattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.DOMAIN_TYPE: {
				DomainType domainType = (DomainType)theEObject;
				T result = caseDomainType(domainType);
				if (result == null) result = caseIdentifier(domainType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = caseIdentifier(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.QUALITY_INFLUENCE: {
				QualityInfluence qualityInfluence = (QualityInfluence)theEObject;
				T result = caseQualityInfluence(qualityInfluence);
				if (result == null) result = caseProperty(qualityInfluence);
				if (result == null) result = caseQualityEffect(qualityInfluence);
				if (result == null) result = caseEffect(qualityInfluence);
				if (result == null) result = caseIdentifier(qualityInfluence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.PATTERN_CATALOGUE: {
				PatternCatalogue patternCatalogue = (PatternCatalogue)theEObject;
				T result = casePatternCatalogue(patternCatalogue);
				if (result == null) result = caseIdentifier(patternCatalogue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.INFRASTRUCTURE_TYPE: {
				InfrastructureType infrastructureType = (InfrastructureType)theEObject;
				T result = caseInfrastructureType(infrastructureType);
				if (result == null) result = caseIdentifier(infrastructureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.CONNECTOR: {
				Connector connector = (Connector)theEObject;
				T result = caseConnector(connector);
				if (result == null) result = caseIdentifier(connector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.DRAWBACK: {
				Drawback drawback = (Drawback)theEObject;
				T result = caseDrawback(drawback);
				if (result == null) result = caseProperty(drawback);
				if (result == null) result = caseIdentifier(drawback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.KEYWORD: {
				Keyword keyword = (Keyword)theEObject;
				T result = caseKeyword(keyword);
				if (result == null) result = caseProperty(keyword);
				if (result == null) result = caseIdentifier(keyword);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternsPackage.GOAL: {
				Goal goal = (Goal)theEObject;
				T result = caseGoal(goal);
				if (result == null) result = caseProperty(goal);
				if (result == null) result = caseIdentifier(goal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategory(Category object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Co Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Co Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoUsage(CoUsage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Relations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Relations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatternRelations(PatternRelations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Pattern Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Pattern Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralPatternDescription(GeneralPatternDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exclusion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exclusion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExclusion(Exclusion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alternative</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alternative</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlternative(Alternative object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Similar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Similar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimilar(Similar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Variant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Variant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatternVariant(PatternVariant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Architectural Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Architectural Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchitecturalStructure(ArchitecturalStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Question Annotations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Question Annotations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionAnnotations(QuestionAnnotations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern(Pattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainType(DomainType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quality Influence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quality Influence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualityInfluence(QualityInfluence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Catalogue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Catalogue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatternCatalogue(PatternCatalogue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Infrastructure Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Infrastructure Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfrastructureType(InfrastructureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnector(Connector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drawback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drawback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDrawback(Drawback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Keyword</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Keyword</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyword(Keyword object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoal(Goal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifier(Identifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Effect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Effect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEffect(Effect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quality Effect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quality Effect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualityEffect(QualityEffect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PatternsSwitch
