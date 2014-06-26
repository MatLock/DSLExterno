/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.example.mydsl.myDsl.Aula;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Recursos;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aula</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AulaImpl#getIdAula <em>Id Aula</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AulaImpl#getRecursos <em>Recursos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AulaImpl extends ClaseImpl implements Aula
{
  /**
   * The default value of the '{@link #getIdAula() <em>Id Aula</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdAula()
   * @generated
   * @ordered
   */
  protected static final int ID_AULA_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getIdAula() <em>Id Aula</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdAula()
   * @generated
   * @ordered
   */
  protected int idAula = ID_AULA_EDEFAULT;

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
  protected AulaImpl()
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
    return MyDslPackage.Literals.AULA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getIdAula()
  {
    return idAula;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdAula(int newIdAula)
  {
    int oldIdAula = idAula;
    idAula = newIdAula;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.AULA__ID_AULA, oldIdAula, idAula));
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
      recursos = new EDataTypeEList<Recursos>(Recursos.class, this, MyDslPackage.AULA__RECURSOS);
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
      case MyDslPackage.AULA__ID_AULA:
        return getIdAula();
      case MyDslPackage.AULA__RECURSOS:
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
      case MyDslPackage.AULA__ID_AULA:
        setIdAula((Integer)newValue);
        return;
      case MyDslPackage.AULA__RECURSOS:
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
      case MyDslPackage.AULA__ID_AULA:
        setIdAula(ID_AULA_EDEFAULT);
        return;
      case MyDslPackage.AULA__RECURSOS:
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
      case MyDslPackage.AULA__ID_AULA:
        return idAula != ID_AULA_EDEFAULT;
      case MyDslPackage.AULA__RECURSOS:
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
    result.append(" (idAula: ");
    result.append(idAula);
    result.append(", recursos: ");
    result.append(recursos);
    result.append(')');
    return result.toString();
  }

} //AulaImpl
