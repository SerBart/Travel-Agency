package pl.sda.finalproject.travelagency.Dto;

import java.util.Date;

public class CarRentalDto {
    private String model;
    private String mark;
    private String yearOfProduction;
    private int rentalLength;
    private int howManyPeople;
    private int cost;
    private int power;
    private Date dateOfRental;
    private Date dateOfBringingBack;

    public String getModel() {
        return model;
    }

    public CarRentalDto setModel(String model) {
        this.model = model;
        return this;
    }

    public String getMark() {
        return mark;
    }

    public CarRentalDto setMark(String mark) {
        this.mark = mark;
        return this;
    }

    public String getYearOfProduction() {
        return yearOfProduction;
    }

    public CarRentalDto setYearOfProduction(String yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
        return this;
    }

    public int getRentalLength() {
        return rentalLength;
    }

    public CarRentalDto setRentalLength(int rentalLength) {
        this.rentalLength = rentalLength;
        return this;
    }

    public int getHowManyPeople() {
        return howManyPeople;
    }

    public CarRentalDto setHowManyPeople(int howManyPeople) {
        this.howManyPeople = howManyPeople;
        return this;
    }

    public int getCost() {
        return cost;
    }

    public CarRentalDto setCost(int cost) {
        this.cost = cost;
        return this;
    }

    public int getPower() {
        return power;
    }

    public CarRentalDto setPower(int power) {
        this.power = power;
        return this;
    }

    public Date getDateOfRental() {
        return dateOfRental;
    }

    public CarRentalDto setDateOfRental(Date dateOfRental) {
        this.dateOfRental = dateOfRental;
        return this;
    }

    public Date getDateOfBringingBack() {
        return dateOfBringingBack;
    }

    public CarRentalDto setDateOfBringingBack(Date dateOfBringingBack) {
        this.dateOfBringingBack = dateOfBringingBack;
        return this;
    }
}
