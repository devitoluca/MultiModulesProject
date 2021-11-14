package it.com.devito.personal.repository;

import it.com.devito.personal.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {

    public Car getCarById(int id);

    public Car getCarByLicensePlate(String licensePlate);

}
