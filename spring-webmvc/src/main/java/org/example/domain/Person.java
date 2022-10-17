package org.example.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.json.bind.annotation.JsonbProperty;
import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Data @Builder @AllArgsConstructor @NoArgsConstructor
public class Person extends AbstractEntity {

    @JsonbProperty("naam")
    private String name;

    private int age;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @JsonbTransient
    private Team team;
}
