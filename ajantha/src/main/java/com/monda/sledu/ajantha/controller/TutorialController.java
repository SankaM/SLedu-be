package com.monda.sledu.ajantha.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import com.monda.sledu.ajantha.model.dto.QuestionDTO;
import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import com.monda.sledu.ajantha.model.Subject;
import com.monda.sledu.ajantha.model.Grade;
import com.monda.sledu.ajantha.service.TutorService;

@Slf4j
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/v1/tutor")
public class TutorialController {

    private TutorService tutorService;

    @Autowired
    public TutorialController(com.monda.sledu.ajantha.service.TutorService tutorService){
        this.tutorService = tutorService;
    }

    @GetMapping(value = "/questions")
    @ResponseStatus(code = HttpStatus.OK)
    public List<QuestionDTO> questions(@RequestParam Integer subjectId) {
        return tutorService.getQuestionsBySubject(subjectId);
    }

    @PostMapping(value = "/questions")
    public ResponseEntity<Void> addQuestion(@RequestBody QuestionDTO questionDTO) {

        tutorService.addQuestion(questionDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/questions")
    public ResponseEntity<Void> deleteQuestion(@RequestParam Integer id) {

        tutorService.deleteQuestion(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping(value = "/subjects")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Subject> getAllSubjectsByGrade(@RequestParam Integer gradeId) {

        return tutorService.getAllSubjectsByGrade(gradeId);
    }

    @GetMapping(value = "/grades")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Grade> getAllGradsByMedium(@RequestParam String medium) {

        return tutorService.getAllGradesByMedium(medium);
    }

}
