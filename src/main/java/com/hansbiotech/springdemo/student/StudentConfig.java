package com.hansbiotech.springdemo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student hassam = new Student("Hassam", LocalDate.of(1991, Month.SEPTEMBER, 25) , "hassam@computer.org");
            Student anum = new Student("Anum", LocalDate.of(1990, Month.MARCH, 12) , "anum@computer.org");
            repository.saveAll(List.of(hassam,anum));
        };
    }
}
