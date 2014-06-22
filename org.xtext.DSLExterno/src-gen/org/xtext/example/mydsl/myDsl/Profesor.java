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
 *   <li>{@link org.xtext.example.mydsl.myDsl.Profesor#getDedicacion <em>Dedicacion</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Profesor#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Profesor#getAtributos <em>Atributos</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getProfesor()
 * @model
 * @generated
 */
public interface Profesor extends Clase, Atributos
{
  /**
   * Returns the value of the '<em><b>Dedicacion</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dedicacion</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dedicacion</em>' attribute.
   * @see #setDedicacion(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getProfesor_Dedicacion()
   * @model
   * @generated
   */
  String getDedicacion();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Profesor#getDedicacion <em>Dedicacion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dedicacion</em>' attribute.
   * @see #getDedicacion()
   * @generated
   */
  void setDedicacion(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.myDsl.Dedicacion}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.xtext.example.mydsl.myDsl.Dedicacion
   * @see #setType(Dedicacion)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getProfesor_Type()
   * @model
   * @generated
   */
  Dedicacion getType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Profesor#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.xtext.example.mydsl.myDsl.Dedicacion
   * @see #getType()
   * @generated
   */
  void setType(Dedicacion value);

  /**
   * Returns the value of the '<em><b>Atributos</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Atributos}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Atributos</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atributos</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getProfesor_Atributos()
   * @model containment="true"
   * @generated
   */
  EList<Atributos> getAtributos();

} // Profesor
