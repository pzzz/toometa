/**
 */
package edu.kit.ipd.sdq.toometa.pcmarchoptions;

import edu.kit.ipd.sdq.toometa.archoptions.OnlySingleInstantiation;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCM Only Single Instantiation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_OnlySingleInstantiation#getAssemblyContext <em>Assembly Context</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.pcmarchoptions.PcmarchoptionsPackage#getPCM_OnlySingleInstantiation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SingleInstantiation'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL SingleInstantiation='assemblyContext.parentStructure__AssemblyContext.assemblyContexts__ComposedStructure->select(a : composition::AssemblyContext| a.encapsulatedComponent__AssemblyContext = assemblyContext.encapsulatedComponent__AssemblyContext)->size()=1'"
 * @generated
 */
public interface PCM_OnlySingleInstantiation extends OnlySingleInstantiation {
	/**
	 * Returns the value of the '<em><b>Assembly Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assembly Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Context</em>' reference.
	 * @see #setAssemblyContext(AssemblyContext)
	 * @see edu.kit.ipd.sdq.toometa.pcmarchoptions.PcmarchoptionsPackage#getPCM_OnlySingleInstantiation_AssemblyContext()
	 * @model required="true"
	 * @generated
	 */
	AssemblyContext getAssemblyContext();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_OnlySingleInstantiation#getAssemblyContext <em>Assembly Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assembly Context</em>' reference.
	 * @see #getAssemblyContext()
	 * @generated
	 */
	void setAssemblyContext(AssemblyContext value);

} // PCM_OnlySingleInstantiation
