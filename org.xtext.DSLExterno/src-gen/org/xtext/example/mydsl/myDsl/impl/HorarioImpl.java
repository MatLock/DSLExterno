/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.Aula;
import org.xtext.example.mydsl.myDsl.Horario;
import org.xtext.example.mydsl.myDsl.Materia;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Horario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.HorarioImpl#getHorarioInicio <em>Horario Inicio</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.HorarioImpl#getHorarioFin <em>Horario Fin</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.HorarioImpl#getMateria <em>Materia</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.HorarioImpl#getAula <em>Aula</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HorarioImpl extends MinimalEObjectImpl.Container implements Horario
{
  /**
   * The default value of the '{@link #getHorarioInicio() <em>Horario Inicio</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHorarioInicio()
   * @generated
   * @ordered
   */
  protected static final int HORARIO_INICIO_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getHorarioInicio() <em>Horario Inicio</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHorarioInicio()
   * @generated
   * @ordered
   */
  protected int horarioInicio = HORARIO_INICIO_EDEFAULT;

  /**
   * The default value of the '{@link #getHorarioFin() <em>Horario Fin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHorarioFin()
   * @generated
   * @ordered
   */
  protected static final int HORARIO_FIN_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getHorarioFin() <em>Horario Fin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHorarioFin()
   * @generated
   * @ordered
   */
  protected int horarioFin = HORARIO_FIN_EDEFAULT;

  /**
   * The cached value of the '{@link #getMateria() <em>Materia</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMateria()
   * @generated
   * @ordered
   */
  protected Materia materia;

  /**
   * The cached value of the '{@link #getAula() <em>Aula</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAula()
   * @generated
   * @ordered
   */
  protected Aula aula;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HorarioImpl()
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
    return MyDslPackage.Literals.HORARIO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getHorarioInicio()
  {
    return horarioInicio;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHorarioInicio(int newHorarioInicio)
  {
    int oldHorarioInicio = horarioInicio;
    horarioInicio = newHorarioInicio;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.HORARIO__HORARIO_INICIO, oldHorarioInicio, horarioInicio));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getHorarioFin()
  {
    return horarioFin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHorarioFin(int newHorarioFin)
  {
    int oldHorarioFin = horarioFin;
    horarioFin = newHorarioFin;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.HORARIO__HORARIO_FIN, oldHorarioFin, horarioFin));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Materia getMateria()
  {
    if (materia != null && materia.eIsProxy())
    {
      InternalEObject oldMateria = (InternalEObject)materia;
      materia = (Materia)eResolveProxy(oldMateria);
      if (materia != oldMateria)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.HORARIO__MATERIA, oldMateria, materia));
      }
    }
    return materia;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Materia basicGetMateria()
  {
    return materia;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMateria(Materia newMateria)
  {
    Materia oldMateria = materia;
    materia = newMateria;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.HORARIO__MATERIA, oldMateria, materia));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Aula getAula()
  {
    if (aula != null && aula.eIsProxy())
    {
      InternalEObject oldAula = (InternalEObject)aula;
      aula = (Aula)eResolveProxy(oldAula);
      if (aula != oldAula)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.HORARIO__AULA, oldAula, aula));
      }
    }
    return aula;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Aula basicGetAula()
  {
    return aula;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAula(Aula newAula)
  {
    Aula oldAula = aula;
    aula = newAula;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.HORARIO__AULA, oldAula, aula));
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
      case MyDslPackage.HORARIO__HORARIO_INICIO:
        return getHorarioInicio();
      case MyDslPackage.HORARIO__HORARIO_FIN:
        return getHorarioFin();
      case MyDslPackage.HORARIO__MATERIA:
        if (resolve) return getMateria();
        return basicGetMateria();
      case MyDslPackage.HORARIO__AULA:
        if (resolve) return getAula();
        return basicGetAula();
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
      case MyDslPackage.HORARIO__HORARIO_INICIO:
        setHorarioInicio((Integer)newValue);
        return;
      case MyDslPackage.HORARIO__HORARIO_FIN:
        setHorarioFin((Integer)newValue);
        return;
      case MyDslPackage.HORARIO__MATERIA:
        setMateria((Materia)newValue);
        return;
      case MyDslPackage.HORARIO__AULA:
        setAula((Aula)newValue);
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
      case MyDslPackage.HORARIO__HORARIO_INICIO:
        setHorarioInicio(HORARIO_INICIO_EDEFAULT);
        return;
      case MyDslPackage.HORARIO__HORARIO_FIN:
        setHorarioFin(HORARIO_FIN_EDEFAULT);
        return;
      case MyDslPackage.HORARIO__MATERIA:
        setMateria((Materia)null);
        return;
      case MyDslPackage.HORARIO__AULA:
        setAula((Aula)null);
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
      case MyDslPackage.HORARIO__HORARIO_INICIO:
        return horarioInicio != HORARIO_INICIO_EDEFAULT;
      case MyDslPackage.HORARIO__HORARIO_FIN:
        return horarioFin != HORARIO_FIN_EDEFAULT;
      case MyDslPackage.HORARIO__MATERIA:
        return materia != null;
      case MyDslPackage.HORARIO__AULA:
        return aula != null;
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
    result.append(" (horarioInicio: ");
    result.append(horarioInicio);
    result.append(", horarioFin: ");
    result.append(horarioFin);
    result.append(')');
    return result.toString();
  }

} //HorarioImpl
