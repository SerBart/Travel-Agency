package pl.sda.finalproject.travelagency.trip.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import pl.sda.finalproject.travelagency.Entity.City;
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

    public List<TripDto> findByCityOfDeparture(City city){
        List<TripEntity> tripEntities = tripRepository.getAllByCityOfDeparture(city);
        return TripMapper.map(tripEntities);
    }

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
                .setCountryOfDeparture(tripForm.getCountryOfDeparture())
                .setCityOfArrival(tripForm.getCityOfArrival())
                .setCityOfDeparture(tripForm.getCityOfDeparture());

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
