/**
 */
package edu.kit.ipd.sdq.toometa.patterns.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import edu.kit.ipd.sdq.toometa.patterns.Alternative;
import edu.kit.ipd.sdq.toometa.patterns.ArchitecturalStructure;
import edu.kit.ipd.sdq.toometa.patterns.Category;
import edu.kit.ipd.sdq.toometa.patterns.CoUsage;
import edu.kit.ipd.sdq.toometa.patterns.Connector;
import edu.kit.ipd.sdq.toometa.patterns.DomainType;
import edu.kit.ipd.sdq.toometa.patterns.Exclusion;
import edu.kit.ipd.sdq.toometa.patterns.GeneralPatternDescription;
import edu.kit.ipd.sdq.toometa.patterns.Pattern;
import edu.kit.ipd.sdq.toometa.patterns.PatternCatalogue;
import edu.kit.ipd.sdq.toometa.patterns.PatternRelations;
import edu.kit.ipd.sdq.toometa.patterns.PatternVariant;
import edu.kit.ipd.sdq.toometa.patterns.PatternsPackage;
import edu.kit.ipd.sdq.toometa.patterns.Property;
import edu.kit.ipd.sdq.toometa.patterns.QuestionAnnotations;
import edu.kit.ipd.sdq.toometa.patterns.Role;
import edu.kit.ipd.sdq.toometa.patterns.Similar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.impl.PatternImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.impl.PatternImpl#getInformationSource <em>Information Source</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.impl.PatternImpl#getShortDescription <em>Short Description</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.impl.PatternImpl#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.impl.PatternImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.impl.PatternImpl#getRole <em>Role</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.impl.PatternImpl#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.impl.PatternImpl#getSimilarTo <em>Similar To</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.impl.PatternImpl#getExcludes <em>Excludes</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.impl.PatternImpl#getUsedWith <em>Used With</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.impl.PatternImpl#getAlternativeFor <em>Alternative For</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.impl.PatternImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.impl.PatternImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.impl.PatternImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.impl.PatternImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.impl.PatternImpl#getHasVariants <em>Has Variants</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatternImpl extends IdentifierImpl implements Pattern {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternsPackage.Literals.PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Property> getProperty() {
		return (EList<Property>)eGet(PatternsPackage.Literals.GENERAL_PATTERN_DESCRIPTION__PROPERTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getInformationSource() {
		return (EList<String>)eGet(PatternsPackage.Literals.GENERAL_PATTERN_DESCRIPTION__INFORMATION_SOURCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShortDescription() {
		return (String)eGet(PatternsPackage.Literals.GENERAL_PATTERN_DESCRIPTION__SHORT_DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortDescription(String newShortDescription) {
		eSet(PatternsPackage.Literals.GENERAL_PATTERN_DESCRIPTION__SHORT_DESCRIPTION, newShortDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getDiagram() {
		return (byte[])eGet(PatternsPackage.Literals.GENERAL_PATTERN_DESCRIPTION__DIAGRAM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagram(byte[] newDiagram) {
		eSet(PatternsPackage.Literals.GENERAL_PATTERN_DESCRIPTION__DIAGRAM, newDiagram);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(PatternsPackage.Literals.GENERAL_PATTERN_DESCRIPTION__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(PatternsPackage.Literals.GENERAL_PATTERN_DESCRIPTION__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Role> getRole() {
		return (EList<Role>)eGet(PatternsPackage.Literals.ARCHITECTURAL_STRUCTURE__ROLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Connector> getConnectors() {
		return (EList<Connector>)eGet(PatternsPackage.Literals.ARCHITECTURAL_STRUCTURE__CONNECTORS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Similar> getSimilarTo() {
		return (EList<Similar>)eGet(PatternsPackage.Literals.SIMILAR__SIMILAR_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Exclusion> getExcludes() {
		return (EList<Exclusion>)eGet(PatternsPackage.Literals.EXCLUSION__EXCLUDES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CoUsage> getUsedWith() {
		return (EList<CoUsage>)eGet(PatternsPackage.Literals.CO_USAGE__USED_WITH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Alternative> getAlternativeFor() {
		return (EList<Alternative>)eGet(PatternsPackage.Literals.ALTERNATIVE__ALTERNATIVE_FOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eGet(PatternsPackage.Literals.PATTERN_RELATIONS__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(PatternsPackage.Literals.PATTERN_RELATIONS__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternCatalogue getRepository() {
		return (PatternCatalogue)eGet(PatternsPackage.Literals.PATTERN__REPOSITORY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepository(PatternCatalogue newRepository) {
		eSet(PatternsPackage.Literals.PATTERN__REPOSITORY, newRepository);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Category> getCategories() {
		return (EList<Category>)eGet(PatternsPackage.Literals.PATTERN__CATEGORIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DomainType> getDomain() {
		return (EList<DomainType>)eGet(PatternsPackage.Literals.PATTERN__DOMAIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PatternVariant> getHasVariants() {
		return (EList<PatternVariant>)eGet(PatternsPackage.Literals.PATTERN__HAS_VARIANTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == GeneralPatternDescription.class) {
			switch (derivedFeatureID) {
				case PatternsPackage.PATTERN__PROPERTY: return PatternsPackage.GENERAL_PATTERN_DESCRIPTION__PROPERTY;
				case PatternsPackage.PATTERN__INFORMATION_SOURCE: return PatternsPackage.GENERAL_PATTERN_DESCRIPTION__INFORMATION_SOURCE;
				case PatternsPackage.PATTERN__SHORT_DESCRIPTION: return PatternsPackage.GENERAL_PATTERN_DESCRIPTION__SHORT_DESCRIPTION;
				case PatternsPackage.PATTERN__DIAGRAM: return PatternsPackage.GENERAL_PATTERN_DESCRIPTION__DIAGRAM;
				case PatternsPackage.PATTERN__NAME: return PatternsPackage.GENERAL_PATTERN_DESCRIPTION__NAME;
				default: return -1;
			}
		}
		if (baseClass == QuestionAnnotations.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ArchitecturalStructure.class) {
			switch (derivedFeatureID) {
				case PatternsPackage.PATTERN__ROLE: return PatternsPackage.ARCHITECTURAL_STRUCTURE__ROLE;
				case PatternsPackage.PATTERN__CONNECTORS: return PatternsPackage.ARCHITECTURAL_STRUCTURE__CONNECTORS;
				default: return -1;
			}
		}
		if (baseClass == Similar.class) {
			switch (derivedFeatureID) {
				case PatternsPackage.PATTERN__SIMILAR_TO: return PatternsPackage.SIMILAR__SIMILAR_TO;
				default: return -1;
			}
		}
		if (baseClass == Exclusion.class) {
			switch (derivedFeatureID) {
				case PatternsPackage.PATTERN__EXCLUDES: return PatternsPackage.EXCLUSION__EXCLUDES;
				default: return -1;
			}
		}
		if (baseClass == CoUsage.class) {
			switch (derivedFeatureID) {
				case PatternsPackage.PATTERN__USED_WITH: return PatternsPackage.CO_USAGE__USED_WITH;
				default: return -1;
			}
		}
		if (baseClass == Alternative.class) {
			switch (derivedFeatureID) {
				case PatternsPackage.PATTERN__ALTERNATIVE_FOR: return PatternsPackage.ALTERNATIVE__ALTERNATIVE_FOR;
				default: return -1;
			}
		}
		if (baseClass == PatternRelations.class) {
			switch (derivedFeatureID) {
				case PatternsPackage.PATTERN__DESCRIPTION: return PatternsPackage.PATTERN_RELATIONS__DESCRIPTION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == GeneralPatternDescription.class) {
			switch (baseFeatureID) {
				case PatternsPackage.GENERAL_PATTERN_DESCRIPTION__PROPERTY: return PatternsPackage.PATTERN__PROPERTY;
				case PatternsPackage.GENERAL_PATTERN_DESCRIPTION__INFORMATION_SOURCE: return PatternsPackage.PATTERN__INFORMATION_SOURCE;
				case PatternsPackage.GENERAL_PATTERN_DESCRIPTION__SHORT_DESCRIPTION: return PatternsPackage.PATTERN__SHORT_DESCRIPTION;
				case PatternsPackage.GENERAL_PATTERN_DESCRIPTION__DIAGRAM: return PatternsPackage.PATTERN__DIAGRAM;
				case PatternsPackage.GENERAL_PATTERN_DESCRIPTION__NAME: return PatternsPackage.PATTERN__NAME;
				default: return -1;
			}
		}
		if (baseClass == QuestionAnnotations.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ArchitecturalStructure.class) {
			switch (baseFeatureID) {
				case PatternsPackage.ARCHITECTURAL_STRUCTURE__ROLE: return PatternsPackage.PATTERN__ROLE;
				case PatternsPackage.ARCHITECTURAL_STRUCTURE__CONNECTORS: return PatternsPackage.PATTERN__CONNECTORS;
				default: return -1;
			}
		}
		if (baseClass == Similar.class) {
			switch (baseFeatureID) {
				case PatternsPackage.SIMILAR__SIMILAR_TO: return PatternsPackage.PATTERN__SIMILAR_TO;
				default: return -1;
			}
		}
		if (baseClass == Exclusion.class) {
			switch (baseFeatureID) {
				case PatternsPackage.EXCLUSION__EXCLUDES: return PatternsPackage.PATTERN__EXCLUDES;
				default: return -1;
			}
		}
		if (baseClass == CoUsage.class) {
			switch (baseFeatureID) {
				case PatternsPackage.CO_USAGE__USED_WITH: return PatternsPackage.PATTERN__USED_WITH;
				default: return -1;
			}
		}
		if (baseClass == Alternative.class) {
			switch (baseFeatureID) {
				case PatternsPackage.ALTERNATIVE__ALTERNATIVE_FOR: return PatternsPackage.PATTERN__ALTERNATIVE_FOR;
				default: return -1;
			}
		}
		if (baseClass == PatternRelations.class) {
			switch (baseFeatureID) {
				case PatternsPackage.PATTERN_RELATIONS__DESCRIPTION: return PatternsPackage.PATTERN__DESCRIPTION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //PatternImpl
