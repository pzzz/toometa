/**
 */
package edu.kit.ipd.sdq.toometa.patterns.patterninstances.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatternInstance;
import edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatternInstanceRepository;
import edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatterninstancesPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Instance Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.patterninstances.impl.PatternInstanceRepositoryImpl#getSolutionInstances <em>Solution Instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatternInstanceRepositoryImpl extends IdentifierImpl implements PatternInstanceRepository {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternInstanceRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatterninstancesPackage.Literals.PATTERN_INSTANCE_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PatternInstance> getSolutionInstances() {
		return (EList<PatternInstance>)eGet(PatterninstancesPackage.Literals.PATTERN_INSTANCE_REPOSITORY__SOLUTION_INSTANCES, true);
	}

} //PatternInstanceRepositoryImpl
