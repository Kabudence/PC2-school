package com.acme.pc2newschool.domain.model.aggregates;

import com.acme.pc2newschool.domain.model.commands.CreateStudentCommand;
import com.acme.pc2newschool.domain.model.valueobjects.*;
import com.acme.pc2newschool.shared.domain.model.aggregates.AuditableAbstractAggregateRoot;
import jakarta.persistence.*;
import lombok.Getter;
import org.hibernate.dialect.unique.CreateTableUniqueDelegate;

import java.time.LocalDate;
@Entity
public class Student extends AuditableAbstractAggregateRoot<Student> {

    @Embedded
    private PersonName personName;
    @Embedded
    private Gender gender;
    @Embedded
    private Specialty specialty;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "street", column = @Column(name = "address_street")),
            @AttributeOverride(name = "number", column = @Column(name = "address_number")),
            @AttributeOverride(name = "city", column = @Column(name = "address_city")),
            @AttributeOverride(name = "postalCode", column = @Column(name = "address_postal_code")),
            @AttributeOverride(name = "country", column = @Column(name = "address_country"))})

    private StreetAddress streetAddress;
    @Embedded
    private StudentDNI studentDNI;
    @Getter
    @Column(name = "birth_date")
    private LocalDate birthDate;

    public Student(CreateStudentCommand command) {
        this.personName = new PersonName(command.firstName(), command.lastName());
        this.gender= new Gender(command.gender());
        this.specialty = new Specialty(command.specialty());
        this.streetAddress = new StreetAddress(command.street(), command.number(), command.city(), command.postalCode(), command.country());
        this.studentDNI = new StudentDNI(command.studentDni());
        this.birthDate = command.birthDate();
    }

    protected Student() {

    }

    public String getFullName()
    {
        return personName.getFullName();
    }
    public  String getGender(){
        return gender.getGender();
    }
    public String getSpecialty(){
        return specialty.getSpeciality();
    }
    public String getStreet(){
        return streetAddress.getStreetAddress();
    }



}
