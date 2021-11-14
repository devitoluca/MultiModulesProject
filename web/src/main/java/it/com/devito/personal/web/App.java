package it.com.devito.personal.web;

import it.com.devito.personal.service.interfaces.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App {

    private PersonService personServices;

    @GetMapping("/")
    public String getPeople(){
        return personServices.getPeople().toString();
    }

    public static void main(String[] args){
        SpringApplication.run(App.class);
    }
}
