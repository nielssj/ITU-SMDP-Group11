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
 *   <li>{@link group11survey.Survey#getName <em>Name</em>}</li>
 *   <li>{@link group11survey.Survey#getIntro <em>Intro</em>}</li>
 *   <li>{@link group11survey.Survey#getOutro <em>Outro</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Intro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intro</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intro</em>' attribute.
	 * @see #setIntro(String)
	 * @see group11survey.Group11surveyPackage#getSurvey_Intro()
	 * @model
	 * @generated
	 */
	String getIntro();

	/**
	 * Sets the value of the '{@link group11survey.Survey#getIntro <em>Intro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intro</em>' attribute.
	 * @see #getIntro()
	 * @generated
	 */
	void setIntro(String value);

	/**
	 * Returns the value of the '<em><b>Outro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outro</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outro</em>' attribute.
	 * @see #setOutro(String)
	 * @see group11survey.Group11surveyPackage#getSurvey_Outro()
	 * @model
	 * @generated
	 */
	String getOutro();

	/**
	 * Sets the value of the '{@link group11survey.Survey#getOutro <em>Outro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outro</em>' attribute.
	 * @see #getOutro()
	 * @generated
	 */
	void setOutro(String value);

} // Survey
