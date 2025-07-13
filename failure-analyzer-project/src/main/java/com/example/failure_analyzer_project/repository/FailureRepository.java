package com.example.failure_analyzer_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.failure_analyzer_project.entity.Failure;

@Repository
public interface FailureRepository extends JpaRepository<Failure,Long> {

}
