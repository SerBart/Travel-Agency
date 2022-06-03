package pl.sda.finalproject.travelagency.trip.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import pl.sda.finalproject.travelagency.Entity.CityOfArrival;
import pl.sda.finalproject.travelagency.Entity.CityOfDeparture;
import pl.sda.finalproject.travelagency.Entity.Country;
import pl.sda.finalproject.travelagency.trip.dto.TripDto;
import pl.sda.finalproject.travelagency.trip.entity.TripEntity;
import pl.sda.finalproject.travelagency.trip.dto.TripForm;
import pl.sda.finalproject.travelagency.trip.mappers.TripFormMapper;
import pl.sda.finalproject.travelagency.trip.mappers.TripMapper;
import pl.sda.finalproject.travelagency.hotel.repositories.HotelsRepository;
import pl.sda.finalproject.travelagency.trip.repositories.TripRepository;

import java.util.List;

@Service
public class TripService {

    @Autowired
    public TripRepository tripRepository;

    @Autowired
    public HotelsRepository hotelsRepository;


    @Cacheable
    public List<TripDto> findAll() {
        List<TripEntity> tripEntities = tripRepository.findAll();
        return TripMapper.map(tripEntities);
    }

    public List<TripDto> findByCityOfDeparture(CityOfDeparture cityOfDeparture){
        List<TripEntity> tripEntities = tripRepository.getAllByCityOfDeparture(cityOfDeparture);
        return TripMapper.map(tripEntities);
    }

    public List<TripDto> findByCityOfArrival(CityOfArrival cityOfArrival){
        List<TripEntity> tripEntities = tripRepository.getAllByCityOfArrival(cityOfArrival);
        return TripMapper.map(tripEntities);
    }
    public List<TripDto> findByCountryOfArrival(Country country){
        List<TripEntity> tripEntities = tripRepository.getAllByCountryOfArrival(country);
        return TripMapper.map(tripEntities);
    }
//    public List<TripDto> findByCityOfArrival(CityOfDeparture cityOfDeparture){
//        List<TripEntity> tripEntities = tripRepository.getAllByCityOfArrival(cityOfDeparture);
//        return TripMapper.map(tripEntities);
//    }

    public TripDto getByUuid(String uuid){
        TripEntity trip = tripRepository.getByUuid(uuid);
        return TripMapper.map(trip);
    }


    public TripDto create(TripForm tripForm){
        TripEntity tripEntity = TripFormMapper.map(tripForm);
        TripEntity tripUpdate = tripRepository.saveAndFlush(tripEntity);
        return TripMapper.map(tripUpdate);
    }

    public TripDto update(String uuid, TripForm tripForm) {
        TripEntity trip = tripRepository.getByUuid(uuid)
                .setTripCost(tripForm.getTripCost())
                .setBeginingDate(tripForm.getBeginingDate())
                .setEndDate(tripForm.getEndDate())
                .setStandard(tripForm.getStandard())
                .setCountryOfArrival(tripForm.getCountryOfArrival())
                .setCityOfArrival(tripForm.getCityOfArrival())
                .setCityOfDeparture(tripForm.getCityOfDeparture())
                .setStandard(tripForm.getStandard())
                .setLongDescription(tripForm.getLongDescription())
                .setShortDescription(tripForm.getShortDescription());

//                .setHotelsEntity(tripForm.getHotelsEntity());

        TripEntity tripUpdated = tripRepository.saveAndFlush(trip);
        return TripMapper.map(tripUpdated);
    }
    public void createOrUpdate(TripForm tripForm) {
        if (tripForm.isNew()) {
            create(tripForm);
        } else {
            update(tripForm.getUuid(), tripForm);
        }
    }
    public void delete(String uuid) {
        TripEntity entity = tripRepository.getByUuid(uuid);
        tripRepository.delete(entity);
    }




//   private TripEntity buyTrip(int tripId, int hotelId, HotelRoomEntity roomInfo){
//       TripEntity tripEntity = tripsRepository.findById(tripId).get();
//       TODO
//   }
}
