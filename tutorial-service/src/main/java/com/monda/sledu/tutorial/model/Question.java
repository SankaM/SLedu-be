package com.monda.sledu.tutorial.model;

public class Question {
    public Integer id;
    public String question;
    public String questionImgUrl;
    public String theory;
    public String solution;
    public String correctAnswer;
    public java.util.List<String> otherAnswers;

    public Question(Integer id, String question, String questionImgUrl, String theory, String solution, String correctAnswer, java.util.List<String> otherAnswers) {
        this.id = id;
        this.question = question;
        this.questionImgUrl = questionImgUrl;
        this.theory = theory;
        this.solution = solution;
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

    public String getQuestionImgUrl() {
        return questionImgUrl;
    }

    public void setQuestionImgUrl(String questionImgUrl) {
        this.questionImgUrl = questionImgUrl;
    }

    public String getTheory() {
        return theory;
    }

    public void setTheory(String theory) {
        this.theory = theory;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

}


