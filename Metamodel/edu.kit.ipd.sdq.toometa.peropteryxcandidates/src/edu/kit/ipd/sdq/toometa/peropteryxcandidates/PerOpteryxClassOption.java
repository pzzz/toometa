/**
 */
package edu.kit.ipd.sdq.toometa.peropteryxcandidates;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Per Opteryx Class Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.peropteryxcandidates.PerOpteryxClassOption#getChosenValue <em>Chosen Value</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.peropteryxcandidates.PeropteryxcandidatesPackage#getPerOpteryxClassOption()
 * @model
 * @generated
 */
public interface PerOpteryxClassOption extends PerOpteryxOption {
	/**
	 * Returns the value of the '<em><b>Chosen Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chosen Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chosen Value</em>' reference.
	 * @see #setChosenValue(EObject)
	 * @see edu.kit.ipd.sdq.toometa.peropteryxcandidates.PeropteryxcandidatesPackage#getPerOpteryxClassOption_ChosenValue()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EObject getChosenValue();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.peropteryxcandidates.PerOpteryxClassOption#getChosenValue <em>Chosen Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chosen Value</em>' reference.
	 * @see #getChosenValue()
	 * @generated
	 */
	void setChosenValue(EObject value);

} // PerOpteryxClassOption
