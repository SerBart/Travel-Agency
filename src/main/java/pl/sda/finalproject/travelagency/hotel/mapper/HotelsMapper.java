package pl.sda.finalproject.travelagency.hotel.mapper;

import pl.sda.finalproject.travelagency.hotel.dto.HotelsDto;
import pl.sda.finalproject.travelagency.hotel.entity.HotelsEntity;

import java.util.List;
import java.util.stream.Collectors;

public class HotelsMapper {

    public static HotelsEntity map(HotelsDto hotelsDto){
        return new HotelsEntity()
                .setCountry(hotelsDto.getCountry())
                .setStandard(hotelsDto.getStandard())
                .setRooms(hotelsDto.getRooms())
                .setCapacity(hotelsDto.getCapacity())
                .setAdress(hotelsDto.getAdress())
                .setCity(hotelsDto.getCity())
                .setHotelStandard(hotelsDto.getStandard())
                .setUuid(hotelsDto.getUuid());
    }

    public static List<HotelsEntity> map(List<HotelsDto> hotelsDtoList){
        return hotelsDtoList.stream()
                .map(HotelsMapper::map)
                .collect(Collectors.toList());
    }

}
