package pl.sda.finalproject.travelagency.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.sda.finalproject.travelagency.Entity.TripEntity;



@Repository
public interface TripRepository extends JpaRepository<TripEntity, Long>, JpaSpecificationExecutor<TripEntity> {
    TripEntity getByUuid(String uuid);
//    TripEntity getByUuid(String uuid);

}

