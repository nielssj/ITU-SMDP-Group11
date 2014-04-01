/**
 */
package group11survey.impl;

import group11survey.Content;
import group11survey.Group11surveyPackage;
import group11survey.Question;
import group11survey.Survey;

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
 * An implementation of the model object '<em><b>Survey</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link group11survey.impl.SurveyImpl#getQuestions <em>Questions</em>}</li>
 *   <li>{@link group11survey.impl.SurveyImpl#getIntro <em>Intro</em>}</li>
 *   <li>{@link group11survey.impl.SurveyImpl#getOutro <em>Outro</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SurveyImpl extends MinimalEObjectImpl.Container implements Survey {
	/**
	 * The cached value of the '{@link #getQuestions() <em>Questions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestions()
	 * @generated
	 * @ordered
	 */
	protected EList<Question> questions;

	/**
	 * The cached value of the '{@link #getIntro() <em>Intro</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntro()
	 * @generated
	 * @ordered
	 */
	protected Content intro;

	/**
	 * The cached value of the '{@link #getOutro() <em>Outro</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutro()
	 * @generated
	 * @ordered
	 */
	protected Content outro;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SurveyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Group11surveyPackage.Literals.SURVEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Question> getQuestions() {
		if (questions == null) {
			questions = new EObjectContainmentEList<Question>(Question.class, this, Group11surveyPackage.SURVEY__QUESTIONS);
		}
		return questions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Content getIntro() {
		return intro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntro(Content newIntro, NotificationChain msgs) {
		Content oldIntro = intro;
		intro = newIntro;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Group11surveyPackage.SURVEY__INTRO, oldIntro, newIntro);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntro(Content newIntro) {
		if (newIntro != intro) {
			NotificationChain msgs = null;
			if (intro != null)
				msgs = ((InternalEObject)intro).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Group11surveyPackage.SURVEY__INTRO, null, msgs);
			if (newIntro != null)
				msgs = ((InternalEObject)newIntro).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Group11surveyPackage.SURVEY__INTRO, null, msgs);
			msgs = basicSetIntro(newIntro, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Group11surveyPackage.SURVEY__INTRO, newIntro, newIntro));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Content getOutro() {
		return outro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutro(Content newOutro, NotificationChain msgs) {
		Content oldOutro = outro;
		outro = newOutro;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Group11surveyPackage.SURVEY__OUTRO, oldOutro, newOutro);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutro(Content newOutro) {
		if (newOutro != outro) {
			NotificationChain msgs = null;
			if (outro != null)
				msgs = ((InternalEObject)outro).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Group11surveyPackage.SURVEY__OUTRO, null, msgs);
			if (newOutro != null)
				msgs = ((InternalEObject)newOutro).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Group11surveyPackage.SURVEY__OUTRO, null, msgs);
			msgs = basicSetOutro(newOutro, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Group11surveyPackage.SURVEY__OUTRO, newOutro, newOutro));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Group11surveyPackage.SURVEY__QUESTIONS:
				return ((InternalEList<?>)getQuestions()).basicRemove(otherEnd, msgs);
			case Group11surveyPackage.SURVEY__INTRO:
				return basicSetIntro(null, msgs);
			case Group11surveyPackage.SURVEY__OUTRO:
				return basicSetOutro(null, msgs);
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
			case Group11surveyPackage.SURVEY__QUESTIONS:
				return getQuestions();
			case Group11surveyPackage.SURVEY__INTRO:
				return getIntro();
			case Group11surveyPackage.SURVEY__OUTRO:
				return getOutro();
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
			case Group11surveyPackage.SURVEY__QUESTIONS:
				getQuestions().clear();
				getQuestions().addAll((Collection<? extends Question>)newValue);
				return;
			case Group11surveyPackage.SURVEY__INTRO:
				setIntro((Content)newValue);
				return;
			case Group11surveyPackage.SURVEY__OUTRO:
				setOutro((Content)newValue);
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
			case Group11surveyPackage.SURVEY__QUESTIONS:
				getQuestions().clear();
				return;
			case Group11surveyPackage.SURVEY__INTRO:
				setIntro((Content)null);
				return;
			case Group11surveyPackage.SURVEY__OUTRO:
				setOutro((Content)null);
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
			case Group11surveyPackage.SURVEY__QUESTIONS:
				return questions != null && !questions.isEmpty();
			case Group11surveyPackage.SURVEY__INTRO:
				return intro != null;
			case Group11surveyPackage.SURVEY__OUTRO:
				return outro != null;
		}
		return super.eIsSet(featureID);
	}

} //SurveyImpl
