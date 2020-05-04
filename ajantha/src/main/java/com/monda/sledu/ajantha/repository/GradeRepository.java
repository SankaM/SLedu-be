package com.monda.sledu.ajantha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.monda.sledu.ajantha.model.Grade;
import java.util.List;

public interface GradeRepository extends JpaRepository<Grade, Integer> {


    List<Grade> findByMedium(String medium);
}
