package pl.sda.finalproject.travelagency.Repositories;

import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.sda.finalproject.travelagency.Entity.HotelsEntity;

import javax.persistence.EntityManager;
import java.util.Optional;


@RequiredArgsConstructor
@Repository
@Transactional
public class HotelsRepository {

    private EntityManager entityManager;
    Optional<HotelsEntity> findById(Integer id) {
        var result = entityManager.find(HotelsEntity.class, id);
        return Optional.ofNullable(result);
    }
}

