/**
 */
package edu.kit.ipd.sdq.toometa.pcmarchoptions;

import edu.kit.ipd.sdq.toometa.archoptions.ReplaceComponents;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCM Replace Components</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_ReplaceComponents#getContextReplacedWith <em>Context Replaced With</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_ReplaceComponents#getReplacedContextName <em>Replaced Context Name</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.pcmarchoptions.PcmarchoptionsPackage#getPCM_ReplaceComponents()
 * @model
 * @generated
 */
public interface PCM_ReplaceComponents extends ReplaceComponents {
	/**
	 * Returns the value of the '<em><b>Context Replaced With</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Replaced With</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Replaced With</em>' reference.
	 * @see #setContextReplacedWith(AssemblyContext)
	 * @see edu.kit.ipd.sdq.toometa.pcmarchoptions.PcmarchoptionsPackage#getPCM_ReplaceComponents_ContextReplacedWith()
	 * @model required="true"
	 * @generated
	 */
	AssemblyContext getContextReplacedWith();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_ReplaceComponents#getContextReplacedWith <em>Context Replaced With</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Replaced With</em>' reference.
	 * @see #getContextReplacedWith()
	 * @generated
	 */
	void setContextReplacedWith(AssemblyContext value);

	/**
	 * Returns the value of the '<em><b>Replaced Context Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replaced Context Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replaced Context Name</em>' attribute.
	 * @see #setReplacedContextName(String)
	 * @see edu.kit.ipd.sdq.toometa.pcmarchoptions.PcmarchoptionsPackage#getPCM_ReplaceComponents_ReplacedContextName()
	 * @model required="true"
	 * @generated
	 */
	String getReplacedContextName();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_ReplaceComponents#getReplacedContextName <em>Replaced Context Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replaced Context Name</em>' attribute.
	 * @see #getReplacedContextName()
	 * @generated
	 */
	void setReplacedContextName(String value);

} // PCM_ReplaceComponents
