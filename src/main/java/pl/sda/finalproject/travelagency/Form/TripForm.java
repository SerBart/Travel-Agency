package pl.sda.finalproject.travelagency.Form;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import pl.sda.finalproject.travelagency.Entity.City;
import pl.sda.finalproject.travelagency.Entity.Country;
import pl.sda.finalproject.travelagency.Entity.HotelsEntity;
import pl.sda.finalproject.travelagency.Entity.Standard;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@RequiredArgsConstructor
public class TripForm {


    private String uuid;

    private Standard standard;

    private Date beginingDate;

    private Date endDate;

    private int tripLength;

    private int tripCost;

    private Country countryOfDeparture;

    private City cityOfDeparture;

    private City cityOfArrival;

    private List<HotelsEntity> hotelsEntity;

    public String getUuid() {
        return uuid;
    }
    public boolean isNew() {
        return uuid == null || uuid.isBlank();
    }

    public TripForm setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public Standard getStandard() {
        return standard;
    }

    public TripForm setStandard(Standard standard) {
        this.standard = standard;
        return this;
    }

    public Date getBeginingDate() {
        return beginingDate;
    }

    public TripForm setBeginingDate(Date beginingDate) {
        this.beginingDate = beginingDate;
        return this;
    }

    public Date getEndDate() {
        return endDate;
    }

    public TripForm setEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    public int getTripLength() {
        return tripLength;
    }

    public TripForm setTripLength(int tripLength) {
        this.tripLength = tripLength;
        return this;
    }

    public int getTripCost() {
        return tripCost;
    }

    public TripForm setTripCost(int tripCost) {
        this.tripCost = tripCost;
        return this;
    }

    public Country getCountryOfDeparture() {
        return countryOfDeparture;
    }

    public TripForm setCountryOfDeparture(Country countryOfDeparture) {
        this.countryOfDeparture = countryOfDeparture;
        return this;
    }

    public City getCityOfDeparture() {
        return cityOfDeparture;
    }

    public TripForm setCityOfDeparture(City cityOfDeparture) {
        this.cityOfDeparture = cityOfDeparture;
        return this;
    }

    public City getCityOfArrival() {
        return cityOfArrival;
    }

    public TripForm setCityOfArrival(City cityOfArrival) {
        this.cityOfArrival = cityOfArrival;
        return this;
    }

    public List<HotelsEntity> getHotelsEntity() {
        return hotelsEntity;
    }

    public TripForm setHotelsEntity(List<HotelsEntity> hotelsEntity) {
        this.hotelsEntity = hotelsEntity;
        return this;
    }


}
