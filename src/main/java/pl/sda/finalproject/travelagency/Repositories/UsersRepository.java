package pl.sda.finalproject.travelagency.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import pl.sda.finalproject.travelagency.Entity.UserEntity;

@Repository
public interface UsersRepository extends JpaRepository<UserEntity, Long>, JpaSpecificationExecutor<UserEntity> {
    UserEntity getByUuid(String uuid);
}