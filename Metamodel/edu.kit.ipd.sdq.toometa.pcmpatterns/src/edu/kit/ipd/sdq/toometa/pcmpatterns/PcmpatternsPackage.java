/**
 */
package edu.kit.ipd.sdq.toometa.pcmpatterns;

import edu.kit.ipd.sdq.toometa.patterns.PatternsPackage;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.toometa.pcmpatterns.PcmpatternsFactory
 * @model kind="package"
 * @generated
 */
public interface PcmpatternsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pcmpatterns";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.kit.edu/toometa/pcmpatterns/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pcmpatterns";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PcmpatternsPackage eINSTANCE = edu.kit.ipd.sdq.toometa.pcmpatterns.impl.PcmpatternsPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.pcmpatterns.impl.PCMRoleImpl <em>PCM Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.pcmpatterns.impl.PCMRoleImpl
	 * @see edu.kit.ipd.sdq.toometa.pcmpatterns.impl.PcmpatternsPackageImpl#getPCMRole()
	 * @generated
	 */
	int PCM_ROLE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ROLE__ID = PatternsPackage.ROLE__ID;

	/**
	 * The feature id for the '<em><b>Desctiption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ROLE__DESCTIPTION = PatternsPackage.ROLE__DESCTIPTION;

	/**
	 * The feature id for the '<em><b>Max Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ROLE__MAX_INSTANCES = PatternsPackage.ROLE__MAX_INSTANCES;

	/**
	 * The feature id for the '<em><b>Operation Provided Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ROLE__OPERATION_PROVIDED_ROLE = PatternsPackage.ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PCM Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_ROLE_FEATURE_COUNT = PatternsPackage.ROLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.toometa.pcmpatterns.impl.PCMConnectorImpl <em>PCM Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.toometa.pcmpatterns.impl.PCMConnectorImpl
	 * @see edu.kit.ipd.sdq.toometa.pcmpatterns.impl.PcmpatternsPackageImpl#getPCMConnector()
	 * @generated
	 */
	int PCM_CONNECTOR = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CONNECTOR__ID = PatternsPackage.CONNECTOR__ID;

	/**
	 * The feature id for the '<em><b>Connector To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CONNECTOR__CONNECTOR_TO = PatternsPackage.CONNECTOR__CONNECTOR_TO;

	/**
	 * The feature id for the '<em><b>Connector From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CONNECTOR__CONNECTOR_FROM = PatternsPackage.CONNECTOR__CONNECTOR_FROM;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CONNECTOR__DESCRIPTION = PatternsPackage.CONNECTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Assembly Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CONNECTOR__ASSEMBLY_CONNECTOR = PatternsPackage.CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PCM Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CONNECTOR_FEATURE_COUNT = PatternsPackage.CONNECTOR_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.pcmpatterns.PCMRole <em>PCM Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Role</em>'.
	 * @see edu.kit.ipd.sdq.toometa.pcmpatterns.PCMRole
	 * @generated
	 */
	EClass getPCMRole();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.toometa.pcmpatterns.PCMRole#getOperationProvidedRole <em>Operation Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation Provided Role</em>'.
	 * @see edu.kit.ipd.sdq.toometa.pcmpatterns.PCMRole#getOperationProvidedRole()
	 * @see #getPCMRole()
	 * @generated
	 */
	EReference getPCMRole_OperationProvidedRole();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.toometa.pcmpatterns.PCMConnector <em>PCM Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Connector</em>'.
	 * @see edu.kit.ipd.sdq.toometa.pcmpatterns.PCMConnector
	 * @generated
	 */
	EClass getPCMConnector();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.toometa.pcmpatterns.PCMConnector#getAssemblyConnector <em>Assembly Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assembly Connector</em>'.
	 * @see edu.kit.ipd.sdq.toometa.pcmpatterns.PCMConnector#getAssemblyConnector()
	 * @see #getPCMConnector()
	 * @generated
	 */
	EReference getPCMConnector_AssemblyConnector();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PcmpatternsFactory getPcmpatternsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.pcmpatterns.impl.PCMRoleImpl <em>PCM Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.pcmpatterns.impl.PCMRoleImpl
		 * @see edu.kit.ipd.sdq.toometa.pcmpatterns.impl.PcmpatternsPackageImpl#getPCMRole()
		 * @generated
		 */
		EClass PCM_ROLE = eINSTANCE.getPCMRole();

		/**
		 * The meta object literal for the '<em><b>Operation Provided Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_ROLE__OPERATION_PROVIDED_ROLE = eINSTANCE.getPCMRole_OperationProvidedRole();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.toometa.pcmpatterns.impl.PCMConnectorImpl <em>PCM Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.toometa.pcmpatterns.impl.PCMConnectorImpl
		 * @see edu.kit.ipd.sdq.toometa.pcmpatterns.impl.PcmpatternsPackageImpl#getPCMConnector()
		 * @generated
		 */
		EClass PCM_CONNECTOR = eINSTANCE.getPCMConnector();

		/**
		 * The meta object literal for the '<em><b>Assembly Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM_CONNECTOR__ASSEMBLY_CONNECTOR = eINSTANCE.getPCMConnector_AssemblyConnector();

	}

} //PcmpatternsPackage
