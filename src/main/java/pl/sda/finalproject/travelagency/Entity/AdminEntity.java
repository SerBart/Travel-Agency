package pl.sda.finalproject.travelagency.Entity;


import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@RequiredArgsConstructor
@Entity
@Table(name = "ADMIN")
public class AdminEntity {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Long id;

    private String uuid;



    private String firstName;

    private String secondName;

    private String userName;

    private String email;

    private double phoneNumber;


    public String getFirstName() {
        return firstName;
    }

    public AdminEntity setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getSecondName() {
        return secondName;
    }

    public AdminEntity setSecondName(String secondName) {
        this.secondName = secondName;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public AdminEntity setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public AdminEntity setEmail(String email) {
        this.email = email;
        return this;
    }

    public double getPhoneNumber() {
        return phoneNumber;
    }

    public AdminEntity setPhoneNumber(double phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
