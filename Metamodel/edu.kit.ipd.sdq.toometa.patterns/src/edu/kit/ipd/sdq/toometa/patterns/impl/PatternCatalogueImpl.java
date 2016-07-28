/**
 */
package edu.kit.ipd.sdq.toometa.patterns.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import edu.kit.ipd.sdq.toometa.patterns.Category;
import edu.kit.ipd.sdq.toometa.patterns.DomainType;
import edu.kit.ipd.sdq.toometa.patterns.InfrastructureType;
import edu.kit.ipd.sdq.toometa.patterns.Pattern;
import edu.kit.ipd.sdq.toometa.patterns.PatternCatalogue;
import edu.kit.ipd.sdq.toometa.patterns.PatternsPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Catalogue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.impl.PatternCatalogueImpl#getPatterns <em>Patterns</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.impl.PatternCatalogueImpl#getDomains <em>Domains</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.impl.PatternCatalogueImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.impl.PatternCatalogueImpl#getInfrastructuretype <em>Infrastructuretype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatternCatalogueImpl extends IdentifierImpl implements PatternCatalogue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternCatalogueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternsPackage.Literals.PATTERN_CATALOGUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Pattern> getPatterns() {
		return (EList<Pattern>)eGet(PatternsPackage.Literals.PATTERN_CATALOGUE__PATTERNS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DomainType> getDomains() {
		return (EList<DomainType>)eGet(PatternsPackage.Literals.PATTERN_CATALOGUE__DOMAINS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Category> getCategories() {
		return (EList<Category>)eGet(PatternsPackage.Literals.PATTERN_CATALOGUE__CATEGORIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<InfrastructureType> getInfrastructuretype() {
		return (EList<InfrastructureType>)eGet(PatternsPackage.Literals.PATTERN_CATALOGUE__INFRASTRUCTURETYPE, true);
	}

} //PatternCatalogueImpl
