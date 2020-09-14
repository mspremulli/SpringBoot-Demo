package com.example.demo.service;

import com.example.demo.dao.PersonDao;
import com.example.demo.model.Person;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PersonService {
    private final PersonDao personDao;

    public PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person){
        return personDao.insertPerson(person);
    }
    public List<Person> getAllPeople(){
        return personDao.selectAllPeople();
    }

    public Optional<Person> selectPersonByID(UUID id){
        return personDao.selectPersonById(id);
    }
}
