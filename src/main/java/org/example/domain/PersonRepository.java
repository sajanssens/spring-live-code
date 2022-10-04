package org.example.domain;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
public class PersonRepository {

    @PersistenceContext
    private EntityManager em;

    public Person find(long id) { return em.find(Person.class, id); }

    @Transactional
    public void save(Person p) { em.merge(p); }
}
