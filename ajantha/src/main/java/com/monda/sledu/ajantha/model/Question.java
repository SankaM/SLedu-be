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
    private Integer id;

    @Column(name = "grade_id")
    private Integer gradeId;

    @Column(name = "subject_id")
    private Integer subjectId;

    @Column(name = "question")
    private String question;

    @Column(name = "question_img_Url")
    private String questionImgUrl;

    @Column(name = "theory")
    private String theory;

    @Column(name = "solution")
    private String solution;

    @Column(name = "correct_answer")
    private String correctAnswer;

    @Column(name = "other_answers")
    private String otherAnswers;

}


