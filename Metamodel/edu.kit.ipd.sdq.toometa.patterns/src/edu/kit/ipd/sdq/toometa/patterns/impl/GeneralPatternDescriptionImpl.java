/**
 */
package edu.kit.ipd.sdq.toometa.patterns.impl;

import edu.kit.ipd.sdq.toometa.patterns.GeneralPatternDescription;
import edu.kit.ipd.sdq.toometa.patterns.PatternsPackage;
import edu.kit.ipd.sdq.toometa.patterns.Property;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>General Pattern Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.impl.GeneralPatternDescriptionImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.impl.GeneralPatternDescriptionImpl#getInformationSource <em>Information Source</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.impl.GeneralPatternDescriptionImpl#getShortDescription <em>Short Description</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.impl.GeneralPatternDescriptionImpl#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.patterns.impl.GeneralPatternDescriptionImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GeneralPatternDescriptionImpl extends CDOObjectImpl implements GeneralPatternDescription {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralPatternDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternsPackage.Literals.GENERAL_PATTERN_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
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

} //GeneralPatternDescriptionImpl
