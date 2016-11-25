/**
 */
package pcmusagemodeladapter.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pcmusagemodeladapter.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PcmusagemodeladapterFactoryImpl extends EFactoryImpl implements PcmusagemodeladapterFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PcmusagemodeladapterFactory init() {
		try {
			PcmusagemodeladapterFactory thePcmusagemodeladapterFactory = (PcmusagemodeladapterFactory)EPackage.Registry.INSTANCE.getEFactory(PcmusagemodeladapterPackage.eNS_URI);
			if (thePcmusagemodeladapterFactory != null) {
				return thePcmusagemodeladapterFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PcmusagemodeladapterFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PcmusagemodeladapterFactoryImpl() {
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
			case PcmusagemodeladapterPackage.PCM_USAGE_MODEL: return (EObject)createPCMUsageModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCMUsageModel createPCMUsageModel() {
		PCMUsageModelImpl pcmUsageModel = new PCMUsageModelImpl();
		return pcmUsageModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PcmusagemodeladapterPackage getPcmusagemodeladapterPackage() {
		return (PcmusagemodeladapterPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PcmusagemodeladapterPackage getPackage() {
		return PcmusagemodeladapterPackage.eINSTANCE;
	}

} //PcmusagemodeladapterFactoryImpl
