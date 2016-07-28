/**
 */
package edu.kit.ipd.sdq.toometa.pcmpatterns.provider;

import de.uka.ipd.sdq.dsexplore.qml.dimensions.provider.DimensionsEditPlugin;

import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.provider.DimensiontypesEditPlugin;

import de.uka.ipd.sdq.identifier.provider.IdentifierEditPlugin;

import de.uka.ipd.sdq.probfunction.provider.ProbabilityFunctionEditPlugin;

import de.uka.ipd.sdq.stoex.provider.StoexEditPlugin;

import de.uka.ipd.sdq.units.provider.UnitsEditPlugin;

import edu.kit.ipd.sdq.toometa.effects.provider.EffectsEditPlugin;

import edu.kit.ipd.sdq.toometa.glossary.provider.GlossaryEditPlugin;

import edu.kit.ipd.sdq.toometa.options.provider.OptionsEditPlugin;

import edu.kit.ipd.sdq.toometa.patterns.provider.PatternsEditPlugin;

import edu.kit.ipd.sdq.toometa.qualities.provider.QualitiesEditPlugin;

import edu.kit.ipd.sdq.toometa.relations.provider.RelationsEditPlugin;

import namedelement.provider.NamedelementEditPlugin;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.provider.EcoreEditPlugin;

import org.palladiosimulator.pcm.core.provider.PalladioComponentModelEditPlugin;

/**
 * This is the central singleton for the Pcmpatterns edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class PcmpatternsEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PcmpatternsEditPlugin INSTANCE = new PcmpatternsEditPlugin();

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
	public PcmpatternsEditPlugin() {
		super
		  (new ResourceLocator [] {
		     OptionsEditPlugin.INSTANCE,
		     EcoreEditPlugin.INSTANCE,
		     EffectsEditPlugin.INSTANCE,
		     GlossaryEditPlugin.INSTANCE,
		     IdentifierEditPlugin.INSTANCE,
		     NamedelementEditPlugin.INSTANCE,
		     PalladioComponentModelEditPlugin.INSTANCE,
		     PatternsEditPlugin.INSTANCE,
		     ProbabilityFunctionEditPlugin.INSTANCE,
		     QualitiesEditPlugin.INSTANCE,
		     RelationsEditPlugin.INSTANCE,
		     StoexEditPlugin.INSTANCE,
		     UnitsEditPlugin.INSTANCE,
		     DimensionsEditPlugin.INSTANCE,
		     DimensiontypesEditPlugin.INSTANCE,
		     de.uka.ipd.sdq.dsexplore.qml.units.provider.UnitsEditPlugin.INSTANCE,
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
