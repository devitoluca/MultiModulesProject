package it.com.devito.personal.service.interfaces;

import it.com.devito.personal.domain.Person;

public interface PersonService {

    void addPerson(Person person);

    void removePersonById(int id);

}
