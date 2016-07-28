/**
 */
package edu.kit.ipd.sdq.toometa.peropteryxcandidates;

import edu.kit.ipd.sdq.toometa.archoptions.ArchOption;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Per Opteryx Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.peropteryxcandidates.PerOpteryxOption#getPrimaryChanged <em>Primary Changed</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.peropteryxcandidates.PerOpteryxOption#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.peropteryxcandidates.PeropteryxcandidatesPackage#getPerOpteryxOption()
 * @model abstract="true"
 * @generated
 */
public interface PerOpteryxOption extends ArchOption {
	/**
	 * Returns the value of the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Changed</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Changed</em>' reference.
	 * @see #setPrimaryChanged(EObject)
	 * @see edu.kit.ipd.sdq.toometa.peropteryxcandidates.PeropteryxcandidatesPackage#getPerOpteryxOption_PrimaryChanged()
	 * @model required="true"
	 * @generated
	 */
	EObject getPrimaryChanged();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.peropteryxcandidates.PerOpteryxOption#getPrimaryChanged <em>Primary Changed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Changed</em>' reference.
	 * @see #getPrimaryChanged()
	 * @generated
	 */
	void setPrimaryChanged(EObject value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Object)
	 * @see edu.kit.ipd.sdq.toometa.peropteryxcandidates.PeropteryxcandidatesPackage#getPerOpteryxOption_Value()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Object getValue();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.peropteryxcandidates.PerOpteryxOption#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Object value);

} // PerOpteryxOption
