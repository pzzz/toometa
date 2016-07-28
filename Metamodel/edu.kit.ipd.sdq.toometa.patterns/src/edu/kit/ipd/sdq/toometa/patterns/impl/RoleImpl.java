/**
 */
package edu.kit.ipd.sdq.toometa.patterns.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import edu.kit.ipd.sdq.toometa.patterns.PatternsPackage;
import edu.kit.ipd.sdq.toometa.patterns.Role;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.impl.RoleImpl#getDesctiption <em>Desctiption</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.impl.RoleImpl#getMaxInstances <em>Max Instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleImpl extends IdentifierImpl implements Role {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternsPackage.Literals.ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDesctiption() {
		return (String)eGet(PatternsPackage.Literals.ROLE__DESCTIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesctiption(String newDesctiption) {
		eSet(PatternsPackage.Literals.ROLE__DESCTIPTION, newDesctiption);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxInstances() {
		return (Integer)eGet(PatternsPackage.Literals.ROLE__MAX_INSTANCES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxInstances(int newMaxInstances) {
		eSet(PatternsPackage.Literals.ROLE__MAX_INSTANCES, newMaxInstances);
	}

} //RoleImpl
