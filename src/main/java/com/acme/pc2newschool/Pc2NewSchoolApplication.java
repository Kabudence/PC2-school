package com.acme.pc2newschool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // Habilitar auditoría de Spring Data JPA

@SpringBootApplication
public class Pc2NewSchoolApplication {

    public static void main(String[] args) {
        SpringApplication.run(Pc2NewSchoolApplication.class, args);
    }

}
