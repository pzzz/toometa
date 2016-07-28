/**
 */
package edu.kit.ipd.sdq.toometa.patterns.impl;

import edu.kit.ipd.sdq.toometa.patterns.ArchitecturalStructure;
import edu.kit.ipd.sdq.toometa.patterns.Connector;
import edu.kit.ipd.sdq.toometa.patterns.PatternsPackage;
import edu.kit.ipd.sdq.toometa.patterns.Role;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Architectural Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.impl.ArchitecturalStructureImpl#getRole <em>Role</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.impl.ArchitecturalStructureImpl#getConnectors <em>Connectors</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ArchitecturalStructureImpl extends CDOObjectImpl implements ArchitecturalStructure {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchitecturalStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternsPackage.Literals.ARCHITECTURAL_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Role> getRole() {
		return (EList<Role>)eGet(PatternsPackage.Literals.ARCHITECTURAL_STRUCTURE__ROLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Connector> getConnectors() {
		return (EList<Connector>)eGet(PatternsPackage.Literals.ARCHITECTURAL_STRUCTURE__CONNECTORS, true);
	}

} //ArchitecturalStructureImpl
