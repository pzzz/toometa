/**
 */
package edu.kit.ipd.sdq.toometa.jiraissues;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Tracking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.TimeTracking#getOriginalEstimateMinutes <em>Original Estimate Minutes</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.TimeTracking#getRemainingEstimateMinutes <em>Remaining Estimate Minutes</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.TimeTracking#getTimeSpentMinutes <em>Time Spent Minutes</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getTimeTracking()
 * @model
 * @generated
 */
public interface TimeTracking extends Identifier {
	/**
	 * Returns the value of the '<em><b>Original Estimate Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Estimate Minutes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Estimate Minutes</em>' attribute.
	 * @see #setOriginalEstimateMinutes(int)
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getTimeTracking_OriginalEstimateMinutes()
	 * @model
	 * @generated
	 */
	int getOriginalEstimateMinutes();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.jiraissues.TimeTracking#getOriginalEstimateMinutes <em>Original Estimate Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Estimate Minutes</em>' attribute.
	 * @see #getOriginalEstimateMinutes()
	 * @generated
	 */
	void setOriginalEstimateMinutes(int value);

	/**
	 * Returns the value of the '<em><b>Remaining Estimate Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remaining Estimate Minutes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remaining Estimate Minutes</em>' attribute.
	 * @see #setRemainingEstimateMinutes(int)
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getTimeTracking_RemainingEstimateMinutes()
	 * @model
	 * @generated
	 */
	int getRemainingEstimateMinutes();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.jiraissues.TimeTracking#getRemainingEstimateMinutes <em>Remaining Estimate Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remaining Estimate Minutes</em>' attribute.
	 * @see #getRemainingEstimateMinutes()
	 * @generated
	 */
	void setRemainingEstimateMinutes(int value);

	/**
	 * Returns the value of the '<em><b>Time Spent Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Spent Minutes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Spent Minutes</em>' attribute.
	 * @see #setTimeSpentMinutes(int)
	 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getTimeTracking_TimeSpentMinutes()
	 * @model
	 * @generated
	 */
	int getTimeSpentMinutes();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.toometa.jiraissues.TimeTracking#getTimeSpentMinutes <em>Time Spent Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Spent Minutes</em>' attribute.
	 * @see #getTimeSpentMinutes()
	 * @generated
	 */
	void setTimeSpentMinutes(int value);

} // TimeTracking
