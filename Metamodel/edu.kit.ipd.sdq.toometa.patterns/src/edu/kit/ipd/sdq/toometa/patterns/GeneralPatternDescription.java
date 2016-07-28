/**
 */
package edu.kit.ipd.sdq.toometa.patterns;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>General Pattern Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.GeneralPatternDescription#getProperty <em>Property</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.GeneralPatternDescription#getInformationSource <em>Information Source</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.GeneralPatternDescription#getShortDescription <em>Short Description</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.GeneralPatternDescription#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.GeneralPatternDescription#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.patterns.PatternsPackage#getGeneralPatternDescription()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface GeneralPatternDescription extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.patterns.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.toometa.patterns.PatternsPackage#getGeneralPatternDescription_Property()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperty();

	/**
	 * Returns the value of the '<em><b>Information Source</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Information Source</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Information Source</em>' attribute list.
	 * @see edu.kit.ipd.sdq.toometa.patterns.PatternsPackage#getGeneralPatternDescription_InformationSource()
	 * @model
	 * @generated
	 */
	EList<String> getInformationSource();

	/**
	 * Returns the value of the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Short Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Description</em>' attribute.
	 * @see #setShortDescription(String)
	 * @see edu.kit.ipd.sdq.toometa.patterns.PatternsPackage#getGeneralPatternDescription_ShortDescription()
	 * @model
	 * @generated
	 */
	String getShortDescription();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.patterns.GeneralPatternDescription#getShortDescription <em>Short Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Description</em>' attribute.
	 * @see #getShortDescription()
	 * @generated
	 */
	void setShortDescription(String value);

	/**
	 * Returns the value of the '<em><b>Diagram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram</em>' attribute.
	 * @see #setDiagram(byte[])
	 * @see edu.kit.ipd.sdq.toometa.patterns.PatternsPackage#getGeneralPatternDescription_Diagram()
	 * @model
	 * @generated
	 */
	byte[] getDiagram();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.patterns.GeneralPatternDescription#getDiagram <em>Diagram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram</em>' attribute.
	 * @see #getDiagram()
	 * @generated
	 */
	void setDiagram(byte[] value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edu.kit.ipd.sdq.toometa.patterns.PatternsPackage#getGeneralPatternDescription_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.patterns.GeneralPatternDescription#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // GeneralPatternDescription
