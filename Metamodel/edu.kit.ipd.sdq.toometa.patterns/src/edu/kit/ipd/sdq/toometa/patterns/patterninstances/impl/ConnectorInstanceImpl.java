/**
 */
package edu.kit.ipd.sdq.toometa.patterns.patterninstances.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import edu.kit.ipd.sdq.toometa.patterns.Connector;

import edu.kit.ipd.sdq.toometa.patterns.patterninstances.ConnectorInstance;
import edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatterninstancesPackage;
import edu.kit.ipd.sdq.toometa.patterns.patterninstances.RoleInstance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.patterninstances.impl.ConnectorInstanceImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.patterninstances.impl.ConnectorInstanceImpl#getFromRole <em>From Role</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.patterninstances.impl.ConnectorInstanceImpl#getToRole <em>To Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ConnectorInstanceImpl extends IdentifierImpl implements ConnectorInstance {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatterninstancesPackage.Literals.CONNECTOR_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getConnector() {
		return (Connector)eGet(PatterninstancesPackage.Literals.CONNECTOR_INSTANCE__CONNECTOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnector(Connector newConnector) {
		eSet(PatterninstancesPackage.Literals.CONNECTOR_INSTANCE__CONNECTOR, newConnector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<RoleInstance> getFromRole() {
		return (EList<RoleInstance>)eGet(PatterninstancesPackage.Literals.CONNECTOR_INSTANCE__FROM_ROLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<RoleInstance> getToRole() {
		return (EList<RoleInstance>)eGet(PatterninstancesPackage.Literals.CONNECTOR_INSTANCE__TO_ROLE, true);
	}

} //ConnectorInstanceImpl
