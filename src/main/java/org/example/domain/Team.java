package org.example.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data @Builder @AllArgsConstructor @NoArgsConstructor
@Table(name = "team")
public class Team extends AbstractEntity {

    private String name;

    @OneToMany(mappedBy = "team")
    @Builder.Default
    private Set<Person> members = new HashSet<>();
}
