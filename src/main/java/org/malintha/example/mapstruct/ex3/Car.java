package org.malintha.example.mapstruct.ex3;

import java.util.List;

public class Car {
    private String make;
    private int seatCount;
    private String carType;
    private List<Passenger> passengers;

    public Car(String make, int seatCount, String type, List<Passenger> passengers) {
        this.make = make;
        this.seatCount = seatCount;
        this.carType = type;
        this.passengers = passengers;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }
}
