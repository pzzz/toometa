/**
 */
package edu.kit.ipd.sdq.toometa.patterns.patterninstances;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatternInstance#getRoles <em>Roles</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatternInstance#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatternInstance#getName <em>Name</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatternInstance#getArchitecturalLevel <em>Architectural Level</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatternInstance#getRepository <em>Repository</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatterninstancesPackage#getPatternInstance()
 * @model
 * @generated
 */
public interface PatternInstance extends Identifier {
	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.patterns.patterninstances.RoleInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatterninstancesPackage#getPatternInstance_Roles()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<RoleInstance> getRoles();

	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.patterns.patterninstances.ConnectorInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectors</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatterninstancesPackage#getPatternInstance_Connectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConnectorInstance> getConnectors();

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
	 * @see edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatterninstancesPackage#getPatternInstance_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatternInstance#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Architectural Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Architectural Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architectural Level</em>' attribute.
	 * @see #setArchitecturalLevel(int)
	 * @see edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatterninstancesPackage#getPatternInstance_ArchitecturalLevel()
	 * @model
	 * @generated
	 */
	int getArchitecturalLevel();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatternInstance#getArchitecturalLevel <em>Architectural Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Architectural Level</em>' attribute.
	 * @see #getArchitecturalLevel()
	 * @generated
	 */
	void setArchitecturalLevel(int value);

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatternInstanceRepository#getSolutionInstances <em>Solution Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' container reference.
	 * @see #setRepository(PatternInstanceRepository)
	 * @see edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatterninstancesPackage#getPatternInstance_Repository()
	 * @see edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatternInstanceRepository#getSolutionInstances
	 * @model opposite="solutionInstances" transient="false"
	 * @generated
	 */
	PatternInstanceRepository getRepository();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatternInstance#getRepository <em>Repository</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' container reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(PatternInstanceRepository value);

} // PatternInstance
