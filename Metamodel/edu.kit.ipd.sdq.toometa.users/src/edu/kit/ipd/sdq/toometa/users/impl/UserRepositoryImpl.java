/**
 */
package edu.kit.ipd.sdq.toometa.users.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import edu.kit.ipd.sdq.toometa.users.RoleType;
import edu.kit.ipd.sdq.toometa.users.User;
import edu.kit.ipd.sdq.toometa.users.UserRepository;
import edu.kit.ipd.sdq.toometa.users.UsersPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.toometa.users.impl.UserRepositoryImpl#getUsers <em>Users</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.toometa.users.impl.UserRepositoryImpl#getRoleTypes <em>Role Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserRepositoryImpl extends IdentifierImpl implements UserRepository {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsersPackage.Literals.USER_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<User> getUsers() {
		return (EList<User>)eDynamicGet(UsersPackage.USER_REPOSITORY__USERS, UsersPackage.Literals.USER_REPOSITORY__USERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<RoleType> getRoleTypes() {
		return (EList<RoleType>)eDynamicGet(UsersPackage.USER_REPOSITORY__ROLE_TYPES, UsersPackage.Literals.USER_REPOSITORY__ROLE_TYPES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UsersPackage.USER_REPOSITORY__USERS:
				return ((InternalEList<?>)getUsers()).basicRemove(otherEnd, msgs);
			case UsersPackage.USER_REPOSITORY__ROLE_TYPES:
				return ((InternalEList<?>)getRoleTypes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UsersPackage.USER_REPOSITORY__USERS:
				return getUsers();
			case UsersPackage.USER_REPOSITORY__ROLE_TYPES:
				return getRoleTypes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UsersPackage.USER_REPOSITORY__USERS:
				getUsers().clear();
				getUsers().addAll((Collection<? extends User>)newValue);
				return;
			case UsersPackage.USER_REPOSITORY__ROLE_TYPES:
				getRoleTypes().clear();
				getRoleTypes().addAll((Collection<? extends RoleType>)newValue);
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
			case UsersPackage.USER_REPOSITORY__USERS:
				getUsers().clear();
				return;
			case UsersPackage.USER_REPOSITORY__ROLE_TYPES:
				getRoleTypes().clear();
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
			case UsersPackage.USER_REPOSITORY__USERS:
				return !getUsers().isEmpty();
			case UsersPackage.USER_REPOSITORY__ROLE_TYPES:
				return !getRoleTypes().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UserRepositoryImpl
