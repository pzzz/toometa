/**
 */
package edu.kit.ipd.sdq.toometa.users.provider;


import de.uka.ipd.sdq.identifier.provider.IdentifierItemProvider;

import edu.kit.ipd.sdq.toometa.users.UserRepository;
import edu.kit.ipd.sdq.toometa.users.UsersFactory;
import edu.kit.ipd.sdq.toometa.users.UsersPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.toometa.users.UserRepository} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UserRepositoryItemProvider extends IdentifierItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserRepositoryItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(UsersPackage.Literals.USER_REPOSITORY__USERS);
			childrenFeatures.add(UsersPackage.Literals.USER_REPOSITORY__ROLE_TYPES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns UserRepository.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UserRepository"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((UserRepository)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_UserRepository_type") :
			getString("_UI_UserRepository_type") + " " + label;
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

		switch (notification.getFeatureID(UserRepository.class)) {
			case UsersPackage.USER_REPOSITORY__USERS:
			case UsersPackage.USER_REPOSITORY__ROLE_TYPES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(UsersPackage.Literals.USER_REPOSITORY__USERS,
				 UsersFactory.eINSTANCE.createUser()));

		newChildDescriptors.add
			(createChildParameter
				(UsersPackage.Literals.USER_REPOSITORY__ROLE_TYPES,
				 UsersFactory.eINSTANCE.createArchitect()));

		newChildDescriptors.add
			(createChildParameter
				(UsersPackage.Literals.USER_REPOSITORY__ROLE_TYPES,
				 UsersFactory.eINSTANCE.createEngineer()));

		newChildDescriptors.add
			(createChildParameter
				(UsersPackage.Literals.USER_REPOSITORY__ROLE_TYPES,
				 UsersFactory.eINSTANCE.createReqEngineer()));

		newChildDescriptors.add
			(createChildParameter
				(UsersPackage.Literals.USER_REPOSITORY__ROLE_TYPES,
				 UsersFactory.eINSTANCE.createOther()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return UsersEditPlugin.INSTANCE;
	}

}
