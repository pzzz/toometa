/**
 */
package edu.kit.ipd.sdq.toometa.glossary;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Glossary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.glossary.Glossary#getTerms <em>Terms</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.glossary.Glossary#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.glossary.GlossaryPackage#getGlossary()
 * @model
 * @generated
 */
public interface Glossary extends Identifier {
	/**
	 * Returns the value of the '<em><b>Terms</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.glossary.GlossaryTerm}.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.toometa.glossary.GlossaryTerm#getGlossary <em>Glossary</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terms</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.toometa.glossary.GlossaryPackage#getGlossary_Terms()
	 * @see edu.kit.ipd.sdq.toometa.glossary.GlossaryTerm#getGlossary
	 * @model opposite="glossary" containment="true"
	 * @generated
	 */
	EList<GlossaryTerm> getTerms();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see edu.kit.ipd.sdq.toometa.glossary.GlossaryPackage#getGlossary_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.glossary.Glossary#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // Glossary
