package pl.sda.finalproject.travelagency.Repositories;

import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.sda.finalproject.travelagency.Entity.CarEntity;

import javax.persistence.EntityManager;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
@Transactional
public class CarsRepository {

    private EntityManager entityManager;
    Optional<CarEntity> findById(int id) {
        var result = entityManager.find(CarEntity.class, id);
        return Optional.ofNullable(result);
    }
}

