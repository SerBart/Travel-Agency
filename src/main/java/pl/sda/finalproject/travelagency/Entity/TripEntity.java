package pl.sda.finalproject.travelagency.Entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

@Setter
@Entity
@Table(name = "TRIPS")
public class TripEntity {



//    @OneToMany
//    private HashSet<HotelsEntity> hotelsEntities;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;



    @Column(name = "standard")
    private Standard standard;
    @Column(name = "begining_date")
    private Date beginingDate;

    private Date endDate;
    @Column(name = "trip_length")
    private int tripLength;
    @Column(name = "trip_cost")
    private int tripCost;
    @Column(name = "country_of_departure")
    private Country countryOfDeparture;
    @Column(name = "city_of_departure")
    private City cityOfDeparture;
    @Column(name = "city_of_arrival")
    private City cityOfArrival;
//    @OneToMany
//    @JoinColumn(name = "hotels_entity_id")
//    @Column(name = "hotels_entity_id")
//    private List<HotelsEntity> hotelsEntity;

    private String uuid;

    public TripEntity setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public String getUuid() {
        return uuid;
    }



    public Standard getStandard() {
        return standard;
    }

    public TripEntity setStandard(Standard standard) {
        this.standard = standard;
        return this;
    }

    public Date getBeginingDate() {
        return beginingDate;
    }

    public TripEntity setBeginingDate(Date beginingDate) {
        this.beginingDate = beginingDate;
        return this;
    }

    public Date getEndDate() {
        return endDate;
    }

    public TripEntity setEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    public int getTripLength() {
        return tripLength;
    }

    public TripEntity setTripLength(int tripLength) {
        this.tripLength = tripLength;
        return this;
    }

    public int getTripCost() {
        return tripCost;
    }

    public TripEntity setTripCost(int tripCost) {
        this.tripCost = tripCost;
        return this;
    }

    public Country getCountryOfDeparture() {
        return countryOfDeparture;
    }

    public TripEntity setCountryOfDeparture(Country countryOfDeparture) {
        this.countryOfDeparture = countryOfDeparture;
        return this;
    }

    public City getCityOfDeparture() {
        return cityOfDeparture;
    }

    public TripEntity setCityOfDeparture(City cityOfDeparture) {
        this.cityOfDeparture = cityOfDeparture;
        return this;
    }

    public City getCityOfArrival() {
        return cityOfArrival;
    }

    public TripEntity setCityOfArrival(City cityOfArrival) {
        this.cityOfArrival = cityOfArrival;
        return this;
    }

//    public List<HotelsEntity> getHotelsEntity() {
//        return hotelsEntity;
//    }
//
//    public TripEntity setHotelsEntity(List<HotelsEntity> hotelsEntity) {
//        this.hotelsEntity = hotelsEntity;
//        return this;
//    }

    public TripEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
