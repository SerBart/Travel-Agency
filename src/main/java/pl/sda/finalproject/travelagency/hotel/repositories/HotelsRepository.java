//package pl.sda.finalproject.travelagency.hotel.repositories;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
//import org.springframework.stereotype.Repository;
//import pl.sda.finalproject.travelagency.Entity.CityOfArrival;
//import pl.sda.finalproject.travelagency.Entity.CityOfDeparture;
//import pl.sda.finalproject.travelagency.Entity.Country;
//import pl.sda.finalproject.travelagency.Entity.Standard;
//import pl.sda.finalproject.travelagency.hotel.entity.HotelsEntity;
//import pl.sda.finalproject.travelagency.trip.entity.TripEntity;
//
//import java.util.List;
//
//@Repository
//public interface HotelsRepository extends JpaRepository<HotelsEntity, Long>, JpaSpecificationExecutor<HotelsEntity> {
//    List<HotelsEntity> findAllByCityOfArrival(CityOfArrival cityOfArrival);
//}
