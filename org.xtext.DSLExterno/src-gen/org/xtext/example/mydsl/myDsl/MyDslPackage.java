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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.DiasHabilidatosImpl <em>Dias Habilidatos</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.DiasHabilidatosImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDiasHabilidatos()
   * @generated
   */
  int DIAS_HABILIDATOS = 2;

  /**
   * The feature id for the '<em><b>Dia</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAS_HABILIDATOS__DIA = 0;

  /**
   * The feature id for the '<em><b>Hora Inicio</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAS_HABILIDATOS__HORA_INICIO = 1;

  /**
   * The feature id for the '<em><b>Hora Final</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAS_HABILIDATOS__HORA_FINAL = 2;

  /**
   * The number of structural features of the '<em>Dias Habilidatos</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAS_HABILIDATOS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ProfesorImpl <em>Profesor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ProfesorImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getProfesor()
   * @generated
   */
  int PROFESOR = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROFESOR__NAME = CLASE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dedicacion</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROFESOR__DEDICACION = CLASE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Dias Que Puede</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROFESOR__DIAS_QUE_PUEDE = CLASE_FEATURE_COUNT + 2;

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
  int MATERIA = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATERIA__NAME = CLASE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Cantidad De Dias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATERIA__CANTIDAD_DE_DIAS = CLASE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Carga Horaria</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATERIA__CARGA_HORARIA = CLASE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Dictada Por</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATERIA__DICTADA_POR = CLASE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Recursos</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATERIA__RECURSOS = CLASE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Cantidad De Inscriptos</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATERIA__CANTIDAD_DE_INSCRIPTOS = CLASE_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Materia</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATERIA_FEATURE_COUNT = CLASE_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.AulaImpl <em>Aula</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.AulaImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAula()
   * @generated
   */
  int AULA = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AULA__NAME = CLASE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Recursos</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AULA__RECURSOS = CLASE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Capacidad</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AULA__CAPACIDAD = CLASE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Aula</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AULA_FEATURE_COUNT = CLASE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.PlanificacionImpl <em>Planificacion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.PlanificacionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPlanificacion()
   * @generated
   */
  int PLANIFICACION = 6;

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
   * The feature id for the '<em><b>Materias</b></em>' reference list.
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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.AsignacionImpl <em>Asignacion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.AsignacionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAsignacion()
   * @generated
   */
  int ASIGNACION = 7;

  /**
   * The feature id for the '<em><b>Dia</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASIGNACION__DIA = 0;

  /**
   * The feature id for the '<em><b>Horarios</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASIGNACION__HORARIOS = 1;

  /**
   * The number of structural features of the '<em>Asignacion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASIGNACION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.HorarioImpl <em>Horario</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.HorarioImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getHorario()
   * @generated
   */
  int HORARIO = 8;

  /**
   * The feature id for the '<em><b>Horario Inicio</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HORARIO__HORARIO_INICIO = 0;

  /**
   * The feature id for the '<em><b>Horario Fin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HORARIO__HORARIO_FIN = 1;

  /**
   * The feature id for the '<em><b>Materia</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HORARIO__MATERIA = 2;

  /**
   * The feature id for the '<em><b>Aula</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HORARIO__AULA = 3;

  /**
   * The number of structural features of the '<em>Horario</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HORARIO_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.Dedicacion <em>Dedicacion</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.Dedicacion
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDedicacion()
   * @generated
   */
  int DEDICACION = 9;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.Recursos <em>Recursos</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.Recursos
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRecursos()
   * @generated
   */
  int RECURSOS = 10;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.Dia <em>Dia</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.Dia
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDia()
   * @generated
   */
  int DIA = 11;


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
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.DiasHabilidatos <em>Dias Habilidatos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dias Habilidatos</em>'.
   * @see org.xtext.example.mydsl.myDsl.DiasHabilidatos
   * @generated
   */
  EClass getDiasHabilidatos();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.DiasHabilidatos#getDia <em>Dia</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dia</em>'.
   * @see org.xtext.example.mydsl.myDsl.DiasHabilidatos#getDia()
   * @see #getDiasHabilidatos()
   * @generated
   */
  EAttribute getDiasHabilidatos_Dia();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.DiasHabilidatos#getHoraInicio <em>Hora Inicio</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hora Inicio</em>'.
   * @see org.xtext.example.mydsl.myDsl.DiasHabilidatos#getHoraInicio()
   * @see #getDiasHabilidatos()
   * @generated
   */
  EAttribute getDiasHabilidatos_HoraInicio();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.DiasHabilidatos#getHoraFinal <em>Hora Final</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hora Final</em>'.
   * @see org.xtext.example.mydsl.myDsl.DiasHabilidatos#getHoraFinal()
   * @see #getDiasHabilidatos()
   * @generated
   */
  EAttribute getDiasHabilidatos_HoraFinal();

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
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Profesor#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Profesor#getName()
   * @see #getProfesor()
   * @generated
   */
  EAttribute getProfesor_Name();

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
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Profesor#getDiasQuePuede <em>Dias Que Puede</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dias Que Puede</em>'.
   * @see org.xtext.example.mydsl.myDsl.Profesor#getDiasQuePuede()
   * @see #getProfesor()
   * @generated
   */
  EReference getProfesor_DiasQuePuede();

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
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Materia#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Materia#getName()
   * @see #getMateria()
   * @generated
   */
  EAttribute getMateria_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Materia#getCantidadDeDias <em>Cantidad De Dias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cantidad De Dias</em>'.
   * @see org.xtext.example.mydsl.myDsl.Materia#getCantidadDeDias()
   * @see #getMateria()
   * @generated
   */
  EAttribute getMateria_CantidadDeDias();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Materia#getCargaHoraria <em>Carga Horaria</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Carga Horaria</em>'.
   * @see org.xtext.example.mydsl.myDsl.Materia#getCargaHoraria()
   * @see #getMateria()
   * @generated
   */
  EAttribute getMateria_CargaHoraria();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.Materia#getDictadaPor <em>Dictada Por</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Dictada Por</em>'.
   * @see org.xtext.example.mydsl.myDsl.Materia#getDictadaPor()
   * @see #getMateria()
   * @generated
   */
  EReference getMateria_DictadaPor();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.myDsl.Materia#getRecursos <em>Recursos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Recursos</em>'.
   * @see org.xtext.example.mydsl.myDsl.Materia#getRecursos()
   * @see #getMateria()
   * @generated
   */
  EAttribute getMateria_Recursos();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Materia#getCantidadDeInscriptos <em>Cantidad De Inscriptos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cantidad De Inscriptos</em>'.
   * @see org.xtext.example.mydsl.myDsl.Materia#getCantidadDeInscriptos()
   * @see #getMateria()
   * @generated
   */
  EAttribute getMateria_CantidadDeInscriptos();

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
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Aula#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Aula#getName()
   * @see #getAula()
   * @generated
   */
  EAttribute getAula_Name();

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
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Aula#getCapacidad <em>Capacidad</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Capacidad</em>'.
   * @see org.xtext.example.mydsl.myDsl.Aula#getCapacidad()
   * @see #getAula()
   * @generated
   */
  EAttribute getAula_Capacidad();

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
   * Returns the meta object for the reference list '{@link org.xtext.example.mydsl.myDsl.Planificacion#getMaterias <em>Materias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Materias</em>'.
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
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Asignacion <em>Asignacion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Asignacion</em>'.
   * @see org.xtext.example.mydsl.myDsl.Asignacion
   * @generated
   */
  EClass getAsignacion();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Asignacion#getDia <em>Dia</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dia</em>'.
   * @see org.xtext.example.mydsl.myDsl.Asignacion#getDia()
   * @see #getAsignacion()
   * @generated
   */
  EAttribute getAsignacion_Dia();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Asignacion#getHorarios <em>Horarios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Horarios</em>'.
   * @see org.xtext.example.mydsl.myDsl.Asignacion#getHorarios()
   * @see #getAsignacion()
   * @generated
   */
  EReference getAsignacion_Horarios();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Horario <em>Horario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Horario</em>'.
   * @see org.xtext.example.mydsl.myDsl.Horario
   * @generated
   */
  EClass getHorario();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Horario#getHorarioInicio <em>Horario Inicio</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Horario Inicio</em>'.
   * @see org.xtext.example.mydsl.myDsl.Horario#getHorarioInicio()
   * @see #getHorario()
   * @generated
   */
  EAttribute getHorario_HorarioInicio();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Horario#getHorarioFin <em>Horario Fin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Horario Fin</em>'.
   * @see org.xtext.example.mydsl.myDsl.Horario#getHorarioFin()
   * @see #getHorario()
   * @generated
   */
  EAttribute getHorario_HorarioFin();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.Horario#getMateria <em>Materia</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Materia</em>'.
   * @see org.xtext.example.mydsl.myDsl.Horario#getMateria()
   * @see #getHorario()
   * @generated
   */
  EReference getHorario_Materia();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.Horario#getAula <em>Aula</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Aula</em>'.
   * @see org.xtext.example.mydsl.myDsl.Horario#getAula()
   * @see #getHorario()
   * @generated
   */
  EReference getHorario_Aula();

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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.DiasHabilidatosImpl <em>Dias Habilidatos</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.DiasHabilidatosImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDiasHabilidatos()
     * @generated
     */
    EClass DIAS_HABILIDATOS = eINSTANCE.getDiasHabilidatos();

    /**
     * The meta object literal for the '<em><b>Dia</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIAS_HABILIDATOS__DIA = eINSTANCE.getDiasHabilidatos_Dia();

    /**
     * The meta object literal for the '<em><b>Hora Inicio</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIAS_HABILIDATOS__HORA_INICIO = eINSTANCE.getDiasHabilidatos_HoraInicio();

    /**
     * The meta object literal for the '<em><b>Hora Final</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIAS_HABILIDATOS__HORA_FINAL = eINSTANCE.getDiasHabilidatos_HoraFinal();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROFESOR__NAME = eINSTANCE.getProfesor_Name();

    /**
     * The meta object literal for the '<em><b>Dedicacion</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROFESOR__DEDICACION = eINSTANCE.getProfesor_Dedicacion();

    /**
     * The meta object literal for the '<em><b>Dias Que Puede</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROFESOR__DIAS_QUE_PUEDE = eINSTANCE.getProfesor_DiasQuePuede();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MATERIA__NAME = eINSTANCE.getMateria_Name();

    /**
     * The meta object literal for the '<em><b>Cantidad De Dias</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MATERIA__CANTIDAD_DE_DIAS = eINSTANCE.getMateria_CantidadDeDias();

    /**
     * The meta object literal for the '<em><b>Carga Horaria</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MATERIA__CARGA_HORARIA = eINSTANCE.getMateria_CargaHoraria();

    /**
     * The meta object literal for the '<em><b>Dictada Por</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATERIA__DICTADA_POR = eINSTANCE.getMateria_DictadaPor();

    /**
     * The meta object literal for the '<em><b>Recursos</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MATERIA__RECURSOS = eINSTANCE.getMateria_Recursos();

    /**
     * The meta object literal for the '<em><b>Cantidad De Inscriptos</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MATERIA__CANTIDAD_DE_INSCRIPTOS = eINSTANCE.getMateria_CantidadDeInscriptos();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AULA__NAME = eINSTANCE.getAula_Name();

    /**
     * The meta object literal for the '<em><b>Recursos</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AULA__RECURSOS = eINSTANCE.getAula_Recursos();

    /**
     * The meta object literal for the '<em><b>Capacidad</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AULA__CAPACIDAD = eINSTANCE.getAula_Capacidad();

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
     * The meta object literal for the '<em><b>Materias</b></em>' reference list feature.
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.AsignacionImpl <em>Asignacion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.AsignacionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAsignacion()
     * @generated
     */
    EClass ASIGNACION = eINSTANCE.getAsignacion();

    /**
     * The meta object literal for the '<em><b>Dia</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASIGNACION__DIA = eINSTANCE.getAsignacion_Dia();

    /**
     * The meta object literal for the '<em><b>Horarios</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASIGNACION__HORARIOS = eINSTANCE.getAsignacion_Horarios();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.HorarioImpl <em>Horario</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.HorarioImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getHorario()
     * @generated
     */
    EClass HORARIO = eINSTANCE.getHorario();

    /**
     * The meta object literal for the '<em><b>Horario Inicio</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HORARIO__HORARIO_INICIO = eINSTANCE.getHorario_HorarioInicio();

    /**
     * The meta object literal for the '<em><b>Horario Fin</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HORARIO__HORARIO_FIN = eINSTANCE.getHorario_HorarioFin();

    /**
     * The meta object literal for the '<em><b>Materia</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HORARIO__MATERIA = eINSTANCE.getHorario_Materia();

    /**
     * The meta object literal for the '<em><b>Aula</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HORARIO__AULA = eINSTANCE.getHorario_Aula();

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
