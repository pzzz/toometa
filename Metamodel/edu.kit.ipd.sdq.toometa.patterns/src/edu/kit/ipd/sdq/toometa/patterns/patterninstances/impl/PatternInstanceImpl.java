/**
 */
package edu.kit.ipd.sdq.toometa.patterns.patterninstances.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import edu.kit.ipd.sdq.toometa.patterns.patterninstances.ConnectorInstance;
import edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatternInstance;
import edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatternInstanceRepository;
import edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatterninstancesPackage;
import edu.kit.ipd.sdq.toometa.patterns.patterninstances.RoleInstance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.patterninstances.impl.PatternInstanceImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.patterninstances.impl.PatternInstanceImpl#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.patterninstances.impl.PatternInstanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.patterninstances.impl.PatternInstanceImpl#getArchitecturalLevel <em>Architectural Level</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.patterninstances.impl.PatternInstanceImpl#getRepository <em>Repository</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatternInstanceImpl extends IdentifierImpl implements PatternInstance {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatterninstancesPackage.Literals.PATTERN_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<RoleInstance> getRoles() {
		return (EList<RoleInstance>)eGet(PatterninstancesPackage.Literals.PATTERN_INSTANCE__ROLES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ConnectorInstance> getConnectors() {
		return (EList<ConnectorInstance>)eGet(PatterninstancesPackage.Literals.PATTERN_INSTANCE__CONNECTORS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(PatterninstancesPackage.Literals.PATTERN_INSTANCE__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(PatterninstancesPackage.Literals.PATTERN_INSTANCE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getArchitecturalLevel() {
		return (Integer)eGet(PatterninstancesPackage.Literals.PATTERN_INSTANCE__ARCHITECTURAL_LEVEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchitecturalLevel(int newArchitecturalLevel) {
		eSet(PatterninstancesPackage.Literals.PATTERN_INSTANCE__ARCHITECTURAL_LEVEL, newArchitecturalLevel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternInstanceRepository getRepository() {
		return (PatternInstanceRepository)eGet(PatterninstancesPackage.Literals.PATTERN_INSTANCE__REPOSITORY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepository(PatternInstanceRepository newRepository) {
		eSet(PatterninstancesPackage.Literals.PATTERN_INSTANCE__REPOSITORY, newRepository);
	}

} //PatternInstanceImpl
