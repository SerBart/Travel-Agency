package pl.sda.finalproject.travelagency.Repositories;

import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.sda.finalproject.travelagency.Entity.AdminEntity;
import pl.sda.finalproject.travelagency.Entity.HotelsEntity;
import pl.sda.finalproject.travelagency.Entity.TripEntity;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;
@Repository

public interface AdminRepository extends JpaRepository<AdminEntity, Long>, JpaSpecificationExecutor<AdminEntity> {

}
