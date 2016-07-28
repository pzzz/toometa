/**
 */
package edu.kit.ipd.sdq.toometa.pcmarchoptions.impl;

import edu.kit.ipd.sdq.toometa.archoptions.impl.ReplaceComponentsImpl;

import edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_ReplaceComponents;
import edu.kit.ipd.sdq.toometa.pcmarchoptions.PcmarchoptionsPackage;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCM Replace Components</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.impl.PCM_ReplaceComponentsImpl#getContextReplacedWith <em>Context Replaced With</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.impl.PCM_ReplaceComponentsImpl#getReplacedContextName <em>Replaced Context Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCM_ReplaceComponentsImpl extends ReplaceComponentsImpl implements PCM_ReplaceComponents {
	/**
	 * The default value of the '{@link #getReplacedContextName() <em>Replaced Context Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplacedContextName()
	 * @generated
	 * @ordered
	 */
	protected static final String REPLACED_CONTEXT_NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCM_ReplaceComponentsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcmarchoptionsPackage.Literals.PCM_REPLACE_COMPONENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext getContextReplacedWith() {
		return (AssemblyContext)eDynamicGet(PcmarchoptionsPackage.PCM_REPLACE_COMPONENTS__CONTEXT_REPLACED_WITH, PcmarchoptionsPackage.Literals.PCM_REPLACE_COMPONENTS__CONTEXT_REPLACED_WITH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext basicGetContextReplacedWith() {
		return (AssemblyContext)eDynamicGet(PcmarchoptionsPackage.PCM_REPLACE_COMPONENTS__CONTEXT_REPLACED_WITH, PcmarchoptionsPackage.Literals.PCM_REPLACE_COMPONENTS__CONTEXT_REPLACED_WITH, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextReplacedWith(AssemblyContext newContextReplacedWith) {
		eDynamicSet(PcmarchoptionsPackage.PCM_REPLACE_COMPONENTS__CONTEXT_REPLACED_WITH, PcmarchoptionsPackage.Literals.PCM_REPLACE_COMPONENTS__CONTEXT_REPLACED_WITH, newContextReplacedWith);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReplacedContextName() {
		return (String)eDynamicGet(PcmarchoptionsPackage.PCM_REPLACE_COMPONENTS__REPLACED_CONTEXT_NAME, PcmarchoptionsPackage.Literals.PCM_REPLACE_COMPONENTS__REPLACED_CONTEXT_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplacedContextName(String newReplacedContextName) {
		eDynamicSet(PcmarchoptionsPackage.PCM_REPLACE_COMPONENTS__REPLACED_CONTEXT_NAME, PcmarchoptionsPackage.Literals.PCM_REPLACE_COMPONENTS__REPLACED_CONTEXT_NAME, newReplacedContextName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PcmarchoptionsPackage.PCM_REPLACE_COMPONENTS__CONTEXT_REPLACED_WITH:
				if (resolve) return getContextReplacedWith();
				return basicGetContextReplacedWith();
			case PcmarchoptionsPackage.PCM_REPLACE_COMPONENTS__REPLACED_CONTEXT_NAME:
				return getReplacedContextName();
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
			case PcmarchoptionsPackage.PCM_REPLACE_COMPONENTS__CONTEXT_REPLACED_WITH:
				setContextReplacedWith((AssemblyContext)newValue);
				return;
			case PcmarchoptionsPackage.PCM_REPLACE_COMPONENTS__REPLACED_CONTEXT_NAME:
				setReplacedContextName((String)newValue);
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
			case PcmarchoptionsPackage.PCM_REPLACE_COMPONENTS__CONTEXT_REPLACED_WITH:
				setContextReplacedWith((AssemblyContext)null);
				return;
			case PcmarchoptionsPackage.PCM_REPLACE_COMPONENTS__REPLACED_CONTEXT_NAME:
				setReplacedContextName(REPLACED_CONTEXT_NAME_EDEFAULT);
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
			case PcmarchoptionsPackage.PCM_REPLACE_COMPONENTS__CONTEXT_REPLACED_WITH:
				return basicGetContextReplacedWith() != null;
			case PcmarchoptionsPackage.PCM_REPLACE_COMPONENTS__REPLACED_CONTEXT_NAME:
				return REPLACED_CONTEXT_NAME_EDEFAULT == null ? getReplacedContextName() != null : !REPLACED_CONTEXT_NAME_EDEFAULT.equals(getReplacedContextName());
		}
		return super.eIsSet(featureID);
	}

} //PCM_ReplaceComponentsImpl
