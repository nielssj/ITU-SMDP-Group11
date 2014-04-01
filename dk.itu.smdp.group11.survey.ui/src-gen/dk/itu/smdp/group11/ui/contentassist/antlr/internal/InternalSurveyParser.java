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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_WS", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'Intro'", "'intro'", "'Outro'", "'outro'", "'Survey'", "'Question'", "'('", "')'", "'Answer'", "'isFreeText'", "'ex'", "'opt'"
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:174:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:175:1: ( ruleEString EOF )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:176:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString303);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString310); 

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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:183:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:187:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:188:1: ( ( rule__EString__Alternatives ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:188:1: ( ( rule__EString__Alternatives ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:189:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:190:1: ( rule__EString__Alternatives )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:190:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString336);
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


    // $ANTLR start "rule__Survey__Alternatives_1"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:202:1: rule__Survey__Alternatives_1 : ( ( 'Intro' ) | ( 'intro' ) );
    public final void rule__Survey__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:206:1: ( ( 'Intro' ) | ( 'intro' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:207:1: ( 'Intro' )
                    {
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:207:1: ( 'Intro' )
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:208:1: 'Intro'
                    {
                     before(grammarAccess.getSurveyAccess().getIntroKeyword_1_0()); 
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__Survey__Alternatives_1373); 
                     after(grammarAccess.getSurveyAccess().getIntroKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:215:6: ( 'intro' )
                    {
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:215:6: ( 'intro' )
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:216:1: 'intro'
                    {
                     before(grammarAccess.getSurveyAccess().getIntroKeyword_1_1()); 
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__Survey__Alternatives_1393); 
                     after(grammarAccess.getSurveyAccess().getIntroKeyword_1_1()); 

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
    // $ANTLR end "rule__Survey__Alternatives_1"


    // $ANTLR start "rule__Survey__Alternatives_5"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:228:1: rule__Survey__Alternatives_5 : ( ( 'Outro' ) | ( 'outro' ) );
    public final void rule__Survey__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:232:1: ( ( 'Outro' ) | ( 'outro' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:233:1: ( 'Outro' )
                    {
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:233:1: ( 'Outro' )
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:234:1: 'Outro'
                    {
                     before(grammarAccess.getSurveyAccess().getOutroKeyword_5_0()); 
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__Survey__Alternatives_5428); 
                     after(grammarAccess.getSurveyAccess().getOutroKeyword_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:241:6: ( 'outro' )
                    {
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:241:6: ( 'outro' )
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:242:1: 'outro'
                    {
                     before(grammarAccess.getSurveyAccess().getOutroKeyword_5_1()); 
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__Survey__Alternatives_5448); 
                     after(grammarAccess.getSurveyAccess().getOutroKeyword_5_1()); 

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
    // $ANTLR end "rule__Survey__Alternatives_5"


    // $ANTLR start "rule__EString__Alternatives"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:255:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:259:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:260:1: ( RULE_STRING )
                    {
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:260:1: ( RULE_STRING )
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:261:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives483); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:266:6: ( RULE_ID )
                    {
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:266:6: ( RULE_ID )
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:267:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives500); 
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:279:1: rule__Survey__Group__0 : rule__Survey__Group__0__Impl rule__Survey__Group__1 ;
    public final void rule__Survey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:283:1: ( rule__Survey__Group__0__Impl rule__Survey__Group__1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:284:2: rule__Survey__Group__0__Impl rule__Survey__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__0__Impl_in_rule__Survey__Group__0530);
            rule__Survey__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__1_in_rule__Survey__Group__0533);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:291:1: rule__Survey__Group__0__Impl : ( 'Survey' ) ;
    public final void rule__Survey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:295:1: ( ( 'Survey' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:296:1: ( 'Survey' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:296:1: ( 'Survey' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:297:1: 'Survey'
            {
             before(grammarAccess.getSurveyAccess().getSurveyKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Survey__Group__0__Impl561); 
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:310:1: rule__Survey__Group__1 : rule__Survey__Group__1__Impl rule__Survey__Group__2 ;
    public final void rule__Survey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:314:1: ( rule__Survey__Group__1__Impl rule__Survey__Group__2 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:315:2: rule__Survey__Group__1__Impl rule__Survey__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__1__Impl_in_rule__Survey__Group__1592);
            rule__Survey__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__2_in_rule__Survey__Group__1595);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:322:1: rule__Survey__Group__1__Impl : ( ( rule__Survey__Alternatives_1 ) ) ;
    public final void rule__Survey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:326:1: ( ( ( rule__Survey__Alternatives_1 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:327:1: ( ( rule__Survey__Alternatives_1 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:327:1: ( ( rule__Survey__Alternatives_1 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:328:1: ( rule__Survey__Alternatives_1 )
            {
             before(grammarAccess.getSurveyAccess().getAlternatives_1()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:329:1: ( rule__Survey__Alternatives_1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:329:2: rule__Survey__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Alternatives_1_in_rule__Survey__Group__1__Impl622);
            rule__Survey__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getSurveyAccess().getAlternatives_1()); 

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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:339:1: rule__Survey__Group__2 : rule__Survey__Group__2__Impl rule__Survey__Group__3 ;
    public final void rule__Survey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:343:1: ( rule__Survey__Group__2__Impl rule__Survey__Group__3 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:344:2: rule__Survey__Group__2__Impl rule__Survey__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__2__Impl_in_rule__Survey__Group__2652);
            rule__Survey__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__3_in_rule__Survey__Group__2655);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:351:1: rule__Survey__Group__2__Impl : ( ( rule__Survey__IntroAssignment_2 ) ) ;
    public final void rule__Survey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:355:1: ( ( ( rule__Survey__IntroAssignment_2 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:356:1: ( ( rule__Survey__IntroAssignment_2 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:356:1: ( ( rule__Survey__IntroAssignment_2 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:357:1: ( rule__Survey__IntroAssignment_2 )
            {
             before(grammarAccess.getSurveyAccess().getIntroAssignment_2()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:358:1: ( rule__Survey__IntroAssignment_2 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:358:2: rule__Survey__IntroAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__IntroAssignment_2_in_rule__Survey__Group__2__Impl682);
            rule__Survey__IntroAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSurveyAccess().getIntroAssignment_2()); 

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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:368:1: rule__Survey__Group__3 : rule__Survey__Group__3__Impl rule__Survey__Group__4 ;
    public final void rule__Survey__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:372:1: ( rule__Survey__Group__3__Impl rule__Survey__Group__4 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:373:2: rule__Survey__Group__3__Impl rule__Survey__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__3__Impl_in_rule__Survey__Group__3712);
            rule__Survey__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__4_in_rule__Survey__Group__3715);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:380:1: rule__Survey__Group__3__Impl : ( ( rule__Survey__QuestionsAssignment_3 ) ) ;
    public final void rule__Survey__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:384:1: ( ( ( rule__Survey__QuestionsAssignment_3 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:385:1: ( ( rule__Survey__QuestionsAssignment_3 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:385:1: ( ( rule__Survey__QuestionsAssignment_3 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:386:1: ( rule__Survey__QuestionsAssignment_3 )
            {
             before(grammarAccess.getSurveyAccess().getQuestionsAssignment_3()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:387:1: ( rule__Survey__QuestionsAssignment_3 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:387:2: rule__Survey__QuestionsAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__QuestionsAssignment_3_in_rule__Survey__Group__3__Impl742);
            rule__Survey__QuestionsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSurveyAccess().getQuestionsAssignment_3()); 

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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:397:1: rule__Survey__Group__4 : rule__Survey__Group__4__Impl rule__Survey__Group__5 ;
    public final void rule__Survey__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:401:1: ( rule__Survey__Group__4__Impl rule__Survey__Group__5 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:402:2: rule__Survey__Group__4__Impl rule__Survey__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__4__Impl_in_rule__Survey__Group__4772);
            rule__Survey__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__5_in_rule__Survey__Group__4775);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:409:1: rule__Survey__Group__4__Impl : ( ( rule__Survey__QuestionsAssignment_4 )* ) ;
    public final void rule__Survey__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:413:1: ( ( ( rule__Survey__QuestionsAssignment_4 )* ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:414:1: ( ( rule__Survey__QuestionsAssignment_4 )* )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:414:1: ( ( rule__Survey__QuestionsAssignment_4 )* )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:415:1: ( rule__Survey__QuestionsAssignment_4 )*
            {
             before(grammarAccess.getSurveyAccess().getQuestionsAssignment_4()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:416:1: ( rule__Survey__QuestionsAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:416:2: rule__Survey__QuestionsAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Survey__QuestionsAssignment_4_in_rule__Survey__Group__4__Impl802);
            	    rule__Survey__QuestionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:426:1: rule__Survey__Group__5 : rule__Survey__Group__5__Impl rule__Survey__Group__6 ;
    public final void rule__Survey__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:430:1: ( rule__Survey__Group__5__Impl rule__Survey__Group__6 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:431:2: rule__Survey__Group__5__Impl rule__Survey__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__5__Impl_in_rule__Survey__Group__5833);
            rule__Survey__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__6_in_rule__Survey__Group__5836);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:438:1: rule__Survey__Group__5__Impl : ( ( rule__Survey__Alternatives_5 ) ) ;
    public final void rule__Survey__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:442:1: ( ( ( rule__Survey__Alternatives_5 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:443:1: ( ( rule__Survey__Alternatives_5 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:443:1: ( ( rule__Survey__Alternatives_5 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:444:1: ( rule__Survey__Alternatives_5 )
            {
             before(grammarAccess.getSurveyAccess().getAlternatives_5()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:445:1: ( rule__Survey__Alternatives_5 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:445:2: rule__Survey__Alternatives_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Alternatives_5_in_rule__Survey__Group__5__Impl863);
            rule__Survey__Alternatives_5();

            state._fsp--;


            }

             after(grammarAccess.getSurveyAccess().getAlternatives_5()); 

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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:455:1: rule__Survey__Group__6 : rule__Survey__Group__6__Impl ;
    public final void rule__Survey__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:459:1: ( rule__Survey__Group__6__Impl )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:460:2: rule__Survey__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__6__Impl_in_rule__Survey__Group__6893);
            rule__Survey__Group__6__Impl();

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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:466:1: rule__Survey__Group__6__Impl : ( ( rule__Survey__OutroAssignment_6 ) ) ;
    public final void rule__Survey__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:470:1: ( ( ( rule__Survey__OutroAssignment_6 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:471:1: ( ( rule__Survey__OutroAssignment_6 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:471:1: ( ( rule__Survey__OutroAssignment_6 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:472:1: ( rule__Survey__OutroAssignment_6 )
            {
             before(grammarAccess.getSurveyAccess().getOutroAssignment_6()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:473:1: ( rule__Survey__OutroAssignment_6 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:473:2: rule__Survey__OutroAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__OutroAssignment_6_in_rule__Survey__Group__6__Impl920);
            rule__Survey__OutroAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSurveyAccess().getOutroAssignment_6()); 

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


    // $ANTLR start "rule__Question__Group__0"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:497:1: rule__Question__Group__0 : rule__Question__Group__0__Impl rule__Question__Group__1 ;
    public final void rule__Question__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:501:1: ( rule__Question__Group__0__Impl rule__Question__Group__1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:502:2: rule__Question__Group__0__Impl rule__Question__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__0__Impl_in_rule__Question__Group__0964);
            rule__Question__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__1_in_rule__Question__Group__0967);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:509:1: rule__Question__Group__0__Impl : ( 'Question' ) ;
    public final void rule__Question__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:513:1: ( ( 'Question' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:514:1: ( 'Question' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:514:1: ( 'Question' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:515:1: 'Question'
            {
             before(grammarAccess.getQuestionAccess().getQuestionKeyword_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Question__Group__0__Impl995); 
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:528:1: rule__Question__Group__1 : rule__Question__Group__1__Impl rule__Question__Group__2 ;
    public final void rule__Question__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:532:1: ( rule__Question__Group__1__Impl rule__Question__Group__2 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:533:2: rule__Question__Group__1__Impl rule__Question__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__1__Impl_in_rule__Question__Group__11026);
            rule__Question__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__2_in_rule__Question__Group__11029);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:540:1: rule__Question__Group__1__Impl : ( ( rule__Question__IsExclusiveAssignment_1 )? ) ;
    public final void rule__Question__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:544:1: ( ( ( rule__Question__IsExclusiveAssignment_1 )? ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:545:1: ( ( rule__Question__IsExclusiveAssignment_1 )? )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:545:1: ( ( rule__Question__IsExclusiveAssignment_1 )? )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:546:1: ( rule__Question__IsExclusiveAssignment_1 )?
            {
             before(grammarAccess.getQuestionAccess().getIsExclusiveAssignment_1()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:547:1: ( rule__Question__IsExclusiveAssignment_1 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:547:2: rule__Question__IsExclusiveAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Question__IsExclusiveAssignment_1_in_rule__Question__Group__1__Impl1056);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:557:1: rule__Question__Group__2 : rule__Question__Group__2__Impl rule__Question__Group__3 ;
    public final void rule__Question__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:561:1: ( rule__Question__Group__2__Impl rule__Question__Group__3 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:562:2: rule__Question__Group__2__Impl rule__Question__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__2__Impl_in_rule__Question__Group__21087);
            rule__Question__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__3_in_rule__Question__Group__21090);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:569:1: rule__Question__Group__2__Impl : ( ( rule__Question__IsOptionalAssignment_2 )? ) ;
    public final void rule__Question__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:573:1: ( ( ( rule__Question__IsOptionalAssignment_2 )? ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:574:1: ( ( rule__Question__IsOptionalAssignment_2 )? )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:574:1: ( ( rule__Question__IsOptionalAssignment_2 )? )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:575:1: ( rule__Question__IsOptionalAssignment_2 )?
            {
             before(grammarAccess.getQuestionAccess().getIsOptionalAssignment_2()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:576:1: ( rule__Question__IsOptionalAssignment_2 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:576:2: rule__Question__IsOptionalAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Question__IsOptionalAssignment_2_in_rule__Question__Group__2__Impl1117);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:586:1: rule__Question__Group__3 : rule__Question__Group__3__Impl rule__Question__Group__4 ;
    public final void rule__Question__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:590:1: ( rule__Question__Group__3__Impl rule__Question__Group__4 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:591:2: rule__Question__Group__3__Impl rule__Question__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__3__Impl_in_rule__Question__Group__31148);
            rule__Question__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__4_in_rule__Question__Group__31151);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:598:1: rule__Question__Group__3__Impl : ( ( rule__Question__ContentAssignment_3 ) ) ;
    public final void rule__Question__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:602:1: ( ( ( rule__Question__ContentAssignment_3 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:603:1: ( ( rule__Question__ContentAssignment_3 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:603:1: ( ( rule__Question__ContentAssignment_3 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:604:1: ( rule__Question__ContentAssignment_3 )
            {
             before(grammarAccess.getQuestionAccess().getContentAssignment_3()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:605:1: ( rule__Question__ContentAssignment_3 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:605:2: rule__Question__ContentAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__ContentAssignment_3_in_rule__Question__Group__3__Impl1178);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:615:1: rule__Question__Group__4 : rule__Question__Group__4__Impl rule__Question__Group__5 ;
    public final void rule__Question__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:619:1: ( rule__Question__Group__4__Impl rule__Question__Group__5 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:620:2: rule__Question__Group__4__Impl rule__Question__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__4__Impl_in_rule__Question__Group__41208);
            rule__Question__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__5_in_rule__Question__Group__41211);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:627:1: rule__Question__Group__4__Impl : ( '(' ) ;
    public final void rule__Question__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:631:1: ( ( '(' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:632:1: ( '(' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:632:1: ( '(' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:633:1: '('
            {
             before(grammarAccess.getQuestionAccess().getLeftParenthesisKeyword_4()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Question__Group__4__Impl1239); 
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:646:1: rule__Question__Group__5 : rule__Question__Group__5__Impl rule__Question__Group__6 ;
    public final void rule__Question__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:650:1: ( rule__Question__Group__5__Impl rule__Question__Group__6 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:651:2: rule__Question__Group__5__Impl rule__Question__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__5__Impl_in_rule__Question__Group__51270);
            rule__Question__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__6_in_rule__Question__Group__51273);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:658:1: rule__Question__Group__5__Impl : ( ( rule__Question__AnswersAssignment_5 ) ) ;
    public final void rule__Question__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:662:1: ( ( ( rule__Question__AnswersAssignment_5 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:663:1: ( ( rule__Question__AnswersAssignment_5 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:663:1: ( ( rule__Question__AnswersAssignment_5 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:664:1: ( rule__Question__AnswersAssignment_5 )
            {
             before(grammarAccess.getQuestionAccess().getAnswersAssignment_5()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:665:1: ( rule__Question__AnswersAssignment_5 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:665:2: rule__Question__AnswersAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__AnswersAssignment_5_in_rule__Question__Group__5__Impl1300);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:675:1: rule__Question__Group__6 : rule__Question__Group__6__Impl rule__Question__Group__7 ;
    public final void rule__Question__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:679:1: ( rule__Question__Group__6__Impl rule__Question__Group__7 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:680:2: rule__Question__Group__6__Impl rule__Question__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__6__Impl_in_rule__Question__Group__61330);
            rule__Question__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__7_in_rule__Question__Group__61333);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:687:1: rule__Question__Group__6__Impl : ( ( rule__Question__AnswersAssignment_6 )* ) ;
    public final void rule__Question__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:691:1: ( ( ( rule__Question__AnswersAssignment_6 )* ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:692:1: ( ( rule__Question__AnswersAssignment_6 )* )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:692:1: ( ( rule__Question__AnswersAssignment_6 )* )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:693:1: ( rule__Question__AnswersAssignment_6 )*
            {
             before(grammarAccess.getQuestionAccess().getAnswersAssignment_6()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:694:1: ( rule__Question__AnswersAssignment_6 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:694:2: rule__Question__AnswersAssignment_6
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Question__AnswersAssignment_6_in_rule__Question__Group__6__Impl1360);
            	    rule__Question__AnswersAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:704:1: rule__Question__Group__7 : rule__Question__Group__7__Impl ;
    public final void rule__Question__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:708:1: ( rule__Question__Group__7__Impl )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:709:2: rule__Question__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__7__Impl_in_rule__Question__Group__71391);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:715:1: rule__Question__Group__7__Impl : ( ')' ) ;
    public final void rule__Question__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:719:1: ( ( ')' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:720:1: ( ')' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:720:1: ( ')' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:721:1: ')'
            {
             before(grammarAccess.getQuestionAccess().getRightParenthesisKeyword_7()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Question__Group__7__Impl1419); 
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:750:1: rule__Content__Group__0 : rule__Content__Group__0__Impl rule__Content__Group__1 ;
    public final void rule__Content__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:754:1: ( rule__Content__Group__0__Impl rule__Content__Group__1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:755:2: rule__Content__Group__0__Impl rule__Content__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Content__Group__0__Impl_in_rule__Content__Group__01466);
            rule__Content__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Content__Group__1_in_rule__Content__Group__01469);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:762:1: rule__Content__Group__0__Impl : ( () ) ;
    public final void rule__Content__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:766:1: ( ( () ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:767:1: ( () )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:767:1: ( () )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:768:1: ()
            {
             before(grammarAccess.getContentAccess().getContentAction_0()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:769:1: ()
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:771:1: 
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:781:1: rule__Content__Group__1 : rule__Content__Group__1__Impl ;
    public final void rule__Content__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:785:1: ( rule__Content__Group__1__Impl )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:786:2: rule__Content__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Content__Group__1__Impl_in_rule__Content__Group__11527);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:792:1: rule__Content__Group__1__Impl : ( ( rule__Content__BodyAssignment_1 )? ) ;
    public final void rule__Content__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:796:1: ( ( ( rule__Content__BodyAssignment_1 )? ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:797:1: ( ( rule__Content__BodyAssignment_1 )? )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:797:1: ( ( rule__Content__BodyAssignment_1 )? )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:798:1: ( rule__Content__BodyAssignment_1 )?
            {
             before(grammarAccess.getContentAccess().getBodyAssignment_1()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:799:1: ( rule__Content__BodyAssignment_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_ID)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:799:2: rule__Content__BodyAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Content__BodyAssignment_1_in_rule__Content__Group__1__Impl1554);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:813:1: rule__Answer__Group__0 : rule__Answer__Group__0__Impl rule__Answer__Group__1 ;
    public final void rule__Answer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:817:1: ( rule__Answer__Group__0__Impl rule__Answer__Group__1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:818:2: rule__Answer__Group__0__Impl rule__Answer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__0__Impl_in_rule__Answer__Group__01589);
            rule__Answer__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__1_in_rule__Answer__Group__01592);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:825:1: rule__Answer__Group__0__Impl : ( 'Answer' ) ;
    public final void rule__Answer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:829:1: ( ( 'Answer' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:830:1: ( 'Answer' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:830:1: ( 'Answer' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:831:1: 'Answer'
            {
             before(grammarAccess.getAnswerAccess().getAnswerKeyword_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Answer__Group__0__Impl1620); 
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:844:1: rule__Answer__Group__1 : rule__Answer__Group__1__Impl rule__Answer__Group__2 ;
    public final void rule__Answer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:848:1: ( rule__Answer__Group__1__Impl rule__Answer__Group__2 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:849:2: rule__Answer__Group__1__Impl rule__Answer__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__1__Impl_in_rule__Answer__Group__11651);
            rule__Answer__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__2_in_rule__Answer__Group__11654);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:856:1: rule__Answer__Group__1__Impl : ( ( rule__Answer__Group_1__0 )? ) ;
    public final void rule__Answer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:860:1: ( ( ( rule__Answer__Group_1__0 )? ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:861:1: ( ( rule__Answer__Group_1__0 )? )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:861:1: ( ( rule__Answer__Group_1__0 )? )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:862:1: ( rule__Answer__Group_1__0 )?
            {
             before(grammarAccess.getAnswerAccess().getGroup_1()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:863:1: ( rule__Answer__Group_1__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:863:2: rule__Answer__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_1__0_in_rule__Answer__Group__1__Impl1681);
                    rule__Answer__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnswerAccess().getGroup_1()); 

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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:873:1: rule__Answer__Group__2 : rule__Answer__Group__2__Impl rule__Answer__Group__3 ;
    public final void rule__Answer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:877:1: ( rule__Answer__Group__2__Impl rule__Answer__Group__3 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:878:2: rule__Answer__Group__2__Impl rule__Answer__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__2__Impl_in_rule__Answer__Group__21712);
            rule__Answer__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__3_in_rule__Answer__Group__21715);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:885:1: rule__Answer__Group__2__Impl : ( ( rule__Answer__ContentAssignment_2 ) ) ;
    public final void rule__Answer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:889:1: ( ( ( rule__Answer__ContentAssignment_2 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:890:1: ( ( rule__Answer__ContentAssignment_2 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:890:1: ( ( rule__Answer__ContentAssignment_2 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:891:1: ( rule__Answer__ContentAssignment_2 )
            {
             before(grammarAccess.getAnswerAccess().getContentAssignment_2()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:892:1: ( rule__Answer__ContentAssignment_2 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:892:2: rule__Answer__ContentAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__ContentAssignment_2_in_rule__Answer__Group__2__Impl1742);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:902:1: rule__Answer__Group__3 : rule__Answer__Group__3__Impl ;
    public final void rule__Answer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:906:1: ( rule__Answer__Group__3__Impl )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:907:2: rule__Answer__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__3__Impl_in_rule__Answer__Group__31772);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:913:1: rule__Answer__Group__3__Impl : ( ( rule__Answer__Group_3__0 )? ) ;
    public final void rule__Answer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:917:1: ( ( ( rule__Answer__Group_3__0 )? ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:918:1: ( ( rule__Answer__Group_3__0 )? )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:918:1: ( ( rule__Answer__Group_3__0 )? )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:919:1: ( rule__Answer__Group_3__0 )?
            {
             before(grammarAccess.getAnswerAccess().getGroup_3()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:920:1: ( rule__Answer__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:920:2: rule__Answer__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3__0_in_rule__Answer__Group__3__Impl1799);
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


    // $ANTLR start "rule__Answer__Group_1__0"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:938:1: rule__Answer__Group_1__0 : rule__Answer__Group_1__0__Impl rule__Answer__Group_1__1 ;
    public final void rule__Answer__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:942:1: ( rule__Answer__Group_1__0__Impl rule__Answer__Group_1__1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:943:2: rule__Answer__Group_1__0__Impl rule__Answer__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_1__0__Impl_in_rule__Answer__Group_1__01838);
            rule__Answer__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_1__1_in_rule__Answer__Group_1__01841);
            rule__Answer__Group_1__1();

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
    // $ANTLR end "rule__Answer__Group_1__0"


    // $ANTLR start "rule__Answer__Group_1__0__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:950:1: rule__Answer__Group_1__0__Impl : ( 'isFreeText' ) ;
    public final void rule__Answer__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:954:1: ( ( 'isFreeText' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:955:1: ( 'isFreeText' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:955:1: ( 'isFreeText' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:956:1: 'isFreeText'
            {
             before(grammarAccess.getAnswerAccess().getIsFreeTextKeyword_1_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Answer__Group_1__0__Impl1869); 
             after(grammarAccess.getAnswerAccess().getIsFreeTextKeyword_1_0()); 

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
    // $ANTLR end "rule__Answer__Group_1__0__Impl"


    // $ANTLR start "rule__Answer__Group_1__1"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:969:1: rule__Answer__Group_1__1 : rule__Answer__Group_1__1__Impl ;
    public final void rule__Answer__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:973:1: ( rule__Answer__Group_1__1__Impl )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:974:2: rule__Answer__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_1__1__Impl_in_rule__Answer__Group_1__11900);
            rule__Answer__Group_1__1__Impl();

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
    // $ANTLR end "rule__Answer__Group_1__1"


    // $ANTLR start "rule__Answer__Group_1__1__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:980:1: rule__Answer__Group_1__1__Impl : ( ( rule__Answer__IsFreeTextAssignment_1_1 ) ) ;
    public final void rule__Answer__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:984:1: ( ( ( rule__Answer__IsFreeTextAssignment_1_1 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:985:1: ( ( rule__Answer__IsFreeTextAssignment_1_1 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:985:1: ( ( rule__Answer__IsFreeTextAssignment_1_1 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:986:1: ( rule__Answer__IsFreeTextAssignment_1_1 )
            {
             before(grammarAccess.getAnswerAccess().getIsFreeTextAssignment_1_1()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:987:1: ( rule__Answer__IsFreeTextAssignment_1_1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:987:2: rule__Answer__IsFreeTextAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__IsFreeTextAssignment_1_1_in_rule__Answer__Group_1__1__Impl1927);
            rule__Answer__IsFreeTextAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAnswerAccess().getIsFreeTextAssignment_1_1()); 

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
    // $ANTLR end "rule__Answer__Group_1__1__Impl"


    // $ANTLR start "rule__Answer__Group_3__0"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1001:1: rule__Answer__Group_3__0 : rule__Answer__Group_3__0__Impl rule__Answer__Group_3__1 ;
    public final void rule__Answer__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1005:1: ( rule__Answer__Group_3__0__Impl rule__Answer__Group_3__1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1006:2: rule__Answer__Group_3__0__Impl rule__Answer__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3__0__Impl_in_rule__Answer__Group_3__01961);
            rule__Answer__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3__1_in_rule__Answer__Group_3__01964);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1013:1: rule__Answer__Group_3__0__Impl : ( '(' ) ;
    public final void rule__Answer__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1017:1: ( ( '(' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1018:1: ( '(' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1018:1: ( '(' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1019:1: '('
            {
             before(grammarAccess.getAnswerAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Answer__Group_3__0__Impl1992); 
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1032:1: rule__Answer__Group_3__1 : rule__Answer__Group_3__1__Impl rule__Answer__Group_3__2 ;
    public final void rule__Answer__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1036:1: ( rule__Answer__Group_3__1__Impl rule__Answer__Group_3__2 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1037:2: rule__Answer__Group_3__1__Impl rule__Answer__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3__1__Impl_in_rule__Answer__Group_3__12023);
            rule__Answer__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3__2_in_rule__Answer__Group_3__12026);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1044:1: rule__Answer__Group_3__1__Impl : ( ( rule__Answer__FollowupAssignment_3_1 ) ) ;
    public final void rule__Answer__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1048:1: ( ( ( rule__Answer__FollowupAssignment_3_1 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1049:1: ( ( rule__Answer__FollowupAssignment_3_1 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1049:1: ( ( rule__Answer__FollowupAssignment_3_1 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1050:1: ( rule__Answer__FollowupAssignment_3_1 )
            {
             before(grammarAccess.getAnswerAccess().getFollowupAssignment_3_1()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1051:1: ( rule__Answer__FollowupAssignment_3_1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1051:2: rule__Answer__FollowupAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__FollowupAssignment_3_1_in_rule__Answer__Group_3__1__Impl2053);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1061:1: rule__Answer__Group_3__2 : rule__Answer__Group_3__2__Impl ;
    public final void rule__Answer__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1065:1: ( rule__Answer__Group_3__2__Impl )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1066:2: rule__Answer__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3__2__Impl_in_rule__Answer__Group_3__22083);
            rule__Answer__Group_3__2__Impl();

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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1072:1: rule__Answer__Group_3__2__Impl : ( ')' ) ;
    public final void rule__Answer__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1076:1: ( ( ')' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1077:1: ( ')' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1077:1: ( ')' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1078:1: ')'
            {
             before(grammarAccess.getAnswerAccess().getRightParenthesisKeyword_3_2()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Answer__Group_3__2__Impl2111); 
             after(grammarAccess.getAnswerAccess().getRightParenthesisKeyword_3_2()); 

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


    // $ANTLR start "rule__Survey__IntroAssignment_2"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1098:1: rule__Survey__IntroAssignment_2 : ( ruleContent ) ;
    public final void rule__Survey__IntroAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1102:1: ( ( ruleContent ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1103:1: ( ruleContent )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1103:1: ( ruleContent )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1104:1: ruleContent
            {
             before(grammarAccess.getSurveyAccess().getIntroContentParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleContent_in_rule__Survey__IntroAssignment_22153);
            ruleContent();

            state._fsp--;

             after(grammarAccess.getSurveyAccess().getIntroContentParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Survey__IntroAssignment_2"


    // $ANTLR start "rule__Survey__QuestionsAssignment_3"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1113:1: rule__Survey__QuestionsAssignment_3 : ( ruleQuestion ) ;
    public final void rule__Survey__QuestionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1117:1: ( ( ruleQuestion ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1118:1: ( ruleQuestion )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1118:1: ( ruleQuestion )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1119:1: ruleQuestion
            {
             before(grammarAccess.getSurveyAccess().getQuestionsQuestionParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_rule__Survey__QuestionsAssignment_32184);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getSurveyAccess().getQuestionsQuestionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Survey__QuestionsAssignment_3"


    // $ANTLR start "rule__Survey__QuestionsAssignment_4"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1128:1: rule__Survey__QuestionsAssignment_4 : ( ruleQuestion ) ;
    public final void rule__Survey__QuestionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1132:1: ( ( ruleQuestion ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1133:1: ( ruleQuestion )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1133:1: ( ruleQuestion )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1134:1: ruleQuestion
            {
             before(grammarAccess.getSurveyAccess().getQuestionsQuestionParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_rule__Survey__QuestionsAssignment_42215);
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


    // $ANTLR start "rule__Survey__OutroAssignment_6"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1143:1: rule__Survey__OutroAssignment_6 : ( ruleContent ) ;
    public final void rule__Survey__OutroAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1147:1: ( ( ruleContent ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1148:1: ( ruleContent )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1148:1: ( ruleContent )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1149:1: ruleContent
            {
             before(grammarAccess.getSurveyAccess().getOutroContentParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleContent_in_rule__Survey__OutroAssignment_62246);
            ruleContent();

            state._fsp--;

             after(grammarAccess.getSurveyAccess().getOutroContentParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Survey__OutroAssignment_6"


    // $ANTLR start "rule__Question__IsExclusiveAssignment_1"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1158:1: rule__Question__IsExclusiveAssignment_1 : ( ( 'ex' ) ) ;
    public final void rule__Question__IsExclusiveAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1162:1: ( ( ( 'ex' ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1163:1: ( ( 'ex' ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1163:1: ( ( 'ex' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1164:1: ( 'ex' )
            {
             before(grammarAccess.getQuestionAccess().getIsExclusiveExKeyword_1_0()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1165:1: ( 'ex' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1166:1: 'ex'
            {
             before(grammarAccess.getQuestionAccess().getIsExclusiveExKeyword_1_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Question__IsExclusiveAssignment_12282); 
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1181:1: rule__Question__IsOptionalAssignment_2 : ( ( 'opt' ) ) ;
    public final void rule__Question__IsOptionalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1185:1: ( ( ( 'opt' ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1186:1: ( ( 'opt' ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1186:1: ( ( 'opt' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1187:1: ( 'opt' )
            {
             before(grammarAccess.getQuestionAccess().getIsOptionalOptKeyword_2_0()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1188:1: ( 'opt' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1189:1: 'opt'
            {
             before(grammarAccess.getQuestionAccess().getIsOptionalOptKeyword_2_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Question__IsOptionalAssignment_22326); 
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1204:1: rule__Question__ContentAssignment_3 : ( ruleContent ) ;
    public final void rule__Question__ContentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1208:1: ( ( ruleContent ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1209:1: ( ruleContent )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1209:1: ( ruleContent )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1210:1: ruleContent
            {
             before(grammarAccess.getQuestionAccess().getContentContentParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleContent_in_rule__Question__ContentAssignment_32365);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1219:1: rule__Question__AnswersAssignment_5 : ( ruleAnswer ) ;
    public final void rule__Question__AnswersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1223:1: ( ( ruleAnswer ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1224:1: ( ruleAnswer )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1224:1: ( ruleAnswer )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1225:1: ruleAnswer
            {
             before(grammarAccess.getQuestionAccess().getAnswersAnswerParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__Question__AnswersAssignment_52396);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1234:1: rule__Question__AnswersAssignment_6 : ( ruleAnswer ) ;
    public final void rule__Question__AnswersAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1238:1: ( ( ruleAnswer ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1239:1: ( ruleAnswer )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1239:1: ( ruleAnswer )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1240:1: ruleAnswer
            {
             before(grammarAccess.getQuestionAccess().getAnswersAnswerParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__Question__AnswersAssignment_62427);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1249:1: rule__Content__BodyAssignment_1 : ( ruleEString ) ;
    public final void rule__Content__BodyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1253:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1254:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1254:1: ( ruleEString )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1255:1: ruleEString
            {
             before(grammarAccess.getContentAccess().getBodyEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Content__BodyAssignment_12458);
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


    // $ANTLR start "rule__Answer__IsFreeTextAssignment_1_1"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1264:1: rule__Answer__IsFreeTextAssignment_1_1 : ( ruleEString ) ;
    public final void rule__Answer__IsFreeTextAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1268:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1269:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1269:1: ( ruleEString )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1270:1: ruleEString
            {
             before(grammarAccess.getAnswerAccess().getIsFreeTextEStringParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Answer__IsFreeTextAssignment_1_12489);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAnswerAccess().getIsFreeTextEStringParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Answer__IsFreeTextAssignment_1_1"


    // $ANTLR start "rule__Answer__ContentAssignment_2"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1279:1: rule__Answer__ContentAssignment_2 : ( ruleContent ) ;
    public final void rule__Answer__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1283:1: ( ( ruleContent ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1284:1: ( ruleContent )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1284:1: ( ruleContent )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1285:1: ruleContent
            {
             before(grammarAccess.getAnswerAccess().getContentContentParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleContent_in_rule__Answer__ContentAssignment_22520);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1294:1: rule__Answer__FollowupAssignment_3_1 : ( ruleQuestion ) ;
    public final void rule__Answer__FollowupAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1298:1: ( ( ruleQuestion ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1299:1: ( ruleQuestion )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1299:1: ( ruleQuestion )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1300:1: ruleQuestion
            {
             before(grammarAccess.getAnswerAccess().getFollowupQuestionParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_rule__Answer__FollowupAssignment_3_12551);
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
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString303 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Survey__Alternatives_1373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Survey__Alternatives_1393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Survey__Alternatives_5428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Survey__Alternatives_5448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__0__Impl_in_rule__Survey__Group__0530 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__Survey__Group__1_in_rule__Survey__Group__0533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Survey__Group__0__Impl561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__1__Impl_in_rule__Survey__Group__1592 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Survey__Group__2_in_rule__Survey__Group__1595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Alternatives_1_in_rule__Survey__Group__1__Impl622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__2__Impl_in_rule__Survey__Group__2652 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Survey__Group__3_in_rule__Survey__Group__2655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__IntroAssignment_2_in_rule__Survey__Group__2__Impl682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__3__Impl_in_rule__Survey__Group__3712 = new BitSet(new long[]{0x0000000000016000L});
        public static final BitSet FOLLOW_rule__Survey__Group__4_in_rule__Survey__Group__3715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__QuestionsAssignment_3_in_rule__Survey__Group__3__Impl742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__4__Impl_in_rule__Survey__Group__4772 = new BitSet(new long[]{0x0000000000016000L});
        public static final BitSet FOLLOW_rule__Survey__Group__5_in_rule__Survey__Group__4775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__QuestionsAssignment_4_in_rule__Survey__Group__4__Impl802 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__Survey__Group__5__Impl_in_rule__Survey__Group__5833 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Survey__Group__6_in_rule__Survey__Group__5836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Alternatives_5_in_rule__Survey__Group__5__Impl863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__6__Impl_in_rule__Survey__Group__6893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__OutroAssignment_6_in_rule__Survey__Group__6__Impl920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__Group__0__Impl_in_rule__Question__Group__0964 = new BitSet(new long[]{0x0000000000600030L});
        public static final BitSet FOLLOW_rule__Question__Group__1_in_rule__Question__Group__0967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Question__Group__0__Impl995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__Group__1__Impl_in_rule__Question__Group__11026 = new BitSet(new long[]{0x0000000000600030L});
        public static final BitSet FOLLOW_rule__Question__Group__2_in_rule__Question__Group__11029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__IsExclusiveAssignment_1_in_rule__Question__Group__1__Impl1056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__Group__2__Impl_in_rule__Question__Group__21087 = new BitSet(new long[]{0x0000000000600030L});
        public static final BitSet FOLLOW_rule__Question__Group__3_in_rule__Question__Group__21090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__IsOptionalAssignment_2_in_rule__Question__Group__2__Impl1117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__Group__3__Impl_in_rule__Question__Group__31148 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Question__Group__4_in_rule__Question__Group__31151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__ContentAssignment_3_in_rule__Question__Group__3__Impl1178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__Group__4__Impl_in_rule__Question__Group__41208 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Question__Group__5_in_rule__Question__Group__41211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Question__Group__4__Impl1239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__Group__5__Impl_in_rule__Question__Group__51270 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_rule__Question__Group__6_in_rule__Question__Group__51273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__AnswersAssignment_5_in_rule__Question__Group__5__Impl1300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__Group__6__Impl_in_rule__Question__Group__61330 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_rule__Question__Group__7_in_rule__Question__Group__61333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__AnswersAssignment_6_in_rule__Question__Group__6__Impl1360 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__Question__Group__7__Impl_in_rule__Question__Group__71391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Question__Group__7__Impl1419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Content__Group__0__Impl_in_rule__Content__Group__01466 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Content__Group__1_in_rule__Content__Group__01469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Content__Group__1__Impl_in_rule__Content__Group__11527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Content__BodyAssignment_1_in_rule__Content__Group__1__Impl1554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group__0__Impl_in_rule__Answer__Group__01589 = new BitSet(new long[]{0x0000000000100030L});
        public static final BitSet FOLLOW_rule__Answer__Group__1_in_rule__Answer__Group__01592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Answer__Group__0__Impl1620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group__1__Impl_in_rule__Answer__Group__11651 = new BitSet(new long[]{0x0000000000100030L});
        public static final BitSet FOLLOW_rule__Answer__Group__2_in_rule__Answer__Group__11654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group_1__0_in_rule__Answer__Group__1__Impl1681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group__2__Impl_in_rule__Answer__Group__21712 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Answer__Group__3_in_rule__Answer__Group__21715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__ContentAssignment_2_in_rule__Answer__Group__2__Impl1742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group__3__Impl_in_rule__Answer__Group__31772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group_3__0_in_rule__Answer__Group__3__Impl1799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group_1__0__Impl_in_rule__Answer__Group_1__01838 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Answer__Group_1__1_in_rule__Answer__Group_1__01841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Answer__Group_1__0__Impl1869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group_1__1__Impl_in_rule__Answer__Group_1__11900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__IsFreeTextAssignment_1_1_in_rule__Answer__Group_1__1__Impl1927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group_3__0__Impl_in_rule__Answer__Group_3__01961 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Answer__Group_3__1_in_rule__Answer__Group_3__01964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Answer__Group_3__0__Impl1992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group_3__1__Impl_in_rule__Answer__Group_3__12023 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Answer__Group_3__2_in_rule__Answer__Group_3__12026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__FollowupAssignment_3_1_in_rule__Answer__Group_3__1__Impl2053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group_3__2__Impl_in_rule__Answer__Group_3__22083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Answer__Group_3__2__Impl2111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContent_in_rule__Survey__IntroAssignment_22153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_rule__Survey__QuestionsAssignment_32184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_rule__Survey__QuestionsAssignment_42215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContent_in_rule__Survey__OutroAssignment_62246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Question__IsExclusiveAssignment_12282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Question__IsOptionalAssignment_22326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContent_in_rule__Question__ContentAssignment_32365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__Question__AnswersAssignment_52396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__Question__AnswersAssignment_62427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Content__BodyAssignment_12458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Answer__IsFreeTextAssignment_1_12489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContent_in_rule__Answer__ContentAssignment_22520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_rule__Answer__FollowupAssignment_3_12551 = new BitSet(new long[]{0x0000000000000002L});
    }


}