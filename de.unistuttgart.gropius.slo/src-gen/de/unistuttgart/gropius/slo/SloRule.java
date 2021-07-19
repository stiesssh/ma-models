/**
 */
package de.unistuttgart.gropius.slo;

import de.unistuttgart.gropius.Component;
import de.unistuttgart.gropius.ComponentInterface;
import de.unistuttgart.gropius.Project;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.gropius.slo.SloRule#getName <em>Name</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.slo.SloRule#getPeriod <em>Period</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.slo.SloRule#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.slo.SloRule#getGropiusProject <em>Gropius Project</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.slo.SloRule#getGropiusComponent <em>Gropius Component</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.slo.SloRule#getGropiusComponentInterface <em>Gropius Component Interface</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.gropius.slo.SloPackage#getSloRule()
 * @model
 * @generated
 */
public interface SloRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.unistuttgart.gropius.slo.SloPackage#getSloRule_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.slo.SloRule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(double)
	 * @see de.unistuttgart.gropius.slo.SloPackage#getSloRule_Period()
	 * @model
	 * @generated
	 */
	double getPeriod();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.slo.SloRule#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(double value);

	/**
	 * Returns the value of the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threshold</em>' attribute.
	 * @see #setThreshold(double)
	 * @see de.unistuttgart.gropius.slo.SloPackage#getSloRule_Threshold()
	 * @model
	 * @generated
	 */
	double getThreshold();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.slo.SloRule#getThreshold <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold</em>' attribute.
	 * @see #getThreshold()
	 * @generated
	 */
	void setThreshold(double value);

	/**
	 * Returns the value of the '<em><b>Gropius Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gropius Project</em>' reference.
	 * @see #setGropiusProject(Project)
	 * @see de.unistuttgart.gropius.slo.SloPackage#getSloRule_GropiusProject()
	 * @model required="true"
	 * @generated
	 */
	Project getGropiusProject();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.slo.SloRule#getGropiusProject <em>Gropius Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gropius Project</em>' reference.
	 * @see #getGropiusProject()
	 * @generated
	 */
	void setGropiusProject(Project value);

	/**
	 * Returns the value of the '<em><b>Gropius Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gropius Component</em>' reference.
	 * @see #setGropiusComponent(Component)
	 * @see de.unistuttgart.gropius.slo.SloPackage#getSloRule_GropiusComponent()
	 * @model required="true"
	 * @generated
	 */
	Component getGropiusComponent();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.slo.SloRule#getGropiusComponent <em>Gropius Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gropius Component</em>' reference.
	 * @see #getGropiusComponent()
	 * @generated
	 */
	void setGropiusComponent(Component value);

	/**
	 * Returns the value of the '<em><b>Gropius Component Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gropius Component Interface</em>' reference.
	 * @see #setGropiusComponentInterface(ComponentInterface)
	 * @see de.unistuttgart.gropius.slo.SloPackage#getSloRule_GropiusComponentInterface()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ComponentInterface getGropiusComponentInterface();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.slo.SloRule#getGropiusComponentInterface <em>Gropius Component Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gropius Component Interface</em>' reference.
	 * @see #getGropiusComponentInterface()
	 * @generated
	 */
	void setGropiusComponentInterface(ComponentInterface value);

} // SloRule