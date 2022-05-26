package pl.sda.finalproject.travelagency.Repositories;

import org.hibernate.Session;
import org.hibernate.Transaction;
import pl.sda.finalproject.travelagency.Entity.HotelRoomEntity;


import java.util.Optional;

public class HotelRoomsRepository {
    Optional<HotelRoomEntity> findById(Integer id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        var result = session.get(HotelRoomEntity.class, id);
        transaction.commit();
        session.close();
        return Optional.ofNullable(result);
    }
}

