/**
 */
package edu.kit.ipd.sdq.toometa.jiraissues.impl;

import edu.kit.ipd.sdq.toometa.jiraissues.Attachment;
import edu.kit.ipd.sdq.toometa.jiraissues.JiraissuesPackage;
import edu.kit.ipd.sdq.toometa.jiraissues.UserProxy;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attachment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.AttachmentImpl#getFilename <em>Filename</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.AttachmentImpl#getSize <em>Size</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.AttachmentImpl#getMimeType <em>Mime Type</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.AttachmentImpl#getContentUri <em>Content Uri</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.AttachmentImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.jiraissues.impl.AttachmentImpl#getAuthor <em>Author</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttachmentImpl extends AddressableElementImpl implements Attachment {
	/**
	 * The default value of the '{@link #getFilename() <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilename()
	 * @generated
	 * @ordered
	 */
	protected static final String FILENAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getMimeType() <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeType()
	 * @generated
	 * @ordered
	 */
	protected static final String MIME_TYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getContentUri() <em>Content Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentUri()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_URI_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATION_DATE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttachmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JiraissuesPackage.Literals.ATTACHMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilename() {
		return (String)eDynamicGet(JiraissuesPackage.ATTACHMENT__FILENAME, JiraissuesPackage.Literals.ATTACHMENT__FILENAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilename(String newFilename) {
		eDynamicSet(JiraissuesPackage.ATTACHMENT__FILENAME, JiraissuesPackage.Literals.ATTACHMENT__FILENAME, newFilename);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSize() {
		return (Integer)eDynamicGet(JiraissuesPackage.ATTACHMENT__SIZE, JiraissuesPackage.Literals.ATTACHMENT__SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(int newSize) {
		eDynamicSet(JiraissuesPackage.ATTACHMENT__SIZE, JiraissuesPackage.Literals.ATTACHMENT__SIZE, newSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMimeType() {
		return (String)eDynamicGet(JiraissuesPackage.ATTACHMENT__MIME_TYPE, JiraissuesPackage.Literals.ATTACHMENT__MIME_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMimeType(String newMimeType) {
		eDynamicSet(JiraissuesPackage.ATTACHMENT__MIME_TYPE, JiraissuesPackage.Literals.ATTACHMENT__MIME_TYPE, newMimeType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContentUri() {
		return (String)eDynamicGet(JiraissuesPackage.ATTACHMENT__CONTENT_URI, JiraissuesPackage.Literals.ATTACHMENT__CONTENT_URI, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentUri(String newContentUri) {
		eDynamicSet(JiraissuesPackage.ATTACHMENT__CONTENT_URI, JiraissuesPackage.Literals.ATTACHMENT__CONTENT_URI, newContentUri);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreationDate() {
		return (Date)eDynamicGet(JiraissuesPackage.ATTACHMENT__CREATION_DATE, JiraissuesPackage.Literals.ATTACHMENT__CREATION_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationDate(Date newCreationDate) {
		eDynamicSet(JiraissuesPackage.ATTACHMENT__CREATION_DATE, JiraissuesPackage.Literals.ATTACHMENT__CREATION_DATE, newCreationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserProxy getAuthor() {
		return (UserProxy)eDynamicGet(JiraissuesPackage.ATTACHMENT__AUTHOR, JiraissuesPackage.Literals.ATTACHMENT__AUTHOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserProxy basicGetAuthor() {
		return (UserProxy)eDynamicGet(JiraissuesPackage.ATTACHMENT__AUTHOR, JiraissuesPackage.Literals.ATTACHMENT__AUTHOR, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(UserProxy newAuthor) {
		eDynamicSet(JiraissuesPackage.ATTACHMENT__AUTHOR, JiraissuesPackage.Literals.ATTACHMENT__AUTHOR, newAuthor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JiraissuesPackage.ATTACHMENT__FILENAME:
				return getFilename();
			case JiraissuesPackage.ATTACHMENT__SIZE:
				return getSize();
			case JiraissuesPackage.ATTACHMENT__MIME_TYPE:
				return getMimeType();
			case JiraissuesPackage.ATTACHMENT__CONTENT_URI:
				return getContentUri();
			case JiraissuesPackage.ATTACHMENT__CREATION_DATE:
				return getCreationDate();
			case JiraissuesPackage.ATTACHMENT__AUTHOR:
				if (resolve) return getAuthor();
				return basicGetAuthor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JiraissuesPackage.ATTACHMENT__FILENAME:
				setFilename((String)newValue);
				return;
			case JiraissuesPackage.ATTACHMENT__SIZE:
				setSize((Integer)newValue);
				return;
			case JiraissuesPackage.ATTACHMENT__MIME_TYPE:
				setMimeType((String)newValue);
				return;
			case JiraissuesPackage.ATTACHMENT__CONTENT_URI:
				setContentUri((String)newValue);
				return;
			case JiraissuesPackage.ATTACHMENT__CREATION_DATE:
				setCreationDate((Date)newValue);
				return;
			case JiraissuesPackage.ATTACHMENT__AUTHOR:
				setAuthor((UserProxy)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JiraissuesPackage.ATTACHMENT__FILENAME:
				setFilename(FILENAME_EDEFAULT);
				return;
			case JiraissuesPackage.ATTACHMENT__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case JiraissuesPackage.ATTACHMENT__MIME_TYPE:
				setMimeType(MIME_TYPE_EDEFAULT);
				return;
			case JiraissuesPackage.ATTACHMENT__CONTENT_URI:
				setContentUri(CONTENT_URI_EDEFAULT);
				return;
			case JiraissuesPackage.ATTACHMENT__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case JiraissuesPackage.ATTACHMENT__AUTHOR:
				setAuthor((UserProxy)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JiraissuesPackage.ATTACHMENT__FILENAME:
				return FILENAME_EDEFAULT == null ? getFilename() != null : !FILENAME_EDEFAULT.equals(getFilename());
			case JiraissuesPackage.ATTACHMENT__SIZE:
				return getSize() != SIZE_EDEFAULT;
			case JiraissuesPackage.ATTACHMENT__MIME_TYPE:
				return MIME_TYPE_EDEFAULT == null ? getMimeType() != null : !MIME_TYPE_EDEFAULT.equals(getMimeType());
			case JiraissuesPackage.ATTACHMENT__CONTENT_URI:
				return CONTENT_URI_EDEFAULT == null ? getContentUri() != null : !CONTENT_URI_EDEFAULT.equals(getContentUri());
			case JiraissuesPackage.ATTACHMENT__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? getCreationDate() != null : !CREATION_DATE_EDEFAULT.equals(getCreationDate());
			case JiraissuesPackage.ATTACHMENT__AUTHOR:
				return basicGetAuthor() != null;
		}
		return super.eIsSet(featureID);
	}

} //AttachmentImpl
