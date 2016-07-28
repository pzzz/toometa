/**
 */
package edu.kit.ipd.sdq.toometa.patterns.impl;

import edu.kit.ipd.sdq.toometa.patterns.Pattern;
import edu.kit.ipd.sdq.toometa.patterns.PatternVariant;
import edu.kit.ipd.sdq.toometa.patterns.PatternsPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Variant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.impl.PatternVariantImpl#getBasePattern <em>Base Pattern</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatternVariantImpl extends PatternImpl implements PatternVariant {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternVariantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternsPackage.Literals.PATTERN_VARIANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern getBasePattern() {
		return (Pattern)eGet(PatternsPackage.Literals.PATTERN_VARIANT__BASE_PATTERN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasePattern(Pattern newBasePattern) {
		eSet(PatternsPackage.Literals.PATTERN_VARIANT__BASE_PATTERN, newBasePattern);
	}

} //PatternVariantImpl
