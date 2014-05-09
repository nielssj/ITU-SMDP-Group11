package dk.itu.smdp.group11.survey.tests

import com.google.inject.Inject
import dk.itu.smdp.group11.survey.SurveyInjectorProvider
import dk.itu.smdp.group11.survey.validation.SurveyValidator
import group11survey.Answer
import group11survey.Group11surveyPackage
import group11survey.Survey
import group11survey.TableQuestion
import org.eclipse.emf.common.util.EList
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*

@InjectWith(SurveyInjectorProvider)
@RunWith(XtextRunner)
class TestSurvey {
	@Inject
	ParseHelper<Survey> parser
	
	@Inject extension ValidationTestHelper
	
	@Test
	def void testSurveyHasCorrectName() {
		Group11surveyPackage.eINSTANCE.eClass()  // Need to add to every test for some weird reason.
		val model = parser.parse(
			'''
			Survey "Test"
			Question Q "Question Text" (
				Answer "Answer 1"
			)
			
			'''
		)
		model.assertNoErrors
		val surveyName = model.name
		assertEquals(surveyName, "Test")
	}
	
	@Test
	def void testSurveyHasIntro() {
		Group11surveyPackage.eINSTANCE.eClass()
		val model = parser.parse(
			'''
			Survey "Test"
			Intro "Hello"
			Question Q "Question Text" (
				Answer "Answer 1"
			)
			
			'''
		)
		model.assertNoErrors
		val intro = model.intro
		assertNotNull(intro)
	}
	
	@Test
	def void testSurveyHasOutro() {
		Group11surveyPackage.eINSTANCE.eClass()
		val model = parser.parse(
			'''
			Survey "Test"
			Question Q "Question Text" (
				Answer "Answer 1"
			)
			Outro "Hello"
			'''
		)
		model.assertNoErrors
		val outro = model.outro
		assertNotNull(outro)
	}
	
	@Test
	def void testNonOptionalQuestion() {
		Group11surveyPackage.eINSTANCE.eClass()
		val model = parser.parse(
			'''
			Survey "Test"
			Question Q "Question Text" (
				Answer "Answer 1"
			)
			'''
		)
		model.assertNoErrors
		val optionality = model.questions.get(0).isOptional
		assertFalse(optionality)
	}
	
	@Test
	def void testOptionalQuestion() {
		Group11surveyPackage.eINSTANCE.eClass()
		val model = parser.parse(
			'''
			Survey "Test"
			Question Q optional "Question Text" (
				Answer "Answer 1"
			)
			'''
		)
		model.assertNoErrors
		val optionality = model.questions.get(0).isOptional
		assertTrue(optionality)
	}
	
	@Test
	def void testQuestionHasNoFreetextAnswers() {
		Group11surveyPackage.eINSTANCE.eClass()
		val model = parser.parse(
			'''
			Survey "Test"
			Question Q optional "Question Text" (
				Answer "answer 1"
				Answer "answer 2"
				Answer "answer 3"
			)
			'''
		)
		model.assertNoErrors
		assertTrue(countFreetextAnswers(model.questions.get(0).answers) == 0)
	}
	
	@Test
	def void testQuestionHasOneFreetextAnswer() {
		Group11surveyPackage.eINSTANCE.eClass()
		val model = parser.parse(
			'''
			Survey "Test"
			Question Q optional "Question Text" (
				Answer "answer 1"
				Answer "answer 2"
				Answer freetext "answer 3"
			)
			'''
		)
		model.assertNoErrors
		assertTrue(countFreetextAnswers(model.questions.get(0).answers) == 1)
	}
	
	@Test
	def void testQuestionHasMultipleFreetextAnswers() {
		Group11surveyPackage.eINSTANCE.eClass()
		val model = parser.parse(
			'''
			Survey "Test"
			Question Q optional "Question Text" (
				Answer "answer 1"
				Answer freetext "answer 2"
				Answer freetext "answer 3"
				Answer freetext "answer 4"
			)
			'''
		)
		model.assertNoErrors
		assertTrue(countFreetextAnswers(model.questions.get(0).answers) == 3)
	}
	
	@Test
	def void testQuestionIsNonExclusive() {
		Group11surveyPackage.eINSTANCE.eClass()
		val model = parser.parse(
			'''
			Survey "Test"
			Question Q "Question Text" (
				Answer "answer 1"
				Answer freetext "answer 2"
				Answer freetext "answer 3"
				Answer freetext "answer 4"
			)
			'''
		)
		model.assertNoErrors
		assertFalse(model.questions.get(0).isExclusive)
	}
	
	@Test
	def void testQuestionIsExclusive() {
		Group11surveyPackage.eINSTANCE.eClass()
		val model = parser.parse(
			'''
			Survey "Test"
			Question Q exclusive "Question Text" (
				Answer "answer 1"
				Answer freetext "answer 2"
				Answer freetext "answer 3"
				Answer freetext "answer 4"
			)
			'''
		)
		model.assertNoErrors
		assertTrue(model.questions.get(0).isExclusive)
	}
	
	@Test
	def void testRegularQuestionWith3Answers() {
		Group11surveyPackage.eINSTANCE.eClass()
		val model = parser.parse(
			'''
			Survey "Test"
			Question Q "Question Text" (
				Answer "answer 1"
				Answer freetext "answer 2"
				Answer freetext "answer 3"
			)
			'''
		)
		model.assertNoErrors
		assertTrue(model.questions.get(0).answers.length == 3)
	}
	
	@Test
	def void testRegularQuestionWithNoAnswers() {
		Group11surveyPackage.eINSTANCE.eClass()
		val model = parser.parse(
			'''
			Survey "Test"
			Question Q "Question Text" (
			)
			'''
		)
		model.assertError(Group11surveyPackage::eINSTANCE.question, SurveyValidator::QuestionHasAnswer)
	}
	
//	@Test
//	def void testRegularQuestionWith3Items() {
//		Group11surveyPackage.eINSTANCE.eClass()
//		parser.parse(
//			'''
//			Survey "Test"
//			Question Q "Question Text" (
//				Items ("Item 1", "Item 2", "Item 3")
//			)
//			'''
//		).assertError(Group11surveyPackage::eINSTANCE.question, null)
//	}

	
	@Test
	def void testTableQuestionWith3Items() {
		Group11surveyPackage.eINSTANCE.eClass()
		val model = parser.parse(
			'''
			Survey "Test"
			TableQuestion CARLIKE "What do you like about the following types of cars?" (
			Items ( "BMW.", "Fiat", "Peugeot" )
			Answer "Power"
			Answer "Comfort"
			Answer "Security"
			)
			'''
		)
		model.assertNoErrors
		assertTrue((model.questions.get(0) as TableQuestion).items.length == 3)
	}
	
	@Test
	def void testTableQuestionExclusiveOptionalWith3Items() {
		Group11surveyPackage.eINSTANCE.eClass()
		val model = parser.parse(
			'''
			Survey "Test"
			TableQuestion CARLIKE exclusive optional "What do you like about the following types of cars?" (
			Items ( "BMW.", "Fiat", "Peugeot" )
			Answer "Power"
			Answer "Comfort"
			Answer "Security"
			)
			'''
		)
		model.assertNoErrors
		assertTrue(model.questions.get(0).isExclusive)
		assertTrue(model.questions.get(0).isOptional)
		assertTrue((model.questions.get(0) as TableQuestion).items.length == 3)
	}
	
	@Test
	def void testFollowupQuestion() {
		Group11surveyPackage.eINSTANCE.eClass()
		val model = parser.parse(
			'''
			Survey "Test"
			Question ORANGESIZE exclusive optional "How big do you like your oranges?"
			(
				Answer "Large"
				Answer "Small"
			)
			
			Question FAVFRUITS "Which of the following fruits do you enjoy eating?"
			(
				Answer "Apples"
				Answer "Oranges" -> ORANGESIZE
				Answer "Bananas"
				Answer freetext "Other fruits you like"
			)
			'''
		)
		model.assertNoErrors
		assertTrue(model.questions.get(1).answers.get(1).followup.contains(model.questions.get(0)))	
	}
	
	@Test
	def void testFollowupReferenceToUndefinedQuestion() {
		Group11surveyPackage.eINSTANCE.eClass()
		val model = parser.parse(
			'''
			Survey "Test"
			Question ORANGESIZE exclusive optional "How big do you like your oranges?"
			(
				Answer "Large"
				Answer "Small"
			)
			Question FAVFRUITS "Which of the following fruits do you enjoy eating?"
			(
				Answer "Apples"
				Answer "Oranges" -> APPLESIZE
				Answer "Bananas"
				Answer freetext "Other fruits you like"
			)
			'''
		)
		model.assertError(Group11surveyPackage::eINSTANCE.answer, SurveyValidator::ReferenceIsCorrect)
	}
	
	@Test
	def void test2QuestionsWithSameIdentifier() {
		Group11surveyPackage.eINSTANCE.eClass()
		val model = parser.parse(
			'''
			Survey "Test"
			Question ORANGESIZE exclusive optional "How big do you like your oranges?"
			(
				Answer "Large"
				Answer "Small"
			)
			
			Question ORANGESIZE exclusive "What is your favorite city?"
			(
				Answer "Copenhagen"
				Answer "London"
				Answer "Paris"
				Answer freetext "A different city"
			)
			'''
		)
		model.assertError(Group11surveyPackage::eINSTANCE.question, SurveyValidator::QuestionHasUniqueName)
	}
	
	@Test
	def void testExclusiveQuestionWithSingleAnswer() {
		Group11surveyPackage.eINSTANCE.eClass()
		val model = parser.parse(
			'''
			Survey "Test"
			Question ORANGESIZE exclusive "How big do you like your oranges?"
			(
				Answer "Large"
			)
			'''
		)
		model.assertError(Group11surveyPackage::eINSTANCE.question, SurveyValidator::ExclusiveQuestionHasMultipleAnswers)
	}
	
	@Test
	def void testTableQuestionWithFollowup() {
		Group11surveyPackage.eINSTANCE.eClass()
		val model = parser.parse(
			'''
			Survey "Test"
			Question ORANGESIZE "How big do you like your oranges?"
				(
					Answer "Large"
					Answer "Small"
				)
			
			TableQuestion CARLIKE "What do you like about the following types of cars?"
			(
				Items ( "BMW.", "Fiat", "Peugeot" )
				Answer "Power"
				Answer "Comfort" -> ORANGESIZE
				Answer "Security"
			)
			'''
		)
		model.assertError(Group11surveyPackage::eINSTANCE.answer, SurveyValidator::TableQuestionHasNoFollowups)
	}
	
	@Test
	def void testSurveyWithCycles() {
		Group11surveyPackage.eINSTANCE.eClass()
		val model = parser.parse(
			'''
			Survey "Test"
			Question ORANGESIZE "How big do you like your oranges?"
			(
				Answer "Large"
				Answer "Small" -> CARLIKE
			)
			
			TableQuestion CARLIKE "What do you like about the following types of cars?"
			(
				Items ( "BMW.", "Fiat", "Peugeot" )
				Answer "Power"
				Answer "Comfort" -> ORANGESIZE
				Answer "Security"
			)
			'''
		)
		model.assertError(Group11surveyPackage::eINSTANCE.answer, SurveyValidator::NoCycles)
	}
	
	// Counts how many free text answers there are and returns that number.
	def int countFreetextAnswers(EList<Answer> answers) {
		var int count = 0
		for (Answer answer : answers) {
			if (answer.isFreeText) {
				count = count + 1
			}
		}
		return count
	}
}