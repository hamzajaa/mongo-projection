package com.example.mongoprojection.dao;

import com.example.mongoprojection.bean.Address;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AddressDao extends MongoRepository<Address, Long> {
}
