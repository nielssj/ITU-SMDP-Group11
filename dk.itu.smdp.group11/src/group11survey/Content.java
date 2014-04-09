/**
 */
package group11survey;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link group11survey.Content#getBody <em>Body</em>}</li>
 *   <li>{@link group11survey.Content#isIsFreeText <em>Is Free Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see group11survey.Group11surveyPackage#getContent()
 * @model
 * @generated
 */
public interface Content extends EObject {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see group11survey.Group11surveyPackage#getContent_Body()
	 * @model
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link group11survey.Content#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

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
	 * @see group11survey.Group11surveyPackage#getContent_IsFreeText()
	 * @model
	 * @generated
	 */
	boolean isIsFreeText();

	/**
	 * Sets the value of the '{@link group11survey.Content#isIsFreeText <em>Is Free Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Free Text</em>' attribute.
	 * @see #isIsFreeText()
	 * @generated
	 */
	void setIsFreeText(boolean value);

} // Content
