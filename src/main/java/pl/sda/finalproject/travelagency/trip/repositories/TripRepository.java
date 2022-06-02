package pl.sda.finalproject.travelagency.trip.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import org.springframework.stereotype.Repository;
import pl.sda.finalproject.travelagency.Entity.City;
import pl.sda.finalproject.travelagency.trip.entity.TripEntity;

import java.util.List;


@Repository
public interface TripRepository extends JpaRepository<TripEntity, Long>, JpaSpecificationExecutor<TripEntity> {
    TripEntity getByUuid(String uuid);
    List<TripEntity> getAllByCityOfDeparture(City cityOfDeparture);

}

