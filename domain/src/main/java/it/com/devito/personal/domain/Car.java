package it.com.devito.personal.domain;

import lombok.ToString;

@ToString
public class Car {

    protected int id;
    protected String model;
    protected String color;
    protected int owner;
    protected String licensePlate;

    public Car(){}

    public Car(int id, String model, String color, int owner, String licensePlate) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.owner = owner;
        this.licensePlate = licensePlate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOwner() {
        return owner;
    }

    public void setOwner(int owner) {
        this.owner = owner;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

}
