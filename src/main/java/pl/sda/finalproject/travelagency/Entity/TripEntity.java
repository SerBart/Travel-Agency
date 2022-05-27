package pl.sda.finalproject.travelagency.Entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;

@Entity
@Table(name = "TRIPS")
public class TripEntity {


    private Date beginingDate;
    private Date endDate;
    private int tripLength;
    private int tripCost;

//    @OneToMany
//    private HashSet<HotelsEntity> hotelsEntities;

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", nullable = false)
    private int id;

    public TripEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
