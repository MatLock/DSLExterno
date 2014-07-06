/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dias Habilitados</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DiasHabilitados#getDia <em>Dia</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DiasHabilitados#getHoraInicio <em>Hora Inicio</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DiasHabilitados#getHoraFinal <em>Hora Final</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DiasHabilitados#getDiaQueNoPuede <em>Dia Que No Puede</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDiasHabilitados()
 * @model
 * @generated
 */
public interface DiasHabilitados extends EObject
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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDiasHabilitados_Dia()
   * @model
   * @generated
   */
  Dia getDia();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DiasHabilitados#getDia <em>Dia</em>}' attribute.
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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDiasHabilitados_HoraInicio()
   * @model
   * @generated
   */
  int getHoraInicio();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DiasHabilitados#getHoraInicio <em>Hora Inicio</em>}' attribute.
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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDiasHabilitados_HoraFinal()
   * @model
   * @generated
   */
  int getHoraFinal();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DiasHabilitados#getHoraFinal <em>Hora Final</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hora Final</em>' attribute.
   * @see #getHoraFinal()
   * @generated
   */
  void setHoraFinal(int value);

  /**
   * Returns the value of the '<em><b>Dia Que No Puede</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.myDsl.Dia}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dia Que No Puede</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dia Que No Puede</em>' attribute.
   * @see org.xtext.example.mydsl.myDsl.Dia
   * @see #setDiaQueNoPuede(Dia)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDiasHabilitados_DiaQueNoPuede()
   * @model
   * @generated
   */
  Dia getDiaQueNoPuede();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DiasHabilitados#getDiaQueNoPuede <em>Dia Que No Puede</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dia Que No Puede</em>' attribute.
   * @see org.xtext.example.mydsl.myDsl.Dia
   * @see #getDiaQueNoPuede()
   * @generated
   */
  void setDiaQueNoPuede(Dia value);

} // DiasHabilitados
