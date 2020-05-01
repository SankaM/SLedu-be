package com.monda.sledu.ajantha.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Column;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Id;

@Table(name = "t_question", schema = "sledu")
@Entity
@Setter
@Getter
@NoArgsConstructor
public class Question {

    @Column(name = "id")
    @JsonIgnore
    @Id
    public Integer id;

    @Column(name = "question")
    public String question;

    @Column(name = "question_img_Url")
    public String questionImgUrl;

    @Column(name = "theory")
    public String theory;

    @Column(name = "solution")
    public String solution;

    @Column(name = "correct_answer")
    public String correctAnswer;

    @Column(name = "other_answers")
    public String otherAnswers;

//    public Question(Integer id, String question, String questionImgUrl, String theory, String solution, String correctAnswer, String otherAnswers) {
//        this.id = id;
//        this.question = question;
//        this.questionImgUrl = questionImgUrl;
//        this.theory = theory;
//        this.solution = solution;
//        this.correctAnswer = correctAnswer;
//        this.otherAnswers = otherAnswers;
//    }
}


