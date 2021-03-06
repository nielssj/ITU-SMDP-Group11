/**
 */
package group11survey;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link group11survey.TableQuestion#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see group11survey.Group11surveyPackage#getTableQuestion()
 * @model
 * @generated
 */
public interface TableQuestion extends Question {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link group11survey.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see group11survey.Group11surveyPackage#getTableQuestion_Items()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Item> getItems();

} // TableQuestion
