/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asignacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Asignacion#getDia <em>Dia</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Asignacion#getHorarios <em>Horarios</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAsignacion()
 * @model
 * @generated
 */
public interface Asignacion extends EObject
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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAsignacion_Dia()
   * @model
   * @generated
   */
  Dia getDia();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Asignacion#getDia <em>Dia</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dia</em>' attribute.
   * @see org.xtext.example.mydsl.myDsl.Dia
   * @see #getDia()
   * @generated
   */
  void setDia(Dia value);

  /**
   * Returns the value of the '<em><b>Horarios</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Horario}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Horarios</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Horarios</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAsignacion_Horarios()
   * @model containment="true"
   * @generated
   */
  EList<Horario> getHorarios();

} // Asignacion
