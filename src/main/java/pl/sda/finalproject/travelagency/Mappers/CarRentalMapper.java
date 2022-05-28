package pl.sda.finalproject.travelagency.Mappers;

import pl.sda.finalproject.travelagency.Dto.CarRentalDto;
import pl.sda.finalproject.travelagency.Entity.CarRentalEntity;

public class CarRentalMapper {
    private static CarRentalDto map(CarRentalEntity carRentalEntity){
        return new CarRentalDto()
                .setDateOfRental(carRentalEntity.getDateOfRental())
                .setCost(carRentalEntity.getCost())
                .setDateOfBringingBack(carRentalEntity.getDateOfBringingBack());
    }

}
