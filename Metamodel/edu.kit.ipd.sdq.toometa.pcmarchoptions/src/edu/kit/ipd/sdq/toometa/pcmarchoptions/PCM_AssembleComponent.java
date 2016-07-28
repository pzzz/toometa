/**
 */
package edu.kit.ipd.sdq.toometa.pcmarchoptions;

import edu.kit.ipd.sdq.toometa.archoptions.AssembleComponent;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;

import org.palladiosimulator.pcm.repository.RepositoryComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCM Assemble Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_AssembleComponent#getAssembleTo <em>Assemble To</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_AssembleComponent#getCompomentToAssemble <em>Compoment To Assemble</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.pcmarchoptions.PcmarchoptionsPackage#getPCM_AssembleComponent()
 * @model
 * @generated
 */
public interface PCM_AssembleComponent extends AssembleComponent {
	/**
	 * Returns the value of the '<em><b>Assemble To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assemble To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assemble To</em>' reference.
	 * @see #setAssembleTo(AssemblyContext)
	 * @see edu.kit.ipd.sdq.toometa.pcmarchoptions.PcmarchoptionsPackage#getPCM_AssembleComponent_AssembleTo()
	 * @model required="true"
	 * @generated
	 */
	AssemblyContext getAssembleTo();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_AssembleComponent#getAssembleTo <em>Assemble To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assemble To</em>' reference.
	 * @see #getAssembleTo()
	 * @generated
	 */
	void setAssembleTo(AssemblyContext value);

	/**
	 * Returns the value of the '<em><b>Compoment To Assemble</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compoment To Assemble</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compoment To Assemble</em>' reference.
	 * @see #setCompomentToAssemble(RepositoryComponent)
	 * @see edu.kit.ipd.sdq.toometa.pcmarchoptions.PcmarchoptionsPackage#getPCM_AssembleComponent_CompomentToAssemble()
	 * @model required="true"
	 * @generated
	 */
	RepositoryComponent getCompomentToAssemble();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_AssembleComponent#getCompomentToAssemble <em>Compoment To Assemble</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compoment To Assemble</em>' reference.
	 * @see #getCompomentToAssemble()
	 * @generated
	 */
	void setCompomentToAssemble(RepositoryComponent value);

} // PCM_AssembleComponent
