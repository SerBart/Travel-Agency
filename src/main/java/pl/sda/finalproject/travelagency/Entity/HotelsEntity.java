package pl.sda.finalproject.travelagency.Entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "HOTELS")
public class HotelsEntity {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", nullable = false)
    private int id;


    private String adress;

    private String country;

    private String city;

    @OneToMany()
    private HashSet<HotelRoomEntity> hotelRoomEntityHashSet;

    private Standard standard;

    public Set<HotelRoomEntity> getHotelRoomEntityHashSet() {
        return hotelRoomEntityHashSet;
    }

    public HotelsEntity() {
    }

    public HotelsEntity setHotelRoomEntityHashSet(HashSet<HotelRoomEntity> hotelRoomEntityHashSet) {
        this.hotelRoomEntityHashSet = hotelRoomEntityHashSet;
        return this;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
