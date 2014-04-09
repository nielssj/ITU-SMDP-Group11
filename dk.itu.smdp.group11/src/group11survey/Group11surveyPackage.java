/**
 */
package group11survey;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see group11survey.Group11surveyFactory
 * @model kind="package"
 * @generated
 */
public interface Group11surveyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "group11survey";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://itu.dk";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dk.itu.smdp.group11.survey";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Group11surveyPackage eINSTANCE = group11survey.impl.Group11surveyPackageImpl.init();

	/**
	 * The meta object id for the '{@link group11survey.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see group11survey.impl.QuestionImpl
	 * @see group11survey.impl.Group11surveyPackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 0;

	/**
	 * The meta object id for the '{@link group11survey.impl.AnswerImpl <em>Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see group11survey.impl.AnswerImpl
	 * @see group11survey.impl.Group11surveyPackageImpl#getAnswer()
	 * @generated
	 */
	int ANSWER = 1;

	/**
	 * The meta object id for the '{@link group11survey.impl.SurveyImpl <em>Survey</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see group11survey.impl.SurveyImpl
	 * @see group11survey.impl.Group11surveyPackageImpl#getSurvey()
	 * @generated
	 */
	int SURVEY = 2;

	/**
	 * The meta object id for the '{@link group11survey.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see group11survey.impl.ItemImpl
	 * @see group11survey.impl.Group11surveyPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 4;

	/**
	 * The meta object id for the '{@link group11survey.impl.TableQuestionImpl <em>Table Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see group11survey.impl.TableQuestionImpl
	 * @see group11survey.impl.Group11surveyPackageImpl#getTableQuestion()
	 * @generated
	 */
	int TABLE_QUESTION = 5;

	/**
	 * The meta object id for the '{@link group11survey.impl.ContentImpl <em>Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see group11survey.impl.ContentImpl
	 * @see group11survey.impl.Group11surveyPackageImpl#getContent()
	 * @generated
	 */
	int CONTENT = 3;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__BODY = 0;

	/**
	 * The feature id for the '<em><b>Is Free Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__IS_FREE_TEXT = 1;

	/**
	 * The number of structural features of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__BODY = CONTENT__BODY;

	/**
	 * The feature id for the '<em><b>Is Free Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__IS_FREE_TEXT = CONTENT__IS_FREE_TEXT;

	/**
	 * The feature id for the '<em><b>Answers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__ANSWERS = CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__IS_OPTIONAL = CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__IS_EXCLUSIVE = CONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__NAME = CONTENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FEATURE_COUNT = CONTENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OPERATION_COUNT = CONTENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__BODY = CONTENT__BODY;

	/**
	 * The feature id for the '<em><b>Is Free Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__IS_FREE_TEXT = CONTENT__IS_FREE_TEXT;

	/**
	 * The feature id for the '<em><b>Followup</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__FOLLOWUP = CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_FEATURE_COUNT = CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_OPERATION_COUNT = CONTENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Questions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__QUESTIONS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Intro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__INTRO = 2;

	/**
	 * The feature id for the '<em><b>Outro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__OUTRO = 3;

	/**
	 * The number of structural features of the '<em>Survey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Survey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__BODY = CONTENT__BODY;

	/**
	 * The feature id for the '<em><b>Is Free Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__IS_FREE_TEXT = CONTENT__IS_FREE_TEXT;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = CONTENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_QUESTION__BODY = QUESTION__BODY;

	/**
	 * The feature id for the '<em><b>Is Free Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_QUESTION__IS_FREE_TEXT = QUESTION__IS_FREE_TEXT;

	/**
	 * The feature id for the '<em><b>Answers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_QUESTION__ANSWERS = QUESTION__ANSWERS;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_QUESTION__IS_OPTIONAL = QUESTION__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Is Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_QUESTION__IS_EXCLUSIVE = QUESTION__IS_EXCLUSIVE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_QUESTION__NAME = QUESTION__NAME;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_QUESTION__ITEMS = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_QUESTION_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Table Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_QUESTION_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link group11survey.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see group11survey.Question
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for the containment reference list '{@link group11survey.Question#getAnswers <em>Answers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Answers</em>'.
	 * @see group11survey.Question#getAnswers()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_Answers();

	/**
	 * Returns the meta object for the attribute '{@link group11survey.Question#isIsExclusive <em>Is Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Exclusive</em>'.
	 * @see group11survey.Question#isIsExclusive()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_IsExclusive();

	/**
	 * Returns the meta object for the attribute '{@link group11survey.Question#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see group11survey.Question#getName()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Name();

	/**
	 * Returns the meta object for the attribute '{@link group11survey.Question#isIsOptional <em>Is Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Optional</em>'.
	 * @see group11survey.Question#isIsOptional()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_IsOptional();

	/**
	 * Returns the meta object for class '{@link group11survey.Answer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Answer</em>'.
	 * @see group11survey.Answer
	 * @generated
	 */
	EClass getAnswer();

	/**
	 * Returns the meta object for the reference list '{@link group11survey.Answer#getFollowup <em>Followup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Followup</em>'.
	 * @see group11survey.Answer#getFollowup()
	 * @see #getAnswer()
	 * @generated
	 */
	EReference getAnswer_Followup();

	/**
	 * Returns the meta object for class '{@link group11survey.Survey <em>Survey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Survey</em>'.
	 * @see group11survey.Survey
	 * @generated
	 */
	EClass getSurvey();

	/**
	 * Returns the meta object for the containment reference list '{@link group11survey.Survey#getQuestions <em>Questions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Questions</em>'.
	 * @see group11survey.Survey#getQuestions()
	 * @see #getSurvey()
	 * @generated
	 */
	EReference getSurvey_Questions();

	/**
	 * Returns the meta object for the attribute '{@link group11survey.Survey#getIntro <em>Intro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intro</em>'.
	 * @see group11survey.Survey#getIntro()
	 * @see #getSurvey()
	 * @generated
	 */
	EAttribute getSurvey_Intro();

	/**
	 * Returns the meta object for the attribute '{@link group11survey.Survey#getOutro <em>Outro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outro</em>'.
	 * @see group11survey.Survey#getOutro()
	 * @see #getSurvey()
	 * @generated
	 */
	EAttribute getSurvey_Outro();

	/**
	 * Returns the meta object for the attribute '{@link group11survey.Survey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see group11survey.Survey#getName()
	 * @see #getSurvey()
	 * @generated
	 */
	EAttribute getSurvey_Name();

	/**
	 * Returns the meta object for class '{@link group11survey.Content <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content</em>'.
	 * @see group11survey.Content
	 * @generated
	 */
	EClass getContent();

	/**
	 * Returns the meta object for the attribute '{@link group11survey.Content#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see group11survey.Content#getBody()
	 * @see #getContent()
	 * @generated
	 */
	EAttribute getContent_Body();

	/**
	 * Returns the meta object for the attribute '{@link group11survey.Content#isIsFreeText <em>Is Free Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Free Text</em>'.
	 * @see group11survey.Content#isIsFreeText()
	 * @see #getContent()
	 * @generated
	 */
	EAttribute getContent_IsFreeText();

	/**
	 * Returns the meta object for class '{@link group11survey.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see group11survey.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for class '{@link group11survey.TableQuestion <em>Table Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Question</em>'.
	 * @see group11survey.TableQuestion
	 * @generated
	 */
	EClass getTableQuestion();

	/**
	 * Returns the meta object for the containment reference list '{@link group11survey.TableQuestion#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see group11survey.TableQuestion#getItems()
	 * @see #getTableQuestion()
	 * @generated
	 */
	EReference getTableQuestion_Items();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Group11surveyFactory getGroup11surveyFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link group11survey.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see group11survey.impl.QuestionImpl
		 * @see group11survey.impl.Group11surveyPackageImpl#getQuestion()
		 * @generated
		 */
		EClass QUESTION = eINSTANCE.getQuestion();

		/**
		 * The meta object literal for the '<em><b>Answers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__ANSWERS = eINSTANCE.getQuestion_Answers();

		/**
		 * The meta object literal for the '<em><b>Is Exclusive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__IS_EXCLUSIVE = eINSTANCE.getQuestion_IsExclusive();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__NAME = eINSTANCE.getQuestion_Name();

		/**
		 * The meta object literal for the '<em><b>Is Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__IS_OPTIONAL = eINSTANCE.getQuestion_IsOptional();

		/**
		 * The meta object literal for the '{@link group11survey.impl.AnswerImpl <em>Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see group11survey.impl.AnswerImpl
		 * @see group11survey.impl.Group11surveyPackageImpl#getAnswer()
		 * @generated
		 */
		EClass ANSWER = eINSTANCE.getAnswer();

		/**
		 * The meta object literal for the '<em><b>Followup</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANSWER__FOLLOWUP = eINSTANCE.getAnswer_Followup();

		/**
		 * The meta object literal for the '{@link group11survey.impl.SurveyImpl <em>Survey</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see group11survey.impl.SurveyImpl
		 * @see group11survey.impl.Group11surveyPackageImpl#getSurvey()
		 * @generated
		 */
		EClass SURVEY = eINSTANCE.getSurvey();

		/**
		 * The meta object literal for the '<em><b>Questions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURVEY__QUESTIONS = eINSTANCE.getSurvey_Questions();

		/**
		 * The meta object literal for the '<em><b>Intro</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY__INTRO = eINSTANCE.getSurvey_Intro();

		/**
		 * The meta object literal for the '<em><b>Outro</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY__OUTRO = eINSTANCE.getSurvey_Outro();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY__NAME = eINSTANCE.getSurvey_Name();

		/**
		 * The meta object literal for the '{@link group11survey.impl.ContentImpl <em>Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see group11survey.impl.ContentImpl
		 * @see group11survey.impl.Group11surveyPackageImpl#getContent()
		 * @generated
		 */
		EClass CONTENT = eINSTANCE.getContent();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT__BODY = eINSTANCE.getContent_Body();

		/**
		 * The meta object literal for the '<em><b>Is Free Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT__IS_FREE_TEXT = eINSTANCE.getContent_IsFreeText();

		/**
		 * The meta object literal for the '{@link group11survey.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see group11survey.impl.ItemImpl
		 * @see group11survey.impl.Group11surveyPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '{@link group11survey.impl.TableQuestionImpl <em>Table Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see group11survey.impl.TableQuestionImpl
		 * @see group11survey.impl.Group11surveyPackageImpl#getTableQuestion()
		 * @generated
		 */
		EClass TABLE_QUESTION = eINSTANCE.getTableQuestion();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_QUESTION__ITEMS = eINSTANCE.getTableQuestion_Items();

	}

} //Group11surveyPackage
