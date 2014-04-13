package com.example.Quiz;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.*;
import java.util.*;

public class MainActivity extends Activity {
    // Views.
    private TextView introOutroText;
    private Button beginExitSurvey;
    private TextView questionText;
    private ListView answerList;
    private TextView freeTextQuestionText;
    private EditText freeTextQuestionAnswer;

    private ListViewAdapter adapter;

    // Intro and Outro messages.
    private static final String INTRO = "Welcome to this awesome survey!";
    private static final String OUTRO = "End of the survey. Bye!";

    private boolean surveyStarted;
    private boolean exitSurvey;

    private Question currentQuestion;

    private Map<String, Question> questionMap;

    private Queue<Question> questionQueue;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        questionMap = new LinkedHashMap<String, Question>();
        questionQueue = new LinkedList<Question>();

        // Show survey intro.
        showIntro();

        initializeQuestions();
    }

    private void initializeQuestions() {
        Question question1 = new Question();
        question1.questionId = "1";
        question1.question = "Do you want to build a snowman?";
        question1.answers = Arrays.asList(new Model("Yes", false), new Model("No", false), new Model("Go away Anna!", false), new Model("Other", true));
        question1.isExclusive = true;
        question1.followup.put(0, null);
        question1.followup.put(1, null);
        question1.followup.put(2, null);
        questionMap.put(question1.questionId, question1);

        Question question2 = new Question();
        question2.questionId = "2";
        question2.question = "What is your quest?";
        question2.answers = Arrays.asList(new Model("To burn bananas", false), new Model("To seek the Holy Grail", false), new Model("I don't know", false));

        List<String> followupQuestions = new ArrayList<String>();
        followupQuestions.add("3");
        question2.followup.put(0, null);
        question2.followup.put(1, followupQuestions);
        question2.followup.put(2, null);
        questionMap.put(question2.questionId, question2);

        Question question3 = new Question();
        question3.questionId = "3";
        question3.question = "What is the airspeed velocity of an unladen swallow?";
        question3.answers = Arrays.asList(new Model("10 km/h", false), new Model("African or European?", false), new Model("2 teemos", false));
        question3.isFollowup = true;
        question3.followup.put(0, null);
        question3.followup.put(1, null);
        question3.followup.put(2, null);
        questionMap.put(question3.questionId, question3);

        Question question4 = new Question();
        question4.questionId = "4";
        question4.question = "What are you doing?";
        question4.answers = Arrays.asList(new Model("Nothing", false), new Model("Something", false), new Model("Everything", false), new Model("Other", true));
        question4.isOptional = true;
        question4.followup.put(0, null);
        question4.followup.put(1, null);
        question4.followup.put(2, null);
        question4.followup.put(3, null);
        questionMap.put(question4.questionId, question4);

        Question question5 = new Question();
        question5.questionId = "5";
        question5.question = "Any other comments?";
        //question5.isOptional = true;
        question5.isFreeText = true;
        questionMap.put(question5.questionId, question5);

        // Start question.
        questionQueue.add(question1);
    }

    /**
     * Shows the introduction message of the survey.
     */
    private void showIntro() {
        setContentView(R.layout.intro_outro);
        introOutroText = (TextView)findViewById(R.id.introOutroText);
        beginExitSurvey = (Button)findViewById(R.id.beginExitSurvey);
        introOutroText.setText(INTRO);
        beginExitSurvey.setText("Begin Survey");
    }

    /**
     * Begins, ends or exits the survey.
     * @param view
     */
    public void beginExitSurvey(View view) {
        if (exitSurvey) {
            finish();
        }
        else if (!surveyStarted) {
            surveyStarted = true;
            showQuestion();
        }
    }

    /**
     * Sets up next question/s.
     * @param view
     */
    public void nextQuestion(View view) {
        if (currentQuestion.isFreeText) {
            if (!currentQuestion.isOptional) {
                String answer = freeTextQuestionAnswer.getText().toString();
                if (answer.trim().length() < 1) {
                    new AlertDialog.Builder(this).setMessage("You must answer this question!").setPositiveButton("OK", null).show();
                    return;
                }
            }
            // Save answer.
            currentQuestion.answer = freeTextQuestionAnswer.getText().toString();
        } else {
            // Returns checked items.
            List<Integer> checkedItems = adapter.getCheckedItems();

            // If not optional question, make sure at least one answer is selected.
            if (!currentQuestion.isOptional) {
                if (checkedItems.size() < 1) {
                    new AlertDialog.Builder(this).setMessage("You must select at least one answer!").setPositiveButton("OK", null).show();
                    return;
                }
            }

            // Go through checked items.
            for (Integer item : checkedItems) {
                // Get the followup questions for this checked item.
                List<String> followupQuestions = currentQuestion.followup.get(item);

                // If there are any followup questions, add them to the queue.
                if (followupQuestions != null) {
                    for (String questionId : followupQuestions) {
                        questionQueue.add(questionMap.get(questionId));
                    }
                }

                // Save answer.
                currentQuestion.answer += currentQuestion.answers.get(item).isFreeText ? currentQuestion.answers.get(item).getName() + " : " + currentQuestion.answers.get(item).freeText : currentQuestion.answers.get(item).getName() + ", ";
            }
        }

        // Set the current question as answered.
        currentQuestion.isAnswered = true;

        // Add next question.
        for (Map.Entry<String, Question> entry : questionMap.entrySet()) {
            Question question = entry.getValue();
            if (!question.isAnswered && !question.isFollowup && !questionQueue.contains(question)) {
                questionQueue.add(question);
                break;
            }
        }

        // Show next question.
        showQuestion();
    }

    /**
     * Shows the new question.
     */
    private void showQuestion() {
        if (questionQueue.size() > 0) {
            // Get the current question from the question queue.
            currentQuestion = questionQueue.poll();

            // If free text question.
            if (currentQuestion.isFreeText) {
                setContentView(R.layout.freetext_question);
                freeTextQuestionText = (TextView)findViewById(R.id.freeTextQuestionText);
                freeTextQuestionAnswer = (EditText)findViewById(R.id.freeTextQuestionAnswer);
                freeTextQuestionText.setText(currentQuestion.question + (currentQuestion.isOptional ? "" : "*"));
            } else {
                setContentView(R.layout.simple_list_question);
                questionText = (TextView) findViewById(R.id.questionText);
                answerList = (ListView) findViewById(R.id.list);
                // Set question text.
                questionText.setText(currentQuestion.question + (currentQuestion.isOptional ? "" : "*"));

                // Set up the answer list depending on whether the question is exclusive (single choice) or not (multiple choice).
                if (currentQuestion.isExclusive) {
                    adapter = new ListViewAdapter(this, android.R.layout.simple_list_item_single_choice, currentQuestion.answers, 1);
                    answerList.setAdapter(adapter);
                    answerList.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
                } else {
                    adapter = new ListViewAdapter(this, android.R.layout.simple_list_item_multiple_choice, currentQuestion.answers, 0);
                    answerList.setAdapter(adapter);
                    answerList.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
                }
            }
        } else {
            showOutro();
        }
    }

    private class ListViewAdapter extends ArrayAdapter<Model> {
        private final Activity context;
        private final List<Model> list;
        private final int type; // 0 - checkbox, 1 - radiobutton.

        public ListViewAdapter(Activity context, int layout, List<Model> list, int type) {
            super(context, layout, list);
            this.context = context;
            this.list = list;
            this.type = type;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            View view = null;

            if (type == 0) {
                if (convertView == null) {
                    LayoutInflater inflater = context.getLayoutInflater();
                    view = inflater.inflate(R.layout.list_item_checkbox, null);
                    final ViewHolder viewHolder = new ViewHolder();
                    viewHolder.name = (TextView) view.findViewById(R.id.answerTextCheck);
                    viewHolder.checkBox = (CheckBox) view.findViewById(R.id.check);
                    viewHolder.checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            Model element = (Model) viewHolder.checkBox.getTag();
                            element.setSelected(buttonView.isChecked());
                        }
                    });

                    viewHolder.checkFreeText = (EditText)view.findViewById(R.id.checkFreeText);
                    viewHolder.checkFreeText.setTag(list.get(position));
                    viewHolder.checkFreeText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                        @Override
                        public void onFocusChange(View v, boolean hasFocus) {
                            if (!hasFocus) {
                                viewHolder.checkFreeText.setFocusable(true);
                                Model element = (Model)v.getTag();
                                final EditText tempText = (EditText) v;
                                element.freeText = tempText.getText().toString();
                            }
                        }
                    });

                    view.setTag(viewHolder);
                    viewHolder.checkBox.setTag(list.get(position));
                } else {
                    view = convertView;
                    ((ViewHolder) view.getTag()).checkBox.setTag(list.get(position));
                }
                ViewHolder holder = (ViewHolder) view.getTag();
                holder.name.setText(list.get(position).getName());
                holder.checkBox.setChecked(list.get(position).isSelected());
                holder.checkFreeText.setText(list.get(position).freeText);

                if (!list.get(position).isFreeText) {
                    holder.checkFreeText.setVisibility(View.GONE);
                } else {
                    holder.checkFreeText.setVisibility(View.VISIBLE);
                }
            } else {
                if (convertView == null) {
                    LayoutInflater inflater = context.getLayoutInflater();
                    view = inflater.inflate(R.layout.list_item_radiobutton, null);
                    final ViewHolder viewHolder = new ViewHolder();
                    viewHolder.name = (TextView) view.findViewById(R.id.answerTextRadio);
                    viewHolder.radioButton = (RadioButton) view.findViewById(R.id.radio);
                    viewHolder.radioButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Model element = (Model) v.getTag();
                            if (!element.isSelected()) {
                                element.setSelected(true);
                                for (Model m : list) {
                                    if (m != element && m.isSelected()) {
                                        m.setSelected(false);
                                    }
                                }
                                notifyDataSetChanged();
                            }
                        }
                    });
                    viewHolder.radioFreeText = (EditText)view.findViewById(R.id.radioFreeText);
                    viewHolder.radioFreeText.setTag(list.get(position));

                    viewHolder.radioFreeText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                        @Override
                        public void onFocusChange(View v, boolean hasFocus) {
                            if (!hasFocus) {
                                viewHolder.radioFreeText.setFocusable(true);
                                Model element = (Model) v.getTag();
                                final EditText tempText = (EditText) v;
                                element.freeText = tempText.getText().toString();
                            }
                        }
                    });

                    viewHolder.radioFreeText.addTextChangedListener(new TextWatcher() {
                        @Override
                        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                        }

                        @Override
                        public void onTextChanged(CharSequence s, int start, int before, int count) {

                        }

                        @Override
                        public void afterTextChanged(Editable s) {
                            list.get(position).freeText = viewHolder.radioFreeText.getText().toString();
                        }
                    });

                    view.setTag(viewHolder);
                    viewHolder.radioButton.setTag(list.get(position));
                } else {
                    view = convertView;
                    ((ViewHolder) view.getTag()).radioButton.setTag(list.get(position));
                }
                ViewHolder holder = (ViewHolder) view.getTag();
                holder.name.setText(list.get(position).getName());
                holder.radioButton.setChecked(list.get(position).isSelected());
                holder.radioFreeText.setText(list.get(position).freeText);

                if (!list.get(position).isFreeText) {
                    holder.radioFreeText.setVisibility(View.GONE);
                } else {
                    holder.radioFreeText.setVisibility(View.VISIBLE);
                }
            }
            return view;
        }

        private class ViewHolder {
            TextView name;
            CheckBox checkBox;
            RadioButton radioButton;
            EditText radioFreeText;
            EditText checkFreeText;
        }

        public List<Integer> getCheckedItems() {
            List<Integer> checkedItems = new ArrayList<Integer>();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).isSelected()) {
                    checkedItems.add(i);
                }
            }
            return checkedItems;
        }
    }

    /**
     * Shows the ending message of the survey.
     */
    private void showOutro() {
        setContentView(R.layout.intro_outro);
        introOutroText = (TextView)findViewById(R.id.introOutroText);
        beginExitSurvey = (Button)findViewById(R.id.beginExitSurvey);

        String answers = "\nYour answers:\n";
        // Go through all questions and gather answers.
        for (Map.Entry<String, Question> entry : questionMap.entrySet()) {
            Question question = entry.getValue();
            answers += "Question: " + question.questionId + ", Answer: " + (question.answer.trim().length() < 1 ? "No answer" : question.answer) + "\n";
        }
        introOutroText.setText(OUTRO + "\n" + answers);
        beginExitSurvey.setText("Exit Survey");
        exitSurvey = true;
    }

    public class Model {

        private String name;
        private boolean selected;
        private boolean isFreeText;
        public String freeText = "";

        public Model(String name, boolean isFreeText) {
            this.name = name;
            this.isFreeText = isFreeText;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public boolean isSelected() {
            return selected;
        }

        public void setSelected(boolean selected) {
            this.selected = selected;
        }

        public boolean isFreeText() {
            return isFreeText;
        }

        public void setFreeText(boolean isFreeText) {
            this.isFreeText = isFreeText;
        }
    }
}
