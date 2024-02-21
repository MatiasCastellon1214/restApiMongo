package com.mirty.restAPIMongo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class RestApiMongoApplication implements CommandLineRunner {

    private final StudentRepository repository;

    public RestApiMongoApplication(StudentRepository repository) {
        this.repository = repository;
    }

    public static void main(String[] args) {
        SpringApplication.run(RestApiMongoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Address address = new Address(
                "Argentina",
                "Jujuy",
                "4600"
        );
        Student student = new Student(
                "Jaimito",
                "Garcia",
                "jaimito@garcia.com",
                Gender.MALE,
                address,
                List.of("Computer Science"),
                150.50,
                LocalDateTime.now()
        );
        repository.insert(student);
    }
}
