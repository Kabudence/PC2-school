package com.acme.pc2newschool.domain.model.valueobjects;

import jakarta.persistence.Embeddable;

@Embeddable
public record Gender(GenderStatus gender) {
    public Gender(){this(null);}
    public Gender{
        if(gender==null )throw new IllegalArgumentException("Gender cannot be null");
    }
    public String getGender(){
        return gender.toString();
    }

}
