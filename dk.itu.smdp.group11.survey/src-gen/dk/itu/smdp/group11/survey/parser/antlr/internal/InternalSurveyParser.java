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
    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:275:1: ruleQuestion_Impl returns [EObject current=null] : (otherlv_0= 'Question' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_isExclusive_3_0= 'exclusive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isOptional_4_0= 'optional' ) ) ) ) ) )* ) ) ) ( (lv_body_5_0= ruleEString ) ) otherlv_6= '(' ( (lv_answers_7_0= ruleAnswer ) ) ( (lv_answers_8_0= ruleAnswer ) )* otherlv_9= ')' ) ;
    public final EObject ruleQuestion_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_isExclusive_3_0=null;
        Token lv_isOptional_4_0=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_body_5_0 = null;

        EObject lv_answers_7_0 = null;

        EObject lv_answers_8_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:278:28: ( (otherlv_0= 'Question' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_isExclusive_3_0= 'exclusive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isOptional_4_0= 'optional' ) ) ) ) ) )* ) ) ) ( (lv_body_5_0= ruleEString ) ) otherlv_6= '(' ( (lv_answers_7_0= ruleAnswer ) ) ( (lv_answers_8_0= ruleAnswer ) )* otherlv_9= ')' ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:279:1: (otherlv_0= 'Question' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_isExclusive_3_0= 'exclusive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isOptional_4_0= 'optional' ) ) ) ) ) )* ) ) ) ( (lv_body_5_0= ruleEString ) ) otherlv_6= '(' ( (lv_answers_7_0= ruleAnswer ) ) ( (lv_answers_8_0= ruleAnswer ) )* otherlv_9= ')' )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:279:1: (otherlv_0= 'Question' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_isExclusive_3_0= 'exclusive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isOptional_4_0= 'optional' ) ) ) ) ) )* ) ) ) ( (lv_body_5_0= ruleEString ) ) otherlv_6= '(' ( (lv_answers_7_0= ruleAnswer ) ) ( (lv_answers_8_0= ruleAnswer ) )* otherlv_9= ')' )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:279:3: otherlv_0= 'Question' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_isExclusive_3_0= 'exclusive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isOptional_4_0= 'optional' ) ) ) ) ) )* ) ) ) ( (lv_body_5_0= ruleEString ) ) otherlv_6= '(' ( (lv_answers_7_0= ruleAnswer ) ) ( (lv_answers_8_0= ruleAnswer ) )* otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleQuestion_Impl583); 

                	newLeafNode(otherlv_0, grammarAccess.getQuestion_ImplAccess().getQuestionKeyword_0());
                
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:283:1: ( (lv_name_1_0= RULE_ID ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:284:1: (lv_name_1_0= RULE_ID )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:284:1: (lv_name_1_0= RULE_ID )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:285:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQuestion_Impl600); 

            			newLeafNode(lv_name_1_0, grammarAccess.getQuestion_ImplAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQuestion_ImplRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:301:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_isExclusive_3_0= 'exclusive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isOptional_4_0= 'optional' ) ) ) ) ) )* ) ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:303:1: ( ( ( ({...}? => ( ({...}? => ( (lv_isExclusive_3_0= 'exclusive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isOptional_4_0= 'optional' ) ) ) ) ) )* ) )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:303:1: ( ( ( ({...}? => ( ({...}? => ( (lv_isExclusive_3_0= 'exclusive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isOptional_4_0= 'optional' ) ) ) ) ) )* ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:304:2: ( ( ({...}? => ( ({...}? => ( (lv_isExclusive_3_0= 'exclusive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isOptional_4_0= 'optional' ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getQuestion_ImplAccess().getUnorderedGroup_2());
            	
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:307:2: ( ( ({...}? => ( ({...}? => ( (lv_isExclusive_3_0= 'exclusive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isOptional_4_0= 'optional' ) ) ) ) ) )* )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:308:3: ( ({...}? => ( ({...}? => ( (lv_isExclusive_3_0= 'exclusive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isOptional_4_0= 'optional' ) ) ) ) ) )*
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:308:3: ( ({...}? => ( ({...}? => ( (lv_isExclusive_3_0= 'exclusive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isOptional_4_0= 'optional' ) ) ) ) ) )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( LA6_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestion_ImplAccess().getUnorderedGroup_2(), 0) ) {
                    alt6=1;
                }
                else if ( LA6_0 ==16 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestion_ImplAccess().getUnorderedGroup_2(), 1) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:310:4: ({...}? => ( ({...}? => ( (lv_isExclusive_3_0= 'exclusive' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:310:4: ({...}? => ( ({...}? => ( (lv_isExclusive_3_0= 'exclusive' ) ) ) ) )
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:311:5: {...}? => ( ({...}? => ( (lv_isExclusive_3_0= 'exclusive' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQuestion_ImplAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleQuestion_Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getQuestion_ImplAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:311:110: ( ({...}? => ( (lv_isExclusive_3_0= 'exclusive' ) ) ) )
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:312:6: ({...}? => ( (lv_isExclusive_3_0= 'exclusive' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getQuestion_ImplAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:315:6: ({...}? => ( (lv_isExclusive_3_0= 'exclusive' ) ) )
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:315:7: {...}? => ( (lv_isExclusive_3_0= 'exclusive' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleQuestion_Impl", "true");
            	    }
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:315:16: ( (lv_isExclusive_3_0= 'exclusive' ) )
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:316:1: (lv_isExclusive_3_0= 'exclusive' )
            	    {
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:316:1: (lv_isExclusive_3_0= 'exclusive' )
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:317:3: lv_isExclusive_3_0= 'exclusive'
            	    {
            	    lv_isExclusive_3_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleQuestion_Impl668); 

            	            newLeafNode(lv_isExclusive_3_0, grammarAccess.getQuestion_ImplAccess().getIsExclusiveExclusiveKeyword_2_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getQuestion_ImplRule());
            	    	        }
            	           		setWithLastConsumed(current, "isExclusive", true, "exclusive");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQuestion_ImplAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:337:4: ({...}? => ( ({...}? => ( (lv_isOptional_4_0= 'optional' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:337:4: ({...}? => ( ({...}? => ( (lv_isOptional_4_0= 'optional' ) ) ) ) )
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:338:5: {...}? => ( ({...}? => ( (lv_isOptional_4_0= 'optional' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQuestion_ImplAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleQuestion_Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getQuestion_ImplAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:338:110: ( ({...}? => ( (lv_isOptional_4_0= 'optional' ) ) ) )
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:339:6: ({...}? => ( (lv_isOptional_4_0= 'optional' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getQuestion_ImplAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:342:6: ({...}? => ( (lv_isOptional_4_0= 'optional' ) ) )
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:342:7: {...}? => ( (lv_isOptional_4_0= 'optional' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleQuestion_Impl", "true");
            	    }
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:342:16: ( (lv_isOptional_4_0= 'optional' ) )
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:343:1: (lv_isOptional_4_0= 'optional' )
            	    {
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:343:1: (lv_isOptional_4_0= 'optional' )
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:344:3: lv_isOptional_4_0= 'optional'
            	    {
            	    lv_isOptional_4_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleQuestion_Impl753); 

            	            newLeafNode(lv_isOptional_4_0, grammarAccess.getQuestion_ImplAccess().getIsOptionalOptionalKeyword_2_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getQuestion_ImplRule());
            	    	        }
            	           		setWithLastConsumed(current, "isOptional", true, "optional");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQuestion_ImplAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getQuestion_ImplAccess().getUnorderedGroup_2());
            	

            }

            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:371:2: ( (lv_body_5_0= ruleEString ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:372:1: (lv_body_5_0= ruleEString )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:372:1: (lv_body_5_0= ruleEString )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:373:3: lv_body_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getQuestion_ImplAccess().getBodyEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleQuestion_Impl827);
            lv_body_5_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuestion_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"body",
                    		lv_body_5_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleQuestion_Impl839); 

                	newLeafNode(otherlv_6, grammarAccess.getQuestion_ImplAccess().getLeftParenthesisKeyword_4());
                
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:393:1: ( (lv_answers_7_0= ruleAnswer ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:394:1: (lv_answers_7_0= ruleAnswer )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:394:1: (lv_answers_7_0= ruleAnswer )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:395:3: lv_answers_7_0= ruleAnswer
            {
             
            	        newCompositeNode(grammarAccess.getQuestion_ImplAccess().getAnswersAnswerParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleQuestion_Impl860);
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

            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:411:2: ( (lv_answers_8_0= ruleAnswer ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:412:1: (lv_answers_8_0= ruleAnswer )
            	    {
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:412:1: (lv_answers_8_0= ruleAnswer )
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:413:3: lv_answers_8_0= ruleAnswer
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuestion_ImplAccess().getAnswersAnswerParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleQuestion_Impl881);
            	    lv_answers_8_0=ruleAnswer();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQuestion_ImplRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"answers",
            	            		lv_answers_8_0, 
            	            		"Answer");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleQuestion_Impl894); 

                	newLeafNode(otherlv_9, grammarAccess.getQuestion_ImplAccess().getRightParenthesisKeyword_7());
                

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
    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:441:1: entryRuleAnswer returns [EObject current=null] : iv_ruleAnswer= ruleAnswer EOF ;
    public final EObject entryRuleAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswer = null;


        try {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:442:2: (iv_ruleAnswer= ruleAnswer EOF )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:443:2: iv_ruleAnswer= ruleAnswer EOF
            {
             newCompositeNode(grammarAccess.getAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_entryRuleAnswer930);
            iv_ruleAnswer=ruleAnswer();

            state._fsp--;

             current =iv_ruleAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswer940); 

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
    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:450:1: ruleAnswer returns [EObject current=null] : (otherlv_0= 'Answer' ( (lv_isFreeText_1_0= 'freetext' ) )? ( (lv_body_2_0= ruleEString ) ) (otherlv_3= '->' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? ) ;
    public final EObject ruleAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isFreeText_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_body_2_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:453:28: ( (otherlv_0= 'Answer' ( (lv_isFreeText_1_0= 'freetext' ) )? ( (lv_body_2_0= ruleEString ) ) (otherlv_3= '->' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:454:1: (otherlv_0= 'Answer' ( (lv_isFreeText_1_0= 'freetext' ) )? ( (lv_body_2_0= ruleEString ) ) (otherlv_3= '->' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:454:1: (otherlv_0= 'Answer' ( (lv_isFreeText_1_0= 'freetext' ) )? ( (lv_body_2_0= ruleEString ) ) (otherlv_3= '->' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:454:3: otherlv_0= 'Answer' ( (lv_isFreeText_1_0= 'freetext' ) )? ( (lv_body_2_0= ruleEString ) ) (otherlv_3= '->' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )?
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAnswer977); 

                	newLeafNode(otherlv_0, grammarAccess.getAnswerAccess().getAnswerKeyword_0());
                
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:458:1: ( (lv_isFreeText_1_0= 'freetext' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:459:1: (lv_isFreeText_1_0= 'freetext' )
                    {
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:459:1: (lv_isFreeText_1_0= 'freetext' )
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:460:3: lv_isFreeText_1_0= 'freetext'
                    {
                    lv_isFreeText_1_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAnswer995); 

                            newLeafNode(lv_isFreeText_1_0, grammarAccess.getAnswerAccess().getIsFreeTextFreetextKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAnswerRule());
                    	        }
                           		setWithLastConsumed(current, "isFreeText", true, "freetext");
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:473:3: ( (lv_body_2_0= ruleEString ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:474:1: (lv_body_2_0= ruleEString )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:474:1: (lv_body_2_0= ruleEString )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:475:3: lv_body_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAnswerAccess().getBodyEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnswer1030);
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

            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:491:2: (otherlv_3= '->' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:491:4: otherlv_3= '->' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAnswer1043); 

                        	newLeafNode(otherlv_3, grammarAccess.getAnswerAccess().getHyphenMinusGreaterThanSignKeyword_3_0());
                        
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:495:1: ( ( ruleEString ) )
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:496:1: ( ruleEString )
                    {
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:496:1: ( ruleEString )
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:497:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAnswerRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAnswerAccess().getFollowupQuestionCrossReference_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnswer1066);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:510:2: (otherlv_5= ',' ( ( ruleEString ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==22) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:510:4: otherlv_5= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAnswer1079); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getAnswerAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:514:1: ( ( ruleEString ) )
                    	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:515:1: ( ruleEString )
                    	    {
                    	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:515:1: ( ruleEString )
                    	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:516:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getAnswerRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getAnswerAccess().getFollowupQuestionCrossReference_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnswer1102);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
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
    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:537:1: entryRuleTableQuestion returns [EObject current=null] : iv_ruleTableQuestion= ruleTableQuestion EOF ;
    public final EObject entryRuleTableQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableQuestion = null;


        try {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:538:2: (iv_ruleTableQuestion= ruleTableQuestion EOF )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:539:2: iv_ruleTableQuestion= ruleTableQuestion EOF
            {
             newCompositeNode(grammarAccess.getTableQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTableQuestion_in_entryRuleTableQuestion1142);
            iv_ruleTableQuestion=ruleTableQuestion();

            state._fsp--;

             current =iv_ruleTableQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTableQuestion1152); 

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
    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:546:1: ruleTableQuestion returns [EObject current=null] : (otherlv_0= 'TableQuestion' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_isExclusive_3_0= 'exclusive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isOptional_4_0= 'optional' ) ) ) ) ) )* ) ) ) ( (lv_body_5_0= ruleEString ) ) otherlv_6= '(' otherlv_7= 'Items' otherlv_8= '(' ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* otherlv_12= ')' ( (lv_answers_13_0= ruleAnswer ) ) ( (lv_answers_14_0= ruleAnswer ) )* otherlv_15= ')' ) ;
    public final EObject ruleTableQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_isExclusive_3_0=null;
        Token lv_isOptional_4_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_body_5_0 = null;

        EObject lv_items_9_0 = null;

        EObject lv_items_11_0 = null;

        EObject lv_answers_13_0 = null;

        EObject lv_answers_14_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:549:28: ( (otherlv_0= 'TableQuestion' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_isExclusive_3_0= 'exclusive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isOptional_4_0= 'optional' ) ) ) ) ) )* ) ) ) ( (lv_body_5_0= ruleEString ) ) otherlv_6= '(' otherlv_7= 'Items' otherlv_8= '(' ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* otherlv_12= ')' ( (lv_answers_13_0= ruleAnswer ) ) ( (lv_answers_14_0= ruleAnswer ) )* otherlv_15= ')' ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:550:1: (otherlv_0= 'TableQuestion' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_isExclusive_3_0= 'exclusive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isOptional_4_0= 'optional' ) ) ) ) ) )* ) ) ) ( (lv_body_5_0= ruleEString ) ) otherlv_6= '(' otherlv_7= 'Items' otherlv_8= '(' ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* otherlv_12= ')' ( (lv_answers_13_0= ruleAnswer ) ) ( (lv_answers_14_0= ruleAnswer ) )* otherlv_15= ')' )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:550:1: (otherlv_0= 'TableQuestion' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_isExclusive_3_0= 'exclusive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isOptional_4_0= 'optional' ) ) ) ) ) )* ) ) ) ( (lv_body_5_0= ruleEString ) ) otherlv_6= '(' otherlv_7= 'Items' otherlv_8= '(' ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* otherlv_12= ')' ( (lv_answers_13_0= ruleAnswer ) ) ( (lv_answers_14_0= ruleAnswer ) )* otherlv_15= ')' )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:550:3: otherlv_0= 'TableQuestion' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_isExclusive_3_0= 'exclusive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isOptional_4_0= 'optional' ) ) ) ) ) )* ) ) ) ( (lv_body_5_0= ruleEString ) ) otherlv_6= '(' otherlv_7= 'Items' otherlv_8= '(' ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* otherlv_12= ')' ( (lv_answers_13_0= ruleAnswer ) ) ( (lv_answers_14_0= ruleAnswer ) )* otherlv_15= ')'
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleTableQuestion1189); 

                	newLeafNode(otherlv_0, grammarAccess.getTableQuestionAccess().getTableQuestionKeyword_0());
                
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:554:1: ( (lv_name_1_0= RULE_ID ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:555:1: (lv_name_1_0= RULE_ID )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:555:1: (lv_name_1_0= RULE_ID )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:556:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTableQuestion1206); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTableQuestionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTableQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:572:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_isExclusive_3_0= 'exclusive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isOptional_4_0= 'optional' ) ) ) ) ) )* ) ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:574:1: ( ( ( ({...}? => ( ({...}? => ( (lv_isExclusive_3_0= 'exclusive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isOptional_4_0= 'optional' ) ) ) ) ) )* ) )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:574:1: ( ( ( ({...}? => ( ({...}? => ( (lv_isExclusive_3_0= 'exclusive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isOptional_4_0= 'optional' ) ) ) ) ) )* ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:575:2: ( ( ({...}? => ( ({...}? => ( (lv_isExclusive_3_0= 'exclusive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isOptional_4_0= 'optional' ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getTableQuestionAccess().getUnorderedGroup_2());
            	
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:578:2: ( ( ({...}? => ( ({...}? => ( (lv_isExclusive_3_0= 'exclusive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isOptional_4_0= 'optional' ) ) ) ) ) )* )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:579:3: ( ({...}? => ( ({...}? => ( (lv_isExclusive_3_0= 'exclusive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isOptional_4_0= 'optional' ) ) ) ) ) )*
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:579:3: ( ({...}? => ( ({...}? => ( (lv_isExclusive_3_0= 'exclusive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isOptional_4_0= 'optional' ) ) ) ) ) )*
            loop11:
            do {
                int alt11=3;
                int LA11_0 = input.LA(1);

                if ( LA11_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableQuestionAccess().getUnorderedGroup_2(), 0) ) {
                    alt11=1;
                }
                else if ( LA11_0 ==16 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableQuestionAccess().getUnorderedGroup_2(), 1) ) {
                    alt11=2;
                }


                switch (alt11) {
            	case 1 :
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:581:4: ({...}? => ( ({...}? => ( (lv_isExclusive_3_0= 'exclusive' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:581:4: ({...}? => ( ({...}? => ( (lv_isExclusive_3_0= 'exclusive' ) ) ) ) )
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:582:5: {...}? => ( ({...}? => ( (lv_isExclusive_3_0= 'exclusive' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableQuestionAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTableQuestion", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableQuestionAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:582:110: ( ({...}? => ( (lv_isExclusive_3_0= 'exclusive' ) ) ) )
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:583:6: ({...}? => ( (lv_isExclusive_3_0= 'exclusive' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableQuestionAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:586:6: ({...}? => ( (lv_isExclusive_3_0= 'exclusive' ) ) )
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:586:7: {...}? => ( (lv_isExclusive_3_0= 'exclusive' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTableQuestion", "true");
            	    }
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:586:16: ( (lv_isExclusive_3_0= 'exclusive' ) )
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:587:1: (lv_isExclusive_3_0= 'exclusive' )
            	    {
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:587:1: (lv_isExclusive_3_0= 'exclusive' )
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:588:3: lv_isExclusive_3_0= 'exclusive'
            	    {
            	    lv_isExclusive_3_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTableQuestion1274); 

            	            newLeafNode(lv_isExclusive_3_0, grammarAccess.getTableQuestionAccess().getIsExclusiveExclusiveKeyword_2_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTableQuestionRule());
            	    	        }
            	           		setWithLastConsumed(current, "isExclusive", true, "exclusive");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTableQuestionAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:608:4: ({...}? => ( ({...}? => ( (lv_isOptional_4_0= 'optional' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:608:4: ({...}? => ( ({...}? => ( (lv_isOptional_4_0= 'optional' ) ) ) ) )
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:609:5: {...}? => ( ({...}? => ( (lv_isOptional_4_0= 'optional' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableQuestionAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTableQuestion", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableQuestionAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:609:110: ( ({...}? => ( (lv_isOptional_4_0= 'optional' ) ) ) )
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:610:6: ({...}? => ( (lv_isOptional_4_0= 'optional' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableQuestionAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:613:6: ({...}? => ( (lv_isOptional_4_0= 'optional' ) ) )
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:613:7: {...}? => ( (lv_isOptional_4_0= 'optional' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTableQuestion", "true");
            	    }
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:613:16: ( (lv_isOptional_4_0= 'optional' ) )
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:614:1: (lv_isOptional_4_0= 'optional' )
            	    {
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:614:1: (lv_isOptional_4_0= 'optional' )
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:615:3: lv_isOptional_4_0= 'optional'
            	    {
            	    lv_isOptional_4_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleTableQuestion1359); 

            	            newLeafNode(lv_isOptional_4_0, grammarAccess.getTableQuestionAccess().getIsOptionalOptionalKeyword_2_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTableQuestionRule());
            	    	        }
            	           		setWithLastConsumed(current, "isOptional", true, "optional");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTableQuestionAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getTableQuestionAccess().getUnorderedGroup_2());
            	

            }

            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:642:2: ( (lv_body_5_0= ruleEString ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:643:1: (lv_body_5_0= ruleEString )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:643:1: (lv_body_5_0= ruleEString )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:644:3: lv_body_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTableQuestionAccess().getBodyEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTableQuestion1433);
            lv_body_5_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTableQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"body",
                    		lv_body_5_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleTableQuestion1445); 

                	newLeafNode(otherlv_6, grammarAccess.getTableQuestionAccess().getLeftParenthesisKeyword_4());
                
            otherlv_7=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleTableQuestion1457); 

                	newLeafNode(otherlv_7, grammarAccess.getTableQuestionAccess().getItemsKeyword_5());
                
            otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleTableQuestion1469); 

                	newLeafNode(otherlv_8, grammarAccess.getTableQuestionAccess().getLeftParenthesisKeyword_6());
                
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:672:1: ( (lv_items_9_0= ruleItem ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:673:1: (lv_items_9_0= ruleItem )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:673:1: (lv_items_9_0= ruleItem )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:674:3: lv_items_9_0= ruleItem
            {
             
            	        newCompositeNode(grammarAccess.getTableQuestionAccess().getItemsItemParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleItem_in_ruleTableQuestion1490);
            lv_items_9_0=ruleItem();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTableQuestionRule());
            	        }
                   		add(
                   			current, 
                   			"items",
                    		lv_items_9_0, 
                    		"Item");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:690:2: (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==22) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:690:4: otherlv_10= ',' ( (lv_items_11_0= ruleItem ) )
            	    {
            	    otherlv_10=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleTableQuestion1503); 

            	        	newLeafNode(otherlv_10, grammarAccess.getTableQuestionAccess().getCommaKeyword_8_0());
            	        
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:694:1: ( (lv_items_11_0= ruleItem ) )
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:695:1: (lv_items_11_0= ruleItem )
            	    {
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:695:1: (lv_items_11_0= ruleItem )
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:696:3: lv_items_11_0= ruleItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableQuestionAccess().getItemsItemParserRuleCall_8_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleItem_in_ruleTableQuestion1524);
            	    lv_items_11_0=ruleItem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTableQuestionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"items",
            	            		lv_items_11_0, 
            	            		"Item");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_12=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTableQuestion1538); 

                	newLeafNode(otherlv_12, grammarAccess.getTableQuestionAccess().getRightParenthesisKeyword_9());
                
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:716:1: ( (lv_answers_13_0= ruleAnswer ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:717:1: (lv_answers_13_0= ruleAnswer )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:717:1: (lv_answers_13_0= ruleAnswer )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:718:3: lv_answers_13_0= ruleAnswer
            {
             
            	        newCompositeNode(grammarAccess.getTableQuestionAccess().getAnswersAnswerParserRuleCall_10_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleTableQuestion1559);
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

            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:734:2: ( (lv_answers_14_0= ruleAnswer ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==19) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:735:1: (lv_answers_14_0= ruleAnswer )
            	    {
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:735:1: (lv_answers_14_0= ruleAnswer )
            	    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:736:3: lv_answers_14_0= ruleAnswer
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableQuestionAccess().getAnswersAnswerParserRuleCall_11_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleTableQuestion1580);
            	    lv_answers_14_0=ruleAnswer();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTableQuestionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"answers",
            	            		lv_answers_14_0, 
            	            		"Answer");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_15=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTableQuestion1593); 

                	newLeafNode(otherlv_15, grammarAccess.getTableQuestionAccess().getRightParenthesisKeyword_12());
                

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
    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:764:1: entryRuleItem returns [EObject current=null] : iv_ruleItem= ruleItem EOF ;
    public final EObject entryRuleItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItem = null;


        try {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:765:2: (iv_ruleItem= ruleItem EOF )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:766:2: iv_ruleItem= ruleItem EOF
            {
             newCompositeNode(grammarAccess.getItemRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleItem_in_entryRuleItem1629);
            iv_ruleItem=ruleItem();

            state._fsp--;

             current =iv_ruleItem; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleItem1639); 

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
    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:773:1: ruleItem returns [EObject current=null] : ( ( (lv_isFreeText_0_0= 'freetext' ) )? ( (lv_body_1_0= ruleEString ) ) ) ;
    public final EObject ruleItem() throws RecognitionException {
        EObject current = null;

        Token lv_isFreeText_0_0=null;
        AntlrDatatypeRuleToken lv_body_1_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:776:28: ( ( ( (lv_isFreeText_0_0= 'freetext' ) )? ( (lv_body_1_0= ruleEString ) ) ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:777:1: ( ( (lv_isFreeText_0_0= 'freetext' ) )? ( (lv_body_1_0= ruleEString ) ) )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:777:1: ( ( (lv_isFreeText_0_0= 'freetext' ) )? ( (lv_body_1_0= ruleEString ) ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:777:2: ( (lv_isFreeText_0_0= 'freetext' ) )? ( (lv_body_1_0= ruleEString ) )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:777:2: ( (lv_isFreeText_0_0= 'freetext' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:778:1: (lv_isFreeText_0_0= 'freetext' )
                    {
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:778:1: (lv_isFreeText_0_0= 'freetext' )
                    // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:779:3: lv_isFreeText_0_0= 'freetext'
                    {
                    lv_isFreeText_0_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleItem1682); 

                            newLeafNode(lv_isFreeText_0_0, grammarAccess.getItemAccess().getIsFreeTextFreetextKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getItemRule());
                    	        }
                           		setWithLastConsumed(current, "isFreeText", true, "freetext");
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:792:3: ( (lv_body_1_0= ruleEString ) )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:793:1: (lv_body_1_0= ruleEString )
            {
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:793:1: (lv_body_1_0= ruleEString )
            // ../dk.itu.smdp.group11.survey/src-gen/dk/itu/smdp/group11/survey/parser/antlr/internal/InternalSurvey.g:794:3: lv_body_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getItemAccess().getBodyEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleItem1717);
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
        public static final BitSet FOLLOW_14_in_ruleQuestion_Impl583 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQuestion_Impl600 = new BitSet(new long[]{0x0000000000018030L});
        public static final BitSet FOLLOW_15_in_ruleQuestion_Impl668 = new BitSet(new long[]{0x0000000000018030L});
        public static final BitSet FOLLOW_16_in_ruleQuestion_Impl753 = new BitSet(new long[]{0x0000000000018030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleQuestion_Impl827 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleQuestion_Impl839 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleQuestion_Impl860 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleQuestion_Impl881 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleQuestion_Impl894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_entryRuleAnswer930 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswer940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleAnswer977 = new BitSet(new long[]{0x0000000000100030L});
        public static final BitSet FOLLOW_20_in_ruleAnswer995 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnswer1030 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_21_in_ruleAnswer1043 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnswer1066 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_22_in_ruleAnswer1079 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnswer1102 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_ruleTableQuestion_in_entryRuleTableQuestion1142 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTableQuestion1152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleTableQuestion1189 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTableQuestion1206 = new BitSet(new long[]{0x0000000000018030L});
        public static final BitSet FOLLOW_15_in_ruleTableQuestion1274 = new BitSet(new long[]{0x0000000000018030L});
        public static final BitSet FOLLOW_16_in_ruleTableQuestion1359 = new BitSet(new long[]{0x0000000000018030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTableQuestion1433 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleTableQuestion1445 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleTableQuestion1457 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleTableQuestion1469 = new BitSet(new long[]{0x0000000000100030L});
        public static final BitSet FOLLOW_ruleItem_in_ruleTableQuestion1490 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleTableQuestion1503 = new BitSet(new long[]{0x0000000000100030L});
        public static final BitSet FOLLOW_ruleItem_in_ruleTableQuestion1524 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleTableQuestion1538 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleTableQuestion1559 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleTableQuestion1580 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleTableQuestion1593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleItem_in_entryRuleItem1629 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleItem1639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleItem1682 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleItem1717 = new BitSet(new long[]{0x0000000000000002L});
    }


}