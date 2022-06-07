//package pl.sda.finalproject.travelagency.hotel.service;
//
//import groovy.transform.AutoClone;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import pl.sda.finalproject.travelagency.Entity.CityOfArrival;
//import pl.sda.finalproject.travelagency.Entity.CityOfDeparture;
//import pl.sda.finalproject.travelagency.hotel.dto.HotelsDto;
//import pl.sda.finalproject.travelagency.hotel.entity.HotelsEntity;
//import pl.sda.finalproject.travelagency.hotel.mapper.HotelsMapper;
//import pl.sda.finalproject.travelagency.hotel.repositories.HotelsRepository;
//import pl.sda.finalproject.travelagency.trip.dto.TripDto;
//
//import java.util.List;
//
//@Service
//public class HotelsService {
//
//    @Autowired
//    HotelsRepository hotelsRepository;
//    public List<HotelsDto> getAllByCity(CityOfArrival cityOfArrival){
//        List<HotelsEntity> hotelsDtoList = hotelsRepository.findAllByCityOfArrival(cityOfArrival);
//        return HotelsMapper.map(hotelsDtoList);
//    }
//}
