/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Curso</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Curso#getMateria <em>Materia</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Curso#getDictadaPor <em>Dictada Por</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Curso#getInscriptos <em>Inscriptos</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCurso()
 * @model
 * @generated
 */
public interface Curso extends EObject
{
  /**
   * Returns the value of the '<em><b>Materia</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Materia</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Materia</em>' reference.
   * @see #setMateria(Materia)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCurso_Materia()
   * @model
   * @generated
   */
  Materia getMateria();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Curso#getMateria <em>Materia</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Materia</em>' reference.
   * @see #getMateria()
   * @generated
   */
  void setMateria(Materia value);

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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCurso_DictadaPor()
   * @model
   * @generated
   */
  Profesor getDictadaPor();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Curso#getDictadaPor <em>Dictada Por</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dictada Por</em>' reference.
   * @see #getDictadaPor()
   * @generated
   */
  void setDictadaPor(Profesor value);

  /**
   * Returns the value of the '<em><b>Inscriptos</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inscriptos</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inscriptos</em>' attribute.
   * @see #setInscriptos(int)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCurso_Inscriptos()
   * @model
   * @generated
   */
  int getInscriptos();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Curso#getInscriptos <em>Inscriptos</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inscriptos</em>' attribute.
   * @see #getInscriptos()
   * @generated
   */
  void setInscriptos(int value);

} // Curso
