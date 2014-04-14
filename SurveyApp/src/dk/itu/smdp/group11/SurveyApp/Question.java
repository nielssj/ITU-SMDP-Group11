package dk.itu.smdp.group11.SurveyApp;

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
    private boolean isFreeText;
    private boolean isFollowup;
    private boolean isAnswered;
    private String answer = "";
    private int layout;

    public Question() {
        followup = new HashMap<Integer, List<String>>();
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

    public boolean isFreeText() {
        return isFreeText;
    }

    public void setFreeText(boolean isFreeText) {
        this.isFreeText = isFreeText;
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
}