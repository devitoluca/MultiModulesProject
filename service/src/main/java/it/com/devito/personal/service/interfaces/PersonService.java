package it.com.devito.personal.service.interfaces;

import it.com.devito.personal.domain.Person;

import java.util.List;

public interface PersonService {

    void addPerson(Person person);

    void removePersonById(int id);

    List<Person> getPeople();

}
