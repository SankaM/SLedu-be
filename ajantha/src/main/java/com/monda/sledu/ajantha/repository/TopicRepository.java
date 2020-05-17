package com.monda.sledu.ajantha.repository;

import java.util.List;
import com.monda.sledu.ajantha.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import com.monda.sledu.ajantha.model.Topic;

/**
 * Spring Data JPA interface to query tutorial data
 *
 * @author Priyantha Weerakoon
 */
public interface TopicRepository extends JpaRepository<Topic, Integer> {

    List<Topic> findByLessonId(Integer lessonId);
}