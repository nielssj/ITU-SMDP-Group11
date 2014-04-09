/**
 */
package group11survey.impl;

import group11survey.Answer;
import group11survey.Group11surveyPackage;
import group11survey.Question;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link group11survey.impl.QuestionImpl#getAnswers <em>Answers</em>}</li>
 *   <li>{@link group11survey.impl.QuestionImpl#isIsOptional <em>Is Optional</em>}</li>
 *   <li>{@link group11survey.impl.QuestionImpl#isIsExclusive <em>Is Exclusive</em>}</li>
 *   <li>{@link group11survey.impl.QuestionImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuestionImpl extends ContentImpl implements Question {
	/**
	 * The cached value of the '{@link #getAnswers() <em>Answers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswers()
	 * @generated
	 * @ordered
	 */
	protected EList<Answer> answers;

	/**
	 * The default value of the '{@link #isIsOptional() <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOptional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_OPTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOptional() <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOptional()
	 * @generated
	 * @ordered
	 */
	protected boolean isOptional = IS_OPTIONAL_EDEFAULT;

	/**
	 * This is true if the Is Optional attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isOptionalESet;

	/**
	 * The default value of the '{@link #isIsExclusive() <em>Is Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsExclusive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_EXCLUSIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsExclusive() <em>Is Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsExclusive()
	 * @generated
	 * @ordered
	 */
	protected boolean isExclusive = IS_EXCLUSIVE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Group11surveyPackage.Literals.QUESTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Answer> getAnswers() {
		if (answers == null) {
			answers = new EObjectContainmentEList<Answer>(Answer.class, this, Group11surveyPackage.QUESTION__ANSWERS);
		}
		return answers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsExclusive() {
		return isExclusive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsExclusive(boolean newIsExclusive) {
		boolean oldIsExclusive = isExclusive;
		isExclusive = newIsExclusive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Group11surveyPackage.QUESTION__IS_EXCLUSIVE, oldIsExclusive, isExclusive));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Group11surveyPackage.QUESTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOptional() {
		return isOptional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOptional(boolean newIsOptional) {
		boolean oldIsOptional = isOptional;
		isOptional = newIsOptional;
		boolean oldIsOptionalESet = isOptionalESet;
		isOptionalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Group11surveyPackage.QUESTION__IS_OPTIONAL, oldIsOptional, isOptional, !oldIsOptionalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsOptional() {
		boolean oldIsOptional = isOptional;
		boolean oldIsOptionalESet = isOptionalESet;
		isOptional = IS_OPTIONAL_EDEFAULT;
		isOptionalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Group11surveyPackage.QUESTION__IS_OPTIONAL, oldIsOptional, IS_OPTIONAL_EDEFAULT, oldIsOptionalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsOptional() {
		return isOptionalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Group11surveyPackage.QUESTION__ANSWERS:
				return ((InternalEList<?>)getAnswers()).basicRemove(otherEnd, msgs);
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
			case Group11surveyPackage.QUESTION__ANSWERS:
				return getAnswers();
			case Group11surveyPackage.QUESTION__IS_OPTIONAL:
				return isIsOptional();
			case Group11surveyPackage.QUESTION__IS_EXCLUSIVE:
				return isIsExclusive();
			case Group11surveyPackage.QUESTION__NAME:
				return getName();
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
			case Group11surveyPackage.QUESTION__ANSWERS:
				getAnswers().clear();
				getAnswers().addAll((Collection<? extends Answer>)newValue);
				return;
			case Group11surveyPackage.QUESTION__IS_OPTIONAL:
				setIsOptional((Boolean)newValue);
				return;
			case Group11surveyPackage.QUESTION__IS_EXCLUSIVE:
				setIsExclusive((Boolean)newValue);
				return;
			case Group11surveyPackage.QUESTION__NAME:
				setName((String)newValue);
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
			case Group11surveyPackage.QUESTION__ANSWERS:
				getAnswers().clear();
				return;
			case Group11surveyPackage.QUESTION__IS_OPTIONAL:
				unsetIsOptional();
				return;
			case Group11surveyPackage.QUESTION__IS_EXCLUSIVE:
				setIsExclusive(IS_EXCLUSIVE_EDEFAULT);
				return;
			case Group11surveyPackage.QUESTION__NAME:
				setName(NAME_EDEFAULT);
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
			case Group11surveyPackage.QUESTION__ANSWERS:
				return answers != null && !answers.isEmpty();
			case Group11surveyPackage.QUESTION__IS_OPTIONAL:
				return isSetIsOptional();
			case Group11surveyPackage.QUESTION__IS_EXCLUSIVE:
				return isExclusive != IS_EXCLUSIVE_EDEFAULT;
			case Group11surveyPackage.QUESTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (isOptional: ");
		if (isOptionalESet) result.append(isOptional); else result.append("<unset>");
		result.append(", isExclusive: ");
		result.append(isExclusive);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //QuestionImpl
