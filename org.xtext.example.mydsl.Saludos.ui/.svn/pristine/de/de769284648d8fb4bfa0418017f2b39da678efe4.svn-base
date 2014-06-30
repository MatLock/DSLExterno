/**
 */
package org.uqbar.paco.dsl.xtext.saludos.saludosDSL.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.uqbar.paco.dsl.xtext.saludos.saludosDSL.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.uqbar.paco.dsl.xtext.saludos.saludosDSL.SaludosDSLPackage
 * @generated
 */
public class SaludosDSLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SaludosDSLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SaludosDSLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SaludosDSLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SaludosDSLSwitch<Adapter> modelSwitch =
    new SaludosDSLSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseSaludo(Saludo object)
      {
        return createSaludoAdapter();
      }
      @Override
      public Adapter caseBienvenida(Bienvenida object)
      {
        return createBienvenidaAdapter();
      }
      @Override
      public Adapter caseDespedida(Despedida object)
      {
        return createDespedidaAdapter();
      }
      @Override
      public Adapter caseAlguien(Alguien object)
      {
        return createAlguienAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.uqbar.paco.dsl.xtext.saludos.saludosDSL.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uqbar.paco.dsl.xtext.saludos.saludosDSL.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uqbar.paco.dsl.xtext.saludos.saludosDSL.Saludo <em>Saludo</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uqbar.paco.dsl.xtext.saludos.saludosDSL.Saludo
   * @generated
   */
  public Adapter createSaludoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uqbar.paco.dsl.xtext.saludos.saludosDSL.Bienvenida <em>Bienvenida</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uqbar.paco.dsl.xtext.saludos.saludosDSL.Bienvenida
   * @generated
   */
  public Adapter createBienvenidaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uqbar.paco.dsl.xtext.saludos.saludosDSL.Despedida <em>Despedida</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uqbar.paco.dsl.xtext.saludos.saludosDSL.Despedida
   * @generated
   */
  public Adapter createDespedidaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.uqbar.paco.dsl.xtext.saludos.saludosDSL.Alguien <em>Alguien</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.uqbar.paco.dsl.xtext.saludos.saludosDSL.Alguien
   * @generated
   */
  public Adapter createAlguienAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //SaludosDSLAdapterFactory
