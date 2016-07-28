/**
 */
package edu.kit.ipd.sdq.toometa.patterns.patterninstances.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import edu.kit.ipd.sdq.toometa.patterns.Role;

import edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatterninstancesPackage;
import edu.kit.ipd.sdq.toometa.patterns.patterninstances.RoleInstance;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.patterninstances.impl.RoleInstanceImpl#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RoleInstanceImpl extends IdentifierImpl implements RoleInstance {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatterninstancesPackage.Literals.ROLE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getRole() {
		return (Role)eGet(PatterninstancesPackage.Literals.ROLE_INSTANCE__ROLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(Role newRole) {
		eSet(PatterninstancesPackage.Literals.ROLE_INSTANCE__ROLE, newRole);
	}

} //RoleInstanceImpl
