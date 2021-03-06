/**
 */
package de.unistuttgart.gropius.impl;

import de.unistuttgart.gropius.GropiusPackage;
import de.unistuttgart.gropius.ReactionGroup;
import de.unistuttgart.gropius.User;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reaction Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.gropius.impl.ReactionGroupImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.ReactionGroupImpl#getReaction <em>Reaction</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.ReactionGroupImpl#getUsers <em>Users</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.ReactionGroupImpl#getTotalUserCount <em>Total User Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReactionGroupImpl extends MinimalEObjectImpl.Container implements ReactionGroup {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getReaction() <em>Reaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReaction()
	 * @generated
	 * @ordered
	 */
	protected static final String REACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReaction() <em>Reaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReaction()
	 * @generated
	 * @ordered
	 */
	protected String reaction = REACTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUsers() <em>Users</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsers()
	 * @generated
	 * @ordered
	 */
	protected EList<User> users;

	/**
	 * The default value of the '{@link #getTotalUserCount() <em>Total User Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalUserCount()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_USER_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotalUserCount() <em>Total User Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalUserCount()
	 * @generated
	 * @ordered
	 */
	protected int totalUserCount = TOTAL_USER_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReactionGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GropiusPackage.Literals.REACTION_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.REACTION_GROUP__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReaction() {
		return reaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReaction(String newReaction) {
		String oldReaction = reaction;
		reaction = newReaction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.REACTION_GROUP__REACTION, oldReaction,
					reaction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getUsers() {
		if (users == null) {
			users = new EObjectResolvingEList<User>(User.class, this, GropiusPackage.REACTION_GROUP__USERS);
		}
		return users;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotalUserCount() {
		return totalUserCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalUserCount(int newTotalUserCount) {
		int oldTotalUserCount = totalUserCount;
		totalUserCount = newTotalUserCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.REACTION_GROUP__TOTAL_USER_COUNT,
					oldTotalUserCount, totalUserCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GropiusPackage.REACTION_GROUP__ID:
			return getId();
		case GropiusPackage.REACTION_GROUP__REACTION:
			return getReaction();
		case GropiusPackage.REACTION_GROUP__USERS:
			return getUsers();
		case GropiusPackage.REACTION_GROUP__TOTAL_USER_COUNT:
			return getTotalUserCount();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GropiusPackage.REACTION_GROUP__ID:
			setId((String) newValue);
			return;
		case GropiusPackage.REACTION_GROUP__REACTION:
			setReaction((String) newValue);
			return;
		case GropiusPackage.REACTION_GROUP__USERS:
			getUsers().clear();
			getUsers().addAll((Collection<? extends User>) newValue);
			return;
		case GropiusPackage.REACTION_GROUP__TOTAL_USER_COUNT:
			setTotalUserCount((Integer) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case GropiusPackage.REACTION_GROUP__ID:
			setId(ID_EDEFAULT);
			return;
		case GropiusPackage.REACTION_GROUP__REACTION:
			setReaction(REACTION_EDEFAULT);
			return;
		case GropiusPackage.REACTION_GROUP__USERS:
			getUsers().clear();
			return;
		case GropiusPackage.REACTION_GROUP__TOTAL_USER_COUNT:
			setTotalUserCount(TOTAL_USER_COUNT_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case GropiusPackage.REACTION_GROUP__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case GropiusPackage.REACTION_GROUP__REACTION:
			return REACTION_EDEFAULT == null ? reaction != null : !REACTION_EDEFAULT.equals(reaction);
		case GropiusPackage.REACTION_GROUP__USERS:
			return users != null && !users.isEmpty();
		case GropiusPackage.REACTION_GROUP__TOTAL_USER_COUNT:
			return totalUserCount != TOTAL_USER_COUNT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", reaction: ");
		result.append(reaction);
		result.append(", totalUserCount: ");
		result.append(totalUserCount);
		result.append(')');
		return result.toString();
	}

} //ReactionGroupImpl
