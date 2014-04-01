/*
* generated by Xtext
*/
package dk.itu.smdp.group11.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class SurveyGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class SurveyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Survey");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSurveyKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cIntroKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cIntroAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cIntroContentParserRuleCall_3_0 = (RuleCall)cIntroAssignment_3.eContents().get(0);
		private final Keyword cOutroKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cOutroAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cOutroContentParserRuleCall_5_0 = (RuleCall)cOutroAssignment_5.eContents().get(0);
		private final Keyword cQuestionsKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cLeftCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cQuestionsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cQuestionsQuestionParserRuleCall_8_0 = (RuleCall)cQuestionsAssignment_8.eContents().get(0);
		private final Group cGroup_9 = (Group)cGroup.eContents().get(9);
		private final Keyword cCommaKeyword_9_0 = (Keyword)cGroup_9.eContents().get(0);
		private final Assignment cQuestionsAssignment_9_1 = (Assignment)cGroup_9.eContents().get(1);
		private final RuleCall cQuestionsQuestionParserRuleCall_9_1_0 = (RuleCall)cQuestionsAssignment_9_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cRightCurlyBracketKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//Survey:
		//	"Survey" "{" "intro" intro=Content "outro" outro=Content "questions" "{" questions+=Question (","
		//	questions+=Question)* "}" "}";
		public ParserRule getRule() { return rule; }

		//"Survey" "{" "intro" intro=Content "outro" outro=Content "questions" "{" questions+=Question ("," questions+=Question)*
		//"}" "}"
		public Group getGroup() { return cGroup; }

		//"Survey"
		public Keyword getSurveyKeyword_0() { return cSurveyKeyword_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }

		//"intro"
		public Keyword getIntroKeyword_2() { return cIntroKeyword_2; }

		//intro=Content
		public Assignment getIntroAssignment_3() { return cIntroAssignment_3; }

		//Content
		public RuleCall getIntroContentParserRuleCall_3_0() { return cIntroContentParserRuleCall_3_0; }

		//"outro"
		public Keyword getOutroKeyword_4() { return cOutroKeyword_4; }

		//outro=Content
		public Assignment getOutroAssignment_5() { return cOutroAssignment_5; }

		//Content
		public RuleCall getOutroContentParserRuleCall_5_0() { return cOutroContentParserRuleCall_5_0; }

		//"questions"
		public Keyword getQuestionsKeyword_6() { return cQuestionsKeyword_6; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_7() { return cLeftCurlyBracketKeyword_7; }

		//questions+=Question
		public Assignment getQuestionsAssignment_8() { return cQuestionsAssignment_8; }

		//Question
		public RuleCall getQuestionsQuestionParserRuleCall_8_0() { return cQuestionsQuestionParserRuleCall_8_0; }

		//("," questions+=Question)*
		public Group getGroup_9() { return cGroup_9; }

		//","
		public Keyword getCommaKeyword_9_0() { return cCommaKeyword_9_0; }

		//questions+=Question
		public Assignment getQuestionsAssignment_9_1() { return cQuestionsAssignment_9_1; }

		//Question
		public RuleCall getQuestionsQuestionParserRuleCall_9_1_0() { return cQuestionsQuestionParserRuleCall_9_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_11() { return cRightCurlyBracketKeyword_11; }
	}

	public class QuestionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Question");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cIsExclusiveAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cIsExclusiveIsExclusiveKeyword_0_0 = (Keyword)cIsExclusiveAssignment_0.eContents().get(0);
		private final Assignment cIsOptionalAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Keyword cIsOptionalIsOptionalKeyword_1_0 = (Keyword)cIsOptionalAssignment_1.eContents().get(0);
		private final Keyword cQuestionKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cAnswersKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cLeftCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cAnswersAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cAnswersAnswerParserRuleCall_6_0 = (RuleCall)cAnswersAssignment_6.eContents().get(0);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cCommaKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Assignment cAnswersAssignment_7_1 = (Assignment)cGroup_7.eContents().get(1);
		private final RuleCall cAnswersAnswerParserRuleCall_7_1_0 = (RuleCall)cAnswersAssignment_7_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Keyword cContentKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Assignment cContentAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cContentContentParserRuleCall_10_0 = (RuleCall)cContentAssignment_10.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//Question:
		//	isExclusive?="isExclusive"? isOptional?="isOptional"? "Question" "{" "answers" "{" answers+=Answer (","
		//	answers+=Answer)* "}" "content" content=Content "}";
		public ParserRule getRule() { return rule; }

		//isExclusive?="isExclusive"? isOptional?="isOptional"? "Question" "{" "answers" "{" answers+=Answer (","
		//answers+=Answer)* "}" "content" content=Content "}"
		public Group getGroup() { return cGroup; }

		//isExclusive?="isExclusive"?
		public Assignment getIsExclusiveAssignment_0() { return cIsExclusiveAssignment_0; }

		//"isExclusive"
		public Keyword getIsExclusiveIsExclusiveKeyword_0_0() { return cIsExclusiveIsExclusiveKeyword_0_0; }

		//isOptional?="isOptional"?
		public Assignment getIsOptionalAssignment_1() { return cIsOptionalAssignment_1; }

		//"isOptional"
		public Keyword getIsOptionalIsOptionalKeyword_1_0() { return cIsOptionalIsOptionalKeyword_1_0; }

		//"Question"
		public Keyword getQuestionKeyword_2() { return cQuestionKeyword_2; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//"answers"
		public Keyword getAnswersKeyword_4() { return cAnswersKeyword_4; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_5() { return cLeftCurlyBracketKeyword_5; }

		//answers+=Answer
		public Assignment getAnswersAssignment_6() { return cAnswersAssignment_6; }

		//Answer
		public RuleCall getAnswersAnswerParserRuleCall_6_0() { return cAnswersAnswerParserRuleCall_6_0; }

		//("," answers+=Answer)*
		public Group getGroup_7() { return cGroup_7; }

		//","
		public Keyword getCommaKeyword_7_0() { return cCommaKeyword_7_0; }

		//answers+=Answer
		public Assignment getAnswersAssignment_7_1() { return cAnswersAssignment_7_1; }

		//Answer
		public RuleCall getAnswersAnswerParserRuleCall_7_1_0() { return cAnswersAnswerParserRuleCall_7_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }

		//"content"
		public Keyword getContentKeyword_9() { return cContentKeyword_9; }

		//content=Content
		public Assignment getContentAssignment_10() { return cContentAssignment_10; }

		//Content
		public RuleCall getContentContentParserRuleCall_10_0() { return cContentContentParserRuleCall_10_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_11() { return cRightCurlyBracketKeyword_11; }
	}

	public class ContentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Content");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cContentAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cContentKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cBodyKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cBodyAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cBodyEStringParserRuleCall_3_1_0 = (RuleCall)cBodyAssignment_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Content:
		//	{Content} "Content" "{" ("body" body=EString)? "}";
		public ParserRule getRule() { return rule; }

		//{Content} "Content" "{" ("body" body=EString)? "}"
		public Group getGroup() { return cGroup; }

		//{Content}
		public Action getContentAction_0() { return cContentAction_0; }

		//"Content"
		public Keyword getContentKeyword_1() { return cContentKeyword_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//("body" body=EString)?
		public Group getGroup_3() { return cGroup_3; }

		//"body"
		public Keyword getBodyKeyword_3_0() { return cBodyKeyword_3_0; }

		//body=EString
		public Assignment getBodyAssignment_3_1() { return cBodyAssignment_3_1; }

		//EString
		public RuleCall getBodyEStringParserRuleCall_3_1_0() { return cBodyEStringParserRuleCall_3_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class AnswerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Answer");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAnswerKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cIsFreeTextKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cIsFreeTextAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cIsFreeTextEStringParserRuleCall_2_1_0 = (RuleCall)cIsFreeTextAssignment_2_1.eContents().get(0);
		private final Keyword cContentKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cContentAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cContentContentParserRuleCall_4_0 = (RuleCall)cContentAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cFollowupKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cFollowupAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cFollowupQuestionParserRuleCall_5_1_0 = (RuleCall)cFollowupAssignment_5_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Answer:
		//	"Answer" "{" ("isFreeText" isFreeText=EString)? "content" content=Content ("followup" followup=Question)? "}";
		public ParserRule getRule() { return rule; }

		//"Answer" "{" ("isFreeText" isFreeText=EString)? "content" content=Content ("followup" followup=Question)? "}"
		public Group getGroup() { return cGroup; }

		//"Answer"
		public Keyword getAnswerKeyword_0() { return cAnswerKeyword_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }

		//("isFreeText" isFreeText=EString)?
		public Group getGroup_2() { return cGroup_2; }

		//"isFreeText"
		public Keyword getIsFreeTextKeyword_2_0() { return cIsFreeTextKeyword_2_0; }

		//isFreeText=EString
		public Assignment getIsFreeTextAssignment_2_1() { return cIsFreeTextAssignment_2_1; }

		//EString
		public RuleCall getIsFreeTextEStringParserRuleCall_2_1_0() { return cIsFreeTextEStringParserRuleCall_2_1_0; }

		//"content"
		public Keyword getContentKeyword_3() { return cContentKeyword_3; }

		//content=Content
		public Assignment getContentAssignment_4() { return cContentAssignment_4; }

		//Content
		public RuleCall getContentContentParserRuleCall_4_0() { return cContentContentParserRuleCall_4_0; }

		//("followup" followup=Question)?
		public Group getGroup_5() { return cGroup_5; }

		//"followup"
		public Keyword getFollowupKeyword_5_0() { return cFollowupKeyword_5_0; }

		//followup=Question
		public Assignment getFollowupAssignment_5_1() { return cFollowupAssignment_5_1; }

		//Question
		public RuleCall getFollowupQuestionParserRuleCall_5_1_0() { return cFollowupQuestionParserRuleCall_5_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}

	public class EBooleanElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EBoolean");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cTrueKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cFalseKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		
		//EBoolean returns ecore::EBoolean:
		//	"true" | "false";
		public ParserRule getRule() { return rule; }

		//"true" | "false"
		public Alternatives getAlternatives() { return cAlternatives; }

		//"true"
		public Keyword getTrueKeyword_0() { return cTrueKeyword_0; }

		//"false"
		public Keyword getFalseKeyword_1() { return cFalseKeyword_1; }
	}

	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString returns ecore::EString:
		//	STRING | ID;
		public ParserRule getRule() { return rule; }

		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }

		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	
	
	private SurveyElements pSurvey;
	private QuestionElements pQuestion;
	private ContentElements pContent;
	private AnswerElements pAnswer;
	private EBooleanElements pEBoolean;
	private EStringElements pEString;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public SurveyGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("dk.itu.smdp.group11.Survey".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Survey:
	//	"Survey" "{" "intro" intro=Content "outro" outro=Content "questions" "{" questions+=Question (","
	//	questions+=Question)* "}" "}";
	public SurveyElements getSurveyAccess() {
		return (pSurvey != null) ? pSurvey : (pSurvey = new SurveyElements());
	}
	
	public ParserRule getSurveyRule() {
		return getSurveyAccess().getRule();
	}

	//Question:
	//	isExclusive?="isExclusive"? isOptional?="isOptional"? "Question" "{" "answers" "{" answers+=Answer (","
	//	answers+=Answer)* "}" "content" content=Content "}";
	public QuestionElements getQuestionAccess() {
		return (pQuestion != null) ? pQuestion : (pQuestion = new QuestionElements());
	}
	
	public ParserRule getQuestionRule() {
		return getQuestionAccess().getRule();
	}

	//Content:
	//	{Content} "Content" "{" ("body" body=EString)? "}";
	public ContentElements getContentAccess() {
		return (pContent != null) ? pContent : (pContent = new ContentElements());
	}
	
	public ParserRule getContentRule() {
		return getContentAccess().getRule();
	}

	//Answer:
	//	"Answer" "{" ("isFreeText" isFreeText=EString)? "content" content=Content ("followup" followup=Question)? "}";
	public AnswerElements getAnswerAccess() {
		return (pAnswer != null) ? pAnswer : (pAnswer = new AnswerElements());
	}
	
	public ParserRule getAnswerRule() {
		return getAnswerAccess().getRule();
	}

	//EBoolean returns ecore::EBoolean:
	//	"true" | "false";
	public EBooleanElements getEBooleanAccess() {
		return (pEBoolean != null) ? pEBoolean : (pEBoolean = new EBooleanElements());
	}
	
	public ParserRule getEBooleanRule() {
		return getEBooleanAccess().getRule();
	}

	//EString returns ecore::EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return (pEString != null) ? pEString : (pEString = new EStringElements());
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
