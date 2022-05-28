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
    private int id;


    private int cost;
    private Date dateOfRental;
    private Date dateOfBringingBack;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
