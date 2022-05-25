package pl.sda.finalproject.travelagency.Dto;

public class CarDto {

    private String model;
    private String brand;
    private String yearOfProduction;
    private int howManyPeople;
    private int power;

    public String getModel() {
        return model;
    }

    public CarDto setModel(String model) {
        this.model = model;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public CarDto setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public String getYearOfProduction() {
        return yearOfProduction;
    }

    public CarDto setYearOfProduction(String yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
        return this;
    }

    public int getHowManyPeople() {
        return howManyPeople;
    }

    public CarDto setHowManyPeople(int howManyPeople) {
        this.howManyPeople = howManyPeople;
        return this;
    }

    public int getPower() {
        return power;
    }

    public CarDto setPower(int power) {
        this.power = power;
        return this;
    }
}
