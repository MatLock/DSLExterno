/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.example.mydsl.myDsl.Materia;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Recursos;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Materia</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.MateriaImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.MateriaImpl#getCantidadDeDias <em>Cantidad De Dias</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.MateriaImpl#getCargaHoraria <em>Carga Horaria</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.MateriaImpl#getRecursos <em>Recursos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MateriaImpl extends ClaseImpl implements Materia
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getCantidadDeDias() <em>Cantidad De Dias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCantidadDeDias()
   * @generated
   * @ordered
   */
  protected static final int CANTIDAD_DE_DIAS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getCantidadDeDias() <em>Cantidad De Dias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCantidadDeDias()
   * @generated
   * @ordered
   */
  protected int cantidadDeDias = CANTIDAD_DE_DIAS_EDEFAULT;

  /**
   * The default value of the '{@link #getCargaHoraria() <em>Carga Horaria</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCargaHoraria()
   * @generated
   * @ordered
   */
  protected static final int CARGA_HORARIA_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getCargaHoraria() <em>Carga Horaria</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCargaHoraria()
   * @generated
   * @ordered
   */
  protected int cargaHoraria = CARGA_HORARIA_EDEFAULT;

  /**
   * The cached value of the '{@link #getRecursos() <em>Recursos</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecursos()
   * @generated
   * @ordered
   */
  protected EList<Recursos> recursos;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MateriaImpl()
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
    return MyDslPackage.Literals.MATERIA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.MATERIA__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getCantidadDeDias()
  {
    return cantidadDeDias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCantidadDeDias(int newCantidadDeDias)
  {
    int oldCantidadDeDias = cantidadDeDias;
    cantidadDeDias = newCantidadDeDias;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.MATERIA__CANTIDAD_DE_DIAS, oldCantidadDeDias, cantidadDeDias));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getCargaHoraria()
  {
    return cargaHoraria;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCargaHoraria(int newCargaHoraria)
  {
    int oldCargaHoraria = cargaHoraria;
    cargaHoraria = newCargaHoraria;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.MATERIA__CARGA_HORARIA, oldCargaHoraria, cargaHoraria));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Recursos> getRecursos()
  {
    if (recursos == null)
    {
      recursos = new EDataTypeEList<Recursos>(Recursos.class, this, MyDslPackage.MATERIA__RECURSOS);
    }
    return recursos;
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
      case MyDslPackage.MATERIA__NAME:
        return getName();
      case MyDslPackage.MATERIA__CANTIDAD_DE_DIAS:
        return getCantidadDeDias();
      case MyDslPackage.MATERIA__CARGA_HORARIA:
        return getCargaHoraria();
      case MyDslPackage.MATERIA__RECURSOS:
        return getRecursos();
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
      case MyDslPackage.MATERIA__NAME:
        setName((String)newValue);
        return;
      case MyDslPackage.MATERIA__CANTIDAD_DE_DIAS:
        setCantidadDeDias((Integer)newValue);
        return;
      case MyDslPackage.MATERIA__CARGA_HORARIA:
        setCargaHoraria((Integer)newValue);
        return;
      case MyDslPackage.MATERIA__RECURSOS:
        getRecursos().clear();
        getRecursos().addAll((Collection<? extends Recursos>)newValue);
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
      case MyDslPackage.MATERIA__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyDslPackage.MATERIA__CANTIDAD_DE_DIAS:
        setCantidadDeDias(CANTIDAD_DE_DIAS_EDEFAULT);
        return;
      case MyDslPackage.MATERIA__CARGA_HORARIA:
        setCargaHoraria(CARGA_HORARIA_EDEFAULT);
        return;
      case MyDslPackage.MATERIA__RECURSOS:
        getRecursos().clear();
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
      case MyDslPackage.MATERIA__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyDslPackage.MATERIA__CANTIDAD_DE_DIAS:
        return cantidadDeDias != CANTIDAD_DE_DIAS_EDEFAULT;
      case MyDslPackage.MATERIA__CARGA_HORARIA:
        return cargaHoraria != CARGA_HORARIA_EDEFAULT;
      case MyDslPackage.MATERIA__RECURSOS:
        return recursos != null && !recursos.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", cantidadDeDias: ");
    result.append(cantidadDeDias);
    result.append(", cargaHoraria: ");
    result.append(cargaHoraria);
    result.append(", recursos: ");
    result.append(recursos);
    result.append(')');
    return result.toString();
  }

} //MateriaImpl
