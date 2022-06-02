package pl.sda.finalproject.travelagency.Entity;

public enum CityOfArrival {
    BERLIN ("Berlin"),
    KIEV ("Kijow"),
    CHRZA ("chrząszczyżewoszyce"),
    MILAN ("Mediolan");

    private final String name;

    CityOfArrival(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
}