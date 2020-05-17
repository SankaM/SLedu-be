package com.monda.sledu.ajantha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.monda.sledu.ajantha.model.Question;
import java.util.List;

/**
 * Spring Data JPA interface to query tutorial data
 *
 * @author Priyantha Weerakoon
 */
public interface QuestionRepository extends JpaRepository<Question, Integer> {

    List<Question> findByLessonId(Integer lessonId);
}