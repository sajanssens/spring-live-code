package org.example;

import org.example.domain.Person;
import org.example.domain.PersonRepository;
import org.example.domain.Team;
import org.example.domain.TeamRepository;
import org.example.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class SpringBootApp implements CommandLineRunner {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private TeamService teamService;

    @Override
    public void run(String... args) {
        Team devOps31 = Team.builder().name("DevOps3").build();
        teamRepository.save(devOps31);
        teamRepository.save(Team.builder().name("DevOps1").build());
        teamRepository.save(Team.builder().name("DevOps2").build());
        teamRepository.save(Team.builder().name("DevOps").build());
        teamRepository.save(Team.builder().name("DevOps").build());

        System.out.println(devOps31);


        Person p = Person.builder().name("Bram").age(42).team(devOps31).build();
        personRepository.save(p);

        Team firstDevopEager = teamService.findTeamWithMembersByNameLike("devop");
        Team devOps3 = teamService.findTeamByName("DevOps3");
        System.out.println(firstDevopEager);
    }

    public static void main(String[] args) throws IOException {
        SpringApplication.run(SpringBootApp.class);
        // System.in.read();
    }
}
