package org.example.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class PersonRepository {

    @PersistenceContext
    private EntityManager em;

    public Person find(long id) { return em.find(Person.class, id); }

    @Transactional
    public void save(Person p) { em.merge(p); }

    @Autowired
    private PersonDao dao;

    public List<Person> findAll() {
        return dao.findAll();
    }

    public List<Person> findByName(String name) {
        return dao.findPersonsByName(name);
    }
}

interface PersonDao extends JpaRepository<Person, Long> {

    List<Person> findPersonsByName(String name);
}
