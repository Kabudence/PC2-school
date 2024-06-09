package com.acme.pc2newschool.infrastructure.persistence.jpa.repositories;

import com.acme.pc2newschool.domain.model.aggregates.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}
