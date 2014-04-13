package com.example.Quiz;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by tomas on 3/31/14.
 */
public class Question {
    String question;
    String questionId;
    List<MainActivity.Model> answers;
    // Answer id, List of followup question id's.
    Map<Integer, List<String>> followup;
    boolean isExclusive;
    boolean isOptional;
    boolean isFreeText;
    boolean isFollowup;
    boolean isAnswered;
    String answer = "";

    public Question() {
        followup = new HashMap<Integer, List<String>>();
    }
}