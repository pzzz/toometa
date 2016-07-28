/**
 */
package edu.kit.ipd.sdq.toometa.patterns.patternoptions.impl;

import edu.kit.ipd.sdq.toometa.options.impl.RationaleImpl;

import edu.kit.ipd.sdq.toometa.patterns.patternoptions.Answer;
import edu.kit.ipd.sdq.toometa.patterns.patternoptions.PatternRationale;
import edu.kit.ipd.sdq.toometa.patterns.patternoptions.PatternoptionsPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Rationale</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.patternoptions.impl.PatternRationaleImpl#getAnswers <em>Answers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatternRationaleImpl extends RationaleImpl implements PatternRationale {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternRationaleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternoptionsPackage.Literals.PATTERN_RATIONALE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Answer> getAnswers() {
		return (EList<Answer>)eGet(PatternoptionsPackage.Literals.PATTERN_RATIONALE__ANSWERS, true);
	}

} //PatternRationaleImpl
