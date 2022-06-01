package pl.sda.finalproject.travelagency.Entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
@Getter
@Setter

@RequiredArgsConstructor
@Entity
@Table(name = "CARS")
public class CarEntity {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", nullable = false)
    private Long id;

    private String uuid;


    @Column(name = "model")
    private String model;

    @Column(name = "brand")
    private String brand;

    @Column(name = "year_of_production")
    private String yearOfProduction;

    @Column(name = "howManyPeople")
    private int howManyPeople;

    @Column(name = "power")
    private int power;

    public int getPrice() {
        return price;
    }

    public CarEntity setPrice(int price) {
        this.price = price;
        return this;
    }

    public String getModel() {
        return model;
    }

    public CarEntity setModel(String model) {
        this.model = model;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public CarEntity setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public String getYearOfProduction() {
        return yearOfProduction;
    }

    public CarEntity setYearOfProduction(String yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
        return this;
    }

    public int getHowManyPeople() {
        return howManyPeople;
    }

    public CarEntity setHowManyPeople(int howManyPeople) {
        this.howManyPeople = howManyPeople;
        return this;
    }

    public int getPower() {
        return power;
    }

    public CarEntity setPower(int power) {
        this.power = power;
        return this;
    }

    public String getUuid() {
        return uuid;
    }



    public CarEntity setUuid(String uuid) {
        this.uuid = uuid;
        return this;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
