/**
 */
package org.eclipse.dd.di;

import org.eclipse.bpmn2.di.Label;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BPMN Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.dd.di.BPMNLabel#getLabelStyle <em>Label Style</em>}</li>
 * </ul>
 *
 * @see org.eclipse.dd.di.DiPackage#getBPMNLabel()
 * @model extendedMetaData="name='BPMNLabel' kind='elementOnly'"
 * @generated
 */
public interface BPMNLabel extends Label {
	/**
	 * Returns the value of the '<em><b>Label Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Style</em>' reference.
	 * @see #setLabelStyle(BPMNLabelStyle)
	 * @see org.eclipse.dd.di.DiPackage#getBPMNLabel_LabelStyle()
	 * @model ordered="false"
	 *        extendedMetaData="kind='attribute' name='labelStyle'"
	 * @generated
	 */
	BPMNLabelStyle getLabelStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.dd.di.BPMNLabel#getLabelStyle <em>Label Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Style</em>' reference.
	 * @see #getLabelStyle()
	 * @generated
	 */
	void setLabelStyle(BPMNLabelStyle value);

} // BPMNLabel
