package pl.sda.finalproject.travelagency.trip.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.hibernate.annotations.Formula;
import org.springframework.format.annotation.DateTimeFormat;
import pl.sda.finalproject.travelagency.Entity.*;
import pl.sda.finalproject.travelagency.hotel.entity.HotelsEntity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

@Getter
@Setter

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


    @Column(name = "prom")
    private boolean prom;

    private String longDescription;

    @Column(name = "begining_date")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate beginingDate;

    private String shortDescription;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate endDate;

    private String uuid;


    @ManyToMany
    @Column(name = "hotels")
    private Set<HotelsEntity> hotelsEntitySet;

    @Column(name = "trip_cost")
    private int tripCost;
    @Column(name = "country_of_departure")
    private Country countryOfArrival;
    @Column(name = "city_of_departure")
    private CityOfDeparture cityOfDeparture;
    @Column(name = "city_of_arrival")
    private CityOfArrival cityOfArrival;
    @Column(name = "CONTINENT")
    private Continent continent;

}
