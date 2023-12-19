package com.example.mongoprojection.service;

import com.example.mongoprojection.bean.Person;
import com.example.mongoprojection.dao.PersonInterfaceProjection;
import com.example.mongoprojection.dto.PersonDto;

import java.util.List;

public interface PersonService {

    List<Person> findAll();

    List<PersonDto> findAllDtos(String lastName);

    List<PersonInterfaceProjection> findAllInterProjection(String firstName);

    List<Person> findAllByQuery(String firstName);

    void save(Person person);

}
