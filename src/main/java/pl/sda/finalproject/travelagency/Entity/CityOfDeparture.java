package pl.sda.finalproject.travelagency.Entity;

public enum CityOfDeparture {
    ALL ("Wszystkie"),
    WARSAW ("Warszawa"),
    POZNAN ("Poznan"),
    GDANSK ("Gdansk"),
    WROCLAW ("Wroclaw");

    private final String name;

    CityOfDeparture(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
