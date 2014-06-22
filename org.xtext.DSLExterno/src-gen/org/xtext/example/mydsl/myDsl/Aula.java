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
 *   <li>{@link org.xtext.example.mydsl.myDsl.Aula#getAtributos <em>Atributos</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Aula#getRecursos <em>Recursos</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAula()
 * @model
 * @generated
 */
public interface Aula extends Clase, Atributos
{
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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAula_Atributos()
   * @model containment="true"
   * @generated
   */
  EList<Atributos> getAtributos();

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
