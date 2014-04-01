/**
 */
package group11survey.impl;

import group11survey.Answer;
import group11survey.Content;
import group11survey.Group11surveyPackage;
import group11survey.Question;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Answer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link group11survey.impl.AnswerImpl#getContent <em>Content</em>}</li>
 *   <li>{@link group11survey.impl.AnswerImpl#getFollowup <em>Followup</em>}</li>
 *   <li>{@link group11survey.impl.AnswerImpl#getIsFreeText <em>Is Free Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnswerImpl extends MinimalEObjectImpl.Container implements Answer {
	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected Content content;

	/**
	 * The cached value of the '{@link #getFollowup() <em>Followup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollowup()
	 * @generated
	 * @ordered
	 */
	protected Question followup;

	/**
	 * The default value of the '{@link #getIsFreeText() <em>Is Free Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsFreeText()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_FREE_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsFreeText() <em>Is Free Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsFreeText()
	 * @generated
	 * @ordered
	 */
	protected String isFreeText = IS_FREE_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnswerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Group11surveyPackage.Literals.ANSWER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Content getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContent(Content newContent, NotificationChain msgs) {
		Content oldContent = content;
		content = newContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Group11surveyPackage.ANSWER__CONTENT, oldContent, newContent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(Content newContent) {
		if (newContent != content) {
			NotificationChain msgs = null;
			if (content != null)
				msgs = ((InternalEObject)content).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Group11surveyPackage.ANSWER__CONTENT, null, msgs);
			if (newContent != null)
				msgs = ((InternalEObject)newContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Group11surveyPackage.ANSWER__CONTENT, null, msgs);
			msgs = basicSetContent(newContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Group11surveyPackage.ANSWER__CONTENT, newContent, newContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Question getFollowup() {
		return followup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFollowup(Question newFollowup, NotificationChain msgs) {
		Question oldFollowup = followup;
		followup = newFollowup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Group11surveyPackage.ANSWER__FOLLOWUP, oldFollowup, newFollowup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFollowup(Question newFollowup) {
		if (newFollowup != followup) {
			NotificationChain msgs = null;
			if (followup != null)
				msgs = ((InternalEObject)followup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Group11surveyPackage.ANSWER__FOLLOWUP, null, msgs);
			if (newFollowup != null)
				msgs = ((InternalEObject)newFollowup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Group11surveyPackage.ANSWER__FOLLOWUP, null, msgs);
			msgs = basicSetFollowup(newFollowup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Group11surveyPackage.ANSWER__FOLLOWUP, newFollowup, newFollowup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsFreeText() {
		return isFreeText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFreeText(String newIsFreeText) {
		String oldIsFreeText = isFreeText;
		isFreeText = newIsFreeText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Group11surveyPackage.ANSWER__IS_FREE_TEXT, oldIsFreeText, isFreeText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Group11surveyPackage.ANSWER__CONTENT:
				return basicSetContent(null, msgs);
			case Group11surveyPackage.ANSWER__FOLLOWUP:
				return basicSetFollowup(null, msgs);
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
			case Group11surveyPackage.ANSWER__CONTENT:
				return getContent();
			case Group11surveyPackage.ANSWER__FOLLOWUP:
				return getFollowup();
			case Group11surveyPackage.ANSWER__IS_FREE_TEXT:
				return getIsFreeText();
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
			case Group11surveyPackage.ANSWER__CONTENT:
				setContent((Content)newValue);
				return;
			case Group11surveyPackage.ANSWER__FOLLOWUP:
				setFollowup((Question)newValue);
				return;
			case Group11surveyPackage.ANSWER__IS_FREE_TEXT:
				setIsFreeText((String)newValue);
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
			case Group11surveyPackage.ANSWER__CONTENT:
				setContent((Content)null);
				return;
			case Group11surveyPackage.ANSWER__FOLLOWUP:
				setFollowup((Question)null);
				return;
			case Group11surveyPackage.ANSWER__IS_FREE_TEXT:
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
			case Group11surveyPackage.ANSWER__CONTENT:
				return content != null;
			case Group11surveyPackage.ANSWER__FOLLOWUP:
				return followup != null;
			case Group11surveyPackage.ANSWER__IS_FREE_TEXT:
				return IS_FREE_TEXT_EDEFAULT == null ? isFreeText != null : !IS_FREE_TEXT_EDEFAULT.equals(isFreeText);
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

} //AnswerImpl
