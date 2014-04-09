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
	 * If the meaning of the '<em>Followup</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Followup</em>' reference list.
	 * @see group11survey.Group11surveyPackage#getAnswer_Followup()
	 * @model
	 * @generated
	 */
	EList<Question> getFollowup();

} // Answer
