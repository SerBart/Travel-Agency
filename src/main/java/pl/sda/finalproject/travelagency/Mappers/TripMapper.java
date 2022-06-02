package pl.sda.finalproject.travelagency.Mappers;

import pl.sda.finalproject.travelagency.Dto.TripDto;
import pl.sda.finalproject.travelagency.Entity.TripEntity;

import java.util.List;
import java.util.stream.Collectors;

public class TripMapper {

    public static TripDto map(TripEntity tripEntity) {
return new TripDto()
        .setCountryOfDeparture(tripEntity.getCountryOfDeparture())
        .setBeginingDate(tripEntity.getBeginingDate())
        .setTripCost(tripEntity.getTripCost())
        .setStandard(tripEntity.getStandard())
        .setEndDate(tripEntity.getEndDate())
        .setTripLength(tripEntity.getTripLength())
        .setCityOfArrival(tripEntity.getCityOfArrival())
        .setUuid(tripEntity.getUuid())
        .setCityOfDeparture(tripEntity.getCityOfDeparture());
    }

    public static List<TripDto> map(List<TripEntity> tripEntities){
        return tripEntities
                .stream()
                .map(TripMapper::map)
                .collect(Collectors.toList());
    }
}
