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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Survey'", "'{'", "'intro'", "'outro'", "'questions'", "'}'", "','", "'Question'", "'answers'", "'content'", "'Content'", "'body'", "'Answer'", "'isFreeText'", "'followup'", "'isExclusive'", "'isOptional'"
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


    // $ANTLR start "rule__EString__Alternatives"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:203:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:207:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:208:1: ( RULE_STRING )
                    {
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:208:1: ( RULE_STRING )
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:209:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives373); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:214:6: ( RULE_ID )
                    {
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:214:6: ( RULE_ID )
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:215:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives390); 
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:227:1: rule__Survey__Group__0 : rule__Survey__Group__0__Impl rule__Survey__Group__1 ;
    public final void rule__Survey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:231:1: ( rule__Survey__Group__0__Impl rule__Survey__Group__1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:232:2: rule__Survey__Group__0__Impl rule__Survey__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__0__Impl_in_rule__Survey__Group__0420);
            rule__Survey__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__1_in_rule__Survey__Group__0423);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:239:1: rule__Survey__Group__0__Impl : ( 'Survey' ) ;
    public final void rule__Survey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:243:1: ( ( 'Survey' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:244:1: ( 'Survey' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:244:1: ( 'Survey' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:245:1: 'Survey'
            {
             before(grammarAccess.getSurveyAccess().getSurveyKeyword_0()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Survey__Group__0__Impl451); 
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:258:1: rule__Survey__Group__1 : rule__Survey__Group__1__Impl rule__Survey__Group__2 ;
    public final void rule__Survey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:262:1: ( rule__Survey__Group__1__Impl rule__Survey__Group__2 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:263:2: rule__Survey__Group__1__Impl rule__Survey__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__1__Impl_in_rule__Survey__Group__1482);
            rule__Survey__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__2_in_rule__Survey__Group__1485);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:270:1: rule__Survey__Group__1__Impl : ( '{' ) ;
    public final void rule__Survey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:274:1: ( ( '{' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:275:1: ( '{' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:275:1: ( '{' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:276:1: '{'
            {
             before(grammarAccess.getSurveyAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Survey__Group__1__Impl513); 
             after(grammarAccess.getSurveyAccess().getLeftCurlyBracketKeyword_1()); 

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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:289:1: rule__Survey__Group__2 : rule__Survey__Group__2__Impl rule__Survey__Group__3 ;
    public final void rule__Survey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:293:1: ( rule__Survey__Group__2__Impl rule__Survey__Group__3 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:294:2: rule__Survey__Group__2__Impl rule__Survey__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__2__Impl_in_rule__Survey__Group__2544);
            rule__Survey__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__3_in_rule__Survey__Group__2547);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:301:1: rule__Survey__Group__2__Impl : ( 'intro' ) ;
    public final void rule__Survey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:305:1: ( ( 'intro' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:306:1: ( 'intro' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:306:1: ( 'intro' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:307:1: 'intro'
            {
             before(grammarAccess.getSurveyAccess().getIntroKeyword_2()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Survey__Group__2__Impl575); 
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:320:1: rule__Survey__Group__3 : rule__Survey__Group__3__Impl rule__Survey__Group__4 ;
    public final void rule__Survey__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:324:1: ( rule__Survey__Group__3__Impl rule__Survey__Group__4 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:325:2: rule__Survey__Group__3__Impl rule__Survey__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__3__Impl_in_rule__Survey__Group__3606);
            rule__Survey__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__4_in_rule__Survey__Group__3609);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:332:1: rule__Survey__Group__3__Impl : ( ( rule__Survey__IntroAssignment_3 ) ) ;
    public final void rule__Survey__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:336:1: ( ( ( rule__Survey__IntroAssignment_3 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:337:1: ( ( rule__Survey__IntroAssignment_3 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:337:1: ( ( rule__Survey__IntroAssignment_3 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:338:1: ( rule__Survey__IntroAssignment_3 )
            {
             before(grammarAccess.getSurveyAccess().getIntroAssignment_3()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:339:1: ( rule__Survey__IntroAssignment_3 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:339:2: rule__Survey__IntroAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__IntroAssignment_3_in_rule__Survey__Group__3__Impl636);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:349:1: rule__Survey__Group__4 : rule__Survey__Group__4__Impl rule__Survey__Group__5 ;
    public final void rule__Survey__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:353:1: ( rule__Survey__Group__4__Impl rule__Survey__Group__5 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:354:2: rule__Survey__Group__4__Impl rule__Survey__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__4__Impl_in_rule__Survey__Group__4666);
            rule__Survey__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__5_in_rule__Survey__Group__4669);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:361:1: rule__Survey__Group__4__Impl : ( 'outro' ) ;
    public final void rule__Survey__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:365:1: ( ( 'outro' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:366:1: ( 'outro' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:366:1: ( 'outro' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:367:1: 'outro'
            {
             before(grammarAccess.getSurveyAccess().getOutroKeyword_4()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Survey__Group__4__Impl697); 
             after(grammarAccess.getSurveyAccess().getOutroKeyword_4()); 

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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:380:1: rule__Survey__Group__5 : rule__Survey__Group__5__Impl rule__Survey__Group__6 ;
    public final void rule__Survey__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:384:1: ( rule__Survey__Group__5__Impl rule__Survey__Group__6 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:385:2: rule__Survey__Group__5__Impl rule__Survey__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__5__Impl_in_rule__Survey__Group__5728);
            rule__Survey__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__6_in_rule__Survey__Group__5731);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:392:1: rule__Survey__Group__5__Impl : ( ( rule__Survey__OutroAssignment_5 ) ) ;
    public final void rule__Survey__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:396:1: ( ( ( rule__Survey__OutroAssignment_5 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:397:1: ( ( rule__Survey__OutroAssignment_5 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:397:1: ( ( rule__Survey__OutroAssignment_5 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:398:1: ( rule__Survey__OutroAssignment_5 )
            {
             before(grammarAccess.getSurveyAccess().getOutroAssignment_5()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:399:1: ( rule__Survey__OutroAssignment_5 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:399:2: rule__Survey__OutroAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__OutroAssignment_5_in_rule__Survey__Group__5__Impl758);
            rule__Survey__OutroAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSurveyAccess().getOutroAssignment_5()); 

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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:409:1: rule__Survey__Group__6 : rule__Survey__Group__6__Impl rule__Survey__Group__7 ;
    public final void rule__Survey__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:413:1: ( rule__Survey__Group__6__Impl rule__Survey__Group__7 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:414:2: rule__Survey__Group__6__Impl rule__Survey__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__6__Impl_in_rule__Survey__Group__6788);
            rule__Survey__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__7_in_rule__Survey__Group__6791);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:421:1: rule__Survey__Group__6__Impl : ( 'questions' ) ;
    public final void rule__Survey__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:425:1: ( ( 'questions' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:426:1: ( 'questions' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:426:1: ( 'questions' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:427:1: 'questions'
            {
             before(grammarAccess.getSurveyAccess().getQuestionsKeyword_6()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Survey__Group__6__Impl819); 
             after(grammarAccess.getSurveyAccess().getQuestionsKeyword_6()); 

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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:440:1: rule__Survey__Group__7 : rule__Survey__Group__7__Impl rule__Survey__Group__8 ;
    public final void rule__Survey__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:444:1: ( rule__Survey__Group__7__Impl rule__Survey__Group__8 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:445:2: rule__Survey__Group__7__Impl rule__Survey__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__7__Impl_in_rule__Survey__Group__7850);
            rule__Survey__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__8_in_rule__Survey__Group__7853);
            rule__Survey__Group__8();

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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:452:1: rule__Survey__Group__7__Impl : ( '{' ) ;
    public final void rule__Survey__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:456:1: ( ( '{' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:457:1: ( '{' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:457:1: ( '{' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:458:1: '{'
            {
             before(grammarAccess.getSurveyAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Survey__Group__7__Impl881); 
             after(grammarAccess.getSurveyAccess().getLeftCurlyBracketKeyword_7()); 

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


    // $ANTLR start "rule__Survey__Group__8"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:471:1: rule__Survey__Group__8 : rule__Survey__Group__8__Impl rule__Survey__Group__9 ;
    public final void rule__Survey__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:475:1: ( rule__Survey__Group__8__Impl rule__Survey__Group__9 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:476:2: rule__Survey__Group__8__Impl rule__Survey__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__8__Impl_in_rule__Survey__Group__8912);
            rule__Survey__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__9_in_rule__Survey__Group__8915);
            rule__Survey__Group__9();

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
    // $ANTLR end "rule__Survey__Group__8"


    // $ANTLR start "rule__Survey__Group__8__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:483:1: rule__Survey__Group__8__Impl : ( ( rule__Survey__QuestionsAssignment_8 ) ) ;
    public final void rule__Survey__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:487:1: ( ( ( rule__Survey__QuestionsAssignment_8 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:488:1: ( ( rule__Survey__QuestionsAssignment_8 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:488:1: ( ( rule__Survey__QuestionsAssignment_8 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:489:1: ( rule__Survey__QuestionsAssignment_8 )
            {
             before(grammarAccess.getSurveyAccess().getQuestionsAssignment_8()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:490:1: ( rule__Survey__QuestionsAssignment_8 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:490:2: rule__Survey__QuestionsAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__QuestionsAssignment_8_in_rule__Survey__Group__8__Impl942);
            rule__Survey__QuestionsAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getSurveyAccess().getQuestionsAssignment_8()); 

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
    // $ANTLR end "rule__Survey__Group__8__Impl"


    // $ANTLR start "rule__Survey__Group__9"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:500:1: rule__Survey__Group__9 : rule__Survey__Group__9__Impl rule__Survey__Group__10 ;
    public final void rule__Survey__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:504:1: ( rule__Survey__Group__9__Impl rule__Survey__Group__10 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:505:2: rule__Survey__Group__9__Impl rule__Survey__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__9__Impl_in_rule__Survey__Group__9972);
            rule__Survey__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__10_in_rule__Survey__Group__9975);
            rule__Survey__Group__10();

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
    // $ANTLR end "rule__Survey__Group__9"


    // $ANTLR start "rule__Survey__Group__9__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:512:1: rule__Survey__Group__9__Impl : ( ( rule__Survey__Group_9__0 )* ) ;
    public final void rule__Survey__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:516:1: ( ( ( rule__Survey__Group_9__0 )* ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:517:1: ( ( rule__Survey__Group_9__0 )* )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:517:1: ( ( rule__Survey__Group_9__0 )* )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:518:1: ( rule__Survey__Group_9__0 )*
            {
             before(grammarAccess.getSurveyAccess().getGroup_9()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:519:1: ( rule__Survey__Group_9__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:519:2: rule__Survey__Group_9__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Survey__Group_9__0_in_rule__Survey__Group__9__Impl1002);
            	    rule__Survey__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getSurveyAccess().getGroup_9()); 

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
    // $ANTLR end "rule__Survey__Group__9__Impl"


    // $ANTLR start "rule__Survey__Group__10"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:529:1: rule__Survey__Group__10 : rule__Survey__Group__10__Impl rule__Survey__Group__11 ;
    public final void rule__Survey__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:533:1: ( rule__Survey__Group__10__Impl rule__Survey__Group__11 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:534:2: rule__Survey__Group__10__Impl rule__Survey__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__10__Impl_in_rule__Survey__Group__101033);
            rule__Survey__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__11_in_rule__Survey__Group__101036);
            rule__Survey__Group__11();

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
    // $ANTLR end "rule__Survey__Group__10"


    // $ANTLR start "rule__Survey__Group__10__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:541:1: rule__Survey__Group__10__Impl : ( '}' ) ;
    public final void rule__Survey__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:545:1: ( ( '}' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:546:1: ( '}' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:546:1: ( '}' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:547:1: '}'
            {
             before(grammarAccess.getSurveyAccess().getRightCurlyBracketKeyword_10()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Survey__Group__10__Impl1064); 
             after(grammarAccess.getSurveyAccess().getRightCurlyBracketKeyword_10()); 

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
    // $ANTLR end "rule__Survey__Group__10__Impl"


    // $ANTLR start "rule__Survey__Group__11"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:560:1: rule__Survey__Group__11 : rule__Survey__Group__11__Impl ;
    public final void rule__Survey__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:564:1: ( rule__Survey__Group__11__Impl )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:565:2: rule__Survey__Group__11__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__11__Impl_in_rule__Survey__Group__111095);
            rule__Survey__Group__11__Impl();

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
    // $ANTLR end "rule__Survey__Group__11"


    // $ANTLR start "rule__Survey__Group__11__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:571:1: rule__Survey__Group__11__Impl : ( '}' ) ;
    public final void rule__Survey__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:575:1: ( ( '}' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:576:1: ( '}' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:576:1: ( '}' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:577:1: '}'
            {
             before(grammarAccess.getSurveyAccess().getRightCurlyBracketKeyword_11()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Survey__Group__11__Impl1123); 
             after(grammarAccess.getSurveyAccess().getRightCurlyBracketKeyword_11()); 

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
    // $ANTLR end "rule__Survey__Group__11__Impl"


    // $ANTLR start "rule__Survey__Group_9__0"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:614:1: rule__Survey__Group_9__0 : rule__Survey__Group_9__0__Impl rule__Survey__Group_9__1 ;
    public final void rule__Survey__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:618:1: ( rule__Survey__Group_9__0__Impl rule__Survey__Group_9__1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:619:2: rule__Survey__Group_9__0__Impl rule__Survey__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group_9__0__Impl_in_rule__Survey__Group_9__01178);
            rule__Survey__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group_9__1_in_rule__Survey__Group_9__01181);
            rule__Survey__Group_9__1();

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
    // $ANTLR end "rule__Survey__Group_9__0"


    // $ANTLR start "rule__Survey__Group_9__0__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:626:1: rule__Survey__Group_9__0__Impl : ( ',' ) ;
    public final void rule__Survey__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:630:1: ( ( ',' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:631:1: ( ',' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:631:1: ( ',' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:632:1: ','
            {
             before(grammarAccess.getSurveyAccess().getCommaKeyword_9_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Survey__Group_9__0__Impl1209); 
             after(grammarAccess.getSurveyAccess().getCommaKeyword_9_0()); 

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
    // $ANTLR end "rule__Survey__Group_9__0__Impl"


    // $ANTLR start "rule__Survey__Group_9__1"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:645:1: rule__Survey__Group_9__1 : rule__Survey__Group_9__1__Impl ;
    public final void rule__Survey__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:649:1: ( rule__Survey__Group_9__1__Impl )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:650:2: rule__Survey__Group_9__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group_9__1__Impl_in_rule__Survey__Group_9__11240);
            rule__Survey__Group_9__1__Impl();

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
    // $ANTLR end "rule__Survey__Group_9__1"


    // $ANTLR start "rule__Survey__Group_9__1__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:656:1: rule__Survey__Group_9__1__Impl : ( ( rule__Survey__QuestionsAssignment_9_1 ) ) ;
    public final void rule__Survey__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:660:1: ( ( ( rule__Survey__QuestionsAssignment_9_1 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:661:1: ( ( rule__Survey__QuestionsAssignment_9_1 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:661:1: ( ( rule__Survey__QuestionsAssignment_9_1 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:662:1: ( rule__Survey__QuestionsAssignment_9_1 )
            {
             before(grammarAccess.getSurveyAccess().getQuestionsAssignment_9_1()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:663:1: ( rule__Survey__QuestionsAssignment_9_1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:663:2: rule__Survey__QuestionsAssignment_9_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__QuestionsAssignment_9_1_in_rule__Survey__Group_9__1__Impl1267);
            rule__Survey__QuestionsAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getSurveyAccess().getQuestionsAssignment_9_1()); 

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
    // $ANTLR end "rule__Survey__Group_9__1__Impl"


    // $ANTLR start "rule__Question__Group__0"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:677:1: rule__Question__Group__0 : rule__Question__Group__0__Impl rule__Question__Group__1 ;
    public final void rule__Question__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:681:1: ( rule__Question__Group__0__Impl rule__Question__Group__1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:682:2: rule__Question__Group__0__Impl rule__Question__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__0__Impl_in_rule__Question__Group__01301);
            rule__Question__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__1_in_rule__Question__Group__01304);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:689:1: rule__Question__Group__0__Impl : ( ( rule__Question__IsExclusiveAssignment_0 )? ) ;
    public final void rule__Question__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:693:1: ( ( ( rule__Question__IsExclusiveAssignment_0 )? ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:694:1: ( ( rule__Question__IsExclusiveAssignment_0 )? )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:694:1: ( ( rule__Question__IsExclusiveAssignment_0 )? )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:695:1: ( rule__Question__IsExclusiveAssignment_0 )?
            {
             before(grammarAccess.getQuestionAccess().getIsExclusiveAssignment_0()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:696:1: ( rule__Question__IsExclusiveAssignment_0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==26) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:696:2: rule__Question__IsExclusiveAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Question__IsExclusiveAssignment_0_in_rule__Question__Group__0__Impl1331);
                    rule__Question__IsExclusiveAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionAccess().getIsExclusiveAssignment_0()); 

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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:706:1: rule__Question__Group__1 : rule__Question__Group__1__Impl rule__Question__Group__2 ;
    public final void rule__Question__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:710:1: ( rule__Question__Group__1__Impl rule__Question__Group__2 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:711:2: rule__Question__Group__1__Impl rule__Question__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__1__Impl_in_rule__Question__Group__11362);
            rule__Question__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__2_in_rule__Question__Group__11365);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:718:1: rule__Question__Group__1__Impl : ( ( rule__Question__IsOptionalAssignment_1 )? ) ;
    public final void rule__Question__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:722:1: ( ( ( rule__Question__IsOptionalAssignment_1 )? ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:723:1: ( ( rule__Question__IsOptionalAssignment_1 )? )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:723:1: ( ( rule__Question__IsOptionalAssignment_1 )? )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:724:1: ( rule__Question__IsOptionalAssignment_1 )?
            {
             before(grammarAccess.getQuestionAccess().getIsOptionalAssignment_1()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:725:1: ( rule__Question__IsOptionalAssignment_1 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==27) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:725:2: rule__Question__IsOptionalAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Question__IsOptionalAssignment_1_in_rule__Question__Group__1__Impl1392);
                    rule__Question__IsOptionalAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionAccess().getIsOptionalAssignment_1()); 

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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:735:1: rule__Question__Group__2 : rule__Question__Group__2__Impl rule__Question__Group__3 ;
    public final void rule__Question__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:739:1: ( rule__Question__Group__2__Impl rule__Question__Group__3 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:740:2: rule__Question__Group__2__Impl rule__Question__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__2__Impl_in_rule__Question__Group__21423);
            rule__Question__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__3_in_rule__Question__Group__21426);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:747:1: rule__Question__Group__2__Impl : ( 'Question' ) ;
    public final void rule__Question__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:751:1: ( ( 'Question' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:752:1: ( 'Question' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:752:1: ( 'Question' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:753:1: 'Question'
            {
             before(grammarAccess.getQuestionAccess().getQuestionKeyword_2()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Question__Group__2__Impl1454); 
             after(grammarAccess.getQuestionAccess().getQuestionKeyword_2()); 

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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:766:1: rule__Question__Group__3 : rule__Question__Group__3__Impl rule__Question__Group__4 ;
    public final void rule__Question__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:770:1: ( rule__Question__Group__3__Impl rule__Question__Group__4 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:771:2: rule__Question__Group__3__Impl rule__Question__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__3__Impl_in_rule__Question__Group__31485);
            rule__Question__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__4_in_rule__Question__Group__31488);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:778:1: rule__Question__Group__3__Impl : ( '{' ) ;
    public final void rule__Question__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:782:1: ( ( '{' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:783:1: ( '{' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:783:1: ( '{' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:784:1: '{'
            {
             before(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Question__Group__3__Impl1516); 
             after(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_3()); 

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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:797:1: rule__Question__Group__4 : rule__Question__Group__4__Impl rule__Question__Group__5 ;
    public final void rule__Question__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:801:1: ( rule__Question__Group__4__Impl rule__Question__Group__5 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:802:2: rule__Question__Group__4__Impl rule__Question__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__4__Impl_in_rule__Question__Group__41547);
            rule__Question__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__5_in_rule__Question__Group__41550);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:809:1: rule__Question__Group__4__Impl : ( 'answers' ) ;
    public final void rule__Question__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:813:1: ( ( 'answers' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:814:1: ( 'answers' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:814:1: ( 'answers' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:815:1: 'answers'
            {
             before(grammarAccess.getQuestionAccess().getAnswersKeyword_4()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Question__Group__4__Impl1578); 
             after(grammarAccess.getQuestionAccess().getAnswersKeyword_4()); 

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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:828:1: rule__Question__Group__5 : rule__Question__Group__5__Impl rule__Question__Group__6 ;
    public final void rule__Question__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:832:1: ( rule__Question__Group__5__Impl rule__Question__Group__6 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:833:2: rule__Question__Group__5__Impl rule__Question__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__5__Impl_in_rule__Question__Group__51609);
            rule__Question__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__6_in_rule__Question__Group__51612);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:840:1: rule__Question__Group__5__Impl : ( '{' ) ;
    public final void rule__Question__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:844:1: ( ( '{' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:845:1: ( '{' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:845:1: ( '{' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:846:1: '{'
            {
             before(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Question__Group__5__Impl1640); 
             after(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_5()); 

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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:859:1: rule__Question__Group__6 : rule__Question__Group__6__Impl rule__Question__Group__7 ;
    public final void rule__Question__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:863:1: ( rule__Question__Group__6__Impl rule__Question__Group__7 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:864:2: rule__Question__Group__6__Impl rule__Question__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__6__Impl_in_rule__Question__Group__61671);
            rule__Question__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__7_in_rule__Question__Group__61674);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:871:1: rule__Question__Group__6__Impl : ( ( rule__Question__AnswersAssignment_6 ) ) ;
    public final void rule__Question__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:875:1: ( ( ( rule__Question__AnswersAssignment_6 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:876:1: ( ( rule__Question__AnswersAssignment_6 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:876:1: ( ( rule__Question__AnswersAssignment_6 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:877:1: ( rule__Question__AnswersAssignment_6 )
            {
             before(grammarAccess.getQuestionAccess().getAnswersAssignment_6()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:878:1: ( rule__Question__AnswersAssignment_6 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:878:2: rule__Question__AnswersAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__AnswersAssignment_6_in_rule__Question__Group__6__Impl1701);
            rule__Question__AnswersAssignment_6();

            state._fsp--;


            }

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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:888:1: rule__Question__Group__7 : rule__Question__Group__7__Impl rule__Question__Group__8 ;
    public final void rule__Question__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:892:1: ( rule__Question__Group__7__Impl rule__Question__Group__8 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:893:2: rule__Question__Group__7__Impl rule__Question__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__7__Impl_in_rule__Question__Group__71731);
            rule__Question__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__8_in_rule__Question__Group__71734);
            rule__Question__Group__8();

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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:900:1: rule__Question__Group__7__Impl : ( ( rule__Question__Group_7__0 )* ) ;
    public final void rule__Question__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:904:1: ( ( ( rule__Question__Group_7__0 )* ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:905:1: ( ( rule__Question__Group_7__0 )* )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:905:1: ( ( rule__Question__Group_7__0 )* )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:906:1: ( rule__Question__Group_7__0 )*
            {
             before(grammarAccess.getQuestionAccess().getGroup_7()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:907:1: ( rule__Question__Group_7__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:907:2: rule__Question__Group_7__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Question__Group_7__0_in_rule__Question__Group__7__Impl1761);
            	    rule__Question__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getQuestionAccess().getGroup_7()); 

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


    // $ANTLR start "rule__Question__Group__8"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:917:1: rule__Question__Group__8 : rule__Question__Group__8__Impl rule__Question__Group__9 ;
    public final void rule__Question__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:921:1: ( rule__Question__Group__8__Impl rule__Question__Group__9 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:922:2: rule__Question__Group__8__Impl rule__Question__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__8__Impl_in_rule__Question__Group__81792);
            rule__Question__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__9_in_rule__Question__Group__81795);
            rule__Question__Group__9();

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
    // $ANTLR end "rule__Question__Group__8"


    // $ANTLR start "rule__Question__Group__8__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:929:1: rule__Question__Group__8__Impl : ( '}' ) ;
    public final void rule__Question__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:933:1: ( ( '}' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:934:1: ( '}' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:934:1: ( '}' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:935:1: '}'
            {
             before(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Question__Group__8__Impl1823); 
             after(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Question__Group__8__Impl"


    // $ANTLR start "rule__Question__Group__9"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:948:1: rule__Question__Group__9 : rule__Question__Group__9__Impl rule__Question__Group__10 ;
    public final void rule__Question__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:952:1: ( rule__Question__Group__9__Impl rule__Question__Group__10 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:953:2: rule__Question__Group__9__Impl rule__Question__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__9__Impl_in_rule__Question__Group__91854);
            rule__Question__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__10_in_rule__Question__Group__91857);
            rule__Question__Group__10();

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
    // $ANTLR end "rule__Question__Group__9"


    // $ANTLR start "rule__Question__Group__9__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:960:1: rule__Question__Group__9__Impl : ( 'content' ) ;
    public final void rule__Question__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:964:1: ( ( 'content' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:965:1: ( 'content' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:965:1: ( 'content' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:966:1: 'content'
            {
             before(grammarAccess.getQuestionAccess().getContentKeyword_9()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Question__Group__9__Impl1885); 
             after(grammarAccess.getQuestionAccess().getContentKeyword_9()); 

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
    // $ANTLR end "rule__Question__Group__9__Impl"


    // $ANTLR start "rule__Question__Group__10"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:979:1: rule__Question__Group__10 : rule__Question__Group__10__Impl rule__Question__Group__11 ;
    public final void rule__Question__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:983:1: ( rule__Question__Group__10__Impl rule__Question__Group__11 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:984:2: rule__Question__Group__10__Impl rule__Question__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__10__Impl_in_rule__Question__Group__101916);
            rule__Question__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__11_in_rule__Question__Group__101919);
            rule__Question__Group__11();

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
    // $ANTLR end "rule__Question__Group__10"


    // $ANTLR start "rule__Question__Group__10__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:991:1: rule__Question__Group__10__Impl : ( ( rule__Question__ContentAssignment_10 ) ) ;
    public final void rule__Question__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:995:1: ( ( ( rule__Question__ContentAssignment_10 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:996:1: ( ( rule__Question__ContentAssignment_10 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:996:1: ( ( rule__Question__ContentAssignment_10 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:997:1: ( rule__Question__ContentAssignment_10 )
            {
             before(grammarAccess.getQuestionAccess().getContentAssignment_10()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:998:1: ( rule__Question__ContentAssignment_10 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:998:2: rule__Question__ContentAssignment_10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__ContentAssignment_10_in_rule__Question__Group__10__Impl1946);
            rule__Question__ContentAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getContentAssignment_10()); 

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
    // $ANTLR end "rule__Question__Group__10__Impl"


    // $ANTLR start "rule__Question__Group__11"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1008:1: rule__Question__Group__11 : rule__Question__Group__11__Impl ;
    public final void rule__Question__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1012:1: ( rule__Question__Group__11__Impl )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1013:2: rule__Question__Group__11__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__11__Impl_in_rule__Question__Group__111976);
            rule__Question__Group__11__Impl();

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
    // $ANTLR end "rule__Question__Group__11"


    // $ANTLR start "rule__Question__Group__11__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1019:1: rule__Question__Group__11__Impl : ( '}' ) ;
    public final void rule__Question__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1023:1: ( ( '}' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1024:1: ( '}' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1024:1: ( '}' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1025:1: '}'
            {
             before(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_11()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Question__Group__11__Impl2004); 
             after(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_11()); 

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
    // $ANTLR end "rule__Question__Group__11__Impl"


    // $ANTLR start "rule__Question__Group_7__0"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1062:1: rule__Question__Group_7__0 : rule__Question__Group_7__0__Impl rule__Question__Group_7__1 ;
    public final void rule__Question__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1066:1: ( rule__Question__Group_7__0__Impl rule__Question__Group_7__1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1067:2: rule__Question__Group_7__0__Impl rule__Question__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Group_7__0__Impl_in_rule__Question__Group_7__02059);
            rule__Question__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question__Group_7__1_in_rule__Question__Group_7__02062);
            rule__Question__Group_7__1();

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
    // $ANTLR end "rule__Question__Group_7__0"


    // $ANTLR start "rule__Question__Group_7__0__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1074:1: rule__Question__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Question__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1078:1: ( ( ',' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1079:1: ( ',' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1079:1: ( ',' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1080:1: ','
            {
             before(grammarAccess.getQuestionAccess().getCommaKeyword_7_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Question__Group_7__0__Impl2090); 
             after(grammarAccess.getQuestionAccess().getCommaKeyword_7_0()); 

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
    // $ANTLR end "rule__Question__Group_7__0__Impl"


    // $ANTLR start "rule__Question__Group_7__1"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1093:1: rule__Question__Group_7__1 : rule__Question__Group_7__1__Impl ;
    public final void rule__Question__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1097:1: ( rule__Question__Group_7__1__Impl )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1098:2: rule__Question__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Group_7__1__Impl_in_rule__Question__Group_7__12121);
            rule__Question__Group_7__1__Impl();

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
    // $ANTLR end "rule__Question__Group_7__1"


    // $ANTLR start "rule__Question__Group_7__1__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1104:1: rule__Question__Group_7__1__Impl : ( ( rule__Question__AnswersAssignment_7_1 ) ) ;
    public final void rule__Question__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1108:1: ( ( ( rule__Question__AnswersAssignment_7_1 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1109:1: ( ( rule__Question__AnswersAssignment_7_1 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1109:1: ( ( rule__Question__AnswersAssignment_7_1 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1110:1: ( rule__Question__AnswersAssignment_7_1 )
            {
             before(grammarAccess.getQuestionAccess().getAnswersAssignment_7_1()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1111:1: ( rule__Question__AnswersAssignment_7_1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1111:2: rule__Question__AnswersAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__AnswersAssignment_7_1_in_rule__Question__Group_7__1__Impl2148);
            rule__Question__AnswersAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getAnswersAssignment_7_1()); 

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
    // $ANTLR end "rule__Question__Group_7__1__Impl"


    // $ANTLR start "rule__Content__Group__0"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1125:1: rule__Content__Group__0 : rule__Content__Group__0__Impl rule__Content__Group__1 ;
    public final void rule__Content__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1129:1: ( rule__Content__Group__0__Impl rule__Content__Group__1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1130:2: rule__Content__Group__0__Impl rule__Content__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Content__Group__0__Impl_in_rule__Content__Group__02182);
            rule__Content__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Content__Group__1_in_rule__Content__Group__02185);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1137:1: rule__Content__Group__0__Impl : ( () ) ;
    public final void rule__Content__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1141:1: ( ( () ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1142:1: ( () )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1142:1: ( () )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1143:1: ()
            {
             before(grammarAccess.getContentAccess().getContentAction_0()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1144:1: ()
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1146:1: 
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1156:1: rule__Content__Group__1 : rule__Content__Group__1__Impl rule__Content__Group__2 ;
    public final void rule__Content__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1160:1: ( rule__Content__Group__1__Impl rule__Content__Group__2 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1161:2: rule__Content__Group__1__Impl rule__Content__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Content__Group__1__Impl_in_rule__Content__Group__12243);
            rule__Content__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Content__Group__2_in_rule__Content__Group__12246);
            rule__Content__Group__2();

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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1168:1: rule__Content__Group__1__Impl : ( 'Content' ) ;
    public final void rule__Content__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1172:1: ( ( 'Content' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1173:1: ( 'Content' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1173:1: ( 'Content' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1174:1: 'Content'
            {
             before(grammarAccess.getContentAccess().getContentKeyword_1()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Content__Group__1__Impl2274); 
             after(grammarAccess.getContentAccess().getContentKeyword_1()); 

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


    // $ANTLR start "rule__Content__Group__2"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1187:1: rule__Content__Group__2 : rule__Content__Group__2__Impl rule__Content__Group__3 ;
    public final void rule__Content__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1191:1: ( rule__Content__Group__2__Impl rule__Content__Group__3 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1192:2: rule__Content__Group__2__Impl rule__Content__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Content__Group__2__Impl_in_rule__Content__Group__22305);
            rule__Content__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Content__Group__3_in_rule__Content__Group__22308);
            rule__Content__Group__3();

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
    // $ANTLR end "rule__Content__Group__2"


    // $ANTLR start "rule__Content__Group__2__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1199:1: rule__Content__Group__2__Impl : ( '{' ) ;
    public final void rule__Content__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1203:1: ( ( '{' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1204:1: ( '{' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1204:1: ( '{' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1205:1: '{'
            {
             before(grammarAccess.getContentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Content__Group__2__Impl2336); 
             after(grammarAccess.getContentAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Content__Group__2__Impl"


    // $ANTLR start "rule__Content__Group__3"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1218:1: rule__Content__Group__3 : rule__Content__Group__3__Impl rule__Content__Group__4 ;
    public final void rule__Content__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1222:1: ( rule__Content__Group__3__Impl rule__Content__Group__4 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1223:2: rule__Content__Group__3__Impl rule__Content__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Content__Group__3__Impl_in_rule__Content__Group__32367);
            rule__Content__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Content__Group__4_in_rule__Content__Group__32370);
            rule__Content__Group__4();

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
    // $ANTLR end "rule__Content__Group__3"


    // $ANTLR start "rule__Content__Group__3__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1230:1: rule__Content__Group__3__Impl : ( ( rule__Content__Group_3__0 )? ) ;
    public final void rule__Content__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1234:1: ( ( ( rule__Content__Group_3__0 )? ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1235:1: ( ( rule__Content__Group_3__0 )? )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1235:1: ( ( rule__Content__Group_3__0 )? )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1236:1: ( rule__Content__Group_3__0 )?
            {
             before(grammarAccess.getContentAccess().getGroup_3()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1237:1: ( rule__Content__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1237:2: rule__Content__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Content__Group_3__0_in_rule__Content__Group__3__Impl2397);
                    rule__Content__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Content__Group__3__Impl"


    // $ANTLR start "rule__Content__Group__4"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1247:1: rule__Content__Group__4 : rule__Content__Group__4__Impl ;
    public final void rule__Content__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1251:1: ( rule__Content__Group__4__Impl )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1252:2: rule__Content__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Content__Group__4__Impl_in_rule__Content__Group__42428);
            rule__Content__Group__4__Impl();

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
    // $ANTLR end "rule__Content__Group__4"


    // $ANTLR start "rule__Content__Group__4__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1258:1: rule__Content__Group__4__Impl : ( '}' ) ;
    public final void rule__Content__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1262:1: ( ( '}' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1263:1: ( '}' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1263:1: ( '}' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1264:1: '}'
            {
             before(grammarAccess.getContentAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Content__Group__4__Impl2456); 
             after(grammarAccess.getContentAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Content__Group__4__Impl"


    // $ANTLR start "rule__Content__Group_3__0"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1287:1: rule__Content__Group_3__0 : rule__Content__Group_3__0__Impl rule__Content__Group_3__1 ;
    public final void rule__Content__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1291:1: ( rule__Content__Group_3__0__Impl rule__Content__Group_3__1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1292:2: rule__Content__Group_3__0__Impl rule__Content__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Content__Group_3__0__Impl_in_rule__Content__Group_3__02497);
            rule__Content__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Content__Group_3__1_in_rule__Content__Group_3__02500);
            rule__Content__Group_3__1();

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
    // $ANTLR end "rule__Content__Group_3__0"


    // $ANTLR start "rule__Content__Group_3__0__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1299:1: rule__Content__Group_3__0__Impl : ( 'body' ) ;
    public final void rule__Content__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1303:1: ( ( 'body' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1304:1: ( 'body' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1304:1: ( 'body' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1305:1: 'body'
            {
             before(grammarAccess.getContentAccess().getBodyKeyword_3_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Content__Group_3__0__Impl2528); 
             after(grammarAccess.getContentAccess().getBodyKeyword_3_0()); 

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
    // $ANTLR end "rule__Content__Group_3__0__Impl"


    // $ANTLR start "rule__Content__Group_3__1"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1318:1: rule__Content__Group_3__1 : rule__Content__Group_3__1__Impl ;
    public final void rule__Content__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1322:1: ( rule__Content__Group_3__1__Impl )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1323:2: rule__Content__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Content__Group_3__1__Impl_in_rule__Content__Group_3__12559);
            rule__Content__Group_3__1__Impl();

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
    // $ANTLR end "rule__Content__Group_3__1"


    // $ANTLR start "rule__Content__Group_3__1__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1329:1: rule__Content__Group_3__1__Impl : ( ( rule__Content__BodyAssignment_3_1 ) ) ;
    public final void rule__Content__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1333:1: ( ( ( rule__Content__BodyAssignment_3_1 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1334:1: ( ( rule__Content__BodyAssignment_3_1 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1334:1: ( ( rule__Content__BodyAssignment_3_1 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1335:1: ( rule__Content__BodyAssignment_3_1 )
            {
             before(grammarAccess.getContentAccess().getBodyAssignment_3_1()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1336:1: ( rule__Content__BodyAssignment_3_1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1336:2: rule__Content__BodyAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Content__BodyAssignment_3_1_in_rule__Content__Group_3__1__Impl2586);
            rule__Content__BodyAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getContentAccess().getBodyAssignment_3_1()); 

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
    // $ANTLR end "rule__Content__Group_3__1__Impl"


    // $ANTLR start "rule__Answer__Group__0"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1350:1: rule__Answer__Group__0 : rule__Answer__Group__0__Impl rule__Answer__Group__1 ;
    public final void rule__Answer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1354:1: ( rule__Answer__Group__0__Impl rule__Answer__Group__1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1355:2: rule__Answer__Group__0__Impl rule__Answer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__0__Impl_in_rule__Answer__Group__02620);
            rule__Answer__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__1_in_rule__Answer__Group__02623);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1362:1: rule__Answer__Group__0__Impl : ( 'Answer' ) ;
    public final void rule__Answer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1366:1: ( ( 'Answer' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1367:1: ( 'Answer' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1367:1: ( 'Answer' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1368:1: 'Answer'
            {
             before(grammarAccess.getAnswerAccess().getAnswerKeyword_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Answer__Group__0__Impl2651); 
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1381:1: rule__Answer__Group__1 : rule__Answer__Group__1__Impl rule__Answer__Group__2 ;
    public final void rule__Answer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1385:1: ( rule__Answer__Group__1__Impl rule__Answer__Group__2 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1386:2: rule__Answer__Group__1__Impl rule__Answer__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__1__Impl_in_rule__Answer__Group__12682);
            rule__Answer__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__2_in_rule__Answer__Group__12685);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1393:1: rule__Answer__Group__1__Impl : ( '{' ) ;
    public final void rule__Answer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1397:1: ( ( '{' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1398:1: ( '{' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1398:1: ( '{' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1399:1: '{'
            {
             before(grammarAccess.getAnswerAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Answer__Group__1__Impl2713); 
             after(grammarAccess.getAnswerAccess().getLeftCurlyBracketKeyword_1()); 

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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1412:1: rule__Answer__Group__2 : rule__Answer__Group__2__Impl rule__Answer__Group__3 ;
    public final void rule__Answer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1416:1: ( rule__Answer__Group__2__Impl rule__Answer__Group__3 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1417:2: rule__Answer__Group__2__Impl rule__Answer__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__2__Impl_in_rule__Answer__Group__22744);
            rule__Answer__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__3_in_rule__Answer__Group__22747);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1424:1: rule__Answer__Group__2__Impl : ( ( rule__Answer__Group_2__0 )? ) ;
    public final void rule__Answer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1428:1: ( ( ( rule__Answer__Group_2__0 )? ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1429:1: ( ( rule__Answer__Group_2__0 )? )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1429:1: ( ( rule__Answer__Group_2__0 )? )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1430:1: ( rule__Answer__Group_2__0 )?
            {
             before(grammarAccess.getAnswerAccess().getGroup_2()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1431:1: ( rule__Answer__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1431:2: rule__Answer__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_2__0_in_rule__Answer__Group__2__Impl2774);
                    rule__Answer__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnswerAccess().getGroup_2()); 

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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1441:1: rule__Answer__Group__3 : rule__Answer__Group__3__Impl rule__Answer__Group__4 ;
    public final void rule__Answer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1445:1: ( rule__Answer__Group__3__Impl rule__Answer__Group__4 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1446:2: rule__Answer__Group__3__Impl rule__Answer__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__3__Impl_in_rule__Answer__Group__32805);
            rule__Answer__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__4_in_rule__Answer__Group__32808);
            rule__Answer__Group__4();

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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1453:1: rule__Answer__Group__3__Impl : ( 'content' ) ;
    public final void rule__Answer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1457:1: ( ( 'content' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1458:1: ( 'content' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1458:1: ( 'content' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1459:1: 'content'
            {
             before(grammarAccess.getAnswerAccess().getContentKeyword_3()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Answer__Group__3__Impl2836); 
             after(grammarAccess.getAnswerAccess().getContentKeyword_3()); 

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


    // $ANTLR start "rule__Answer__Group__4"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1472:1: rule__Answer__Group__4 : rule__Answer__Group__4__Impl rule__Answer__Group__5 ;
    public final void rule__Answer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1476:1: ( rule__Answer__Group__4__Impl rule__Answer__Group__5 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1477:2: rule__Answer__Group__4__Impl rule__Answer__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__4__Impl_in_rule__Answer__Group__42867);
            rule__Answer__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__5_in_rule__Answer__Group__42870);
            rule__Answer__Group__5();

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
    // $ANTLR end "rule__Answer__Group__4"


    // $ANTLR start "rule__Answer__Group__4__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1484:1: rule__Answer__Group__4__Impl : ( ( rule__Answer__ContentAssignment_4 ) ) ;
    public final void rule__Answer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1488:1: ( ( ( rule__Answer__ContentAssignment_4 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1489:1: ( ( rule__Answer__ContentAssignment_4 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1489:1: ( ( rule__Answer__ContentAssignment_4 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1490:1: ( rule__Answer__ContentAssignment_4 )
            {
             before(grammarAccess.getAnswerAccess().getContentAssignment_4()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1491:1: ( rule__Answer__ContentAssignment_4 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1491:2: rule__Answer__ContentAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__ContentAssignment_4_in_rule__Answer__Group__4__Impl2897);
            rule__Answer__ContentAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAnswerAccess().getContentAssignment_4()); 

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
    // $ANTLR end "rule__Answer__Group__4__Impl"


    // $ANTLR start "rule__Answer__Group__5"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1501:1: rule__Answer__Group__5 : rule__Answer__Group__5__Impl rule__Answer__Group__6 ;
    public final void rule__Answer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1505:1: ( rule__Answer__Group__5__Impl rule__Answer__Group__6 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1506:2: rule__Answer__Group__5__Impl rule__Answer__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__5__Impl_in_rule__Answer__Group__52927);
            rule__Answer__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__6_in_rule__Answer__Group__52930);
            rule__Answer__Group__6();

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
    // $ANTLR end "rule__Answer__Group__5"


    // $ANTLR start "rule__Answer__Group__5__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1513:1: rule__Answer__Group__5__Impl : ( ( rule__Answer__Group_5__0 )? ) ;
    public final void rule__Answer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1517:1: ( ( ( rule__Answer__Group_5__0 )? ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1518:1: ( ( rule__Answer__Group_5__0 )? )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1518:1: ( ( rule__Answer__Group_5__0 )? )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1519:1: ( rule__Answer__Group_5__0 )?
            {
             before(grammarAccess.getAnswerAccess().getGroup_5()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1520:1: ( rule__Answer__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1520:2: rule__Answer__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_5__0_in_rule__Answer__Group__5__Impl2957);
                    rule__Answer__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnswerAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Answer__Group__5__Impl"


    // $ANTLR start "rule__Answer__Group__6"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1530:1: rule__Answer__Group__6 : rule__Answer__Group__6__Impl ;
    public final void rule__Answer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1534:1: ( rule__Answer__Group__6__Impl )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1535:2: rule__Answer__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__6__Impl_in_rule__Answer__Group__62988);
            rule__Answer__Group__6__Impl();

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
    // $ANTLR end "rule__Answer__Group__6"


    // $ANTLR start "rule__Answer__Group__6__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1541:1: rule__Answer__Group__6__Impl : ( '}' ) ;
    public final void rule__Answer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1545:1: ( ( '}' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1546:1: ( '}' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1546:1: ( '}' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1547:1: '}'
            {
             before(grammarAccess.getAnswerAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Answer__Group__6__Impl3016); 
             after(grammarAccess.getAnswerAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Answer__Group__6__Impl"


    // $ANTLR start "rule__Answer__Group_2__0"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1574:1: rule__Answer__Group_2__0 : rule__Answer__Group_2__0__Impl rule__Answer__Group_2__1 ;
    public final void rule__Answer__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1578:1: ( rule__Answer__Group_2__0__Impl rule__Answer__Group_2__1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1579:2: rule__Answer__Group_2__0__Impl rule__Answer__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_2__0__Impl_in_rule__Answer__Group_2__03061);
            rule__Answer__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_2__1_in_rule__Answer__Group_2__03064);
            rule__Answer__Group_2__1();

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
    // $ANTLR end "rule__Answer__Group_2__0"


    // $ANTLR start "rule__Answer__Group_2__0__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1586:1: rule__Answer__Group_2__0__Impl : ( 'isFreeText' ) ;
    public final void rule__Answer__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1590:1: ( ( 'isFreeText' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1591:1: ( 'isFreeText' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1591:1: ( 'isFreeText' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1592:1: 'isFreeText'
            {
             before(grammarAccess.getAnswerAccess().getIsFreeTextKeyword_2_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Answer__Group_2__0__Impl3092); 
             after(grammarAccess.getAnswerAccess().getIsFreeTextKeyword_2_0()); 

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
    // $ANTLR end "rule__Answer__Group_2__0__Impl"


    // $ANTLR start "rule__Answer__Group_2__1"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1605:1: rule__Answer__Group_2__1 : rule__Answer__Group_2__1__Impl ;
    public final void rule__Answer__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1609:1: ( rule__Answer__Group_2__1__Impl )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1610:2: rule__Answer__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_2__1__Impl_in_rule__Answer__Group_2__13123);
            rule__Answer__Group_2__1__Impl();

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
    // $ANTLR end "rule__Answer__Group_2__1"


    // $ANTLR start "rule__Answer__Group_2__1__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1616:1: rule__Answer__Group_2__1__Impl : ( ( rule__Answer__IsFreeTextAssignment_2_1 ) ) ;
    public final void rule__Answer__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1620:1: ( ( ( rule__Answer__IsFreeTextAssignment_2_1 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1621:1: ( ( rule__Answer__IsFreeTextAssignment_2_1 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1621:1: ( ( rule__Answer__IsFreeTextAssignment_2_1 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1622:1: ( rule__Answer__IsFreeTextAssignment_2_1 )
            {
             before(grammarAccess.getAnswerAccess().getIsFreeTextAssignment_2_1()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1623:1: ( rule__Answer__IsFreeTextAssignment_2_1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1623:2: rule__Answer__IsFreeTextAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__IsFreeTextAssignment_2_1_in_rule__Answer__Group_2__1__Impl3150);
            rule__Answer__IsFreeTextAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAnswerAccess().getIsFreeTextAssignment_2_1()); 

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
    // $ANTLR end "rule__Answer__Group_2__1__Impl"


    // $ANTLR start "rule__Answer__Group_5__0"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1637:1: rule__Answer__Group_5__0 : rule__Answer__Group_5__0__Impl rule__Answer__Group_5__1 ;
    public final void rule__Answer__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1641:1: ( rule__Answer__Group_5__0__Impl rule__Answer__Group_5__1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1642:2: rule__Answer__Group_5__0__Impl rule__Answer__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_5__0__Impl_in_rule__Answer__Group_5__03184);
            rule__Answer__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_5__1_in_rule__Answer__Group_5__03187);
            rule__Answer__Group_5__1();

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
    // $ANTLR end "rule__Answer__Group_5__0"


    // $ANTLR start "rule__Answer__Group_5__0__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1649:1: rule__Answer__Group_5__0__Impl : ( 'followup' ) ;
    public final void rule__Answer__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1653:1: ( ( 'followup' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1654:1: ( 'followup' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1654:1: ( 'followup' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1655:1: 'followup'
            {
             before(grammarAccess.getAnswerAccess().getFollowupKeyword_5_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Answer__Group_5__0__Impl3215); 
             after(grammarAccess.getAnswerAccess().getFollowupKeyword_5_0()); 

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
    // $ANTLR end "rule__Answer__Group_5__0__Impl"


    // $ANTLR start "rule__Answer__Group_5__1"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1668:1: rule__Answer__Group_5__1 : rule__Answer__Group_5__1__Impl ;
    public final void rule__Answer__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1672:1: ( rule__Answer__Group_5__1__Impl )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1673:2: rule__Answer__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_5__1__Impl_in_rule__Answer__Group_5__13246);
            rule__Answer__Group_5__1__Impl();

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
    // $ANTLR end "rule__Answer__Group_5__1"


    // $ANTLR start "rule__Answer__Group_5__1__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1679:1: rule__Answer__Group_5__1__Impl : ( ( rule__Answer__FollowupAssignment_5_1 ) ) ;
    public final void rule__Answer__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1683:1: ( ( ( rule__Answer__FollowupAssignment_5_1 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1684:1: ( ( rule__Answer__FollowupAssignment_5_1 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1684:1: ( ( rule__Answer__FollowupAssignment_5_1 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1685:1: ( rule__Answer__FollowupAssignment_5_1 )
            {
             before(grammarAccess.getAnswerAccess().getFollowupAssignment_5_1()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1686:1: ( rule__Answer__FollowupAssignment_5_1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1686:2: rule__Answer__FollowupAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__FollowupAssignment_5_1_in_rule__Answer__Group_5__1__Impl3273);
            rule__Answer__FollowupAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getAnswerAccess().getFollowupAssignment_5_1()); 

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
    // $ANTLR end "rule__Answer__Group_5__1__Impl"


    // $ANTLR start "rule__Survey__IntroAssignment_3"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1701:1: rule__Survey__IntroAssignment_3 : ( ruleContent ) ;
    public final void rule__Survey__IntroAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1705:1: ( ( ruleContent ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1706:1: ( ruleContent )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1706:1: ( ruleContent )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1707:1: ruleContent
            {
             before(grammarAccess.getSurveyAccess().getIntroContentParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleContent_in_rule__Survey__IntroAssignment_33312);
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


    // $ANTLR start "rule__Survey__OutroAssignment_5"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1716:1: rule__Survey__OutroAssignment_5 : ( ruleContent ) ;
    public final void rule__Survey__OutroAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1720:1: ( ( ruleContent ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1721:1: ( ruleContent )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1721:1: ( ruleContent )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1722:1: ruleContent
            {
             before(grammarAccess.getSurveyAccess().getOutroContentParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleContent_in_rule__Survey__OutroAssignment_53343);
            ruleContent();

            state._fsp--;

             after(grammarAccess.getSurveyAccess().getOutroContentParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Survey__OutroAssignment_5"


    // $ANTLR start "rule__Survey__QuestionsAssignment_8"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1731:1: rule__Survey__QuestionsAssignment_8 : ( ruleQuestion ) ;
    public final void rule__Survey__QuestionsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1735:1: ( ( ruleQuestion ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1736:1: ( ruleQuestion )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1736:1: ( ruleQuestion )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1737:1: ruleQuestion
            {
             before(grammarAccess.getSurveyAccess().getQuestionsQuestionParserRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_rule__Survey__QuestionsAssignment_83374);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getSurveyAccess().getQuestionsQuestionParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__Survey__QuestionsAssignment_8"


    // $ANTLR start "rule__Survey__QuestionsAssignment_9_1"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1746:1: rule__Survey__QuestionsAssignment_9_1 : ( ruleQuestion ) ;
    public final void rule__Survey__QuestionsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1750:1: ( ( ruleQuestion ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1751:1: ( ruleQuestion )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1751:1: ( ruleQuestion )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1752:1: ruleQuestion
            {
             before(grammarAccess.getSurveyAccess().getQuestionsQuestionParserRuleCall_9_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_rule__Survey__QuestionsAssignment_9_13405);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getSurveyAccess().getQuestionsQuestionParserRuleCall_9_1_0()); 

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
    // $ANTLR end "rule__Survey__QuestionsAssignment_9_1"


    // $ANTLR start "rule__Question__IsExclusiveAssignment_0"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1761:1: rule__Question__IsExclusiveAssignment_0 : ( ( 'isExclusive' ) ) ;
    public final void rule__Question__IsExclusiveAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1765:1: ( ( ( 'isExclusive' ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1766:1: ( ( 'isExclusive' ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1766:1: ( ( 'isExclusive' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1767:1: ( 'isExclusive' )
            {
             before(grammarAccess.getQuestionAccess().getIsExclusiveIsExclusiveKeyword_0_0()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1768:1: ( 'isExclusive' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1769:1: 'isExclusive'
            {
             before(grammarAccess.getQuestionAccess().getIsExclusiveIsExclusiveKeyword_0_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Question__IsExclusiveAssignment_03441); 
             after(grammarAccess.getQuestionAccess().getIsExclusiveIsExclusiveKeyword_0_0()); 

            }

             after(grammarAccess.getQuestionAccess().getIsExclusiveIsExclusiveKeyword_0_0()); 

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
    // $ANTLR end "rule__Question__IsExclusiveAssignment_0"


    // $ANTLR start "rule__Question__IsOptionalAssignment_1"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1784:1: rule__Question__IsOptionalAssignment_1 : ( ( 'isOptional' ) ) ;
    public final void rule__Question__IsOptionalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1788:1: ( ( ( 'isOptional' ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1789:1: ( ( 'isOptional' ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1789:1: ( ( 'isOptional' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1790:1: ( 'isOptional' )
            {
             before(grammarAccess.getQuestionAccess().getIsOptionalIsOptionalKeyword_1_0()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1791:1: ( 'isOptional' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1792:1: 'isOptional'
            {
             before(grammarAccess.getQuestionAccess().getIsOptionalIsOptionalKeyword_1_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Question__IsOptionalAssignment_13485); 
             after(grammarAccess.getQuestionAccess().getIsOptionalIsOptionalKeyword_1_0()); 

            }

             after(grammarAccess.getQuestionAccess().getIsOptionalIsOptionalKeyword_1_0()); 

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
    // $ANTLR end "rule__Question__IsOptionalAssignment_1"


    // $ANTLR start "rule__Question__AnswersAssignment_6"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1807:1: rule__Question__AnswersAssignment_6 : ( ruleAnswer ) ;
    public final void rule__Question__AnswersAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1811:1: ( ( ruleAnswer ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1812:1: ( ruleAnswer )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1812:1: ( ruleAnswer )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1813:1: ruleAnswer
            {
             before(grammarAccess.getQuestionAccess().getAnswersAnswerParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__Question__AnswersAssignment_63524);
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


    // $ANTLR start "rule__Question__AnswersAssignment_7_1"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1822:1: rule__Question__AnswersAssignment_7_1 : ( ruleAnswer ) ;
    public final void rule__Question__AnswersAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1826:1: ( ( ruleAnswer ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1827:1: ( ruleAnswer )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1827:1: ( ruleAnswer )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1828:1: ruleAnswer
            {
             before(grammarAccess.getQuestionAccess().getAnswersAnswerParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__Question__AnswersAssignment_7_13555);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getAnswersAnswerParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__Question__AnswersAssignment_7_1"


    // $ANTLR start "rule__Question__ContentAssignment_10"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1837:1: rule__Question__ContentAssignment_10 : ( ruleContent ) ;
    public final void rule__Question__ContentAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1841:1: ( ( ruleContent ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1842:1: ( ruleContent )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1842:1: ( ruleContent )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1843:1: ruleContent
            {
             before(grammarAccess.getQuestionAccess().getContentContentParserRuleCall_10_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleContent_in_rule__Question__ContentAssignment_103586);
            ruleContent();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getContentContentParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__Question__ContentAssignment_10"


    // $ANTLR start "rule__Content__BodyAssignment_3_1"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1852:1: rule__Content__BodyAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Content__BodyAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1856:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1857:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1857:1: ( ruleEString )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1858:1: ruleEString
            {
             before(grammarAccess.getContentAccess().getBodyEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Content__BodyAssignment_3_13617);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getContentAccess().getBodyEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Content__BodyAssignment_3_1"


    // $ANTLR start "rule__Answer__IsFreeTextAssignment_2_1"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1867:1: rule__Answer__IsFreeTextAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Answer__IsFreeTextAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1871:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1872:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1872:1: ( ruleEString )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1873:1: ruleEString
            {
             before(grammarAccess.getAnswerAccess().getIsFreeTextEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Answer__IsFreeTextAssignment_2_13648);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAnswerAccess().getIsFreeTextEStringParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Answer__IsFreeTextAssignment_2_1"


    // $ANTLR start "rule__Answer__ContentAssignment_4"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1882:1: rule__Answer__ContentAssignment_4 : ( ruleContent ) ;
    public final void rule__Answer__ContentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1886:1: ( ( ruleContent ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1887:1: ( ruleContent )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1887:1: ( ruleContent )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1888:1: ruleContent
            {
             before(grammarAccess.getAnswerAccess().getContentContentParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleContent_in_rule__Answer__ContentAssignment_43679);
            ruleContent();

            state._fsp--;

             after(grammarAccess.getAnswerAccess().getContentContentParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Answer__ContentAssignment_4"


    // $ANTLR start "rule__Answer__FollowupAssignment_5_1"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1897:1: rule__Answer__FollowupAssignment_5_1 : ( ruleQuestion ) ;
    public final void rule__Answer__FollowupAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1901:1: ( ( ruleQuestion ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1902:1: ( ruleQuestion )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1902:1: ( ruleQuestion )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/ui/contentassist/antlr/internal/InternalSurvey.g:1903:1: ruleQuestion
            {
             before(grammarAccess.getAnswerAccess().getFollowupQuestionParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_rule__Answer__FollowupAssignment_5_13710);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getAnswerAccess().getFollowupQuestionParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Answer__FollowupAssignment_5_1"

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
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__0__Impl_in_rule__Survey__Group__0420 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Survey__Group__1_in_rule__Survey__Group__0423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Survey__Group__0__Impl451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__1__Impl_in_rule__Survey__Group__1482 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Survey__Group__2_in_rule__Survey__Group__1485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Survey__Group__1__Impl513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__2__Impl_in_rule__Survey__Group__2544 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Survey__Group__3_in_rule__Survey__Group__2547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Survey__Group__2__Impl575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__3__Impl_in_rule__Survey__Group__3606 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Survey__Group__4_in_rule__Survey__Group__3609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__IntroAssignment_3_in_rule__Survey__Group__3__Impl636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__4__Impl_in_rule__Survey__Group__4666 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Survey__Group__5_in_rule__Survey__Group__4669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Survey__Group__4__Impl697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__5__Impl_in_rule__Survey__Group__5728 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Survey__Group__6_in_rule__Survey__Group__5731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__OutroAssignment_5_in_rule__Survey__Group__5__Impl758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__6__Impl_in_rule__Survey__Group__6788 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Survey__Group__7_in_rule__Survey__Group__6791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Survey__Group__6__Impl819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__7__Impl_in_rule__Survey__Group__7850 = new BitSet(new long[]{0x000000000C040000L});
        public static final BitSet FOLLOW_rule__Survey__Group__8_in_rule__Survey__Group__7853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Survey__Group__7__Impl881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__8__Impl_in_rule__Survey__Group__8912 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_rule__Survey__Group__9_in_rule__Survey__Group__8915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__QuestionsAssignment_8_in_rule__Survey__Group__8__Impl942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__9__Impl_in_rule__Survey__Group__9972 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_rule__Survey__Group__10_in_rule__Survey__Group__9975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group_9__0_in_rule__Survey__Group__9__Impl1002 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__Survey__Group__10__Impl_in_rule__Survey__Group__101033 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Survey__Group__11_in_rule__Survey__Group__101036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Survey__Group__10__Impl1064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__11__Impl_in_rule__Survey__Group__111095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Survey__Group__11__Impl1123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group_9__0__Impl_in_rule__Survey__Group_9__01178 = new BitSet(new long[]{0x000000000C040000L});
        public static final BitSet FOLLOW_rule__Survey__Group_9__1_in_rule__Survey__Group_9__01181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Survey__Group_9__0__Impl1209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group_9__1__Impl_in_rule__Survey__Group_9__11240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__QuestionsAssignment_9_1_in_rule__Survey__Group_9__1__Impl1267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__Group__0__Impl_in_rule__Question__Group__01301 = new BitSet(new long[]{0x000000000C040000L});
        public static final BitSet FOLLOW_rule__Question__Group__1_in_rule__Question__Group__01304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__IsExclusiveAssignment_0_in_rule__Question__Group__0__Impl1331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__Group__1__Impl_in_rule__Question__Group__11362 = new BitSet(new long[]{0x000000000C040000L});
        public static final BitSet FOLLOW_rule__Question__Group__2_in_rule__Question__Group__11365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__IsOptionalAssignment_1_in_rule__Question__Group__1__Impl1392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__Group__2__Impl_in_rule__Question__Group__21423 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Question__Group__3_in_rule__Question__Group__21426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Question__Group__2__Impl1454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__Group__3__Impl_in_rule__Question__Group__31485 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Question__Group__4_in_rule__Question__Group__31488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Question__Group__3__Impl1516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__Group__4__Impl_in_rule__Question__Group__41547 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Question__Group__5_in_rule__Question__Group__41550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Question__Group__4__Impl1578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__Group__5__Impl_in_rule__Question__Group__51609 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Question__Group__6_in_rule__Question__Group__51612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Question__Group__5__Impl1640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__Group__6__Impl_in_rule__Question__Group__61671 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_rule__Question__Group__7_in_rule__Question__Group__61674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__AnswersAssignment_6_in_rule__Question__Group__6__Impl1701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__Group__7__Impl_in_rule__Question__Group__71731 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_rule__Question__Group__8_in_rule__Question__Group__71734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__Group_7__0_in_rule__Question__Group__7__Impl1761 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__Question__Group__8__Impl_in_rule__Question__Group__81792 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Question__Group__9_in_rule__Question__Group__81795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Question__Group__8__Impl1823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__Group__9__Impl_in_rule__Question__Group__91854 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Question__Group__10_in_rule__Question__Group__91857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Question__Group__9__Impl1885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__Group__10__Impl_in_rule__Question__Group__101916 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Question__Group__11_in_rule__Question__Group__101919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__ContentAssignment_10_in_rule__Question__Group__10__Impl1946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__Group__11__Impl_in_rule__Question__Group__111976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Question__Group__11__Impl2004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__Group_7__0__Impl_in_rule__Question__Group_7__02059 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Question__Group_7__1_in_rule__Question__Group_7__02062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Question__Group_7__0__Impl2090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__Group_7__1__Impl_in_rule__Question__Group_7__12121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__AnswersAssignment_7_1_in_rule__Question__Group_7__1__Impl2148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Content__Group__0__Impl_in_rule__Content__Group__02182 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Content__Group__1_in_rule__Content__Group__02185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Content__Group__1__Impl_in_rule__Content__Group__12243 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Content__Group__2_in_rule__Content__Group__12246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Content__Group__1__Impl2274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Content__Group__2__Impl_in_rule__Content__Group__22305 = new BitSet(new long[]{0x0000000000410000L});
        public static final BitSet FOLLOW_rule__Content__Group__3_in_rule__Content__Group__22308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Content__Group__2__Impl2336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Content__Group__3__Impl_in_rule__Content__Group__32367 = new BitSet(new long[]{0x0000000000410000L});
        public static final BitSet FOLLOW_rule__Content__Group__4_in_rule__Content__Group__32370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Content__Group_3__0_in_rule__Content__Group__3__Impl2397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Content__Group__4__Impl_in_rule__Content__Group__42428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Content__Group__4__Impl2456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Content__Group_3__0__Impl_in_rule__Content__Group_3__02497 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Content__Group_3__1_in_rule__Content__Group_3__02500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Content__Group_3__0__Impl2528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Content__Group_3__1__Impl_in_rule__Content__Group_3__12559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Content__BodyAssignment_3_1_in_rule__Content__Group_3__1__Impl2586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group__0__Impl_in_rule__Answer__Group__02620 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Answer__Group__1_in_rule__Answer__Group__02623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Answer__Group__0__Impl2651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group__1__Impl_in_rule__Answer__Group__12682 = new BitSet(new long[]{0x0000000001100000L});
        public static final BitSet FOLLOW_rule__Answer__Group__2_in_rule__Answer__Group__12685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Answer__Group__1__Impl2713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group__2__Impl_in_rule__Answer__Group__22744 = new BitSet(new long[]{0x0000000001100000L});
        public static final BitSet FOLLOW_rule__Answer__Group__3_in_rule__Answer__Group__22747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group_2__0_in_rule__Answer__Group__2__Impl2774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group__3__Impl_in_rule__Answer__Group__32805 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Answer__Group__4_in_rule__Answer__Group__32808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Answer__Group__3__Impl2836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group__4__Impl_in_rule__Answer__Group__42867 = new BitSet(new long[]{0x0000000002010000L});
        public static final BitSet FOLLOW_rule__Answer__Group__5_in_rule__Answer__Group__42870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__ContentAssignment_4_in_rule__Answer__Group__4__Impl2897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group__5__Impl_in_rule__Answer__Group__52927 = new BitSet(new long[]{0x0000000002010000L});
        public static final BitSet FOLLOW_rule__Answer__Group__6_in_rule__Answer__Group__52930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group_5__0_in_rule__Answer__Group__5__Impl2957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group__6__Impl_in_rule__Answer__Group__62988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Answer__Group__6__Impl3016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group_2__0__Impl_in_rule__Answer__Group_2__03061 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Answer__Group_2__1_in_rule__Answer__Group_2__03064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Answer__Group_2__0__Impl3092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group_2__1__Impl_in_rule__Answer__Group_2__13123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__IsFreeTextAssignment_2_1_in_rule__Answer__Group_2__1__Impl3150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group_5__0__Impl_in_rule__Answer__Group_5__03184 = new BitSet(new long[]{0x000000000C040000L});
        public static final BitSet FOLLOW_rule__Answer__Group_5__1_in_rule__Answer__Group_5__03187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Answer__Group_5__0__Impl3215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group_5__1__Impl_in_rule__Answer__Group_5__13246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__FollowupAssignment_5_1_in_rule__Answer__Group_5__1__Impl3273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContent_in_rule__Survey__IntroAssignment_33312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContent_in_rule__Survey__OutroAssignment_53343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_rule__Survey__QuestionsAssignment_83374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_rule__Survey__QuestionsAssignment_9_13405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Question__IsExclusiveAssignment_03441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Question__IsOptionalAssignment_13485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__Question__AnswersAssignment_63524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__Question__AnswersAssignment_7_13555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContent_in_rule__Question__ContentAssignment_103586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Content__BodyAssignment_3_13617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Answer__IsFreeTextAssignment_2_13648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContent_in_rule__Answer__ContentAssignment_43679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_rule__Answer__FollowupAssignment_5_13710 = new BitSet(new long[]{0x0000000000000002L});
    }


}