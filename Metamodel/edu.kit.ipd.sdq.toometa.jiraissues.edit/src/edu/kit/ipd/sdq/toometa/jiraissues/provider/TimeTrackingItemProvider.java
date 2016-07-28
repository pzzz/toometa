/**
 */
package edu.kit.ipd.sdq.toometa.jiraissues.provider;


import de.uka.ipd.sdq.identifier.provider.IdentifierItemProvider;

import edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage;
import edu.kit.ipd.sdq.toometa.jiraissues.TimeTracking;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.toometa.jiraissues.TimeTracking} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TimeTrackingItemProvider extends IdentifierItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeTrackingItemProvider(AdapterFactory adapterFactory) {
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

			addOriginalEstimateMinutesPropertyDescriptor(object);
			addRemainingEstimateMinutesPropertyDescriptor(object);
			addTimeSpentMinutesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Original Estimate Minutes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOriginalEstimateMinutesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TimeTracking_originalEstimateMinutes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TimeTracking_originalEstimateMinutes_feature", "_UI_TimeTracking_type"),
				 JiraissuesPackage.Literals.TIME_TRACKING__ORIGINAL_ESTIMATE_MINUTES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Remaining Estimate Minutes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRemainingEstimateMinutesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TimeTracking_remainingEstimateMinutes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TimeTracking_remainingEstimateMinutes_feature", "_UI_TimeTracking_type"),
				 JiraissuesPackage.Literals.TIME_TRACKING__REMAINING_ESTIMATE_MINUTES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Time Spent Minutes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeSpentMinutesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TimeTracking_timeSpentMinutes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TimeTracking_timeSpentMinutes_feature", "_UI_TimeTracking_type"),
				 JiraissuesPackage.Literals.TIME_TRACKING__TIME_SPENT_MINUTES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns TimeTracking.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TimeTracking"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		TimeTracking timeTracking = (TimeTracking)object;
		return getString("_UI_TimeTracking_type") + " " + timeTracking.getTimeSpentMinutes();
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

		switch (notification.getFeatureID(TimeTracking.class)) {
			case JiraissuesPackage.TIME_TRACKING__ORIGINAL_ESTIMATE_MINUTES:
			case JiraissuesPackage.TIME_TRACKING__REMAINING_ESTIMATE_MINUTES:
			case JiraissuesPackage.TIME_TRACKING__TIME_SPENT_MINUTES:
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
		return JiraissuesEditPlugin.INSTANCE;
	}

}
