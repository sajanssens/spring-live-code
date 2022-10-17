package org.example;

import org.example.domain.Team;
import org.example.domain.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Run in dev mode with live reload with `mvn spring-boot:run`
// Recompile after making a change
@SpringBootApplication
public class SpringBootApp implements CommandLineRunner {

    @Autowired
    private TeamRepository teamRepository;

    @Override
    public void run(String... args) {
        teamRepository.save(Team.builder().name("DevOps1").build());
        teamRepository.save(Team.builder().name("DevOps2").build());
        teamRepository.save(Team.builder().name("DevOps3").build());
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApp.class);
    }
}
