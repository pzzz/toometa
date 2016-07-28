/**
 */
package edu.kit.ipd.sdq.toometa.palladiorationales.impl;

import edu.kit.ipd.sdq.toometa.palladiorationales.*;

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
public class PalladiorationalesFactoryImpl extends EFactoryImpl implements PalladiorationalesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PalladiorationalesFactory init() {
		try {
			PalladiorationalesFactory thePalladiorationalesFactory = (PalladiorationalesFactory)EPackage.Registry.INSTANCE.getEFactory(PalladiorationalesPackage.eNS_URI);
			if (thePalladiorationalesFactory != null) {
				return thePalladiorationalesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PalladiorationalesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PalladiorationalesFactoryImpl() {
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
			case PalladiorationalesPackage.PALLADIO_RATIONALE: return (EObject)createPalladioRationale();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PalladioRationale createPalladioRationale() {
		PalladioRationaleImpl palladioRationale = new PalladioRationaleImpl();
		return palladioRationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PalladiorationalesPackage getPalladiorationalesPackage() {
		return (PalladiorationalesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PalladiorationalesPackage getPackage() {
		return PalladiorationalesPackage.eINSTANCE;
	}

} //PalladiorationalesFactoryImpl
