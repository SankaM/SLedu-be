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
import com.monda.sledu.ajantha.model.Subject;
import com.monda.sledu.ajantha.repository.SubjectRepository;
import com.monda.sledu.ajantha.repository.GradeRepository;
import com.monda.sledu.ajantha.model.Grade;

@Service
@Setter
public class TutorService {

    private TutorialRepository tutorialRepository;
    private SubjectRepository subjectRepository;
    private GradeRepository gradeRepository;

    @Autowired
    public TutorService(TutorialRepository tutorialRepository, SubjectRepository subjectRepository, GradeRepository gradeRepository){
        this.tutorialRepository = tutorialRepository;
        this.subjectRepository = subjectRepository;
        this.gradeRepository = gradeRepository;
    }

    public List<QuestionDTO> getQuestionsBySubject(Integer subjectId){
        List<Question> questions = tutorialRepository.findBySubjectId(subjectId);
        return questions.stream().map(TutorialUtil::getQuestionDTO).collect(Collectors.toList());
    }

    public void addQuestion(QuestionDTO questionDTO){
        Question question = TutorialUtil.getQuestion(questionDTO);
        tutorialRepository.save(question);
    }

    public void deleteQuestion(Integer id){
        tutorialRepository.deleteById(id);
    }

    public List<Subject> getAllSubjectsByGrade(Integer grade){
        return subjectRepository.findByGradeId(grade);
    }

    public List<Grade> getAllGradesByMedium(String medium){
        return gradeRepository.findByMedium(medium);
    }


}
