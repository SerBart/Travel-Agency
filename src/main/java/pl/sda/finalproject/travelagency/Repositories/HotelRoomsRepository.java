package pl.sda.finalproject.travelagency.Repositories;

import ch.qos.logback.classic.util.LogbackMDCAdapter;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.sda.finalproject.travelagency.Entity.HotelRoomEntity;


import javax.persistence.EntityManager;
import java.util.Optional;

@Repository
@Transactional
@RequiredArgsConstructor
public class HotelRoomsRepository {
    private EntityManager entityManager;
    Optional<HotelRoomEntity> findById(Integer id) {
        var result = entityManager.find(HotelRoomEntity.class, id);
        return Optional.ofNullable(result);
    }
}

