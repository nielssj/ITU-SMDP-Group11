/**
 */
package group11survey.impl;

import group11survey.Answer;
import group11survey.Group11surveyPackage;
import group11survey.Question;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Answer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link group11survey.impl.AnswerImpl#getFollowup <em>Followup</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnswerImpl extends ContentImpl implements Answer {
	/**
	 * The cached value of the '{@link #getFollowup() <em>Followup</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollowup()
	 * @generated
	 * @ordered
	 */
	protected EList<Question> followup;

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
	public EList<Question> getFollowup() {
		if (followup == null) {
			followup = new EObjectResolvingEList<Question>(Question.class, this, Group11surveyPackage.ANSWER__FOLLOWUP);
		}
		return followup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Group11surveyPackage.ANSWER__FOLLOWUP:
				return getFollowup();
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
			case Group11surveyPackage.ANSWER__FOLLOWUP:
				getFollowup().clear();
				getFollowup().addAll((Collection<? extends Question>)newValue);
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
			case Group11surveyPackage.ANSWER__FOLLOWUP:
				getFollowup().clear();
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
			case Group11surveyPackage.ANSWER__FOLLOWUP:
				return followup != null && !followup.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AnswerImpl
