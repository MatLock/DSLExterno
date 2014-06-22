/**
 */
package org.xtext.example.mydsl.myDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Recursos</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRecursos()
 * @model
 * @generated
 */
public enum Recursos implements Enumerator
{
  /**
   * The '<em><b>Internet</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INTERNET_VALUE
   * @generated
   * @ordered
   */
  INTERNET(0, "Internet", "Internet"),

  /**
   * The '<em><b>Proyector</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PROYECTOR_VALUE
   * @generated
   * @ordered
   */
  PROYECTOR(1, "Proyector", "Proyector"),

  /**
   * The '<em><b>Maquinas Para Alumnos</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MAQUINAS_PARA_ALUMNOS_VALUE
   * @generated
   * @ordered
   */
  MAQUINAS_PARA_ALUMNOS(2, "MaquinasParaAlumnos", "MaquinasParaAlumnos"),

  /**
   * The '<em><b>Maquina Para El Profesor</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MAQUINA_PARA_EL_PROFESOR_VALUE
   * @generated
   * @ordered
   */
  MAQUINA_PARA_EL_PROFESOR(3, "MaquinaParaElProfesor", "MaquinaParaElProfesor");

  /**
   * The '<em><b>Internet</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Internet</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INTERNET
   * @model name="Internet"
   * @generated
   * @ordered
   */
  public static final int INTERNET_VALUE = 0;

  /**
   * The '<em><b>Proyector</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Proyector</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PROYECTOR
   * @model name="Proyector"
   * @generated
   * @ordered
   */
  public static final int PROYECTOR_VALUE = 1;

  /**
   * The '<em><b>Maquinas Para Alumnos</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Maquinas Para Alumnos</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MAQUINAS_PARA_ALUMNOS
   * @model name="MaquinasParaAlumnos"
   * @generated
   * @ordered
   */
  public static final int MAQUINAS_PARA_ALUMNOS_VALUE = 2;

  /**
   * The '<em><b>Maquina Para El Profesor</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Maquina Para El Profesor</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MAQUINA_PARA_EL_PROFESOR
   * @model name="MaquinaParaElProfesor"
   * @generated
   * @ordered
   */
  public static final int MAQUINA_PARA_EL_PROFESOR_VALUE = 3;

  /**
   * An array of all the '<em><b>Recursos</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Recursos[] VALUES_ARRAY =
    new Recursos[]
    {
      INTERNET,
      PROYECTOR,
      MAQUINAS_PARA_ALUMNOS,
      MAQUINA_PARA_EL_PROFESOR,
    };

  /**
   * A public read-only list of all the '<em><b>Recursos</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Recursos> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Recursos</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Recursos get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Recursos result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Recursos</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Recursos getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Recursos result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Recursos</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Recursos get(int value)
  {
    switch (value)
    {
      case INTERNET_VALUE: return INTERNET;
      case PROYECTOR_VALUE: return PROYECTOR;
      case MAQUINAS_PARA_ALUMNOS_VALUE: return MAQUINAS_PARA_ALUMNOS;
      case MAQUINA_PARA_EL_PROFESOR_VALUE: return MAQUINA_PARA_EL_PROFESOR;
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
  private Recursos(int value, String name, String literal)
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
  
} //Recursos
