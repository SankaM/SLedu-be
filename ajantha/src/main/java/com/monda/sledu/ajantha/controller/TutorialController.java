package com.monda.sledu.ajantha.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.extern.slf4j.Slf4j;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.monda.sledu.ajantha.service.TutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import com.monda.sledu.ajantha.model.dto.QuestionDTO;
import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;

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
    @RequestMapping(value = "/questions", method = GET)
    public List<QuestionDTO> questions() {
        return tutorialService.getAllQuestions();
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/questions", method = POST, consumes = "application/json")
    public void addQuestion( @RequestBody QuestionDTO questionDTO) {

       // QuestionDTO newQ = new QuestionDTO(id, question,  questionImgUrl, theory, solution, correctAnswer,  otherAnswers);
        tutorialService.addQuestion(questionDTO);
    }

}
