/**
 */
package org.uqbar.paco.dsl.xtext.saludos.saludosDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.uqbar.paco.dsl.xtext.saludos.saludosDSL.Model#getQuienes <em>Quienes</em>}</li>
 *   <li>{@link org.uqbar.paco.dsl.xtext.saludos.saludosDSL.Model#getSaludos <em>Saludos</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.uqbar.paco.dsl.xtext.saludos.saludosDSL.SaludosDSLPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Quienes</b></em>' containment reference list.
   * The list contents are of type {@link org.uqbar.paco.dsl.xtext.saludos.saludosDSL.Alguien}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Quienes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Quienes</em>' containment reference list.
   * @see org.uqbar.paco.dsl.xtext.saludos.saludosDSL.SaludosDSLPackage#getModel_Quienes()
   * @model containment="true"
   * @generated
   */
  EList<Alguien> getQuienes();

  /**
   * Returns the value of the '<em><b>Saludos</b></em>' containment reference list.
   * The list contents are of type {@link org.uqbar.paco.dsl.xtext.saludos.saludosDSL.Saludo}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Saludos</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Saludos</em>' containment reference list.
   * @see org.uqbar.paco.dsl.xtext.saludos.saludosDSL.SaludosDSLPackage#getModel_Saludos()
   * @model containment="true"
   * @generated
   */
  EList<Saludo> getSaludos();

} // Model
