package pl.sda.finalproject.travelagency.Entity;


import javax.persistence.*;
import java.util.Date;

@Entity
public class CarRentalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;


    private int rentalLength;
    private int cost;
    private Date dateOfRental;
    private Date dateOfBringingBack;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
