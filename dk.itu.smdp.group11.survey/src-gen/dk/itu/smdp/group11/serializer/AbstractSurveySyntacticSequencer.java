package dk.itu.smdp.group11.serializer;

import com.google.inject.Inject;
import dk.itu.smdp.group11.services.SurveyGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public abstract class AbstractSurveySyntacticSequencer extends AbstractSyntacticSequencer {

	protected SurveyGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Survey_IntroKeyword_1_0_or_IntroKeyword_1_1;
	protected AbstractElementAlias match_Survey_OutroKeyword_5_0_or_OutroKeyword_5_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SurveyGrammarAccess) access;
		match_Survey_IntroKeyword_1_0_or_IntroKeyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getSurveyAccess().getIntroKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getSurveyAccess().getIntroKeyword_1_1()));
		match_Survey_OutroKeyword_5_0_or_OutroKeyword_5_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getSurveyAccess().getOutroKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getSurveyAccess().getOutroKeyword_5_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Survey_IntroKeyword_1_0_or_IntroKeyword_1_1.equals(syntax))
				emit_Survey_IntroKeyword_1_0_or_IntroKeyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Survey_OutroKeyword_5_0_or_OutroKeyword_5_1.equals(syntax))
				emit_Survey_OutroKeyword_5_0_or_OutroKeyword_5_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'Intro' | 'intro'
	 */
	protected void emit_Survey_IntroKeyword_1_0_or_IntroKeyword_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'outro' | 'Outro'
	 */
	protected void emit_Survey_OutroKeyword_5_0_or_OutroKeyword_5_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
