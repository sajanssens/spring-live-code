package org.example.resources;

import org.example.domain.Team;
import org.example.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Optional;

import static java.lang.Long.parseLong;
import static org.springframework.web.reactive.function.BodyInserters.fromValue;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Component
public class TeamsHandler {

    @Autowired
    private TeamService teamService;

    public List<Team> all() { return teamService.findAll(); }

    public Mono<ServerResponse> one(ServerRequest rq) {
        // not ideal: JPARepo is not non-blocking, i.e. it is blocking.
        // Better use r2dbc or mongo, which is reactive by nature (TODO)
        Optional<Team> optionalTeam = teamService.findById(parseLong(rq.pathVariable("id")));
        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(fromValue(optionalTeam));
    }
}
