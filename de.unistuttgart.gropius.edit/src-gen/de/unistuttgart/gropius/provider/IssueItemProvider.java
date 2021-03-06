/**
 */
package de.unistuttgart.gropius.provider;

import de.unistuttgart.gropius.GropiusPackage;
import de.unistuttgart.gropius.Issue;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.unistuttgart.gropius.Issue} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IssueItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIdPropertyDescriptor(object);
			addBodyPropertyDescriptor(object);
			addBodyRenderedPropertyDescriptor(object);
			addCommentCreatedByPropertyDescriptor(object);
			addEditedByPropertyDescriptor(object);
			addCommentCreatedAtPropertyDescriptor(object);
			addLastEditedAtPropertyDescriptor(object);
			addCurrentUserCanEditPropertyDescriptor(object);
			addReactionsPropertyDescriptor(object);
			addUpdatedAtPropertyDescriptor(object);
			addIsOpenPropertyDescriptor(object);
			addIsDuplicatePropertyDescriptor(object);
			addCategoryPropertyDescriptor(object);
			addCurrentUserCanCommentPropertyDescriptor(object);
			addStartDatePropertyDescriptor(object);
			addDueDatePropertyDescriptor(object);
			addEstimatedTimePropertyDescriptor(object);
			addSpentTimePropertyDescriptor(object);
			addIssueCommentsPropertyDescriptor(object);
			addLinksToIssuesPropertyDescriptor(object);
			addLinkedByIssuesPropertyDescriptor(object);
			addAssigneesPropertyDescriptor(object);
			addLabelsPropertyDescriptor(object);
			addParticipantsPropertyDescriptor(object);
			addPinnedOnPropertyDescriptor(object);
			addTimelinePropertyDescriptor(object);
			addLocationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Node_id_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Node_id_feature", "_UI_Node_type"),
						GropiusPackage.Literals.NODE__ID, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Body feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBodyPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Comment_body_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Comment_body_feature", "_UI_Comment_type"),
						GropiusPackage.Literals.COMMENT__BODY, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Body Rendered feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBodyRenderedPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Comment_bodyRendered_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Comment_bodyRendered_feature",
								"_UI_Comment_type"),
						GropiusPackage.Literals.COMMENT__BODY_RENDERED, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Comment Created By feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommentCreatedByPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Comment_commentCreatedBy_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Comment_commentCreatedBy_feature",
								"_UI_Comment_type"),
						GropiusPackage.Literals.COMMENT__COMMENT_CREATED_BY, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Edited By feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEditedByPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Comment_editedBy_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Comment_editedBy_feature",
								"_UI_Comment_type"),
						GropiusPackage.Literals.COMMENT__EDITED_BY, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Comment Created At feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommentCreatedAtPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Comment_commentCreatedAt_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Comment_commentCreatedAt_feature",
								"_UI_Comment_type"),
						GropiusPackage.Literals.COMMENT__COMMENT_CREATED_AT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Last Edited At feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLastEditedAtPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Comment_lastEditedAt_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Comment_lastEditedAt_feature",
								"_UI_Comment_type"),
						GropiusPackage.Literals.COMMENT__LAST_EDITED_AT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Current User Can Edit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrentUserCanEditPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Comment_currentUserCanEdit_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Comment_currentUserCanEdit_feature",
								"_UI_Comment_type"),
						GropiusPackage.Literals.COMMENT__CURRENT_USER_CAN_EDIT, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Reactions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReactionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Comment_reactions_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Comment_reactions_feature",
								"_UI_Comment_type"),
						GropiusPackage.Literals.COMMENT__REACTIONS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Updated At feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpdatedAtPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Issue_updatedAt_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Issue_updatedAt_feature",
								"_UI_Issue_type"),
						GropiusPackage.Literals.ISSUE__UPDATED_AT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Is Open feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsOpenPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Issue_isOpen_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Issue_isOpen_feature", "_UI_Issue_type"),
						GropiusPackage.Literals.ISSUE__IS_OPEN, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Is Duplicate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsDuplicatePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Issue_isDuplicate_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Issue_isDuplicate_feature",
								"_UI_Issue_type"),
						GropiusPackage.Literals.ISSUE__IS_DUPLICATE, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Category feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCategoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Issue_category_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Issue_category_feature", "_UI_Issue_type"),
						GropiusPackage.Literals.ISSUE__CATEGORY, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Current User Can Comment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrentUserCanCommentPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Issue_currentUserCanComment_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Issue_currentUserCanComment_feature",
								"_UI_Issue_type"),
						GropiusPackage.Literals.ISSUE__CURRENT_USER_CAN_COMMENT, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Start Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Issue_startDate_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Issue_startDate_feature",
								"_UI_Issue_type"),
						GropiusPackage.Literals.ISSUE__START_DATE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Due Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDueDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Issue_dueDate_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Issue_dueDate_feature", "_UI_Issue_type"),
						GropiusPackage.Literals.ISSUE__DUE_DATE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Estimated Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEstimatedTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Issue_estimatedTime_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Issue_estimatedTime_feature",
								"_UI_Issue_type"),
						GropiusPackage.Literals.ISSUE__ESTIMATED_TIME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Spent Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpentTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Issue_spentTime_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Issue_spentTime_feature",
								"_UI_Issue_type"),
						GropiusPackage.Literals.ISSUE__SPENT_TIME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Issue Comments feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIssueCommentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Issue_issueComments_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Issue_issueComments_feature",
								"_UI_Issue_type"),
						GropiusPackage.Literals.ISSUE__ISSUE_COMMENTS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Links To Issues feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinksToIssuesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Issue_linksToIssues_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Issue_linksToIssues_feature",
								"_UI_Issue_type"),
						GropiusPackage.Literals.ISSUE__LINKS_TO_ISSUES, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Linked By Issues feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinkedByIssuesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Issue_linkedByIssues_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Issue_linkedByIssues_feature",
								"_UI_Issue_type"),
						GropiusPackage.Literals.ISSUE__LINKED_BY_ISSUES, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Assignees feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssigneesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Issue_assignees_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Issue_assignees_feature",
								"_UI_Issue_type"),
						GropiusPackage.Literals.ISSUE__ASSIGNEES, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Labels feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLabelsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Issue_labels_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Issue_labels_feature", "_UI_Issue_type"),
						GropiusPackage.Literals.ISSUE__LABELS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Participants feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParticipantsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Issue_participants_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Issue_participants_feature",
								"_UI_Issue_type"),
						GropiusPackage.Literals.ISSUE__PARTICIPANTS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Pinned On feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPinnedOnPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Issue_pinnedOn_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Issue_pinnedOn_feature", "_UI_Issue_type"),
						GropiusPackage.Literals.ISSUE__PINNED_ON, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Timeline feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimelinePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Issue_timeline_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Issue_timeline_feature", "_UI_Issue_type"),
						GropiusPackage.Literals.ISSUE__TIMELINE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Location feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Issue_location_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Issue_location_feature", "_UI_Issue_type"),
						GropiusPackage.Literals.ISSUE__LOCATION, true, false, true, null, null, null));
	}

	/**
	 * This returns Issue.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Issue"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Issue) object).getId();
		return label == null || label.length() == 0 ? getString("_UI_Issue_type")
				: getString("_UI_Issue_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Issue.class)) {
		case GropiusPackage.ISSUE__ID:
		case GropiusPackage.ISSUE__BODY:
		case GropiusPackage.ISSUE__BODY_RENDERED:
		case GropiusPackage.ISSUE__COMMENT_CREATED_AT:
		case GropiusPackage.ISSUE__LAST_EDITED_AT:
		case GropiusPackage.ISSUE__CURRENT_USER_CAN_EDIT:
		case GropiusPackage.ISSUE__UPDATED_AT:
		case GropiusPackage.ISSUE__IS_OPEN:
		case GropiusPackage.ISSUE__IS_DUPLICATE:
		case GropiusPackage.ISSUE__CATEGORY:
		case GropiusPackage.ISSUE__CURRENT_USER_CAN_COMMENT:
		case GropiusPackage.ISSUE__START_DATE:
		case GropiusPackage.ISSUE__DUE_DATE:
		case GropiusPackage.ISSUE__ESTIMATED_TIME:
		case GropiusPackage.ISSUE__SPENT_TIME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return GropiusEditPlugin.INSTANCE;
	}

}
