/**
 */
package org.uqbar.paco.dsl.xtext.saludos.saludosDSL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.uqbar.paco.dsl.xtext.saludos.saludosDSL.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SaludosDSLFactoryImpl extends EFactoryImpl implements SaludosDSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SaludosDSLFactory init()
  {
    try
    {
      SaludosDSLFactory theSaludosDSLFactory = (SaludosDSLFactory)EPackage.Registry.INSTANCE.getEFactory(SaludosDSLPackage.eNS_URI);
      if (theSaludosDSLFactory != null)
      {
        return theSaludosDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SaludosDSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SaludosDSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SaludosDSLPackage.MODEL: return createModel();
      case SaludosDSLPackage.SALUDO: return createSaludo();
      case SaludosDSLPackage.BIENVENIDA: return createBienvenida();
      case SaludosDSLPackage.DESPEDIDA: return createDespedida();
      case SaludosDSLPackage.ALGUIEN: return createAlguien();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Saludo createSaludo()
  {
    SaludoImpl saludo = new SaludoImpl();
    return saludo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bienvenida createBienvenida()
  {
    BienvenidaImpl bienvenida = new BienvenidaImpl();
    return bienvenida;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Despedida createDespedida()
  {
    DespedidaImpl despedida = new DespedidaImpl();
    return despedida;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Alguien createAlguien()
  {
    AlguienImpl alguien = new AlguienImpl();
    return alguien;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SaludosDSLPackage getSaludosDSLPackage()
  {
    return (SaludosDSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SaludosDSLPackage getPackage()
  {
    return SaludosDSLPackage.eINSTANCE;
  }

} //SaludosDSLFactoryImpl
