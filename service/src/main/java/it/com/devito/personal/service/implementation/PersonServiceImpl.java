package it.com.devito.personal.service.implementation;

import it.com.devito.personal.domain.Person;
import it.com.devito.personal.repository.PersonRepository;
import it.com.devito.personal.service.interfaces.PersonService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;


    @Override
    public void addPerson(Person person) {

    }

    @Override
    public void removePersonById(int id) {

    }

    @Override
    public List<Person> getPeople(){
        return personRepository.findAll();
    }

}
