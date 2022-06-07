package pl.sda.finalproject.travelagency.hotel.mapper;
import pl.sda.finalproject.travelagency.hotel.dto.HotelsForm;
import pl.sda.finalproject.travelagency.hotel.entity.HotelsEntity;


import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class HotelsFormMapper {

    public static HotelsEntity map(HotelsForm hotelsForm){
        return new HotelsEntity()

                .setStandard(hotelsForm.getStandard())
                .setCapacity(hotelsForm.getCapacity())
                .setCity(hotelsForm.getCity())
                .setRooms(hotelsForm.getRooms())
                .setCountry(hotelsForm.getCountry())
                .setUuid(UUID.randomUUID().toString());

    }
    public static List<HotelsEntity> map(List<HotelsForm> hotelsFormList){
        return hotelsFormList
                .stream()
                .map(HotelsFormMapper::map)
                .collect(Collectors.toList());
    }
}

