package com.acme.pc2newschool.interfaces.rest.transform;

import com.acme.pc2newschool.domain.model.aggregates.Student;
import com.acme.pc2newschool.interfaces.rest.resources.StudentResource;

public class CreateResourceFromEntityAssembler {
    public static StudentResource toResourceFromEntity(Student entity){
        return new StudentResource(entity.getFullName(),entity.getStreet(),entity.getGender(),entity.getSpecialty(),entity.getBirthDate());
    }
}
