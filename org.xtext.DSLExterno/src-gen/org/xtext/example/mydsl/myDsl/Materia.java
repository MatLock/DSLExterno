/**
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Materia</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Materia#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Materia#getCantidadDeDias <em>Cantidad De Dias</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Materia#getCargaHoraria <em>Carga Horaria</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Materia#getDictadaPor <em>Dictada Por</em>}</li>
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
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMateria_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Materia#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Cantidad De Dias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cantidad De Dias</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cantidad De Dias</em>' attribute.
   * @see #setCantidadDeDias(int)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMateria_CantidadDeDias()
   * @model
   * @generated
   */
  int getCantidadDeDias();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Materia#getCantidadDeDias <em>Cantidad De Dias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cantidad De Dias</em>' attribute.
   * @see #getCantidadDeDias()
   * @generated
   */
  void setCantidadDeDias(int value);

  /**
   * Returns the value of the '<em><b>Carga Horaria</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Carga Horaria</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Carga Horaria</em>' attribute.
   * @see #setCargaHoraria(int)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMateria_CargaHoraria()
   * @model
   * @generated
   */
  int getCargaHoraria();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Materia#getCargaHoraria <em>Carga Horaria</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Carga Horaria</em>' attribute.
   * @see #getCargaHoraria()
   * @generated
   */
  void setCargaHoraria(int value);

  /**
   * Returns the value of the '<em><b>Dictada Por</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dictada Por</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dictada Por</em>' reference.
   * @see #setDictadaPor(Profesor)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMateria_DictadaPor()
   * @model
   * @generated
   */
  Profesor getDictadaPor();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Materia#getDictadaPor <em>Dictada Por</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dictada Por</em>' reference.
   * @see #getDictadaPor()
   * @generated
   */
  void setDictadaPor(Profesor value);

} // Materia
