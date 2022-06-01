package pl.sda.finalproject.travelagency.Form;

import org.hibernate.annotations.CreationTimestamp;
import pl.sda.finalproject.travelagency.Entity.TripEntity;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TripFormMapper {

    public static TripEntity map(TripForm tripForm) {
        return new TripEntity()
                .setUuid(UUID.randomUUID().toString())
                .setBeginingDate(tripForm.getBeginingDate())
                .setCityOfArrival(tripForm.getCityOfArrival())
                .setCityOfDeparture(tripForm.getCityOfDeparture())
                .setTripCost(tripForm.getTripCost())
                .setTripLength(tripForm.getTripLength())
                .setEndDate(tripForm.getEndDate())
                .setStandard(tripForm.getStandard())
//                .setHotelsEntity(tripForm.getHotelsEntity())
                .setCountryOfDeparture(tripForm.getCountryOfDeparture());

    }
    public static List<TripEntity> mapToEntityList(List<TripForm> tripForms){
        return tripForms
                .stream()
                .map(TripFormMapper::map)
                .collect(Collectors.toList());
    }
}
