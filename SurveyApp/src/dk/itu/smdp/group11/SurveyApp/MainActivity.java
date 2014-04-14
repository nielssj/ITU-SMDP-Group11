package dk.itu.smdp.group11.SurveyApp;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.util.Log;
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

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        questionMap = new LinkedHashMap<String, Question>();
        questionQueue = new LinkedList<Question>();

        initializeQuestions();

        // Show the Intro layout.
        setContentView(R.layout.intro);
    }

    /**
     * Starts the survey with the question1 by default.
     * @param view
     */
    public void beginSurvey(View view) {
        setContentView(R.layout.question1);
        currentQuestion = questionQueue.poll();
    }

    /**
     * Called upon clicking the Next Question button.
     * Handles different type questions and other shit.
     * @param view
     */
    public void nextQuestion(View view) {
        // Free text question.
        if (currentQuestion.isFreeText()) {
            EditText questionFreeText = null;
            // TODO: Generate this if for all FreeText questions.
            if (currentQuestion.getQuestionId() == 4) {
                questionFreeText = (EditText) findViewById(R.id.question4FreeText);
            }
            String answer = questionFreeText.getText().toString();
            if (!currentQuestion.isOptional()) {
                if (answer.trim().length() < 1) {
                    new AlertDialog.Builder(this).setMessage("You must answer this question!").setPositiveButton("OK", null).show();
                    return;
                }
            }
            currentQuestion.setAnswer(answer);
            // Single choice question.
        } else if (currentQuestion.isExclusive()) {
            RadioGroup questionRadioGroup = null;
            // TODO: Generate this if for all Exclusive questions.
            if (currentQuestion.getQuestionId() == 1) {
                questionRadioGroup = (RadioGroup)findViewById(R.id.question1RadioGroup);
            }

            // Get the index of selected answer.
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
                    EditText freeTextAnswer = null;
                    // TODO: Generate this for all FreeText answers of Exclusive questions..
                    if (currentQuestion.getQuestionId() == 1) {
                        freeTextAnswer = (EditText) findViewById(R.id.question1RadioButton4Text);
                    }

                    String answer = freeTextAnswer.getText().toString();
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
                // Get the followup questions for this checked item.
                List<String> followupQuestions = currentQuestion.getFollowup().get(idx);
                // If there are any followup questions, add them to the queue.
                if (followupQuestions != null) {
                    for (String questionId : followupQuestions) {
                        questionQueue.add(questionMap.get(questionId));
                    }
                }
            }

        // Multi choice question.
        } else {
            List<CheckBox> checkBoxes = null;
            List<Integer> selected;
            // TODO: Generate this for all checkbox questions.
            if (currentQuestion.getQuestionId() == 2) {
                CheckBox question2CheckBox1 = (CheckBox)findViewById(R.id.question2CheckBox1);
                CheckBox question2CheckBox2 = (CheckBox)findViewById(R.id.question2CheckBox2);
                CheckBox question2CheckBox3 = (CheckBox)findViewById(R.id.question2CheckBox3);
                CheckBox question2CheckBox4 = (CheckBox)findViewById(R.id.question2CheckBox4);

                // Store all the CheckBoxes
                checkBoxes = new ArrayList<CheckBox>();
                checkBoxes.add(question2CheckBox1);
                checkBoxes.add(question2CheckBox2);
                checkBoxes.add(question2CheckBox3);
                checkBoxes.add(question2CheckBox4);
            } else if (currentQuestion.getQuestionId() == 3) {
                CheckBox question3CheckBox1 = (CheckBox)findViewById(R.id.question3CheckBox1);
                CheckBox question3CheckBox2 = (CheckBox)findViewById(R.id.question3CheckBox2);
                CheckBox question3CheckBox3 = (CheckBox)findViewById(R.id.question3CheckBox3);

                // Store all the CheckBoxes
                checkBoxes = new ArrayList<CheckBox>();
                checkBoxes.add(question3CheckBox1);
                checkBoxes.add(question3CheckBox2);
                checkBoxes.add(question3CheckBox3);
            }

            // Store selected answers.
            selected = new ArrayList<Integer>();
            int i = 0;
            for (CheckBox checkBox : checkBoxes) {
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
                            String answer = null;
                            // TODO: Handle all freetext answers for all questions.
                            if (currentQuestion.getQuestionId() == 2) {
                                EditText question2CheckBox4Text = (EditText)findViewById(R.id.question2CheckBox4Text);
                                answer = question2CheckBox4Text.getText().toString();
                            }
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

                        // Get the followup questions for this checked item.
                        List<String> followupQuestions = currentQuestion.getFollowup().get(item);
                        // If there are any followup questions, add them to the queue.
                        if (followupQuestions != null) {
                            for (String questionId : followupQuestions) {
                                questionQueue.add(questionMap.get(questionId));
                            }
                        }
                    }
                }
            }
        }

        // Set the current question as answered.
        currentQuestion.setAnswered(true);

        // Add next question.
        for (Map.Entry<String, Question> entry : questionMap.entrySet()) {
            Question question = entry.getValue();
            if (!question.isAnswered() && !question.isFollowup() && !questionQueue.contains(question)) {
                questionQueue.add(question);
                break;
            }
        }

        // Show next question.
        showQuestion();
    }

    /**
     * Picks the next question in the queue, and shows it.
     * If not more questions, show the outro message.
     */
    private void showQuestion() {
        if (questionQueue.size() > 0) {
            // Get the current question from the question queue.
            currentQuestion = questionQueue.poll();

            // Set its layout.
            setContentView(currentQuestion.getLayout());
        } else {
            showOutro();
        }
    }

    /**
     * Shows the Outro layout.
     */
    private void showOutro() {
        setContentView(R.layout.outro);
        String answers = "\nYour answers:\n";
        // Go through all questions and gather answers.
        for (Map.Entry<String, Question> entry : questionMap.entrySet()) {
            Question question = entry.getValue();
            answers += "Question: " + question.getQuestionId() + ", Answer: " + (question.getAnswer().trim().length() < 1 ? "No answer" : question.getAnswer()) + "\n";
        }

        TextView outroText = (TextView)findViewById(R.id.outro);
        outroText.setText("This is the end of the survey! Bye!\n" + answers);
    }

    /**
     * Exits the application when survey is done.
     * @param view
     */
    public void exitSurvey(View view) {
        finish();
    }

    /**
     * Initializes all the questions, ands sets question1 as a starting question.
     */
    private void initializeQuestions() {
        Question question1 = new Question();
        question1.setQuestionName("1");
        question1.setQuestionId(1);
        question1.setQuestion("Do you want to build a snowman?");
        question1.setAnswers(Arrays.asList(new Answer("Yes", false), new Answer("No", false), new Answer("Go away Anna!", false), new Answer("Other:", true)));
        question1.setExclusive(true);
        question1.setLayout(R.layout.question1);
        question1.getFollowup().put(0, null);
        question1.getFollowup().put(1, null);
        question1.getFollowup().put(2, null);
        question1.getFollowup().put(3, null);
        questionMap.put(question1.getQuestionName(), question1);

        Question question2 = new Question();
        question2.setQuestionName("2");
        question2.setQuestionId(2);
        question2.setQuestion("What is your quest?");
        question2.setAnswers(Arrays.asList(new Answer("To burn bananas", false), new Answer("To seek the Holy Grail", false), new Answer("I don't know", false), new Answer("Other:", true)));
        question2.setLayout(R.layout.question2);
        List<String> followupQuestions2 = new ArrayList<String>();
        followupQuestions2.add("3");
        question2.getFollowup().put(0, null);
        question2.getFollowup().put(1, followupQuestions2);
        question2.getFollowup().put(2, null);
        question2.getFollowup().put(3, null);
        questionMap.put(question2.getQuestionName(), question2);

        Question question3 = new Question();
        question3.setQuestionName("3");
        question3.setQuestionId(3);
        question3.setQuestion("What is the airspeed velocity of an unladen swallow?");
        question3.setAnswers(Arrays.asList(new Answer("10 km/h", false), new Answer("African or European?", false), new Answer("2 teemos", false)));
        question3.setFollowup(true);
        question3.setOptional(true);
        question3.setLayout(R.layout.question3);
        question3.getFollowup().put(0, null);
        question3.getFollowup().put(1, null);
        question3.getFollowup().put(2, null);
        questionMap.put(question3.getQuestionName(), question3);

        Question question4 = new Question();
        question4.setQuestionName("4");
        question4.setQuestionId(4);
        question4.setQuestion("Any other comments?");
        question4.setFreeText(true);
        question4.setLayout(R.layout.question4);
        questionMap.put(question4.getQuestionName(), question4);

        // Start question.
        questionQueue.add(question1);
    }
}