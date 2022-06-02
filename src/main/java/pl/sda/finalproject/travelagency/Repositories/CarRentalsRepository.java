package pl.sda.finalproject.travelagency.Repositories;

import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.sda.finalproject.travelagency.Entity.CarRentalEntity;
import pl.sda.finalproject.travelagency.Entity.HotelsEntity;
import pl.sda.finalproject.travelagency.Entity.TripEntity;

import javax.persistence.EntityManager;
import java.util.Optional;


@Repository


public interface CarRentalsRepository extends JpaRepository<CarRentalEntity, Long>, JpaSpecificationExecutor<CarRentalEntity> {

}
