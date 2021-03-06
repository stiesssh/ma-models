/**
 */
package de.unistuttgart.ma.impact;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Impact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.ma.impact.Impact#getLocation <em>Location</em>}</li>
 *   <li>{@link de.unistuttgart.ma.impact.Impact#getCause <em>Cause</em>}</li>
 *   <li>{@link de.unistuttgart.ma.impact.Impact#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.ma.impact.ImpactPackage#getImpact()
 * @model
 * @generated
 */
public interface Impact extends EObject {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(EObject)
	 * @see de.unistuttgart.ma.impact.ImpactPackage#getImpact_Location()
	 * @model required="true"
	 * @generated
	 */
	EObject getLocation();

	/**
	 * Sets the value of the '{@link de.unistuttgart.ma.impact.Impact#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(EObject value);

	/**
	 * Returns the value of the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cause</em>' reference.
	 * @see #setCause(Impact)
	 * @see de.unistuttgart.ma.impact.ImpactPackage#getImpact_Cause()
	 * @model
	 * @generated
	 */
	Impact getCause();

	/**
	 * Sets the value of the '{@link de.unistuttgart.ma.impact.Impact#getCause <em>Cause</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cause</em>' reference.
	 * @see #getCause()
	 * @generated
	 */
	void setCause(Impact value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.unistuttgart.ma.impact.ImpactPackage#getImpact_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.unistuttgart.ma.impact.Impact#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);
	
	/**
	 * @generated NOT
	 */
	public String getLocationId();
	
	/**
	 * @generated NOT
	 */
	public String getLocationName();
	
	/**
	 * @generated NOT
	 */
	public String getLocationType();
	
	/**
	 * @generated NOT
	 */
	public String getLocationContainerId();
	
	/**
	 * @generated NOT
	 */
	public String getLocationContainerName();
	
	/**
	 * @generated NOT
	 */
	public String getLocationContainerType();

} // Impact
