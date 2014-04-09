/**
 */
package group11survey;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link group11survey.Question#getAnswers <em>Answers</em>}</li>
 *   <li>{@link group11survey.Question#isIsOptional <em>Is Optional</em>}</li>
 *   <li>{@link group11survey.Question#isIsExclusive <em>Is Exclusive</em>}</li>
 *   <li>{@link group11survey.Question#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see group11survey.Group11surveyPackage#getQuestion()
 * @model
 * @generated
 */
public interface Question extends Content {
	/**
	 * Returns the value of the '<em><b>Answers</b></em>' containment reference list.
	 * The list contents are of type {@link group11survey.Answer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Answers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answers</em>' containment reference list.
	 * @see group11survey.Group11surveyPackage#getQuestion_Answers()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Answer> getAnswers();

	/**
	 * Returns the value of the '<em><b>Is Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Exclusive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Exclusive</em>' attribute.
	 * @see #setIsExclusive(boolean)
	 * @see group11survey.Group11surveyPackage#getQuestion_IsExclusive()
	 * @model
	 * @generated
	 */
	boolean isIsExclusive();

	/**
	 * Sets the value of the '{@link group11survey.Question#isIsExclusive <em>Is Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Exclusive</em>' attribute.
	 * @see #isIsExclusive()
	 * @generated
	 */
	void setIsExclusive(boolean value);

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
	 * @see group11survey.Group11surveyPackage#getQuestion_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link group11survey.Question#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Optional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Optional</em>' attribute.
	 * @see #isSetIsOptional()
	 * @see #unsetIsOptional()
	 * @see #setIsOptional(boolean)
	 * @see group11survey.Group11surveyPackage#getQuestion_IsOptional()
	 * @model unsettable="true"
	 * @generated
	 */
	boolean isIsOptional();

	/**
	 * Sets the value of the '{@link group11survey.Question#isIsOptional <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Optional</em>' attribute.
	 * @see #isSetIsOptional()
	 * @see #unsetIsOptional()
	 * @see #isIsOptional()
	 * @generated
	 */
	void setIsOptional(boolean value);

	/**
	 * Unsets the value of the '{@link group11survey.Question#isIsOptional <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsOptional()
	 * @see #isIsOptional()
	 * @see #setIsOptional(boolean)
	 * @generated
	 */
	void unsetIsOptional();

	/**
	 * Returns whether the value of the '{@link group11survey.Question#isIsOptional <em>Is Optional</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Optional</em>' attribute is set.
	 * @see #unsetIsOptional()
	 * @see #isIsOptional()
	 * @see #setIsOptional(boolean)
	 * @generated
	 */
	boolean isSetIsOptional();

} // Question
