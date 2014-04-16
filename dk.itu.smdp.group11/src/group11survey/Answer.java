/**
 */
package group11survey;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link group11survey.Answer#getFollowup <em>Followup</em>}</li>
 *   <li>{@link group11survey.Answer#isIsFreeText <em>Is Free Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see group11survey.Group11surveyPackage#getAnswer()
 * @model
 * @generated
 */
public interface Answer extends Content {
	/**
	 * Returns the value of the '<em><b>Followup</b></em>' reference list.
	 * The list contents are of type {@link group11survey.Question}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Followup</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Followup</em>' reference list.
	 * @see group11survey.Group11surveyPackage#getAnswer_Followup()
	 * @model
	 * @generated
	 */
	EList<Question> getFollowup();

	/**
	 * Returns the value of the '<em><b>Is Free Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Free Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Free Text</em>' attribute.
	 * @see #setIsFreeText(boolean)
	 * @see group11survey.Group11surveyPackage#getAnswer_IsFreeText()
	 * @model
	 * @generated
	 */
	boolean isIsFreeText();

	/**
	 * Sets the value of the '{@link group11survey.Answer#isIsFreeText <em>Is Free Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Free Text</em>' attribute.
	 * @see #isIsFreeText()
	 * @generated
	 */
	void setIsFreeText(boolean value);

} // Answer
