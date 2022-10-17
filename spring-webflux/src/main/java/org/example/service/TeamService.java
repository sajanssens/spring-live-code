package org.example.service;

import org.example.domain.Team;
import org.example.domain.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeamService {

    @Autowired
    private TeamRepository teamRepository;

    public List<Team> findAll() { return teamRepository.findAll(); }

    public Optional<Team> findById(long id) {
        return teamRepository.findById(id);
    }
}
