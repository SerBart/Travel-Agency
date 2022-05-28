package pl.sda.finalproject.travelagency.Repositories;

import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.sda.finalproject.travelagency.Entity.UserEntity;

import javax.persistence.EntityManager;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
@Transactional
public class UsersRepository {
    private EntityManager entityManager;

    public Optional<UserEntity> findById(Integer id) {
        var result = entityManager.find(UserEntity.class, id);
        return Optional.ofNullable(result);
    }
}