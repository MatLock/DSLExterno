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
import org.xtext.example.mydsl.myDsl.Curso;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Planificacion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Planificacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.PlanificacionImpl#getAnio <em>Anio</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.PlanificacionImpl#getSemestre <em>Semestre</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.PlanificacionImpl#getCursos <em>Cursos</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.PlanificacionImpl#getAsignaciones <em>Asignaciones</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlanificacionImpl extends ClaseImpl implements Planificacion
{
  /**
   * The default value of the '{@link #getAnio() <em>Anio</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnio()
   * @generated
   * @ordered
   */
  protected static final int ANIO_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getAnio() <em>Anio</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnio()
   * @generated
   * @ordered
   */
  protected int anio = ANIO_EDEFAULT;

  /**
   * The default value of the '{@link #getSemestre() <em>Semestre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSemestre()
   * @generated
   * @ordered
   */
  protected static final int SEMESTRE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSemestre() <em>Semestre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSemestre()
   * @generated
   * @ordered
   */
  protected int semestre = SEMESTRE_EDEFAULT;

  /**
   * The cached value of the '{@link #getCursos() <em>Cursos</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCursos()
   * @generated
   * @ordered
   */
  protected EList<Curso> cursos;

  /**
   * The cached value of the '{@link #getAsignaciones() <em>Asignaciones</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAsignaciones()
   * @generated
   * @ordered
   */
  protected EList<Asignacion> asignaciones;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PlanificacionImpl()
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
    return MyDslPackage.Literals.PLANIFICACION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getAnio()
  {
    return anio;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnio(int newAnio)
  {
    int oldAnio = anio;
    anio = newAnio;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PLANIFICACION__ANIO, oldAnio, anio));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSemestre()
  {
    return semestre;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSemestre(int newSemestre)
  {
    int oldSemestre = semestre;
    semestre = newSemestre;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PLANIFICACION__SEMESTRE, oldSemestre, semestre));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Curso> getCursos()
  {
    if (cursos == null)
    {
      cursos = new EObjectContainmentEList<Curso>(Curso.class, this, MyDslPackage.PLANIFICACION__CURSOS);
    }
    return cursos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Asignacion> getAsignaciones()
  {
    if (asignaciones == null)
    {
      asignaciones = new EObjectContainmentEList<Asignacion>(Asignacion.class, this, MyDslPackage.PLANIFICACION__ASIGNACIONES);
    }
    return asignaciones;
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
      case MyDslPackage.PLANIFICACION__CURSOS:
        return ((InternalEList<?>)getCursos()).basicRemove(otherEnd, msgs);
      case MyDslPackage.PLANIFICACION__ASIGNACIONES:
        return ((InternalEList<?>)getAsignaciones()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.PLANIFICACION__ANIO:
        return getAnio();
      case MyDslPackage.PLANIFICACION__SEMESTRE:
        return getSemestre();
      case MyDslPackage.PLANIFICACION__CURSOS:
        return getCursos();
      case MyDslPackage.PLANIFICACION__ASIGNACIONES:
        return getAsignaciones();
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
      case MyDslPackage.PLANIFICACION__ANIO:
        setAnio((Integer)newValue);
        return;
      case MyDslPackage.PLANIFICACION__SEMESTRE:
        setSemestre((Integer)newValue);
        return;
      case MyDslPackage.PLANIFICACION__CURSOS:
        getCursos().clear();
        getCursos().addAll((Collection<? extends Curso>)newValue);
        return;
      case MyDslPackage.PLANIFICACION__ASIGNACIONES:
        getAsignaciones().clear();
        getAsignaciones().addAll((Collection<? extends Asignacion>)newValue);
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
      case MyDslPackage.PLANIFICACION__ANIO:
        setAnio(ANIO_EDEFAULT);
        return;
      case MyDslPackage.PLANIFICACION__SEMESTRE:
        setSemestre(SEMESTRE_EDEFAULT);
        return;
      case MyDslPackage.PLANIFICACION__CURSOS:
        getCursos().clear();
        return;
      case MyDslPackage.PLANIFICACION__ASIGNACIONES:
        getAsignaciones().clear();
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
      case MyDslPackage.PLANIFICACION__ANIO:
        return anio != ANIO_EDEFAULT;
      case MyDslPackage.PLANIFICACION__SEMESTRE:
        return semestre != SEMESTRE_EDEFAULT;
      case MyDslPackage.PLANIFICACION__CURSOS:
        return cursos != null && !cursos.isEmpty();
      case MyDslPackage.PLANIFICACION__ASIGNACIONES:
        return asignaciones != null && !asignaciones.isEmpty();
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
    result.append(" (anio: ");
    result.append(anio);
    result.append(", semestre: ");
    result.append(semestre);
    result.append(')');
    return result.toString();
  }

} //PlanificacionImpl
