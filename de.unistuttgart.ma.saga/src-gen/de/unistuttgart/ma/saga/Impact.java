/**
 */
package de.unistuttgart.ma.saga;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Impact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.ma.saga.Impact#getCausedBy <em>Caused By</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.ma.saga.SagaPackage#getImpact()
 * @model
 * @generated
 */
public interface Impact extends ChainLink {
	/**
	 * Returns the value of the '<em><b>Caused By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caused By</em>' reference.
	 * @see #setCausedBy(ChainLink)
	 * @see de.unistuttgart.ma.saga.SagaPackage#getImpact_CausedBy()
	 * @model resolveProxies="false" required="true"
	 * @generated
	 */
	ChainLink getCausedBy();

	/**
	 * Sets the value of the '{@link de.unistuttgart.ma.saga.Impact#getCausedBy <em>Caused By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caused By</em>' reference.
	 * @see #getCausedBy()
	 * @generated
	 */
	void setCausedBy(ChainLink value);

} // Impact
