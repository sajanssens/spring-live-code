package org.example.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Team {

    @Id
    private long id;

    private String name;
}
