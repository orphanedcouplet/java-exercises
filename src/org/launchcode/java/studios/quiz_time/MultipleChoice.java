package org.launchcode.java.studios.quiz_time;

import java.util.HashMap;

public class MultipleChoice extends Question {

    public MultipleChoice(String questionText, HashMap<String, Boolean> options) {
        super(questionText, options);
    }

    @Override
    public boolean isCorrect() {
        // TODO implement this method
        return false;
    }
}
