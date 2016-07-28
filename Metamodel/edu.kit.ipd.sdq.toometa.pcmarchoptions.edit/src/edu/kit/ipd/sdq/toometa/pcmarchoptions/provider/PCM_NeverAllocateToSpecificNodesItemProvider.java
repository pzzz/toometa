/**
 */
package edu.kit.ipd.sdq.toometa.pcmarchoptions.provider;


import edu.kit.ipd.sdq.toometa.archoptions.provider.NeverAllocateToSpecificNodesItemProvider;

import edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_NeverAllocateToSpecificNodes;
import edu.kit.ipd.sdq.toometa.pcmarchoptions.PcmarchoptionsPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_NeverAllocateToSpecificNodes} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PCM_NeverAllocateToSpecificNodesItemProvider extends NeverAllocateToSpecificNodesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCM_NeverAllocateToSpecificNodesItemProvider(AdapterFactory adapterFactory) {
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

			addAllocationContextsPropertyDescriptor(object);
			addHwNodesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Allocation Contexts feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllocationContextsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PCM_NeverAllocateToSpecificNodes_allocationContexts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PCM_NeverAllocateToSpecificNodes_allocationContexts_feature", "_UI_PCM_NeverAllocateToSpecificNodes_type"),
				 PcmarchoptionsPackage.Literals.PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES__ALLOCATION_CONTEXTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hw Nodes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHwNodesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PCM_NeverAllocateToSpecificNodes_hwNodes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PCM_NeverAllocateToSpecificNodes_hwNodes_feature", "_UI_PCM_NeverAllocateToSpecificNodes_type"),
				 PcmarchoptionsPackage.Literals.PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES__HW_NODES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns PCM_NeverAllocateToSpecificNodes.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PCM_NeverAllocateToSpecificNodes"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((PCM_NeverAllocateToSpecificNodes)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_PCM_NeverAllocateToSpecificNodes_type") :
			getString("_UI_PCM_NeverAllocateToSpecificNodes_type") + " " + label;
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
