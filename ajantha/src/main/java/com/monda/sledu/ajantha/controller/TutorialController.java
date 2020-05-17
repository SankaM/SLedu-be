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
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import com.monda.sledu.ajantha.model.Subject;
import com.monda.sledu.ajantha.model.Grade;
import com.monda.sledu.ajantha.service.TutorService;
import com.monda.sledu.ajantha.model.Lesson;
import com.monda.sledu.ajantha.model.dto.TopicListWithDefaultSmartNoteDTO;

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
    public List<QuestionDTO> getQuestionsByLessonId(@RequestParam Integer lessonId) {
        return tutorService.getQuestionsByLessonId(lessonId);
    }

    @PostMapping(value = "/questions")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void addQuestion(@RequestBody QuestionDTO questionDTO) {
        tutorService.addQuestion(questionDTO);
    }

    @DeleteMapping(value = "/questions")
    @ResponseStatus(code = HttpStatus.OK)
    public void deleteQuestion(@RequestParam Integer id) {

        tutorService.deleteQuestion(id);
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

    @GetMapping(value = "/lessons")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Lesson> getAllLessonsBySubject(@RequestParam Integer subjectId) {

        return tutorService.getAllLessonsBySubject(subjectId);
    }

    @GetMapping(value = "/topics")
    @ResponseStatus(code = HttpStatus.OK)
    public TopicListWithDefaultSmartNoteDTO getAllTopicByLessonWithDefaultSmartNote(@RequestParam Integer lessonId) {
        return tutorService.getTopicsOfLessonWithDefaultSmartNote(lessonId);
    }
}
