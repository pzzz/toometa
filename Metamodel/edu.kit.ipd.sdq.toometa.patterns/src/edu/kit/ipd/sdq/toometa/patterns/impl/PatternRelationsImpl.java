/**
 */
package edu.kit.ipd.sdq.toometa.patterns.impl;

import edu.kit.ipd.sdq.toometa.patterns.Alternative;
import edu.kit.ipd.sdq.toometa.patterns.CoUsage;
import edu.kit.ipd.sdq.toometa.patterns.Exclusion;
import edu.kit.ipd.sdq.toometa.patterns.PatternRelations;
import edu.kit.ipd.sdq.toometa.patterns.PatternsPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Relations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.impl.PatternRelationsImpl#getExcludes <em>Excludes</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.impl.PatternRelationsImpl#getUsedWith <em>Used With</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.impl.PatternRelationsImpl#getAlternativeFor <em>Alternative For</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.impl.PatternRelationsImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PatternRelationsImpl extends SimilarImpl implements PatternRelations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternRelationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternsPackage.Literals.PATTERN_RELATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Exclusion> getExcludes() {
		return (EList<Exclusion>)eGet(PatternsPackage.Literals.EXCLUSION__EXCLUDES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CoUsage> getUsedWith() {
		return (EList<CoUsage>)eGet(PatternsPackage.Literals.CO_USAGE__USED_WITH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Alternative> getAlternativeFor() {
		return (EList<Alternative>)eGet(PatternsPackage.Literals.ALTERNATIVE__ALTERNATIVE_FOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eGet(PatternsPackage.Literals.PATTERN_RELATIONS__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(PatternsPackage.Literals.PATTERN_RELATIONS__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Exclusion.class) {
			switch (derivedFeatureID) {
				case PatternsPackage.PATTERN_RELATIONS__EXCLUDES: return PatternsPackage.EXCLUSION__EXCLUDES;
				default: return -1;
			}
		}
		if (baseClass == CoUsage.class) {
			switch (derivedFeatureID) {
				case PatternsPackage.PATTERN_RELATIONS__USED_WITH: return PatternsPackage.CO_USAGE__USED_WITH;
				default: return -1;
			}
		}
		if (baseClass == Alternative.class) {
			switch (derivedFeatureID) {
				case PatternsPackage.PATTERN_RELATIONS__ALTERNATIVE_FOR: return PatternsPackage.ALTERNATIVE__ALTERNATIVE_FOR;
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
		if (baseClass == Exclusion.class) {
			switch (baseFeatureID) {
				case PatternsPackage.EXCLUSION__EXCLUDES: return PatternsPackage.PATTERN_RELATIONS__EXCLUDES;
				default: return -1;
			}
		}
		if (baseClass == CoUsage.class) {
			switch (baseFeatureID) {
				case PatternsPackage.CO_USAGE__USED_WITH: return PatternsPackage.PATTERN_RELATIONS__USED_WITH;
				default: return -1;
			}
		}
		if (baseClass == Alternative.class) {
			switch (baseFeatureID) {
				case PatternsPackage.ALTERNATIVE__ALTERNATIVE_FOR: return PatternsPackage.PATTERN_RELATIONS__ALTERNATIVE_FOR;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //PatternRelationsImpl
