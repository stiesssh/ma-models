/**
 */
package de.unistuttgart.ma.saga;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Notification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.ma.saga.Notification#getChainlinks <em>Chainlinks</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.Notification#getTopLevelImpact <em>Top Level Impact</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.ma.saga.SagaPackage#getNotification()
 * @model
 * @generated
 */
public interface Notification extends IdentifiableElement {
	/**
	 * Returns the value of the '<em><b>Chainlinks</b></em>' containment reference list.
	 * The list contents are of type {@link de.unistuttgart.ma.saga.ChainLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chainlinks</em>' containment reference list.
	 * @see de.unistuttgart.ma.saga.SagaPackage#getNotification_Chainlinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<ChainLink> getChainlinks();

	/**
	 * Returns the value of the '<em><b>Top Level Impact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Level Impact</em>' reference.
	 * @see #setTopLevelImpact(Impact)
	 * @see de.unistuttgart.ma.saga.SagaPackage#getNotification_TopLevelImpact()
	 * @model resolveProxies="false" required="true"
	 * @generated
	 */
	Impact getTopLevelImpact();

	/**
	 * Sets the value of the '{@link de.unistuttgart.ma.saga.Notification#getTopLevelImpact <em>Top Level Impact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Level Impact</em>' reference.
	 * @see #getTopLevelImpact()
	 * @generated
	 */
	void setTopLevelImpact(Impact value);

} // Notification
