/**
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Horario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Horario#getHorarioInicio <em>Horario Inicio</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Horario#getHorarioFin <em>Horario Fin</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Horario#getAula <em>Aula</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getHorario()
 * @model
 * @generated
 */
public interface Horario extends Clase
{
  /**
   * Returns the value of the '<em><b>Horario Inicio</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Horario Inicio</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Horario Inicio</em>' attribute.
   * @see #setHorarioInicio(int)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getHorario_HorarioInicio()
   * @model
   * @generated
   */
  int getHorarioInicio();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Horario#getHorarioInicio <em>Horario Inicio</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Horario Inicio</em>' attribute.
   * @see #getHorarioInicio()
   * @generated
   */
  void setHorarioInicio(int value);

  /**
   * Returns the value of the '<em><b>Horario Fin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Horario Fin</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Horario Fin</em>' attribute.
   * @see #setHorarioFin(int)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getHorario_HorarioFin()
   * @model
   * @generated
   */
  int getHorarioFin();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Horario#getHorarioFin <em>Horario Fin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Horario Fin</em>' attribute.
   * @see #getHorarioFin()
   * @generated
   */
  void setHorarioFin(int value);

  /**
   * Returns the value of the '<em><b>Aula</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aula</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aula</em>' reference.
   * @see #setAula(Aula)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getHorario_Aula()
   * @model
   * @generated
   */
  Aula getAula();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Horario#getAula <em>Aula</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aula</em>' reference.
   * @see #getAula()
   * @generated
   */
  void setAula(Aula value);

} // Horario
