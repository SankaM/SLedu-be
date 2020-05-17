package com.monda.sledu.ajantha.service;

import org.springframework.stereotype.Service;
import lombok.Setter;
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
import com.monda.sledu.ajantha.model.Lesson;
import com.monda.sledu.ajantha.repository.LessonRepository;
import com.monda.sledu.ajantha.model.Topic;
import com.monda.sledu.ajantha.repository.TopicRepository;
import com.monda.sledu.ajantha.repository.QuestionRepository;
import com.monda.sledu.ajantha.model.dto.TopicDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.monda.sledu.ajantha.model.dto.SubTopicDTO;

@Service
@Setter
public class TutorService {

    private com.monda.sledu.ajantha.repository.QuestionRepository questionRepository;
    private SubjectRepository subjectRepository;
    private GradeRepository gradeRepository;
    private LessonRepository lessonRepository;
    private TopicRepository topicRepository;

    @Autowired
    public TutorService(QuestionRepository questionRepository, SubjectRepository subjectRepository, GradeRepository gradeRepository, LessonRepository lessonRepository, TopicRepository topicRepository){
        this.questionRepository = questionRepository;
        this.subjectRepository = subjectRepository;
        this.gradeRepository = gradeRepository;
        this.lessonRepository = lessonRepository;
        this.topicRepository = topicRepository;
    }

    public List<QuestionDTO> getQuestionsByLessonId(Integer lessonId){
        List<Question> questions = questionRepository.findByLessonId(lessonId);
        return questions.stream().map(TutorialUtil::getQuestionDTO).collect(Collectors.toList());
    }

    public void addQuestion(QuestionDTO questionDTO){
        Question question = TutorialUtil.getQuestion(questionDTO);
        questionRepository.save(question);
    }

    public void deleteQuestion(Integer id){
        questionRepository.deleteById(id);
    }

    public List<Subject> getAllSubjectsByGrade(Integer grade){
        return subjectRepository.findByGradeId(grade);
    }

    public List<Grade> getAllGradesByMedium(String medium){
        return gradeRepository.findByMedium(medium);
    }

    public List<Lesson> getAllLessonsBySubject(Integer subjectId){
        return lessonRepository.findBySubjectId(subjectId);
    }

    public List<TopicDTO> getTopicsOfLesson(Integer lessonId){
        List<Topic> rawTopicList =  topicRepository.findByLessonId(lessonId);
        Map<Integer,TopicDTO> topicList = new HashMap<>();

        for(Topic topic: rawTopicList){
            Integer topicId = topic.getTopicId();
            if(topicList.get(topicId) == null) {
                TopicDTO topicDTO = new TopicDTO();
                topicDTO.setLessonId(topic.getLessonId());
                topicDTO.setTopicId(topicId);
                topicDTO.setTopicName(topic.getTopicName());

                List<SubTopicDTO> subTopics = new ArrayList<>();
                SubTopicDTO subTopicDTO = new SubTopicDTO();
                subTopicDTO.setSubTopicId(topic.getSubTopicId());
                subTopicDTO.setSubTopicName(topic.getSubTopicName());
                subTopicDTO.setTopicId(topicId);
                subTopics.add(subTopicDTO);

                topicDTO.setSubTopicList(subTopics);
                topicList.put(topicId, topicDTO);
            }else{
                SubTopicDTO subTopicDTO = new SubTopicDTO();
                subTopicDTO.setTopicId(topicId);
                subTopicDTO.setSubTopicName(topic.getSubTopicName());
                subTopicDTO.setSubTopicId(topic.getSubTopicId());
                topicList.get(topicId).getSubTopicList().add(subTopicDTO);
            }

        }
        return topicList.values().stream().collect(Collectors.toList());
    }


}
