/**
 */
package pcmusagemodeladapter;

import edu.kit.ipd.sdq.toometa.requirements.UsageModelAdapter;

import org.palladiosimulator.pcm.usagemodel.UsageModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCM Usage Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcmusagemodeladapter.PCMUsageModel#getPcmUsageModel <em>Pcm Usage Model</em>}</li>
 * </ul>
 *
 * @see pcmusagemodeladapter.PcmusagemodeladapterPackage#getPCMUsageModel()
 * @model
 * @generated
 */
public interface PCMUsageModel extends UsageModelAdapter {
	/**
	 * Returns the value of the '<em><b>Pcm Usage Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pcm Usage Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pcm Usage Model</em>' reference.
	 * @see #setPcmUsageModel(UsageModel)
	 * @see pcmusagemodeladapter.PcmusagemodeladapterPackage#getPCMUsageModel_PcmUsageModel()
	 * @model required="true"
	 * @generated
	 */
	UsageModel getPcmUsageModel();

	/**
	 * Sets the value of the '{@link pcmusagemodeladapter.PCMUsageModel#getPcmUsageModel <em>Pcm Usage Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pcm Usage Model</em>' reference.
	 * @see #getPcmUsageModel()
	 * @generated
	 */
	void setPcmUsageModel(UsageModel value);

} // PCMUsageModel
