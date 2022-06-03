package pl.sda.finalproject.travelagency.trip.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;
import pl.sda.finalproject.travelagency.Entity.CityOfArrival;
import pl.sda.finalproject.travelagency.Entity.CityOfDeparture;
import pl.sda.finalproject.travelagency.Entity.Country;
import pl.sda.finalproject.travelagency.Entity.Standard;

import javax.persistence.*;
import java.util.Date;

@Setter
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

    private String longDescription;

    @Column(name = "begining_date")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date beginingDate;

    private String shortDescription;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date endDate;
    @Column(name = "trip_length")
    private int tripLength;
    @Column(name = "trip_cost")
    private int tripCost;
    @Column(name = "country_of_departure")
    private Country countryOfArrival;
    @Column(name = "city_of_departure")
    private CityOfDeparture cityOfDeparture;
    @Column(name = "city_of_arrival")
    private CityOfArrival cityOfArrival;

    private String uuid;
//    @OneToMany
//    @JoinColumn(name = "hotels_entity_id")
//    @Column(name = "hotels_entity_id")
//    private List<HotelsEntity> hotelsEntity;




}
