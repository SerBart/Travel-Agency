package pl.sda.finalproject.travelagency.Entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "CAR_RENTALS")
public class CarRentalEntity {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", nullable = false)
    private Long id;

    private String uuid;


    private int cost;
    private Date dateOfRental;
    private Date dateOfBringingBack;


    public String getUuid() {
        return uuid;
    }

    public CarRentalEntity setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public int getCost() {
        return cost;
    }

    public CarRentalEntity setCost(int cost) {
        this.cost = cost;
        return this;
    }

    public Date getDateOfRental() {
        return dateOfRental;
    }

    public CarRentalEntity setDateOfRental(Date dateOfRental) {
        this.dateOfRental = dateOfRental;
        return this;
    }

    public Date getDateOfBringingBack() {
        return dateOfBringingBack;
    }

    public CarRentalEntity setDateOfBringingBack(Date dateOfBringingBack) {
        this.dateOfBringingBack = dateOfBringingBack;
        return this;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
