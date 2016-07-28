/**
 */
package edu.kit.ipd.sdq.toometa.jiraissues.provider;

import de.uka.ipd.sdq.identifier.provider.IdentifierEditPlugin;

import edu.kit.ipd.sdq.toometa.issues.provider.IssuesEditPlugin;

import edu.kit.ipd.sdq.toometa.relations.provider.RelationsEditPlugin;

import edu.kit.ipd.sdq.toometa.users.provider.UsersEditPlugin;

import namedelement.provider.NamedelementEditPlugin;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

/**
 * This is the central singleton for the Jiraissues edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class JiraissuesEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final JiraissuesEditPlugin INSTANCE = new JiraissuesEditPlugin();

	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JiraissuesEditPlugin() {
		super
		  (new ResourceLocator [] {
		     IdentifierEditPlugin.INSTANCE,
		     IssuesEditPlugin.INSTANCE,
		     NamedelementEditPlugin.INSTANCE,
		     RelationsEditPlugin.INSTANCE,
		     UsersEditPlugin.INSTANCE,
		   });
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}

	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Implementation extends EclipsePlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Implementation() {
			super();

			// Remember the static instance.
			//
			plugin = this;
		}
	}

}
