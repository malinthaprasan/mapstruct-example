package org.malintha.example.mapstruct.ex3;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarMapper {
    CarMapper INSTANCE = Mappers.getMapper( CarMapper.class );

    @Mapping(source = "make", target = "yearOfMake")
    @Mapping(source = "passengers", target = "passengersInCar")
    CarDTO carToCarDto(Car car);

    default String passengerToString(Passenger passenger) {
        return passenger.getName();
    }
}
