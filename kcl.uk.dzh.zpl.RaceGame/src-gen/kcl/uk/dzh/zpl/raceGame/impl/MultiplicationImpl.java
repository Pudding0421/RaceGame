/**
 * generated by Xtext 2.26.0
 */
package kcl.uk.dzh.zpl.raceGame.impl;

import java.util.Collection;

import kcl.uk.dzh.zpl.raceGame.Expression;
import kcl.uk.dzh.zpl.raceGame.Multiplication;
import kcl.uk.dzh.zpl.raceGame.RaceGamePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiplication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kcl.uk.dzh.zpl.raceGame.impl.MultiplicationImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link kcl.uk.dzh.zpl.raceGame.impl.MultiplicationImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link kcl.uk.dzh.zpl.raceGame.impl.MultiplicationImpl#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultiplicationImpl extends ExpressionImpl implements Multiplication
{
  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected Expression left;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected EList<String> operator;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected EList<Expression> right;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MultiplicationImpl()
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
    return RaceGamePackage.Literals.MULTIPLICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(Expression newLeft, NotificationChain msgs)
  {
    Expression oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RaceGamePackage.MULTIPLICATION__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLeft(Expression newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RaceGamePackage.MULTIPLICATION__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RaceGamePackage.MULTIPLICATION__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RaceGamePackage.MULTIPLICATION__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getOperator()
  {
    if (operator == null)
    {
      operator = new EDataTypeEList<String>(String.class, this, RaceGamePackage.MULTIPLICATION__OPERATOR);
    }
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Expression> getRight()
  {
    if (right == null)
    {
      right = new EObjectContainmentEList<Expression>(Expression.class, this, RaceGamePackage.MULTIPLICATION__RIGHT);
    }
    return right;
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
      case RaceGamePackage.MULTIPLICATION__LEFT:
        return basicSetLeft(null, msgs);
      case RaceGamePackage.MULTIPLICATION__RIGHT:
        return ((InternalEList<?>)getRight()).basicRemove(otherEnd, msgs);
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
      case RaceGamePackage.MULTIPLICATION__LEFT:
        return getLeft();
      case RaceGamePackage.MULTIPLICATION__OPERATOR:
        return getOperator();
      case RaceGamePackage.MULTIPLICATION__RIGHT:
        return getRight();
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
      case RaceGamePackage.MULTIPLICATION__LEFT:
        setLeft((Expression)newValue);
        return;
      case RaceGamePackage.MULTIPLICATION__OPERATOR:
        getOperator().clear();
        getOperator().addAll((Collection<? extends String>)newValue);
        return;
      case RaceGamePackage.MULTIPLICATION__RIGHT:
        getRight().clear();
        getRight().addAll((Collection<? extends Expression>)newValue);
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
      case RaceGamePackage.MULTIPLICATION__LEFT:
        setLeft((Expression)null);
        return;
      case RaceGamePackage.MULTIPLICATION__OPERATOR:
        getOperator().clear();
        return;
      case RaceGamePackage.MULTIPLICATION__RIGHT:
        getRight().clear();
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
      case RaceGamePackage.MULTIPLICATION__LEFT:
        return left != null;
      case RaceGamePackage.MULTIPLICATION__OPERATOR:
        return operator != null && !operator.isEmpty();
      case RaceGamePackage.MULTIPLICATION__RIGHT:
        return right != null && !right.isEmpty();
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (operator: ");
    result.append(operator);
    result.append(')');
    return result.toString();
  }

} //MultiplicationImpl
