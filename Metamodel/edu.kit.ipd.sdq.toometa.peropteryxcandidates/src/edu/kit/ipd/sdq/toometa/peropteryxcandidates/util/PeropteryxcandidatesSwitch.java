/**
 */
package edu.kit.ipd.sdq.toometa.peropteryxcandidates.util;

import de.uka.ipd.sdq.identifier.Identifier;

import edu.kit.ipd.sdq.toometa.archoptions.ArchCandidate;
import edu.kit.ipd.sdq.toometa.archoptions.ArchOption;

import edu.kit.ipd.sdq.toometa.options.Option;

import edu.kit.ipd.sdq.toometa.peropteryxcandidates.*;

import edu.kit.ipd.sdq.toometa.relations.AlternativeObject;
import edu.kit.ipd.sdq.toometa.relations.ConflictObject;
import edu.kit.ipd.sdq.toometa.relations.CouldResolveObject;
import edu.kit.ipd.sdq.toometa.relations.DependencyObject;
import edu.kit.ipd.sdq.toometa.relations.DuplicationObject;
import edu.kit.ipd.sdq.toometa.relations.ParentalObject;
import edu.kit.ipd.sdq.toometa.relations.RelationObject;
import edu.kit.ipd.sdq.toometa.relations.ResolveObject;
import edu.kit.ipd.sdq.toometa.relations.SelectionObject;
import edu.kit.ipd.sdq.toometa.relations.StakeholderObject;
import edu.kit.ipd.sdq.toometa.relations.TraceableObject;
import edu.kit.ipd.sdq.toometa.relations.TriggerObject;

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
 * @see edu.kit.ipd.sdq.toometa.peropteryxcandidates.PeropteryxcandidatesPackage
 * @generated
 */
public class PeropteryxcandidatesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PeropteryxcandidatesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeropteryxcandidatesSwitch() {
		if (modelPackage == null) {
			modelPackage = PeropteryxcandidatesPackage.eINSTANCE;
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
			case PeropteryxcandidatesPackage.PER_OPTERYX_CANDIDATE: {
				PerOpteryxCandidate perOpteryxCandidate = (PerOpteryxCandidate)theEObject;
				T result = casePerOpteryxCandidate(perOpteryxCandidate);
				if (result == null) result = caseArchCandidate(perOpteryxCandidate);
				if (result == null) result = caseArchOption(perOpteryxCandidate);
				if (result == null) result = caseOption(perOpteryxCandidate);
				if (result == null) result = caseTraceableObject(perOpteryxCandidate);
				if (result == null) result = caseRelationObject(perOpteryxCandidate);
				if (result == null) result = caseConflictObject(perOpteryxCandidate);
				if (result == null) result = caseDuplicationObject(perOpteryxCandidate);
				if (result == null) result = caseDependencyObject(perOpteryxCandidate);
				if (result == null) result = caseParentalObject(perOpteryxCandidate);
				if (result == null) result = caseTriggerObject(perOpteryxCandidate);
				if (result == null) result = caseResolveObject(perOpteryxCandidate);
				if (result == null) result = caseAlternativeObject(perOpteryxCandidate);
				if (result == null) result = caseCouldResolveObject(perOpteryxCandidate);
				if (result == null) result = caseStakeholderObject(perOpteryxCandidate);
				if (result == null) result = caseSelectionObject(perOpteryxCandidate);
				if (result == null) result = caseIdentifier(perOpteryxCandidate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PeropteryxcandidatesPackage.PREDICTED_QUALITY_VALUE: {
				PredictedQualityValue predictedQualityValue = (PredictedQualityValue)theEObject;
				T result = casePredictedQualityValue(predictedQualityValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PeropteryxcandidatesPackage.PER_OPTERYX_OPTION: {
				PerOpteryxOption perOpteryxOption = (PerOpteryxOption)theEObject;
				T result = casePerOpteryxOption(perOpteryxOption);
				if (result == null) result = caseArchOption(perOpteryxOption);
				if (result == null) result = caseOption(perOpteryxOption);
				if (result == null) result = caseTraceableObject(perOpteryxOption);
				if (result == null) result = caseRelationObject(perOpteryxOption);
				if (result == null) result = caseConflictObject(perOpteryxOption);
				if (result == null) result = caseDuplicationObject(perOpteryxOption);
				if (result == null) result = caseDependencyObject(perOpteryxOption);
				if (result == null) result = caseParentalObject(perOpteryxOption);
				if (result == null) result = caseTriggerObject(perOpteryxOption);
				if (result == null) result = caseResolveObject(perOpteryxOption);
				if (result == null) result = caseAlternativeObject(perOpteryxOption);
				if (result == null) result = caseCouldResolveObject(perOpteryxOption);
				if (result == null) result = caseStakeholderObject(perOpteryxOption);
				if (result == null) result = caseSelectionObject(perOpteryxOption);
				if (result == null) result = caseIdentifier(perOpteryxOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PeropteryxcandidatesPackage.PER_OPTERYX_DISCRETE_RANGE_OPTION: {
				PerOpteryxDiscreteRangeOption perOpteryxDiscreteRangeOption = (PerOpteryxDiscreteRangeOption)theEObject;
				T result = casePerOpteryxDiscreteRangeOption(perOpteryxDiscreteRangeOption);
				if (result == null) result = casePerOpteryxOption(perOpteryxDiscreteRangeOption);
				if (result == null) result = caseArchOption(perOpteryxDiscreteRangeOption);
				if (result == null) result = caseOption(perOpteryxDiscreteRangeOption);
				if (result == null) result = caseTraceableObject(perOpteryxDiscreteRangeOption);
				if (result == null) result = caseRelationObject(perOpteryxDiscreteRangeOption);
				if (result == null) result = caseConflictObject(perOpteryxDiscreteRangeOption);
				if (result == null) result = caseDuplicationObject(perOpteryxDiscreteRangeOption);
				if (result == null) result = caseDependencyObject(perOpteryxDiscreteRangeOption);
				if (result == null) result = caseParentalObject(perOpteryxDiscreteRangeOption);
				if (result == null) result = caseTriggerObject(perOpteryxDiscreteRangeOption);
				if (result == null) result = caseResolveObject(perOpteryxDiscreteRangeOption);
				if (result == null) result = caseAlternativeObject(perOpteryxDiscreteRangeOption);
				if (result == null) result = caseCouldResolveObject(perOpteryxDiscreteRangeOption);
				if (result == null) result = caseStakeholderObject(perOpteryxDiscreteRangeOption);
				if (result == null) result = caseSelectionObject(perOpteryxDiscreteRangeOption);
				if (result == null) result = caseIdentifier(perOpteryxDiscreteRangeOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PeropteryxcandidatesPackage.PER_OPTERYX_CONTINUOUS_RANGE_OPTION: {
				PerOpteryxContinuousRangeOption perOpteryxContinuousRangeOption = (PerOpteryxContinuousRangeOption)theEObject;
				T result = casePerOpteryxContinuousRangeOption(perOpteryxContinuousRangeOption);
				if (result == null) result = casePerOpteryxOption(perOpteryxContinuousRangeOption);
				if (result == null) result = caseArchOption(perOpteryxContinuousRangeOption);
				if (result == null) result = caseOption(perOpteryxContinuousRangeOption);
				if (result == null) result = caseTraceableObject(perOpteryxContinuousRangeOption);
				if (result == null) result = caseRelationObject(perOpteryxContinuousRangeOption);
				if (result == null) result = caseConflictObject(perOpteryxContinuousRangeOption);
				if (result == null) result = caseDuplicationObject(perOpteryxContinuousRangeOption);
				if (result == null) result = caseDependencyObject(perOpteryxContinuousRangeOption);
				if (result == null) result = caseParentalObject(perOpteryxContinuousRangeOption);
				if (result == null) result = caseTriggerObject(perOpteryxContinuousRangeOption);
				if (result == null) result = caseResolveObject(perOpteryxContinuousRangeOption);
				if (result == null) result = caseAlternativeObject(perOpteryxContinuousRangeOption);
				if (result == null) result = caseCouldResolveObject(perOpteryxContinuousRangeOption);
				if (result == null) result = caseStakeholderObject(perOpteryxContinuousRangeOption);
				if (result == null) result = caseSelectionObject(perOpteryxContinuousRangeOption);
				if (result == null) result = caseIdentifier(perOpteryxContinuousRangeOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PeropteryxcandidatesPackage.PER_OPTERYX_CLASS_OPTION: {
				PerOpteryxClassOption perOpteryxClassOption = (PerOpteryxClassOption)theEObject;
				T result = casePerOpteryxClassOption(perOpteryxClassOption);
				if (result == null) result = casePerOpteryxOption(perOpteryxClassOption);
				if (result == null) result = caseArchOption(perOpteryxClassOption);
				if (result == null) result = caseOption(perOpteryxClassOption);
				if (result == null) result = caseTraceableObject(perOpteryxClassOption);
				if (result == null) result = caseRelationObject(perOpteryxClassOption);
				if (result == null) result = caseConflictObject(perOpteryxClassOption);
				if (result == null) result = caseDuplicationObject(perOpteryxClassOption);
				if (result == null) result = caseDependencyObject(perOpteryxClassOption);
				if (result == null) result = caseParentalObject(perOpteryxClassOption);
				if (result == null) result = caseTriggerObject(perOpteryxClassOption);
				if (result == null) result = caseResolveObject(perOpteryxClassOption);
				if (result == null) result = caseAlternativeObject(perOpteryxClassOption);
				if (result == null) result = caseCouldResolveObject(perOpteryxClassOption);
				if (result == null) result = caseStakeholderObject(perOpteryxClassOption);
				if (result == null) result = caseSelectionObject(perOpteryxClassOption);
				if (result == null) result = caseIdentifier(perOpteryxClassOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Per Opteryx Candidate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Per Opteryx Candidate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerOpteryxCandidate(PerOpteryxCandidate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predicted Quality Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predicted Quality Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredictedQualityValue(PredictedQualityValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Per Opteryx Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Per Opteryx Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerOpteryxOption(PerOpteryxOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Per Opteryx Discrete Range Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Per Opteryx Discrete Range Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerOpteryxDiscreteRangeOption(PerOpteryxDiscreteRangeOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Per Opteryx Continuous Range Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Per Opteryx Continuous Range Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerOpteryxContinuousRangeOption(PerOpteryxContinuousRangeOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Per Opteryx Class Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Per Opteryx Class Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerOpteryxClassOption(PerOpteryxClassOption object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Relation Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationObject(RelationObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conflict Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conflict Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConflictObject(ConflictObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duplication Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duplication Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDuplicationObject(DuplicationObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependency Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependency Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependencyObject(DependencyObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parental Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parental Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParentalObject(ParentalObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriggerObject(TriggerObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resolve Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resolve Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResolveObject(ResolveObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alternative Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alternative Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlternativeObject(AlternativeObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Could Resolve Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Could Resolve Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCouldResolveObject(CouldResolveObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stakeholder Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stakeholder Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStakeholderObject(StakeholderObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selection Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selection Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectionObject(SelectionObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traceable Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traceable Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraceableObject(TraceableObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOption(Option object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arch Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arch Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchOption(ArchOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arch Candidate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arch Candidate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchCandidate(ArchCandidate object) {
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

} //PeropteryxcandidatesSwitch
