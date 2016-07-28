/**
 */
package edu.kit.ipd.sdq.toometa.patterns.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import edu.kit.ipd.sdq.toometa.patterns.Connector;
import edu.kit.ipd.sdq.toometa.patterns.PatternsPackage;
import edu.kit.ipd.sdq.toometa.patterns.Role;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.impl.ConnectorImpl#getConnectorTo <em>Connector To</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.impl.ConnectorImpl#getConnectorFrom <em>Connector From</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.impl.ConnectorImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorImpl extends IdentifierImpl implements Connector {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternsPackage.Literals.CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getConnectorTo() {
		return (Role)eGet(PatternsPackage.Literals.CONNECTOR__CONNECTOR_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectorTo(Role newConnectorTo) {
		eSet(PatternsPackage.Literals.CONNECTOR__CONNECTOR_TO, newConnectorTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getConnectorFrom() {
		return (Role)eGet(PatternsPackage.Literals.CONNECTOR__CONNECTOR_FROM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectorFrom(Role newConnectorFrom) {
		eSet(PatternsPackage.Literals.CONNECTOR__CONNECTOR_FROM, newConnectorFrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eGet(PatternsPackage.Literals.CONNECTOR__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(PatternsPackage.Literals.CONNECTOR__DESCRIPTION, newDescription);
	}

} //ConnectorImpl
