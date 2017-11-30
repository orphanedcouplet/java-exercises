package org.launchcode.java.studios.quiz_time;

import java.util.HashMap;

public abstract class Question {

    private static int nextId;
    private final int id;
    private String questionText;
    private HashMap<String, Boolean> options;

    private Question(int id, String questionText, HashMap<String, Boolean> options) {
        this.id = id;
        this.questionText = questionText;
        this.options = options;
    }

    public Question(String questionText, HashMap<String, Boolean> options) {
        this(nextId, questionText, options);
        nextId++;
    }

    public abstract boolean isCorrect();

    // getters and setters

    public int getId() {
        return id;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public HashMap<String, Boolean> getOptions() {
        return options;
    }

    public void setOptions(HashMap<String, Boolean> options) {
        this.options = options;
    }

}
