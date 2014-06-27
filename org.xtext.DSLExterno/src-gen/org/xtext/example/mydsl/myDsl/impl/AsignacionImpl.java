/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.Asignacion;
import org.xtext.example.mydsl.myDsl.Dia;
import org.xtext.example.mydsl.myDsl.Horario;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asignacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AsignacionImpl#getDia <em>Dia</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AsignacionImpl#getHorarios <em>Horarios</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AsignacionImpl extends ClaseImpl implements Asignacion
{
  /**
   * The default value of the '{@link #getDia() <em>Dia</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDia()
   * @generated
   * @ordered
   */
  protected static final Dia DIA_EDEFAULT = Dia.LUNES;

  /**
   * The cached value of the '{@link #getDia() <em>Dia</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDia()
   * @generated
   * @ordered
   */
  protected Dia dia = DIA_EDEFAULT;

  /**
   * The cached value of the '{@link #getHorarios() <em>Horarios</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHorarios()
   * @generated
   * @ordered
   */
  protected EList<Horario> horarios;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AsignacionImpl()
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
    return MyDslPackage.Literals.ASIGNACION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dia getDia()
  {
    return dia;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDia(Dia newDia)
  {
    Dia oldDia = dia;
    dia = newDia == null ? DIA_EDEFAULT : newDia;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ASIGNACION__DIA, oldDia, dia));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Horario> getHorarios()
  {
    if (horarios == null)
    {
      horarios = new EObjectContainmentEList<Horario>(Horario.class, this, MyDslPackage.ASIGNACION__HORARIOS);
    }
    return horarios;
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
      case MyDslPackage.ASIGNACION__HORARIOS:
        return ((InternalEList<?>)getHorarios()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.ASIGNACION__DIA:
        return getDia();
      case MyDslPackage.ASIGNACION__HORARIOS:
        return getHorarios();
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
      case MyDslPackage.ASIGNACION__DIA:
        setDia((Dia)newValue);
        return;
      case MyDslPackage.ASIGNACION__HORARIOS:
        getHorarios().clear();
        getHorarios().addAll((Collection<? extends Horario>)newValue);
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
      case MyDslPackage.ASIGNACION__DIA:
        setDia(DIA_EDEFAULT);
        return;
      case MyDslPackage.ASIGNACION__HORARIOS:
        getHorarios().clear();
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
      case MyDslPackage.ASIGNACION__DIA:
        return dia != DIA_EDEFAULT;
      case MyDslPackage.ASIGNACION__HORARIOS:
        return horarios != null && !horarios.isEmpty();
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
    result.append(" (dia: ");
    result.append(dia);
    result.append(')');
    return result.toString();
  }

} //AsignacionImpl
