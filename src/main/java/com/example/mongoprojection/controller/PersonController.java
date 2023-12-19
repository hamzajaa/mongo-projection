package com.example.mongoprojection.controller;

import com.example.mongoprojection.bean.Person;
import com.example.mongoprojection.dao.PersonInterfaceProjection;
import com.example.mongoprojection.dto.PersonDto;
import com.example.mongoprojection.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/persons/")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/")
    public List<Person> findAll() {
        return personService.findAll();
    }

    @GetMapping("/dto/lastName/{lastName}")
    public List<PersonDto> findAllDtos(@PathVariable String lastName) {
        return personService.findAllDtos(lastName);
    }

    @GetMapping("/interface/firstName/{firstName}")
    public List<PersonInterfaceProjection> findAllInterProjection(@PathVariable String firstName) {
        return personService.findAllInterProjection(firstName);
    }

    @GetMapping("/query/firstName/{firstName}")
    public List<Person> findAllByQuery(@PathVariable String firstName) {
        return personService.findAllByQuery(firstName);
    }

    @PostMapping("/")
    public void save(Person person) {
        personService.save(person);
    }
}
