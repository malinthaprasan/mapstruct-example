package org.malintha.example.mapstruct.ex3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Passenger> passengers = new ArrayList<>();
        passengers.add(new Passenger(45, "john"));
        passengers.add(new Passenger(23, "henry"));
        Car car = new Car("2004", 4, "sedan", passengers);
        CarDTO dto = CarMapper.INSTANCE.carToCarDto(car);
        System.out.println(dto);
    }
}
