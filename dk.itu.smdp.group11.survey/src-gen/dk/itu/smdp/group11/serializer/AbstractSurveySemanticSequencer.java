package dk.itu.smdp.group11.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import dk.itu.smdp.group11.services.SurveyGrammarAccess;
import group11survey.Answer;
import group11survey.Content;
import group11survey.Group11surveyPackage;
import group11survey.Question;
import group11survey.Survey;
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
			case Group11surveyPackage.CONTENT:
				if(context == grammarAccess.getContentRule()) {
					sequence_Content(context, (Content) semanticObject); 
					return; 
				}
				else break;
			case Group11surveyPackage.QUESTION:
				if(context == grammarAccess.getQuestionRule()) {
					sequence_Question(context, (Question) semanticObject); 
					return; 
				}
				else break;
			case Group11surveyPackage.SURVEY:
				if(context == grammarAccess.getSurveyRule()) {
					sequence_Survey(context, (Survey) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (isFreeText?='free'? content=Content (followup+=Question followup+=Question*)?)
	 */
	protected void sequence_Answer(EObject context, Answer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (body=EString?)
	 */
	protected void sequence_Content(EObject context, Content semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (isExclusive?='ex'? isOptional?='opt'? content=Content answers+=Answer answers+=Answer*)
	 */
	protected void sequence_Question(EObject context, Question semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString intro=Content questions+=Question questions+=Question* outro=Content)
	 */
	protected void sequence_Survey(EObject context, Survey semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
