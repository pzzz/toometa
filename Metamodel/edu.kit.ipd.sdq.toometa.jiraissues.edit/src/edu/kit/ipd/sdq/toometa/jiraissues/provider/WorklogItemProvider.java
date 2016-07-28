/**
 */
package edu.kit.ipd.sdq.toometa.jiraissues.provider;


import edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage;
import edu.kit.ipd.sdq.toometa.jiraissues.Worklog;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.toometa.jiraissues.Worklog} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WorklogItemProvider extends AddressableElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorklogItemProvider(AdapterFactory adapterFactory) {
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

			addCreationDatePropertyDescriptor(object);
			addUpdateDatePropertyDescriptor(object);
			addAuthorPropertyDescriptor(object);
			addUpdateAuthorPropertyDescriptor(object);
			addIssueUriPropertyDescriptor(object);
			addCommentPropertyDescriptor(object);
			addMinutesSpentPropertyDescriptor(object);
			addStartDatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Creation Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreationDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UpdatableElement_creationDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UpdatableElement_creationDate_feature", "_UI_UpdatableElement_type"),
				 JiraissuesPackage.Literals.UPDATABLE_ELEMENT__CREATION_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Update Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpdateDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UpdatableElement_updateDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UpdatableElement_updateDate_feature", "_UI_UpdatableElement_type"),
				 JiraissuesPackage.Literals.UPDATABLE_ELEMENT__UPDATE_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Author feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuthorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AuthorUpdatableElement_author_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AuthorUpdatableElement_author_feature", "_UI_AuthorUpdatableElement_type"),
				 JiraissuesPackage.Literals.AUTHOR_UPDATABLE_ELEMENT__AUTHOR,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Update Author feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpdateAuthorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AuthorUpdatableElement_updateAuthor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AuthorUpdatableElement_updateAuthor_feature", "_UI_AuthorUpdatableElement_type"),
				 JiraissuesPackage.Literals.AUTHOR_UPDATABLE_ELEMENT__UPDATE_AUTHOR,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Issue Uri feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIssueUriPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Worklog_issueUri_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Worklog_issueUri_feature", "_UI_Worklog_type"),
				 JiraissuesPackage.Literals.WORKLOG__ISSUE_URI,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Comment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Worklog_comment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Worklog_comment_feature", "_UI_Worklog_type"),
				 JiraissuesPackage.Literals.WORKLOG__COMMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Minutes Spent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinutesSpentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Worklog_minutesSpent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Worklog_minutesSpent_feature", "_UI_Worklog_type"),
				 JiraissuesPackage.Literals.WORKLOG__MINUTES_SPENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Start Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Worklog_startDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Worklog_startDate_feature", "_UI_Worklog_type"),
				 JiraissuesPackage.Literals.WORKLOG__START_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Worklog.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Worklog"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Worklog)object).getComment();
		return label == null || label.length() == 0 ?
			getString("_UI_Worklog_type") :
			getString("_UI_Worklog_type") + " " + label;
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

		switch (notification.getFeatureID(Worklog.class)) {
			case JiraissuesPackage.WORKLOG__CREATION_DATE:
			case JiraissuesPackage.WORKLOG__UPDATE_DATE:
			case JiraissuesPackage.WORKLOG__ISSUE_URI:
			case JiraissuesPackage.WORKLOG__COMMENT:
			case JiraissuesPackage.WORKLOG__MINUTES_SPENT:
			case JiraissuesPackage.WORKLOG__START_DATE:
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

}
