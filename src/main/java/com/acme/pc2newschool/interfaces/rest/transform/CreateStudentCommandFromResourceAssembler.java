package com.acme.pc2newschool.interfaces.rest.transform;

import com.acme.pc2newschool.domain.model.commands.CreateStudentCommand;
import com.acme.pc2newschool.interfaces.rest.resources.CreateStudentResource;

public class CreateStudentCommandFromResourceAssembler {
    public static CreateStudentCommand toCommandFromResource(CreateStudentResource resource){
    return new CreateStudentCommand(resource.firstName() , resource.lastName(), resource.street(), resource.number(), resource.city(), resource.postalCode(), resource.country(),resource.gender(), resource.specialty(), resource.studentDni(), resource.birthDate());
    }
}
