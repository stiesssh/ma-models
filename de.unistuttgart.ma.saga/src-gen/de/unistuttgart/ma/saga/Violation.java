/**
 */
package de.unistuttgart.ma.saga;

import gropius.slo.SloRule;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Violation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.ma.saga.Violation#getPassingImpacts <em>Passing Impacts</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.Violation#getViolatedRule <em>Violated Rule</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.ma.saga.SagaPackage#getViolation()
 * @model
 * @generated
 */
public interface Violation extends ChainLink {
	/**
	 * Returns the value of the '<em><b>Passing Impacts</b></em>' reference list.
	 * The list contents are of type {@link de.unistuttgart.ma.saga.ChainLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passing Impacts</em>' reference list.
	 * @see de.unistuttgart.ma.saga.SagaPackage#getViolation_PassingImpacts()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ChainLink> getPassingImpacts();

	/**
	 * Returns the value of the '<em><b>Violated Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Violated Rule</em>' reference.
	 * @see #setViolatedRule(SloRule)
	 * @see de.unistuttgart.ma.saga.SagaPackage#getViolation_ViolatedRule()
	 * @model required="true"
	 * @generated
	 */
	SloRule getViolatedRule();

	/**
	 * Sets the value of the '{@link de.unistuttgart.ma.saga.Violation#getViolatedRule <em>Violated Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Violated Rule</em>' reference.
	 * @see #getViolatedRule()
	 * @generated
	 */
	void setViolatedRule(SloRule value);

} // Violation
