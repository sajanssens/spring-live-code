package org.example.service;

import org.example.domain.Team;
import org.example.domain.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class TeamService {

    @Autowired
    private TeamRepository teamRepository;

    @Transactional
    public Team findTeamWithMembersByNameLike(String name) {
        return teamRepository.findTeamWithMembersByNameLike(name)
                .findFirst()
                .orElse(Team.builder().name("NOT FOUND!").build());
    }

    @Transactional
    public Team findTeamByName(String name) {
        return teamRepository.findTeamByName(name);
    }
}
