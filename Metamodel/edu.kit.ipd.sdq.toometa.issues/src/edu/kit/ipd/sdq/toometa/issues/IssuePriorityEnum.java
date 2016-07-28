/**
 */
package edu.kit.ipd.sdq.toometa.issues;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Issue Priority Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.toometa.issues.IssuesPackage#getIssuePriorityEnum()
 * @model
 * @generated
 */
public enum IssuePriorityEnum implements Enumerator {
	/**
	 * The '<em><b>Trivial</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIVIAL_VALUE
	 * @generated
	 * @ordered
	 */
	TRIVIAL(0, "Trivial", "Trivial"),

	/**
	 * The '<em><b>Minor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINOR_VALUE
	 * @generated
	 * @ordered
	 */
	MINOR(1, "Minor", "Minor"),

	/**
	 * The '<em><b>Major</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAJOR_VALUE
	 * @generated
	 * @ordered
	 */
	MAJOR(2, "Major", "Major"),

	/**
	 * The '<em><b>Critical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRITICAL_VALUE
	 * @generated
	 * @ordered
	 */
	CRITICAL(3, "Critical", "Critical"),

	/**
	 * The '<em><b>Blocker</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLOCKER_VALUE
	 * @generated
	 * @ordered
	 */
	BLOCKER(4, "Blocker", "Blocker");

	/**
	 * The '<em><b>Trivial</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Trivial</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRIVIAL
	 * @model name="Trivial"
	 * @generated
	 * @ordered
	 */
	public static final int TRIVIAL_VALUE = 0;

	/**
	 * The '<em><b>Minor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Minor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MINOR
	 * @model name="Minor"
	 * @generated
	 * @ordered
	 */
	public static final int MINOR_VALUE = 1;

	/**
	 * The '<em><b>Major</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Major</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAJOR
	 * @model name="Major"
	 * @generated
	 * @ordered
	 */
	public static final int MAJOR_VALUE = 2;

	/**
	 * The '<em><b>Critical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Critical</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CRITICAL
	 * @model name="Critical"
	 * @generated
	 * @ordered
	 */
	public static final int CRITICAL_VALUE = 3;

	/**
	 * The '<em><b>Blocker</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Blocker</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BLOCKER
	 * @model name="Blocker"
	 * @generated
	 * @ordered
	 */
	public static final int BLOCKER_VALUE = 4;

	/**
	 * An array of all the '<em><b>Issue Priority Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IssuePriorityEnum[] VALUES_ARRAY =
		new IssuePriorityEnum[] {
			TRIVIAL,
			MINOR,
			MAJOR,
			CRITICAL,
			BLOCKER,
		};

	/**
	 * A public read-only list of all the '<em><b>Issue Priority Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IssuePriorityEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Issue Priority Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IssuePriorityEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IssuePriorityEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Issue Priority Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IssuePriorityEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IssuePriorityEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Issue Priority Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IssuePriorityEnum get(int value) {
		switch (value) {
			case TRIVIAL_VALUE: return TRIVIAL;
			case MINOR_VALUE: return MINOR;
			case MAJOR_VALUE: return MAJOR;
			case CRITICAL_VALUE: return CRITICAL;
			case BLOCKER_VALUE: return BLOCKER;
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
	private IssuePriorityEnum(int value, String name, String literal) {
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
	
} //IssuePriorityEnum
