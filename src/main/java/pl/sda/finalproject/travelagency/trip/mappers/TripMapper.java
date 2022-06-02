package pl.sda.finalproject.travelagency.trip.mappers;

import pl.sda.finalproject.travelagency.trip.dto.TripDto;
import pl.sda.finalproject.travelagency.trip.entity.TripEntity;

import java.util.List;
import java.util.stream.Collectors;

public class TripMapper {

    public static TripDto map(TripEntity tripEntity) {
return new TripDto()
        .setShortDescription(tripEntity.getShortDescription())
        .setUuid(tripEntity.getUuid())
        .setCountryOfDeparture(tripEntity.getCountryOfDeparture())
        .setBeginingDate(tripEntity.getBeginingDate())
        .setTripCost(tripEntity.getTripCost())
        .setStandard(tripEntity.getStandard())
        .setEndDate(tripEntity.getEndDate())
        .setTripLength(tripEntity.getTripLength())
        .setCityOfArrival(tripEntity.getCityOfArrival())
        .setCityOfDeparture(tripEntity.getCityOfDeparture());
    }

    public static List<TripDto> map(List<TripEntity> tripEntities){
        return tripEntities
                .stream()
                .map(TripMapper::map)
                .collect(Collectors.toList());
    }
}
