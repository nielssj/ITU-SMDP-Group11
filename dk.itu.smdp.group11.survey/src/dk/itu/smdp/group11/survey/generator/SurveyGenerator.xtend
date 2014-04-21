package dk.itu.smdp.group11.survey.generator

import group11survey.Answer
import group11survey.Question
import group11survey.Survey
import group11survey.TableQuestion
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

/**
 * Generates code from your model files on save.
 *
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class SurveyGenerator implements IGenerator {

    def static compileToHtml(Survey it) {
        '''<!DOCTYPE html>
<html ng-app="survey">
    <head>
        <title>Sample Survey</title>
        <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.1.1/css/bootstrap.min.css">
        <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.1.1/css/bootstrap-theme.min.css">
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/angular.js/1.2.15/angular.min.js"></script>
    </head>
    <body>
        <br />
        <div class="container" ng-controller="SurveyController">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h1 class="panel-title">« it.name »</h1>
                </div>
                <div class="panel-body">
                    <p class="lead into">« it.intro »</p>
                    <form class="form-vertical col-md-12" role="form" name="surveyForm" ng-submit="sendSurveyAnswers()">
                        <button type="submit" class="btn btn-primary pull-right" ng-disabled="surveyForm.$pristine">Submit</button>
                    </form>
                    <p class="lead outro">« it.outro »</p>
                </div>
            </div>
        </div>
    </body>
    <script>
        var survey = angular.module( 'survey', [] );
        survey.controller( 'SurveyController', function ( $scope, $compile ) {
            $scope.results = {
                «FOR question : questions SEPARATOR ',' »
                « question.name »: {
                « IF question instanceof TableQuestion »
                « IF ( question.isExclusive ) »
                    « FOR item : (question as TableQuestion).items SEPARATOR ',' »
                        '« item.body »': undefined
                    «ENDFOR»
                « ELSE »
                    « FOR answer : question.answers SEPARATOR ',' »
                        '« answer.body »': {
                            « FOR item : (question as TableQuestion).items SEPARATOR ',' »
                            '« item.body »': false
                            « ENDFOR »
                        }
                    «ENDFOR»
                « ENDIF »
                « ELSE »
                « IF ( !question.isExclusive ) »
                    « FOR answer : question.answers SEPARATOR ',' »
                        « toId( answer.body ) »: false
                    «ENDFOR»
                « ELSE
                » optional: '', regular: '' « ENDIF »
                « ENDIF »
                }
                «ENDFOR»
            };
            var survey = [
                «FOR question : questions SEPARATOR ',' »
                {
                    id: "« toId( question.name ) »",
                    body: "« question.body »",
                    answers: [
                        « FOR answer : question.answers SEPARATOR ',' »
                        {
                            body: "« answer.body »",
                            isFreeText: « IF answer.isFreeText »true« ELSE »false« ENDIF »,
                            « IF answer.followup.length > 0 »
                            followups: [
                                « FOR followup : answer.followup SEPARATOR ',' »
                                    "« toId( followup.name ) »"
                                « ENDFOR »
                            ]
                            « ENDIF»
                        }
                        «ENDFOR»
                    ],
                    isExclusive: « IF question.isExclusive »true« ELSE »false« ENDIF »,
                    isOptional: « IF question.isOptional »true« ELSE »false« ENDIF »,
                    isFollowup: « IF isFollowup( it, question ) »true« ELSE »false« ENDIF »,
                    isTableQuestion: « IF question instanceof TableQuestion »true« ELSE »false« ENDIF »,
                    « IF question instanceof TableQuestion »
                    tableItems: [
                        « FOR item: (question as TableQuestion).items SEPARATOR ',' »
                        "« item.body »"
                        « ENDFOR »
                    ],
                    « ENDIF »
                }
                «ENDFOR»
            ];

            var buildSurvey = function( survey ) {
                var question, i, html = '';
                for ( i = 0; i < survey.length; i++ ) {
                    question = survey[ i ];
                    if ( isVisible( question ) ) {
                        if ( question.isTableQuestion ) {
                            html += createTableQuestion( question );
                        } else {
                            html += createQuestion( question );
                        }
                    }
                }

                $( 'form' ).prepend( $compile( html )( $scope ) );
            }

            var isVisible = function( question ) {
                return ! question.isFollowup;
            }

            var createQuestion = function( question ) {
                var i, html = '<div class="form-group">';
                html += '<p>' + question.body + '</p>';
                for ( i = 0; i < question.answers.length; i++ ) {
                    if ( question.isExclusive ) {
                        html += createRadioAnswer( question.answers[ i ], question );
                    } else {
                        html += createCheckboxAnswer( question.answers[ i ], question );
                    }
                }
                html += '</div><br />'
                return html;
            }

            var createTableQuestion = function( question ) {
                var i, j, html = '<div class="form-group clearfix">';
                html += '<p>' + question.body + '</p>';
                html += '<table class="table">';
                html += '<tr>';
                html += '<td>&nbsp;</td>'
                for ( i = 0; i < question.answers.length; i++ ) {
                    html += '<td>' + question.answers[ i ].body + '</td>';
                }
                html += '</tr>'
                for ( j = 0; j < question.tableItems.length; j++ ) {
                    html += '</tr>';
                    html += '<td>' + question.tableItems[ j ] + '</td>';
                    for ( i = 0; i < question.answers.length; i++ ) {
                        if ( question.isExclusive ) {
                            html += '<td>';
                            html += '<input type="radio" value="' + question.answers[ i ].body + '" ng-model="results.' + question.id + '[\'' + question.tableItems[ j ] + '\']">';
                            html += '</td>';
                        } else {
                            html += '<td>';
                            html += '<input type="checkbox" ng-model="results.' + question.id + '[\'' + question.answers[ i ].body + '\'][\'' + question.tableItems[ j ] + '\']">';
                            html += '</td>';
                        }
                    }
                    html += '</tr>';
                }
                html += '</table>';
                html += '</div><br />';

                return html;
            }

            var createCheckboxAnswer = function( answer, question ) {
                var html = '<div class="checkbox">';
                if ( ! answer.isFreeText ) {
                    html += '<label>';
                }
                html += '<input type="checkbox" ng-model="results.' + question.id + '[\'' + answer.body + '\']">'
                if ( answer.isFreeText ) {
                    html += '<input ng-disabled="!results.' + question.id + '[\'' + answer.body + '\']" placeholder="' + answer.body + '" style="width: auto;" ng-required="true" ng-minlength="1" class="form-control" type="text">';
                } else {
                    html += answer.body
                    html += '</label>';
                }
                html += '</div>';
                return html;
            }

            var createRadioAnswer = function( answer, question ) {
                var html = '<div class="radio">';
                if ( !answer.isFreeText ) {
                    html += '<label>';
                }
                html += '<input type="radio" value="' + answer.body + '" ng-model="results.' + question.id + '.regular">'
                if ( answer.isFreeText ) {
                    html += '<input ng-disabled="results.' + question.id + '.regular !== \'' + answer.body + '\'" placeholder="' + answer.body + '" style="width: auto;" ng-required="true" ng-minlength="1" class="form-control" type="text">';
                } else {
                    html += answer.body
                    html += '</label>';
                }
                html += '</div>';
                return html;
            }

            buildSurvey( survey );

            $scope.sendSurveyAnswers = function() {
                console.log( $scope.results );
            }
        } );
    </script
</html>'''
    }

     /**
      * Generate the MainActivity class. Mostly static.
      */
     def static compileToAndroidMainActivity(Survey it) {
        '''
package dk.itu.smdp.group11.«toId(it.name)»;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import java.util.*;

public class MainActivity extends Activity {
    private Map<String, Question> questionMap;
    private Queue<Question> questionQueue;
    private Question currentQuestion;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Questions questions = new Questions();
        questionMap = questions.getQuestionMap();
        questionQueue = questions.getQuestionQueue();
        setContentView(R.layout.intro);
    }

    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    public void beginSurvey(View view) {
        setContentView(R.layout.question1);
        currentQuestion = questionQueue.poll();
    }

    public void nextQuestion(View view) {
        if (currentQuestion.getAnswers().size() == 1 && currentQuestion.getAnswers().get(0).isFreeText()) {
            Integer freeTextId = currentQuestion.getFreeText().get(0);
            EditText freeText = (EditText)findViewById(freeTextId);
            String answer = freeText.getText().toString();
            if (!currentQuestion.isOptional()) {
                if (answer.trim().length() < 1) {
                    new AlertDialog.Builder(this).setMessage("You must answer this question!").setPositiveButton("OK", null).show();
                    return;
                }
            }
            currentQuestion.setAnswer(answer);
        } else if (currentQuestion.isTableQuestion()) {
            if (currentQuestion.isExclusive()) {
                List<Integer> radioGroups = currentQuestion.getRadioGroups();
                List<Integer> selected = new ArrayList<Integer>();
                for (Integer radioGroupId : radioGroups) {
                    RadioGroup radioGroup = (RadioGroup)findViewById(radioGroupId);
                    int radioButtonId = radioGroup.getCheckedRadioButtonId();
                    View radioButton = radioGroup.findViewById(radioButtonId);
                    int idx = radioGroup.indexOfChild(radioButton);
                    selected.add(idx);
                }
                if (!currentQuestion.isOptional()) {
                    for (int i = 0; i < selected.size(); i++) {
                        if (selected.get(i) == -1 && !currentQuestion.getItems().get(i).isFreeText()) {
                            new AlertDialog.Builder(this).setMessage("You must select an answer for all the items!").setPositiveButton("OK", null).show();
                            return;
                        }
                    }
                }
                for (int i = 0; i < currentQuestion.getItems().size(); i++) {
                    Answer currentItem = currentQuestion.getItems().get(i);
                    if (currentQuestion.getItems().get(i).isFreeText()) {
                        Integer freeTextId = currentQuestion.getFreeText().get(i);
                        EditText freeText = (EditText)findViewById(freeTextId);
                        String answer = freeText.getText().toString();
                        currentQuestion.setAnswer(currentQuestion.getAnswer() + currentItem.getAnswer() + " " + answer + " - " + (selected.get(i) == -1 ? "No answer" : currentQuestion.getAnswers().get(selected.get(i)).getAnswer()) + "\n");
                    } else {
                        currentQuestion.setAnswer(currentQuestion.getAnswer() + currentItem.getAnswer() + " - " + (selected.get(i) == -1 ? "No answer" : currentQuestion.getAnswers().get(selected.get(i)).getAnswer()) + "\n");
                    }
                }
            } else {
                List<Integer> checkBoxes = currentQuestion.getCheckBoxes();
                List<List<Integer>> selections = new ArrayList<List<Integer>>();
                int until = 0;
                for (int i = 0; i < currentQuestion.getItems().size(); i++) {
                    int boxIndex = 0;
                    List<Integer> selected = new ArrayList<Integer>();
                    for (int j = 0 + until; j < currentQuestion.getAnswers().size() + until; j++) {
                        CheckBox checkBox = (CheckBox)findViewById(checkBoxes.get(j));
                        if (checkBox.isChecked()) {
                            selected.add(boxIndex);
                        }
                        boxIndex++;
                    }
                    selections.add(selected);
                    until += currentQuestion.getAnswers().size();
                }
                if (!currentQuestion.isOptional()) {
                    int i = 0;
                    for (List<Integer> selection : selections) {
                        if (selection.isEmpty() && !currentQuestion.getItems().get(i).isFreeText()) {
                            new AlertDialog.Builder(this).setMessage("You must select an answer for all the items!").setPositiveButton("OK", null).show();
                            return;
                        }
                        i++;
                    }
                }
                for (int i = 0; i < currentQuestion.getItems().size(); i++) {
                    Answer currentItem = currentQuestion.getItems().get(i);
                    String select = "";
                    if (selections.get(i).size() > 0) {
                        for (Integer e : selections.get(i)) {
                            String answerText = currentQuestion.getAnswers().get(e).getAnswer();
                            select += select.length() < 1 ? answerText : ", " + answerText;
                        }
                    }
                    if (currentQuestion.getItems().get(i).isFreeText()) {
                        Integer freeTextId = currentQuestion.getFreeText().get(i);
                        EditText freeText = (EditText)findViewById(freeTextId);
                        String answer = freeText.getText().toString();
                        currentQuestion.setAnswer(currentQuestion.getAnswer() + currentItem.getAnswer() + " " + answer + " - " + (selections.get(i).size() < 1 ? "No answer" : select) + "\n");
                    } else {
                        currentQuestion.setAnswer(currentQuestion.getAnswer() + currentItem.getAnswer() + " - " + (selections.get(i).size() < 1 ? "No answer" : select) + "\n");
                    }
                }
            }
        } else if (currentQuestion.isExclusive()) {
            RadioGroup questionRadioGroup = (RadioGroup)findViewById(currentQuestion.getRadioGroups().get(0));
            int radioButtonId = questionRadioGroup.getCheckedRadioButtonId();
            View radioButton = questionRadioGroup.findViewById(radioButtonId);
            int idx = questionRadioGroup.indexOfChild(radioButton);
            if (!currentQuestion.isOptional() && idx == -1) {
                new AlertDialog.Builder(this).setMessage("You must answer this question!").setPositiveButton("OK", null).show();
                return;
            } else {
                if (idx == -1) {
                        currentQuestion.setAnswer("No answer");
                } else if (currentQuestion.getAnswers().get(idx).isFreeText()) {
                    Integer freeTextId = currentQuestion.getFreeText().get(idx);
                    EditText freeText = (EditText)findViewById(freeTextId);
                    String answer = freeText.getText().toString();
                    if (!currentQuestion.isOptional()) {
                        if (answer.trim().length() < 1) {
                            new AlertDialog.Builder(this).setMessage("Please write your answer!").setPositiveButton("OK", null).show();
                            return;
                        }
                    }
                    currentQuestion.setAnswer(currentQuestion.getAnswers().get(idx).getAnswer() + " " + answer);
                } else {
                    currentQuestion.setAnswer(currentQuestion.getAnswers().get(idx).getAnswer());
                }
            }
            if (idx != -1) {
                if (currentQuestion.getFollowup() != null) {
                    List<String> followupQuestions = currentQuestion.getFollowup().get(idx);
                    if (followupQuestions != null) {
                        for (String questionId : followupQuestions) {
                            questionQueue.add(questionMap.get(questionId));
                        }
                    }
                }
            }
        } else {
            List<Integer> checkBoxes = currentQuestion.getCheckBoxes();
            List<Integer> selected;
            selected = new ArrayList<Integer>();
            int i = 0;
            for (Integer checkBoxId : checkBoxes) {
                CheckBox checkBox = (CheckBox)findViewById(checkBoxId);
                if (checkBox.isChecked()) {
                    selected.add(i);
                }
                i++;
            }
            if (!currentQuestion.isOptional() && selected.size() < 1) {
                new AlertDialog.Builder(this).setMessage("You must answer this question!").setPositiveButton("OK", null).show();
                return;
            } else {
                if (selected.size() < 1) {
                    currentQuestion.setAnswer("No answer");
                } else {
                    for (Integer item : selected) {
                        if (currentQuestion.getAnswers().get(item).isFreeText()) {
                            Integer freeTextId = currentQuestion.getFreeText().get(item);
                            EditText freeText = (EditText)findViewById(freeTextId);
                            String answer = freeText.getText().toString();
                            if (!currentQuestion.isOptional()) {
                                if (answer.trim().length() < 1) {
                                    new AlertDialog.Builder(this).setMessage("Please write your answer!").setPositiveButton("OK", null).show();
                                    return;
                                }
                            }
                            currentQuestion.setAnswer(currentQuestion.getAnswer() + (currentQuestion.getAnswer().length() < 1 ? "" : ", ") + currentQuestion.getAnswers().get(item).getAnswer() + " " + answer);
                        } else {
                            currentQuestion.setAnswer(currentQuestion.getAnswer() + (currentQuestion.getAnswer().length() < 1 ? "" : ", ") + currentQuestion.getAnswers().get(item).getAnswer());
                        }
                        if (currentQuestion.getFollowup() != null) {
                            List<String> followupQuestions = currentQuestion.getFollowup().get(item);
                            if (followupQuestions != null) {
                                for (String questionId : followupQuestions) {
                                    questionQueue.add(questionMap.get(questionId));
                                }
                            }
                        }
                    }
                }
            }
        }
        currentQuestion.setAnswered(true);
        for (Map.Entry<String, Question> entry : questionMap.entrySet()) {
            Question question = entry.getValue();
            if (!question.isAnswered() && !question.isFollowup() && !questionQueue.contains(question)) {
                questionQueue.add(question);
                break;
            }
        }
        showQuestion();
    }

    private void showQuestion() {
        if (questionQueue.size() > 0) {
            currentQuestion = questionQueue.poll();
            setContentView(currentQuestion.getLayout());
        } else {
            showOutro();
        }
    }

    private void showOutro() {
        setContentView(R.layout.outro);
        String answers = "\nYour answers:\n";
        for (Map.Entry<String, Question> entry : questionMap.entrySet()) {
            Question question = entry.getValue();
            answers += "Question: " + question.getQuestionId() + ", Answer: " + (question.getAnswer().trim().length() < 1 ? "No answer" : question.getAnswer()) + "\n";
        }
        TextView outroText = (TextView)findViewById(R.id.outro);
        outroText.setText("This is the end of the survey! Bye!\n" + answers);
    }

    public void exitSurvey(View view) {
        finish();
    }
}
        '''
    }

     /**
      * Generates the AndroidManifest.xml file. Mostly static.
      */
     def static compileToAndroidManifest(Survey it) {
        '''
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
          package="dk.itu.smdp.group11.«toId(it.name)»"
          android:versionCode="1"
          android:versionName="1.0">
    <uses-sdk
            android:minSdkVersion="8"
            android:targetSdkVersion="19"/>
    <application android:label="«toId(it.name)»" android:icon="@drawable/ic_launcher">
        <activity android:name="MainActivity"
                  android:label="«toId(it.name)»"
                  android:configChanges="orientation"
                  android:windowSoftInputMode="adjustPan">
            <intent-filter>
                <action android:name="android.intent.action.MAIN"/>
                <category android:name="android.intent.category.LAUNCHER"/>
            </intent-filter>
        </activity>
    </application>
</manifest>
        '''
    }

     /**
      * Generates the Question class. Mostly static.
      */
     def static compileToAndroidQuestion(Survey it) {
        '''
package dk.itu.smdp.group11.«toId(it.name)»;

import java.util.List;
import java.util.Map;

public class Question {
    private String question;
    private int questionId;
    private String questionName;
    private List<Answer> answers;
    private Map<Integer, List<String>> followup;
    private boolean isExclusive;
    private boolean isOptional;
    private boolean isFollowup;
    private boolean isAnswered;
    private String answer = "";
    private int layout;
    private boolean isTableQuestion;
    private List<Answer> items;
    private List<Integer> radioGroups;
    private List<Integer> checkBoxes;
    private List<Integer> freeText;

    public Question() {
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestionName() {
        return questionName;
    }

    public void setQuestionName(String questionName) {
        this.questionName = questionName;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public Map<Integer, List<String>> getFollowup() {
        return followup;
    }

    public void setFollowup(Map<Integer, List<String>> followup) {
        this.followup = followup;
    }

    public boolean isExclusive() {
        return isExclusive;
    }

    public void setExclusive(boolean isExclusive) {
        this.isExclusive = isExclusive;
    }

    public boolean isOptional() {
        return isOptional;
    }

    public void setOptional(boolean isOptional) {
        this.isOptional = isOptional;
    }

    public boolean isFollowup() {
        return isFollowup;
    }

    public void setFollowup(boolean isFollowup) {
        this.isFollowup = isFollowup;
    }

    public boolean isAnswered() {
        return isAnswered;
    }

    public void setAnswered(boolean isAnswered) {
        this.isAnswered = isAnswered;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getLayout() {
        return layout;
    }

    public void setLayout(int layout) {
        this.layout = layout;
    }

    public boolean isTableQuestion() {
        return isTableQuestion;
    }

    public void setTableQuestion(boolean isTableQuestion) {
        this.isTableQuestion = isTableQuestion;
    }

    public List<Answer> getItems() {
        return items;
    }

    public void setItems(List<Answer> items) {
        this.items = items;
    }

    public List<Integer> getRadioGroups() {
        return radioGroups;
    }

    public void setRadioGroups(List<Integer> radioGroups) {
        this.radioGroups = radioGroups;
    }

    public List<Integer> getFreeText() {
        return freeText;
    }

    public void setFreeText(List<Integer> freeText) {
        this.freeText = freeText;
    }

    public List<Integer> getCheckBoxes() {
        return checkBoxes;
    }

    public void setCheckBoxes(List<Integer> checkBoxes) {
        this.checkBoxes = checkBoxes;
    }
}
        '''
    }

     /**
      * Generates the Answer class. Mostly static.
      */
     def static compileToAndroidAnswer(Survey it) {
        '''
package dk.itu.smdp.group11.«toId(it.name)»;

public class Answer {

    private String answer;
    private boolean isFreeText;

    public Answer(String answer, boolean isFreeText) {
        this.answer = answer;
        this.isFreeText = isFreeText;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean isFreeText() {
        return isFreeText;
    }

    public void setFreeText(boolean isFreeText) {
        this.isFreeText = isFreeText;
    }
}
        '''
    }

     /**
      * Generates the Questions class. This is where all the questions are set up.
      */
     def static compileToAndroidQuestions(Survey it) {
        var int questionNumber = 0;
        var boolean haveFirstQuestion = false;
        var int answerNumber = 0;
        var int itemNumber = 0;
        '''
package dk.itu.smdp.group11.«toId(it.name)»;

import java.util.*;

public class Questions {
    private Map<String, Question> questionMap;
    private Queue<Question> questionQueue;

    public Questions() {
        questionMap = new LinkedHashMap<String, Question>();
        questionQueue = new LinkedList<Question>();

        «FOR question : questions»
        Question question«questionNumber = questionNumber + 1» = new Question();
        question«questionNumber».setQuestionName("«question.name»");
        question«questionNumber».setQuestionId(«questionNumber»);
        question«questionNumber».setQuestion("«question.body»");
        question«questionNumber».setAnswers(Arrays.asList(«FOR answer : question.answers SEPARATOR ', '»new Answer("«answer.body»", «answer.isFreeText»)«ENDFOR»));
        question«questionNumber».setExclusive(«question.isExclusive»);
        question«questionNumber».setOptional(«question.isOptional»);
        question«questionNumber».setFollowup(«isFollowup(it, question)»);
        question«questionNumber».setTableQuestion(«question instanceof TableQuestion»);
        question«questionNumber».setLayout(R.layout.question«questionNumber»);
        «IF question instanceof TableQuestion»
        question«questionNumber».setItems(Arrays.asList(«FOR answer : (question as TableQuestion).items SEPARATOR ', '»new Answer("«answer.body»", «answer.isFreeText»)«ENDFOR»));
        «ENDIF»
        «IF !haveFirstQuestion && !isFollowup(it, question)»
        questionQueue.add(question«questionNumber»);
        «{ haveFirstQuestion = true; "" }»
        «ENDIF»

        «IF question.answers.size == 1 && question.answers.get(0).isFreeText»
        List<Integer> freeTextAnswers«questionNumber» = new ArrayList<Integer>();
        freeTextAnswers«questionNumber».add(R.id.question«questionNumber»FreeText);
        question«questionNumber».setFreeText(freeTextAnswers«questionNumber»);
        «ELSEIF question instanceof TableQuestion»
        «IF question.isExclusive»
        List<Integer> radioGroups«questionNumber» = new ArrayList<Integer>();
        «FOR answer : (question as TableQuestion).items»
        «{answerNumber = answerNumber + 1; ""}»
        radioGroups«questionNumber».add(R.id.question«questionNumber»RadioGroup«answerNumber»);
        «ENDFOR»
        «{answerNumber = 0; ""}»
        question«questionNumber».setRadioGroups(radioGroups«questionNumber»);

        List<Integer> freeTextAnswers«questionNumber» = new ArrayList<Integer>();
        «FOR answer : (question as TableQuestion).items»
        «{answerNumber = answerNumber + 1; ""}»
        freeTextAnswers«questionNumber».add(«IF answer.isFreeText»R.id.question«questionNumber»RadioGroup«answerNumber»Text«ELSE»null«ENDIF»);
        «ENDFOR»
        «{answerNumber = 0; ""}»
        question«questionNumber».setFreeText(freeTextAnswers«questionNumber»);
        «ELSE»
        List<Integer> checkBoxes«questionNumber» = new ArrayList<Integer>();
        «FOR item : (question as TableQuestion).items»
        «{itemNumber = itemNumber + 1; ""}»
        «FOR answer : question.answers»
        «{answerNumber = answerNumber + 1; ""}»
        checkBoxes«questionNumber».add(R.id.question«questionNumber»Item«itemNumber»CheckBox«answerNumber»);
        «ENDFOR»
        «{answerNumber = 0; ""}»
        «ENDFOR»
        «{itemNumber = 0; ""}»
        question«questionNumber».setCheckBoxes(checkBoxes«questionNumber»);

        List<Integer> freeTextAnswers«questionNumber» = new ArrayList<Integer>();
        «FOR answer : (question as TableQuestion).items»
        «{answerNumber = answerNumber + 1; ""}»
        freeTextAnswers«questionNumber».add(«IF answer.isFreeText»R.id.question«questionNumber»Item«answerNumber»Text«ELSE»null«ENDIF»);
        «ENDFOR»
        «{answerNumber = 0; ""}»
        question«questionNumber».setFreeText(freeTextAnswers«questionNumber»);
        «ENDIF»
        «ELSEIF question.isExclusive»
        List<Integer> radioGroups«questionNumber» = new ArrayList<Integer>();
        radioGroups«questionNumber».add(R.id.question«questionNumber»RadioGroup);
        question«questionNumber».setRadioGroups(radioGroups«questionNumber»);

        List<Integer> freeTextAnswers«questionNumber» = new ArrayList<Integer>();
        «FOR answer : question.answers»
        «{answerNumber = answerNumber + 1; ""}»
        freeTextAnswers«questionNumber».add(«IF answer.isFreeText»R.id.question«questionNumber»RadioButton«answerNumber»Text«ELSE»null«ENDIF»);
        «ENDFOR»
        «{answerNumber = 0; ""}»
        question«questionNumber».setFreeText(freeTextAnswers«questionNumber»);

        Map<Integer, List<String>> followUpQuestionsMap«questionNumber» = new HashMap<Integer, List<String>>();
        «FOR answer : question.answers»
        «{answerNumber = answerNumber + 1; ""}»
        «IF answer.followup.size > 0»
        List<String> followupQuestions«questionNumber»Answer«answerNumber» = new ArrayList<String>();
        «FOR followUpAnswer : answer.followup»
        followupQuestions«questionNumber»Answer«answerNumber».add("«followUpAnswer.name»");
        «ENDFOR»
        followUpQuestionsMap«questionNumber».put(«answerNumber - 1», followupQuestions«questionNumber»Answer«answerNumber»);
        «ELSE»
        followUpQuestionsMap«questionNumber».put(«answerNumber - 1», null);
        «ENDIF»
        «ENDFOR»
        «{answerNumber = 0; ""}»
        question«questionNumber».setFollowup(followupQuestionsMap«questionNumber»);

        «ELSE»
        List<Integer> checkBoxes«questionNumber» = new ArrayList<Integer>();
        «FOR answer : question.answers»
        «{answerNumber = answerNumber + 1; ""}»
        checkBoxes«questionNumber».add(R.id.question«questionNumber»CheckBox«answerNumber»);
        «ENDFOR»
        «{answerNumber = 0; ""}»
        question«questionNumber».setCheckBoxes(checkBoxes«questionNumber»);

        List<Integer> freeTextAnswers«questionNumber» = new ArrayList<Integer>();
        «FOR answer : question.answers»
        «{answerNumber = answerNumber + 1; ""}»
        freeTextAnswers«questionNumber».add(«IF answer.isFreeText»R.id.question«questionNumber»CheckBox«answerNumber»Text«ELSE»null«ENDIF»);
        «ENDFOR»
        «{answerNumber = 0; ""}»
        question«questionNumber».setFreeText(freeTextAnswers«questionNumber»);

        Map<Integer, List<String>> followUpQuestionsMap«questionNumber» = new HashMap<Integer, List<String>>();
        «FOR answer : question.answers»
        «{answerNumber = answerNumber + 1; ""}»
        «IF answer.followup.size > 0»
        List<String> followupQuestions«questionNumber»Answer«answerNumber» = new ArrayList<String>();
        «FOR followUpAnswer : answer.followup»
        followupQuestions«questionNumber»Answer«answerNumber».add("«followUpAnswer.name»");
        «ENDFOR»
        followUpQuestionsMap«questionNumber».put(«answerNumber - 1», followupQuestions«questionNumber»Answer«answerNumber»);
        «ELSE»
        followUpQuestionsMap«questionNumber».put(«answerNumber - 1», null);
        «ENDIF»
        «ENDFOR»
        «{answerNumber = 0; ""}»
        question«questionNumber».setFollowup(followupQuestionsMap«questionNumber»);
        «ENDIF»
        questionMap.put(question«questionNumber».getQuestionName(), question«questionNumber»);

        «ENDFOR»
    }

    public Map<String, Question> getQuestionMap() {
        return questionMap;
    }

    public void setQuestionMap(Map<String, Question> questionMap) {
        this.questionMap = questionMap;
    }

    public Queue<Question> getQuestionQueue() {
        return questionQueue;
    }

    public void setQuestionQueue(Queue<Question> questionQueue) {
        this.questionQueue = questionQueue;
    }
}
        '''
     }

     /**
      * Generates the intro layout. Mostly static.
      */
     def static compileToAndroidLayoutIntro(Survey it) {
        '''
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
                android:orientation="vertical"
                android:layout_width="match_parent"
                android:layout_height="match_parent">
    <ScrollView
            android:layout_width="match_parent"
            android:layout_height="match_parent">
        <TextView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="«it.intro»"
                android:textSize="20sp"
                android:textColor="#ffffff"
                android:layout_margin="10dp"/>
    </ScrollView>
    <Button
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Begin Survey"
            android:layout_marginTop="20dp"
            android:layout_centerInParent="true"
            android:layout_alignParentBottom="true"
            android:onClick="beginSurvey"
            android:textSize="20sp"
            android:textStyle="bold"/>
</RelativeLayout>
        '''
     }

     /**
      * Generates the outro layout. Mostly static.
      */
     def static compileToAndroidLayoutOutro(Survey it) {
        '''
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
                android:orientation="vertical"
                android:layout_width="match_parent"
                android:layout_height="match_parent">
    <ScrollView
            android:layout_width="match_parent"
            android:layout_height="match_parent">
        <TextView
                android:id="@+id/outro"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="«it.outro»"
                android:textSize="20sp"
                android:textColor="#ffffff"
                android:layout_margin="10dp"/>
    </ScrollView>
    <Button
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Exit Survey"
            android:layout_marginTop="20dp"
            android:layout_centerInParent="true"
            android:layout_alignParentBottom="true"
            android:onClick="exitSurvey"
            android:textSize="20sp"
            android:textStyle="bold"/>
</RelativeLayout>
        '''
     }

    var static int questionId = 1;
     /**
      * Generates the question layout for the given question.
      */
     def static compileToAndroidLayoutQuestion(Question it) {
        var int itemNumber = 0;
        var int answerNumber = 0;
        '''
«IF it.answers.size == 1 && it.answers.get(0).isFreeText»
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
              android:orientation="vertical"
              android:layout_width="match_parent"
              android:layout_height="match_parent">

    <RelativeLayout
            android:orientation="horizontal"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:descendantFocusability="beforeDescendants"
            android:focusableInTouchMode="true">
        <TextView
                android:id="@+id/question«questionId»Text"
                android:layout_width="fill_parent"
                android:layout_height="wrap_content"
                android:text="«it.body»«IF !it.isOptional»*«ENDIF»"
                android:gravity="center_horizontal"
                android:textSize="20sp"
                android:textColor="#ffffff"
                android:textStyle="bold"
                android:layout_margin="10dp" />
        <View
                android:layout_width="match_parent"
                android:layout_height="1dp"
                android:background="?android:attr/listDivider"
                android:layout_below="@id/question«questionId»Text" />

    </RelativeLayout>
    <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent">
        <EditText
                android:id="@+id/question«questionId»FreeText"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:inputType="textMultiLine"
                android:layout_marginTop="20dp"
                android:gravity="top|left"
                android:scrollbars="vertical"
                android:layout_above="@id/nextQuestion"
                />
        <Button
                android:id="@+id/nextQuestion"
                android:text="Next Question"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_centerInParent="true"
                android:textSize="20sp"
                android:textStyle="bold"
                android:layout_marginTop="20dp"
                android:layout_alignParentBottom="true"
                android:onClick="nextQuestion"/>
    </RelativeLayout>
</LinearLayout>
«ELSEIF it instanceof TableQuestion»
«IF it.isExclusive»
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
              android:orientation="vertical"
              android:layout_width="match_parent"
              android:layout_height="match_parent">

    <RelativeLayout
            android:orientation="horizontal"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:descendantFocusability="beforeDescendants"
            android:focusableInTouchMode="true">
        <TextView
                android:id="@+id/question«questionId»Text"
                android:layout_width="fill_parent"
                android:layout_height="wrap_content"
                android:text="«it.body»«IF !it.isOptional»*«ENDIF»"
                android:gravity="center_horizontal"
                android:textSize="20sp"
                android:textColor="#ffffff"
                android:textStyle="bold"
                android:layout_margin="10dp" />
        <View
                android:layout_width="match_parent"
                android:layout_height="1dp"
                android:background="?android:attr/listDivider"
                android:layout_below="@id/question«questionId»Text" />

    </RelativeLayout>
    <HorizontalScrollView
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_weight="1">
        <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:orientation="vertical">
            «FOR item : (it as TableQuestion).items»
            «{itemNumber = itemNumber + 1; ""}»
            <LinearLayout
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:orientation="horizontal"
                    android:padding="5dip">
                <TextView
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="«item.body»"
                        android:textSize="20sp"/>
                «IF item.isFreeText»
                <EditText
                        android:id="@+id/question«questionId»RadioGroup«itemNumber»Text"
                        android:layout_width="150dp"
                        android:layout_height="wrap_content"/>
                «ENDIF»
                <RadioGroup
                        android:id="@+id/question«questionId»RadioGroup«itemNumber»"
                        android:layout_width="match_parent"
                        android:layout_height="match_parent"
                        android:orientation="horizontal">
                «FOR answer : it.answers»
                «{answerNumber = answerNumber + 1; ""}»
                    <RadioButton
                            android:id="@+id/question«questionId»RadioGroup«itemNumber»RadioButton«answerNumber»"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:text="«answer.body»"/>
                «ENDFOR»
                «{answerNumber = 0; ""}»
                </RadioGroup>
            </LinearLayout>
            «ENDFOR»
            «{itemNumber = 0; ""}»
        </LinearLayout>
    </HorizontalScrollView>
    <Button
            android:id="@+id/nextQuestion"
            android:text="Next Question"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_centerInParent="true"
            android:textSize="20sp"
            android:textStyle="bold"
            android:layout_marginTop="20dp"
            android:layout_alignParentBottom="true"
            android:onClick="nextQuestion"/>
</LinearLayout>
«ELSE»
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
              android:orientation="vertical"
              android:layout_width="match_parent"
              android:layout_height="match_parent">

    <RelativeLayout
            android:orientation="horizontal"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:descendantFocusability="beforeDescendants"
            android:focusableInTouchMode="true">
        <TextView
                android:id="@+id/question«questionId»Text"
                android:layout_width="fill_parent"
                android:layout_height="wrap_content"
                android:text="«it.body»«IF !it.isOptional»*«ENDIF»"
                android:gravity="center_horizontal"
                android:textSize="20sp"
                android:textColor="#ffffff"
                android:textStyle="bold"
                android:layout_margin="10dp" />
        <View
            android:layout_width="match_parent"
            android:layout_height="1dp"
            android:background="?android:attr/listDivider"
            android:layout_below="@id/question«questionId»Text" />

    </RelativeLayout>
    <HorizontalScrollView
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_weight="1">
        <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:orientation="vertical">
            «FOR item : (it as TableQuestion).items»
            «{itemNumber = itemNumber + 1; ""}»
            <LinearLayout
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:orientation="horizontal"
                    android:padding="5dip">
                <TextView
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="«item.body»"
                        android:textSize="20sp"/>
                «IF item.isFreeText»
                <EditText
                        android:id="@+id/question«questionId»Item«itemNumber»Text"
                        android:layout_width="150dp"
                        android:layout_height="wrap_content"/>
                «ENDIF»
                «FOR answer : it.answers»
                «{answerNumber = answerNumber + 1; ""}»
                <CheckBox
                        android:id="@+id/question«questionId»Item«itemNumber»Checkbox«answerNumber»"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="«answer.body»"/>
                «ENDFOR»
                «{answerNumber = 0; ""}»
            «ENDFOR»
            «{itemNumber = 0; ""}»
        </LinearLayout>
    </HorizontalScrollView>
    <Button
            android:id="@+id/nextQuestion"
            android:text="Next Question"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_centerInParent="true"
            android:textSize="20sp"
            android:textStyle="bold"
            android:layout_marginTop="20dp"
            android:layout_alignParentBottom="true"
            android:onClick="nextQuestion"/>
</LinearLayout>
«ENDIF»
«ELSEIF it.isExclusive»
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
              android:orientation="vertical"
              android:layout_width="match_parent"
              android:layout_height="match_parent">

    <RelativeLayout
            android:orientation="horizontal"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:descendantFocusability="beforeDescendants"
            android:focusableInTouchMode="true">
        <TextView
                android:id="@+id/question«questionId»Text"
                android:layout_width="fill_parent"
                android:layout_height="wrap_content"
                android:text="«it.body»«IF !it.isOptional»*«ENDIF»"
                android:gravity="center_horizontal"
                android:textSize="20sp"
                android:textColor="#ffffff"
                android:textStyle="bold"
                android:layout_margin="10dp" />
        <View
                android:layout_width="match_parent"
                android:layout_height="1dp"
                android:background="?android:attr/listDivider"
                android:layout_below="@id/question«questionId»Text" />

    </RelativeLayout>
    <ScrollView
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_weight="1">
        <RelativeLayout
                android:orientation="vertical"
                android:layout_width="match_parent"
                android:layout_height="match_parent">
            <RadioGroup
                    android:id="@+id/question«questionId»RadioGroup"
                    android:layout_width="match_parent"
                    android:layout_height="match_parent" >
            «FOR answer : it.answers»
            «{answerNumber = answerNumber + 1; ""}»
                <RadioButton
                        android:id="@+id/question«questionId»RadioButton«answerNumber»"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="«answer.body»" />
                «IF answer.isFreeText»
                <EditText
                        android:id="@+id/question«questionId»RadioButton«answerNumber»Text"
                        android:inputType="textMultiLine"
                        android:layout_width="match_parent"
                        android:layout_height="match_parent"
                        android:gravity="top|left"
                        android:minLines="3"
                        android:maxLines="5"
                        android:scrollbars="vertical"
                        android:layout_margin="5dp"/>
                «ENDIF»
            «ENDFOR»
            «{answerNumber = 0; ""}»
            </RadioGroup>
        </RelativeLayout>
    </ScrollView>
    <Button
        android:id="@+id/nextQuestion"
        android:text="Next Question"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_centerInParent="true"
        android:textSize="20sp"
        android:textStyle="bold"
        android:layout_marginTop="20dp"
        android:layout_alignParentBottom="true"
        android:onClick="nextQuestion"/>
</LinearLayout>
«ELSE»
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
              android:orientation="vertical"
              android:layout_width="match_parent"
              android:layout_height="match_parent">

    <RelativeLayout
            android:orientation="horizontal"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:descendantFocusability="beforeDescendants"
            android:focusableInTouchMode="true">
        <TextView
                android:id="@+id/question«questionId»Text"
                android:layout_width="fill_parent"
                android:layout_height="wrap_content"
                android:text="«it.body»«IF !it.isOptional»*«ENDIF»"
                android:gravity="center_horizontal"
                android:textSize="20sp"
                android:textColor="#ffffff"
                android:textStyle="bold"
                android:layout_margin="10dp" />
        <View
                android:layout_width="match_parent"
                android:layout_height="1dp"
                android:background="?android:attr/listDivider"
                android:layout_below="@id/question«questionId»Text" />

    </RelativeLayout>
    <ScrollView
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_weight="1">
        <LinearLayout
                android:orientation="vertical"
                android:layout_width="match_parent"
                android:layout_height="match_parent">
        «FOR answer : it.answers»
        «{answerNumber = answerNumber + 1; ""}»
            <CheckBox
                    android:id="@+id/question«questionId»CheckBox«answerNumber»"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="«answer.body»"/>
             «IF answer.isFreeText»
             <EditText
                    android:id="@+id/question«questionId»CheckBox«answerNumber»Text"
                    android:inputType="textMultiLine"
                    android:layout_width="match_parent"
                    android:layout_height="match_parent"
                    android:gravity="top|left"
                    android:minLines="3"
                    android:maxLines="5"
                    android:scrollbars="vertical"
                    android:layout_margin="5dp"/>
             «ENDIF»
        «ENDFOR»
        </LinearLayout>
    </ScrollView>
    <Button
            android:id="@+id/nextQuestion"
            android:text="Next Question"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_centerInParent="true"
            android:textSize="20sp"
            android:textStyle="bold"
            android:layout_marginTop="20dp"
            android:layout_alignParentBottom="true"
            android:onClick="nextQuestion"/>
</LinearLayout>
«ENDIF»
        '''
    }

    /*
     * Utility function to have workable files and id's as strings.
     */
    def static toId(String text) {
        text.replaceAll("\\W+", "")
    }

    /*
     * Checks if a question is actually a follow-up for at least one other question
     */
    def static isFollowup(Survey survey, Question comparedQuestion) {
        for (Question surveyQuestion : survey.questions) {
            if (!surveyQuestion.name.equalsIgnoreCase(comparedQuestion.name)) {
                for (Answer answer : surveyQuestion.answers) {
                    for (Question followupQuestion : answer.followup) {
                        if (followupQuestion.name.equalsIgnoreCase(comparedQuestion.name)) {
                            return true
                        }
                    }
                }
            }
        }
        return false
    }

    /*
     * Creates the condition used by Angular to show or hide a specific follow-up question
     */
    def static showQuestionTrigger(Survey survey, Question comparedQuestion) {
        var trigger = ""
        for (Question surveyQuestion : survey.questions) {
            if (!surveyQuestion.name.equalsIgnoreCase(comparedQuestion.name)) {
                for (Answer answer : surveyQuestion.answers) {
                    for (Question followupQuestion : answer.followup) {
                        if (followupQuestion.name.equalsIgnoreCase(comparedQuestion.name)) {
                            if (surveyQuestion.isExclusive) {
                                trigger = trigger + "( survey.questions." + toId(surveyQuestion.name) + ".regular === '" + answer.body + "' ) || "
                            } else {
                                trigger = trigger + "( survey.questions." + toId(surveyQuestion.name) + "." + toId(answer.body)/** */ + " ) || "
                            }
                        }
                    }
                }
            }
        }
        trigger = trigger + "false"
    }

    override void doGenerate(Resource resource, IFileSystemAccess fsa) {
        resource.allContents.toIterable.filter(typeof(Survey)).forEach[Survey it |
            /**
             * HTML files.
             */
            fsa.generateFile( "surveys/" + toId( it.name ) + "/html/survey.html", it.compileToHtml )

            /**
             * Android files.
             */
            // Main Activity.
            fsa.generateFile("surveys/" + toId(it.name) + "/android/" + toId(it.name) + "/src/dk.itu.smdp.group11." + toId(it.name) + "/MainActivity.java", it.compileToAndroidMainActivity)

            // Static Question and Answer classes.
            fsa.generateFile("surveys/" + toId(it.name) + "/android/" + toId(it.name) + "/src/dk.itu.smdp.group11." + toId(it.name) + "/Question.java", it.compileToAndroidQuestion)
            fsa.generateFile("surveys/" + toId(it.name) + "/android/" + toId(it.name) + "/src/dk.itu.smdp.group11." + toId(it.name) + "/Answer.java", it.compileToAndroidAnswer)

            // Questions class, where all the questions are initialized.
            fsa.generateFile("surveys/" + toId(it.name) + "/android/" + toId(it.name) + "/src/dk.itu.smdp.group11." + toId(it.name) + "/Questions.java", it.compileToAndroidQuestions)

            // Intro Layout.
            fsa.generateFile("surveys/" + toId(it.name) + "/android/" + toId(it.name) + "/res/layout/intro.xml", it.compileToAndroidLayoutIntro)

            // Outro layout.
            fsa.generateFile("surveys/" + toId(it.name) + "/android/" + toId(it.name) + "/res/layout/outro.xml", it.compileToAndroidLayoutOutro)

            // Question layouts.
            for (Question question : it.questions) {
                fsa.generateFile("surveys/" + toId(it.name) + "/android/" + toId(it.name) + "/res/layout/question"+ questionId + ".xml", question.compileToAndroidLayoutQuestion)
                questionId = questionId + 1;
            }

            // Static Manifest.
            fsa.generateFile("surveys/" + toId(it.name) + "/android/" + toId(it.name) + "/AndroidManifest.xml", it.compileToAndroidManifest)
        ]
    }
}
