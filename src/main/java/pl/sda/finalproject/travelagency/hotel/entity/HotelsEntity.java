package pl.sda.finalproject.travelagency.hotel.entity;

import org.hibernate.annotations.GenericGenerator;
import pl.sda.finalproject.travelagency.Entity.HotelRoomEntity;
import pl.sda.finalproject.travelagency.Entity.Standard;

import javax.persistence.*;

import java.util.Set;


@Entity
@Table(name = "HOTELS")
public class HotelsEntity {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", nullable = false)
    private Long id;

    private String uuid;

    private int capacity;

    private String adress;

    private String country;

    private String city;

    @OneToMany
    private Set<HotelRoomEntity> rooms;

    private Standard standard;
    public HotelsEntity() {
    }

    public int getCapacity() {
        return capacity;
    }

    public String getUuid() {
        return uuid;
    }

    public HotelsEntity setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public Set<HotelRoomEntity> getRooms() {
        return rooms;
    }

    public HotelsEntity setRooms(Set<HotelRoomEntity> rooms) {
        this.rooms = rooms;
        return this;
    }

    public HotelsEntity setCapacity(int capacity) {
        this.capacity = capacity;
        return this;
    }

    public Standard getStandard() {
        return standard;
    }

    public HotelsEntity setStandard(Standard standard) {
        this.standard = standard;
        return this;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdress() {
        return adress;
    }

    public HotelsEntity setAdress(String adress) {
        this.adress = adress;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public HotelsEntity setCountry(String country) {
        this.country = country;
        return this;
    }

    public String getCity() {
        return city;
    }

    public HotelsEntity setCity(String city) {
        this.city = city;
        return this;
    }



    public Standard getHotelStandard() {
        return standard;
    }

    public HotelsEntity setHotelStandard(Standard standard) {
        this.standard = standard;
        return this;
    }
}
