package com.monda.sledu.tutorial.model;

public class Question {
    public Integer id;
    public String question;
    public String correctAnswer;
    public java.util.List<String>  otherAnswers;

    public Question(Integer id, String question, String correctAnswer, java.util.List<String> otherAnswers) {
        this.id = id;
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.otherAnswers = otherAnswers;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public java.util.List<String> getOtherAnswers() {
        return otherAnswers;
    }

    public void setOtherAnswers(java.util.List<String> otherAnswers) {
        this.otherAnswers = otherAnswers;
    }
}
