/**
 */
package pcmusagemodeladapter;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see pcmusagemodeladapter.PcmusagemodeladapterPackage
 * @generated
 */
public interface PcmusagemodeladapterFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PcmusagemodeladapterFactory eINSTANCE = pcmusagemodeladapter.impl.PcmusagemodeladapterFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>PCM Usage Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCM Usage Model</em>'.
	 * @generated
	 */
	PCMUsageModel createPCMUsageModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PcmusagemodeladapterPackage getPcmusagemodeladapterPackage();

} //PcmusagemodeladapterFactory
