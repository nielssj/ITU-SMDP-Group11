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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:687:1: rule__Question_Impl__Group__2__Impl : ( ( rule__Question_Impl__IsExclusiveAssignment_2 )? ) ;
    public final void rule__Question_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:691:1: ( ( ( rule__Question_Impl__IsExclusiveAssignment_2 )? ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:692:1: ( ( rule__Question_Impl__IsExclusiveAssignment_2 )? )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:692:1: ( ( rule__Question_Impl__IsExclusiveAssignment_2 )? )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:693:1: ( rule__Question_Impl__IsExclusiveAssignment_2 )?
            {
             before(grammarAccess.getQuestion_ImplAccess().getIsExclusiveAssignment_2()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:694:1: ( rule__Question_Impl__IsExclusiveAssignment_2 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:694:2: rule__Question_Impl__IsExclusiveAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__IsExclusiveAssignment_2_in_rule__Question_Impl__Group__2__Impl1358);
                    rule__Question_Impl__IsExclusiveAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestion_ImplAccess().getIsExclusiveAssignment_2()); 

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
            pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__Group__3__Impl_in_rule__Question_Impl__Group__31389);
            rule__Question_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__Group__4_in_rule__Question_Impl__Group__31392);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:716:1: rule__Question_Impl__Group__3__Impl : ( ( rule__Question_Impl__IsOptionalAssignment_3 )? ) ;
    public final void rule__Question_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:720:1: ( ( ( rule__Question_Impl__IsOptionalAssignment_3 )? ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:721:1: ( ( rule__Question_Impl__IsOptionalAssignment_3 )? )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:721:1: ( ( rule__Question_Impl__IsOptionalAssignment_3 )? )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:722:1: ( rule__Question_Impl__IsOptionalAssignment_3 )?
            {
             before(grammarAccess.getQuestion_ImplAccess().getIsOptionalAssignment_3()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:723:1: ( rule__Question_Impl__IsOptionalAssignment_3 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:723:2: rule__Question_Impl__IsOptionalAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__IsOptionalAssignment_3_in_rule__Question_Impl__Group__3__Impl1419);
                    rule__Question_Impl__IsOptionalAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestion_ImplAccess().getIsOptionalAssignment_3()); 

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
            pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__Group__4__Impl_in_rule__Question_Impl__Group__41450);
            rule__Question_Impl__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__Group__5_in_rule__Question_Impl__Group__41453);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:745:1: rule__Question_Impl__Group__4__Impl : ( ( rule__Question_Impl__BodyAssignment_4 ) ) ;
    public final void rule__Question_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:749:1: ( ( ( rule__Question_Impl__BodyAssignment_4 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:750:1: ( ( rule__Question_Impl__BodyAssignment_4 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:750:1: ( ( rule__Question_Impl__BodyAssignment_4 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:751:1: ( rule__Question_Impl__BodyAssignment_4 )
            {
             before(grammarAccess.getQuestion_ImplAccess().getBodyAssignment_4()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:752:1: ( rule__Question_Impl__BodyAssignment_4 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:752:2: rule__Question_Impl__BodyAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__BodyAssignment_4_in_rule__Question_Impl__Group__4__Impl1480);
            rule__Question_Impl__BodyAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getQuestion_ImplAccess().getBodyAssignment_4()); 

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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:762:1: rule__Question_Impl__Group__5 : rule__Question_Impl__Group__5__Impl rule__Question_Impl__Group__6 ;
    public final void rule__Question_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:766:1: ( rule__Question_Impl__Group__5__Impl rule__Question_Impl__Group__6 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:767:2: rule__Question_Impl__Group__5__Impl rule__Question_Impl__Group__6
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:774:1: rule__Question_Impl__Group__5__Impl : ( '(' ) ;
    public final void rule__Question_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:778:1: ( ( '(' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:779:1: ( '(' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:779:1: ( '(' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:780:1: '('
            {
             before(grammarAccess.getQuestion_ImplAccess().getLeftParenthesisKeyword_5()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Question_Impl__Group__5__Impl1541); 
             after(grammarAccess.getQuestion_ImplAccess().getLeftParenthesisKeyword_5()); 

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
            pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__Group__6__Impl_in_rule__Question_Impl__Group__61572);
            rule__Question_Impl__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__Group__7_in_rule__Question_Impl__Group__61575);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:805:1: rule__Question_Impl__Group__6__Impl : ( ( rule__Question_Impl__AnswersAssignment_6 ) ) ;
    public final void rule__Question_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:809:1: ( ( ( rule__Question_Impl__AnswersAssignment_6 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:810:1: ( ( rule__Question_Impl__AnswersAssignment_6 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:810:1: ( ( rule__Question_Impl__AnswersAssignment_6 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:811:1: ( rule__Question_Impl__AnswersAssignment_6 )
            {
             before(grammarAccess.getQuestion_ImplAccess().getAnswersAssignment_6()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:812:1: ( rule__Question_Impl__AnswersAssignment_6 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:812:2: rule__Question_Impl__AnswersAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__AnswersAssignment_6_in_rule__Question_Impl__Group__6__Impl1602);
            rule__Question_Impl__AnswersAssignment_6();

            state._fsp--;


            }

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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:822:1: rule__Question_Impl__Group__7 : rule__Question_Impl__Group__7__Impl rule__Question_Impl__Group__8 ;
    public final void rule__Question_Impl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:826:1: ( rule__Question_Impl__Group__7__Impl rule__Question_Impl__Group__8 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:827:2: rule__Question_Impl__Group__7__Impl rule__Question_Impl__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__Group__7__Impl_in_rule__Question_Impl__Group__71632);
            rule__Question_Impl__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__Group__8_in_rule__Question_Impl__Group__71635);
            rule__Question_Impl__Group__8();

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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:834:1: rule__Question_Impl__Group__7__Impl : ( ( rule__Question_Impl__AnswersAssignment_7 )* ) ;
    public final void rule__Question_Impl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:838:1: ( ( ( rule__Question_Impl__AnswersAssignment_7 )* ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:839:1: ( ( rule__Question_Impl__AnswersAssignment_7 )* )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:839:1: ( ( rule__Question_Impl__AnswersAssignment_7 )* )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:840:1: ( rule__Question_Impl__AnswersAssignment_7 )*
            {
             before(grammarAccess.getQuestion_ImplAccess().getAnswersAssignment_7()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:841:1: ( rule__Question_Impl__AnswersAssignment_7 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:841:2: rule__Question_Impl__AnswersAssignment_7
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__AnswersAssignment_7_in_rule__Question_Impl__Group__7__Impl1662);
            	    rule__Question_Impl__AnswersAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getQuestion_ImplAccess().getAnswersAssignment_7()); 

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


    // $ANTLR start "rule__Question_Impl__Group__8"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:851:1: rule__Question_Impl__Group__8 : rule__Question_Impl__Group__8__Impl ;
    public final void rule__Question_Impl__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:855:1: ( rule__Question_Impl__Group__8__Impl )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:856:2: rule__Question_Impl__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__Group__8__Impl_in_rule__Question_Impl__Group__81693);
            rule__Question_Impl__Group__8__Impl();

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
    // $ANTLR end "rule__Question_Impl__Group__8"


    // $ANTLR start "rule__Question_Impl__Group__8__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:862:1: rule__Question_Impl__Group__8__Impl : ( ')' ) ;
    public final void rule__Question_Impl__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:866:1: ( ( ')' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:867:1: ( ')' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:867:1: ( ')' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:868:1: ')'
            {
             before(grammarAccess.getQuestion_ImplAccess().getRightParenthesisKeyword_8()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Question_Impl__Group__8__Impl1721); 
             after(grammarAccess.getQuestion_ImplAccess().getRightParenthesisKeyword_8()); 

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
    // $ANTLR end "rule__Question_Impl__Group__8__Impl"


    // $ANTLR start "rule__Answer__Group__0"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:899:1: rule__Answer__Group__0 : rule__Answer__Group__0__Impl rule__Answer__Group__1 ;
    public final void rule__Answer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:903:1: ( rule__Answer__Group__0__Impl rule__Answer__Group__1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:904:2: rule__Answer__Group__0__Impl rule__Answer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__0__Impl_in_rule__Answer__Group__01770);
            rule__Answer__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__1_in_rule__Answer__Group__01773);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:911:1: rule__Answer__Group__0__Impl : ( 'Answer' ) ;
    public final void rule__Answer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:915:1: ( ( 'Answer' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:916:1: ( 'Answer' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:916:1: ( 'Answer' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:917:1: 'Answer'
            {
             before(grammarAccess.getAnswerAccess().getAnswerKeyword_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Answer__Group__0__Impl1801); 
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:930:1: rule__Answer__Group__1 : rule__Answer__Group__1__Impl rule__Answer__Group__2 ;
    public final void rule__Answer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:934:1: ( rule__Answer__Group__1__Impl rule__Answer__Group__2 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:935:2: rule__Answer__Group__1__Impl rule__Answer__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__1__Impl_in_rule__Answer__Group__11832);
            rule__Answer__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__2_in_rule__Answer__Group__11835);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:942:1: rule__Answer__Group__1__Impl : ( ( rule__Answer__IsFreeTextAssignment_1 )? ) ;
    public final void rule__Answer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:946:1: ( ( ( rule__Answer__IsFreeTextAssignment_1 )? ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:947:1: ( ( rule__Answer__IsFreeTextAssignment_1 )? )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:947:1: ( ( rule__Answer__IsFreeTextAssignment_1 )? )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:948:1: ( rule__Answer__IsFreeTextAssignment_1 )?
            {
             before(grammarAccess.getAnswerAccess().getIsFreeTextAssignment_1()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:949:1: ( rule__Answer__IsFreeTextAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:949:2: rule__Answer__IsFreeTextAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Answer__IsFreeTextAssignment_1_in_rule__Answer__Group__1__Impl1862);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:959:1: rule__Answer__Group__2 : rule__Answer__Group__2__Impl rule__Answer__Group__3 ;
    public final void rule__Answer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:963:1: ( rule__Answer__Group__2__Impl rule__Answer__Group__3 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:964:2: rule__Answer__Group__2__Impl rule__Answer__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__2__Impl_in_rule__Answer__Group__21893);
            rule__Answer__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__3_in_rule__Answer__Group__21896);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:971:1: rule__Answer__Group__2__Impl : ( ( rule__Answer__BodyAssignment_2 ) ) ;
    public final void rule__Answer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:975:1: ( ( ( rule__Answer__BodyAssignment_2 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:976:1: ( ( rule__Answer__BodyAssignment_2 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:976:1: ( ( rule__Answer__BodyAssignment_2 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:977:1: ( rule__Answer__BodyAssignment_2 )
            {
             before(grammarAccess.getAnswerAccess().getBodyAssignment_2()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:978:1: ( rule__Answer__BodyAssignment_2 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:978:2: rule__Answer__BodyAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__BodyAssignment_2_in_rule__Answer__Group__2__Impl1923);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:988:1: rule__Answer__Group__3 : rule__Answer__Group__3__Impl ;
    public final void rule__Answer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:992:1: ( rule__Answer__Group__3__Impl )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:993:2: rule__Answer__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__3__Impl_in_rule__Answer__Group__31953);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:999:1: rule__Answer__Group__3__Impl : ( ( rule__Answer__Group_3__0 )? ) ;
    public final void rule__Answer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1003:1: ( ( ( rule__Answer__Group_3__0 )? ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1004:1: ( ( rule__Answer__Group_3__0 )? )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1004:1: ( ( rule__Answer__Group_3__0 )? )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1005:1: ( rule__Answer__Group_3__0 )?
            {
             before(grammarAccess.getAnswerAccess().getGroup_3()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1006:1: ( rule__Answer__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1006:2: rule__Answer__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3__0_in_rule__Answer__Group__3__Impl1980);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1024:1: rule__Answer__Group_3__0 : rule__Answer__Group_3__0__Impl rule__Answer__Group_3__1 ;
    public final void rule__Answer__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1028:1: ( rule__Answer__Group_3__0__Impl rule__Answer__Group_3__1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1029:2: rule__Answer__Group_3__0__Impl rule__Answer__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3__0__Impl_in_rule__Answer__Group_3__02019);
            rule__Answer__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3__1_in_rule__Answer__Group_3__02022);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1036:1: rule__Answer__Group_3__0__Impl : ( '->' ) ;
    public final void rule__Answer__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1040:1: ( ( '->' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1041:1: ( '->' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1041:1: ( '->' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1042:1: '->'
            {
             before(grammarAccess.getAnswerAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Answer__Group_3__0__Impl2050); 
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1055:1: rule__Answer__Group_3__1 : rule__Answer__Group_3__1__Impl rule__Answer__Group_3__2 ;
    public final void rule__Answer__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1059:1: ( rule__Answer__Group_3__1__Impl rule__Answer__Group_3__2 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1060:2: rule__Answer__Group_3__1__Impl rule__Answer__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3__1__Impl_in_rule__Answer__Group_3__12081);
            rule__Answer__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3__2_in_rule__Answer__Group_3__12084);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1067:1: rule__Answer__Group_3__1__Impl : ( ( rule__Answer__FollowupAssignment_3_1 ) ) ;
    public final void rule__Answer__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1071:1: ( ( ( rule__Answer__FollowupAssignment_3_1 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1072:1: ( ( rule__Answer__FollowupAssignment_3_1 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1072:1: ( ( rule__Answer__FollowupAssignment_3_1 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1073:1: ( rule__Answer__FollowupAssignment_3_1 )
            {
             before(grammarAccess.getAnswerAccess().getFollowupAssignment_3_1()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1074:1: ( rule__Answer__FollowupAssignment_3_1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1074:2: rule__Answer__FollowupAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__FollowupAssignment_3_1_in_rule__Answer__Group_3__1__Impl2111);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1084:1: rule__Answer__Group_3__2 : rule__Answer__Group_3__2__Impl ;
    public final void rule__Answer__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1088:1: ( rule__Answer__Group_3__2__Impl )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1089:2: rule__Answer__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3__2__Impl_in_rule__Answer__Group_3__22141);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1095:1: rule__Answer__Group_3__2__Impl : ( ( rule__Answer__Group_3_2__0 )* ) ;
    public final void rule__Answer__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1099:1: ( ( ( rule__Answer__Group_3_2__0 )* ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1100:1: ( ( rule__Answer__Group_3_2__0 )* )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1100:1: ( ( rule__Answer__Group_3_2__0 )* )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1101:1: ( rule__Answer__Group_3_2__0 )*
            {
             before(grammarAccess.getAnswerAccess().getGroup_3_2()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1102:1: ( rule__Answer__Group_3_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==19) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1102:2: rule__Answer__Group_3_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3_2__0_in_rule__Answer__Group_3__2__Impl2168);
            	    rule__Answer__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1118:1: rule__Answer__Group_3_2__0 : rule__Answer__Group_3_2__0__Impl rule__Answer__Group_3_2__1 ;
    public final void rule__Answer__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1122:1: ( rule__Answer__Group_3_2__0__Impl rule__Answer__Group_3_2__1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1123:2: rule__Answer__Group_3_2__0__Impl rule__Answer__Group_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3_2__0__Impl_in_rule__Answer__Group_3_2__02205);
            rule__Answer__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3_2__1_in_rule__Answer__Group_3_2__02208);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1130:1: rule__Answer__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Answer__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1134:1: ( ( ',' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1135:1: ( ',' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1135:1: ( ',' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1136:1: ','
            {
             before(grammarAccess.getAnswerAccess().getCommaKeyword_3_2_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Answer__Group_3_2__0__Impl2236); 
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1149:1: rule__Answer__Group_3_2__1 : rule__Answer__Group_3_2__1__Impl ;
    public final void rule__Answer__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1153:1: ( rule__Answer__Group_3_2__1__Impl )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1154:2: rule__Answer__Group_3_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3_2__1__Impl_in_rule__Answer__Group_3_2__12267);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1160:1: rule__Answer__Group_3_2__1__Impl : ( ( rule__Answer__FollowupAssignment_3_2_1 ) ) ;
    public final void rule__Answer__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1164:1: ( ( ( rule__Answer__FollowupAssignment_3_2_1 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1165:1: ( ( rule__Answer__FollowupAssignment_3_2_1 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1165:1: ( ( rule__Answer__FollowupAssignment_3_2_1 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1166:1: ( rule__Answer__FollowupAssignment_3_2_1 )
            {
             before(grammarAccess.getAnswerAccess().getFollowupAssignment_3_2_1()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1167:1: ( rule__Answer__FollowupAssignment_3_2_1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1167:2: rule__Answer__FollowupAssignment_3_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__FollowupAssignment_3_2_1_in_rule__Answer__Group_3_2__1__Impl2294);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1181:1: rule__TableQuestion__Group__0 : rule__TableQuestion__Group__0__Impl rule__TableQuestion__Group__1 ;
    public final void rule__TableQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1185:1: ( rule__TableQuestion__Group__0__Impl rule__TableQuestion__Group__1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1186:2: rule__TableQuestion__Group__0__Impl rule__TableQuestion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__0__Impl_in_rule__TableQuestion__Group__02328);
            rule__TableQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__1_in_rule__TableQuestion__Group__02331);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1193:1: rule__TableQuestion__Group__0__Impl : ( 'TableQuestion' ) ;
    public final void rule__TableQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1197:1: ( ( 'TableQuestion' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1198:1: ( 'TableQuestion' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1198:1: ( 'TableQuestion' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1199:1: 'TableQuestion'
            {
             before(grammarAccess.getTableQuestionAccess().getTableQuestionKeyword_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__TableQuestion__Group__0__Impl2359); 
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1212:1: rule__TableQuestion__Group__1 : rule__TableQuestion__Group__1__Impl rule__TableQuestion__Group__2 ;
    public final void rule__TableQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1216:1: ( rule__TableQuestion__Group__1__Impl rule__TableQuestion__Group__2 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1217:2: rule__TableQuestion__Group__1__Impl rule__TableQuestion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__1__Impl_in_rule__TableQuestion__Group__12390);
            rule__TableQuestion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__2_in_rule__TableQuestion__Group__12393);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1224:1: rule__TableQuestion__Group__1__Impl : ( ( rule__TableQuestion__NameAssignment_1 ) ) ;
    public final void rule__TableQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1228:1: ( ( ( rule__TableQuestion__NameAssignment_1 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1229:1: ( ( rule__TableQuestion__NameAssignment_1 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1229:1: ( ( rule__TableQuestion__NameAssignment_1 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1230:1: ( rule__TableQuestion__NameAssignment_1 )
            {
             before(grammarAccess.getTableQuestionAccess().getNameAssignment_1()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1231:1: ( rule__TableQuestion__NameAssignment_1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1231:2: rule__TableQuestion__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__NameAssignment_1_in_rule__TableQuestion__Group__1__Impl2420);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1241:1: rule__TableQuestion__Group__2 : rule__TableQuestion__Group__2__Impl rule__TableQuestion__Group__3 ;
    public final void rule__TableQuestion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1245:1: ( rule__TableQuestion__Group__2__Impl rule__TableQuestion__Group__3 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1246:2: rule__TableQuestion__Group__2__Impl rule__TableQuestion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__2__Impl_in_rule__TableQuestion__Group__22450);
            rule__TableQuestion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__3_in_rule__TableQuestion__Group__22453);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1253:1: rule__TableQuestion__Group__2__Impl : ( ( rule__TableQuestion__IsExclusiveAssignment_2 )? ) ;
    public final void rule__TableQuestion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1257:1: ( ( ( rule__TableQuestion__IsExclusiveAssignment_2 )? ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1258:1: ( ( rule__TableQuestion__IsExclusiveAssignment_2 )? )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1258:1: ( ( rule__TableQuestion__IsExclusiveAssignment_2 )? )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1259:1: ( rule__TableQuestion__IsExclusiveAssignment_2 )?
            {
             before(grammarAccess.getTableQuestionAccess().getIsExclusiveAssignment_2()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1260:1: ( rule__TableQuestion__IsExclusiveAssignment_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1260:2: rule__TableQuestion__IsExclusiveAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__IsExclusiveAssignment_2_in_rule__TableQuestion__Group__2__Impl2480);
                    rule__TableQuestion__IsExclusiveAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTableQuestionAccess().getIsExclusiveAssignment_2()); 

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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1270:1: rule__TableQuestion__Group__3 : rule__TableQuestion__Group__3__Impl rule__TableQuestion__Group__4 ;
    public final void rule__TableQuestion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1274:1: ( rule__TableQuestion__Group__3__Impl rule__TableQuestion__Group__4 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1275:2: rule__TableQuestion__Group__3__Impl rule__TableQuestion__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__3__Impl_in_rule__TableQuestion__Group__32511);
            rule__TableQuestion__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__4_in_rule__TableQuestion__Group__32514);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1282:1: rule__TableQuestion__Group__3__Impl : ( ( rule__TableQuestion__IsOptionalAssignment_3 )? ) ;
    public final void rule__TableQuestion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1286:1: ( ( ( rule__TableQuestion__IsOptionalAssignment_3 )? ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1287:1: ( ( rule__TableQuestion__IsOptionalAssignment_3 )? )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1287:1: ( ( rule__TableQuestion__IsOptionalAssignment_3 )? )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1288:1: ( rule__TableQuestion__IsOptionalAssignment_3 )?
            {
             before(grammarAccess.getTableQuestionAccess().getIsOptionalAssignment_3()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1289:1: ( rule__TableQuestion__IsOptionalAssignment_3 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1289:2: rule__TableQuestion__IsOptionalAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__IsOptionalAssignment_3_in_rule__TableQuestion__Group__3__Impl2541);
                    rule__TableQuestion__IsOptionalAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTableQuestionAccess().getIsOptionalAssignment_3()); 

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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1299:1: rule__TableQuestion__Group__4 : rule__TableQuestion__Group__4__Impl rule__TableQuestion__Group__5 ;
    public final void rule__TableQuestion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1303:1: ( rule__TableQuestion__Group__4__Impl rule__TableQuestion__Group__5 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1304:2: rule__TableQuestion__Group__4__Impl rule__TableQuestion__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__4__Impl_in_rule__TableQuestion__Group__42572);
            rule__TableQuestion__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__5_in_rule__TableQuestion__Group__42575);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1311:1: rule__TableQuestion__Group__4__Impl : ( ( rule__TableQuestion__BodyAssignment_4 ) ) ;
    public final void rule__TableQuestion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1315:1: ( ( ( rule__TableQuestion__BodyAssignment_4 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1316:1: ( ( rule__TableQuestion__BodyAssignment_4 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1316:1: ( ( rule__TableQuestion__BodyAssignment_4 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1317:1: ( rule__TableQuestion__BodyAssignment_4 )
            {
             before(grammarAccess.getTableQuestionAccess().getBodyAssignment_4()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1318:1: ( rule__TableQuestion__BodyAssignment_4 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1318:2: rule__TableQuestion__BodyAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__BodyAssignment_4_in_rule__TableQuestion__Group__4__Impl2602);
            rule__TableQuestion__BodyAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTableQuestionAccess().getBodyAssignment_4()); 

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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1328:1: rule__TableQuestion__Group__5 : rule__TableQuestion__Group__5__Impl rule__TableQuestion__Group__6 ;
    public final void rule__TableQuestion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1332:1: ( rule__TableQuestion__Group__5__Impl rule__TableQuestion__Group__6 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1333:2: rule__TableQuestion__Group__5__Impl rule__TableQuestion__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__5__Impl_in_rule__TableQuestion__Group__52632);
            rule__TableQuestion__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__6_in_rule__TableQuestion__Group__52635);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1340:1: rule__TableQuestion__Group__5__Impl : ( '(' ) ;
    public final void rule__TableQuestion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1344:1: ( ( '(' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1345:1: ( '(' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1345:1: ( '(' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1346:1: '('
            {
             before(grammarAccess.getTableQuestionAccess().getLeftParenthesisKeyword_5()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__TableQuestion__Group__5__Impl2663); 
             after(grammarAccess.getTableQuestionAccess().getLeftParenthesisKeyword_5()); 

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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1359:1: rule__TableQuestion__Group__6 : rule__TableQuestion__Group__6__Impl rule__TableQuestion__Group__7 ;
    public final void rule__TableQuestion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1363:1: ( rule__TableQuestion__Group__6__Impl rule__TableQuestion__Group__7 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1364:2: rule__TableQuestion__Group__6__Impl rule__TableQuestion__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__6__Impl_in_rule__TableQuestion__Group__62694);
            rule__TableQuestion__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__7_in_rule__TableQuestion__Group__62697);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1371:1: rule__TableQuestion__Group__6__Impl : ( 'Items' ) ;
    public final void rule__TableQuestion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1375:1: ( ( 'Items' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1376:1: ( 'Items' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1376:1: ( 'Items' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1377:1: 'Items'
            {
             before(grammarAccess.getTableQuestionAccess().getItemsKeyword_6()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__TableQuestion__Group__6__Impl2725); 
             after(grammarAccess.getTableQuestionAccess().getItemsKeyword_6()); 

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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1390:1: rule__TableQuestion__Group__7 : rule__TableQuestion__Group__7__Impl rule__TableQuestion__Group__8 ;
    public final void rule__TableQuestion__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1394:1: ( rule__TableQuestion__Group__7__Impl rule__TableQuestion__Group__8 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1395:2: rule__TableQuestion__Group__7__Impl rule__TableQuestion__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__7__Impl_in_rule__TableQuestion__Group__72756);
            rule__TableQuestion__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__8_in_rule__TableQuestion__Group__72759);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1402:1: rule__TableQuestion__Group__7__Impl : ( '(' ) ;
    public final void rule__TableQuestion__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1406:1: ( ( '(' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1407:1: ( '(' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1407:1: ( '(' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1408:1: '('
            {
             before(grammarAccess.getTableQuestionAccess().getLeftParenthesisKeyword_7()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__TableQuestion__Group__7__Impl2787); 
             after(grammarAccess.getTableQuestionAccess().getLeftParenthesisKeyword_7()); 

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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1421:1: rule__TableQuestion__Group__8 : rule__TableQuestion__Group__8__Impl rule__TableQuestion__Group__9 ;
    public final void rule__TableQuestion__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1425:1: ( rule__TableQuestion__Group__8__Impl rule__TableQuestion__Group__9 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1426:2: rule__TableQuestion__Group__8__Impl rule__TableQuestion__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__8__Impl_in_rule__TableQuestion__Group__82818);
            rule__TableQuestion__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__9_in_rule__TableQuestion__Group__82821);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1433:1: rule__TableQuestion__Group__8__Impl : ( ( rule__TableQuestion__ItemsAssignment_8 ) ) ;
    public final void rule__TableQuestion__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1437:1: ( ( ( rule__TableQuestion__ItemsAssignment_8 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1438:1: ( ( rule__TableQuestion__ItemsAssignment_8 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1438:1: ( ( rule__TableQuestion__ItemsAssignment_8 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1439:1: ( rule__TableQuestion__ItemsAssignment_8 )
            {
             before(grammarAccess.getTableQuestionAccess().getItemsAssignment_8()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1440:1: ( rule__TableQuestion__ItemsAssignment_8 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1440:2: rule__TableQuestion__ItemsAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__ItemsAssignment_8_in_rule__TableQuestion__Group__8__Impl2848);
            rule__TableQuestion__ItemsAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getTableQuestionAccess().getItemsAssignment_8()); 

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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1450:1: rule__TableQuestion__Group__9 : rule__TableQuestion__Group__9__Impl rule__TableQuestion__Group__10 ;
    public final void rule__TableQuestion__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1454:1: ( rule__TableQuestion__Group__9__Impl rule__TableQuestion__Group__10 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1455:2: rule__TableQuestion__Group__9__Impl rule__TableQuestion__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__9__Impl_in_rule__TableQuestion__Group__92878);
            rule__TableQuestion__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__10_in_rule__TableQuestion__Group__92881);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1462:1: rule__TableQuestion__Group__9__Impl : ( ( rule__TableQuestion__Group_9__0 )* ) ;
    public final void rule__TableQuestion__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1466:1: ( ( ( rule__TableQuestion__Group_9__0 )* ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1467:1: ( ( rule__TableQuestion__Group_9__0 )* )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1467:1: ( ( rule__TableQuestion__Group_9__0 )* )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1468:1: ( rule__TableQuestion__Group_9__0 )*
            {
             before(grammarAccess.getTableQuestionAccess().getGroup_9()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1469:1: ( rule__TableQuestion__Group_9__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==19) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1469:2: rule__TableQuestion__Group_9__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group_9__0_in_rule__TableQuestion__Group__9__Impl2908);
            	    rule__TableQuestion__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getTableQuestionAccess().getGroup_9()); 

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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1479:1: rule__TableQuestion__Group__10 : rule__TableQuestion__Group__10__Impl rule__TableQuestion__Group__11 ;
    public final void rule__TableQuestion__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1483:1: ( rule__TableQuestion__Group__10__Impl rule__TableQuestion__Group__11 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1484:2: rule__TableQuestion__Group__10__Impl rule__TableQuestion__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__10__Impl_in_rule__TableQuestion__Group__102939);
            rule__TableQuestion__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__11_in_rule__TableQuestion__Group__102942);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1491:1: rule__TableQuestion__Group__10__Impl : ( ')' ) ;
    public final void rule__TableQuestion__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1495:1: ( ( ')' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1496:1: ( ')' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1496:1: ( ')' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1497:1: ')'
            {
             before(grammarAccess.getTableQuestionAccess().getRightParenthesisKeyword_10()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__TableQuestion__Group__10__Impl2970); 
             after(grammarAccess.getTableQuestionAccess().getRightParenthesisKeyword_10()); 

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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1510:1: rule__TableQuestion__Group__11 : rule__TableQuestion__Group__11__Impl rule__TableQuestion__Group__12 ;
    public final void rule__TableQuestion__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1514:1: ( rule__TableQuestion__Group__11__Impl rule__TableQuestion__Group__12 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1515:2: rule__TableQuestion__Group__11__Impl rule__TableQuestion__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__11__Impl_in_rule__TableQuestion__Group__113001);
            rule__TableQuestion__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__12_in_rule__TableQuestion__Group__113004);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1522:1: rule__TableQuestion__Group__11__Impl : ( ( rule__TableQuestion__AnswersAssignment_11 ) ) ;
    public final void rule__TableQuestion__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1526:1: ( ( ( rule__TableQuestion__AnswersAssignment_11 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1527:1: ( ( rule__TableQuestion__AnswersAssignment_11 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1527:1: ( ( rule__TableQuestion__AnswersAssignment_11 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1528:1: ( rule__TableQuestion__AnswersAssignment_11 )
            {
             before(grammarAccess.getTableQuestionAccess().getAnswersAssignment_11()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1529:1: ( rule__TableQuestion__AnswersAssignment_11 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1529:2: rule__TableQuestion__AnswersAssignment_11
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__AnswersAssignment_11_in_rule__TableQuestion__Group__11__Impl3031);
            rule__TableQuestion__AnswersAssignment_11();

            state._fsp--;


            }

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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1539:1: rule__TableQuestion__Group__12 : rule__TableQuestion__Group__12__Impl rule__TableQuestion__Group__13 ;
    public final void rule__TableQuestion__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1543:1: ( rule__TableQuestion__Group__12__Impl rule__TableQuestion__Group__13 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1544:2: rule__TableQuestion__Group__12__Impl rule__TableQuestion__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__12__Impl_in_rule__TableQuestion__Group__123061);
            rule__TableQuestion__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__13_in_rule__TableQuestion__Group__123064);
            rule__TableQuestion__Group__13();

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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1551:1: rule__TableQuestion__Group__12__Impl : ( ( rule__TableQuestion__AnswersAssignment_12 )* ) ;
    public final void rule__TableQuestion__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1555:1: ( ( ( rule__TableQuestion__AnswersAssignment_12 )* ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1556:1: ( ( rule__TableQuestion__AnswersAssignment_12 )* )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1556:1: ( ( rule__TableQuestion__AnswersAssignment_12 )* )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1557:1: ( rule__TableQuestion__AnswersAssignment_12 )*
            {
             before(grammarAccess.getTableQuestionAccess().getAnswersAssignment_12()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1558:1: ( rule__TableQuestion__AnswersAssignment_12 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==17) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1558:2: rule__TableQuestion__AnswersAssignment_12
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__AnswersAssignment_12_in_rule__TableQuestion__Group__12__Impl3091);
            	    rule__TableQuestion__AnswersAssignment_12();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getTableQuestionAccess().getAnswersAssignment_12()); 

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


    // $ANTLR start "rule__TableQuestion__Group__13"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1568:1: rule__TableQuestion__Group__13 : rule__TableQuestion__Group__13__Impl ;
    public final void rule__TableQuestion__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1572:1: ( rule__TableQuestion__Group__13__Impl )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1573:2: rule__TableQuestion__Group__13__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__13__Impl_in_rule__TableQuestion__Group__133122);
            rule__TableQuestion__Group__13__Impl();

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
    // $ANTLR end "rule__TableQuestion__Group__13"


    // $ANTLR start "rule__TableQuestion__Group__13__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1579:1: rule__TableQuestion__Group__13__Impl : ( ')' ) ;
    public final void rule__TableQuestion__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1583:1: ( ( ')' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1584:1: ( ')' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1584:1: ( ')' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1585:1: ')'
            {
             before(grammarAccess.getTableQuestionAccess().getRightParenthesisKeyword_13()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__TableQuestion__Group__13__Impl3150); 
             after(grammarAccess.getTableQuestionAccess().getRightParenthesisKeyword_13()); 

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
    // $ANTLR end "rule__TableQuestion__Group__13__Impl"


    // $ANTLR start "rule__TableQuestion__Group_9__0"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1626:1: rule__TableQuestion__Group_9__0 : rule__TableQuestion__Group_9__0__Impl rule__TableQuestion__Group_9__1 ;
    public final void rule__TableQuestion__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1630:1: ( rule__TableQuestion__Group_9__0__Impl rule__TableQuestion__Group_9__1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1631:2: rule__TableQuestion__Group_9__0__Impl rule__TableQuestion__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group_9__0__Impl_in_rule__TableQuestion__Group_9__03209);
            rule__TableQuestion__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group_9__1_in_rule__TableQuestion__Group_9__03212);
            rule__TableQuestion__Group_9__1();

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
    // $ANTLR end "rule__TableQuestion__Group_9__0"


    // $ANTLR start "rule__TableQuestion__Group_9__0__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1638:1: rule__TableQuestion__Group_9__0__Impl : ( ',' ) ;
    public final void rule__TableQuestion__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1642:1: ( ( ',' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1643:1: ( ',' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1643:1: ( ',' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1644:1: ','
            {
             before(grammarAccess.getTableQuestionAccess().getCommaKeyword_9_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__TableQuestion__Group_9__0__Impl3240); 
             after(grammarAccess.getTableQuestionAccess().getCommaKeyword_9_0()); 

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
    // $ANTLR end "rule__TableQuestion__Group_9__0__Impl"


    // $ANTLR start "rule__TableQuestion__Group_9__1"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1657:1: rule__TableQuestion__Group_9__1 : rule__TableQuestion__Group_9__1__Impl ;
    public final void rule__TableQuestion__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1661:1: ( rule__TableQuestion__Group_9__1__Impl )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1662:2: rule__TableQuestion__Group_9__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group_9__1__Impl_in_rule__TableQuestion__Group_9__13271);
            rule__TableQuestion__Group_9__1__Impl();

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
    // $ANTLR end "rule__TableQuestion__Group_9__1"


    // $ANTLR start "rule__TableQuestion__Group_9__1__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1668:1: rule__TableQuestion__Group_9__1__Impl : ( ( rule__TableQuestion__ItemsAssignment_9_1 ) ) ;
    public final void rule__TableQuestion__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1672:1: ( ( ( rule__TableQuestion__ItemsAssignment_9_1 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1673:1: ( ( rule__TableQuestion__ItemsAssignment_9_1 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1673:1: ( ( rule__TableQuestion__ItemsAssignment_9_1 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1674:1: ( rule__TableQuestion__ItemsAssignment_9_1 )
            {
             before(grammarAccess.getTableQuestionAccess().getItemsAssignment_9_1()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1675:1: ( rule__TableQuestion__ItemsAssignment_9_1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1675:2: rule__TableQuestion__ItemsAssignment_9_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__ItemsAssignment_9_1_in_rule__TableQuestion__Group_9__1__Impl3298);
            rule__TableQuestion__ItemsAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getTableQuestionAccess().getItemsAssignment_9_1()); 

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
    // $ANTLR end "rule__TableQuestion__Group_9__1__Impl"


    // $ANTLR start "rule__Item__Group__0"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1689:1: rule__Item__Group__0 : rule__Item__Group__0__Impl rule__Item__Group__1 ;
    public final void rule__Item__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1693:1: ( rule__Item__Group__0__Impl rule__Item__Group__1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1694:2: rule__Item__Group__0__Impl rule__Item__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Item__Group__0__Impl_in_rule__Item__Group__03332);
            rule__Item__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Item__Group__1_in_rule__Item__Group__03335);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1701:1: rule__Item__Group__0__Impl : ( ( rule__Item__IsFreeTextAssignment_0 )? ) ;
    public final void rule__Item__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1705:1: ( ( ( rule__Item__IsFreeTextAssignment_0 )? ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1706:1: ( ( rule__Item__IsFreeTextAssignment_0 )? )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1706:1: ( ( rule__Item__IsFreeTextAssignment_0 )? )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1707:1: ( rule__Item__IsFreeTextAssignment_0 )?
            {
             before(grammarAccess.getItemAccess().getIsFreeTextAssignment_0()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1708:1: ( rule__Item__IsFreeTextAssignment_0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1708:2: rule__Item__IsFreeTextAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Item__IsFreeTextAssignment_0_in_rule__Item__Group__0__Impl3362);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1718:1: rule__Item__Group__1 : rule__Item__Group__1__Impl ;
    public final void rule__Item__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1722:1: ( rule__Item__Group__1__Impl )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1723:2: rule__Item__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Item__Group__1__Impl_in_rule__Item__Group__13393);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1729:1: rule__Item__Group__1__Impl : ( ( rule__Item__BodyAssignment_1 ) ) ;
    public final void rule__Item__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1733:1: ( ( ( rule__Item__BodyAssignment_1 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1734:1: ( ( rule__Item__BodyAssignment_1 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1734:1: ( ( rule__Item__BodyAssignment_1 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1735:1: ( rule__Item__BodyAssignment_1 )
            {
             before(grammarAccess.getItemAccess().getBodyAssignment_1()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1736:1: ( rule__Item__BodyAssignment_1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1736:2: rule__Item__BodyAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Item__BodyAssignment_1_in_rule__Item__Group__1__Impl3420);
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


    // $ANTLR start "rule__Survey__NameAssignment_1"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1751:1: rule__Survey__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Survey__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1755:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1756:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1756:1: ( ruleEString )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1757:1: ruleEString
            {
             before(grammarAccess.getSurveyAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Survey__NameAssignment_13459);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1766:1: rule__Survey__IntroAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Survey__IntroAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1770:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1771:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1771:1: ( ruleEString )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1772:1: ruleEString
            {
             before(grammarAccess.getSurveyAccess().getIntroEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Survey__IntroAssignment_2_13490);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1781:1: rule__Survey__QuestionsAssignment_3 : ( ruleQuestion ) ;
    public final void rule__Survey__QuestionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1785:1: ( ( ruleQuestion ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1786:1: ( ruleQuestion )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1786:1: ( ruleQuestion )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1787:1: ruleQuestion
            {
             before(grammarAccess.getSurveyAccess().getQuestionsQuestionParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_rule__Survey__QuestionsAssignment_33521);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1796:1: rule__Survey__QuestionsAssignment_4 : ( ruleQuestion ) ;
    public final void rule__Survey__QuestionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1800:1: ( ( ruleQuestion ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1801:1: ( ruleQuestion )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1801:1: ( ruleQuestion )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1802:1: ruleQuestion
            {
             before(grammarAccess.getSurveyAccess().getQuestionsQuestionParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_rule__Survey__QuestionsAssignment_43552);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1811:1: rule__Survey__OutroAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Survey__OutroAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1815:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1816:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1816:1: ( ruleEString )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1817:1: ruleEString
            {
             before(grammarAccess.getSurveyAccess().getOutroEStringParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Survey__OutroAssignment_5_13583);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1826:1: rule__Question_Impl__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Question_Impl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1830:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1831:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1831:1: ( ruleEString )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1832:1: ruleEString
            {
             before(grammarAccess.getQuestion_ImplAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Question_Impl__NameAssignment_13614);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestion_ImplAccess().getNameEStringParserRuleCall_1_0()); 

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


    // $ANTLR start "rule__Question_Impl__IsExclusiveAssignment_2"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1841:1: rule__Question_Impl__IsExclusiveAssignment_2 : ( ( 'exclusive' ) ) ;
    public final void rule__Question_Impl__IsExclusiveAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1845:1: ( ( ( 'exclusive' ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1846:1: ( ( 'exclusive' ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1846:1: ( ( 'exclusive' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1847:1: ( 'exclusive' )
            {
             before(grammarAccess.getQuestion_ImplAccess().getIsExclusiveExclusiveKeyword_2_0()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1848:1: ( 'exclusive' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1849:1: 'exclusive'
            {
             before(grammarAccess.getQuestion_ImplAccess().getIsExclusiveExclusiveKeyword_2_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Question_Impl__IsExclusiveAssignment_23650); 
             after(grammarAccess.getQuestion_ImplAccess().getIsExclusiveExclusiveKeyword_2_0()); 

            }

             after(grammarAccess.getQuestion_ImplAccess().getIsExclusiveExclusiveKeyword_2_0()); 

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
    // $ANTLR end "rule__Question_Impl__IsExclusiveAssignment_2"


    // $ANTLR start "rule__Question_Impl__IsOptionalAssignment_3"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1864:1: rule__Question_Impl__IsOptionalAssignment_3 : ( ( 'optional' ) ) ;
    public final void rule__Question_Impl__IsOptionalAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1868:1: ( ( ( 'optional' ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1869:1: ( ( 'optional' ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1869:1: ( ( 'optional' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1870:1: ( 'optional' )
            {
             before(grammarAccess.getQuestion_ImplAccess().getIsOptionalOptionalKeyword_3_0()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1871:1: ( 'optional' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1872:1: 'optional'
            {
             before(grammarAccess.getQuestion_ImplAccess().getIsOptionalOptionalKeyword_3_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Question_Impl__IsOptionalAssignment_33694); 
             after(grammarAccess.getQuestion_ImplAccess().getIsOptionalOptionalKeyword_3_0()); 

            }

             after(grammarAccess.getQuestion_ImplAccess().getIsOptionalOptionalKeyword_3_0()); 

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
    // $ANTLR end "rule__Question_Impl__IsOptionalAssignment_3"


    // $ANTLR start "rule__Question_Impl__BodyAssignment_4"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1887:1: rule__Question_Impl__BodyAssignment_4 : ( ruleEString ) ;
    public final void rule__Question_Impl__BodyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1891:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1892:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1892:1: ( ruleEString )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1893:1: ruleEString
            {
             before(grammarAccess.getQuestion_ImplAccess().getBodyEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Question_Impl__BodyAssignment_43733);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestion_ImplAccess().getBodyEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Question_Impl__BodyAssignment_4"


    // $ANTLR start "rule__Question_Impl__AnswersAssignment_6"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1902:1: rule__Question_Impl__AnswersAssignment_6 : ( ruleAnswer ) ;
    public final void rule__Question_Impl__AnswersAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1906:1: ( ( ruleAnswer ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1907:1: ( ruleAnswer )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1907:1: ( ruleAnswer )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1908:1: ruleAnswer
            {
             before(grammarAccess.getQuestion_ImplAccess().getAnswersAnswerParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__Question_Impl__AnswersAssignment_63764);
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


    // $ANTLR start "rule__Question_Impl__AnswersAssignment_7"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1917:1: rule__Question_Impl__AnswersAssignment_7 : ( ruleAnswer ) ;
    public final void rule__Question_Impl__AnswersAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1921:1: ( ( ruleAnswer ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1922:1: ( ruleAnswer )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1922:1: ( ruleAnswer )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1923:1: ruleAnswer
            {
             before(grammarAccess.getQuestion_ImplAccess().getAnswersAnswerParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__Question_Impl__AnswersAssignment_73795);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getQuestion_ImplAccess().getAnswersAnswerParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Question_Impl__AnswersAssignment_7"


    // $ANTLR start "rule__Answer__IsFreeTextAssignment_1"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1932:1: rule__Answer__IsFreeTextAssignment_1 : ( ( 'freetext' ) ) ;
    public final void rule__Answer__IsFreeTextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1936:1: ( ( ( 'freetext' ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1937:1: ( ( 'freetext' ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1937:1: ( ( 'freetext' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1938:1: ( 'freetext' )
            {
             before(grammarAccess.getAnswerAccess().getIsFreeTextFreetextKeyword_1_0()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1939:1: ( 'freetext' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1940:1: 'freetext'
            {
             before(grammarAccess.getAnswerAccess().getIsFreeTextFreetextKeyword_1_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Answer__IsFreeTextAssignment_13831); 
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1955:1: rule__Answer__BodyAssignment_2 : ( ruleEString ) ;
    public final void rule__Answer__BodyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1959:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1960:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1960:1: ( ruleEString )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1961:1: ruleEString
            {
             before(grammarAccess.getAnswerAccess().getBodyEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Answer__BodyAssignment_23870);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1970:1: rule__Answer__FollowupAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Answer__FollowupAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1974:1: ( ( ( ruleEString ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1975:1: ( ( ruleEString ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1975:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1976:1: ( ruleEString )
            {
             before(grammarAccess.getAnswerAccess().getFollowupQuestionCrossReference_3_1_0()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1977:1: ( ruleEString )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1978:1: ruleEString
            {
             before(grammarAccess.getAnswerAccess().getFollowupQuestionEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Answer__FollowupAssignment_3_13905);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1989:1: rule__Answer__FollowupAssignment_3_2_1 : ( ( ruleEString ) ) ;
    public final void rule__Answer__FollowupAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1993:1: ( ( ( ruleEString ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1994:1: ( ( ruleEString ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1994:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1995:1: ( ruleEString )
            {
             before(grammarAccess.getAnswerAccess().getFollowupQuestionCrossReference_3_2_1_0()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1996:1: ( ruleEString )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1997:1: ruleEString
            {
             before(grammarAccess.getAnswerAccess().getFollowupQuestionEStringParserRuleCall_3_2_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Answer__FollowupAssignment_3_2_13944);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2008:1: rule__TableQuestion__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__TableQuestion__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2012:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2013:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2013:1: ( ruleEString )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2014:1: ruleEString
            {
             before(grammarAccess.getTableQuestionAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TableQuestion__NameAssignment_13979);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTableQuestionAccess().getNameEStringParserRuleCall_1_0()); 

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


    // $ANTLR start "rule__TableQuestion__IsExclusiveAssignment_2"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2023:1: rule__TableQuestion__IsExclusiveAssignment_2 : ( ( 'exclusive' ) ) ;
    public final void rule__TableQuestion__IsExclusiveAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2027:1: ( ( ( 'exclusive' ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2028:1: ( ( 'exclusive' ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2028:1: ( ( 'exclusive' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2029:1: ( 'exclusive' )
            {
             before(grammarAccess.getTableQuestionAccess().getIsExclusiveExclusiveKeyword_2_0()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2030:1: ( 'exclusive' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2031:1: 'exclusive'
            {
             before(grammarAccess.getTableQuestionAccess().getIsExclusiveExclusiveKeyword_2_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__TableQuestion__IsExclusiveAssignment_24015); 
             after(grammarAccess.getTableQuestionAccess().getIsExclusiveExclusiveKeyword_2_0()); 

            }

             after(grammarAccess.getTableQuestionAccess().getIsExclusiveExclusiveKeyword_2_0()); 

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
    // $ANTLR end "rule__TableQuestion__IsExclusiveAssignment_2"


    // $ANTLR start "rule__TableQuestion__IsOptionalAssignment_3"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2046:1: rule__TableQuestion__IsOptionalAssignment_3 : ( ( 'optional' ) ) ;
    public final void rule__TableQuestion__IsOptionalAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2050:1: ( ( ( 'optional' ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2051:1: ( ( 'optional' ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2051:1: ( ( 'optional' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2052:1: ( 'optional' )
            {
             before(grammarAccess.getTableQuestionAccess().getIsOptionalOptionalKeyword_3_0()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2053:1: ( 'optional' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2054:1: 'optional'
            {
             before(grammarAccess.getTableQuestionAccess().getIsOptionalOptionalKeyword_3_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__TableQuestion__IsOptionalAssignment_34059); 
             after(grammarAccess.getTableQuestionAccess().getIsOptionalOptionalKeyword_3_0()); 

            }

             after(grammarAccess.getTableQuestionAccess().getIsOptionalOptionalKeyword_3_0()); 

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
    // $ANTLR end "rule__TableQuestion__IsOptionalAssignment_3"


    // $ANTLR start "rule__TableQuestion__BodyAssignment_4"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2069:1: rule__TableQuestion__BodyAssignment_4 : ( ruleEString ) ;
    public final void rule__TableQuestion__BodyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2073:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2074:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2074:1: ( ruleEString )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2075:1: ruleEString
            {
             before(grammarAccess.getTableQuestionAccess().getBodyEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TableQuestion__BodyAssignment_44098);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTableQuestionAccess().getBodyEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__TableQuestion__BodyAssignment_4"


    // $ANTLR start "rule__TableQuestion__ItemsAssignment_8"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2084:1: rule__TableQuestion__ItemsAssignment_8 : ( ruleItem ) ;
    public final void rule__TableQuestion__ItemsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2088:1: ( ( ruleItem ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2089:1: ( ruleItem )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2089:1: ( ruleItem )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2090:1: ruleItem
            {
             before(grammarAccess.getTableQuestionAccess().getItemsItemParserRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleItem_in_rule__TableQuestion__ItemsAssignment_84129);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getTableQuestionAccess().getItemsItemParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__TableQuestion__ItemsAssignment_8"


    // $ANTLR start "rule__TableQuestion__ItemsAssignment_9_1"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2099:1: rule__TableQuestion__ItemsAssignment_9_1 : ( ruleItem ) ;
    public final void rule__TableQuestion__ItemsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2103:1: ( ( ruleItem ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2104:1: ( ruleItem )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2104:1: ( ruleItem )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2105:1: ruleItem
            {
             before(grammarAccess.getTableQuestionAccess().getItemsItemParserRuleCall_9_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleItem_in_rule__TableQuestion__ItemsAssignment_9_14160);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getTableQuestionAccess().getItemsItemParserRuleCall_9_1_0()); 

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
    // $ANTLR end "rule__TableQuestion__ItemsAssignment_9_1"


    // $ANTLR start "rule__TableQuestion__AnswersAssignment_11"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2114:1: rule__TableQuestion__AnswersAssignment_11 : ( ruleAnswer ) ;
    public final void rule__TableQuestion__AnswersAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2118:1: ( ( ruleAnswer ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2119:1: ( ruleAnswer )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2119:1: ( ruleAnswer )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2120:1: ruleAnswer
            {
             before(grammarAccess.getTableQuestionAccess().getAnswersAnswerParserRuleCall_11_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__TableQuestion__AnswersAssignment_114191);
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


    // $ANTLR start "rule__TableQuestion__AnswersAssignment_12"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2129:1: rule__TableQuestion__AnswersAssignment_12 : ( ruleAnswer ) ;
    public final void rule__TableQuestion__AnswersAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2133:1: ( ( ruleAnswer ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2134:1: ( ruleAnswer )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2134:1: ( ruleAnswer )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2135:1: ruleAnswer
            {
             before(grammarAccess.getTableQuestionAccess().getAnswersAnswerParserRuleCall_12_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__TableQuestion__AnswersAssignment_124222);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getTableQuestionAccess().getAnswersAnswerParserRuleCall_12_0()); 

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
    // $ANTLR end "rule__TableQuestion__AnswersAssignment_12"


    // $ANTLR start "rule__Item__IsFreeTextAssignment_0"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2144:1: rule__Item__IsFreeTextAssignment_0 : ( ( 'freetext' ) ) ;
    public final void rule__Item__IsFreeTextAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2148:1: ( ( ( 'freetext' ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2149:1: ( ( 'freetext' ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2149:1: ( ( 'freetext' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2150:1: ( 'freetext' )
            {
             before(grammarAccess.getItemAccess().getIsFreeTextFreetextKeyword_0_0()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2151:1: ( 'freetext' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2152:1: 'freetext'
            {
             before(grammarAccess.getItemAccess().getIsFreeTextFreetextKeyword_0_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Item__IsFreeTextAssignment_04258); 
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2167:1: rule__Item__BodyAssignment_1 : ( ruleEString ) ;
    public final void rule__Item__BodyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2171:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2172:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2172:1: ( ruleEString )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2173:1: ruleEString
            {
             before(grammarAccess.getItemAccess().getBodyEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Item__BodyAssignment_14297);
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
        public static final BitSet FOLLOW_rule__Question_Impl__Group__0__Impl_in_rule__Question_Impl__Group__01206 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Question_Impl__Group__1_in_rule__Question_Impl__Group__01209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Question_Impl__Group__0__Impl1237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question_Impl__Group__1__Impl_in_rule__Question_Impl__Group__11268 = new BitSet(new long[]{0x0000000000C00030L});
        public static final BitSet FOLLOW_rule__Question_Impl__Group__2_in_rule__Question_Impl__Group__11271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question_Impl__NameAssignment_1_in_rule__Question_Impl__Group__1__Impl1298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question_Impl__Group__2__Impl_in_rule__Question_Impl__Group__21328 = new BitSet(new long[]{0x0000000000C00030L});
        public static final BitSet FOLLOW_rule__Question_Impl__Group__3_in_rule__Question_Impl__Group__21331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question_Impl__IsExclusiveAssignment_2_in_rule__Question_Impl__Group__2__Impl1358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question_Impl__Group__3__Impl_in_rule__Question_Impl__Group__31389 = new BitSet(new long[]{0x0000000000C00030L});
        public static final BitSet FOLLOW_rule__Question_Impl__Group__4_in_rule__Question_Impl__Group__31392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question_Impl__IsOptionalAssignment_3_in_rule__Question_Impl__Group__3__Impl1419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question_Impl__Group__4__Impl_in_rule__Question_Impl__Group__41450 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Question_Impl__Group__5_in_rule__Question_Impl__Group__41453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question_Impl__BodyAssignment_4_in_rule__Question_Impl__Group__4__Impl1480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question_Impl__Group__5__Impl_in_rule__Question_Impl__Group__51510 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Question_Impl__Group__6_in_rule__Question_Impl__Group__51513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Question_Impl__Group__5__Impl1541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question_Impl__Group__6__Impl_in_rule__Question_Impl__Group__61572 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_rule__Question_Impl__Group__7_in_rule__Question_Impl__Group__61575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question_Impl__AnswersAssignment_6_in_rule__Question_Impl__Group__6__Impl1602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question_Impl__Group__7__Impl_in_rule__Question_Impl__Group__71632 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_rule__Question_Impl__Group__8_in_rule__Question_Impl__Group__71635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question_Impl__AnswersAssignment_7_in_rule__Question_Impl__Group__7__Impl1662 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__Question_Impl__Group__8__Impl_in_rule__Question_Impl__Group__81693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Question_Impl__Group__8__Impl1721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group__0__Impl_in_rule__Answer__Group__01770 = new BitSet(new long[]{0x0000000001000030L});
        public static final BitSet FOLLOW_rule__Answer__Group__1_in_rule__Answer__Group__01773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Answer__Group__0__Impl1801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group__1__Impl_in_rule__Answer__Group__11832 = new BitSet(new long[]{0x0000000001000030L});
        public static final BitSet FOLLOW_rule__Answer__Group__2_in_rule__Answer__Group__11835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__IsFreeTextAssignment_1_in_rule__Answer__Group__1__Impl1862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group__2__Impl_in_rule__Answer__Group__21893 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Answer__Group__3_in_rule__Answer__Group__21896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__BodyAssignment_2_in_rule__Answer__Group__2__Impl1923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group__3__Impl_in_rule__Answer__Group__31953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group_3__0_in_rule__Answer__Group__3__Impl1980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group_3__0__Impl_in_rule__Answer__Group_3__02019 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Answer__Group_3__1_in_rule__Answer__Group_3__02022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Answer__Group_3__0__Impl2050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group_3__1__Impl_in_rule__Answer__Group_3__12081 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Answer__Group_3__2_in_rule__Answer__Group_3__12084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__FollowupAssignment_3_1_in_rule__Answer__Group_3__1__Impl2111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group_3__2__Impl_in_rule__Answer__Group_3__22141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group_3_2__0_in_rule__Answer__Group_3__2__Impl2168 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__Answer__Group_3_2__0__Impl_in_rule__Answer__Group_3_2__02205 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Answer__Group_3_2__1_in_rule__Answer__Group_3_2__02208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Answer__Group_3_2__0__Impl2236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group_3_2__1__Impl_in_rule__Answer__Group_3_2__12267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__FollowupAssignment_3_2_1_in_rule__Answer__Group_3_2__1__Impl2294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__0__Impl_in_rule__TableQuestion__Group__02328 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__1_in_rule__TableQuestion__Group__02331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__TableQuestion__Group__0__Impl2359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__1__Impl_in_rule__TableQuestion__Group__12390 = new BitSet(new long[]{0x0000000000C00030L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__2_in_rule__TableQuestion__Group__12393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__NameAssignment_1_in_rule__TableQuestion__Group__1__Impl2420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__2__Impl_in_rule__TableQuestion__Group__22450 = new BitSet(new long[]{0x0000000000C00030L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__3_in_rule__TableQuestion__Group__22453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__IsExclusiveAssignment_2_in_rule__TableQuestion__Group__2__Impl2480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__3__Impl_in_rule__TableQuestion__Group__32511 = new BitSet(new long[]{0x0000000000C00030L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__4_in_rule__TableQuestion__Group__32514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__IsOptionalAssignment_3_in_rule__TableQuestion__Group__3__Impl2541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__4__Impl_in_rule__TableQuestion__Group__42572 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__5_in_rule__TableQuestion__Group__42575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__BodyAssignment_4_in_rule__TableQuestion__Group__4__Impl2602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__5__Impl_in_rule__TableQuestion__Group__52632 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__6_in_rule__TableQuestion__Group__52635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__TableQuestion__Group__5__Impl2663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__6__Impl_in_rule__TableQuestion__Group__62694 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__7_in_rule__TableQuestion__Group__62697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__TableQuestion__Group__6__Impl2725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__7__Impl_in_rule__TableQuestion__Group__72756 = new BitSet(new long[]{0x0000000001000030L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__8_in_rule__TableQuestion__Group__72759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__TableQuestion__Group__7__Impl2787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__8__Impl_in_rule__TableQuestion__Group__82818 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__9_in_rule__TableQuestion__Group__82821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__ItemsAssignment_8_in_rule__TableQuestion__Group__8__Impl2848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__9__Impl_in_rule__TableQuestion__Group__92878 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__10_in_rule__TableQuestion__Group__92881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group_9__0_in_rule__TableQuestion__Group__9__Impl2908 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__10__Impl_in_rule__TableQuestion__Group__102939 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__11_in_rule__TableQuestion__Group__102942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__TableQuestion__Group__10__Impl2970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__11__Impl_in_rule__TableQuestion__Group__113001 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__12_in_rule__TableQuestion__Group__113004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__AnswersAssignment_11_in_rule__TableQuestion__Group__11__Impl3031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__12__Impl_in_rule__TableQuestion__Group__123061 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__13_in_rule__TableQuestion__Group__123064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__AnswersAssignment_12_in_rule__TableQuestion__Group__12__Impl3091 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__13__Impl_in_rule__TableQuestion__Group__133122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__TableQuestion__Group__13__Impl3150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group_9__0__Impl_in_rule__TableQuestion__Group_9__03209 = new BitSet(new long[]{0x0000000001000030L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group_9__1_in_rule__TableQuestion__Group_9__03212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__TableQuestion__Group_9__0__Impl3240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group_9__1__Impl_in_rule__TableQuestion__Group_9__13271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__ItemsAssignment_9_1_in_rule__TableQuestion__Group_9__1__Impl3298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Item__Group__0__Impl_in_rule__Item__Group__03332 = new BitSet(new long[]{0x0000000001000030L});
        public static final BitSet FOLLOW_rule__Item__Group__1_in_rule__Item__Group__03335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Item__IsFreeTextAssignment_0_in_rule__Item__Group__0__Impl3362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Item__Group__1__Impl_in_rule__Item__Group__13393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Item__BodyAssignment_1_in_rule__Item__Group__1__Impl3420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Survey__NameAssignment_13459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Survey__IntroAssignment_2_13490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_rule__Survey__QuestionsAssignment_33521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_rule__Survey__QuestionsAssignment_43552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Survey__OutroAssignment_5_13583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Question_Impl__NameAssignment_13614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Question_Impl__IsExclusiveAssignment_23650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Question_Impl__IsOptionalAssignment_33694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Question_Impl__BodyAssignment_43733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__Question_Impl__AnswersAssignment_63764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__Question_Impl__AnswersAssignment_73795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Answer__IsFreeTextAssignment_13831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Answer__BodyAssignment_23870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Answer__FollowupAssignment_3_13905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Answer__FollowupAssignment_3_2_13944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TableQuestion__NameAssignment_13979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__TableQuestion__IsExclusiveAssignment_24015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__TableQuestion__IsOptionalAssignment_34059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TableQuestion__BodyAssignment_44098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleItem_in_rule__TableQuestion__ItemsAssignment_84129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleItem_in_rule__TableQuestion__ItemsAssignment_9_14160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__TableQuestion__AnswersAssignment_114191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__TableQuestion__AnswersAssignment_124222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Item__IsFreeTextAssignment_04258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Item__BodyAssignment_14297 = new BitSet(new long[]{0x0000000000000002L});
    }


}