package pl.sda.finalproject.travelagency.Entity;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "USERS")

public class UserEntity {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", nullable = false)
    private Long id;

    public String uuid;


    private String firstName;

    private String secondName;

    private String userName;

    private String email;

    private double phoneNumber;

    private Date dateOfBirth;

    private int priceReduction;


    public String getFirstName() {
        return firstName;
    }

    public UserEntity setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getSecondName() {
        return secondName;
    }

    public UserEntity setSecondName(String secondName) {
        this.secondName = secondName;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public UserEntity setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserEntity setEmail(String email) {
        this.email = email;
        return this;
    }

    public double getPhoneNumber() {
        return phoneNumber;
    }

    public UserEntity setPhoneNumber(double phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public UserEntity setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public int getPriceReduction() {
        return priceReduction;
    }

    public UserEntity setPriceReduction(int priceReduction) {
        this.priceReduction = priceReduction;
        return this;
    }

    public String getUuid() {
        return uuid;
    }

    public UserEntity setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public List<TripEntity> getBoughtTrips() {
        return boughtTrips;
    }

    public UserEntity setBoughtTrips(List<TripEntity> boughtTrips) {
        this.boughtTrips = boughtTrips;
        return this;
    }

    @ManyToMany
    @JoinColumn(name = "bought_trips_id")
    private List<TripEntity> boughtTrips;



    protected UserEntity() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
