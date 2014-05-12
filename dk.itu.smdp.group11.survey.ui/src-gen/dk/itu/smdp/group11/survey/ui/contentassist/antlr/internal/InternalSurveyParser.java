package dk.itu.smdp.group11.survey.ui.contentassist.antlr.internal; 

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
import dk.itu.smdp.group11.survey.services.SurveyGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSurveyParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Survey'", "'Intro'", "'Outro'", "'Question'", "'('", "')'", "'Answer'", "'->'", "','", "'TableQuestion'", "'Items'", "'exclusive'", "'optional'", "'freetext'"
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
    public String getGrammarFileName() { return "../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g"; }


     
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:60:1: entryRuleSurvey : ruleSurvey EOF ;
    public final void entryRuleSurvey() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:61:1: ( ruleSurvey EOF )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:62:1: ruleSurvey EOF
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:69:1: ruleSurvey : ( ( rule__Survey__Group__0 ) ) ;
    public final void ruleSurvey() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:73:2: ( ( ( rule__Survey__Group__0 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:74:1: ( ( rule__Survey__Group__0 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:74:1: ( ( rule__Survey__Group__0 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:75:1: ( rule__Survey__Group__0 )
            {
             before(grammarAccess.getSurveyAccess().getGroup()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:76:1: ( rule__Survey__Group__0 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:76:2: rule__Survey__Group__0
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:88:1: entryRuleQuestion : ruleQuestion EOF ;
    public final void entryRuleQuestion() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:89:1: ( ruleQuestion EOF )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:90:1: ruleQuestion EOF
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:97:1: ruleQuestion : ( ( rule__Question__Alternatives ) ) ;
    public final void ruleQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:101:2: ( ( ( rule__Question__Alternatives ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:102:1: ( ( rule__Question__Alternatives ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:102:1: ( ( rule__Question__Alternatives ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:103:1: ( rule__Question__Alternatives )
            {
             before(grammarAccess.getQuestionAccess().getAlternatives()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:104:1: ( rule__Question__Alternatives )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:104:2: rule__Question__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Alternatives_in_ruleQuestion154);
            rule__Question__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleEString"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:116:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:117:1: ( ruleEString EOF )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:118:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString181);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString188); 

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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:125:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:129:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:130:1: ( ( rule__EString__Alternatives ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:130:1: ( ( rule__EString__Alternatives ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:131:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:132:1: ( rule__EString__Alternatives )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:132:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString214);
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


    // $ANTLR start "entryRuleQuestion_Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:144:1: entryRuleQuestion_Impl : ruleQuestion_Impl EOF ;
    public final void entryRuleQuestion_Impl() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:145:1: ( ruleQuestion_Impl EOF )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:146:1: ruleQuestion_Impl EOF
            {
             before(grammarAccess.getQuestion_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_Impl_in_entryRuleQuestion_Impl241);
            ruleQuestion_Impl();

            state._fsp--;

             after(grammarAccess.getQuestion_ImplRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuestion_Impl248); 

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
    // $ANTLR end "entryRuleQuestion_Impl"


    // $ANTLR start "ruleQuestion_Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:153:1: ruleQuestion_Impl : ( ( rule__Question_Impl__Group__0 ) ) ;
    public final void ruleQuestion_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:157:2: ( ( ( rule__Question_Impl__Group__0 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:158:1: ( ( rule__Question_Impl__Group__0 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:158:1: ( ( rule__Question_Impl__Group__0 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:159:1: ( rule__Question_Impl__Group__0 )
            {
             before(grammarAccess.getQuestion_ImplAccess().getGroup()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:160:1: ( rule__Question_Impl__Group__0 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:160:2: rule__Question_Impl__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__Group__0_in_ruleQuestion_Impl274);
            rule__Question_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestion_ImplAccess().getGroup()); 

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
    // $ANTLR end "ruleQuestion_Impl"


    // $ANTLR start "entryRuleAnswer"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:172:1: entryRuleAnswer : ruleAnswer EOF ;
    public final void entryRuleAnswer() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:173:1: ( ruleAnswer EOF )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:174:1: ruleAnswer EOF
            {
             before(grammarAccess.getAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_entryRuleAnswer301);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getAnswerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswer308); 

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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:181:1: ruleAnswer : ( ( rule__Answer__Group__0 ) ) ;
    public final void ruleAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:185:2: ( ( ( rule__Answer__Group__0 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:186:1: ( ( rule__Answer__Group__0 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:186:1: ( ( rule__Answer__Group__0 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:187:1: ( rule__Answer__Group__0 )
            {
             before(grammarAccess.getAnswerAccess().getGroup()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:188:1: ( rule__Answer__Group__0 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:188:2: rule__Answer__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__0_in_ruleAnswer334);
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


    // $ANTLR start "entryRuleTableQuestion"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:200:1: entryRuleTableQuestion : ruleTableQuestion EOF ;
    public final void entryRuleTableQuestion() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:201:1: ( ruleTableQuestion EOF )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:202:1: ruleTableQuestion EOF
            {
             before(grammarAccess.getTableQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTableQuestion_in_entryRuleTableQuestion361);
            ruleTableQuestion();

            state._fsp--;

             after(grammarAccess.getTableQuestionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTableQuestion368); 

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
    // $ANTLR end "entryRuleTableQuestion"


    // $ANTLR start "ruleTableQuestion"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:209:1: ruleTableQuestion : ( ( rule__TableQuestion__Group__0 ) ) ;
    public final void ruleTableQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:213:2: ( ( ( rule__TableQuestion__Group__0 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:214:1: ( ( rule__TableQuestion__Group__0 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:214:1: ( ( rule__TableQuestion__Group__0 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:215:1: ( rule__TableQuestion__Group__0 )
            {
             before(grammarAccess.getTableQuestionAccess().getGroup()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:216:1: ( rule__TableQuestion__Group__0 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:216:2: rule__TableQuestion__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__0_in_ruleTableQuestion394);
            rule__TableQuestion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTableQuestionAccess().getGroup()); 

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
    // $ANTLR end "ruleTableQuestion"


    // $ANTLR start "entryRuleItem"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:228:1: entryRuleItem : ruleItem EOF ;
    public final void entryRuleItem() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:229:1: ( ruleItem EOF )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:230:1: ruleItem EOF
            {
             before(grammarAccess.getItemRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleItem_in_entryRuleItem421);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getItemRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleItem428); 

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
    // $ANTLR end "entryRuleItem"


    // $ANTLR start "ruleItem"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:237:1: ruleItem : ( ( rule__Item__Group__0 ) ) ;
    public final void ruleItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:241:2: ( ( ( rule__Item__Group__0 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:242:1: ( ( rule__Item__Group__0 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:242:1: ( ( rule__Item__Group__0 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:243:1: ( rule__Item__Group__0 )
            {
             before(grammarAccess.getItemAccess().getGroup()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:244:1: ( rule__Item__Group__0 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:244:2: rule__Item__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Item__Group__0_in_ruleItem454);
            rule__Item__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getGroup()); 

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
    // $ANTLR end "ruleItem"


    // $ANTLR start "rule__Question__Alternatives"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:256:1: rule__Question__Alternatives : ( ( ruleQuestion_Impl ) | ( ruleTableQuestion ) );
    public final void rule__Question__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:260:1: ( ( ruleQuestion_Impl ) | ( ruleTableQuestion ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            else if ( (LA1_0==20) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:261:1: ( ruleQuestion_Impl )
                    {
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:261:1: ( ruleQuestion_Impl )
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:262:1: ruleQuestion_Impl
                    {
                     before(grammarAccess.getQuestionAccess().getQuestion_ImplParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleQuestion_Impl_in_rule__Question__Alternatives490);
                    ruleQuestion_Impl();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getQuestion_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:267:6: ( ruleTableQuestion )
                    {
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:267:6: ( ruleTableQuestion )
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:268:1: ruleTableQuestion
                    {
                     before(grammarAccess.getQuestionAccess().getTableQuestionParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleTableQuestion_in_rule__Question__Alternatives507);
                    ruleTableQuestion();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getTableQuestionParserRuleCall_1()); 

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
    // $ANTLR end "rule__Question__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:278:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:282:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:283:1: ( RULE_STRING )
                    {
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:283:1: ( RULE_STRING )
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:284:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives539); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:289:6: ( RULE_ID )
                    {
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:289:6: ( RULE_ID )
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:290:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives556); 
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:302:1: rule__Survey__Group__0 : rule__Survey__Group__0__Impl rule__Survey__Group__1 ;
    public final void rule__Survey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:306:1: ( rule__Survey__Group__0__Impl rule__Survey__Group__1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:307:2: rule__Survey__Group__0__Impl rule__Survey__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__0__Impl_in_rule__Survey__Group__0586);
            rule__Survey__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__1_in_rule__Survey__Group__0589);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:314:1: rule__Survey__Group__0__Impl : ( 'Survey' ) ;
    public final void rule__Survey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:318:1: ( ( 'Survey' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:319:1: ( 'Survey' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:319:1: ( 'Survey' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:320:1: 'Survey'
            {
             before(grammarAccess.getSurveyAccess().getSurveyKeyword_0()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Survey__Group__0__Impl617); 
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:333:1: rule__Survey__Group__1 : rule__Survey__Group__1__Impl rule__Survey__Group__2 ;
    public final void rule__Survey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:337:1: ( rule__Survey__Group__1__Impl rule__Survey__Group__2 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:338:2: rule__Survey__Group__1__Impl rule__Survey__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__1__Impl_in_rule__Survey__Group__1648);
            rule__Survey__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__2_in_rule__Survey__Group__1651);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:345:1: rule__Survey__Group__1__Impl : ( ( rule__Survey__NameAssignment_1 ) ) ;
    public final void rule__Survey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:349:1: ( ( ( rule__Survey__NameAssignment_1 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:350:1: ( ( rule__Survey__NameAssignment_1 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:350:1: ( ( rule__Survey__NameAssignment_1 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:351:1: ( rule__Survey__NameAssignment_1 )
            {
             before(grammarAccess.getSurveyAccess().getNameAssignment_1()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:352:1: ( rule__Survey__NameAssignment_1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:352:2: rule__Survey__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__NameAssignment_1_in_rule__Survey__Group__1__Impl678);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:362:1: rule__Survey__Group__2 : rule__Survey__Group__2__Impl rule__Survey__Group__3 ;
    public final void rule__Survey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:366:1: ( rule__Survey__Group__2__Impl rule__Survey__Group__3 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:367:2: rule__Survey__Group__2__Impl rule__Survey__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__2__Impl_in_rule__Survey__Group__2708);
            rule__Survey__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__3_in_rule__Survey__Group__2711);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:374:1: rule__Survey__Group__2__Impl : ( ( rule__Survey__Group_2__0 )? ) ;
    public final void rule__Survey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:378:1: ( ( ( rule__Survey__Group_2__0 )? ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:379:1: ( ( rule__Survey__Group_2__0 )? )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:379:1: ( ( rule__Survey__Group_2__0 )? )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:380:1: ( rule__Survey__Group_2__0 )?
            {
             before(grammarAccess.getSurveyAccess().getGroup_2()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:381:1: ( rule__Survey__Group_2__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:381:2: rule__Survey__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Survey__Group_2__0_in_rule__Survey__Group__2__Impl738);
                    rule__Survey__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSurveyAccess().getGroup_2()); 

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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:391:1: rule__Survey__Group__3 : rule__Survey__Group__3__Impl rule__Survey__Group__4 ;
    public final void rule__Survey__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:395:1: ( rule__Survey__Group__3__Impl rule__Survey__Group__4 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:396:2: rule__Survey__Group__3__Impl rule__Survey__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__3__Impl_in_rule__Survey__Group__3769);
            rule__Survey__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__4_in_rule__Survey__Group__3772);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:403:1: rule__Survey__Group__3__Impl : ( ( rule__Survey__QuestionsAssignment_3 ) ) ;
    public final void rule__Survey__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:407:1: ( ( ( rule__Survey__QuestionsAssignment_3 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:408:1: ( ( rule__Survey__QuestionsAssignment_3 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:408:1: ( ( rule__Survey__QuestionsAssignment_3 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:409:1: ( rule__Survey__QuestionsAssignment_3 )
            {
             before(grammarAccess.getSurveyAccess().getQuestionsAssignment_3()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:410:1: ( rule__Survey__QuestionsAssignment_3 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:410:2: rule__Survey__QuestionsAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__QuestionsAssignment_3_in_rule__Survey__Group__3__Impl799);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:420:1: rule__Survey__Group__4 : rule__Survey__Group__4__Impl rule__Survey__Group__5 ;
    public final void rule__Survey__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:424:1: ( rule__Survey__Group__4__Impl rule__Survey__Group__5 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:425:2: rule__Survey__Group__4__Impl rule__Survey__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__4__Impl_in_rule__Survey__Group__4829);
            rule__Survey__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__5_in_rule__Survey__Group__4832);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:432:1: rule__Survey__Group__4__Impl : ( ( rule__Survey__QuestionsAssignment_4 )* ) ;
    public final void rule__Survey__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:436:1: ( ( ( rule__Survey__QuestionsAssignment_4 )* ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:437:1: ( ( rule__Survey__QuestionsAssignment_4 )* )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:437:1: ( ( rule__Survey__QuestionsAssignment_4 )* )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:438:1: ( rule__Survey__QuestionsAssignment_4 )*
            {
             before(grammarAccess.getSurveyAccess().getQuestionsAssignment_4()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:439:1: ( rule__Survey__QuestionsAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14||LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:439:2: rule__Survey__QuestionsAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Survey__QuestionsAssignment_4_in_rule__Survey__Group__4__Impl859);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:449:1: rule__Survey__Group__5 : rule__Survey__Group__5__Impl ;
    public final void rule__Survey__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:453:1: ( rule__Survey__Group__5__Impl )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:454:2: rule__Survey__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__5__Impl_in_rule__Survey__Group__5890);
            rule__Survey__Group__5__Impl();

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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:460:1: rule__Survey__Group__5__Impl : ( ( rule__Survey__Group_5__0 )? ) ;
    public final void rule__Survey__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:464:1: ( ( ( rule__Survey__Group_5__0 )? ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:465:1: ( ( rule__Survey__Group_5__0 )? )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:465:1: ( ( rule__Survey__Group_5__0 )? )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:466:1: ( rule__Survey__Group_5__0 )?
            {
             before(grammarAccess.getSurveyAccess().getGroup_5()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:467:1: ( rule__Survey__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:467:2: rule__Survey__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Survey__Group_5__0_in_rule__Survey__Group__5__Impl917);
                    rule__Survey__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSurveyAccess().getGroup_5()); 

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


    // $ANTLR start "rule__Survey__Group_2__0"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:489:1: rule__Survey__Group_2__0 : rule__Survey__Group_2__0__Impl rule__Survey__Group_2__1 ;
    public final void rule__Survey__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:493:1: ( rule__Survey__Group_2__0__Impl rule__Survey__Group_2__1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:494:2: rule__Survey__Group_2__0__Impl rule__Survey__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group_2__0__Impl_in_rule__Survey__Group_2__0960);
            rule__Survey__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group_2__1_in_rule__Survey__Group_2__0963);
            rule__Survey__Group_2__1();

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
    // $ANTLR end "rule__Survey__Group_2__0"


    // $ANTLR start "rule__Survey__Group_2__0__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:501:1: rule__Survey__Group_2__0__Impl : ( 'Intro' ) ;
    public final void rule__Survey__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:505:1: ( ( 'Intro' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:506:1: ( 'Intro' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:506:1: ( 'Intro' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:507:1: 'Intro'
            {
             before(grammarAccess.getSurveyAccess().getIntroKeyword_2_0()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Survey__Group_2__0__Impl991); 
             after(grammarAccess.getSurveyAccess().getIntroKeyword_2_0()); 

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
    // $ANTLR end "rule__Survey__Group_2__0__Impl"


    // $ANTLR start "rule__Survey__Group_2__1"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:520:1: rule__Survey__Group_2__1 : rule__Survey__Group_2__1__Impl ;
    public final void rule__Survey__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:524:1: ( rule__Survey__Group_2__1__Impl )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:525:2: rule__Survey__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group_2__1__Impl_in_rule__Survey__Group_2__11022);
            rule__Survey__Group_2__1__Impl();

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
    // $ANTLR end "rule__Survey__Group_2__1"


    // $ANTLR start "rule__Survey__Group_2__1__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:531:1: rule__Survey__Group_2__1__Impl : ( ( rule__Survey__IntroAssignment_2_1 ) ) ;
    public final void rule__Survey__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:535:1: ( ( ( rule__Survey__IntroAssignment_2_1 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:536:1: ( ( rule__Survey__IntroAssignment_2_1 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:536:1: ( ( rule__Survey__IntroAssignment_2_1 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:537:1: ( rule__Survey__IntroAssignment_2_1 )
            {
             before(grammarAccess.getSurveyAccess().getIntroAssignment_2_1()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:538:1: ( rule__Survey__IntroAssignment_2_1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:538:2: rule__Survey__IntroAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__IntroAssignment_2_1_in_rule__Survey__Group_2__1__Impl1049);
            rule__Survey__IntroAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSurveyAccess().getIntroAssignment_2_1()); 

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
    // $ANTLR end "rule__Survey__Group_2__1__Impl"


    // $ANTLR start "rule__Survey__Group_5__0"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:552:1: rule__Survey__Group_5__0 : rule__Survey__Group_5__0__Impl rule__Survey__Group_5__1 ;
    public final void rule__Survey__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:556:1: ( rule__Survey__Group_5__0__Impl rule__Survey__Group_5__1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:557:2: rule__Survey__Group_5__0__Impl rule__Survey__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group_5__0__Impl_in_rule__Survey__Group_5__01083);
            rule__Survey__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group_5__1_in_rule__Survey__Group_5__01086);
            rule__Survey__Group_5__1();

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
    // $ANTLR end "rule__Survey__Group_5__0"


    // $ANTLR start "rule__Survey__Group_5__0__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:564:1: rule__Survey__Group_5__0__Impl : ( 'Outro' ) ;
    public final void rule__Survey__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:568:1: ( ( 'Outro' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:569:1: ( 'Outro' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:569:1: ( 'Outro' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:570:1: 'Outro'
            {
             before(grammarAccess.getSurveyAccess().getOutroKeyword_5_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Survey__Group_5__0__Impl1114); 
             after(grammarAccess.getSurveyAccess().getOutroKeyword_5_0()); 

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
    // $ANTLR end "rule__Survey__Group_5__0__Impl"


    // $ANTLR start "rule__Survey__Group_5__1"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:583:1: rule__Survey__Group_5__1 : rule__Survey__Group_5__1__Impl ;
    public final void rule__Survey__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:587:1: ( rule__Survey__Group_5__1__Impl )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:588:2: rule__Survey__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group_5__1__Impl_in_rule__Survey__Group_5__11145);
            rule__Survey__Group_5__1__Impl();

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
    // $ANTLR end "rule__Survey__Group_5__1"


    // $ANTLR start "rule__Survey__Group_5__1__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:594:1: rule__Survey__Group_5__1__Impl : ( ( rule__Survey__OutroAssignment_5_1 ) ) ;
    public final void rule__Survey__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:598:1: ( ( ( rule__Survey__OutroAssignment_5_1 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:599:1: ( ( rule__Survey__OutroAssignment_5_1 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:599:1: ( ( rule__Survey__OutroAssignment_5_1 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:600:1: ( rule__Survey__OutroAssignment_5_1 )
            {
             before(grammarAccess.getSurveyAccess().getOutroAssignment_5_1()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:601:1: ( rule__Survey__OutroAssignment_5_1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:601:2: rule__Survey__OutroAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__OutroAssignment_5_1_in_rule__Survey__Group_5__1__Impl1172);
            rule__Survey__OutroAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSurveyAccess().getOutroAssignment_5_1()); 

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
    // $ANTLR end "rule__Survey__Group_5__1__Impl"


    // $ANTLR start "rule__Question_Impl__Group__0"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:615:1: rule__Question_Impl__Group__0 : rule__Question_Impl__Group__0__Impl rule__Question_Impl__Group__1 ;
    public final void rule__Question_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:619:1: ( rule__Question_Impl__Group__0__Impl rule__Question_Impl__Group__1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:620:2: rule__Question_Impl__Group__0__Impl rule__Question_Impl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__Group__0__Impl_in_rule__Question_Impl__Group__01206);
            rule__Question_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__Group__1_in_rule__Question_Impl__Group__01209);
            rule__Question_Impl__Group__1();

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
    // $ANTLR end "rule__Question_Impl__Group__0"


    // $ANTLR start "rule__Question_Impl__Group__0__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:627:1: rule__Question_Impl__Group__0__Impl : ( 'Question' ) ;
    public final void rule__Question_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:631:1: ( ( 'Question' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:632:1: ( 'Question' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:632:1: ( 'Question' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:633:1: 'Question'
            {
             before(grammarAccess.getQuestion_ImplAccess().getQuestionKeyword_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Question_Impl__Group__0__Impl1237); 
             after(grammarAccess.getQuestion_ImplAccess().getQuestionKeyword_0()); 

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
    // $ANTLR end "rule__Question_Impl__Group__0__Impl"


    // $ANTLR start "rule__Question_Impl__Group__1"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:646:1: rule__Question_Impl__Group__1 : rule__Question_Impl__Group__1__Impl rule__Question_Impl__Group__2 ;
    public final void rule__Question_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:650:1: ( rule__Question_Impl__Group__1__Impl rule__Question_Impl__Group__2 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:651:2: rule__Question_Impl__Group__1__Impl rule__Question_Impl__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__Group__1__Impl_in_rule__Question_Impl__Group__11268);
            rule__Question_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__Group__2_in_rule__Question_Impl__Group__11271);
            rule__Question_Impl__Group__2();

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
    // $ANTLR end "rule__Question_Impl__Group__1"


    // $ANTLR start "rule__Question_Impl__Group__1__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:658:1: rule__Question_Impl__Group__1__Impl : ( ( rule__Question_Impl__NameAssignment_1 ) ) ;
    public final void rule__Question_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:662:1: ( ( ( rule__Question_Impl__NameAssignment_1 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:663:1: ( ( rule__Question_Impl__NameAssignment_1 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:663:1: ( ( rule__Question_Impl__NameAssignment_1 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:664:1: ( rule__Question_Impl__NameAssignment_1 )
            {
             before(grammarAccess.getQuestion_ImplAccess().getNameAssignment_1()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:665:1: ( rule__Question_Impl__NameAssignment_1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:665:2: rule__Question_Impl__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__NameAssignment_1_in_rule__Question_Impl__Group__1__Impl1298);
            rule__Question_Impl__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestion_ImplAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Question_Impl__Group__1__Impl"


    // $ANTLR start "rule__Question_Impl__Group__2"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:675:1: rule__Question_Impl__Group__2 : rule__Question_Impl__Group__2__Impl rule__Question_Impl__Group__3 ;
    public final void rule__Question_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:679:1: ( rule__Question_Impl__Group__2__Impl rule__Question_Impl__Group__3 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:680:2: rule__Question_Impl__Group__2__Impl rule__Question_Impl__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__Group__2__Impl_in_rule__Question_Impl__Group__21328);
            rule__Question_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__Group__3_in_rule__Question_Impl__Group__21331);
            rule__Question_Impl__Group__3();

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
    // $ANTLR end "rule__Question_Impl__Group__2"


    // $ANTLR start "rule__Question_Impl__Group__2__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:687:1: rule__Question_Impl__Group__2__Impl : ( ( rule__Question_Impl__UnorderedGroup_2 ) ) ;
    public final void rule__Question_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:691:1: ( ( ( rule__Question_Impl__UnorderedGroup_2 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:692:1: ( ( rule__Question_Impl__UnorderedGroup_2 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:692:1: ( ( rule__Question_Impl__UnorderedGroup_2 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:693:1: ( rule__Question_Impl__UnorderedGroup_2 )
            {
             before(grammarAccess.getQuestion_ImplAccess().getUnorderedGroup_2()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:694:1: ( rule__Question_Impl__UnorderedGroup_2 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:694:2: rule__Question_Impl__UnorderedGroup_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__UnorderedGroup_2_in_rule__Question_Impl__Group__2__Impl1358);
            rule__Question_Impl__UnorderedGroup_2();

            state._fsp--;


            }

             after(grammarAccess.getQuestion_ImplAccess().getUnorderedGroup_2()); 

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
    // $ANTLR end "rule__Question_Impl__Group__2__Impl"


    // $ANTLR start "rule__Question_Impl__Group__3"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:704:1: rule__Question_Impl__Group__3 : rule__Question_Impl__Group__3__Impl rule__Question_Impl__Group__4 ;
    public final void rule__Question_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:708:1: ( rule__Question_Impl__Group__3__Impl rule__Question_Impl__Group__4 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:709:2: rule__Question_Impl__Group__3__Impl rule__Question_Impl__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__Group__3__Impl_in_rule__Question_Impl__Group__31388);
            rule__Question_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__Group__4_in_rule__Question_Impl__Group__31391);
            rule__Question_Impl__Group__4();

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
    // $ANTLR end "rule__Question_Impl__Group__3"


    // $ANTLR start "rule__Question_Impl__Group__3__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:716:1: rule__Question_Impl__Group__3__Impl : ( ( rule__Question_Impl__BodyAssignment_3 ) ) ;
    public final void rule__Question_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:720:1: ( ( ( rule__Question_Impl__BodyAssignment_3 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:721:1: ( ( rule__Question_Impl__BodyAssignment_3 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:721:1: ( ( rule__Question_Impl__BodyAssignment_3 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:722:1: ( rule__Question_Impl__BodyAssignment_3 )
            {
             before(grammarAccess.getQuestion_ImplAccess().getBodyAssignment_3()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:723:1: ( rule__Question_Impl__BodyAssignment_3 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:723:2: rule__Question_Impl__BodyAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__BodyAssignment_3_in_rule__Question_Impl__Group__3__Impl1418);
            rule__Question_Impl__BodyAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getQuestion_ImplAccess().getBodyAssignment_3()); 

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
    // $ANTLR end "rule__Question_Impl__Group__3__Impl"


    // $ANTLR start "rule__Question_Impl__Group__4"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:733:1: rule__Question_Impl__Group__4 : rule__Question_Impl__Group__4__Impl rule__Question_Impl__Group__5 ;
    public final void rule__Question_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:737:1: ( rule__Question_Impl__Group__4__Impl rule__Question_Impl__Group__5 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:738:2: rule__Question_Impl__Group__4__Impl rule__Question_Impl__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__Group__4__Impl_in_rule__Question_Impl__Group__41448);
            rule__Question_Impl__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__Group__5_in_rule__Question_Impl__Group__41451);
            rule__Question_Impl__Group__5();

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
    // $ANTLR end "rule__Question_Impl__Group__4"


    // $ANTLR start "rule__Question_Impl__Group__4__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:745:1: rule__Question_Impl__Group__4__Impl : ( '(' ) ;
    public final void rule__Question_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:749:1: ( ( '(' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:750:1: ( '(' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:750:1: ( '(' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:751:1: '('
            {
             before(grammarAccess.getQuestion_ImplAccess().getLeftParenthesisKeyword_4()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Question_Impl__Group__4__Impl1479); 
             after(grammarAccess.getQuestion_ImplAccess().getLeftParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__Question_Impl__Group__4__Impl"


    // $ANTLR start "rule__Question_Impl__Group__5"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:764:1: rule__Question_Impl__Group__5 : rule__Question_Impl__Group__5__Impl rule__Question_Impl__Group__6 ;
    public final void rule__Question_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:768:1: ( rule__Question_Impl__Group__5__Impl rule__Question_Impl__Group__6 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:769:2: rule__Question_Impl__Group__5__Impl rule__Question_Impl__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__Group__5__Impl_in_rule__Question_Impl__Group__51510);
            rule__Question_Impl__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__Group__6_in_rule__Question_Impl__Group__51513);
            rule__Question_Impl__Group__6();

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
    // $ANTLR end "rule__Question_Impl__Group__5"


    // $ANTLR start "rule__Question_Impl__Group__5__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:776:1: rule__Question_Impl__Group__5__Impl : ( ( rule__Question_Impl__AnswersAssignment_5 ) ) ;
    public final void rule__Question_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:780:1: ( ( ( rule__Question_Impl__AnswersAssignment_5 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:781:1: ( ( rule__Question_Impl__AnswersAssignment_5 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:781:1: ( ( rule__Question_Impl__AnswersAssignment_5 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:782:1: ( rule__Question_Impl__AnswersAssignment_5 )
            {
             before(grammarAccess.getQuestion_ImplAccess().getAnswersAssignment_5()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:783:1: ( rule__Question_Impl__AnswersAssignment_5 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:783:2: rule__Question_Impl__AnswersAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__AnswersAssignment_5_in_rule__Question_Impl__Group__5__Impl1540);
            rule__Question_Impl__AnswersAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getQuestion_ImplAccess().getAnswersAssignment_5()); 

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
    // $ANTLR end "rule__Question_Impl__Group__5__Impl"


    // $ANTLR start "rule__Question_Impl__Group__6"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:793:1: rule__Question_Impl__Group__6 : rule__Question_Impl__Group__6__Impl rule__Question_Impl__Group__7 ;
    public final void rule__Question_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:797:1: ( rule__Question_Impl__Group__6__Impl rule__Question_Impl__Group__7 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:798:2: rule__Question_Impl__Group__6__Impl rule__Question_Impl__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__Group__6__Impl_in_rule__Question_Impl__Group__61570);
            rule__Question_Impl__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__Group__7_in_rule__Question_Impl__Group__61573);
            rule__Question_Impl__Group__7();

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
    // $ANTLR end "rule__Question_Impl__Group__6"


    // $ANTLR start "rule__Question_Impl__Group__6__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:805:1: rule__Question_Impl__Group__6__Impl : ( ( rule__Question_Impl__AnswersAssignment_6 )* ) ;
    public final void rule__Question_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:809:1: ( ( ( rule__Question_Impl__AnswersAssignment_6 )* ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:810:1: ( ( rule__Question_Impl__AnswersAssignment_6 )* )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:810:1: ( ( rule__Question_Impl__AnswersAssignment_6 )* )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:811:1: ( rule__Question_Impl__AnswersAssignment_6 )*
            {
             before(grammarAccess.getQuestion_ImplAccess().getAnswersAssignment_6()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:812:1: ( rule__Question_Impl__AnswersAssignment_6 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:812:2: rule__Question_Impl__AnswersAssignment_6
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__AnswersAssignment_6_in_rule__Question_Impl__Group__6__Impl1600);
            	    rule__Question_Impl__AnswersAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getQuestion_ImplAccess().getAnswersAssignment_6()); 

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
    // $ANTLR end "rule__Question_Impl__Group__6__Impl"


    // $ANTLR start "rule__Question_Impl__Group__7"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:822:1: rule__Question_Impl__Group__7 : rule__Question_Impl__Group__7__Impl ;
    public final void rule__Question_Impl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:826:1: ( rule__Question_Impl__Group__7__Impl )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:827:2: rule__Question_Impl__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__Group__7__Impl_in_rule__Question_Impl__Group__71631);
            rule__Question_Impl__Group__7__Impl();

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
    // $ANTLR end "rule__Question_Impl__Group__7"


    // $ANTLR start "rule__Question_Impl__Group__7__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:833:1: rule__Question_Impl__Group__7__Impl : ( ')' ) ;
    public final void rule__Question_Impl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:837:1: ( ( ')' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:838:1: ( ')' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:838:1: ( ')' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:839:1: ')'
            {
             before(grammarAccess.getQuestion_ImplAccess().getRightParenthesisKeyword_7()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Question_Impl__Group__7__Impl1659); 
             after(grammarAccess.getQuestion_ImplAccess().getRightParenthesisKeyword_7()); 

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
    // $ANTLR end "rule__Question_Impl__Group__7__Impl"


    // $ANTLR start "rule__Answer__Group__0"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:868:1: rule__Answer__Group__0 : rule__Answer__Group__0__Impl rule__Answer__Group__1 ;
    public final void rule__Answer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:872:1: ( rule__Answer__Group__0__Impl rule__Answer__Group__1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:873:2: rule__Answer__Group__0__Impl rule__Answer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__0__Impl_in_rule__Answer__Group__01706);
            rule__Answer__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__1_in_rule__Answer__Group__01709);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:880:1: rule__Answer__Group__0__Impl : ( 'Answer' ) ;
    public final void rule__Answer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:884:1: ( ( 'Answer' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:885:1: ( 'Answer' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:885:1: ( 'Answer' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:886:1: 'Answer'
            {
             before(grammarAccess.getAnswerAccess().getAnswerKeyword_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Answer__Group__0__Impl1737); 
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:899:1: rule__Answer__Group__1 : rule__Answer__Group__1__Impl rule__Answer__Group__2 ;
    public final void rule__Answer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:903:1: ( rule__Answer__Group__1__Impl rule__Answer__Group__2 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:904:2: rule__Answer__Group__1__Impl rule__Answer__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__1__Impl_in_rule__Answer__Group__11768);
            rule__Answer__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__2_in_rule__Answer__Group__11771);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:911:1: rule__Answer__Group__1__Impl : ( ( rule__Answer__IsFreeTextAssignment_1 )? ) ;
    public final void rule__Answer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:915:1: ( ( ( rule__Answer__IsFreeTextAssignment_1 )? ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:916:1: ( ( rule__Answer__IsFreeTextAssignment_1 )? )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:916:1: ( ( rule__Answer__IsFreeTextAssignment_1 )? )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:917:1: ( rule__Answer__IsFreeTextAssignment_1 )?
            {
             before(grammarAccess.getAnswerAccess().getIsFreeTextAssignment_1()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:918:1: ( rule__Answer__IsFreeTextAssignment_1 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:918:2: rule__Answer__IsFreeTextAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Answer__IsFreeTextAssignment_1_in_rule__Answer__Group__1__Impl1798);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:928:1: rule__Answer__Group__2 : rule__Answer__Group__2__Impl rule__Answer__Group__3 ;
    public final void rule__Answer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:932:1: ( rule__Answer__Group__2__Impl rule__Answer__Group__3 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:933:2: rule__Answer__Group__2__Impl rule__Answer__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__2__Impl_in_rule__Answer__Group__21829);
            rule__Answer__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__3_in_rule__Answer__Group__21832);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:940:1: rule__Answer__Group__2__Impl : ( ( rule__Answer__BodyAssignment_2 ) ) ;
    public final void rule__Answer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:944:1: ( ( ( rule__Answer__BodyAssignment_2 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:945:1: ( ( rule__Answer__BodyAssignment_2 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:945:1: ( ( rule__Answer__BodyAssignment_2 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:946:1: ( rule__Answer__BodyAssignment_2 )
            {
             before(grammarAccess.getAnswerAccess().getBodyAssignment_2()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:947:1: ( rule__Answer__BodyAssignment_2 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:947:2: rule__Answer__BodyAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__BodyAssignment_2_in_rule__Answer__Group__2__Impl1859);
            rule__Answer__BodyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAnswerAccess().getBodyAssignment_2()); 

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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:957:1: rule__Answer__Group__3 : rule__Answer__Group__3__Impl ;
    public final void rule__Answer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:961:1: ( rule__Answer__Group__3__Impl )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:962:2: rule__Answer__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__3__Impl_in_rule__Answer__Group__31889);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:968:1: rule__Answer__Group__3__Impl : ( ( rule__Answer__Group_3__0 )? ) ;
    public final void rule__Answer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:972:1: ( ( ( rule__Answer__Group_3__0 )? ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:973:1: ( ( rule__Answer__Group_3__0 )? )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:973:1: ( ( rule__Answer__Group_3__0 )? )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:974:1: ( rule__Answer__Group_3__0 )?
            {
             before(grammarAccess.getAnswerAccess().getGroup_3()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:975:1: ( rule__Answer__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:975:2: rule__Answer__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3__0_in_rule__Answer__Group__3__Impl1916);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:993:1: rule__Answer__Group_3__0 : rule__Answer__Group_3__0__Impl rule__Answer__Group_3__1 ;
    public final void rule__Answer__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:997:1: ( rule__Answer__Group_3__0__Impl rule__Answer__Group_3__1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:998:2: rule__Answer__Group_3__0__Impl rule__Answer__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3__0__Impl_in_rule__Answer__Group_3__01955);
            rule__Answer__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3__1_in_rule__Answer__Group_3__01958);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1005:1: rule__Answer__Group_3__0__Impl : ( '->' ) ;
    public final void rule__Answer__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1009:1: ( ( '->' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1010:1: ( '->' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1010:1: ( '->' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1011:1: '->'
            {
             before(grammarAccess.getAnswerAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Answer__Group_3__0__Impl1986); 
             after(grammarAccess.getAnswerAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 

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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1024:1: rule__Answer__Group_3__1 : rule__Answer__Group_3__1__Impl rule__Answer__Group_3__2 ;
    public final void rule__Answer__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1028:1: ( rule__Answer__Group_3__1__Impl rule__Answer__Group_3__2 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1029:2: rule__Answer__Group_3__1__Impl rule__Answer__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3__1__Impl_in_rule__Answer__Group_3__12017);
            rule__Answer__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3__2_in_rule__Answer__Group_3__12020);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1036:1: rule__Answer__Group_3__1__Impl : ( ( rule__Answer__FollowupAssignment_3_1 ) ) ;
    public final void rule__Answer__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1040:1: ( ( ( rule__Answer__FollowupAssignment_3_1 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1041:1: ( ( rule__Answer__FollowupAssignment_3_1 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1041:1: ( ( rule__Answer__FollowupAssignment_3_1 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1042:1: ( rule__Answer__FollowupAssignment_3_1 )
            {
             before(grammarAccess.getAnswerAccess().getFollowupAssignment_3_1()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1043:1: ( rule__Answer__FollowupAssignment_3_1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1043:2: rule__Answer__FollowupAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__FollowupAssignment_3_1_in_rule__Answer__Group_3__1__Impl2047);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1053:1: rule__Answer__Group_3__2 : rule__Answer__Group_3__2__Impl ;
    public final void rule__Answer__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1057:1: ( rule__Answer__Group_3__2__Impl )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1058:2: rule__Answer__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3__2__Impl_in_rule__Answer__Group_3__22077);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1064:1: rule__Answer__Group_3__2__Impl : ( ( rule__Answer__Group_3_2__0 )* ) ;
    public final void rule__Answer__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1068:1: ( ( ( rule__Answer__Group_3_2__0 )* ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1069:1: ( ( rule__Answer__Group_3_2__0 )* )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1069:1: ( ( rule__Answer__Group_3_2__0 )* )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1070:1: ( rule__Answer__Group_3_2__0 )*
            {
             before(grammarAccess.getAnswerAccess().getGroup_3_2()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1071:1: ( rule__Answer__Group_3_2__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1071:2: rule__Answer__Group_3_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3_2__0_in_rule__Answer__Group_3__2__Impl2104);
            	    rule__Answer__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getAnswerAccess().getGroup_3_2()); 

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


    // $ANTLR start "rule__Answer__Group_3_2__0"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1087:1: rule__Answer__Group_3_2__0 : rule__Answer__Group_3_2__0__Impl rule__Answer__Group_3_2__1 ;
    public final void rule__Answer__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1091:1: ( rule__Answer__Group_3_2__0__Impl rule__Answer__Group_3_2__1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1092:2: rule__Answer__Group_3_2__0__Impl rule__Answer__Group_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3_2__0__Impl_in_rule__Answer__Group_3_2__02141);
            rule__Answer__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3_2__1_in_rule__Answer__Group_3_2__02144);
            rule__Answer__Group_3_2__1();

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
    // $ANTLR end "rule__Answer__Group_3_2__0"


    // $ANTLR start "rule__Answer__Group_3_2__0__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1099:1: rule__Answer__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Answer__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1103:1: ( ( ',' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1104:1: ( ',' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1104:1: ( ',' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1105:1: ','
            {
             before(grammarAccess.getAnswerAccess().getCommaKeyword_3_2_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Answer__Group_3_2__0__Impl2172); 
             after(grammarAccess.getAnswerAccess().getCommaKeyword_3_2_0()); 

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
    // $ANTLR end "rule__Answer__Group_3_2__0__Impl"


    // $ANTLR start "rule__Answer__Group_3_2__1"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1118:1: rule__Answer__Group_3_2__1 : rule__Answer__Group_3_2__1__Impl ;
    public final void rule__Answer__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1122:1: ( rule__Answer__Group_3_2__1__Impl )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1123:2: rule__Answer__Group_3_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3_2__1__Impl_in_rule__Answer__Group_3_2__12203);
            rule__Answer__Group_3_2__1__Impl();

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
    // $ANTLR end "rule__Answer__Group_3_2__1"


    // $ANTLR start "rule__Answer__Group_3_2__1__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1129:1: rule__Answer__Group_3_2__1__Impl : ( ( rule__Answer__FollowupAssignment_3_2_1 ) ) ;
    public final void rule__Answer__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1133:1: ( ( ( rule__Answer__FollowupAssignment_3_2_1 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1134:1: ( ( rule__Answer__FollowupAssignment_3_2_1 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1134:1: ( ( rule__Answer__FollowupAssignment_3_2_1 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1135:1: ( rule__Answer__FollowupAssignment_3_2_1 )
            {
             before(grammarAccess.getAnswerAccess().getFollowupAssignment_3_2_1()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1136:1: ( rule__Answer__FollowupAssignment_3_2_1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1136:2: rule__Answer__FollowupAssignment_3_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__FollowupAssignment_3_2_1_in_rule__Answer__Group_3_2__1__Impl2230);
            rule__Answer__FollowupAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAnswerAccess().getFollowupAssignment_3_2_1()); 

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
    // $ANTLR end "rule__Answer__Group_3_2__1__Impl"


    // $ANTLR start "rule__TableQuestion__Group__0"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1150:1: rule__TableQuestion__Group__0 : rule__TableQuestion__Group__0__Impl rule__TableQuestion__Group__1 ;
    public final void rule__TableQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1154:1: ( rule__TableQuestion__Group__0__Impl rule__TableQuestion__Group__1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1155:2: rule__TableQuestion__Group__0__Impl rule__TableQuestion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__0__Impl_in_rule__TableQuestion__Group__02264);
            rule__TableQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__1_in_rule__TableQuestion__Group__02267);
            rule__TableQuestion__Group__1();

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
    // $ANTLR end "rule__TableQuestion__Group__0"


    // $ANTLR start "rule__TableQuestion__Group__0__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1162:1: rule__TableQuestion__Group__0__Impl : ( 'TableQuestion' ) ;
    public final void rule__TableQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1166:1: ( ( 'TableQuestion' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1167:1: ( 'TableQuestion' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1167:1: ( 'TableQuestion' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1168:1: 'TableQuestion'
            {
             before(grammarAccess.getTableQuestionAccess().getTableQuestionKeyword_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__TableQuestion__Group__0__Impl2295); 
             after(grammarAccess.getTableQuestionAccess().getTableQuestionKeyword_0()); 

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
    // $ANTLR end "rule__TableQuestion__Group__0__Impl"


    // $ANTLR start "rule__TableQuestion__Group__1"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1181:1: rule__TableQuestion__Group__1 : rule__TableQuestion__Group__1__Impl rule__TableQuestion__Group__2 ;
    public final void rule__TableQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1185:1: ( rule__TableQuestion__Group__1__Impl rule__TableQuestion__Group__2 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1186:2: rule__TableQuestion__Group__1__Impl rule__TableQuestion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__1__Impl_in_rule__TableQuestion__Group__12326);
            rule__TableQuestion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__2_in_rule__TableQuestion__Group__12329);
            rule__TableQuestion__Group__2();

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
    // $ANTLR end "rule__TableQuestion__Group__1"


    // $ANTLR start "rule__TableQuestion__Group__1__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1193:1: rule__TableQuestion__Group__1__Impl : ( ( rule__TableQuestion__NameAssignment_1 ) ) ;
    public final void rule__TableQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1197:1: ( ( ( rule__TableQuestion__NameAssignment_1 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1198:1: ( ( rule__TableQuestion__NameAssignment_1 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1198:1: ( ( rule__TableQuestion__NameAssignment_1 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1199:1: ( rule__TableQuestion__NameAssignment_1 )
            {
             before(grammarAccess.getTableQuestionAccess().getNameAssignment_1()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1200:1: ( rule__TableQuestion__NameAssignment_1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1200:2: rule__TableQuestion__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__NameAssignment_1_in_rule__TableQuestion__Group__1__Impl2356);
            rule__TableQuestion__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTableQuestionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__TableQuestion__Group__1__Impl"


    // $ANTLR start "rule__TableQuestion__Group__2"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1210:1: rule__TableQuestion__Group__2 : rule__TableQuestion__Group__2__Impl rule__TableQuestion__Group__3 ;
    public final void rule__TableQuestion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1214:1: ( rule__TableQuestion__Group__2__Impl rule__TableQuestion__Group__3 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1215:2: rule__TableQuestion__Group__2__Impl rule__TableQuestion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__2__Impl_in_rule__TableQuestion__Group__22386);
            rule__TableQuestion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__3_in_rule__TableQuestion__Group__22389);
            rule__TableQuestion__Group__3();

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
    // $ANTLR end "rule__TableQuestion__Group__2"


    // $ANTLR start "rule__TableQuestion__Group__2__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1222:1: rule__TableQuestion__Group__2__Impl : ( ( rule__TableQuestion__UnorderedGroup_2 ) ) ;
    public final void rule__TableQuestion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1226:1: ( ( ( rule__TableQuestion__UnorderedGroup_2 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1227:1: ( ( rule__TableQuestion__UnorderedGroup_2 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1227:1: ( ( rule__TableQuestion__UnorderedGroup_2 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1228:1: ( rule__TableQuestion__UnorderedGroup_2 )
            {
             before(grammarAccess.getTableQuestionAccess().getUnorderedGroup_2()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1229:1: ( rule__TableQuestion__UnorderedGroup_2 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1229:2: rule__TableQuestion__UnorderedGroup_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__UnorderedGroup_2_in_rule__TableQuestion__Group__2__Impl2416);
            rule__TableQuestion__UnorderedGroup_2();

            state._fsp--;


            }

             after(grammarAccess.getTableQuestionAccess().getUnorderedGroup_2()); 

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
    // $ANTLR end "rule__TableQuestion__Group__2__Impl"


    // $ANTLR start "rule__TableQuestion__Group__3"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1239:1: rule__TableQuestion__Group__3 : rule__TableQuestion__Group__3__Impl rule__TableQuestion__Group__4 ;
    public final void rule__TableQuestion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1243:1: ( rule__TableQuestion__Group__3__Impl rule__TableQuestion__Group__4 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1244:2: rule__TableQuestion__Group__3__Impl rule__TableQuestion__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__3__Impl_in_rule__TableQuestion__Group__32446);
            rule__TableQuestion__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__4_in_rule__TableQuestion__Group__32449);
            rule__TableQuestion__Group__4();

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
    // $ANTLR end "rule__TableQuestion__Group__3"


    // $ANTLR start "rule__TableQuestion__Group__3__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1251:1: rule__TableQuestion__Group__3__Impl : ( ( rule__TableQuestion__BodyAssignment_3 ) ) ;
    public final void rule__TableQuestion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1255:1: ( ( ( rule__TableQuestion__BodyAssignment_3 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1256:1: ( ( rule__TableQuestion__BodyAssignment_3 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1256:1: ( ( rule__TableQuestion__BodyAssignment_3 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1257:1: ( rule__TableQuestion__BodyAssignment_3 )
            {
             before(grammarAccess.getTableQuestionAccess().getBodyAssignment_3()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1258:1: ( rule__TableQuestion__BodyAssignment_3 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1258:2: rule__TableQuestion__BodyAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__BodyAssignment_3_in_rule__TableQuestion__Group__3__Impl2476);
            rule__TableQuestion__BodyAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTableQuestionAccess().getBodyAssignment_3()); 

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
    // $ANTLR end "rule__TableQuestion__Group__3__Impl"


    // $ANTLR start "rule__TableQuestion__Group__4"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1268:1: rule__TableQuestion__Group__4 : rule__TableQuestion__Group__4__Impl rule__TableQuestion__Group__5 ;
    public final void rule__TableQuestion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1272:1: ( rule__TableQuestion__Group__4__Impl rule__TableQuestion__Group__5 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1273:2: rule__TableQuestion__Group__4__Impl rule__TableQuestion__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__4__Impl_in_rule__TableQuestion__Group__42506);
            rule__TableQuestion__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__5_in_rule__TableQuestion__Group__42509);
            rule__TableQuestion__Group__5();

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
    // $ANTLR end "rule__TableQuestion__Group__4"


    // $ANTLR start "rule__TableQuestion__Group__4__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1280:1: rule__TableQuestion__Group__4__Impl : ( '(' ) ;
    public final void rule__TableQuestion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1284:1: ( ( '(' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1285:1: ( '(' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1285:1: ( '(' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1286:1: '('
            {
             before(grammarAccess.getTableQuestionAccess().getLeftParenthesisKeyword_4()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__TableQuestion__Group__4__Impl2537); 
             after(grammarAccess.getTableQuestionAccess().getLeftParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__TableQuestion__Group__4__Impl"


    // $ANTLR start "rule__TableQuestion__Group__5"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1299:1: rule__TableQuestion__Group__5 : rule__TableQuestion__Group__5__Impl rule__TableQuestion__Group__6 ;
    public final void rule__TableQuestion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1303:1: ( rule__TableQuestion__Group__5__Impl rule__TableQuestion__Group__6 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1304:2: rule__TableQuestion__Group__5__Impl rule__TableQuestion__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__5__Impl_in_rule__TableQuestion__Group__52568);
            rule__TableQuestion__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__6_in_rule__TableQuestion__Group__52571);
            rule__TableQuestion__Group__6();

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
    // $ANTLR end "rule__TableQuestion__Group__5"


    // $ANTLR start "rule__TableQuestion__Group__5__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1311:1: rule__TableQuestion__Group__5__Impl : ( 'Items' ) ;
    public final void rule__TableQuestion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1315:1: ( ( 'Items' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1316:1: ( 'Items' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1316:1: ( 'Items' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1317:1: 'Items'
            {
             before(grammarAccess.getTableQuestionAccess().getItemsKeyword_5()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__TableQuestion__Group__5__Impl2599); 
             after(grammarAccess.getTableQuestionAccess().getItemsKeyword_5()); 

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
    // $ANTLR end "rule__TableQuestion__Group__5__Impl"


    // $ANTLR start "rule__TableQuestion__Group__6"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1330:1: rule__TableQuestion__Group__6 : rule__TableQuestion__Group__6__Impl rule__TableQuestion__Group__7 ;
    public final void rule__TableQuestion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1334:1: ( rule__TableQuestion__Group__6__Impl rule__TableQuestion__Group__7 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1335:2: rule__TableQuestion__Group__6__Impl rule__TableQuestion__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__6__Impl_in_rule__TableQuestion__Group__62630);
            rule__TableQuestion__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__7_in_rule__TableQuestion__Group__62633);
            rule__TableQuestion__Group__7();

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
    // $ANTLR end "rule__TableQuestion__Group__6"


    // $ANTLR start "rule__TableQuestion__Group__6__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1342:1: rule__TableQuestion__Group__6__Impl : ( '(' ) ;
    public final void rule__TableQuestion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1346:1: ( ( '(' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1347:1: ( '(' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1347:1: ( '(' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1348:1: '('
            {
             before(grammarAccess.getTableQuestionAccess().getLeftParenthesisKeyword_6()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__TableQuestion__Group__6__Impl2661); 
             after(grammarAccess.getTableQuestionAccess().getLeftParenthesisKeyword_6()); 

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
    // $ANTLR end "rule__TableQuestion__Group__6__Impl"


    // $ANTLR start "rule__TableQuestion__Group__7"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1361:1: rule__TableQuestion__Group__7 : rule__TableQuestion__Group__7__Impl rule__TableQuestion__Group__8 ;
    public final void rule__TableQuestion__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1365:1: ( rule__TableQuestion__Group__7__Impl rule__TableQuestion__Group__8 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1366:2: rule__TableQuestion__Group__7__Impl rule__TableQuestion__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__7__Impl_in_rule__TableQuestion__Group__72692);
            rule__TableQuestion__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__8_in_rule__TableQuestion__Group__72695);
            rule__TableQuestion__Group__8();

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
    // $ANTLR end "rule__TableQuestion__Group__7"


    // $ANTLR start "rule__TableQuestion__Group__7__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1373:1: rule__TableQuestion__Group__7__Impl : ( ( rule__TableQuestion__ItemsAssignment_7 ) ) ;
    public final void rule__TableQuestion__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1377:1: ( ( ( rule__TableQuestion__ItemsAssignment_7 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1378:1: ( ( rule__TableQuestion__ItemsAssignment_7 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1378:1: ( ( rule__TableQuestion__ItemsAssignment_7 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1379:1: ( rule__TableQuestion__ItemsAssignment_7 )
            {
             before(grammarAccess.getTableQuestionAccess().getItemsAssignment_7()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1380:1: ( rule__TableQuestion__ItemsAssignment_7 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1380:2: rule__TableQuestion__ItemsAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__ItemsAssignment_7_in_rule__TableQuestion__Group__7__Impl2722);
            rule__TableQuestion__ItemsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getTableQuestionAccess().getItemsAssignment_7()); 

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
    // $ANTLR end "rule__TableQuestion__Group__7__Impl"


    // $ANTLR start "rule__TableQuestion__Group__8"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1390:1: rule__TableQuestion__Group__8 : rule__TableQuestion__Group__8__Impl rule__TableQuestion__Group__9 ;
    public final void rule__TableQuestion__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1394:1: ( rule__TableQuestion__Group__8__Impl rule__TableQuestion__Group__9 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1395:2: rule__TableQuestion__Group__8__Impl rule__TableQuestion__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__8__Impl_in_rule__TableQuestion__Group__82752);
            rule__TableQuestion__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__9_in_rule__TableQuestion__Group__82755);
            rule__TableQuestion__Group__9();

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
    // $ANTLR end "rule__TableQuestion__Group__8"


    // $ANTLR start "rule__TableQuestion__Group__8__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1402:1: rule__TableQuestion__Group__8__Impl : ( ( rule__TableQuestion__Group_8__0 )* ) ;
    public final void rule__TableQuestion__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1406:1: ( ( ( rule__TableQuestion__Group_8__0 )* ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1407:1: ( ( rule__TableQuestion__Group_8__0 )* )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1407:1: ( ( rule__TableQuestion__Group_8__0 )* )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1408:1: ( rule__TableQuestion__Group_8__0 )*
            {
             before(grammarAccess.getTableQuestionAccess().getGroup_8()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1409:1: ( rule__TableQuestion__Group_8__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1409:2: rule__TableQuestion__Group_8__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group_8__0_in_rule__TableQuestion__Group__8__Impl2782);
            	    rule__TableQuestion__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getTableQuestionAccess().getGroup_8()); 

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
    // $ANTLR end "rule__TableQuestion__Group__8__Impl"


    // $ANTLR start "rule__TableQuestion__Group__9"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1419:1: rule__TableQuestion__Group__9 : rule__TableQuestion__Group__9__Impl rule__TableQuestion__Group__10 ;
    public final void rule__TableQuestion__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1423:1: ( rule__TableQuestion__Group__9__Impl rule__TableQuestion__Group__10 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1424:2: rule__TableQuestion__Group__9__Impl rule__TableQuestion__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__9__Impl_in_rule__TableQuestion__Group__92813);
            rule__TableQuestion__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__10_in_rule__TableQuestion__Group__92816);
            rule__TableQuestion__Group__10();

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
    // $ANTLR end "rule__TableQuestion__Group__9"


    // $ANTLR start "rule__TableQuestion__Group__9__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1431:1: rule__TableQuestion__Group__9__Impl : ( ')' ) ;
    public final void rule__TableQuestion__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1435:1: ( ( ')' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1436:1: ( ')' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1436:1: ( ')' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1437:1: ')'
            {
             before(grammarAccess.getTableQuestionAccess().getRightParenthesisKeyword_9()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__TableQuestion__Group__9__Impl2844); 
             after(grammarAccess.getTableQuestionAccess().getRightParenthesisKeyword_9()); 

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
    // $ANTLR end "rule__TableQuestion__Group__9__Impl"


    // $ANTLR start "rule__TableQuestion__Group__10"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1450:1: rule__TableQuestion__Group__10 : rule__TableQuestion__Group__10__Impl rule__TableQuestion__Group__11 ;
    public final void rule__TableQuestion__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1454:1: ( rule__TableQuestion__Group__10__Impl rule__TableQuestion__Group__11 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1455:2: rule__TableQuestion__Group__10__Impl rule__TableQuestion__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__10__Impl_in_rule__TableQuestion__Group__102875);
            rule__TableQuestion__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__11_in_rule__TableQuestion__Group__102878);
            rule__TableQuestion__Group__11();

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
    // $ANTLR end "rule__TableQuestion__Group__10"


    // $ANTLR start "rule__TableQuestion__Group__10__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1462:1: rule__TableQuestion__Group__10__Impl : ( ( rule__TableQuestion__AnswersAssignment_10 ) ) ;
    public final void rule__TableQuestion__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1466:1: ( ( ( rule__TableQuestion__AnswersAssignment_10 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1467:1: ( ( rule__TableQuestion__AnswersAssignment_10 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1467:1: ( ( rule__TableQuestion__AnswersAssignment_10 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1468:1: ( rule__TableQuestion__AnswersAssignment_10 )
            {
             before(grammarAccess.getTableQuestionAccess().getAnswersAssignment_10()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1469:1: ( rule__TableQuestion__AnswersAssignment_10 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1469:2: rule__TableQuestion__AnswersAssignment_10
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__AnswersAssignment_10_in_rule__TableQuestion__Group__10__Impl2905);
            rule__TableQuestion__AnswersAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getTableQuestionAccess().getAnswersAssignment_10()); 

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
    // $ANTLR end "rule__TableQuestion__Group__10__Impl"


    // $ANTLR start "rule__TableQuestion__Group__11"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1479:1: rule__TableQuestion__Group__11 : rule__TableQuestion__Group__11__Impl rule__TableQuestion__Group__12 ;
    public final void rule__TableQuestion__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1483:1: ( rule__TableQuestion__Group__11__Impl rule__TableQuestion__Group__12 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1484:2: rule__TableQuestion__Group__11__Impl rule__TableQuestion__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__11__Impl_in_rule__TableQuestion__Group__112935);
            rule__TableQuestion__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__12_in_rule__TableQuestion__Group__112938);
            rule__TableQuestion__Group__12();

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
    // $ANTLR end "rule__TableQuestion__Group__11"


    // $ANTLR start "rule__TableQuestion__Group__11__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1491:1: rule__TableQuestion__Group__11__Impl : ( ( rule__TableQuestion__AnswersAssignment_11 )* ) ;
    public final void rule__TableQuestion__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1495:1: ( ( ( rule__TableQuestion__AnswersAssignment_11 )* ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1496:1: ( ( rule__TableQuestion__AnswersAssignment_11 )* )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1496:1: ( ( rule__TableQuestion__AnswersAssignment_11 )* )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1497:1: ( rule__TableQuestion__AnswersAssignment_11 )*
            {
             before(grammarAccess.getTableQuestionAccess().getAnswersAssignment_11()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1498:1: ( rule__TableQuestion__AnswersAssignment_11 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==17) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1498:2: rule__TableQuestion__AnswersAssignment_11
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__AnswersAssignment_11_in_rule__TableQuestion__Group__11__Impl2965);
            	    rule__TableQuestion__AnswersAssignment_11();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getTableQuestionAccess().getAnswersAssignment_11()); 

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
    // $ANTLR end "rule__TableQuestion__Group__11__Impl"


    // $ANTLR start "rule__TableQuestion__Group__12"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1508:1: rule__TableQuestion__Group__12 : rule__TableQuestion__Group__12__Impl ;
    public final void rule__TableQuestion__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1512:1: ( rule__TableQuestion__Group__12__Impl )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1513:2: rule__TableQuestion__Group__12__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__12__Impl_in_rule__TableQuestion__Group__122996);
            rule__TableQuestion__Group__12__Impl();

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
    // $ANTLR end "rule__TableQuestion__Group__12"


    // $ANTLR start "rule__TableQuestion__Group__12__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1519:1: rule__TableQuestion__Group__12__Impl : ( ')' ) ;
    public final void rule__TableQuestion__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1523:1: ( ( ')' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1524:1: ( ')' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1524:1: ( ')' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1525:1: ')'
            {
             before(grammarAccess.getTableQuestionAccess().getRightParenthesisKeyword_12()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__TableQuestion__Group__12__Impl3024); 
             after(grammarAccess.getTableQuestionAccess().getRightParenthesisKeyword_12()); 

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
    // $ANTLR end "rule__TableQuestion__Group__12__Impl"


    // $ANTLR start "rule__TableQuestion__Group_8__0"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1564:1: rule__TableQuestion__Group_8__0 : rule__TableQuestion__Group_8__0__Impl rule__TableQuestion__Group_8__1 ;
    public final void rule__TableQuestion__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1568:1: ( rule__TableQuestion__Group_8__0__Impl rule__TableQuestion__Group_8__1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1569:2: rule__TableQuestion__Group_8__0__Impl rule__TableQuestion__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group_8__0__Impl_in_rule__TableQuestion__Group_8__03081);
            rule__TableQuestion__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group_8__1_in_rule__TableQuestion__Group_8__03084);
            rule__TableQuestion__Group_8__1();

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
    // $ANTLR end "rule__TableQuestion__Group_8__0"


    // $ANTLR start "rule__TableQuestion__Group_8__0__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1576:1: rule__TableQuestion__Group_8__0__Impl : ( ',' ) ;
    public final void rule__TableQuestion__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1580:1: ( ( ',' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1581:1: ( ',' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1581:1: ( ',' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1582:1: ','
            {
             before(grammarAccess.getTableQuestionAccess().getCommaKeyword_8_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__TableQuestion__Group_8__0__Impl3112); 
             after(grammarAccess.getTableQuestionAccess().getCommaKeyword_8_0()); 

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
    // $ANTLR end "rule__TableQuestion__Group_8__0__Impl"


    // $ANTLR start "rule__TableQuestion__Group_8__1"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1595:1: rule__TableQuestion__Group_8__1 : rule__TableQuestion__Group_8__1__Impl ;
    public final void rule__TableQuestion__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1599:1: ( rule__TableQuestion__Group_8__1__Impl )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1600:2: rule__TableQuestion__Group_8__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group_8__1__Impl_in_rule__TableQuestion__Group_8__13143);
            rule__TableQuestion__Group_8__1__Impl();

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
    // $ANTLR end "rule__TableQuestion__Group_8__1"


    // $ANTLR start "rule__TableQuestion__Group_8__1__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1606:1: rule__TableQuestion__Group_8__1__Impl : ( ( rule__TableQuestion__ItemsAssignment_8_1 ) ) ;
    public final void rule__TableQuestion__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1610:1: ( ( ( rule__TableQuestion__ItemsAssignment_8_1 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1611:1: ( ( rule__TableQuestion__ItemsAssignment_8_1 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1611:1: ( ( rule__TableQuestion__ItemsAssignment_8_1 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1612:1: ( rule__TableQuestion__ItemsAssignment_8_1 )
            {
             before(grammarAccess.getTableQuestionAccess().getItemsAssignment_8_1()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1613:1: ( rule__TableQuestion__ItemsAssignment_8_1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1613:2: rule__TableQuestion__ItemsAssignment_8_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__ItemsAssignment_8_1_in_rule__TableQuestion__Group_8__1__Impl3170);
            rule__TableQuestion__ItemsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getTableQuestionAccess().getItemsAssignment_8_1()); 

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
    // $ANTLR end "rule__TableQuestion__Group_8__1__Impl"


    // $ANTLR start "rule__Item__Group__0"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1627:1: rule__Item__Group__0 : rule__Item__Group__0__Impl rule__Item__Group__1 ;
    public final void rule__Item__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1631:1: ( rule__Item__Group__0__Impl rule__Item__Group__1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1632:2: rule__Item__Group__0__Impl rule__Item__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Item__Group__0__Impl_in_rule__Item__Group__03204);
            rule__Item__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Item__Group__1_in_rule__Item__Group__03207);
            rule__Item__Group__1();

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
    // $ANTLR end "rule__Item__Group__0"


    // $ANTLR start "rule__Item__Group__0__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1639:1: rule__Item__Group__0__Impl : ( ( rule__Item__IsFreeTextAssignment_0 )? ) ;
    public final void rule__Item__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1643:1: ( ( ( rule__Item__IsFreeTextAssignment_0 )? ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1644:1: ( ( rule__Item__IsFreeTextAssignment_0 )? )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1644:1: ( ( rule__Item__IsFreeTextAssignment_0 )? )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1645:1: ( rule__Item__IsFreeTextAssignment_0 )?
            {
             before(grammarAccess.getItemAccess().getIsFreeTextAssignment_0()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1646:1: ( rule__Item__IsFreeTextAssignment_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1646:2: rule__Item__IsFreeTextAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Item__IsFreeTextAssignment_0_in_rule__Item__Group__0__Impl3234);
                    rule__Item__IsFreeTextAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getItemAccess().getIsFreeTextAssignment_0()); 

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
    // $ANTLR end "rule__Item__Group__0__Impl"


    // $ANTLR start "rule__Item__Group__1"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1656:1: rule__Item__Group__1 : rule__Item__Group__1__Impl ;
    public final void rule__Item__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1660:1: ( rule__Item__Group__1__Impl )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1661:2: rule__Item__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Item__Group__1__Impl_in_rule__Item__Group__13265);
            rule__Item__Group__1__Impl();

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
    // $ANTLR end "rule__Item__Group__1"


    // $ANTLR start "rule__Item__Group__1__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1667:1: rule__Item__Group__1__Impl : ( ( rule__Item__BodyAssignment_1 ) ) ;
    public final void rule__Item__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1671:1: ( ( ( rule__Item__BodyAssignment_1 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1672:1: ( ( rule__Item__BodyAssignment_1 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1672:1: ( ( rule__Item__BodyAssignment_1 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1673:1: ( rule__Item__BodyAssignment_1 )
            {
             before(grammarAccess.getItemAccess().getBodyAssignment_1()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1674:1: ( rule__Item__BodyAssignment_1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1674:2: rule__Item__BodyAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Item__BodyAssignment_1_in_rule__Item__Group__1__Impl3292);
            rule__Item__BodyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getBodyAssignment_1()); 

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
    // $ANTLR end "rule__Item__Group__1__Impl"


    // $ANTLR start "rule__Question_Impl__UnorderedGroup_2"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1689:1: rule__Question_Impl__UnorderedGroup_2 : ( rule__Question_Impl__UnorderedGroup_2__0 )? ;
    public final void rule__Question_Impl__UnorderedGroup_2() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getQuestion_ImplAccess().getUnorderedGroup_2());
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1694:1: ( ( rule__Question_Impl__UnorderedGroup_2__0 )? )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1695:2: ( rule__Question_Impl__UnorderedGroup_2__0 )?
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1695:2: ( rule__Question_Impl__UnorderedGroup_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( LA13_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestion_ImplAccess().getUnorderedGroup_2(), 0) ) {
                alt13=1;
            }
            else if ( LA13_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestion_ImplAccess().getUnorderedGroup_2(), 1) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1695:2: rule__Question_Impl__UnorderedGroup_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__UnorderedGroup_2__0_in_rule__Question_Impl__UnorderedGroup_23327);
                    rule__Question_Impl__UnorderedGroup_2__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getQuestion_ImplAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question_Impl__UnorderedGroup_2"


    // $ANTLR start "rule__Question_Impl__UnorderedGroup_2__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1705:1: rule__Question_Impl__UnorderedGroup_2__Impl : ( ({...}? => ( ( ( rule__Question_Impl__IsExclusiveAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__Question_Impl__IsOptionalAssignment_2_1 ) ) ) ) ) ;
    public final void rule__Question_Impl__UnorderedGroup_2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1710:1: ( ( ({...}? => ( ( ( rule__Question_Impl__IsExclusiveAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__Question_Impl__IsOptionalAssignment_2_1 ) ) ) ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1711:3: ( ({...}? => ( ( ( rule__Question_Impl__IsExclusiveAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__Question_Impl__IsOptionalAssignment_2_1 ) ) ) ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1711:3: ( ({...}? => ( ( ( rule__Question_Impl__IsExclusiveAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__Question_Impl__IsOptionalAssignment_2_1 ) ) ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( LA14_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestion_ImplAccess().getUnorderedGroup_2(), 0) ) {
                alt14=1;
            }
            else if ( LA14_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestion_ImplAccess().getUnorderedGroup_2(), 1) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1713:4: ({...}? => ( ( ( rule__Question_Impl__IsExclusiveAssignment_2_0 ) ) ) )
                    {
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1713:4: ({...}? => ( ( ( rule__Question_Impl__IsExclusiveAssignment_2_0 ) ) ) )
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1714:5: {...}? => ( ( ( rule__Question_Impl__IsExclusiveAssignment_2_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQuestion_ImplAccess().getUnorderedGroup_2(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Question_Impl__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getQuestion_ImplAccess().getUnorderedGroup_2(), 0)");
                    }
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1714:110: ( ( ( rule__Question_Impl__IsExclusiveAssignment_2_0 ) ) )
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1715:6: ( ( rule__Question_Impl__IsExclusiveAssignment_2_0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getQuestion_ImplAccess().getUnorderedGroup_2(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1721:6: ( ( rule__Question_Impl__IsExclusiveAssignment_2_0 ) )
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1723:7: ( rule__Question_Impl__IsExclusiveAssignment_2_0 )
                    {
                     before(grammarAccess.getQuestion_ImplAccess().getIsExclusiveAssignment_2_0()); 
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1724:7: ( rule__Question_Impl__IsExclusiveAssignment_2_0 )
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1724:8: rule__Question_Impl__IsExclusiveAssignment_2_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__IsExclusiveAssignment_2_0_in_rule__Question_Impl__UnorderedGroup_2__Impl3414);
                    rule__Question_Impl__IsExclusiveAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getQuestion_ImplAccess().getIsExclusiveAssignment_2_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1730:4: ({...}? => ( ( ( rule__Question_Impl__IsOptionalAssignment_2_1 ) ) ) )
                    {
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1730:4: ({...}? => ( ( ( rule__Question_Impl__IsOptionalAssignment_2_1 ) ) ) )
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1731:5: {...}? => ( ( ( rule__Question_Impl__IsOptionalAssignment_2_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQuestion_ImplAccess().getUnorderedGroup_2(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Question_Impl__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getQuestion_ImplAccess().getUnorderedGroup_2(), 1)");
                    }
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1731:110: ( ( ( rule__Question_Impl__IsOptionalAssignment_2_1 ) ) )
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1732:6: ( ( rule__Question_Impl__IsOptionalAssignment_2_1 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getQuestion_ImplAccess().getUnorderedGroup_2(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1738:6: ( ( rule__Question_Impl__IsOptionalAssignment_2_1 ) )
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1740:7: ( rule__Question_Impl__IsOptionalAssignment_2_1 )
                    {
                     before(grammarAccess.getQuestion_ImplAccess().getIsOptionalAssignment_2_1()); 
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1741:7: ( rule__Question_Impl__IsOptionalAssignment_2_1 )
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1741:8: rule__Question_Impl__IsOptionalAssignment_2_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__IsOptionalAssignment_2_1_in_rule__Question_Impl__UnorderedGroup_2__Impl3505);
                    rule__Question_Impl__IsOptionalAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getQuestion_ImplAccess().getIsOptionalAssignment_2_1()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQuestion_ImplAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question_Impl__UnorderedGroup_2__Impl"


    // $ANTLR start "rule__Question_Impl__UnorderedGroup_2__0"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1756:1: rule__Question_Impl__UnorderedGroup_2__0 : rule__Question_Impl__UnorderedGroup_2__Impl ( rule__Question_Impl__UnorderedGroup_2__1 )? ;
    public final void rule__Question_Impl__UnorderedGroup_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1760:1: ( rule__Question_Impl__UnorderedGroup_2__Impl ( rule__Question_Impl__UnorderedGroup_2__1 )? )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1761:2: rule__Question_Impl__UnorderedGroup_2__Impl ( rule__Question_Impl__UnorderedGroup_2__1 )?
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__UnorderedGroup_2__Impl_in_rule__Question_Impl__UnorderedGroup_2__03564);
            rule__Question_Impl__UnorderedGroup_2__Impl();

            state._fsp--;

            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1762:2: ( rule__Question_Impl__UnorderedGroup_2__1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( LA15_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestion_ImplAccess().getUnorderedGroup_2(), 0) ) {
                alt15=1;
            }
            else if ( LA15_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestion_ImplAccess().getUnorderedGroup_2(), 1) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1762:2: rule__Question_Impl__UnorderedGroup_2__1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__UnorderedGroup_2__1_in_rule__Question_Impl__UnorderedGroup_2__03567);
                    rule__Question_Impl__UnorderedGroup_2__1();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__Question_Impl__UnorderedGroup_2__0"


    // $ANTLR start "rule__Question_Impl__UnorderedGroup_2__1"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1769:1: rule__Question_Impl__UnorderedGroup_2__1 : rule__Question_Impl__UnorderedGroup_2__Impl ;
    public final void rule__Question_Impl__UnorderedGroup_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1773:1: ( rule__Question_Impl__UnorderedGroup_2__Impl )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1774:2: rule__Question_Impl__UnorderedGroup_2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__UnorderedGroup_2__Impl_in_rule__Question_Impl__UnorderedGroup_2__13592);
            rule__Question_Impl__UnorderedGroup_2__Impl();

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
    // $ANTLR end "rule__Question_Impl__UnorderedGroup_2__1"


    // $ANTLR start "rule__TableQuestion__UnorderedGroup_2"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1785:1: rule__TableQuestion__UnorderedGroup_2 : ( rule__TableQuestion__UnorderedGroup_2__0 )? ;
    public final void rule__TableQuestion__UnorderedGroup_2() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getTableQuestionAccess().getUnorderedGroup_2());
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1790:1: ( ( rule__TableQuestion__UnorderedGroup_2__0 )? )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1791:2: ( rule__TableQuestion__UnorderedGroup_2__0 )?
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1791:2: ( rule__TableQuestion__UnorderedGroup_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( LA16_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableQuestionAccess().getUnorderedGroup_2(), 0) ) {
                alt16=1;
            }
            else if ( LA16_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableQuestionAccess().getUnorderedGroup_2(), 1) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1791:2: rule__TableQuestion__UnorderedGroup_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__UnorderedGroup_2__0_in_rule__TableQuestion__UnorderedGroup_23620);
                    rule__TableQuestion__UnorderedGroup_2__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getTableQuestionAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableQuestion__UnorderedGroup_2"


    // $ANTLR start "rule__TableQuestion__UnorderedGroup_2__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1801:1: rule__TableQuestion__UnorderedGroup_2__Impl : ( ({...}? => ( ( ( rule__TableQuestion__IsExclusiveAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__TableQuestion__IsOptionalAssignment_2_1 ) ) ) ) ) ;
    public final void rule__TableQuestion__UnorderedGroup_2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1806:1: ( ( ({...}? => ( ( ( rule__TableQuestion__IsExclusiveAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__TableQuestion__IsOptionalAssignment_2_1 ) ) ) ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1807:3: ( ({...}? => ( ( ( rule__TableQuestion__IsExclusiveAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__TableQuestion__IsOptionalAssignment_2_1 ) ) ) ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1807:3: ( ({...}? => ( ( ( rule__TableQuestion__IsExclusiveAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__TableQuestion__IsOptionalAssignment_2_1 ) ) ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( LA17_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableQuestionAccess().getUnorderedGroup_2(), 0) ) {
                alt17=1;
            }
            else if ( LA17_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableQuestionAccess().getUnorderedGroup_2(), 1) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1809:4: ({...}? => ( ( ( rule__TableQuestion__IsExclusiveAssignment_2_0 ) ) ) )
                    {
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1809:4: ({...}? => ( ( ( rule__TableQuestion__IsExclusiveAssignment_2_0 ) ) ) )
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1810:5: {...}? => ( ( ( rule__TableQuestion__IsExclusiveAssignment_2_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableQuestionAccess().getUnorderedGroup_2(), 0) ) {
                        throw new FailedPredicateException(input, "rule__TableQuestion__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableQuestionAccess().getUnorderedGroup_2(), 0)");
                    }
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1810:110: ( ( ( rule__TableQuestion__IsExclusiveAssignment_2_0 ) ) )
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1811:6: ( ( rule__TableQuestion__IsExclusiveAssignment_2_0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableQuestionAccess().getUnorderedGroup_2(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1817:6: ( ( rule__TableQuestion__IsExclusiveAssignment_2_0 ) )
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1819:7: ( rule__TableQuestion__IsExclusiveAssignment_2_0 )
                    {
                     before(grammarAccess.getTableQuestionAccess().getIsExclusiveAssignment_2_0()); 
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1820:7: ( rule__TableQuestion__IsExclusiveAssignment_2_0 )
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1820:8: rule__TableQuestion__IsExclusiveAssignment_2_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__IsExclusiveAssignment_2_0_in_rule__TableQuestion__UnorderedGroup_2__Impl3707);
                    rule__TableQuestion__IsExclusiveAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTableQuestionAccess().getIsExclusiveAssignment_2_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1826:4: ({...}? => ( ( ( rule__TableQuestion__IsOptionalAssignment_2_1 ) ) ) )
                    {
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1826:4: ({...}? => ( ( ( rule__TableQuestion__IsOptionalAssignment_2_1 ) ) ) )
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1827:5: {...}? => ( ( ( rule__TableQuestion__IsOptionalAssignment_2_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableQuestionAccess().getUnorderedGroup_2(), 1) ) {
                        throw new FailedPredicateException(input, "rule__TableQuestion__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableQuestionAccess().getUnorderedGroup_2(), 1)");
                    }
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1827:110: ( ( ( rule__TableQuestion__IsOptionalAssignment_2_1 ) ) )
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1828:6: ( ( rule__TableQuestion__IsOptionalAssignment_2_1 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableQuestionAccess().getUnorderedGroup_2(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1834:6: ( ( rule__TableQuestion__IsOptionalAssignment_2_1 ) )
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1836:7: ( rule__TableQuestion__IsOptionalAssignment_2_1 )
                    {
                     before(grammarAccess.getTableQuestionAccess().getIsOptionalAssignment_2_1()); 
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1837:7: ( rule__TableQuestion__IsOptionalAssignment_2_1 )
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1837:8: rule__TableQuestion__IsOptionalAssignment_2_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__IsOptionalAssignment_2_1_in_rule__TableQuestion__UnorderedGroup_2__Impl3798);
                    rule__TableQuestion__IsOptionalAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTableQuestionAccess().getIsOptionalAssignment_2_1()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTableQuestionAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableQuestion__UnorderedGroup_2__Impl"


    // $ANTLR start "rule__TableQuestion__UnorderedGroup_2__0"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1852:1: rule__TableQuestion__UnorderedGroup_2__0 : rule__TableQuestion__UnorderedGroup_2__Impl ( rule__TableQuestion__UnorderedGroup_2__1 )? ;
    public final void rule__TableQuestion__UnorderedGroup_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1856:1: ( rule__TableQuestion__UnorderedGroup_2__Impl ( rule__TableQuestion__UnorderedGroup_2__1 )? )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1857:2: rule__TableQuestion__UnorderedGroup_2__Impl ( rule__TableQuestion__UnorderedGroup_2__1 )?
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__UnorderedGroup_2__Impl_in_rule__TableQuestion__UnorderedGroup_2__03857);
            rule__TableQuestion__UnorderedGroup_2__Impl();

            state._fsp--;

            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1858:2: ( rule__TableQuestion__UnorderedGroup_2__1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( LA18_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableQuestionAccess().getUnorderedGroup_2(), 0) ) {
                alt18=1;
            }
            else if ( LA18_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableQuestionAccess().getUnorderedGroup_2(), 1) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1858:2: rule__TableQuestion__UnorderedGroup_2__1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__UnorderedGroup_2__1_in_rule__TableQuestion__UnorderedGroup_2__03860);
                    rule__TableQuestion__UnorderedGroup_2__1();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__TableQuestion__UnorderedGroup_2__0"


    // $ANTLR start "rule__TableQuestion__UnorderedGroup_2__1"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1865:1: rule__TableQuestion__UnorderedGroup_2__1 : rule__TableQuestion__UnorderedGroup_2__Impl ;
    public final void rule__TableQuestion__UnorderedGroup_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1869:1: ( rule__TableQuestion__UnorderedGroup_2__Impl )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1870:2: rule__TableQuestion__UnorderedGroup_2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__UnorderedGroup_2__Impl_in_rule__TableQuestion__UnorderedGroup_2__13885);
            rule__TableQuestion__UnorderedGroup_2__Impl();

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
    // $ANTLR end "rule__TableQuestion__UnorderedGroup_2__1"


    // $ANTLR start "rule__Survey__NameAssignment_1"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1881:1: rule__Survey__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Survey__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1885:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1886:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1886:1: ( ruleEString )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1887:1: ruleEString
            {
             before(grammarAccess.getSurveyAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Survey__NameAssignment_13917);
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


    // $ANTLR start "rule__Survey__IntroAssignment_2_1"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1896:1: rule__Survey__IntroAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Survey__IntroAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1900:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1901:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1901:1: ( ruleEString )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1902:1: ruleEString
            {
             before(grammarAccess.getSurveyAccess().getIntroEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Survey__IntroAssignment_2_13948);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSurveyAccess().getIntroEStringParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Survey__IntroAssignment_2_1"


    // $ANTLR start "rule__Survey__QuestionsAssignment_3"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1911:1: rule__Survey__QuestionsAssignment_3 : ( ruleQuestion ) ;
    public final void rule__Survey__QuestionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1915:1: ( ( ruleQuestion ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1916:1: ( ruleQuestion )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1916:1: ( ruleQuestion )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1917:1: ruleQuestion
            {
             before(grammarAccess.getSurveyAccess().getQuestionsQuestionParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_rule__Survey__QuestionsAssignment_33979);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1926:1: rule__Survey__QuestionsAssignment_4 : ( ruleQuestion ) ;
    public final void rule__Survey__QuestionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1930:1: ( ( ruleQuestion ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1931:1: ( ruleQuestion )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1931:1: ( ruleQuestion )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1932:1: ruleQuestion
            {
             before(grammarAccess.getSurveyAccess().getQuestionsQuestionParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_rule__Survey__QuestionsAssignment_44010);
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


    // $ANTLR start "rule__Survey__OutroAssignment_5_1"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1941:1: rule__Survey__OutroAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Survey__OutroAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1945:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1946:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1946:1: ( ruleEString )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1947:1: ruleEString
            {
             before(grammarAccess.getSurveyAccess().getOutroEStringParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Survey__OutroAssignment_5_14041);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSurveyAccess().getOutroEStringParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Survey__OutroAssignment_5_1"


    // $ANTLR start "rule__Question_Impl__NameAssignment_1"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1956:1: rule__Question_Impl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Question_Impl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1960:1: ( ( RULE_ID ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1961:1: ( RULE_ID )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1961:1: ( RULE_ID )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1962:1: RULE_ID
            {
             before(grammarAccess.getQuestion_ImplAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Question_Impl__NameAssignment_14072); 
             after(grammarAccess.getQuestion_ImplAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Question_Impl__NameAssignment_1"


    // $ANTLR start "rule__Question_Impl__IsExclusiveAssignment_2_0"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1971:1: rule__Question_Impl__IsExclusiveAssignment_2_0 : ( ( 'exclusive' ) ) ;
    public final void rule__Question_Impl__IsExclusiveAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1975:1: ( ( ( 'exclusive' ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1976:1: ( ( 'exclusive' ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1976:1: ( ( 'exclusive' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1977:1: ( 'exclusive' )
            {
             before(grammarAccess.getQuestion_ImplAccess().getIsExclusiveExclusiveKeyword_2_0_0()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1978:1: ( 'exclusive' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1979:1: 'exclusive'
            {
             before(grammarAccess.getQuestion_ImplAccess().getIsExclusiveExclusiveKeyword_2_0_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Question_Impl__IsExclusiveAssignment_2_04108); 
             after(grammarAccess.getQuestion_ImplAccess().getIsExclusiveExclusiveKeyword_2_0_0()); 

            }

             after(grammarAccess.getQuestion_ImplAccess().getIsExclusiveExclusiveKeyword_2_0_0()); 

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
    // $ANTLR end "rule__Question_Impl__IsExclusiveAssignment_2_0"


    // $ANTLR start "rule__Question_Impl__IsOptionalAssignment_2_1"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1994:1: rule__Question_Impl__IsOptionalAssignment_2_1 : ( ( 'optional' ) ) ;
    public final void rule__Question_Impl__IsOptionalAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1998:1: ( ( ( 'optional' ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1999:1: ( ( 'optional' ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1999:1: ( ( 'optional' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2000:1: ( 'optional' )
            {
             before(grammarAccess.getQuestion_ImplAccess().getIsOptionalOptionalKeyword_2_1_0()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2001:1: ( 'optional' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2002:1: 'optional'
            {
             before(grammarAccess.getQuestion_ImplAccess().getIsOptionalOptionalKeyword_2_1_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Question_Impl__IsOptionalAssignment_2_14152); 
             after(grammarAccess.getQuestion_ImplAccess().getIsOptionalOptionalKeyword_2_1_0()); 

            }

             after(grammarAccess.getQuestion_ImplAccess().getIsOptionalOptionalKeyword_2_1_0()); 

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
    // $ANTLR end "rule__Question_Impl__IsOptionalAssignment_2_1"


    // $ANTLR start "rule__Question_Impl__BodyAssignment_3"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2017:1: rule__Question_Impl__BodyAssignment_3 : ( ruleEString ) ;
    public final void rule__Question_Impl__BodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2021:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2022:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2022:1: ( ruleEString )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2023:1: ruleEString
            {
             before(grammarAccess.getQuestion_ImplAccess().getBodyEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Question_Impl__BodyAssignment_34191);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestion_ImplAccess().getBodyEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Question_Impl__BodyAssignment_3"


    // $ANTLR start "rule__Question_Impl__AnswersAssignment_5"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2032:1: rule__Question_Impl__AnswersAssignment_5 : ( ruleAnswer ) ;
    public final void rule__Question_Impl__AnswersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2036:1: ( ( ruleAnswer ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2037:1: ( ruleAnswer )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2037:1: ( ruleAnswer )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2038:1: ruleAnswer
            {
             before(grammarAccess.getQuestion_ImplAccess().getAnswersAnswerParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__Question_Impl__AnswersAssignment_54222);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getQuestion_ImplAccess().getAnswersAnswerParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Question_Impl__AnswersAssignment_5"


    // $ANTLR start "rule__Question_Impl__AnswersAssignment_6"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2047:1: rule__Question_Impl__AnswersAssignment_6 : ( ruleAnswer ) ;
    public final void rule__Question_Impl__AnswersAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2051:1: ( ( ruleAnswer ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2052:1: ( ruleAnswer )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2052:1: ( ruleAnswer )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2053:1: ruleAnswer
            {
             before(grammarAccess.getQuestion_ImplAccess().getAnswersAnswerParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__Question_Impl__AnswersAssignment_64253);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getQuestion_ImplAccess().getAnswersAnswerParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Question_Impl__AnswersAssignment_6"


    // $ANTLR start "rule__Answer__IsFreeTextAssignment_1"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2062:1: rule__Answer__IsFreeTextAssignment_1 : ( ( 'freetext' ) ) ;
    public final void rule__Answer__IsFreeTextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2066:1: ( ( ( 'freetext' ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2067:1: ( ( 'freetext' ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2067:1: ( ( 'freetext' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2068:1: ( 'freetext' )
            {
             before(grammarAccess.getAnswerAccess().getIsFreeTextFreetextKeyword_1_0()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2069:1: ( 'freetext' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2070:1: 'freetext'
            {
             before(grammarAccess.getAnswerAccess().getIsFreeTextFreetextKeyword_1_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Answer__IsFreeTextAssignment_14289); 
             after(grammarAccess.getAnswerAccess().getIsFreeTextFreetextKeyword_1_0()); 

            }

             after(grammarAccess.getAnswerAccess().getIsFreeTextFreetextKeyword_1_0()); 

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


    // $ANTLR start "rule__Answer__BodyAssignment_2"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2085:1: rule__Answer__BodyAssignment_2 : ( ruleEString ) ;
    public final void rule__Answer__BodyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2089:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2090:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2090:1: ( ruleEString )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2091:1: ruleEString
            {
             before(grammarAccess.getAnswerAccess().getBodyEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Answer__BodyAssignment_24328);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAnswerAccess().getBodyEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Answer__BodyAssignment_2"


    // $ANTLR start "rule__Answer__FollowupAssignment_3_1"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2100:1: rule__Answer__FollowupAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Answer__FollowupAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2104:1: ( ( ( ruleEString ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2105:1: ( ( ruleEString ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2105:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2106:1: ( ruleEString )
            {
             before(grammarAccess.getAnswerAccess().getFollowupQuestionCrossReference_3_1_0()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2107:1: ( ruleEString )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2108:1: ruleEString
            {
             before(grammarAccess.getAnswerAccess().getFollowupQuestionEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Answer__FollowupAssignment_3_14363);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAnswerAccess().getFollowupQuestionEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getAnswerAccess().getFollowupQuestionCrossReference_3_1_0()); 

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


    // $ANTLR start "rule__Answer__FollowupAssignment_3_2_1"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2119:1: rule__Answer__FollowupAssignment_3_2_1 : ( ( ruleEString ) ) ;
    public final void rule__Answer__FollowupAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2123:1: ( ( ( ruleEString ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2124:1: ( ( ruleEString ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2124:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2125:1: ( ruleEString )
            {
             before(grammarAccess.getAnswerAccess().getFollowupQuestionCrossReference_3_2_1_0()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2126:1: ( ruleEString )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2127:1: ruleEString
            {
             before(grammarAccess.getAnswerAccess().getFollowupQuestionEStringParserRuleCall_3_2_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Answer__FollowupAssignment_3_2_14402);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAnswerAccess().getFollowupQuestionEStringParserRuleCall_3_2_1_0_1()); 

            }

             after(grammarAccess.getAnswerAccess().getFollowupQuestionCrossReference_3_2_1_0()); 

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
    // $ANTLR end "rule__Answer__FollowupAssignment_3_2_1"


    // $ANTLR start "rule__TableQuestion__NameAssignment_1"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2138:1: rule__TableQuestion__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TableQuestion__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2142:1: ( ( RULE_ID ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2143:1: ( RULE_ID )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2143:1: ( RULE_ID )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2144:1: RULE_ID
            {
             before(grammarAccess.getTableQuestionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__TableQuestion__NameAssignment_14437); 
             after(grammarAccess.getTableQuestionAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__TableQuestion__NameAssignment_1"


    // $ANTLR start "rule__TableQuestion__IsExclusiveAssignment_2_0"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2153:1: rule__TableQuestion__IsExclusiveAssignment_2_0 : ( ( 'exclusive' ) ) ;
    public final void rule__TableQuestion__IsExclusiveAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2157:1: ( ( ( 'exclusive' ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2158:1: ( ( 'exclusive' ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2158:1: ( ( 'exclusive' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2159:1: ( 'exclusive' )
            {
             before(grammarAccess.getTableQuestionAccess().getIsExclusiveExclusiveKeyword_2_0_0()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2160:1: ( 'exclusive' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2161:1: 'exclusive'
            {
             before(grammarAccess.getTableQuestionAccess().getIsExclusiveExclusiveKeyword_2_0_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__TableQuestion__IsExclusiveAssignment_2_04473); 
             after(grammarAccess.getTableQuestionAccess().getIsExclusiveExclusiveKeyword_2_0_0()); 

            }

             after(grammarAccess.getTableQuestionAccess().getIsExclusiveExclusiveKeyword_2_0_0()); 

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
    // $ANTLR end "rule__TableQuestion__IsExclusiveAssignment_2_0"


    // $ANTLR start "rule__TableQuestion__IsOptionalAssignment_2_1"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2176:1: rule__TableQuestion__IsOptionalAssignment_2_1 : ( ( 'optional' ) ) ;
    public final void rule__TableQuestion__IsOptionalAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2180:1: ( ( ( 'optional' ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2181:1: ( ( 'optional' ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2181:1: ( ( 'optional' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2182:1: ( 'optional' )
            {
             before(grammarAccess.getTableQuestionAccess().getIsOptionalOptionalKeyword_2_1_0()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2183:1: ( 'optional' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2184:1: 'optional'
            {
             before(grammarAccess.getTableQuestionAccess().getIsOptionalOptionalKeyword_2_1_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__TableQuestion__IsOptionalAssignment_2_14517); 
             after(grammarAccess.getTableQuestionAccess().getIsOptionalOptionalKeyword_2_1_0()); 

            }

             after(grammarAccess.getTableQuestionAccess().getIsOptionalOptionalKeyword_2_1_0()); 

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
    // $ANTLR end "rule__TableQuestion__IsOptionalAssignment_2_1"


    // $ANTLR start "rule__TableQuestion__BodyAssignment_3"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2199:1: rule__TableQuestion__BodyAssignment_3 : ( ruleEString ) ;
    public final void rule__TableQuestion__BodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2203:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2204:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2204:1: ( ruleEString )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2205:1: ruleEString
            {
             before(grammarAccess.getTableQuestionAccess().getBodyEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TableQuestion__BodyAssignment_34556);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTableQuestionAccess().getBodyEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__TableQuestion__BodyAssignment_3"


    // $ANTLR start "rule__TableQuestion__ItemsAssignment_7"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2214:1: rule__TableQuestion__ItemsAssignment_7 : ( ruleItem ) ;
    public final void rule__TableQuestion__ItemsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2218:1: ( ( ruleItem ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2219:1: ( ruleItem )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2219:1: ( ruleItem )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2220:1: ruleItem
            {
             before(grammarAccess.getTableQuestionAccess().getItemsItemParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleItem_in_rule__TableQuestion__ItemsAssignment_74587);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getTableQuestionAccess().getItemsItemParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__TableQuestion__ItemsAssignment_7"


    // $ANTLR start "rule__TableQuestion__ItemsAssignment_8_1"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2229:1: rule__TableQuestion__ItemsAssignment_8_1 : ( ruleItem ) ;
    public final void rule__TableQuestion__ItemsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2233:1: ( ( ruleItem ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2234:1: ( ruleItem )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2234:1: ( ruleItem )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2235:1: ruleItem
            {
             before(grammarAccess.getTableQuestionAccess().getItemsItemParserRuleCall_8_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleItem_in_rule__TableQuestion__ItemsAssignment_8_14618);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getTableQuestionAccess().getItemsItemParserRuleCall_8_1_0()); 

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
    // $ANTLR end "rule__TableQuestion__ItemsAssignment_8_1"


    // $ANTLR start "rule__TableQuestion__AnswersAssignment_10"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2244:1: rule__TableQuestion__AnswersAssignment_10 : ( ruleAnswer ) ;
    public final void rule__TableQuestion__AnswersAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2248:1: ( ( ruleAnswer ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2249:1: ( ruleAnswer )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2249:1: ( ruleAnswer )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2250:1: ruleAnswer
            {
             before(grammarAccess.getTableQuestionAccess().getAnswersAnswerParserRuleCall_10_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__TableQuestion__AnswersAssignment_104649);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getTableQuestionAccess().getAnswersAnswerParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__TableQuestion__AnswersAssignment_10"


    // $ANTLR start "rule__TableQuestion__AnswersAssignment_11"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2259:1: rule__TableQuestion__AnswersAssignment_11 : ( ruleAnswer ) ;
    public final void rule__TableQuestion__AnswersAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2263:1: ( ( ruleAnswer ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2264:1: ( ruleAnswer )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2264:1: ( ruleAnswer )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2265:1: ruleAnswer
            {
             before(grammarAccess.getTableQuestionAccess().getAnswersAnswerParserRuleCall_11_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__TableQuestion__AnswersAssignment_114680);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getTableQuestionAccess().getAnswersAnswerParserRuleCall_11_0()); 

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
    // $ANTLR end "rule__TableQuestion__AnswersAssignment_11"


    // $ANTLR start "rule__Item__IsFreeTextAssignment_0"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2274:1: rule__Item__IsFreeTextAssignment_0 : ( ( 'freetext' ) ) ;
    public final void rule__Item__IsFreeTextAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2278:1: ( ( ( 'freetext' ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2279:1: ( ( 'freetext' ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2279:1: ( ( 'freetext' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2280:1: ( 'freetext' )
            {
             before(grammarAccess.getItemAccess().getIsFreeTextFreetextKeyword_0_0()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2281:1: ( 'freetext' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2282:1: 'freetext'
            {
             before(grammarAccess.getItemAccess().getIsFreeTextFreetextKeyword_0_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Item__IsFreeTextAssignment_04716); 
             after(grammarAccess.getItemAccess().getIsFreeTextFreetextKeyword_0_0()); 

            }

             after(grammarAccess.getItemAccess().getIsFreeTextFreetextKeyword_0_0()); 

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
    // $ANTLR end "rule__Item__IsFreeTextAssignment_0"


    // $ANTLR start "rule__Item__BodyAssignment_1"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2297:1: rule__Item__BodyAssignment_1 : ( ruleEString ) ;
    public final void rule__Item__BodyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2301:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2302:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2302:1: ( ruleEString )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2303:1: ruleEString
            {
             before(grammarAccess.getItemAccess().getBodyEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Item__BodyAssignment_14755);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getItemAccess().getBodyEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Item__BodyAssignment_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleSurvey_in_entryRuleSurvey61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSurvey68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__0_in_ruleSurvey94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuestion128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__Alternatives_in_ruleQuestion154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_Impl_in_entryRuleQuestion_Impl241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuestion_Impl248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question_Impl__Group__0_in_ruleQuestion_Impl274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_entryRuleAnswer301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswer308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group__0_in_ruleAnswer334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTableQuestion_in_entryRuleTableQuestion361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTableQuestion368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__0_in_ruleTableQuestion394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleItem_in_entryRuleItem421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleItem428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Item__Group__0_in_ruleItem454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_Impl_in_rule__Question__Alternatives490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTableQuestion_in_rule__Question__Alternatives507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__0__Impl_in_rule__Survey__Group__0586 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Survey__Group__1_in_rule__Survey__Group__0589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Survey__Group__0__Impl617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__1__Impl_in_rule__Survey__Group__1648 = new BitSet(new long[]{0x0000000000105000L});
        public static final BitSet FOLLOW_rule__Survey__Group__2_in_rule__Survey__Group__1651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__NameAssignment_1_in_rule__Survey__Group__1__Impl678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__2__Impl_in_rule__Survey__Group__2708 = new BitSet(new long[]{0x0000000000105000L});
        public static final BitSet FOLLOW_rule__Survey__Group__3_in_rule__Survey__Group__2711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group_2__0_in_rule__Survey__Group__2__Impl738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__3__Impl_in_rule__Survey__Group__3769 = new BitSet(new long[]{0x0000000000107000L});
        public static final BitSet FOLLOW_rule__Survey__Group__4_in_rule__Survey__Group__3772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__QuestionsAssignment_3_in_rule__Survey__Group__3__Impl799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__4__Impl_in_rule__Survey__Group__4829 = new BitSet(new long[]{0x0000000000107000L});
        public static final BitSet FOLLOW_rule__Survey__Group__5_in_rule__Survey__Group__4832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__QuestionsAssignment_4_in_rule__Survey__Group__4__Impl859 = new BitSet(new long[]{0x0000000000105002L});
        public static final BitSet FOLLOW_rule__Survey__Group__5__Impl_in_rule__Survey__Group__5890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group_5__0_in_rule__Survey__Group__5__Impl917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group_2__0__Impl_in_rule__Survey__Group_2__0960 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Survey__Group_2__1_in_rule__Survey__Group_2__0963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Survey__Group_2__0__Impl991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group_2__1__Impl_in_rule__Survey__Group_2__11022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__IntroAssignment_2_1_in_rule__Survey__Group_2__1__Impl1049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group_5__0__Impl_in_rule__Survey__Group_5__01083 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Survey__Group_5__1_in_rule__Survey__Group_5__01086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Survey__Group_5__0__Impl1114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group_5__1__Impl_in_rule__Survey__Group_5__11145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__OutroAssignment_5_1_in_rule__Survey__Group_5__1__Impl1172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question_Impl__Group__0__Impl_in_rule__Question_Impl__Group__01206 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Question_Impl__Group__1_in_rule__Question_Impl__Group__01209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Question_Impl__Group__0__Impl1237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question_Impl__Group__1__Impl_in_rule__Question_Impl__Group__11268 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_rule__Question_Impl__Group__2_in_rule__Question_Impl__Group__11271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question_Impl__NameAssignment_1_in_rule__Question_Impl__Group__1__Impl1298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question_Impl__Group__2__Impl_in_rule__Question_Impl__Group__21328 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Question_Impl__Group__3_in_rule__Question_Impl__Group__21331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question_Impl__UnorderedGroup_2_in_rule__Question_Impl__Group__2__Impl1358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question_Impl__Group__3__Impl_in_rule__Question_Impl__Group__31388 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Question_Impl__Group__4_in_rule__Question_Impl__Group__31391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question_Impl__BodyAssignment_3_in_rule__Question_Impl__Group__3__Impl1418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question_Impl__Group__4__Impl_in_rule__Question_Impl__Group__41448 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Question_Impl__Group__5_in_rule__Question_Impl__Group__41451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Question_Impl__Group__4__Impl1479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question_Impl__Group__5__Impl_in_rule__Question_Impl__Group__51510 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_rule__Question_Impl__Group__6_in_rule__Question_Impl__Group__51513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question_Impl__AnswersAssignment_5_in_rule__Question_Impl__Group__5__Impl1540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question_Impl__Group__6__Impl_in_rule__Question_Impl__Group__61570 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_rule__Question_Impl__Group__7_in_rule__Question_Impl__Group__61573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question_Impl__AnswersAssignment_6_in_rule__Question_Impl__Group__6__Impl1600 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__Question_Impl__Group__7__Impl_in_rule__Question_Impl__Group__71631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Question_Impl__Group__7__Impl1659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group__0__Impl_in_rule__Answer__Group__01706 = new BitSet(new long[]{0x0000000001000030L});
        public static final BitSet FOLLOW_rule__Answer__Group__1_in_rule__Answer__Group__01709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Answer__Group__0__Impl1737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group__1__Impl_in_rule__Answer__Group__11768 = new BitSet(new long[]{0x0000000001000030L});
        public static final BitSet FOLLOW_rule__Answer__Group__2_in_rule__Answer__Group__11771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__IsFreeTextAssignment_1_in_rule__Answer__Group__1__Impl1798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group__2__Impl_in_rule__Answer__Group__21829 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Answer__Group__3_in_rule__Answer__Group__21832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__BodyAssignment_2_in_rule__Answer__Group__2__Impl1859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group__3__Impl_in_rule__Answer__Group__31889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group_3__0_in_rule__Answer__Group__3__Impl1916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group_3__0__Impl_in_rule__Answer__Group_3__01955 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Answer__Group_3__1_in_rule__Answer__Group_3__01958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Answer__Group_3__0__Impl1986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group_3__1__Impl_in_rule__Answer__Group_3__12017 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Answer__Group_3__2_in_rule__Answer__Group_3__12020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__FollowupAssignment_3_1_in_rule__Answer__Group_3__1__Impl2047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group_3__2__Impl_in_rule__Answer__Group_3__22077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group_3_2__0_in_rule__Answer__Group_3__2__Impl2104 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__Answer__Group_3_2__0__Impl_in_rule__Answer__Group_3_2__02141 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Answer__Group_3_2__1_in_rule__Answer__Group_3_2__02144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Answer__Group_3_2__0__Impl2172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group_3_2__1__Impl_in_rule__Answer__Group_3_2__12203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__FollowupAssignment_3_2_1_in_rule__Answer__Group_3_2__1__Impl2230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__0__Impl_in_rule__TableQuestion__Group__02264 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__1_in_rule__TableQuestion__Group__02267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__TableQuestion__Group__0__Impl2295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__1__Impl_in_rule__TableQuestion__Group__12326 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__2_in_rule__TableQuestion__Group__12329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__NameAssignment_1_in_rule__TableQuestion__Group__1__Impl2356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__2__Impl_in_rule__TableQuestion__Group__22386 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__3_in_rule__TableQuestion__Group__22389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__UnorderedGroup_2_in_rule__TableQuestion__Group__2__Impl2416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__3__Impl_in_rule__TableQuestion__Group__32446 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__4_in_rule__TableQuestion__Group__32449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__BodyAssignment_3_in_rule__TableQuestion__Group__3__Impl2476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__4__Impl_in_rule__TableQuestion__Group__42506 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__5_in_rule__TableQuestion__Group__42509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__TableQuestion__Group__4__Impl2537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__5__Impl_in_rule__TableQuestion__Group__52568 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__6_in_rule__TableQuestion__Group__52571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__TableQuestion__Group__5__Impl2599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__6__Impl_in_rule__TableQuestion__Group__62630 = new BitSet(new long[]{0x0000000001000030L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__7_in_rule__TableQuestion__Group__62633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__TableQuestion__Group__6__Impl2661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__7__Impl_in_rule__TableQuestion__Group__72692 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__8_in_rule__TableQuestion__Group__72695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__ItemsAssignment_7_in_rule__TableQuestion__Group__7__Impl2722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__8__Impl_in_rule__TableQuestion__Group__82752 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__9_in_rule__TableQuestion__Group__82755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group_8__0_in_rule__TableQuestion__Group__8__Impl2782 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__9__Impl_in_rule__TableQuestion__Group__92813 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__10_in_rule__TableQuestion__Group__92816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__TableQuestion__Group__9__Impl2844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__10__Impl_in_rule__TableQuestion__Group__102875 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__11_in_rule__TableQuestion__Group__102878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__AnswersAssignment_10_in_rule__TableQuestion__Group__10__Impl2905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__11__Impl_in_rule__TableQuestion__Group__112935 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__12_in_rule__TableQuestion__Group__112938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__AnswersAssignment_11_in_rule__TableQuestion__Group__11__Impl2965 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__12__Impl_in_rule__TableQuestion__Group__122996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__TableQuestion__Group__12__Impl3024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group_8__0__Impl_in_rule__TableQuestion__Group_8__03081 = new BitSet(new long[]{0x0000000001000030L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group_8__1_in_rule__TableQuestion__Group_8__03084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__TableQuestion__Group_8__0__Impl3112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group_8__1__Impl_in_rule__TableQuestion__Group_8__13143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__ItemsAssignment_8_1_in_rule__TableQuestion__Group_8__1__Impl3170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Item__Group__0__Impl_in_rule__Item__Group__03204 = new BitSet(new long[]{0x0000000001000030L});
        public static final BitSet FOLLOW_rule__Item__Group__1_in_rule__Item__Group__03207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Item__IsFreeTextAssignment_0_in_rule__Item__Group__0__Impl3234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Item__Group__1__Impl_in_rule__Item__Group__13265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Item__BodyAssignment_1_in_rule__Item__Group__1__Impl3292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question_Impl__UnorderedGroup_2__0_in_rule__Question_Impl__UnorderedGroup_23327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question_Impl__IsExclusiveAssignment_2_0_in_rule__Question_Impl__UnorderedGroup_2__Impl3414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question_Impl__IsOptionalAssignment_2_1_in_rule__Question_Impl__UnorderedGroup_2__Impl3505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question_Impl__UnorderedGroup_2__Impl_in_rule__Question_Impl__UnorderedGroup_2__03564 = new BitSet(new long[]{0x0000000000C00002L});
        public static final BitSet FOLLOW_rule__Question_Impl__UnorderedGroup_2__1_in_rule__Question_Impl__UnorderedGroup_2__03567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question_Impl__UnorderedGroup_2__Impl_in_rule__Question_Impl__UnorderedGroup_2__13592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__UnorderedGroup_2__0_in_rule__TableQuestion__UnorderedGroup_23620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__IsExclusiveAssignment_2_0_in_rule__TableQuestion__UnorderedGroup_2__Impl3707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__IsOptionalAssignment_2_1_in_rule__TableQuestion__UnorderedGroup_2__Impl3798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__UnorderedGroup_2__Impl_in_rule__TableQuestion__UnorderedGroup_2__03857 = new BitSet(new long[]{0x0000000000C00002L});
        public static final BitSet FOLLOW_rule__TableQuestion__UnorderedGroup_2__1_in_rule__TableQuestion__UnorderedGroup_2__03860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__UnorderedGroup_2__Impl_in_rule__TableQuestion__UnorderedGroup_2__13885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Survey__NameAssignment_13917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Survey__IntroAssignment_2_13948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_rule__Survey__QuestionsAssignment_33979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_rule__Survey__QuestionsAssignment_44010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Survey__OutroAssignment_5_14041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Question_Impl__NameAssignment_14072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Question_Impl__IsExclusiveAssignment_2_04108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Question_Impl__IsOptionalAssignment_2_14152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Question_Impl__BodyAssignment_34191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__Question_Impl__AnswersAssignment_54222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__Question_Impl__AnswersAssignment_64253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Answer__IsFreeTextAssignment_14289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Answer__BodyAssignment_24328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Answer__FollowupAssignment_3_14363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Answer__FollowupAssignment_3_2_14402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__TableQuestion__NameAssignment_14437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__TableQuestion__IsExclusiveAssignment_2_04473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__TableQuestion__IsOptionalAssignment_2_14517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TableQuestion__BodyAssignment_34556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleItem_in_rule__TableQuestion__ItemsAssignment_74587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleItem_in_rule__TableQuestion__ItemsAssignment_8_14618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__TableQuestion__AnswersAssignment_104649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__TableQuestion__AnswersAssignment_114680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Item__IsFreeTextAssignment_04716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Item__BodyAssignment_14755 = new BitSet(new long[]{0x0000000000000002L});
    }


}