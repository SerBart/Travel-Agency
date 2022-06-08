package pl.sda.finalproject.travelagency.trip.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import pl.sda.finalproject.travelagency.Entity.*;
import pl.sda.finalproject.travelagency.hotel.entity.HotelsEntity;

import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@RequiredArgsConstructor
@XmlRootElement(name = "templates/trip")
@Getter
@Setter
@ToString
@Accessors(fluent = false, chain = true)
public class TripDto {

    private String uuid;

    private String longDescription;

    private String shortDescription;

    private Standard standard;

    private LocalDate beginingDate;

    private boolean prom;

    private LocalDate endDate;

    private long tripLength;

    private int tripCost;

    private Country countryOfArrival;

    private CityOfDeparture cityOfDeparture;

    private CityOfArrival cityOfArrival;

    private List<HotelsEntity> hotelsEntity;

    private Continent continent;

    public boolean isProm() {
        return prom;
    }

}
