package com.example.springbootmongodb2.service;

import com.example.springbootmongodb2.collection.Person;

import java.util.List;

public interface PersonService {
    String save(Person person);

    List<Person> getPersonStartWith(String name);

    void delete(String id);

    List<Person> getByPersionAge(Integer minAge, Integer maxAge);
    
}
