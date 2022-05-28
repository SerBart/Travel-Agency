package pl.sda.finalproject.travelagency.Mappers;

import pl.sda.finalproject.travelagency.Dto.CarDto;
import pl.sda.finalproject.travelagency.Entity.CarEntity;

import java.util.List;
import java.util.stream.Collectors;

public class CarMapper {

    public static CarDto map(CarEntity carEntity){
        return new CarDto()
                .setBrand(carEntity.getBrand())
                .setModel(carEntity.getModel())
                .setPower(carEntity.getPower())
                .setHowManyPeople(carEntity.getHowManyPeople())
                .setYearOfProduction(carEntity.getYearOfProduction());
    }

    public static List<CarDto> map(List<CarEntity> carEntityList){
        return carEntityList.stream()
                .map(CarMapper::map)
                .collect(Collectors.toList());
    }
}
