package com.example.mongoprojection.service;

import com.example.mongoprojection.bean.Person;
import com.example.mongoprojection.dao.PersonDao;
import com.example.mongoprojection.dao.PersonInterfaceProjection;
import com.example.mongoprojection.dto.PersonDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao personDao;

    @Override
    public List<Person> findAll() {
        return personDao.findAll();
    }

    @Override
    public List<PersonDto> findAllDtos(String lastName) {
        return personDao.findByLastName(lastName);
    }

    @Override
    public List<PersonInterfaceProjection> findAllInterProjection(String firstName) {
        return personDao.findPersonByFirstName(firstName);
    }

    @Override
    public List<Person> findAllByQuery(String firstName) {
        return personDao.findAllByQuery(firstName);
    }


    @Override
    public void save(Person person) {
        personDao.save(person);
    }
}
