package com.monda.sledu.ajantha.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.monda.sledu.ajantha.service.TutorialService;
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

@Slf4j
@RestController
@RequestMapping("/v1/tutorials")
public class TutorialController {

    private TutorialService tutorialService;

    @Autowired
    public TutorialController(TutorialService tutorialService){
        this.tutorialService = tutorialService;
    }

    @CrossOrigin(origins = "*")
    @GetMapping(value = "/questions")
    @ResponseStatus(code = HttpStatus.OK)
    public List<QuestionDTO> questions() {
        return tutorialService.getAllQuestions();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(value = "/questions")
    public ResponseEntity<Void> addQuestion(@RequestBody QuestionDTO questionDTO) {

        tutorialService.addQuestion(questionDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @CrossOrigin(origins = "*")
    @DeleteMapping(value = "/questions")
    public ResponseEntity<Void> deleteQuestion(@RequestParam Integer id) {

        tutorialService.deleteQuestion(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
