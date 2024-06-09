package com.acme.pc2newschool.domain.services;

import com.acme.pc2newschool.domain.model.aggregates.Student;
import com.acme.pc2newschool.domain.model.commands.CreateStudentCommand;

import java.util.Optional;

public interface StudentCommandService {
    Optional<Student>handle(CreateStudentCommand command);
}
