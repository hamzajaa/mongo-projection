package com.example.mongoprojection.dao;

public interface PersonInterfaceProjection {
    String getFirstName();
    String getLastName();
    AddressInterfaceProjection getAddress();
}
