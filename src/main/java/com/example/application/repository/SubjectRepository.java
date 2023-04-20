package com.example.application.repository;

import com.example.application.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;


public interface SubjectRepository extends JpaRepository<Subject, Long> {
  /*ist<Subject> findBySemestersIn(Set<String> semesters);*/
}
