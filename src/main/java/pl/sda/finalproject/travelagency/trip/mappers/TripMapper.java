package pl.sda.finalproject.travelagency.trip.mappers;

import org.springframework.data.domain.Page;
import pl.sda.finalproject.travelagency.trip.dto.TripDto;
import pl.sda.finalproject.travelagency.trip.entity.TripEntity;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class TripMapper {

    public static TripDto map(TripEntity tripEntity) {
return new TripDto()
        .setProm(tripEntity.isProm())
        .setShortDescription(tripEntity.getShortDescription())
        .setLongDescription(tripEntity.getLongDescription())
        .setUuid(tripEntity.getUuid())
        .setCountryOfArrival(tripEntity.getCountryOfArrival())
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
