/**
 */
package edu.kit.ipd.sdq.toometa.patterns.impl;

import edu.kit.ipd.sdq.toometa.patterns.Alternative;
import edu.kit.ipd.sdq.toometa.patterns.PatternsPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alternative</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.impl.AlternativeImpl#getAlternativeFor <em>Alternative For</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AlternativeImpl extends CDOObjectImpl implements Alternative {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlternativeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternsPackage.Literals.ALTERNATIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
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

} //AlternativeImpl
