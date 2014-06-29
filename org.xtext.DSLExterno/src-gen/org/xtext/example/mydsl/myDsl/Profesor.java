/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Profesor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Profesor#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Profesor#getDedicacion <em>Dedicacion</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Profesor#getDiasQuePuede <em>Dias Que Puede</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getProfesor()
 * @model
 * @generated
 */
public interface Profesor extends Clase
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getProfesor_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Profesor#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Dedicacion</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.myDsl.Dedicacion}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dedicacion</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dedicacion</em>' attribute.
   * @see org.xtext.example.mydsl.myDsl.Dedicacion
   * @see #setDedicacion(Dedicacion)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getProfesor_Dedicacion()
   * @model
   * @generated
   */
  Dedicacion getDedicacion();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Profesor#getDedicacion <em>Dedicacion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dedicacion</em>' attribute.
   * @see org.xtext.example.mydsl.myDsl.Dedicacion
   * @see #getDedicacion()
   * @generated
   */
  void setDedicacion(Dedicacion value);

  /**
   * Returns the value of the '<em><b>Dias Que Puede</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.DiasHabilidatos}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dias Que Puede</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dias Que Puede</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getProfesor_DiasQuePuede()
   * @model containment="true"
   * @generated
   */
  EList<DiasHabilidatos> getDiasQuePuede();

} // Profesor
