package org.malintha.example.mapstruct.ex1;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarMapper {
    CarMapper INSTANCE = Mappers.getMapper( CarMapper.class );

    CarDTO carToCarDto(Car car);
}
