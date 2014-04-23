/*
 * generated by Xtext
 */
package dk.itu.smdp.group11.survey.validation

import group11survey.Group11surveyPackage
import group11survey.Survey
import org.eclipse.xtext.validation.Check
import java.util.List
import java.util.Set
import java.util.HashSet
import group11survey.Question

//import org.eclipse.xtext.validation.Check

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class SurveyValidator extends AbstractSurveyValidator {

//  public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					MyDslPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}

	@Check
	def checkSurveyHasQuestion(Survey survey) {
		if (survey.questions.size < 1) {
			error('Survey must have at least one question', Group11surveyPackage.Literals.SURVEY__QUESTIONS)
		}
	}
	
	@Check
	def checkQuestionBodyNotEmpty(Question question) {
		if (!(question.body != null && question.body.trim.length > 0)) {
			error('Question can not be empty', Group11surveyPackage.Literals.CONTENT__BODY)
		}
	}
	
	@Check
	def checkQuestionHasName(Question question) {
		if (!(question.name != null && question.name.trim.length > 0)) {
			error('Question ID can not be empty', Group11surveyPackage.Literals.QUESTION__NAME)
		}
	}
	
	List<String> list
	Set<String> set
	@Check
	def checkQuestionHasUniqueName(Survey survey) {
		list = newArrayList()
		{survey.questions}.forEach[list.add(name)]
		set = new HashSet<String>(list)
		if (list.size != set.size) {
			error('Question IDs must be unique', Group11surveyPackage.Literals.SURVEY__QUESTIONS)
		}
	}
	
	@Check
	def checkQuestionFollowups(Question question) {
		if (!{question.answers}.forall[followup.forall[name != question.name]]) {
			error('Question can not contain itself in followup questions', Group11surveyPackage.Literals.QUESTION__ANSWERS)
		}
	}
	
//	@Check
//	def checkNoCycles(Survey survey) {
//		
//	}
}