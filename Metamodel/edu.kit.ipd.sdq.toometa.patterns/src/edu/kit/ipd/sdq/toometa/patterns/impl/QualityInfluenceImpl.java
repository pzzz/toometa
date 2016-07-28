/**
 */
package edu.kit.ipd.sdq.toometa.patterns.impl;

import edu.kit.ipd.sdq.toometa.effects.Effect;
import edu.kit.ipd.sdq.toometa.effects.EffectType;
import edu.kit.ipd.sdq.toometa.effects.EffectsPackage;
import edu.kit.ipd.sdq.toometa.effects.QualityEffect;

import edu.kit.ipd.sdq.toometa.patterns.PatternsPackage;
import edu.kit.ipd.sdq.toometa.patterns.QualityInfluence;

import edu.kit.ipd.sdq.toometa.qualities.QualityType;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quality Influence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.impl.QualityInfluenceImpl#getEffectType <em>Effect Type</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.impl.QualityInfluenceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.impl.QualityInfluenceImpl#getQualityType <em>Quality Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QualityInfluenceImpl extends PropertyImpl implements QualityInfluence {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualityInfluenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternsPackage.Literals.QUALITY_INFLUENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EffectType getEffectType() {
		return (EffectType)eGet(EffectsPackage.Literals.EFFECT__EFFECT_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectType(EffectType newEffectType) {
		eSet(EffectsPackage.Literals.EFFECT__EFFECT_TYPE, newEffectType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eGet(EffectsPackage.Literals.EFFECT__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(EffectsPackage.Literals.EFFECT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityType getQualityType() {
		return (QualityType)eGet(EffectsPackage.Literals.QUALITY_EFFECT__QUALITY_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualityType(QualityType newQualityType) {
		eSet(EffectsPackage.Literals.QUALITY_EFFECT__QUALITY_TYPE, newQualityType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Effect.class) {
			switch (derivedFeatureID) {
				case PatternsPackage.QUALITY_INFLUENCE__EFFECT_TYPE: return EffectsPackage.EFFECT__EFFECT_TYPE;
				case PatternsPackage.QUALITY_INFLUENCE__DESCRIPTION: return EffectsPackage.EFFECT__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == QualityEffect.class) {
			switch (derivedFeatureID) {
				case PatternsPackage.QUALITY_INFLUENCE__QUALITY_TYPE: return EffectsPackage.QUALITY_EFFECT__QUALITY_TYPE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Effect.class) {
			switch (baseFeatureID) {
				case EffectsPackage.EFFECT__EFFECT_TYPE: return PatternsPackage.QUALITY_INFLUENCE__EFFECT_TYPE;
				case EffectsPackage.EFFECT__DESCRIPTION: return PatternsPackage.QUALITY_INFLUENCE__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == QualityEffect.class) {
			switch (baseFeatureID) {
				case EffectsPackage.QUALITY_EFFECT__QUALITY_TYPE: return PatternsPackage.QUALITY_INFLUENCE__QUALITY_TYPE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //QualityInfluenceImpl
