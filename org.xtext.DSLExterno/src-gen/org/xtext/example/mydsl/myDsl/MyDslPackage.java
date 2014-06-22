/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslFactory
 * @model kind="package"
 * @generated
 */
public interface MyDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/mydsl/MyDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslPackage eINSTANCE = org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ModelImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Clases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__CLASES = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ClaseImpl <em>Clase</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ClaseImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getClase()
   * @generated
   */
  int CLASE = 1;

  /**
   * The number of structural features of the '<em>Clase</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.AtributosImpl <em>Atributos</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.AtributosImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAtributos()
   * @generated
   */
  int ATRIBUTOS = 2;

  /**
   * The number of structural features of the '<em>Atributos</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTOS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.NumeroDeAulaImpl <em>Numero De Aula</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.NumeroDeAulaImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getNumeroDeAula()
   * @generated
   */
  int NUMERO_DE_AULA = 3;

  /**
   * The feature id for the '<em><b>Numero</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERO_DE_AULA__NUMERO = ATRIBUTOS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Numero De Aula</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERO_DE_AULA_FEATURE_COUNT = ATRIBUTOS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.CantidadDeDiasImpl <em>Cantidad De Dias</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.CantidadDeDiasImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCantidadDeDias()
   * @generated
   */
  int CANTIDAD_DE_DIAS = 4;

  /**
   * The feature id for the '<em><b>Dias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CANTIDAD_DE_DIAS__DIAS = ATRIBUTOS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Cantidad De Dias</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CANTIDAD_DE_DIAS_FEATURE_COUNT = ATRIBUTOS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.HorariosImpl <em>Horarios</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.HorariosImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getHorarios()
   * @generated
   */
  int HORARIOS = 5;

  /**
   * The feature id for the '<em><b>Horario Inicion</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HORARIOS__HORARIO_INICION = ATRIBUTOS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Horarion Fin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HORARIOS__HORARION_FIN = ATRIBUTOS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Aula</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HORARIOS__AULA = ATRIBUTOS_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HORARIOS__TYPE = ATRIBUTOS_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Horarios</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HORARIOS_FEATURE_COUNT = ATRIBUTOS_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.NombreImpl <em>Nombre</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.NombreImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getNombre()
   * @generated
   */
  int NOMBRE = 6;

  /**
   * The feature id for the '<em><b>Nombre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOMBRE__NOMBRE = ATRIBUTOS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Nombre</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOMBRE_FEATURE_COUNT = ATRIBUTOS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ProfesorImpl <em>Profesor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ProfesorImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getProfesor()
   * @generated
   */
  int PROFESOR = 7;

  /**
   * The feature id for the '<em><b>Dedicacion</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROFESOR__DEDICACION = CLASE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROFESOR__TYPE = CLASE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROFESOR__ATRIBUTOS = CLASE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Profesor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROFESOR_FEATURE_COUNT = CLASE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.MateriaImpl <em>Materia</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.MateriaImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getMateria()
   * @generated
   */
  int MATERIA = 8;

  /**
   * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATERIA__ATRIBUTOS = CLASE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Materia</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATERIA_FEATURE_COUNT = CLASE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.AulaImpl <em>Aula</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.AulaImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAula()
   * @generated
   */
  int AULA = 9;

  /**
   * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AULA__ATRIBUTOS = CLASE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Recursos</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AULA__RECURSOS = CLASE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Aula</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AULA_FEATURE_COUNT = CLASE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.PlanificacionImpl <em>Planificacion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.PlanificacionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPlanificacion()
   * @generated
   */
  int PLANIFICACION = 10;

  /**
   * The feature id for the '<em><b>Anio</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANIFICACION__ANIO = CLASE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Semestre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANIFICACION__SEMESTRE = CLASE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Materias</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANIFICACION__MATERIAS = CLASE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Asignaciones</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANIFICACION__ASIGNACIONES = CLASE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Planificacion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANIFICACION_FEATURE_COUNT = CLASE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.AsignacionesImpl <em>Asignaciones</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.AsignacionesImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAsignaciones()
   * @generated
   */
  int ASIGNACIONES = 11;

  /**
   * The feature id for the '<em><b>Dia</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASIGNACIONES__DIA = ATRIBUTOS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Horario</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASIGNACIONES__HORARIO = ATRIBUTOS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Materia</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASIGNACIONES__MATERIA = ATRIBUTOS_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASIGNACIONES__TYPE = ATRIBUTOS_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Asignaciones</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASIGNACIONES_FEATURE_COUNT = ATRIBUTOS_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.Dedicacion <em>Dedicacion</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.Dedicacion
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDedicacion()
   * @generated
   */
  int DEDICACION = 12;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.Recursos <em>Recursos</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.Recursos
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRecursos()
   * @generated
   */
  int RECURSOS = 13;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.Dia <em>Dia</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.Dia
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDia()
   * @generated
   */
  int DIA = 14;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.example.mydsl.myDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Model#getClases <em>Clases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Clases</em>'.
   * @see org.xtext.example.mydsl.myDsl.Model#getClases()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Clases();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Clase <em>Clase</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Clase</em>'.
   * @see org.xtext.example.mydsl.myDsl.Clase
   * @generated
   */
  EClass getClase();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Atributos <em>Atributos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atributos</em>'.
   * @see org.xtext.example.mydsl.myDsl.Atributos
   * @generated
   */
  EClass getAtributos();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.NumeroDeAula <em>Numero De Aula</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Numero De Aula</em>'.
   * @see org.xtext.example.mydsl.myDsl.NumeroDeAula
   * @generated
   */
  EClass getNumeroDeAula();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.NumeroDeAula#getNumero <em>Numero</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Numero</em>'.
   * @see org.xtext.example.mydsl.myDsl.NumeroDeAula#getNumero()
   * @see #getNumeroDeAula()
   * @generated
   */
  EAttribute getNumeroDeAula_Numero();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.CantidadDeDias <em>Cantidad De Dias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cantidad De Dias</em>'.
   * @see org.xtext.example.mydsl.myDsl.CantidadDeDias
   * @generated
   */
  EClass getCantidadDeDias();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.CantidadDeDias#getDias <em>Dias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dias</em>'.
   * @see org.xtext.example.mydsl.myDsl.CantidadDeDias#getDias()
   * @see #getCantidadDeDias()
   * @generated
   */
  EAttribute getCantidadDeDias_Dias();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Horarios <em>Horarios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Horarios</em>'.
   * @see org.xtext.example.mydsl.myDsl.Horarios
   * @generated
   */
  EClass getHorarios();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Horarios#getHorarioInicion <em>Horario Inicion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Horario Inicion</em>'.
   * @see org.xtext.example.mydsl.myDsl.Horarios#getHorarioInicion()
   * @see #getHorarios()
   * @generated
   */
  EAttribute getHorarios_HorarioInicion();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Horarios#getHorarionFin <em>Horarion Fin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Horarion Fin</em>'.
   * @see org.xtext.example.mydsl.myDsl.Horarios#getHorarionFin()
   * @see #getHorarios()
   * @generated
   */
  EAttribute getHorarios_HorarionFin();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Horarios#getAula <em>Aula</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Aula</em>'.
   * @see org.xtext.example.mydsl.myDsl.Horarios#getAula()
   * @see #getHorarios()
   * @generated
   */
  EAttribute getHorarios_Aula();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Horarios#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.Horarios#getType()
   * @see #getHorarios()
   * @generated
   */
  EReference getHorarios_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Nombre <em>Nombre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nombre</em>'.
   * @see org.xtext.example.mydsl.myDsl.Nombre
   * @generated
   */
  EClass getNombre();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Nombre#getNombre <em>Nombre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nombre</em>'.
   * @see org.xtext.example.mydsl.myDsl.Nombre#getNombre()
   * @see #getNombre()
   * @generated
   */
  EAttribute getNombre_Nombre();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Profesor <em>Profesor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Profesor</em>'.
   * @see org.xtext.example.mydsl.myDsl.Profesor
   * @generated
   */
  EClass getProfesor();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Profesor#getDedicacion <em>Dedicacion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dedicacion</em>'.
   * @see org.xtext.example.mydsl.myDsl.Profesor#getDedicacion()
   * @see #getProfesor()
   * @generated
   */
  EAttribute getProfesor_Dedicacion();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Profesor#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.Profesor#getType()
   * @see #getProfesor()
   * @generated
   */
  EAttribute getProfesor_Type();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Profesor#getAtributos <em>Atributos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Atributos</em>'.
   * @see org.xtext.example.mydsl.myDsl.Profesor#getAtributos()
   * @see #getProfesor()
   * @generated
   */
  EReference getProfesor_Atributos();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Materia <em>Materia</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Materia</em>'.
   * @see org.xtext.example.mydsl.myDsl.Materia
   * @generated
   */
  EClass getMateria();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Materia#getAtributos <em>Atributos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Atributos</em>'.
   * @see org.xtext.example.mydsl.myDsl.Materia#getAtributos()
   * @see #getMateria()
   * @generated
   */
  EReference getMateria_Atributos();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Aula <em>Aula</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Aula</em>'.
   * @see org.xtext.example.mydsl.myDsl.Aula
   * @generated
   */
  EClass getAula();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Aula#getAtributos <em>Atributos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Atributos</em>'.
   * @see org.xtext.example.mydsl.myDsl.Aula#getAtributos()
   * @see #getAula()
   * @generated
   */
  EReference getAula_Atributos();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.myDsl.Aula#getRecursos <em>Recursos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Recursos</em>'.
   * @see org.xtext.example.mydsl.myDsl.Aula#getRecursos()
   * @see #getAula()
   * @generated
   */
  EAttribute getAula_Recursos();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Planificacion <em>Planificacion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Planificacion</em>'.
   * @see org.xtext.example.mydsl.myDsl.Planificacion
   * @generated
   */
  EClass getPlanificacion();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Planificacion#getAnio <em>Anio</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Anio</em>'.
   * @see org.xtext.example.mydsl.myDsl.Planificacion#getAnio()
   * @see #getPlanificacion()
   * @generated
   */
  EAttribute getPlanificacion_Anio();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Planificacion#getSemestre <em>Semestre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Semestre</em>'.
   * @see org.xtext.example.mydsl.myDsl.Planificacion#getSemestre()
   * @see #getPlanificacion()
   * @generated
   */
  EAttribute getPlanificacion_Semestre();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Planificacion#getMaterias <em>Materias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Materias</em>'.
   * @see org.xtext.example.mydsl.myDsl.Planificacion#getMaterias()
   * @see #getPlanificacion()
   * @generated
   */
  EReference getPlanificacion_Materias();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Planificacion#getAsignaciones <em>Asignaciones</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Asignaciones</em>'.
   * @see org.xtext.example.mydsl.myDsl.Planificacion#getAsignaciones()
   * @see #getPlanificacion()
   * @generated
   */
  EReference getPlanificacion_Asignaciones();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Asignaciones <em>Asignaciones</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Asignaciones</em>'.
   * @see org.xtext.example.mydsl.myDsl.Asignaciones
   * @generated
   */
  EClass getAsignaciones();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Asignaciones#getDia <em>Dia</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dia</em>'.
   * @see org.xtext.example.mydsl.myDsl.Asignaciones#getDia()
   * @see #getAsignaciones()
   * @generated
   */
  EAttribute getAsignaciones_Dia();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Asignaciones#getHorario <em>Horario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Horario</em>'.
   * @see org.xtext.example.mydsl.myDsl.Asignaciones#getHorario()
   * @see #getAsignaciones()
   * @generated
   */
  EReference getAsignaciones_Horario();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Asignaciones#getMateria <em>Materia</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Materia</em>'.
   * @see org.xtext.example.mydsl.myDsl.Asignaciones#getMateria()
   * @see #getAsignaciones()
   * @generated
   */
  EAttribute getAsignaciones_Materia();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Asignaciones#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.Asignaciones#getType()
   * @see #getAsignaciones()
   * @generated
   */
  EReference getAsignaciones_Type();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.mydsl.myDsl.Dedicacion <em>Dedicacion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Dedicacion</em>'.
   * @see org.xtext.example.mydsl.myDsl.Dedicacion
   * @generated
   */
  EEnum getDedicacion();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.mydsl.myDsl.Recursos <em>Recursos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Recursos</em>'.
   * @see org.xtext.example.mydsl.myDsl.Recursos
   * @generated
   */
  EEnum getRecursos();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.mydsl.myDsl.Dia <em>Dia</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Dia</em>'.
   * @see org.xtext.example.mydsl.myDsl.Dia
   * @generated
   */
  EEnum getDia();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyDslFactory getMyDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ModelImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Clases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__CLASES = eINSTANCE.getModel_Clases();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ClaseImpl <em>Clase</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ClaseImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getClase()
     * @generated
     */
    EClass CLASE = eINSTANCE.getClase();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.AtributosImpl <em>Atributos</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.AtributosImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAtributos()
     * @generated
     */
    EClass ATRIBUTOS = eINSTANCE.getAtributos();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.NumeroDeAulaImpl <em>Numero De Aula</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.NumeroDeAulaImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getNumeroDeAula()
     * @generated
     */
    EClass NUMERO_DE_AULA = eINSTANCE.getNumeroDeAula();

    /**
     * The meta object literal for the '<em><b>Numero</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMERO_DE_AULA__NUMERO = eINSTANCE.getNumeroDeAula_Numero();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.CantidadDeDiasImpl <em>Cantidad De Dias</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.CantidadDeDiasImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCantidadDeDias()
     * @generated
     */
    EClass CANTIDAD_DE_DIAS = eINSTANCE.getCantidadDeDias();

    /**
     * The meta object literal for the '<em><b>Dias</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CANTIDAD_DE_DIAS__DIAS = eINSTANCE.getCantidadDeDias_Dias();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.HorariosImpl <em>Horarios</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.HorariosImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getHorarios()
     * @generated
     */
    EClass HORARIOS = eINSTANCE.getHorarios();

    /**
     * The meta object literal for the '<em><b>Horario Inicion</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HORARIOS__HORARIO_INICION = eINSTANCE.getHorarios_HorarioInicion();

    /**
     * The meta object literal for the '<em><b>Horarion Fin</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HORARIOS__HORARION_FIN = eINSTANCE.getHorarios_HorarionFin();

    /**
     * The meta object literal for the '<em><b>Aula</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HORARIOS__AULA = eINSTANCE.getHorarios_Aula();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HORARIOS__TYPE = eINSTANCE.getHorarios_Type();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.NombreImpl <em>Nombre</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.NombreImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getNombre()
     * @generated
     */
    EClass NOMBRE = eINSTANCE.getNombre();

    /**
     * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NOMBRE__NOMBRE = eINSTANCE.getNombre_Nombre();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ProfesorImpl <em>Profesor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ProfesorImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getProfesor()
     * @generated
     */
    EClass PROFESOR = eINSTANCE.getProfesor();

    /**
     * The meta object literal for the '<em><b>Dedicacion</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROFESOR__DEDICACION = eINSTANCE.getProfesor_Dedicacion();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROFESOR__TYPE = eINSTANCE.getProfesor_Type();

    /**
     * The meta object literal for the '<em><b>Atributos</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROFESOR__ATRIBUTOS = eINSTANCE.getProfesor_Atributos();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.MateriaImpl <em>Materia</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.MateriaImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getMateria()
     * @generated
     */
    EClass MATERIA = eINSTANCE.getMateria();

    /**
     * The meta object literal for the '<em><b>Atributos</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATERIA__ATRIBUTOS = eINSTANCE.getMateria_Atributos();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.AulaImpl <em>Aula</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.AulaImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAula()
     * @generated
     */
    EClass AULA = eINSTANCE.getAula();

    /**
     * The meta object literal for the '<em><b>Atributos</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AULA__ATRIBUTOS = eINSTANCE.getAula_Atributos();

    /**
     * The meta object literal for the '<em><b>Recursos</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AULA__RECURSOS = eINSTANCE.getAula_Recursos();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.PlanificacionImpl <em>Planificacion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.PlanificacionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPlanificacion()
     * @generated
     */
    EClass PLANIFICACION = eINSTANCE.getPlanificacion();

    /**
     * The meta object literal for the '<em><b>Anio</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLANIFICACION__ANIO = eINSTANCE.getPlanificacion_Anio();

    /**
     * The meta object literal for the '<em><b>Semestre</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLANIFICACION__SEMESTRE = eINSTANCE.getPlanificacion_Semestre();

    /**
     * The meta object literal for the '<em><b>Materias</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLANIFICACION__MATERIAS = eINSTANCE.getPlanificacion_Materias();

    /**
     * The meta object literal for the '<em><b>Asignaciones</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLANIFICACION__ASIGNACIONES = eINSTANCE.getPlanificacion_Asignaciones();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.AsignacionesImpl <em>Asignaciones</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.AsignacionesImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAsignaciones()
     * @generated
     */
    EClass ASIGNACIONES = eINSTANCE.getAsignaciones();

    /**
     * The meta object literal for the '<em><b>Dia</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASIGNACIONES__DIA = eINSTANCE.getAsignaciones_Dia();

    /**
     * The meta object literal for the '<em><b>Horario</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASIGNACIONES__HORARIO = eINSTANCE.getAsignaciones_Horario();

    /**
     * The meta object literal for the '<em><b>Materia</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASIGNACIONES__MATERIA = eINSTANCE.getAsignaciones_Materia();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASIGNACIONES__TYPE = eINSTANCE.getAsignaciones_Type();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.Dedicacion <em>Dedicacion</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.Dedicacion
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDedicacion()
     * @generated
     */
    EEnum DEDICACION = eINSTANCE.getDedicacion();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.Recursos <em>Recursos</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.Recursos
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRecursos()
     * @generated
     */
    EEnum RECURSOS = eINSTANCE.getRecursos();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.Dia <em>Dia</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.Dia
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDia()
     * @generated
     */
    EEnum DIA = eINSTANCE.getDia();

  }

} //MyDslPackage
