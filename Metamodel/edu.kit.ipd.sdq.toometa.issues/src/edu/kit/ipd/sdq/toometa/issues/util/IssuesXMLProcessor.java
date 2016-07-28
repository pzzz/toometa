/**
 */
package edu.kit.ipd.sdq.toometa.issues.util;

import edu.kit.ipd.sdq.toometa.issues.IssuesPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IssuesXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssuesXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		IssuesPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the IssuesResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new IssuesResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new IssuesResourceFactoryImpl());
		}
		return registrations;
	}

} //IssuesXMLProcessor
