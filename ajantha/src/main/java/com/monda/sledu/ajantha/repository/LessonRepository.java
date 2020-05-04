package com.monda.sledu.ajantha.repository;

import java.util.List;
import com.monda.sledu.ajantha.model.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import com.monda.sledu.ajantha.model.Lesson;

public interface LessonRepository extends JpaRepository<Lesson, Integer> {


    List<Lesson> findBySubjectId(Integer subjectId);
}
