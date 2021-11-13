package it.com.devito.personal.service.interfaces;

import it.com.devito.personal.domain.Car;

public interface CarService {

    void addCar(Car car);

    void removeCarById(int id);

}
