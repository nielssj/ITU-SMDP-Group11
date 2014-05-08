package dk.itu.smdp.group11.survey.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import dk.itu.smdp.group11.survey.services.SurveyGrammarAccess;
import group11survey.Answer;
import group11survey.Group11surveyPackage;
import group11survey.Item;
import group11survey.Question;
import group11survey.Survey;
import group11survey.TableQuestion;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public abstract class AbstractSurveySemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SurveyGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == Group11surveyPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case Group11surveyPackage.ANSWER:
				if(context == grammarAccess.getAnswerRule()) {
					sequence_Answer(context, (Answer) semanticObject); 
					return; 
				}
				else break;
			case Group11surveyPackage.ITEM:
				if(context == grammarAccess.getItemRule()) {
					sequence_Item(context, (Item) semanticObject); 
					return; 
				}
				else break;
			case Group11surveyPackage.QUESTION:
				if(context == grammarAccess.getQuestionRule() ||
				   context == grammarAccess.getQuestion_ImplRule()) {
					sequence_Question_Impl(context, (Question) semanticObject); 
					return; 
				}
				else break;
			case Group11surveyPackage.SURVEY:
				if(context == grammarAccess.getSurveyRule()) {
					sequence_Survey(context, (Survey) semanticObject); 
					return; 
				}
				else break;
			case Group11surveyPackage.TABLE_QUESTION:
				if(context == grammarAccess.getQuestionRule() ||
				   context == grammarAccess.getTableQuestionRule()) {
					sequence_TableQuestion(context, (TableQuestion) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (isFreeText?='freetext'? body=EString (followup+=[Question|EString] followup+=[Question|EString]*)?)
	 */
	protected void sequence_Answer(EObject context, Answer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (isFreeText?='freetext'? body=EString)
	 */
	protected void sequence_Item(EObject context, Item semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         isExclusive?='exclusive'? 
	 *         isOptional?='optional'? 
	 *         body=EString 
	 *         answers+=Answer 
	 *         answers+=Answer*
	 *     )
	 */
	protected void sequence_Question_Impl(EObject context, Question semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString intro=EString? questions+=Question questions+=Question* outro=EString?)
	 */
	protected void sequence_Survey(EObject context, Survey semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         isExclusive?='exclusive'? 
	 *         isOptional?='optional'? 
	 *         body=EString 
	 *         items+=Item 
	 *         items+=Item* 
	 *         answers+=Answer 
	 *         answers+=Answer*
	 *     )
	 */
	protected void sequence_TableQuestion(EObject context, TableQuestion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
