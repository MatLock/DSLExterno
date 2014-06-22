/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Materia</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Materia#getAtributos <em>Atributos</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMateria()
 * @model
 * @generated
 */
public interface Materia extends Clase
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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMateria_Atributos()
   * @model containment="true"
   * @generated
   */
  EList<Atributos> getAtributos();

} // Materia
