package com.dxc.learning.demoapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImlp implements PersonService {


    @Autowired
    private PersonRepository personRepository;

    @Override
    public Person getPersonById(int id) {
        return personRepository.findById(id).orElseThrow();
    }

    @Override
    public Person getPersonByEmail(string email){
        return null;
    }
    
    @Override
    public Person createPerson(Person person){
        return personRepository.save(person);
    }

    @Override
    public Person updatePerson(Person person) {
        return personRepository.save(person);
    }

    @Override
    public void deletePerson(int id) {
        Person person = getPersonrById(id);
        personRepository.delete(person);

    }

    @Override
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }
    
} 
