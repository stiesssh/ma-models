/**
 */
package de.unistuttgart.ma.saga.impl;

import de.unistuttgart.ma.saga.ChainLink;
import de.unistuttgart.ma.saga.Impact;
import de.unistuttgart.ma.saga.SagaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Impact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.ma.saga.impl.ImpactImpl#getCausedBy <em>Caused By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImpactImpl extends ChainLinkImpl implements Impact {
	/**
	 * The cached value of the '{@link #getCausedBy() <em>Caused By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCausedBy()
	 * @generated
	 * @ordered
	 */
	protected ChainLink causedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImpactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SagaPackage.Literals.IMPACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChainLink getCausedBy() {
		return causedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCausedBy(ChainLink newCausedBy) {
		ChainLink oldCausedBy = causedBy;
		causedBy = newCausedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SagaPackage.IMPACT__CAUSED_BY, oldCausedBy, causedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SagaPackage.IMPACT__CAUSED_BY:
				return getCausedBy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SagaPackage.IMPACT__CAUSED_BY:
				setCausedBy((ChainLink)newValue);
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
			case SagaPackage.IMPACT__CAUSED_BY:
				setCausedBy((ChainLink)null);
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
			case SagaPackage.IMPACT__CAUSED_BY:
				return causedBy != null;
		}
		return super.eIsSet(featureID);
	}

} //ImpactImpl
