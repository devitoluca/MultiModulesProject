package it.com.devito.personal.service.implementation;

import it.com.devito.personal.domain.Car;
import it.com.devito.personal.repository.CarRepository;
import it.com.devito.personal.service.interfaces.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepository carRepository;

    @Override
    public void addCar(Car car) {

    }

    @Override
    public void removeCarById(int id) {

    }

}
