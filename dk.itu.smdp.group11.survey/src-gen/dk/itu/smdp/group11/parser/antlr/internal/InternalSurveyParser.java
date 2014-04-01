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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Survey'", "'Intro'", "'Outro'", "'Question'", "'ex'", "'opt'", "'('", "')'", "'Answer'", "'free'"
    };
    public static final int T__19=19;
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__20=20;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

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
    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:76:1: ruleSurvey returns [EObject current=null] : (otherlv_0= 'Survey' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'Intro' ( (lv_intro_3_0= ruleContent ) ) ( (lv_questions_4_0= ruleQuestion ) ) ( (lv_questions_5_0= ruleQuestion ) )* otherlv_6= 'Outro' ( (lv_outro_7_0= ruleContent ) ) ) ;
    public final EObject ruleSurvey() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_intro_3_0 = null;

        EObject lv_questions_4_0 = null;

        EObject lv_questions_5_0 = null;

        EObject lv_outro_7_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:79:28: ( (otherlv_0= 'Survey' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'Intro' ( (lv_intro_3_0= ruleContent ) ) ( (lv_questions_4_0= ruleQuestion ) ) ( (lv_questions_5_0= ruleQuestion ) )* otherlv_6= 'Outro' ( (lv_outro_7_0= ruleContent ) ) ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:80:1: (otherlv_0= 'Survey' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'Intro' ( (lv_intro_3_0= ruleContent ) ) ( (lv_questions_4_0= ruleQuestion ) ) ( (lv_questions_5_0= ruleQuestion ) )* otherlv_6= 'Outro' ( (lv_outro_7_0= ruleContent ) ) )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:80:1: (otherlv_0= 'Survey' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'Intro' ( (lv_intro_3_0= ruleContent ) ) ( (lv_questions_4_0= ruleQuestion ) ) ( (lv_questions_5_0= ruleQuestion ) )* otherlv_6= 'Outro' ( (lv_outro_7_0= ruleContent ) ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:80:3: otherlv_0= 'Survey' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'Intro' ( (lv_intro_3_0= ruleContent ) ) ( (lv_questions_4_0= ruleQuestion ) ) ( (lv_questions_5_0= ruleQuestion ) )* otherlv_6= 'Outro' ( (lv_outro_7_0= ruleContent ) )
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleSurvey122); 

                	newLeafNode(otherlv_0, grammarAccess.getSurveyAccess().getSurveyKeyword_0());
                
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:84:1: ( (lv_name_1_0= ruleEString ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:85:1: (lv_name_1_0= ruleEString )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:85:1: (lv_name_1_0= ruleEString )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:86:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSurveyAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSurvey143);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSurveyRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSurvey155); 

                	newLeafNode(otherlv_2, grammarAccess.getSurveyAccess().getIntroKeyword_2());
                
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:106:1: ( (lv_intro_3_0= ruleContent ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:107:1: (lv_intro_3_0= ruleContent )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:107:1: (lv_intro_3_0= ruleContent )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:108:3: lv_intro_3_0= ruleContent
            {
             
            	        newCompositeNode(grammarAccess.getSurveyAccess().getIntroContentParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleContent_in_ruleSurvey176);
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

            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:124:2: ( (lv_questions_4_0= ruleQuestion ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:125:1: (lv_questions_4_0= ruleQuestion )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:125:1: (lv_questions_4_0= ruleQuestion )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:126:3: lv_questions_4_0= ruleQuestion
            {
             
            	        newCompositeNode(grammarAccess.getSurveyAccess().getQuestionsQuestionParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleSurvey197);
            lv_questions_4_0=ruleQuestion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSurveyRule());
            	        }
                   		add(
                   			current, 
                   			"questions",
                    		lv_questions_4_0, 
                    		"Question");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:142:2: ( (lv_questions_5_0= ruleQuestion ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:143:1: (lv_questions_5_0= ruleQuestion )
            	    {
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:143:1: (lv_questions_5_0= ruleQuestion )
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:144:3: lv_questions_5_0= ruleQuestion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSurveyAccess().getQuestionsQuestionParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleSurvey218);
            	    lv_questions_5_0=ruleQuestion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSurveyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"questions",
            	            		lv_questions_5_0, 
            	            		"Question");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSurvey231); 

                	newLeafNode(otherlv_6, grammarAccess.getSurveyAccess().getOutroKeyword_6());
                
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:164:1: ( (lv_outro_7_0= ruleContent ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:165:1: (lv_outro_7_0= ruleContent )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:165:1: (lv_outro_7_0= ruleContent )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:166:3: lv_outro_7_0= ruleContent
            {
             
            	        newCompositeNode(grammarAccess.getSurveyAccess().getOutroContentParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleContent_in_ruleSurvey252);
            lv_outro_7_0=ruleContent();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSurveyRule());
            	        }
                   		set(
                   			current, 
                   			"outro",
                    		lv_outro_7_0, 
                    		"Content");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


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
    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:190:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:191:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:192:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_entryRuleQuestion288);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuestion298); 

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
    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:199:1: ruleQuestion returns [EObject current=null] : (otherlv_0= 'Question' ( (lv_isExclusive_1_0= 'ex' ) )? ( (lv_isOptional_2_0= 'opt' ) )? ( (lv_content_3_0= ruleContent ) ) otherlv_4= '(' ( (lv_answers_5_0= ruleAnswer ) ) ( (lv_answers_6_0= ruleAnswer ) )* otherlv_7= ')' ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isExclusive_1_0=null;
        Token lv_isOptional_2_0=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_content_3_0 = null;

        EObject lv_answers_5_0 = null;

        EObject lv_answers_6_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:202:28: ( (otherlv_0= 'Question' ( (lv_isExclusive_1_0= 'ex' ) )? ( (lv_isOptional_2_0= 'opt' ) )? ( (lv_content_3_0= ruleContent ) ) otherlv_4= '(' ( (lv_answers_5_0= ruleAnswer ) ) ( (lv_answers_6_0= ruleAnswer ) )* otherlv_7= ')' ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:203:1: (otherlv_0= 'Question' ( (lv_isExclusive_1_0= 'ex' ) )? ( (lv_isOptional_2_0= 'opt' ) )? ( (lv_content_3_0= ruleContent ) ) otherlv_4= '(' ( (lv_answers_5_0= ruleAnswer ) ) ( (lv_answers_6_0= ruleAnswer ) )* otherlv_7= ')' )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:203:1: (otherlv_0= 'Question' ( (lv_isExclusive_1_0= 'ex' ) )? ( (lv_isOptional_2_0= 'opt' ) )? ( (lv_content_3_0= ruleContent ) ) otherlv_4= '(' ( (lv_answers_5_0= ruleAnswer ) ) ( (lv_answers_6_0= ruleAnswer ) )* otherlv_7= ')' )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:203:3: otherlv_0= 'Question' ( (lv_isExclusive_1_0= 'ex' ) )? ( (lv_isOptional_2_0= 'opt' ) )? ( (lv_content_3_0= ruleContent ) ) otherlv_4= '(' ( (lv_answers_5_0= ruleAnswer ) ) ( (lv_answers_6_0= ruleAnswer ) )* otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleQuestion335); 

                	newLeafNode(otherlv_0, grammarAccess.getQuestionAccess().getQuestionKeyword_0());
                
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:207:1: ( (lv_isExclusive_1_0= 'ex' ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:208:1: (lv_isExclusive_1_0= 'ex' )
                    {
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:208:1: (lv_isExclusive_1_0= 'ex' )
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:209:3: lv_isExclusive_1_0= 'ex'
                    {
                    lv_isExclusive_1_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleQuestion353); 

                            newLeafNode(lv_isExclusive_1_0, grammarAccess.getQuestionAccess().getIsExclusiveExKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQuestionRule());
                    	        }
                           		setWithLastConsumed(current, "isExclusive", true, "ex");
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:222:3: ( (lv_isOptional_2_0= 'opt' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:223:1: (lv_isOptional_2_0= 'opt' )
                    {
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:223:1: (lv_isOptional_2_0= 'opt' )
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:224:3: lv_isOptional_2_0= 'opt'
                    {
                    lv_isOptional_2_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleQuestion385); 

                            newLeafNode(lv_isOptional_2_0, grammarAccess.getQuestionAccess().getIsOptionalOptKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQuestionRule());
                    	        }
                           		setWithLastConsumed(current, "isOptional", true, "opt");
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:237:3: ( (lv_content_3_0= ruleContent ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:238:1: (lv_content_3_0= ruleContent )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:238:1: (lv_content_3_0= ruleContent )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:239:3: lv_content_3_0= ruleContent
            {
             
            	        newCompositeNode(grammarAccess.getQuestionAccess().getContentContentParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleContent_in_ruleQuestion420);
            lv_content_3_0=ruleContent();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"content",
                    		lv_content_3_0, 
                    		"Content");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleQuestion432); 

                	newLeafNode(otherlv_4, grammarAccess.getQuestionAccess().getLeftParenthesisKeyword_4());
                
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:259:1: ( (lv_answers_5_0= ruleAnswer ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:260:1: (lv_answers_5_0= ruleAnswer )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:260:1: (lv_answers_5_0= ruleAnswer )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:261:3: lv_answers_5_0= ruleAnswer
            {
             
            	        newCompositeNode(grammarAccess.getQuestionAccess().getAnswersAnswerParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleQuestion453);
            lv_answers_5_0=ruleAnswer();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuestionRule());
            	        }
                   		add(
                   			current, 
                   			"answers",
                    		lv_answers_5_0, 
                    		"Answer");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:277:2: ( (lv_answers_6_0= ruleAnswer ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:278:1: (lv_answers_6_0= ruleAnswer )
            	    {
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:278:1: (lv_answers_6_0= ruleAnswer )
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:279:3: lv_answers_6_0= ruleAnswer
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuestionAccess().getAnswersAnswerParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleQuestion474);
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
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleQuestion487); 

                	newLeafNode(otherlv_7, grammarAccess.getQuestionAccess().getRightParenthesisKeyword_7());
                

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
    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:307:1: entryRuleContent returns [EObject current=null] : iv_ruleContent= ruleContent EOF ;
    public final EObject entryRuleContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContent = null;


        try {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:308:2: (iv_ruleContent= ruleContent EOF )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:309:2: iv_ruleContent= ruleContent EOF
            {
             newCompositeNode(grammarAccess.getContentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleContent_in_entryRuleContent523);
            iv_ruleContent=ruleContent();

            state._fsp--;

             current =iv_ruleContent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleContent533); 

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
    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:316:1: ruleContent returns [EObject current=null] : ( () ( (lv_body_1_0= ruleEString ) )? ) ;
    public final EObject ruleContent() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_body_1_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:319:28: ( ( () ( (lv_body_1_0= ruleEString ) )? ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:320:1: ( () ( (lv_body_1_0= ruleEString ) )? )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:320:1: ( () ( (lv_body_1_0= ruleEString ) )? )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:320:2: () ( (lv_body_1_0= ruleEString ) )?
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:320:2: ()
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:321:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getContentAccess().getContentAction_0(),
                        current);
                

            }

            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:326:2: ( (lv_body_1_0= ruleEString ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:327:1: (lv_body_1_0= ruleEString )
                    {
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:327:1: (lv_body_1_0= ruleEString )
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:328:3: lv_body_1_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getContentAccess().getBodyEStringParserRuleCall_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleContent588);
                    lv_body_1_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContentRule());
                    	        }
                           		set(
                           			current, 
                           			"body",
                            		lv_body_1_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


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
    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:352:1: entryRuleAnswer returns [EObject current=null] : iv_ruleAnswer= ruleAnswer EOF ;
    public final EObject entryRuleAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswer = null;


        try {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:353:2: (iv_ruleAnswer= ruleAnswer EOF )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:354:2: iv_ruleAnswer= ruleAnswer EOF
            {
             newCompositeNode(grammarAccess.getAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_entryRuleAnswer625);
            iv_ruleAnswer=ruleAnswer();

            state._fsp--;

             current =iv_ruleAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswer635); 

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
    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:361:1: ruleAnswer returns [EObject current=null] : (otherlv_0= 'Answer' ( (lv_isFreeText_1_0= 'free' ) )? ( (lv_content_2_0= ruleContent ) ) (otherlv_3= '(' ( (lv_followup_4_0= ruleQuestion ) ) ( (lv_followup_5_0= ruleQuestion ) )* otherlv_6= ')' )? ) ;
    public final EObject ruleAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isFreeText_1_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_content_2_0 = null;

        EObject lv_followup_4_0 = null;

        EObject lv_followup_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:364:28: ( (otherlv_0= 'Answer' ( (lv_isFreeText_1_0= 'free' ) )? ( (lv_content_2_0= ruleContent ) ) (otherlv_3= '(' ( (lv_followup_4_0= ruleQuestion ) ) ( (lv_followup_5_0= ruleQuestion ) )* otherlv_6= ')' )? ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:365:1: (otherlv_0= 'Answer' ( (lv_isFreeText_1_0= 'free' ) )? ( (lv_content_2_0= ruleContent ) ) (otherlv_3= '(' ( (lv_followup_4_0= ruleQuestion ) ) ( (lv_followup_5_0= ruleQuestion ) )* otherlv_6= ')' )? )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:365:1: (otherlv_0= 'Answer' ( (lv_isFreeText_1_0= 'free' ) )? ( (lv_content_2_0= ruleContent ) ) (otherlv_3= '(' ( (lv_followup_4_0= ruleQuestion ) ) ( (lv_followup_5_0= ruleQuestion ) )* otherlv_6= ')' )? )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:365:3: otherlv_0= 'Answer' ( (lv_isFreeText_1_0= 'free' ) )? ( (lv_content_2_0= ruleContent ) ) (otherlv_3= '(' ( (lv_followup_4_0= ruleQuestion ) ) ( (lv_followup_5_0= ruleQuestion ) )* otherlv_6= ')' )?
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAnswer672); 

                	newLeafNode(otherlv_0, grammarAccess.getAnswerAccess().getAnswerKeyword_0());
                
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:369:1: ( (lv_isFreeText_1_0= 'free' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:370:1: (lv_isFreeText_1_0= 'free' )
                    {
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:370:1: (lv_isFreeText_1_0= 'free' )
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:371:3: lv_isFreeText_1_0= 'free'
                    {
                    lv_isFreeText_1_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAnswer690); 

                            newLeafNode(lv_isFreeText_1_0, grammarAccess.getAnswerAccess().getIsFreeTextFreeKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAnswerRule());
                    	        }
                           		setWithLastConsumed(current, "isFreeText", true, "free");
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:384:3: ( (lv_content_2_0= ruleContent ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:385:1: (lv_content_2_0= ruleContent )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:385:1: (lv_content_2_0= ruleContent )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:386:3: lv_content_2_0= ruleContent
            {
             
            	        newCompositeNode(grammarAccess.getAnswerAccess().getContentContentParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleContent_in_ruleAnswer725);
            lv_content_2_0=ruleContent();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAnswerRule());
            	        }
                   		set(
                   			current, 
                   			"content",
                    		lv_content_2_0, 
                    		"Content");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:402:2: (otherlv_3= '(' ( (lv_followup_4_0= ruleQuestion ) ) ( (lv_followup_5_0= ruleQuestion ) )* otherlv_6= ')' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:402:4: otherlv_3= '(' ( (lv_followup_4_0= ruleQuestion ) ) ( (lv_followup_5_0= ruleQuestion ) )* otherlv_6= ')'
                    {
                    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAnswer738); 

                        	newLeafNode(otherlv_3, grammarAccess.getAnswerAccess().getLeftParenthesisKeyword_3_0());
                        
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:406:1: ( (lv_followup_4_0= ruleQuestion ) )
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:407:1: (lv_followup_4_0= ruleQuestion )
                    {
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:407:1: (lv_followup_4_0= ruleQuestion )
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:408:3: lv_followup_4_0= ruleQuestion
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnswerAccess().getFollowupQuestionParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleAnswer759);
                    lv_followup_4_0=ruleQuestion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAnswerRule());
                    	        }
                           		add(
                           			current, 
                           			"followup",
                            		lv_followup_4_0, 
                            		"Question");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:424:2: ( (lv_followup_5_0= ruleQuestion ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:425:1: (lv_followup_5_0= ruleQuestion )
                    	    {
                    	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:425:1: (lv_followup_5_0= ruleQuestion )
                    	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:426:3: lv_followup_5_0= ruleQuestion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAnswerAccess().getFollowupQuestionParserRuleCall_3_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleAnswer780);
                    	    lv_followup_5_0=ruleQuestion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAnswerRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"followup",
                    	            		lv_followup_5_0, 
                    	            		"Question");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAnswer793); 

                        	newLeafNode(otherlv_6, grammarAccess.getAnswerAccess().getRightParenthesisKeyword_3_3());
                        

                    }
                    break;

            }


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
    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:454:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:455:2: (iv_ruleEString= ruleEString EOF )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:456:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString832);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString843); 

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
    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:463:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:466:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:467:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:467:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:467:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString883); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:475:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString909); 

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
        public static final BitSet FOLLOW_11_in_ruleSurvey122 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSurvey143 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSurvey155 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_ruleContent_in_ruleSurvey176 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleSurvey197 = new BitSet(new long[]{0x0000000000006030L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleSurvey218 = new BitSet(new long[]{0x0000000000006030L});
        public static final BitSet FOLLOW_13_in_ruleSurvey231 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleContent_in_ruleSurvey252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion288 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuestion298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleQuestion335 = new BitSet(new long[]{0x0000000000038030L});
        public static final BitSet FOLLOW_15_in_ruleQuestion353 = new BitSet(new long[]{0x0000000000030030L});
        public static final BitSet FOLLOW_16_in_ruleQuestion385 = new BitSet(new long[]{0x0000000000020030L});
        public static final BitSet FOLLOW_ruleContent_in_ruleQuestion420 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleQuestion432 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleQuestion453 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleQuestion474 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleQuestion487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContent_in_entryRuleContent523 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContent533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleContent588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_entryRuleAnswer625 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswer635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleAnswer672 = new BitSet(new long[]{0x0000000000120030L});
        public static final BitSet FOLLOW_20_in_ruleAnswer690 = new BitSet(new long[]{0x0000000000020030L});
        public static final BitSet FOLLOW_ruleContent_in_ruleAnswer725 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_17_in_ruleAnswer738 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleAnswer759 = new BitSet(new long[]{0x0000000000044030L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleAnswer780 = new BitSet(new long[]{0x0000000000044030L});
        public static final BitSet FOLLOW_18_in_ruleAnswer793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString832 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString909 = new BitSet(new long[]{0x0000000000000002L});
    }


}