package pl.sda.finalproject.travelagency.Entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "CARS")
public class CarEntity {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", nullable = false)
    private int id;

    public int getPrice() {
        return price;
    }

    public CarEntity setPrice(int price) {
        this.price = price;
        return this;
    }

    CarEntity() {
    }

    public Standard getStandard() {
        return standard;
    }

    public CarEntity setStandard(Standard standard) {
        this.standard = standard;
        return this;
    }

    public int getForHowManyPeople() {
        return forHowManyPeople;
    }

    public CarEntity setForHowManyPeople(int forHowManyPeople) {
        this.forHowManyPeople = forHowManyPeople;
        return this;
    }

    public String getColor() {
        return color;
    }

    public CarEntity setColor(String color) {
        this.color = color;
        return this;
    }

    public boolean isAvaible() {
        return isAvaible;
    }

    public CarEntity setAvaible(boolean avaible) {
        isAvaible = avaible;
        return this;
    }

    private int price;

    private Standard standard;

    private int forHowManyPeople;

    private String color;

    private boolean isAvaible;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
