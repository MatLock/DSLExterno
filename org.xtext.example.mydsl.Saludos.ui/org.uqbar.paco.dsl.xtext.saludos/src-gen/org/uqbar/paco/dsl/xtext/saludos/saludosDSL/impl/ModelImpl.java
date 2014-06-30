/**
 */
package org.uqbar.paco.dsl.xtext.saludos.saludosDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.uqbar.paco.dsl.xtext.saludos.saludosDSL.Alguien;
import org.uqbar.paco.dsl.xtext.saludos.saludosDSL.Model;
import org.uqbar.paco.dsl.xtext.saludos.saludosDSL.Saludo;
import org.uqbar.paco.dsl.xtext.saludos.saludosDSL.SaludosDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.uqbar.paco.dsl.xtext.saludos.saludosDSL.impl.ModelImpl#getQuienes <em>Quienes</em>}</li>
 *   <li>{@link org.uqbar.paco.dsl.xtext.saludos.saludosDSL.impl.ModelImpl#getSaludos <em>Saludos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getQuienes() <em>Quienes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuienes()
   * @generated
   * @ordered
   */
  protected EList<Alguien> quienes;

  /**
   * The cached value of the '{@link #getSaludos() <em>Saludos</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSaludos()
   * @generated
   * @ordered
   */
  protected EList<Saludo> saludos;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SaludosDSLPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Alguien> getQuienes()
  {
    if (quienes == null)
    {
      quienes = new EObjectContainmentEList<Alguien>(Alguien.class, this, SaludosDSLPackage.MODEL__QUIENES);
    }
    return quienes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Saludo> getSaludos()
  {
    if (saludos == null)
    {
      saludos = new EObjectContainmentEList<Saludo>(Saludo.class, this, SaludosDSLPackage.MODEL__SALUDOS);
    }
    return saludos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SaludosDSLPackage.MODEL__QUIENES:
        return ((InternalEList<?>)getQuienes()).basicRemove(otherEnd, msgs);
      case SaludosDSLPackage.MODEL__SALUDOS:
        return ((InternalEList<?>)getSaludos()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SaludosDSLPackage.MODEL__QUIENES:
        return getQuienes();
      case SaludosDSLPackage.MODEL__SALUDOS:
        return getSaludos();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SaludosDSLPackage.MODEL__QUIENES:
        getQuienes().clear();
        getQuienes().addAll((Collection<? extends Alguien>)newValue);
        return;
      case SaludosDSLPackage.MODEL__SALUDOS:
        getSaludos().clear();
        getSaludos().addAll((Collection<? extends Saludo>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SaludosDSLPackage.MODEL__QUIENES:
        getQuienes().clear();
        return;
      case SaludosDSLPackage.MODEL__SALUDOS:
        getSaludos().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SaludosDSLPackage.MODEL__QUIENES:
        return quienes != null && !quienes.isEmpty();
      case SaludosDSLPackage.MODEL__SALUDOS:
        return saludos != null && !saludos.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
