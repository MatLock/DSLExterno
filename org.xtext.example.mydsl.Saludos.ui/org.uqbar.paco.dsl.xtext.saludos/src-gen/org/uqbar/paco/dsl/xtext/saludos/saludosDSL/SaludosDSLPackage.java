/**
 */
package org.uqbar.paco.dsl.xtext.saludos.saludosDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.uqbar.paco.dsl.xtext.saludos.saludosDSL.SaludosDSLFactory
 * @model kind="package"
 * @generated
 */
public interface SaludosDSLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "saludosDSL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.uqbar.org/paco/dsl/xtext/saludos/SaludosDSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "saludosDSL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SaludosDSLPackage eINSTANCE = org.uqbar.paco.dsl.xtext.saludos.saludosDSL.impl.SaludosDSLPackageImpl.init();

  /**
   * The meta object id for the '{@link org.uqbar.paco.dsl.xtext.saludos.saludosDSL.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.paco.dsl.xtext.saludos.saludosDSL.impl.ModelImpl
   * @see org.uqbar.paco.dsl.xtext.saludos.saludosDSL.impl.SaludosDSLPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Quienes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__QUIENES = 0;

  /**
   * The feature id for the '<em><b>Saludos</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__SALUDOS = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.uqbar.paco.dsl.xtext.saludos.saludosDSL.impl.SaludoImpl <em>Saludo</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.paco.dsl.xtext.saludos.saludosDSL.impl.SaludoImpl
   * @see org.uqbar.paco.dsl.xtext.saludos.saludosDSL.impl.SaludosDSLPackageImpl#getSaludo()
   * @generated
   */
  int SALUDO = 1;

  /**
   * The feature id for the '<em><b>AQuien</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SALUDO__AQUIEN = 0;

  /**
   * The number of structural features of the '<em>Saludo</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SALUDO_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.uqbar.paco.dsl.xtext.saludos.saludosDSL.impl.BienvenidaImpl <em>Bienvenida</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.paco.dsl.xtext.saludos.saludosDSL.impl.BienvenidaImpl
   * @see org.uqbar.paco.dsl.xtext.saludos.saludosDSL.impl.SaludosDSLPackageImpl#getBienvenida()
   * @generated
   */
  int BIENVENIDA = 2;

  /**
   * The feature id for the '<em><b>AQuien</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIENVENIDA__AQUIEN = SALUDO__AQUIEN;

  /**
   * The number of structural features of the '<em>Bienvenida</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIENVENIDA_FEATURE_COUNT = SALUDO_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.uqbar.paco.dsl.xtext.saludos.saludosDSL.impl.DespedidaImpl <em>Despedida</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.paco.dsl.xtext.saludos.saludosDSL.impl.DespedidaImpl
   * @see org.uqbar.paco.dsl.xtext.saludos.saludosDSL.impl.SaludosDSLPackageImpl#getDespedida()
   * @generated
   */
  int DESPEDIDA = 3;

  /**
   * The feature id for the '<em><b>AQuien</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESPEDIDA__AQUIEN = SALUDO__AQUIEN;

  /**
   * The number of structural features of the '<em>Despedida</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESPEDIDA_FEATURE_COUNT = SALUDO_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.uqbar.paco.dsl.xtext.saludos.saludosDSL.impl.AlguienImpl <em>Alguien</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.paco.dsl.xtext.saludos.saludosDSL.impl.AlguienImpl
   * @see org.uqbar.paco.dsl.xtext.saludos.saludosDSL.impl.SaludosDSLPackageImpl#getAlguien()
   * @generated
   */
  int ALGUIEN = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALGUIEN__NAME = 0;

  /**
   * The number of structural features of the '<em>Alguien</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALGUIEN_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.uqbar.paco.dsl.xtext.saludos.saludosDSL.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.uqbar.paco.dsl.xtext.saludos.saludosDSL.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.uqbar.paco.dsl.xtext.saludos.saludosDSL.Model#getQuienes <em>Quienes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Quienes</em>'.
   * @see org.uqbar.paco.dsl.xtext.saludos.saludosDSL.Model#getQuienes()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Quienes();

  /**
   * Returns the meta object for the containment reference list '{@link org.uqbar.paco.dsl.xtext.saludos.saludosDSL.Model#getSaludos <em>Saludos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Saludos</em>'.
   * @see org.uqbar.paco.dsl.xtext.saludos.saludosDSL.Model#getSaludos()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Saludos();

  /**
   * Returns the meta object for class '{@link org.uqbar.paco.dsl.xtext.saludos.saludosDSL.Saludo <em>Saludo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Saludo</em>'.
   * @see org.uqbar.paco.dsl.xtext.saludos.saludosDSL.Saludo
   * @generated
   */
  EClass getSaludo();

  /**
   * Returns the meta object for the reference '{@link org.uqbar.paco.dsl.xtext.saludos.saludosDSL.Saludo#getAQuien <em>AQuien</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>AQuien</em>'.
   * @see org.uqbar.paco.dsl.xtext.saludos.saludosDSL.Saludo#getAQuien()
   * @see #getSaludo()
   * @generated
   */
  EReference getSaludo_AQuien();

  /**
   * Returns the meta object for class '{@link org.uqbar.paco.dsl.xtext.saludos.saludosDSL.Bienvenida <em>Bienvenida</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bienvenida</em>'.
   * @see org.uqbar.paco.dsl.xtext.saludos.saludosDSL.Bienvenida
   * @generated
   */
  EClass getBienvenida();

  /**
   * Returns the meta object for class '{@link org.uqbar.paco.dsl.xtext.saludos.saludosDSL.Despedida <em>Despedida</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Despedida</em>'.
   * @see org.uqbar.paco.dsl.xtext.saludos.saludosDSL.Despedida
   * @generated
   */
  EClass getDespedida();

  /**
   * Returns the meta object for class '{@link org.uqbar.paco.dsl.xtext.saludos.saludosDSL.Alguien <em>Alguien</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Alguien</em>'.
   * @see org.uqbar.paco.dsl.xtext.saludos.saludosDSL.Alguien
   * @generated
   */
  EClass getAlguien();

  /**
   * Returns the meta object for the attribute '{@link org.uqbar.paco.dsl.xtext.saludos.saludosDSL.Alguien#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.uqbar.paco.dsl.xtext.saludos.saludosDSL.Alguien#getName()
   * @see #getAlguien()
   * @generated
   */
  EAttribute getAlguien_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SaludosDSLFactory getSaludosDSLFactory();

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
     * The meta object literal for the '{@link org.uqbar.paco.dsl.xtext.saludos.saludosDSL.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.paco.dsl.xtext.saludos.saludosDSL.impl.ModelImpl
     * @see org.uqbar.paco.dsl.xtext.saludos.saludosDSL.impl.SaludosDSLPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Quienes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__QUIENES = eINSTANCE.getModel_Quienes();

    /**
     * The meta object literal for the '<em><b>Saludos</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__SALUDOS = eINSTANCE.getModel_Saludos();

    /**
     * The meta object literal for the '{@link org.uqbar.paco.dsl.xtext.saludos.saludosDSL.impl.SaludoImpl <em>Saludo</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.paco.dsl.xtext.saludos.saludosDSL.impl.SaludoImpl
     * @see org.uqbar.paco.dsl.xtext.saludos.saludosDSL.impl.SaludosDSLPackageImpl#getSaludo()
     * @generated
     */
    EClass SALUDO = eINSTANCE.getSaludo();

    /**
     * The meta object literal for the '<em><b>AQuien</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SALUDO__AQUIEN = eINSTANCE.getSaludo_AQuien();

    /**
     * The meta object literal for the '{@link org.uqbar.paco.dsl.xtext.saludos.saludosDSL.impl.BienvenidaImpl <em>Bienvenida</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.paco.dsl.xtext.saludos.saludosDSL.impl.BienvenidaImpl
     * @see org.uqbar.paco.dsl.xtext.saludos.saludosDSL.impl.SaludosDSLPackageImpl#getBienvenida()
     * @generated
     */
    EClass BIENVENIDA = eINSTANCE.getBienvenida();

    /**
     * The meta object literal for the '{@link org.uqbar.paco.dsl.xtext.saludos.saludosDSL.impl.DespedidaImpl <em>Despedida</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.paco.dsl.xtext.saludos.saludosDSL.impl.DespedidaImpl
     * @see org.uqbar.paco.dsl.xtext.saludos.saludosDSL.impl.SaludosDSLPackageImpl#getDespedida()
     * @generated
     */
    EClass DESPEDIDA = eINSTANCE.getDespedida();

    /**
     * The meta object literal for the '{@link org.uqbar.paco.dsl.xtext.saludos.saludosDSL.impl.AlguienImpl <em>Alguien</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.paco.dsl.xtext.saludos.saludosDSL.impl.AlguienImpl
     * @see org.uqbar.paco.dsl.xtext.saludos.saludosDSL.impl.SaludosDSLPackageImpl#getAlguien()
     * @generated
     */
    EClass ALGUIEN = eINSTANCE.getAlguien();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALGUIEN__NAME = eINSTANCE.getAlguien_Name();

  }

} //SaludosDSLPackage
