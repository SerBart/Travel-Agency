package pl.sda.finalproject.travelagency.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import pl.sda.finalproject.travelagency.Entity.CarRentalEntity;


@Repository


public interface CarRentalsRepository extends JpaRepository<CarRentalEntity, Long>, JpaSpecificationExecutor<CarRentalEntity> {

}
