/**
 */
package edu.kit.ipd.sdq.toometa.pcmpatterns.impl;

import edu.kit.ipd.sdq.toometa.pcmpatterns.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PcmpatternsFactoryImpl extends EFactoryImpl implements PcmpatternsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PcmpatternsFactory init() {
		try {
			PcmpatternsFactory thePcmpatternsFactory = (PcmpatternsFactory)EPackage.Registry.INSTANCE.getEFactory(PcmpatternsPackage.eNS_URI);
			if (thePcmpatternsFactory != null) {
				return thePcmpatternsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PcmpatternsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PcmpatternsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PcmpatternsPackage.PCM_ROLE: return (EObject)createPCMRole();
			case PcmpatternsPackage.PCM_CONNECTOR: return (EObject)createPCMConnector();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCMRole createPCMRole() {
		PCMRoleImpl pcmRole = new PCMRoleImpl();
		return pcmRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCMConnector createPCMConnector() {
		PCMConnectorImpl pcmConnector = new PCMConnectorImpl();
		return pcmConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PcmpatternsPackage getPcmpatternsPackage() {
		return (PcmpatternsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PcmpatternsPackage getPackage() {
		return PcmpatternsPackage.eINSTANCE;
	}

} //PcmpatternsFactoryImpl
