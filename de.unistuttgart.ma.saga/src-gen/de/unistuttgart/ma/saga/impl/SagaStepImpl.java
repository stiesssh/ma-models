/**
 */
package de.unistuttgart.ma.saga.impl;

import de.unistuttgart.ma.saga.SagaPackage;
import de.unistuttgart.ma.saga.SagaStep;

import java.util.Collection;

import org.eclipse.bpmn2.Task;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.ma.saga.impl.SagaStepImpl#getNextLevelElements <em>Next Level Elements</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.impl.SagaStepImpl#getNextStep <em>Next Step</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SagaStepImpl extends IdentifiableElementImpl implements SagaStep {
	/**
	 * The cached value of the '{@link #getNextLevelElements() <em>Next Level Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextLevelElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> nextLevelElements;

	/**
	 * The cached value of the '{@link #getNextStep() <em>Next Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextStep()
	 * @generated
	 * @ordered
	 */
	protected SagaStep nextStep;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SagaStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SagaPackage.Literals.SAGA_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getNextLevelElements() {
		if (nextLevelElements == null) {
			nextLevelElements = new EObjectResolvingEList<Task>(Task.class, this, SagaPackage.SAGA_STEP__NEXT_LEVEL_ELEMENTS);
		}
		return nextLevelElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SagaStep getNextStep() {
		if (nextStep != null && nextStep.eIsProxy()) {
			InternalEObject oldNextStep = (InternalEObject)nextStep;
			nextStep = (SagaStep)eResolveProxy(oldNextStep);
			if (nextStep != oldNextStep) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SagaPackage.SAGA_STEP__NEXT_STEP, oldNextStep, nextStep));
			}
		}
		return nextStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SagaStep basicGetNextStep() {
		return nextStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextStep(SagaStep newNextStep) {
		SagaStep oldNextStep = nextStep;
		nextStep = newNextStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SagaPackage.SAGA_STEP__NEXT_STEP, oldNextStep, nextStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SagaPackage.SAGA_STEP__NEXT_LEVEL_ELEMENTS:
				return getNextLevelElements();
			case SagaPackage.SAGA_STEP__NEXT_STEP:
				if (resolve) return getNextStep();
				return basicGetNextStep();
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
			case SagaPackage.SAGA_STEP__NEXT_LEVEL_ELEMENTS:
				getNextLevelElements().clear();
				getNextLevelElements().addAll((Collection<? extends Task>)newValue);
				return;
			case SagaPackage.SAGA_STEP__NEXT_STEP:
				setNextStep((SagaStep)newValue);
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
			case SagaPackage.SAGA_STEP__NEXT_LEVEL_ELEMENTS:
				getNextLevelElements().clear();
				return;
			case SagaPackage.SAGA_STEP__NEXT_STEP:
				setNextStep((SagaStep)null);
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
			case SagaPackage.SAGA_STEP__NEXT_LEVEL_ELEMENTS:
				return nextLevelElements != null && !nextLevelElements.isEmpty();
			case SagaPackage.SAGA_STEP__NEXT_STEP:
				return nextStep != null;
		}
		return super.eIsSet(featureID);
	}

} //SagaStepImpl
