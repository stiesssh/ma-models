/**
 */
package de.unistuttgart.ma.saga;

import org.eclipse.bpmn2.Task;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.ma.saga.SagaStep#getNextLevelElements <em>Next Level Elements</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.SagaStep#getNextStep <em>Next Step</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.ma.saga.SagaPackage#getSagaStep()
 * @model
 * @generated
 */
public interface SagaStep extends IdentifiableElement {
	/**
	 * Returns the value of the '<em><b>Next Level Elements</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.bpmn2.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Level Elements</em>' reference list.
	 * @see de.unistuttgart.ma.saga.SagaPackage#getSagaStep_NextLevelElements()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Task> getNextLevelElements();

	/**
	 * Returns the value of the '<em><b>Next Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Step</em>' reference.
	 * @see #setNextStep(SagaStep)
	 * @see de.unistuttgart.ma.saga.SagaPackage#getSagaStep_NextStep()
	 * @model
	 * @generated
	 */
	SagaStep getNextStep();

	/**
	 * Sets the value of the '{@link de.unistuttgart.ma.saga.SagaStep#getNextStep <em>Next Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Step</em>' reference.
	 * @see #getNextStep()
	 * @generated
	 */
	void setNextStep(SagaStep value);

} // SagaStep
