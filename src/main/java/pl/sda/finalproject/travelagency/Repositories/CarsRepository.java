package pl.sda.finalproject.travelagency.Repositories;

import org.hibernate.Session;
import org.hibernate.Transaction;
import pl.sda.finalproject.travelagency.Entity.CarEntity;


import java.util.Optional;

public class CarsRepository {
    Optional<CarEntity> findById(Integer id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        var result = session.get(CarEntity.class, id);
        transaction.commit();
        session.close();
        return Optional.ofNullable(result);
    }
}

