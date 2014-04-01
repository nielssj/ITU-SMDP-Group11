/**
 */
package group11survey;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Survey</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link group11survey.Survey#getQuestions <em>Questions</em>}</li>
 *   <li>{@link group11survey.Survey#getIntro <em>Intro</em>}</li>
 *   <li>{@link group11survey.Survey#getOutro <em>Outro</em>}</li>
 *   <li>{@link group11survey.Survey#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see group11survey.Group11surveyPackage#getSurvey()
 * @model
 * @generated
 */
public interface Survey extends EObject {
	/**
	 * Returns the value of the '<em><b>Questions</b></em>' containment reference list.
	 * The list contents are of type {@link group11survey.Question}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Questions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Questions</em>' containment reference list.
	 * @see group11survey.Group11surveyPackage#getSurvey_Questions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Question> getQuestions();

	/**
	 * Returns the value of the '<em><b>Intro</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intro</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intro</em>' containment reference.
	 * @see #setIntro(Content)
	 * @see group11survey.Group11surveyPackage#getSurvey_Intro()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Content getIntro();

	/**
	 * Sets the value of the '{@link group11survey.Survey#getIntro <em>Intro</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intro</em>' containment reference.
	 * @see #getIntro()
	 * @generated
	 */
	void setIntro(Content value);

	/**
	 * Returns the value of the '<em><b>Outro</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outro</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outro</em>' containment reference.
	 * @see #setOutro(Content)
	 * @see group11survey.Group11surveyPackage#getSurvey_Outro()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Content getOutro();

	/**
	 * Sets the value of the '{@link group11survey.Survey#getOutro <em>Outro</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outro</em>' containment reference.
	 * @see #getOutro()
	 * @generated
	 */
	void setOutro(Content value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see group11survey.Group11surveyPackage#getSurvey_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link group11survey.Survey#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Survey
