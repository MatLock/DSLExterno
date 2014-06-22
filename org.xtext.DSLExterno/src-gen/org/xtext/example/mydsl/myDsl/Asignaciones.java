/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asignaciones</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Asignaciones#getDia <em>Dia</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Asignaciones#getHorario <em>Horario</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Asignaciones#getMateria <em>Materia</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Asignaciones#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAsignaciones()
 * @model
 * @generated
 */
public interface Asignaciones extends Atributos
{
  /**
   * Returns the value of the '<em><b>Dia</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.myDsl.Dia}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dia</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dia</em>' attribute.
   * @see org.xtext.example.mydsl.myDsl.Dia
   * @see #setDia(Dia)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAsignaciones_Dia()
   * @model
   * @generated
   */
  Dia getDia();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Asignaciones#getDia <em>Dia</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dia</em>' attribute.
   * @see org.xtext.example.mydsl.myDsl.Dia
   * @see #getDia()
   * @generated
   */
  void setDia(Dia value);

  /**
   * Returns the value of the '<em><b>Horario</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Horario</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Horario</em>' containment reference.
   * @see #setHorario(Horarios)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAsignaciones_Horario()
   * @model containment="true"
   * @generated
   */
  Horarios getHorario();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Asignaciones#getHorario <em>Horario</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Horario</em>' containment reference.
   * @see #getHorario()
   * @generated
   */
  void setHorario(Horarios value);

  /**
   * Returns the value of the '<em><b>Materia</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Materia</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Materia</em>' attribute.
   * @see #setMateria(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAsignaciones_Materia()
   * @model
   * @generated
   */
  String getMateria();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Asignaciones#getMateria <em>Materia</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Materia</em>' attribute.
   * @see #getMateria()
   * @generated
   */
  void setMateria(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(JvmTypeReference)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAsignaciones_Type()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Asignaciones#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(JvmTypeReference value);

} // Asignaciones
