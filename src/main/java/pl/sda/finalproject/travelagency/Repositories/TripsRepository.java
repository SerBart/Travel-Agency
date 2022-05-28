package pl.sda.finalproject.travelagency.Repositories;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.sda.finalproject.travelagency.Entity.Standard;
import pl.sda.finalproject.travelagency.Entity.TripEntity;
import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
@RequiredArgsConstructor

public class TripsRepository {
    private final EntityManager entityManager;

    public Optional<TripEntity> findById(int id) {
        var result = entityManager.find(TripEntity.class, id);
        return Optional.ofNullable(result);
    }


    public List<TripEntity> findByHotelStandard(Standard standard) {
        String query = "select t from TripEntity t where t.standard = :standard";
        List<TripEntity> trips = entityManager.createQuery(query, TripEntity.class)
                .setParameter("standard", standard)
                .getResultList();
        return trips;
    }
}

