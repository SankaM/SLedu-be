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
import com.monda.sledu.ajantha.model.dto.TopicListWithDefaultSmartNoteDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.monda.sledu.ajantha.model.dto.SubTopicDTO;
import com.monda.sledu.ajantha.repository.SmartNoteRepository;
import java.util.Collections;
import com.monda.sledu.ajantha.model.SmartNote;
import com.monda.sledu.ajantha.model.dto.TopicWithSubTopicListDTO;
import java.util.stream.Collectors;

@Service
@Setter
public class TutorService {

    private com.monda.sledu.ajantha.repository.QuestionRepository questionRepository;
    private SubjectRepository subjectRepository;
    private GradeRepository gradeRepository;
    private LessonRepository lessonRepository;
    private TopicRepository topicRepository;
    private SmartNoteRepository smartNoteRepository;

    @Autowired
    public TutorService(QuestionRepository questionRepository, SubjectRepository subjectRepository, GradeRepository gradeRepository, LessonRepository lessonRepository, TopicRepository topicRepository, SmartNoteRepository smartNoteRepository ){
        this.questionRepository = questionRepository;
        this.subjectRepository = subjectRepository;
        this.gradeRepository = gradeRepository;
        this.lessonRepository = lessonRepository;
        this.topicRepository = topicRepository;
        this.smartNoteRepository = smartNoteRepository;
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

    public TopicListWithDefaultSmartNoteDTO getTopicsOfLessonWithDefaultSmartNote(Integer lessonId){
        TopicListWithDefaultSmartNoteDTO topicListWithDefaultSmartNoteDTO = new TopicListWithDefaultSmartNoteDTO();
        List<Topic> rawTopicList =  topicRepository.findByLessonId(lessonId);
        Map<Integer, TopicWithSubTopicListDTO> topicList = new HashMap<>();
        List<String> topicIdList = new ArrayList<>();

        if(rawTopicList.size() > 0) {
            for (Topic topic : rawTopicList) {
                Integer topicId = topic.getTopicId();
                if (topicList.get(topicId) == null) {
                    com.monda.sledu.ajantha.model.dto.TopicWithSubTopicListDTO topicWithSubTopicListDTO = new TopicWithSubTopicListDTO();
                    topicWithSubTopicListDTO.setLessonId(topic.getLessonId());
                    topicWithSubTopicListDTO.setTopicId(topicId);
                    topicWithSubTopicListDTO.setTopicName(topic.getTopicName());

                    List<SubTopicDTO> subTopics = new ArrayList<>();
                    SubTopicDTO subTopicDTO = new SubTopicDTO();
                    subTopicDTO.setSubTopicId(topic.getSubTopicId());
                    subTopicDTO.setSubTopicName(topic.getSubTopicName());
                    subTopicDTO.setTopicId(topicId);
                    subTopics.add(subTopicDTO);

                    topicWithSubTopicListDTO.setSubTopicList(subTopics);
                    topicList.put(topicId, topicWithSubTopicListDTO);

                    topicIdList.add(topicId + "_" + subTopicDTO.getSubTopicId()+"_"+topic.getLessonId());
                } else {
                    SubTopicDTO subTopicDTO = new SubTopicDTO();
                    subTopicDTO.setTopicId(topicId);
                    subTopicDTO.setSubTopicName(topic.getSubTopicName());
                    subTopicDTO.setSubTopicId(topic.getSubTopicId());
                    topicList.get(topicId).getSubTopicList().add(subTopicDTO);

                    topicIdList.add(topicId + "_" + subTopicDTO.getSubTopicId()+ "_" +topic.getLessonId());
                }
            }

            // Get first subtopic smart note
            Collections.sort(topicIdList);
            String[] defIdArr = topicIdList.get(0).split("_");
            Integer defTopicId = Integer.parseInt(defIdArr[0]);
            Integer defSubTopicId = Integer.parseInt(defIdArr[1]);
            Integer defLessonId = Integer.parseInt(defIdArr[2]);

            SmartNote smartNote =  smartNoteRepository.findByTopicIdAndSubTopicIdAndLessonId(defTopicId, defSubTopicId, defLessonId);
            topicListWithDefaultSmartNoteDTO.setDefaultSmartNote(smartNote);
            topicListWithDefaultSmartNoteDTO.setTopics(topicList.values().stream().collect(Collectors.toList()));

        }
        return topicListWithDefaultSmartNoteDTO;
    }

    public SmartNote getSmartNote(Integer lessonId, Integer topicId, Integer subTopicId){
        return smartNoteRepository.findByTopicIdAndSubTopicIdAndLessonId(topicId, subTopicId, lessonId);
    }
}
