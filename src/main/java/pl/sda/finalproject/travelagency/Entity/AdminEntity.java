package pl.sda.finalproject.travelagency.Entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "ADMIN")
public class AdminEntity {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")

    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "second_name")
    private String secondName;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private double phoneNumber;

    AdminEntity() {
    }

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



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
