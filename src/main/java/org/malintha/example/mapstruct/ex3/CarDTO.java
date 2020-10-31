package org.malintha.example.mapstruct.ex3;

import java.util.ArrayList;
import java.util.List;

public class CarDTO {

    private String yearOfMake;
    private int seatCount;
    private String type;
    private List<String> passengersInCar = new ArrayList<>();

    public List<String> getPassengersInCar() {
        return passengersInCar;
    }

    public void setPassengersInCar(List<String> passengersInCar) {
        this.passengersInCar = passengersInCar;
    }

    public String getYearOfMake() {
        return yearOfMake;
    }

    public void setYearOfMake(String yearOfMake) {
        this.yearOfMake = yearOfMake;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "CarDto{" +
                "make='" + yearOfMake + '\'' +
                ", seatCount=" + seatCount +
                ", type='" + type + '\'' +
                ", passengersInCar=" + passengersInCar +
                '}';
    }
}
