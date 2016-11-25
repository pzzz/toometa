/**
 */
package pcmusagemodeladapter;

import edu.kit.ipd.sdq.toometa.requirements.RequirementsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see pcmusagemodeladapter.PcmusagemodeladapterFactory
 * @model kind="package"
 * @generated
 */
public interface PcmusagemodeladapterPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pcmusagemodeladapter";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.kit.edu/toometa/pcmusagemodeladapter/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pcmusagemodeladapter";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PcmusagemodeladapterPackage eINSTANCE = pcmusagemodeladapter.impl.PcmusagemodeladapterPackageImpl.init();

	/**
	 * The meta object id for the '{@link pcmusagemodeladapter.impl.PCMUsageModelImpl <em>PCM Usage Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmusagemodeladapter.impl.PCMUsageModelImpl
	 * @see pcmusagemodeladapter.impl.PcmusagemodeladapterPackageImpl#getPCMUsageModel()
	 * @generated
	 */
	int PCM_USAGE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_USAGE_MODEL__ID = RequirementsPackage.USAGE_MODEL_ADAPTER__ID;

	/**
	 * The feature id for the '<em><b>Pcm Usage Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_USAGE_MODEL__PCM_USAGE_MODEL = RequirementsPackage.USAGE_MODEL_ADAPTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PCM Usage Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_USAGE_MODEL_FEATURE_COUNT = RequirementsPackage.USAGE_MODEL_ADAPTER_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link pcmusagemodeladapter.PCMUsageModel <em>PCM Usage Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Usage Model</em>'.
	 * @see pcmusagemodeladapter.PCMUsageModel
	 * @generated
	 */
	EClass getPCMUsageModel();

	/**
	 * Returns the meta object for the reference '{@link pcmusagemodeladapter.PCMUsageModel#getPcmUsageModel <em>Pcm Usage Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pcm Usage Model</em>'.
	 * @see pcmusagemodeladapter.PCMUsageModel#getPcmUsageModel()
	 * @see #getPCMUsageModel()
	 * @generated
	 */
	EReference getPCMUsageModel_PcmUsageModel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PcmusagemodeladapterFactory getPcmusagemodeladapterFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link pcmusagemodeladapter.impl.PCMUsageModelImpl <em>PCM Usage Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmusagemodeladapter.impl.PCMUsageModelImpl
		 * @see pcmusagemodeladapter.impl.PcmusagemodeladapterPackageImpl#getPCMUsageModel()
		 * @generated
		 */
		EClass PCM_USAGE_MODEL = eINSTANCE.getPCMUsageModel();

		/**
		 * The meta object literal for the '<em><b>Pcm Usage Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_USAGE_MODEL__PCM_USAGE_MODEL = eINSTANCE.getPCMUsageModel_PcmUsageModel();

	}

} //PcmusagemodeladapterPackage
