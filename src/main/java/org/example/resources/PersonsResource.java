package org.example.resources;

import org.example.domain.Person;
import org.example.domain.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("persons")
public class PersonsResource {

    @Autowired
    private PersonRepository personRepo;

    @GetMapping
    public List<Person> all(@RequestParam(required = false) String name) {
        return name == null ? personRepo.findAll() : personRepo.findByName(name);
    }

    @GetMapping("{id}")
    public Person one(@PathVariable long id) throws InterruptedException {
        Thread.sleep(5000);
        Person person = personRepo.find(id);
        if (person == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND, "De persoon was niet gevonden, maar je moeder wel.");

        return person;
    }
}
