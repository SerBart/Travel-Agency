package pl.sda.finalproject.travelagency.Entity;

public enum Continent {
    ALL("Wszystkie"),
    ASIA("Azja"),
    EUROPE("Europa"),
    NORTH_AMERICA("Ameryka północna"),
    SOUTH_AMERICA("Ameryka połódniowa"),
    AUSTRALIA("Australia"),
    AFRICA("Afryka");

    private final String name;

    Continent(String name ) {
        this.name = name;

    }

    public String getName(){
        return name;
    }
}
