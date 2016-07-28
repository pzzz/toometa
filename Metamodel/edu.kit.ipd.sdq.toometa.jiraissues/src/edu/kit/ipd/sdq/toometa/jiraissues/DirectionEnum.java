/**
 */
package edu.kit.ipd.sdq.toometa.jiraissues;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Direction Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getDirectionEnum()
 * @model
 * @generated
 */
public enum DirectionEnum implements Enumerator {
	/**
	 * The '<em><b>Outbound</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUTBOUND_VALUE
	 * @generated
	 * @ordered
	 */
	OUTBOUND(0, "outbound", "outbound"),

	/**
	 * The '<em><b>Inbound</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INBOUND_VALUE
	 * @generated
	 * @ordered
	 */
	INBOUND(1, "inbound", "inbound");

	/**
	 * The '<em><b>Outbound</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Outbound</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OUTBOUND
	 * @model name="outbound"
	 * @generated
	 * @ordered
	 */
	public static final int OUTBOUND_VALUE = 0;

	/**
	 * The '<em><b>Inbound</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Inbound</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INBOUND
	 * @model name="inbound"
	 * @generated
	 * @ordered
	 */
	public static final int INBOUND_VALUE = 1;

	/**
	 * An array of all the '<em><b>Direction Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DirectionEnum[] VALUES_ARRAY =
		new DirectionEnum[] {
			OUTBOUND,
			INBOUND,
		};

	/**
	 * A public read-only list of all the '<em><b>Direction Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DirectionEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Direction Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DirectionEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DirectionEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Direction Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DirectionEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DirectionEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Direction Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DirectionEnum get(int value) {
		switch (value) {
			case OUTBOUND_VALUE: return OUTBOUND;
			case INBOUND_VALUE: return INBOUND;
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
	private DirectionEnum(int value, String name, String literal) {
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
	
} //DirectionEnum
