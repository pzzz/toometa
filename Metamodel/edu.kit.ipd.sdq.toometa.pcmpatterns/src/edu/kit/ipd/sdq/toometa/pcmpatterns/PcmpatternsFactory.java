/**
 */
package edu.kit.ipd.sdq.toometa.pcmpatterns;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.toometa.pcmpatterns.PcmpatternsPackage
 * @generated
 */
public interface PcmpatternsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PcmpatternsFactory eINSTANCE = edu.kit.ipd.sdq.toometa.pcmpatterns.impl.PcmpatternsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>PCM Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCM Role</em>'.
	 * @generated
	 */
	PCMRole createPCMRole();

	/**
	 * Returns a new object of class '<em>PCM Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCM Connector</em>'.
	 * @generated
	 */
	PCMConnector createPCMConnector();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PcmpatternsPackage getPcmpatternsPackage();

} //PcmpatternsFactory
