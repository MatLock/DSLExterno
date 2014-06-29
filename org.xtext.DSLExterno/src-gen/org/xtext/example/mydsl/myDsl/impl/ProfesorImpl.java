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

import org.xtext.example.mydsl.myDsl.Dedicacion;
import org.xtext.example.mydsl.myDsl.DiasHabilidatos;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Profesor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Profesor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ProfesorImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ProfesorImpl#getDedicacion <em>Dedicacion</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ProfesorImpl#getDiasQuePuede <em>Dias Que Puede</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProfesorImpl extends ClaseImpl implements Profesor
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
   * The default value of the '{@link #getDedicacion() <em>Dedicacion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDedicacion()
   * @generated
   * @ordered
   */
  protected static final Dedicacion DEDICACION_EDEFAULT = Dedicacion.SIMPLE;

  /**
   * The cached value of the '{@link #getDedicacion() <em>Dedicacion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDedicacion()
   * @generated
   * @ordered
   */
  protected Dedicacion dedicacion = DEDICACION_EDEFAULT;

  /**
   * The cached value of the '{@link #getDiasQuePuede() <em>Dias Que Puede</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDiasQuePuede()
   * @generated
   * @ordered
   */
  protected EList<DiasHabilidatos> diasQuePuede;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProfesorImpl()
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
    return MyDslPackage.Literals.PROFESOR;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PROFESOR__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dedicacion getDedicacion()
  {
    return dedicacion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDedicacion(Dedicacion newDedicacion)
  {
    Dedicacion oldDedicacion = dedicacion;
    dedicacion = newDedicacion == null ? DEDICACION_EDEFAULT : newDedicacion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PROFESOR__DEDICACION, oldDedicacion, dedicacion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DiasHabilidatos> getDiasQuePuede()
  {
    if (diasQuePuede == null)
    {
      diasQuePuede = new EObjectContainmentEList<DiasHabilidatos>(DiasHabilidatos.class, this, MyDslPackage.PROFESOR__DIAS_QUE_PUEDE);
    }
    return diasQuePuede;
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
      case MyDslPackage.PROFESOR__DIAS_QUE_PUEDE:
        return ((InternalEList<?>)getDiasQuePuede()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.PROFESOR__NAME:
        return getName();
      case MyDslPackage.PROFESOR__DEDICACION:
        return getDedicacion();
      case MyDslPackage.PROFESOR__DIAS_QUE_PUEDE:
        return getDiasQuePuede();
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
      case MyDslPackage.PROFESOR__NAME:
        setName((String)newValue);
        return;
      case MyDslPackage.PROFESOR__DEDICACION:
        setDedicacion((Dedicacion)newValue);
        return;
      case MyDslPackage.PROFESOR__DIAS_QUE_PUEDE:
        getDiasQuePuede().clear();
        getDiasQuePuede().addAll((Collection<? extends DiasHabilidatos>)newValue);
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
      case MyDslPackage.PROFESOR__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyDslPackage.PROFESOR__DEDICACION:
        setDedicacion(DEDICACION_EDEFAULT);
        return;
      case MyDslPackage.PROFESOR__DIAS_QUE_PUEDE:
        getDiasQuePuede().clear();
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
      case MyDslPackage.PROFESOR__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyDslPackage.PROFESOR__DEDICACION:
        return dedicacion != DEDICACION_EDEFAULT;
      case MyDslPackage.PROFESOR__DIAS_QUE_PUEDE:
        return diasQuePuede != null && !diasQuePuede.isEmpty();
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
    result.append(", dedicacion: ");
    result.append(dedicacion);
    result.append(')');
    return result.toString();
  }

} //ProfesorImpl
