/**
 */
package edu.kit.ipd.sdq.toometa.requirements;

import de.uka.ipd.sdq.identifier.Identifier;

import edu.kit.ipd.sdq.toometa.glossary.GlossaryTerm;

import edu.kit.ipd.sdq.toometa.relations.TraceableObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.requirements.Requirement#getSpecification <em>Specification</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.requirements.Requirement#getPriority <em>Priority</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.requirements.Requirement#getStatus <em>Status</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.requirements.Requirement#getUsesTerms <em>Uses Terms</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.requirements.Requirement#getRepository <em>Repository</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.requirements.RequirementsPackage#getRequirement()
 * @model abstract="true"
 * @generated
 */
public interface Requirement extends Identifier, TraceableObject {
	/**
	 * Returns the value of the '<em><b>Specification</b></em>' attribute.
	 * The default value is <code>"Write a specification here ...."</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' attribute.
	 * @see #setSpecification(String)
	 * @see edu.kit.ipd.sdq.toometa.requirements.RequirementsPackage#getRequirement_Specification()
	 * @model default="Write a specification here ...." required="true"
	 * @generated
	 */
	String getSpecification();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.requirements.Requirement#getSpecification <em>Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' attribute.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(String value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * The default value is <code>"neutral"</code>.
	 * The literals are from the enumeration {@link edu.kit.ipd.sdq.toometa.requirements.ReqPriorityEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see edu.kit.ipd.sdq.toometa.requirements.ReqPriorityEnum
	 * @see #setPriority(ReqPriorityEnum)
	 * @see edu.kit.ipd.sdq.toometa.requirements.RequirementsPackage#getRequirement_Priority()
	 * @model default="neutral" required="true"
	 * @generated
	 */
	ReqPriorityEnum getPriority();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.requirements.Requirement#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see edu.kit.ipd.sdq.toometa.requirements.ReqPriorityEnum
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(ReqPriorityEnum value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The default value is <code>"new"</code>.
	 * The literals are from the enumeration {@link edu.kit.ipd.sdq.toometa.requirements.ReqStatusEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see edu.kit.ipd.sdq.toometa.requirements.ReqStatusEnum
	 * @see #setStatus(ReqStatusEnum)
	 * @see edu.kit.ipd.sdq.toometa.requirements.RequirementsPackage#getRequirement_Status()
	 * @model default="new" required="true"
	 * @generated
	 */
	ReqStatusEnum getStatus();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.requirements.Requirement#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see edu.kit.ipd.sdq.toometa.requirements.ReqStatusEnum
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ReqStatusEnum value);

	/**
	 * Returns the value of the '<em><b>Uses Terms</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.glossary.GlossaryTerm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses Terms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Terms</em>' reference list.
	 * @see edu.kit.ipd.sdq.toometa.requirements.RequirementsPackage#getRequirement_UsesTerms()
	 * @model
	 * @generated
	 */
	EList<GlossaryTerm> getUsesTerms();

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' reference.
	 * @see #setRepository(ReqRepository)
	 * @see edu.kit.ipd.sdq.toometa.requirements.RequirementsPackage#getRequirement_Repository()
	 * @model required="true"
	 * @generated
	 */
	ReqRepository getRepository();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.requirements.Requirement#getRepository <em>Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(ReqRepository value);

} // Requirement
