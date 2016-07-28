/**
 */
package edu.kit.ipd.sdq.toometa.jiraissues.provider;

import edu.kit.ipd.sdq.toometa.issues.IssueModel;
import edu.kit.ipd.sdq.toometa.issues.IssuesPackage;

import edu.kit.ipd.sdq.toometa.issues.util.IssuesSwitch;

import edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesFactory;

import edu.kit.ipd.sdq.toometa.jiraissues.util.JiraissuesAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.command.CommandParameter;

import org.eclipse.emf.edit.domain.EditingDomain;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JiraissuesItemProviderAdapterFactory extends JiraissuesAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JiraissuesItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.toometa.jiraissues.Attachment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttachmentItemProvider attachmentItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.toometa.jiraissues.Attachment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttachmentAdapter() {
		if (attachmentItemProvider == null) {
			attachmentItemProvider = new AttachmentItemProvider(this);
		}

		return attachmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.toometa.jiraissues.TimeTracking} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeTrackingItemProvider timeTrackingItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.toometa.jiraissues.TimeTracking}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTimeTrackingAdapter() {
		if (timeTrackingItemProvider == null) {
			timeTrackingItemProvider = new TimeTrackingItemProvider(this);
		}

		return timeTrackingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.toometa.jiraissues.Worklog} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorklogItemProvider worklogItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.toometa.jiraissues.Worklog}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWorklogAdapter() {
		if (worklogItemProvider == null) {
			worklogItemProvider = new WorklogItemProvider(this);
		}

		return worklogItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.toometa.jiraissues.Version} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionItemProvider versionItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.toometa.jiraissues.Version}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVersionAdapter() {
		if (versionItemProvider == null) {
			versionItemProvider = new VersionItemProvider(this);
		}

		return versionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.toometa.jiraissues.Project} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectItemProvider projectItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.toometa.jiraissues.Project}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProjectAdapter() {
		if (projectItemProvider == null) {
			projectItemProvider = new ProjectItemProvider(this);
		}

		return projectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.toometa.jiraissues.Component} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentItemProvider componentItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.toometa.jiraissues.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentAdapter() {
		if (componentItemProvider == null) {
			componentItemProvider = new ComponentItemProvider(this);
		}

		return componentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JiraIssueItemProvider jiraIssueItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.toometa.jiraissues.JiraIssue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJiraIssueAdapter() {
		if (jiraIssueItemProvider == null) {
			jiraIssueItemProvider = new JiraIssueItemProvider(this);
		}

		return jiraIssueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.toometa.jiraissues.Comment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommentItemProvider commentItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.toometa.jiraissues.Comment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCommentAdapter() {
		if (commentItemProvider == null) {
			commentItemProvider = new CommentItemProvider(this);
		}

		return commentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.toometa.jiraissues.UserProxy} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserProxyItemProvider userProxyItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.toometa.jiraissues.UserProxy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUserProxyAdapter() {
		if (userProxyItemProvider == null) {
			userProxyItemProvider = new UserProxyItemProvider(this);
		}

		return userProxyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.toometa.jiraissues.AuthorUpdatableElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthorUpdatableElementItemProvider authorUpdatableElementItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.toometa.jiraissues.AuthorUpdatableElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAuthorUpdatableElementAdapter() {
		if (authorUpdatableElementItemProvider == null) {
			authorUpdatableElementItemProvider = new AuthorUpdatableElementItemProvider(this);
		}

		return authorUpdatableElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.toometa.jiraissues.AddressableElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressableElementItemProvider addressableElementItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.toometa.jiraissues.AddressableElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAddressableElementAdapter() {
		if (addressableElementItemProvider == null) {
			addressableElementItemProvider = new AddressableElementItemProvider(this);
		}

		return addressableElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.toometa.jiraissues.JiraLink} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JiraLinkItemProvider jiraLinkItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.toometa.jiraissues.JiraLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJiraLinkAdapter() {
		if (jiraLinkItemProvider == null) {
			jiraLinkItemProvider = new JiraLinkItemProvider(this);
		}

		return jiraLinkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.toometa.jiraissues.Field} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldItemProvider fieldItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.toometa.jiraissues.Field}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFieldAdapter() {
		if (fieldItemProvider == null) {
			fieldItemProvider = new FieldItemProvider(this);
		}

		return fieldItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.kit.ipd.sdq.toometa.jiraissues.UpdatableElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdatableElementItemProvider updatableElementItemProvider;

	/**
	 * This creates an adapter for a {@link edu.kit.ipd.sdq.toometa.jiraissues.UpdatableElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUpdatableElementAdapter() {
		if (updatableElementItemProvider == null) {
			updatableElementItemProvider = new UpdatableElementItemProvider(this);
		}

		return updatableElementItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (attachmentItemProvider != null) attachmentItemProvider.dispose();
		if (timeTrackingItemProvider != null) timeTrackingItemProvider.dispose();
		if (worklogItemProvider != null) worklogItemProvider.dispose();
		if (versionItemProvider != null) versionItemProvider.dispose();
		if (projectItemProvider != null) projectItemProvider.dispose();
		if (componentItemProvider != null) componentItemProvider.dispose();
		if (jiraIssueItemProvider != null) jiraIssueItemProvider.dispose();
		if (commentItemProvider != null) commentItemProvider.dispose();
		if (userProxyItemProvider != null) userProxyItemProvider.dispose();
		if (authorUpdatableElementItemProvider != null) authorUpdatableElementItemProvider.dispose();
		if (addressableElementItemProvider != null) addressableElementItemProvider.dispose();
		if (jiraLinkItemProvider != null) jiraLinkItemProvider.dispose();
		if (fieldItemProvider != null) fieldItemProvider.dispose();
		if (updatableElementItemProvider != null) updatableElementItemProvider.dispose();
	}

	/**
	 * A child creation extender for the {@link IssuesPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class IssuesChildCreationExtender implements IChildCreationExtender {
		/**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected static class CreationSwitch extends IssuesSwitch<Object> {
			/**
			 * The child descriptors being populated.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected List<Object> newChildDescriptors;

			/**
			 * The domain in which to create the children.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected EditingDomain editingDomain;

			/**
			 * Creates the a switch for populating child descriptors in the given domain.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			CreationSwitch(List<Object> newChildDescriptors, EditingDomain editingDomain) {
				this.newChildDescriptors = newChildDescriptors;
				this.editingDomain = editingDomain;
			}
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object caseIssueModel(IssueModel object) {
				newChildDescriptors.add
					(createChildParameter
						(IssuesPackage.Literals.ISSUE_MODEL__ISSUES,
						 JiraissuesFactory.eINSTANCE.createJiraIssue()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected CommandParameter createChildParameter(Object feature, Object child) {
				return new CommandParameter(null, feature, child);
			}

		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Collection<Object> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
			ArrayList<Object> result = new ArrayList<Object>();
			new CreationSwitch(result, editingDomain).doSwitch((EObject)object);
			return result;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public ResourceLocator getResourceLocator() {
			return JiraissuesEditPlugin.INSTANCE;
		}
	}

}
