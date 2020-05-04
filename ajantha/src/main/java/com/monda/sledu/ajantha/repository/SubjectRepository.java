package com.monda.sledu.ajantha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.monda.sledu.ajantha.model.Subject;
import java.util.List;

/**
 * Spring Data JPA interface to query tutorial data
 *
 * @author Priyantha Weerakoon
 */
public interface SubjectRepository extends JpaRepository<Subject, Integer> {

    List<Subject> findByGradeId(Integer gradeId);
}