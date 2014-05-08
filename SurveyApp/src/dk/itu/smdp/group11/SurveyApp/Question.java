package dk.itu.smdp.group11.SurveyApp;

import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by tomas on 3/31/14.
 */
public class Question {
    private String question;
    private int questionId;
    private String questionName;
    private List<Answer> answers;
    // Answer id, List of followup question id's.
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