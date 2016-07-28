/**
 */
package edu.kit.ipd.sdq.toometa.patterns.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import edu.kit.ipd.sdq.toometa.effects.EffectsPackage;

import edu.kit.ipd.sdq.toometa.glossary.GlossaryPackage;

import edu.kit.ipd.sdq.toometa.options.OptionsPackage;

import edu.kit.ipd.sdq.toometa.patterns.Alternative;
import edu.kit.ipd.sdq.toometa.patterns.ArchitecturalStructure;
import edu.kit.ipd.sdq.toometa.patterns.Category;
import edu.kit.ipd.sdq.toometa.patterns.CoUsage;
import edu.kit.ipd.sdq.toometa.patterns.Connector;
import edu.kit.ipd.sdq.toometa.patterns.DomainType;
import edu.kit.ipd.sdq.toometa.patterns.Drawback;
import edu.kit.ipd.sdq.toometa.patterns.Exclusion;
import edu.kit.ipd.sdq.toometa.patterns.GeneralPatternDescription;
import edu.kit.ipd.sdq.toometa.patterns.Goal;
import edu.kit.ipd.sdq.toometa.patterns.InfrastructureType;
import edu.kit.ipd.sdq.toometa.patterns.Keyword;
import edu.kit.ipd.sdq.toometa.patterns.Pattern;
import edu.kit.ipd.sdq.toometa.patterns.PatternCatalogue;
import edu.kit.ipd.sdq.toometa.patterns.PatternRelations;
import edu.kit.ipd.sdq.toometa.patterns.PatternVariant;
import edu.kit.ipd.sdq.toometa.patterns.PatternsFactory;
import edu.kit.ipd.sdq.toometa.patterns.PatternsPackage;
import edu.kit.ipd.sdq.toometa.patterns.Property;
import edu.kit.ipd.sdq.toometa.patterns.QualityInfluence;
import edu.kit.ipd.sdq.toometa.patterns.QuestionAnnotations;
import edu.kit.ipd.sdq.toometa.patterns.Role;
import edu.kit.ipd.sdq.toometa.patterns.Similar;

import edu.kit.ipd.sdq.toometa.patterns.patterninstances.PatterninstancesPackage;

import edu.kit.ipd.sdq.toometa.patterns.patterninstances.impl.PatterninstancesPackageImpl;

import edu.kit.ipd.sdq.toometa.patterns.patternoptions.PatternoptionsPackage;

import edu.kit.ipd.sdq.toometa.patterns.patternoptions.impl.PatternoptionsPackageImpl;

import edu.kit.ipd.sdq.toometa.patterns.questions.QuestionsPackage;

import edu.kit.ipd.sdq.toometa.patterns.questions.impl.QuestionsPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PatternsPackageImpl extends EPackageImpl implements PatternsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coUsageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternRelationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalPatternDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exclusionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alternativeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass similarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternVariantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass architecturalStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionAnnotationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualityInfluenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternCatalogueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infrastructureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass drawbackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keywordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goalEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see edu.kit.ipd.sdq.toometa.patterns.PatternsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PatternsPackageImpl() {
		super(eNS_URI, PatternsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PatternsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PatternsPackage init() {
		if (isInited) return (PatternsPackage)EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI);

		// Obtain or create and register package
		PatternsPackageImpl thePatternsPackage = (PatternsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PatternsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PatternsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		OptionsPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		PatternoptionsPackageImpl thePatternoptionsPackage = (PatternoptionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternoptionsPackage.eNS_URI) instanceof PatternoptionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternoptionsPackage.eNS_URI) : PatternoptionsPackage.eINSTANCE);
		QuestionsPackageImpl theQuestionsPackage = (QuestionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QuestionsPackage.eNS_URI) instanceof QuestionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QuestionsPackage.eNS_URI) : QuestionsPackage.eINSTANCE);
		PatterninstancesPackageImpl thePatterninstancesPackage = (PatterninstancesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatterninstancesPackage.eNS_URI) instanceof PatterninstancesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatterninstancesPackage.eNS_URI) : PatterninstancesPackage.eINSTANCE);

		// Create package meta-data objects
		thePatternsPackage.createPackageContents();
		thePatternoptionsPackage.createPackageContents();
		theQuestionsPackage.createPackageContents();
		thePatterninstancesPackage.createPackageContents();

		// Initialize created meta-data
		thePatternsPackage.initializePackageContents();
		thePatternoptionsPackage.initializePackageContents();
		theQuestionsPackage.initializePackageContents();
		thePatterninstancesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePatternsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PatternsPackage.eNS_URI, thePatternsPackage);
		return thePatternsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategory() {
		return categoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategory_Description() {
		return (EAttribute)categoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRole_Desctiption() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRole_MaxInstances() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoUsage() {
		return coUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoUsage_UsedWith() {
		return (EReference)coUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatternRelations() {
		return patternRelationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatternRelations_Description() {
		return (EAttribute)patternRelationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralPatternDescription() {
		return generalPatternDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralPatternDescription_Property() {
		return (EReference)generalPatternDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralPatternDescription_InformationSource() {
		return (EAttribute)generalPatternDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralPatternDescription_ShortDescription() {
		return (EAttribute)generalPatternDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralPatternDescription_Diagram() {
		return (EAttribute)generalPatternDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralPatternDescription_Name() {
		return (EAttribute)generalPatternDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExclusion() {
		return exclusionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExclusion_Excludes() {
		return (EReference)exclusionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlternative() {
		return alternativeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlternative_AlternativeFor() {
		return (EReference)alternativeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimilar() {
		return similarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimilar_SimilarTo() {
		return (EReference)similarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatternVariant() {
		return patternVariantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternVariant_BasePattern() {
		return (EReference)patternVariantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArchitecturalStructure() {
		return architecturalStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchitecturalStructure_Role() {
		return (EReference)architecturalStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchitecturalStructure_Connectors() {
		return (EReference)architecturalStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionAnnotations() {
		return questionAnnotationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern() {
		return patternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_Repository() {
		return (EReference)patternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_Categories() {
		return (EReference)patternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_Domain() {
		return (EReference)patternEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_HasVariants() {
		return (EReference)patternEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainType() {
		return domainTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Terms() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualityInfluence() {
		return qualityInfluenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatternCatalogue() {
		return patternCatalogueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternCatalogue_Patterns() {
		return (EReference)patternCatalogueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternCatalogue_Domains() {
		return (EReference)patternCatalogueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternCatalogue_Categories() {
		return (EReference)patternCatalogueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternCatalogue_Infrastructuretype() {
		return (EReference)patternCatalogueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfrastructureType() {
		return infrastructureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfrastructureType_Name() {
		return (EAttribute)infrastructureTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfrastructureType_Description() {
		return (EAttribute)infrastructureTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnector() {
		return connectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_ConnectorTo() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_ConnectorFrom() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_Description() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDrawback() {
		return drawbackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDrawback_Drawback() {
		return (EAttribute)drawbackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyword() {
		return keywordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyword_Keyword() {
		return (EAttribute)keywordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoal() {
		return goalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGoal_Description() {
		return (EAttribute)goalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternsFactory getPatternsFactory() {
		return (PatternsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		categoryEClass = createEClass(CATEGORY);
		createEAttribute(categoryEClass, CATEGORY__DESCRIPTION);

		roleEClass = createEClass(ROLE);
		createEAttribute(roleEClass, ROLE__DESCTIPTION);
		createEAttribute(roleEClass, ROLE__MAX_INSTANCES);

		coUsageEClass = createEClass(CO_USAGE);
		createEReference(coUsageEClass, CO_USAGE__USED_WITH);

		patternRelationsEClass = createEClass(PATTERN_RELATIONS);
		createEAttribute(patternRelationsEClass, PATTERN_RELATIONS__DESCRIPTION);

		generalPatternDescriptionEClass = createEClass(GENERAL_PATTERN_DESCRIPTION);
		createEReference(generalPatternDescriptionEClass, GENERAL_PATTERN_DESCRIPTION__PROPERTY);
		createEAttribute(generalPatternDescriptionEClass, GENERAL_PATTERN_DESCRIPTION__INFORMATION_SOURCE);
		createEAttribute(generalPatternDescriptionEClass, GENERAL_PATTERN_DESCRIPTION__SHORT_DESCRIPTION);
		createEAttribute(generalPatternDescriptionEClass, GENERAL_PATTERN_DESCRIPTION__DIAGRAM);
		createEAttribute(generalPatternDescriptionEClass, GENERAL_PATTERN_DESCRIPTION__NAME);

		exclusionEClass = createEClass(EXCLUSION);
		createEReference(exclusionEClass, EXCLUSION__EXCLUDES);

		alternativeEClass = createEClass(ALTERNATIVE);
		createEReference(alternativeEClass, ALTERNATIVE__ALTERNATIVE_FOR);

		similarEClass = createEClass(SIMILAR);
		createEReference(similarEClass, SIMILAR__SIMILAR_TO);

		patternVariantEClass = createEClass(PATTERN_VARIANT);
		createEReference(patternVariantEClass, PATTERN_VARIANT__BASE_PATTERN);

		architecturalStructureEClass = createEClass(ARCHITECTURAL_STRUCTURE);
		createEReference(architecturalStructureEClass, ARCHITECTURAL_STRUCTURE__ROLE);
		createEReference(architecturalStructureEClass, ARCHITECTURAL_STRUCTURE__CONNECTORS);

		questionAnnotationsEClass = createEClass(QUESTION_ANNOTATIONS);

		patternEClass = createEClass(PATTERN);
		createEReference(patternEClass, PATTERN__REPOSITORY);
		createEReference(patternEClass, PATTERN__CATEGORIES);
		createEReference(patternEClass, PATTERN__DOMAIN);
		createEReference(patternEClass, PATTERN__HAS_VARIANTS);

		domainTypeEClass = createEClass(DOMAIN_TYPE);

		propertyEClass = createEClass(PROPERTY);
		createEReference(propertyEClass, PROPERTY__TERMS);

		qualityInfluenceEClass = createEClass(QUALITY_INFLUENCE);

		patternCatalogueEClass = createEClass(PATTERN_CATALOGUE);
		createEReference(patternCatalogueEClass, PATTERN_CATALOGUE__PATTERNS);
		createEReference(patternCatalogueEClass, PATTERN_CATALOGUE__DOMAINS);
		createEReference(patternCatalogueEClass, PATTERN_CATALOGUE__CATEGORIES);
		createEReference(patternCatalogueEClass, PATTERN_CATALOGUE__INFRASTRUCTURETYPE);

		infrastructureTypeEClass = createEClass(INFRASTRUCTURE_TYPE);
		createEAttribute(infrastructureTypeEClass, INFRASTRUCTURE_TYPE__NAME);
		createEAttribute(infrastructureTypeEClass, INFRASTRUCTURE_TYPE__DESCRIPTION);

		connectorEClass = createEClass(CONNECTOR);
		createEReference(connectorEClass, CONNECTOR__CONNECTOR_TO);
		createEReference(connectorEClass, CONNECTOR__CONNECTOR_FROM);
		createEAttribute(connectorEClass, CONNECTOR__DESCRIPTION);

		drawbackEClass = createEClass(DRAWBACK);
		createEAttribute(drawbackEClass, DRAWBACK__DRAWBACK);

		keywordEClass = createEClass(KEYWORD);
		createEAttribute(keywordEClass, KEYWORD__KEYWORD);

		goalEClass = createEClass(GOAL);
		createEAttribute(goalEClass, GOAL__DESCRIPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		PatternoptionsPackage thePatternoptionsPackage = (PatternoptionsPackage)EPackage.Registry.INSTANCE.getEPackage(PatternoptionsPackage.eNS_URI);
		QuestionsPackage theQuestionsPackage = (QuestionsPackage)EPackage.Registry.INSTANCE.getEPackage(QuestionsPackage.eNS_URI);
		PatterninstancesPackage thePatterninstancesPackage = (PatterninstancesPackage)EPackage.Registry.INSTANCE.getEPackage(PatterninstancesPackage.eNS_URI);
		IdentifierPackage theIdentifierPackage = (IdentifierPackage)EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI);
		GlossaryPackage theGlossaryPackage = (GlossaryPackage)EPackage.Registry.INSTANCE.getEPackage(GlossaryPackage.eNS_URI);
		EffectsPackage theEffectsPackage = (EffectsPackage)EPackage.Registry.INSTANCE.getEPackage(EffectsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(thePatternoptionsPackage);
		getESubpackages().add(theQuestionsPackage);
		getESubpackages().add(thePatterninstancesPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		categoryEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		roleEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		patternRelationsEClass.getESuperTypes().add(this.getSimilar());
		patternRelationsEClass.getESuperTypes().add(this.getExclusion());
		patternRelationsEClass.getESuperTypes().add(this.getCoUsage());
		patternRelationsEClass.getESuperTypes().add(this.getAlternative());
		patternVariantEClass.getESuperTypes().add(this.getPattern());
		patternEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		patternEClass.getESuperTypes().add(this.getGeneralPatternDescription());
		patternEClass.getESuperTypes().add(this.getQuestionAnnotations());
		patternEClass.getESuperTypes().add(this.getArchitecturalStructure());
		patternEClass.getESuperTypes().add(this.getPatternRelations());
		domainTypeEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		propertyEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		qualityInfluenceEClass.getESuperTypes().add(this.getProperty());
		qualityInfluenceEClass.getESuperTypes().add(theEffectsPackage.getQualityEffect());
		patternCatalogueEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		infrastructureTypeEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		connectorEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		drawbackEClass.getESuperTypes().add(this.getProperty());
		keywordEClass.getESuperTypes().add(this.getProperty());
		goalEClass.getESuperTypes().add(this.getProperty());

		// Initialize classes and features; add operations and parameters
		initEClass(categoryEClass, Category.class, "Category", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCategory_Description(), ecorePackage.getEString(), "description", null, 0, 1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRole_Desctiption(), ecorePackage.getEString(), "desctiption", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRole_MaxInstances(), ecorePackage.getEInt(), "maxInstances", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coUsageEClass, CoUsage.class, "CoUsage", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCoUsage_UsedWith(), this.getCoUsage(), null, "usedWith", null, 0, -1, CoUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patternRelationsEClass, PatternRelations.class, "PatternRelations", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPatternRelations_Description(), ecorePackage.getEString(), "description", null, 0, 1, PatternRelations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generalPatternDescriptionEClass, GeneralPatternDescription.class, "GeneralPatternDescription", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneralPatternDescription_Property(), this.getProperty(), null, "property", null, 0, -1, GeneralPatternDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneralPatternDescription_InformationSource(), ecorePackage.getEString(), "InformationSource", null, 0, -1, GeneralPatternDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneralPatternDescription_ShortDescription(), ecorePackage.getEString(), "ShortDescription", null, 0, 1, GeneralPatternDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneralPatternDescription_Diagram(), ecorePackage.getEByteArray(), "diagram", null, 0, 1, GeneralPatternDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneralPatternDescription_Name(), ecorePackage.getEString(), "name", null, 0, 1, GeneralPatternDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exclusionEClass, Exclusion.class, "Exclusion", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExclusion_Excludes(), this.getExclusion(), null, "excludes", null, 0, -1, Exclusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alternativeEClass, Alternative.class, "Alternative", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAlternative_AlternativeFor(), this.getAlternative(), null, "alternativeFor", null, 0, -1, Alternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(similarEClass, Similar.class, "Similar", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimilar_SimilarTo(), this.getSimilar(), null, "similarTo", null, 0, -1, Similar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patternVariantEClass, PatternVariant.class, "PatternVariant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPatternVariant_BasePattern(), this.getPattern(), this.getPattern_HasVariants(), "basePattern", null, 1, 1, PatternVariant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(architecturalStructureEClass, ArchitecturalStructure.class, "ArchitecturalStructure", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArchitecturalStructure_Role(), this.getRole(), null, "role", null, 1, -1, ArchitecturalStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitecturalStructure_Connectors(), this.getConnector(), null, "connectors", null, 0, -1, ArchitecturalStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(questionAnnotationsEClass, QuestionAnnotations.class, "QuestionAnnotations", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(patternEClass, Pattern.class, "Pattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPattern_Repository(), this.getPatternCatalogue(), this.getPatternCatalogue_Patterns(), "repository", null, 1, 1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_Categories(), this.getCategory(), null, "categories", null, 0, -1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_Domain(), this.getDomainType(), null, "domain", null, 0, -1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_HasVariants(), this.getPatternVariant(), this.getPatternVariant_BasePattern(), "hasVariants", null, 0, -1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainTypeEClass, DomainType.class, "DomainType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propertyEClass, Property.class, "Property", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProperty_Terms(), theGlossaryPackage.getGlossaryTerm(), null, "terms", null, 0, -1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qualityInfluenceEClass, QualityInfluence.class, "QualityInfluence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(patternCatalogueEClass, PatternCatalogue.class, "PatternCatalogue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPatternCatalogue_Patterns(), this.getPattern(), this.getPattern_Repository(), "patterns", null, 0, -1, PatternCatalogue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatternCatalogue_Domains(), this.getDomainType(), null, "domains", null, 0, -1, PatternCatalogue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatternCatalogue_Categories(), this.getCategory(), null, "categories", null, 0, -1, PatternCatalogue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatternCatalogue_Infrastructuretype(), this.getInfrastructureType(), null, "infrastructuretype", null, 0, -1, PatternCatalogue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(infrastructureTypeEClass, InfrastructureType.class, "InfrastructureType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInfrastructureType_Name(), ecorePackage.getEString(), "name", null, 0, 1, InfrastructureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInfrastructureType_Description(), ecorePackage.getEString(), "description", null, 0, 1, InfrastructureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectorEClass, Connector.class, "Connector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnector_ConnectorTo(), this.getRole(), null, "connectorTo", null, 1, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_ConnectorFrom(), this.getRole(), null, "connectorFrom", null, 1, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_Description(), ecorePackage.getEString(), "description", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(drawbackEClass, Drawback.class, "Drawback", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDrawback_Drawback(), ecorePackage.getEString(), "Drawback", null, 1, 1, Drawback.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keywordEClass, Keyword.class, "Keyword", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyword_Keyword(), ecorePackage.getEString(), "keyword", null, 1, 1, Keyword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(goalEClass, Goal.class, "Goal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGoal_Description(), ecorePackage.getEString(), "description", null, 1, 1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PatternsPackageImpl
