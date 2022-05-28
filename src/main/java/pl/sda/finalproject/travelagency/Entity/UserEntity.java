package pl.sda.finalproject.travelagency.Entity;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;


@Getter
@Setter
@Entity
@Table(name = "USERS")

public class UserEntity {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "uuid")
    public String getUuid;

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

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @Column(name = "price_reducion")
    private int priceReduction;


    protected UserEntity() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
