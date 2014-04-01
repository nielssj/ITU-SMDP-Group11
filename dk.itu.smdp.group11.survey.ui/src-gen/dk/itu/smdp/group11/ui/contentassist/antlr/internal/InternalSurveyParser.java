package dk.itu.smdp.group11.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import dk.itu.smdp.group11.services.SurveyGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSurveyParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Survey'", "'Intro'", "'Outro'", "'Question'", "'('", "')'", "'Answer'", "'ex'", "'opt'", "'free'"
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
    public String getGrammarFileName() { return "../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g"; }


     
     	private SurveyGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SurveyGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleSurvey"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:60:1: entryRuleSurvey : ruleSurvey EOF ;
    public final void entryRuleSurvey() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:61:1: ( ruleSurvey EOF )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:62:1: ruleSurvey EOF
            {
             before(grammarAccess.getSurveyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSurvey_in_entryRuleSurvey61);
            ruleSurvey();

            state._fsp--;

             after(grammarAccess.getSurveyRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSurvey68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSurvey"


    // $ANTLR start "ruleSurvey"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:69:1: ruleSurvey : ( ( rule__Survey__Group__0 ) ) ;
    public final void ruleSurvey() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:73:2: ( ( ( rule__Survey__Group__0 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:74:1: ( ( rule__Survey__Group__0 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:74:1: ( ( rule__Survey__Group__0 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:75:1: ( rule__Survey__Group__0 )
            {
             before(grammarAccess.getSurveyAccess().getGroup()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:76:1: ( rule__Survey__Group__0 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:76:2: rule__Survey__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__0_in_ruleSurvey94);
            rule__Survey__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSurveyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSurvey"


    // $ANTLR start "entryRuleQuestion"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:88:1: entryRuleQuestion : ruleQuestion EOF ;
    public final void entryRuleQuestion() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:89:1: ( ruleQuestion EOF )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:90:1: ruleQuestion EOF
            {
             before(grammarAccess.getQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_entryRuleQuestion121);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuestion128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:97:1: ruleQuestion : ( ( rule__Question__Group__0 ) ) ;
    public final void ruleQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:101:2: ( ( ( rule__Question__Group__0 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:102:1: ( ( rule__Question__Group__0 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:102:1: ( ( rule__Question__Group__0 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:103:1: ( rule__Question__Group__0 )
            {
             before(grammarAccess.getQuestionAccess().getGroup()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:104:1: ( rule__Question__Group__0 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:104:2: rule__Question__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__0_in_ruleQuestion154);
            rule__Question__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleContent"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:116:1: entryRuleContent : ruleContent EOF ;
    public final void entryRuleContent() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:117:1: ( ruleContent EOF )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:118:1: ruleContent EOF
            {
             before(grammarAccess.getContentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleContent_in_entryRuleContent181);
            ruleContent();

            state._fsp--;

             after(grammarAccess.getContentRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleContent188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContent"


    // $ANTLR start "ruleContent"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:125:1: ruleContent : ( ( rule__Content__Group__0 ) ) ;
    public final void ruleContent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:129:2: ( ( ( rule__Content__Group__0 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:130:1: ( ( rule__Content__Group__0 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:130:1: ( ( rule__Content__Group__0 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:131:1: ( rule__Content__Group__0 )
            {
             before(grammarAccess.getContentAccess().getGroup()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:132:1: ( rule__Content__Group__0 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:132:2: rule__Content__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Content__Group__0_in_ruleContent214);
            rule__Content__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContent"


    // $ANTLR start "entryRuleAnswer"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:144:1: entryRuleAnswer : ruleAnswer EOF ;
    public final void entryRuleAnswer() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:145:1: ( ruleAnswer EOF )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:146:1: ruleAnswer EOF
            {
             before(grammarAccess.getAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_entryRuleAnswer241);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getAnswerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswer248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnswer"


    // $ANTLR start "ruleAnswer"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:153:1: ruleAnswer : ( ( rule__Answer__Group__0 ) ) ;
    public final void ruleAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:157:2: ( ( ( rule__Answer__Group__0 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:158:1: ( ( rule__Answer__Group__0 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:158:1: ( ( rule__Answer__Group__0 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:159:1: ( rule__Answer__Group__0 )
            {
             before(grammarAccess.getAnswerAccess().getGroup()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:160:1: ( rule__Answer__Group__0 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:160:2: rule__Answer__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__0_in_ruleAnswer274);
            rule__Answer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnswerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnswer"


    // $ANTLR start "entryRuleEString"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:172:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:173:1: ( ruleEString EOF )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:174:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString301);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:181:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:185:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:186:1: ( ( rule__EString__Alternatives ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:186:1: ( ( rule__EString__Alternatives ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:187:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:188:1: ( rule__EString__Alternatives )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:188:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString334);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "rule__EString__Alternatives"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:200:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:204:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:205:1: ( RULE_STRING )
                    {
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:205:1: ( RULE_STRING )
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:206:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives370); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:211:6: ( RULE_ID )
                    {
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:211:6: ( RULE_ID )
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:212:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives387); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Survey__Group__0"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:224:1: rule__Survey__Group__0 : rule__Survey__Group__0__Impl rule__Survey__Group__1 ;
    public final void rule__Survey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:228:1: ( rule__Survey__Group__0__Impl rule__Survey__Group__1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:229:2: rule__Survey__Group__0__Impl rule__Survey__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__0__Impl_in_rule__Survey__Group__0417);
            rule__Survey__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__1_in_rule__Survey__Group__0420);
            rule__Survey__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__0"


    // $ANTLR start "rule__Survey__Group__0__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:236:1: rule__Survey__Group__0__Impl : ( 'Survey' ) ;
    public final void rule__Survey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:240:1: ( ( 'Survey' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:241:1: ( 'Survey' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:241:1: ( 'Survey' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:242:1: 'Survey'
            {
             before(grammarAccess.getSurveyAccess().getSurveyKeyword_0()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Survey__Group__0__Impl448); 
             after(grammarAccess.getSurveyAccess().getSurveyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__0__Impl"


    // $ANTLR start "rule__Survey__Group__1"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:255:1: rule__Survey__Group__1 : rule__Survey__Group__1__Impl rule__Survey__Group__2 ;
    public final void rule__Survey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:259:1: ( rule__Survey__Group__1__Impl rule__Survey__Group__2 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:260:2: rule__Survey__Group__1__Impl rule__Survey__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__1__Impl_in_rule__Survey__Group__1479);
            rule__Survey__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__2_in_rule__Survey__Group__1482);
            rule__Survey__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__1"


    // $ANTLR start "rule__Survey__Group__1__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:267:1: rule__Survey__Group__1__Impl : ( ( rule__Survey__NameAssignment_1 ) ) ;
    public final void rule__Survey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:271:1: ( ( ( rule__Survey__NameAssignment_1 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:272:1: ( ( rule__Survey__NameAssignment_1 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:272:1: ( ( rule__Survey__NameAssignment_1 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:273:1: ( rule__Survey__NameAssignment_1 )
            {
             before(grammarAccess.getSurveyAccess().getNameAssignment_1()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:274:1: ( rule__Survey__NameAssignment_1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:274:2: rule__Survey__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__NameAssignment_1_in_rule__Survey__Group__1__Impl509);
            rule__Survey__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSurveyAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__1__Impl"


    // $ANTLR start "rule__Survey__Group__2"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:284:1: rule__Survey__Group__2 : rule__Survey__Group__2__Impl rule__Survey__Group__3 ;
    public final void rule__Survey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:288:1: ( rule__Survey__Group__2__Impl rule__Survey__Group__3 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:289:2: rule__Survey__Group__2__Impl rule__Survey__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__2__Impl_in_rule__Survey__Group__2539);
            rule__Survey__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__3_in_rule__Survey__Group__2542);
            rule__Survey__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__2"


    // $ANTLR start "rule__Survey__Group__2__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:296:1: rule__Survey__Group__2__Impl : ( 'Intro' ) ;
    public final void rule__Survey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:300:1: ( ( 'Intro' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:301:1: ( 'Intro' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:301:1: ( 'Intro' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:302:1: 'Intro'
            {
             before(grammarAccess.getSurveyAccess().getIntroKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Survey__Group__2__Impl570); 
             after(grammarAccess.getSurveyAccess().getIntroKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__2__Impl"


    // $ANTLR start "rule__Survey__Group__3"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:315:1: rule__Survey__Group__3 : rule__Survey__Group__3__Impl rule__Survey__Group__4 ;
    public final void rule__Survey__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:319:1: ( rule__Survey__Group__3__Impl rule__Survey__Group__4 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:320:2: rule__Survey__Group__3__Impl rule__Survey__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__3__Impl_in_rule__Survey__Group__3601);
            rule__Survey__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__4_in_rule__Survey__Group__3604);
            rule__Survey__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__3"


    // $ANTLR start "rule__Survey__Group__3__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:327:1: rule__Survey__Group__3__Impl : ( ( rule__Survey__IntroAssignment_3 ) ) ;
    public final void rule__Survey__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:331:1: ( ( ( rule__Survey__IntroAssignment_3 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:332:1: ( ( rule__Survey__IntroAssignment_3 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:332:1: ( ( rule__Survey__IntroAssignment_3 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:333:1: ( rule__Survey__IntroAssignment_3 )
            {
             before(grammarAccess.getSurveyAccess().getIntroAssignment_3()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:334:1: ( rule__Survey__IntroAssignment_3 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:334:2: rule__Survey__IntroAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__IntroAssignment_3_in_rule__Survey__Group__3__Impl631);
            rule__Survey__IntroAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSurveyAccess().getIntroAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__3__Impl"


    // $ANTLR start "rule__Survey__Group__4"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:344:1: rule__Survey__Group__4 : rule__Survey__Group__4__Impl rule__Survey__Group__5 ;
    public final void rule__Survey__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:348:1: ( rule__Survey__Group__4__Impl rule__Survey__Group__5 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:349:2: rule__Survey__Group__4__Impl rule__Survey__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__4__Impl_in_rule__Survey__Group__4661);
            rule__Survey__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__5_in_rule__Survey__Group__4664);
            rule__Survey__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__4"


    // $ANTLR start "rule__Survey__Group__4__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:356:1: rule__Survey__Group__4__Impl : ( ( rule__Survey__QuestionsAssignment_4 ) ) ;
    public final void rule__Survey__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:360:1: ( ( ( rule__Survey__QuestionsAssignment_4 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:361:1: ( ( rule__Survey__QuestionsAssignment_4 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:361:1: ( ( rule__Survey__QuestionsAssignment_4 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:362:1: ( rule__Survey__QuestionsAssignment_4 )
            {
             before(grammarAccess.getSurveyAccess().getQuestionsAssignment_4()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:363:1: ( rule__Survey__QuestionsAssignment_4 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:363:2: rule__Survey__QuestionsAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__QuestionsAssignment_4_in_rule__Survey__Group__4__Impl691);
            rule__Survey__QuestionsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSurveyAccess().getQuestionsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__4__Impl"


    // $ANTLR start "rule__Survey__Group__5"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:373:1: rule__Survey__Group__5 : rule__Survey__Group__5__Impl rule__Survey__Group__6 ;
    public final void rule__Survey__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:377:1: ( rule__Survey__Group__5__Impl rule__Survey__Group__6 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:378:2: rule__Survey__Group__5__Impl rule__Survey__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__5__Impl_in_rule__Survey__Group__5721);
            rule__Survey__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__6_in_rule__Survey__Group__5724);
            rule__Survey__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__5"


    // $ANTLR start "rule__Survey__Group__5__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:385:1: rule__Survey__Group__5__Impl : ( ( rule__Survey__QuestionsAssignment_5 )* ) ;
    public final void rule__Survey__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:389:1: ( ( ( rule__Survey__QuestionsAssignment_5 )* ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:390:1: ( ( rule__Survey__QuestionsAssignment_5 )* )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:390:1: ( ( rule__Survey__QuestionsAssignment_5 )* )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:391:1: ( rule__Survey__QuestionsAssignment_5 )*
            {
             before(grammarAccess.getSurveyAccess().getQuestionsAssignment_5()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:392:1: ( rule__Survey__QuestionsAssignment_5 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:392:2: rule__Survey__QuestionsAssignment_5
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Survey__QuestionsAssignment_5_in_rule__Survey__Group__5__Impl751);
            	    rule__Survey__QuestionsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getSurveyAccess().getQuestionsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__5__Impl"


    // $ANTLR start "rule__Survey__Group__6"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:402:1: rule__Survey__Group__6 : rule__Survey__Group__6__Impl rule__Survey__Group__7 ;
    public final void rule__Survey__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:406:1: ( rule__Survey__Group__6__Impl rule__Survey__Group__7 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:407:2: rule__Survey__Group__6__Impl rule__Survey__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__6__Impl_in_rule__Survey__Group__6782);
            rule__Survey__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__7_in_rule__Survey__Group__6785);
            rule__Survey__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__6"


    // $ANTLR start "rule__Survey__Group__6__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:414:1: rule__Survey__Group__6__Impl : ( 'Outro' ) ;
    public final void rule__Survey__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:418:1: ( ( 'Outro' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:419:1: ( 'Outro' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:419:1: ( 'Outro' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:420:1: 'Outro'
            {
             before(grammarAccess.getSurveyAccess().getOutroKeyword_6()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Survey__Group__6__Impl813); 
             after(grammarAccess.getSurveyAccess().getOutroKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__6__Impl"


    // $ANTLR start "rule__Survey__Group__7"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:433:1: rule__Survey__Group__7 : rule__Survey__Group__7__Impl ;
    public final void rule__Survey__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:437:1: ( rule__Survey__Group__7__Impl )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:438:2: rule__Survey__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__7__Impl_in_rule__Survey__Group__7844);
            rule__Survey__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__7"


    // $ANTLR start "rule__Survey__Group__7__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:444:1: rule__Survey__Group__7__Impl : ( ( rule__Survey__OutroAssignment_7 ) ) ;
    public final void rule__Survey__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:448:1: ( ( ( rule__Survey__OutroAssignment_7 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:449:1: ( ( rule__Survey__OutroAssignment_7 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:449:1: ( ( rule__Survey__OutroAssignment_7 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:450:1: ( rule__Survey__OutroAssignment_7 )
            {
             before(grammarAccess.getSurveyAccess().getOutroAssignment_7()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:451:1: ( rule__Survey__OutroAssignment_7 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:451:2: rule__Survey__OutroAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__OutroAssignment_7_in_rule__Survey__Group__7__Impl871);
            rule__Survey__OutroAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getSurveyAccess().getOutroAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__7__Impl"


    // $ANTLR start "rule__Question__Group__0"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:477:1: rule__Question__Group__0 : rule__Question__Group__0__Impl rule__Question__Group__1 ;
    public final void rule__Question__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:481:1: ( rule__Question__Group__0__Impl rule__Question__Group__1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:482:2: rule__Question__Group__0__Impl rule__Question__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__0__Impl_in_rule__Question__Group__0917);
            rule__Question__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__1_in_rule__Question__Group__0920);
            rule__Question__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__0"


    // $ANTLR start "rule__Question__Group__0__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:489:1: rule__Question__Group__0__Impl : ( 'Question' ) ;
    public final void rule__Question__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:493:1: ( ( 'Question' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:494:1: ( 'Question' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:494:1: ( 'Question' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:495:1: 'Question'
            {
             before(grammarAccess.getQuestionAccess().getQuestionKeyword_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Question__Group__0__Impl948); 
             after(grammarAccess.getQuestionAccess().getQuestionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__0__Impl"


    // $ANTLR start "rule__Question__Group__1"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:508:1: rule__Question__Group__1 : rule__Question__Group__1__Impl rule__Question__Group__2 ;
    public final void rule__Question__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:512:1: ( rule__Question__Group__1__Impl rule__Question__Group__2 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:513:2: rule__Question__Group__1__Impl rule__Question__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__1__Impl_in_rule__Question__Group__1979);
            rule__Question__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__2_in_rule__Question__Group__1982);
            rule__Question__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__1"


    // $ANTLR start "rule__Question__Group__1__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:520:1: rule__Question__Group__1__Impl : ( ( rule__Question__IsExclusiveAssignment_1 )? ) ;
    public final void rule__Question__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:524:1: ( ( ( rule__Question__IsExclusiveAssignment_1 )? ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:525:1: ( ( rule__Question__IsExclusiveAssignment_1 )? )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:525:1: ( ( rule__Question__IsExclusiveAssignment_1 )? )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:526:1: ( rule__Question__IsExclusiveAssignment_1 )?
            {
             before(grammarAccess.getQuestionAccess().getIsExclusiveAssignment_1()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:527:1: ( rule__Question__IsExclusiveAssignment_1 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:527:2: rule__Question__IsExclusiveAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Question__IsExclusiveAssignment_1_in_rule__Question__Group__1__Impl1009);
                    rule__Question__IsExclusiveAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionAccess().getIsExclusiveAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__1__Impl"


    // $ANTLR start "rule__Question__Group__2"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:537:1: rule__Question__Group__2 : rule__Question__Group__2__Impl rule__Question__Group__3 ;
    public final void rule__Question__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:541:1: ( rule__Question__Group__2__Impl rule__Question__Group__3 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:542:2: rule__Question__Group__2__Impl rule__Question__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__2__Impl_in_rule__Question__Group__21040);
            rule__Question__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__3_in_rule__Question__Group__21043);
            rule__Question__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__2"


    // $ANTLR start "rule__Question__Group__2__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:549:1: rule__Question__Group__2__Impl : ( ( rule__Question__IsOptionalAssignment_2 )? ) ;
    public final void rule__Question__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:553:1: ( ( ( rule__Question__IsOptionalAssignment_2 )? ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:554:1: ( ( rule__Question__IsOptionalAssignment_2 )? )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:554:1: ( ( rule__Question__IsOptionalAssignment_2 )? )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:555:1: ( rule__Question__IsOptionalAssignment_2 )?
            {
             before(grammarAccess.getQuestionAccess().getIsOptionalAssignment_2()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:556:1: ( rule__Question__IsOptionalAssignment_2 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:556:2: rule__Question__IsOptionalAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Question__IsOptionalAssignment_2_in_rule__Question__Group__2__Impl1070);
                    rule__Question__IsOptionalAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionAccess().getIsOptionalAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__2__Impl"


    // $ANTLR start "rule__Question__Group__3"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:566:1: rule__Question__Group__3 : rule__Question__Group__3__Impl rule__Question__Group__4 ;
    public final void rule__Question__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:570:1: ( rule__Question__Group__3__Impl rule__Question__Group__4 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:571:2: rule__Question__Group__3__Impl rule__Question__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__3__Impl_in_rule__Question__Group__31101);
            rule__Question__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__4_in_rule__Question__Group__31104);
            rule__Question__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__3"


    // $ANTLR start "rule__Question__Group__3__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:578:1: rule__Question__Group__3__Impl : ( ( rule__Question__ContentAssignment_3 ) ) ;
    public final void rule__Question__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:582:1: ( ( ( rule__Question__ContentAssignment_3 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:583:1: ( ( rule__Question__ContentAssignment_3 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:583:1: ( ( rule__Question__ContentAssignment_3 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:584:1: ( rule__Question__ContentAssignment_3 )
            {
             before(grammarAccess.getQuestionAccess().getContentAssignment_3()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:585:1: ( rule__Question__ContentAssignment_3 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:585:2: rule__Question__ContentAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__ContentAssignment_3_in_rule__Question__Group__3__Impl1131);
            rule__Question__ContentAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getContentAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__3__Impl"


    // $ANTLR start "rule__Question__Group__4"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:595:1: rule__Question__Group__4 : rule__Question__Group__4__Impl rule__Question__Group__5 ;
    public final void rule__Question__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:599:1: ( rule__Question__Group__4__Impl rule__Question__Group__5 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:600:2: rule__Question__Group__4__Impl rule__Question__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__4__Impl_in_rule__Question__Group__41161);
            rule__Question__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__5_in_rule__Question__Group__41164);
            rule__Question__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__4"


    // $ANTLR start "rule__Question__Group__4__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:607:1: rule__Question__Group__4__Impl : ( '(' ) ;
    public final void rule__Question__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:611:1: ( ( '(' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:612:1: ( '(' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:612:1: ( '(' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:613:1: '('
            {
             before(grammarAccess.getQuestionAccess().getLeftParenthesisKeyword_4()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Question__Group__4__Impl1192); 
             after(grammarAccess.getQuestionAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__4__Impl"


    // $ANTLR start "rule__Question__Group__5"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:626:1: rule__Question__Group__5 : rule__Question__Group__5__Impl rule__Question__Group__6 ;
    public final void rule__Question__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:630:1: ( rule__Question__Group__5__Impl rule__Question__Group__6 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:631:2: rule__Question__Group__5__Impl rule__Question__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__5__Impl_in_rule__Question__Group__51223);
            rule__Question__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__6_in_rule__Question__Group__51226);
            rule__Question__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__5"


    // $ANTLR start "rule__Question__Group__5__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:638:1: rule__Question__Group__5__Impl : ( ( rule__Question__AnswersAssignment_5 ) ) ;
    public final void rule__Question__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:642:1: ( ( ( rule__Question__AnswersAssignment_5 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:643:1: ( ( rule__Question__AnswersAssignment_5 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:643:1: ( ( rule__Question__AnswersAssignment_5 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:644:1: ( rule__Question__AnswersAssignment_5 )
            {
             before(grammarAccess.getQuestionAccess().getAnswersAssignment_5()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:645:1: ( rule__Question__AnswersAssignment_5 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:645:2: rule__Question__AnswersAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__AnswersAssignment_5_in_rule__Question__Group__5__Impl1253);
            rule__Question__AnswersAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getAnswersAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__5__Impl"


    // $ANTLR start "rule__Question__Group__6"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:655:1: rule__Question__Group__6 : rule__Question__Group__6__Impl rule__Question__Group__7 ;
    public final void rule__Question__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:659:1: ( rule__Question__Group__6__Impl rule__Question__Group__7 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:660:2: rule__Question__Group__6__Impl rule__Question__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__6__Impl_in_rule__Question__Group__61283);
            rule__Question__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__7_in_rule__Question__Group__61286);
            rule__Question__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__6"


    // $ANTLR start "rule__Question__Group__6__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:667:1: rule__Question__Group__6__Impl : ( ( rule__Question__AnswersAssignment_6 )* ) ;
    public final void rule__Question__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:671:1: ( ( ( rule__Question__AnswersAssignment_6 )* ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:672:1: ( ( rule__Question__AnswersAssignment_6 )* )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:672:1: ( ( rule__Question__AnswersAssignment_6 )* )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:673:1: ( rule__Question__AnswersAssignment_6 )*
            {
             before(grammarAccess.getQuestionAccess().getAnswersAssignment_6()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:674:1: ( rule__Question__AnswersAssignment_6 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:674:2: rule__Question__AnswersAssignment_6
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Question__AnswersAssignment_6_in_rule__Question__Group__6__Impl1313);
            	    rule__Question__AnswersAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getQuestionAccess().getAnswersAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__6__Impl"


    // $ANTLR start "rule__Question__Group__7"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:684:1: rule__Question__Group__7 : rule__Question__Group__7__Impl ;
    public final void rule__Question__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:688:1: ( rule__Question__Group__7__Impl )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:689:2: rule__Question__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__7__Impl_in_rule__Question__Group__71344);
            rule__Question__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__7"


    // $ANTLR start "rule__Question__Group__7__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:695:1: rule__Question__Group__7__Impl : ( ')' ) ;
    public final void rule__Question__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:699:1: ( ( ')' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:700:1: ( ')' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:700:1: ( ')' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:701:1: ')'
            {
             before(grammarAccess.getQuestionAccess().getRightParenthesisKeyword_7()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Question__Group__7__Impl1372); 
             after(grammarAccess.getQuestionAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__7__Impl"


    // $ANTLR start "rule__Content__Group__0"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:730:1: rule__Content__Group__0 : rule__Content__Group__0__Impl rule__Content__Group__1 ;
    public final void rule__Content__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:734:1: ( rule__Content__Group__0__Impl rule__Content__Group__1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:735:2: rule__Content__Group__0__Impl rule__Content__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Content__Group__0__Impl_in_rule__Content__Group__01419);
            rule__Content__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Content__Group__1_in_rule__Content__Group__01422);
            rule__Content__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group__0"


    // $ANTLR start "rule__Content__Group__0__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:742:1: rule__Content__Group__0__Impl : ( () ) ;
    public final void rule__Content__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:746:1: ( ( () ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:747:1: ( () )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:747:1: ( () )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:748:1: ()
            {
             before(grammarAccess.getContentAccess().getContentAction_0()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:749:1: ()
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:751:1: 
            {
            }

             after(grammarAccess.getContentAccess().getContentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group__0__Impl"


    // $ANTLR start "rule__Content__Group__1"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:761:1: rule__Content__Group__1 : rule__Content__Group__1__Impl ;
    public final void rule__Content__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:765:1: ( rule__Content__Group__1__Impl )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:766:2: rule__Content__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Content__Group__1__Impl_in_rule__Content__Group__11480);
            rule__Content__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group__1"


    // $ANTLR start "rule__Content__Group__1__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:772:1: rule__Content__Group__1__Impl : ( ( rule__Content__BodyAssignment_1 )? ) ;
    public final void rule__Content__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:776:1: ( ( ( rule__Content__BodyAssignment_1 )? ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:777:1: ( ( rule__Content__BodyAssignment_1 )? )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:777:1: ( ( rule__Content__BodyAssignment_1 )? )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:778:1: ( rule__Content__BodyAssignment_1 )?
            {
             before(grammarAccess.getContentAccess().getBodyAssignment_1()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:779:1: ( rule__Content__BodyAssignment_1 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:779:2: rule__Content__BodyAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Content__BodyAssignment_1_in_rule__Content__Group__1__Impl1507);
                    rule__Content__BodyAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentAccess().getBodyAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group__1__Impl"


    // $ANTLR start "rule__Answer__Group__0"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:793:1: rule__Answer__Group__0 : rule__Answer__Group__0__Impl rule__Answer__Group__1 ;
    public final void rule__Answer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:797:1: ( rule__Answer__Group__0__Impl rule__Answer__Group__1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:798:2: rule__Answer__Group__0__Impl rule__Answer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__0__Impl_in_rule__Answer__Group__01542);
            rule__Answer__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__1_in_rule__Answer__Group__01545);
            rule__Answer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__Group__0"


    // $ANTLR start "rule__Answer__Group__0__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:805:1: rule__Answer__Group__0__Impl : ( 'Answer' ) ;
    public final void rule__Answer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:809:1: ( ( 'Answer' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:810:1: ( 'Answer' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:810:1: ( 'Answer' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:811:1: 'Answer'
            {
             before(grammarAccess.getAnswerAccess().getAnswerKeyword_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Answer__Group__0__Impl1573); 
             after(grammarAccess.getAnswerAccess().getAnswerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__Group__0__Impl"


    // $ANTLR start "rule__Answer__Group__1"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:824:1: rule__Answer__Group__1 : rule__Answer__Group__1__Impl rule__Answer__Group__2 ;
    public final void rule__Answer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:828:1: ( rule__Answer__Group__1__Impl rule__Answer__Group__2 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:829:2: rule__Answer__Group__1__Impl rule__Answer__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__1__Impl_in_rule__Answer__Group__11604);
            rule__Answer__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__2_in_rule__Answer__Group__11607);
            rule__Answer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__Group__1"


    // $ANTLR start "rule__Answer__Group__1__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:836:1: rule__Answer__Group__1__Impl : ( ( rule__Answer__IsFreeTextAssignment_1 )? ) ;
    public final void rule__Answer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:840:1: ( ( ( rule__Answer__IsFreeTextAssignment_1 )? ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:841:1: ( ( rule__Answer__IsFreeTextAssignment_1 )? )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:841:1: ( ( rule__Answer__IsFreeTextAssignment_1 )? )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:842:1: ( rule__Answer__IsFreeTextAssignment_1 )?
            {
             before(grammarAccess.getAnswerAccess().getIsFreeTextAssignment_1()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:843:1: ( rule__Answer__IsFreeTextAssignment_1 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:843:2: rule__Answer__IsFreeTextAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Answer__IsFreeTextAssignment_1_in_rule__Answer__Group__1__Impl1634);
                    rule__Answer__IsFreeTextAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnswerAccess().getIsFreeTextAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__Group__1__Impl"


    // $ANTLR start "rule__Answer__Group__2"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:853:1: rule__Answer__Group__2 : rule__Answer__Group__2__Impl rule__Answer__Group__3 ;
    public final void rule__Answer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:857:1: ( rule__Answer__Group__2__Impl rule__Answer__Group__3 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:858:2: rule__Answer__Group__2__Impl rule__Answer__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__2__Impl_in_rule__Answer__Group__21665);
            rule__Answer__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__3_in_rule__Answer__Group__21668);
            rule__Answer__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__Group__2"


    // $ANTLR start "rule__Answer__Group__2__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:865:1: rule__Answer__Group__2__Impl : ( ( rule__Answer__ContentAssignment_2 ) ) ;
    public final void rule__Answer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:869:1: ( ( ( rule__Answer__ContentAssignment_2 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:870:1: ( ( rule__Answer__ContentAssignment_2 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:870:1: ( ( rule__Answer__ContentAssignment_2 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:871:1: ( rule__Answer__ContentAssignment_2 )
            {
             before(grammarAccess.getAnswerAccess().getContentAssignment_2()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:872:1: ( rule__Answer__ContentAssignment_2 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:872:2: rule__Answer__ContentAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__ContentAssignment_2_in_rule__Answer__Group__2__Impl1695);
            rule__Answer__ContentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAnswerAccess().getContentAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__Group__2__Impl"


    // $ANTLR start "rule__Answer__Group__3"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:882:1: rule__Answer__Group__3 : rule__Answer__Group__3__Impl ;
    public final void rule__Answer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:886:1: ( rule__Answer__Group__3__Impl )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:887:2: rule__Answer__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__3__Impl_in_rule__Answer__Group__31725);
            rule__Answer__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__Group__3"


    // $ANTLR start "rule__Answer__Group__3__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:893:1: rule__Answer__Group__3__Impl : ( ( rule__Answer__Group_3__0 )? ) ;
    public final void rule__Answer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:897:1: ( ( ( rule__Answer__Group_3__0 )? ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:898:1: ( ( rule__Answer__Group_3__0 )? )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:898:1: ( ( rule__Answer__Group_3__0 )? )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:899:1: ( rule__Answer__Group_3__0 )?
            {
             before(grammarAccess.getAnswerAccess().getGroup_3()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:900:1: ( rule__Answer__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:900:2: rule__Answer__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3__0_in_rule__Answer__Group__3__Impl1752);
                    rule__Answer__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnswerAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__Group__3__Impl"


    // $ANTLR start "rule__Answer__Group_3__0"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:918:1: rule__Answer__Group_3__0 : rule__Answer__Group_3__0__Impl rule__Answer__Group_3__1 ;
    public final void rule__Answer__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:922:1: ( rule__Answer__Group_3__0__Impl rule__Answer__Group_3__1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:923:2: rule__Answer__Group_3__0__Impl rule__Answer__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3__0__Impl_in_rule__Answer__Group_3__01791);
            rule__Answer__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3__1_in_rule__Answer__Group_3__01794);
            rule__Answer__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__Group_3__0"


    // $ANTLR start "rule__Answer__Group_3__0__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:930:1: rule__Answer__Group_3__0__Impl : ( '(' ) ;
    public final void rule__Answer__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:934:1: ( ( '(' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:935:1: ( '(' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:935:1: ( '(' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:936:1: '('
            {
             before(grammarAccess.getAnswerAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Answer__Group_3__0__Impl1822); 
             after(grammarAccess.getAnswerAccess().getLeftParenthesisKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__Group_3__0__Impl"


    // $ANTLR start "rule__Answer__Group_3__1"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:949:1: rule__Answer__Group_3__1 : rule__Answer__Group_3__1__Impl rule__Answer__Group_3__2 ;
    public final void rule__Answer__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:953:1: ( rule__Answer__Group_3__1__Impl rule__Answer__Group_3__2 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:954:2: rule__Answer__Group_3__1__Impl rule__Answer__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3__1__Impl_in_rule__Answer__Group_3__11853);
            rule__Answer__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3__2_in_rule__Answer__Group_3__11856);
            rule__Answer__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__Group_3__1"


    // $ANTLR start "rule__Answer__Group_3__1__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:961:1: rule__Answer__Group_3__1__Impl : ( ( rule__Answer__FollowupAssignment_3_1 ) ) ;
    public final void rule__Answer__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:965:1: ( ( ( rule__Answer__FollowupAssignment_3_1 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:966:1: ( ( rule__Answer__FollowupAssignment_3_1 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:966:1: ( ( rule__Answer__FollowupAssignment_3_1 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:967:1: ( rule__Answer__FollowupAssignment_3_1 )
            {
             before(grammarAccess.getAnswerAccess().getFollowupAssignment_3_1()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:968:1: ( rule__Answer__FollowupAssignment_3_1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:968:2: rule__Answer__FollowupAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__FollowupAssignment_3_1_in_rule__Answer__Group_3__1__Impl1883);
            rule__Answer__FollowupAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAnswerAccess().getFollowupAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__Group_3__1__Impl"


    // $ANTLR start "rule__Answer__Group_3__2"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:978:1: rule__Answer__Group_3__2 : rule__Answer__Group_3__2__Impl rule__Answer__Group_3__3 ;
    public final void rule__Answer__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:982:1: ( rule__Answer__Group_3__2__Impl rule__Answer__Group_3__3 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:983:2: rule__Answer__Group_3__2__Impl rule__Answer__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3__2__Impl_in_rule__Answer__Group_3__21913);
            rule__Answer__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3__3_in_rule__Answer__Group_3__21916);
            rule__Answer__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__Group_3__2"


    // $ANTLR start "rule__Answer__Group_3__2__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:990:1: rule__Answer__Group_3__2__Impl : ( ( rule__Answer__FollowupAssignment_3_2 )* ) ;
    public final void rule__Answer__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:994:1: ( ( ( rule__Answer__FollowupAssignment_3_2 )* ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:995:1: ( ( rule__Answer__FollowupAssignment_3_2 )* )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:995:1: ( ( rule__Answer__FollowupAssignment_3_2 )* )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:996:1: ( rule__Answer__FollowupAssignment_3_2 )*
            {
             before(grammarAccess.getAnswerAccess().getFollowupAssignment_3_2()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:997:1: ( rule__Answer__FollowupAssignment_3_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==14) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:997:2: rule__Answer__FollowupAssignment_3_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Answer__FollowupAssignment_3_2_in_rule__Answer__Group_3__2__Impl1943);
            	    rule__Answer__FollowupAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getAnswerAccess().getFollowupAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__Group_3__2__Impl"


    // $ANTLR start "rule__Answer__Group_3__3"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1007:1: rule__Answer__Group_3__3 : rule__Answer__Group_3__3__Impl ;
    public final void rule__Answer__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1011:1: ( rule__Answer__Group_3__3__Impl )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1012:2: rule__Answer__Group_3__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3__3__Impl_in_rule__Answer__Group_3__31974);
            rule__Answer__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__Group_3__3"


    // $ANTLR start "rule__Answer__Group_3__3__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1018:1: rule__Answer__Group_3__3__Impl : ( ')' ) ;
    public final void rule__Answer__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1022:1: ( ( ')' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1023:1: ( ')' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1023:1: ( ')' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1024:1: ')'
            {
             before(grammarAccess.getAnswerAccess().getRightParenthesisKeyword_3_3()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Answer__Group_3__3__Impl2002); 
             after(grammarAccess.getAnswerAccess().getRightParenthesisKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__Group_3__3__Impl"


    // $ANTLR start "rule__Survey__NameAssignment_1"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1046:1: rule__Survey__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Survey__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1050:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1051:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1051:1: ( ruleEString )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1052:1: ruleEString
            {
             before(grammarAccess.getSurveyAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Survey__NameAssignment_12046);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSurveyAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__NameAssignment_1"


    // $ANTLR start "rule__Survey__IntroAssignment_3"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1061:1: rule__Survey__IntroAssignment_3 : ( ruleContent ) ;
    public final void rule__Survey__IntroAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1065:1: ( ( ruleContent ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1066:1: ( ruleContent )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1066:1: ( ruleContent )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1067:1: ruleContent
            {
             before(grammarAccess.getSurveyAccess().getIntroContentParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleContent_in_rule__Survey__IntroAssignment_32077);
            ruleContent();

            state._fsp--;

             after(grammarAccess.getSurveyAccess().getIntroContentParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__IntroAssignment_3"


    // $ANTLR start "rule__Survey__QuestionsAssignment_4"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1076:1: rule__Survey__QuestionsAssignment_4 : ( ruleQuestion ) ;
    public final void rule__Survey__QuestionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1080:1: ( ( ruleQuestion ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1081:1: ( ruleQuestion )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1081:1: ( ruleQuestion )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1082:1: ruleQuestion
            {
             before(grammarAccess.getSurveyAccess().getQuestionsQuestionParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_rule__Survey__QuestionsAssignment_42108);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getSurveyAccess().getQuestionsQuestionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__QuestionsAssignment_4"


    // $ANTLR start "rule__Survey__QuestionsAssignment_5"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1091:1: rule__Survey__QuestionsAssignment_5 : ( ruleQuestion ) ;
    public final void rule__Survey__QuestionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1095:1: ( ( ruleQuestion ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1096:1: ( ruleQuestion )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1096:1: ( ruleQuestion )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1097:1: ruleQuestion
            {
             before(grammarAccess.getSurveyAccess().getQuestionsQuestionParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_rule__Survey__QuestionsAssignment_52139);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getSurveyAccess().getQuestionsQuestionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__QuestionsAssignment_5"


    // $ANTLR start "rule__Survey__OutroAssignment_7"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1106:1: rule__Survey__OutroAssignment_7 : ( ruleContent ) ;
    public final void rule__Survey__OutroAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1110:1: ( ( ruleContent ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1111:1: ( ruleContent )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1111:1: ( ruleContent )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1112:1: ruleContent
            {
             before(grammarAccess.getSurveyAccess().getOutroContentParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleContent_in_rule__Survey__OutroAssignment_72170);
            ruleContent();

            state._fsp--;

             after(grammarAccess.getSurveyAccess().getOutroContentParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__OutroAssignment_7"


    // $ANTLR start "rule__Question__IsExclusiveAssignment_1"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1121:1: rule__Question__IsExclusiveAssignment_1 : ( ( 'ex' ) ) ;
    public final void rule__Question__IsExclusiveAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1125:1: ( ( ( 'ex' ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1126:1: ( ( 'ex' ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1126:1: ( ( 'ex' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1127:1: ( 'ex' )
            {
             before(grammarAccess.getQuestionAccess().getIsExclusiveExKeyword_1_0()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1128:1: ( 'ex' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1129:1: 'ex'
            {
             before(grammarAccess.getQuestionAccess().getIsExclusiveExKeyword_1_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Question__IsExclusiveAssignment_12206); 
             after(grammarAccess.getQuestionAccess().getIsExclusiveExKeyword_1_0()); 

            }

             after(grammarAccess.getQuestionAccess().getIsExclusiveExKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__IsExclusiveAssignment_1"


    // $ANTLR start "rule__Question__IsOptionalAssignment_2"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1144:1: rule__Question__IsOptionalAssignment_2 : ( ( 'opt' ) ) ;
    public final void rule__Question__IsOptionalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1148:1: ( ( ( 'opt' ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1149:1: ( ( 'opt' ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1149:1: ( ( 'opt' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1150:1: ( 'opt' )
            {
             before(grammarAccess.getQuestionAccess().getIsOptionalOptKeyword_2_0()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1151:1: ( 'opt' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1152:1: 'opt'
            {
             before(grammarAccess.getQuestionAccess().getIsOptionalOptKeyword_2_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Question__IsOptionalAssignment_22250); 
             after(grammarAccess.getQuestionAccess().getIsOptionalOptKeyword_2_0()); 

            }

             after(grammarAccess.getQuestionAccess().getIsOptionalOptKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__IsOptionalAssignment_2"


    // $ANTLR start "rule__Question__ContentAssignment_3"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1167:1: rule__Question__ContentAssignment_3 : ( ruleContent ) ;
    public final void rule__Question__ContentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1171:1: ( ( ruleContent ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1172:1: ( ruleContent )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1172:1: ( ruleContent )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1173:1: ruleContent
            {
             before(grammarAccess.getQuestionAccess().getContentContentParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleContent_in_rule__Question__ContentAssignment_32289);
            ruleContent();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getContentContentParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__ContentAssignment_3"


    // $ANTLR start "rule__Question__AnswersAssignment_5"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1182:1: rule__Question__AnswersAssignment_5 : ( ruleAnswer ) ;
    public final void rule__Question__AnswersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1186:1: ( ( ruleAnswer ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1187:1: ( ruleAnswer )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1187:1: ( ruleAnswer )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1188:1: ruleAnswer
            {
             before(grammarAccess.getQuestionAccess().getAnswersAnswerParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__Question__AnswersAssignment_52320);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getAnswersAnswerParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__AnswersAssignment_5"


    // $ANTLR start "rule__Question__AnswersAssignment_6"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1197:1: rule__Question__AnswersAssignment_6 : ( ruleAnswer ) ;
    public final void rule__Question__AnswersAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1201:1: ( ( ruleAnswer ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1202:1: ( ruleAnswer )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1202:1: ( ruleAnswer )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1203:1: ruleAnswer
            {
             before(grammarAccess.getQuestionAccess().getAnswersAnswerParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__Question__AnswersAssignment_62351);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getAnswersAnswerParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__AnswersAssignment_6"


    // $ANTLR start "rule__Content__BodyAssignment_1"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1212:1: rule__Content__BodyAssignment_1 : ( ruleEString ) ;
    public final void rule__Content__BodyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1216:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1217:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1217:1: ( ruleEString )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1218:1: ruleEString
            {
             before(grammarAccess.getContentAccess().getBodyEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Content__BodyAssignment_12382);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getContentAccess().getBodyEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__BodyAssignment_1"


    // $ANTLR start "rule__Answer__IsFreeTextAssignment_1"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1227:1: rule__Answer__IsFreeTextAssignment_1 : ( ( 'free' ) ) ;
    public final void rule__Answer__IsFreeTextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1231:1: ( ( ( 'free' ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1232:1: ( ( 'free' ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1232:1: ( ( 'free' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1233:1: ( 'free' )
            {
             before(grammarAccess.getAnswerAccess().getIsFreeTextFreeKeyword_1_0()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1234:1: ( 'free' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1235:1: 'free'
            {
             before(grammarAccess.getAnswerAccess().getIsFreeTextFreeKeyword_1_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Answer__IsFreeTextAssignment_12418); 
             after(grammarAccess.getAnswerAccess().getIsFreeTextFreeKeyword_1_0()); 

            }

             after(grammarAccess.getAnswerAccess().getIsFreeTextFreeKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__IsFreeTextAssignment_1"


    // $ANTLR start "rule__Answer__ContentAssignment_2"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1250:1: rule__Answer__ContentAssignment_2 : ( ruleContent ) ;
    public final void rule__Answer__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1254:1: ( ( ruleContent ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1255:1: ( ruleContent )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1255:1: ( ruleContent )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1256:1: ruleContent
            {
             before(grammarAccess.getAnswerAccess().getContentContentParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleContent_in_rule__Answer__ContentAssignment_22457);
            ruleContent();

            state._fsp--;

             after(grammarAccess.getAnswerAccess().getContentContentParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__ContentAssignment_2"


    // $ANTLR start "rule__Answer__FollowupAssignment_3_1"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1265:1: rule__Answer__FollowupAssignment_3_1 : ( ruleQuestion ) ;
    public final void rule__Answer__FollowupAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1269:1: ( ( ruleQuestion ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1270:1: ( ruleQuestion )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1270:1: ( ruleQuestion )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1271:1: ruleQuestion
            {
             before(grammarAccess.getAnswerAccess().getFollowupQuestionParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_rule__Answer__FollowupAssignment_3_12488);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getAnswerAccess().getFollowupQuestionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__FollowupAssignment_3_1"


    // $ANTLR start "rule__Answer__FollowupAssignment_3_2"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1280:1: rule__Answer__FollowupAssignment_3_2 : ( ruleQuestion ) ;
    public final void rule__Answer__FollowupAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1284:1: ( ( ruleQuestion ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1285:1: ( ruleQuestion )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1285:1: ( ruleQuestion )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1286:1: ruleQuestion
            {
             before(grammarAccess.getAnswerAccess().getFollowupQuestionParserRuleCall_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_rule__Answer__FollowupAssignment_3_22519);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getAnswerAccess().getFollowupQuestionParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__FollowupAssignment_3_2"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleSurvey_in_entryRuleSurvey61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSurvey68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__0_in_ruleSurvey94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuestion128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__Group__0_in_ruleQuestion154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContent_in_entryRuleContent181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContent188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Content__Group__0_in_ruleContent214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_entryRuleAnswer241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswer248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group__0_in_ruleAnswer274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__0__Impl_in_rule__Survey__Group__0417 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Survey__Group__1_in_rule__Survey__Group__0420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Survey__Group__0__Impl448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__1__Impl_in_rule__Survey__Group__1479 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Survey__Group__2_in_rule__Survey__Group__1482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__NameAssignment_1_in_rule__Survey__Group__1__Impl509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__2__Impl_in_rule__Survey__Group__2539 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Survey__Group__3_in_rule__Survey__Group__2542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Survey__Group__2__Impl570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__3__Impl_in_rule__Survey__Group__3601 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Survey__Group__4_in_rule__Survey__Group__3604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__IntroAssignment_3_in_rule__Survey__Group__3__Impl631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__4__Impl_in_rule__Survey__Group__4661 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_rule__Survey__Group__5_in_rule__Survey__Group__4664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__QuestionsAssignment_4_in_rule__Survey__Group__4__Impl691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__5__Impl_in_rule__Survey__Group__5721 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_rule__Survey__Group__6_in_rule__Survey__Group__5724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__QuestionsAssignment_5_in_rule__Survey__Group__5__Impl751 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__Survey__Group__6__Impl_in_rule__Survey__Group__6782 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Survey__Group__7_in_rule__Survey__Group__6785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Survey__Group__6__Impl813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__7__Impl_in_rule__Survey__Group__7844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__OutroAssignment_7_in_rule__Survey__Group__7__Impl871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__Group__0__Impl_in_rule__Question__Group__0917 = new BitSet(new long[]{0x00000000000C0030L});
        public static final BitSet FOLLOW_rule__Question__Group__1_in_rule__Question__Group__0920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Question__Group__0__Impl948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__Group__1__Impl_in_rule__Question__Group__1979 = new BitSet(new long[]{0x00000000000C0030L});
        public static final BitSet FOLLOW_rule__Question__Group__2_in_rule__Question__Group__1982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__IsExclusiveAssignment_1_in_rule__Question__Group__1__Impl1009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__Group__2__Impl_in_rule__Question__Group__21040 = new BitSet(new long[]{0x00000000000C0030L});
        public static final BitSet FOLLOW_rule__Question__Group__3_in_rule__Question__Group__21043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__IsOptionalAssignment_2_in_rule__Question__Group__2__Impl1070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__Group__3__Impl_in_rule__Question__Group__31101 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Question__Group__4_in_rule__Question__Group__31104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__ContentAssignment_3_in_rule__Question__Group__3__Impl1131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__Group__4__Impl_in_rule__Question__Group__41161 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Question__Group__5_in_rule__Question__Group__41164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Question__Group__4__Impl1192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__Group__5__Impl_in_rule__Question__Group__51223 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_rule__Question__Group__6_in_rule__Question__Group__51226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__AnswersAssignment_5_in_rule__Question__Group__5__Impl1253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__Group__6__Impl_in_rule__Question__Group__61283 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_rule__Question__Group__7_in_rule__Question__Group__61286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__AnswersAssignment_6_in_rule__Question__Group__6__Impl1313 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__Question__Group__7__Impl_in_rule__Question__Group__71344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Question__Group__7__Impl1372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Content__Group__0__Impl_in_rule__Content__Group__01419 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Content__Group__1_in_rule__Content__Group__01422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Content__Group__1__Impl_in_rule__Content__Group__11480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Content__BodyAssignment_1_in_rule__Content__Group__1__Impl1507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group__0__Impl_in_rule__Answer__Group__01542 = new BitSet(new long[]{0x0000000000100030L});
        public static final BitSet FOLLOW_rule__Answer__Group__1_in_rule__Answer__Group__01545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Answer__Group__0__Impl1573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group__1__Impl_in_rule__Answer__Group__11604 = new BitSet(new long[]{0x0000000000100030L});
        public static final BitSet FOLLOW_rule__Answer__Group__2_in_rule__Answer__Group__11607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__IsFreeTextAssignment_1_in_rule__Answer__Group__1__Impl1634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group__2__Impl_in_rule__Answer__Group__21665 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Answer__Group__3_in_rule__Answer__Group__21668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__ContentAssignment_2_in_rule__Answer__Group__2__Impl1695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group__3__Impl_in_rule__Answer__Group__31725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group_3__0_in_rule__Answer__Group__3__Impl1752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group_3__0__Impl_in_rule__Answer__Group_3__01791 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Answer__Group_3__1_in_rule__Answer__Group_3__01794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Answer__Group_3__0__Impl1822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group_3__1__Impl_in_rule__Answer__Group_3__11853 = new BitSet(new long[]{0x0000000000014000L});
        public static final BitSet FOLLOW_rule__Answer__Group_3__2_in_rule__Answer__Group_3__11856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__FollowupAssignment_3_1_in_rule__Answer__Group_3__1__Impl1883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group_3__2__Impl_in_rule__Answer__Group_3__21913 = new BitSet(new long[]{0x0000000000014000L});
        public static final BitSet FOLLOW_rule__Answer__Group_3__3_in_rule__Answer__Group_3__21916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__FollowupAssignment_3_2_in_rule__Answer__Group_3__2__Impl1943 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__Answer__Group_3__3__Impl_in_rule__Answer__Group_3__31974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Answer__Group_3__3__Impl2002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Survey__NameAssignment_12046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContent_in_rule__Survey__IntroAssignment_32077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_rule__Survey__QuestionsAssignment_42108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_rule__Survey__QuestionsAssignment_52139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContent_in_rule__Survey__OutroAssignment_72170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Question__IsExclusiveAssignment_12206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Question__IsOptionalAssignment_22250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContent_in_rule__Question__ContentAssignment_32289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__Question__AnswersAssignment_52320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__Question__AnswersAssignment_62351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Content__BodyAssignment_12382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Answer__IsFreeTextAssignment_12418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContent_in_rule__Answer__ContentAssignment_22457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_rule__Answer__FollowupAssignment_3_12488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_rule__Answer__FollowupAssignment_3_22519 = new BitSet(new long[]{0x0000000000000002L});
    }


}