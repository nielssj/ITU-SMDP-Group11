package dk.itu.smdp.group11.SurveyApp;

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
     * Handles of not resetting the layout when phone orientation changes.
     * @param newConfig
     */
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
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
        if (currentQuestion.getAnswers().size() < 2 && currentQuestion.getAnswers().get(0).isFreeText()) {
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
        // Table question.
        } else if (currentQuestion.isTableQuestion()) {
            if (currentQuestion.isExclusive()) {
                List<Integer> radioGroups = currentQuestion.getRadioGroups();

                List<Integer> selected = new ArrayList<Integer>();
                // Get all the selected answers.
                for (Integer radioGroupId : radioGroups) {
                    RadioGroup radioGroup = (RadioGroup)findViewById(radioGroupId);
                    // Get the index of selected answer.
                    int radioButtonId = radioGroup.getCheckedRadioButtonId();
                    View radioButton = radioGroup.findViewById(radioButtonId);
                    int idx = radioGroup.indexOfChild(radioButton);
                    selected.add(idx);
                }

                // If not optional, make sure that answers have been selected for all the items (except free text).
                if (!currentQuestion.isOptional()) {
                    for (int i = 0; i < selected.size(); i++) {
                        if (selected.get(i) == -1 && !currentQuestion.getItems().get(i).isFreeText()) {
                            new AlertDialog.Builder(this).setMessage("You must select an answer for all the items!").setPositiveButton("OK", null).show();
                            return;
                        }
                    }
                }

                // Save answers.
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

                // If not optional and at least one of the items doesn't have an answer selected (except free text items).
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

                // Save answers.
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

        // Single choice question.
        } else if (currentQuestion.isExclusive()) {
            RadioGroup questionRadioGroup = (RadioGroup)findViewById(currentQuestion.getRadioGroups().get(0));
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
                // Get the followup questions for this checked item.
                if (currentQuestion.getFollowup() != null) {
                    List<String> followupQuestions = currentQuestion.getFollowup().get(idx);
                    // If there are any followup questions, add them to the queue.
                    if (followupQuestions != null) {
                        for (String questionId : followupQuestions) {
                            questionQueue.add(questionMap.get(questionId));
                        }
                    }
                }
            }

        // Multi choice question.
        } else {
            List<Integer> checkBoxes = currentQuestion.getCheckBoxes();
            List<Integer> selected;

            // Store selected answers.
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

                        // Get the followup questions for this checked item.
                        if (currentQuestion.getFollowup() != null) {
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
     * If no more questions, show the Outro message.
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

        // Register views of radio groups.
        List<Integer> radioGroups1 = new ArrayList<Integer>();
        radioGroups1.add(R.id.question1RadioGroup);
        question1.setRadioGroups(radioGroups1);

        question1.setExclusive(true);
        question1.setLayout(R.layout.question1);

        // Register views of free text answers.
        List<Integer> freeTextAnswers1 = new ArrayList<Integer>();
        freeTextAnswers1.add(null);
        freeTextAnswers1.add(null);
        freeTextAnswers1.add(null);
        freeTextAnswers1.add(R.id.question1RadioButton4Text);
        question1.setFreeText(freeTextAnswers1);

        questionMap.put(question1.getQuestionName(), question1);

        Question question2 = new Question();
        question2.setQuestionName("2");
        question2.setQuestionId(2);
        question2.setQuestion("What is your quest?");
        question2.setAnswers(Arrays.asList(new Answer("To burn bananas", false), new Answer("To seek the Holy Grail", false), new Answer("I don't know", false), new Answer("Other:", true)));
        question2.setLayout(R.layout.question2);

        // Register views of check boxes.
        List<Integer> checkBoxes2 = new ArrayList<Integer>();
        checkBoxes2.add(R.id.question2CheckBox1);
        checkBoxes2.add(R.id.question2CheckBox2);
        checkBoxes2.add(R.id.question2CheckBox3);
        checkBoxes2.add(R.id.question2CheckBox4);
        question2.setCheckBoxes(checkBoxes2);

        // Register views of free text answers.
        List<Integer> freeTextAnswers2 = new ArrayList<Integer>();
        freeTextAnswers2.add(null);
        freeTextAnswers2.add(null);
        freeTextAnswers2.add(null);
        freeTextAnswers2.add(R.id.question2CheckBox4Text);
        question2.setFreeText(freeTextAnswers2);

        Map<Integer, List<String>> followUpQuestionsMap2 = new HashMap<Integer, List<String>>();
        List<String> followupQuestions2 = new ArrayList<String>();
        followupQuestions2.add("3");
        followUpQuestionsMap2.put(0, null);
        followUpQuestionsMap2.put(1, followupQuestions2);
        followUpQuestionsMap2.put(2, null);
        followUpQuestionsMap2.put(3, null);
        question2.setFollowup(followUpQuestionsMap2);
        questionMap.put(question2.getQuestionName(), question2);

        Question question3 = new Question();
        question3.setQuestionName("3");
        question3.setQuestionId(3);
        question3.setQuestion("What is the airspeed velocity of an unladen swallow?");
        question3.setAnswers(Arrays.asList(new Answer("10 km/h", false), new Answer("African or European?", false), new Answer("2 teemos", false)));
        question3.setFollowup(true);
        question3.setOptional(true);
        question3.setLayout(R.layout.question3);

        // Register views of CheckBoxes
        List<Integer> checkBoxes3 = new ArrayList<Integer>();
        checkBoxes3.add(R.id.question3CheckBox1);
        checkBoxes3.add(R.id.question3CheckBox2);
        checkBoxes3.add(R.id.question3CheckBox3);
        question3.setCheckBoxes(checkBoxes3);
        questionMap.put(question3.getQuestionName(), question3);

        Question question4 = new Question();
        question4.setQuestionName("4");
        question4.setQuestionId(4);
        question4.setQuestion("Any other comments?");
        question4.setAnswers(Arrays.asList(new Answer("", true)));

        // Set free text answer view.
        List<Integer> freeTextAnswers4 = new ArrayList<Integer>();
        freeTextAnswers4.add(R.id.question4FreeText);
        question4.setFreeText(freeTextAnswers4);

        question4.setLayout(R.layout.question4);
        questionMap.put(question4.getQuestionName(), question4);

        Question question5 = new Question();
        question5.setQuestionName("5");
        question5.setQuestionId(5);
        question5.setTableQuestion(true);
        question5.setExclusive(true);
        question5.setQuestion("How good are these things?");
        question5.setAnswers(Arrays.asList(new Answer("Bad", false), new Answer("Average", false), new Answer("Good", false), new Answer("Excellent", false)));
        question5.setItems(Arrays.asList(new Answer("Chocolate", false), new Answer("Chips", false), new Answer("Beer", false), new Answer("Other:", true)));

        // Register table question radio group views.
        List<Integer> radioGroups5 = new ArrayList<Integer>();
        radioGroups5.add(R.id.question5RadioGroup1);
        radioGroups5.add(R.id.question5RadioGroup2);
        radioGroups5.add(R.id.question5RadioGroup3);
        radioGroups5.add(R.id.question5RadioGroup4);
        question5.setRadioGroups(radioGroups5);

        // Register views of free text answers.
        List<Integer> freeTextAnswers5 = new ArrayList<Integer>();
        freeTextAnswers5.add(null);
        freeTextAnswers5.add(null);
        freeTextAnswers5.add(null);
        freeTextAnswers5.add(R.id.question5RadioGroup4Text);
        question5.setFreeText(freeTextAnswers5);

        question5.setLayout(R.layout.question5);
        questionMap.put(question5.getQuestionName(), question5);

        Question question6 = new Question();
        question6.setQuestionName("6");
        question6.setQuestionId(6);
        question6.setTableQuestion(true);
        question6.setQuestion("How good are these things?");
        question6.setAnswers(Arrays.asList(new Answer("Bad", false), new Answer("Average", false), new Answer("Good", false), new Answer("Excellent", false)));
        question6.setItems(Arrays.asList(new Answer("Chocolate", false), new Answer("Chips", false), new Answer("Beer", false), new Answer("Other:", true)));

        // Register table question check box views.
        List<Integer> checkBoxes6 = new ArrayList<Integer>();
        // Item 1
        checkBoxes6.add(R.id.question6Item1Checkbox1);
        checkBoxes6.add(R.id.question6Item1Checkbox2);
        checkBoxes6.add(R.id.question6Item1Checkbox3);
        checkBoxes6.add(R.id.question6Item1Checkbox4);
        // Item 2
        checkBoxes6.add(R.id.question6Item2Checkbox1);
        checkBoxes6.add(R.id.question6Item2Checkbox2);
        checkBoxes6.add(R.id.question6Item2Checkbox3);
        checkBoxes6.add(R.id.question6Item2Checkbox4);
        // Item 3
        checkBoxes6.add(R.id.question6Item3Checkbox1);
        checkBoxes6.add(R.id.question6Item3Checkbox2);
        checkBoxes6.add(R.id.question6Item3Checkbox3);
        checkBoxes6.add(R.id.question6Item3Checkbox4);
        // Item 4
        checkBoxes6.add(R.id.question6Item4Checkbox1);
        checkBoxes6.add(R.id.question6Item4Checkbox2);
        checkBoxes6.add(R.id.question6Item4Checkbox3);
        checkBoxes6.add(R.id.question6Item4Checkbox4);
        question6.setCheckBoxes(checkBoxes6);

        // Register views of free text answers.
        List<Integer> freeTextAnswers6 = new ArrayList<Integer>();
        freeTextAnswers6.add(null);
        freeTextAnswers6.add(null);
        freeTextAnswers6.add(null);
        freeTextAnswers6.add(R.id.question6Item4Text);
        question6.setFreeText(freeTextAnswers6);

        question6.setLayout(R.layout.question6);
        questionMap.put(question6.getQuestionName(), question6);

        // Start question.
        questionQueue.add(question1);
    }
}