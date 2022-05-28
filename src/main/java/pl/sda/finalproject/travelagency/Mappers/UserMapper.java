package pl.sda.finalproject.travelagency.Mappers;

import pl.sda.finalproject.travelagency.Dto.UserDto;
import pl.sda.finalproject.travelagency.Entity.UserEntity;

import java.util.List;
import java.util.stream.Collectors;

public class UserMapper {
    public static UserDto map(UserEntity userEntity){
        return new UserDto()
                .setDateOfBirth(userEntity.getDateOfBirth())
                .setEmail(userEntity.getEmail())
                .setFirstName(userEntity.getFirstName())
                .setPhoneNumber(userEntity.getPhoneNumber())
                .setSecondName(userEntity.getSecondName())
                .setPriceReduction(userEntity.getPriceReduction())
                .setUUID(userEntity.getUuid);
    }

    public static List<UserDto> map(List<UserEntity> users){
        return users
                .stream()
                .map(UserMapper::map)
                .collect(Collectors.toList());
    }
}
