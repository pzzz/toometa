/**
 */
package edu.kit.ipd.sdq.toometa.pcmarchoptions.impl;

import edu.kit.ipd.sdq.toometa.archoptions.impl.BanComponentImpl;

import edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_BanComponent;
import edu.kit.ipd.sdq.toometa.pcmarchoptions.PcmarchoptionsPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCM Ban Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.impl.PCM_BanComponentImpl#getBannedContextName <em>Banned Context Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCM_BanComponentImpl extends BanComponentImpl implements PCM_BanComponent {
	/**
	 * The default value of the '{@link #getBannedContextName() <em>Banned Context Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBannedContextName()
	 * @generated
	 * @ordered
	 */
	protected static final String BANNED_CONTEXT_NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCM_BanComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcmarchoptionsPackage.Literals.PCM_BAN_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBannedContextName() {
		return (String)eDynamicGet(PcmarchoptionsPackage.PCM_BAN_COMPONENT__BANNED_CONTEXT_NAME, PcmarchoptionsPackage.Literals.PCM_BAN_COMPONENT__BANNED_CONTEXT_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBannedContextName(String newBannedContextName) {
		eDynamicSet(PcmarchoptionsPackage.PCM_BAN_COMPONENT__BANNED_CONTEXT_NAME, PcmarchoptionsPackage.Literals.PCM_BAN_COMPONENT__BANNED_CONTEXT_NAME, newBannedContextName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PcmarchoptionsPackage.PCM_BAN_COMPONENT__BANNED_CONTEXT_NAME:
				return getBannedContextName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PcmarchoptionsPackage.PCM_BAN_COMPONENT__BANNED_CONTEXT_NAME:
				setBannedContextName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PcmarchoptionsPackage.PCM_BAN_COMPONENT__BANNED_CONTEXT_NAME:
				setBannedContextName(BANNED_CONTEXT_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PcmarchoptionsPackage.PCM_BAN_COMPONENT__BANNED_CONTEXT_NAME:
				return BANNED_CONTEXT_NAME_EDEFAULT == null ? getBannedContextName() != null : !BANNED_CONTEXT_NAME_EDEFAULT.equals(getBannedContextName());
		}
		return super.eIsSet(featureID);
	}

} //PCM_BanComponentImpl
