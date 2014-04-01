package dk.itu.smdp.group11.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.itu.smdp.group11.services.SurveyGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSurveyParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Survey'", "'{'", "'intro'", "'outro'", "'questions'", "','", "'}'", "'isExclusive'", "'isOptional'", "'Question'", "'answers'", "'content'", "'Content'", "'body'", "'Answer'", "'isFreeText'", "'followup'"
    };
    public static final int RULE_ID=5;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalSurveyParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSurveyParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSurveyParser.tokenNames; }
    public String getGrammarFileName() { return "../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g"; }



     	private SurveyGrammarAccess grammarAccess;
     	
        public InternalSurveyParser(TokenStream input, SurveyGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Survey";	
       	}
       	
       	@Override
       	protected SurveyGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSurvey"
    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:67:1: entryRuleSurvey returns [EObject current=null] : iv_ruleSurvey= ruleSurvey EOF ;
    public final EObject entryRuleSurvey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSurvey = null;


        try {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:68:2: (iv_ruleSurvey= ruleSurvey EOF )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:69:2: iv_ruleSurvey= ruleSurvey EOF
            {
             newCompositeNode(grammarAccess.getSurveyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSurvey_in_entryRuleSurvey75);
            iv_ruleSurvey=ruleSurvey();

            state._fsp--;

             current =iv_ruleSurvey; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSurvey85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSurvey"


    // $ANTLR start "ruleSurvey"
    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:76:1: ruleSurvey returns [EObject current=null] : (otherlv_0= 'Survey' otherlv_1= '{' otherlv_2= 'intro' ( (lv_intro_3_0= ruleContent ) ) otherlv_4= 'outro' ( (lv_outro_5_0= ruleContent ) ) otherlv_6= 'questions' otherlv_7= '{' ( (lv_questions_8_0= ruleQuestion ) ) (otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) ) )* otherlv_11= '}' otherlv_12= '}' ) ;
    public final EObject ruleSurvey() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_intro_3_0 = null;

        EObject lv_outro_5_0 = null;

        EObject lv_questions_8_0 = null;

        EObject lv_questions_10_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:79:28: ( (otherlv_0= 'Survey' otherlv_1= '{' otherlv_2= 'intro' ( (lv_intro_3_0= ruleContent ) ) otherlv_4= 'outro' ( (lv_outro_5_0= ruleContent ) ) otherlv_6= 'questions' otherlv_7= '{' ( (lv_questions_8_0= ruleQuestion ) ) (otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) ) )* otherlv_11= '}' otherlv_12= '}' ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:80:1: (otherlv_0= 'Survey' otherlv_1= '{' otherlv_2= 'intro' ( (lv_intro_3_0= ruleContent ) ) otherlv_4= 'outro' ( (lv_outro_5_0= ruleContent ) ) otherlv_6= 'questions' otherlv_7= '{' ( (lv_questions_8_0= ruleQuestion ) ) (otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) ) )* otherlv_11= '}' otherlv_12= '}' )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:80:1: (otherlv_0= 'Survey' otherlv_1= '{' otherlv_2= 'intro' ( (lv_intro_3_0= ruleContent ) ) otherlv_4= 'outro' ( (lv_outro_5_0= ruleContent ) ) otherlv_6= 'questions' otherlv_7= '{' ( (lv_questions_8_0= ruleQuestion ) ) (otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) ) )* otherlv_11= '}' otherlv_12= '}' )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:80:3: otherlv_0= 'Survey' otherlv_1= '{' otherlv_2= 'intro' ( (lv_intro_3_0= ruleContent ) ) otherlv_4= 'outro' ( (lv_outro_5_0= ruleContent ) ) otherlv_6= 'questions' otherlv_7= '{' ( (lv_questions_8_0= ruleQuestion ) ) (otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) ) )* otherlv_11= '}' otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleSurvey122); 

                	newLeafNode(otherlv_0, grammarAccess.getSurveyAccess().getSurveyKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSurvey134); 

                	newLeafNode(otherlv_1, grammarAccess.getSurveyAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSurvey146); 

                	newLeafNode(otherlv_2, grammarAccess.getSurveyAccess().getIntroKeyword_2());
                
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:92:1: ( (lv_intro_3_0= ruleContent ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:93:1: (lv_intro_3_0= ruleContent )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:93:1: (lv_intro_3_0= ruleContent )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:94:3: lv_intro_3_0= ruleContent
            {
             
            	        newCompositeNode(grammarAccess.getSurveyAccess().getIntroContentParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleContent_in_ruleSurvey167);
            lv_intro_3_0=ruleContent();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSurveyRule());
            	        }
                   		set(
                   			current, 
                   			"intro",
                    		lv_intro_3_0, 
                    		"Content");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSurvey179); 

                	newLeafNode(otherlv_4, grammarAccess.getSurveyAccess().getOutroKeyword_4());
                
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:114:1: ( (lv_outro_5_0= ruleContent ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:115:1: (lv_outro_5_0= ruleContent )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:115:1: (lv_outro_5_0= ruleContent )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:116:3: lv_outro_5_0= ruleContent
            {
             
            	        newCompositeNode(grammarAccess.getSurveyAccess().getOutroContentParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleContent_in_ruleSurvey200);
            lv_outro_5_0=ruleContent();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSurveyRule());
            	        }
                   		set(
                   			current, 
                   			"outro",
                    		lv_outro_5_0, 
                    		"Content");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSurvey212); 

                	newLeafNode(otherlv_6, grammarAccess.getSurveyAccess().getQuestionsKeyword_6());
                
            otherlv_7=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSurvey224); 

                	newLeafNode(otherlv_7, grammarAccess.getSurveyAccess().getLeftCurlyBracketKeyword_7());
                
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:140:1: ( (lv_questions_8_0= ruleQuestion ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:141:1: (lv_questions_8_0= ruleQuestion )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:141:1: (lv_questions_8_0= ruleQuestion )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:142:3: lv_questions_8_0= ruleQuestion
            {
             
            	        newCompositeNode(grammarAccess.getSurveyAccess().getQuestionsQuestionParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleSurvey245);
            lv_questions_8_0=ruleQuestion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSurveyRule());
            	        }
                   		add(
                   			current, 
                   			"questions",
                    		lv_questions_8_0, 
                    		"Question");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:158:2: (otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:158:4: otherlv_9= ',' ( (lv_questions_10_0= ruleQuestion ) )
            	    {
            	    otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSurvey258); 

            	        	newLeafNode(otherlv_9, grammarAccess.getSurveyAccess().getCommaKeyword_9_0());
            	        
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:162:1: ( (lv_questions_10_0= ruleQuestion ) )
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:163:1: (lv_questions_10_0= ruleQuestion )
            	    {
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:163:1: (lv_questions_10_0= ruleQuestion )
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:164:3: lv_questions_10_0= ruleQuestion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSurveyAccess().getQuestionsQuestionParserRuleCall_9_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleSurvey279);
            	    lv_questions_10_0=ruleQuestion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSurveyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"questions",
            	            		lv_questions_10_0, 
            	            		"Question");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSurvey293); 

                	newLeafNode(otherlv_11, grammarAccess.getSurveyAccess().getRightCurlyBracketKeyword_10());
                
            otherlv_12=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSurvey305); 

                	newLeafNode(otherlv_12, grammarAccess.getSurveyAccess().getRightCurlyBracketKeyword_11());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSurvey"


    // $ANTLR start "entryRuleQuestion"
    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:196:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:197:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:198:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_entryRuleQuestion341);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuestion351); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:205:1: ruleQuestion returns [EObject current=null] : ( ( (lv_isExclusive_0_0= 'isExclusive' ) )? ( (lv_isOptional_1_0= 'isOptional' ) )? otherlv_2= 'Question' otherlv_3= '{' otherlv_4= 'answers' otherlv_5= '{' ( (lv_answers_6_0= ruleAnswer ) ) (otherlv_7= ',' ( (lv_answers_8_0= ruleAnswer ) ) )* otherlv_9= '}' otherlv_10= 'content' ( (lv_content_11_0= ruleContent ) ) otherlv_12= '}' ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_isExclusive_0_0=null;
        Token lv_isOptional_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_answers_6_0 = null;

        EObject lv_answers_8_0 = null;

        EObject lv_content_11_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:208:28: ( ( ( (lv_isExclusive_0_0= 'isExclusive' ) )? ( (lv_isOptional_1_0= 'isOptional' ) )? otherlv_2= 'Question' otherlv_3= '{' otherlv_4= 'answers' otherlv_5= '{' ( (lv_answers_6_0= ruleAnswer ) ) (otherlv_7= ',' ( (lv_answers_8_0= ruleAnswer ) ) )* otherlv_9= '}' otherlv_10= 'content' ( (lv_content_11_0= ruleContent ) ) otherlv_12= '}' ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:209:1: ( ( (lv_isExclusive_0_0= 'isExclusive' ) )? ( (lv_isOptional_1_0= 'isOptional' ) )? otherlv_2= 'Question' otherlv_3= '{' otherlv_4= 'answers' otherlv_5= '{' ( (lv_answers_6_0= ruleAnswer ) ) (otherlv_7= ',' ( (lv_answers_8_0= ruleAnswer ) ) )* otherlv_9= '}' otherlv_10= 'content' ( (lv_content_11_0= ruleContent ) ) otherlv_12= '}' )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:209:1: ( ( (lv_isExclusive_0_0= 'isExclusive' ) )? ( (lv_isOptional_1_0= 'isOptional' ) )? otherlv_2= 'Question' otherlv_3= '{' otherlv_4= 'answers' otherlv_5= '{' ( (lv_answers_6_0= ruleAnswer ) ) (otherlv_7= ',' ( (lv_answers_8_0= ruleAnswer ) ) )* otherlv_9= '}' otherlv_10= 'content' ( (lv_content_11_0= ruleContent ) ) otherlv_12= '}' )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:209:2: ( (lv_isExclusive_0_0= 'isExclusive' ) )? ( (lv_isOptional_1_0= 'isOptional' ) )? otherlv_2= 'Question' otherlv_3= '{' otherlv_4= 'answers' otherlv_5= '{' ( (lv_answers_6_0= ruleAnswer ) ) (otherlv_7= ',' ( (lv_answers_8_0= ruleAnswer ) ) )* otherlv_9= '}' otherlv_10= 'content' ( (lv_content_11_0= ruleContent ) ) otherlv_12= '}'
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:209:2: ( (lv_isExclusive_0_0= 'isExclusive' ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:210:1: (lv_isExclusive_0_0= 'isExclusive' )
                    {
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:210:1: (lv_isExclusive_0_0= 'isExclusive' )
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:211:3: lv_isExclusive_0_0= 'isExclusive'
                    {
                    lv_isExclusive_0_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleQuestion394); 

                            newLeafNode(lv_isExclusive_0_0, grammarAccess.getQuestionAccess().getIsExclusiveIsExclusiveKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQuestionRule());
                    	        }
                           		setWithLastConsumed(current, "isExclusive", true, "isExclusive");
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:224:3: ( (lv_isOptional_1_0= 'isOptional' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:225:1: (lv_isOptional_1_0= 'isOptional' )
                    {
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:225:1: (lv_isOptional_1_0= 'isOptional' )
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:226:3: lv_isOptional_1_0= 'isOptional'
                    {
                    lv_isOptional_1_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleQuestion426); 

                            newLeafNode(lv_isOptional_1_0, grammarAccess.getQuestionAccess().getIsOptionalIsOptionalKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQuestionRule());
                    	        }
                           		setWithLastConsumed(current, "isOptional", true, "isOptional");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleQuestion452); 

                	newLeafNode(otherlv_2, grammarAccess.getQuestionAccess().getQuestionKeyword_2());
                
            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleQuestion464); 

                	newLeafNode(otherlv_3, grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleQuestion476); 

                	newLeafNode(otherlv_4, grammarAccess.getQuestionAccess().getAnswersKeyword_4());
                
            otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleQuestion488); 

                	newLeafNode(otherlv_5, grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_5());
                
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:255:1: ( (lv_answers_6_0= ruleAnswer ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:256:1: (lv_answers_6_0= ruleAnswer )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:256:1: (lv_answers_6_0= ruleAnswer )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:257:3: lv_answers_6_0= ruleAnswer
            {
             
            	        newCompositeNode(grammarAccess.getQuestionAccess().getAnswersAnswerParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleQuestion509);
            lv_answers_6_0=ruleAnswer();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuestionRule());
            	        }
                   		add(
                   			current, 
                   			"answers",
                    		lv_answers_6_0, 
                    		"Answer");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:273:2: (otherlv_7= ',' ( (lv_answers_8_0= ruleAnswer ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:273:4: otherlv_7= ',' ( (lv_answers_8_0= ruleAnswer ) )
            	    {
            	    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleQuestion522); 

            	        	newLeafNode(otherlv_7, grammarAccess.getQuestionAccess().getCommaKeyword_7_0());
            	        
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:277:1: ( (lv_answers_8_0= ruleAnswer ) )
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:278:1: (lv_answers_8_0= ruleAnswer )
            	    {
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:278:1: (lv_answers_8_0= ruleAnswer )
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:279:3: lv_answers_8_0= ruleAnswer
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuestionAccess().getAnswersAnswerParserRuleCall_7_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleQuestion543);
            	    lv_answers_8_0=ruleAnswer();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQuestionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"answers",
            	            		lv_answers_8_0, 
            	            		"Answer");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleQuestion557); 

                	newLeafNode(otherlv_9, grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_8());
                
            otherlv_10=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleQuestion569); 

                	newLeafNode(otherlv_10, grammarAccess.getQuestionAccess().getContentKeyword_9());
                
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:303:1: ( (lv_content_11_0= ruleContent ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:304:1: (lv_content_11_0= ruleContent )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:304:1: (lv_content_11_0= ruleContent )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:305:3: lv_content_11_0= ruleContent
            {
             
            	        newCompositeNode(grammarAccess.getQuestionAccess().getContentContentParserRuleCall_10_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleContent_in_ruleQuestion590);
            lv_content_11_0=ruleContent();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"content",
                    		lv_content_11_0, 
                    		"Content");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_12=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleQuestion602); 

                	newLeafNode(otherlv_12, grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_11());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleContent"
    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:333:1: entryRuleContent returns [EObject current=null] : iv_ruleContent= ruleContent EOF ;
    public final EObject entryRuleContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContent = null;


        try {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:334:2: (iv_ruleContent= ruleContent EOF )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:335:2: iv_ruleContent= ruleContent EOF
            {
             newCompositeNode(grammarAccess.getContentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleContent_in_entryRuleContent638);
            iv_ruleContent=ruleContent();

            state._fsp--;

             current =iv_ruleContent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleContent648); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContent"


    // $ANTLR start "ruleContent"
    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:342:1: ruleContent returns [EObject current=null] : ( () otherlv_1= 'Content' otherlv_2= '{' (otherlv_3= 'body' ( (lv_body_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_body_4_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:345:28: ( ( () otherlv_1= 'Content' otherlv_2= '{' (otherlv_3= 'body' ( (lv_body_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:346:1: ( () otherlv_1= 'Content' otherlv_2= '{' (otherlv_3= 'body' ( (lv_body_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:346:1: ( () otherlv_1= 'Content' otherlv_2= '{' (otherlv_3= 'body' ( (lv_body_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:346:2: () otherlv_1= 'Content' otherlv_2= '{' (otherlv_3= 'body' ( (lv_body_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:346:2: ()
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:347:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getContentAccess().getContentAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleContent694); 

                	newLeafNode(otherlv_1, grammarAccess.getContentAccess().getContentKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleContent706); 

                	newLeafNode(otherlv_2, grammarAccess.getContentAccess().getLeftCurlyBracketKeyword_2());
                
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:360:1: (otherlv_3= 'body' ( (lv_body_4_0= ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:360:3: otherlv_3= 'body' ( (lv_body_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleContent719); 

                        	newLeafNode(otherlv_3, grammarAccess.getContentAccess().getBodyKeyword_3_0());
                        
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:364:1: ( (lv_body_4_0= ruleEString ) )
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:365:1: (lv_body_4_0= ruleEString )
                    {
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:365:1: (lv_body_4_0= ruleEString )
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:366:3: lv_body_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getContentAccess().getBodyEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleContent740);
                    lv_body_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContentRule());
                    	        }
                           		set(
                           			current, 
                           			"body",
                            		lv_body_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleContent754); 

                	newLeafNode(otherlv_5, grammarAccess.getContentAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContent"


    // $ANTLR start "entryRuleAnswer"
    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:394:1: entryRuleAnswer returns [EObject current=null] : iv_ruleAnswer= ruleAnswer EOF ;
    public final EObject entryRuleAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswer = null;


        try {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:395:2: (iv_ruleAnswer= ruleAnswer EOF )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:396:2: iv_ruleAnswer= ruleAnswer EOF
            {
             newCompositeNode(grammarAccess.getAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_entryRuleAnswer790);
            iv_ruleAnswer=ruleAnswer();

            state._fsp--;

             current =iv_ruleAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswer800); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnswer"


    // $ANTLR start "ruleAnswer"
    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:403:1: ruleAnswer returns [EObject current=null] : (otherlv_0= 'Answer' otherlv_1= '{' (otherlv_2= 'isFreeText' ( (lv_isFreeText_3_0= ruleEString ) ) )? otherlv_4= 'content' ( (lv_content_5_0= ruleContent ) ) (otherlv_6= 'followup' ( (lv_followup_7_0= ruleQuestion ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_isFreeText_3_0 = null;

        EObject lv_content_5_0 = null;

        EObject lv_followup_7_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:406:28: ( (otherlv_0= 'Answer' otherlv_1= '{' (otherlv_2= 'isFreeText' ( (lv_isFreeText_3_0= ruleEString ) ) )? otherlv_4= 'content' ( (lv_content_5_0= ruleContent ) ) (otherlv_6= 'followup' ( (lv_followup_7_0= ruleQuestion ) ) )? otherlv_8= '}' ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:407:1: (otherlv_0= 'Answer' otherlv_1= '{' (otherlv_2= 'isFreeText' ( (lv_isFreeText_3_0= ruleEString ) ) )? otherlv_4= 'content' ( (lv_content_5_0= ruleContent ) ) (otherlv_6= 'followup' ( (lv_followup_7_0= ruleQuestion ) ) )? otherlv_8= '}' )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:407:1: (otherlv_0= 'Answer' otherlv_1= '{' (otherlv_2= 'isFreeText' ( (lv_isFreeText_3_0= ruleEString ) ) )? otherlv_4= 'content' ( (lv_content_5_0= ruleContent ) ) (otherlv_6= 'followup' ( (lv_followup_7_0= ruleQuestion ) ) )? otherlv_8= '}' )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:407:3: otherlv_0= 'Answer' otherlv_1= '{' (otherlv_2= 'isFreeText' ( (lv_isFreeText_3_0= ruleEString ) ) )? otherlv_4= 'content' ( (lv_content_5_0= ruleContent ) ) (otherlv_6= 'followup' ( (lv_followup_7_0= ruleQuestion ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleAnswer837); 

                	newLeafNode(otherlv_0, grammarAccess.getAnswerAccess().getAnswerKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAnswer849); 

                	newLeafNode(otherlv_1, grammarAccess.getAnswerAccess().getLeftCurlyBracketKeyword_1());
                
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:415:1: (otherlv_2= 'isFreeText' ( (lv_isFreeText_3_0= ruleEString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:415:3: otherlv_2= 'isFreeText' ( (lv_isFreeText_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleAnswer862); 

                        	newLeafNode(otherlv_2, grammarAccess.getAnswerAccess().getIsFreeTextKeyword_2_0());
                        
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:419:1: ( (lv_isFreeText_3_0= ruleEString ) )
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:420:1: (lv_isFreeText_3_0= ruleEString )
                    {
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:420:1: (lv_isFreeText_3_0= ruleEString )
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:421:3: lv_isFreeText_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnswerAccess().getIsFreeTextEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnswer883);
                    lv_isFreeText_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAnswerRule());
                    	        }
                           		set(
                           			current, 
                           			"isFreeText",
                            		lv_isFreeText_3_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAnswer897); 

                	newLeafNode(otherlv_4, grammarAccess.getAnswerAccess().getContentKeyword_3());
                
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:441:1: ( (lv_content_5_0= ruleContent ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:442:1: (lv_content_5_0= ruleContent )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:442:1: (lv_content_5_0= ruleContent )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:443:3: lv_content_5_0= ruleContent
            {
             
            	        newCompositeNode(grammarAccess.getAnswerAccess().getContentContentParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleContent_in_ruleAnswer918);
            lv_content_5_0=ruleContent();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAnswerRule());
            	        }
                   		set(
                   			current, 
                   			"content",
                    		lv_content_5_0, 
                    		"Content");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:459:2: (otherlv_6= 'followup' ( (lv_followup_7_0= ruleQuestion ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:459:4: otherlv_6= 'followup' ( (lv_followup_7_0= ruleQuestion ) )
                    {
                    otherlv_6=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleAnswer931); 

                        	newLeafNode(otherlv_6, grammarAccess.getAnswerAccess().getFollowupKeyword_5_0());
                        
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:463:1: ( (lv_followup_7_0= ruleQuestion ) )
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:464:1: (lv_followup_7_0= ruleQuestion )
                    {
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:464:1: (lv_followup_7_0= ruleQuestion )
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:465:3: lv_followup_7_0= ruleQuestion
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnswerAccess().getFollowupQuestionParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleAnswer952);
                    lv_followup_7_0=ruleQuestion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAnswerRule());
                    	        }
                           		set(
                           			current, 
                           			"followup",
                            		lv_followup_7_0, 
                            		"Question");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAnswer966); 

                	newLeafNode(otherlv_8, grammarAccess.getAnswerAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnswer"


    // $ANTLR start "entryRuleEString"
    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:495:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:496:2: (iv_ruleEString= ruleEString EOF )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:497:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1005);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1016); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:504:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:507:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:508:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:508:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:508:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1056); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:516:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1082); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleSurvey_in_entryRuleSurvey75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSurvey85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleSurvey122 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSurvey134 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSurvey146 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleContent_in_ruleSurvey167 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSurvey179 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleContent_in_ruleSurvey200 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleSurvey212 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSurvey224 = new BitSet(new long[]{0x00000000001C0000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleSurvey245 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleSurvey258 = new BitSet(new long[]{0x00000000001C0000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleSurvey279 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleSurvey293 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleSurvey305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion341 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuestion351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleQuestion394 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleQuestion426 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleQuestion452 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleQuestion464 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleQuestion476 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleQuestion488 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleQuestion509 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleQuestion522 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleQuestion543 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleQuestion557 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleQuestion569 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleContent_in_ruleQuestion590 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleQuestion602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContent_in_entryRuleContent638 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContent648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleContent694 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleContent706 = new BitSet(new long[]{0x0000000001020000L});
        public static final BitSet FOLLOW_24_in_ruleContent719 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleContent740 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleContent754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_entryRuleAnswer790 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswer800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleAnswer837 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAnswer849 = new BitSet(new long[]{0x0000000004400000L});
        public static final BitSet FOLLOW_26_in_ruleAnswer862 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnswer883 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleAnswer897 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleContent_in_ruleAnswer918 = new BitSet(new long[]{0x0000000008020000L});
        public static final BitSet FOLLOW_27_in_ruleAnswer931 = new BitSet(new long[]{0x00000000001C0000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleAnswer952 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleAnswer966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1005 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1082 = new BitSet(new long[]{0x0000000000000002L});
    }


}