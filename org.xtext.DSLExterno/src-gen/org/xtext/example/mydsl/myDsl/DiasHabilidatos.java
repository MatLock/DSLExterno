/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dias Habilidatos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DiasHabilidatos#getDia <em>Dia</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DiasHabilidatos#getHoraInicio <em>Hora Inicio</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DiasHabilidatos#getHoraFinal <em>Hora Final</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDiasHabilidatos()
 * @model
 * @generated
 */
public interface DiasHabilidatos extends EObject
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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDiasHabilidatos_Dia()
   * @model
   * @generated
   */
  Dia getDia();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DiasHabilidatos#getDia <em>Dia</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dia</em>' attribute.
   * @see org.xtext.example.mydsl.myDsl.Dia
   * @see #getDia()
   * @generated
   */
  void setDia(Dia value);

  /**
   * Returns the value of the '<em><b>Hora Inicio</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hora Inicio</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hora Inicio</em>' attribute.
   * @see #setHoraInicio(int)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDiasHabilidatos_HoraInicio()
   * @model
   * @generated
   */
  int getHoraInicio();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DiasHabilidatos#getHoraInicio <em>Hora Inicio</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hora Inicio</em>' attribute.
   * @see #getHoraInicio()
   * @generated
   */
  void setHoraInicio(int value);

  /**
   * Returns the value of the '<em><b>Hora Final</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hora Final</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hora Final</em>' attribute.
   * @see #setHoraFinal(int)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDiasHabilidatos_HoraFinal()
   * @model
   * @generated
   */
  int getHoraFinal();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DiasHabilidatos#getHoraFinal <em>Hora Final</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hora Final</em>' attribute.
   * @see #getHoraFinal()
   * @generated
   */
  void setHoraFinal(int value);

} // DiasHabilidatos
