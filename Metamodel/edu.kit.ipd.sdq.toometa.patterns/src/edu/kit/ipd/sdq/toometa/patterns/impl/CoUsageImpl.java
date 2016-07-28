/**
 */
package edu.kit.ipd.sdq.toometa.patterns.impl;

import edu.kit.ipd.sdq.toometa.patterns.CoUsage;
import edu.kit.ipd.sdq.toometa.patterns.PatternsPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Co Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.impl.CoUsageImpl#getUsedWith <em>Used With</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CoUsageImpl extends CDOObjectImpl implements CoUsage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternsPackage.Literals.CO_USAGE;
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
	public EList<CoUsage> getUsedWith() {
		return (EList<CoUsage>)eGet(PatternsPackage.Literals.CO_USAGE__USED_WITH, true);
	}

} //CoUsageImpl
