/**
 */
package group11survey.impl;

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
 *   <li>{@link group11survey.impl.SurveyImpl#getName <em>Name</em>}</li>
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntro() <em>Intro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntro()
	 * @generated
	 * @ordered
	 */
	protected static final String INTRO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntro() <em>Intro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntro()
	 * @generated
	 * @ordered
	 */
	protected String intro = INTRO_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutro() <em>Outro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutro()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTRO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutro() <em>Outro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutro()
	 * @generated
	 * @ordered
	 */
	protected String outro = OUTRO_EDEFAULT;

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
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Group11surveyPackage.SURVEY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIntro() {
		return intro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntro(String newIntro) {
		String oldIntro = intro;
		intro = newIntro;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Group11surveyPackage.SURVEY__INTRO, oldIntro, intro));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutro() {
		return outro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutro(String newOutro) {
		String oldOutro = outro;
		outro = newOutro;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Group11surveyPackage.SURVEY__OUTRO, oldOutro, outro));
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
			case Group11surveyPackage.SURVEY__NAME:
				return getName();
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
			case Group11surveyPackage.SURVEY__NAME:
				setName((String)newValue);
				return;
			case Group11surveyPackage.SURVEY__INTRO:
				setIntro((String)newValue);
				return;
			case Group11surveyPackage.SURVEY__OUTRO:
				setOutro((String)newValue);
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
			case Group11surveyPackage.SURVEY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Group11surveyPackage.SURVEY__INTRO:
				setIntro(INTRO_EDEFAULT);
				return;
			case Group11surveyPackage.SURVEY__OUTRO:
				setOutro(OUTRO_EDEFAULT);
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
			case Group11surveyPackage.SURVEY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Group11surveyPackage.SURVEY__INTRO:
				return INTRO_EDEFAULT == null ? intro != null : !INTRO_EDEFAULT.equals(intro);
			case Group11surveyPackage.SURVEY__OUTRO:
				return OUTRO_EDEFAULT == null ? outro != null : !OUTRO_EDEFAULT.equals(outro);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", intro: ");
		result.append(intro);
		result.append(", outro: ");
		result.append(outro);
		result.append(')');
		return result.toString();
	}

} //SurveyImpl
