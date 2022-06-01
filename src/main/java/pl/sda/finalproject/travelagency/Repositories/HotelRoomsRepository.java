package pl.sda.finalproject.travelagency.Repositories;

import ch.qos.logback.classic.util.LogbackMDCAdapter;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.sda.finalproject.travelagency.Entity.HotelRoomEntity;
import pl.sda.finalproject.travelagency.Entity.HotelsEntity;
import pl.sda.finalproject.travelagency.Entity.TripEntity;


import javax.persistence.EntityManager;
import java.util.Optional;

@Repository
public interface HotelRoomsRepository extends JpaRepository<HotelRoomEntity, Long>, JpaSpecificationExecutor<HotelRoomEntity> {

}

