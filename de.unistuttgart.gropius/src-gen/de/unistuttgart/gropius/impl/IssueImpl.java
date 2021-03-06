/**
 */
package de.unistuttgart.gropius.impl;

import de.unistuttgart.gropius.Comment;
import de.unistuttgart.gropius.Component;
import de.unistuttgart.gropius.GropiusPackage;
import de.unistuttgart.gropius.Issue;
import de.unistuttgart.gropius.IssueCategory;
import de.unistuttgart.gropius.IssueLocation;
import de.unistuttgart.gropius.IssueTimelineItem;
import de.unistuttgart.gropius.Label;
import de.unistuttgart.gropius.ReactionGroup;
import de.unistuttgart.gropius.User;

import java.util.Collection;
import java.util.Date;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Issue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueImpl#getBody <em>Body</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueImpl#getBodyRendered <em>Body Rendered</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueImpl#getCommentCreatedBy <em>Comment Created By</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueImpl#getEditedBy <em>Edited By</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueImpl#getCommentCreatedAt <em>Comment Created At</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueImpl#getLastEditedAt <em>Last Edited At</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueImpl#isCurrentUserCanEdit <em>Current User Can Edit</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueImpl#getReactions <em>Reactions</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueImpl#getUpdatedAt <em>Updated At</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueImpl#isIsOpen <em>Is Open</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueImpl#isIsDuplicate <em>Is Duplicate</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueImpl#isCurrentUserCanComment <em>Current User Can Comment</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueImpl#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueImpl#getEstimatedTime <em>Estimated Time</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueImpl#getSpentTime <em>Spent Time</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueImpl#getIssueComments <em>Issue Comments</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueImpl#getLinksToIssues <em>Links To Issues</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueImpl#getLinkedByIssues <em>Linked By Issues</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueImpl#getAssignees <em>Assignees</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueImpl#getParticipants <em>Participants</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueImpl#getPinnedOn <em>Pinned On</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueImpl#getTimeline <em>Timeline</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueImpl#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IssueImpl extends MinimalEObjectImpl.Container implements Issue {
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
	 * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected String body = BODY_EDEFAULT;

	/**
	 * The default value of the '{@link #getBodyRendered() <em>Body Rendered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyRendered()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_RENDERED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBodyRendered() <em>Body Rendered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyRendered()
	 * @generated
	 * @ordered
	 */
	protected String bodyRendered = BODY_RENDERED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCommentCreatedBy() <em>Comment Created By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentCreatedBy()
	 * @generated
	 * @ordered
	 */
	protected User commentCreatedBy;

	/**
	 * The cached value of the '{@link #getEditedBy() <em>Edited By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<User> editedBy;

	/**
	 * The default value of the '{@link #getCommentCreatedAt() <em>Comment Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentCreatedAt()
	 * @generated
	 * @ordered
	 */
	protected static final Date COMMENT_CREATED_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommentCreatedAt() <em>Comment Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentCreatedAt()
	 * @generated
	 * @ordered
	 */
	protected Date commentCreatedAt = COMMENT_CREATED_AT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastEditedAt() <em>Last Edited At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastEditedAt()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_EDITED_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastEditedAt() <em>Last Edited At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastEditedAt()
	 * @generated
	 * @ordered
	 */
	protected Date lastEditedAt = LAST_EDITED_AT_EDEFAULT;

	/**
	 * The default value of the '{@link #isCurrentUserCanEdit() <em>Current User Can Edit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCurrentUserCanEdit()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CURRENT_USER_CAN_EDIT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCurrentUserCanEdit() <em>Current User Can Edit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCurrentUserCanEdit()
	 * @generated
	 * @ordered
	 */
	protected boolean currentUserCanEdit = CURRENT_USER_CAN_EDIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReactions() <em>Reactions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactions()
	 * @generated
	 * @ordered
	 */
	protected EList<ReactionGroup> reactions;

	/**
	 * The default value of the '{@link #getUpdatedAt() <em>Updated At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdatedAt()
	 * @generated
	 * @ordered
	 */
	protected static final Date UPDATED_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpdatedAt() <em>Updated At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdatedAt()
	 * @generated
	 * @ordered
	 */
	protected Date updatedAt = UPDATED_AT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsOpen() <em>Is Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOpen()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_OPEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOpen() <em>Is Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOpen()
	 * @generated
	 * @ordered
	 */
	protected boolean isOpen = IS_OPEN_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsDuplicate() <em>Is Duplicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDuplicate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DUPLICATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDuplicate() <em>Is Duplicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDuplicate()
	 * @generated
	 * @ordered
	 */
	protected boolean isDuplicate = IS_DUPLICATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final IssueCategory CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected IssueCategory category = CATEGORY_EDEFAULT;

	/**
	 * The default value of the '{@link #isCurrentUserCanComment() <em>Current User Can Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCurrentUserCanComment()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CURRENT_USER_CAN_COMMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCurrentUserCanComment() <em>Current User Can Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCurrentUserCanComment()
	 * @generated
	 * @ordered
	 */
	protected boolean currentUserCanComment = CURRENT_USER_CAN_COMMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDueDate() <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DUE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDueDate() <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDate()
	 * @generated
	 * @ordered
	 */
	protected Date dueDate = DUE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstimatedTime() <em>Estimated Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedTime()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ESTIMATED_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstimatedTime() <em>Estimated Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedTime()
	 * @generated
	 * @ordered
	 */
	protected Integer estimatedTime = ESTIMATED_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpentTime() <em>Spent Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpentTime()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SPENT_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpentTime() <em>Spent Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpentTime()
	 * @generated
	 * @ordered
	 */
	protected Integer spentTime = SPENT_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIssueComments() <em>Issue Comments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueComments()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> issueComments;

	/**
	 * The cached value of the '{@link #getLinksToIssues() <em>Links To Issues</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinksToIssues()
	 * @generated
	 * @ordered
	 */
	protected EList<Issue> linksToIssues;

	/**
	 * The cached value of the '{@link #getLinkedByIssues() <em>Linked By Issues</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkedByIssues()
	 * @generated
	 * @ordered
	 */
	protected EList<Issue> linkedByIssues;

	/**
	 * The cached value of the '{@link #getAssignees() <em>Assignees</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignees()
	 * @generated
	 * @ordered
	 */
	protected EList<User> assignees;

	/**
	 * The cached value of the '{@link #getLabels() <em>Labels</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabels()
	 * @generated
	 * @ordered
	 */
	protected EList<Label> labels;

	/**
	 * The cached value of the '{@link #getParticipants() <em>Participants</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipants()
	 * @generated
	 * @ordered
	 */
	protected EList<User> participants;

	/**
	 * The cached value of the '{@link #getPinnedOn() <em>Pinned On</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinnedOn()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> pinnedOn;

	/**
	 * The cached value of the '{@link #getTimeline() <em>Timeline</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeline()
	 * @generated
	 * @ordered
	 */
	protected EList<IssueTimelineItem> timeline;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<IssueLocation> location;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IssueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GropiusPackage.Literals.ISSUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(String newBody) {
		String oldBody = body;
		body = newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.ISSUE__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBodyRendered() {
		return bodyRendered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBodyRendered(String newBodyRendered) {
		String oldBodyRendered = bodyRendered;
		bodyRendered = newBodyRendered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.ISSUE__BODY_RENDERED, oldBodyRendered,
					bodyRendered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getCommentCreatedBy() {
		if (commentCreatedBy != null && commentCreatedBy.eIsProxy()) {
			InternalEObject oldCommentCreatedBy = (InternalEObject) commentCreatedBy;
			commentCreatedBy = (User) eResolveProxy(oldCommentCreatedBy);
			if (commentCreatedBy != oldCommentCreatedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GropiusPackage.ISSUE__COMMENT_CREATED_BY,
							oldCommentCreatedBy, commentCreatedBy));
			}
		}
		return commentCreatedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetCommentCreatedBy() {
		return commentCreatedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommentCreatedBy(User newCommentCreatedBy) {
		User oldCommentCreatedBy = commentCreatedBy;
		commentCreatedBy = newCommentCreatedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.ISSUE__COMMENT_CREATED_BY,
					oldCommentCreatedBy, commentCreatedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getEditedBy() {
		if (editedBy == null) {
			editedBy = new EObjectResolvingEList<User>(User.class, this, GropiusPackage.ISSUE__EDITED_BY);
		}
		return editedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCommentCreatedAt() {
		return commentCreatedAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommentCreatedAt(Date newCommentCreatedAt) {
		Date oldCommentCreatedAt = commentCreatedAt;
		commentCreatedAt = newCommentCreatedAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.ISSUE__COMMENT_CREATED_AT,
					oldCommentCreatedAt, commentCreatedAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastEditedAt() {
		return lastEditedAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastEditedAt(Date newLastEditedAt) {
		Date oldLastEditedAt = lastEditedAt;
		lastEditedAt = newLastEditedAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.ISSUE__LAST_EDITED_AT, oldLastEditedAt,
					lastEditedAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCurrentUserCanEdit() {
		return currentUserCanEdit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentUserCanEdit(boolean newCurrentUserCanEdit) {
		boolean oldCurrentUserCanEdit = currentUserCanEdit;
		currentUserCanEdit = newCurrentUserCanEdit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.ISSUE__CURRENT_USER_CAN_EDIT,
					oldCurrentUserCanEdit, currentUserCanEdit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReactionGroup> getReactions() {
		if (reactions == null) {
			reactions = new EObjectResolvingEList<ReactionGroup>(ReactionGroup.class, this,
					GropiusPackage.ISSUE__REACTIONS);
		}
		return reactions;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.ISSUE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdatedAt(Date newUpdatedAt) {
		Date oldUpdatedAt = updatedAt;
		updatedAt = newUpdatedAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.ISSUE__UPDATED_AT, oldUpdatedAt,
					updatedAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOpen() {
		return isOpen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOpen(boolean newIsOpen) {
		boolean oldIsOpen = isOpen;
		isOpen = newIsOpen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.ISSUE__IS_OPEN, oldIsOpen, isOpen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDuplicate() {
		return isDuplicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDuplicate(boolean newIsDuplicate) {
		boolean oldIsDuplicate = isDuplicate;
		isDuplicate = newIsDuplicate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.ISSUE__IS_DUPLICATE, oldIsDuplicate,
					isDuplicate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueCategory getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(IssueCategory newCategory) {
		IssueCategory oldCategory = category;
		category = newCategory == null ? CATEGORY_EDEFAULT : newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.ISSUE__CATEGORY, oldCategory,
					category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCurrentUserCanComment() {
		return currentUserCanComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentUserCanComment(boolean newCurrentUserCanComment) {
		boolean oldCurrentUserCanComment = currentUserCanComment;
		currentUserCanComment = newCurrentUserCanComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.ISSUE__CURRENT_USER_CAN_COMMENT,
					oldCurrentUserCanComment, currentUserCanComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(Date newStartDate) {
		Date oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.ISSUE__START_DATE, oldStartDate,
					startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDueDate() {
		return dueDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDueDate(Date newDueDate) {
		Date oldDueDate = dueDate;
		dueDate = newDueDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.ISSUE__DUE_DATE, oldDueDate, dueDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getEstimatedTime() {
		return estimatedTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstimatedTime(Integer newEstimatedTime) {
		Integer oldEstimatedTime = estimatedTime;
		estimatedTime = newEstimatedTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.ISSUE__ESTIMATED_TIME,
					oldEstimatedTime, estimatedTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getSpentTime() {
		return spentTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpentTime(Integer newSpentTime) {
		Integer oldSpentTime = spentTime;
		spentTime = newSpentTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.ISSUE__SPENT_TIME, oldSpentTime,
					spentTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comment> getIssueComments() {
		if (issueComments == null) {
			issueComments = new EObjectResolvingEList<Comment>(Comment.class, this,
					GropiusPackage.ISSUE__ISSUE_COMMENTS);
		}
		return issueComments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Issue> getLinksToIssues() {
		if (linksToIssues == null) {
			linksToIssues = new EObjectResolvingEList<Issue>(Issue.class, this, GropiusPackage.ISSUE__LINKS_TO_ISSUES);
		}
		return linksToIssues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Issue> getLinkedByIssues() {
		if (linkedByIssues == null) {
			linkedByIssues = new EObjectResolvingEList<Issue>(Issue.class, this,
					GropiusPackage.ISSUE__LINKED_BY_ISSUES);
		}
		return linkedByIssues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getAssignees() {
		if (assignees == null) {
			assignees = new EObjectWithInverseResolvingEList.ManyInverse<User>(User.class, this,
					GropiusPackage.ISSUE__ASSIGNEES, GropiusPackage.USER__ASSIGNED_TO_ISSUES);
		}
		return assignees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Label> getLabels() {
		if (labels == null) {
			labels = new EObjectResolvingEList<Label>(Label.class, this, GropiusPackage.ISSUE__LABELS);
		}
		return labels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getParticipants() {
		if (participants == null) {
			participants = new EObjectWithInverseResolvingEList.ManyInverse<User>(User.class, this,
					GropiusPackage.ISSUE__PARTICIPANTS, GropiusPackage.USER__PARTICIPANT_OF_ISSUE);
		}
		return participants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getPinnedOn() {
		if (pinnedOn == null) {
			pinnedOn = new EObjectResolvingEList<Component>(Component.class, this, GropiusPackage.ISSUE__PINNED_ON);
		}
		return pinnedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IssueTimelineItem> getTimeline() {
		if (timeline == null) {
			timeline = new EObjectResolvingEList<IssueTimelineItem>(IssueTimelineItem.class, this,
					GropiusPackage.ISSUE__TIMELINE);
		}
		return timeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IssueLocation> getLocation() {
		if (location == null) {
			location = new EObjectResolvingEList<IssueLocation>(IssueLocation.class, this,
					GropiusPackage.ISSUE__LOCATION);
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GropiusPackage.ISSUE__ASSIGNEES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAssignees()).basicAdd(otherEnd, msgs);
		case GropiusPackage.ISSUE__PARTICIPANTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getParticipants()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GropiusPackage.ISSUE__ASSIGNEES:
			return ((InternalEList<?>) getAssignees()).basicRemove(otherEnd, msgs);
		case GropiusPackage.ISSUE__PARTICIPANTS:
			return ((InternalEList<?>) getParticipants()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GropiusPackage.ISSUE__ID:
			return getId();
		case GropiusPackage.ISSUE__BODY:
			return getBody();
		case GropiusPackage.ISSUE__BODY_RENDERED:
			return getBodyRendered();
		case GropiusPackage.ISSUE__COMMENT_CREATED_BY:
			if (resolve)
				return getCommentCreatedBy();
			return basicGetCommentCreatedBy();
		case GropiusPackage.ISSUE__EDITED_BY:
			return getEditedBy();
		case GropiusPackage.ISSUE__COMMENT_CREATED_AT:
			return getCommentCreatedAt();
		case GropiusPackage.ISSUE__LAST_EDITED_AT:
			return getLastEditedAt();
		case GropiusPackage.ISSUE__CURRENT_USER_CAN_EDIT:
			return isCurrentUserCanEdit();
		case GropiusPackage.ISSUE__REACTIONS:
			return getReactions();
		case GropiusPackage.ISSUE__UPDATED_AT:
			return getUpdatedAt();
		case GropiusPackage.ISSUE__IS_OPEN:
			return isIsOpen();
		case GropiusPackage.ISSUE__IS_DUPLICATE:
			return isIsDuplicate();
		case GropiusPackage.ISSUE__CATEGORY:
			return getCategory();
		case GropiusPackage.ISSUE__CURRENT_USER_CAN_COMMENT:
			return isCurrentUserCanComment();
		case GropiusPackage.ISSUE__START_DATE:
			return getStartDate();
		case GropiusPackage.ISSUE__DUE_DATE:
			return getDueDate();
		case GropiusPackage.ISSUE__ESTIMATED_TIME:
			return getEstimatedTime();
		case GropiusPackage.ISSUE__SPENT_TIME:
			return getSpentTime();
		case GropiusPackage.ISSUE__ISSUE_COMMENTS:
			return getIssueComments();
		case GropiusPackage.ISSUE__LINKS_TO_ISSUES:
			return getLinksToIssues();
		case GropiusPackage.ISSUE__LINKED_BY_ISSUES:
			return getLinkedByIssues();
		case GropiusPackage.ISSUE__ASSIGNEES:
			return getAssignees();
		case GropiusPackage.ISSUE__LABELS:
			return getLabels();
		case GropiusPackage.ISSUE__PARTICIPANTS:
			return getParticipants();
		case GropiusPackage.ISSUE__PINNED_ON:
			return getPinnedOn();
		case GropiusPackage.ISSUE__TIMELINE:
			return getTimeline();
		case GropiusPackage.ISSUE__LOCATION:
			return getLocation();
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
		case GropiusPackage.ISSUE__ID:
			setId((String) newValue);
			return;
		case GropiusPackage.ISSUE__BODY:
			setBody((String) newValue);
			return;
		case GropiusPackage.ISSUE__BODY_RENDERED:
			setBodyRendered((String) newValue);
			return;
		case GropiusPackage.ISSUE__COMMENT_CREATED_BY:
			setCommentCreatedBy((User) newValue);
			return;
		case GropiusPackage.ISSUE__EDITED_BY:
			getEditedBy().clear();
			getEditedBy().addAll((Collection<? extends User>) newValue);
			return;
		case GropiusPackage.ISSUE__COMMENT_CREATED_AT:
			setCommentCreatedAt((Date) newValue);
			return;
		case GropiusPackage.ISSUE__LAST_EDITED_AT:
			setLastEditedAt((Date) newValue);
			return;
		case GropiusPackage.ISSUE__CURRENT_USER_CAN_EDIT:
			setCurrentUserCanEdit((Boolean) newValue);
			return;
		case GropiusPackage.ISSUE__REACTIONS:
			getReactions().clear();
			getReactions().addAll((Collection<? extends ReactionGroup>) newValue);
			return;
		case GropiusPackage.ISSUE__UPDATED_AT:
			setUpdatedAt((Date) newValue);
			return;
		case GropiusPackage.ISSUE__IS_OPEN:
			setIsOpen((Boolean) newValue);
			return;
		case GropiusPackage.ISSUE__IS_DUPLICATE:
			setIsDuplicate((Boolean) newValue);
			return;
		case GropiusPackage.ISSUE__CATEGORY:
			setCategory((IssueCategory) newValue);
			return;
		case GropiusPackage.ISSUE__CURRENT_USER_CAN_COMMENT:
			setCurrentUserCanComment((Boolean) newValue);
			return;
		case GropiusPackage.ISSUE__START_DATE:
			setStartDate((Date) newValue);
			return;
		case GropiusPackage.ISSUE__DUE_DATE:
			setDueDate((Date) newValue);
			return;
		case GropiusPackage.ISSUE__ESTIMATED_TIME:
			setEstimatedTime((Integer) newValue);
			return;
		case GropiusPackage.ISSUE__SPENT_TIME:
			setSpentTime((Integer) newValue);
			return;
		case GropiusPackage.ISSUE__ISSUE_COMMENTS:
			getIssueComments().clear();
			getIssueComments().addAll((Collection<? extends Comment>) newValue);
			return;
		case GropiusPackage.ISSUE__LINKS_TO_ISSUES:
			getLinksToIssues().clear();
			getLinksToIssues().addAll((Collection<? extends Issue>) newValue);
			return;
		case GropiusPackage.ISSUE__LINKED_BY_ISSUES:
			getLinkedByIssues().clear();
			getLinkedByIssues().addAll((Collection<? extends Issue>) newValue);
			return;
		case GropiusPackage.ISSUE__ASSIGNEES:
			getAssignees().clear();
			getAssignees().addAll((Collection<? extends User>) newValue);
			return;
		case GropiusPackage.ISSUE__LABELS:
			getLabels().clear();
			getLabels().addAll((Collection<? extends Label>) newValue);
			return;
		case GropiusPackage.ISSUE__PARTICIPANTS:
			getParticipants().clear();
			getParticipants().addAll((Collection<? extends User>) newValue);
			return;
		case GropiusPackage.ISSUE__PINNED_ON:
			getPinnedOn().clear();
			getPinnedOn().addAll((Collection<? extends Component>) newValue);
			return;
		case GropiusPackage.ISSUE__TIMELINE:
			getTimeline().clear();
			getTimeline().addAll((Collection<? extends IssueTimelineItem>) newValue);
			return;
		case GropiusPackage.ISSUE__LOCATION:
			getLocation().clear();
			getLocation().addAll((Collection<? extends IssueLocation>) newValue);
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
		case GropiusPackage.ISSUE__ID:
			setId(ID_EDEFAULT);
			return;
		case GropiusPackage.ISSUE__BODY:
			setBody(BODY_EDEFAULT);
			return;
		case GropiusPackage.ISSUE__BODY_RENDERED:
			setBodyRendered(BODY_RENDERED_EDEFAULT);
			return;
		case GropiusPackage.ISSUE__COMMENT_CREATED_BY:
			setCommentCreatedBy((User) null);
			return;
		case GropiusPackage.ISSUE__EDITED_BY:
			getEditedBy().clear();
			return;
		case GropiusPackage.ISSUE__COMMENT_CREATED_AT:
			setCommentCreatedAt(COMMENT_CREATED_AT_EDEFAULT);
			return;
		case GropiusPackage.ISSUE__LAST_EDITED_AT:
			setLastEditedAt(LAST_EDITED_AT_EDEFAULT);
			return;
		case GropiusPackage.ISSUE__CURRENT_USER_CAN_EDIT:
			setCurrentUserCanEdit(CURRENT_USER_CAN_EDIT_EDEFAULT);
			return;
		case GropiusPackage.ISSUE__REACTIONS:
			getReactions().clear();
			return;
		case GropiusPackage.ISSUE__UPDATED_AT:
			setUpdatedAt(UPDATED_AT_EDEFAULT);
			return;
		case GropiusPackage.ISSUE__IS_OPEN:
			setIsOpen(IS_OPEN_EDEFAULT);
			return;
		case GropiusPackage.ISSUE__IS_DUPLICATE:
			setIsDuplicate(IS_DUPLICATE_EDEFAULT);
			return;
		case GropiusPackage.ISSUE__CATEGORY:
			setCategory(CATEGORY_EDEFAULT);
			return;
		case GropiusPackage.ISSUE__CURRENT_USER_CAN_COMMENT:
			setCurrentUserCanComment(CURRENT_USER_CAN_COMMENT_EDEFAULT);
			return;
		case GropiusPackage.ISSUE__START_DATE:
			setStartDate(START_DATE_EDEFAULT);
			return;
		case GropiusPackage.ISSUE__DUE_DATE:
			setDueDate(DUE_DATE_EDEFAULT);
			return;
		case GropiusPackage.ISSUE__ESTIMATED_TIME:
			setEstimatedTime(ESTIMATED_TIME_EDEFAULT);
			return;
		case GropiusPackage.ISSUE__SPENT_TIME:
			setSpentTime(SPENT_TIME_EDEFAULT);
			return;
		case GropiusPackage.ISSUE__ISSUE_COMMENTS:
			getIssueComments().clear();
			return;
		case GropiusPackage.ISSUE__LINKS_TO_ISSUES:
			getLinksToIssues().clear();
			return;
		case GropiusPackage.ISSUE__LINKED_BY_ISSUES:
			getLinkedByIssues().clear();
			return;
		case GropiusPackage.ISSUE__ASSIGNEES:
			getAssignees().clear();
			return;
		case GropiusPackage.ISSUE__LABELS:
			getLabels().clear();
			return;
		case GropiusPackage.ISSUE__PARTICIPANTS:
			getParticipants().clear();
			return;
		case GropiusPackage.ISSUE__PINNED_ON:
			getPinnedOn().clear();
			return;
		case GropiusPackage.ISSUE__TIMELINE:
			getTimeline().clear();
			return;
		case GropiusPackage.ISSUE__LOCATION:
			getLocation().clear();
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
		case GropiusPackage.ISSUE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case GropiusPackage.ISSUE__BODY:
			return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
		case GropiusPackage.ISSUE__BODY_RENDERED:
			return BODY_RENDERED_EDEFAULT == null ? bodyRendered != null : !BODY_RENDERED_EDEFAULT.equals(bodyRendered);
		case GropiusPackage.ISSUE__COMMENT_CREATED_BY:
			return commentCreatedBy != null;
		case GropiusPackage.ISSUE__EDITED_BY:
			return editedBy != null && !editedBy.isEmpty();
		case GropiusPackage.ISSUE__COMMENT_CREATED_AT:
			return COMMENT_CREATED_AT_EDEFAULT == null ? commentCreatedAt != null
					: !COMMENT_CREATED_AT_EDEFAULT.equals(commentCreatedAt);
		case GropiusPackage.ISSUE__LAST_EDITED_AT:
			return LAST_EDITED_AT_EDEFAULT == null ? lastEditedAt != null
					: !LAST_EDITED_AT_EDEFAULT.equals(lastEditedAt);
		case GropiusPackage.ISSUE__CURRENT_USER_CAN_EDIT:
			return currentUserCanEdit != CURRENT_USER_CAN_EDIT_EDEFAULT;
		case GropiusPackage.ISSUE__REACTIONS:
			return reactions != null && !reactions.isEmpty();
		case GropiusPackage.ISSUE__UPDATED_AT:
			return UPDATED_AT_EDEFAULT == null ? updatedAt != null : !UPDATED_AT_EDEFAULT.equals(updatedAt);
		case GropiusPackage.ISSUE__IS_OPEN:
			return isOpen != IS_OPEN_EDEFAULT;
		case GropiusPackage.ISSUE__IS_DUPLICATE:
			return isDuplicate != IS_DUPLICATE_EDEFAULT;
		case GropiusPackage.ISSUE__CATEGORY:
			return category != CATEGORY_EDEFAULT;
		case GropiusPackage.ISSUE__CURRENT_USER_CAN_COMMENT:
			return currentUserCanComment != CURRENT_USER_CAN_COMMENT_EDEFAULT;
		case GropiusPackage.ISSUE__START_DATE:
			return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
		case GropiusPackage.ISSUE__DUE_DATE:
			return DUE_DATE_EDEFAULT == null ? dueDate != null : !DUE_DATE_EDEFAULT.equals(dueDate);
		case GropiusPackage.ISSUE__ESTIMATED_TIME:
			return ESTIMATED_TIME_EDEFAULT == null ? estimatedTime != null
					: !ESTIMATED_TIME_EDEFAULT.equals(estimatedTime);
		case GropiusPackage.ISSUE__SPENT_TIME:
			return SPENT_TIME_EDEFAULT == null ? spentTime != null : !SPENT_TIME_EDEFAULT.equals(spentTime);
		case GropiusPackage.ISSUE__ISSUE_COMMENTS:
			return issueComments != null && !issueComments.isEmpty();
		case GropiusPackage.ISSUE__LINKS_TO_ISSUES:
			return linksToIssues != null && !linksToIssues.isEmpty();
		case GropiusPackage.ISSUE__LINKED_BY_ISSUES:
			return linkedByIssues != null && !linkedByIssues.isEmpty();
		case GropiusPackage.ISSUE__ASSIGNEES:
			return assignees != null && !assignees.isEmpty();
		case GropiusPackage.ISSUE__LABELS:
			return labels != null && !labels.isEmpty();
		case GropiusPackage.ISSUE__PARTICIPANTS:
			return participants != null && !participants.isEmpty();
		case GropiusPackage.ISSUE__PINNED_ON:
			return pinnedOn != null && !pinnedOn.isEmpty();
		case GropiusPackage.ISSUE__TIMELINE:
			return timeline != null && !timeline.isEmpty();
		case GropiusPackage.ISSUE__LOCATION:
			return location != null && !location.isEmpty();
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
		result.append(", body: ");
		result.append(body);
		result.append(", bodyRendered: ");
		result.append(bodyRendered);
		result.append(", commentCreatedAt: ");
		result.append(commentCreatedAt);
		result.append(", lastEditedAt: ");
		result.append(lastEditedAt);
		result.append(", currentUserCanEdit: ");
		result.append(currentUserCanEdit);
		result.append(", updatedAt: ");
		result.append(updatedAt);
		result.append(", isOpen: ");
		result.append(isOpen);
		result.append(", isDuplicate: ");
		result.append(isDuplicate);
		result.append(", category: ");
		result.append(category);
		result.append(", currentUserCanComment: ");
		result.append(currentUserCanComment);
		result.append(", startDate: ");
		result.append(startDate);
		result.append(", dueDate: ");
		result.append(dueDate);
		result.append(", estimatedTime: ");
		result.append(estimatedTime);
		result.append(", spentTime: ");
		result.append(spentTime);
		result.append(')');
		return result.toString();
	}

} //IssueImpl
