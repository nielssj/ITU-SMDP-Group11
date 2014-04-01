/**
 */
package group11survey.impl;

import group11survey.Answer;
import group11survey.Content;
import group11survey.Group11surveyPackage;
import group11survey.Question;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Answer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link group11survey.impl.AnswerImpl#getContent <em>Content</em>}</li>
 *   <li>{@link group11survey.impl.AnswerImpl#getFollowup <em>Followup</em>}</li>
 *   <li>{@link group11survey.impl.AnswerImpl#isIsFreeText <em>Is Free Text</em>}</li>
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
	 * The cached value of the '{@link #getFollowup() <em>Followup</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollowup()
	 * @generated
	 * @ordered
	 */
	protected EList<Question> followup;

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
	public EList<Question> getFollowup() {
		if (followup == null) {
			followup = new EObjectContainmentEList<Question>(Question.class, this, Group11surveyPackage.ANSWER__FOLLOWUP);
		}
		return followup;
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
				return ((InternalEList<?>)getFollowup()).basicRemove(otherEnd, msgs);
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
				return isIsFreeText();
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
			case Group11surveyPackage.ANSWER__CONTENT:
				setContent((Content)newValue);
				return;
			case Group11surveyPackage.ANSWER__FOLLOWUP:
				getFollowup().clear();
				getFollowup().addAll((Collection<? extends Question>)newValue);
				return;
			case Group11surveyPackage.ANSWER__IS_FREE_TEXT:
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
			case Group11surveyPackage.ANSWER__CONTENT:
				setContent((Content)null);
				return;
			case Group11surveyPackage.ANSWER__FOLLOWUP:
				getFollowup().clear();
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
				return followup != null && !followup.isEmpty();
			case Group11surveyPackage.ANSWER__IS_FREE_TEXT:
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

} //AnswerImpl
