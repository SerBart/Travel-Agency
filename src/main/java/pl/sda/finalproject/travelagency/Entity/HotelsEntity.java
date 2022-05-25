package pl.sda.finalproject.travelagency.Entity;

import javax.persistence.*;
import java.util.HashSet;

@Entity
public class HotelsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;


    private String adress;

    private String country;

    private String city;

    @OneToMany()
    private HashSet<HotelRoomEntity> hotelRoomEntityHashSet;

    private Standard standard;

    public HashSet<HotelRoomEntity> getHotelRoomEntityHashSet() {
        return hotelRoomEntityHashSet;
    }

    public HotelsEntity setHotelRoomEntityHashSet(HashSet<HotelRoomEntity> hotelRoomEntityHashSet) {
        this.hotelRoomEntityHashSet = hotelRoomEntityHashSet;
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