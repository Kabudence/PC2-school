package com.acme.pc2newschool.application;

import com.acme.pc2newschool.domain.model.aggregates.Student;
import com.acme.pc2newschool.domain.model.commands.CreateStudentCommand;
import com.acme.pc2newschool.domain.services.StudentCommandService;
import com.acme.pc2newschool.infrastructure.persistence.jpa.repositories.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentCommandImpl implements StudentCommandService {
    private final StudentRepository studentRepository;

    public StudentCommandImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Optional<Student> handle(CreateStudentCommand command) {
        if(command==null) throw new IllegalArgumentException("command cannot be null ");

        var student =new Student(command);
        studentRepository.save(student);
        return Optional.of(student);
    }
}
