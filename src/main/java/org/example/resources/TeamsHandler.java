package org.example.resources;

import org.example.domain.Team;
import org.example.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import reactor.core.publisher.Mono;

// @RestController
// @RequestMapping("teams")
@Component
public class TeamsHandler {

    @Autowired
    private TeamService teamService;

    // public List<Team> all() {
    //     return teamService.findAll();
    // }

    public Team one(@PathVariable long id) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return teamService.findById(id);
    }
}
