package com.acme.pc2newschool.domain.model.commands;

import com.acme.pc2newschool.domain.model.valueobjects.GenderStatus;

import java.time.LocalDate;

public record CreateStudentCommand(String firstName, String lastName, String street, String number, String city, String postalCode, String country,
                                   GenderStatus gender,
                                   String specialty,
                                   Long studentDni,
                                   LocalDate birthDate) {
}
