package pl.sda.finalproject.travelagency.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class TripEntity {

    private Date beginingDate;
    private Date endDate;
    private int tripLength;
    private int tripCost;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
