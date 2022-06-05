package pl.sda.finalproject.travelagency.trip.service;

import lombok.Builder;
import lombok.Value;
import org.springframework.web.bind.annotation.ModelAttribute;
import pl.sda.finalproject.travelagency.Entity.CityOfArrival;
import pl.sda.finalproject.travelagency.Entity.CityOfDeparture;
import pl.sda.finalproject.travelagency.Entity.Country;
import pl.sda.finalproject.travelagency.Entity.Standard;

import java.util.Date;

@Value
@Builder
public class TripSearchCriteria {

    CityOfDeparture cityOfDeparture;
    CityOfArrival cityOfArrival;
    Date endDate;
    Date beginingDate;
    Country countryOfArrival;
    Standard standard;
    int tripLength;

}
