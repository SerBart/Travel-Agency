package pl.sda.finalproject.travelagency.trip.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;
import pl.sda.finalproject.travelagency.Entity.CityOfArrival;
import pl.sda.finalproject.travelagency.Entity.CityOfDeparture;
import pl.sda.finalproject.travelagency.Entity.Country;
import pl.sda.finalproject.travelagency.hotel.entity.HotelsEntity;
import pl.sda.finalproject.travelagency.Entity.Standard;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@RequiredArgsConstructor
@Accessors(fluent = false, chain = true)
public class TripForm {


    private String uuid;

    private Standard standard;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date beginingDate;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date endDate;

    private String shortDescription;

    private String longDescription;

    private int tripCost;

    private Country countryOfArrival;

    private CityOfDeparture cityOfDeparture;

    private CityOfArrival cityOfArrival;

    private List<HotelsEntity> hotelsEntity;

    public boolean isNew() {
        return uuid == null || uuid.isBlank();
    }


}
