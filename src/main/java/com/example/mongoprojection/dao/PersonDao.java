package com.example.mongoprojection.dao;

import com.example.mongoprojection.bean.Person;
import com.example.mongoprojection.dto.PersonDto;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonDao extends MongoRepository<Person, Long> {



    List<PersonDto> findByLastName(String lastName);
    List<PersonInterfaceProjection> findPersonByFirstName(String firstName);

    @Query(value = "{ 'firstName' : ?0 }", fields = "{ 'firstName' : 1, 'lastName' : 1, 'address.city' : 1, 'address.street' : 1 }")
    List<Person> findAllByQuery(@Param("firstName") String firstName);
}
