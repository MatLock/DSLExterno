/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aula</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Aula#getIdAula <em>Id Aula</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Aula#getRecursos <em>Recursos</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAula()
 * @model
 * @generated
 */
public interface Aula extends Clase
{
  /**
   * Returns the value of the '<em><b>Id Aula</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id Aula</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id Aula</em>' attribute.
   * @see #setIdAula(int)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAula_IdAula()
   * @model
   * @generated
   */
  int getIdAula();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Aula#getIdAula <em>Id Aula</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id Aula</em>' attribute.
   * @see #getIdAula()
   * @generated
   */
  void setIdAula(int value);

  /**
   * Returns the value of the '<em><b>Recursos</b></em>' attribute list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Recursos}.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.myDsl.Recursos}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Recursos</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Recursos</em>' attribute list.
   * @see org.xtext.example.mydsl.myDsl.Recursos
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAula_Recursos()
   * @model unique="false"
   * @generated
   */
  EList<Recursos> getRecursos();

} // Aula
