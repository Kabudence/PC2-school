package com.acme.pc2newschool.interfaces;

import com.acme.pc2newschool.domain.services.StudentCommandService;
import com.acme.pc2newschool.interfaces.rest.resources.CreateStudentResource;
import com.acme.pc2newschool.interfaces.rest.resources.StudentResource;
import com.acme.pc2newschool.interfaces.rest.transform.CreateResourceFromEntityAssembler;
import com.acme.pc2newschool.interfaces.rest.transform.CreateStudentCommandFromResourceAssembler;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/students", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "Students", description = "Students Management Endpoints")
public class StudentController  {

        private final StudentCommandService studentCommandService;

    public StudentController(StudentCommandService studentCommandService) {
        this.studentCommandService = studentCommandService;
    }

    @PostMapping
    public ResponseEntity<StudentResource> createStudent(@RequestBody CreateStudentResource resource){
       var createStudentCommand= CreateStudentCommandFromResourceAssembler.toCommandFromResource(resource);
       var student= studentCommandService.handle(createStudentCommand);
       if(student.isEmpty())throw new IllegalArgumentException("Student cant be null");
       var studentResource= CreateResourceFromEntityAssembler.toResourceFromEntity(student.get());
       return new ResponseEntity<>(studentResource, HttpStatus.CREATED);
    }
}
