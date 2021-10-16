package com.company;

import java.util.Objects;

public class Car {
    private int maxSpeed;
    private String brandName;
    private String color;
    private String vinNumber;
    private double oilNumber;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(vinNumber, car.vinNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vinNumber);
    }

    public Car(int maxSpeed, String brandName, String color, String vinNumber, double oilNumber) {
        this.maxSpeed = maxSpeed;
        this.brandName = brandName;
        this.color = color;
        this.vinNumber = vinNumber;
        this.oilNumber = oilNumber;

    }
}
