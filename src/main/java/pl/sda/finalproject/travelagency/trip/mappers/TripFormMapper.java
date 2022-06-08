package pl.sda.finalproject.travelagency.trip.mappers;

import pl.sda.finalproject.travelagency.trip.dto.TripForm;
import pl.sda.finalproject.travelagency.trip.entity.TripEntity;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class TripFormMapper {

    public static TripEntity map(TripForm tripForm) {
        return new TripEntity()
                .setContinent(tripForm.getContinent())
                .setProm(tripForm.isProm())
                .setShortDescription(tripForm.getShortDescription())
                .setLongDescription(tripForm.getLongDescription())
                .setUuid(UUID.randomUUID().toString())
                .setBeginingDate(tripForm.getBeginingDate())
                .setCityOfArrival(tripForm.getCityOfArrival())
                .setCityOfDeparture(tripForm.getCityOfDeparture())
                .setTripCost(tripForm.getTripCost())
                .setEndDate(tripForm.getEndDate())
                .setStandard(tripForm.getStandard())

                .setCountryOfArrival(tripForm.getCountryOfArrival());
    }
    public static List<TripEntity> mapToEntityList(List<TripForm> tripForms){
        return tripForms
                .stream()
                .map(TripFormMapper::map)
                .collect(Collectors.toList());
    }
}
