/**
 */
package de.unistuttgart.ma.saga;

import de.unistuttgart.gropius.ComponentInterface;

import org.eclipse.bpmn2.Task;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.ma.saga.SagaStep#getTask <em>Task</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.SagaStep#getNextStep <em>Next Step</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.SagaStep#getComponentInterface <em>Component Interface</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.ma.saga.SagaPackage#getSagaStep()
 * @model
 * @generated
 */
public interface SagaStep extends IdentifiableElement {
	/**
	 * Returns the value of the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' reference.
	 * @see #setTask(Task)
	 * @see de.unistuttgart.ma.saga.SagaPackage#getSagaStep_Task()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Task getTask();

	/**
	 * Sets the value of the '{@link de.unistuttgart.ma.saga.SagaStep#getTask <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(Task value);

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

	/**
	 * Returns the value of the '<em><b>Component Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Interface</em>' reference.
	 * @see #setComponentInterface(ComponentInterface)
	 * @see de.unistuttgart.ma.saga.SagaPackage#getSagaStep_ComponentInterface()
	 * @model required="true"
	 * @generated
	 */
	ComponentInterface getComponentInterface();

	/**
	 * Sets the value of the '{@link de.unistuttgart.ma.saga.SagaStep#getComponentInterface <em>Component Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Interface</em>' reference.
	 * @see #getComponentInterface()
	 * @generated
	 */
	void setComponentInterface(ComponentInterface value);

} // SagaStep
