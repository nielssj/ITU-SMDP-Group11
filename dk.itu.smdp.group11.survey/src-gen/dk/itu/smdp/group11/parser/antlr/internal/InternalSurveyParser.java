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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_WS", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'Survey'", "'Intro'", "'intro'", "'Outro'", "'outro'", "'Question'", "'ex'", "'opt'", "'('", "')'", "'Answer'", "'isFreeText'"
    };
    public static final int RULE_ID=5;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
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
    public static final int RULE_INT=7;
    public static final int RULE_WS=6;

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
    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:76:1: ruleSurvey returns [EObject current=null] : (otherlv_0= 'Survey' (otherlv_1= 'Intro' | otherlv_2= 'intro' ) ( (lv_intro_3_0= ruleContent ) ) ( (lv_questions_4_0= ruleQuestion ) ) ( (lv_questions_5_0= ruleQuestion ) )* (otherlv_6= 'Outro' | otherlv_7= 'outro' ) ( (lv_outro_8_0= ruleContent ) ) ) ;
    public final EObject ruleSurvey() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_intro_3_0 = null;

        EObject lv_questions_4_0 = null;

        EObject lv_questions_5_0 = null;

        EObject lv_outro_8_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:79:28: ( (otherlv_0= 'Survey' (otherlv_1= 'Intro' | otherlv_2= 'intro' ) ( (lv_intro_3_0= ruleContent ) ) ( (lv_questions_4_0= ruleQuestion ) ) ( (lv_questions_5_0= ruleQuestion ) )* (otherlv_6= 'Outro' | otherlv_7= 'outro' ) ( (lv_outro_8_0= ruleContent ) ) ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:80:1: (otherlv_0= 'Survey' (otherlv_1= 'Intro' | otherlv_2= 'intro' ) ( (lv_intro_3_0= ruleContent ) ) ( (lv_questions_4_0= ruleQuestion ) ) ( (lv_questions_5_0= ruleQuestion ) )* (otherlv_6= 'Outro' | otherlv_7= 'outro' ) ( (lv_outro_8_0= ruleContent ) ) )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:80:1: (otherlv_0= 'Survey' (otherlv_1= 'Intro' | otherlv_2= 'intro' ) ( (lv_intro_3_0= ruleContent ) ) ( (lv_questions_4_0= ruleQuestion ) ) ( (lv_questions_5_0= ruleQuestion ) )* (otherlv_6= 'Outro' | otherlv_7= 'outro' ) ( (lv_outro_8_0= ruleContent ) ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:80:3: otherlv_0= 'Survey' (otherlv_1= 'Intro' | otherlv_2= 'intro' ) ( (lv_intro_3_0= ruleContent ) ) ( (lv_questions_4_0= ruleQuestion ) ) ( (lv_questions_5_0= ruleQuestion ) )* (otherlv_6= 'Outro' | otherlv_7= 'outro' ) ( (lv_outro_8_0= ruleContent ) )
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleSurvey122); 

                	newLeafNode(otherlv_0, grammarAccess.getSurveyAccess().getSurveyKeyword_0());
                
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:84:1: (otherlv_1= 'Intro' | otherlv_2= 'intro' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            else if ( (LA1_0==13) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:84:3: otherlv_1= 'Intro'
                    {
                    otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSurvey135); 

                        	newLeafNode(otherlv_1, grammarAccess.getSurveyAccess().getIntroKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:89:7: otherlv_2= 'intro'
                    {
                    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSurvey153); 

                        	newLeafNode(otherlv_2, grammarAccess.getSurveyAccess().getIntroKeyword_1_1());
                        

                    }
                    break;

            }

            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:93:2: ( (lv_intro_3_0= ruleContent ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:94:1: (lv_intro_3_0= ruleContent )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:94:1: (lv_intro_3_0= ruleContent )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:95:3: lv_intro_3_0= ruleContent
            {
             
            	        newCompositeNode(grammarAccess.getSurveyAccess().getIntroContentParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleContent_in_ruleSurvey175);
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

            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:111:2: ( (lv_questions_4_0= ruleQuestion ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:112:1: (lv_questions_4_0= ruleQuestion )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:112:1: (lv_questions_4_0= ruleQuestion )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:113:3: lv_questions_4_0= ruleQuestion
            {
             
            	        newCompositeNode(grammarAccess.getSurveyAccess().getQuestionsQuestionParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleSurvey196);
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

            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:129:2: ( (lv_questions_5_0= ruleQuestion ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:130:1: (lv_questions_5_0= ruleQuestion )
            	    {
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:130:1: (lv_questions_5_0= ruleQuestion )
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:131:3: lv_questions_5_0= ruleQuestion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSurveyAccess().getQuestionsQuestionParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleSurvey217);
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
            	    break loop2;
                }
            } while (true);

            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:147:3: (otherlv_6= 'Outro' | otherlv_7= 'outro' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:147:5: otherlv_6= 'Outro'
                    {
                    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSurvey231); 

                        	newLeafNode(otherlv_6, grammarAccess.getSurveyAccess().getOutroKeyword_5_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:152:7: otherlv_7= 'outro'
                    {
                    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSurvey249); 

                        	newLeafNode(otherlv_7, grammarAccess.getSurveyAccess().getOutroKeyword_5_1());
                        

                    }
                    break;

            }

            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:156:2: ( (lv_outro_8_0= ruleContent ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:157:1: (lv_outro_8_0= ruleContent )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:157:1: (lv_outro_8_0= ruleContent )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:158:3: lv_outro_8_0= ruleContent
            {
             
            	        newCompositeNode(grammarAccess.getSurveyAccess().getOutroContentParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleContent_in_ruleSurvey271);
            lv_outro_8_0=ruleContent();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSurveyRule());
            	        }
                   		set(
                   			current, 
                   			"outro",
                    		lv_outro_8_0, 
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
    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:182:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:183:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:184:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_entryRuleQuestion307);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuestion317); 

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
    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:191:1: ruleQuestion returns [EObject current=null] : (otherlv_0= 'Question' ( (lv_isExclusive_1_0= 'ex' ) )? ( (lv_isOptional_2_0= 'opt' ) )? ( (lv_content_3_0= ruleContent ) ) otherlv_4= '(' ( (lv_answers_5_0= ruleAnswer ) ) ( (lv_answers_6_0= ruleAnswer ) )* otherlv_7= ')' ) ;
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
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:194:28: ( (otherlv_0= 'Question' ( (lv_isExclusive_1_0= 'ex' ) )? ( (lv_isOptional_2_0= 'opt' ) )? ( (lv_content_3_0= ruleContent ) ) otherlv_4= '(' ( (lv_answers_5_0= ruleAnswer ) ) ( (lv_answers_6_0= ruleAnswer ) )* otherlv_7= ')' ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:195:1: (otherlv_0= 'Question' ( (lv_isExclusive_1_0= 'ex' ) )? ( (lv_isOptional_2_0= 'opt' ) )? ( (lv_content_3_0= ruleContent ) ) otherlv_4= '(' ( (lv_answers_5_0= ruleAnswer ) ) ( (lv_answers_6_0= ruleAnswer ) )* otherlv_7= ')' )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:195:1: (otherlv_0= 'Question' ( (lv_isExclusive_1_0= 'ex' ) )? ( (lv_isOptional_2_0= 'opt' ) )? ( (lv_content_3_0= ruleContent ) ) otherlv_4= '(' ( (lv_answers_5_0= ruleAnswer ) ) ( (lv_answers_6_0= ruleAnswer ) )* otherlv_7= ')' )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:195:3: otherlv_0= 'Question' ( (lv_isExclusive_1_0= 'ex' ) )? ( (lv_isOptional_2_0= 'opt' ) )? ( (lv_content_3_0= ruleContent ) ) otherlv_4= '(' ( (lv_answers_5_0= ruleAnswer ) ) ( (lv_answers_6_0= ruleAnswer ) )* otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleQuestion354); 

                	newLeafNode(otherlv_0, grammarAccess.getQuestionAccess().getQuestionKeyword_0());
                
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:199:1: ( (lv_isExclusive_1_0= 'ex' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:200:1: (lv_isExclusive_1_0= 'ex' )
                    {
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:200:1: (lv_isExclusive_1_0= 'ex' )
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:201:3: lv_isExclusive_1_0= 'ex'
                    {
                    lv_isExclusive_1_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleQuestion372); 

                            newLeafNode(lv_isExclusive_1_0, grammarAccess.getQuestionAccess().getIsExclusiveExKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQuestionRule());
                    	        }
                           		setWithLastConsumed(current, "isExclusive", true, "ex");
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:214:3: ( (lv_isOptional_2_0= 'opt' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:215:1: (lv_isOptional_2_0= 'opt' )
                    {
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:215:1: (lv_isOptional_2_0= 'opt' )
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:216:3: lv_isOptional_2_0= 'opt'
                    {
                    lv_isOptional_2_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleQuestion404); 

                            newLeafNode(lv_isOptional_2_0, grammarAccess.getQuestionAccess().getIsOptionalOptKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQuestionRule());
                    	        }
                           		setWithLastConsumed(current, "isOptional", true, "opt");
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:229:3: ( (lv_content_3_0= ruleContent ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:230:1: (lv_content_3_0= ruleContent )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:230:1: (lv_content_3_0= ruleContent )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:231:3: lv_content_3_0= ruleContent
            {
             
            	        newCompositeNode(grammarAccess.getQuestionAccess().getContentContentParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleContent_in_ruleQuestion439);
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

            otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleQuestion451); 

                	newLeafNode(otherlv_4, grammarAccess.getQuestionAccess().getLeftParenthesisKeyword_4());
                
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:251:1: ( (lv_answers_5_0= ruleAnswer ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:252:1: (lv_answers_5_0= ruleAnswer )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:252:1: (lv_answers_5_0= ruleAnswer )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:253:3: lv_answers_5_0= ruleAnswer
            {
             
            	        newCompositeNode(grammarAccess.getQuestionAccess().getAnswersAnswerParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleQuestion472);
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

            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:269:2: ( (lv_answers_6_0= ruleAnswer ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:270:1: (lv_answers_6_0= ruleAnswer )
            	    {
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:270:1: (lv_answers_6_0= ruleAnswer )
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:271:3: lv_answers_6_0= ruleAnswer
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuestionAccess().getAnswersAnswerParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleQuestion493);
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
            	    break loop6;
                }
            } while (true);

            otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleQuestion506); 

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
    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:299:1: entryRuleContent returns [EObject current=null] : iv_ruleContent= ruleContent EOF ;
    public final EObject entryRuleContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContent = null;


        try {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:300:2: (iv_ruleContent= ruleContent EOF )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:301:2: iv_ruleContent= ruleContent EOF
            {
             newCompositeNode(grammarAccess.getContentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleContent_in_entryRuleContent542);
            iv_ruleContent=ruleContent();

            state._fsp--;

             current =iv_ruleContent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleContent552); 

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
    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:308:1: ruleContent returns [EObject current=null] : ( () ( (lv_body_1_0= ruleEString ) )? ) ;
    public final EObject ruleContent() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_body_1_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:311:28: ( ( () ( (lv_body_1_0= ruleEString ) )? ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:312:1: ( () ( (lv_body_1_0= ruleEString ) )? )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:312:1: ( () ( (lv_body_1_0= ruleEString ) )? )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:312:2: () ( (lv_body_1_0= ruleEString ) )?
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:312:2: ()
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:313:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getContentAccess().getContentAction_0(),
                        current);
                

            }

            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:318:2: ( (lv_body_1_0= ruleEString ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:319:1: (lv_body_1_0= ruleEString )
                    {
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:319:1: (lv_body_1_0= ruleEString )
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:320:3: lv_body_1_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getContentAccess().getBodyEStringParserRuleCall_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleContent607);
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
    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:344:1: entryRuleAnswer returns [EObject current=null] : iv_ruleAnswer= ruleAnswer EOF ;
    public final EObject entryRuleAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswer = null;


        try {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:345:2: (iv_ruleAnswer= ruleAnswer EOF )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:346:2: iv_ruleAnswer= ruleAnswer EOF
            {
             newCompositeNode(grammarAccess.getAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_entryRuleAnswer644);
            iv_ruleAnswer=ruleAnswer();

            state._fsp--;

             current =iv_ruleAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswer654); 

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
    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:353:1: ruleAnswer returns [EObject current=null] : (otherlv_0= 'Answer' (otherlv_1= 'isFreeText' ( (lv_isFreeText_2_0= ruleEString ) ) )? ( (lv_content_3_0= ruleContent ) ) (otherlv_4= '(' ( (lv_followup_5_0= ruleQuestion ) ) otherlv_6= ')' )? ) ;
    public final EObject ruleAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_isFreeText_2_0 = null;

        EObject lv_content_3_0 = null;

        EObject lv_followup_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:356:28: ( (otherlv_0= 'Answer' (otherlv_1= 'isFreeText' ( (lv_isFreeText_2_0= ruleEString ) ) )? ( (lv_content_3_0= ruleContent ) ) (otherlv_4= '(' ( (lv_followup_5_0= ruleQuestion ) ) otherlv_6= ')' )? ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:357:1: (otherlv_0= 'Answer' (otherlv_1= 'isFreeText' ( (lv_isFreeText_2_0= ruleEString ) ) )? ( (lv_content_3_0= ruleContent ) ) (otherlv_4= '(' ( (lv_followup_5_0= ruleQuestion ) ) otherlv_6= ')' )? )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:357:1: (otherlv_0= 'Answer' (otherlv_1= 'isFreeText' ( (lv_isFreeText_2_0= ruleEString ) ) )? ( (lv_content_3_0= ruleContent ) ) (otherlv_4= '(' ( (lv_followup_5_0= ruleQuestion ) ) otherlv_6= ')' )? )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:357:3: otherlv_0= 'Answer' (otherlv_1= 'isFreeText' ( (lv_isFreeText_2_0= ruleEString ) ) )? ( (lv_content_3_0= ruleContent ) ) (otherlv_4= '(' ( (lv_followup_5_0= ruleQuestion ) ) otherlv_6= ')' )?
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAnswer691); 

                	newLeafNode(otherlv_0, grammarAccess.getAnswerAccess().getAnswerKeyword_0());
                
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:361:1: (otherlv_1= 'isFreeText' ( (lv_isFreeText_2_0= ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:361:3: otherlv_1= 'isFreeText' ( (lv_isFreeText_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAnswer704); 

                        	newLeafNode(otherlv_1, grammarAccess.getAnswerAccess().getIsFreeTextKeyword_1_0());
                        
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:365:1: ( (lv_isFreeText_2_0= ruleEString ) )
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:366:1: (lv_isFreeText_2_0= ruleEString )
                    {
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:366:1: (lv_isFreeText_2_0= ruleEString )
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:367:3: lv_isFreeText_2_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnswerAccess().getIsFreeTextEStringParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnswer725);
                    lv_isFreeText_2_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAnswerRule());
                    	        }
                           		set(
                           			current, 
                           			"isFreeText",
                            		lv_isFreeText_2_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:383:4: ( (lv_content_3_0= ruleContent ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:384:1: (lv_content_3_0= ruleContent )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:384:1: (lv_content_3_0= ruleContent )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:385:3: lv_content_3_0= ruleContent
            {
             
            	        newCompositeNode(grammarAccess.getAnswerAccess().getContentContentParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleContent_in_ruleAnswer748);
            lv_content_3_0=ruleContent();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAnswerRule());
            	        }
                   		set(
                   			current, 
                   			"content",
                    		lv_content_3_0, 
                    		"Content");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:401:2: (otherlv_4= '(' ( (lv_followup_5_0= ruleQuestion ) ) otherlv_6= ')' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:401:4: otherlv_4= '(' ( (lv_followup_5_0= ruleQuestion ) ) otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAnswer761); 

                        	newLeafNode(otherlv_4, grammarAccess.getAnswerAccess().getLeftParenthesisKeyword_3_0());
                        
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:405:1: ( (lv_followup_5_0= ruleQuestion ) )
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:406:1: (lv_followup_5_0= ruleQuestion )
                    {
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:406:1: (lv_followup_5_0= ruleQuestion )
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:407:3: lv_followup_5_0= ruleQuestion
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnswerAccess().getFollowupQuestionParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleAnswer782);
                    lv_followup_5_0=ruleQuestion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAnswerRule());
                    	        }
                           		set(
                           			current, 
                           			"followup",
                            		lv_followup_5_0, 
                            		"Question");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAnswer794); 

                        	newLeafNode(otherlv_6, grammarAccess.getAnswerAccess().getRightParenthesisKeyword_3_2());
                        

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
    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:437:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:438:2: (iv_ruleEString= ruleEString EOF )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:439:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString835);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString846); 

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
    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:446:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:449:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:450:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:450:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:450:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString886); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/parser/antlr/internal/InternalSurvey.g:458:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString912); 

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
        public static final BitSet FOLLOW_11_in_ruleSurvey122 = new BitSet(new long[]{0x0000000000003000L});
        public static final BitSet FOLLOW_12_in_ruleSurvey135 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_13_in_ruleSurvey153 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_ruleContent_in_ruleSurvey175 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleSurvey196 = new BitSet(new long[]{0x000000000001C030L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleSurvey217 = new BitSet(new long[]{0x000000000001C030L});
        public static final BitSet FOLLOW_14_in_ruleSurvey231 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_15_in_ruleSurvey249 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleContent_in_ruleSurvey271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion307 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuestion317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleQuestion354 = new BitSet(new long[]{0x00000000000E0030L});
        public static final BitSet FOLLOW_17_in_ruleQuestion372 = new BitSet(new long[]{0x00000000000C0030L});
        public static final BitSet FOLLOW_18_in_ruleQuestion404 = new BitSet(new long[]{0x0000000000080030L});
        public static final BitSet FOLLOW_ruleContent_in_ruleQuestion439 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleQuestion451 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleQuestion472 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleQuestion493 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_20_in_ruleQuestion506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContent_in_entryRuleContent542 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContent552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleContent607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_entryRuleAnswer644 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswer654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleAnswer691 = new BitSet(new long[]{0x0000000000480030L});
        public static final BitSet FOLLOW_22_in_ruleAnswer704 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnswer725 = new BitSet(new long[]{0x0000000000080030L});
        public static final BitSet FOLLOW_ruleContent_in_ruleAnswer748 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_19_in_ruleAnswer761 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleAnswer782 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleAnswer794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString835 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString912 = new BitSet(new long[]{0x0000000000000002L});
    }


}