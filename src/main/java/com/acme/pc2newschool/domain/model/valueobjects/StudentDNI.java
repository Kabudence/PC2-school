package com.acme.pc2newschool.domain.model.valueobjects;

import jakarta.persistence.Embeddable;

@Embeddable
public record StudentDNI(Long dni) {
    public StudentDNI(){
        this(null);
    }
    public StudentDNI{
        if(dni<0)throw new IllegalArgumentException("Dni cant be null");
    }
    public String getDNI(){
        return String.format("%s",dni);
    }
}
