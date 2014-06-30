/**
 */
package org.uqbar.paco.dsl.xtext.saludos.saludosDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Saludo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.uqbar.paco.dsl.xtext.saludos.saludosDSL.Saludo#getAQuien <em>AQuien</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.uqbar.paco.dsl.xtext.saludos.saludosDSL.SaludosDSLPackage#getSaludo()
 * @model
 * @generated
 */
public interface Saludo extends EObject
{
  /**
   * Returns the value of the '<em><b>AQuien</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>AQuien</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>AQuien</em>' reference.
   * @see #setAQuien(Alguien)
   * @see org.uqbar.paco.dsl.xtext.saludos.saludosDSL.SaludosDSLPackage#getSaludo_AQuien()
   * @model
   * @generated
   */
  Alguien getAQuien();

  /**
   * Sets the value of the '{@link org.uqbar.paco.dsl.xtext.saludos.saludosDSL.Saludo#getAQuien <em>AQuien</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>AQuien</em>' reference.
   * @see #getAQuien()
   * @generated
   */
  void setAQuien(Alguien value);

} // Saludo
