/**
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Profesor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Profesor#getNombre <em>Nombre</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Profesor#getDedicacion <em>Dedicacion</em>}</li>
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
   * Returns the value of the '<em><b>Nombre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nombre</em>' attribute.
   * @see #setNombre(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getProfesor_Nombre()
   * @model
   * @generated
   */
  String getNombre();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Profesor#getNombre <em>Nombre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nombre</em>' attribute.
   * @see #getNombre()
   * @generated
   */
  void setNombre(String value);

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

} // Profesor
