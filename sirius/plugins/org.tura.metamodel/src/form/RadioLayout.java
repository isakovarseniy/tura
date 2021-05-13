/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

/**
 */
package form;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Radio Layout</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see form.FormPackage#getRadioLayout()
 * @model
 * @generated
 */
public enum RadioLayout implements Enumerator {
	/**
	 * The '<em><b>Line Direction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINE_DIRECTION_VALUE
	 * @generated
	 * @ordered
	 */
	LINE_DIRECTION(0, "lineDirection", "lineDirection"),

	/**
	 * The '<em><b>Page Direction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAGE_DIRECTION_VALUE
	 * @generated
	 * @ordered
	 */
	PAGE_DIRECTION(1, "pageDirection", "pageDirection"),

	/**
	 * The '<em><b>Custom</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM(2, "custom", "custom"),

	/**
	 * The '<em><b>Responsive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESPONSIVE_VALUE
	 * @generated
	 * @ordered
	 */
	RESPONSIVE(3, "responsive", "responsive"),

	/**
	 * The '<em><b>Grid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRID_VALUE
	 * @generated
	 * @ordered
	 */
	GRID(4, "grid", "grid");

	/**
	 * The '<em><b>Line Direction</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Line Direction</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LINE_DIRECTION
	 * @model name="lineDirection"
	 * @generated
	 * @ordered
	 */
	public static final int LINE_DIRECTION_VALUE = 0;

	/**
	 * The '<em><b>Page Direction</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Page Direction</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAGE_DIRECTION
	 * @model name="pageDirection"
	 * @generated
	 * @ordered
	 */
	public static final int PAGE_DIRECTION_VALUE = 1;

	/**
	 * The '<em><b>Custom</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Custom</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM
	 * @model name="custom"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM_VALUE = 2;

	/**
	 * The '<em><b>Responsive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Responsive</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESPONSIVE
	 * @model name="responsive"
	 * @generated
	 * @ordered
	 */
	public static final int RESPONSIVE_VALUE = 3;

	/**
	 * The '<em><b>Grid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Grid</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GRID
	 * @model name="grid"
	 * @generated
	 * @ordered
	 */
	public static final int GRID_VALUE = 4;

	/**
	 * An array of all the '<em><b>Radio Layout</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RadioLayout[] VALUES_ARRAY =
		new RadioLayout[] {
			LINE_DIRECTION,
			PAGE_DIRECTION,
			CUSTOM,
			RESPONSIVE,
			GRID,
		};

	/**
	 * A public read-only list of all the '<em><b>Radio Layout</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RadioLayout> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Radio Layout</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RadioLayout get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RadioLayout result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Radio Layout</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RadioLayout getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RadioLayout result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Radio Layout</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RadioLayout get(int value) {
		switch (value) {
			case LINE_DIRECTION_VALUE: return LINE_DIRECTION;
			case PAGE_DIRECTION_VALUE: return PAGE_DIRECTION;
			case CUSTOM_VALUE: return CUSTOM;
			case RESPONSIVE_VALUE: return RESPONSIVE;
			case GRID_VALUE: return GRID;
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
	private RadioLayout(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	
} //RadioLayout
