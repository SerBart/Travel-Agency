package pl.sda.finalproject.travelagency.Entity;

public enum City {
    WARSAW ("Warszawa"),
    BERLIN ("Berlin"),
    KIEV ("Kijow"),
    LONDON ("Londyn");

    private final String name;

    City(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
