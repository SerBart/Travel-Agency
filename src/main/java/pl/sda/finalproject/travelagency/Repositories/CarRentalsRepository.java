package pl.sda.finalproject.travelagency.Repositories;

import org.hibernate.Session;
import org.hibernate.Transaction;
import pl.sda.finalproject.travelagency.Entity.CarRentalEntity;


import java.util.Optional;

public class CarRentalsRepository {
    Optional<CarRentalEntity> findById(Integer id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        var result = session.get(CarRentalEntity.class, id);
        transaction.commit();
        session.close();
        return Optional.ofNullable(result);
    }
}
