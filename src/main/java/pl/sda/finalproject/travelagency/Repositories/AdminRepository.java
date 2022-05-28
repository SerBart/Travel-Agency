package pl.sda.finalproject.travelagency.Repositories;

import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.sda.finalproject.travelagency.Entity.AdminEntity;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;
@RequiredArgsConstructor
@Repository
@Transactional
public class AdminRepository {

    private EntityManager entityManager;
    Optional<AdminEntity> findById(Integer id) {
        var result = entityManager.find(AdminEntity.class, id);
        return Optional.ofNullable(result);
    }

}
