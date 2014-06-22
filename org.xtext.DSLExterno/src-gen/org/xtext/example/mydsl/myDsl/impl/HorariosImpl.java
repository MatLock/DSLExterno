/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.common.types.JvmTypeReference;

import org.xtext.example.mydsl.myDsl.Horarios;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Horarios</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.HorariosImpl#getHorarioInicion <em>Horario Inicion</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.HorariosImpl#getHorarionFin <em>Horarion Fin</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.HorariosImpl#getAula <em>Aula</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.HorariosImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HorariosImpl extends AtributosImpl implements Horarios
{
  /**
   * The default value of the '{@link #getHorarioInicion() <em>Horario Inicion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHorarioInicion()
   * @generated
   * @ordered
   */
  protected static final String HORARIO_INICION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHorarioInicion() <em>Horario Inicion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHorarioInicion()
   * @generated
   * @ordered
   */
  protected String horarioInicion = HORARIO_INICION_EDEFAULT;

  /**
   * The default value of the '{@link #getHorarionFin() <em>Horarion Fin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHorarionFin()
   * @generated
   * @ordered
   */
  protected static final String HORARION_FIN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHorarionFin() <em>Horarion Fin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHorarionFin()
   * @generated
   * @ordered
   */
  protected String horarionFin = HORARION_FIN_EDEFAULT;

  /**
   * The default value of the '{@link #getAula() <em>Aula</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAula()
   * @generated
   * @ordered
   */
  protected static final String AULA_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAula() <em>Aula</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAula()
   * @generated
   * @ordered
   */
  protected String aula = AULA_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected JvmTypeReference type;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HorariosImpl()
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
    return MyDslPackage.Literals.HORARIOS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHorarioInicion()
  {
    return horarioInicion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHorarioInicion(String newHorarioInicion)
  {
    String oldHorarioInicion = horarioInicion;
    horarioInicion = newHorarioInicion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.HORARIOS__HORARIO_INICION, oldHorarioInicion, horarioInicion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHorarionFin()
  {
    return horarionFin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHorarionFin(String newHorarionFin)
  {
    String oldHorarionFin = horarionFin;
    horarionFin = newHorarionFin;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.HORARIOS__HORARION_FIN, oldHorarionFin, horarionFin));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAula()
  {
    return aula;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAula(String newAula)
  {
    String oldAula = aula;
    aula = newAula;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.HORARIOS__AULA, oldAula, aula));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmTypeReference getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(JvmTypeReference newType, NotificationChain msgs)
  {
    JvmTypeReference oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.HORARIOS__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(JvmTypeReference newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.HORARIOS__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.HORARIOS__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.HORARIOS__TYPE, newType, newType));
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
      case MyDslPackage.HORARIOS__TYPE:
        return basicSetType(null, msgs);
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
      case MyDslPackage.HORARIOS__HORARIO_INICION:
        return getHorarioInicion();
      case MyDslPackage.HORARIOS__HORARION_FIN:
        return getHorarionFin();
      case MyDslPackage.HORARIOS__AULA:
        return getAula();
      case MyDslPackage.HORARIOS__TYPE:
        return getType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.HORARIOS__HORARIO_INICION:
        setHorarioInicion((String)newValue);
        return;
      case MyDslPackage.HORARIOS__HORARION_FIN:
        setHorarionFin((String)newValue);
        return;
      case MyDslPackage.HORARIOS__AULA:
        setAula((String)newValue);
        return;
      case MyDslPackage.HORARIOS__TYPE:
        setType((JvmTypeReference)newValue);
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
      case MyDslPackage.HORARIOS__HORARIO_INICION:
        setHorarioInicion(HORARIO_INICION_EDEFAULT);
        return;
      case MyDslPackage.HORARIOS__HORARION_FIN:
        setHorarionFin(HORARION_FIN_EDEFAULT);
        return;
      case MyDslPackage.HORARIOS__AULA:
        setAula(AULA_EDEFAULT);
        return;
      case MyDslPackage.HORARIOS__TYPE:
        setType((JvmTypeReference)null);
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
      case MyDslPackage.HORARIOS__HORARIO_INICION:
        return HORARIO_INICION_EDEFAULT == null ? horarioInicion != null : !HORARIO_INICION_EDEFAULT.equals(horarioInicion);
      case MyDslPackage.HORARIOS__HORARION_FIN:
        return HORARION_FIN_EDEFAULT == null ? horarionFin != null : !HORARION_FIN_EDEFAULT.equals(horarionFin);
      case MyDslPackage.HORARIOS__AULA:
        return AULA_EDEFAULT == null ? aula != null : !AULA_EDEFAULT.equals(aula);
      case MyDslPackage.HORARIOS__TYPE:
        return type != null;
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
    result.append(" (horarioInicion: ");
    result.append(horarioInicion);
    result.append(", horarionFin: ");
    result.append(horarionFin);
    result.append(", aula: ");
    result.append(aula);
    result.append(')');
    return result.toString();
  }

} //HorariosImpl
