/**
 */
package domain;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Platform Layers</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see domain.DomainPackage#getPlatformLayers()
 * @model
 * @generated
 */
public enum PlatformLayers implements Enumerator
{
  /**
	 * The '<em><b>Service Layer</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #SERVICE_LAYER_VALUE
	 * @generated
	 * @ordered
	 */
  SERVICE_LAYER(1, "ServiceLayer", "ServiceLayer"),

  /**
	 * The '<em><b>UI Layer</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #UI_LAYER_VALUE
	 * @generated
	 * @ordered
	 */
  UI_LAYER(2, "UILayer", "UILayer");

  /**
	 * The '<em><b>Service Layer</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Service Layer</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #SERVICE_LAYER
	 * @model name="ServiceLayer"
	 * @generated
	 * @ordered
	 */
  public static final int SERVICE_LAYER_VALUE = 1;

  /**
	 * The '<em><b>UI Layer</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>UI Layer</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #UI_LAYER
	 * @model name="UILayer"
	 * @generated
	 * @ordered
	 */
  public static final int UI_LAYER_VALUE = 2;

  /**
	 * An array of all the '<em><b>Platform Layers</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static final PlatformLayers[] VALUES_ARRAY =
    new PlatformLayers[] {
			SERVICE_LAYER,
			UI_LAYER,
		};

  /**
	 * A public read-only list of all the '<em><b>Platform Layers</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final List<PlatformLayers> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
	 * Returns the '<em><b>Platform Layers</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static PlatformLayers get(String literal)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PlatformLayers result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Platform Layers</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static PlatformLayers getByName(String name)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PlatformLayers result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Platform Layers</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static PlatformLayers get(int value)
  {
		switch (value) {
			case SERVICE_LAYER_VALUE: return SERVICE_LAYER;
			case UI_LAYER_VALUE: return UI_LAYER;
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
  private PlatformLayers(int value, String name, String literal)
  {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getValue()
  {
	  return value;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getName()
  {
	  return name;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getLiteral()
  {
	  return literal;
	}

  /**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		return literal;
	}
  
} //PlatformLayers
