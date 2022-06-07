package pl.sda.finalproject.travelagency.hotel.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.hibernate.annotations.GenericGenerator;
import pl.sda.finalproject.travelagency.Entity.CityOfArrival;
import pl.sda.finalproject.travelagency.Entity.Country;
import pl.sda.finalproject.travelagency.Entity.HotelRoomEntity;
import pl.sda.finalproject.travelagency.Entity.Standard;

import javax.persistence.*;

import java.util.Set;
@Getter
@Setter


@Entity
@Table(name = "HOTELS")
@Accessors(fluent = false, chain = true)
public class HotelsEntity {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", nullable = false)
    private Long id;

    private String uuid;

    private int capacity;

    private Country country;

    private CityOfArrival city;

    @OneToMany
    private Set<HotelRoomEntity> rooms;

    private Standard standard;
    public HotelsEntity() {
    }
}
