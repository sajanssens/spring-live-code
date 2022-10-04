package org.example;

import org.example.domain.Person;
import org.example.domain.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApp implements CommandLineRunner {

    @Autowired
    private App app;

    @Autowired
    private PersonDao personDao;

    @Override
    public void run(String... args) {
        app.doeMaarWat();
        Person p = Person.builder().name("Bram").build();
        personDao.save(p);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApp.class);
    }
}
