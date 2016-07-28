/**
 */
package edu.kit.ipd.sdq.toometa.pcmarchoptions.util;

import de.uka.ipd.sdq.identifier.Identifier;

import edu.kit.ipd.sdq.toometa.archoptions.AllocateComponent;
import edu.kit.ipd.sdq.toometa.archoptions.AllocateNeverTogether;
import edu.kit.ipd.sdq.toometa.archoptions.AllocateTogether;
import edu.kit.ipd.sdq.toometa.archoptions.ArchOption;
import edu.kit.ipd.sdq.toometa.archoptions.AssembleComponent;
import edu.kit.ipd.sdq.toometa.archoptions.BanComponent;
import edu.kit.ipd.sdq.toometa.archoptions.ChangeDataType;
import edu.kit.ipd.sdq.toometa.archoptions.ChangeInterface;
import edu.kit.ipd.sdq.toometa.archoptions.ChangeRoles;
import edu.kit.ipd.sdq.toometa.archoptions.ComponentOption;
import edu.kit.ipd.sdq.toometa.archoptions.DataTypeOption;
import edu.kit.ipd.sdq.toometa.archoptions.DeploymentOption;
import edu.kit.ipd.sdq.toometa.archoptions.FunctionalityConnection;
import edu.kit.ipd.sdq.toometa.archoptions.InterfaceOption;
import edu.kit.ipd.sdq.toometa.archoptions.IntroduceNewAdapter;
import edu.kit.ipd.sdq.toometa.archoptions.IntroduceNewComponent;
import edu.kit.ipd.sdq.toometa.archoptions.IntroduceNewDataType;
import edu.kit.ipd.sdq.toometa.archoptions.IntroduceNewInterface;
import edu.kit.ipd.sdq.toometa.archoptions.MergeComponents;
import edu.kit.ipd.sdq.toometa.archoptions.MoveComponents;
import edu.kit.ipd.sdq.toometa.archoptions.MultipleAllocation;
import edu.kit.ipd.sdq.toometa.archoptions.MultipleInstantiation;
import edu.kit.ipd.sdq.toometa.archoptions.NeverAllocateToSpecificNodes;
import edu.kit.ipd.sdq.toometa.archoptions.OnlySingleAllocation;
import edu.kit.ipd.sdq.toometa.archoptions.OnlySingleInstantiation;
import edu.kit.ipd.sdq.toometa.archoptions.ProvidedFunctionality;
import edu.kit.ipd.sdq.toometa.archoptions.RemoveDataType;
import edu.kit.ipd.sdq.toometa.archoptions.RemoveInterface;
import edu.kit.ipd.sdq.toometa.archoptions.ReplaceComponents;
import edu.kit.ipd.sdq.toometa.archoptions.RequiredFunctionality;
import edu.kit.ipd.sdq.toometa.archoptions.ReuseComponent;
import edu.kit.ipd.sdq.toometa.archoptions.SplitComponent;

import edu.kit.ipd.sdq.toometa.options.Option;

import edu.kit.ipd.sdq.toometa.pcmarchoptions.*;

import edu.kit.ipd.sdq.toometa.relations.AlternativeObject;
import edu.kit.ipd.sdq.toometa.relations.ConflictObject;
import edu.kit.ipd.sdq.toometa.relations.CouldResolveObject;
import edu.kit.ipd.sdq.toometa.relations.DependencyObject;
import edu.kit.ipd.sdq.toometa.relations.DuplicationObject;
import edu.kit.ipd.sdq.toometa.relations.ParentalObject;
import edu.kit.ipd.sdq.toometa.relations.RelationObject;
import edu.kit.ipd.sdq.toometa.relations.ResolveObject;
import edu.kit.ipd.sdq.toometa.relations.SelectionObject;
import edu.kit.ipd.sdq.toometa.relations.StakeholderObject;
import edu.kit.ipd.sdq.toometa.relations.TraceableObject;
import edu.kit.ipd.sdq.toometa.relations.TriggerObject;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.toometa.pcmarchoptions.PcmarchoptionsPackage
 * @generated
 */
public class PcmarchoptionsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PcmarchoptionsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PcmarchoptionsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PcmarchoptionsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PcmarchoptionsSwitch<Adapter> modelSwitch =
		new PcmarchoptionsSwitch<Adapter>() {
			@Override
			public Adapter casePCM_SplitComponent(PCM_SplitComponent object) {
				return createPCM_SplitComponentAdapter();
			}
			@Override
			public Adapter casePCM_AllocateTogether(PCM_AllocateTogether object) {
				return createPCM_AllocateTogetherAdapter();
			}
			@Override
			public Adapter casePCM_NeverAllocateToSpecificNodes(PCM_NeverAllocateToSpecificNodes object) {
				return createPCM_NeverAllocateToSpecificNodesAdapter();
			}
			@Override
			public Adapter casePCM_IntroduceNewAdapter(PCM_IntroduceNewAdapter object) {
				return createPCM_IntroduceNewAdapterAdapter();
			}
			@Override
			public Adapter casePCM_IntroduceNewComponent(PCM_IntroduceNewComponent object) {
				return createPCM_IntroduceNewComponentAdapter();
			}
			@Override
			public Adapter casePCM_MoveComponents(PCM_MoveComponents object) {
				return createPCM_MoveComponentsAdapter();
			}
			@Override
			public Adapter casePCM_OnlySingleInstantiation(PCM_OnlySingleInstantiation object) {
				return createPCM_OnlySingleInstantiationAdapter();
			}
			@Override
			public Adapter casePCM_ChangeRoles(PCM_ChangeRoles object) {
				return createPCM_ChangeRolesAdapter();
			}
			@Override
			public Adapter casePCM_AllocateNeverTogether(PCM_AllocateNeverTogether object) {
				return createPCM_AllocateNeverTogetherAdapter();
			}
			@Override
			public Adapter casePCM_MultipleInstantiation(PCM_MultipleInstantiation object) {
				return createPCM_MultipleInstantiationAdapter();
			}
			@Override
			public Adapter casePCM_BanComponent(PCM_BanComponent object) {
				return createPCM_BanComponentAdapter();
			}
			@Override
			public Adapter casePCM_MultipleAllocation(PCM_MultipleAllocation object) {
				return createPCM_MultipleAllocationAdapter();
			}
			@Override
			public Adapter casePCM_ProvidedFunctionality(PCM_ProvidedFunctionality object) {
				return createPCM_ProvidedFunctionalityAdapter();
			}
			@Override
			public Adapter casePCM_ReplaceComponents(PCM_ReplaceComponents object) {
				return createPCM_ReplaceComponentsAdapter();
			}
			@Override
			public Adapter casePCM_ReuseComponent(PCM_ReuseComponent object) {
				return createPCM_ReuseComponentAdapter();
			}
			@Override
			public Adapter casePCM_FunctionalityConnection(PCM_FunctionalityConnection object) {
				return createPCM_FunctionalityConnectionAdapter();
			}
			@Override
			public Adapter casePCM_MergeComponents(PCM_MergeComponents object) {
				return createPCM_MergeComponentsAdapter();
			}
			@Override
			public Adapter casePCM_OnlySingleAllocation(PCM_OnlySingleAllocation object) {
				return createPCM_OnlySingleAllocationAdapter();
			}
			@Override
			public Adapter casePCM_RequiredFunctionality(PCM_RequiredFunctionality object) {
				return createPCM_RequiredFunctionalityAdapter();
			}
			@Override
			public Adapter casePCM_ChangeDataType(PCM_ChangeDataType object) {
				return createPCM_ChangeDataTypeAdapter();
			}
			@Override
			public Adapter casePCM_IntroduceNewDataType(PCM_IntroduceNewDataType object) {
				return createPCM_IntroduceNewDataTypeAdapter();
			}
			@Override
			public Adapter casePCM_RemoveDataType(PCM_RemoveDataType object) {
				return createPCM_RemoveDataTypeAdapter();
			}
			@Override
			public Adapter casePCM_IntroduceNewInterface(PCM_IntroduceNewInterface object) {
				return createPCM_IntroduceNewInterfaceAdapter();
			}
			@Override
			public Adapter casePCM_ChangeInterface(PCM_ChangeInterface object) {
				return createPCM_ChangeInterfaceAdapter();
			}
			@Override
			public Adapter casePCM_RemoveInterface(PCM_RemoveInterface object) {
				return createPCM_RemoveInterfaceAdapter();
			}
			@Override
			public Adapter casePCM_AllocateComponent(PCM_AllocateComponent object) {
				return createPCM_AllocateComponentAdapter();
			}
			@Override
			public Adapter casePCM_AssembleComponent(PCM_AssembleComponent object) {
				return createPCM_AssembleComponentAdapter();
			}
			@Override
			public Adapter caseIdentifier(Identifier object) {
				return createIdentifierAdapter();
			}
			@Override
			public Adapter caseRelationObject(RelationObject object) {
				return createRelationObjectAdapter();
			}
			@Override
			public Adapter caseConflictObject(ConflictObject object) {
				return createConflictObjectAdapter();
			}
			@Override
			public Adapter caseDuplicationObject(DuplicationObject object) {
				return createDuplicationObjectAdapter();
			}
			@Override
			public Adapter caseDependencyObject(DependencyObject object) {
				return createDependencyObjectAdapter();
			}
			@Override
			public Adapter caseParentalObject(ParentalObject object) {
				return createParentalObjectAdapter();
			}
			@Override
			public Adapter caseTriggerObject(TriggerObject object) {
				return createTriggerObjectAdapter();
			}
			@Override
			public Adapter caseResolveObject(ResolveObject object) {
				return createResolveObjectAdapter();
			}
			@Override
			public Adapter caseAlternativeObject(AlternativeObject object) {
				return createAlternativeObjectAdapter();
			}
			@Override
			public Adapter caseCouldResolveObject(CouldResolveObject object) {
				return createCouldResolveObjectAdapter();
			}
			@Override
			public Adapter caseStakeholderObject(StakeholderObject object) {
				return createStakeholderObjectAdapter();
			}
			@Override
			public Adapter caseSelectionObject(SelectionObject object) {
				return createSelectionObjectAdapter();
			}
			@Override
			public Adapter caseTraceableObject(TraceableObject object) {
				return createTraceableObjectAdapter();
			}
			@Override
			public Adapter caseOption(Option object) {
				return createOptionAdapter();
			}
			@Override
			public Adapter caseArchOption(ArchOption object) {
				return createArchOptionAdapter();
			}
			@Override
			public Adapter caseComponentOption(ComponentOption object) {
				return createComponentOptionAdapter();
			}
			@Override
			public Adapter caseSplitComponent(SplitComponent object) {
				return createSplitComponentAdapter();
			}
			@Override
			public Adapter caseDeploymentOption(DeploymentOption object) {
				return createDeploymentOptionAdapter();
			}
			@Override
			public Adapter caseAllocateTogether(AllocateTogether object) {
				return createAllocateTogetherAdapter();
			}
			@Override
			public Adapter caseNeverAllocateToSpecificNodes(NeverAllocateToSpecificNodes object) {
				return createNeverAllocateToSpecificNodesAdapter();
			}
			@Override
			public Adapter caseIntroduceNewAdapter(IntroduceNewAdapter object) {
				return createIntroduceNewAdapterAdapter();
			}
			@Override
			public Adapter caseIntroduceNewComponent(IntroduceNewComponent object) {
				return createIntroduceNewComponentAdapter();
			}
			@Override
			public Adapter caseMoveComponents(MoveComponents object) {
				return createMoveComponentsAdapter();
			}
			@Override
			public Adapter caseOnlySingleInstantiation(OnlySingleInstantiation object) {
				return createOnlySingleInstantiationAdapter();
			}
			@Override
			public Adapter caseChangeRoles(ChangeRoles object) {
				return createChangeRolesAdapter();
			}
			@Override
			public Adapter caseAllocateNeverTogether(AllocateNeverTogether object) {
				return createAllocateNeverTogetherAdapter();
			}
			@Override
			public Adapter caseMultipleInstantiation(MultipleInstantiation object) {
				return createMultipleInstantiationAdapter();
			}
			@Override
			public Adapter caseBanComponent(BanComponent object) {
				return createBanComponentAdapter();
			}
			@Override
			public Adapter caseMultipleAllocation(MultipleAllocation object) {
				return createMultipleAllocationAdapter();
			}
			@Override
			public Adapter caseProvidedFunctionality(ProvidedFunctionality object) {
				return createProvidedFunctionalityAdapter();
			}
			@Override
			public Adapter caseReplaceComponents(ReplaceComponents object) {
				return createReplaceComponentsAdapter();
			}
			@Override
			public Adapter caseReuseComponent(ReuseComponent object) {
				return createReuseComponentAdapter();
			}
			@Override
			public Adapter caseFunctionalityConnection(FunctionalityConnection object) {
				return createFunctionalityConnectionAdapter();
			}
			@Override
			public Adapter caseMergeComponents(MergeComponents object) {
				return createMergeComponentsAdapter();
			}
			@Override
			public Adapter caseOnlySingleAllocation(OnlySingleAllocation object) {
				return createOnlySingleAllocationAdapter();
			}
			@Override
			public Adapter caseRequiredFunctionality(RequiredFunctionality object) {
				return createRequiredFunctionalityAdapter();
			}
			@Override
			public Adapter caseDataTypeOption(DataTypeOption object) {
				return createDataTypeOptionAdapter();
			}
			@Override
			public Adapter caseChangeDataType(ChangeDataType object) {
				return createChangeDataTypeAdapter();
			}
			@Override
			public Adapter caseIntroduceNewDataType(IntroduceNewDataType object) {
				return createIntroduceNewDataTypeAdapter();
			}
			@Override
			public Adapter caseRemoveDataType(RemoveDataType object) {
				return createRemoveDataTypeAdapter();
			}
			@Override
			public Adapter caseInterfaceOption(InterfaceOption object) {
				return createInterfaceOptionAdapter();
			}
			@Override
			public Adapter caseIntroduceNewInterface(IntroduceNewInterface object) {
				return createIntroduceNewInterfaceAdapter();
			}
			@Override
			public Adapter caseChangeInterface(ChangeInterface object) {
				return createChangeInterfaceAdapter();
			}
			@Override
			public Adapter caseRemoveInterface(RemoveInterface object) {
				return createRemoveInterfaceAdapter();
			}
			@Override
			public Adapter caseAllocateComponent(AllocateComponent object) {
				return createAllocateComponentAdapter();
			}
			@Override
			public Adapter caseAssembleComponent(AssembleComponent object) {
				return createAssembleComponentAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_SplitComponent <em>PCM Split Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_SplitComponent
	 * @generated
	 */
	public Adapter createPCM_SplitComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_AllocateTogether <em>PCM Allocate Together</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_AllocateTogether
	 * @generated
	 */
	public Adapter createPCM_AllocateTogetherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_NeverAllocateToSpecificNodes <em>PCM Never Allocate To Specific Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_NeverAllocateToSpecificNodes
	 * @generated
	 */
	public Adapter createPCM_NeverAllocateToSpecificNodesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_IntroduceNewAdapter <em>PCM Introduce New Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_IntroduceNewAdapter
	 * @generated
	 */
	public Adapter createPCM_IntroduceNewAdapterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_IntroduceNewComponent <em>PCM Introduce New Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_IntroduceNewComponent
	 * @generated
	 */
	public Adapter createPCM_IntroduceNewComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_MoveComponents <em>PCM Move Components</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_MoveComponents
	 * @generated
	 */
	public Adapter createPCM_MoveComponentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_OnlySingleInstantiation <em>PCM Only Single Instantiation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_OnlySingleInstantiation
	 * @generated
	 */
	public Adapter createPCM_OnlySingleInstantiationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_ChangeRoles <em>PCM Change Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_ChangeRoles
	 * @generated
	 */
	public Adapter createPCM_ChangeRolesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_AllocateNeverTogether <em>PCM Allocate Never Together</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_AllocateNeverTogether
	 * @generated
	 */
	public Adapter createPCM_AllocateNeverTogetherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_MultipleInstantiation <em>PCM Multiple Instantiation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_MultipleInstantiation
	 * @generated
	 */
	public Adapter createPCM_MultipleInstantiationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_BanComponent <em>PCM Ban Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_BanComponent
	 * @generated
	 */
	public Adapter createPCM_BanComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_MultipleAllocation <em>PCM Multiple Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_MultipleAllocation
	 * @generated
	 */
	public Adapter createPCM_MultipleAllocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_ProvidedFunctionality <em>PCM Provided Functionality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_ProvidedFunctionality
	 * @generated
	 */
	public Adapter createPCM_ProvidedFunctionalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_ReplaceComponents <em>PCM Replace Components</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_ReplaceComponents
	 * @generated
	 */
	public Adapter createPCM_ReplaceComponentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_ReuseComponent <em>PCM Reuse Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_ReuseComponent
	 * @generated
	 */
	public Adapter createPCM_ReuseComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_FunctionalityConnection <em>PCM Functionality Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_FunctionalityConnection
	 * @generated
	 */
	public Adapter createPCM_FunctionalityConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_MergeComponents <em>PCM Merge Components</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_MergeComponents
	 * @generated
	 */
	public Adapter createPCM_MergeComponentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_OnlySingleAllocation <em>PCM Only Single Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_OnlySingleAllocation
	 * @generated
	 */
	public Adapter createPCM_OnlySingleAllocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_RequiredFunctionality <em>PCM Required Functionality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_RequiredFunctionality
	 * @generated
	 */
	public Adapter createPCM_RequiredFunctionalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_ChangeDataType <em>PCM Change Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_ChangeDataType
	 * @generated
	 */
	public Adapter createPCM_ChangeDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_IntroduceNewDataType <em>PCM Introduce New Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_IntroduceNewDataType
	 * @generated
	 */
	public Adapter createPCM_IntroduceNewDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_RemoveDataType <em>PCM Remove Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_RemoveDataType
	 * @generated
	 */
	public Adapter createPCM_RemoveDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_IntroduceNewInterface <em>PCM Introduce New Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_IntroduceNewInterface
	 * @generated
	 */
	public Adapter createPCM_IntroduceNewInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_ChangeInterface <em>PCM Change Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_ChangeInterface
	 * @generated
	 */
	public Adapter createPCM_ChangeInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_RemoveInterface <em>PCM Remove Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_RemoveInterface
	 * @generated
	 */
	public Adapter createPCM_RemoveInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_AllocateComponent <em>PCM Allocate Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_AllocateComponent
	 * @generated
	 */
	public Adapter createPCM_AllocateComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_AssembleComponent <em>PCM Assemble Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.pcmarchoptions.PCM_AssembleComponent
	 * @generated
	 */
	public Adapter createPCM_AssembleComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.identifier.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.identifier.Identifier
	 * @generated
	 */
	public Adapter createIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.relations.RelationObject <em>Relation Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.relations.RelationObject
	 * @generated
	 */
	public Adapter createRelationObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.relations.ConflictObject <em>Conflict Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.relations.ConflictObject
	 * @generated
	 */
	public Adapter createConflictObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.relations.DuplicationObject <em>Duplication Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.relations.DuplicationObject
	 * @generated
	 */
	public Adapter createDuplicationObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.relations.DependencyObject <em>Dependency Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.relations.DependencyObject
	 * @generated
	 */
	public Adapter createDependencyObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.relations.ParentalObject <em>Parental Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.relations.ParentalObject
	 * @generated
	 */
	public Adapter createParentalObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.relations.TriggerObject <em>Trigger Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.relations.TriggerObject
	 * @generated
	 */
	public Adapter createTriggerObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.relations.ResolveObject <em>Resolve Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.relations.ResolveObject
	 * @generated
	 */
	public Adapter createResolveObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.relations.AlternativeObject <em>Alternative Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.relations.AlternativeObject
	 * @generated
	 */
	public Adapter createAlternativeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.relations.CouldResolveObject <em>Could Resolve Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.relations.CouldResolveObject
	 * @generated
	 */
	public Adapter createCouldResolveObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.relations.StakeholderObject <em>Stakeholder Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.relations.StakeholderObject
	 * @generated
	 */
	public Adapter createStakeholderObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.relations.SelectionObject <em>Selection Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.relations.SelectionObject
	 * @generated
	 */
	public Adapter createSelectionObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.relations.TraceableObject <em>Traceable Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.relations.TraceableObject
	 * @generated
	 */
	public Adapter createTraceableObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.options.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.options.Option
	 * @generated
	 */
	public Adapter createOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.archoptions.ArchOption <em>Arch Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.ArchOption
	 * @generated
	 */
	public Adapter createArchOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.archoptions.ComponentOption <em>Component Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.ComponentOption
	 * @generated
	 */
	public Adapter createComponentOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.archoptions.SplitComponent <em>Split Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.SplitComponent
	 * @generated
	 */
	public Adapter createSplitComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.archoptions.DeploymentOption <em>Deployment Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.DeploymentOption
	 * @generated
	 */
	public Adapter createDeploymentOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.archoptions.AllocateTogether <em>Allocate Together</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.AllocateTogether
	 * @generated
	 */
	public Adapter createAllocateTogetherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.archoptions.NeverAllocateToSpecificNodes <em>Never Allocate To Specific Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.NeverAllocateToSpecificNodes
	 * @generated
	 */
	public Adapter createNeverAllocateToSpecificNodesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.archoptions.IntroduceNewAdapter <em>Introduce New Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.IntroduceNewAdapter
	 * @generated
	 */
	public Adapter createIntroduceNewAdapterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.archoptions.IntroduceNewComponent <em>Introduce New Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.IntroduceNewComponent
	 * @generated
	 */
	public Adapter createIntroduceNewComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.archoptions.MoveComponents <em>Move Components</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.MoveComponents
	 * @generated
	 */
	public Adapter createMoveComponentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.archoptions.OnlySingleInstantiation <em>Only Single Instantiation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.OnlySingleInstantiation
	 * @generated
	 */
	public Adapter createOnlySingleInstantiationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.archoptions.ChangeRoles <em>Change Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.ChangeRoles
	 * @generated
	 */
	public Adapter createChangeRolesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.archoptions.AllocateNeverTogether <em>Allocate Never Together</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.AllocateNeverTogether
	 * @generated
	 */
	public Adapter createAllocateNeverTogetherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.archoptions.MultipleInstantiation <em>Multiple Instantiation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.MultipleInstantiation
	 * @generated
	 */
	public Adapter createMultipleInstantiationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.archoptions.BanComponent <em>Ban Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.BanComponent
	 * @generated
	 */
	public Adapter createBanComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.archoptions.MultipleAllocation <em>Multiple Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.MultipleAllocation
	 * @generated
	 */
	public Adapter createMultipleAllocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.archoptions.ProvidedFunctionality <em>Provided Functionality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.ProvidedFunctionality
	 * @generated
	 */
	public Adapter createProvidedFunctionalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.archoptions.ReplaceComponents <em>Replace Components</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.ReplaceComponents
	 * @generated
	 */
	public Adapter createReplaceComponentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.archoptions.ReuseComponent <em>Reuse Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.ReuseComponent
	 * @generated
	 */
	public Adapter createReuseComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.archoptions.FunctionalityConnection <em>Functionality Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.FunctionalityConnection
	 * @generated
	 */
	public Adapter createFunctionalityConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.archoptions.MergeComponents <em>Merge Components</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.MergeComponents
	 * @generated
	 */
	public Adapter createMergeComponentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.archoptions.OnlySingleAllocation <em>Only Single Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.OnlySingleAllocation
	 * @generated
	 */
	public Adapter createOnlySingleAllocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.archoptions.RequiredFunctionality <em>Required Functionality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.RequiredFunctionality
	 * @generated
	 */
	public Adapter createRequiredFunctionalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.archoptions.DataTypeOption <em>Data Type Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.DataTypeOption
	 * @generated
	 */
	public Adapter createDataTypeOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.archoptions.ChangeDataType <em>Change Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.ChangeDataType
	 * @generated
	 */
	public Adapter createChangeDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.archoptions.IntroduceNewDataType <em>Introduce New Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.IntroduceNewDataType
	 * @generated
	 */
	public Adapter createIntroduceNewDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.archoptions.RemoveDataType <em>Remove Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.RemoveDataType
	 * @generated
	 */
	public Adapter createRemoveDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.archoptions.InterfaceOption <em>Interface Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.InterfaceOption
	 * @generated
	 */
	public Adapter createInterfaceOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.archoptions.IntroduceNewInterface <em>Introduce New Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.IntroduceNewInterface
	 * @generated
	 */
	public Adapter createIntroduceNewInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.archoptions.ChangeInterface <em>Change Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.ChangeInterface
	 * @generated
	 */
	public Adapter createChangeInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.archoptions.RemoveInterface <em>Remove Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.RemoveInterface
	 * @generated
	 */
	public Adapter createRemoveInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.archoptions.AllocateComponent <em>Allocate Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.AllocateComponent
	 * @generated
	 */
	public Adapter createAllocateComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.toometa.archoptions.AssembleComponent <em>Assemble Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.toometa.archoptions.AssembleComponent
	 * @generated
	 */
	public Adapter createAssembleComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PcmarchoptionsAdapterFactory
