/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Horarios</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Horarios#getHorarioInicion <em>Horario Inicion</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Horarios#getHorarionFin <em>Horarion Fin</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Horarios#getAula <em>Aula</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Horarios#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getHorarios()
 * @model
 * @generated
 */
public interface Horarios extends Atributos
{
  /**
   * Returns the value of the '<em><b>Horario Inicion</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Horario Inicion</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Horario Inicion</em>' attribute.
   * @see #setHorarioInicion(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getHorarios_HorarioInicion()
   * @model
   * @generated
   */
  String getHorarioInicion();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Horarios#getHorarioInicion <em>Horario Inicion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Horario Inicion</em>' attribute.
   * @see #getHorarioInicion()
   * @generated
   */
  void setHorarioInicion(String value);

  /**
   * Returns the value of the '<em><b>Horarion Fin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Horarion Fin</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Horarion Fin</em>' attribute.
   * @see #setHorarionFin(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getHorarios_HorarionFin()
   * @model
   * @generated
   */
  String getHorarionFin();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Horarios#getHorarionFin <em>Horarion Fin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Horarion Fin</em>' attribute.
   * @see #getHorarionFin()
   * @generated
   */
  void setHorarionFin(String value);

  /**
   * Returns the value of the '<em><b>Aula</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aula</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aula</em>' attribute.
   * @see #setAula(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getHorarios_Aula()
   * @model
   * @generated
   */
  String getAula();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Horarios#getAula <em>Aula</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aula</em>' attribute.
   * @see #getAula()
   * @generated
   */
  void setAula(String value);

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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getHorarios_Type()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Horarios#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(JvmTypeReference value);

} // Horarios
