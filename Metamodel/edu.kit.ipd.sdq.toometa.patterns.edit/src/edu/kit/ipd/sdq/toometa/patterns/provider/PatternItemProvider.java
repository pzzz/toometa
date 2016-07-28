/**
 */
package edu.kit.ipd.sdq.toometa.patterns.provider;


import de.uka.ipd.sdq.identifier.provider.IdentifierItemProvider;

import edu.kit.ipd.sdq.toometa.patterns.Pattern;
import edu.kit.ipd.sdq.toometa.patterns.PatternsFactory;
import edu.kit.ipd.sdq.toometa.patterns.PatternsPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.toometa.patterns.Pattern} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PatternItemProvider extends IdentifierItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternItemProvider(AdapterFactory adapterFactory) {
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

			addInformationSourcePropertyDescriptor(object);
			addShortDescriptionPropertyDescriptor(object);
			addDiagramPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addSimilarToPropertyDescriptor(object);
			addExcludesPropertyDescriptor(object);
			addUsedWithPropertyDescriptor(object);
			addAlternativeForPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addCategoriesPropertyDescriptor(object);
			addDomainPropertyDescriptor(object);
			addHasVariantsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Information Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInformationSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GeneralPatternDescription_InformationSource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GeneralPatternDescription_InformationSource_feature", "_UI_GeneralPatternDescription_type"),
				 PatternsPackage.Literals.GENERAL_PATTERN_DESCRIPTION__INFORMATION_SOURCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Short Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShortDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GeneralPatternDescription_ShortDescription_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GeneralPatternDescription_ShortDescription_feature", "_UI_GeneralPatternDescription_type"),
				 PatternsPackage.Literals.GENERAL_PATTERN_DESCRIPTION__SHORT_DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Diagram feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiagramPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GeneralPatternDescription_diagram_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GeneralPatternDescription_diagram_feature", "_UI_GeneralPatternDescription_type"),
				 PatternsPackage.Literals.GENERAL_PATTERN_DESCRIPTION__DIAGRAM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GeneralPatternDescription_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GeneralPatternDescription_name_feature", "_UI_GeneralPatternDescription_type"),
				 PatternsPackage.Literals.GENERAL_PATTERN_DESCRIPTION__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Similar To feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSimilarToPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Similar_similarTo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Similar_similarTo_feature", "_UI_Similar_type"),
				 PatternsPackage.Literals.SIMILAR__SIMILAR_TO,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Excludes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExcludesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Exclusion_excludes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Exclusion_excludes_feature", "_UI_Exclusion_type"),
				 PatternsPackage.Literals.EXCLUSION__EXCLUDES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Used With feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsedWithPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CoUsage_usedWith_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CoUsage_usedWith_feature", "_UI_CoUsage_type"),
				 PatternsPackage.Literals.CO_USAGE__USED_WITH,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Alternative For feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAlternativeForPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Alternative_alternativeFor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Alternative_alternativeFor_feature", "_UI_Alternative_type"),
				 PatternsPackage.Literals.ALTERNATIVE__ALTERNATIVE_FOR,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PatternRelations_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PatternRelations_description_feature", "_UI_PatternRelations_type"),
				 PatternsPackage.Literals.PATTERN_RELATIONS__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Categories feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCategoriesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pattern_categories_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pattern_categories_feature", "_UI_Pattern_type"),
				 PatternsPackage.Literals.PATTERN__CATEGORIES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pattern_domain_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pattern_domain_feature", "_UI_Pattern_type"),
				 PatternsPackage.Literals.PATTERN__DOMAIN,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Variants feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasVariantsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pattern_hasVariants_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pattern_hasVariants_feature", "_UI_Pattern_type"),
				 PatternsPackage.Literals.PATTERN__HAS_VARIANTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
			childrenFeatures.add(PatternsPackage.Literals.GENERAL_PATTERN_DESCRIPTION__PROPERTY);
			childrenFeatures.add(PatternsPackage.Literals.ARCHITECTURAL_STRUCTURE__ROLE);
			childrenFeatures.add(PatternsPackage.Literals.ARCHITECTURAL_STRUCTURE__CONNECTORS);
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
	 * This returns Pattern.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Pattern"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Pattern)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Pattern_type") :
			getString("_UI_Pattern_type") + " " + label;
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

		switch (notification.getFeatureID(Pattern.class)) {
			case PatternsPackage.PATTERN__INFORMATION_SOURCE:
			case PatternsPackage.PATTERN__SHORT_DESCRIPTION:
			case PatternsPackage.PATTERN__DIAGRAM:
			case PatternsPackage.PATTERN__NAME:
			case PatternsPackage.PATTERN__DESCRIPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PatternsPackage.PATTERN__PROPERTY:
			case PatternsPackage.PATTERN__ROLE:
			case PatternsPackage.PATTERN__CONNECTORS:
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
				(PatternsPackage.Literals.GENERAL_PATTERN_DESCRIPTION__PROPERTY,
				 PatternsFactory.eINSTANCE.createQualityInfluence()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.GENERAL_PATTERN_DESCRIPTION__PROPERTY,
				 PatternsFactory.eINSTANCE.createDrawback()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.GENERAL_PATTERN_DESCRIPTION__PROPERTY,
				 PatternsFactory.eINSTANCE.createKeyword()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.GENERAL_PATTERN_DESCRIPTION__PROPERTY,
				 PatternsFactory.eINSTANCE.createGoal()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.ARCHITECTURAL_STRUCTURE__ROLE,
				 PatternsFactory.eINSTANCE.createRole()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.ARCHITECTURAL_STRUCTURE__CONNECTORS,
				 PatternsFactory.eINSTANCE.createConnector()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return PatternsEditPlugin.INSTANCE;
	}

}
