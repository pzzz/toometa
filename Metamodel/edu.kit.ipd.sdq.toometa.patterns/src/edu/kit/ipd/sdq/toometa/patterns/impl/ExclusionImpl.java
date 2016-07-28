/**
 */
package edu.kit.ipd.sdq.toometa.patterns.impl;

import edu.kit.ipd.sdq.toometa.patterns.Exclusion;
import edu.kit.ipd.sdq.toometa.patterns.PatternsPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exclusion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.impl.ExclusionImpl#getExcludes <em>Excludes</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ExclusionImpl extends CDOObjectImpl implements Exclusion {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExclusionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternsPackage.Literals.EXCLUSION;
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
	public EList<Exclusion> getExcludes() {
		return (EList<Exclusion>)eGet(PatternsPackage.Literals.EXCLUSION__EXCLUDES, true);
	}

} //ExclusionImpl
