/**
 */
package edu.kit.ipd.sdq.toometa.palladiorationales.provider;

import de.uka.ipd.sdq.dsexplore.qml.dimensions.provider.DimensionsEditPlugin;

import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.provider.DimensiontypesEditPlugin;

import de.uka.ipd.sdq.dsexplore.qml.units.provider.UnitsEditPlugin;

import de.uka.ipd.sdq.identifier.provider.IdentifierEditPlugin;

import edu.kit.ipd.sdq.toometa.effects.provider.EffectsEditPlugin;

import edu.kit.ipd.sdq.toometa.glossary.provider.GlossaryEditPlugin;

import edu.kit.ipd.sdq.toometa.options.provider.OptionsEditPlugin;

import edu.kit.ipd.sdq.toometa.qualities.provider.QualitiesEditPlugin;

import edu.kit.ipd.sdq.toometa.relations.provider.RelationsEditPlugin;

import namedelement.provider.NamedelementEditPlugin;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

import org.palladiosimulator.edp2.models.ExperimentData.provider.EDP2EditPlugin;

import org.palladiosimulator.metricspec.provider.MetricSpecEditPlugin;

/**
 * This is the central singleton for the Palladiorationales edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class PalladiorationalesEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PalladiorationalesEditPlugin INSTANCE = new PalladiorationalesEditPlugin();

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
	public PalladiorationalesEditPlugin() {
		super
		  (new ResourceLocator [] {
		     OptionsEditPlugin.INSTANCE,
		     DimensionsEditPlugin.INSTANCE,
		     DimensiontypesEditPlugin.INSTANCE,
		     EDP2EditPlugin.INSTANCE,
		     EffectsEditPlugin.INSTANCE,
		     GlossaryEditPlugin.INSTANCE,
		     IdentifierEditPlugin.INSTANCE,
		     MetricSpecEditPlugin.INSTANCE,
		     NamedelementEditPlugin.INSTANCE,
		     QualitiesEditPlugin.INSTANCE,
		     RelationsEditPlugin.INSTANCE,
		     UnitsEditPlugin.INSTANCE,
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
