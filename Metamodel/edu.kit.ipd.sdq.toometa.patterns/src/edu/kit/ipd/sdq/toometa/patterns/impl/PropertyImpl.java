/**
 */
package edu.kit.ipd.sdq.toometa.patterns.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import edu.kit.ipd.sdq.toometa.glossary.GlossaryTerm;

import edu.kit.ipd.sdq.toometa.patterns.PatternsPackage;
import edu.kit.ipd.sdq.toometa.patterns.Property;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.impl.PropertyImpl#getTerms <em>Terms</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PropertyImpl extends IdentifierImpl implements Property {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternsPackage.Literals.PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<GlossaryTerm> getTerms() {
		return (EList<GlossaryTerm>)eGet(PatternsPackage.Literals.PROPERTY__TERMS, true);
	}

} //PropertyImpl
