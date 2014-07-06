/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.Dia;
import org.xtext.example.mydsl.myDsl.DiasHabilitados;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dias Habilitados</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DiasHabilitadosImpl#getDia <em>Dia</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DiasHabilitadosImpl#getHoraInicio <em>Hora Inicio</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DiasHabilitadosImpl#getHoraFinal <em>Hora Final</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DiasHabilitadosImpl#getDiaQueNoPuede <em>Dia Que No Puede</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiasHabilitadosImpl extends MinimalEObjectImpl.Container implements DiasHabilitados
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
   * The default value of the '{@link #getHoraInicio() <em>Hora Inicio</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHoraInicio()
   * @generated
   * @ordered
   */
  protected static final int HORA_INICIO_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getHoraInicio() <em>Hora Inicio</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHoraInicio()
   * @generated
   * @ordered
   */
  protected int horaInicio = HORA_INICIO_EDEFAULT;

  /**
   * The default value of the '{@link #getHoraFinal() <em>Hora Final</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHoraFinal()
   * @generated
   * @ordered
   */
  protected static final int HORA_FINAL_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getHoraFinal() <em>Hora Final</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHoraFinal()
   * @generated
   * @ordered
   */
  protected int horaFinal = HORA_FINAL_EDEFAULT;

  /**
   * The default value of the '{@link #getDiaQueNoPuede() <em>Dia Que No Puede</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDiaQueNoPuede()
   * @generated
   * @ordered
   */
  protected static final Dia DIA_QUE_NO_PUEDE_EDEFAULT = Dia.LUNES;

  /**
   * The cached value of the '{@link #getDiaQueNoPuede() <em>Dia Que No Puede</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDiaQueNoPuede()
   * @generated
   * @ordered
   */
  protected Dia diaQueNoPuede = DIA_QUE_NO_PUEDE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DiasHabilitadosImpl()
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
    return MyDslPackage.Literals.DIAS_HABILITADOS;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DIAS_HABILITADOS__DIA, oldDia, dia));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getHoraInicio()
  {
    return horaInicio;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHoraInicio(int newHoraInicio)
  {
    int oldHoraInicio = horaInicio;
    horaInicio = newHoraInicio;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DIAS_HABILITADOS__HORA_INICIO, oldHoraInicio, horaInicio));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getHoraFinal()
  {
    return horaFinal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHoraFinal(int newHoraFinal)
  {
    int oldHoraFinal = horaFinal;
    horaFinal = newHoraFinal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DIAS_HABILITADOS__HORA_FINAL, oldHoraFinal, horaFinal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dia getDiaQueNoPuede()
  {
    return diaQueNoPuede;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDiaQueNoPuede(Dia newDiaQueNoPuede)
  {
    Dia oldDiaQueNoPuede = diaQueNoPuede;
    diaQueNoPuede = newDiaQueNoPuede == null ? DIA_QUE_NO_PUEDE_EDEFAULT : newDiaQueNoPuede;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DIAS_HABILITADOS__DIA_QUE_NO_PUEDE, oldDiaQueNoPuede, diaQueNoPuede));
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
      case MyDslPackage.DIAS_HABILITADOS__DIA:
        return getDia();
      case MyDslPackage.DIAS_HABILITADOS__HORA_INICIO:
        return getHoraInicio();
      case MyDslPackage.DIAS_HABILITADOS__HORA_FINAL:
        return getHoraFinal();
      case MyDslPackage.DIAS_HABILITADOS__DIA_QUE_NO_PUEDE:
        return getDiaQueNoPuede();
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
      case MyDslPackage.DIAS_HABILITADOS__DIA:
        setDia((Dia)newValue);
        return;
      case MyDslPackage.DIAS_HABILITADOS__HORA_INICIO:
        setHoraInicio((Integer)newValue);
        return;
      case MyDslPackage.DIAS_HABILITADOS__HORA_FINAL:
        setHoraFinal((Integer)newValue);
        return;
      case MyDslPackage.DIAS_HABILITADOS__DIA_QUE_NO_PUEDE:
        setDiaQueNoPuede((Dia)newValue);
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
      case MyDslPackage.DIAS_HABILITADOS__DIA:
        setDia(DIA_EDEFAULT);
        return;
      case MyDslPackage.DIAS_HABILITADOS__HORA_INICIO:
        setHoraInicio(HORA_INICIO_EDEFAULT);
        return;
      case MyDslPackage.DIAS_HABILITADOS__HORA_FINAL:
        setHoraFinal(HORA_FINAL_EDEFAULT);
        return;
      case MyDslPackage.DIAS_HABILITADOS__DIA_QUE_NO_PUEDE:
        setDiaQueNoPuede(DIA_QUE_NO_PUEDE_EDEFAULT);
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
      case MyDslPackage.DIAS_HABILITADOS__DIA:
        return dia != DIA_EDEFAULT;
      case MyDslPackage.DIAS_HABILITADOS__HORA_INICIO:
        return horaInicio != HORA_INICIO_EDEFAULT;
      case MyDslPackage.DIAS_HABILITADOS__HORA_FINAL:
        return horaFinal != HORA_FINAL_EDEFAULT;
      case MyDslPackage.DIAS_HABILITADOS__DIA_QUE_NO_PUEDE:
        return diaQueNoPuede != DIA_QUE_NO_PUEDE_EDEFAULT;
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
    result.append(", horaInicio: ");
    result.append(horaInicio);
    result.append(", horaFinal: ");
    result.append(horaFinal);
    result.append(", diaQueNoPuede: ");
    result.append(diaQueNoPuede);
    result.append(')');
    return result.toString();
  }

} //DiasHabilitadosImpl
