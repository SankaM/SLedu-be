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

        String otherAnswerStr = question.getOtherAnswers();
        String[] otherAnswerArr = otherAnswerStr.split(",");
        List<String> otherAnswers = Arrays.asList(otherAnswerArr);
        questionDTO.setOtherAnswers(otherAnswers);

        return questionDTO;
    }
}
