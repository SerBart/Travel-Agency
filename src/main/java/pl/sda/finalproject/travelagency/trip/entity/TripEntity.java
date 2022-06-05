package pl.sda.finalproject.travelagency.trip.entity;

import lombok.Getter;
import lombok.experimental.Accessors;
import org.hibernate.annotations.Formula;
import org.springframework.format.annotation.DateTimeFormat;
import pl.sda.finalproject.travelagency.Entity.CityOfArrival;
import pl.sda.finalproject.travelagency.Entity.CityOfDeparture;
import pl.sda.finalproject.travelagency.Entity.Country;
import pl.sda.finalproject.travelagency.Entity.Standard;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.concurrent.TimeUnit;

@Getter

@Entity
@Table(name = "TRIPS")
@Accessors(fluent = false, chain = true)
public class TripEntity {



//    @OneToMany
//    private HashSet<HotelsEntity> hotelsEntities;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @SequenceGenerator(name = "book_id_seq", sequenceName = "book_id_seq")
    private Long id;

    @Column(name = "standard")
    private Standard standard;

    @Formula("DateDiff('day', BEGINING_DATE,  END_DATE)")
    private int tripLength;



    private String longDescription;

    @Column(name = "begining_date")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate beginingDate;

    private String shortDescription;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate endDate;

    @Column(name = "trip_cost")
    private int tripCost;
    @Column(name = "country_of_departure")
    private Country countryOfArrival;
    @Column(name = "city_of_departure")
    private CityOfDeparture cityOfDeparture;
    @Column(name = "city_of_arrival")
    private CityOfArrival cityOfArrival;




//    public long getTripLength() {
//        return TimeUnit.DAYS.convert(
//                Math.abs(getEndDate().getTime()- getBeginingDate().getTime()), TimeUnit.MILLISECONDS) + 1;
//    }






    private String uuid;

    public TripEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public TripEntity setStandard(Standard standard) {
        this.standard = standard;
        return this;
    }

    public TripEntity setLongDescription(String longDescription) {
        this.longDescription = longDescription;
        return this;
    }

    public TripEntity setBeginingDate(LocalDate beginingDate) {
        this.beginingDate = beginingDate;
        return this;
    }

    public TripEntity setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
        return this;
    }

    public TripEntity setEndDate(LocalDate endDate) {
        this.endDate = endDate;
        return this;
    }

    public TripEntity setTripCost(int tripCost) {
        this.tripCost = tripCost;
        return this;
    }

    public TripEntity setCountryOfArrival(Country countryOfArrival) {
        this.countryOfArrival = countryOfArrival;
        return this;
    }

    public TripEntity setCityOfDeparture(CityOfDeparture cityOfDeparture) {
        this.cityOfDeparture = cityOfDeparture;
        return this;
    }

    public TripEntity setCityOfArrival(CityOfArrival cityOfArrival) {
        this.cityOfArrival = cityOfArrival;
        return this;
    }



    public TripEntity setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
//    @OneToMany
//    @JoinColumn(name = "hotels_entity_id")
//    @Column(name = "hotels_entity_id")
//    private List<HotelsEntity> hotelsEntity;




}
