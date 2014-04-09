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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Survey'", "'Intro'", "'Outro'", "'Question'", "'('", "')'", "'Answer'", "'->'", "','", "'TableQuestion'", "'items'", "'exclusive'", "'optional'", "'freetext'"
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:174:1: entryRuleAnswer : ruleAnswer EOF ;
    public final void entryRuleAnswer() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:175:1: ( ruleAnswer EOF )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:176:1: ruleAnswer EOF
            {
             before(grammarAccess.getAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_entryRuleAnswer303);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getAnswerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswer310); 

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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:183:1: ruleAnswer : ( ( rule__Answer__Group__0 ) ) ;
    public final void ruleAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:187:2: ( ( ( rule__Answer__Group__0 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:188:1: ( ( rule__Answer__Group__0 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:188:1: ( ( rule__Answer__Group__0 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:189:1: ( rule__Answer__Group__0 )
            {
             before(grammarAccess.getAnswerAccess().getGroup()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:190:1: ( rule__Answer__Group__0 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:190:2: rule__Answer__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__0_in_ruleAnswer336);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:204:1: entryRuleTableQuestion : ruleTableQuestion EOF ;
    public final void entryRuleTableQuestion() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:205:1: ( ruleTableQuestion EOF )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:206:1: ruleTableQuestion EOF
            {
             before(grammarAccess.getTableQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTableQuestion_in_entryRuleTableQuestion365);
            ruleTableQuestion();

            state._fsp--;

             after(grammarAccess.getTableQuestionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTableQuestion372); 

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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:213:1: ruleTableQuestion : ( ( rule__TableQuestion__Group__0 ) ) ;
    public final void ruleTableQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:217:2: ( ( ( rule__TableQuestion__Group__0 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:218:1: ( ( rule__TableQuestion__Group__0 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:218:1: ( ( rule__TableQuestion__Group__0 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:219:1: ( rule__TableQuestion__Group__0 )
            {
             before(grammarAccess.getTableQuestionAccess().getGroup()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:220:1: ( rule__TableQuestion__Group__0 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:220:2: rule__TableQuestion__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__0_in_ruleTableQuestion398);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:232:1: entryRuleItem : ruleItem EOF ;
    public final void entryRuleItem() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:233:1: ( ruleItem EOF )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:234:1: ruleItem EOF
            {
             before(grammarAccess.getItemRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleItem_in_entryRuleItem425);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getItemRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleItem432); 

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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:241:1: ruleItem : ( ( rule__Item__Group__0 ) ) ;
    public final void ruleItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:245:2: ( ( ( rule__Item__Group__0 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:246:1: ( ( rule__Item__Group__0 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:246:1: ( ( rule__Item__Group__0 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:247:1: ( rule__Item__Group__0 )
            {
             before(grammarAccess.getItemAccess().getGroup()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:248:1: ( rule__Item__Group__0 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:248:2: rule__Item__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Item__Group__0_in_ruleItem458);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:260:1: rule__Question__Alternatives : ( ( ruleQuestion_Impl ) | ( ruleTableQuestion ) );
    public final void rule__Question__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:264:1: ( ( ruleQuestion_Impl ) | ( ruleTableQuestion ) )
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
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:265:1: ( ruleQuestion_Impl )
                    {
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:265:1: ( ruleQuestion_Impl )
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:266:1: ruleQuestion_Impl
                    {
                     before(grammarAccess.getQuestionAccess().getQuestion_ImplParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleQuestion_Impl_in_rule__Question__Alternatives494);
                    ruleQuestion_Impl();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getQuestion_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:271:6: ( ruleTableQuestion )
                    {
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:271:6: ( ruleTableQuestion )
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:272:1: ruleTableQuestion
                    {
                     before(grammarAccess.getQuestionAccess().getTableQuestionParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleTableQuestion_in_rule__Question__Alternatives511);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:282:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:286:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:287:1: ( RULE_STRING )
                    {
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:287:1: ( RULE_STRING )
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:288:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives543); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:293:6: ( RULE_ID )
                    {
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:293:6: ( RULE_ID )
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:294:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives560); 
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:307:1: rule__Survey__Group__0 : rule__Survey__Group__0__Impl rule__Survey__Group__1 ;
    public final void rule__Survey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:311:1: ( rule__Survey__Group__0__Impl rule__Survey__Group__1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:312:2: rule__Survey__Group__0__Impl rule__Survey__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__0__Impl_in_rule__Survey__Group__0591);
            rule__Survey__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__1_in_rule__Survey__Group__0594);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:319:1: rule__Survey__Group__0__Impl : ( 'Survey' ) ;
    public final void rule__Survey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:323:1: ( ( 'Survey' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:324:1: ( 'Survey' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:324:1: ( 'Survey' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:325:1: 'Survey'
            {
             before(grammarAccess.getSurveyAccess().getSurveyKeyword_0()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Survey__Group__0__Impl622); 
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:338:1: rule__Survey__Group__1 : rule__Survey__Group__1__Impl rule__Survey__Group__2 ;
    public final void rule__Survey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:342:1: ( rule__Survey__Group__1__Impl rule__Survey__Group__2 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:343:2: rule__Survey__Group__1__Impl rule__Survey__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__1__Impl_in_rule__Survey__Group__1653);
            rule__Survey__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__2_in_rule__Survey__Group__1656);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:350:1: rule__Survey__Group__1__Impl : ( ( rule__Survey__NameAssignment_1 ) ) ;
    public final void rule__Survey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:354:1: ( ( ( rule__Survey__NameAssignment_1 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:355:1: ( ( rule__Survey__NameAssignment_1 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:355:1: ( ( rule__Survey__NameAssignment_1 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:356:1: ( rule__Survey__NameAssignment_1 )
            {
             before(grammarAccess.getSurveyAccess().getNameAssignment_1()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:357:1: ( rule__Survey__NameAssignment_1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:357:2: rule__Survey__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__NameAssignment_1_in_rule__Survey__Group__1__Impl683);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:367:1: rule__Survey__Group__2 : rule__Survey__Group__2__Impl rule__Survey__Group__3 ;
    public final void rule__Survey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:371:1: ( rule__Survey__Group__2__Impl rule__Survey__Group__3 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:372:2: rule__Survey__Group__2__Impl rule__Survey__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__2__Impl_in_rule__Survey__Group__2713);
            rule__Survey__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__3_in_rule__Survey__Group__2716);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:379:1: rule__Survey__Group__2__Impl : ( ( rule__Survey__Group_2__0 )? ) ;
    public final void rule__Survey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:383:1: ( ( ( rule__Survey__Group_2__0 )? ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:384:1: ( ( rule__Survey__Group_2__0 )? )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:384:1: ( ( rule__Survey__Group_2__0 )? )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:385:1: ( rule__Survey__Group_2__0 )?
            {
             before(grammarAccess.getSurveyAccess().getGroup_2()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:386:1: ( rule__Survey__Group_2__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:386:2: rule__Survey__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Survey__Group_2__0_in_rule__Survey__Group__2__Impl743);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:396:1: rule__Survey__Group__3 : rule__Survey__Group__3__Impl rule__Survey__Group__4 ;
    public final void rule__Survey__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:400:1: ( rule__Survey__Group__3__Impl rule__Survey__Group__4 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:401:2: rule__Survey__Group__3__Impl rule__Survey__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__3__Impl_in_rule__Survey__Group__3774);
            rule__Survey__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__4_in_rule__Survey__Group__3777);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:408:1: rule__Survey__Group__3__Impl : ( ( rule__Survey__QuestionsAssignment_3 ) ) ;
    public final void rule__Survey__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:412:1: ( ( ( rule__Survey__QuestionsAssignment_3 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:413:1: ( ( rule__Survey__QuestionsAssignment_3 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:413:1: ( ( rule__Survey__QuestionsAssignment_3 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:414:1: ( rule__Survey__QuestionsAssignment_3 )
            {
             before(grammarAccess.getSurveyAccess().getQuestionsAssignment_3()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:415:1: ( rule__Survey__QuestionsAssignment_3 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:415:2: rule__Survey__QuestionsAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__QuestionsAssignment_3_in_rule__Survey__Group__3__Impl804);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:425:1: rule__Survey__Group__4 : rule__Survey__Group__4__Impl rule__Survey__Group__5 ;
    public final void rule__Survey__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:429:1: ( rule__Survey__Group__4__Impl rule__Survey__Group__5 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:430:2: rule__Survey__Group__4__Impl rule__Survey__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__4__Impl_in_rule__Survey__Group__4834);
            rule__Survey__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__5_in_rule__Survey__Group__4837);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:437:1: rule__Survey__Group__4__Impl : ( ( rule__Survey__QuestionsAssignment_4 )* ) ;
    public final void rule__Survey__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:441:1: ( ( ( rule__Survey__QuestionsAssignment_4 )* ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:442:1: ( ( rule__Survey__QuestionsAssignment_4 )* )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:442:1: ( ( rule__Survey__QuestionsAssignment_4 )* )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:443:1: ( rule__Survey__QuestionsAssignment_4 )*
            {
             before(grammarAccess.getSurveyAccess().getQuestionsAssignment_4()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:444:1: ( rule__Survey__QuestionsAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14||LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:444:2: rule__Survey__QuestionsAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Survey__QuestionsAssignment_4_in_rule__Survey__Group__4__Impl864);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:454:1: rule__Survey__Group__5 : rule__Survey__Group__5__Impl ;
    public final void rule__Survey__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:458:1: ( rule__Survey__Group__5__Impl )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:459:2: rule__Survey__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__5__Impl_in_rule__Survey__Group__5895);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:465:1: rule__Survey__Group__5__Impl : ( ( rule__Survey__Group_5__0 )? ) ;
    public final void rule__Survey__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:469:1: ( ( ( rule__Survey__Group_5__0 )? ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:470:1: ( ( rule__Survey__Group_5__0 )? )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:470:1: ( ( rule__Survey__Group_5__0 )? )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:471:1: ( rule__Survey__Group_5__0 )?
            {
             before(grammarAccess.getSurveyAccess().getGroup_5()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:472:1: ( rule__Survey__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:472:2: rule__Survey__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Survey__Group_5__0_in_rule__Survey__Group__5__Impl922);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:494:1: rule__Survey__Group_2__0 : rule__Survey__Group_2__0__Impl rule__Survey__Group_2__1 ;
    public final void rule__Survey__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:498:1: ( rule__Survey__Group_2__0__Impl rule__Survey__Group_2__1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:499:2: rule__Survey__Group_2__0__Impl rule__Survey__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group_2__0__Impl_in_rule__Survey__Group_2__0965);
            rule__Survey__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group_2__1_in_rule__Survey__Group_2__0968);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:506:1: rule__Survey__Group_2__0__Impl : ( 'Intro' ) ;
    public final void rule__Survey__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:510:1: ( ( 'Intro' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:511:1: ( 'Intro' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:511:1: ( 'Intro' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:512:1: 'Intro'
            {
             before(grammarAccess.getSurveyAccess().getIntroKeyword_2_0()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Survey__Group_2__0__Impl996); 
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:525:1: rule__Survey__Group_2__1 : rule__Survey__Group_2__1__Impl ;
    public final void rule__Survey__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:529:1: ( rule__Survey__Group_2__1__Impl )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:530:2: rule__Survey__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group_2__1__Impl_in_rule__Survey__Group_2__11027);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:536:1: rule__Survey__Group_2__1__Impl : ( ( rule__Survey__IntroAssignment_2_1 ) ) ;
    public final void rule__Survey__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:540:1: ( ( ( rule__Survey__IntroAssignment_2_1 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:541:1: ( ( rule__Survey__IntroAssignment_2_1 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:541:1: ( ( rule__Survey__IntroAssignment_2_1 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:542:1: ( rule__Survey__IntroAssignment_2_1 )
            {
             before(grammarAccess.getSurveyAccess().getIntroAssignment_2_1()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:543:1: ( rule__Survey__IntroAssignment_2_1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:543:2: rule__Survey__IntroAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__IntroAssignment_2_1_in_rule__Survey__Group_2__1__Impl1054);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:557:1: rule__Survey__Group_5__0 : rule__Survey__Group_5__0__Impl rule__Survey__Group_5__1 ;
    public final void rule__Survey__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:561:1: ( rule__Survey__Group_5__0__Impl rule__Survey__Group_5__1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:562:2: rule__Survey__Group_5__0__Impl rule__Survey__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group_5__0__Impl_in_rule__Survey__Group_5__01088);
            rule__Survey__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group_5__1_in_rule__Survey__Group_5__01091);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:569:1: rule__Survey__Group_5__0__Impl : ( 'Outro' ) ;
    public final void rule__Survey__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:573:1: ( ( 'Outro' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:574:1: ( 'Outro' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:574:1: ( 'Outro' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:575:1: 'Outro'
            {
             before(grammarAccess.getSurveyAccess().getOutroKeyword_5_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Survey__Group_5__0__Impl1119); 
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:588:1: rule__Survey__Group_5__1 : rule__Survey__Group_5__1__Impl ;
    public final void rule__Survey__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:592:1: ( rule__Survey__Group_5__1__Impl )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:593:2: rule__Survey__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group_5__1__Impl_in_rule__Survey__Group_5__11150);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:599:1: rule__Survey__Group_5__1__Impl : ( ( rule__Survey__OutroAssignment_5_1 ) ) ;
    public final void rule__Survey__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:603:1: ( ( ( rule__Survey__OutroAssignment_5_1 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:604:1: ( ( rule__Survey__OutroAssignment_5_1 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:604:1: ( ( rule__Survey__OutroAssignment_5_1 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:605:1: ( rule__Survey__OutroAssignment_5_1 )
            {
             before(grammarAccess.getSurveyAccess().getOutroAssignment_5_1()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:606:1: ( rule__Survey__OutroAssignment_5_1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:606:2: rule__Survey__OutroAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__OutroAssignment_5_1_in_rule__Survey__Group_5__1__Impl1177);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:620:1: rule__Question_Impl__Group__0 : rule__Question_Impl__Group__0__Impl rule__Question_Impl__Group__1 ;
    public final void rule__Question_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:624:1: ( rule__Question_Impl__Group__0__Impl rule__Question_Impl__Group__1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:625:2: rule__Question_Impl__Group__0__Impl rule__Question_Impl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__Group__0__Impl_in_rule__Question_Impl__Group__01211);
            rule__Question_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__Group__1_in_rule__Question_Impl__Group__01214);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:632:1: rule__Question_Impl__Group__0__Impl : ( 'Question' ) ;
    public final void rule__Question_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:636:1: ( ( 'Question' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:637:1: ( 'Question' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:637:1: ( 'Question' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:638:1: 'Question'
            {
             before(grammarAccess.getQuestion_ImplAccess().getQuestionKeyword_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Question_Impl__Group__0__Impl1242); 
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:651:1: rule__Question_Impl__Group__1 : rule__Question_Impl__Group__1__Impl rule__Question_Impl__Group__2 ;
    public final void rule__Question_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:655:1: ( rule__Question_Impl__Group__1__Impl rule__Question_Impl__Group__2 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:656:2: rule__Question_Impl__Group__1__Impl rule__Question_Impl__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__Group__1__Impl_in_rule__Question_Impl__Group__11273);
            rule__Question_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__Group__2_in_rule__Question_Impl__Group__11276);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:663:1: rule__Question_Impl__Group__1__Impl : ( ( rule__Question_Impl__NameAssignment_1 ) ) ;
    public final void rule__Question_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:667:1: ( ( ( rule__Question_Impl__NameAssignment_1 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:668:1: ( ( rule__Question_Impl__NameAssignment_1 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:668:1: ( ( rule__Question_Impl__NameAssignment_1 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:669:1: ( rule__Question_Impl__NameAssignment_1 )
            {
             before(grammarAccess.getQuestion_ImplAccess().getNameAssignment_1()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:670:1: ( rule__Question_Impl__NameAssignment_1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:670:2: rule__Question_Impl__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__NameAssignment_1_in_rule__Question_Impl__Group__1__Impl1303);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:680:1: rule__Question_Impl__Group__2 : rule__Question_Impl__Group__2__Impl rule__Question_Impl__Group__3 ;
    public final void rule__Question_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:684:1: ( rule__Question_Impl__Group__2__Impl rule__Question_Impl__Group__3 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:685:2: rule__Question_Impl__Group__2__Impl rule__Question_Impl__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__Group__2__Impl_in_rule__Question_Impl__Group__21333);
            rule__Question_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__Group__3_in_rule__Question_Impl__Group__21336);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:692:1: rule__Question_Impl__Group__2__Impl : ( ( rule__Question_Impl__IsExclusiveAssignment_2 )? ) ;
    public final void rule__Question_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:696:1: ( ( ( rule__Question_Impl__IsExclusiveAssignment_2 )? ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:697:1: ( ( rule__Question_Impl__IsExclusiveAssignment_2 )? )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:697:1: ( ( rule__Question_Impl__IsExclusiveAssignment_2 )? )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:698:1: ( rule__Question_Impl__IsExclusiveAssignment_2 )?
            {
             before(grammarAccess.getQuestion_ImplAccess().getIsExclusiveAssignment_2()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:699:1: ( rule__Question_Impl__IsExclusiveAssignment_2 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:699:2: rule__Question_Impl__IsExclusiveAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__IsExclusiveAssignment_2_in_rule__Question_Impl__Group__2__Impl1363);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:709:1: rule__Question_Impl__Group__3 : rule__Question_Impl__Group__3__Impl rule__Question_Impl__Group__4 ;
    public final void rule__Question_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:713:1: ( rule__Question_Impl__Group__3__Impl rule__Question_Impl__Group__4 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:714:2: rule__Question_Impl__Group__3__Impl rule__Question_Impl__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__Group__3__Impl_in_rule__Question_Impl__Group__31394);
            rule__Question_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__Group__4_in_rule__Question_Impl__Group__31397);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:721:1: rule__Question_Impl__Group__3__Impl : ( ( rule__Question_Impl__IsOptionalAssignment_3 )? ) ;
    public final void rule__Question_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:725:1: ( ( ( rule__Question_Impl__IsOptionalAssignment_3 )? ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:726:1: ( ( rule__Question_Impl__IsOptionalAssignment_3 )? )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:726:1: ( ( rule__Question_Impl__IsOptionalAssignment_3 )? )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:727:1: ( rule__Question_Impl__IsOptionalAssignment_3 )?
            {
             before(grammarAccess.getQuestion_ImplAccess().getIsOptionalAssignment_3()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:728:1: ( rule__Question_Impl__IsOptionalAssignment_3 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:728:2: rule__Question_Impl__IsOptionalAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__IsOptionalAssignment_3_in_rule__Question_Impl__Group__3__Impl1424);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:738:1: rule__Question_Impl__Group__4 : rule__Question_Impl__Group__4__Impl rule__Question_Impl__Group__5 ;
    public final void rule__Question_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:742:1: ( rule__Question_Impl__Group__4__Impl rule__Question_Impl__Group__5 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:743:2: rule__Question_Impl__Group__4__Impl rule__Question_Impl__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__Group__4__Impl_in_rule__Question_Impl__Group__41455);
            rule__Question_Impl__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__Group__5_in_rule__Question_Impl__Group__41458);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:750:1: rule__Question_Impl__Group__4__Impl : ( ( rule__Question_Impl__IsFreeTextAssignment_4 )? ) ;
    public final void rule__Question_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:754:1: ( ( ( rule__Question_Impl__IsFreeTextAssignment_4 )? ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:755:1: ( ( rule__Question_Impl__IsFreeTextAssignment_4 )? )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:755:1: ( ( rule__Question_Impl__IsFreeTextAssignment_4 )? )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:756:1: ( rule__Question_Impl__IsFreeTextAssignment_4 )?
            {
             before(grammarAccess.getQuestion_ImplAccess().getIsFreeTextAssignment_4()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:757:1: ( rule__Question_Impl__IsFreeTextAssignment_4 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:757:2: rule__Question_Impl__IsFreeTextAssignment_4
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__IsFreeTextAssignment_4_in_rule__Question_Impl__Group__4__Impl1485);
                    rule__Question_Impl__IsFreeTextAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestion_ImplAccess().getIsFreeTextAssignment_4()); 

            }


            }

        }
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:767:1: rule__Question_Impl__Group__5 : rule__Question_Impl__Group__5__Impl rule__Question_Impl__Group__6 ;
    public final void rule__Question_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:771:1: ( rule__Question_Impl__Group__5__Impl rule__Question_Impl__Group__6 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:772:2: rule__Question_Impl__Group__5__Impl rule__Question_Impl__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__Group__5__Impl_in_rule__Question_Impl__Group__51516);
            rule__Question_Impl__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__Group__6_in_rule__Question_Impl__Group__51519);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:779:1: rule__Question_Impl__Group__5__Impl : ( ( rule__Question_Impl__BodyAssignment_5 ) ) ;
    public final void rule__Question_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:783:1: ( ( ( rule__Question_Impl__BodyAssignment_5 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:784:1: ( ( rule__Question_Impl__BodyAssignment_5 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:784:1: ( ( rule__Question_Impl__BodyAssignment_5 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:785:1: ( rule__Question_Impl__BodyAssignment_5 )
            {
             before(grammarAccess.getQuestion_ImplAccess().getBodyAssignment_5()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:786:1: ( rule__Question_Impl__BodyAssignment_5 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:786:2: rule__Question_Impl__BodyAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__BodyAssignment_5_in_rule__Question_Impl__Group__5__Impl1546);
            rule__Question_Impl__BodyAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getQuestion_ImplAccess().getBodyAssignment_5()); 

            }


            }

        }
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:796:1: rule__Question_Impl__Group__6 : rule__Question_Impl__Group__6__Impl rule__Question_Impl__Group__7 ;
    public final void rule__Question_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:800:1: ( rule__Question_Impl__Group__6__Impl rule__Question_Impl__Group__7 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:801:2: rule__Question_Impl__Group__6__Impl rule__Question_Impl__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__Group__6__Impl_in_rule__Question_Impl__Group__61576);
            rule__Question_Impl__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__Group__7_in_rule__Question_Impl__Group__61579);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:808:1: rule__Question_Impl__Group__6__Impl : ( '(' ) ;
    public final void rule__Question_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:812:1: ( ( '(' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:813:1: ( '(' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:813:1: ( '(' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:814:1: '('
            {
             before(grammarAccess.getQuestion_ImplAccess().getLeftParenthesisKeyword_6()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Question_Impl__Group__6__Impl1607); 
             after(grammarAccess.getQuestion_ImplAccess().getLeftParenthesisKeyword_6()); 

            }


            }

        }
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:827:1: rule__Question_Impl__Group__7 : rule__Question_Impl__Group__7__Impl rule__Question_Impl__Group__8 ;
    public final void rule__Question_Impl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:831:1: ( rule__Question_Impl__Group__7__Impl rule__Question_Impl__Group__8 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:832:2: rule__Question_Impl__Group__7__Impl rule__Question_Impl__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__Group__7__Impl_in_rule__Question_Impl__Group__71638);
            rule__Question_Impl__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__Group__8_in_rule__Question_Impl__Group__71641);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:839:1: rule__Question_Impl__Group__7__Impl : ( ( rule__Question_Impl__AnswersAssignment_7 ) ) ;
    public final void rule__Question_Impl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:843:1: ( ( ( rule__Question_Impl__AnswersAssignment_7 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:844:1: ( ( rule__Question_Impl__AnswersAssignment_7 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:844:1: ( ( rule__Question_Impl__AnswersAssignment_7 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:845:1: ( rule__Question_Impl__AnswersAssignment_7 )
            {
             before(grammarAccess.getQuestion_ImplAccess().getAnswersAssignment_7()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:846:1: ( rule__Question_Impl__AnswersAssignment_7 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:846:2: rule__Question_Impl__AnswersAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__AnswersAssignment_7_in_rule__Question_Impl__Group__7__Impl1668);
            rule__Question_Impl__AnswersAssignment_7();

            state._fsp--;


            }

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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:856:1: rule__Question_Impl__Group__8 : rule__Question_Impl__Group__8__Impl rule__Question_Impl__Group__9 ;
    public final void rule__Question_Impl__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:860:1: ( rule__Question_Impl__Group__8__Impl rule__Question_Impl__Group__9 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:861:2: rule__Question_Impl__Group__8__Impl rule__Question_Impl__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__Group__8__Impl_in_rule__Question_Impl__Group__81698);
            rule__Question_Impl__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__Group__9_in_rule__Question_Impl__Group__81701);
            rule__Question_Impl__Group__9();

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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:868:1: rule__Question_Impl__Group__8__Impl : ( ( rule__Question_Impl__AnswersAssignment_8 )* ) ;
    public final void rule__Question_Impl__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:872:1: ( ( ( rule__Question_Impl__AnswersAssignment_8 )* ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:873:1: ( ( rule__Question_Impl__AnswersAssignment_8 )* )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:873:1: ( ( rule__Question_Impl__AnswersAssignment_8 )* )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:874:1: ( rule__Question_Impl__AnswersAssignment_8 )*
            {
             before(grammarAccess.getQuestion_ImplAccess().getAnswersAssignment_8()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:875:1: ( rule__Question_Impl__AnswersAssignment_8 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:875:2: rule__Question_Impl__AnswersAssignment_8
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__AnswersAssignment_8_in_rule__Question_Impl__Group__8__Impl1728);
            	    rule__Question_Impl__AnswersAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getQuestion_ImplAccess().getAnswersAssignment_8()); 

            }


            }

        }
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


    // $ANTLR start "rule__Question_Impl__Group__9"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:885:1: rule__Question_Impl__Group__9 : rule__Question_Impl__Group__9__Impl ;
    public final void rule__Question_Impl__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:889:1: ( rule__Question_Impl__Group__9__Impl )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:890:2: rule__Question_Impl__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question_Impl__Group__9__Impl_in_rule__Question_Impl__Group__91759);
            rule__Question_Impl__Group__9__Impl();

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
    // $ANTLR end "rule__Question_Impl__Group__9"


    // $ANTLR start "rule__Question_Impl__Group__9__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:896:1: rule__Question_Impl__Group__9__Impl : ( ')' ) ;
    public final void rule__Question_Impl__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:900:1: ( ( ')' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:901:1: ( ')' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:901:1: ( ')' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:902:1: ')'
            {
             before(grammarAccess.getQuestion_ImplAccess().getRightParenthesisKeyword_9()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Question_Impl__Group__9__Impl1787); 
             after(grammarAccess.getQuestion_ImplAccess().getRightParenthesisKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question_Impl__Group__9__Impl"


    // $ANTLR start "rule__Answer__Group__0"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:935:1: rule__Answer__Group__0 : rule__Answer__Group__0__Impl rule__Answer__Group__1 ;
    public final void rule__Answer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:939:1: ( rule__Answer__Group__0__Impl rule__Answer__Group__1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:940:2: rule__Answer__Group__0__Impl rule__Answer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__0__Impl_in_rule__Answer__Group__01838);
            rule__Answer__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__1_in_rule__Answer__Group__01841);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:947:1: rule__Answer__Group__0__Impl : ( 'Answer' ) ;
    public final void rule__Answer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:951:1: ( ( 'Answer' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:952:1: ( 'Answer' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:952:1: ( 'Answer' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:953:1: 'Answer'
            {
             before(grammarAccess.getAnswerAccess().getAnswerKeyword_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Answer__Group__0__Impl1869); 
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:966:1: rule__Answer__Group__1 : rule__Answer__Group__1__Impl rule__Answer__Group__2 ;
    public final void rule__Answer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:970:1: ( rule__Answer__Group__1__Impl rule__Answer__Group__2 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:971:2: rule__Answer__Group__1__Impl rule__Answer__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__1__Impl_in_rule__Answer__Group__11900);
            rule__Answer__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__2_in_rule__Answer__Group__11903);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:978:1: rule__Answer__Group__1__Impl : ( ( rule__Answer__IsFreeTextAssignment_1 )? ) ;
    public final void rule__Answer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:982:1: ( ( ( rule__Answer__IsFreeTextAssignment_1 )? ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:983:1: ( ( rule__Answer__IsFreeTextAssignment_1 )? )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:983:1: ( ( rule__Answer__IsFreeTextAssignment_1 )? )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:984:1: ( rule__Answer__IsFreeTextAssignment_1 )?
            {
             before(grammarAccess.getAnswerAccess().getIsFreeTextAssignment_1()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:985:1: ( rule__Answer__IsFreeTextAssignment_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:985:2: rule__Answer__IsFreeTextAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Answer__IsFreeTextAssignment_1_in_rule__Answer__Group__1__Impl1930);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:995:1: rule__Answer__Group__2 : rule__Answer__Group__2__Impl rule__Answer__Group__3 ;
    public final void rule__Answer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:999:1: ( rule__Answer__Group__2__Impl rule__Answer__Group__3 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1000:2: rule__Answer__Group__2__Impl rule__Answer__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__2__Impl_in_rule__Answer__Group__21961);
            rule__Answer__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__3_in_rule__Answer__Group__21964);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1007:1: rule__Answer__Group__2__Impl : ( ( rule__Answer__BodyAssignment_2 ) ) ;
    public final void rule__Answer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1011:1: ( ( ( rule__Answer__BodyAssignment_2 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1012:1: ( ( rule__Answer__BodyAssignment_2 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1012:1: ( ( rule__Answer__BodyAssignment_2 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1013:1: ( rule__Answer__BodyAssignment_2 )
            {
             before(grammarAccess.getAnswerAccess().getBodyAssignment_2()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1014:1: ( rule__Answer__BodyAssignment_2 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1014:2: rule__Answer__BodyAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__BodyAssignment_2_in_rule__Answer__Group__2__Impl1991);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1024:1: rule__Answer__Group__3 : rule__Answer__Group__3__Impl ;
    public final void rule__Answer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1028:1: ( rule__Answer__Group__3__Impl )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1029:2: rule__Answer__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__3__Impl_in_rule__Answer__Group__32021);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1035:1: rule__Answer__Group__3__Impl : ( ( rule__Answer__Group_3__0 )? ) ;
    public final void rule__Answer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1039:1: ( ( ( rule__Answer__Group_3__0 )? ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1040:1: ( ( rule__Answer__Group_3__0 )? )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1040:1: ( ( rule__Answer__Group_3__0 )? )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1041:1: ( rule__Answer__Group_3__0 )?
            {
             before(grammarAccess.getAnswerAccess().getGroup_3()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1042:1: ( rule__Answer__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1042:2: rule__Answer__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3__0_in_rule__Answer__Group__3__Impl2048);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1060:1: rule__Answer__Group_3__0 : rule__Answer__Group_3__0__Impl rule__Answer__Group_3__1 ;
    public final void rule__Answer__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1064:1: ( rule__Answer__Group_3__0__Impl rule__Answer__Group_3__1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1065:2: rule__Answer__Group_3__0__Impl rule__Answer__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3__0__Impl_in_rule__Answer__Group_3__02087);
            rule__Answer__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3__1_in_rule__Answer__Group_3__02090);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1072:1: rule__Answer__Group_3__0__Impl : ( '->' ) ;
    public final void rule__Answer__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1076:1: ( ( '->' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1077:1: ( '->' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1077:1: ( '->' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1078:1: '->'
            {
             before(grammarAccess.getAnswerAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Answer__Group_3__0__Impl2118); 
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1091:1: rule__Answer__Group_3__1 : rule__Answer__Group_3__1__Impl rule__Answer__Group_3__2 ;
    public final void rule__Answer__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1095:1: ( rule__Answer__Group_3__1__Impl rule__Answer__Group_3__2 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1096:2: rule__Answer__Group_3__1__Impl rule__Answer__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3__1__Impl_in_rule__Answer__Group_3__12149);
            rule__Answer__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3__2_in_rule__Answer__Group_3__12152);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1103:1: rule__Answer__Group_3__1__Impl : ( ( rule__Answer__FollowupAssignment_3_1 ) ) ;
    public final void rule__Answer__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1107:1: ( ( ( rule__Answer__FollowupAssignment_3_1 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1108:1: ( ( rule__Answer__FollowupAssignment_3_1 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1108:1: ( ( rule__Answer__FollowupAssignment_3_1 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1109:1: ( rule__Answer__FollowupAssignment_3_1 )
            {
             before(grammarAccess.getAnswerAccess().getFollowupAssignment_3_1()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1110:1: ( rule__Answer__FollowupAssignment_3_1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1110:2: rule__Answer__FollowupAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__FollowupAssignment_3_1_in_rule__Answer__Group_3__1__Impl2179);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1120:1: rule__Answer__Group_3__2 : rule__Answer__Group_3__2__Impl ;
    public final void rule__Answer__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1124:1: ( rule__Answer__Group_3__2__Impl )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1125:2: rule__Answer__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3__2__Impl_in_rule__Answer__Group_3__22209);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1131:1: rule__Answer__Group_3__2__Impl : ( ( rule__Answer__Group_3_2__0 )* ) ;
    public final void rule__Answer__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1135:1: ( ( ( rule__Answer__Group_3_2__0 )* ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1136:1: ( ( rule__Answer__Group_3_2__0 )* )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1136:1: ( ( rule__Answer__Group_3_2__0 )* )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1137:1: ( rule__Answer__Group_3_2__0 )*
            {
             before(grammarAccess.getAnswerAccess().getGroup_3_2()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1138:1: ( rule__Answer__Group_3_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==19) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1138:2: rule__Answer__Group_3_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3_2__0_in_rule__Answer__Group_3__2__Impl2236);
            	    rule__Answer__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1154:1: rule__Answer__Group_3_2__0 : rule__Answer__Group_3_2__0__Impl rule__Answer__Group_3_2__1 ;
    public final void rule__Answer__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1158:1: ( rule__Answer__Group_3_2__0__Impl rule__Answer__Group_3_2__1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1159:2: rule__Answer__Group_3_2__0__Impl rule__Answer__Group_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3_2__0__Impl_in_rule__Answer__Group_3_2__02273);
            rule__Answer__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3_2__1_in_rule__Answer__Group_3_2__02276);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1166:1: rule__Answer__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Answer__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1170:1: ( ( ',' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1171:1: ( ',' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1171:1: ( ',' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1172:1: ','
            {
             before(grammarAccess.getAnswerAccess().getCommaKeyword_3_2_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Answer__Group_3_2__0__Impl2304); 
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1185:1: rule__Answer__Group_3_2__1 : rule__Answer__Group_3_2__1__Impl ;
    public final void rule__Answer__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1189:1: ( rule__Answer__Group_3_2__1__Impl )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1190:2: rule__Answer__Group_3_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3_2__1__Impl_in_rule__Answer__Group_3_2__12335);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1196:1: rule__Answer__Group_3_2__1__Impl : ( ( rule__Answer__FollowupAssignment_3_2_1 ) ) ;
    public final void rule__Answer__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1200:1: ( ( ( rule__Answer__FollowupAssignment_3_2_1 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1201:1: ( ( rule__Answer__FollowupAssignment_3_2_1 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1201:1: ( ( rule__Answer__FollowupAssignment_3_2_1 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1202:1: ( rule__Answer__FollowupAssignment_3_2_1 )
            {
             before(grammarAccess.getAnswerAccess().getFollowupAssignment_3_2_1()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1203:1: ( rule__Answer__FollowupAssignment_3_2_1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1203:2: rule__Answer__FollowupAssignment_3_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__FollowupAssignment_3_2_1_in_rule__Answer__Group_3_2__1__Impl2362);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1218:1: rule__TableQuestion__Group__0 : rule__TableQuestion__Group__0__Impl rule__TableQuestion__Group__1 ;
    public final void rule__TableQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1222:1: ( rule__TableQuestion__Group__0__Impl rule__TableQuestion__Group__1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1223:2: rule__TableQuestion__Group__0__Impl rule__TableQuestion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__0__Impl_in_rule__TableQuestion__Group__02397);
            rule__TableQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__1_in_rule__TableQuestion__Group__02400);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1230:1: rule__TableQuestion__Group__0__Impl : ( 'TableQuestion' ) ;
    public final void rule__TableQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1234:1: ( ( 'TableQuestion' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1235:1: ( 'TableQuestion' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1235:1: ( 'TableQuestion' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1236:1: 'TableQuestion'
            {
             before(grammarAccess.getTableQuestionAccess().getTableQuestionKeyword_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__TableQuestion__Group__0__Impl2428); 
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1249:1: rule__TableQuestion__Group__1 : rule__TableQuestion__Group__1__Impl rule__TableQuestion__Group__2 ;
    public final void rule__TableQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1253:1: ( rule__TableQuestion__Group__1__Impl rule__TableQuestion__Group__2 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1254:2: rule__TableQuestion__Group__1__Impl rule__TableQuestion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__1__Impl_in_rule__TableQuestion__Group__12459);
            rule__TableQuestion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__2_in_rule__TableQuestion__Group__12462);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1261:1: rule__TableQuestion__Group__1__Impl : ( ( rule__TableQuestion__NameAssignment_1 ) ) ;
    public final void rule__TableQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1265:1: ( ( ( rule__TableQuestion__NameAssignment_1 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1266:1: ( ( rule__TableQuestion__NameAssignment_1 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1266:1: ( ( rule__TableQuestion__NameAssignment_1 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1267:1: ( rule__TableQuestion__NameAssignment_1 )
            {
             before(grammarAccess.getTableQuestionAccess().getNameAssignment_1()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1268:1: ( rule__TableQuestion__NameAssignment_1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1268:2: rule__TableQuestion__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__NameAssignment_1_in_rule__TableQuestion__Group__1__Impl2489);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1278:1: rule__TableQuestion__Group__2 : rule__TableQuestion__Group__2__Impl rule__TableQuestion__Group__3 ;
    public final void rule__TableQuestion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1282:1: ( rule__TableQuestion__Group__2__Impl rule__TableQuestion__Group__3 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1283:2: rule__TableQuestion__Group__2__Impl rule__TableQuestion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__2__Impl_in_rule__TableQuestion__Group__22519);
            rule__TableQuestion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__3_in_rule__TableQuestion__Group__22522);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1290:1: rule__TableQuestion__Group__2__Impl : ( ( rule__TableQuestion__IsExclusiveAssignment_2 )? ) ;
    public final void rule__TableQuestion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1294:1: ( ( ( rule__TableQuestion__IsExclusiveAssignment_2 )? ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1295:1: ( ( rule__TableQuestion__IsExclusiveAssignment_2 )? )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1295:1: ( ( rule__TableQuestion__IsExclusiveAssignment_2 )? )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1296:1: ( rule__TableQuestion__IsExclusiveAssignment_2 )?
            {
             before(grammarAccess.getTableQuestionAccess().getIsExclusiveAssignment_2()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1297:1: ( rule__TableQuestion__IsExclusiveAssignment_2 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1297:2: rule__TableQuestion__IsExclusiveAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__IsExclusiveAssignment_2_in_rule__TableQuestion__Group__2__Impl2549);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1307:1: rule__TableQuestion__Group__3 : rule__TableQuestion__Group__3__Impl rule__TableQuestion__Group__4 ;
    public final void rule__TableQuestion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1311:1: ( rule__TableQuestion__Group__3__Impl rule__TableQuestion__Group__4 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1312:2: rule__TableQuestion__Group__3__Impl rule__TableQuestion__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__3__Impl_in_rule__TableQuestion__Group__32580);
            rule__TableQuestion__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__4_in_rule__TableQuestion__Group__32583);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1319:1: rule__TableQuestion__Group__3__Impl : ( ( rule__TableQuestion__IsOptionalAssignment_3 )? ) ;
    public final void rule__TableQuestion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1323:1: ( ( ( rule__TableQuestion__IsOptionalAssignment_3 )? ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1324:1: ( ( rule__TableQuestion__IsOptionalAssignment_3 )? )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1324:1: ( ( rule__TableQuestion__IsOptionalAssignment_3 )? )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1325:1: ( rule__TableQuestion__IsOptionalAssignment_3 )?
            {
             before(grammarAccess.getTableQuestionAccess().getIsOptionalAssignment_3()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1326:1: ( rule__TableQuestion__IsOptionalAssignment_3 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1326:2: rule__TableQuestion__IsOptionalAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__IsOptionalAssignment_3_in_rule__TableQuestion__Group__3__Impl2610);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1336:1: rule__TableQuestion__Group__4 : rule__TableQuestion__Group__4__Impl rule__TableQuestion__Group__5 ;
    public final void rule__TableQuestion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1340:1: ( rule__TableQuestion__Group__4__Impl rule__TableQuestion__Group__5 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1341:2: rule__TableQuestion__Group__4__Impl rule__TableQuestion__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__4__Impl_in_rule__TableQuestion__Group__42641);
            rule__TableQuestion__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__5_in_rule__TableQuestion__Group__42644);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1348:1: rule__TableQuestion__Group__4__Impl : ( ( rule__TableQuestion__IsFreeTextAssignment_4 )? ) ;
    public final void rule__TableQuestion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1352:1: ( ( ( rule__TableQuestion__IsFreeTextAssignment_4 )? ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1353:1: ( ( rule__TableQuestion__IsFreeTextAssignment_4 )? )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1353:1: ( ( rule__TableQuestion__IsFreeTextAssignment_4 )? )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1354:1: ( rule__TableQuestion__IsFreeTextAssignment_4 )?
            {
             before(grammarAccess.getTableQuestionAccess().getIsFreeTextAssignment_4()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1355:1: ( rule__TableQuestion__IsFreeTextAssignment_4 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1355:2: rule__TableQuestion__IsFreeTextAssignment_4
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__IsFreeTextAssignment_4_in_rule__TableQuestion__Group__4__Impl2671);
                    rule__TableQuestion__IsFreeTextAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTableQuestionAccess().getIsFreeTextAssignment_4()); 

            }


            }

        }
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1365:1: rule__TableQuestion__Group__5 : rule__TableQuestion__Group__5__Impl rule__TableQuestion__Group__6 ;
    public final void rule__TableQuestion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1369:1: ( rule__TableQuestion__Group__5__Impl rule__TableQuestion__Group__6 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1370:2: rule__TableQuestion__Group__5__Impl rule__TableQuestion__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__5__Impl_in_rule__TableQuestion__Group__52702);
            rule__TableQuestion__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__6_in_rule__TableQuestion__Group__52705);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1377:1: rule__TableQuestion__Group__5__Impl : ( ( rule__TableQuestion__BodyAssignment_5 ) ) ;
    public final void rule__TableQuestion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1381:1: ( ( ( rule__TableQuestion__BodyAssignment_5 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1382:1: ( ( rule__TableQuestion__BodyAssignment_5 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1382:1: ( ( rule__TableQuestion__BodyAssignment_5 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1383:1: ( rule__TableQuestion__BodyAssignment_5 )
            {
             before(grammarAccess.getTableQuestionAccess().getBodyAssignment_5()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1384:1: ( rule__TableQuestion__BodyAssignment_5 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1384:2: rule__TableQuestion__BodyAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__BodyAssignment_5_in_rule__TableQuestion__Group__5__Impl2732);
            rule__TableQuestion__BodyAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTableQuestionAccess().getBodyAssignment_5()); 

            }


            }

        }
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1394:1: rule__TableQuestion__Group__6 : rule__TableQuestion__Group__6__Impl rule__TableQuestion__Group__7 ;
    public final void rule__TableQuestion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1398:1: ( rule__TableQuestion__Group__6__Impl rule__TableQuestion__Group__7 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1399:2: rule__TableQuestion__Group__6__Impl rule__TableQuestion__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__6__Impl_in_rule__TableQuestion__Group__62762);
            rule__TableQuestion__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__7_in_rule__TableQuestion__Group__62765);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1406:1: rule__TableQuestion__Group__6__Impl : ( '(' ) ;
    public final void rule__TableQuestion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1410:1: ( ( '(' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1411:1: ( '(' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1411:1: ( '(' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1412:1: '('
            {
             before(grammarAccess.getTableQuestionAccess().getLeftParenthesisKeyword_6()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__TableQuestion__Group__6__Impl2793); 
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1425:1: rule__TableQuestion__Group__7 : rule__TableQuestion__Group__7__Impl rule__TableQuestion__Group__8 ;
    public final void rule__TableQuestion__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1429:1: ( rule__TableQuestion__Group__7__Impl rule__TableQuestion__Group__8 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1430:2: rule__TableQuestion__Group__7__Impl rule__TableQuestion__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__7__Impl_in_rule__TableQuestion__Group__72824);
            rule__TableQuestion__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__8_in_rule__TableQuestion__Group__72827);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1437:1: rule__TableQuestion__Group__7__Impl : ( 'items' ) ;
    public final void rule__TableQuestion__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1441:1: ( ( 'items' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1442:1: ( 'items' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1442:1: ( 'items' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1443:1: 'items'
            {
             before(grammarAccess.getTableQuestionAccess().getItemsKeyword_7()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__TableQuestion__Group__7__Impl2855); 
             after(grammarAccess.getTableQuestionAccess().getItemsKeyword_7()); 

            }


            }

        }
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1456:1: rule__TableQuestion__Group__8 : rule__TableQuestion__Group__8__Impl rule__TableQuestion__Group__9 ;
    public final void rule__TableQuestion__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1460:1: ( rule__TableQuestion__Group__8__Impl rule__TableQuestion__Group__9 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1461:2: rule__TableQuestion__Group__8__Impl rule__TableQuestion__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__8__Impl_in_rule__TableQuestion__Group__82886);
            rule__TableQuestion__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__9_in_rule__TableQuestion__Group__82889);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1468:1: rule__TableQuestion__Group__8__Impl : ( '(' ) ;
    public final void rule__TableQuestion__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1472:1: ( ( '(' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1473:1: ( '(' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1473:1: ( '(' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1474:1: '('
            {
             before(grammarAccess.getTableQuestionAccess().getLeftParenthesisKeyword_8()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__TableQuestion__Group__8__Impl2917); 
             after(grammarAccess.getTableQuestionAccess().getLeftParenthesisKeyword_8()); 

            }


            }

        }
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1487:1: rule__TableQuestion__Group__9 : rule__TableQuestion__Group__9__Impl rule__TableQuestion__Group__10 ;
    public final void rule__TableQuestion__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1491:1: ( rule__TableQuestion__Group__9__Impl rule__TableQuestion__Group__10 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1492:2: rule__TableQuestion__Group__9__Impl rule__TableQuestion__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__9__Impl_in_rule__TableQuestion__Group__92948);
            rule__TableQuestion__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__10_in_rule__TableQuestion__Group__92951);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1499:1: rule__TableQuestion__Group__9__Impl : ( ( rule__TableQuestion__ItemsAssignment_9 ) ) ;
    public final void rule__TableQuestion__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1503:1: ( ( ( rule__TableQuestion__ItemsAssignment_9 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1504:1: ( ( rule__TableQuestion__ItemsAssignment_9 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1504:1: ( ( rule__TableQuestion__ItemsAssignment_9 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1505:1: ( rule__TableQuestion__ItemsAssignment_9 )
            {
             before(grammarAccess.getTableQuestionAccess().getItemsAssignment_9()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1506:1: ( rule__TableQuestion__ItemsAssignment_9 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1506:2: rule__TableQuestion__ItemsAssignment_9
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__ItemsAssignment_9_in_rule__TableQuestion__Group__9__Impl2978);
            rule__TableQuestion__ItemsAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getTableQuestionAccess().getItemsAssignment_9()); 

            }


            }

        }
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1516:1: rule__TableQuestion__Group__10 : rule__TableQuestion__Group__10__Impl rule__TableQuestion__Group__11 ;
    public final void rule__TableQuestion__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1520:1: ( rule__TableQuestion__Group__10__Impl rule__TableQuestion__Group__11 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1521:2: rule__TableQuestion__Group__10__Impl rule__TableQuestion__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__10__Impl_in_rule__TableQuestion__Group__103008);
            rule__TableQuestion__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__11_in_rule__TableQuestion__Group__103011);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1528:1: rule__TableQuestion__Group__10__Impl : ( ( rule__TableQuestion__Group_10__0 )* ) ;
    public final void rule__TableQuestion__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1532:1: ( ( ( rule__TableQuestion__Group_10__0 )* ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1533:1: ( ( rule__TableQuestion__Group_10__0 )* )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1533:1: ( ( rule__TableQuestion__Group_10__0 )* )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1534:1: ( rule__TableQuestion__Group_10__0 )*
            {
             before(grammarAccess.getTableQuestionAccess().getGroup_10()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1535:1: ( rule__TableQuestion__Group_10__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==19) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1535:2: rule__TableQuestion__Group_10__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group_10__0_in_rule__TableQuestion__Group__10__Impl3038);
            	    rule__TableQuestion__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getTableQuestionAccess().getGroup_10()); 

            }


            }

        }
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1545:1: rule__TableQuestion__Group__11 : rule__TableQuestion__Group__11__Impl rule__TableQuestion__Group__12 ;
    public final void rule__TableQuestion__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1549:1: ( rule__TableQuestion__Group__11__Impl rule__TableQuestion__Group__12 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1550:2: rule__TableQuestion__Group__11__Impl rule__TableQuestion__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__11__Impl_in_rule__TableQuestion__Group__113069);
            rule__TableQuestion__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__12_in_rule__TableQuestion__Group__113072);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1557:1: rule__TableQuestion__Group__11__Impl : ( ')' ) ;
    public final void rule__TableQuestion__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1561:1: ( ( ')' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1562:1: ( ')' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1562:1: ( ')' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1563:1: ')'
            {
             before(grammarAccess.getTableQuestionAccess().getRightParenthesisKeyword_11()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__TableQuestion__Group__11__Impl3100); 
             after(grammarAccess.getTableQuestionAccess().getRightParenthesisKeyword_11()); 

            }


            }

        }
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1576:1: rule__TableQuestion__Group__12 : rule__TableQuestion__Group__12__Impl rule__TableQuestion__Group__13 ;
    public final void rule__TableQuestion__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1580:1: ( rule__TableQuestion__Group__12__Impl rule__TableQuestion__Group__13 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1581:2: rule__TableQuestion__Group__12__Impl rule__TableQuestion__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__12__Impl_in_rule__TableQuestion__Group__123131);
            rule__TableQuestion__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__13_in_rule__TableQuestion__Group__123134);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1588:1: rule__TableQuestion__Group__12__Impl : ( ( rule__TableQuestion__AnswersAssignment_12 ) ) ;
    public final void rule__TableQuestion__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1592:1: ( ( ( rule__TableQuestion__AnswersAssignment_12 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1593:1: ( ( rule__TableQuestion__AnswersAssignment_12 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1593:1: ( ( rule__TableQuestion__AnswersAssignment_12 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1594:1: ( rule__TableQuestion__AnswersAssignment_12 )
            {
             before(grammarAccess.getTableQuestionAccess().getAnswersAssignment_12()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1595:1: ( rule__TableQuestion__AnswersAssignment_12 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1595:2: rule__TableQuestion__AnswersAssignment_12
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__AnswersAssignment_12_in_rule__TableQuestion__Group__12__Impl3161);
            rule__TableQuestion__AnswersAssignment_12();

            state._fsp--;


            }

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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1605:1: rule__TableQuestion__Group__13 : rule__TableQuestion__Group__13__Impl rule__TableQuestion__Group__14 ;
    public final void rule__TableQuestion__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1609:1: ( rule__TableQuestion__Group__13__Impl rule__TableQuestion__Group__14 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1610:2: rule__TableQuestion__Group__13__Impl rule__TableQuestion__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__13__Impl_in_rule__TableQuestion__Group__133191);
            rule__TableQuestion__Group__13__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__14_in_rule__TableQuestion__Group__133194);
            rule__TableQuestion__Group__14();

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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1617:1: rule__TableQuestion__Group__13__Impl : ( ( rule__TableQuestion__AnswersAssignment_13 )* ) ;
    public final void rule__TableQuestion__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1621:1: ( ( ( rule__TableQuestion__AnswersAssignment_13 )* ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1622:1: ( ( rule__TableQuestion__AnswersAssignment_13 )* )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1622:1: ( ( rule__TableQuestion__AnswersAssignment_13 )* )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1623:1: ( rule__TableQuestion__AnswersAssignment_13 )*
            {
             before(grammarAccess.getTableQuestionAccess().getAnswersAssignment_13()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1624:1: ( rule__TableQuestion__AnswersAssignment_13 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==17) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1624:2: rule__TableQuestion__AnswersAssignment_13
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__AnswersAssignment_13_in_rule__TableQuestion__Group__13__Impl3221);
            	    rule__TableQuestion__AnswersAssignment_13();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getTableQuestionAccess().getAnswersAssignment_13()); 

            }


            }

        }
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


    // $ANTLR start "rule__TableQuestion__Group__14"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1634:1: rule__TableQuestion__Group__14 : rule__TableQuestion__Group__14__Impl ;
    public final void rule__TableQuestion__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1638:1: ( rule__TableQuestion__Group__14__Impl )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1639:2: rule__TableQuestion__Group__14__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group__14__Impl_in_rule__TableQuestion__Group__143252);
            rule__TableQuestion__Group__14__Impl();

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
    // $ANTLR end "rule__TableQuestion__Group__14"


    // $ANTLR start "rule__TableQuestion__Group__14__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1645:1: rule__TableQuestion__Group__14__Impl : ( ')' ) ;
    public final void rule__TableQuestion__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1649:1: ( ( ')' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1650:1: ( ')' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1650:1: ( ')' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1651:1: ')'
            {
             before(grammarAccess.getTableQuestionAccess().getRightParenthesisKeyword_14()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__TableQuestion__Group__14__Impl3280); 
             after(grammarAccess.getTableQuestionAccess().getRightParenthesisKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableQuestion__Group__14__Impl"


    // $ANTLR start "rule__TableQuestion__Group_10__0"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1694:1: rule__TableQuestion__Group_10__0 : rule__TableQuestion__Group_10__0__Impl rule__TableQuestion__Group_10__1 ;
    public final void rule__TableQuestion__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1698:1: ( rule__TableQuestion__Group_10__0__Impl rule__TableQuestion__Group_10__1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1699:2: rule__TableQuestion__Group_10__0__Impl rule__TableQuestion__Group_10__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group_10__0__Impl_in_rule__TableQuestion__Group_10__03341);
            rule__TableQuestion__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group_10__1_in_rule__TableQuestion__Group_10__03344);
            rule__TableQuestion__Group_10__1();

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
    // $ANTLR end "rule__TableQuestion__Group_10__0"


    // $ANTLR start "rule__TableQuestion__Group_10__0__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1706:1: rule__TableQuestion__Group_10__0__Impl : ( ',' ) ;
    public final void rule__TableQuestion__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1710:1: ( ( ',' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1711:1: ( ',' )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1711:1: ( ',' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1712:1: ','
            {
             before(grammarAccess.getTableQuestionAccess().getCommaKeyword_10_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__TableQuestion__Group_10__0__Impl3372); 
             after(grammarAccess.getTableQuestionAccess().getCommaKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableQuestion__Group_10__0__Impl"


    // $ANTLR start "rule__TableQuestion__Group_10__1"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1725:1: rule__TableQuestion__Group_10__1 : rule__TableQuestion__Group_10__1__Impl ;
    public final void rule__TableQuestion__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1729:1: ( rule__TableQuestion__Group_10__1__Impl )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1730:2: rule__TableQuestion__Group_10__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__Group_10__1__Impl_in_rule__TableQuestion__Group_10__13403);
            rule__TableQuestion__Group_10__1__Impl();

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
    // $ANTLR end "rule__TableQuestion__Group_10__1"


    // $ANTLR start "rule__TableQuestion__Group_10__1__Impl"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1736:1: rule__TableQuestion__Group_10__1__Impl : ( ( rule__TableQuestion__ItemsAssignment_10_1 ) ) ;
    public final void rule__TableQuestion__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1740:1: ( ( ( rule__TableQuestion__ItemsAssignment_10_1 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1741:1: ( ( rule__TableQuestion__ItemsAssignment_10_1 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1741:1: ( ( rule__TableQuestion__ItemsAssignment_10_1 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1742:1: ( rule__TableQuestion__ItemsAssignment_10_1 )
            {
             before(grammarAccess.getTableQuestionAccess().getItemsAssignment_10_1()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1743:1: ( rule__TableQuestion__ItemsAssignment_10_1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1743:2: rule__TableQuestion__ItemsAssignment_10_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TableQuestion__ItemsAssignment_10_1_in_rule__TableQuestion__Group_10__1__Impl3430);
            rule__TableQuestion__ItemsAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getTableQuestionAccess().getItemsAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableQuestion__Group_10__1__Impl"


    // $ANTLR start "rule__Item__Group__0"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1757:1: rule__Item__Group__0 : rule__Item__Group__0__Impl rule__Item__Group__1 ;
    public final void rule__Item__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1761:1: ( rule__Item__Group__0__Impl rule__Item__Group__1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1762:2: rule__Item__Group__0__Impl rule__Item__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Item__Group__0__Impl_in_rule__Item__Group__03464);
            rule__Item__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Item__Group__1_in_rule__Item__Group__03467);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1769:1: rule__Item__Group__0__Impl : ( ( rule__Item__IsFreeTextAssignment_0 )? ) ;
    public final void rule__Item__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1773:1: ( ( ( rule__Item__IsFreeTextAssignment_0 )? ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1774:1: ( ( rule__Item__IsFreeTextAssignment_0 )? )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1774:1: ( ( rule__Item__IsFreeTextAssignment_0 )? )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1775:1: ( rule__Item__IsFreeTextAssignment_0 )?
            {
             before(grammarAccess.getItemAccess().getIsFreeTextAssignment_0()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1776:1: ( rule__Item__IsFreeTextAssignment_0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1776:2: rule__Item__IsFreeTextAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Item__IsFreeTextAssignment_0_in_rule__Item__Group__0__Impl3494);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1786:1: rule__Item__Group__1 : rule__Item__Group__1__Impl ;
    public final void rule__Item__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1790:1: ( rule__Item__Group__1__Impl )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1791:2: rule__Item__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Item__Group__1__Impl_in_rule__Item__Group__13525);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1797:1: rule__Item__Group__1__Impl : ( ( rule__Item__BodyAssignment_1 ) ) ;
    public final void rule__Item__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1801:1: ( ( ( rule__Item__BodyAssignment_1 ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1802:1: ( ( rule__Item__BodyAssignment_1 ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1802:1: ( ( rule__Item__BodyAssignment_1 ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1803:1: ( rule__Item__BodyAssignment_1 )
            {
             before(grammarAccess.getItemAccess().getBodyAssignment_1()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1804:1: ( rule__Item__BodyAssignment_1 )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1804:2: rule__Item__BodyAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Item__BodyAssignment_1_in_rule__Item__Group__1__Impl3552);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1819:1: rule__Survey__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Survey__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1823:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1824:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1824:1: ( ruleEString )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1825:1: ruleEString
            {
             before(grammarAccess.getSurveyAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Survey__NameAssignment_13591);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1834:1: rule__Survey__IntroAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Survey__IntroAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1838:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1839:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1839:1: ( ruleEString )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1840:1: ruleEString
            {
             before(grammarAccess.getSurveyAccess().getIntroEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Survey__IntroAssignment_2_13622);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1849:1: rule__Survey__QuestionsAssignment_3 : ( ruleQuestion ) ;
    public final void rule__Survey__QuestionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1853:1: ( ( ruleQuestion ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1854:1: ( ruleQuestion )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1854:1: ( ruleQuestion )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1855:1: ruleQuestion
            {
             before(grammarAccess.getSurveyAccess().getQuestionsQuestionParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_rule__Survey__QuestionsAssignment_33653);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1864:1: rule__Survey__QuestionsAssignment_4 : ( ruleQuestion ) ;
    public final void rule__Survey__QuestionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1868:1: ( ( ruleQuestion ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1869:1: ( ruleQuestion )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1869:1: ( ruleQuestion )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1870:1: ruleQuestion
            {
             before(grammarAccess.getSurveyAccess().getQuestionsQuestionParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_rule__Survey__QuestionsAssignment_43684);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1879:1: rule__Survey__OutroAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Survey__OutroAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1883:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1884:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1884:1: ( ruleEString )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1885:1: ruleEString
            {
             before(grammarAccess.getSurveyAccess().getOutroEStringParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Survey__OutroAssignment_5_13715);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1894:1: rule__Question_Impl__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Question_Impl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1898:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1899:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1899:1: ( ruleEString )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1900:1: ruleEString
            {
             before(grammarAccess.getQuestion_ImplAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Question_Impl__NameAssignment_13746);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1909:1: rule__Question_Impl__IsExclusiveAssignment_2 : ( ( 'exclusive' ) ) ;
    public final void rule__Question_Impl__IsExclusiveAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1913:1: ( ( ( 'exclusive' ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1914:1: ( ( 'exclusive' ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1914:1: ( ( 'exclusive' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1915:1: ( 'exclusive' )
            {
             before(grammarAccess.getQuestion_ImplAccess().getIsExclusiveExclusiveKeyword_2_0()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1916:1: ( 'exclusive' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1917:1: 'exclusive'
            {
             before(grammarAccess.getQuestion_ImplAccess().getIsExclusiveExclusiveKeyword_2_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Question_Impl__IsExclusiveAssignment_23782); 
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1932:1: rule__Question_Impl__IsOptionalAssignment_3 : ( ( 'optional' ) ) ;
    public final void rule__Question_Impl__IsOptionalAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1936:1: ( ( ( 'optional' ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1937:1: ( ( 'optional' ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1937:1: ( ( 'optional' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1938:1: ( 'optional' )
            {
             before(grammarAccess.getQuestion_ImplAccess().getIsOptionalOptionalKeyword_3_0()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1939:1: ( 'optional' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1940:1: 'optional'
            {
             before(grammarAccess.getQuestion_ImplAccess().getIsOptionalOptionalKeyword_3_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Question_Impl__IsOptionalAssignment_33826); 
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


    // $ANTLR start "rule__Question_Impl__IsFreeTextAssignment_4"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1955:1: rule__Question_Impl__IsFreeTextAssignment_4 : ( ( 'freetext' ) ) ;
    public final void rule__Question_Impl__IsFreeTextAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1959:1: ( ( ( 'freetext' ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1960:1: ( ( 'freetext' ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1960:1: ( ( 'freetext' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1961:1: ( 'freetext' )
            {
             before(grammarAccess.getQuestion_ImplAccess().getIsFreeTextFreetextKeyword_4_0()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1962:1: ( 'freetext' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1963:1: 'freetext'
            {
             before(grammarAccess.getQuestion_ImplAccess().getIsFreeTextFreetextKeyword_4_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Question_Impl__IsFreeTextAssignment_43870); 
             after(grammarAccess.getQuestion_ImplAccess().getIsFreeTextFreetextKeyword_4_0()); 

            }

             after(grammarAccess.getQuestion_ImplAccess().getIsFreeTextFreetextKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question_Impl__IsFreeTextAssignment_4"


    // $ANTLR start "rule__Question_Impl__BodyAssignment_5"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1978:1: rule__Question_Impl__BodyAssignment_5 : ( ruleEString ) ;
    public final void rule__Question_Impl__BodyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1982:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1983:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1983:1: ( ruleEString )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1984:1: ruleEString
            {
             before(grammarAccess.getQuestion_ImplAccess().getBodyEStringParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Question_Impl__BodyAssignment_53909);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestion_ImplAccess().getBodyEStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question_Impl__BodyAssignment_5"


    // $ANTLR start "rule__Question_Impl__AnswersAssignment_7"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1993:1: rule__Question_Impl__AnswersAssignment_7 : ( ruleAnswer ) ;
    public final void rule__Question_Impl__AnswersAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1997:1: ( ( ruleAnswer ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1998:1: ( ruleAnswer )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1998:1: ( ruleAnswer )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1999:1: ruleAnswer
            {
             before(grammarAccess.getQuestion_ImplAccess().getAnswersAnswerParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__Question_Impl__AnswersAssignment_73940);
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


    // $ANTLR start "rule__Question_Impl__AnswersAssignment_8"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2008:1: rule__Question_Impl__AnswersAssignment_8 : ( ruleAnswer ) ;
    public final void rule__Question_Impl__AnswersAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2012:1: ( ( ruleAnswer ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2013:1: ( ruleAnswer )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2013:1: ( ruleAnswer )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2014:1: ruleAnswer
            {
             before(grammarAccess.getQuestion_ImplAccess().getAnswersAnswerParserRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__Question_Impl__AnswersAssignment_83971);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getQuestion_ImplAccess().getAnswersAnswerParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question_Impl__AnswersAssignment_8"


    // $ANTLR start "rule__Answer__IsFreeTextAssignment_1"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2023:1: rule__Answer__IsFreeTextAssignment_1 : ( ( 'freetext' ) ) ;
    public final void rule__Answer__IsFreeTextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2027:1: ( ( ( 'freetext' ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2028:1: ( ( 'freetext' ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2028:1: ( ( 'freetext' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2029:1: ( 'freetext' )
            {
             before(grammarAccess.getAnswerAccess().getIsFreeTextFreetextKeyword_1_0()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2030:1: ( 'freetext' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2031:1: 'freetext'
            {
             before(grammarAccess.getAnswerAccess().getIsFreeTextFreetextKeyword_1_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Answer__IsFreeTextAssignment_14007); 
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2046:1: rule__Answer__BodyAssignment_2 : ( ruleEString ) ;
    public final void rule__Answer__BodyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2050:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2051:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2051:1: ( ruleEString )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2052:1: ruleEString
            {
             before(grammarAccess.getAnswerAccess().getBodyEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Answer__BodyAssignment_24046);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2061:1: rule__Answer__FollowupAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Answer__FollowupAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2065:1: ( ( ( ruleEString ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2066:1: ( ( ruleEString ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2066:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2067:1: ( ruleEString )
            {
             before(grammarAccess.getAnswerAccess().getFollowupQuestionCrossReference_3_1_0()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2068:1: ( ruleEString )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2069:1: ruleEString
            {
             before(grammarAccess.getAnswerAccess().getFollowupQuestionEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Answer__FollowupAssignment_3_14081);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2080:1: rule__Answer__FollowupAssignment_3_2_1 : ( ( ruleEString ) ) ;
    public final void rule__Answer__FollowupAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2084:1: ( ( ( ruleEString ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2085:1: ( ( ruleEString ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2085:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2086:1: ( ruleEString )
            {
             before(grammarAccess.getAnswerAccess().getFollowupQuestionCrossReference_3_2_1_0()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2087:1: ( ruleEString )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2088:1: ruleEString
            {
             before(grammarAccess.getAnswerAccess().getFollowupQuestionEStringParserRuleCall_3_2_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Answer__FollowupAssignment_3_2_14120);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2099:1: rule__TableQuestion__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__TableQuestion__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2103:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2104:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2104:1: ( ruleEString )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2105:1: ruleEString
            {
             before(grammarAccess.getTableQuestionAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TableQuestion__NameAssignment_14155);
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2114:1: rule__TableQuestion__IsExclusiveAssignment_2 : ( ( 'exclusive' ) ) ;
    public final void rule__TableQuestion__IsExclusiveAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2118:1: ( ( ( 'exclusive' ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2119:1: ( ( 'exclusive' ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2119:1: ( ( 'exclusive' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2120:1: ( 'exclusive' )
            {
             before(grammarAccess.getTableQuestionAccess().getIsExclusiveExclusiveKeyword_2_0()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2121:1: ( 'exclusive' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2122:1: 'exclusive'
            {
             before(grammarAccess.getTableQuestionAccess().getIsExclusiveExclusiveKeyword_2_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__TableQuestion__IsExclusiveAssignment_24191); 
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2137:1: rule__TableQuestion__IsOptionalAssignment_3 : ( ( 'optional' ) ) ;
    public final void rule__TableQuestion__IsOptionalAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2141:1: ( ( ( 'optional' ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2142:1: ( ( 'optional' ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2142:1: ( ( 'optional' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2143:1: ( 'optional' )
            {
             before(grammarAccess.getTableQuestionAccess().getIsOptionalOptionalKeyword_3_0()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2144:1: ( 'optional' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2145:1: 'optional'
            {
             before(grammarAccess.getTableQuestionAccess().getIsOptionalOptionalKeyword_3_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__TableQuestion__IsOptionalAssignment_34235); 
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


    // $ANTLR start "rule__TableQuestion__IsFreeTextAssignment_4"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2160:1: rule__TableQuestion__IsFreeTextAssignment_4 : ( ( 'freetext' ) ) ;
    public final void rule__TableQuestion__IsFreeTextAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2164:1: ( ( ( 'freetext' ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2165:1: ( ( 'freetext' ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2165:1: ( ( 'freetext' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2166:1: ( 'freetext' )
            {
             before(grammarAccess.getTableQuestionAccess().getIsFreeTextFreetextKeyword_4_0()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2167:1: ( 'freetext' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2168:1: 'freetext'
            {
             before(grammarAccess.getTableQuestionAccess().getIsFreeTextFreetextKeyword_4_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__TableQuestion__IsFreeTextAssignment_44279); 
             after(grammarAccess.getTableQuestionAccess().getIsFreeTextFreetextKeyword_4_0()); 

            }

             after(grammarAccess.getTableQuestionAccess().getIsFreeTextFreetextKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableQuestion__IsFreeTextAssignment_4"


    // $ANTLR start "rule__TableQuestion__BodyAssignment_5"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2183:1: rule__TableQuestion__BodyAssignment_5 : ( ruleEString ) ;
    public final void rule__TableQuestion__BodyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2187:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2188:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2188:1: ( ruleEString )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2189:1: ruleEString
            {
             before(grammarAccess.getTableQuestionAccess().getBodyEStringParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TableQuestion__BodyAssignment_54318);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTableQuestionAccess().getBodyEStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableQuestion__BodyAssignment_5"


    // $ANTLR start "rule__TableQuestion__ItemsAssignment_9"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2198:1: rule__TableQuestion__ItemsAssignment_9 : ( ruleItem ) ;
    public final void rule__TableQuestion__ItemsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2202:1: ( ( ruleItem ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2203:1: ( ruleItem )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2203:1: ( ruleItem )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2204:1: ruleItem
            {
             before(grammarAccess.getTableQuestionAccess().getItemsItemParserRuleCall_9_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleItem_in_rule__TableQuestion__ItemsAssignment_94349);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getTableQuestionAccess().getItemsItemParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableQuestion__ItemsAssignment_9"


    // $ANTLR start "rule__TableQuestion__ItemsAssignment_10_1"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2213:1: rule__TableQuestion__ItemsAssignment_10_1 : ( ruleItem ) ;
    public final void rule__TableQuestion__ItemsAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2217:1: ( ( ruleItem ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2218:1: ( ruleItem )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2218:1: ( ruleItem )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2219:1: ruleItem
            {
             before(grammarAccess.getTableQuestionAccess().getItemsItemParserRuleCall_10_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleItem_in_rule__TableQuestion__ItemsAssignment_10_14380);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getTableQuestionAccess().getItemsItemParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableQuestion__ItemsAssignment_10_1"


    // $ANTLR start "rule__TableQuestion__AnswersAssignment_12"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2228:1: rule__TableQuestion__AnswersAssignment_12 : ( ruleAnswer ) ;
    public final void rule__TableQuestion__AnswersAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2232:1: ( ( ruleAnswer ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2233:1: ( ruleAnswer )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2233:1: ( ruleAnswer )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2234:1: ruleAnswer
            {
             before(grammarAccess.getTableQuestionAccess().getAnswersAnswerParserRuleCall_12_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__TableQuestion__AnswersAssignment_124411);
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


    // $ANTLR start "rule__TableQuestion__AnswersAssignment_13"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2243:1: rule__TableQuestion__AnswersAssignment_13 : ( ruleAnswer ) ;
    public final void rule__TableQuestion__AnswersAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2247:1: ( ( ruleAnswer ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2248:1: ( ruleAnswer )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2248:1: ( ruleAnswer )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2249:1: ruleAnswer
            {
             before(grammarAccess.getTableQuestionAccess().getAnswersAnswerParserRuleCall_13_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__TableQuestion__AnswersAssignment_134442);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getTableQuestionAccess().getAnswersAnswerParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableQuestion__AnswersAssignment_13"


    // $ANTLR start "rule__Item__IsFreeTextAssignment_0"
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2258:1: rule__Item__IsFreeTextAssignment_0 : ( ( 'freetext' ) ) ;
    public final void rule__Item__IsFreeTextAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2262:1: ( ( ( 'freetext' ) ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2263:1: ( ( 'freetext' ) )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2263:1: ( ( 'freetext' ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2264:1: ( 'freetext' )
            {
             before(grammarAccess.getItemAccess().getIsFreeTextFreetextKeyword_0_0()); 
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2265:1: ( 'freetext' )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2266:1: 'freetext'
            {
             before(grammarAccess.getItemAccess().getIsFreeTextFreetextKeyword_0_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Item__IsFreeTextAssignment_04478); 
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
    // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2281:1: rule__Item__BodyAssignment_1 : ( ruleEString ) ;
    public final void rule__Item__BodyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2285:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2286:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2286:1: ( ruleEString )
            // ../dk.itu.smdp.group11.survey.ui/src-gen/dk/itu/smdp/group11/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2287:1: ruleEString
            {
             before(grammarAccess.getItemAccess().getBodyEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Item__BodyAssignment_14517);
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
        public static final BitSet FOLLOW_ruleAnswer_in_entryRuleAnswer303 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswer310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group__0_in_ruleAnswer336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTableQuestion_in_entryRuleTableQuestion365 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTableQuestion372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__0_in_ruleTableQuestion398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleItem_in_entryRuleItem425 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleItem432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Item__Group__0_in_ruleItem458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_Impl_in_rule__Question__Alternatives494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTableQuestion_in_rule__Question__Alternatives511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__0__Impl_in_rule__Survey__Group__0591 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Survey__Group__1_in_rule__Survey__Group__0594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Survey__Group__0__Impl622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__1__Impl_in_rule__Survey__Group__1653 = new BitSet(new long[]{0x0000000000105000L});
        public static final BitSet FOLLOW_rule__Survey__Group__2_in_rule__Survey__Group__1656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__NameAssignment_1_in_rule__Survey__Group__1__Impl683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__2__Impl_in_rule__Survey__Group__2713 = new BitSet(new long[]{0x0000000000105000L});
        public static final BitSet FOLLOW_rule__Survey__Group__3_in_rule__Survey__Group__2716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group_2__0_in_rule__Survey__Group__2__Impl743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__3__Impl_in_rule__Survey__Group__3774 = new BitSet(new long[]{0x0000000000107000L});
        public static final BitSet FOLLOW_rule__Survey__Group__4_in_rule__Survey__Group__3777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__QuestionsAssignment_3_in_rule__Survey__Group__3__Impl804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__4__Impl_in_rule__Survey__Group__4834 = new BitSet(new long[]{0x0000000000107000L});
        public static final BitSet FOLLOW_rule__Survey__Group__5_in_rule__Survey__Group__4837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__QuestionsAssignment_4_in_rule__Survey__Group__4__Impl864 = new BitSet(new long[]{0x0000000000105002L});
        public static final BitSet FOLLOW_rule__Survey__Group__5__Impl_in_rule__Survey__Group__5895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group_5__0_in_rule__Survey__Group__5__Impl922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group_2__0__Impl_in_rule__Survey__Group_2__0965 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Survey__Group_2__1_in_rule__Survey__Group_2__0968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Survey__Group_2__0__Impl996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group_2__1__Impl_in_rule__Survey__Group_2__11027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__IntroAssignment_2_1_in_rule__Survey__Group_2__1__Impl1054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group_5__0__Impl_in_rule__Survey__Group_5__01088 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Survey__Group_5__1_in_rule__Survey__Group_5__01091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Survey__Group_5__0__Impl1119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group_5__1__Impl_in_rule__Survey__Group_5__11150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__OutroAssignment_5_1_in_rule__Survey__Group_5__1__Impl1177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question_Impl__Group__0__Impl_in_rule__Question_Impl__Group__01211 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Question_Impl__Group__1_in_rule__Question_Impl__Group__01214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Question_Impl__Group__0__Impl1242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question_Impl__Group__1__Impl_in_rule__Question_Impl__Group__11273 = new BitSet(new long[]{0x0000000001C00030L});
        public static final BitSet FOLLOW_rule__Question_Impl__Group__2_in_rule__Question_Impl__Group__11276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question_Impl__NameAssignment_1_in_rule__Question_Impl__Group__1__Impl1303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question_Impl__Group__2__Impl_in_rule__Question_Impl__Group__21333 = new BitSet(new long[]{0x0000000001C00030L});
        public static final BitSet FOLLOW_rule__Question_Impl__Group__3_in_rule__Question_Impl__Group__21336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question_Impl__IsExclusiveAssignment_2_in_rule__Question_Impl__Group__2__Impl1363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question_Impl__Group__3__Impl_in_rule__Question_Impl__Group__31394 = new BitSet(new long[]{0x0000000001C00030L});
        public static final BitSet FOLLOW_rule__Question_Impl__Group__4_in_rule__Question_Impl__Group__31397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question_Impl__IsOptionalAssignment_3_in_rule__Question_Impl__Group__3__Impl1424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question_Impl__Group__4__Impl_in_rule__Question_Impl__Group__41455 = new BitSet(new long[]{0x0000000001C00030L});
        public static final BitSet FOLLOW_rule__Question_Impl__Group__5_in_rule__Question_Impl__Group__41458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question_Impl__IsFreeTextAssignment_4_in_rule__Question_Impl__Group__4__Impl1485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question_Impl__Group__5__Impl_in_rule__Question_Impl__Group__51516 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Question_Impl__Group__6_in_rule__Question_Impl__Group__51519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question_Impl__BodyAssignment_5_in_rule__Question_Impl__Group__5__Impl1546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question_Impl__Group__6__Impl_in_rule__Question_Impl__Group__61576 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Question_Impl__Group__7_in_rule__Question_Impl__Group__61579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Question_Impl__Group__6__Impl1607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question_Impl__Group__7__Impl_in_rule__Question_Impl__Group__71638 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_rule__Question_Impl__Group__8_in_rule__Question_Impl__Group__71641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question_Impl__AnswersAssignment_7_in_rule__Question_Impl__Group__7__Impl1668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question_Impl__Group__8__Impl_in_rule__Question_Impl__Group__81698 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_rule__Question_Impl__Group__9_in_rule__Question_Impl__Group__81701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question_Impl__AnswersAssignment_8_in_rule__Question_Impl__Group__8__Impl1728 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__Question_Impl__Group__9__Impl_in_rule__Question_Impl__Group__91759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Question_Impl__Group__9__Impl1787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group__0__Impl_in_rule__Answer__Group__01838 = new BitSet(new long[]{0x0000000001000030L});
        public static final BitSet FOLLOW_rule__Answer__Group__1_in_rule__Answer__Group__01841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Answer__Group__0__Impl1869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group__1__Impl_in_rule__Answer__Group__11900 = new BitSet(new long[]{0x0000000001000030L});
        public static final BitSet FOLLOW_rule__Answer__Group__2_in_rule__Answer__Group__11903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__IsFreeTextAssignment_1_in_rule__Answer__Group__1__Impl1930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group__2__Impl_in_rule__Answer__Group__21961 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Answer__Group__3_in_rule__Answer__Group__21964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__BodyAssignment_2_in_rule__Answer__Group__2__Impl1991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group__3__Impl_in_rule__Answer__Group__32021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group_3__0_in_rule__Answer__Group__3__Impl2048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group_3__0__Impl_in_rule__Answer__Group_3__02087 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Answer__Group_3__1_in_rule__Answer__Group_3__02090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Answer__Group_3__0__Impl2118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group_3__1__Impl_in_rule__Answer__Group_3__12149 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Answer__Group_3__2_in_rule__Answer__Group_3__12152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__FollowupAssignment_3_1_in_rule__Answer__Group_3__1__Impl2179 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group_3__2__Impl_in_rule__Answer__Group_3__22209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group_3_2__0_in_rule__Answer__Group_3__2__Impl2236 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__Answer__Group_3_2__0__Impl_in_rule__Answer__Group_3_2__02273 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Answer__Group_3_2__1_in_rule__Answer__Group_3_2__02276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Answer__Group_3_2__0__Impl2304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group_3_2__1__Impl_in_rule__Answer__Group_3_2__12335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__FollowupAssignment_3_2_1_in_rule__Answer__Group_3_2__1__Impl2362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__0__Impl_in_rule__TableQuestion__Group__02397 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__1_in_rule__TableQuestion__Group__02400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__TableQuestion__Group__0__Impl2428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__1__Impl_in_rule__TableQuestion__Group__12459 = new BitSet(new long[]{0x0000000001C00030L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__2_in_rule__TableQuestion__Group__12462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__NameAssignment_1_in_rule__TableQuestion__Group__1__Impl2489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__2__Impl_in_rule__TableQuestion__Group__22519 = new BitSet(new long[]{0x0000000001C00030L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__3_in_rule__TableQuestion__Group__22522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__IsExclusiveAssignment_2_in_rule__TableQuestion__Group__2__Impl2549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__3__Impl_in_rule__TableQuestion__Group__32580 = new BitSet(new long[]{0x0000000001C00030L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__4_in_rule__TableQuestion__Group__32583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__IsOptionalAssignment_3_in_rule__TableQuestion__Group__3__Impl2610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__4__Impl_in_rule__TableQuestion__Group__42641 = new BitSet(new long[]{0x0000000001C00030L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__5_in_rule__TableQuestion__Group__42644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__IsFreeTextAssignment_4_in_rule__TableQuestion__Group__4__Impl2671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__5__Impl_in_rule__TableQuestion__Group__52702 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__6_in_rule__TableQuestion__Group__52705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__BodyAssignment_5_in_rule__TableQuestion__Group__5__Impl2732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__6__Impl_in_rule__TableQuestion__Group__62762 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__7_in_rule__TableQuestion__Group__62765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__TableQuestion__Group__6__Impl2793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__7__Impl_in_rule__TableQuestion__Group__72824 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__8_in_rule__TableQuestion__Group__72827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__TableQuestion__Group__7__Impl2855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__8__Impl_in_rule__TableQuestion__Group__82886 = new BitSet(new long[]{0x0000000001000030L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__9_in_rule__TableQuestion__Group__82889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__TableQuestion__Group__8__Impl2917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__9__Impl_in_rule__TableQuestion__Group__92948 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__10_in_rule__TableQuestion__Group__92951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__ItemsAssignment_9_in_rule__TableQuestion__Group__9__Impl2978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__10__Impl_in_rule__TableQuestion__Group__103008 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__11_in_rule__TableQuestion__Group__103011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group_10__0_in_rule__TableQuestion__Group__10__Impl3038 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__11__Impl_in_rule__TableQuestion__Group__113069 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__12_in_rule__TableQuestion__Group__113072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__TableQuestion__Group__11__Impl3100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__12__Impl_in_rule__TableQuestion__Group__123131 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__13_in_rule__TableQuestion__Group__123134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__AnswersAssignment_12_in_rule__TableQuestion__Group__12__Impl3161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__13__Impl_in_rule__TableQuestion__Group__133191 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__14_in_rule__TableQuestion__Group__133194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__AnswersAssignment_13_in_rule__TableQuestion__Group__13__Impl3221 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group__14__Impl_in_rule__TableQuestion__Group__143252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__TableQuestion__Group__14__Impl3280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group_10__0__Impl_in_rule__TableQuestion__Group_10__03341 = new BitSet(new long[]{0x0000000001000030L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group_10__1_in_rule__TableQuestion__Group_10__03344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__TableQuestion__Group_10__0__Impl3372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__Group_10__1__Impl_in_rule__TableQuestion__Group_10__13403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TableQuestion__ItemsAssignment_10_1_in_rule__TableQuestion__Group_10__1__Impl3430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Item__Group__0__Impl_in_rule__Item__Group__03464 = new BitSet(new long[]{0x0000000001000030L});
        public static final BitSet FOLLOW_rule__Item__Group__1_in_rule__Item__Group__03467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Item__IsFreeTextAssignment_0_in_rule__Item__Group__0__Impl3494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Item__Group__1__Impl_in_rule__Item__Group__13525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Item__BodyAssignment_1_in_rule__Item__Group__1__Impl3552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Survey__NameAssignment_13591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Survey__IntroAssignment_2_13622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_rule__Survey__QuestionsAssignment_33653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_rule__Survey__QuestionsAssignment_43684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Survey__OutroAssignment_5_13715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Question_Impl__NameAssignment_13746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Question_Impl__IsExclusiveAssignment_23782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Question_Impl__IsOptionalAssignment_33826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Question_Impl__IsFreeTextAssignment_43870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Question_Impl__BodyAssignment_53909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__Question_Impl__AnswersAssignment_73940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__Question_Impl__AnswersAssignment_83971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Answer__IsFreeTextAssignment_14007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Answer__BodyAssignment_24046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Answer__FollowupAssignment_3_14081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Answer__FollowupAssignment_3_2_14120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TableQuestion__NameAssignment_14155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__TableQuestion__IsExclusiveAssignment_24191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__TableQuestion__IsOptionalAssignment_34235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__TableQuestion__IsFreeTextAssignment_44279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TableQuestion__BodyAssignment_54318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleItem_in_rule__TableQuestion__ItemsAssignment_94349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleItem_in_rule__TableQuestion__ItemsAssignment_10_14380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__TableQuestion__AnswersAssignment_124411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__TableQuestion__AnswersAssignment_134442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Item__IsFreeTextAssignment_04478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Item__BodyAssignment_14517 = new BitSet(new long[]{0x0000000000000002L});
    }


}