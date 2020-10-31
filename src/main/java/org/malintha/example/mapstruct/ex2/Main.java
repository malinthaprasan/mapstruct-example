package org.malintha.example.mapstruct.ex2;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("2004", 4, "sedan");
        CarDTO dto = CarMapper.INSTANCE.carToCarDto(car);
        System.out.println(dto);
    }
}
