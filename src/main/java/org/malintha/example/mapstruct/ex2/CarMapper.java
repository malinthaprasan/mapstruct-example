package org.malintha.example.mapstruct.ex2;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarMapper {
    CarMapper INSTANCE = Mappers.getMapper( CarMapper.class );

    @Mapping(source = "make", target = "yearOfMake")
    CarDTO carToCarDto(Car car);
}
