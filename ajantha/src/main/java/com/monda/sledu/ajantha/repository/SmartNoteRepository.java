package com.monda.sledu.ajantha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.monda.sledu.ajantha.model.SmartNote;

/**
 * Spring Data JPA interface to query tutorial data
 *
 * @author Priyantha Weerakoon
 */
public interface SmartNoteRepository extends JpaRepository<SmartNote, Integer> {

    SmartNote findByTopicIdAndSubTopicIdAndLessonId(Integer topicId, Integer subTopicId,Integer lessonId);
}