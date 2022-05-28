package pl.sda.finalproject.travelagency.Repositories;

import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.sda.finalproject.travelagency.Entity.CarRentalEntity;

import javax.persistence.EntityManager;
import java.util.Optional;


@Repository
@Transactional
@RequiredArgsConstructor
public class CarRentalsRepository {
    private EntityManager entityManager;
    Optional<CarRentalEntity> findById(int id) {
        var result = entityManager.find(CarRentalEntity.class, id);
        return Optional.ofNullable(result);
    }
}
