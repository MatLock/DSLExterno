/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Planificacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Planificacion#getAnio <em>Anio</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Planificacion#getSemestre <em>Semestre</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Planificacion#getMaterias <em>Materias</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Planificacion#getAsignaciones <em>Asignaciones</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPlanificacion()
 * @model
 * @generated
 */
public interface Planificacion extends Clase
{
  /**
   * Returns the value of the '<em><b>Anio</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Anio</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Anio</em>' attribute.
   * @see #setAnio(int)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPlanificacion_Anio()
   * @model
   * @generated
   */
  int getAnio();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Planificacion#getAnio <em>Anio</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Anio</em>' attribute.
   * @see #getAnio()
   * @generated
   */
  void setAnio(int value);

  /**
   * Returns the value of the '<em><b>Semestre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Semestre</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Semestre</em>' attribute.
   * @see #setSemestre(int)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPlanificacion_Semestre()
   * @model
   * @generated
   */
  int getSemestre();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Planificacion#getSemestre <em>Semestre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Semestre</em>' attribute.
   * @see #getSemestre()
   * @generated
   */
  void setSemestre(int value);

  /**
   * Returns the value of the '<em><b>Materias</b></em>' reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Materia}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Materias</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Materias</em>' reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPlanificacion_Materias()
   * @model
   * @generated
   */
  EList<Materia> getMaterias();

  /**
   * Returns the value of the '<em><b>Asignaciones</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Asignacion}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Asignaciones</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Asignaciones</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPlanificacion_Asignaciones()
   * @model containment="true"
   * @generated
   */
  EList<Asignacion> getAsignaciones();

} // Planificacion
