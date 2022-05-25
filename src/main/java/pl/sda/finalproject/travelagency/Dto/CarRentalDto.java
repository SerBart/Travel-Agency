package pl.sda.finalproject.travelagency.Dto;

import java.util.Date;

public class CarRentalDto {

    private int rentalLength;
    private int cost;
    private Date dateOfRental;
    private Date dateOfBringingBack;


    public int getRentalLength() {
        return rentalLength;
    }

    public CarRentalDto setRentalLength(int rentalLength) {
        this.rentalLength = rentalLength;
        return this;
    }


    public int getCost() {
        return cost;
    }

    public CarRentalDto setCost(int cost) {
        this.cost = cost;
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
