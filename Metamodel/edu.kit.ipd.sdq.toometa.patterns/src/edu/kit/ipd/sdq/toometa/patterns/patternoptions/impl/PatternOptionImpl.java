/**
 */
package edu.kit.ipd.sdq.toometa.patterns.patternoptions.impl;

import edu.kit.ipd.sdq.toometa.options.impl.OptionImpl;

import edu.kit.ipd.sdq.toometa.patterns.patternoptions.PatternOption;
import edu.kit.ipd.sdq.toometa.patterns.patternoptions.PatternRationale;
import edu.kit.ipd.sdq.toometa.patterns.patternoptions.PatternoptionsPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.patternoptions.impl.PatternOptionImpl#getPatternrationale <em>Patternrationale</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatternOptionImpl extends OptionImpl implements PatternOption {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternOptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternoptionsPackage.Literals.PATTERN_OPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PatternRationale> getPatternrationale() {
		return (EList<PatternRationale>)eGet(PatternoptionsPackage.Literals.PATTERN_OPTION__PATTERNRATIONALE, true);
	}

} //PatternOptionImpl
