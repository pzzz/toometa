/**
 */
package edu.kit.ipd.sdq.toometa.issues;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Issue Status Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.toometa.issues.IssuesPackage#getIssueStatusEnum()
 * @model
 * @generated
 */
public enum IssueStatusEnum implements Enumerator {
	/**
	 * The '<em><b>New</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEW_VALUE
	 * @generated
	 * @ordered
	 */
	NEW(0, "new", "new"),

	/**
	 * The '<em><b>Accepted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCEPTED_VALUE
	 * @generated
	 * @ordered
	 */
	ACCEPTED(1, "accepted", "accepted"),

	/**
	 * The '<em><b>Rejected</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REJECTED_VALUE
	 * @generated
	 * @ordered
	 */
	REJECTED(2, "rejected", "rejected"),

	/**
	 * The '<em><b>In Process</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_PROCESS_VALUE
	 * @generated
	 * @ordered
	 */
	IN_PROCESS(3, "inProcess", "inProcess"),

	/**
	 * The '<em><b>Resolved</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESOLVED_VALUE
	 * @generated
	 * @ordered
	 */
	RESOLVED(4, "resolved", "resolved"),

	/**
	 * The '<em><b>Closed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSED_VALUE
	 * @generated
	 * @ordered
	 */
	CLOSED(5, "closed", ""),

	/**
	 * The '<em><b>Reopened</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REOPENED_VALUE
	 * @generated
	 * @ordered
	 */
	REOPENED(6, "reopened", "reopened"),

	/**
	 * The '<em><b>Replaced</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPLACED_VALUE
	 * @generated
	 * @ordered
	 */
	REPLACED(7, "replaced", "replaced");

	/**
	 * The '<em><b>New</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>New</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEW
	 * @model name="new"
	 * @generated
	 * @ordered
	 */
	public static final int NEW_VALUE = 0;

	/**
	 * The '<em><b>Accepted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Accepted</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACCEPTED
	 * @model name="accepted"
	 * @generated
	 * @ordered
	 */
	public static final int ACCEPTED_VALUE = 1;

	/**
	 * The '<em><b>Rejected</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rejected</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REJECTED
	 * @model name="rejected"
	 * @generated
	 * @ordered
	 */
	public static final int REJECTED_VALUE = 2;

	/**
	 * The '<em><b>In Process</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>In Process</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IN_PROCESS
	 * @model name="inProcess"
	 * @generated
	 * @ordered
	 */
	public static final int IN_PROCESS_VALUE = 3;

	/**
	 * The '<em><b>Resolved</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Resolved</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESOLVED
	 * @model name="resolved"
	 * @generated
	 * @ordered
	 */
	public static final int RESOLVED_VALUE = 4;

	/**
	 * The '<em><b>Closed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Closed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLOSED
	 * @model name="closed" literal=""
	 * @generated
	 * @ordered
	 */
	public static final int CLOSED_VALUE = 5;

	/**
	 * The '<em><b>Reopened</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reopened</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REOPENED
	 * @model name="reopened"
	 * @generated
	 * @ordered
	 */
	public static final int REOPENED_VALUE = 6;

	/**
	 * The '<em><b>Replaced</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Replaced</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REPLACED
	 * @model name="replaced"
	 * @generated
	 * @ordered
	 */
	public static final int REPLACED_VALUE = 7;

	/**
	 * An array of all the '<em><b>Issue Status Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IssueStatusEnum[] VALUES_ARRAY =
		new IssueStatusEnum[] {
			NEW,
			ACCEPTED,
			REJECTED,
			IN_PROCESS,
			RESOLVED,
			CLOSED,
			REOPENED,
			REPLACED,
		};

	/**
	 * A public read-only list of all the '<em><b>Issue Status Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IssueStatusEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Issue Status Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IssueStatusEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IssueStatusEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Issue Status Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IssueStatusEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IssueStatusEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Issue Status Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IssueStatusEnum get(int value) {
		switch (value) {
			case NEW_VALUE: return NEW;
			case ACCEPTED_VALUE: return ACCEPTED;
			case REJECTED_VALUE: return REJECTED;
			case IN_PROCESS_VALUE: return IN_PROCESS;
			case RESOLVED_VALUE: return RESOLVED;
			case CLOSED_VALUE: return CLOSED;
			case REOPENED_VALUE: return REOPENED;
			case REPLACED_VALUE: return REPLACED;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private IssueStatusEnum(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //IssueStatusEnum
