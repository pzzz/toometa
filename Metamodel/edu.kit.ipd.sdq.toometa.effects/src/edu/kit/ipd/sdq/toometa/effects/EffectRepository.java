/**
 */
package edu.kit.ipd.sdq.toometa.effects;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Effect Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.effects.EffectRepository#getKnownEffects <em>Known Effects</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.effects.EffectRepository#getEffectCategories <em>Effect Categories</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.effects.EffectsPackage#getEffectRepository()
 * @model
 * @generated
 */
public interface EffectRepository extends Identifier {
	/**
	 * Returns the value of the '<em><b>Known Effects</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.effects.Effect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Known Effects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Known Effects</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.toometa.effects.EffectsPackage#getEffectRepository_KnownEffects()
	 * @model containment="true"
	 * @generated
	 */
	EList<Effect> getKnownEffects();

	/**
	 * Returns the value of the '<em><b>Effect Categories</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.effects.EffectCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effect Categories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect Categories</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.toometa.effects.EffectsPackage#getEffectRepository_EffectCategories()
	 * @model containment="true"
	 * @generated
	 */
	EList<EffectCategory> getEffectCategories();

} // EffectRepository
