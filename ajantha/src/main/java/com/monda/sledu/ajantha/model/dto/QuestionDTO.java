package com.monda.sledu.ajantha.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class QuestionDTO {

    public Integer id;
    private Integer lessonId;
    public String question;
    public String questionImgUrl;
    public String theory;
    public String solution;
    public String correctAnswer;
    public List<String> otherAnswers;

    public QuestionDTO(Integer id, Integer lessonId, String question, String questionImgUrl, String theory, String solution, String correctAnswer, java.util.List<String> otherAnswers) {
        this.id = id;
        this.lessonId = lessonId;
        this.question = question;
        this.questionImgUrl = questionImgUrl;
        this.theory = theory;
        this.solution = solution;
        this.correctAnswer = correctAnswer;
        this.otherAnswers = otherAnswers;
    }
}
