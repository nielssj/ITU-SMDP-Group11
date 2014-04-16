package dk.itu.smdp.group11.survey.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.itu.smdp.group11.survey.services.SurveyGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSurveyParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Survey'", "'Intro'", "'Outro'", "'Question'", "'exclusive'", "'optional'", "'('", "')'", "'Answer'", "'freetext'", "'->'", "','", "'TableQuestion'", "'Items'"
    };
    public static final int RULE_ID=5;
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
    public String getGrammarFileName() { return "../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g"; }



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
    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:67:1: entryRuleSurvey returns [EObject current=null] : iv_ruleSurvey= ruleSurvey EOF ;
    public final EObject entryRuleSurvey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSurvey = null;


        try {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:68:2: (iv_ruleSurvey= ruleSurvey EOF )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:69:2: iv_ruleSurvey= ruleSurvey EOF
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
    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:76:1: ruleSurvey returns [EObject current=null] : (otherlv_0= 'Survey' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'Intro' ( (lv_intro_3_0= ruleEString ) ) )? ( (lv_questions_4_0= ruleQuestion ) ) ( (lv_questions_5_0= ruleQuestion ) )* (otherlv_6= 'Outro' ( (lv_outro_7_0= ruleEString ) ) )? ) ;
    public final EObject ruleSurvey() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_intro_3_0 = null;

        EObject lv_questions_4_0 = null;

        EObject lv_questions_5_0 = null;

        AntlrDatatypeRuleToken lv_outro_7_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:79:28: ( (otherlv_0= 'Survey' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'Intro' ( (lv_intro_3_0= ruleEString ) ) )? ( (lv_questions_4_0= ruleQuestion ) ) ( (lv_questions_5_0= ruleQuestion ) )* (otherlv_6= 'Outro' ( (lv_outro_7_0= ruleEString ) ) )? ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:80:1: (otherlv_0= 'Survey' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'Intro' ( (lv_intro_3_0= ruleEString ) ) )? ( (lv_questions_4_0= ruleQuestion ) ) ( (lv_questions_5_0= ruleQuestion ) )* (otherlv_6= 'Outro' ( (lv_outro_7_0= ruleEString ) ) )? )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:80:1: (otherlv_0= 'Survey' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'Intro' ( (lv_intro_3_0= ruleEString ) ) )? ( (lv_questions_4_0= ruleQuestion ) ) ( (lv_questions_5_0= ruleQuestion ) )* (otherlv_6= 'Outro' ( (lv_outro_7_0= ruleEString ) ) )? )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:80:3: otherlv_0= 'Survey' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'Intro' ( (lv_intro_3_0= ruleEString ) ) )? ( (lv_questions_4_0= ruleQuestion ) ) ( (lv_questions_5_0= ruleQuestion ) )* (otherlv_6= 'Outro' ( (lv_outro_7_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleSurvey122); 

                	newLeafNode(otherlv_0, grammarAccess.getSurveyAccess().getSurveyKeyword_0());
                
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:84:1: ( (lv_name_1_0= ruleEString ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:85:1: (lv_name_1_0= ruleEString )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:85:1: (lv_name_1_0= ruleEString )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:86:3: lv_name_1_0= ruleEString
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

            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:102:2: (otherlv_2= 'Intro' ( (lv_intro_3_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:102:4: otherlv_2= 'Intro' ( (lv_intro_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSurvey156); 

                        	newLeafNode(otherlv_2, grammarAccess.getSurveyAccess().getIntroKeyword_2_0());
                        
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:106:1: ( (lv_intro_3_0= ruleEString ) )
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:107:1: (lv_intro_3_0= ruleEString )
                    {
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:107:1: (lv_intro_3_0= ruleEString )
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:108:3: lv_intro_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSurveyAccess().getIntroEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSurvey177);
                    lv_intro_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSurveyRule());
                    	        }
                           		set(
                           			current, 
                           			"intro",
                            		lv_intro_3_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:124:4: ( (lv_questions_4_0= ruleQuestion ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:125:1: (lv_questions_4_0= ruleQuestion )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:125:1: (lv_questions_4_0= ruleQuestion )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:126:3: lv_questions_4_0= ruleQuestion
            {
             
            	        newCompositeNode(grammarAccess.getSurveyAccess().getQuestionsQuestionParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleSurvey200);
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

            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:142:2: ( (lv_questions_5_0= ruleQuestion ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14||LA2_0==23) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:143:1: (lv_questions_5_0= ruleQuestion )
            	    {
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:143:1: (lv_questions_5_0= ruleQuestion )
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:144:3: lv_questions_5_0= ruleQuestion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSurveyAccess().getQuestionsQuestionParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleSurvey221);
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

            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:160:3: (otherlv_6= 'Outro' ( (lv_outro_7_0= ruleEString ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:160:5: otherlv_6= 'Outro' ( (lv_outro_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSurvey235); 

                        	newLeafNode(otherlv_6, grammarAccess.getSurveyAccess().getOutroKeyword_5_0());
                        
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:164:1: ( (lv_outro_7_0= ruleEString ) )
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:165:1: (lv_outro_7_0= ruleEString )
                    {
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:165:1: (lv_outro_7_0= ruleEString )
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:166:3: lv_outro_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSurveyAccess().getOutroEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSurvey256);
                    lv_outro_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSurveyRule());
                    	        }
                           		set(
                           			current, 
                           			"outro",
                            		lv_outro_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "ruleSurvey"


    // $ANTLR start "entryRuleQuestion"
    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:190:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:191:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:192:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_entryRuleQuestion294);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuestion304); 

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
    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:199:1: ruleQuestion returns [EObject current=null] : (this_Question_Impl_0= ruleQuestion_Impl | this_TableQuestion_1= ruleTableQuestion ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        EObject this_Question_Impl_0 = null;

        EObject this_TableQuestion_1 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:202:28: ( (this_Question_Impl_0= ruleQuestion_Impl | this_TableQuestion_1= ruleTableQuestion ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:203:1: (this_Question_Impl_0= ruleQuestion_Impl | this_TableQuestion_1= ruleTableQuestion )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:203:1: (this_Question_Impl_0= ruleQuestion_Impl | this_TableQuestion_1= ruleTableQuestion )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            else if ( (LA4_0==23) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:204:5: this_Question_Impl_0= ruleQuestion_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getQuestion_ImplParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleQuestion_Impl_in_ruleQuestion351);
                    this_Question_Impl_0=ruleQuestion_Impl();

                    state._fsp--;

                     
                            current = this_Question_Impl_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:214:5: this_TableQuestion_1= ruleTableQuestion
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getTableQuestionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTableQuestion_in_ruleQuestion378);
                    this_TableQuestion_1=ruleTableQuestion();

                    state._fsp--;

                     
                            current = this_TableQuestion_1; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleEString"
    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:230:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:231:2: (iv_ruleEString= ruleEString EOF )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:232:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString414);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString425); 

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
    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:239:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:242:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:243:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:243:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:243:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString465); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:251:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString491); 

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


    // $ANTLR start "entryRuleQuestion_Impl"
    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:266:1: entryRuleQuestion_Impl returns [EObject current=null] : iv_ruleQuestion_Impl= ruleQuestion_Impl EOF ;
    public final EObject entryRuleQuestion_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion_Impl = null;


        try {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:267:2: (iv_ruleQuestion_Impl= ruleQuestion_Impl EOF )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:268:2: iv_ruleQuestion_Impl= ruleQuestion_Impl EOF
            {
             newCompositeNode(grammarAccess.getQuestion_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_Impl_in_entryRuleQuestion_Impl536);
            iv_ruleQuestion_Impl=ruleQuestion_Impl();

            state._fsp--;

             current =iv_ruleQuestion_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuestion_Impl546); 

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
    // $ANTLR end "entryRuleQuestion_Impl"


    // $ANTLR start "ruleQuestion_Impl"
    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:275:1: ruleQuestion_Impl returns [EObject current=null] : (otherlv_0= 'Question' ( (lv_name_1_0= ruleEString ) ) ( (lv_isExclusive_2_0= 'exclusive' ) )? ( (lv_isOptional_3_0= 'optional' ) )? ( (lv_body_4_0= ruleEString ) ) otherlv_5= '(' ( (lv_answers_6_0= ruleAnswer ) ) ( (lv_answers_7_0= ruleAnswer ) )* otherlv_8= ')' ) ;
    public final EObject ruleQuestion_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isExclusive_2_0=null;
        Token lv_isOptional_3_0=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_body_4_0 = null;

        EObject lv_answers_6_0 = null;

        EObject lv_answers_7_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:278:28: ( (otherlv_0= 'Question' ( (lv_name_1_0= ruleEString ) ) ( (lv_isExclusive_2_0= 'exclusive' ) )? ( (lv_isOptional_3_0= 'optional' ) )? ( (lv_body_4_0= ruleEString ) ) otherlv_5= '(' ( (lv_answers_6_0= ruleAnswer ) ) ( (lv_answers_7_0= ruleAnswer ) )* otherlv_8= ')' ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:279:1: (otherlv_0= 'Question' ( (lv_name_1_0= ruleEString ) ) ( (lv_isExclusive_2_0= 'exclusive' ) )? ( (lv_isOptional_3_0= 'optional' ) )? ( (lv_body_4_0= ruleEString ) ) otherlv_5= '(' ( (lv_answers_6_0= ruleAnswer ) ) ( (lv_answers_7_0= ruleAnswer ) )* otherlv_8= ')' )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:279:1: (otherlv_0= 'Question' ( (lv_name_1_0= ruleEString ) ) ( (lv_isExclusive_2_0= 'exclusive' ) )? ( (lv_isOptional_3_0= 'optional' ) )? ( (lv_body_4_0= ruleEString ) ) otherlv_5= '(' ( (lv_answers_6_0= ruleAnswer ) ) ( (lv_answers_7_0= ruleAnswer ) )* otherlv_8= ')' )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:279:3: otherlv_0= 'Question' ( (lv_name_1_0= ruleEString ) ) ( (lv_isExclusive_2_0= 'exclusive' ) )? ( (lv_isOptional_3_0= 'optional' ) )? ( (lv_body_4_0= ruleEString ) ) otherlv_5= '(' ( (lv_answers_6_0= ruleAnswer ) ) ( (lv_answers_7_0= ruleAnswer ) )* otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleQuestion_Impl583); 

                	newLeafNode(otherlv_0, grammarAccess.getQuestion_ImplAccess().getQuestionKeyword_0());
                
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:283:1: ( (lv_name_1_0= ruleEString ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:284:1: (lv_name_1_0= ruleEString )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:284:1: (lv_name_1_0= ruleEString )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:285:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getQuestion_ImplAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleQuestion_Impl604);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuestion_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:301:2: ( (lv_isExclusive_2_0= 'exclusive' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:302:1: (lv_isExclusive_2_0= 'exclusive' )
                    {
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:302:1: (lv_isExclusive_2_0= 'exclusive' )
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:303:3: lv_isExclusive_2_0= 'exclusive'
                    {
                    lv_isExclusive_2_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleQuestion_Impl622); 

                            newLeafNode(lv_isExclusive_2_0, grammarAccess.getQuestion_ImplAccess().getIsExclusiveExclusiveKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQuestion_ImplRule());
                    	        }
                           		setWithLastConsumed(current, "isExclusive", true, "exclusive");
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:316:3: ( (lv_isOptional_3_0= 'optional' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:317:1: (lv_isOptional_3_0= 'optional' )
                    {
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:317:1: (lv_isOptional_3_0= 'optional' )
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:318:3: lv_isOptional_3_0= 'optional'
                    {
                    lv_isOptional_3_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleQuestion_Impl654); 

                            newLeafNode(lv_isOptional_3_0, grammarAccess.getQuestion_ImplAccess().getIsOptionalOptionalKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQuestion_ImplRule());
                    	        }
                           		setWithLastConsumed(current, "isOptional", true, "optional");
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:331:3: ( (lv_body_4_0= ruleEString ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:332:1: (lv_body_4_0= ruleEString )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:332:1: (lv_body_4_0= ruleEString )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:333:3: lv_body_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getQuestion_ImplAccess().getBodyEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleQuestion_Impl689);
            lv_body_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuestion_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"body",
                    		lv_body_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleQuestion_Impl701); 

                	newLeafNode(otherlv_5, grammarAccess.getQuestion_ImplAccess().getLeftParenthesisKeyword_5());
                
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:353:1: ( (lv_answers_6_0= ruleAnswer ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:354:1: (lv_answers_6_0= ruleAnswer )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:354:1: (lv_answers_6_0= ruleAnswer )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:355:3: lv_answers_6_0= ruleAnswer
            {
             
            	        newCompositeNode(grammarAccess.getQuestion_ImplAccess().getAnswersAnswerParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleQuestion_Impl722);
            lv_answers_6_0=ruleAnswer();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuestion_ImplRule());
            	        }
                   		add(
                   			current, 
                   			"answers",
                    		lv_answers_6_0, 
                    		"Answer");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:371:2: ( (lv_answers_7_0= ruleAnswer ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:372:1: (lv_answers_7_0= ruleAnswer )
            	    {
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:372:1: (lv_answers_7_0= ruleAnswer )
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:373:3: lv_answers_7_0= ruleAnswer
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuestion_ImplAccess().getAnswersAnswerParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleQuestion_Impl743);
            	    lv_answers_7_0=ruleAnswer();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQuestion_ImplRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"answers",
            	            		lv_answers_7_0, 
            	            		"Answer");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleQuestion_Impl756); 

                	newLeafNode(otherlv_8, grammarAccess.getQuestion_ImplAccess().getRightParenthesisKeyword_8());
                

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
    // $ANTLR end "ruleQuestion_Impl"


    // $ANTLR start "entryRuleAnswer"
    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:401:1: entryRuleAnswer returns [EObject current=null] : iv_ruleAnswer= ruleAnswer EOF ;
    public final EObject entryRuleAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswer = null;


        try {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:402:2: (iv_ruleAnswer= ruleAnswer EOF )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:403:2: iv_ruleAnswer= ruleAnswer EOF
            {
             newCompositeNode(grammarAccess.getAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_entryRuleAnswer792);
            iv_ruleAnswer=ruleAnswer();

            state._fsp--;

             current =iv_ruleAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswer802); 

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
    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:410:1: ruleAnswer returns [EObject current=null] : (otherlv_0= 'Answer' ( (lv_isFreeText_1_0= 'freetext' ) )? ( (lv_body_2_0= ruleEString ) ) (otherlv_3= '->' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? ) ;
    public final EObject ruleAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isFreeText_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_body_2_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:413:28: ( (otherlv_0= 'Answer' ( (lv_isFreeText_1_0= 'freetext' ) )? ( (lv_body_2_0= ruleEString ) ) (otherlv_3= '->' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:414:1: (otherlv_0= 'Answer' ( (lv_isFreeText_1_0= 'freetext' ) )? ( (lv_body_2_0= ruleEString ) ) (otherlv_3= '->' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:414:1: (otherlv_0= 'Answer' ( (lv_isFreeText_1_0= 'freetext' ) )? ( (lv_body_2_0= ruleEString ) ) (otherlv_3= '->' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:414:3: otherlv_0= 'Answer' ( (lv_isFreeText_1_0= 'freetext' ) )? ( (lv_body_2_0= ruleEString ) ) (otherlv_3= '->' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )?
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAnswer839); 

                	newLeafNode(otherlv_0, grammarAccess.getAnswerAccess().getAnswerKeyword_0());
                
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:418:1: ( (lv_isFreeText_1_0= 'freetext' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:419:1: (lv_isFreeText_1_0= 'freetext' )
                    {
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:419:1: (lv_isFreeText_1_0= 'freetext' )
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:420:3: lv_isFreeText_1_0= 'freetext'
                    {
                    lv_isFreeText_1_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAnswer857); 

                            newLeafNode(lv_isFreeText_1_0, grammarAccess.getAnswerAccess().getIsFreeTextFreetextKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAnswerRule());
                    	        }
                           		setWithLastConsumed(current, "isFreeText", true, "freetext");
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:433:3: ( (lv_body_2_0= ruleEString ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:434:1: (lv_body_2_0= ruleEString )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:434:1: (lv_body_2_0= ruleEString )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:435:3: lv_body_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAnswerAccess().getBodyEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnswer892);
            lv_body_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAnswerRule());
            	        }
                   		set(
                   			current, 
                   			"body",
                    		lv_body_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:451:2: (otherlv_3= '->' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:451:4: otherlv_3= '->' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAnswer905); 

                        	newLeafNode(otherlv_3, grammarAccess.getAnswerAccess().getHyphenMinusGreaterThanSignKeyword_3_0());
                        
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:455:1: ( ( ruleEString ) )
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:456:1: ( ruleEString )
                    {
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:456:1: ( ruleEString )
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:457:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAnswerRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAnswerAccess().getFollowupQuestionCrossReference_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnswer928);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:470:2: (otherlv_5= ',' ( ( ruleEString ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==22) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:470:4: otherlv_5= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAnswer941); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getAnswerAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:474:1: ( ( ruleEString ) )
                    	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:475:1: ( ruleEString )
                    	    {
                    	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:475:1: ( ruleEString )
                    	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:476:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getAnswerRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getAnswerAccess().getFollowupQuestionCrossReference_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnswer964);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


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


    // $ANTLR start "entryRuleTableQuestion"
    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:497:1: entryRuleTableQuestion returns [EObject current=null] : iv_ruleTableQuestion= ruleTableQuestion EOF ;
    public final EObject entryRuleTableQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableQuestion = null;


        try {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:498:2: (iv_ruleTableQuestion= ruleTableQuestion EOF )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:499:2: iv_ruleTableQuestion= ruleTableQuestion EOF
            {
             newCompositeNode(grammarAccess.getTableQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTableQuestion_in_entryRuleTableQuestion1004);
            iv_ruleTableQuestion=ruleTableQuestion();

            state._fsp--;

             current =iv_ruleTableQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTableQuestion1014); 

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
    // $ANTLR end "entryRuleTableQuestion"


    // $ANTLR start "ruleTableQuestion"
    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:506:1: ruleTableQuestion returns [EObject current=null] : (otherlv_0= 'TableQuestion' ( (lv_name_1_0= ruleEString ) ) ( (lv_isExclusive_2_0= 'exclusive' ) )? ( (lv_isOptional_3_0= 'optional' ) )? ( (lv_body_4_0= ruleEString ) ) otherlv_5= '(' otherlv_6= 'Items' otherlv_7= '(' ( (lv_items_8_0= ruleItem ) ) (otherlv_9= ',' ( (lv_items_10_0= ruleItem ) ) )* otherlv_11= ')' ( (lv_answers_12_0= ruleAnswer ) ) ( (lv_answers_13_0= ruleAnswer ) )* otherlv_14= ')' ) ;
    public final EObject ruleTableQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isExclusive_2_0=null;
        Token lv_isOptional_3_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_body_4_0 = null;

        EObject lv_items_8_0 = null;

        EObject lv_items_10_0 = null;

        EObject lv_answers_12_0 = null;

        EObject lv_answers_13_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:509:28: ( (otherlv_0= 'TableQuestion' ( (lv_name_1_0= ruleEString ) ) ( (lv_isExclusive_2_0= 'exclusive' ) )? ( (lv_isOptional_3_0= 'optional' ) )? ( (lv_body_4_0= ruleEString ) ) otherlv_5= '(' otherlv_6= 'Items' otherlv_7= '(' ( (lv_items_8_0= ruleItem ) ) (otherlv_9= ',' ( (lv_items_10_0= ruleItem ) ) )* otherlv_11= ')' ( (lv_answers_12_0= ruleAnswer ) ) ( (lv_answers_13_0= ruleAnswer ) )* otherlv_14= ')' ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:510:1: (otherlv_0= 'TableQuestion' ( (lv_name_1_0= ruleEString ) ) ( (lv_isExclusive_2_0= 'exclusive' ) )? ( (lv_isOptional_3_0= 'optional' ) )? ( (lv_body_4_0= ruleEString ) ) otherlv_5= '(' otherlv_6= 'Items' otherlv_7= '(' ( (lv_items_8_0= ruleItem ) ) (otherlv_9= ',' ( (lv_items_10_0= ruleItem ) ) )* otherlv_11= ')' ( (lv_answers_12_0= ruleAnswer ) ) ( (lv_answers_13_0= ruleAnswer ) )* otherlv_14= ')' )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:510:1: (otherlv_0= 'TableQuestion' ( (lv_name_1_0= ruleEString ) ) ( (lv_isExclusive_2_0= 'exclusive' ) )? ( (lv_isOptional_3_0= 'optional' ) )? ( (lv_body_4_0= ruleEString ) ) otherlv_5= '(' otherlv_6= 'Items' otherlv_7= '(' ( (lv_items_8_0= ruleItem ) ) (otherlv_9= ',' ( (lv_items_10_0= ruleItem ) ) )* otherlv_11= ')' ( (lv_answers_12_0= ruleAnswer ) ) ( (lv_answers_13_0= ruleAnswer ) )* otherlv_14= ')' )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:510:3: otherlv_0= 'TableQuestion' ( (lv_name_1_0= ruleEString ) ) ( (lv_isExclusive_2_0= 'exclusive' ) )? ( (lv_isOptional_3_0= 'optional' ) )? ( (lv_body_4_0= ruleEString ) ) otherlv_5= '(' otherlv_6= 'Items' otherlv_7= '(' ( (lv_items_8_0= ruleItem ) ) (otherlv_9= ',' ( (lv_items_10_0= ruleItem ) ) )* otherlv_11= ')' ( (lv_answers_12_0= ruleAnswer ) ) ( (lv_answers_13_0= ruleAnswer ) )* otherlv_14= ')'
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleTableQuestion1051); 

                	newLeafNode(otherlv_0, grammarAccess.getTableQuestionAccess().getTableQuestionKeyword_0());
                
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:514:1: ( (lv_name_1_0= ruleEString ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:515:1: (lv_name_1_0= ruleEString )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:515:1: (lv_name_1_0= ruleEString )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:516:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTableQuestionAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTableQuestion1072);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTableQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:532:2: ( (lv_isExclusive_2_0= 'exclusive' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==15) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:533:1: (lv_isExclusive_2_0= 'exclusive' )
                    {
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:533:1: (lv_isExclusive_2_0= 'exclusive' )
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:534:3: lv_isExclusive_2_0= 'exclusive'
                    {
                    lv_isExclusive_2_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTableQuestion1090); 

                            newLeafNode(lv_isExclusive_2_0, grammarAccess.getTableQuestionAccess().getIsExclusiveExclusiveKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTableQuestionRule());
                    	        }
                           		setWithLastConsumed(current, "isExclusive", true, "exclusive");
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:547:3: ( (lv_isOptional_3_0= 'optional' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==16) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:548:1: (lv_isOptional_3_0= 'optional' )
                    {
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:548:1: (lv_isOptional_3_0= 'optional' )
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:549:3: lv_isOptional_3_0= 'optional'
                    {
                    lv_isOptional_3_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleTableQuestion1122); 

                            newLeafNode(lv_isOptional_3_0, grammarAccess.getTableQuestionAccess().getIsOptionalOptionalKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTableQuestionRule());
                    	        }
                           		setWithLastConsumed(current, "isOptional", true, "optional");
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:562:3: ( (lv_body_4_0= ruleEString ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:563:1: (lv_body_4_0= ruleEString )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:563:1: (lv_body_4_0= ruleEString )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:564:3: lv_body_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTableQuestionAccess().getBodyEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTableQuestion1157);
            lv_body_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTableQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"body",
                    		lv_body_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleTableQuestion1169); 

                	newLeafNode(otherlv_5, grammarAccess.getTableQuestionAccess().getLeftParenthesisKeyword_5());
                
            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleTableQuestion1181); 

                	newLeafNode(otherlv_6, grammarAccess.getTableQuestionAccess().getItemsKeyword_6());
                
            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleTableQuestion1193); 

                	newLeafNode(otherlv_7, grammarAccess.getTableQuestionAccess().getLeftParenthesisKeyword_7());
                
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:592:1: ( (lv_items_8_0= ruleItem ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:593:1: (lv_items_8_0= ruleItem )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:593:1: (lv_items_8_0= ruleItem )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:594:3: lv_items_8_0= ruleItem
            {
             
            	        newCompositeNode(grammarAccess.getTableQuestionAccess().getItemsItemParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleItem_in_ruleTableQuestion1214);
            lv_items_8_0=ruleItem();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTableQuestionRule());
            	        }
                   		add(
                   			current, 
                   			"items",
                    		lv_items_8_0, 
                    		"Item");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:610:2: (otherlv_9= ',' ( (lv_items_10_0= ruleItem ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==22) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:610:4: otherlv_9= ',' ( (lv_items_10_0= ruleItem ) )
            	    {
            	    otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleTableQuestion1227); 

            	        	newLeafNode(otherlv_9, grammarAccess.getTableQuestionAccess().getCommaKeyword_9_0());
            	        
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:614:1: ( (lv_items_10_0= ruleItem ) )
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:615:1: (lv_items_10_0= ruleItem )
            	    {
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:615:1: (lv_items_10_0= ruleItem )
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:616:3: lv_items_10_0= ruleItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableQuestionAccess().getItemsItemParserRuleCall_9_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleItem_in_ruleTableQuestion1248);
            	    lv_items_10_0=ruleItem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTableQuestionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"items",
            	            		lv_items_10_0, 
            	            		"Item");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_11=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTableQuestion1262); 

                	newLeafNode(otherlv_11, grammarAccess.getTableQuestionAccess().getRightParenthesisKeyword_10());
                
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:636:1: ( (lv_answers_12_0= ruleAnswer ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:637:1: (lv_answers_12_0= ruleAnswer )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:637:1: (lv_answers_12_0= ruleAnswer )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:638:3: lv_answers_12_0= ruleAnswer
            {
             
            	        newCompositeNode(grammarAccess.getTableQuestionAccess().getAnswersAnswerParserRuleCall_11_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleTableQuestion1283);
            lv_answers_12_0=ruleAnswer();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTableQuestionRule());
            	        }
                   		add(
                   			current, 
                   			"answers",
                    		lv_answers_12_0, 
                    		"Answer");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:654:2: ( (lv_answers_13_0= ruleAnswer ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==19) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:655:1: (lv_answers_13_0= ruleAnswer )
            	    {
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:655:1: (lv_answers_13_0= ruleAnswer )
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:656:3: lv_answers_13_0= ruleAnswer
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableQuestionAccess().getAnswersAnswerParserRuleCall_12_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleTableQuestion1304);
            	    lv_answers_13_0=ruleAnswer();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTableQuestionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"answers",
            	            		lv_answers_13_0, 
            	            		"Answer");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_14=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTableQuestion1317); 

                	newLeafNode(otherlv_14, grammarAccess.getTableQuestionAccess().getRightParenthesisKeyword_13());
                

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
    // $ANTLR end "ruleTableQuestion"


    // $ANTLR start "entryRuleItem"
    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:684:1: entryRuleItem returns [EObject current=null] : iv_ruleItem= ruleItem EOF ;
    public final EObject entryRuleItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItem = null;


        try {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:685:2: (iv_ruleItem= ruleItem EOF )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:686:2: iv_ruleItem= ruleItem EOF
            {
             newCompositeNode(grammarAccess.getItemRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleItem_in_entryRuleItem1353);
            iv_ruleItem=ruleItem();

            state._fsp--;

             current =iv_ruleItem; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleItem1363); 

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
    // $ANTLR end "entryRuleItem"


    // $ANTLR start "ruleItem"
    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:693:1: ruleItem returns [EObject current=null] : ( ( (lv_isFreeText_0_0= 'freetext' ) )? ( (lv_body_1_0= ruleEString ) ) ) ;
    public final EObject ruleItem() throws RecognitionException {
        EObject current = null;

        Token lv_isFreeText_0_0=null;
        AntlrDatatypeRuleToken lv_body_1_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:696:28: ( ( ( (lv_isFreeText_0_0= 'freetext' ) )? ( (lv_body_1_0= ruleEString ) ) ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:697:1: ( ( (lv_isFreeText_0_0= 'freetext' ) )? ( (lv_body_1_0= ruleEString ) ) )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:697:1: ( ( (lv_isFreeText_0_0= 'freetext' ) )? ( (lv_body_1_0= ruleEString ) ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:697:2: ( (lv_isFreeText_0_0= 'freetext' ) )? ( (lv_body_1_0= ruleEString ) )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:697:2: ( (lv_isFreeText_0_0= 'freetext' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:698:1: (lv_isFreeText_0_0= 'freetext' )
                    {
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:698:1: (lv_isFreeText_0_0= 'freetext' )
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:699:3: lv_isFreeText_0_0= 'freetext'
                    {
                    lv_isFreeText_0_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleItem1406); 

                            newLeafNode(lv_isFreeText_0_0, grammarAccess.getItemAccess().getIsFreeTextFreetextKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getItemRule());
                    	        }
                           		setWithLastConsumed(current, "isFreeText", true, "freetext");
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:712:3: ( (lv_body_1_0= ruleEString ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:713:1: (lv_body_1_0= ruleEString )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:713:1: (lv_body_1_0= ruleEString )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:714:3: lv_body_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getItemAccess().getBodyEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleItem1441);
            lv_body_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getItemRule());
            	        }
                   		set(
                   			current, 
                   			"body",
                    		lv_body_1_0, 
                    		"EString");
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
    // $ANTLR end "ruleItem"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleSurvey_in_entryRuleSurvey75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSurvey85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleSurvey122 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSurvey143 = new BitSet(new long[]{0x0000000000805000L});
        public static final BitSet FOLLOW_12_in_ruleSurvey156 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSurvey177 = new BitSet(new long[]{0x0000000000805000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleSurvey200 = new BitSet(new long[]{0x0000000000807002L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleSurvey221 = new BitSet(new long[]{0x0000000000807002L});
        public static final BitSet FOLLOW_13_in_ruleSurvey235 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSurvey256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion294 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuestion304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_Impl_in_ruleQuestion351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTableQuestion_in_ruleQuestion378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString414 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_Impl_in_entryRuleQuestion_Impl536 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuestion_Impl546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleQuestion_Impl583 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleQuestion_Impl604 = new BitSet(new long[]{0x0000000000018030L});
        public static final BitSet FOLLOW_15_in_ruleQuestion_Impl622 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_16_in_ruleQuestion_Impl654 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleQuestion_Impl689 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleQuestion_Impl701 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleQuestion_Impl722 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleQuestion_Impl743 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleQuestion_Impl756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_entryRuleAnswer792 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswer802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleAnswer839 = new BitSet(new long[]{0x0000000000100030L});
        public static final BitSet FOLLOW_20_in_ruleAnswer857 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnswer892 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_21_in_ruleAnswer905 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnswer928 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_22_in_ruleAnswer941 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnswer964 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_ruleTableQuestion_in_entryRuleTableQuestion1004 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTableQuestion1014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleTableQuestion1051 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTableQuestion1072 = new BitSet(new long[]{0x0000000000018030L});
        public static final BitSet FOLLOW_15_in_ruleTableQuestion1090 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_16_in_ruleTableQuestion1122 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTableQuestion1157 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleTableQuestion1169 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleTableQuestion1181 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleTableQuestion1193 = new BitSet(new long[]{0x0000000000100030L});
        public static final BitSet FOLLOW_ruleItem_in_ruleTableQuestion1214 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleTableQuestion1227 = new BitSet(new long[]{0x0000000000100030L});
        public static final BitSet FOLLOW_ruleItem_in_ruleTableQuestion1248 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleTableQuestion1262 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleTableQuestion1283 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleTableQuestion1304 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleTableQuestion1317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleItem_in_entryRuleItem1353 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleItem1363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleItem1406 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleItem1441 = new BitSet(new long[]{0x0000000000000002L});
    }


}