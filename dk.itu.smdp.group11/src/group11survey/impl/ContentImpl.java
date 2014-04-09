/**
 */
package group11survey.impl;

import group11survey.Content;
import group11survey.Group11surveyPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link group11survey.impl.ContentImpl#getBody <em>Body</em>}</li>
 *   <li>{@link group11survey.impl.ContentImpl#isIsFreeText <em>Is Free Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContentImpl extends MinimalEObjectImpl.Container implements Content {
	/**
	 * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected String body = BODY_EDEFAULT;

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
	protected ContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Group11surveyPackage.Literals.CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(String newBody) {
		String oldBody = body;
		body = newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Group11surveyPackage.CONTENT__BODY, oldBody, body));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Group11surveyPackage.CONTENT__IS_FREE_TEXT, oldIsFreeText, isFreeText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Group11surveyPackage.CONTENT__BODY:
				return getBody();
			case Group11surveyPackage.CONTENT__IS_FREE_TEXT:
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
			case Group11surveyPackage.CONTENT__BODY:
				setBody((String)newValue);
				return;
			case Group11surveyPackage.CONTENT__IS_FREE_TEXT:
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
			case Group11surveyPackage.CONTENT__BODY:
				setBody(BODY_EDEFAULT);
				return;
			case Group11surveyPackage.CONTENT__IS_FREE_TEXT:
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
			case Group11surveyPackage.CONTENT__BODY:
				return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
			case Group11surveyPackage.CONTENT__IS_FREE_TEXT:
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
		result.append(" (body: ");
		result.append(body);
		result.append(", isFreeText: ");
		result.append(isFreeText);
		result.append(')');
		return result.toString();
	}

} //ContentImpl
