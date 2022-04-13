/**
 * generated by Xtext 2.26.0
 */
package kcl.uk.dzh.zpl.raceGame;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kcl.uk.dzh.zpl.raceGame.FieldSpecification#getName <em>Name</em>}</li>
 *   <li>{@link kcl.uk.dzh.zpl.raceGame.FieldSpecification#getEnemyCount <em>Enemy Count</em>}</li>
 *   <li>{@link kcl.uk.dzh.zpl.raceGame.FieldSpecification#getObstacle <em>Obstacle</em>}</li>
 *   <li>{@link kcl.uk.dzh.zpl.raceGame.FieldSpecification#getNextLevel <em>Next Level</em>}</li>
 * </ul>
 *
 * @see kcl.uk.dzh.zpl.raceGame.RaceGamePackage#getFieldSpecification()
 * @model
 * @generated
 */
public interface FieldSpecification extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see kcl.uk.dzh.zpl.raceGame.RaceGamePackage#getFieldSpecification_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link kcl.uk.dzh.zpl.raceGame.FieldSpecification#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Enemy Count</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enemy Count</em>' containment reference.
   * @see #setEnemyCount(Expression)
   * @see kcl.uk.dzh.zpl.raceGame.RaceGamePackage#getFieldSpecification_EnemyCount()
   * @model containment="true"
   * @generated
   */
  Expression getEnemyCount();

  /**
   * Sets the value of the '{@link kcl.uk.dzh.zpl.raceGame.FieldSpecification#getEnemyCount <em>Enemy Count</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enemy Count</em>' containment reference.
   * @see #getEnemyCount()
   * @generated
   */
  void setEnemyCount(Expression value);

  /**
   * Returns the value of the '<em><b>Obstacle</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Obstacle</em>' containment reference.
   * @see #setObstacle(Obstaclepecification)
   * @see kcl.uk.dzh.zpl.raceGame.RaceGamePackage#getFieldSpecification_Obstacle()
   * @model containment="true"
   * @generated
   */
  Obstaclepecification getObstacle();

  /**
   * Sets the value of the '{@link kcl.uk.dzh.zpl.raceGame.FieldSpecification#getObstacle <em>Obstacle</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Obstacle</em>' containment reference.
   * @see #getObstacle()
   * @generated
   */
  void setObstacle(Obstaclepecification value);

  /**
   * Returns the value of the '<em><b>Next Level</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Next Level</em>' reference.
   * @see #setNextLevel(FieldSpecification)
   * @see kcl.uk.dzh.zpl.raceGame.RaceGamePackage#getFieldSpecification_NextLevel()
   * @model
   * @generated
   */
  FieldSpecification getNextLevel();

  /**
   * Sets the value of the '{@link kcl.uk.dzh.zpl.raceGame.FieldSpecification#getNextLevel <em>Next Level</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Next Level</em>' reference.
   * @see #getNextLevel()
   * @generated
   */
  void setNextLevel(FieldSpecification value);

} // FieldSpecification