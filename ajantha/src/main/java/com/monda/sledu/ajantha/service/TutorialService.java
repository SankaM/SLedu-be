package com.monda.sledu.ajantha.service;

import org.springframework.stereotype.Service;
import lombok.Setter;
import com.monda.sledu.ajantha.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.monda.sledu.ajantha.model.dto.QuestionDTO;
import java.util.List;
import com.monda.sledu.ajantha.model.Question;
import com.monda.sledu.ajantha.util.TutorialUtil;
import java.util.stream.Collectors;

@Service
@Setter
public class TutorialService {

    private TutorialRepository tutorialRepository;

    @Autowired
    public TutorialService(TutorialRepository tutorialRepository){
        this.tutorialRepository = tutorialRepository;
    }

    public List<QuestionDTO> getAllQuestions(){
        List<Question> questions = tutorialRepository.findAll();
        return questions.stream().map(TutorialUtil::getQuestionDTO).collect(Collectors.toList());
    }


}
