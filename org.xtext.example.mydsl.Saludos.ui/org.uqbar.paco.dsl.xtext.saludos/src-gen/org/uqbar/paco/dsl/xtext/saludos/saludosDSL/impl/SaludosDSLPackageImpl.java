/**
 */
package org.uqbar.paco.dsl.xtext.saludos.saludosDSL.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.uqbar.paco.dsl.xtext.saludos.saludosDSL.Alguien;
import org.uqbar.paco.dsl.xtext.saludos.saludosDSL.Bienvenida;
import org.uqbar.paco.dsl.xtext.saludos.saludosDSL.Despedida;
import org.uqbar.paco.dsl.xtext.saludos.saludosDSL.Model;
import org.uqbar.paco.dsl.xtext.saludos.saludosDSL.Saludo;
import org.uqbar.paco.dsl.xtext.saludos.saludosDSL.SaludosDSLFactory;
import org.uqbar.paco.dsl.xtext.saludos.saludosDSL.SaludosDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SaludosDSLPackageImpl extends EPackageImpl implements SaludosDSLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass saludoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bienvenidaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass despedidaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alguienEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.uqbar.paco.dsl.xtext.saludos.saludosDSL.SaludosDSLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SaludosDSLPackageImpl()
  {
    super(eNS_URI, SaludosDSLFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link SaludosDSLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SaludosDSLPackage init()
  {
    if (isInited) return (SaludosDSLPackage)EPackage.Registry.INSTANCE.getEPackage(SaludosDSLPackage.eNS_URI);

    // Obtain or create and register package
    SaludosDSLPackageImpl theSaludosDSLPackage = (SaludosDSLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SaludosDSLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SaludosDSLPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theSaludosDSLPackage.createPackageContents();

    // Initialize created meta-data
    theSaludosDSLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSaludosDSLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SaludosDSLPackage.eNS_URI, theSaludosDSLPackage);
    return theSaludosDSLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Quienes()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Saludos()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSaludo()
  {
    return saludoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSaludo_AQuien()
  {
    return (EReference)saludoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBienvenida()
  {
    return bienvenidaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDespedida()
  {
    return despedidaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlguien()
  {
    return alguienEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAlguien_Name()
  {
    return (EAttribute)alguienEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SaludosDSLFactory getSaludosDSLFactory()
  {
    return (SaludosDSLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__QUIENES);
    createEReference(modelEClass, MODEL__SALUDOS);

    saludoEClass = createEClass(SALUDO);
    createEReference(saludoEClass, SALUDO__AQUIEN);

    bienvenidaEClass = createEClass(BIENVENIDA);

    despedidaEClass = createEClass(DESPEDIDA);

    alguienEClass = createEClass(ALGUIEN);
    createEAttribute(alguienEClass, ALGUIEN__NAME);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    bienvenidaEClass.getESuperTypes().add(this.getSaludo());
    despedidaEClass.getESuperTypes().add(this.getSaludo());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Quienes(), this.getAlguien(), null, "quienes", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Saludos(), this.getSaludo(), null, "saludos", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(saludoEClass, Saludo.class, "Saludo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSaludo_AQuien(), this.getAlguien(), null, "aQuien", null, 0, 1, Saludo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bienvenidaEClass, Bienvenida.class, "Bienvenida", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(despedidaEClass, Despedida.class, "Despedida", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(alguienEClass, Alguien.class, "Alguien", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAlguien_Name(), ecorePackage.getEString(), "name", null, 0, 1, Alguien.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //SaludosDSLPackageImpl
