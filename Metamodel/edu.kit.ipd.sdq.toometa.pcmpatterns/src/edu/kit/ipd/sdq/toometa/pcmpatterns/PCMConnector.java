/**
 */
package edu.kit.ipd.sdq.toometa.pcmpatterns;

import edu.kit.ipd.sdq.toometa.patterns.Connector;

import org.palladiosimulator.pcm.core.composition.AssemblyConnector;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCM Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.pcmpatterns.PCMConnector#getAssemblyConnector <em>Assembly Connector</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.pcmpatterns.PcmpatternsPackage#getPCMConnector()
 * @model
 * @generated
 */
public interface PCMConnector extends Connector {
	/**
	 * Returns the value of the '<em><b>Assembly Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assembly Connector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Connector</em>' reference.
	 * @see #setAssemblyConnector(AssemblyConnector)
	 * @see edu.kit.ipd.sdq.toometa.pcmpatterns.PcmpatternsPackage#getPCMConnector_AssemblyConnector()
	 * @model
	 * @generated
	 */
	AssemblyConnector getAssemblyConnector();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.pcmpatterns.PCMConnector#getAssemblyConnector <em>Assembly Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assembly Connector</em>' reference.
	 * @see #getAssemblyConnector()
	 * @generated
	 */
	void setAssemblyConnector(AssemblyConnector value);

} // PCMConnector
