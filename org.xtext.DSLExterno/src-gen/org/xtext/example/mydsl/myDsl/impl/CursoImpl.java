/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.Curso;
import org.xtext.example.mydsl.myDsl.Materia;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Profesor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Curso</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.CursoImpl#getMateria <em>Materia</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.CursoImpl#getDictadaPor <em>Dictada Por</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.CursoImpl#getInscriptos <em>Inscriptos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CursoImpl extends MinimalEObjectImpl.Container implements Curso
{
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
   * The cached value of the '{@link #getDictadaPor() <em>Dictada Por</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDictadaPor()
   * @generated
   * @ordered
   */
  protected Profesor dictadaPor;

  /**
   * The default value of the '{@link #getInscriptos() <em>Inscriptos</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInscriptos()
   * @generated
   * @ordered
   */
  protected static final int INSCRIPTOS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getInscriptos() <em>Inscriptos</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInscriptos()
   * @generated
   * @ordered
   */
  protected int inscriptos = INSCRIPTOS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CursoImpl()
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
    return MyDslPackage.Literals.CURSO;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.CURSO__MATERIA, oldMateria, materia));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CURSO__MATERIA, oldMateria, materia));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Profesor getDictadaPor()
  {
    if (dictadaPor != null && dictadaPor.eIsProxy())
    {
      InternalEObject oldDictadaPor = (InternalEObject)dictadaPor;
      dictadaPor = (Profesor)eResolveProxy(oldDictadaPor);
      if (dictadaPor != oldDictadaPor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.CURSO__DICTADA_POR, oldDictadaPor, dictadaPor));
      }
    }
    return dictadaPor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Profesor basicGetDictadaPor()
  {
    return dictadaPor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDictadaPor(Profesor newDictadaPor)
  {
    Profesor oldDictadaPor = dictadaPor;
    dictadaPor = newDictadaPor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CURSO__DICTADA_POR, oldDictadaPor, dictadaPor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getInscriptos()
  {
    return inscriptos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInscriptos(int newInscriptos)
  {
    int oldInscriptos = inscriptos;
    inscriptos = newInscriptos;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CURSO__INSCRIPTOS, oldInscriptos, inscriptos));
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
      case MyDslPackage.CURSO__MATERIA:
        if (resolve) return getMateria();
        return basicGetMateria();
      case MyDslPackage.CURSO__DICTADA_POR:
        if (resolve) return getDictadaPor();
        return basicGetDictadaPor();
      case MyDslPackage.CURSO__INSCRIPTOS:
        return getInscriptos();
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
      case MyDslPackage.CURSO__MATERIA:
        setMateria((Materia)newValue);
        return;
      case MyDslPackage.CURSO__DICTADA_POR:
        setDictadaPor((Profesor)newValue);
        return;
      case MyDslPackage.CURSO__INSCRIPTOS:
        setInscriptos((Integer)newValue);
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
      case MyDslPackage.CURSO__MATERIA:
        setMateria((Materia)null);
        return;
      case MyDslPackage.CURSO__DICTADA_POR:
        setDictadaPor((Profesor)null);
        return;
      case MyDslPackage.CURSO__INSCRIPTOS:
        setInscriptos(INSCRIPTOS_EDEFAULT);
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
      case MyDslPackage.CURSO__MATERIA:
        return materia != null;
      case MyDslPackage.CURSO__DICTADA_POR:
        return dictadaPor != null;
      case MyDslPackage.CURSO__INSCRIPTOS:
        return inscriptos != INSCRIPTOS_EDEFAULT;
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
    result.append(" (inscriptos: ");
    result.append(inscriptos);
    result.append(')');
    return result.toString();
  }

} //CursoImpl
