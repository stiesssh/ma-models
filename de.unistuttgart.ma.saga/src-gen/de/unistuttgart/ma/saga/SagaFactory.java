/**
 */
package de.unistuttgart.ma.saga;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.unistuttgart.ma.saga.SagaPackage
 * @generated
 */
public interface SagaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SagaFactory eINSTANCE = de.unistuttgart.ma.saga.impl.SagaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project</em>'.
	 * @generated
	 */
	Project createProject();

	/**
	 * Returns a new object of class '<em>Component Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Adapter</em>'.
	 * @generated
	 */
	ComponentAdapter createComponentAdapter();

	/**
	 * Returns a new object of class '<em>Component Interface Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Interface Adapter</em>'.
	 * @generated
	 */
	ComponentInterfaceAdapter createComponentInterfaceAdapter();

	/**
	 * Returns a new object of class '<em>Saga</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Saga</em>'.
	 * @generated
	 */
	Saga createSaga();

	/**
	 * Returns a new object of class '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Step</em>'.
	 * @generated
	 */
	SagaStep createSagaStep();

	/**
	 * Returns a new object of class '<em>Violation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Violation</em>'.
	 * @generated
	 */
	Violation createViolation();

	/**
	 * Returns a new object of class '<em>Impact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Impact</em>'.
	 * @generated
	 */
	Impact createImpact();

	/**
	 * Returns a new object of class '<em>Notification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Notification</em>'.
	 * @generated
	 */
	Notification createNotification();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SagaPackage getSagaPackage();

} //SagaFactory
