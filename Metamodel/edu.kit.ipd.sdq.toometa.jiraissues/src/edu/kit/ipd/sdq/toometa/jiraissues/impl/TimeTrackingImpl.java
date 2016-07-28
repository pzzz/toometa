/**
 */
package edu.kit.ipd.sdq.toometa.jiraissues.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage;
import edu.kit.ipd.sdq.toometa.jiraissues.TimeTracking;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Tracking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.TimeTrackingImpl#getOriginalEstimateMinutes <em>Original Estimate Minutes</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.TimeTrackingImpl#getRemainingEstimateMinutes <em>Remaining Estimate Minutes</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.TimeTrackingImpl#getTimeSpentMinutes <em>Time Spent Minutes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeTrackingImpl extends IdentifierImpl implements TimeTracking {
	/**
	 * The default value of the '{@link #getOriginalEstimateMinutes() <em>Original Estimate Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalEstimateMinutes()
	 * @generated
	 * @ordered
	 */
	protected static final int ORIGINAL_ESTIMATE_MINUTES_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getRemainingEstimateMinutes() <em>Remaining Estimate Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingEstimateMinutes()
	 * @generated
	 * @ordered
	 */
	protected static final int REMAINING_ESTIMATE_MINUTES_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getTimeSpentMinutes() <em>Time Spent Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSpentMinutes()
	 * @generated
	 * @ordered
	 */
	protected static final int TIME_SPENT_MINUTES_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeTrackingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JiraissuesPackage.Literals.TIME_TRACKING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOriginalEstimateMinutes() {
		return (Integer)eDynamicGet(JiraissuesPackage.TIME_TRACKING__ORIGINAL_ESTIMATE_MINUTES, JiraissuesPackage.Literals.TIME_TRACKING__ORIGINAL_ESTIMATE_MINUTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalEstimateMinutes(int newOriginalEstimateMinutes) {
		eDynamicSet(JiraissuesPackage.TIME_TRACKING__ORIGINAL_ESTIMATE_MINUTES, JiraissuesPackage.Literals.TIME_TRACKING__ORIGINAL_ESTIMATE_MINUTES, newOriginalEstimateMinutes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRemainingEstimateMinutes() {
		return (Integer)eDynamicGet(JiraissuesPackage.TIME_TRACKING__REMAINING_ESTIMATE_MINUTES, JiraissuesPackage.Literals.TIME_TRACKING__REMAINING_ESTIMATE_MINUTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemainingEstimateMinutes(int newRemainingEstimateMinutes) {
		eDynamicSet(JiraissuesPackage.TIME_TRACKING__REMAINING_ESTIMATE_MINUTES, JiraissuesPackage.Literals.TIME_TRACKING__REMAINING_ESTIMATE_MINUTES, newRemainingEstimateMinutes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTimeSpentMinutes() {
		return (Integer)eDynamicGet(JiraissuesPackage.TIME_TRACKING__TIME_SPENT_MINUTES, JiraissuesPackage.Literals.TIME_TRACKING__TIME_SPENT_MINUTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeSpentMinutes(int newTimeSpentMinutes) {
		eDynamicSet(JiraissuesPackage.TIME_TRACKING__TIME_SPENT_MINUTES, JiraissuesPackage.Literals.TIME_TRACKING__TIME_SPENT_MINUTES, newTimeSpentMinutes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JiraissuesPackage.TIME_TRACKING__ORIGINAL_ESTIMATE_MINUTES:
				return getOriginalEstimateMinutes();
			case JiraissuesPackage.TIME_TRACKING__REMAINING_ESTIMATE_MINUTES:
				return getRemainingEstimateMinutes();
			case JiraissuesPackage.TIME_TRACKING__TIME_SPENT_MINUTES:
				return getTimeSpentMinutes();
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
			case JiraissuesPackage.TIME_TRACKING__ORIGINAL_ESTIMATE_MINUTES:
				setOriginalEstimateMinutes((Integer)newValue);
				return;
			case JiraissuesPackage.TIME_TRACKING__REMAINING_ESTIMATE_MINUTES:
				setRemainingEstimateMinutes((Integer)newValue);
				return;
			case JiraissuesPackage.TIME_TRACKING__TIME_SPENT_MINUTES:
				setTimeSpentMinutes((Integer)newValue);
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
			case JiraissuesPackage.TIME_TRACKING__ORIGINAL_ESTIMATE_MINUTES:
				setOriginalEstimateMinutes(ORIGINAL_ESTIMATE_MINUTES_EDEFAULT);
				return;
			case JiraissuesPackage.TIME_TRACKING__REMAINING_ESTIMATE_MINUTES:
				setRemainingEstimateMinutes(REMAINING_ESTIMATE_MINUTES_EDEFAULT);
				return;
			case JiraissuesPackage.TIME_TRACKING__TIME_SPENT_MINUTES:
				setTimeSpentMinutes(TIME_SPENT_MINUTES_EDEFAULT);
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
			case JiraissuesPackage.TIME_TRACKING__ORIGINAL_ESTIMATE_MINUTES:
				return getOriginalEstimateMinutes() != ORIGINAL_ESTIMATE_MINUTES_EDEFAULT;
			case JiraissuesPackage.TIME_TRACKING__REMAINING_ESTIMATE_MINUTES:
				return getRemainingEstimateMinutes() != REMAINING_ESTIMATE_MINUTES_EDEFAULT;
			case JiraissuesPackage.TIME_TRACKING__TIME_SPENT_MINUTES:
				return getTimeSpentMinutes() != TIME_SPENT_MINUTES_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //TimeTrackingImpl
