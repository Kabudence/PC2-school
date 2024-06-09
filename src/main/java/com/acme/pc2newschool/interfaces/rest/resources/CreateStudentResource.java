package com.acme.pc2newschool.interfaces.rest.resources;

import com.acme.pc2newschool.domain.model.valueobjects.GenderStatus;

import java.time.LocalDate;

public record CreateStudentResource(String firstName, String lastName, String street, String number, String city, String postalCode, String country,
                                    GenderStatus gender,
                                    String specialty,
                                    Long studentDni,
                                    LocalDate birthDate) {
}
