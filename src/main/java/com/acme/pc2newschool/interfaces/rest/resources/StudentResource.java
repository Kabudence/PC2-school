package com.acme.pc2newschool.interfaces.rest.resources;

import java.time.LocalDate;

public record StudentResource(String fullName, String Street, String Gender, String Specialty, LocalDate birthday) {
}
