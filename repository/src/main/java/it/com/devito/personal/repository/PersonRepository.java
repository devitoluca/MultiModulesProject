package it.com.devito.personal.repository;

import it.com.devito.personal.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

    Person getPersonById(int id);

    Optional<Person> getPersonByNameAndSurname(String name, String surname);

}
