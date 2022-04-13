/**
 * generated by Xtext 2.26.0
 */
package kcl.uk.dzh.zpl.raceGame;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kcl.uk.dzh.zpl.raceGame.VariableDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link kcl.uk.dzh.zpl.raceGame.VariableDeclaration#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see kcl.uk.dzh.zpl.raceGame.RaceGamePackage#getVariableDeclaration()
 * @model
 * @generated
 */
public interface VariableDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see kcl.uk.dzh.zpl.raceGame.RaceGamePackage#getVariableDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link kcl.uk.dzh.zpl.raceGame.VariableDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see kcl.uk.dzh.zpl.raceGame.RaceGamePackage#getVariableDeclaration_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link kcl.uk.dzh.zpl.raceGame.VariableDeclaration#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

} // VariableDeclaration
