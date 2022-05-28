package pl.sda.finalproject.travelagency.Repositories;

import org.hibernate.Session;
import org.hibernate.Transaction;
import pl.sda.finalproject.travelagency.Entity.TripEntity;


import java.util.Optional;

public class TripsRepository {
    Optional<TripEntity> findById(Integer id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        var result = session.get(TripEntity.class, id);
        transaction.commit();
        session.close();
        return Optional.ofNullable(result);
    }
}

