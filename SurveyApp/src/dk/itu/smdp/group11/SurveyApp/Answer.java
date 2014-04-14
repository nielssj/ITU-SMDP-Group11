package dk.itu.smdp.group11.SurveyApp;

/**
 * Created by Tomas on 4/14/2014.
 */
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
