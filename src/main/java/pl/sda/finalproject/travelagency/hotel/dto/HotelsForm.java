package pl.sda.finalproject.travelagency.hotel.dto;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import pl.sda.finalproject.travelagency.Entity.HotelRoomEntity;
import pl.sda.finalproject.travelagency.Entity.Standard;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;

@RequiredArgsConstructor
@XmlRootElement(name = "templates/trip")
@Getter
@Setter
@ToString
@Accessors(fluent = false, chain = true)
public class HotelsForm {

    private String uuid;

    private int capacity;

    private String adress;

    private String country;

    private String city;

    private Set<HotelRoomEntity> rooms;

    private Standard standard;
}