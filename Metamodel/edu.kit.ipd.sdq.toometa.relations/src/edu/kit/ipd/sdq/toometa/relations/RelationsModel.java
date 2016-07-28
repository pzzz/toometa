/**
 */
package edu.kit.ipd.sdq.toometa.relations;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.relations.RelationsModel#getRelationTypes <em>Relation Types</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.relations.RelationsModel#getRelations <em>Relations</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.toometa.relations.RelationsPackage#getRelationsModel()
 * @model
 * @generated
 */
public interface RelationsModel extends Identifier {
	/**
	 * Returns the value of the '<em><b>Relation Types</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.relations.RelationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation Types</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.toometa.relations.RelationsPackage#getRelationsModel_RelationTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelationType> getRelationTypes();

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.toometa.relations.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' reference list.
	 * @see edu.kit.ipd.sdq.toometa.relations.RelationsPackage#getRelationsModel_Relations()
	 * @model
	 * @generated
	 */
	EList<Relation> getRelations();

} // RelationsModel
