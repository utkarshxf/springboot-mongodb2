package com.example.springbootmongodb2.repository;

import com.example.springbootmongodb2.collection.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends MongoRepository<Person,String> {
     List<Person> findByFirstNameStartsWith(String name);
     List <Person> findByAgeBetween(Integer min,Integer max);
}
