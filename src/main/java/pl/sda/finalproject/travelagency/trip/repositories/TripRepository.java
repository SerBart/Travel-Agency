package pl.sda.finalproject.travelagency.trip.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import org.springframework.stereotype.Repository;
import pl.sda.finalproject.travelagency.Entity.CityOfArrival;
import pl.sda.finalproject.travelagency.Entity.CityOfDeparture;
import pl.sda.finalproject.travelagency.Entity.Country;
import pl.sda.finalproject.travelagency.trip.entity.TripEntity;

import java.util.List;


@Repository
public interface TripRepository extends JpaRepository<TripEntity, Long>, JpaSpecificationExecutor<TripEntity> {
    TripEntity getByUuid(String uuid);
    List<TripEntity> getAllByCityOfDeparture(CityOfDeparture cityOfDeparture);
    List<TripEntity> getAllByCountryOfArrival(Country countryOfArrival);

    List<TripEntity> getAllByCityOfArrival(CityOfArrival cityOfArrival);
//    List<TripEntity> getAllByCityOfArrival(CityOfDeparture cityOfDepartureOfArrival);
}

