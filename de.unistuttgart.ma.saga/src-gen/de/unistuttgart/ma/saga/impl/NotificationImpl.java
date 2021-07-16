/**
 */
package de.unistuttgart.ma.saga.impl;

import de.unistuttgart.ma.saga.ChainLink;
import de.unistuttgart.ma.saga.Impact;
import de.unistuttgart.ma.saga.Notification;
import de.unistuttgart.ma.saga.SagaPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Notification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.ma.saga.impl.NotificationImpl#getChainlinks <em>Chainlinks</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.impl.NotificationImpl#getTopLevelImpact <em>Top Level Impact</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NotificationImpl extends IdentifiableElementImpl implements Notification {
	/**
	 * The cached value of the '{@link #getChainlinks() <em>Chainlinks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChainlinks()
	 * @generated
	 * @ordered
	 */
	protected EList<ChainLink> chainlinks;

	/**
	 * The cached value of the '{@link #getTopLevelImpact() <em>Top Level Impact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopLevelImpact()
	 * @generated
	 * @ordered
	 */
	protected Impact topLevelImpact;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SagaPackage.Literals.NOTIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChainLink> getChainlinks() {
		if (chainlinks == null) {
			chainlinks = new EObjectContainmentEList<ChainLink>(ChainLink.class, this, SagaPackage.NOTIFICATION__CHAINLINKS);
		}
		return chainlinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Impact getTopLevelImpact() {
		return topLevelImpact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopLevelImpact(Impact newTopLevelImpact) {
		Impact oldTopLevelImpact = topLevelImpact;
		topLevelImpact = newTopLevelImpact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET, SagaPackage.NOTIFICATION__TOP_LEVEL_IMPACT, oldTopLevelImpact, topLevelImpact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SagaPackage.NOTIFICATION__CHAINLINKS:
				return ((InternalEList<?>)getChainlinks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SagaPackage.NOTIFICATION__CHAINLINKS:
				return getChainlinks();
			case SagaPackage.NOTIFICATION__TOP_LEVEL_IMPACT:
				return getTopLevelImpact();
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
			case SagaPackage.NOTIFICATION__CHAINLINKS:
				getChainlinks().clear();
				getChainlinks().addAll((Collection<? extends ChainLink>)newValue);
				return;
			case SagaPackage.NOTIFICATION__TOP_LEVEL_IMPACT:
				setTopLevelImpact((Impact)newValue);
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
			case SagaPackage.NOTIFICATION__CHAINLINKS:
				getChainlinks().clear();
				return;
			case SagaPackage.NOTIFICATION__TOP_LEVEL_IMPACT:
				setTopLevelImpact((Impact)null);
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
			case SagaPackage.NOTIFICATION__CHAINLINKS:
				return chainlinks != null && !chainlinks.isEmpty();
			case SagaPackage.NOTIFICATION__TOP_LEVEL_IMPACT:
				return topLevelImpact != null;
		}
		return super.eIsSet(featureID);
	}

} //NotificationImpl
