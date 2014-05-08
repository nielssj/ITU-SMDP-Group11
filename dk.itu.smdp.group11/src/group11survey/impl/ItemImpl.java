/**
 */
package group11survey.impl;

import group11survey.Group11surveyPackage;
import group11survey.Item;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link group11survey.impl.ItemImpl#isIsFreeText <em>Is Free Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItemImpl extends ContentImpl implements Item {
	/**
	 * The default value of the '{@link #isIsFreeText() <em>Is Free Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFreeText()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FREE_TEXT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsFreeText() <em>Is Free Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFreeText()
	 * @generated
	 * @ordered
	 */
	protected boolean isFreeText = IS_FREE_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Group11surveyPackage.Literals.ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsFreeText() {
		return isFreeText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFreeText(boolean newIsFreeText) {
		boolean oldIsFreeText = isFreeText;
		isFreeText = newIsFreeText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Group11surveyPackage.ITEM__IS_FREE_TEXT, oldIsFreeText, isFreeText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Group11surveyPackage.ITEM__IS_FREE_TEXT:
				return isIsFreeText();
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
			case Group11surveyPackage.ITEM__IS_FREE_TEXT:
				setIsFreeText((Boolean)newValue);
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
			case Group11surveyPackage.ITEM__IS_FREE_TEXT:
				setIsFreeText(IS_FREE_TEXT_EDEFAULT);
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
			case Group11surveyPackage.ITEM__IS_FREE_TEXT:
				return isFreeText != IS_FREE_TEXT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isFreeText: ");
		result.append(isFreeText);
		result.append(')');
		return result.toString();
	}

} //ItemImpl
