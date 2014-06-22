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

import org.xtext.example.mydsl.myDsl.Atributos;
import org.xtext.example.mydsl.myDsl.Dedicacion;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Profesor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Profesor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ProfesorImpl#getDedicacion <em>Dedicacion</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ProfesorImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ProfesorImpl#getAtributos <em>Atributos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProfesorImpl extends ClaseImpl implements Profesor
{
  /**
   * The default value of the '{@link #getDedicacion() <em>Dedicacion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDedicacion()
   * @generated
   * @ordered
   */
  protected static final String DEDICACION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDedicacion() <em>Dedicacion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDedicacion()
   * @generated
   * @ordered
   */
  protected String dedicacion = DEDICACION_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final Dedicacion TYPE_EDEFAULT = Dedicacion.SIMPLE;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Dedicacion type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getAtributos() <em>Atributos</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtributos()
   * @generated
   * @ordered
   */
  protected EList<Atributos> atributos;

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
  public String getDedicacion()
  {
    return dedicacion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDedicacion(String newDedicacion)
  {
    String oldDedicacion = dedicacion;
    dedicacion = newDedicacion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PROFESOR__DEDICACION, oldDedicacion, dedicacion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dedicacion getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Dedicacion newType)
  {
    Dedicacion oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PROFESOR__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Atributos> getAtributos()
  {
    if (atributos == null)
    {
      atributos = new EObjectContainmentEList<Atributos>(Atributos.class, this, MyDslPackage.PROFESOR__ATRIBUTOS);
    }
    return atributos;
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
      case MyDslPackage.PROFESOR__ATRIBUTOS:
        return ((InternalEList<?>)getAtributos()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.PROFESOR__DEDICACION:
        return getDedicacion();
      case MyDslPackage.PROFESOR__TYPE:
        return getType();
      case MyDslPackage.PROFESOR__ATRIBUTOS:
        return getAtributos();
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
      case MyDslPackage.PROFESOR__DEDICACION:
        setDedicacion((String)newValue);
        return;
      case MyDslPackage.PROFESOR__TYPE:
        setType((Dedicacion)newValue);
        return;
      case MyDslPackage.PROFESOR__ATRIBUTOS:
        getAtributos().clear();
        getAtributos().addAll((Collection<? extends Atributos>)newValue);
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
      case MyDslPackage.PROFESOR__DEDICACION:
        setDedicacion(DEDICACION_EDEFAULT);
        return;
      case MyDslPackage.PROFESOR__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case MyDslPackage.PROFESOR__ATRIBUTOS:
        getAtributos().clear();
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
      case MyDslPackage.PROFESOR__DEDICACION:
        return DEDICACION_EDEFAULT == null ? dedicacion != null : !DEDICACION_EDEFAULT.equals(dedicacion);
      case MyDslPackage.PROFESOR__TYPE:
        return type != TYPE_EDEFAULT;
      case MyDslPackage.PROFESOR__ATRIBUTOS:
        return atributos != null && !atributos.isEmpty();
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
    result.append(" (dedicacion: ");
    result.append(dedicacion);
    result.append(", type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //ProfesorImpl
