package com.monda.sledu.tutorial.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import com.monda.sledu.tutorial.model.Question;
import lombok.extern.slf4j.Slf4j;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import org.springframework.web.bind.annotation.CrossOrigin;

@Slf4j
@RestController
@RequestMapping("/v1/tutorials")
public class TutorialController {

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/questions", method = GET)
    public java.util.List<Question> questions() {

        java.util.List<Question> questions = new java.util.ArrayList<>();

        String[] otherAnswers1 = {"25 cm","23 cm","22 cm","24 cm"};
        String[] otherAnswers2 ={"20 cm","15 cm","17 cm","16 cm"};
        questions.add(new Question(1,"පහත දී ඇති රුපයේ පරිමිතිය සොයන්න", "24 cm", java.util.Arrays.asList(otherAnswers1)));
        questions.add(new Question(2,"පැතත්ක  දිග 4cm  සමචතුරශ්රයක පරිමිතිය සොයන්න ", "24 cm", java.util.Arrays.asList(otherAnswers2)));
        questions.add(new Question(3,"පැතත්ක  දිග 9 cm  සවිධි පන්චාශ්‍රයක  පරිමිතිය සොයන්න ", "45 cm", java.util.Arrays.asList(otherAnswers2)));
        return questions;


    }

}
