/**
 */
package edu.kit.ipd.sdq.toometa.jiraissues;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Issue Types Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage#getIssueTypesEnum()
 * @model
 * @generated
 */
public enum IssueTypesEnum implements Enumerator {
	/**
	 * The '<em><b>New Feature</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEW_FEATURE_VALUE
	 * @generated
	 * @ordered
	 */
	NEW_FEATURE(0, "NewFeature", "NewFeature"),

	/**
	 * The '<em><b>Bug</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUG_VALUE
	 * @generated
	 * @ordered
	 */
	BUG(1, "Bug", "Bug"),

	/**
	 * The '<em><b>Task</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TASK_VALUE
	 * @generated
	 * @ordered
	 */
	TASK(2, "Task", "Task"),

	/**
	 * The '<em><b>Improvement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPROVEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	IMPROVEMENT(3, "Improvement", "Improvement"),

	/**
	 * The '<em><b>Test</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEST_VALUE
	 * @generated
	 * @ordered
	 */
	TEST(4, "Test", "Test");

	/**
	 * The '<em><b>New Feature</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>New Feature</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEW_FEATURE
	 * @model name="NewFeature"
	 * @generated
	 * @ordered
	 */
	public static final int NEW_FEATURE_VALUE = 0;

	/**
	 * The '<em><b>Bug</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bug</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUG
	 * @model name="Bug"
	 * @generated
	 * @ordered
	 */
	public static final int BUG_VALUE = 1;

	/**
	 * The '<em><b>Task</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Task</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TASK
	 * @model name="Task"
	 * @generated
	 * @ordered
	 */
	public static final int TASK_VALUE = 2;

	/**
	 * The '<em><b>Improvement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Improvement</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMPROVEMENT
	 * @model name="Improvement"
	 * @generated
	 * @ordered
	 */
	public static final int IMPROVEMENT_VALUE = 3;

	/**
	 * The '<em><b>Test</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Test</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEST
	 * @model name="Test"
	 * @generated
	 * @ordered
	 */
	public static final int TEST_VALUE = 4;

	/**
	 * An array of all the '<em><b>Issue Types Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IssueTypesEnum[] VALUES_ARRAY =
		new IssueTypesEnum[] {
			NEW_FEATURE,
			BUG,
			TASK,
			IMPROVEMENT,
			TEST,
		};

	/**
	 * A public read-only list of all the '<em><b>Issue Types Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IssueTypesEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Issue Types Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IssueTypesEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IssueTypesEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Issue Types Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IssueTypesEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IssueTypesEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Issue Types Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IssueTypesEnum get(int value) {
		switch (value) {
			case NEW_FEATURE_VALUE: return NEW_FEATURE;
			case BUG_VALUE: return BUG;
			case TASK_VALUE: return TASK;
			case IMPROVEMENT_VALUE: return IMPROVEMENT;
			case TEST_VALUE: return TEST;
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
	private IssueTypesEnum(int value, String name, String literal) {
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
	
} //IssueTypesEnum
