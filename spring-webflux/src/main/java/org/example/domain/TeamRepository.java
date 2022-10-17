package org.example.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {

    // @Transactional
    @Query("SELECT t FROM Team t JOIN FETCH t.members where t.name like %:name%")
    Stream<Team> findTeamWithMembersByNameLike(@Param("name") String name);

    Team findTeamByName(String name);
}

