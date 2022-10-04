package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApp implements CommandLineRunner {

    @Autowired private App app;

    @Override
    public void run(String... args) {
        app.doeMaarWat();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApp.class);
    }
}
