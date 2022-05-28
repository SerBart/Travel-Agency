package pl.sda.finalproject.travelagency.Dto;

import java.util.Date;
import java.util.Objects;

public class UserDto {
    private String UUID;
    private String firstName;
    private String secondName;
    private double priceReduction;
    private String userName;
    private String email;
    private double phoneNumber;
    private Date dateOfBirth;

    public UserDto() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDto userDto = (UserDto) o;
        return dateOfBirth == userDto.dateOfBirth && Double.compare(userDto.priceReduction, priceReduction) == 0 && Double.compare(userDto.phoneNumber, phoneNumber) == 0 && UUID.equals(userDto.UUID) && firstName.equals(userDto.firstName) && secondName.equals(userDto.secondName) && userName.equals(userDto.userName) && email.equals(userDto.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(UUID, firstName, secondName, dateOfBirth, priceReduction, userName, email, phoneNumber);
    }

    public UserDto(String UUID, String firstName, String secondName, Date dateOfBirth, double priceReduction, String userName,
                   String email, double phoneNumber) {
        this.UUID = UUID;
        this.firstName = firstName;
        this.secondName = secondName;
        this.dateOfBirth = dateOfBirth;
        this.priceReduction = priceReduction;
        this.userName = userName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getUUID() {
        return UUID;
    }

    public UserDto setUUID(String UUID) {
        this.UUID = UUID;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public UserDto setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getSecondName() {
        return secondName;
    }

    public UserDto setSecondName(String secondName) {
        this.secondName = secondName;
        return this;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public UserDto setDateOfBirth(Date age) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public double getPriceReduction() {
        return priceReduction;
    }

    public UserDto setPriceReduction(double priceReduction) {
        this.priceReduction = priceReduction;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public UserDto setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserDto setEmail(String email) {
        this.email = email;
        return this;
    }

    public double getPhoneNumber() {
        return phoneNumber;
    }

    public UserDto setPhoneNumber(double phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
