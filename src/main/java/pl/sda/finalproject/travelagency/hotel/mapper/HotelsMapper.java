package pl.sda.finalproject.travelagency.hotel.mapper;

import pl.sda.finalproject.travelagency.hotel.dto.HotelsDto;
import pl.sda.finalproject.travelagency.hotel.entity.HotelsEntity;

import java.util.List;
import java.util.stream.Collectors;

public class HotelsMapper {

    public static HotelsDto map(HotelsEntity hotelsEntity){
        return new HotelsDto()
                .setCountry(hotelsEntity.getCountry())
                .setStandard(hotelsEntity.getStandard())
                .setRooms(hotelsEntity.getRooms())
                .setCapacity(hotelsEntity.getCapacity())
                .setCity(hotelsEntity.getCity())
                .setStandard(hotelsEntity.getStandard())
                .setUuid(hotelsEntity.getUuid());
    }

    public static List<HotelsDto> map(List<HotelsEntity> hotelsEntities){
        return hotelsEntities.stream()
                .map(HotelsMapper::map)
                .collect(Collectors.toList());
    }

}
