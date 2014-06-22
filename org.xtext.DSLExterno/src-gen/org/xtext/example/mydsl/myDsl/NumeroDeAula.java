/**
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numero De Aula</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.NumeroDeAula#getNumero <em>Numero</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getNumeroDeAula()
 * @model
 * @generated
 */
public interface NumeroDeAula extends Atributos
{
  /**
   * Returns the value of the '<em><b>Numero</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Numero</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Numero</em>' attribute.
   * @see #setNumero(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getNumeroDeAula_Numero()
   * @model
   * @generated
   */
  String getNumero();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.NumeroDeAula#getNumero <em>Numero</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Numero</em>' attribute.
   * @see #getNumero()
   * @generated
   */
  void setNumero(String value);

} // NumeroDeAula
