package it.com.devito.personal.web.controller;

import it.com.devito.personal.service.interfaces.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/people")
    public String getPeople(){
        return personService.getPeople().toString();
    }

}
