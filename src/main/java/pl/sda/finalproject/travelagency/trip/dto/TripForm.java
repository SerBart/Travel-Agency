package pl.sda.finalproject.travelagency.trip.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;
import pl.sda.finalproject.travelagency.Entity.*;
import pl.sda.finalproject.travelagency.hotel.entity.HotelsEntity;

import java.time.LocalDate;
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
    private LocalDate beginingDate;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate endDate;

    private String shortDescription;

    private String longDescription;

    private int tripCost;

    private boolean prom;

    private Country countryOfArrival;

    private CityOfDeparture cityOfDeparture;

    private CityOfArrival cityOfArrival;

    private List<HotelsEntity> hotelsEntity;

    private Long tripLength;

    private Continent continent;

    public boolean isNew() {
        return uuid == null || uuid.isBlank();
    }

    public boolean isProm() {
        return prom;
    }
}
