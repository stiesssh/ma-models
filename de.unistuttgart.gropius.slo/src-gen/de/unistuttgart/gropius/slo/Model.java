/**
 */
package de.unistuttgart.gropius.slo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.gropius.slo.Model#getModelelement <em>Modelelement</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.gropius.slo.SloPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Modelelement</b></em>' containment reference list.
	 * The list contents are of type {@link de.unistuttgart.gropius.slo.ModelElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modelelement</em>' containment reference list.
	 * @see de.unistuttgart.gropius.slo.SloPackage#getModel_Modelelement()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModelElement> getModelelement();

} // Model
