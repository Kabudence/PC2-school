package com.acme.pc2newschool.domain.model.valueobjects;

import jakarta.persistence.Embeddable;

@Embeddable
public record Specialty(String specialty) {

    public Specialty(){ this(null);}
    public Specialty{
        if (specialty==null||specialty.isBlank()) throw new IllegalArgumentException("The speciality cannot be null");
    }
    public String getSpeciality(){
        return String.format("%s",specialty);
    }
}
