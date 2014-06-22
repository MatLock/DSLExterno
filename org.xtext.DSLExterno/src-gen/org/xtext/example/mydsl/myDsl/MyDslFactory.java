/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage
 * @generated
 */
public interface MyDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslFactory eINSTANCE = org.xtext.example.mydsl.myDsl.impl.MyDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Clase</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Clase</em>'.
   * @generated
   */
  Clase createClase();

  /**
   * Returns a new object of class '<em>Atributos</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Atributos</em>'.
   * @generated
   */
  Atributos createAtributos();

  /**
   * Returns a new object of class '<em>Numero De Aula</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Numero De Aula</em>'.
   * @generated
   */
  NumeroDeAula createNumeroDeAula();

  /**
   * Returns a new object of class '<em>Cantidad De Dias</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cantidad De Dias</em>'.
   * @generated
   */
  CantidadDeDias createCantidadDeDias();

  /**
   * Returns a new object of class '<em>Horarios</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Horarios</em>'.
   * @generated
   */
  Horarios createHorarios();

  /**
   * Returns a new object of class '<em>Nombre</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Nombre</em>'.
   * @generated
   */
  Nombre createNombre();

  /**
   * Returns a new object of class '<em>Profesor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Profesor</em>'.
   * @generated
   */
  Profesor createProfesor();

  /**
   * Returns a new object of class '<em>Materia</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Materia</em>'.
   * @generated
   */
  Materia createMateria();

  /**
   * Returns a new object of class '<em>Aula</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Aula</em>'.
   * @generated
   */
  Aula createAula();

  /**
   * Returns a new object of class '<em>Planificacion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Planificacion</em>'.
   * @generated
   */
  Planificacion createPlanificacion();

  /**
   * Returns a new object of class '<em>Asignaciones</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Asignaciones</em>'.
   * @generated
   */
  Asignaciones createAsignaciones();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MyDslPackage getMyDslPackage();

} //MyDslFactory
