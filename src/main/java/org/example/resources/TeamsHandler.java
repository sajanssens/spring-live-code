package org.example.resources;

import org.example.domain.Team;
import org.example.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.reactive.function.server.ServerRequest;
import reactor.core.publisher.Mono;

import static java.lang.Long.parseLong;

@Component
public class TeamsHandler {

    @Autowired
    private TeamService teamService;

    // public List<Team> all() {
    //     return teamService.findAll();
    // }

    public Team one(@PathVariable ServerRequest rq) {
        return teamService.findById(parseLong(rq.pathVariable("id")));
    }
}
