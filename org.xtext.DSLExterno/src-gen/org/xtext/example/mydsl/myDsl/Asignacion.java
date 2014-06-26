/**
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asignacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Asignacion#getDia <em>Dia</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Asignacion#getHorario <em>Horario</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Asignacion#getMateria <em>Materia</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAsignacion()
 * @model
 * @generated
 */
public interface Asignacion extends Clase
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
   * Returns the value of the '<em><b>Horario</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Horario</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Horario</em>' containment reference.
   * @see #setHorario(Horario)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAsignacion_Horario()
   * @model containment="true"
   * @generated
   */
  Horario getHorario();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Asignacion#getHorario <em>Horario</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Horario</em>' containment reference.
   * @see #getHorario()
   * @generated
   */
  void setHorario(Horario value);

  /**
   * Returns the value of the '<em><b>Materia</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Materia</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Materia</em>' reference.
   * @see #setMateria(Materia)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAsignacion_Materia()
   * @model
   * @generated
   */
  Materia getMateria();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Asignacion#getMateria <em>Materia</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Materia</em>' reference.
   * @see #getMateria()
   * @generated
   */
  void setMateria(Materia value);

} // Asignacion
