package pl.sda.finalproject.travelagency.trip.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import pl.sda.finalproject.travelagency.Entity.CityOfArrival;
import pl.sda.finalproject.travelagency.Entity.CityOfDeparture;
import pl.sda.finalproject.travelagency.Entity.Country;
import pl.sda.finalproject.travelagency.hotel.entity.HotelsEntity;
import pl.sda.finalproject.travelagency.Entity.Standard;

import javax.xml.bind.annotation.XmlRootElement;
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

    private Date beginingDate;


    private Date endDate;

    private int tripLength;

    private int tripCost;

    private Country countryOfArrival;

    private CityOfDeparture cityOfDeparture;

    private CityOfArrival cityOfArrival;

    private List<HotelsEntity> hotelsEntity;


}
