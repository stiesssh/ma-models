/**
 */
package de.unistuttgart.ma.saga.impl;

import de.unistuttgart.ma.saga.ChainLink;
import de.unistuttgart.ma.saga.SagaPackage;
import de.unistuttgart.ma.saga.Violation;

import gropius.slo.SloRule;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Violation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.ma.saga.impl.ViolationImpl#getPassingImpacts <em>Passing Impacts</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.impl.ViolationImpl#getViolatedRule <em>Violated Rule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViolationImpl extends ChainLinkImpl implements Violation {
	/**
	 * The cached value of the '{@link #getPassingImpacts() <em>Passing Impacts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassingImpacts()
	 * @generated
	 * @ordered
	 */
	protected EList<ChainLink> passingImpacts;

	/**
	 * The cached value of the '{@link #getViolatedRule() <em>Violated Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViolatedRule()
	 * @generated
	 * @ordered
	 */
	protected SloRule violatedRule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViolationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SagaPackage.Literals.VIOLATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChainLink> getPassingImpacts() {
		if (passingImpacts == null) {
			passingImpacts = new EObjectResolvingEList<ChainLink>(ChainLink.class, this, SagaPackage.VIOLATION__PASSING_IMPACTS);
		}
		return passingImpacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SloRule getViolatedRule() {
		if (violatedRule != null && violatedRule.eIsProxy()) {
			InternalEObject oldViolatedRule = (InternalEObject)violatedRule;
			violatedRule = (SloRule)eResolveProxy(oldViolatedRule);
			if (violatedRule != oldViolatedRule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SagaPackage.VIOLATION__VIOLATED_RULE, oldViolatedRule, violatedRule));
			}
		}
		return violatedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SloRule basicGetViolatedRule() {
		return violatedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViolatedRule(SloRule newViolatedRule) {
		SloRule oldViolatedRule = violatedRule;
		violatedRule = newViolatedRule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SagaPackage.VIOLATION__VIOLATED_RULE, oldViolatedRule, violatedRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SagaPackage.VIOLATION__PASSING_IMPACTS:
				return getPassingImpacts();
			case SagaPackage.VIOLATION__VIOLATED_RULE:
				if (resolve) return getViolatedRule();
				return basicGetViolatedRule();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SagaPackage.VIOLATION__PASSING_IMPACTS:
				getPassingImpacts().clear();
				getPassingImpacts().addAll((Collection<? extends ChainLink>)newValue);
				return;
			case SagaPackage.VIOLATION__VIOLATED_RULE:
				setViolatedRule((SloRule)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case SagaPackage.VIOLATION__PASSING_IMPACTS:
				getPassingImpacts().clear();
				return;
			case SagaPackage.VIOLATION__VIOLATED_RULE:
				setViolatedRule((SloRule)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SagaPackage.VIOLATION__PASSING_IMPACTS:
				return passingImpacts != null && !passingImpacts.isEmpty();
			case SagaPackage.VIOLATION__VIOLATED_RULE:
				return violatedRule != null;
		}
		return super.eIsSet(featureID);
	}

} //ViolationImpl
