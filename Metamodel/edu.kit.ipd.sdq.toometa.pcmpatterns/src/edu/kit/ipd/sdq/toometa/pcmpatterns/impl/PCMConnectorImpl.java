/**
 */
package edu.kit.ipd.sdq.toometa.pcmpatterns.impl;

import edu.kit.ipd.sdq.toometa.patterns.impl.ConnectorImpl;

import edu.kit.ipd.sdq.toometa.pcmpatterns.PCMConnector;
import edu.kit.ipd.sdq.toometa.pcmpatterns.PcmpatternsPackage;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.core.composition.AssemblyConnector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCM Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.pcmpatterns.impl.PCMConnectorImpl#getAssemblyConnector <em>Assembly Connector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCMConnectorImpl extends ConnectorImpl implements PCMConnector {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCMConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcmpatternsPackage.Literals.PCM_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyConnector getAssemblyConnector() {
		return (AssemblyConnector)eDynamicGet(PcmpatternsPackage.PCM_CONNECTOR__ASSEMBLY_CONNECTOR, PcmpatternsPackage.Literals.PCM_CONNECTOR__ASSEMBLY_CONNECTOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyConnector basicGetAssemblyConnector() {
		return (AssemblyConnector)eDynamicGet(PcmpatternsPackage.PCM_CONNECTOR__ASSEMBLY_CONNECTOR, PcmpatternsPackage.Literals.PCM_CONNECTOR__ASSEMBLY_CONNECTOR, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssemblyConnector(AssemblyConnector newAssemblyConnector) {
		eDynamicSet(PcmpatternsPackage.PCM_CONNECTOR__ASSEMBLY_CONNECTOR, PcmpatternsPackage.Literals.PCM_CONNECTOR__ASSEMBLY_CONNECTOR, newAssemblyConnector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PcmpatternsPackage.PCM_CONNECTOR__ASSEMBLY_CONNECTOR:
				if (resolve) return getAssemblyConnector();
				return basicGetAssemblyConnector();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PcmpatternsPackage.PCM_CONNECTOR__ASSEMBLY_CONNECTOR:
				setAssemblyConnector((AssemblyConnector)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PcmpatternsPackage.PCM_CONNECTOR__ASSEMBLY_CONNECTOR:
				setAssemblyConnector((AssemblyConnector)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PcmpatternsPackage.PCM_CONNECTOR__ASSEMBLY_CONNECTOR:
				return basicGetAssemblyConnector() != null;
		}
		return super.eIsSet(featureID);
	}

} //PCMConnectorImpl
