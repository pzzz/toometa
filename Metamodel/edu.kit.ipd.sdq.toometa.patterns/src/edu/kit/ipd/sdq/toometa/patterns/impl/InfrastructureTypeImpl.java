/**
 */
package edu.kit.ipd.sdq.toometa.patterns.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import edu.kit.ipd.sdq.toometa.patterns.InfrastructureType;
import edu.kit.ipd.sdq.toometa.patterns.PatternsPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Infrastructure Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.impl.InfrastructureTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.impl.InfrastructureTypeImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InfrastructureTypeImpl extends IdentifierImpl implements InfrastructureType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfrastructureTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternsPackage.Literals.INFRASTRUCTURE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(PatternsPackage.Literals.INFRASTRUCTURE_TYPE__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(PatternsPackage.Literals.INFRASTRUCTURE_TYPE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eGet(PatternsPackage.Literals.INFRASTRUCTURE_TYPE__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(PatternsPackage.Literals.INFRASTRUCTURE_TYPE__DESCRIPTION, newDescription);
	}

} //InfrastructureTypeImpl
