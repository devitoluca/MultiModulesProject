package it.com.devito.personal.web.controller;

import it.com.devito.personal.service.interfaces.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    private CarService carService;

}
