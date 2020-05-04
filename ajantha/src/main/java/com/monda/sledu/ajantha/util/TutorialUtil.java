package com.monda.sledu.ajantha.util;

import com.monda.sledu.ajantha.model.dto.QuestionDTO;
import com.monda.sledu.ajantha.model.Question;
import java.util.List;
import java.util.Arrays;

public final class TutorialUtil {

    private TutorialUtil(){

    }

    public static QuestionDTO getQuestionDTO(Question question){
        QuestionDTO questionDTO = new QuestionDTO();
        questionDTO.setId(question.getId());
        questionDTO.setCorrectAnswer(question.getCorrectAnswer());
        questionDTO.setQuestion(question.getQuestion());
        questionDTO.setQuestionImgUrl(question.getQuestionImgUrl());
        questionDTO.setSolution(question.getSolution());
        questionDTO.setTheory(question.getTheory());
        questionDTO.setGradeId(question.getGradeId());
        questionDTO.setSubjectId(question.getSubjectId());

        String otherAnswerStr = question.getOtherAnswers();
        String[] otherAnswerArr = otherAnswerStr.split(",");
        List<String> otherAnswers = Arrays.asList(otherAnswerArr);
        questionDTO.setOtherAnswers(otherAnswers);

        return questionDTO;
    }

    public static Question getQuestion(QuestionDTO questionDTO){
        Question question = new Question();
        question.setId(questionDTO.getId());
        question.setCorrectAnswer(questionDTO.getCorrectAnswer());
        question.setQuestion(questionDTO.getQuestion());
        question.setQuestionImgUrl(questionDTO.getQuestionImgUrl());
        question.setSolution(questionDTO.getSolution());
        question.setTheory(questionDTO.getTheory());

        StringBuilder s = new StringBuilder();
        List<String> otherAnswerList = questionDTO.getOtherAnswers();
        otherAnswerList.forEach(x-> s.append(x).append(","));
        String otherAnswers = s.toString().substring(0, s.length()-1);
        question.setOtherAnswers(otherAnswers);

        return question;
    }
}
