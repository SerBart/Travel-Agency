package pl.sda.finalproject.travelagency.Entity;


import javax.persistence.*;

@Entity
public class HotelRoomEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(length = 2)
    private int roomCapacity;

    @Column(length = 5)
    private double price;

    private boolean separateBeds;

    private int howManyRooms;

    private boolean isAvaible;

    @ManyToOne
    private HotelsEntity  hotelsEntity;

    public int getRoomCapacity() {
        return roomCapacity;
    }

    public HotelRoomEntity setRoomCapacity(int roomCapacity) {
        this.roomCapacity = roomCapacity;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public HotelRoomEntity setPrice(double price) {
        this.price = price;
        return this;
    }

    public boolean isSeparateBeds() {
        return separateBeds;
    }

    public HotelRoomEntity setSeparateBeds(boolean separateBeds) {
        this.separateBeds = separateBeds;
        return this;
    }

    public int getHowManyRooms() {
        return howManyRooms;
    }

    public HotelRoomEntity setHowManyRooms(int howManyRooms) {
        this.howManyRooms = howManyRooms;
        return this;
    }

    public boolean isAvaible() {
        return isAvaible;
    }

    public HotelRoomEntity setAvaible(boolean avaible) {
        isAvaible = avaible;
        return this;
    }

    public HotelsEntity getHotelsEntity() {
        return hotelsEntity;
    }

    public HotelRoomEntity setHotelsEntity(HotelsEntity hotelsEntity) {
        this.hotelsEntity = hotelsEntity;
        return this;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
